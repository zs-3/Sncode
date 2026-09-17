package kotlin.collections;

/* compiled from: MutableCollectionsJVM.kt */
/* loaded from: classes2.dex */
class CollectionsKt__MutableCollectionsJVMKt extends kotlin.collections.CollectionsKt__IteratorsKt {
    public static final <T> void sortWith(java.util.List<T> r2, java.util.Comparator<? super T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L14
            java.util.Collections.sort(r2, r3)
        L14:
            return
    }
}
