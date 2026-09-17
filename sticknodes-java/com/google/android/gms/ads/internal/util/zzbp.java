package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbp extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.ads.internal.util.zzbr {
    zzbp(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.util.IWorkManagerUtil"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 2
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3, java.lang.String r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r0.writeString(r3)
            r0.writeString(r4)
            r2 = 1
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r3 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.ads.internal.offline.buffering.zza r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r3)
            r2 = 3
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r3 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r3
    }
}
