package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
abstract class zabg {
    private final com.google.android.gms.common.api.internal.zabf zaa;

    protected zabg(com.google.android.gms.common.api.internal.zabf r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    protected abstract void zaa();

    public final void zab(com.google.android.gms.common.api.internal.zabi r3) {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zabi.zah(r3)
            r0.lock()
            com.google.android.gms.common.api.internal.zabf r0 = com.google.android.gms.common.api.internal.zabi.zag(r3)     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.common.api.internal.zabf r1 = r2.zaa     // Catch: java.lang.Throwable -> L1a
            if (r0 != r1) goto L12
            r2.zaa()     // Catch: java.lang.Throwable -> L1a
        L12:
            java.util.concurrent.locks.Lock r3 = com.google.android.gms.common.api.internal.zabi.zah(r3)
            r3.unlock()
            return
        L1a:
            r0 = move-exception
            java.util.concurrent.locks.Lock r3 = com.google.android.gms.common.api.internal.zabi.zah(r3)
            r3.unlock()
            throw r0
    }
}
