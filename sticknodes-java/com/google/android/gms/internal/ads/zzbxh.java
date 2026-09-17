package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbxh extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbxi {
    public zzbxh() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            switch(r2) {
                case 1: goto L4e;
                case 2: goto L4a;
                case 3: goto L27;
                case 4: goto L1c;
                case 5: goto Ld;
                case 6: goto L9;
                case 7: goto L5;
                default: goto L3;
            }
        L3:
            r2 = 0
            return r2
        L5:
            r1.zze()
            goto L51
        L9:
            r1.zzf()
            goto L51
        Ld:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zze> r2 = com.google.android.gms.ads.internal.client.zze.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            com.google.android.gms.ads.internal.client.zze r2 = (com.google.android.gms.ads.internal.client.zze) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzi(r2)
            goto L51
        L1c:
            int r2 = r3.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzh(r2)
            goto L51
        L27:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L2f
            r2 = 0
            goto L43
        L2f:
            java.lang.String r5 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzbxc
            if (r0 == 0) goto L3d
            r2 = r5
            com.google.android.gms.internal.ads.zzbxc r2 = (com.google.android.gms.internal.ads.zzbxc) r2
            goto L43
        L3d:
            com.google.android.gms.internal.ads.zzbxa r5 = new com.google.android.gms.internal.ads.zzbxa
            r5.<init>(r2)
            r2 = r5
        L43:
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzk(r2)
            goto L51
        L4a:
            r1.zzg()
            goto L51
        L4e:
            r1.zzj()
        L51:
            r4.writeNoException()
            r2 = 1
            return r2
    }
}
