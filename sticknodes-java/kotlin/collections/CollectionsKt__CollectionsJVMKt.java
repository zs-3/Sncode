package kotlin.collections;

/* compiled from: CollectionsJVM.kt */
/* loaded from: classes2.dex */
class CollectionsKt__CollectionsJVMKt {
    public static final <T> java.lang.Object[] copyToArrayOfAny(T[] r2, boolean r3) {
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            if (r3 == 0) goto L14
            java.lang.Class r3 = r2.getClass()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r3 == 0) goto L14
            goto L1e
        L14:
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3, r0)
            java.lang.String r3 = "copyOf(this, this.size, Array<Any?>::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        L1e:
            return r2
    }

    public static <T> java.util.List<T> listOf(T r1) {
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r0 = "singletonList(element)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }
}
