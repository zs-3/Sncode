package com.google.firebase.components;

/* loaded from: classes2.dex */
class LazySet<T> implements com.google.firebase.inject.Provider<java.util.Set<T>> {
    private volatile java.util.Set<T> actualSet;
    private volatile java.util.Set<com.google.firebase.inject.Provider<T>> providers;

    LazySet(java.util.Collection<com.google.firebase.inject.Provider<T>> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.actualSet = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.providers = r0
            java.util.Set<com.google.firebase.inject.Provider<T>> r0 = r1.providers
            r0.addAll(r2)
            return
    }

    static com.google.firebase.components.LazySet<?> fromCollection(java.util.Collection<com.google.firebase.inject.Provider<?>> r1) {
            java.util.Set r1 = (java.util.Set) r1
            com.google.firebase.components.LazySet r0 = new com.google.firebase.components.LazySet
            r0.<init>(r1)
            return r0
    }

    private synchronized void updateSet() {
            r3 = this;
            monitor-enter(r3)
            java.util.Set<com.google.firebase.inject.Provider<T>> r0 = r3.providers     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L22
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L22
            com.google.firebase.inject.Provider r1 = (com.google.firebase.inject.Provider) r1     // Catch: java.lang.Throwable -> L22
            java.util.Set<T> r2 = r3.actualSet     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L22
            r2.add(r1)     // Catch: java.lang.Throwable -> L22
            goto L7
        L1d:
            r0 = 0
            r3.providers = r0     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)
            return
        L22:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    synchronized void add(com.google.firebase.inject.Provider<T> r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<T> r0 = r1.actualSet     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto Lb
            java.util.Set<com.google.firebase.inject.Provider<T>> r0 = r1.providers     // Catch: java.lang.Throwable -> L16
            r0.add(r2)     // Catch: java.lang.Throwable -> L16
            goto L14
        Lb:
            java.util.Set<T> r0 = r1.actualSet     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L16
            r0.add(r2)     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r1)
            return
        L16:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.firebase.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            java.util.Set r0 = r1.get()
            return r0
    }

    @Override // com.google.firebase.inject.Provider
    public java.util.Set<T> get() {
            r1 = this;
            java.util.Set<T> r0 = r1.actualSet
            if (r0 != 0) goto L1c
            monitor-enter(r1)
            java.util.Set<T> r0 = r1.actualSet     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L17
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)     // Catch: java.lang.Throwable -> L19
            r1.actualSet = r0     // Catch: java.lang.Throwable -> L19
            r1.updateSet()     // Catch: java.lang.Throwable -> L19
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r0
        L1c:
            java.util.Set<T> r0 = r1.actualSet
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }
}
