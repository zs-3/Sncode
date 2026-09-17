package kotlin.time;

/* compiled from: DurationUnitJvm.kt */
/* loaded from: classes2.dex */
public enum DurationUnit extends java.lang.Enum<kotlin.time.DurationUnit> {
    private static final /* synthetic */ kotlin.time.DurationUnit[] $VALUES = null;
    public static final kotlin.time.DurationUnit DAYS = null;
    public static final kotlin.time.DurationUnit HOURS = null;
    public static final kotlin.time.DurationUnit MICROSECONDS = null;
    public static final kotlin.time.DurationUnit MILLISECONDS = null;
    public static final kotlin.time.DurationUnit MINUTES = null;
    public static final kotlin.time.DurationUnit NANOSECONDS = null;
    public static final kotlin.time.DurationUnit SECONDS = null;
    private final java.util.concurrent.TimeUnit timeUnit;

    private static final /* synthetic */ kotlin.time.DurationUnit[] $values() {
            r0 = 7
            kotlin.time.DurationUnit[] r0 = new kotlin.time.DurationUnit[r0]
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS
            r2 = 0
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MICROSECONDS
            r2 = 1
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MILLISECONDS
            r2 = 2
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS
            r2 = 3
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MINUTES
            r2 = 4
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.HOURS
            r2 = 5
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.DAYS
            r2 = 6
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.lang.String r2 = "NANOSECONDS"
            r3 = 0
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.NANOSECONDS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            java.lang.String r2 = "MICROSECONDS"
            r3 = 1
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.MICROSECONDS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r2 = "MILLISECONDS"
            r3 = 2
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.MILLISECONDS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r2 = "SECONDS"
            r3 = 3
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.SECONDS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES
            java.lang.String r2 = "MINUTES"
            r3 = 4
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.MINUTES = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS
            java.lang.String r2 = "HOURS"
            r3 = 5
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.HOURS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS
            java.lang.String r2 = "DAYS"
            r3 = 6
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.DAYS = r0
            kotlin.time.DurationUnit[] r0 = $values()
            kotlin.time.DurationUnit.$VALUES = r0
            return
    }

    DurationUnit(java.lang.String r1, int r2, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.timeUnit = r3
            return
    }

    public static kotlin.time.DurationUnit valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.time.DurationUnit> r0 = kotlin.time.DurationUnit.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.time.DurationUnit r1 = (kotlin.time.DurationUnit) r1
            return r1
    }

    public static kotlin.time.DurationUnit[] values() {
            kotlin.time.DurationUnit[] r0 = kotlin.time.DurationUnit.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.time.DurationUnit[] r0 = (kotlin.time.DurationUnit[]) r0
            return r0
    }

    public final java.util.concurrent.TimeUnit getTimeUnit$kotlin_stdlib() {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = r1.timeUnit
            return r0
    }
}
