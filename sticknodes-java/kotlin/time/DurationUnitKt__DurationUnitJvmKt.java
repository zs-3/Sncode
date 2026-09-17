package kotlin.time;

/* compiled from: DurationUnitJvm.kt */
/* loaded from: classes2.dex */
class DurationUnitKt__DurationUnitJvmKt {
    public static final long convertDurationUnit(long r1, kotlin.time.DurationUnit r3, kotlin.time.DurationUnit r4) {
            java.lang.String r0 = "sourceUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "targetUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.concurrent.TimeUnit r4 = r4.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r3 = r3.getTimeUnit$kotlin_stdlib()
            long r1 = r4.convert(r1, r3)
            return r1
    }

    public static final long convertDurationUnitOverflow(long r1, kotlin.time.DurationUnit r3, kotlin.time.DurationUnit r4) {
            java.lang.String r0 = "sourceUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "targetUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.concurrent.TimeUnit r4 = r4.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r3 = r3.getTimeUnit$kotlin_stdlib()
            long r1 = r4.convert(r1, r3)
            return r1
    }
}
