package kotlin.collections;

/* compiled from: MutableCollections.kt */
/* loaded from: classes2.dex */
class CollectionsKt__MutableCollectionsKt extends kotlin.collections.CollectionsKt__MutableCollectionsJVMKt {
    public static <T> boolean addAll(java.util.Collection<? super T> r2, java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L15
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r2 = r2.addAll(r3)
            return r2
        L15:
            r0 = 0
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L1a
            r0 = 1
            goto L1a
        L2c:
            return r0
    }
}
