package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbx {
    private long zza;
    private long zzb;
    private final java.lang.Object zzc;

    public zzbx(long r3) {
            r2 = this;
            r2.<init>()
            r0 = -9223372036854775808
            r2.zzb = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzc = r0
            r2.zza = r3
            return
    }

    public final void zza(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.zzc
            monitor-enter(r0)
            r1.zza = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public final boolean zzb() {
            r7 = this;
            java.lang.Object r0 = r7.zzc
            monitor-enter(r0)
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L1c
            long r1 = r1.elapsedRealtime()     // Catch: java.lang.Throwable -> L1c
            long r3 = r7.zzb     // Catch: java.lang.Throwable -> L1c
            long r5 = r7.zza     // Catch: java.lang.Throwable -> L1c
            long r3 = r3 + r5
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            r0 = 0
            return r0
        L17:
            r7.zzb = r1     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            r0 = 1
            return r0
        L1c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }
}
