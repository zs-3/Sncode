package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzea extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzeb {
    public zzea() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IVideoController"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.ads.internal.client.zzeb zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.client.zzeb
            if (r1 == 0) goto L11
            com.google.android.gms.ads.internal.client.zzeb r0 = (com.google.android.gms.ads.internal.client.zzeb) r0
            return r0
        L11:
            com.google.android.gms.ads.internal.client.zzdz r0 = new com.google.android.gms.ads.internal.client.zzdz
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            switch(r2) {
                case 1: goto Laa;
                case 2: goto La3;
                case 3: goto L95;
                case 4: goto L88;
                case 5: goto L7d;
                case 6: goto L72;
                case 7: goto L67;
                case 8: goto L41;
                case 9: goto L35;
                case 10: goto L27;
                case 11: goto L1b;
                case 12: goto Ld;
                case 13: goto L5;
                default: goto L3;
            }
        L3:
            r2 = 0
            return r2
        L5:
            r1.zzn()
            r4.writeNoException()
            goto Lb0
        Ld:
            boolean r2 = r1.zzo()
            r4.writeNoException()
            int r3 = com.google.android.gms.internal.ads.zzayn.zza
            r4.writeInt(r2)
            goto Lb0
        L1b:
            com.google.android.gms.ads.internal.client.zzee r2 = r1.zzi()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto Lb0
        L27:
            boolean r2 = r1.zzp()
            r4.writeNoException()
            int r3 = com.google.android.gms.internal.ads.zzayn.zza
            r4.writeInt(r2)
            goto Lb0
        L35:
            float r2 = r1.zze()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto Lb0
        L41:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L49
            r2 = 0
            goto L5d
        L49:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.ads.internal.client.zzee
            if (r0 == 0) goto L57
            r2 = r5
            com.google.android.gms.ads.internal.client.zzee r2 = (com.google.android.gms.ads.internal.client.zzee) r2
            goto L5d
        L57:
            com.google.android.gms.ads.internal.client.zzec r5 = new com.google.android.gms.ads.internal.client.zzec
            r5.<init>(r2)
            r2 = r5
        L5d:
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzm(r2)
            r4.writeNoException()
            goto Lb0
        L67:
            float r2 = r1.zzf()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto Lb0
        L72:
            float r2 = r1.zzg()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto Lb0
        L7d:
            int r2 = r1.zzh()
            r4.writeNoException()
            r4.writeInt(r2)
            goto Lb0
        L88:
            boolean r2 = r1.zzq()
            r4.writeNoException()
            int r3 = com.google.android.gms.internal.ads.zzayn.zza
            r4.writeInt(r2)
            goto Lb0
        L95:
            boolean r2 = com.google.android.gms.internal.ads.zzayn.zzg(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzj(r2)
            r4.writeNoException()
            goto Lb0
        La3:
            r1.zzk()
            r4.writeNoException()
            goto Lb0
        Laa:
            r1.zzl()
            r4.writeNoException()
        Lb0:
            r2 = 1
            return r2
    }
}
