package kotlin.collections;

/* compiled from: MapsJVM.kt */
/* loaded from: classes2.dex */
class MapsKt__MapsJVMKt extends kotlin.collections.MapsKt__MapWithDefaultKt {
    public static int mapCapacity(int r1) {
            if (r1 >= 0) goto L3
            goto L19
        L3:
            r0 = 3
            if (r1 >= r0) goto L9
            int r1 = r1 + 1
            goto L19
        L9:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            int r1 = (int) r1
            goto L19
        L16:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L19:
            return r1
    }

    public static final <K, V> java.util.Map<K, V> mapOf(kotlin.Pair<? extends K, ? extends V> r1) {
            java.lang.String r0 = "pair"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Object r0 = r1.getFirst()
            java.lang.Object r1 = r1.getSecond()
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r0 = "singletonMap(pair.first, pair.second)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    public static final <K, V> java.util.Map<K, V> toSingletonMap(java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r0 = "with(entries.iterator().…ingletonMap(key, value) }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }
}
