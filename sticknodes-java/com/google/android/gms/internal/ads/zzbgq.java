package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbgq extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbgr {
    public zzbgq() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            switch(r1) {
                case 2: goto Ldd;
                case 3: goto Ld2;
                case 4: goto Lc7;
                case 5: goto Lbc;
                case 6: goto Lb1;
                case 7: goto La6;
                case 8: goto L9b;
                case 9: goto L90;
                case 10: goto L85;
                case 11: goto L7a;
                case 12: goto L72;
                case 13: goto L66;
                case 14: goto L53;
                case 15: goto L3c;
                case 16: goto L29;
                case 17: goto L1d;
                case 18: goto L11;
                case 19: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            java.lang.String r1 = r0.zzl()
            r3.writeNoException()
            r3.writeString(r1)
            goto Le7
        L11:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzg()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto Le7
        L1d:
            com.google.android.gms.internal.ads.zzbfv r1 = r0.zze()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto Le7
        L29:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzr(r1)
            r3.writeNoException()
            goto Le7
        L3c:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            boolean r1 = r0.zzs(r1)
            r3.writeNoException()
            r3.writeInt(r1)
            goto Le7
        L53:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzq(r1)
            r3.writeNoException()
            goto Le7
        L66:
            com.google.android.gms.ads.internal.client.zzeb r1 = r0.zzd()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto Le7
        L72:
            r0.zzp()
            r3.writeNoException()
            goto Le7
        L7a:
            android.os.Bundle r1 = r0.zzc()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r3, r1)
            goto Le7
        L85:
            java.lang.String r1 = r0.zzm()
            r3.writeNoException()
            r3.writeString(r1)
            goto Le7
        L90:
            java.lang.String r1 = r0.zzn()
            r3.writeNoException()
            r3.writeString(r1)
            goto Le7
        L9b:
            double r1 = r0.zzb()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto Le7
        La6:
            java.lang.String r1 = r0.zzj()
            r3.writeNoException()
            r3.writeString(r1)
            goto Le7
        Lb1:
            com.google.android.gms.internal.ads.zzbgc r1 = r0.zzf()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto Le7
        Lbc:
            java.lang.String r1 = r0.zzi()
            r3.writeNoException()
            r3.writeString(r1)
            goto Le7
        Lc7:
            java.util.List r1 = r0.zzo()
            r3.writeNoException()
            r3.writeList(r1)
            goto Le7
        Ld2:
            java.lang.String r1 = r0.zzk()
            r3.writeNoException()
            r3.writeString(r1)
            goto Le7
        Ldd:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzh()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
        Le7:
            r1 = 1
            return r1
    }
}
