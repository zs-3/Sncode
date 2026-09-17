package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
/* loaded from: classes2.dex */
final class zzn implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzd;

    zzn(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1, com.google.android.gms.internal.measurement.zzcy r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = r4.zzd
            com.google.android.gms.measurement.internal.zzio r0 = r0.zza
            com.google.android.gms.measurement.internal.zzny r0 = r0.zzu()
            com.google.android.gms.internal.measurement.zzcy r1 = r4.zza
            java.lang.String r2 = r4.zzb
            java.lang.String r3 = r4.zzc
            r0.zzF(r1, r2, r3)
            return
    }
}
