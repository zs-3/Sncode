package kotlin.ranges;

/* compiled from: _Ranges.kt */
/* loaded from: classes2.dex */
class RangesKt___RangesKt extends kotlin.ranges.RangesKt__RangesKt {
    public static int coerceAtLeast(int r0, int r1) {
            if (r0 >= r1) goto L3
            r0 = r1
        L3:
            return r0
    }

    public static long coerceAtLeast(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            r1 = r3
        L5:
            return r1
    }

    public static int coerceAtMost(int r0, int r1) {
            if (r0 <= r1) goto L3
            r0 = r1
        L3:
            return r0
    }

    public static long coerceAtMost(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5
            r1 = r3
        L5:
            return r1
    }

    public static int coerceIn(int r2, int r3, int r4) {
            if (r3 > r4) goto L9
            if (r2 >= r3) goto L5
            return r3
        L5:
            if (r2 <= r4) goto L8
            return r4
        L8:
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public static long coerceIn(long r1, long r3, long r5) {
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return r3
        L9:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto Le
            return r5
        Le:
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = " is less than minimum "
            r2.append(r5)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static kotlin.ranges.IntProgression downTo(int r2, int r3) {
            kotlin.ranges.IntProgression$Companion r0 = kotlin.ranges.IntProgression.Companion
            r1 = -1
            kotlin.ranges.IntProgression r2 = r0.fromClosedRange(r2, r3, r1)
            return r2
    }

    public static kotlin.ranges.IntRange until(int r1, int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 > r0) goto Lb
            kotlin.ranges.IntRange$Companion r1 = kotlin.ranges.IntRange.Companion
            kotlin.ranges.IntRange r1 = r1.getEMPTY()
            return r1
        Lb:
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r2 = r2 + (-1)
            r0.<init>(r1, r2)
            return r0
    }
}
