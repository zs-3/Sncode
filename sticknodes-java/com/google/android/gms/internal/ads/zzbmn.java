package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbmn extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbmp {
    zzbmn(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zze(int r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeInt(r2)
            r2 = 2
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzf(com.google.android.gms.ads.internal.client.zze r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 3
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzg(com.google.android.gms.internal.ads.zzbmj r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 1
            r1.zzdc(r2, r0)
            return
    }
}
