package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfgg {
    private final com.google.android.gms.common.util.Clock zza;
    private final java.lang.Object zzb;
    private volatile long zzc;
    private volatile int zzd;

    public zzfgg(com.google.android.gms.common.util.Clock r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzb = r0
            r0 = 1
            r2.zzd = r0
            r0 = 0
            r2.zzc = r0
            r2.zza = r3
            return
    }

    private final void zze() {
            r7 = this;
            com.google.android.gms.common.util.Clock r0 = r7.zza
            long r0 = r0.currentTimeMillis()
            java.lang.Object r2 = r7.zzb
            monitor-enter(r2)
            int r3 = r7.zzd     // Catch: java.lang.Throwable -> L2a
            r4 = 3
            if (r3 != r4) goto L28
            long r3 = r7.zzc     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzfL     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r6.zza(r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L2a
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L2a
            long r3 = r3 + r5
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L28
            r0 = 1
            r7.zzd = r0     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r0
    }

    private final void zzf(int r5, int r6) {
            r4 = this;
            r4.zze()
            java.lang.Object r0 = r4.zzb
            com.google.android.gms.common.util.Clock r1 = r4.zza
            long r1 = r1.currentTimeMillis()
            monitor-enter(r0)
            int r3 = r4.zzd     // Catch: java.lang.Throwable -> L1d
            if (r3 == r5) goto L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L12:
            r4.zzd = r6     // Catch: java.lang.Throwable -> L1d
            int r5 = r4.zzd     // Catch: java.lang.Throwable -> L1d
            r6 = 3
            if (r5 != r6) goto L1b
            r4.zzc = r1     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r5
    }

    public final void zza() {
            r2 = this;
            r0 = 2
            r1 = 3
            r2.zzf(r0, r1)
            return
    }

    public final void zzb(boolean r3) {
            r2 = this;
            r0 = 1
            r1 = 2
            if (r3 == 0) goto L8
            r2.zzf(r0, r1)
            return
        L8:
            r2.zzf(r1, r0)
            return
    }

    public final boolean zzc() {
            r3 = this;
            java.lang.Object r0 = r3.zzb
            monitor-enter(r0)
            r3.zze()     // Catch: java.lang.Throwable -> L10
            int r1 = r3.zzd     // Catch: java.lang.Throwable -> L10
            r2 = 3
            if (r1 != r2) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public final boolean zzd() {
            r3 = this;
            java.lang.Object r0 = r3.zzb
            monitor-enter(r0)
            r3.zze()     // Catch: java.lang.Throwable -> L10
            int r1 = r3.zzd     // Catch: java.lang.Throwable -> L10
            r2 = 2
            if (r1 != r2) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }
}
