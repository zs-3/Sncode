package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbhx extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbhz {
    zzbhx(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzA() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 28
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzB(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 33
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzC(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 17
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzD() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 27
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzE(com.google.android.gms.ads.internal.client.zzdd r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 26
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzF(com.google.android.gms.ads.internal.client.zzdr r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 32
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzG(com.google.android.gms.internal.ads.zzbhw r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 21
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final boolean zzH() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 30
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            boolean r1 = com.google.android.gms.internal.ads.zzayn.zzg(r0)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final boolean zzI() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 24
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            boolean r1 = com.google.android.gms.internal.ads.zzayn.zzg(r0)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final boolean zzJ(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 16
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r0 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final double zze() throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r0 = r3.zza()
            r1 = 8
            android.os.Parcel r0 = r3.zzdb(r1, r0)
            double r1 = r0.readDouble()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final android.os.Bundle zzf() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 20
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r0, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.ads.internal.client.zzdy zzg() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 31
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdy r1 = com.google.android.gms.ads.internal.client.zzdx.zzb(r1)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 11
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzeb r1 = com.google.android.gms.ads.internal.client.zzea.zzb(r1)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.internal.ads.zzbfv zzi() throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 14
            android.os.Parcel r0 = r4.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L12
            r1 = 0
            goto L26
        L12:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbfv
            if (r3 == 0) goto L20
            r1 = r2
            com.google.android.gms.internal.ads.zzbfv r1 = (com.google.android.gms.internal.ads.zzbfv) r1
            goto L26
        L20:
            com.google.android.gms.internal.ads.zzbft r2 = new com.google.android.gms.internal.ads.zzbft
            r2.<init>(r1)
            r1 = r2
        L26:
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.internal.ads.zzbfz zzj() throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 29
            android.os.Parcel r0 = r4.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L12
            r1 = 0
            goto L26
        L12:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbfz
            if (r3 == 0) goto L20
            r1 = r2
            com.google.android.gms.internal.ads.zzbfz r1 = (com.google.android.gms.internal.ads.zzbfz) r1
            goto L26
        L20:
            com.google.android.gms.internal.ads.zzbfx r2 = new com.google.android.gms.internal.ads.zzbfx
            r2.<init>(r1)
            r1 = r2
        L26:
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.internal.ads.zzbgc zzk() throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 5
            android.os.Parcel r0 = r4.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L11
            r1 = 0
            goto L25
        L11:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbgc
            if (r3 == 0) goto L1f
            r1 = r2
            com.google.android.gms.internal.ads.zzbgc r1 = (com.google.android.gms.internal.ads.zzbgc) r1
            goto L25
        L1f:
            com.google.android.gms.internal.ads.zzbga r2 = new com.google.android.gms.internal.ads.zzbga
            r2.<init>(r1)
            r1 = r2
        L25:
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.dynamic.IObjectWrapper zzl() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 19
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.dynamic.IObjectWrapper zzm() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 18
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzn() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 7
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzo() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 4
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzp() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 6
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzq() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzr() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzs() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 10
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzt() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 9
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.util.List zzu() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 3
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.util.ArrayList r1 = com.google.android.gms.internal.ads.zzayn.zzb(r0)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.util.List zzv() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 23
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.util.ArrayList r1 = com.google.android.gms.internal.ads.zzayn.zzb(r0)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzw() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 22
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzx() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 13
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzy(com.google.android.gms.ads.internal.client.zzdh r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 25
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzz(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 15
            r1.zzdc(r2, r0)
            return
    }
}
