package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbtd extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbtf {
    zzbtd(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.offline.IOfflineUtils"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zze(android.content.Intent r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 1
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzf(java.lang.String[] r2, int[] r3, com.google.android.gms.dynamic.IObjectWrapper r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeStringArray(r2)
            r0.writeIntArray(r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r4)
            r2 = 5
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzg(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 4
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzh() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 3
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzi(com.google.android.gms.dynamic.IObjectWrapper r1, java.lang.String r2, java.lang.String r3) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.ads.internal.offline.buffering.zza r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r3)
            r2 = 6
            r1.zzdc(r2, r0)
            return
    }
}
