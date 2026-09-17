package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbwq extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbws {
    zzbwq(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zze(com.google.android.gms.internal.ads.zzbwm r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 5
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzf() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 4
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzg(int r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeInt(r2)
            r2 = 7
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzh() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 6
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzi() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 1
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzj() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzk() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 8
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzl() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 3
            r2.zzdc(r1, r0)
            return
    }
}
