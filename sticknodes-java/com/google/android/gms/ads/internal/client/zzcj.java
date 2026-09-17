package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcj extends com.google.android.gms.internal.ads.zzayl {
    zzcj(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdPreloaderCreator"
            r1.<init>(r2, r0)
            return
    }

    public final android.os.IBinder zze(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.ads.zzbpl r2, int r3) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r3 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r2)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r3.writeInt(r1)
            r1 = 1
            android.os.Parcel r1 = r0.zzdb(r1, r3)
            android.os.IBinder r2 = r1.readStrongBinder()
            r1.recycle()
            return r2
    }
}
