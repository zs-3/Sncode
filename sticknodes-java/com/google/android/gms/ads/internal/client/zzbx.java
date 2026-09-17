package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbx extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzby {
    public zzbx() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.ads.internal.client.zzby zzad(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.client.zzby
            if (r1 == 0) goto L11
            com.google.android.gms.ads.internal.client.zzby r0 = (com.google.android.gms.ads.internal.client.zzby) r0
            return r0
        L11:
            com.google.android.gms.ads.internal.client.zzbw r0 = new com.google.android.gms.ads.internal.client.zzbw
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            r6 = 0
            switch(r3) {
                case 1: goto L2ff;
                case 2: goto L2f8;
                case 3: goto L2eb;
                case 4: goto L2d5;
                case 5: goto L2ce;
                case 6: goto L2c7;
                case 7: goto L2a4;
                case 8: goto L281;
                case 9: goto L279;
                case 10: goto L274;
                case 11: goto L26c;
                case 12: goto L260;
                case 13: goto L24d;
                case 14: goto L23a;
                case 15: goto L223;
                case 16: goto L4;
                case 17: goto L4;
                case 18: goto L217;
                case 19: goto L204;
                case 20: goto L1e0;
                case 21: goto L1bc;
                case 22: goto L1ad;
                case 23: goto L19f;
                case 24: goto L18c;
                case 25: goto L17d;
                case 26: goto L171;
                case 27: goto L4;
                case 28: goto L4;
                case 29: goto L15e;
                case 30: goto L14b;
                case 31: goto L13f;
                case 32: goto L133;
                case 33: goto L127;
                case 34: goto L118;
                case 35: goto L10c;
                case 36: goto Le8;
                case 37: goto Ldc;
                case 38: goto Lcd;
                case 39: goto Lba;
                case 40: goto La7;
                case 41: goto L9b;
                case 42: goto L77;
                case 43: goto L4b;
                case 44: goto L38;
                case 45: goto L14;
                case 46: goto L6;
                default: goto L4;
            }
        L4:
            r3 = 0
            return r3
        L6:
            boolean r3 = r2.zzY()
            r5.writeNoException()
            int r4 = com.google.android.gms.internal.ads.zzayn.zza
            r5.writeInt(r3)
            goto L309
        L14:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L1b
            goto L2d
        L1b:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IFullScreenContentCallback"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzct
            if (r0 == 0) goto L28
            com.google.android.gms.ads.internal.client.zzct r6 = (com.google.android.gms.ads.internal.client.zzct) r6
            goto L2d
        L28:
            com.google.android.gms.ads.internal.client.zzcr r6 = new com.google.android.gms.ads.internal.client.zzcr
            r6.<init>(r3)
        L2d:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzJ(r6)
            r5.writeNoException()
            goto L309
        L38:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzW(r3)
            r5.writeNoException()
            goto L309
        L4b:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r3 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayn.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzm r3 = (com.google.android.gms.ads.internal.client.zzm) r3
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L5a
            goto L6c
        L5a:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IAdLoadCallback"
            android.os.IInterface r6 = r0.queryLocalInterface(r6)
            boolean r1 = r6 instanceof com.google.android.gms.ads.internal.client.zzbo
            if (r1 == 0) goto L67
            com.google.android.gms.ads.internal.client.zzbo r6 = (com.google.android.gms.ads.internal.client.zzbo) r6
            goto L6c
        L67:
            com.google.android.gms.ads.internal.client.zzbm r6 = new com.google.android.gms.ads.internal.client.zzbm
            r6.<init>(r0)
        L6c:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzy(r3, r6)
            r5.writeNoException()
            goto L309
        L77:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L7e
            goto L90
        L7e:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IOnPaidEventListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzdr
            if (r0 == 0) goto L8b
            com.google.android.gms.ads.internal.client.zzdr r6 = (com.google.android.gms.ads.internal.client.zzdr) r6
            goto L90
        L8b:
            com.google.android.gms.ads.internal.client.zzdp r6 = new com.google.android.gms.ads.internal.client.zzdp
            r6.<init>(r3)
        L90:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzP(r6)
            r5.writeNoException()
            goto L309
        L9b:
            com.google.android.gms.ads.internal.client.zzdy r3 = r2.zzk()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
            goto L309
        La7:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzbar r3 = com.google.android.gms.internal.ads.zzbaq.zze(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzH(r3)
            r5.writeNoException()
            goto L309
        Lba:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzy> r3 = com.google.android.gms.ads.internal.client.zzy.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayn.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzy r3 = (com.google.android.gms.ads.internal.client.zzy) r3
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzI(r3)
            r5.writeNoException()
            goto L309
        Lcd:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzR(r3)
            r5.writeNoException()
            goto L309
        Ldc:
            android.os.Bundle r3 = r2.zzd()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r5, r3)
            goto L309
        Le8:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto Lef
            goto L101
        Lef:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzcc
            if (r0 == 0) goto Lfc
            com.google.android.gms.ads.internal.client.zzcc r6 = (com.google.android.gms.ads.internal.client.zzcc) r6
            goto L101
        Lfc:
            com.google.android.gms.ads.internal.client.zzca r6 = new com.google.android.gms.ads.internal.client.zzca
            r6.<init>(r3)
        L101:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzE(r6)
            r5.writeNoException()
            goto L309
        L10c:
            java.lang.String r3 = r2.zzt()
            r5.writeNoException()
            r5.writeString(r3)
            goto L309
        L118:
            boolean r3 = com.google.android.gms.internal.ads.zzayn.zzg(r4)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzL(r3)
            r5.writeNoException()
            goto L309
        L127:
            com.google.android.gms.ads.internal.client.zzbl r3 = r2.zzi()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
            goto L309
        L133:
            com.google.android.gms.ads.internal.client.zzcm r3 = r2.zzj()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
            goto L309
        L13f:
            java.lang.String r3 = r2.zzr()
            r5.writeNoException()
            r5.writeString(r3)
            goto L309
        L14b:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzef> r3 = com.google.android.gms.ads.internal.client.zzef.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayn.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzef r3 = (com.google.android.gms.ads.internal.client.zzef) r3
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzK(r3)
            r5.writeNoException()
            goto L309
        L15e:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzgb> r3 = com.google.android.gms.ads.internal.client.zzgb.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayn.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzgb r3 = (com.google.android.gms.ads.internal.client.zzgb) r3
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzU(r3)
            r5.writeNoException()
            goto L309
        L171:
            com.google.android.gms.ads.internal.client.zzeb r3 = r2.zzl()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
            goto L309
        L17d:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzT(r3)
            r5.writeNoException()
            goto L309
        L18c:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzbws r3 = com.google.android.gms.internal.ads.zzbwr.zzb(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzS(r3)
            r5.writeNoException()
            goto L309
        L19f:
            boolean r3 = r2.zzZ()
            r5.writeNoException()
            int r4 = com.google.android.gms.internal.ads.zzayn.zza
            r5.writeInt(r3)
            goto L309
        L1ad:
            boolean r3 = com.google.android.gms.internal.ads.zzayn.zzg(r4)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzN(r3)
            r5.writeNoException()
            goto L309
        L1bc:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L1c3
            goto L1d5
        L1c3:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzcq
            if (r0 == 0) goto L1d0
            com.google.android.gms.ads.internal.client.zzcq r6 = (com.google.android.gms.ads.internal.client.zzcq) r6
            goto L1d5
        L1d0:
            com.google.android.gms.ads.internal.client.zzcq r6 = new com.google.android.gms.ads.internal.client.zzcq
            r6.<init>(r3)
        L1d5:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzac(r6)
            r5.writeNoException()
            goto L309
        L1e0:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L1e7
            goto L1f9
        L1e7:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzbi
            if (r0 == 0) goto L1f4
            com.google.android.gms.ads.internal.client.zzbi r6 = (com.google.android.gms.ads.internal.client.zzbi) r6
            goto L1f9
        L1f4:
            com.google.android.gms.ads.internal.client.zzbg r6 = new com.google.android.gms.ads.internal.client.zzbg
            r6.<init>(r3)
        L1f9:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzC(r6)
            r5.writeNoException()
            goto L309
        L204:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzbdq r3 = com.google.android.gms.internal.ads.zzbdp.zzb(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzO(r3)
            r5.writeNoException()
            goto L309
        L217:
            java.lang.String r3 = r2.zzs()
            r5.writeNoException()
            r5.writeString(r3)
            goto L309
        L223:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzbty r3 = com.google.android.gms.internal.ads.zzbtx.zzb(r3)
            java.lang.String r6 = r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzQ(r3, r6)
            r5.writeNoException()
            goto L309
        L23a:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzbtv r3 = com.google.android.gms.internal.ads.zzbtu.zzb(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzM(r3)
            r5.writeNoException()
            goto L309
        L24d:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzs> r3 = com.google.android.gms.ads.internal.client.zzs.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayn.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzs r3 = (com.google.android.gms.ads.internal.client.zzs) r3
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzF(r3)
            r5.writeNoException()
            goto L309
        L260:
            com.google.android.gms.ads.internal.client.zzs r3 = r2.zzg()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r5, r3)
            goto L309
        L26c:
            r2.zzA()
            r5.writeNoException()
            goto L309
        L274:
            r5.writeNoException()
            goto L309
        L279:
            r2.zzX()
            r5.writeNoException()
            goto L309
        L281:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L288
            goto L29a
        L288:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzcm
            if (r0 == 0) goto L295
            com.google.android.gms.ads.internal.client.zzcm r6 = (com.google.android.gms.ads.internal.client.zzcm) r6
            goto L29a
        L295:
            com.google.android.gms.ads.internal.client.zzck r6 = new com.google.android.gms.ads.internal.client.zzck
            r6.<init>(r3)
        L29a:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzG(r6)
            r5.writeNoException()
            goto L309
        L2a4:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L2ab
            goto L2bd
        L2ab:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzbl
            if (r0 == 0) goto L2b8
            com.google.android.gms.ads.internal.client.zzbl r6 = (com.google.android.gms.ads.internal.client.zzbl) r6
            goto L2bd
        L2b8:
            com.google.android.gms.ads.internal.client.zzbj r6 = new com.google.android.gms.ads.internal.client.zzbj
            r6.<init>(r3)
        L2bd:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzD(r6)
            r5.writeNoException()
            goto L309
        L2c7:
            r2.zzB()
            r5.writeNoException()
            goto L309
        L2ce:
            r2.zzz()
            r5.writeNoException()
            goto L309
        L2d5:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r3 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayn.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzm r3 = (com.google.android.gms.ads.internal.client.zzm) r3
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            boolean r3 = r2.zzab(r3)
            r5.writeNoException()
            r5.writeInt(r3)
            goto L309
        L2eb:
            boolean r3 = r2.zzaa()
            r5.writeNoException()
            int r4 = com.google.android.gms.internal.ads.zzayn.zza
            r5.writeInt(r3)
            goto L309
        L2f8:
            r2.zzx()
            r5.writeNoException()
            goto L309
        L2ff:
            com.google.android.gms.dynamic.IObjectWrapper r3 = r2.zzn()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
        L309:
            r3 = 1
            return r3
    }
}
