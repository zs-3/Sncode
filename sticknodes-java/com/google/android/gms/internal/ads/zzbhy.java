package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbhy extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbhz {
    public zzbhy() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            switch(r2) {
                case 2: goto L1b4;
                case 3: goto L1a9;
                case 4: goto L19e;
                case 5: goto L193;
                case 6: goto L188;
                case 7: goto L17d;
                case 8: goto L172;
                case 9: goto L167;
                case 10: goto L15c;
                case 11: goto L151;
                case 12: goto L145;
                case 13: goto L13d;
                case 14: goto L131;
                case 15: goto L11e;
                case 16: goto L107;
                case 17: goto Lf4;
                case 18: goto Le8;
                case 19: goto Ldc;
                case 20: goto Ld0;
                case 21: goto La9;
                case 22: goto La1;
                case 23: goto L95;
                case 24: goto L87;
                case 25: goto L74;
                case 26: goto L61;
                case 27: goto L59;
                case 28: goto L51;
                case 29: goto L45;
                case 30: goto L37;
                case 31: goto L2b;
                case 32: goto L18;
                case 33: goto L5;
                default: goto L3;
            }
        L3:
            r2 = 0
            return r2
        L5:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzB(r2)
            r4.writeNoException()
            goto L1be
        L18:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdr r2 = com.google.android.gms.ads.internal.client.zzdq.zzb(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzF(r2)
            r4.writeNoException()
            goto L1be
        L2b:
            com.google.android.gms.ads.internal.client.zzdy r2 = r1.zzg()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L1be
        L37:
            boolean r2 = r1.zzH()
            r4.writeNoException()
            int r3 = com.google.android.gms.internal.ads.zzayn.zza
            r4.writeInt(r2)
            goto L1be
        L45:
            com.google.android.gms.internal.ads.zzbfz r2 = r1.zzj()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L1be
        L51:
            r1.zzA()
            r4.writeNoException()
            goto L1be
        L59:
            r1.zzD()
            r4.writeNoException()
            goto L1be
        L61:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdd r2 = com.google.android.gms.ads.internal.client.zzdc.zzb(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzE(r2)
            r4.writeNoException()
            goto L1be
        L74:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdh r2 = com.google.android.gms.ads.internal.client.zzdg.zzb(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzy(r2)
            r4.writeNoException()
            goto L1be
        L87:
            boolean r2 = r1.zzI()
            r4.writeNoException()
            int r3 = com.google.android.gms.internal.ads.zzayn.zza
            r4.writeInt(r2)
            goto L1be
        L95:
            java.util.List r2 = r1.zzv()
            r4.writeNoException()
            r4.writeList(r2)
            goto L1be
        La1:
            r1.zzw()
            r4.writeNoException()
            goto L1be
        La9:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto Lb1
            r2 = 0
            goto Lc5
        Lb1:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzbhw
            if (r0 == 0) goto Lbf
            r2 = r5
            com.google.android.gms.internal.ads.zzbhw r2 = (com.google.android.gms.internal.ads.zzbhw) r2
            goto Lc5
        Lbf:
            com.google.android.gms.internal.ads.zzbhu r5 = new com.google.android.gms.internal.ads.zzbhu
            r5.<init>(r2)
            r2 = r5
        Lc5:
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzG(r2)
            r4.writeNoException()
            goto L1be
        Ld0:
            android.os.Bundle r2 = r1.zzf()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r4, r2)
            goto L1be
        Ldc:
            com.google.android.gms.dynamic.IObjectWrapper r2 = r1.zzl()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L1be
        Le8:
            com.google.android.gms.dynamic.IObjectWrapper r2 = r1.zzm()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L1be
        Lf4:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzC(r2)
            r4.writeNoException()
            goto L1be
        L107:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            boolean r2 = r1.zzJ(r2)
            r4.writeNoException()
            r4.writeInt(r2)
            goto L1be
        L11e:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzz(r2)
            r4.writeNoException()
            goto L1be
        L131:
            com.google.android.gms.internal.ads.zzbfv r2 = r1.zzi()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L1be
        L13d:
            r1.zzx()
            r4.writeNoException()
            goto L1be
        L145:
            java.lang.String r2 = r1.zzr()
            r4.writeNoException()
            r4.writeString(r2)
            goto L1be
        L151:
            com.google.android.gms.ads.internal.client.zzeb r2 = r1.zzh()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L1be
        L15c:
            java.lang.String r2 = r1.zzs()
            r4.writeNoException()
            r4.writeString(r2)
            goto L1be
        L167:
            java.lang.String r2 = r1.zzt()
            r4.writeNoException()
            r4.writeString(r2)
            goto L1be
        L172:
            double r2 = r1.zze()
            r4.writeNoException()
            r4.writeDouble(r2)
            goto L1be
        L17d:
            java.lang.String r2 = r1.zzn()
            r4.writeNoException()
            r4.writeString(r2)
            goto L1be
        L188:
            java.lang.String r2 = r1.zzp()
            r4.writeNoException()
            r4.writeString(r2)
            goto L1be
        L193:
            com.google.android.gms.internal.ads.zzbgc r2 = r1.zzk()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L1be
        L19e:
            java.lang.String r2 = r1.zzo()
            r4.writeNoException()
            r4.writeString(r2)
            goto L1be
        L1a9:
            java.util.List r2 = r1.zzu()
            r4.writeNoException()
            r4.writeList(r2)
            goto L1be
        L1b4:
            java.lang.String r2 = r1.zzq()
            r4.writeNoException()
            r4.writeString(r2)
        L1be:
            r2 = 1
            return r2
    }
}
