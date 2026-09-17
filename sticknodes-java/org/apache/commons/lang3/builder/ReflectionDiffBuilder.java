package org.apache.commons.lang3.builder;

/* loaded from: classes2.dex */
public class ReflectionDiffBuilder implements org.apache.commons.lang3.builder.Builder<org.apache.commons.lang3.builder.DiffResult> {
    private final org.apache.commons.lang3.builder.DiffBuilder diffBuilder;
    private final java.lang.Object left;
    private final java.lang.Object right;

    public <T> ReflectionDiffBuilder(T r2, T r3, org.apache.commons.lang3.builder.ToStringStyle r4) {
            r1 = this;
            r1.<init>()
            r1.left = r2
            r1.right = r3
            org.apache.commons.lang3.builder.DiffBuilder r0 = new org.apache.commons.lang3.builder.DiffBuilder
            r0.<init>(r2, r3, r4)
            r1.diffBuilder = r0
            return
    }

    private boolean accept(java.lang.reflect.Field r4) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            r1 = 36
            int r0 = r0.indexOf(r1)
            r1 = 0
            r2 = -1
            if (r0 == r2) goto Lf
            return r1
        Lf:
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isTransient(r0)
            if (r0 == 0) goto L1a
            return r1
        L1a:
            int r4 = r4.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            r4 = r4 ^ 1
            return r4
    }

    private void appendFields(java.lang.Class<?> r9) {
            r8 = this;
            java.lang.reflect.Field[] r9 = org.apache.commons.lang3.reflect.FieldUtils.getAllFields(r9)
            int r0 = r9.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L46
            r2 = r9[r1]
            boolean r3 = r8.accept(r2)
            if (r3 == 0) goto L43
            org.apache.commons.lang3.builder.DiffBuilder r3 = r8.diffBuilder     // Catch: java.lang.IllegalAccessException -> L27
            java.lang.String r4 = r2.getName()     // Catch: java.lang.IllegalAccessException -> L27
            java.lang.Object r5 = r8.left     // Catch: java.lang.IllegalAccessException -> L27
            r6 = 1
            java.lang.Object r5 = org.apache.commons.lang3.reflect.FieldUtils.readField(r2, r5, r6)     // Catch: java.lang.IllegalAccessException -> L27
            java.lang.Object r7 = r8.right     // Catch: java.lang.IllegalAccessException -> L27
            java.lang.Object r2 = org.apache.commons.lang3.reflect.FieldUtils.readField(r2, r7, r6)     // Catch: java.lang.IllegalAccessException -> L27
            r3.append(r4, r5, r2)     // Catch: java.lang.IllegalAccessException -> L27
            goto L43
        L27:
            r9 = move-exception
            java.lang.InternalError r0 = new java.lang.InternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected IllegalAccessException: "
            r1.append(r2)
            java.lang.String r9 = r9.getMessage()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L43:
            int r1 = r1 + 1
            goto L6
        L46:
            return
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public /* bridge */ /* synthetic */ org.apache.commons.lang3.builder.DiffResult build() {
            r1 = this;
            org.apache.commons.lang3.builder.DiffResult r0 = r1.build2()
            return r0
    }

    @Override // org.apache.commons.lang3.builder.Builder
    /* renamed from: build, reason: avoid collision after fix types in other method */
    public org.apache.commons.lang3.builder.DiffResult build2() {
            r2 = this;
            java.lang.Object r0 = r2.left
            java.lang.Object r1 = r2.right
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            org.apache.commons.lang3.builder.DiffBuilder r0 = r2.diffBuilder
            org.apache.commons.lang3.builder.DiffResult r0 = r0.build2()
            return r0
        L11:
            java.lang.Object r0 = r2.left
            java.lang.Class r0 = r0.getClass()
            r2.appendFields(r0)
            org.apache.commons.lang3.builder.DiffBuilder r0 = r2.diffBuilder
            org.apache.commons.lang3.builder.DiffResult r0 = r0.build2()
            return r0
    }
}
