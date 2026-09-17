package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcn extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.ads.internal.client.zzcp {
    zzcn(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IClientApi"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzbu zzb(com.google.android.gms.dynamic.IObjectWrapper r1, java.lang.String r2, com.google.android.gms.internal.ads.zzbpl r3, int r4) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r4 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r1)
            r4.writeString(r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r3)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r4.writeInt(r1)
            r1 = 3
            android.os.Parcel r1 = r0.zzdb(r1, r4)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L20
            r2 = 0
            goto L34
        L20:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.zzbu
            if (r4 == 0) goto L2e
            r2 = r3
            com.google.android.gms.ads.internal.client.zzbu r2 = (com.google.android.gms.ads.internal.client.zzbu) r2
            goto L34
        L2e:
            com.google.android.gms.ads.internal.client.zzbs r3 = new com.google.android.gms.ads.internal.client.zzbs
            r3.<init>(r2)
            r2 = r3
        L34:
            r1.recycle()
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzby zzc(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.ads.internal.client.zzs r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbpl r4, int r5) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r5 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r1)
            com.google.android.gms.internal.ads.zzayn.zzd(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r4)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r5.writeInt(r1)
            r1 = 13
            android.os.Parcel r1 = r0.zzdb(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L24
            r2 = 0
            goto L38
        L24:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.zzby
            if (r4 == 0) goto L32
            r2 = r3
            com.google.android.gms.ads.internal.client.zzby r2 = (com.google.android.gms.ads.internal.client.zzby) r2
            goto L38
        L32:
            com.google.android.gms.ads.internal.client.zzbw r3 = new com.google.android.gms.ads.internal.client.zzbw
            r3.<init>(r2)
            r2 = r3
        L38:
            r1.recycle()
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzby zzd(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.ads.internal.client.zzs r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbpl r4, int r5) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r5 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r1)
            com.google.android.gms.internal.ads.zzayn.zzd(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r4)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r5.writeInt(r1)
            r1 = 1
            android.os.Parcel r1 = r0.zzdb(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L23
            r2 = 0
            goto L37
        L23:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.zzby
            if (r4 == 0) goto L31
            r2 = r3
            com.google.android.gms.ads.internal.client.zzby r2 = (com.google.android.gms.ads.internal.client.zzby) r2
            goto L37
        L31:
            com.google.android.gms.ads.internal.client.zzbw r3 = new com.google.android.gms.ads.internal.client.zzbw
            r3.<init>(r2)
            r2 = r3
        L37:
            r1.recycle()
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzby zze(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.ads.internal.client.zzs r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbpl r4, int r5) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r5 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r1)
            com.google.android.gms.internal.ads.zzayn.zzd(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r4)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r5.writeInt(r1)
            r1 = 2
            android.os.Parcel r1 = r0.zzdb(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L23
            r2 = 0
            goto L37
        L23:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.zzby
            if (r4 == 0) goto L31
            r2 = r3
            com.google.android.gms.ads.internal.client.zzby r2 = (com.google.android.gms.ads.internal.client.zzby) r2
            goto L37
        L31:
            com.google.android.gms.ads.internal.client.zzbw r3 = new com.google.android.gms.ads.internal.client.zzbw
            r3.<init>(r2)
            r2 = r3
        L37:
            r1.recycle()
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzby zzf(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.ads.internal.client.zzs r2, java.lang.String r3, int r4) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r4 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r1)
            com.google.android.gms.internal.ads.zzayn.zzd(r4, r2)
            r4.writeString(r3)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r4.writeInt(r1)
            r1 = 10
            android.os.Parcel r1 = r0.zzdb(r1, r4)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L21
            r2 = 0
            goto L35
        L21:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.zzby
            if (r4 == 0) goto L2f
            r2 = r3
            com.google.android.gms.ads.internal.client.zzby r2 = (com.google.android.gms.ads.internal.client.zzby) r2
            goto L35
        L2f:
            com.google.android.gms.ads.internal.client.zzbw r3 = new com.google.android.gms.ads.internal.client.zzbw
            r3.<init>(r2)
            r2 = r3
        L35:
            r1.recycle()
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzci zzg(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.ads.zzbpl r3, int r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r4 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r3)
            r2 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r4.writeInt(r2)
            r2 = 18
            android.os.Parcel r2 = r1.zzdb(r2, r4)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L1e
            r3 = 0
            goto L32
        L1e:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdPreloader"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.ads.internal.client.zzci
            if (r0 == 0) goto L2c
            r3 = r4
            com.google.android.gms.ads.internal.client.zzci r3 = (com.google.android.gms.ads.internal.client.zzci) r3
            goto L32
        L2c:
            com.google.android.gms.ads.internal.client.zzcg r4 = new com.google.android.gms.ads.internal.client.zzcg
            r4.<init>(r3)
            r3 = r4
        L32:
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzcz zzh(com.google.android.gms.dynamic.IObjectWrapper r3, int r4) throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r4 = r2.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r3)
            r3 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r4.writeInt(r3)
            r3 = 9
            android.os.Parcel r3 = r2.zzdb(r3, r4)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L1b
            r4 = 0
            goto L2f
        L1b:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.client.zzcz
            if (r1 == 0) goto L29
            r4 = r0
            com.google.android.gms.ads.internal.client.zzcz r4 = (com.google.android.gms.ads.internal.client.zzcz) r4
            goto L2f
        L29:
            com.google.android.gms.ads.internal.client.zzcx r0 = new com.google.android.gms.ads.internal.client.zzcx
            r0.<init>(r4)
            r4 = r0
        L2f:
            r3.recycle()
            return r4
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzdu zzi(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.ads.zzbpl r3, int r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r4 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r3)
            r2 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r4.writeInt(r2)
            r2 = 17
            android.os.Parcel r2 = r1.zzdb(r2, r4)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L1e
            r3 = 0
            goto L32
        L1e:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IOutOfContextTester"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.ads.internal.client.zzdu
            if (r0 == 0) goto L2c
            r3 = r4
            com.google.android.gms.ads.internal.client.zzdu r3 = (com.google.android.gms.ads.internal.client.zzdu) r3
            goto L32
        L2c:
            com.google.android.gms.ads.internal.client.zzds r4 = new com.google.android.gms.ads.internal.client.zzds
            r4.<init>(r3)
            r3 = r4
        L32:
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbgg zzj(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.dynamic.IObjectWrapper r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            r2 = 5
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzbgg r3 = com.google.android.gms.internal.ads.zzbgf.zzdA(r3)
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbgm zzk(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.dynamic.IObjectWrapper r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r4)
            r2 = 11
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzbgm r3 = com.google.android.gms.internal.ads.zzbgl.zze(r3)
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbky zzl(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.ads.zzbpl r2, int r3, com.google.android.gms.internal.ads.zzbkv r4) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r3 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r2)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r3.writeInt(r1)
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r4)
            r1 = 16
            android.os.Parcel r1 = r0.zzdb(r1, r3)
            android.os.IBinder r2 = r1.readStrongBinder()
            com.google.android.gms.internal.ads.zzbky r2 = com.google.android.gms.internal.ads.zzbkx.zzb(r2)
            r1.recycle()
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbtf zzm(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.ads.zzbpl r2, int r3) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r3 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r2)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r3.writeInt(r1)
            r1 = 15
            android.os.Parcel r1 = r0.zzdb(r1, r3)
            android.os.IBinder r2 = r1.readStrongBinder()
            com.google.android.gms.internal.ads.zzbtf r2 = com.google.android.gms.internal.ads.zzbte.zzb(r2)
            r1.recycle()
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbtm zzn(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 8
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            android.os.IBinder r0 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzbtm r0 = com.google.android.gms.internal.ads.zzbtl.zzI(r0)
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbwp zzo(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.ads.zzbpl r2, int r3) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbxf zzp(com.google.android.gms.dynamic.IObjectWrapper r1, java.lang.String r2, com.google.android.gms.internal.ads.zzbpl r3, int r4) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r4 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r1)
            r4.writeString(r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r3)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r4.writeInt(r1)
            r1 = 12
            android.os.Parcel r1 = r0.zzdb(r1, r4)
            android.os.IBinder r2 = r1.readStrongBinder()
            com.google.android.gms.internal.ads.zzbxf r2 = com.google.android.gms.internal.ads.zzbxe.zzq(r2)
            r1.recycle()
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbzl zzq(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.ads.zzbpl r2, int r3) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r3 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r2)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r3.writeInt(r1)
            r1 = 14
            android.os.Parcel r1 = r0.zzdb(r1, r3)
            android.os.IBinder r2 = r1.readStrongBinder()
            com.google.android.gms.internal.ads.zzbzl r2 = com.google.android.gms.internal.ads.zzbzk.zzb(r2)
            r1.recycle()
            return r2
    }
}
