package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeq {
    private long[] zza;
    private java.lang.Object[] zzb;
    private int zzc;
    private int zzd;

    public zzeq() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzeq(int r2) {
            r1 = this;
            r1.<init>()
            r2 = 10
            long[] r0 = new long[r2]
            r1.zza = r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.zzb = r2
            return
    }

    private final java.lang.Object zzf() {
            r5 = this;
            int r0 = r5.zzd
            r1 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            java.lang.Object[] r0 = r5.zzb
            int r2 = r5.zzc
            r3 = r0[r2]
            r4 = 0
            r0[r2] = r4
            int r2 = r2 + r1
            int r0 = r0.length
            int r2 = r2 % r0
            r5.zzc = r2
            int r0 = r5.zzd
            int r0 = r0 + (-1)
            r5.zzd = r0
            return r3
    }

    public final synchronized int zza() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.zzd     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized java.lang.Object zzb() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.zzd     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            r0 = 0
            monitor-exit(r1)
            return r0
        L8:
            java.lang.Object r0 = r1.zzf()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized java.lang.Object zzc(long r7) {
            r6 = this;
            monitor-enter(r6)
            r0 = 0
        L2:
            int r1 = r6.zzd     // Catch: java.lang.Throwable -> L1c
            if (r1 <= 0) goto L1a
            long[] r1 = r6.zza     // Catch: java.lang.Throwable -> L1c
            int r2 = r6.zzc     // Catch: java.lang.Throwable -> L1c
            r2 = r1[r2]     // Catch: java.lang.Throwable -> L1c
            long r1 = r7 - r2
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L15
            goto L1a
        L15:
            java.lang.Object r0 = r6.zzf()     // Catch: java.lang.Throwable -> L1c
            goto L2
        L1a:
            monitor-exit(r6)
            return r0
        L1c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public final synchronized void zzd(long r7, java.lang.Object r9) {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.zzd     // Catch: java.lang.Throwable -> L62
            if (r0 <= 0) goto L19
            int r1 = r6.zzc     // Catch: java.lang.Throwable -> L62
            int r1 = r1 + r0
            java.lang.Object[] r0 = r6.zzb     // Catch: java.lang.Throwable -> L62
            int r1 = r1 + (-1)
            int r0 = r0.length     // Catch: java.lang.Throwable -> L62
            int r1 = r1 % r0
            long[] r0 = r6.zza     // Catch: java.lang.Throwable -> L62
            r1 = r0[r1]     // Catch: java.lang.Throwable -> L62
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L19
            r6.zze()     // Catch: java.lang.Throwable -> L62
        L19:
            java.lang.Object[] r0 = r6.zzb     // Catch: java.lang.Throwable -> L62
            int r0 = r0.length     // Catch: java.lang.Throwable -> L62
            int r1 = r6.zzd     // Catch: java.lang.Throwable -> L62
            if (r1 >= r0) goto L21
            goto L4d
        L21:
            int r1 = r0 + r0
            long[] r2 = new long[r1]     // Catch: java.lang.Throwable -> L62
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L62
            int r3 = r6.zzc     // Catch: java.lang.Throwable -> L62
            int r0 = r0 - r3
            long[] r4 = r6.zza     // Catch: java.lang.Throwable -> L62
            r5 = 0
            java.lang.System.arraycopy(r4, r3, r2, r5, r0)     // Catch: java.lang.Throwable -> L62
            java.lang.Object[] r3 = r6.zzb     // Catch: java.lang.Throwable -> L62
            int r4 = r6.zzc     // Catch: java.lang.Throwable -> L62
            java.lang.System.arraycopy(r3, r4, r1, r5, r0)     // Catch: java.lang.Throwable -> L62
            int r3 = r6.zzc     // Catch: java.lang.Throwable -> L62
            if (r3 <= 0) goto L47
            long[] r4 = r6.zza     // Catch: java.lang.Throwable -> L62
            java.lang.System.arraycopy(r4, r5, r2, r0, r3)     // Catch: java.lang.Throwable -> L62
            java.lang.Object[] r3 = r6.zzb     // Catch: java.lang.Throwable -> L62
            int r4 = r6.zzc     // Catch: java.lang.Throwable -> L62
            java.lang.System.arraycopy(r3, r5, r1, r0, r4)     // Catch: java.lang.Throwable -> L62
        L47:
            r6.zza = r2     // Catch: java.lang.Throwable -> L62
            r6.zzb = r1     // Catch: java.lang.Throwable -> L62
            r6.zzc = r5     // Catch: java.lang.Throwable -> L62
        L4d:
            int r0 = r6.zzc     // Catch: java.lang.Throwable -> L62
            int r1 = r6.zzd     // Catch: java.lang.Throwable -> L62
            int r0 = r0 + r1
            java.lang.Object[] r2 = r6.zzb     // Catch: java.lang.Throwable -> L62
            int r3 = r2.length     // Catch: java.lang.Throwable -> L62
            int r0 = r0 % r3
            long[] r3 = r6.zza     // Catch: java.lang.Throwable -> L62
            r3[r0] = r7     // Catch: java.lang.Throwable -> L62
            r2[r0] = r9     // Catch: java.lang.Throwable -> L62
            int r1 = r1 + 1
            r6.zzd = r1     // Catch: java.lang.Throwable -> L62
            monitor-exit(r6)
            return
        L62:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public final synchronized void zze() {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.zzc = r0     // Catch: java.lang.Throwable -> Le
            r2.zzd = r0     // Catch: java.lang.Throwable -> Le
            java.lang.Object[] r0 = r2.zzb     // Catch: java.lang.Throwable -> Le
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        Le:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
