package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgfx extends java.util.concurrent.atomic.AtomicReference implements java.lang.Runnable {
    private static final java.lang.Runnable zza = null;
    private static final java.lang.Runnable zzb = null;

    static {
            com.google.android.gms.internal.ads.zzgfw r0 = new com.google.android.gms.internal.ads.zzgfw
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgfx.zza = r0
            com.google.android.gms.internal.ads.zzgfw r0 = new com.google.android.gms.internal.ads.zzgfw
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgfx.zzb = r0
            return
    }

    zzgfx() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void zzc(java.lang.Thread r8) {
            r7 = this;
            java.lang.Object r0 = r7.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        La:
            boolean r5 = r0 instanceof com.google.android.gms.internal.ads.zzgfu
            if (r5 != 0) goto L19
            java.lang.Runnable r5 = com.google.android.gms.internal.ads.zzgfx.zzb
            if (r0 != r5) goto L13
            goto L1c
        L13:
            if (r3 == 0) goto L18
            r8.interrupt()
        L18:
            return
        L19:
            r2 = r0
            com.google.android.gms.internal.ads.zzgfu r2 = (com.google.android.gms.internal.ads.zzgfu) r2
        L1c:
            r5 = 1
            int r4 = r4 + r5
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 <= r6) goto L3c
            java.lang.Runnable r6 = com.google.android.gms.internal.ads.zzgfx.zzb
            if (r0 == r6) goto L2c
            boolean r0 = r7.compareAndSet(r0, r6)
            if (r0 == 0) goto L3f
        L2c:
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L37
            if (r3 == 0) goto L35
            goto L37
        L35:
            r3 = 0
            goto L38
        L37:
            r3 = 1
        L38:
            java.util.concurrent.locks.LockSupport.park(r2)
            goto L3f
        L3c:
            java.lang.Thread.yield()
        L3f:
            java.lang.Object r0 = r7.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            goto La
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = 0
            boolean r2 = r4.compareAndSet(r1, r0)
            if (r2 != 0) goto Lc
            goto L4d
        Lc:
            boolean r2 = r4.zzg()
            r2 = r2 ^ 1
            if (r2 == 0) goto L3d
            java.lang.Object r1 = r4.zza()     // Catch: java.lang.Throwable -> L19
            goto L3d
        L19:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzggg.zza(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.Runnable r1 = com.google.android.gms.internal.ads.zzgfx.zza
            boolean r1 = r4.compareAndSet(r0, r1)
            if (r1 != 0) goto L28
            r4.zzc(r0)
        L28:
            r4.zzd(r2)
            return
        L2c:
            r2 = move-exception
            java.lang.Runnable r3 = com.google.android.gms.internal.ads.zzgfx.zza
            boolean r3 = r4.compareAndSet(r0, r3)
            if (r3 == 0) goto L36
            goto L39
        L36:
            r4.zzc(r0)
        L39:
            r4.zze(r1)
            throw r2
        L3d:
            java.lang.Runnable r3 = com.google.android.gms.internal.ads.zzgfx.zza
            boolean r3 = r4.compareAndSet(r0, r3)
            if (r3 != 0) goto L48
            r4.zzc(r0)
        L48:
            if (r2 == 0) goto L4d
            r4.zze(r1)
        L4d:
            return
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Runnable r1 = com.google.android.gms.internal.ads.zzgfx.zza
            if (r0 != r1) goto Ld
            java.lang.String r0 = "running=[DONE]"
            goto L37
        Ld:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgfu
            if (r1 == 0) goto L14
            java.lang.String r0 = "running=[INTERRUPTED]"
            goto L37
        L14:
            boolean r1 = r0 instanceof java.lang.Thread
            if (r1 == 0) goto L35
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "running=[RUNNING ON "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L37
        L35:
            java.lang.String r0 = "running=[NOT STARTED YET]"
        L37:
            java.lang.String r1 = r3.zzb()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }

    abstract java.lang.Object zza() throws java.lang.Exception;

    abstract java.lang.String zzb();

    abstract void zzd(java.lang.Throwable r1);

    abstract void zze(java.lang.Object r1);

    abstract boolean zzg();

    final void zzh() {
            r4 = this;
            java.lang.Object r0 = r4.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            boolean r1 = r0 instanceof java.lang.Thread
            if (r1 == 0) goto L47
            com.google.android.gms.internal.ads.zzgfu r1 = new com.google.android.gms.internal.ads.zzgfu
            r2 = 0
            r1.<init>(r4, r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            com.google.android.gms.internal.ads.zzgfu.zza(r1, r2)
            boolean r1 = r4.compareAndSet(r0, r1)
            if (r1 == 0) goto L47
            r1 = r0
            java.lang.Thread r1 = (java.lang.Thread) r1     // Catch: java.lang.Throwable -> L33
            r1.interrupt()     // Catch: java.lang.Throwable -> L33
            java.lang.Runnable r0 = com.google.android.gms.internal.ads.zzgfx.zza
            java.lang.Object r0 = r4.getAndSet(r0)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Runnable r2 = com.google.android.gms.internal.ads.zzgfx.zzb
            if (r0 != r2) goto L47
            java.util.concurrent.locks.LockSupport.unpark(r1)
            return
        L33:
            r1 = move-exception
            java.lang.Runnable r2 = com.google.android.gms.internal.ads.zzgfx.zza
            java.lang.Object r2 = r4.getAndSet(r2)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.Runnable r3 = com.google.android.gms.internal.ads.zzgfx.zzb
            if (r2 == r3) goto L41
            goto L46
        L41:
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L46:
            throw r1
        L47:
            return
    }
}
