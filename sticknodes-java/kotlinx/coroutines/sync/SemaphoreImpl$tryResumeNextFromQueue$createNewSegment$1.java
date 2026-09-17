package kotlinx.coroutines.sync;

/* compiled from: Semaphore.kt */
/* loaded from: classes2.dex */
/* synthetic */ class SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Long, kotlinx.coroutines.sync.SemaphoreSegment, kotlinx.coroutines.sync.SemaphoreSegment> {
    public static final kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 INSTANCE = null;

    static {
            kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 r0 = new kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1
            r0.<init>()
            kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE = r0
            return
    }

    SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1() {
            r6 = this;
            java.lang.Class<kotlinx.coroutines.sync.SemaphoreKt> r2 = kotlinx.coroutines.sync.SemaphoreKt.class
            r1 = 2
            java.lang.String r3 = "createSegment"
            java.lang.String r4 = "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;"
            r5 = 1
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ kotlinx.coroutines.sync.SemaphoreSegment invoke(java.lang.Long r3, kotlinx.coroutines.sync.SemaphoreSegment r4) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            kotlinx.coroutines.sync.SemaphoreSegment r4 = (kotlinx.coroutines.sync.SemaphoreSegment) r4
            kotlinx.coroutines.sync.SemaphoreSegment r3 = r2.invoke(r0, r4)
            return r3
    }

    public final kotlinx.coroutines.sync.SemaphoreSegment invoke(long r1, kotlinx.coroutines.sync.SemaphoreSegment r3) {
            r0 = this;
            kotlinx.coroutines.sync.SemaphoreSegment r1 = kotlinx.coroutines.sync.SemaphoreKt.access$createSegment(r1, r3)
            return r1
    }
}
