package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzbp extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzbr {
    zzbp(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzbr
    public final android.os.Bundle zze(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 1
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.zzbo.zza(r2, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r2.recycle()
            return r0
    }
}
