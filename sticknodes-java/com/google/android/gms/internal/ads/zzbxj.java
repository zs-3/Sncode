package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbxj extends com.google.android.gms.internal.ads.zzayl {
    zzbxj(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator"
            r1.<init>(r2, r0)
            return
    }

    public final android.os.IBinder zze(com.google.android.gms.dynamic.IObjectWrapper r1, java.lang.String r2, com.google.android.gms.internal.ads.zzbpl r3, int r4) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r4 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r1)
            r4.writeString(r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r3)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r4.writeInt(r1)
            r1 = 1
            android.os.Parcel r1 = r0.zzdb(r1, r4)
            android.os.IBinder r2 = r1.readStrongBinder()
            r1.recycle()
            return r2
    }
}
