package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzchj extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzchk {
    public zzchj() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.measurement.IAppMeasurementProxy"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            switch(r2) {
                case 1: goto L155;
                case 2: goto L13f;
                case 3: goto L125;
                case 4: goto L10b;
                case 5: goto Lf1;
                case 6: goto Lde;
                case 7: goto Lcb;
                case 8: goto Lb0;
                case 9: goto L99;
                case 10: goto L8d;
                case 11: goto L81;
                case 12: goto L75;
                case 13: goto L66;
                case 14: goto L57;
                case 15: goto L3c;
                case 16: goto L30;
                case 17: goto L24;
                case 18: goto L18;
                case 19: goto L5;
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
            r1.zzr(r2)
            r4.writeNoException()
            goto L166
        L18:
            java.lang.String r2 = r1.zze()
            r4.writeNoException()
            r4.writeString(r2)
            goto L166
        L24:
            java.lang.String r2 = r1.zzg()
            r4.writeNoException()
            r4.writeString(r2)
            goto L166
        L30:
            java.lang.String r2 = r1.zzh()
            r4.writeNoException()
            r4.writeString(r2)
            goto L166
        L3c:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            java.lang.String r5 = r3.readString()
            java.lang.String r0 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzs(r2, r5, r0)
            r4.writeNoException()
            goto L166
        L57:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzn(r2)
            r4.writeNoException()
            goto L166
        L66:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzl(r2)
            r4.writeNoException()
            goto L166
        L75:
            long r2 = r1.zzc()
            r4.writeNoException()
            r4.writeLong(r2)
            goto L166
        L81:
            java.lang.String r2 = r1.zzi()
            r4.writeNoException()
            r4.writeString(r2)
            goto L166
        L8d:
            java.lang.String r2 = r1.zzf()
            r4.writeNoException()
            r4.writeString(r2)
            goto L166
        L99:
            java.lang.String r2 = r3.readString()
            java.lang.String r5 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            java.util.List r2 = r1.zzj(r2, r5)
            r4.writeNoException()
            r4.writeList(r2)
            goto L166
        Lb0:
            java.lang.String r2 = r3.readString()
            java.lang.String r5 = r3.readString()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r3, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzm(r2, r5, r0)
            r4.writeNoException()
            goto L166
        Lcb:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzq(r2)
            r4.writeNoException()
            goto L166
        Lde:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            int r2 = r1.zzb(r2)
            r4.writeNoException()
            r4.writeInt(r2)
            goto L166
        Lf1:
            java.lang.String r2 = r3.readString()
            java.lang.String r5 = r3.readString()
            boolean r0 = com.google.android.gms.internal.ads.zzayn.zzg(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            java.util.Map r2 = r1.zzk(r2, r5, r0)
            r4.writeNoException()
            r4.writeMap(r2)
            goto L166
        L10b:
            java.lang.String r2 = r3.readString()
            java.lang.String r5 = r3.readString()
            android.os.IBinder r0 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzt(r2, r5, r0)
            r4.writeNoException()
            goto L166
        L125:
            java.lang.String r2 = r3.readString()
            java.lang.String r5 = r3.readString()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r3, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzo(r2, r5, r0)
            r4.writeNoException()
            goto L166
        L13f:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            android.os.Bundle r2 = r1.zzd(r2)
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r4, r2)
            goto L166
        L155:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzp(r2)
            r4.writeNoException()
        L166:
            r2 = 1
            return r2
    }
}
