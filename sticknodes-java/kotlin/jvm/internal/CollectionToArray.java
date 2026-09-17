package kotlin.jvm.internal;

/* compiled from: CollectionToArray.kt */
/* loaded from: classes2.dex */
public final class CollectionToArray {
    private static final java.lang.Object[] EMPTY = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            kotlin.jvm.internal.CollectionToArray.EMPTY = r0
            return
    }

    public static final java.lang.Object[] toArray(java.util.Collection<?> r4) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.size()
            if (r0 != 0) goto Le
        Lb:
            java.lang.Object[] r4 = kotlin.jvm.internal.CollectionToArray.EMPTY
            goto L5f
        Le:
            java.util.Iterator r4 = r4.iterator()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L19
            goto Lb
        L19:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L1c:
            int r2 = r1 + 1
            java.lang.Object r3 = r4.next()
            r0[r1] = r3
            int r1 = r0.length
            if (r2 < r1) goto L50
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L2f
            r4 = r0
            goto L5f
        L2f:
            int r1 = r2 * 3
            int r1 = r1 + 1
            int r1 = r1 >>> 1
            r3 = 2147483645(0x7ffffffd, float:NaN)
            if (r1 > r2) goto L46
            if (r2 >= r3) goto L40
            r1 = 2147483645(0x7ffffffd, float:NaN)
            goto L46
        L40:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            r4.<init>()
            throw r4
        L46:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(result, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L60
        L50:
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L60
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r0 = "copyOf(result, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
        L5f:
            return r4
        L60:
            r1 = r2
            goto L1c
    }

    public static final java.lang.Object[] toArray(java.util.Collection<?> r5, java.lang.Object[] r6) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Objects.requireNonNull(r6)
            int r0 = r5.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L17
            int r5 = r6.length
            if (r5 <= 0) goto L88
            r6[r2] = r1
            goto L88
        L17:
            java.util.Iterator r5 = r5.iterator()
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L27
            int r5 = r6.length
            if (r5 <= 0) goto L88
            r6[r2] = r1
            goto L88
        L27:
            int r3 = r6.length
            if (r0 > r3) goto L2c
            r0 = r6
            goto L3f
        L2c:
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L3f:
            int r3 = r2 + 1
            java.lang.Object r4 = r5.next()
            r0[r2] = r4
            int r2 = r0.length
            if (r3 < r2) goto L73
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L52
            r6 = r0
            goto L88
        L52:
            int r2 = r3 * 3
            int r2 = r2 + 1
            int r2 = r2 >>> 1
            r4 = 2147483645(0x7ffffffd, float:NaN)
            if (r2 > r3) goto L69
            if (r3 >= r4) goto L63
            r2 = 2147483645(0x7ffffffd, float:NaN)
            goto L69
        L63:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
        L69:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "copyOf(result, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            goto L89
        L73:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L89
            if (r0 != r6) goto L7e
            r6[r3] = r1
            goto L88
        L7e:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r6 = "copyOf(result, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r6 = r5
        L88:
            return r6
        L89:
            r2 = r3
            goto L3f
    }
}
