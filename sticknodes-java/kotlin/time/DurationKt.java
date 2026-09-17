package kotlin.time;

/* compiled from: Duration.kt */
/* loaded from: classes2.dex */
public final class DurationKt {
    public static final /* synthetic */ long access$durationOf(long r0, int r2) {
            long r0 = durationOf(r0, r2)
            return r0
    }

    public static final /* synthetic */ long access$durationOfMillis(long r0) {
            long r0 = durationOfMillis(r0)
            return r0
    }

    public static final /* synthetic */ long access$millisToNanos(long r0) {
            long r0 = millisToNanos(r0)
            return r0
    }

    private static final long durationOf(long r2, int r4) {
            r0 = 1
            long r2 = r2 << r0
            long r0 = (long) r4
            long r2 = r2 + r0
            long r2 = kotlin.time.Duration.m79constructorimpl(r2)
            return r2
    }

    private static final long durationOfMillis(long r2) {
            r0 = 1
            long r2 = r2 << r0
            r0 = 1
            long r2 = r2 + r0
            long r2 = kotlin.time.Duration.m79constructorimpl(r2)
            return r2
    }

    private static final long durationOfNanos(long r1) {
            r0 = 1
            long r1 = r1 << r0
            long r1 = kotlin.time.Duration.m79constructorimpl(r1)
            return r1
    }

    private static final long millisToNanos(long r2) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r2 = r2 * r0
            return r2
    }

    public static final long toDuration(int r2, kotlin.time.DurationUnit r3) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            int r0 = r3.compareTo(r0)
            if (r0 > 0) goto L19
            long r0 = (long) r2
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r2 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(r0, r3, r2)
            long r2 = durationOfNanos(r2)
            goto L1e
        L19:
            long r0 = (long) r2
            long r2 = toDuration(r0, r3)
        L1e:
            return r2
    }

    public static final long toDuration(long r7, kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            r1 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            long r1 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(r1, r0, r9)
            kotlin.ranges.LongRange r3 = new kotlin.ranges.LongRange
            long r4 = -r1
            r3.<init>(r4, r1)
            boolean r1 = r3.contains(r7)
            if (r1 == 0) goto L25
            long r7 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(r7, r9, r0)
            long r7 = durationOfNanos(r7)
            return r7
        L25:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r1 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(r7, r9, r0)
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r5 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r7 = kotlin.ranges.RangesKt.coerceIn(r1, r3, r5)
            long r7 = durationOfMillis(r7)
            return r7
    }
}
