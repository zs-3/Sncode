package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzer {
    private long zza;
    private long zzb;
    private long zzc;
    private final java.lang.ThreadLocal zzd;

    public zzer(long r1) {
            r0 = this;
            r0.<init>()
            java.lang.ThreadLocal r1 = new java.lang.ThreadLocal
            r1.<init>()
            r0.zzd = r1
            r1 = 0
            r0.zzi(r1)
            return
    }

    public static long zzg(long r2) {
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            r0 = 90000(0x15f90, double:4.4466E-319)
            long r2 = r2 / r0
            return r2
    }

    public static long zzh(long r2) {
            r0 = 90000(0x15f90, double:4.4466E-319)
            long r2 = r2 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r0
            return r2
    }

    public final synchronized long zza(long r6) {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.zzj()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L27
            long r0 = r5.zza     // Catch: java.lang.Throwable -> L2e
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L21
            java.lang.ThreadLocal r0 = r5.zzd     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L2e
            java.util.Objects.requireNonNull(r0)
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L2e
        L21:
            long r0 = r0 - r6
            r5.zzb = r0     // Catch: java.lang.Throwable -> L2e
            r5.notifyAll()     // Catch: java.lang.Throwable -> L2e
        L27:
            r5.zzc = r6     // Catch: java.lang.Throwable -> L2e
            long r0 = r5.zzb     // Catch: java.lang.Throwable -> L2e
            long r6 = r6 + r0
            monitor-exit(r5)
            return r6
        L2e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public final synchronized long zzb(long r9) {
            r8 = this;
            monitor-enter(r8)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            monitor-exit(r8)
            return r0
        Lc:
            long r2 = r8.zzc     // Catch: java.lang.Throwable -> L46
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r0 = zzh(r2)     // Catch: java.lang.Throwable -> L46
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = r2 + r0
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            long r2 = r2 / r4
            r6 = -1
            long r6 = r6 + r2
            long r6 = r6 * r4
            long r6 = r6 + r9
            long r2 = r2 * r4
            long r9 = r9 + r2
            long r2 = r9 - r0
            long r0 = r6 - r0
            long r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L46
            long r2 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> L46
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L3c
            r9 = r6
        L3c:
            long r9 = zzg(r9)     // Catch: java.lang.Throwable -> L46
            long r9 = r8.zza(r9)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r8)
            return r9
        L46:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    public final synchronized long zzc(long r11) {
            r10 = this;
            monitor-enter(r10)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            monitor-exit(r10)
            return r0
        Lc:
            long r2 = r10.zzc     // Catch: java.lang.Throwable -> L38
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L2e
            long r0 = zzh(r2)     // Catch: java.lang.Throwable -> L38
            r2 = 8589934592(0x200000000, double:4.243991582E-314)
            long r4 = r0 / r2
            java.lang.Long.signum(r4)
            long r6 = r4 * r2
            long r6 = r6 + r11
            r8 = 1
            long r4 = r4 + r8
            long r4 = r4 * r2
            long r11 = r11 + r4
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L2e
            r11 = r6
        L2e:
            long r11 = zzg(r11)     // Catch: java.lang.Throwable -> L38
            long r11 = r10.zza(r11)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r10)
            return r11
        L38:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }

    public final synchronized long zzd() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.zza     // Catch: java.lang.Throwable -> L1f
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
            goto L18
        L16:
            monitor-exit(r5)
            return r0
        L18:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            monitor-exit(r5)
            return r0
        L1f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public final synchronized long zze() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.zzc     // Catch: java.lang.Throwable -> L16
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L10
            long r2 = r5.zzb     // Catch: java.lang.Throwable -> L16
            long r0 = r0 + r2
            goto L14
        L10:
            long r0 = r5.zzd()     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r5)
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public final synchronized long zzf() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.zzb     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized void zzi(long r6) {
            r5 = this;
            monitor-enter(r5)
            r5.zza = r6     // Catch: java.lang.Throwable -> L1b
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L14
            r6 = 0
            goto L15
        L14:
            r6 = r2
        L15:
            r5.zzb = r6     // Catch: java.lang.Throwable -> L1b
            r5.zzc = r2     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r5)
            return
        L1b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public final synchronized boolean zzj() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.zzb     // Catch: java.lang.Throwable -> L11
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            r0 = 1
        Ld:
            monitor-exit(r5)
            return r0
        Lf:
            r0 = 0
            goto Ld
        L11:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }
}
