package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgeq extends com.google.android.gms.internal.ads.zzgep {
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zza;
    final java.util.concurrent.atomic.AtomicIntegerFieldUpdater zzb;

    zzgeq(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.zza = r2
            r1.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    final int zza(com.google.android.gms.internal.ads.zzget r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = r1.zzb
            int r2 = r0.decrementAndGet(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    final void zzb(com.google.android.gms.internal.ads.zzget r2, java.util.Set r3, java.util.Set r4) {
            r1 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = r1.zza
            r0 = 0
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r2, r0, r4)
            if (r0 == 0) goto La
            goto L10
        La:
            java.lang.Object r3 = r3.get(r2)
            if (r3 == 0) goto L0
        L10:
            return
    }
}
