package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgfu extends java.util.concurrent.locks.AbstractOwnableSynchronizer implements java.lang.Runnable {
    private final com.google.android.gms.internal.ads.zzgfx zza;

    /* synthetic */ zzgfu(com.google.android.gms.internal.ads.zzgfx r1, com.google.android.gms.internal.ads.zzgft r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    static /* synthetic */ void zza(com.google.android.gms.internal.ads.zzgfu r0, java.lang.Thread r1) {
            super.setExclusiveOwnerThread(r1)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r0 = this;
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgfx r0 = r1.zza
            java.lang.String r0 = r0.toString()
            return r0
    }
}
