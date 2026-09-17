package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzges extends com.google.android.gms.internal.ads.zzgep {
    private zzges() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ zzges(com.google.android.gms.internal.ads.zzger r1) {
            r0 = this;
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    final int zza(com.google.android.gms.internal.ads.zzget r2) {
            r1 = this;
            monitor-enter(r2)
            int r0 = com.google.android.gms.internal.ads.zzget.zzz(r2)     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + (-1)
            com.google.android.gms.internal.ads.zzget.zzD(r2, r0)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    final void zzb(com.google.android.gms.internal.ads.zzget r1, java.util.Set r2, java.util.Set r3) {
            r0 = this;
            monitor-enter(r1)
            java.util.Set r2 = com.google.android.gms.internal.ads.zzget.zzB(r1)     // Catch: java.lang.Throwable -> Lc
            if (r2 != 0) goto La
            com.google.android.gms.internal.ads.zzget.zzE(r1, r3)     // Catch: java.lang.Throwable -> Lc
        La:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }
}
