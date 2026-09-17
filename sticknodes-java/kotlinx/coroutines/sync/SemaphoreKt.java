package kotlinx.coroutines.sync;

/* compiled from: Semaphore.kt */
/* loaded from: classes2.dex */
public final class SemaphoreKt {
    private static final kotlinx.coroutines.internal.Symbol BROKEN = null;
    private static final kotlinx.coroutines.internal.Symbol CANCELLED = null;
    private static final int MAX_SPIN_CYCLES = 0;
    private static final kotlinx.coroutines.internal.Symbol PERMIT = null;
    private static final int SEGMENT_SIZE = 0;
    private static final kotlinx.coroutines.internal.Symbol TAKEN = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.semaphore.maxSpinCycles"
            r1 = 100
            r2 = 0
            r3 = 0
            r4 = 12
            r5 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r0, r1, r2, r3, r4, r5)
            kotlinx.coroutines.sync.SemaphoreKt.MAX_SPIN_CYCLES = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "PERMIT"
            r0.<init>(r1)
            kotlinx.coroutines.sync.SemaphoreKt.PERMIT = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "TAKEN"
            r0.<init>(r1)
            kotlinx.coroutines.sync.SemaphoreKt.TAKEN = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "BROKEN"
            r0.<init>(r1)
            kotlinx.coroutines.sync.SemaphoreKt.BROKEN = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CANCELLED"
            r0.<init>(r1)
            kotlinx.coroutines.sync.SemaphoreKt.CANCELLED = r0
            java.lang.String r2 = "kotlinx.coroutines.semaphore.segmentSize"
            r3 = 16
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.sync.SemaphoreSegment access$createSegment(long r0, kotlinx.coroutines.sync.SemaphoreSegment r2) {
            kotlinx.coroutines.sync.SemaphoreSegment r0 = createSegment(r0, r2)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getBROKEN$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.BROKEN
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCANCELLED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.CANCELLED
            return r0
    }

    public static final /* synthetic */ int access$getMAX_SPIN_CYCLES$p() {
            int r0 = kotlinx.coroutines.sync.SemaphoreKt.MAX_SPIN_CYCLES
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getPERMIT$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.PERMIT
            return r0
    }

    public static final /* synthetic */ int access$getSEGMENT_SIZE$p() {
            int r0 = kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getTAKEN$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.TAKEN
            return r0
    }

    private static final kotlinx.coroutines.sync.SemaphoreSegment createSegment(long r2, kotlinx.coroutines.sync.SemaphoreSegment r4) {
            kotlinx.coroutines.sync.SemaphoreSegment r0 = new kotlinx.coroutines.sync.SemaphoreSegment
            r1 = 0
            r0.<init>(r2, r4, r1)
            return r0
    }
}
