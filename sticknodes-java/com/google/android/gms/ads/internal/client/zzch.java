package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzch extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzci {
    public zzch() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdPreloader"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            switch(r3) {
                case 1: goto L86;
                case 2: goto L74;
                case 3: goto L62;
                case 4: goto L50;
                case 5: goto L3e;
                case 6: goto L2b;
                case 7: goto L18;
                case 8: goto L5;
                default: goto L3;
            }
        L3:
            r3 = 0
            return r3
        L5:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r3 = com.google.android.gms.internal.ads.zzbpk.zzf(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzh(r3)
            r5.writeNoException()
            goto Lb1
        L18:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            com.google.android.gms.ads.internal.client.zzby r3 = r2.zzf(r3)
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
            goto Lb1
        L2b:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            boolean r3 = r2.zzk(r3)
            r5.writeNoException()
            r5.writeInt(r3)
            goto Lb1
        L3e:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            com.google.android.gms.internal.ads.zzbao r3 = r2.zze(r3)
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
            goto Lb1
        L50:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            boolean r3 = r2.zzj(r3)
            r5.writeNoException()
            r5.writeInt(r3)
            goto Lb1
        L62:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            com.google.android.gms.internal.ads.zzbxf r3 = r2.zzg(r3)
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
            goto Lb1
        L74:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            boolean r3 = r2.zzl(r3)
            r5.writeNoException()
            r5.writeInt(r3)
            goto Lb1
        L86:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzfu> r3 = com.google.android.gms.ads.internal.client.zzfu.CREATOR
            java.util.ArrayList r3 = r4.createTypedArrayList(r3)
            android.os.IBinder r6 = r4.readStrongBinder()
            if (r6 != 0) goto L94
            r6 = 0
            goto La8
        L94:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdPreloadCallback"
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.client.zzcf
            if (r1 == 0) goto La2
            r6 = r0
            com.google.android.gms.ads.internal.client.zzcf r6 = (com.google.android.gms.ads.internal.client.zzcf) r6
            goto La8
        La2:
            com.google.android.gms.ads.internal.client.zzcd r0 = new com.google.android.gms.ads.internal.client.zzcd
            r0.<init>(r6)
            r6 = r0
        La8:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzi(r3, r6)
            r5.writeNoException()
        Lb1:
            r3 = 1
            return r3
    }
}
