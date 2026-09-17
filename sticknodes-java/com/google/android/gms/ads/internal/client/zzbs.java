package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbs extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.ads.internal.client.zzbu {
    zzbs(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbr zze() throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 1
            android.os.Parcel r0 = r4.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L11
            r1 = 0
            goto L25
        L11:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzbr
            if (r3 == 0) goto L1f
            r1 = r2
            com.google.android.gms.ads.internal.client.zzbr r1 = (com.google.android.gms.ads.internal.client.zzbr) r1
            goto L25
        L1f:
            com.google.android.gms.ads.internal.client.zzbp r2 = new com.google.android.gms.ads.internal.client.zzbp
            r2.<init>(r1)
            r1 = r2
        L25:
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(com.google.android.gms.internal.ads.zzbha r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(com.google.android.gms.internal.ads.zzbhd r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(java.lang.String r2, com.google.android.gms.internal.ads.zzbhj r3, com.google.android.gms.internal.ads.zzbhg r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r4)
            r2 = 5
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.internal.ads.zzbmp r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(com.google.android.gms.internal.ads.zzbhn r2, com.google.android.gms.ads.internal.client.zzs r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r3)
            r2 = 8
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(com.google.android.gms.internal.ads.zzbhq r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 10
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(com.google.android.gms.ads.internal.client.zzbl r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 2
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(com.google.android.gms.ads.formats.AdManagerAdViewOptions r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 15
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(com.google.android.gms.internal.ads.zzbmg r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(com.google.android.gms.internal.ads.zzbfr r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 6
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(com.google.android.gms.ads.formats.PublisherAdViewOptions r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(com.google.android.gms.ads.internal.client.zzcq r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }
}
