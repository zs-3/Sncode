package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbrf extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbrh {
    zzbrf(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zze(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r2 = r1.zza()
            java.lang.String r0 = "Adapter returned null."
            r2.writeString(r0)
            r0 = 3
            r1.zzdc(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzf(com.google.android.gms.ads.internal.client.zze r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 4
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzg() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            r2.zzdc(r1, r0)
            return
    }
}
