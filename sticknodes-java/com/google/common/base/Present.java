package com.google.common.base;

/* loaded from: classes2.dex */
final class Present<T> extends com.google.common.base.Optional<T> {
    private final T reference;

    Present(T r1) {
            r0 = this;
            r0.<init>()
            r0.reference = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.base.Present
            if (r0 == 0) goto Lf
            com.google.common.base.Present r2 = (com.google.common.base.Present) r2
            T r0 = r1.reference
            T r2 = r2.reference
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.google.common.base.Optional
    public T get() {
            r1 = this;
            T r0 = r1.reference
            return r0
    }

    public int hashCode() {
            r2 = this;
            T r0 = r2.reference
            int r0 = r0.hashCode()
            r1 = 1502476572(0x598df91c, float:4.9952338E15)
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
            r1 = this;
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            T r0 = r3.reference
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r1 = r1 + 13
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Optional.of("
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
