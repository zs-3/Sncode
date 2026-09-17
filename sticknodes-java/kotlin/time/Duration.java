package kotlin.time;

/* compiled from: Duration.kt */
/* loaded from: classes2.dex */
public final class Duration implements java.lang.Comparable<kotlin.time.Duration> {
    public static final kotlin.time.Duration.Companion Companion = null;
    private static final long INFINITE = 0;
    private static final long NEG_INFINITE = 0;
    private static final long ZERO = 0;
    private final long rawValue;

    /* compiled from: Duration.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.time.Duration$Companion r0 = new kotlin.time.Duration$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.time.Duration.Companion = r0
            r0 = 0
            long r0 = m79constructorimpl(r0)
            kotlin.time.Duration.ZERO = r0
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            kotlin.time.Duration.INFINITE = r0
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            kotlin.time.Duration.NEG_INFINITE = r0
            return
    }

    private /* synthetic */ Duration(long r1) {
            r0 = this;
            r0.<init>()
            r0.rawValue = r1
            return
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m76appendFractionalimpl(long r3, java.lang.StringBuilder r5, int r6, int r7, int r8, java.lang.String r9, boolean r10) {
            r5.append(r6)
            if (r7 == 0) goto L4c
            r3 = 46
            r5.append(r3)
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r4 = 48
            java.lang.String r3 = kotlin.text.StringsKt.padStart(r3, r8, r4)
            int r6 = r3.length()
            r7 = -1
            int r6 = r6 + r7
            r8 = 1
            r0 = 0
            if (r6 < 0) goto L32
        L1e:
            int r1 = r6 + (-1)
            char r2 = r3.charAt(r6)
            if (r2 == r4) goto L28
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            if (r2 == 0) goto L2d
            r7 = r6
            goto L32
        L2d:
            if (r1 >= 0) goto L30
            goto L32
        L30:
            r6 = r1
            goto L1e
        L32:
            int r7 = r7 + r8
            java.lang.String r4 = "this.append(value, startIndex, endIndex)"
            r6 = 3
            if (r10 != 0) goto L41
            if (r7 >= r6) goto L41
            r5.append(r3, r0, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            goto L4c
        L41:
            int r7 = r7 + 2
            int r7 = r7 / r6
            int r7 = r7 * 3
            r5.append(r3, r0, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
        L4c:
            r5.append(r9)
            return
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.time.Duration m77boximpl(long r1) {
            kotlin.time.Duration r0 = new kotlin.time.Duration
            r0.<init>(r1)
            return r0
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m78compareToLRDsOJo(long r5, long r7) {
            long r0 = r5 ^ r7
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L1d
            int r1 = (int) r0
            r0 = r1 & 1
            if (r0 != 0) goto Le
            goto L1d
        Le:
            int r0 = (int) r5
            r0 = r0 & 1
            int r8 = (int) r7
            r7 = r8 & 1
            int r0 = r0 - r7
            boolean r5 = m98isNegativeimpl(r5)
            if (r5 == 0) goto L1c
            int r0 = -r0
        L1c:
            return r0
        L1d:
            int r5 = kotlin.jvm.internal.Intrinsics.compare(r5, r7)
            return r5
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m79constructorimpl(long r5) {
            boolean r0 = kotlin.time.DurationJvmKt.getDurationAssertionsEnabled()
            if (r0 == 0) goto Lab
            boolean r0 = m96isInNanosimpl(r5)
            if (r0 == 0) goto L42
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r3 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            r0.<init>(r1, r3)
            long r1 = m92getValueimpl(r5)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L27
            goto Lab
        L27:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r5 = m92getValueimpl(r5)
            r1.append(r5)
            java.lang.String r5 = " ns is out of nanoseconds range"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L42:
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r0.<init>(r1, r3)
            long r1 = m92getValueimpl(r5)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L90
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r3 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r0.<init>(r1, r3)
            long r1 = m92getValueimpl(r5)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L75
            goto Lab
        L75:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r5 = m92getValueimpl(r5)
            r1.append(r5)
            java.lang.String r5 = " ms is denormalized"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L90:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r5 = m92getValueimpl(r5)
            r1.append(r5)
            java.lang.String r5 = " ms is out of milliseconds range"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        Lab:
            return r5
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m80equalsimpl(long r4, java.lang.Object r6) {
            boolean r0 = r6 instanceof kotlin.time.Duration
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlin.time.Duration r6 = (kotlin.time.Duration) r6
            long r2 = r6.m104unboximpl()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L11
            return r1
        L11:
            r4 = 1
            return r4
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m81getAbsoluteValueUwyO8pc(long r1) {
            boolean r0 = m98isNegativeimpl(r1)
            if (r0 == 0) goto La
            long r1 = m102unaryMinusUwyO8pc(r1)
        La:
            return r1
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m82getHoursComponentimpl(long r2) {
            boolean r0 = m97isInfiniteimpl(r2)
            if (r0 == 0) goto L8
            r2 = 0
            goto L11
        L8:
            long r2 = m84getInWholeHoursimpl(r2)
            r0 = 24
            long r0 = (long) r0
            long r2 = r2 % r0
            int r2 = (int) r2
        L11:
            return r2
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m83getInWholeDaysimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r1 = m100toLongimpl(r1, r0)
            return r1
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m84getInWholeHoursimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r1 = m100toLongimpl(r1, r0)
            return r1
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m85getInWholeMillisecondsimpl(long r1) {
            boolean r0 = m95isInMillisimpl(r1)
            if (r0 == 0) goto L11
            boolean r0 = m94isFiniteimpl(r1)
            if (r0 == 0) goto L11
            long r1 = m92getValueimpl(r1)
            goto L17
        L11:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r1 = m100toLongimpl(r1, r0)
        L17:
            return r1
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m86getInWholeMinutesimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r1 = m100toLongimpl(r1, r0)
            return r1
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m87getInWholeSecondsimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r1 = m100toLongimpl(r1, r0)
            return r1
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m88getMinutesComponentimpl(long r2) {
            boolean r0 = m97isInfiniteimpl(r2)
            if (r0 == 0) goto L8
            r2 = 0
            goto L11
        L8:
            long r2 = m86getInWholeMinutesimpl(r2)
            r0 = 60
            long r0 = (long) r0
            long r2 = r2 % r0
            int r2 = (int) r2
        L11:
            return r2
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m89getNanosecondsComponentimpl(long r2) {
            boolean r0 = m97isInfiniteimpl(r2)
            if (r0 == 0) goto L8
            r2 = 0
            goto L25
        L8:
            boolean r0 = m95isInMillisimpl(r2)
            if (r0 == 0) goto L1b
            long r2 = m92getValueimpl(r2)
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 % r0
            long r2 = kotlin.time.DurationKt.access$millisToNanos(r2)
            goto L24
        L1b:
            long r2 = m92getValueimpl(r2)
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            long r0 = (long) r0
            long r2 = r2 % r0
        L24:
            int r2 = (int) r2
        L25:
            return r2
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m90getSecondsComponentimpl(long r2) {
            boolean r0 = m97isInfiniteimpl(r2)
            if (r0 == 0) goto L8
            r2 = 0
            goto L11
        L8:
            long r2 = m87getInWholeSecondsimpl(r2)
            r0 = 60
            long r0 = (long) r0
            long r2 = r2 % r0
            int r2 = (int) r2
        L11:
            return r2
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final kotlin.time.DurationUnit m91getStorageUnitimpl(long r0) {
            boolean r0 = m96isInNanosimpl(r0)
            if (r0 == 0) goto L9
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            goto Lb
        L9:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
        Lb:
            return r0
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m92getValueimpl(long r1) {
            r0 = 1
            long r1 = r1 >> r0
            return r1
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m93hashCodeimpl(long r0) {
            int r0 = androidx.privacysandbox.ads.adservices.topics.Topic$$ExternalSyntheticBackport0.m(r0)
            return r0
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m94isFiniteimpl(long r0) {
            boolean r0 = m97isInfiniteimpl(r0)
            r0 = r0 ^ 1
            return r0
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m95isInMillisimpl(long r0) {
            int r1 = (int) r0
            r0 = 1
            r1 = r1 & r0
            if (r1 != r0) goto L6
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m96isInNanosimpl(long r0) {
            int r1 = (int) r0
            r0 = 1
            r1 = r1 & r0
            if (r1 != 0) goto L6
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m97isInfiniteimpl(long r3) {
            long r0 = kotlin.time.Duration.INFINITE
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto Lf
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            goto Lf
        Ld:
            r3 = 0
            goto L10
        Lf:
            r3 = 1
        L10:
            return r3
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m98isNegativeimpl(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            return r3
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m99isPositiveimpl(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            return r3
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m100toLongimpl(long r3, kotlin.time.DurationUnit r5) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = kotlin.time.Duration.INFINITE
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L11
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L26
        L11:
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L1a
            r3 = -9223372036854775808
            goto L26
        L1a:
            long r0 = m92getValueimpl(r3)
            kotlin.time.DurationUnit r3 = m91getStorageUnitimpl(r3)
            long r3 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(r0, r3, r5)
        L26:
            return r3
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m101toStringimpl(long r14) {
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            java.lang.String r14 = "0s"
            goto L105
        La:
            long r2 = kotlin.time.Duration.INFINITE
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 != 0) goto L14
            java.lang.String r14 = "Infinity"
            goto L105
        L14:
            long r2 = kotlin.time.Duration.NEG_INFINITE
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 != 0) goto L1e
            java.lang.String r14 = "-Infinity"
            goto L105
        L1e:
            boolean r2 = m98isNegativeimpl(r14)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            if (r2 == 0) goto L2e
            r3 = 45
            r11.append(r3)
        L2e:
            long r3 = m81getAbsoluteValueUwyO8pc(r14)
            long r5 = m83getInWholeDaysimpl(r3)
            int r7 = m82getHoursComponentimpl(r3)
            int r8 = m88getMinutesComponentimpl(r3)
            int r9 = m90getSecondsComponentimpl(r3)
            int r10 = m89getNanosecondsComponentimpl(r3)
            r3 = 0
            r12 = 1
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 == 0) goto L4e
            r0 = 1
            goto L4f
        L4e:
            r0 = 0
        L4f:
            if (r7 == 0) goto L53
            r1 = 1
            goto L54
        L53:
            r1 = 0
        L54:
            if (r8 == 0) goto L58
            r4 = 1
            goto L59
        L58:
            r4 = 0
        L59:
            if (r9 != 0) goto L60
            if (r10 == 0) goto L5e
            goto L60
        L5e:
            r13 = 0
            goto L61
        L60:
            r13 = 1
        L61:
            if (r0 == 0) goto L6c
            r11.append(r5)
            r3 = 100
            r11.append(r3)
            r3 = 1
        L6c:
            r5 = 32
            if (r1 != 0) goto L76
            if (r0 == 0) goto L86
            if (r4 != 0) goto L76
            if (r13 == 0) goto L86
        L76:
            int r6 = r3 + 1
            if (r3 <= 0) goto L7d
            r11.append(r5)
        L7d:
            r11.append(r7)
            r3 = 104(0x68, float:1.46E-43)
            r11.append(r3)
            r3 = r6
        L86:
            if (r4 != 0) goto L8e
            if (r13 == 0) goto L9e
            if (r1 != 0) goto L8e
            if (r0 == 0) goto L9e
        L8e:
            int r6 = r3 + 1
            if (r3 <= 0) goto L95
            r11.append(r5)
        L95:
            r11.append(r8)
            r3 = 109(0x6d, float:1.53E-43)
            r11.append(r3)
            r3 = r6
        L9e:
            if (r13 == 0) goto Led
            int r13 = r3 + 1
            if (r3 <= 0) goto La7
            r11.append(r5)
        La7:
            if (r9 != 0) goto Lde
            if (r0 != 0) goto Lde
            if (r1 != 0) goto Lde
            if (r4 == 0) goto Lb0
            goto Lde
        Lb0:
            r0 = 1000000(0xf4240, float:1.401298E-39)
            if (r10 < r0) goto Lc3
            int r6 = r10 / r0
            int r7 = r10 % r0
            r8 = 6
            r10 = 0
            java.lang.String r9 = "ms"
            r3 = r14
            r5 = r11
            m76appendFractionalimpl(r3, r5, r6, r7, r8, r9, r10)
            goto Lec
        Lc3:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r10 < r0) goto Ld5
            int r6 = r10 / 1000
            int r7 = r10 % 1000
            r8 = 3
            r10 = 0
            java.lang.String r9 = "us"
            r3 = r14
            r5 = r11
            m76appendFractionalimpl(r3, r5, r6, r7, r8, r9, r10)
            goto Lec
        Ld5:
            r11.append(r10)
            java.lang.String r14 = "ns"
            r11.append(r14)
            goto Lec
        Lde:
            r8 = 9
            r0 = 0
            java.lang.String r1 = "s"
            r3 = r14
            r5 = r11
            r6 = r9
            r7 = r10
            r9 = r1
            r10 = r0
            m76appendFractionalimpl(r3, r5, r6, r7, r8, r9, r10)
        Lec:
            r3 = r13
        Led:
            if (r2 == 0) goto Lfc
            if (r3 <= r12) goto Lfc
            r14 = 40
            java.lang.StringBuilder r14 = r11.insert(r12, r14)
            r15 = 41
            r14.append(r15)
        Lfc:
            java.lang.String r14 = r11.toString()
            java.lang.String r15 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)
        L105:
            return r14
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m102unaryMinusUwyO8pc(long r2) {
            long r0 = m92getValueimpl(r2)
            long r0 = -r0
            int r3 = (int) r2
            r2 = r3 & 1
            long r2 = kotlin.time.DurationKt.access$durationOf(r0, r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.time.Duration r3) {
            r2 = this;
            kotlin.time.Duration r3 = (kotlin.time.Duration) r3
            long r0 = r3.m104unboximpl()
            int r3 = r2.m103compareToLRDsOJo(r0)
            return r3
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m103compareToLRDsOJo(long r3) {
            r2 = this;
            long r0 = r2.rawValue
            int r3 = m78compareToLRDsOJo(r0, r3)
            return r3
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.rawValue
            boolean r3 = m80equalsimpl(r0, r3)
            return r3
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.rawValue
            int r0 = m93hashCodeimpl(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.rawValue
            java.lang.String r0 = m101toStringimpl(r0)
            return r0
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m104unboximpl() {
            r2 = this;
            long r0 = r2.rawValue
            return r0
    }
}
