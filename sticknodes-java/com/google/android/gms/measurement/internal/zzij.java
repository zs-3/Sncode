package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzij extends java.util.concurrent.FutureTask implements java.lang.Comparable {
    final boolean zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzil zzb;
    private final long zzc;
    private final java.lang.String zzd;

    zzij(com.google.android.gms.measurement.internal.zzil r3, java.lang.Runnable r4, boolean r5, java.lang.String r6) {
            r2 = this;
            r2.zzb = r3
            r0 = 0
            r2.<init>(r4, r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.concurrent.atomic.AtomicLong r4 = com.google.android.gms.measurement.internal.zzil.zzj()
            long r0 = r4.getAndIncrement()
            r2.zzc = r0
            r2.zzd = r6
            r2.zza = r5
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L2f
            com.google.android.gms.measurement.internal.zzio r3 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.String r4 = "Tasks index overflow"
            r3.zza(r4)
        L2f:
            return
    }

    zzij(com.google.android.gms.measurement.internal.zzil r3, java.util.concurrent.Callable r4, boolean r5, java.lang.String r6) {
            r2 = this;
            r2.zzb = r3
            r2.<init>(r4)
            java.lang.String r4 = "Task exception on worker thread"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.util.concurrent.atomic.AtomicLong r6 = com.google.android.gms.measurement.internal.zzil.zzj()
            long r0 = r6.getAndIncrement()
            r2.zzc = r0
            r2.zzd = r4
            r2.zza = r5
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L30
            com.google.android.gms.measurement.internal.zzio r3 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.String r4 = "Tasks index overflow"
            r3.zza(r4)
        L30:
            return
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r7) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzij r7 = (com.google.android.gms.measurement.internal.zzij) r7
            boolean r0 = r7.zza
            boolean r1 = r6.zza
            r2 = 1
            r3 = -1
            if (r1 == r0) goto Le
            if (r1 != 0) goto Ld
            goto L1a
        Ld:
            return r3
        Le:
            long r0 = r6.zzc
            long r4 = r7.zzc
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L18
            r2 = -1
            goto L1a
        L18:
            if (r7 <= 0) goto L1b
        L1a:
            return r2
        L1b:
            com.google.android.gms.measurement.internal.zzil r7 = r6.zzb
            com.google.android.gms.measurement.internal.zzio r7 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r7 = r7.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzh()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "Two tasks share the same index. index"
            r7.zzb(r1, r0)
            r7 = 0
            return r7
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r2.zzb
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = r2.zzd
            r0.zzb(r1, r3)
            boolean r0 = r3 instanceof com.google.android.gms.measurement.internal.zzih
            if (r0 == 0) goto L22
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            if (r0 == 0) goto L22
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.uncaughtException(r1, r3)
        L22:
            super.setException(r3)
            return
    }
}
