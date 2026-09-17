package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbz extends com.google.android.gms.internal.ads.zzayl {
    zzbz(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManagerCreator"
            r1.<init>(r2, r0)
            return
    }

    public final android.os.IBinder zze(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.ads.internal.client.zzs r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbpl r4, int r5, int r6) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r5 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r1)
            com.google.android.gms.internal.ads.zzayn.zzd(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r4)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r5.writeInt(r1)
            r5.writeInt(r6)
            r1 = 2
            android.os.Parcel r1 = r0.zzdb(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            r1.recycle()
            return r2
    }
}
