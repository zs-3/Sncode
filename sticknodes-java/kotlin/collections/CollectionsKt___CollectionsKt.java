package kotlin.collections;

/* compiled from: _Collections.kt */
/* loaded from: classes2.dex */
class CollectionsKt___CollectionsKt extends kotlin.collections.CollectionsKt___CollectionsJvmKt {
    public static <T> boolean contains(java.lang.Iterable<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            int r1 = indexOf(r1, r2)
            if (r1 < 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    public static <T> java.util.List<T> filterNotNull(java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r1 = filterNotNullTo(r1, r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static final <C extends java.util.Collection<? super T>, T> C filterNotNullTo(java.lang.Iterable<? extends T> r1, C r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.next()
            if (r0 == 0) goto Le
            r2.add(r0)
            goto Le
        L1e:
            return r2
    }

    public static final <T> int indexOf(java.lang.Iterable<? extends T> r2, T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L10
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.indexOf(r3)
            return r2
        L10:
            r0 = 0
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            if (r0 >= 0) goto L24
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L24:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 == 0) goto L2b
            return r0
        L2b:
            int r0 = r0 + 1
            goto L15
        L2e:
            r2 = -1
            return r2
    }

    public static final <T, A extends java.lang.Appendable> A joinTo(java.lang.Iterable<? extends T> r2, A r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6, int r7, java.lang.CharSequence r8, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r3.append(r5)
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
        L26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r2.next()
            int r5 = r5 + 1
            r1 = 1
            if (r5 <= r1) goto L38
            r3.append(r4)
        L38:
            if (r7 < 0) goto L3c
            if (r5 > r7) goto L40
        L3c:
            kotlin.text.StringsKt.appendElement(r3, r0, r9)
            goto L26
        L40:
            if (r7 < 0) goto L47
            if (r5 <= r7) goto L47
            r3.append(r8)
        L47:
            r3.append(r6)
            return r3
    }

    public static /* synthetic */ java.lang.Appendable joinTo$default(java.lang.Iterable r6, java.lang.Appendable r7, java.lang.CharSequence r8, java.lang.CharSequence r9, java.lang.CharSequence r10, int r11, java.lang.CharSequence r12, kotlin.jvm.functions.Function1 r13, int r14, java.lang.Object r15) {
            r0 = r14 & 2
            if (r0 == 0) goto L7
            java.lang.String r0 = ", "
            goto L8
        L7:
            r0 = r8
        L8:
            r1 = r14 & 4
            java.lang.String r2 = ""
            if (r1 == 0) goto L10
            r1 = r2
            goto L11
        L10:
            r1 = r9
        L11:
            r3 = r14 & 8
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = r10
        L17:
            r3 = r14 & 16
            if (r3 == 0) goto L1d
            r3 = -1
            goto L1e
        L1d:
            r3 = r11
        L1e:
            r4 = r14 & 32
            if (r4 == 0) goto L25
            java.lang.String r4 = "..."
            goto L26
        L25:
            r4 = r12
        L26:
            r5 = r14 & 64
            if (r5 == 0) goto L2c
            r5 = 0
            goto L2d
        L2c:
            r5 = r13
        L2d:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            java.lang.Appendable r0 = joinTo(r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
    }

    public static final <T> java.lang.String joinToString(java.lang.Iterable<? extends T> r9, java.lang.CharSequence r10, java.lang.CharSequence r11, java.lang.CharSequence r12, int r13, java.lang.CharSequence r14, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.Appendable r9 = joinTo(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r9 = (java.lang.StringBuilder) r9
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "joinTo(StringBuilder(), …ed, transform).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            return r9
    }

    public static /* synthetic */ java.lang.String joinToString$default(java.lang.Iterable r4, java.lang.CharSequence r5, java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, java.lang.CharSequence r9, kotlin.jvm.functions.Function1 r10, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            java.lang.String r5 = ", "
        L6:
            r12 = r11 & 2
            java.lang.String r0 = ""
            if (r12 == 0) goto Le
            r12 = r0
            goto Lf
        Le:
            r12 = r6
        Lf:
            r6 = r11 & 4
            if (r6 == 0) goto L14
            goto L15
        L14:
            r0 = r7
        L15:
            r6 = r11 & 8
            if (r6 == 0) goto L1c
            r8 = -1
            r1 = -1
            goto L1d
        L1c:
            r1 = r8
        L1d:
            r6 = r11 & 16
            if (r6 == 0) goto L23
            java.lang.String r9 = "..."
        L23:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L29
            r10 = 0
        L29:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            java.lang.String r4 = joinToString(r6, r7, r8, r9, r10, r11, r12)
            return r4
    }

    public static <T extends java.lang.Comparable<? super T>> T minOrNull(java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L11
            r3 = 0
            return r3
        L11:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L17:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L17
            r0 = r1
            goto L17
        L2b:
            return r0
    }

    public static <T> java.util.List<T> plus(java.util.Collection<? extends T> r2, T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.addAll(r2)
            r0.add(r3)
            return r0
    }

    public static <T> T single(java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L10
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = single(r1)
            return r1
        L10:
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L25
            return r0
        L25:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Collection has more than one element."
            r1.<init>(r0)
            throw r1
        L2d:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection is empty."
            r1.<init>(r0)
            throw r1
    }

    public static final <T> T single(java.util.List<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L1c
            r1 = 1
            if (r0 != r1) goto L14
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            return r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "List has more than one element."
            r2.<init>(r0)
            throw r2
        L1c:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r2.<init>(r0)
            throw r2
    }

    public static <T> java.util.List<T> sortedWith(java.lang.Iterable<? extends T> r3, java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L2c
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto L1d
            java.util.List r3 = kotlin.collections.CollectionsKt.toList(r3)
            return r3
        L1d:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            kotlin.collections.ArraysKt___ArraysJvmKt.sortWith(r3, r4)
            java.util.List r3 = kotlin.collections.ArraysKt.asList(r3)
            return r3
        L2c:
            java.util.List r3 = toMutableList(r3)
            kotlin.collections.CollectionsKt__MutableCollectionsJVMKt.sortWith(r3, r4)
            return r3
    }

    public static final <T, C extends java.util.Collection<? super T>> C toCollection(java.lang.Iterable<? extends T> r1, C r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto Le
        L1c:
            return r2
    }

    public static <T> java.util.List<T> toList(java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L38
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            if (r1 == 0) goto L33
            r2 = 1
            if (r1 == r2) goto L1a
            java.util.List r3 = toMutableList(r0)
            goto L37
        L1a:
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L26
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            goto L2e
        L26:
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r3 = r3.next()
        L2e:
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            goto L37
        L33:
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L37:
            return r3
        L38:
            java.util.List r3 = toMutableList(r3)
            java.util.List r3 = kotlin.collections.CollectionsKt.optimizeReadOnlyList(r3)
            return r3
    }

    public static final <T> java.util.List<T> toMutableList(java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = toMutableList(r1)
            return r1
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r1 = toCollection(r1, r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static final <T> java.util.List<T> toMutableList(java.util.Collection<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.Set<T> toSet(java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L47
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            if (r1 == 0) goto L42
            r2 = 1
            if (r1 == r2) goto L29
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            int r0 = r0.size()
            int r0 = kotlin.collections.MapsKt.mapCapacity(r0)
            r1.<init>(r0)
            java.util.Collection r3 = toCollection(r3, r1)
            java.util.Set r3 = (java.util.Set) r3
            goto L46
        L29:
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L35
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            goto L3d
        L35:
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r3 = r3.next()
        L3d:
            java.util.Set r3 = kotlin.collections.SetsKt__SetsJVMKt.setOf(r3)
            goto L46
        L42:
            java.util.Set r3 = kotlin.collections.SetsKt.emptySet()
        L46:
            return r3
        L47:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Collection r3 = toCollection(r3, r0)
            java.util.Set r3 = (java.util.Set) r3
            java.util.Set r3 = kotlin.collections.SetsKt__SetsKt.optimizeReadOnlySet(r3)
            return r3
    }

    public static <T, R> java.util.List<kotlin.Pair<T, R>> zip(java.lang.Iterable<? extends T> r4, java.lang.Iterable<? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Iterator r0 = r4.iterator()
            java.util.Iterator r1 = r5.iterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r3)
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, r3)
            int r4 = java.lang.Math.min(r4, r5)
            r2.<init>(r4)
        L25:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L41
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r0.next()
            java.lang.Object r5 = r1.next()
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r5)
            r2.add(r4)
            goto L25
        L41:
            return r2
    }
}
