package org.apache.commons.lang3.builder;

/* loaded from: classes2.dex */
public abstract class Diff<T> extends org.apache.commons.lang3.tuple.Pair<T, T> {
    private static final long serialVersionUID = 1;
    private final java.lang.String fieldName;
    private final java.lang.reflect.Type type;

    protected Diff(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<org.apache.commons.lang3.builder.Diff> r1 = org.apache.commons.lang3.builder.Diff.class
            java.util.Map r0 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(r0, r1)
            java.lang.Class<org.apache.commons.lang3.builder.Diff> r1 = org.apache.commons.lang3.builder.Diff.class
            java.lang.reflect.TypeVariable[] r1 = r1.getTypeParameters()
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = r0.get(r1)
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object r0 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(r0, r1)
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            r3.type = r0
            r3.fieldName = r4
            return
    }

    public final java.lang.String getFieldName() {
            r1 = this;
            java.lang.String r0 = r1.fieldName
            return r0
    }

    public final java.lang.reflect.Type getType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            return r0
    }

    @Override // java.util.Map.Entry
    public final T setValue(T r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Cannot alter Diff object."
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public final java.lang.String toString() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.fieldName
            r2 = 0
            r0[r2] = r1
            java.lang.Object r1 = r3.getLeft()
            r2 = 1
            r0[r2] = r1
            java.lang.Object r1 = r3.getRight()
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "[%s: %s, %s]"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
