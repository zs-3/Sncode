package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcx extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.ads.internal.client.zzcz {
    zzcx(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 7
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            float r1 = r0.readFloat()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final java.lang.String zzf() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 9
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final java.util.List zzg() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 13
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzblu> r1 = com.google.android.gms.internal.ads.zzblu.CREATOR
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 10
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 15
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean r3) throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            int r1 = com.google.android.gms.internal.ads.zzayn.zza
            r0.writeInt(r3)
            r3 = 17
            r2.zzdc(r3, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 1
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(java.lang.String r2, com.google.android.gms.dynamic.IObjectWrapper r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r2 = r1.zza()
            r0 = 0
            r2.writeString(r0)
            com.google.android.gms.internal.ads.zzayn.zzf(r2, r3)
            r3 = 6
            r1.zzdc(r3, r2)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(com.google.android.gms.ads.internal.client.zzdl r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 16
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r0.writeString(r3)
            r2 = 5
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(com.google.android.gms.internal.ads.zzbpl r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 11
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean r3) throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            int r1 = com.google.android.gms.internal.ads.zzayn.zza
            r0.writeInt(r3)
            r3 = 4
            r2.zzdc(r3, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeFloat(r2)
            r2 = 2
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(java.lang.String r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(com.google.android.gms.internal.ads.zzbmb r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 12
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 18
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(com.google.android.gms.ads.internal.client.zzfw r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 14
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 8
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            boolean r1 = com.google.android.gms.internal.ads.zzayn.zzg(r0)
            r0.recycle()
            return r1
    }
}
