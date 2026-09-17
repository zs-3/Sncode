package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
/* loaded from: classes2.dex */
final class zzj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzb;

    zzj(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1, com.google.android.gms.internal.measurement.zzcy r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = r2.zzb
            com.google.android.gms.measurement.internal.zzio r0 = r0.zza
            com.google.android.gms.measurement.internal.zzny r0 = r0.zzu()
            com.google.android.gms.internal.measurement.zzcy r1 = r2.zza
            r0.zzD(r1)
            return
    }
}
