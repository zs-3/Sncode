package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzget extends com.google.android.gms.internal.ads.zzgec.zzi {
    private static final com.google.android.gms.internal.ads.zzgep zzbd = null;
    private static final com.google.android.gms.internal.ads.zzgfy zzbe = null;
    private volatile int remaining;
    private volatile java.util.Set<java.lang.Throwable> seenExceptions;

    static {
            com.google.android.gms.internal.ads.zzgfy r0 = new com.google.android.gms.internal.ads.zzgfy
            java.lang.Class<com.google.android.gms.internal.ads.zzget> r1 = com.google.android.gms.internal.ads.zzget.class
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzget.zzbe = r0
            r0 = 0
            com.google.android.gms.internal.ads.zzgeq r1 = new com.google.android.gms.internal.ads.zzgeq     // Catch: java.lang.Throwable -> L23
            java.lang.Class<com.google.android.gms.internal.ads.zzget> r2 = com.google.android.gms.internal.ads.zzget.class
            java.lang.Class<java.util.Set> r3 = java.util.Set.class
            java.lang.String r4 = "seenExceptions"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r3, r4)     // Catch: java.lang.Throwable -> L23
            java.lang.Class<com.google.android.gms.internal.ads.zzget> r3 = com.google.android.gms.internal.ads.zzget.class
            java.lang.String r4 = "remaining"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r3, r4)     // Catch: java.lang.Throwable -> L23
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L23
            r8 = r0
            goto L2b
        L23:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzges r2 = new com.google.android.gms.internal.ads.zzges
            r2.<init>(r0)
            r8 = r1
            r1 = r2
        L2b:
            com.google.android.gms.internal.ads.zzget.zzbd = r1
            if (r8 == 0) goto L40
            com.google.android.gms.internal.ads.zzgfy r0 = com.google.android.gms.internal.ads.zzget.zzbe
            java.util.logging.Logger r3 = r0.zza()
            java.util.logging.Level r4 = java.util.logging.Level.SEVERE
            java.lang.String r5 = "com.google.common.util.concurrent.AggregateFutureState"
            java.lang.String r6 = "<clinit>"
            java.lang.String r7 = "SafeAtomicHelper is broken!"
            r3.logp(r4, r5, r6, r7, r8)
        L40:
            return
    }

    zzget(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.seenExceptions = r0
            r1.remaining = r2
            return
    }

    static /* bridge */ /* synthetic */ java.util.Set zzB(com.google.android.gms.internal.ads.zzget r0) {
            java.util.Set<java.lang.Throwable> r0 = r0.seenExceptions
            return r0
    }

    static /* bridge */ /* synthetic */ void zzD(com.google.android.gms.internal.ads.zzget r0, int r1) {
            r0.remaining = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzE(com.google.android.gms.internal.ads.zzget r0, java.util.Set r1) {
            r0.seenExceptions = r1
            return
    }

    static /* bridge */ /* synthetic */ int zzz(com.google.android.gms.internal.ads.zzget r0) {
            int r0 = r0.remaining
            return r0
    }

    final int zzA() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgep r0 = com.google.android.gms.internal.ads.zzget.zzbd
            int r0 = r0.zza(r1)
            return r0
    }

    final java.util.Set zzC() {
            r3 = this;
            java.util.Set<java.lang.Throwable> r0 = r3.seenExceptions
            if (r0 != 0) goto L1d
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r3.zze(r0)
            com.google.android.gms.internal.ads.zzgep r1 = com.google.android.gms.internal.ads.zzget.zzbd
            r2 = 0
            r1.zzb(r3, r2, r0)
            java.util.Set<java.lang.Throwable> r0 = r3.seenExceptions
            java.util.Objects.requireNonNull(r0)
            java.util.Set r0 = (java.util.Set) r0
        L1d:
            return r0
    }

    final void zzF() {
            r1 = this;
            r0 = 0
            r1.seenExceptions = r0
            return
    }

    abstract void zze(java.util.Set r1);
}
