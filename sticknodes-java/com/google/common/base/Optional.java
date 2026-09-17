package com.google.common.base;

/* loaded from: classes2.dex */
public abstract class Optional<T> implements java.io.Serializable {
    Optional() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> com.google.common.base.Optional<T> absent() {
            com.google.common.base.Optional r0 = com.google.common.base.Absent.withType()
            return r0
    }

    public static <T> com.google.common.base.Optional<T> of(T r1) {
            com.google.common.base.Present r0 = new com.google.common.base.Present
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            r0.<init>(r1)
            return r0
    }

    public abstract T get();

    public abstract boolean isPresent();
}
