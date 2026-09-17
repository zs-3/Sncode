package kotlin.time;

/* compiled from: DurationJvm.kt */
/* loaded from: classes2.dex */
public final class DurationJvmKt {
    private static final boolean durationAssertionsEnabled = false;
    private static final java.lang.ThreadLocal<java.text.DecimalFormat>[] precisionFormats = null;

    static {
            java.lang.Class<kotlin.time.Duration> r0 = kotlin.time.Duration.class
            r0 = 0
            kotlin.time.DurationJvmKt.durationAssertionsEnabled = r0
            r1 = 4
            java.lang.ThreadLocal[] r2 = new java.lang.ThreadLocal[r1]
        L8:
            if (r0 >= r1) goto L14
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r2[r0] = r3
            int r0 = r0 + 1
            goto L8
        L14:
            kotlin.time.DurationJvmKt.precisionFormats = r2
            return
    }

    public static final boolean getDurationAssertionsEnabled() {
            boolean r0 = kotlin.time.DurationJvmKt.durationAssertionsEnabled
            return r0
    }
}
