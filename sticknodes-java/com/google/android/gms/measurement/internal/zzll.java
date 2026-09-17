package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzll implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzll(com.google.android.gms.measurement.internal.zzlw r1, java.util.concurrent.atomic.AtomicReference r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r4.zza
            monitor-enter(r0)
            com.google.android.gms.measurement.internal.zzlw r1 = r4.zzb     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzam r2 = r2.zzf()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzh()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r1.zzm()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzgg r3 = com.google.android.gms.measurement.internal.zzgi.zzaa     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r2.zzr(r1, r3)     // Catch: java.lang.Throwable -> L25
            r0.set(r1)     // Catch: java.lang.Throwable -> L25
            java.util.concurrent.atomic.AtomicReference r1 = r4.zza     // Catch: java.lang.Throwable -> L2c
            r1.notify()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L25:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r4.zza     // Catch: java.lang.Throwable -> L2c
            r2.notify()     // Catch: java.lang.Throwable -> L2c
            throw r1     // Catch: java.lang.Throwable -> L2c
        L2c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r1
    }
}
