package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbri extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbrk {
    zzbri(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final com.google.android.gms.ads.internal.client.zzeb zze() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 5
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzeb r1 = com.google.android.gms.ads.internal.client.zzea.zzb(r1)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final com.google.android.gms.internal.ads.zzbrz zzf() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbrz> r1 = com.google.android.gms.internal.ads.zzbrz.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r0, r1)
            com.google.android.gms.internal.ads.zzbrz r1 = (com.google.android.gms.internal.ads.zzbrz) r1
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final com.google.android.gms.internal.ads.zzbrz zzg() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 3
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbrz> r1 = com.google.android.gms.internal.ads.zzbrz.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r0, r1)
            com.google.android.gms.internal.ads.zzbrz r1 = (com.google.android.gms.internal.ads.zzbrz) r1
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzh(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3, android.os.Bundle r4, android.os.Bundle r5, com.google.android.gms.ads.internal.client.zzs r6, com.google.android.gms.internal.ads.zzbrn r7) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r4)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r5)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r6)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r7)
            r2 = 1
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzi(java.lang.String r2, java.lang.String r3, com.google.android.gms.ads.internal.client.zzm r4, com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.internal.ads.zzbqv r6, com.google.android.gms.internal.ads.zzbpr r7) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r4)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r5)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r6)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r7)
            r2 = 23
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzj(java.lang.String r2, java.lang.String r3, com.google.android.gms.ads.internal.client.zzm r4, com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.internal.ads.zzbqy r6, com.google.android.gms.internal.ads.zzbpr r7, com.google.android.gms.ads.internal.client.zzs r8) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r4)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r5)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r6)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r7)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r8)
            r2 = 13
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzk(java.lang.String r2, java.lang.String r3, com.google.android.gms.ads.internal.client.zzm r4, com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.internal.ads.zzbqy r6, com.google.android.gms.internal.ads.zzbpr r7, com.google.android.gms.ads.internal.client.zzs r8) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r4)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r5)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r6)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r7)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r8)
            r2 = 21
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzl(java.lang.String r2, java.lang.String r3, com.google.android.gms.ads.internal.client.zzm r4, com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.internal.ads.zzbrb r6, com.google.android.gms.internal.ads.zzbpr r7) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r4)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r5)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r6)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r7)
            r2 = 14
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzm(java.lang.String r2, java.lang.String r3, com.google.android.gms.ads.internal.client.zzm r4, com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.internal.ads.zzbre r6, com.google.android.gms.internal.ads.zzbpr r7) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r4)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r5)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r6)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r7)
            r2 = 18
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzn(java.lang.String r2, java.lang.String r3, com.google.android.gms.ads.internal.client.zzm r4, com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.internal.ads.zzbre r6, com.google.android.gms.internal.ads.zzbpr r7, com.google.android.gms.internal.ads.zzbfr r8) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r4)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r5)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r6)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r7)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r8)
            r2 = 22
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzo(java.lang.String r2, java.lang.String r3, com.google.android.gms.ads.internal.client.zzm r4, com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.internal.ads.zzbrh r6, com.google.android.gms.internal.ads.zzbpr r7) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r4)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r5)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r6)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r7)
            r2 = 20
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzp(java.lang.String r2, java.lang.String r3, com.google.android.gms.ads.internal.client.zzm r4, com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.internal.ads.zzbrh r6, com.google.android.gms.internal.ads.zzbpr r7) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r4)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r5)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r6)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r7)
            r2 = 16
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzq(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 19
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean zzr(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 24
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r0 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean zzs(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 15
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r0 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean zzt(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 17
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r0 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r0
    }
}
