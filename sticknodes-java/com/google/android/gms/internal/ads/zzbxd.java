package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbxd extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbxf {
    zzbxd(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final android.os.Bundle zzb() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 9
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r0, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final com.google.android.gms.ads.internal.client.zzdy zzc() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 12
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdy r1 = com.google.android.gms.ads.internal.client.zzdx.zzb(r1)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final com.google.android.gms.internal.ads.zzbxc zzd() throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 11
            android.os.Parcel r0 = r4.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L12
            r1 = 0
            goto L26
        L12:
            java.lang.String r2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbxc
            if (r3 == 0) goto L20
            r1 = r2
            com.google.android.gms.internal.ads.zzbxc r1 = (com.google.android.gms.internal.ads.zzbxc) r1
            goto L26
        L20:
            com.google.android.gms.internal.ads.zzbxa r2 = new com.google.android.gms.internal.ads.zzbxa
            r2.<init>(r1)
            r1 = r2
        L26:
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final java.lang.String zze() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzf(com.google.android.gms.ads.internal.client.zzm r2, com.google.android.gms.internal.ads.zzbxm r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            r2 = 1
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzg(com.google.android.gms.ads.internal.client.zzm r2, com.google.android.gms.internal.ads.zzbxm r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            r2 = 14
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzh(boolean r3) throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            int r1 = com.google.android.gms.internal.ads.zzayn.zza
            r0.writeInt(r3)
            r3 = 15
            r2.zzdc(r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzi(com.google.android.gms.ads.internal.client.zzdo r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 8
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzj(com.google.android.gms.ads.internal.client.zzdr r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 13
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzk(com.google.android.gms.internal.ads.zzbxi r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 2
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzl(com.google.android.gms.internal.ads.zzbxt r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 7
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzm(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 5
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper r1, boolean r2) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final boolean zzo() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzp(com.google.android.gms.internal.ads.zzbxn r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }
}
