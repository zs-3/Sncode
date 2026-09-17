package kotlin.ranges;

/* compiled from: Progressions.kt */
/* loaded from: classes2.dex */
public class LongProgression implements java.lang.Iterable<java.lang.Long> {
    public static final kotlin.ranges.LongProgression.Companion Companion = null;
    private final long first;
    private final long last;
    private final long step;

    /* compiled from: Progressions.kt */
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
            kotlin.ranges.LongProgression$Companion r0 = new kotlin.ranges.LongProgression$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.LongProgression.Companion = r0
            return
    }

    public LongProgression(long r4, long r6, long r8) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L22
            r0 = -9223372036854775808
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L1a
            r3.first = r4
            long r4 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(r4, r6, r8)
            r3.last = r4
            r3.step = r8
            return
        L1a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Step must be greater than Long.MIN_VALUE to avoid overflow on negation."
            r4.<init>(r5)
            throw r4
        L22:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Step must be non-zero."
            r4.<init>(r5)
            throw r4
    }

    public final long getFirst() {
            r2 = this;
            long r0 = r2.first
            return r0
    }

    public final long getLast() {
            r2 = this;
            long r0 = r2.last
            return r0
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Long> iterator() {
            r1 = this;
            kotlin.collections.LongIterator r0 = r1.iterator2()
            return r0
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public java.util.Iterator<java.lang.Long> iterator2() {
            r8 = this;
            kotlin.ranges.LongProgressionIterator r7 = new kotlin.ranges.LongProgressionIterator
            long r1 = r8.first
            long r3 = r8.last
            long r5 = r8.step
            r0 = r7
            r0.<init>(r1, r3, r5)
            return r7
    }
}
