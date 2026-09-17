package kotlinx.coroutines.sync;

/* compiled from: Semaphore.kt */
/* loaded from: classes2.dex */
final class SemaphoreSegment extends kotlinx.coroutines.internal.Segment<kotlinx.coroutines.sync.SemaphoreSegment> {
    private final java.util.concurrent.atomic.AtomicReferenceArray acquirers;

    public SemaphoreSegment(long r1, kotlinx.coroutines.sync.SemaphoreSegment r3, int r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            r1.<init>(r2)
            r0.acquirers = r1
            return
    }

    public final java.util.concurrent.atomic.AtomicReferenceArray getAcquirers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.acquirers
            return r0
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
            r1 = this;
            int r0 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            return r0
    }

    @Override // kotlinx.coroutines.internal.Segment
    public void onCancellation(int r1, java.lang.Throwable r2, kotlin.coroutines.CoroutineContext r3) {
            r0 = this;
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.SemaphoreKt.access$getCANCELLED$p()
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r0.getAcquirers()
            r3.set(r1, r2)
            r0.onSlotCleaned()
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SemaphoreSegment[id="
            r0.append(r1)
            long r1 = r3.id
            r0.append(r1)
            java.lang.String r1 = ", hashCode="
            r0.append(r1)
            int r1 = r3.hashCode()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
