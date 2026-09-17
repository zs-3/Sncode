package kotlin.collections;

/* compiled from: Sets.kt */
/* loaded from: classes2.dex */
class SetsKt__SetsKt extends kotlin.collections.SetsKt__SetsJVMKt {
    public static <T> java.util.Set<T> emptySet() {
            kotlin.collections.EmptySet r0 = kotlin.collections.EmptySet.INSTANCE
            return r0
    }

    public static final <T> java.util.Set<T> optimizeReadOnlySet(java.util.Set<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L1c
            r1 = 1
            if (r0 == r1) goto Lf
            goto L20
        Lf:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
            java.util.Set r2 = kotlin.collections.SetsKt__SetsJVMKt.setOf(r2)
            goto L20
        L1c:
            java.util.Set r2 = kotlin.collections.SetsKt.emptySet()
        L20:
            return r2
    }
}
