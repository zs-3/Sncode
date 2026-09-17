package kotlin.text;

/* compiled from: Strings.kt */
/* loaded from: classes2.dex */
class StringsKt__StringsKt extends kotlin.text.StringsKt__StringsJVMKt {


    public static final /* synthetic */ kotlin.Pair access$findAnyOf(java.lang.CharSequence r0, java.util.Collection r1, int r2, boolean r3, boolean r4) {
            kotlin.Pair r0 = findAnyOf$StringsKt__StringsKt(r0, r1, r2, r3, r4)
            return r0
    }

    public static final boolean contains(java.lang.CharSequence r11, java.lang.CharSequence r12, boolean r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            boolean r0 = r12 instanceof java.lang.String
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1f
            r4 = r12
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            r7 = 2
            r8 = 0
            r3 = r11
            r6 = r13
            int r11 = indexOf$default(r3, r4, r5, r6, r7, r8)
            if (r11 < 0) goto L32
            goto L33
        L1f:
            r5 = 0
            int r6 = r11.length()
            r8 = 0
            r9 = 16
            r10 = 0
            r3 = r11
            r4 = r12
            r7 = r13
            int r11 = indexOf$StringsKt__StringsKt$default(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r11 < 0) goto L32
            goto L33
        L32:
            r1 = 0
        L33:
            return r1
    }

    public static /* synthetic */ boolean contains$default(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = contains(r0, r1, r2)
            return r0
    }

    private static final kotlin.Pair<java.lang.Integer, java.lang.String> findAnyOf$StringsKt__StringsKt(java.lang.CharSequence r10, java.util.Collection<java.lang.String> r11, int r12, boolean r13, boolean r14) {
            r0 = 0
            if (r13 != 0) goto L2d
            int r1 = r11.size()
            r2 = 1
            if (r1 != r2) goto L2d
            java.lang.Object r11 = kotlin.collections.CollectionsKt.single(r11)
            java.lang.String r11 = (java.lang.String) r11
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            if (r14 != 0) goto L1d
            int r10 = indexOf$default(r1, r2, r3, r4, r5, r6)
            goto L21
        L1d:
            int r10 = kotlin.text.StringsKt.lastIndexOf$default(r1, r2, r3, r4, r5, r6)
        L21:
            if (r10 >= 0) goto L24
            goto L2c
        L24:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r10, r11)
        L2c:
            return r0
        L2d:
            r1 = 0
            if (r14 != 0) goto L3e
            kotlin.ranges.IntRange r14 = new kotlin.ranges.IntRange
            int r12 = kotlin.ranges.RangesKt.coerceAtLeast(r12, r1)
            int r1 = r10.length()
            r14.<init>(r12, r1)
            goto L4a
        L3e:
            int r14 = getLastIndex(r10)
            int r12 = kotlin.ranges.RangesKt.coerceAtMost(r12, r14)
            kotlin.ranges.IntProgression r14 = kotlin.ranges.RangesKt.downTo(r12, r1)
        L4a:
            boolean r12 = r10 instanceof java.lang.String
            if (r12 == 0) goto L96
            int r12 = r14.getFirst()
            int r1 = r14.getLast()
            int r14 = r14.getStep()
            if (r14 <= 0) goto L5e
            if (r12 <= r1) goto L62
        L5e:
            if (r14 >= 0) goto Ldc
            if (r1 > r12) goto Ldc
        L62:
            java.util.Iterator r8 = r11.iterator()
        L66:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r2.length()
            r5 = r12
            r7 = r13
            boolean r2 = kotlin.text.StringsKt__StringsJVMKt.regionMatches(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L66
            goto L85
        L84:
            r9 = r0
        L85:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L92
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            kotlin.Pair r10 = kotlin.TuplesKt.to(r10, r9)
            return r10
        L92:
            if (r12 == r1) goto Ldc
            int r12 = r12 + r14
            goto L62
        L96:
            int r12 = r14.getFirst()
            int r1 = r14.getLast()
            int r14 = r14.getStep()
            if (r14 <= 0) goto La6
            if (r12 <= r1) goto Laa
        La6:
            if (r14 >= 0) goto Ldc
            if (r1 > r12) goto Ldc
        Laa:
            java.util.Iterator r8 = r11.iterator()
        Lae:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lca
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r6 = r2.length()
            r4 = r10
            r5 = r12
            r7 = r13
            boolean r2 = regionMatchesImpl(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto Lae
            goto Lcb
        Lca:
            r9 = r0
        Lcb:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto Ld8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            kotlin.Pair r10 = kotlin.TuplesKt.to(r10, r9)
            return r10
        Ld8:
            if (r12 == r1) goto Ldc
            int r12 = r12 + r14
            goto Laa
        Ldc:
            return r0
    }

    public static final kotlin.ranges.IntRange getIndices(java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r2 = r2.length()
            int r2 = r2 + (-1)
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static final int getLastIndex(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.length()
            int r1 = r1 + (-1)
            return r1
    }

    public static final int indexOf(java.lang.CharSequence r2, char r3, int r4, boolean r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r5 != 0) goto L13
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto Lc
            goto L13
        Lc:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.indexOf(r3, r4)
            goto L1d
        L13:
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r0[r1] = r3
            int r2 = indexOfAny(r2, r0, r4, r5)
        L1d:
            return r2
    }

    public static final int indexOf(java.lang.CharSequence r8, java.lang.String r9, int r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            if (r11 != 0) goto L18
            boolean r0 = r8 instanceof java.lang.String
            if (r0 != 0) goto L11
            goto L18
        L11:
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.indexOf(r9, r10)
            goto L28
        L18:
            int r3 = r8.length()
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            int r8 = indexOf$StringsKt__StringsKt$default(r0, r1, r2, r3, r4, r5, r6, r7)
        L28:
            return r8
    }

    private static final int indexOf$StringsKt__StringsKt(java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, int r9, boolean r10, boolean r11) {
            r0 = 0
            if (r11 != 0) goto L15
            kotlin.ranges.IntRange r11 = new kotlin.ranges.IntRange
            int r8 = kotlin.ranges.RangesKt.coerceAtLeast(r8, r0)
            int r0 = r6.length()
            int r9 = kotlin.ranges.RangesKt.coerceAtMost(r9, r0)
            r11.<init>(r8, r9)
            goto L25
        L15:
            int r11 = getLastIndex(r6)
            int r8 = kotlin.ranges.RangesKt.coerceAtMost(r8, r11)
            int r9 = kotlin.ranges.RangesKt.coerceAtLeast(r9, r0)
            kotlin.ranges.IntProgression r11 = kotlin.ranges.RangesKt.downTo(r8, r9)
        L25:
            boolean r8 = r6 instanceof java.lang.String
            if (r8 == 0) goto L59
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L59
            int r8 = r11.getFirst()
            int r9 = r11.getLast()
            int r11 = r11.getStep()
            if (r11 <= 0) goto L3d
            if (r8 <= r9) goto L41
        L3d:
            if (r11 >= 0) goto L81
            if (r9 > r8) goto L81
        L41:
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r7.length()
            r3 = r8
            r5 = r10
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.regionMatches(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L55
            return r8
        L55:
            if (r8 == r9) goto L81
            int r8 = r8 + r11
            goto L41
        L59:
            int r8 = r11.getFirst()
            int r9 = r11.getLast()
            int r11 = r11.getStep()
            if (r11 <= 0) goto L69
            if (r8 <= r9) goto L6d
        L69:
            if (r11 >= 0) goto L81
            if (r9 > r8) goto L81
        L6d:
            r1 = 0
            int r4 = r7.length()
            r0 = r7
            r2 = r6
            r3 = r8
            r5 = r10
            boolean r0 = regionMatchesImpl(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L7d
            return r8
        L7d:
            if (r8 == r9) goto L81
            int r8 = r8 + r11
            goto L6d
        L81:
            r6 = -1
            return r6
    }

    static /* synthetic */ int indexOf$StringsKt__StringsKt$default(java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, int r9, boolean r10, boolean r11, int r12, java.lang.Object r13) {
            r12 = r12 & 16
            if (r12 == 0) goto L7
            r11 = 0
            r5 = 0
            goto L8
        L7:
            r5 = r11
        L8:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            int r6 = indexOf$StringsKt__StringsKt(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static /* synthetic */ int indexOf$default(java.lang.CharSequence r1, char r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            int r1 = indexOf(r1, r2, r3, r4)
            return r1
    }

    public static /* synthetic */ int indexOf$default(java.lang.CharSequence r1, java.lang.String r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            int r1 = indexOf(r1, r2, r3, r4)
            return r1
    }

    public static final int indexOfAny(java.lang.CharSequence r7, char[] r8, int r9, boolean r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 1
            if (r10 != 0) goto L1f
            int r1 = r8.length
            if (r1 != r0) goto L1f
            boolean r1 = r7 instanceof java.lang.String
            if (r1 == 0) goto L1f
            char r8 = kotlin.collections.ArraysKt.single(r8)
            java.lang.String r7 = (java.lang.String) r7
            int r7 = r7.indexOf(r8, r9)
            return r7
        L1f:
            kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange
            r2 = 0
            int r9 = kotlin.ranges.RangesKt.coerceAtLeast(r9, r2)
            int r3 = getLastIndex(r7)
            r1.<init>(r9, r3)
            kotlin.collections.IntIterator r9 = r1.iterator2()
        L31:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L54
            int r1 = r9.nextInt()
            char r3 = r7.charAt(r1)
            int r4 = r8.length
            r5 = 0
        L41:
            if (r5 >= r4) goto L50
            char r6 = r8[r5]
            boolean r6 = kotlin.text.CharsKt__CharKt.equals(r6, r3, r10)
            if (r6 == 0) goto L4d
            r3 = 1
            goto L51
        L4d:
            int r5 = r5 + 1
            goto L41
        L50:
            r3 = 0
        L51:
            if (r3 == 0) goto L31
            return r1
        L54:
            r7 = -1
            return r7
    }

    public static final int lastIndexOf(java.lang.CharSequence r2, char r3, int r4, boolean r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r5 != 0) goto L13
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto Lc
            goto L13
        Lc:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.lastIndexOf(r3, r4)
            goto L1d
        L13:
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r0[r1] = r3
            int r2 = lastIndexOfAny(r2, r0, r4, r5)
        L1d:
            return r2
    }

    public static final int lastIndexOf(java.lang.CharSequence r6, java.lang.String r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            if (r9 != 0) goto L18
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto L11
            goto L18
        L11:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.lastIndexOf(r7, r8)
            goto L22
        L18:
            r3 = 0
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            int r6 = indexOf$StringsKt__StringsKt(r0, r1, r2, r3, r4, r5)
        L22:
            return r6
    }

    public static /* synthetic */ int lastIndexOf$default(java.lang.CharSequence r0, char r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = getLastIndex(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = lastIndexOf(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int lastIndexOf$default(java.lang.CharSequence r0, java.lang.String r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = getLastIndex(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = lastIndexOf(r0, r1, r2, r3)
            return r0
    }

    public static final int lastIndexOfAny(java.lang.CharSequence r6, char[] r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 1
            if (r9 != 0) goto L1f
            int r1 = r7.length
            if (r1 != r0) goto L1f
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L1f
            char r7 = kotlin.collections.ArraysKt.single(r7)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.lastIndexOf(r7, r8)
            return r6
        L1f:
            int r1 = getLastIndex(r6)
            int r8 = kotlin.ranges.RangesKt.coerceAtMost(r8, r1)
        L27:
            r1 = -1
            if (r1 >= r8) goto L46
            char r1 = r6.charAt(r8)
            int r2 = r7.length
            r3 = 0
            r4 = 0
        L31:
            if (r4 >= r2) goto L40
            char r5 = r7[r4]
            boolean r5 = kotlin.text.CharsKt__CharKt.equals(r5, r1, r9)
            if (r5 == 0) goto L3d
            r3 = 1
            goto L40
        L3d:
            int r4 = r4 + 1
            goto L31
        L40:
            if (r3 == 0) goto L43
            return r8
        L43:
            int r8 = r8 + (-1)
            goto L27
        L46:
            return r1
    }

    public static final kotlin.sequences.Sequence<java.lang.String> lineSequence(java.lang.CharSequence r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = "\n"
            java.lang.String r2 = "\r"
            java.lang.String[] r4 = new java.lang.String[]{r0, r1, r2}
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r9
            kotlin.sequences.Sequence r9 = splitToSequence$default(r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static final java.util.List<java.lang.String> lines(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.sequences.Sequence r1 = lineSequence(r1)
            java.util.List r1 = kotlin.sequences.SequencesKt.toList(r1)
            return r1
    }

    public static final java.lang.CharSequence padStart(java.lang.CharSequence r4, int r5, char r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r5 < 0) goto L3c
            int r0 = r4.length()
            if (r5 > r0) goto L17
            r5 = 0
            int r6 = r4.length()
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
            return r4
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange
            r2 = 1
            int r3 = r4.length()
            int r5 = r5 - r3
            r1.<init>(r2, r5)
            kotlin.collections.IntIterator r5 = r1.iterator2()
        L2b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L38
            r5.nextInt()
            r0.append(r6)
            goto L2b
        L38:
            r0.append(r4)
            return r0
        L3c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Desired length "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = " is less than zero."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    public static java.lang.String padStart(java.lang.String r1, int r2, char r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.CharSequence r1 = padStart(r1, r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    private static final kotlin.sequences.Sequence<kotlin.ranges.IntRange> rangesDelimitedBy$StringsKt__StringsKt(java.lang.CharSequence r2, java.lang.String[] r3, int r4, boolean r5, int r6) {
            requireNonNegativeLimit(r6)
            java.util.List r3 = kotlin.collections.ArraysKt.asList(r3)
            kotlin.text.DelimitedRangesSequence r0 = new kotlin.text.DelimitedRangesSequence
            kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2 r1 = new kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2
            r1.<init>(r3, r5)
            r0.<init>(r2, r4, r6, r1)
            return r0
    }

    static /* synthetic */ kotlin.sequences.Sequence rangesDelimitedBy$StringsKt__StringsKt$default(java.lang.CharSequence r1, java.lang.String[] r2, int r3, boolean r4, int r5, int r6, java.lang.Object r7) {
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
            r5 = 0
        L10:
            kotlin.sequences.Sequence r1 = rangesDelimitedBy$StringsKt__StringsKt(r1, r2, r3, r4, r5)
            return r1
    }

    public static final boolean regionMatchesImpl(java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, int r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            if (r7 < 0) goto L39
            if (r5 < 0) goto L39
            int r1 = r4.length()
            int r1 = r1 - r8
            if (r5 > r1) goto L39
            int r1 = r6.length()
            int r1 = r1 - r8
            if (r7 <= r1) goto L1e
            goto L39
        L1e:
            r1 = 0
        L1f:
            if (r1 >= r8) goto L37
            int r2 = r5 + r1
            char r2 = r4.charAt(r2)
            int r3 = r7 + r1
            char r3 = r6.charAt(r3)
            boolean r2 = kotlin.text.CharsKt__CharKt.equals(r2, r3, r9)
            if (r2 != 0) goto L34
            return r0
        L34:
            int r1 = r1 + 1
            goto L1f
        L37:
            r4 = 1
            return r4
        L39:
            return r0
    }

    public static final void requireNonNegativeLimit(int r2) {
            if (r2 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L8
            return
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Limit must be non-negative, but was "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    public static final kotlin.sequences.Sequence<java.lang.String> splitToSequence(java.lang.CharSequence r8, java.lang.String[] r9, boolean r10, int r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "delimiters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            kotlin.sequences.Sequence r9 = rangesDelimitedBy$StringsKt__StringsKt$default(r1, r2, r3, r4, r5, r6, r7)
            kotlin.text.StringsKt__StringsKt$splitToSequence$1 r10 = new kotlin.text.StringsKt__StringsKt$splitToSequence$1
            r10.<init>(r8)
            kotlin.sequences.Sequence r8 = kotlin.sequences.SequencesKt.map(r9, r10)
            return r8
    }

    public static /* synthetic */ kotlin.sequences.Sequence splitToSequence$default(java.lang.CharSequence r1, java.lang.String[] r2, boolean r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            kotlin.sequences.Sequence r1 = splitToSequence(r1, r2, r3, r4)
            return r1
    }

    public static final java.lang.String substring(java.lang.CharSequence r1, kotlin.ranges.IntRange r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Integer r0 = r2.getStart()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.getEndInclusive()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static final java.lang.String substringAfter(java.lang.String r7, char r8, java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = indexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L18
            goto L27
        L18:
            int r8 = r8 + 1
            int r9 = r7.length()
            java.lang.String r9 = r7.substring(r8, r9)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
        L27:
            return r9
    }

    public static final java.lang.String substringAfter(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r0 = indexOf$default(r1, r2, r3, r4, r5, r6)
            r1 = -1
            if (r0 != r1) goto L1d
            goto L2f
        L1d:
            int r8 = r8.length()
            int r0 = r0 + r8
            int r8 = r7.length()
            java.lang.String r9 = r7.substring(r0, r8)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
        L2f:
            return r9
    }

    public static /* synthetic */ java.lang.String substringAfter$default(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = substringAfter(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String substringAfter$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = substringAfter(r0, r1, r2)
            return r0
    }

    public static java.lang.String substringAfterLast(java.lang.String r7, char r8, java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = lastIndexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L18
            goto L27
        L18:
            int r8 = r8 + 1
            int r9 = r7.length()
            java.lang.String r9 = r7.substring(r8, r9)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
        L27:
            return r9
    }

    public static /* synthetic */ java.lang.String substringAfterLast$default(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = kotlin.text.StringsKt.substringAfterLast(r0, r1, r2)
            return r0
    }

    public static final java.lang.String substringBefore(java.lang.String r7, char r8, java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = indexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L18
            goto L22
        L18:
            r9 = 0
            java.lang.String r9 = r7.substring(r9, r8)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
        L22:
            return r9
    }

    public static final java.lang.String substringBefore(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r8
            int r8 = indexOf$default(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L1d
            goto L27
        L1d:
            r9 = 0
            java.lang.String r9 = r7.substring(r9, r8)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
        L27:
            return r9
    }

    public static /* synthetic */ java.lang.String substringBefore$default(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = substringBefore(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String substringBefore$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = substringBefore(r0, r1, r2)
            return r0
    }

    public static java.lang.CharSequence trim(java.lang.CharSequence r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        Ld:
            if (r2 > r0) goto L2b
            if (r3 != 0) goto L13
            r4 = r2
            goto L14
        L13:
            r4 = r0
        L14:
            char r4 = r5.charAt(r4)
            boolean r4 = kotlin.text.CharsKt__CharJVMKt.isWhitespace(r4)
            if (r3 != 0) goto L25
            if (r4 != 0) goto L22
            r3 = 1
            goto Ld
        L22:
            int r2 = r2 + 1
            goto Ld
        L25:
            if (r4 != 0) goto L28
            goto L2b
        L28:
            int r0 = r0 + (-1)
            goto Ld
        L2b:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }
}
