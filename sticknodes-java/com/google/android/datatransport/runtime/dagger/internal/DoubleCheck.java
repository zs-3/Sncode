package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public final class DoubleCheck<T> implements javax.inject.Provider<T>, com.google.android.datatransport.runtime.dagger.Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.Object UNINITIALIZED = null;
    private volatile java.lang.Object instance;
    private volatile javax.inject.Provider<T> provider;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.UNINITIALIZED = r0
            return
    }

    private DoubleCheck(javax.inject.Provider<T> r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.UNINITIALIZED
            r1.instance = r0
            r1.provider = r2
            return
    }

    public static <P extends javax.inject.Provider<T>, T> com.google.android.datatransport.runtime.dagger.Lazy<T> lazy(P r1) {
            boolean r0 = r1 instanceof com.google.android.datatransport.runtime.dagger.Lazy
            if (r0 == 0) goto L7
            com.google.android.datatransport.runtime.dagger.Lazy r1 = (com.google.android.datatransport.runtime.dagger.Lazy) r1
            return r1
        L7:
            com.google.android.datatransport.runtime.dagger.internal.DoubleCheck r0 = new com.google.android.datatransport.runtime.dagger.internal.DoubleCheck
            java.lang.Object r1 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r1)
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            r0.<init>(r1)
            return r0
    }

    public static <P extends javax.inject.Provider<T>, T> javax.inject.Provider<T> provider(P r1) {
            com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r1)
            boolean r0 = r1 instanceof com.google.android.datatransport.runtime.dagger.internal.DoubleCheck
            if (r0 == 0) goto L8
            return r1
        L8:
            com.google.android.datatransport.runtime.dagger.internal.DoubleCheck r0 = new com.google.android.datatransport.runtime.dagger.internal.DoubleCheck
            r0.<init>(r1)
            return r0
    }

    private static java.lang.Object reentrantCheck(java.lang.Object r3, java.lang.Object r4) {
            java.lang.Object r0 = com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.UNINITIALIZED
            if (r3 == r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto L30
            if (r3 != r4) goto Lc
            goto L30
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Scoped provider was invoked recursively returning different results: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " & "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ". This is likely due to a circular dependency."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L30:
            return r4
    }

    @Override // javax.inject.Provider
    public T get() {
            r2 = this;
            java.lang.Object r0 = r2.instance
            java.lang.Object r1 = com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.UNINITIALIZED
            if (r0 != r1) goto L21
            monitor-enter(r2)
            java.lang.Object r0 = r2.instance     // Catch: java.lang.Throwable -> L1e
            if (r0 != r1) goto L1c
            javax.inject.Provider<T> r0 = r2.provider     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r2.instance     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = reentrantCheck(r1, r0)     // Catch: java.lang.Throwable -> L1e
            r2.instance = r1     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            r2.provider = r1     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r0
        L21:
            return r0
    }
}
