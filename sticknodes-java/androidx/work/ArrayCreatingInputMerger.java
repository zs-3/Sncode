package androidx.work;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends androidx.work.InputMerger {
    public ArrayCreatingInputMerger() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object concatenateArrayAndNonArray(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = java.lang.reflect.Array.getLength(r4)
            java.lang.Class r1 = r5.getClass()
            int r2 = r0 + 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r1, r2, r0)
            java.lang.reflect.Array.set(r1, r0, r5)
            return r1
    }

    private java.lang.Object concatenateArrays(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r0 = java.lang.reflect.Array.getLength(r5)
            int r1 = java.lang.reflect.Array.getLength(r6)
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r2 = r2.getComponentType()
            int r3 = r0 + r1
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r2, r3, r0)
            java.lang.System.arraycopy(r6, r3, r2, r0, r1)
            return r2
    }

    private java.lang.Object concatenateNonArrays(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            r1 = 2
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            r1 = 0
            java.lang.reflect.Array.set(r0, r1, r3)
            r3 = 1
            java.lang.reflect.Array.set(r0, r3, r4)
            return r0
    }

    private java.lang.Object createArrayFor(java.lang.Object r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            r1 = 0
            java.lang.reflect.Array.set(r0, r1, r3)
            return r0
    }

    @Override // androidx.work.InputMerger
    public androidx.work.Data merge(java.util.List<androidx.work.Data> r10) {
            r9 = this;
            androidx.work.Data$Builder r0 = new androidx.work.Data$Builder
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        Le:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r10.next()
            androidx.work.Data r2 = (androidx.work.Data) r2
            java.util.Map r2 = r2.getKeyValueMap()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Le
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.Class r5 = r3.getClass()
            java.lang.Object r6 = r1.get(r4)
            if (r6 != 0) goto L52
            boolean r5 = r5.isArray()
            if (r5 == 0) goto L4d
            goto L95
        L4d:
            java.lang.Object r3 = r9.createArrayFor(r3)
            goto L95
        L52:
            java.lang.Class r7 = r6.getClass()
            boolean r8 = r7.equals(r5)
            if (r8 == 0) goto L6c
            boolean r5 = r7.isArray()
            if (r5 == 0) goto L67
            java.lang.Object r3 = r9.concatenateArrays(r6, r3)
            goto L95
        L67:
            java.lang.Object r3 = r9.concatenateNonArrays(r6, r3)
            goto L95
        L6c:
            boolean r8 = r7.isArray()
            if (r8 == 0) goto L81
            java.lang.Class r8 = r7.getComponentType()
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L81
            java.lang.Object r3 = r9.concatenateArrayAndNonArray(r6, r3)
            goto L95
        L81:
            boolean r8 = r5.isArray()
            if (r8 == 0) goto L99
            java.lang.Class r5 = r5.getComponentType()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L99
            java.lang.Object r3 = r9.concatenateArrayAndNonArray(r3, r6)
        L95:
            r1.put(r4, r3)
            goto L26
        L99:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L9f:
            r0.putAll(r1)
            androidx.work.Data r10 = r0.build()
            return r10
    }
}
