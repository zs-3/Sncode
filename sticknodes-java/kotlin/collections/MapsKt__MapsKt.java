package kotlin.collections;

/* compiled from: Maps.kt */
/* loaded from: classes2.dex */
class MapsKt__MapsKt extends kotlin.collections.MapsKt__MapsJVMKt {
    public static <K, V> java.util.Map<K, V> emptyMap() {
            kotlin.collections.EmptyMap r0 = kotlin.collections.EmptyMap.INSTANCE
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            return r0
    }

    public static <K, V> java.util.Map<K, V> mapOf(kotlin.Pair<? extends K, ? extends V>... r2) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            if (r0 <= 0) goto L17
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r0.<init>(r1)
            java.util.Map r2 = toMap(r2, r0)
            goto L1b
        L17:
            java.util.Map r2 = kotlin.collections.MapsKt.emptyMap()
        L1b:
            return r2
    }

    public static final <K, V> java.util.Map<K, V> optimizeReadOnlyMap(java.util.Map<K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L14
            r1 = 1
            if (r0 == r1) goto Lf
            goto L18
        Lf:
            java.util.Map r2 = kotlin.collections.MapsKt__MapsJVMKt.toSingletonMap(r2)
            goto L18
        L14:
            java.util.Map r2 = kotlin.collections.MapsKt.emptyMap()
        L18:
            return r2
    }

    public static final <K, V> void putAll(java.util.Map<? super K, ? super V> r2, java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.component1()
            java.lang.Object r0 = r0.component2()
            r2.put(r1, r0)
            goto Le
        L26:
            return
    }

    public static final <K, V> void putAll(java.util.Map<? super K, ? super V> r4, kotlin.Pair<? extends K, ? extends V>[] r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1e
            r2 = r5[r1]
            java.lang.Object r3 = r2.component1()
            java.lang.Object r2 = r2.component2()
            r4.put(r3, r2)
            int r1 = r1 + 1
            goto Lc
        L1e:
            return
    }

    public static <K, V> java.util.Map<K, V> toMap(java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L47
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            if (r1 == 0) goto L42
            r2 = 1
            if (r1 == r2) goto L27
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r0 = r0.size()
            int r0 = kotlin.collections.MapsKt.mapCapacity(r0)
            r1.<init>(r0)
            java.util.Map r3 = toMap(r3, r1)
            goto L46
        L27:
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L33
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            goto L3b
        L33:
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r3 = r3.next()
        L3b:
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.util.Map r3 = kotlin.collections.MapsKt__MapsJVMKt.mapOf(r3)
            goto L46
        L42:
            java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
        L46:
            return r3
        L47:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r3 = toMap(r3, r0)
            java.util.Map r3 = optimizeReadOnlyMap(r3)
            return r3
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M toMap(java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> r1, M r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            putAll(r2, r1)
            return r2
    }

    public static <K, V> java.util.Map<K, V> toMap(java.util.Map<? extends K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L18
            r1 = 1
            if (r0 == r1) goto L13
            java.util.Map r2 = kotlin.collections.MapsKt.toMutableMap(r2)
            goto L1c
        L13:
            java.util.Map r2 = kotlin.collections.MapsKt__MapsJVMKt.toSingletonMap(r2)
            goto L1c
        L18:
            java.util.Map r2 = kotlin.collections.MapsKt.emptyMap()
        L1c:
            return r2
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M toMap(kotlin.Pair<? extends K, ? extends V>[] r1, M r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            putAll(r2, r1)
            return r2
    }

    public static <K, V> java.util.Map<K, V> toMutableMap(java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            return r0
    }
}
