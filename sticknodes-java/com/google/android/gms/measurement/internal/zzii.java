package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzii implements java.lang.Thread.UncaughtExceptionHandler {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzil zza;
    private final java.lang.String zzb;

    public zzii(com.google.android.gms.measurement.internal.zzil r1, java.lang.String r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r0.zzb = r2
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(java.lang.Thread r2, java.lang.Throwable r3) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.measurement.internal.zzil r2 = r1.zza     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r1.zzb     // Catch: java.lang.Throwable -> L14
            r2.zzb(r0, r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
