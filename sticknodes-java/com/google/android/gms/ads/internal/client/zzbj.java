package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbj extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.ads.internal.client.zzbl {
    zzbj(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdListener"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 6
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 1
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeInt(r2)
            r2 = 2
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(com.google.android.gms.ads.internal.client.zze r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 8
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 7
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 3
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 4
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 5
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 9
            r2.zzdc(r1, r0)
            return
    }
}
