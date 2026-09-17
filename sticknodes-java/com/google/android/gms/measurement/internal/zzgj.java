package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgj extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.measurement.internal.zzgl {
    zzgj(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.internal.IMeasurementService"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzA(com.google.android.gms.measurement.internal.zzr r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 25
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzB(com.google.android.gms.measurement.internal.zzqb r2, com.google.android.gms.measurement.internal.zzr r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r3)
            r2 = 2
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzC(com.google.android.gms.measurement.internal.zzr r2, com.google.android.gms.measurement.internal.zzag r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r3)
            r2 = 30
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final byte[] zzD(com.google.android.gms.measurement.internal.zzbh r2, java.lang.String r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r0.writeString(r3)
            r2 = 9
            android.os.Parcel r2 = r1.zzb(r2, r0)
            byte[] r3 = r2.createByteArray()
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final com.google.android.gms.measurement.internal.zzap zze(com.google.android.gms.measurement.internal.zzr r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 21
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzap> r0 = com.google.android.gms.measurement.internal.zzap.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.zzbo.zza(r2, r0)
            com.google.android.gms.measurement.internal.zzap r0 = (com.google.android.gms.measurement.internal.zzap) r0
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.lang.String zzf(com.google.android.gms.measurement.internal.zzr r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 11
            android.os.Parcel r2 = r1.zzb(r2, r0)
            java.lang.String r0 = r2.readString()
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzg(com.google.android.gms.measurement.internal.zzr r1, android.os.Bundle r2) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzh(com.google.android.gms.measurement.internal.zzr r2, boolean r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r0.writeInt(r3)
            r2 = 7
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzqb> r3 = com.google.android.gms.measurement.internal.zzqb.CREATOR
            java.util.ArrayList r3 = r2.createTypedArrayList(r3)
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzi(java.lang.String r2, java.lang.String r3, com.google.android.gms.measurement.internal.zzr r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r4)
            r2 = 16
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzai> r3 = com.google.android.gms.measurement.internal.zzai.CREATOR
            java.util.ArrayList r3 = r2.createTypedArrayList(r3)
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzj(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r2 = r1.zza()
            r0 = 0
            r2.writeString(r0)
            r2.writeString(r3)
            r2.writeString(r4)
            r3 = 17
            android.os.Parcel r2 = r1.zzb(r3, r2)
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzai> r3 = com.google.android.gms.measurement.internal.zzai.CREATOR
            java.util.ArrayList r3 = r2.createTypedArrayList(r3)
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzk(java.lang.String r2, java.lang.String r3, boolean r4, com.google.android.gms.measurement.internal.zzr r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            int r2 = com.google.android.gms.internal.measurement.zzbo.zza
            r0.writeInt(r4)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r5)
            r2 = 14
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzqb> r3 = com.google.android.gms.measurement.internal.zzqb.CREATOR
            java.util.ArrayList r3 = r2.createTypedArrayList(r3)
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzl(java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r2 = r1.zza()
            r0 = 0
            r2.writeString(r0)
            r2.writeString(r3)
            r2.writeString(r4)
            int r3 = com.google.android.gms.internal.measurement.zzbo.zza
            r2.writeInt(r5)
            r3 = 15
            android.os.Parcel r2 = r1.zzb(r3, r2)
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzqb> r3 = com.google.android.gms.measurement.internal.zzqb.CREATOR
            java.util.ArrayList r3 = r2.createTypedArrayList(r3)
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzm(com.google.android.gms.measurement.internal.zzr r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 27
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzn(com.google.android.gms.measurement.internal.zzr r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 4
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzo(com.google.android.gms.measurement.internal.zzr r2, com.google.android.gms.measurement.internal.zzpc r3, com.google.android.gms.measurement.internal.zzgr r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r3)
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r4)
            r2 = 29
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzp(com.google.android.gms.measurement.internal.zzbh r2, com.google.android.gms.measurement.internal.zzr r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r3)
            r2 = 1
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzq(com.google.android.gms.measurement.internal.zzbh r1, java.lang.String r2, java.lang.String r3) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzr(com.google.android.gms.measurement.internal.zzr r2, android.os.Bundle r3, com.google.android.gms.measurement.internal.zzgo r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r3)
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r4)
            r2 = 31
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzs(com.google.android.gms.measurement.internal.zzr r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 18
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzt(com.google.android.gms.measurement.internal.zzai r2, com.google.android.gms.measurement.internal.zzr r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r3)
            r2 = 12
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzu(com.google.android.gms.measurement.internal.zzai r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzv(com.google.android.gms.measurement.internal.zzr r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 20
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzw(long r2, java.lang.String r4, java.lang.String r5, java.lang.String r6) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeLong(r2)
            r0.writeString(r4)
            r0.writeString(r5)
            r0.writeString(r6)
            r2 = 10
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzx(android.os.Bundle r2, com.google.android.gms.measurement.internal.zzr r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r3)
            r2 = 19
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzy(com.google.android.gms.measurement.internal.zzr r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 26
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzz(com.google.android.gms.measurement.internal.zzr r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 6
            r1.zzc(r2, r0)
            return
    }
}
