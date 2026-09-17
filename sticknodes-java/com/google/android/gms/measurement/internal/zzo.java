package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
/* loaded from: classes2.dex */
final class zzo implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzb;

    zzo(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1, com.google.android.gms.internal.measurement.zzcy r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = r3.zzb
            com.google.android.gms.measurement.internal.zzio r1 = r0.zza
            com.google.android.gms.measurement.internal.zzqf r1 = r1.zzw()
            com.google.android.gms.measurement.internal.zzio r0 = r0.zza
            boolean r0 = r0.zzI()
            com.google.android.gms.internal.measurement.zzcy r2 = r3.zza
            r1.zzT(r2, r0)
            return
    }
}
