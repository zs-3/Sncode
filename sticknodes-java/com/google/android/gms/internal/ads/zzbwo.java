package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbwo extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbwp {
    public zzbwo() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L14d
            r0 = 2
            if (r3 == r0) goto L146
            r0 = 3
            r1 = 0
            if (r3 == r0) goto L122
            r0 = 34
            if (r3 == r0) goto L114
            switch(r3) {
                case 5: goto L107;
                case 6: goto L100;
                case 7: goto Lf9;
                case 8: goto Lf2;
                case 9: goto Ldf;
                case 10: goto Lcc;
                case 11: goto Lb9;
                case 12: goto Lad;
                case 13: goto L9e;
                case 14: goto L8b;
                case 15: goto L7f;
                case 16: goto L5a;
                case 17: goto L4f;
                case 18: goto L3c;
                case 19: goto L2d;
                case 20: goto L1f;
                case 21: goto L13;
                default: goto L11;
            }
        L11:
            r3 = 0
            return r3
        L13:
            com.google.android.gms.ads.internal.client.zzdy r3 = r2.zzc()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
            goto L15e
        L1f:
            boolean r3 = r2.zzt()
            r5.writeNoException()
            int r4 = com.google.android.gms.internal.ads.zzayn.zza
            r5.writeInt(r3)
            goto L15e
        L2d:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzm(r3)
            r5.writeNoException()
            goto L15e
        L3c:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzr(r3)
            r5.writeNoException()
            goto L15e
        L4f:
            r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r5.writeNoException()
            goto L15e
        L5a:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L61
            goto L74
        L61:
            java.lang.String r0 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbwn
            if (r1 == 0) goto L6f
            r1 = r0
            com.google.android.gms.internal.ads.zzbwn r1 = (com.google.android.gms.internal.ads.zzbwn) r1
            goto L74
        L6f:
            com.google.android.gms.internal.ads.zzbwn r1 = new com.google.android.gms.internal.ads.zzbwn
            r1.<init>(r3)
        L74:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzu(r1)
            r5.writeNoException()
            goto L15e
        L7f:
            android.os.Bundle r3 = r2.zzb()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r5, r3)
            goto L15e
        L8b:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzcc r3 = com.google.android.gms.ads.internal.client.zzcb.zzb(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzl(r3)
            r5.writeNoException()
            goto L15e
        L9e:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzp(r3)
            r5.writeNoException()
            goto L15e
        Lad:
            java.lang.String r3 = r2.zzd()
            r5.writeNoException()
            r5.writeString(r3)
            goto L15e
        Lb9:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzf(r3)
            r5.writeNoException()
            goto L15e
        Lcc:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzk(r3)
            r5.writeNoException()
            goto L15e
        Ldf:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzi(r3)
            r5.writeNoException()
            goto L15e
        Lf2:
            r2.zze()
            r5.writeNoException()
            goto L15e
        Lf9:
            r2.zzj()
            r5.writeNoException()
            goto L15e
        L100:
            r2.zzh()
            r5.writeNoException()
            goto L15e
        L107:
            boolean r3 = r2.zzs()
            r5.writeNoException()
            int r4 = com.google.android.gms.internal.ads.zzayn.zza
            r5.writeInt(r3)
            goto L15e
        L114:
            boolean r3 = com.google.android.gms.internal.ads.zzayn.zzg(r4)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzn(r3)
            r5.writeNoException()
            goto L15e
        L122:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L129
            goto L13c
        L129:
            java.lang.String r0 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbws
            if (r1 == 0) goto L137
            r1 = r0
            com.google.android.gms.internal.ads.zzbws r1 = (com.google.android.gms.internal.ads.zzbws) r1
            goto L13c
        L137:
            com.google.android.gms.internal.ads.zzbwq r1 = new com.google.android.gms.internal.ads.zzbwq
            r1.<init>(r3)
        L13c:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzo(r1)
            r5.writeNoException()
            goto L15e
        L146:
            r2.zzq()
            r5.writeNoException()
            goto L15e
        L14d:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbwt> r3 = com.google.android.gms.internal.ads.zzbwt.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayn.zza(r4, r3)
            com.google.android.gms.internal.ads.zzbwt r3 = (com.google.android.gms.internal.ads.zzbwt) r3
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzg(r3)
            r5.writeNoException()
        L15e:
            return r6
    }
}
