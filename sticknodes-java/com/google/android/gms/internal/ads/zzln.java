package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzln {
    private final com.google.android.gms.internal.ads.zzlm zza;
    private final com.google.android.gms.internal.ads.zzll zzb;
    private final com.google.android.gms.internal.ads.zzcc zzc;
    private int zzd;
    private java.lang.Object zze;
    private final android.os.Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    public zzln(com.google.android.gms.internal.ads.zzll r1, com.google.android.gms.internal.ads.zzlm r2, com.google.android.gms.internal.ads.zzcc r3, int r4, com.google.android.gms.internal.ads.zzdj r5, android.os.Looper r6) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zza = r2
            r0.zzc = r3
            r0.zzf = r6
            r0.zzg = r4
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    public final android.os.Looper zzb() {
            r1 = this;
            android.os.Looper r0 = r1.zzf
            return r0
    }

    public final com.google.android.gms.internal.ads.zzlm zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzlm r0 = r1.zza
            return r0
    }

    public final com.google.android.gms.internal.ads.zzln zzd() {
            r2 = this;
            boolean r0 = r2.zzh
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r2.zzh = r1
            com.google.android.gms.internal.ads.zzll r0 = r2.zzb
            r0.zzl(r2)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzln zze(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.zzh
            r0 = r0 ^ 1
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r1.zze = r2
            return r1
    }

    public final com.google.android.gms.internal.ads.zzln zzf(int r2) {
            r1 = this;
            boolean r0 = r1.zzh
            r0 = r0 ^ 1
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r1.zzd = r2
            return r1
    }

    public final java.lang.Object zzg() {
            r1 = this;
            java.lang.Object r0 = r1.zze
            return r0
    }

    public final synchronized void zzh(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzi     // Catch: java.lang.Throwable -> Le
            r2 = r2 | r0
            r1.zzi = r2     // Catch: java.lang.Throwable -> Le
            r2 = 1
            r1.zzj = r2     // Catch: java.lang.Throwable -> Le
            r1.notifyAll()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized boolean zzi(long r6) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.zzh     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzdi.zzf(r0)     // Catch: java.lang.Throwable -> L3d
            android.os.Looper r0 = r5.zzf     // Catch: java.lang.Throwable -> L3d
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L3d
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3d
            if (r0 == r1) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)     // Catch: java.lang.Throwable -> L3d
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L3d
            long r0 = r0 + r6
        L1d:
            boolean r2 = r5.zzj     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L39
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L31
            r5.wait(r6)     // Catch: java.lang.Throwable -> L3d
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L3d
            long r6 = r0 - r6
            goto L1d
        L31:
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r7 = "Message delivery timed out."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L3d
            throw r6     // Catch: java.lang.Throwable -> L3d
        L39:
            boolean r6 = r5.zzi     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)
            return r6
        L3d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public final synchronized boolean zzj() {
            r1 = this;
            monitor-enter(r1)
            monitor-exit(r1)
            r0 = 0
            return r0
    }
}
