package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzcx extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.internal.measurement.zzcy {
    public zzcx() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r4 = 1
            if (r1 != r4) goto L15
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.measurement.zzbo.zzc(r2)
            r0.zze(r1)
            r3.writeNoException()
            return r4
        L15:
            r1 = 0
            return r1
    }
}
