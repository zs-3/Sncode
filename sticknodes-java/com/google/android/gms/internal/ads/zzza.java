package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzza {
    private int zza;
    private int zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzyt[] zzd;

    public zzza(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zzc = r1
            r1 = 100
            com.google.android.gms.internal.ads.zzyt[] r1 = new com.google.android.gms.internal.ads.zzyt[r1]
            r0.zzd = r1
            return
    }

    public final synchronized int zza() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.zzb     // Catch: java.lang.Throwable -> L9
            r1 = 65536(0x10000, float:9.18355E-41)
            int r0 = r0 * r1
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzyt zzb() {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.zzb     // Catch: java.lang.Throwable -> L38
            int r0 = r0 + 1
            r4.zzb = r0     // Catch: java.lang.Throwable -> L38
            int r0 = r4.zzc     // Catch: java.lang.Throwable -> L38
            if (r0 <= 0) goto L1a
            com.google.android.gms.internal.ads.zzyt[] r1 = r4.zzd     // Catch: java.lang.Throwable -> L38
            int r0 = r0 + (-1)
            r4.zzc = r0     // Catch: java.lang.Throwable -> L38
            r2 = r1[r0]     // Catch: java.lang.Throwable -> L38
            java.util.Objects.requireNonNull(r2)
            r3 = 0
            r1[r0] = r3     // Catch: java.lang.Throwable -> L38
            goto L2b
        L1a:
            com.google.android.gms.internal.ads.zzyt r2 = new com.google.android.gms.internal.ads.zzyt     // Catch: java.lang.Throwable -> L38
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L38
            int r0 = r4.zzb     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzyt[] r1 = r4.zzd     // Catch: java.lang.Throwable -> L38
            int r3 = r1.length     // Catch: java.lang.Throwable -> L38
            if (r0 > r3) goto L2d
        L2b:
            monitor-exit(r4)
            return r2
        L2d:
            int r3 = r3 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzyt[] r0 = (com.google.android.gms.internal.ads.zzyt[]) r0     // Catch: java.lang.Throwable -> L38
            r4.zzd = r0     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)
            return r2
        L38:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    public final synchronized void zzc(com.google.android.gms.internal.ads.zzyt r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzyt[] r0 = r3.zzd     // Catch: java.lang.Throwable -> L16
            int r1 = r3.zzc     // Catch: java.lang.Throwable -> L16
            int r2 = r1 + 1
            r3.zzc = r2     // Catch: java.lang.Throwable -> L16
            r0[r1] = r4     // Catch: java.lang.Throwable -> L16
            int r4 = r3.zzb     // Catch: java.lang.Throwable -> L16
            int r4 = r4 + (-1)
            r3.zzb = r4     // Catch: java.lang.Throwable -> L16
            r3.notifyAll()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r3)
            return
        L16:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zzd(com.google.android.gms.internal.ads.zzyu r4) {
            r3 = this;
            monitor-enter(r3)
        L1:
            if (r4 == 0) goto L1c
            com.google.android.gms.internal.ads.zzyt[] r0 = r3.zzd     // Catch: java.lang.Throwable -> L21
            int r1 = r3.zzc     // Catch: java.lang.Throwable -> L21
            int r2 = r1 + 1
            r3.zzc = r2     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.ads.zzyt r2 = r4.zzc()     // Catch: java.lang.Throwable -> L21
            r0[r1] = r2     // Catch: java.lang.Throwable -> L21
            int r0 = r3.zzb     // Catch: java.lang.Throwable -> L21
            int r0 = r0 + (-1)
            r3.zzb = r0     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.ads.zzyu r4 = r4.zzd()     // Catch: java.lang.Throwable -> L21
            goto L1
        L1c:
            r3.notifyAll()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r3)
            return
        L21:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zze() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.zzf(r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void zzf(int r2) {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.zza     // Catch: java.lang.Throwable -> Le
            r1.zza = r2     // Catch: java.lang.Throwable -> Le
            if (r2 >= r0) goto Lc
            r1.zzg()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Lc:
            monitor-exit(r1)
            return
        Le:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzg() {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            int r1 = r4.zza     // Catch: java.lang.Throwable -> L24
            int r2 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L24
            r2 = 65535(0xffff, float:9.1834E-41)
            int r1 = r1 + r2
            r2 = 65536(0x10000, float:9.18355E-41)
            int r1 = r1 / r2
            int r2 = r4.zzb     // Catch: java.lang.Throwable -> L24
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> L24
            int r1 = r4.zzc     // Catch: java.lang.Throwable -> L24
            if (r0 < r1) goto L1a
            monitor-exit(r4)
            return
        L1a:
            com.google.android.gms.internal.ads.zzyt[] r2 = r4.zzd     // Catch: java.lang.Throwable -> L24
            r3 = 0
            java.util.Arrays.fill(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L24
            r4.zzc = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r4)
            return
        L24:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
