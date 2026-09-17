package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzns implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzgl zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznx zzb;

    zzns(com.google.android.gms.measurement.internal.zznx r1, com.google.android.gms.measurement.internal.zzgl r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.measurement.internal.zznx r0 = r4.zzb
            monitor-enter(r0)
            r1 = 0
            com.google.android.gms.measurement.internal.zznx.zza(r0, r1)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.measurement.internal.zzny r1 = r0.zza     // Catch: java.lang.Throwable -> L48
            boolean r2 = r1.zzaa()     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L23
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzd()     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "Connected to remote service"
            r2.zza(r3)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.measurement.internal.zzgl r2 = r4.zza     // Catch: java.lang.Throwable -> L48
            r1.zzW(r2)     // Catch: java.lang.Throwable -> L48
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.measurement.internal.zznx r0 = r4.zzb
            com.google.android.gms.measurement.internal.zzny r0 = r0.zza
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r1.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzbo
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            if (r1 == 0) goto L47
            java.util.concurrent.ScheduledExecutorService r1 = com.google.android.gms.measurement.internal.zzny.zzm(r0)
            if (r1 == 0) goto L47
            java.util.concurrent.ScheduledExecutorService r1 = com.google.android.gms.measurement.internal.zzny.zzm(r0)
            r1.shutdownNow()
            com.google.android.gms.measurement.internal.zzny.zzu(r0, r3)
        L47:
            return
        L48:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r1
    }
}
