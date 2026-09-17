package kotlinx.coroutines.sync;

/* compiled from: Mutex.kt */
/* loaded from: classes2.dex */
public class MutexImpl extends kotlinx.coroutines.sync.SemaphoreImpl implements kotlinx.coroutines.sync.Mutex {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater owner$FU = null;
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> onSelectCancellationUnlockConstructor;
    private volatile java.lang.Object owner;

    /* compiled from: Mutex.kt */
    private final class CancellableContinuationWithOwner implements kotlinx.coroutines.CancellableContinuation<kotlin.Unit>, kotlinx.coroutines.Waiter {
        public final kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> cont;
        public final java.lang.Object owner;
        final /* synthetic */ kotlinx.coroutines.sync.MutexImpl this$0;

        public CancellableContinuationWithOwner(kotlinx.coroutines.sync.MutexImpl r1, kotlinx.coroutines.CancellableContinuationImpl<? super kotlin.Unit> r2, java.lang.Object r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.cont = r2
                r0.owner = r3
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean cancel(java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                boolean r2 = r0.cancel(r2)
                return r2
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void completeResume(java.lang.Object r2) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                r0.completeResume(r2)
                return
        }

        @Override // kotlin.coroutines.Continuation
        public kotlin.coroutines.CoroutineContext getContext() {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                kotlin.coroutines.CoroutineContext r0 = r0.getContext()
                return r0
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void invokeOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                r0.invokeOnCancellation(r2)
                return
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> r2, int r3) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                r0.invokeOnCancellation(r2, r3)
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ void resume(kotlin.Unit r1, kotlin.jvm.functions.Function1 r2) {
                r0 = this;
                kotlin.Unit r1 = (kotlin.Unit) r1
                r0.resume2(r1, r2)
                return
        }

        /* renamed from: resume, reason: avoid collision after fix types in other method */
        public void resume2(kotlin.Unit r3, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.MutexImpl.access$getOwner$FU$p()
                kotlinx.coroutines.sync.MutexImpl r0 = r2.this$0
                java.lang.Object r1 = r2.owner
                r4.set(r0, r1)
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r4 = r2.cont
                kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2 r0 = new kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2
                kotlinx.coroutines.sync.MutexImpl r1 = r2.this$0
                r0.<init>(r1, r2)
                r4.resume(r3, r0)
                return
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(java.lang.Object r2) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                r0.resumeWith(r2)
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ java.lang.Object tryResume(kotlin.Unit r1, java.lang.Object r2, kotlin.jvm.functions.Function1 r3) {
                r0 = this;
                kotlin.Unit r1 = (kotlin.Unit) r1
                java.lang.Object r1 = r0.tryResume2(r1, r2, r3)
                return r1
        }

        /* renamed from: tryResume, reason: avoid collision after fix types in other method */
        public java.lang.Object tryResume2(kotlin.Unit r3, java.lang.Object r4, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r5) {
                r2 = this;
                kotlinx.coroutines.sync.MutexImpl r5 = r2.this$0
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r2.cont
                kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1 r1 = new kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1
                r1.<init>(r5, r2)
                java.lang.Object r3 = r0.tryResume(r3, r4, r1)
                if (r3 == 0) goto L1a
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.MutexImpl.access$getOwner$FU$p()
                kotlinx.coroutines.sync.MutexImpl r5 = r2.this$0
                java.lang.Object r0 = r2.owner
                r4.set(r5, r0)
            L1a:
                return r3
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.sync.MutexImpl> r0 = kotlinx.coroutines.sync.MutexImpl.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "owner"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.sync.MutexImpl.owner$FU = r0
            return
    }

    public MutexImpl(boolean r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            if (r2 == 0) goto L8
            r2 = 0
            goto Lc
        L8:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
        Lc:
            r1.owner = r2
            kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1 r2 = new kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1
            r2.<init>(r1)
            r1.onSelectCancellationUnlockConstructor = r2
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater access$getOwner$FU$p() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl.owner$FU
            return r0
    }

    private final int holdsLockImpl(java.lang.Object r3) {
            r2 = this;
        L0:
            boolean r0 = r2.isLocked()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl.owner$FU
            java.lang.Object r0 = r0.get(r2)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
            if (r0 == r1) goto L0
            if (r0 != r3) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 2
        L19:
            return r3
    }

    static /* synthetic */ java.lang.Object lock$suspendImpl(kotlinx.coroutines.sync.MutexImpl r1, java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            boolean r0 = r1.tryLock(r2)
            if (r0 == 0) goto L9
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L9:
            java.lang.Object r1 = r1.lockSuspend(r2, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L14
            return r1
        L14:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private final java.lang.Object lockSuspend(java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)
            kotlinx.coroutines.CancellableContinuationImpl r0 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
            kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner r1 = new kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner     // Catch: java.lang.Throwable -> L27
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L27
            r2.acquire(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r3 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r0) goto L1d
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)
        L1d:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L24
            return r3
        L24:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L27:
            r3 = move-exception
            r0.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
            throw r3
    }

    private final int tryLockImpl(java.lang.Object r4) {
            r3 = this;
        L0:
            boolean r0 = r3.tryAcquire()
            if (r0 == 0) goto Ld
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl.owner$FU
            r0.set(r3, r4)
            r4 = 0
            return r4
        Ld:
            r0 = 1
            if (r4 != 0) goto L11
            return r0
        L11:
            int r1 = r3.holdsLockImpl(r4)
            r2 = 2
            if (r1 == r0) goto L1c
            if (r1 == r2) goto L1b
            goto L0
        L1b:
            return r0
        L1c:
            return r2
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
            r1 = this;
            int r0 = r1.getAvailablePermits()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public java.lang.Object lock(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            java.lang.Object r1 = lock$suspendImpl(r0, r1, r2)
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Mutex@"
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r1 = "[isLocked="
            r0.append(r1)
            boolean r1 = r2.isLocked()
            r0.append(r1)
            java.lang.String r1 = ",owner="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl.owner$FU
            java.lang.Object r1 = r1.get(r2)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean tryLock(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.tryLockImpl(r4)
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 == r1) goto L33
            r1 = 2
            if (r0 == r1) goto L18
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This mutex is already locked by the specified owner: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L33:
            r1 = 0
        L34:
            return r1
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(java.lang.Object r4) {
            r3 = this;
        L0:
            boolean r0 = r3.isLocked()
            if (r0 == 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl.owner$FU
            java.lang.Object r1 = r0.get(r3)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
            if (r1 == r2) goto L0
            if (r1 == r4) goto L19
            if (r4 != 0) goto L17
            goto L19
        L17:
            r2 = 0
            goto L1a
        L19:
            r2 = 1
        L1a:
            if (r2 == 0) goto L2a
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r1, r2)
            if (r0 == 0) goto L0
            r3.release()
            return
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "This mutex is locked by "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", but "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " is expected"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "This mutex is not locked"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }
}
