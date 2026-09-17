package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbt extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzbu {
    public zzbt() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 0
            switch(r2) {
                case 1: goto L11c;
                case 2: goto Lf9;
                case 3: goto Le7;
                case 4: goto Ld5;
                case 5: goto Lb7;
                case 6: goto La4;
                case 7: goto L80;
                case 8: goto L65;
                case 9: goto L52;
                case 10: goto L3f;
                case 11: goto L4;
                case 12: goto L4;
                case 13: goto L2c;
                case 14: goto L19;
                case 15: goto L6;
                default: goto L4;
            }
        L4:
            r2 = 0
            return r2
        L6:
            android.os.Parcelable$Creator<com.google.android.gms.ads.formats.AdManagerAdViewOptions> r2 = com.google.android.gms.ads.formats.AdManagerAdViewOptions.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            com.google.android.gms.ads.formats.AdManagerAdViewOptions r2 = (com.google.android.gms.ads.formats.AdManagerAdViewOptions) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzm(r2)
            r4.writeNoException()
            goto L126
        L19:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzbmp r2 = com.google.android.gms.internal.ads.zzbmo.zzb(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzi(r2)
            r4.writeNoException()
            goto L126
        L2c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbmg> r2 = com.google.android.gms.internal.ads.zzbmg.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            com.google.android.gms.internal.ads.zzbmg r2 = (com.google.android.gms.internal.ads.zzbmg) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzn(r2)
            r4.writeNoException()
            goto L126
        L3f:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzbhq r2 = com.google.android.gms.internal.ads.zzbhp.zzb(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzk(r2)
            r4.writeNoException()
            goto L126
        L52:
            android.os.Parcelable$Creator<com.google.android.gms.ads.formats.PublisherAdViewOptions> r2 = com.google.android.gms.ads.formats.PublisherAdViewOptions.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            com.google.android.gms.ads.formats.PublisherAdViewOptions r2 = (com.google.android.gms.ads.formats.PublisherAdViewOptions) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzp(r2)
            r4.writeNoException()
            goto L126
        L65:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzbhn r2 = com.google.android.gms.internal.ads.zzbhm.zzb(r2)
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzs> r5 = com.google.android.gms.ads.internal.client.zzs.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.ads.zzayn.zza(r3, r5)
            com.google.android.gms.ads.internal.client.zzs r5 = (com.google.android.gms.ads.internal.client.zzs) r5
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzj(r2, r5)
            r4.writeNoException()
            goto L126
        L80:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L87
            goto L99
        L87:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.ads.internal.client.zzcq
            if (r0 == 0) goto L94
            com.google.android.gms.ads.internal.client.zzcq r5 = (com.google.android.gms.ads.internal.client.zzcq) r5
            goto L99
        L94:
            com.google.android.gms.ads.internal.client.zzcq r5 = new com.google.android.gms.ads.internal.client.zzcq
            r5.<init>(r2)
        L99:
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzq(r5)
            r4.writeNoException()
            goto L126
        La4:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfr> r2 = com.google.android.gms.internal.ads.zzbfr.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            com.google.android.gms.internal.ads.zzbfr r2 = (com.google.android.gms.internal.ads.zzbfr) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzo(r2)
            r4.writeNoException()
            goto L126
        Lb7:
            java.lang.String r2 = r3.readString()
            android.os.IBinder r5 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzbhj r5 = com.google.android.gms.internal.ads.zzbhi.zzb(r5)
            android.os.IBinder r0 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzbhg r0 = com.google.android.gms.internal.ads.zzbhf.zzb(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzh(r2, r5, r0)
            r4.writeNoException()
            goto L126
        Ld5:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzbhd r2 = com.google.android.gms.internal.ads.zzbhc.zzb(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzg(r2)
            r4.writeNoException()
            goto L126
        Le7:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzbha r2 = com.google.android.gms.internal.ads.zzbgz.zzb(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzf(r2)
            r4.writeNoException()
            goto L126
        Lf9:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L100
            goto L112
        L100:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.ads.internal.client.zzbl
            if (r0 == 0) goto L10d
            com.google.android.gms.ads.internal.client.zzbl r5 = (com.google.android.gms.ads.internal.client.zzbl) r5
            goto L112
        L10d:
            com.google.android.gms.ads.internal.client.zzbj r5 = new com.google.android.gms.ads.internal.client.zzbj
            r5.<init>(r2)
        L112:
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzl(r5)
            r4.writeNoException()
            goto L126
        L11c:
            com.google.android.gms.ads.internal.client.zzbr r2 = r1.zze()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
        L126:
            r2 = 1
            return r2
    }
}
