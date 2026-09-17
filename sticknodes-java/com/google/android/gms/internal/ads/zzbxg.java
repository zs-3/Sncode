package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbxg extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbxi {
    zzbxg(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zze() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 7
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzf() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 6
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzg() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzh(int r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeInt(r2)
            r2 = 4
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzi(com.google.android.gms.ads.internal.client.zze r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 5
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzj() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 1
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzk(com.google.android.gms.internal.ads.zzbxc r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 3
            r1.zzdc(r2, r0)
            return
    }
}
