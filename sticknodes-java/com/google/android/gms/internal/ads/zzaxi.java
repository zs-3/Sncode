package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxi extends com.google.android.gms.internal.ads.zzayc {
    private final com.google.android.gms.internal.ads.zzawp zzh;

    public zzaxi(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13, com.google.android.gms.internal.ads.zzawp r14) {
            r7 = this;
            java.lang.String r2 = "s/IaC73MjD9vpfzZvssIGR7eelXzGompBCRU9Px19GF39ZofYoD29ElcUTZqSvpM"
            java.lang.String r3 = "t30h8UZEoZP8GE77k4AdlDjTvNQpvs7DHs10k6C9ZzU="
            r6 = 85
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zzh = r14
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r7 = this;
            java.lang.reflect.Method r0 = r7.zze
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.google.android.gms.internal.ads.zzawp r2 = r7.zzh
            long r2 = r2.zzd()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.internal.ads.zzawp r2 = r7.zzh
            long r4 = r2.zzh()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 1
            r1[r4] = r2
            com.google.android.gms.internal.ads.zzawp r2 = r7.zzh
            long r5 = r2.zzb()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r5 = 2
            r1[r5] = r2
            com.google.android.gms.internal.ads.zzawp r2 = r7.zzh
            long r5 = r2.zzf()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r5 = 3
            r1[r5] = r2
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)
            long[] r0 = (long[]) r0
            com.google.android.gms.internal.ads.zzasm r1 = r7.zzd
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzasm r2 = r7.zzd     // Catch: java.lang.Throwable -> L53
            r5 = r0[r3]     // Catch: java.lang.Throwable -> L53
            r2.zzv(r5)     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.internal.ads.zzasm r2 = r7.zzd     // Catch: java.lang.Throwable -> L53
            r3 = r0[r4]     // Catch: java.lang.Throwable -> L53
            r2.zzu(r3)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L53
            return
        L53:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L53
            throw r0
    }
}
