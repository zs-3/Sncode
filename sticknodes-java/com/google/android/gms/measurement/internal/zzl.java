package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
/* loaded from: classes2.dex */
final class zzl implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zze;

    zzl(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1, com.google.android.gms.internal.measurement.zzcy r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = r5.zze
            com.google.android.gms.measurement.internal.zzio r0 = r0.zza
            com.google.android.gms.measurement.internal.zzny r0 = r0.zzu()
            com.google.android.gms.internal.measurement.zzcy r1 = r5.zza
            java.lang.String r2 = r5.zzb
            java.lang.String r3 = r5.zzc
            boolean r4 = r5.zzd
            r0.zzK(r1, r2, r3, r4)
            return
    }
}
