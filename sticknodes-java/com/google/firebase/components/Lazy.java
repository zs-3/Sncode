package com.google.firebase.components;

/* loaded from: classes2.dex */
public class Lazy<T> implements com.google.firebase.inject.Provider<T> {
    private static final java.lang.Object UNINITIALIZED = null;
    private volatile java.lang.Object instance;
    private volatile com.google.firebase.inject.Provider<T> provider;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.firebase.components.Lazy.UNINITIALIZED = r0
            return
    }

    public Lazy(com.google.firebase.inject.Provider<T> r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.firebase.components.Lazy.UNINITIALIZED
            r1.instance = r0
            r1.provider = r2
            return
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
            r2 = this;
            java.lang.Object r0 = r2.instance
            java.lang.Object r1 = com.google.firebase.components.Lazy.UNINITIALIZED
            if (r0 != r1) goto L1b
            monitor-enter(r2)
            java.lang.Object r0 = r2.instance     // Catch: java.lang.Throwable -> L18
            if (r0 != r1) goto L16
            com.google.firebase.inject.Provider<T> r0 = r2.provider     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L18
            r2.instance = r0     // Catch: java.lang.Throwable -> L18
            r1 = 0
            r2.provider = r1     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
        L1b:
            return r0
    }
}
