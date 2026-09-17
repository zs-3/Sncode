package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzha {
    private static com.google.android.gms.measurement.internal.zzha zza;
    private final com.google.android.gms.measurement.internal.zzio zzb;
    private final com.google.android.gms.common.internal.TelemetryLoggingClient zzc;
    private final java.util.concurrent.atomic.AtomicLong zzd;

    private zzha(android.content.Context r4, com.google.android.gms.measurement.internal.zzio r5) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = -1
            r0.<init>(r1)
            r3.zzd = r0
            com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder r0 = com.google.android.gms.common.internal.TelemetryLoggingOptions.builder()
            java.lang.String r1 = "measurement:api"
            com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder r0 = r0.setApi(r1)
            com.google.android.gms.common.internal.TelemetryLoggingOptions r0 = r0.build()
            com.google.android.gms.common.internal.TelemetryLoggingClient r4 = com.google.android.gms.common.internal.TelemetryLogging.getClient(r4, r0)
            r3.zzc = r4
            r3.zzb = r5
            return
    }

    static com.google.android.gms.measurement.internal.zzha zza(com.google.android.gms.measurement.internal.zzio r2) {
            com.google.android.gms.measurement.internal.zzha r0 = com.google.android.gms.measurement.internal.zzha.zza
            if (r0 != 0) goto Lf
            com.google.android.gms.measurement.internal.zzha r0 = new com.google.android.gms.measurement.internal.zzha
            android.content.Context r1 = r2.zzaT()
            r0.<init>(r1, r2)
            com.google.android.gms.measurement.internal.zzha.zza = r0
        Lf:
            com.google.android.gms.measurement.internal.zzha r2 = com.google.android.gms.measurement.internal.zzha.zza
            return r2
    }

    public static /* synthetic */ void zzb(com.google.android.gms.measurement.internal.zzha r0, long r1, java.lang.Exception r3) {
            java.util.concurrent.atomic.AtomicLong r0 = r0.zzd
            r0.set(r1)
            return
    }

    public final synchronized void zzc(int r20, int r21, long r22, long r24, int r26) {
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzb     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()     // Catch: java.lang.Throwable -> L5f
            long r2 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.atomic.AtomicLong r0 = r1.zzd     // Catch: java.lang.Throwable -> L5f
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L5f
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L1a
            goto L29
        L1a:
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L5f
            long r4 = r2 - r4
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L29
            monitor-exit(r19)
            return
        L29:
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = r1.zzc     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.common.internal.TelemetryData r4 = new com.google.android.gms.common.internal.TelemetryData     // Catch: java.lang.Throwable -> L5f
            r5 = 1
            com.google.android.gms.common.internal.MethodInvocation[] r5 = new com.google.android.gms.common.internal.MethodInvocation[r5]     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.common.internal.MethodInvocation r18 = new com.google.android.gms.common.internal.MethodInvocation     // Catch: java.lang.Throwable -> L5f
            r7 = 36301(0x8dcd, float:5.0869E-41)
            r9 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r6 = r18
            r8 = r21
            r10 = r22
            r12 = r24
            r17 = r26
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L5f
            r6 = 0
            r5[r6] = r18     // Catch: java.lang.Throwable -> L5f
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L5f
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.tasks.Task r0 = r0.log(r4)     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzgz r4 = new com.google.android.gms.measurement.internal.zzgz     // Catch: java.lang.Throwable -> L5f
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L5f
            r0.addOnFailureListener(r4)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r19)
            return
        L5f:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
    }
}
