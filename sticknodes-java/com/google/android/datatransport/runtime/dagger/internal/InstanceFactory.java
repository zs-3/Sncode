package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public final class InstanceFactory<T> implements com.google.android.datatransport.runtime.dagger.internal.Factory<T>, com.google.android.datatransport.runtime.dagger.Lazy<T> {
    private static final com.google.android.datatransport.runtime.dagger.internal.InstanceFactory<java.lang.Object> NULL_INSTANCE_FACTORY = null;
    private final T instance;

    static {
            com.google.android.datatransport.runtime.dagger.internal.InstanceFactory r0 = new com.google.android.datatransport.runtime.dagger.internal.InstanceFactory
            r1 = 0
            r0.<init>(r1)
            com.google.android.datatransport.runtime.dagger.internal.InstanceFactory.NULL_INSTANCE_FACTORY = r0
            return
    }

    private InstanceFactory(T r1) {
            r0 = this;
            r0.<init>()
            r0.instance = r1
            return
    }

    public static <T> com.google.android.datatransport.runtime.dagger.internal.Factory<T> create(T r2) {
            com.google.android.datatransport.runtime.dagger.internal.InstanceFactory r0 = new com.google.android.datatransport.runtime.dagger.internal.InstanceFactory
            java.lang.String r1 = "instance cannot be null"
            java.lang.Object r2 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r2, r1)
            r0.<init>(r2)
            return r0
    }

    public static <T> com.google.android.datatransport.runtime.dagger.internal.Factory<T> createNullable(T r1) {
            if (r1 != 0) goto L7
            com.google.android.datatransport.runtime.dagger.internal.InstanceFactory r1 = nullInstanceFactory()
            goto Ld
        L7:
            com.google.android.datatransport.runtime.dagger.internal.InstanceFactory r0 = new com.google.android.datatransport.runtime.dagger.internal.InstanceFactory
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }

    private static <T> com.google.android.datatransport.runtime.dagger.internal.InstanceFactory<T> nullInstanceFactory() {
            com.google.android.datatransport.runtime.dagger.internal.InstanceFactory<java.lang.Object> r0 = com.google.android.datatransport.runtime.dagger.internal.InstanceFactory.NULL_INSTANCE_FACTORY
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public T get() {
            r1 = this;
            T r0 = r1.instance
            return r0
    }
}
