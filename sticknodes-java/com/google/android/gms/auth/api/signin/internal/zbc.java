package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbc extends androidx.loader.content.AsyncTaskLoader implements com.google.android.gms.common.api.internal.SignInConnectionListener {
    private final java.util.concurrent.Semaphore zba;
    private final java.util.Set zbb;

    public zbc(android.content.Context r2, java.util.Set r3) {
            r1 = this;
            r1.<init>(r2)
            java.util.concurrent.Semaphore r2 = new java.util.concurrent.Semaphore
            r0 = 0
            r2.<init>(r0)
            r1.zba = r2
            r1.zbb = r3
            return
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final /* bridge */ /* synthetic */ java.lang.Object loadInBackground() {
            r5 = this;
            java.util.Set r0 = r5.zbb
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r0.next()
            com.google.android.gms.common.api.GoogleApiClient r2 = (com.google.android.gms.common.api.GoogleApiClient) r2
            boolean r2 = r2.maybeSignIn(r5)
            if (r2 == 0) goto L7
            int r1 = r1 + 1
            goto L7
        L1c:
            java.util.concurrent.Semaphore r0 = r5.zba     // Catch: java.lang.InterruptedException -> L26
            r2 = 5
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L26
            r0.tryAcquire(r1, r2, r4)     // Catch: java.lang.InterruptedException -> L26
            goto L35
        L26:
            r0 = move-exception
            java.lang.String r1 = "GACSignInLoader"
            java.lang.String r2 = "Unexpected InterruptedException"
            android.util.Log.i(r1, r2, r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L35:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
            r1 = this;
            java.util.concurrent.Semaphore r0 = r1.zba
            r0.release()
            return
    }

    @Override // androidx.loader.content.Loader
    protected final void onStartLoading() {
            r1 = this;
            java.util.concurrent.Semaphore r0 = r1.zba
            r0.drainPermits()
            r1.forceLoad()
            return
    }
}
