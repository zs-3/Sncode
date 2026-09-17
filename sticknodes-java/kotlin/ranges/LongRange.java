package kotlin.ranges;

/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes2.dex */
public final class LongRange extends kotlin.ranges.LongProgression {
    public static final kotlin.ranges.LongRange.Companion Companion = null;
    private static final kotlin.ranges.LongRange EMPTY = null;

    /* compiled from: PrimitiveRanges.kt */
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
            kotlin.ranges.LongRange$Companion r0 = new kotlin.ranges.LongRange$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.LongRange.Companion = r0
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = 1
            r3 = 0
            r0.<init>(r1, r3)
            kotlin.ranges.LongRange.EMPTY = r0
            return
    }

    public LongRange(long r8, long r10) {
            r7 = this;
            r5 = 1
            r0 = r7
            r1 = r8
            r3 = r10
            r0.<init>(r1, r3, r5)
            return
    }

    public boolean contains(long r4) {
            r3 = this;
            long r0 = r3.getFirst()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L12
            long r0 = r3.getLast()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L12
            r4 = 1
            goto L13
        L12:
            r4 = 0
        L13:
            return r4
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof kotlin.ranges.LongRange
            if (r0 == 0) goto L2f
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.ranges.LongRange r0 = (kotlin.ranges.LongRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            long r0 = r5.getFirst()
            kotlin.ranges.LongRange r6 = (kotlin.ranges.LongRange) r6
            long r2 = r6.getFirst()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            long r0 = r5.getLast()
            long r2 = r6.getLast()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L2f
        L2d:
            r6 = 1
            goto L30
        L2f:
            r6 = 0
        L30:
            return r6
    }

    public int hashCode() {
            r7 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L25
        L8:
            r0 = 31
            long r0 = (long) r0
            long r2 = r7.getFirst()
            long r4 = r7.getFirst()
            r6 = 32
            long r4 = r4 >>> r6
            long r2 = r2 ^ r4
            long r0 = r0 * r2
            long r2 = r7.getLast()
            long r4 = r7.getLast()
            long r4 = r4 >>> r6
            long r2 = r2 ^ r4
            long r0 = r0 + r2
            int r0 = (int) r0
        L25:
            return r0
    }

    public boolean isEmpty() {
            r5 = this;
            long r0 = r5.getFirst()
            long r2 = r5.getLast()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.getFirst()
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            long r1 = r3.getLast()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
