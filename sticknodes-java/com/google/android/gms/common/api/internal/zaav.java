package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
abstract class zaav implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zab;

    /* synthetic */ zaav(com.google.android.gms.common.api.internal.zaaw r1, com.google.android.gms.common.api.internal.zaau r2) {
            r0 = this;
            r0.zab = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaw r0 = r2.zab
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            r0.lock()
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L13 java.lang.RuntimeException -> L15
            if (r0 != 0) goto L1f
            r2.zaa()     // Catch: java.lang.Throwable -> L13 java.lang.RuntimeException -> L15
            goto L1f
        L13:
            r0 = move-exception
            goto L29
        L15:
            r0 = move-exception
            com.google.android.gms.common.api.internal.zaaw r1 = r2.zab     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.common.api.internal.zabi r1 = com.google.android.gms.common.api.internal.zaaw.zak(r1)     // Catch: java.lang.Throwable -> L13
            r1.zam(r0)     // Catch: java.lang.Throwable -> L13
        L1f:
            com.google.android.gms.common.api.internal.zaaw r0 = r2.zab
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            r0.unlock()
            return
        L29:
            com.google.android.gms.common.api.internal.zaaw r1 = r2.zab
            java.util.concurrent.locks.Lock r1 = com.google.android.gms.common.api.internal.zaaw.zap(r1)
            r1.unlock()
            throw r0
    }

    protected abstract void zaa();
}
