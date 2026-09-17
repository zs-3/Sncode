package org.apache.commons.lang3.concurrent;

/* loaded from: classes2.dex */
public class CallableBackgroundInitializer<T> extends org.apache.commons.lang3.concurrent.BackgroundInitializer<T> {
    private final java.util.concurrent.Callable<T> callable;

    public CallableBackgroundInitializer(java.util.concurrent.Callable<T> r1) {
            r0 = this;
            r0.<init>()
            r0.checkCallable(r1)
            r0.callable = r1
            return
    }

    public CallableBackgroundInitializer(java.util.concurrent.Callable<T> r1, java.util.concurrent.ExecutorService r2) {
            r0 = this;
            r0.<init>(r2)
            r0.checkCallable(r1)
            r0.callable = r1
            return
    }

    private void checkCallable(java.util.concurrent.Callable<T> r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L5
            r3 = 1
            goto L6
        L5:
            r3 = 0
        L6:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Callable must not be null!"
            org.apache.commons.lang3.Validate.isTrue(r3, r1, r0)
            return
    }

    @Override // org.apache.commons.lang3.concurrent.BackgroundInitializer
    protected T initialize() throws java.lang.Exception {
            r1 = this;
            java.util.concurrent.Callable<T> r0 = r1.callable
            java.lang.Object r0 = r0.call()
            return r0
    }
}
