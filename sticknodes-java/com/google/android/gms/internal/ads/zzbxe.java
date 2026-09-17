package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbxe extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbxf {
    public zzbxe() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbxf zzq(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbxf
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbxf r0 = (com.google.android.gms.internal.ads.zzbxf) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbxd r0 = new com.google.android.gms.internal.ads.zzbxd
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            java.lang.String r6 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"
            r0 = 0
            switch(r3) {
                case 1: goto L129;
                case 2: goto L105;
                case 3: goto Lf8;
                case 4: goto Led;
                case 5: goto Ldb;
                case 6: goto Lb6;
                case 7: goto La3;
                case 8: goto L90;
                case 9: goto L84;
                case 10: goto L6d;
                case 11: goto L61;
                case 12: goto L55;
                case 13: goto L42;
                case 14: goto L17;
                case 15: goto L8;
                default: goto L6;
            }
        L6:
            r3 = 0
            return r3
        L8:
            boolean r3 = com.google.android.gms.internal.ads.zzayn.zzg(r4)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzh(r3)
            r5.writeNoException()
            goto L152
        L17:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r3 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayn.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzm r3 = (com.google.android.gms.ads.internal.client.zzm) r3
            android.os.IBinder r1 = r4.readStrongBinder()
            if (r1 != 0) goto L26
            goto L37
        L26:
            android.os.IInterface r6 = r1.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbxm
            if (r0 == 0) goto L32
            r0 = r6
            com.google.android.gms.internal.ads.zzbxm r0 = (com.google.android.gms.internal.ads.zzbxm) r0
            goto L37
        L32:
            com.google.android.gms.internal.ads.zzbxk r0 = new com.google.android.gms.internal.ads.zzbxk
            r0.<init>(r1)
        L37:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzg(r3, r0)
            r5.writeNoException()
            goto L152
        L42:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdr r3 = com.google.android.gms.ads.internal.client.zzdq.zzb(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzj(r3)
            r5.writeNoException()
            goto L152
        L55:
            com.google.android.gms.ads.internal.client.zzdy r3 = r2.zzc()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
            goto L152
        L61:
            com.google.android.gms.internal.ads.zzbxc r3 = r2.zzd()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
            goto L152
        L6d:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            boolean r6 = com.google.android.gms.internal.ads.zzayn.zzg(r4)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzn(r3, r6)
            r5.writeNoException()
            goto L152
        L84:
            android.os.Bundle r3 = r2.zzb()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r5, r3)
            goto L152
        L90:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdo r3 = com.google.android.gms.ads.internal.client.zzdn.zzb(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzi(r3)
            r5.writeNoException()
            goto L152
        La3:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbxt> r3 = com.google.android.gms.internal.ads.zzbxt.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayn.zza(r4, r3)
            com.google.android.gms.internal.ads.zzbxt r3 = (com.google.android.gms.internal.ads.zzbxt) r3
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzl(r3)
            r5.writeNoException()
            goto L152
        Lb6:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto Lbd
            goto Ld0
        Lbd:
            java.lang.String r6 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbxn
            if (r0 == 0) goto Lcb
            r0 = r6
            com.google.android.gms.internal.ads.zzbxn r0 = (com.google.android.gms.internal.ads.zzbxn) r0
            goto Ld0
        Lcb:
            com.google.android.gms.internal.ads.zzbxn r0 = new com.google.android.gms.internal.ads.zzbxn
            r0.<init>(r3)
        Ld0:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzp(r0)
            r5.writeNoException()
            goto L152
        Ldb:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzm(r3)
            r5.writeNoException()
            goto L152
        Led:
            java.lang.String r3 = r2.zze()
            r5.writeNoException()
            r5.writeString(r3)
            goto L152
        Lf8:
            boolean r3 = r2.zzo()
            r5.writeNoException()
            int r4 = com.google.android.gms.internal.ads.zzayn.zza
            r5.writeInt(r3)
            goto L152
        L105:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L10c
            goto L11f
        L10c:
            java.lang.String r6 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbxi
            if (r0 == 0) goto L11a
            r0 = r6
            com.google.android.gms.internal.ads.zzbxi r0 = (com.google.android.gms.internal.ads.zzbxi) r0
            goto L11f
        L11a:
            com.google.android.gms.internal.ads.zzbxg r0 = new com.google.android.gms.internal.ads.zzbxg
            r0.<init>(r3)
        L11f:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzk(r0)
            r5.writeNoException()
            goto L152
        L129:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r3 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayn.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzm r3 = (com.google.android.gms.ads.internal.client.zzm) r3
            android.os.IBinder r1 = r4.readStrongBinder()
            if (r1 != 0) goto L138
            goto L149
        L138:
            android.os.IInterface r6 = r1.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbxm
            if (r0 == 0) goto L144
            r0 = r6
            com.google.android.gms.internal.ads.zzbxm r0 = (com.google.android.gms.internal.ads.zzbxm) r0
            goto L149
        L144:
            com.google.android.gms.internal.ads.zzbxk r0 = new com.google.android.gms.internal.ads.zzbxk
            r0.<init>(r1)
        L149:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzf(r3, r0)
            r5.writeNoException()
        L152:
            r3 = 1
            return r3
    }
}
