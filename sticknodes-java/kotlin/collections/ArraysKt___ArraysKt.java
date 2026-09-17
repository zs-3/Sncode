package kotlin.collections;

/* compiled from: _Arrays.kt */
/* loaded from: classes2.dex */
class ArraysKt___ArraysKt extends kotlin.collections.ArraysKt___ArraysJvmKt {
    public static final <T> boolean contains(T[] r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = indexOf(r1, r2)
            if (r1 < 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public static <T> java.util.List<T> filterNotNull(T[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r1 = filterNotNullTo(r1, r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static final <C extends java.util.Collection<? super T>, T> C filterNotNullTo(T[] r3, C r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L18
            r2 = r3[r1]
            if (r2 == 0) goto L15
            r4.add(r2)
        L15:
            int r1 = r1 + 1
            goto Lc
        L18:
            return r4
    }

    public static final <T> int getLastIndex(T[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.length
            int r1 = r1 + (-1)
            return r1
    }

    public static final <T> int indexOf(T[] r3, T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            if (r4 != 0) goto L13
            int r4 = r3.length
        L9:
            if (r0 >= r4) goto L22
            r1 = r3[r0]
            if (r1 != 0) goto L10
            return r0
        L10:
            int r0 = r0 + 1
            goto L9
        L13:
            int r1 = r3.length
        L14:
            if (r0 >= r1) goto L22
            r2 = r3[r0]
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r2)
            if (r2 == 0) goto L1f
            return r0
        L1f:
            int r0 = r0 + 1
            goto L14
        L22:
            r3 = -1
            return r3
    }

    public static char single(char[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            if (r0 == 0) goto L17
            r1 = 1
            if (r0 != r1) goto Lf
            r0 = 0
            char r2 = r2[r0]
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Array has more than one element."
            r2.<init>(r0)
            throw r2
        L17:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r0 = "Array is empty."
            r2.<init>(r0)
            throw r2
    }

    public static <T> T singleOrNull(T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto Ld
            r0 = 0
            r2 = r2[r0]
            goto Le
        Ld:
            r2 = 0
        Le:
            return r2
    }

    public static <T> java.util.List<T> toList(T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            if (r0 == 0) goto L18
            r1 = 1
            if (r0 == r1) goto L10
            java.util.List r2 = toMutableList(r2)
            goto L1c
        L10:
            r0 = 0
            r2 = r2[r0]
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            goto L1c
        L18:
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L1c:
            return r2
    }

    public static final <T> java.util.List<T> toMutableList(T[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection r1 = kotlin.collections.CollectionsKt__CollectionsKt.asCollection(r1)
            r0.<init>(r1)
            return r0
    }
}
