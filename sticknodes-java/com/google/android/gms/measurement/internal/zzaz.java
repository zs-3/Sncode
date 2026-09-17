package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
abstract class zzaz {
    private static volatile android.os.Handler zza;
    private final com.google.android.gms.measurement.internal.zzjs zzb;
    private final java.lang.Runnable zzc;
    private volatile long zzd;

    zzaz(com.google.android.gms.measurement.internal.zzjs r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r1.zzb = r2
            com.google.android.gms.measurement.internal.zzay r0 = new com.google.android.gms.measurement.internal.zzay
            r0.<init>(r1, r2)
            r1.zzc = r0
            return
    }

    static /* bridge */ /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzaz r0, long r1) {
            r1 = 0
            r0.zzd = r1
            return
    }

    private final android.os.Handler zzf() {
            r3 = this;
            android.os.Handler r0 = com.google.android.gms.measurement.internal.zzaz.zza
            if (r0 == 0) goto L7
            android.os.Handler r0 = com.google.android.gms.measurement.internal.zzaz.zza
            return r0
        L7:
            java.lang.Class<com.google.android.gms.measurement.internal.zzaz> r0 = com.google.android.gms.measurement.internal.zzaz.class
            monitor-enter(r0)
            android.os.Handler r1 = com.google.android.gms.measurement.internal.zzaz.zza     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L1f
            com.google.android.gms.internal.measurement.zzcr r1 = new com.google.android.gms.internal.measurement.zzcr     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.measurement.internal.zzjs r2 = r3.zzb     // Catch: java.lang.Throwable -> L23
            android.content.Context r2 = r2.zzaT()     // Catch: java.lang.Throwable -> L23
            android.os.Looper r2 = r2.getMainLooper()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.measurement.internal.zzaz.zza = r1     // Catch: java.lang.Throwable -> L23
        L1f:
            android.os.Handler r1 = com.google.android.gms.measurement.internal.zzaz.zza     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r1
        L23:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r1
    }

    final void zzb() {
            r2 = this;
            r0 = 0
            r2.zzd = r0
            android.os.Handler r0 = r2.zzf()
            java.lang.Runnable r1 = r2.zzc
            r0.removeCallbacks(r1)
            return
    }

    public abstract void zzc();

    public final void zzd(long r4) {
            r3 = this;
            r3.zzb()
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L32
            com.google.android.gms.measurement.internal.zzjs r0 = r3.zzb
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r1 = r1.currentTimeMillis()
            r3.zzd = r1
            android.os.Handler r1 = r3.zzf()
            java.lang.Runnable r2 = r3.zzc
            boolean r1 = r1.postDelayed(r2, r4)
            if (r1 != 0) goto L32
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "Failed to schedule delayed post. time"
            r0.zzb(r5, r4)
        L32:
            return
    }

    public final boolean zze() {
            r5 = this;
            long r0 = r5.zzd
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
