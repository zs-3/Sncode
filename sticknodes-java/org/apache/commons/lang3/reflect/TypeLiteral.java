package org.apache.commons.lang3.reflect;

/* loaded from: classes2.dex */
public abstract class TypeLiteral<T> implements org.apache.commons.lang3.reflect.Typed<T> {
    private static final java.lang.reflect.TypeVariable<java.lang.Class<org.apache.commons.lang3.reflect.TypeLiteral>> T = null;
    private final java.lang.String toString;
    public final java.lang.reflect.Type value;

    static {
            java.lang.Class<org.apache.commons.lang3.reflect.TypeLiteral> r0 = org.apache.commons.lang3.reflect.TypeLiteral.class
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            r1 = 0
            r0 = r0[r1]
            org.apache.commons.lang3.reflect.TypeLiteral.T = r0
            return
    }

    protected TypeLiteral() {
            r7 = this;
            java.lang.Class<org.apache.commons.lang3.reflect.TypeLiteral> r0 = org.apache.commons.lang3.reflect.TypeLiteral.class
            r7.<init>()
            java.lang.Class r1 = r7.getClass()
            java.util.Map r1 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(r1, r0)
            java.lang.reflect.TypeVariable<java.lang.Class<org.apache.commons.lang3.reflect.TypeLiteral>> r2 = org.apache.commons.lang3.reflect.TypeLiteral.T
            java.lang.Object r1 = r1.get(r2)
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Class r5 = r7.getClass()
            r6 = 0
            r4[r6] = r5
            java.lang.String r2 = org.apache.commons.lang3.reflect.TypeUtils.toLongString(r2)
            r5 = 1
            r4[r5] = r2
            java.lang.String r2 = "%s does not assign type parameter %s"
            java.lang.Object r1 = org.apache.commons.lang3.Validate.notNull(r1, r2, r4)
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            r7.value = r1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getSimpleName()
            r2[r6] = r0
            java.lang.String r0 = org.apache.commons.lang3.reflect.TypeUtils.toString(r1)
            r2[r5] = r0
            java.lang.String r0 = "%s<%s>"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r7.toString = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof org.apache.commons.lang3.reflect.TypeLiteral
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            org.apache.commons.lang3.reflect.TypeLiteral r2 = (org.apache.commons.lang3.reflect.TypeLiteral) r2
            java.lang.reflect.Type r0 = r1.value
            java.lang.reflect.Type r2 = r2.value
            boolean r2 = org.apache.commons.lang3.reflect.TypeUtils.equals(r0, r2)
            return r2
    }

    @Override // org.apache.commons.lang3.reflect.Typed
    public java.lang.reflect.Type getType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.value
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.value
            int r0 = r0.hashCode()
            r0 = r0 | 592(0x250, float:8.3E-43)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toString
            return r0
    }
}
