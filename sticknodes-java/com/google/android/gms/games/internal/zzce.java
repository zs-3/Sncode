package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzce extends com.google.android.gms.internal.games.zza {
    zzce(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r1.<init>(r2, r0)
            return
    }

    public final void zzA(com.google.android.gms.games.internal.zzcb r1, java.lang.String r2, java.lang.String r3, int r4, int r5) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r2 = r0.zza()
            com.google.android.gms.internal.games.zzc.zzf(r2, r1)
            r1 = 0
            r2.writeString(r1)
            r2.writeString(r3)
            r2.writeInt(r4)
            r2.writeInt(r5)
            r1 = 8001(0x1f41, float:1.1212E-41)
            r0.zzc(r1, r2)
            return
    }

    public final void zzB(com.google.android.gms.games.internal.zzcb r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r2 = 21007(0x520f, float:2.9437E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzC(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3, int r4, android.os.IBinder r5, android.os.Bundle r6) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r0.writeStrongBinder(r5)
            com.google.android.gms.internal.games.zzc.zzd(r0, r6)
            r2 = 5025(0x13a1, float:7.042E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzD(java.lang.String r2, int r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeInt(r3)
            r2 = 12017(0x2ef1, float:1.684E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzE(com.google.android.gms.games.internal.zzcb r2, int r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeInt(r3)
            r2 = 22016(0x5600, float:3.0851E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzF(com.google.android.gms.games.internal.zzcb r2, boolean r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            com.google.android.gms.internal.games.zzc.zzc(r0, r3)
            r2 = 6001(0x1771, float:8.409E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzG(com.google.android.gms.games.internal.zzcb r2, boolean r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            com.google.android.gms.internal.games.zzc.zzc(r0, r3)
            r2 = 8027(0x1f5b, float:1.1248E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzH(com.google.android.gms.games.internal.zzcb r2, boolean r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            com.google.android.gms.internal.games.zzc.zzc(r0, r3)
            r2 = 12016(0x2ef0, float:1.6838E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzI(com.google.android.gms.games.internal.zzcb r2, boolean r3, java.lang.String[] r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            com.google.android.gms.internal.games.zzc.zzc(r0, r3)
            r0.writeStringArray(r4)
            r2 = 12031(0x2eff, float:1.6859E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzJ(com.google.android.gms.games.internal.zzcb r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r2 = 5026(0x13a2, float:7.043E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzK(com.google.android.gms.games.internal.zzcb r2, int r3, boolean r4, boolean r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeInt(r3)
            com.google.android.gms.internal.games.zzc.zzc(r0, r4)
            com.google.android.gms.internal.games.zzc.zzc(r0, r5)
            r2 = 5015(0x1397, float:7.028E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzL(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3, boolean r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            com.google.android.gms.internal.games.zzc.zzc(r0, r4)
            r2 = 6504(0x1968, float:9.114E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzM(com.google.android.gms.games.internal.zzcb r2, boolean r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            com.google.android.gms.internal.games.zzc.zzc(r0, r3)
            r2 = 6503(0x1967, float:9.113E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzN(com.google.android.gms.games.internal.zzcb r2, android.os.Bundle r3, int r4, int r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            com.google.android.gms.internal.games.zzc.zzd(r0, r3)
            r0.writeInt(r4)
            r0.writeInt(r5)
            r2 = 5021(0x139d, float:7.036E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzO(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3, int r4, int r5, int r6, boolean r7) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r0.writeInt(r5)
            r0.writeInt(r6)
            com.google.android.gms.internal.games.zzc.zzc(r0, r7)
            r2 = 5020(0x139c, float:7.035E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzP(com.google.android.gms.games.internal.zzcb r2, boolean r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            com.google.android.gms.internal.games.zzc.zzc(r0, r3)
            r2 = 17001(0x4269, float:2.3823E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzQ(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3, boolean r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            com.google.android.gms.internal.games.zzc.zzc(r0, r4)
            r2 = 13006(0x32ce, float:1.8225E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzR(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3, int r4, boolean r5, boolean r6) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            com.google.android.gms.internal.games.zzc.zzc(r0, r5)
            com.google.android.gms.internal.games.zzc.zzc(r0, r6)
            r2 = 9020(0x233c, float:1.264E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzS(com.google.android.gms.games.internal.zzcb r2, boolean r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            com.google.android.gms.internal.games.zzc.zzc(r0, r3)
            r2 = 12002(0x2ee2, float:1.6818E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzT(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3, int r4, int r5, int r6, boolean r7) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r0.writeInt(r5)
            r0.writeInt(r6)
            com.google.android.gms.internal.games.zzc.zzc(r0, r7)
            r2 = 5019(0x139b, float:7.033E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzU(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3, boolean r4, int r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            com.google.android.gms.internal.games.zzc.zzc(r0, r4)
            r0.writeInt(r5)
            r2 = 15001(0x3a99, float:2.1021E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzV(com.google.android.gms.games.internal.zzcb r2, long r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeLong(r3)
            r2 = 22026(0x560a, float:3.0865E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzW(com.google.android.gms.games.internal.zzcd r2, long r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeLong(r3)
            r2 = 15501(0x3c8d, float:2.1722E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzX(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3, java.lang.String r4, com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity r5, com.google.android.gms.drive.Contents r6) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            r0.writeString(r4)
            com.google.android.gms.internal.games.zzc.zzd(r0, r5)
            com.google.android.gms.internal.games.zzc.zzd(r0, r6)
            r2 = 12033(0x2f01, float:1.6862E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzY(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3, android.os.IBinder r4, android.os.Bundle r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            r0.writeStrongBinder(r4)
            com.google.android.gms.internal.games.zzc.zzd(r0, r5)
            r2 = 5023(0x139f, float:7.039E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzZ(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3, int r4, android.os.IBinder r5, android.os.Bundle r6) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r0.writeStrongBinder(r5)
            com.google.android.gms.internal.games.zzc.zzd(r0, r6)
            r2 = 7003(0x1b5b, float:9.813E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzaa(android.os.IBinder r2, android.os.Bundle r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeStrongBinder(r2)
            com.google.android.gms.internal.games.zzc.zzd(r0, r3)
            r2 = 5005(0x138d, float:7.013E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzab(com.google.android.gms.games.internal.zzcb r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r2 = 5002(0x138a, float:7.009E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzac(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3, long r4, java.lang.String r6) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            r0.writeLong(r4)
            r0.writeString(r6)
            r2 = 7002(0x1b5a, float:9.812E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzad(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3, android.os.IBinder r4, android.os.Bundle r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            r0.writeStrongBinder(r4)
            com.google.android.gms.internal.games.zzc.zzd(r0, r5)
            r2 = 5024(0x13a0, float:7.04E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzae(long r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeLong(r2)
            r2 = 22027(0x560b, float:3.0866E-41)
            r1.zzc(r2, r0)
            return
    }

    public final boolean zzaf() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 22030(0x560e, float:3.087E-41)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            boolean r1 = com.google.android.gms.internal.games.zzc.zzg(r0)
            r0.recycle()
            return r1
    }

    public final int zzd() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 12036(0x2f04, float:1.6866E-41)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }

    public final int zze() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 12035(0x2f03, float:1.6865E-41)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }

    public final android.app.PendingIntent zzf() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 25015(0x61b7, float:3.5053E-41)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.games.zzc.zza(r0, r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r0.recycle()
            return r1
    }

    public final android.content.Intent zzg() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 9005(0x232d, float:1.2619E-41)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.games.zzc.zza(r0, r1)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.recycle()
            return r1
    }

    public final android.content.Intent zzh() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 9003(0x232b, float:1.2616E-41)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.games.zzc.zza(r0, r1)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.recycle()
            return r1
    }

    public final android.content.Intent zzi(com.google.android.gms.games.PlayerEntity r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzd(r0, r2)
            r2 = 15503(0x3c8f, float:2.1724E-41)
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.games.zzc.zza(r2, r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r2.recycle()
            return r0
    }

    public final android.content.Intent zzj(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            r0.writeString(r4)
            r2 = 25016(0x61b8, float:3.5055E-41)
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator r3 = android.content.Intent.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.games.zzc.zza(r2, r3)
            android.content.Intent r3 = (android.content.Intent) r3
            r2.recycle()
            return r3
    }

    public final android.content.Intent zzk(java.lang.String r2, int r3, int r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeInt(r3)
            r0.writeInt(r4)
            r2 = 18001(0x4651, float:2.5225E-41)
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator r3 = android.content.Intent.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.games.zzc.zza(r2, r3)
            android.content.Intent r3 = (android.content.Intent) r3
            r2.recycle()
            return r3
    }

    public final android.content.Intent zzl() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 9010(0x2332, float:1.2626E-41)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.games.zzc.zza(r0, r1)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.recycle()
            return r1
    }

    public final android.content.Intent zzm(java.lang.String r2, boolean r3, boolean r4, int r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            com.google.android.gms.internal.games.zzc.zzc(r0, r3)
            com.google.android.gms.internal.games.zzc.zzc(r0, r4)
            r0.writeInt(r5)
            r2 = 12001(0x2ee1, float:1.6817E-41)
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator r3 = android.content.Intent.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.games.zzc.zza(r2, r3)
            android.content.Intent r3 = (android.content.Intent) r3
            r2.recycle()
            return r3
    }

    public final android.content.Intent zzn() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 9012(0x2334, float:1.2629E-41)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.games.zzc.zza(r0, r1)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.recycle()
            return r1
    }

    public final android.content.Intent zzo() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 19002(0x4a3a, float:2.6627E-41)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.games.zzc.zza(r0, r1)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.recycle()
            return r1
    }

    public final com.google.android.gms.common.data.DataHolder zzp() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 5502(0x157e, float:7.71E-42)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r1 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.games.zzc.zza(r0, r1)
            com.google.android.gms.common.data.DataHolder r1 = (com.google.android.gms.common.data.DataHolder) r1
            r0.recycle()
            return r1
    }

    public final com.google.android.gms.common.data.DataHolder zzq() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 5013(0x1395, float:7.025E-42)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r1 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.games.zzc.zza(r0, r1)
            com.google.android.gms.common.data.DataHolder r1 = (com.google.android.gms.common.data.DataHolder) r1
            r0.recycle()
            return r1
    }

    public final java.lang.String zzr() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 5003(0x138b, float:7.01E-42)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    public final java.lang.String zzs() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 5007(0x138f, float:7.016E-42)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    public final java.lang.String zzt() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 5012(0x1394, float:7.023E-42)
            android.os.Parcel r0 = r2.zzb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    public final void zzu() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 5006(0x138e, float:7.015E-42)
            r2.zzc(r1, r0)
            return
    }

    public final void zzv(long r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeLong(r2)
            r2 = 5001(0x1389, float:7.008E-42)
            r1.zzc(r2, r0)
            return
    }

    public final void zzw(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3, com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity r4, com.google.android.gms.drive.Contents r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            com.google.android.gms.internal.games.zzc.zzd(r0, r4)
            com.google.android.gms.internal.games.zzc.zzd(r0, r5)
            r2 = 12007(0x2ee7, float:1.6825E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzx(com.google.android.gms.games.internal.zzcb r2, java.lang.String r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r0.writeString(r3)
            r2 = 12020(0x2ef4, float:1.6844E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzy(com.google.android.gms.drive.Contents r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzd(r0, r2)
            r2 = 12019(0x2ef3, float:1.6842E-41)
            r1.zzc(r2, r0)
            return
    }

    public final void zzz(com.google.android.gms.games.internal.zzcb r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.games.zzc.zzf(r0, r2)
            r2 = 22028(0x560c, float:3.0868E-41)
            r1.zzc(r2, r0)
            return
    }
}
