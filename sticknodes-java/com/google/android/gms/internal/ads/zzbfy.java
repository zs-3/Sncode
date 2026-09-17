package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbfy extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbfz {
    public zzbfy() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            switch(r2) {
                case 2: goto L84;
                case 3: goto L72;
                case 4: goto L67;
                case 5: goto L5c;
                case 6: goto L51;
                case 7: goto L46;
                case 8: goto L39;
                case 9: goto L13;
                case 10: goto L5;
                default: goto L3;
            }
        L3:
            r2 = 0
            return r2
        L5:
            boolean r2 = r1.zzk()
            r4.writeNoException()
            int r3 = com.google.android.gms.internal.ads.zzayn.zza
            r4.writeInt(r2)
            goto L8e
        L13:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L1b
            r2 = 0
            goto L2f
        L1b:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzbhk
            if (r0 == 0) goto L29
            r2 = r5
            com.google.android.gms.internal.ads.zzbhk r2 = (com.google.android.gms.internal.ads.zzbhk) r2
            goto L2f
        L29:
            com.google.android.gms.internal.ads.zzbhk r5 = new com.google.android.gms.internal.ads.zzbhk
            r5.<init>(r2)
            r2 = r5
        L2f:
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzm(r2)
            r4.writeNoException()
            goto L8e
        L39:
            boolean r2 = r1.zzl()
            r4.writeNoException()
            int r3 = com.google.android.gms.internal.ads.zzayn.zza
            r4.writeInt(r2)
            goto L8e
        L46:
            com.google.android.gms.ads.internal.client.zzeb r2 = r1.zzh()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L8e
        L51:
            float r2 = r1.zzf()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L8e
        L5c:
            float r2 = r1.zzg()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L8e
        L67:
            com.google.android.gms.dynamic.IObjectWrapper r2 = r1.zzi()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L8e
        L72:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzj(r2)
            r4.writeNoException()
            goto L8e
        L84:
            float r2 = r1.zze()
            r4.writeNoException()
            r4.writeFloat(r2)
        L8e:
            r2 = 1
            return r2
    }
}
