package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbgs extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbgt {
    public zzbgs() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeContentAd"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            switch(r1) {
                case 2: goto Lc4;
                case 3: goto Lb9;
                case 4: goto Lae;
                case 5: goto La3;
                case 6: goto L98;
                case 7: goto L8d;
                case 8: goto L82;
                case 9: goto L77;
                case 10: goto L70;
                case 11: goto L65;
                case 12: goto L53;
                case 13: goto L3c;
                case 14: goto L29;
                case 15: goto L1d;
                case 16: goto L11;
                case 17: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            java.lang.String r1 = r0.zzl()
            r3.writeNoException()
            r3.writeString(r1)
            goto Lce
        L11:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzf()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto Lce
        L1d:
            com.google.android.gms.internal.ads.zzbfv r1 = r0.zzd()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto Lce
        L29:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzp(r1)
            r3.writeNoException()
            goto Lce
        L3c:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            boolean r1 = r0.zzq(r1)
            r3.writeNoException()
            r3.writeInt(r1)
            goto Lce
        L53:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzo(r1)
            r3.writeNoException()
            goto Lce
        L65:
            com.google.android.gms.ads.internal.client.zzeb r1 = r0.zzc()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto Lce
        L70:
            r0.zzn()
            r3.writeNoException()
            goto Lce
        L77:
            android.os.Bundle r1 = r0.zzb()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r3, r1)
            goto Lce
        L82:
            java.lang.String r1 = r0.zzh()
            r3.writeNoException()
            r3.writeString(r1)
            goto Lce
        L8d:
            java.lang.String r1 = r0.zzj()
            r3.writeNoException()
            r3.writeString(r1)
            goto Lce
        L98:
            com.google.android.gms.internal.ads.zzbgc r1 = r0.zze()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto Lce
        La3:
            java.lang.String r1 = r0.zzi()
            r3.writeNoException()
            r3.writeString(r1)
            goto Lce
        Lae:
            java.util.List r1 = r0.zzm()
            r3.writeNoException()
            r3.writeList(r1)
            goto Lce
        Lb9:
            java.lang.String r1 = r0.zzk()
            r3.writeNoException()
            r3.writeString(r1)
            goto Lce
        Lc4:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzg()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
        Lce:
            r1 = 1
            return r1
    }
}
