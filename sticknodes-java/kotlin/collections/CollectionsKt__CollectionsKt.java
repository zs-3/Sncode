package kotlin.collections;

/* compiled from: Collections.kt */
/* loaded from: classes2.dex */
class CollectionsKt__CollectionsKt extends kotlin.collections.CollectionsKt__CollectionsJVMKt {
    public static final <T> java.util.Collection<T> asCollection(T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.ArrayAsCollection r0 = new kotlin.collections.ArrayAsCollection
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <T> java.util.List<T> emptyList() {
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            return r0
    }

    public static <T> int getLastIndex(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.size()
            int r1 = r1 + (-1)
            return r1
    }

    public static <T> java.util.List<T> listOf(T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto Ld
            java.util.List r1 = kotlin.collections.ArraysKt.asList(r1)
            goto L11
        Ld:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L11:
            return r1
    }

    public static <T> java.util.List<T> mutableListOf(T... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            if (r0 != 0) goto Le
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L1a
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            kotlin.collections.ArrayAsCollection r1 = new kotlin.collections.ArrayAsCollection
            r2 = 1
            r1.<init>(r3, r2)
            r0.<init>(r1)
            r3 = r0
        L1a:
            return r3
    }

    public static <T> java.util.List<T> optimizeReadOnlyList(java.util.List<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L19
            r1 = 1
            if (r0 == r1) goto Lf
            goto L1d
        Lf:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            goto L1d
        L19:
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L1d:
            return r2
    }

    public static void throwIndexOverflow() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
    }
}
