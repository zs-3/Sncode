package kotlin.collections;

/* compiled from: Iterables.kt */
/* loaded from: classes2.dex */
class CollectionsKt__IterablesKt extends kotlin.collections.CollectionsKt__CollectionsKt {
    public static <T> int collectionSizeOrDefault(java.lang.Iterable<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lf
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r1.size()
        Lf:
            return r2
    }
}
