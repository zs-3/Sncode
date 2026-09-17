package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzcw extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzcy {
    zzcw(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void zze(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 1
            r1.zzc(r2, r0)
            return
    }
}
