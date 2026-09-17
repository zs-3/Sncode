package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbbi extends com.google.android.gms.internal.ads.zzayl {
    zzbbi(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.cache.ICacheService"
            r1.<init>(r2, r0)
            return
    }

    public final long zze(com.google.android.gms.internal.ads.zzbbg r3) throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r3)
            r3 = 3
            android.os.Parcel r3 = r2.zzdb(r3, r0)
            long r0 = r3.readLong()
            r3.recycle()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbbd zzf(com.google.android.gms.internal.ads.zzbbg r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 1
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbbd> r0 = com.google.android.gms.internal.ads.zzbbd.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r2, r0)
            com.google.android.gms.internal.ads.zzbbd r0 = (com.google.android.gms.internal.ads.zzbbd) r0
            r2.recycle()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbbd zzg(com.google.android.gms.internal.ads.zzbbg r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 2
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbbd> r0 = com.google.android.gms.internal.ads.zzbbd.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r2, r0)
            com.google.android.gms.internal.ads.zzbbd r0 = (com.google.android.gms.internal.ads.zzbbd) r0
            r2.recycle()
            return r0
    }
}
