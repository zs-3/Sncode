package kotlin.collections;

/* compiled from: _ArraysJvm.kt */
/* loaded from: classes2.dex */
class ArraysKt___ArraysJvmKt extends kotlin.collections.ArraysKt__ArraysKt {
    public static <T> java.util.List<T> asList(T[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r1 = kotlin.collections.ArraysUtilJVM.asList(r1)
            java.lang.String r0 = "asList(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    public static final <T> T[] copyInto(T[] r1, T[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r5 = r5 - r4
            java.lang.System.arraycopy(r1, r4, r2, r3, r5)
            return r2
    }

    public static /* synthetic */ java.lang.Object[] copyInto$default(java.lang.Object[] r1, java.lang.Object[] r2, int r3, int r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = 0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = 0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            int r5 = r1.length
        L10:
            java.lang.Object[] r1 = copyInto(r1, r2, r3, r4, r5)
            return r1
    }

    public static final <T> void fill(T[] r1, T r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Arrays.fill(r1, r3, r4, r2)
            return
    }

    public static final <T> void sortWith(T[] r2, java.util.Comparator<? super T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto L11
            java.util.Arrays.sort(r2, r3)
        L11:
            return
    }
}
