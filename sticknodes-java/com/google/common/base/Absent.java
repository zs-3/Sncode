package com.google.common.base;

/* loaded from: classes2.dex */
final class Absent<T> extends com.google.common.base.Optional<T> {
    static final com.google.common.base.Absent<java.lang.Object> INSTANCE = null;

    static {
            com.google.common.base.Absent r0 = new com.google.common.base.Absent
            r0.<init>()
            com.google.common.base.Absent.INSTANCE = r0
            return
    }

    private Absent() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> com.google.common.base.Optional<T> withType() {
            com.google.common.base.Absent<java.lang.Object> r0 = com.google.common.base.Absent.INSTANCE
            return r0
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    @Override // com.google.common.base.Optional
    public T get() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Optional.get() cannot be called on an absent value"
            r0.<init>(r1)
            throw r0
    }

    public int hashCode() {
            r1 = this;
            r0 = 2040732332(0x79a31aac, float:1.0586067E35)
            return r0
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Optional.absent()"
            return r0
    }
}
