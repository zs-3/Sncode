package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public class JobSupport implements kotlinx.coroutines.Job, kotlinx.coroutines.ChildJob, kotlinx.coroutines.ParentJob {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _parentHandle$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    private volatile java.lang.Object _parentHandle;
    private volatile java.lang.Object _state;

    /* compiled from: JobSupport.kt */
    private static final class AwaitContinuation<T> extends kotlinx.coroutines.CancellableContinuationImpl<T> {
        private final kotlinx.coroutines.JobSupport job;

        public AwaitContinuation(kotlin.coroutines.Continuation<? super T> r2, kotlinx.coroutines.JobSupport r3) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                r1.job = r3
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job r3) {
                r2 = this;
                kotlinx.coroutines.JobSupport r0 = r2.job
                java.lang.Object r0 = r0.getState$kotlinx_coroutines_core()
                boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
                if (r1 == 0) goto L14
                r1 = r0
                kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
                java.lang.Throwable r1 = r1.getRootCause()
                if (r1 == 0) goto L14
                return r1
            L14:
                boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
                if (r1 == 0) goto L1d
                kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
                java.lang.Throwable r3 = r0.cause
                return r3
            L1d:
                java.util.concurrent.CancellationException r3 = r3.getCancellationException()
                return r3
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        protected java.lang.String nameString() {
                r1 = this;
                java.lang.String r0 = "AwaitContinuation"
                return r0
        }
    }

    /* compiled from: JobSupport.kt */
    private static final class ChildCompletion extends kotlinx.coroutines.JobNode {
        private final kotlinx.coroutines.ChildHandleNode child;
        private final kotlinx.coroutines.JobSupport parent;
        private final java.lang.Object proposedUpdate;
        private final kotlinx.coroutines.JobSupport.Finishing state;

        public ChildCompletion(kotlinx.coroutines.JobSupport r1, kotlinx.coroutines.JobSupport.Finishing r2, kotlinx.coroutines.ChildHandleNode r3, java.lang.Object r4) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.state = r2
                r0.child = r3
                r0.proposedUpdate = r4
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable r4) {
                r3 = this;
                kotlinx.coroutines.JobSupport r4 = r3.parent
                kotlinx.coroutines.JobSupport$Finishing r0 = r3.state
                kotlinx.coroutines.ChildHandleNode r1 = r3.child
                java.lang.Object r2 = r3.proposedUpdate
                kotlinx.coroutines.JobSupport.access$continueCompleting(r4, r0, r1, r2)
                return
        }
    }

    /* compiled from: JobSupport.kt */
    private static final class Finishing implements kotlinx.coroutines.Incomplete {
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _exceptionsHolder$FU = null;
        private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isCompleting$FU = null;
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _rootCause$FU = null;
        private volatile java.lang.Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile java.lang.Object _rootCause;
        private final kotlinx.coroutines.NodeList list;

        static {
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                java.lang.Class<kotlinx.coroutines.JobSupport$Finishing> r1 = kotlinx.coroutines.JobSupport.Finishing.class
                java.lang.String r2 = "_isCompleting"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r2)
                kotlinx.coroutines.JobSupport.Finishing._isCompleting$FU = r2
                java.lang.String r2 = "_rootCause"
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
                kotlinx.coroutines.JobSupport.Finishing._rootCause$FU = r2
                java.lang.String r2 = "_exceptionsHolder"
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
                kotlinx.coroutines.JobSupport.Finishing._exceptionsHolder$FU = r0
                return
        }

        public Finishing(kotlinx.coroutines.NodeList r1, boolean r2, java.lang.Throwable r3) {
                r0 = this;
                r0.<init>()
                r0.list = r1
                r0._isCompleting = r2
                r0._rootCause = r3
                return
        }

        private final java.util.ArrayList<java.lang.Throwable> allocateList() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 4
                r0.<init>(r1)
                return r0
        }

        private final java.lang.Object getExceptionsHolder() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport.Finishing._exceptionsHolder$FU
                java.lang.Object r0 = r0.get(r1)
                return r0
        }

        private final void setExceptionsHolder(java.lang.Object r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport.Finishing._exceptionsHolder$FU
                r0.set(r1, r2)
                return
        }

        public final void addExceptionLocked(java.lang.Throwable r4) {
                r3 = this;
                java.lang.Throwable r0 = r3.getRootCause()
                if (r0 != 0) goto La
                r3.setRootCause(r4)
                return
            La:
                if (r4 != r0) goto Ld
                return
            Ld:
                java.lang.Object r0 = r3.getExceptionsHolder()
                if (r0 != 0) goto L17
                r3.setExceptionsHolder(r4)
                goto L35
            L17:
                boolean r1 = r0 instanceof java.lang.Throwable
                if (r1 == 0) goto L2c
                if (r4 != r0) goto L1e
                return
            L1e:
                java.util.ArrayList r1 = r3.allocateList()
                r1.add(r0)
                r1.add(r4)
                r3.setExceptionsHolder(r1)
                goto L35
            L2c:
                boolean r1 = r0 instanceof java.util.ArrayList
                if (r1 == 0) goto L36
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.add(r4)
            L35:
                return
            L36:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "State is "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
        }

        @Override // kotlinx.coroutines.Incomplete
        public kotlinx.coroutines.NodeList getList() {
                r1 = this;
                kotlinx.coroutines.NodeList r0 = r1.list
                return r0
        }

        public final java.lang.Throwable getRootCause() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport.Finishing._rootCause$FU
                java.lang.Object r0 = r0.get(r1)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                return r0
        }

        @Override // kotlinx.coroutines.Incomplete
        public boolean isActive() {
                r1 = this;
                java.lang.Throwable r0 = r1.getRootCause()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isCancelling() {
                r1 = this;
                java.lang.Throwable r0 = r1.getRootCause()
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isCompleting() {
                r1 = this;
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.JobSupport.Finishing._isCompleting$FU
                int r0 = r0.get(r1)
                if (r0 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        public final boolean isSealed() {
                r2 = this;
                java.lang.Object r0 = r2.getExceptionsHolder()
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getSEALED$p()
                if (r0 != r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public final java.util.List<java.lang.Throwable> sealLocked(java.lang.Throwable r4) {
                r3 = this;
                java.lang.Object r0 = r3.getExceptionsHolder()
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = r3.allocateList()
                goto L1e
            Lb:
                boolean r1 = r0 instanceof java.lang.Throwable
                if (r1 == 0) goto L18
                java.util.ArrayList r1 = r3.allocateList()
                r1.add(r0)
                r0 = r1
                goto L1e
            L18:
                boolean r1 = r0 instanceof java.util.ArrayList
                if (r1 == 0) goto L3b
                java.util.ArrayList r0 = (java.util.ArrayList) r0
            L1e:
                java.lang.Throwable r1 = r3.getRootCause()
                if (r1 == 0) goto L28
                r2 = 0
                r0.add(r2, r1)
            L28:
                if (r4 == 0) goto L33
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r1)
                if (r1 != 0) goto L33
                r0.add(r4)
            L33:
                kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getSEALED$p()
                r3.setExceptionsHolder(r4)
                return r0
            L3b:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "State is "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
        }

        public final void setCompleting(boolean r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.JobSupport.Finishing._isCompleting$FU
                r0.set(r1, r2)
                return
        }

        public final void setRootCause(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport.Finishing._rootCause$FU
                r0.set(r1, r2)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Finishing[cancelling="
                r0.append(r1)
                boolean r1 = r2.isCancelling()
                r0.append(r1)
                java.lang.String r1 = ", completing="
                r0.append(r1)
                boolean r1 = r2.isCompleting()
                r0.append(r1)
                java.lang.String r1 = ", rootCause="
                r0.append(r1)
                java.lang.Throwable r1 = r2.getRootCause()
                r0.append(r1)
                java.lang.String r1 = ", exceptions="
                r0.append(r1)
                java.lang.Object r1 = r2.getExceptionsHolder()
                r0.append(r1)
                java.lang.String r1 = ", list="
                r0.append(r1)
                kotlinx.coroutines.NodeList r1 = r2.getList()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<kotlinx.coroutines.JobSupport> r1 = kotlinx.coroutines.JobSupport.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.JobSupport._state$FU = r2
            java.lang.String r2 = "_parentHandle"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.JobSupport._parentHandle$FU = r0
            return
    }

    public JobSupport(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            kotlinx.coroutines.Empty r1 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
            goto Le
        La:
            kotlinx.coroutines.Empty r1 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_NEW$p()
        Le:
            r0._state = r1
            return
    }

    public static final /* synthetic */ java.lang.String access$cancellationExceptionMessage(kotlinx.coroutines.JobSupport r0) {
            java.lang.String r0 = r0.cancellationExceptionMessage()
            return r0
    }

    public static final /* synthetic */ void access$continueCompleting(kotlinx.coroutines.JobSupport r0, kotlinx.coroutines.JobSupport.Finishing r1, kotlinx.coroutines.ChildHandleNode r2, java.lang.Object r3) {
            r0.continueCompleting(r1, r2, r3)
            return
    }

    private final boolean addLastAtomic(java.lang.Object r3, kotlinx.coroutines.NodeList r4, kotlinx.coroutines.JobNode r5) {
            r2 = this;
            kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1 r0 = new kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1
            r0.<init>(r5, r2, r3)
        L5:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r4.getPrevNode()
            int r3 = r3.tryCondAddNext(r5, r4, r0)
            r1 = 1
            if (r3 == r1) goto L15
            r1 = 2
            if (r3 == r1) goto L14
            goto L5
        L14:
            r1 = 0
        L15:
            return r1
    }

    private final void addSuppressedExceptions(java.lang.Throwable r4, java.util.List<? extends java.lang.Throwable> r5) {
            r3 = this;
            int r0 = r5.size()
            r1 = 1
            if (r0 > r1) goto L8
            return
        L8:
            int r0 = r5.size()
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>(r0)
            java.util.Set r0 = java.util.Collections.newSetFromMap(r1)
            java.util.Iterator r5 = r5.iterator()
        L19:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r5.next()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == r4) goto L19
            if (r1 == r4) goto L19
            boolean r2 = r1 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L19
            boolean r2 = r0.add(r1)
            if (r2 == 0) goto L19
            kotlin.ExceptionsKt.addSuppressed(r4, r1)
            goto L19
        L37:
            return
    }

    private final java.lang.Object awaitSuspend(kotlin.coroutines.Continuation<java.lang.Object> r3) {
            r2 = this;
            kotlinx.coroutines.JobSupport$AwaitContinuation r0 = new kotlinx.coroutines.JobSupport$AwaitContinuation
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r3)
            r0.<init>(r1, r2)
            r0.initCancellability()
            kotlinx.coroutines.ResumeAwaitOnCompletion r1 = new kotlinx.coroutines.ResumeAwaitOnCompletion
            r1.<init>(r0)
            kotlinx.coroutines.DisposableHandle r1 = r2.invokeOnCompletion(r1)
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r0, r1)
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L25
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r3)
        L25:
            return r0
    }

    private final java.lang.Object cancelMakeCompleting(java.lang.Object r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = r6.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 == 0) goto L2d
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r1 == 0) goto L16
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            boolean r1 = r1.isCompleting()
            if (r1 == 0) goto L16
            goto L2d
        L16:
            kotlinx.coroutines.CompletedExceptionally r1 = new kotlinx.coroutines.CompletedExceptionally
            java.lang.Throwable r2 = r6.createCauseException(r7)
            r3 = 0
            r4 = 2
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            java.lang.Object r0 = r6.tryMakeCompleting(r0, r1)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r0 == r1) goto L0
            return r0
        L2d:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r7
    }

    private final boolean cancelParent(java.lang.Throwable r5) {
            r4 = this;
            boolean r0 = r4.isScopedCoroutine()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            kotlinx.coroutines.ChildHandle r2 = r4.getParentHandle$kotlinx_coroutines_core()
            if (r2 == 0) goto L20
            kotlinx.coroutines.NonDisposableHandle r3 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r2 != r3) goto L15
            goto L20
        L15:
            boolean r5 = r2.childCancelled(r5)
            if (r5 != 0) goto L1f
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
        L20:
            return r0
    }

    private final void completeStateFinalization(kotlinx.coroutines.Incomplete r4, java.lang.Object r5) {
            r3 = this;
            kotlinx.coroutines.ChildHandle r0 = r3.getParentHandle$kotlinx_coroutines_core()
            if (r0 == 0) goto Le
            r0.dispose()
            kotlinx.coroutines.NonDisposableHandle r0 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r3.setParentHandle$kotlinx_coroutines_core(r0)
        Le:
            boolean r0 = r5 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L16
            kotlinx.coroutines.CompletedExceptionally r5 = (kotlinx.coroutines.CompletedExceptionally) r5
            goto L17
        L16:
            r5 = r1
        L17:
            if (r5 == 0) goto L1b
            java.lang.Throwable r1 = r5.cause
        L1b:
            boolean r5 = r4 instanceof kotlinx.coroutines.JobNode
            if (r5 == 0) goto L49
            r5 = r4
            kotlinx.coroutines.JobNode r5 = (kotlinx.coroutines.JobNode) r5     // Catch: java.lang.Throwable -> L26
            r5.invoke(r1)     // Catch: java.lang.Throwable -> L26
            goto L52
        L26:
            r5 = move-exception
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in completion handler "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " for "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r5)
            r3.handleOnCompletionException$kotlinx_coroutines_core(r0)
            goto L52
        L49:
            kotlinx.coroutines.NodeList r4 = r4.getList()
            if (r4 == 0) goto L52
            r3.notifyCompletion(r4, r1)
        L52:
            return
    }

    private final void continueCompleting(kotlinx.coroutines.JobSupport.Finishing r1, kotlinx.coroutines.ChildHandleNode r2, java.lang.Object r3) {
            r0 = this;
            kotlinx.coroutines.ChildHandleNode r2 = r0.nextChild(r2)
            if (r2 == 0) goto Ld
            boolean r2 = r0.tryWaitForChild(r1, r2, r3)
            if (r2 == 0) goto Ld
            return
        Ld:
            java.lang.Object r1 = r0.finalizeFinishingState(r1, r3)
            r0.afterCompletion(r1)
            return
    }

    private final java.lang.Throwable createCauseException(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r0 = 1
            goto L6
        L4:
            boolean r0 = r3 instanceof java.lang.Throwable
        L6:
            if (r0 == 0) goto L18
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 != 0) goto L23
            r3 = 0
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r1 = access$cancellationExceptionMessage(r2)
            r0.<init>(r1, r3, r2)
            r3 = r0
            goto L23
        L18:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)
            kotlinx.coroutines.ParentJob r3 = (kotlinx.coroutines.ParentJob) r3
            java.util.concurrent.CancellationException r3 = r3.getChildJobCancellationCause()
        L23:
            return r3
    }

    private final java.lang.Object finalizeFinishingState(kotlinx.coroutines.JobSupport.Finishing r6, java.lang.Object r7) {
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r7
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r0.cause
            goto L10
        Lf:
            r0 = r1
        L10:
            monitor-enter(r6)
            boolean r2 = r6.isCancelling()     // Catch: java.lang.Throwable -> L61
            java.util.List r3 = r6.sealLocked(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.Throwable r4 = r5.getFinalRootCause(r6, r3)     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L22
            r5.addSuppressedExceptions(r4, r3)     // Catch: java.lang.Throwable -> L61
        L22:
            monitor-exit(r6)
            r3 = 0
            if (r4 != 0) goto L27
            goto L30
        L27:
            if (r4 != r0) goto L2a
            goto L30
        L2a:
            kotlinx.coroutines.CompletedExceptionally r7 = new kotlinx.coroutines.CompletedExceptionally
            r0 = 2
            r7.<init>(r4, r3, r0, r1)
        L30:
            if (r4 == 0) goto L4c
            boolean r0 = r5.cancelParent(r4)
            if (r0 != 0) goto L3e
            boolean r0 = r5.handleJobException(r4)
            if (r0 == 0) goto L3f
        L3e:
            r3 = 1
        L3f:
            if (r3 == 0) goto L4c
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r0)
            r0 = r7
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            r0.makeHandled()
        L4c:
            if (r2 != 0) goto L51
            r5.onCancelling(r4)
        L51:
            r5.onCompletionInternal(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.boxIncomplete(r7)
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r5, r6, r1)
            r5.completeStateFinalization(r6, r7)
            return r7
        L61:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    private final kotlinx.coroutines.ChildHandleNode firstChild(kotlinx.coroutines.Incomplete r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.ChildHandleNode
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            kotlinx.coroutines.ChildHandleNode r0 = (kotlinx.coroutines.ChildHandleNode) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto L17
            kotlinx.coroutines.NodeList r3 = r3.getList()
            if (r3 == 0) goto L18
            kotlinx.coroutines.ChildHandleNode r1 = r2.nextChild(r3)
            goto L18
        L17:
            r1 = r0
        L18:
            return r1
    }

    private final java.lang.Throwable getExceptionOrNull(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L8
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 == 0) goto Ld
            java.lang.Throwable r1 = r3.cause
        Ld:
            return r1
    }

    private final java.lang.Throwable getFinalRootCause(kotlinx.coroutines.JobSupport.Finishing r4, java.util.List<? extends java.lang.Throwable> r5) {
            r3 = this;
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L18
            boolean r4 = r4.isCancelling()
            if (r4 == 0) goto L17
            kotlinx.coroutines.JobCancellationException r4 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r5 = access$cancellationExceptionMessage(r3)
            r4.<init>(r5, r1, r3)
            return r4
        L17:
            return r1
        L18:
            java.util.Iterator r4 = r5.iterator()
        L1c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r4.next()
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r2 = r2 instanceof java.util.concurrent.CancellationException
            r2 = r2 ^ 1
            if (r2 == 0) goto L1c
            r1 = r0
        L30:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L35
            return r1
        L35:
            r4 = 0
            java.lang.Object r4 = r5.get(r4)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            return r4
    }

    private final kotlinx.coroutines.NodeList getOrPromoteCancellingList(kotlinx.coroutines.Incomplete r4) {
            r3 = this;
            kotlinx.coroutines.NodeList r0 = r4.getList()
            if (r0 != 0) goto L36
            boolean r0 = r4 instanceof kotlinx.coroutines.Empty
            if (r0 == 0) goto L10
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            goto L36
        L10:
            boolean r0 = r4 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L1b
            kotlinx.coroutines.JobNode r4 = (kotlinx.coroutines.JobNode) r4
            r3.promoteSingleToNodeList(r4)
            r0 = 0
            goto L36
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "State should have list: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L36:
            return r0
    }

    private final java.lang.Object makeCancelling(java.lang.Object r7) {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r6.getState$kotlinx_coroutines_core()
            boolean r3 = r2 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r3 == 0) goto L51
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3     // Catch: java.lang.Throwable -> L4e
            boolean r3 = r3.isSealed()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L1a
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r2)
            return r7
        L1a:
            r3 = r2
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3     // Catch: java.lang.Throwable -> L4e
            boolean r3 = r3.isCancelling()     // Catch: java.lang.Throwable -> L4e
            if (r7 != 0) goto L25
            if (r3 != 0) goto L31
        L25:
            if (r1 != 0) goto L2b
            java.lang.Throwable r1 = r6.createCauseException(r7)     // Catch: java.lang.Throwable -> L4e
        L2b:
            r7 = r2
            kotlinx.coroutines.JobSupport$Finishing r7 = (kotlinx.coroutines.JobSupport.Finishing) r7     // Catch: java.lang.Throwable -> L4e
            r7.addExceptionLocked(r1)     // Catch: java.lang.Throwable -> L4e
        L31:
            r7 = r2
            kotlinx.coroutines.JobSupport$Finishing r7 = (kotlinx.coroutines.JobSupport.Finishing) r7     // Catch: java.lang.Throwable -> L4e
            java.lang.Throwable r7 = r7.getRootCause()     // Catch: java.lang.Throwable -> L4e
            r1 = r3 ^ 1
            if (r1 == 0) goto L3d
            r0 = r7
        L3d:
            monitor-exit(r2)
            if (r0 == 0) goto L49
            kotlinx.coroutines.JobSupport$Finishing r2 = (kotlinx.coroutines.JobSupport.Finishing) r2
            kotlinx.coroutines.NodeList r7 = r2.getList()
            r6.notifyCancelling(r7, r0)
        L49:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r7
        L4e:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L51:
            boolean r3 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r3 == 0) goto La2
            if (r1 != 0) goto L5b
            java.lang.Throwable r1 = r6.createCauseException(r7)
        L5b:
            r3 = r2
            kotlinx.coroutines.Incomplete r3 = (kotlinx.coroutines.Incomplete) r3
            boolean r4 = r3.isActive()
            if (r4 == 0) goto L6f
            boolean r2 = r6.tryMakeCancelling(r3, r1)
            if (r2 == 0) goto L2
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r7
        L6f:
            kotlinx.coroutines.CompletedExceptionally r3 = new kotlinx.coroutines.CompletedExceptionally
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.tryMakeCompleting(r2, r3)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r3 == r4) goto L87
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r3 == r2) goto L2
            return r3
        L87:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        La2:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()
            return r7
    }

    private final kotlinx.coroutines.JobNode makeNode(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2, boolean r3) {
            r1 = this;
            r0 = 0
            if (r3 == 0) goto L12
            boolean r3 = r2 instanceof kotlinx.coroutines.JobCancellingNode
            if (r3 == 0) goto La
            r0 = r2
            kotlinx.coroutines.JobCancellingNode r0 = (kotlinx.coroutines.JobCancellingNode) r0
        La:
            if (r0 != 0) goto L21
            kotlinx.coroutines.InvokeOnCancelling r0 = new kotlinx.coroutines.InvokeOnCancelling
            r0.<init>(r2)
            goto L21
        L12:
            boolean r3 = r2 instanceof kotlinx.coroutines.JobNode
            if (r3 == 0) goto L19
            r0 = r2
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
        L19:
            if (r0 == 0) goto L1c
            goto L21
        L1c:
            kotlinx.coroutines.InvokeOnCompletion r0 = new kotlinx.coroutines.InvokeOnCompletion
            r0.<init>(r2)
        L21:
            r0.setJob(r1)
            return r0
    }

    private final kotlinx.coroutines.ChildHandleNode nextChild(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            r1 = this;
        L0:
            boolean r0 = r2.isRemoved()
            if (r0 == 0) goto Lb
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r2.getPrevNode()
            goto L0
        Lb:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r2.getNextNode()
            boolean r0 = r2.isRemoved()
            if (r0 != 0) goto Lb
            boolean r0 = r2 instanceof kotlinx.coroutines.ChildHandleNode
            if (r0 == 0) goto L1c
            kotlinx.coroutines.ChildHandleNode r2 = (kotlinx.coroutines.ChildHandleNode) r2
            return r2
        L1c:
            boolean r0 = r2 instanceof kotlinx.coroutines.NodeList
            if (r0 == 0) goto Lb
            r2 = 0
            return r2
    }

    private final void notifyCancelling(kotlinx.coroutines.NodeList r7, java.lang.Throwable r8) {
            r6 = this;
            r6.onCancelling(r8)
            java.lang.Object r0 = r7.getNext()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
        Lf:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
            if (r2 != 0) goto L4c
            boolean r2 = r0 instanceof kotlinx.coroutines.JobCancellingNode
            if (r2 == 0) goto L47
            r2 = r0
            kotlinx.coroutines.JobNode r2 = (kotlinx.coroutines.JobNode) r2
            r2.invoke(r8)     // Catch: java.lang.Throwable -> L20
            goto L47
        L20:
            r3 = move-exception
            if (r1 == 0) goto L27
            kotlin.ExceptionsKt.addSuppressed(r1, r3)
            goto L47
        L27:
            kotlinx.coroutines.CompletionHandlerException r1 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Exception in completion handler "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " for "
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r3)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L47:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto Lf
        L4c:
            if (r1 == 0) goto L51
            r6.handleOnCompletionException$kotlinx_coroutines_core(r1)
        L51:
            r6.cancelParent(r8)
            return
    }

    private final void notifyCompletion(kotlinx.coroutines.NodeList r7, java.lang.Throwable r8) {
            r6 = this;
            java.lang.Object r0 = r7.getNext()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
        Lc:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
            if (r2 != 0) goto L49
            boolean r2 = r0 instanceof kotlinx.coroutines.JobNode
            if (r2 == 0) goto L44
            r2 = r0
            kotlinx.coroutines.JobNode r2 = (kotlinx.coroutines.JobNode) r2
            r2.invoke(r8)     // Catch: java.lang.Throwable -> L1d
            goto L44
        L1d:
            r3 = move-exception
            if (r1 == 0) goto L24
            kotlin.ExceptionsKt.addSuppressed(r1, r3)
            goto L44
        L24:
            kotlinx.coroutines.CompletionHandlerException r1 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Exception in completion handler "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " for "
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r3)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L44:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto Lc
        L49:
            if (r1 == 0) goto L4e
            r6.handleOnCompletionException$kotlinx_coroutines_core(r1)
        L4e:
            return
    }

    private final void promoteEmptyToNodeList(kotlinx.coroutines.Empty r3) {
            r2 = this;
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            boolean r1 = r3.isActive()
            if (r1 == 0) goto Lc
            goto L12
        Lc:
            kotlinx.coroutines.InactiveNodeList r1 = new kotlinx.coroutines.InactiveNodeList
            r1.<init>(r0)
            r0 = r1
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.JobSupport._state$FU
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r2, r3, r0)
            return
    }

    private final void promoteSingleToNodeList(kotlinx.coroutines.JobNode r3) {
            r2 = this;
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            r3.addOneIfEmpty(r0)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r3.getNextNode()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.JobSupport._state$FU
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r2, r3, r0)
            return
    }

    private final int startInternal(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.Empty
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L22
            r0 = r5
            kotlinx.coroutines.Empty r0 = (kotlinx.coroutines.Empty) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L11
            return r3
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            kotlinx.coroutines.Empty r3 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r4, r5, r3)
            if (r5 != 0) goto L1e
            return r1
        L1e:
            r4.onStart()
            return r2
        L22:
            boolean r0 = r5 instanceof kotlinx.coroutines.InactiveNodeList
            if (r0 == 0) goto L3a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            r3 = r5
            kotlinx.coroutines.InactiveNodeList r3 = (kotlinx.coroutines.InactiveNodeList) r3
            kotlinx.coroutines.NodeList r3 = r3.getList()
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r4, r5, r3)
            if (r5 != 0) goto L36
            return r1
        L36:
            r4.onStart()
            return r2
        L3a:
            return r3
    }

    private final java.lang.String stateString(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.JobSupport.Finishing
            java.lang.String r1 = "Active"
            if (r0 == 0) goto L1a
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3
            boolean r0 = r3.isCancelling()
            if (r0 == 0) goto L11
            java.lang.String r1 = "Cancelling"
            goto L33
        L11:
            boolean r3 = r3.isCompleting()
            if (r3 == 0) goto L33
            java.lang.String r1 = "Completing"
            goto L33
        L1a:
            boolean r0 = r3 instanceof kotlinx.coroutines.Incomplete
            if (r0 == 0) goto L2a
            kotlinx.coroutines.Incomplete r3 = (kotlinx.coroutines.Incomplete) r3
            boolean r3 = r3.isActive()
            if (r3 == 0) goto L27
            goto L33
        L27:
            java.lang.String r1 = "New"
            goto L33
        L2a:
            boolean r3 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 == 0) goto L31
            java.lang.String r1 = "Cancelled"
            goto L33
        L31:
            java.lang.String r1 = "Completed"
        L33:
            return r1
    }

    public static /* synthetic */ java.util.concurrent.CancellationException toCancellationException$default(kotlinx.coroutines.JobSupport r0, java.lang.Throwable r1, java.lang.String r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 1
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            java.util.concurrent.CancellationException r0 = r0.toCancellationException(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: toCancellationException"
            r0.<init>(r1)
            throw r0
    }

    private final boolean tryFinalizeSimpleState(kotlinx.coroutines.Incomplete r3, java.lang.Object r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.boxIncomplete(r4)
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r3, r1)
            if (r0 != 0) goto Le
            r3 = 0
            return r3
        Le:
            r0 = 0
            r2.onCancelling(r0)
            r2.onCompletionInternal(r4)
            r2.completeStateFinalization(r3, r4)
            r3 = 1
            return r3
    }

    private final boolean tryMakeCancelling(kotlinx.coroutines.Incomplete r5, java.lang.Throwable r6) {
            r4 = this;
            kotlinx.coroutines.NodeList r0 = r4.getOrPromoteCancellingList(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlinx.coroutines.JobSupport$Finishing r2 = new kotlinx.coroutines.JobSupport$Finishing
            r2.<init>(r0, r1, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.JobSupport._state$FU
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r4, r5, r2)
            if (r5 != 0) goto L16
            return r1
        L16:
            r4.notifyCancelling(r0, r6)
            r5 = 1
            return r5
    }

    private final java.lang.Object tryMakeCompleting(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r0 != 0) goto L9
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r2
        L9:
            boolean r0 = r2 instanceof kotlinx.coroutines.Empty
            if (r0 != 0) goto L11
            boolean r0 = r2 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L27
        L11:
            boolean r0 = r2 instanceof kotlinx.coroutines.ChildHandleNode
            if (r0 != 0) goto L27
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 != 0) goto L27
            kotlinx.coroutines.Incomplete r2 = (kotlinx.coroutines.Incomplete) r2
            boolean r2 = r1.tryFinalizeSimpleState(r2, r3)
            if (r2 == 0) goto L22
            return r3
        L22:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            return r2
        L27:
            kotlinx.coroutines.Incomplete r2 = (kotlinx.coroutines.Incomplete) r2
            java.lang.Object r2 = r1.tryMakeCompletingSlowPath(r2, r3)
            return r2
    }

    private final java.lang.Object tryMakeCompletingSlowPath(kotlinx.coroutines.Incomplete r9, java.lang.Object r10) {
            r8 = this;
            kotlinx.coroutines.NodeList r0 = r8.getOrPromoteCancellingList(r9)
            if (r0 != 0) goto Lb
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            return r9
        Lb:
            boolean r1 = r9 instanceof kotlinx.coroutines.JobSupport.Finishing
            r2 = 0
            if (r1 == 0) goto L14
            r1 = r9
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            goto L15
        L14:
            r1 = r2
        L15:
            r3 = 0
            if (r1 != 0) goto L1d
            kotlinx.coroutines.JobSupport$Finishing r1 = new kotlinx.coroutines.JobSupport$Finishing
            r1.<init>(r0, r3, r2)
        L1d:
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            monitor-enter(r1)
            boolean r5 = r1.isCompleting()     // Catch: java.lang.Throwable -> L8a
            if (r5 == 0) goto L2f
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r1)
            return r9
        L2f:
            r5 = 1
            r1.setCompleting(r5)     // Catch: java.lang.Throwable -> L8a
            if (r1 == r9) goto L43
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.JobSupport._state$FU     // Catch: java.lang.Throwable -> L8a
            boolean r6 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r6, r8, r9, r1)     // Catch: java.lang.Throwable -> L8a
            if (r6 != 0) goto L43
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r1)
            return r9
        L43:
            boolean r6 = r1.isCancelling()     // Catch: java.lang.Throwable -> L8a
            boolean r7 = r10 instanceof kotlinx.coroutines.CompletedExceptionally     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L4f
            r7 = r10
            kotlinx.coroutines.CompletedExceptionally r7 = (kotlinx.coroutines.CompletedExceptionally) r7     // Catch: java.lang.Throwable -> L8a
            goto L50
        L4f:
            r7 = r2
        L50:
            if (r7 == 0) goto L57
            java.lang.Throwable r7 = r7.cause     // Catch: java.lang.Throwable -> L8a
            r1.addExceptionLocked(r7)     // Catch: java.lang.Throwable -> L8a
        L57:
            java.lang.Throwable r7 = r1.getRootCause()     // Catch: java.lang.Throwable -> L8a
            if (r6 != 0) goto L5e
            r3 = 1
        L5e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L8a
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L8a
            if (r3 == 0) goto L69
            r2 = r7
        L69:
            r4.element = r2     // Catch: java.lang.Throwable -> L8a
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r1)
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r2 == 0) goto L76
            r8.notifyCancelling(r0, r2)
        L76:
            kotlinx.coroutines.ChildHandleNode r9 = r8.firstChild(r9)
            if (r9 == 0) goto L85
            boolean r9 = r8.tryWaitForChild(r1, r9, r10)
            if (r9 == 0) goto L85
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            return r9
        L85:
            java.lang.Object r9 = r8.finalizeFinishingState(r1, r10)
            return r9
        L8a:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
    }

    private final boolean tryWaitForChild(kotlinx.coroutines.JobSupport.Finishing r7, kotlinx.coroutines.ChildHandleNode r8, java.lang.Object r9) {
            r6 = this;
        L0:
            kotlinx.coroutines.ChildJob r0 = r8.childJob
            r1 = 0
            r2 = 0
            kotlinx.coroutines.JobSupport$ChildCompletion r3 = new kotlinx.coroutines.JobSupport$ChildCompletion
            r3.<init>(r6, r7, r8, r9)
            r4 = 1
            r5 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r0, r1, r2, r3, r4, r5)
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r0 == r1) goto L15
            r7 = 1
            return r7
        L15:
            kotlinx.coroutines.ChildHandleNode r8 = r6.nextChild(r8)
            if (r8 != 0) goto L0
            r7 = 0
            return r7
    }

    protected void afterCompletion(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.ChildHandle attachChild(kotlinx.coroutines.ChildJob r7) {
            r6 = this;
            kotlinx.coroutines.ChildHandleNode r3 = new kotlinx.coroutines.ChildHandleNode
            r3.<init>(r7)
            r1 = 1
            r2 = 0
            r4 = 2
            r5 = 0
            r0 = r6
            kotlinx.coroutines.DisposableHandle r7 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r0)
            kotlinx.coroutines.ChildHandle r7 = (kotlinx.coroutines.ChildHandle) r7
            return r7
    }

    protected final java.lang.Object awaitInternal(kotlin.coroutines.Continuation<java.lang.Object> r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L16
            boolean r3 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 != 0) goto L11
            java.lang.Object r3 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            return r3
        L11:
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r3 = r0.cause
            throw r3
        L16:
            int r0 = r2.startInternal(r0)
            if (r0 < 0) goto L0
            java.lang.Object r3 = r2.awaitSuspend(r3)
            return r3
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(java.util.concurrent.CancellationException r3) {
            r2 = this;
            if (r3 != 0) goto Ld
            r3 = 0
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r1 = access$cancellationExceptionMessage(r2)
            r0.<init>(r1, r3, r2)
            r3 = r0
        Ld:
            r2.cancelInternal(r3)
            return
    }

    public final boolean cancelCoroutine(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.cancelImpl$kotlinx_coroutines_core(r1)
            return r1
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(java.lang.Object r4) {
            r3 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            boolean r1 = r3.getOnCancelComplete$kotlinx_coroutines_core()
            r2 = 1
            if (r1 == 0) goto L14
            java.lang.Object r0 = r3.cancelMakeCompleting(r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r0 != r1) goto L14
            return r2
        L14:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r3.makeCancelling(r4)
        L1e:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 != r4) goto L25
            goto L35
        L25:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r0 != r4) goto L2a
            goto L35
        L2a:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()
            if (r0 != r4) goto L32
            r2 = 0
            goto L35
        L32:
            r3.afterCompletion(r0)
        L35:
            return r2
    }

    public void cancelInternal(java.lang.Throwable r1) {
            r0 = this;
            r0.cancelImpl$kotlinx_coroutines_core(r1)
            return
    }

    protected java.lang.String cancellationExceptionMessage() {
            r1 = this;
            java.lang.String r0 = "Job was cancelled"
            return r0
    }

    public boolean childCancelled(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r3 = r2.cancelImpl$kotlinx_coroutines_core(r3)
            if (r3 == 0) goto L13
            boolean r3 = r2.getHandlesException$kotlinx_coroutines_core()
            if (r3 == 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r1, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.Job.DefaultImpls.fold(r0, r1, r2)
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext$Element r1 = kotlinx.coroutines.Job.DefaultImpls.get(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.Job
    public final java.util.concurrent.CancellationException getCancellationException() {
            r4 = this;
            java.lang.Object r0 = r4.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            java.lang.String r2 = "Job is still new or active: "
            if (r1 == 0) goto L47
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0
            java.lang.Throwable r0 = r0.getRootCause()
            if (r0 == 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r4)
            r1.append(r3)
            java.lang.String r3 = " is cancelling"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.util.concurrent.CancellationException r0 = r4.toCancellationException(r0, r1)
            if (r0 == 0) goto L2e
            goto L74
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L47:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L75
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            r2 = 0
            if (r1 == 0) goto L5a
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            r1 = 1
            java.util.concurrent.CancellationException r0 = toCancellationException$default(r4, r0, r2, r1, r2)
            goto L74
        L5a:
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r4)
            r1.append(r3)
            java.lang.String r3 = " has completed normally"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r2, r4)
        L74:
            return r0
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.ParentJob
    public java.util.concurrent.CancellationException getChildJobCancellationCause() {
            r5 = this;
            java.lang.Object r0 = r5.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            r2 = 0
            if (r1 == 0) goto L11
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            java.lang.Throwable r1 = r1.getRootCause()
            goto L20
        L11:
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L1b
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            goto L20
        L1b:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L44
            r1 = r2
        L20:
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L27
            r2 = r1
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L27:
            if (r2 != 0) goto L43
            kotlinx.coroutines.JobCancellationException r2 = new kotlinx.coroutines.JobCancellationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Parent job is "
            r3.append(r4)
            java.lang.String r0 = r5.stateString(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0, r1, r5)
        L43:
            return r2
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot be cancelling child in this state: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final java.lang.Object getCompletedInternal$kotlinx_coroutines_core() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            r1 = r1 ^ 1
            if (r1 == 0) goto L18
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L13
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            return r0
        L13:
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            throw r0
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This job has not completed yet"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
            r1 = this;
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            return r0
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public kotlinx.coroutines.Job getParent() {
            r1 = this;
            kotlinx.coroutines.ChildHandle r0 = r1.getParentHandle$kotlinx_coroutines_core()
            if (r0 == 0) goto Lb
            kotlinx.coroutines.Job r0 = r0.getParent()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public final kotlinx.coroutines.ChildHandle getParentHandle$kotlinx_coroutines_core() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._parentHandle$FU
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.ChildHandle r0 = (kotlinx.coroutines.ChildHandle) r0
            return r0
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
        L2:
            java.lang.Object r1 = r0.get(r3)
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r2 != 0) goto Lb
            return r1
        Lb:
            kotlinx.coroutines.internal.OpDescriptor r1 = (kotlinx.coroutines.internal.OpDescriptor) r1
            r1.perform(r3)
            goto L2
    }

    protected boolean handleJobException(java.lang.Throwable r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(java.lang.Throwable r1) {
            r0 = this;
            throw r1
    }

    protected final void initParentJob(kotlinx.coroutines.Job r2) {
            r1 = this;
            if (r2 != 0) goto L8
            kotlinx.coroutines.NonDisposableHandle r2 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r1.setParentHandle$kotlinx_coroutines_core(r2)
            return
        L8:
            r2.start()
            kotlinx.coroutines.ChildHandle r2 = r2.attachChild(r1)
            r1.setParentHandle$kotlinx_coroutines_core(r2)
            boolean r0 = r1.isCompleted()
            if (r0 == 0) goto L20
            r2.dispose()
            kotlinx.coroutines.NonDisposableHandle r2 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r1.setParentHandle$kotlinx_coroutines_core(r2)
        L20:
            return
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            kotlinx.coroutines.DisposableHandle r3 = r2.invokeOnCompletion(r0, r1, r3)
            return r3
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean r7, boolean r8, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r9) {
            r6 = this;
            kotlinx.coroutines.JobNode r0 = r6.makeNode(r9, r7)
        L4:
            java.lang.Object r1 = r6.getState$kotlinx_coroutines_core()
            boolean r2 = r1 instanceof kotlinx.coroutines.Empty
            if (r2 == 0) goto L22
            r2 = r1
            kotlinx.coroutines.Empty r2 = (kotlinx.coroutines.Empty) r2
            boolean r3 = r2.isActive()
            if (r3 == 0) goto L1e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.JobSupport._state$FU
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r6, r1, r0)
            if (r1 == 0) goto L4
            return r0
        L1e:
            r6.promoteEmptyToNodeList(r2)
            goto L4
        L22:
            boolean r2 = r1 instanceof kotlinx.coroutines.Incomplete
            r3 = 0
            if (r2 == 0) goto L7d
            r2 = r1
            kotlinx.coroutines.Incomplete r2 = (kotlinx.coroutines.Incomplete) r2
            kotlinx.coroutines.NodeList r2 = r2.getList()
            if (r2 != 0) goto L3b
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            kotlinx.coroutines.JobNode r1 = (kotlinx.coroutines.JobNode) r1
            r6.promoteSingleToNodeList(r1)
            goto L4
        L3b:
            kotlinx.coroutines.NonDisposableHandle r4 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r7 == 0) goto L6e
            boolean r5 = r1 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r5 == 0) goto L6e
            monitor-enter(r1)
            r3 = r1
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Throwable r3 = r3.getRootCause()     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L5a
            boolean r5 = r9 instanceof kotlinx.coroutines.ChildHandleNode     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L67
            r5 = r1
            kotlinx.coroutines.JobSupport$Finishing r5 = (kotlinx.coroutines.JobSupport.Finishing) r5     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r5.isCompleting()     // Catch: java.lang.Throwable -> L6b
            if (r5 != 0) goto L67
        L5a:
            boolean r4 = r6.addLastAtomic(r1, r2, r0)     // Catch: java.lang.Throwable -> L6b
            if (r4 != 0) goto L62
            monitor-exit(r1)
            goto L4
        L62:
            if (r3 != 0) goto L66
            monitor-exit(r1)
            return r0
        L66:
            r4 = r0
        L67:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r1)
            goto L6e
        L6b:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        L6e:
            if (r3 == 0) goto L76
            if (r8 == 0) goto L75
            r9.invoke(r3)
        L75:
            return r4
        L76:
            boolean r1 = r6.addLastAtomic(r1, r2, r0)
            if (r1 == 0) goto L4
            return r0
        L7d:
            if (r8 == 0) goto L8e
            boolean r7 = r1 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r7 == 0) goto L86
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            goto L87
        L86:
            r1 = r3
        L87:
            if (r1 == 0) goto L8b
            java.lang.Throwable r3 = r1.cause
        L8b:
            r9.invoke(r3)
        L8e:
            kotlinx.coroutines.NonDisposableHandle r7 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            return r7
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 == 0) goto L12
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L17
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r1 == 0) goto L15
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0
            boolean r0 = r0.isCancelling()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    public final boolean isCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.Incomplete
            r0 = r0 ^ 1
            return r0
    }

    protected boolean isScopedCoroutine() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = r3.tryMakeCompleting(r0, r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 != r1) goto L10
            r4 = 0
            return r4
        L10:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            r2 = 1
            if (r0 != r1) goto L16
            return r2
        L16:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r0 == r1) goto L0
            r3.afterCompletion(r0)
            return r2
    }

    public final java.lang.Object makeCompletingOnce$kotlinx_coroutines_core(java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = r3.tryMakeCompleting(r0, r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 == r1) goto L15
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r0 == r1) goto L0
            return r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Job "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " is already complete or completing, but is being completed with "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.Throwable r4 = r3.getExceptionOrNull(r4)
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.Job.DefaultImpls.minusKey(r0, r1)
            return r1
    }

    public java.lang.String nameString$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.String r0 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r1)
            return r0
    }

    protected void onCancelling(java.lang.Throwable r1) {
            r0 = this;
            return
    }

    protected void onCompletionInternal(java.lang.Object r1) {
            r0 = this;
            return
    }

    protected void onStart() {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(kotlinx.coroutines.ParentJob r1) {
            r0 = this;
            r0.cancelImpl$kotlinx_coroutines_core(r1)
            return
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.Job.DefaultImpls.plus(r0, r1)
            return r1
    }

    public final void removeNode$kotlinx_coroutines_core(kotlinx.coroutines.JobNode r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobNode
            if (r1 == 0) goto L18
            if (r0 == r4) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.JobSupport._state$FU
            kotlinx.coroutines.Empty r2 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r0, r2)
            if (r0 == 0) goto L0
            return
        L18:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 == 0) goto L27
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            kotlinx.coroutines.NodeList r0 = r0.getList()
            if (r0 == 0) goto L27
            r4.remove()
        L27:
            return
    }

    public final void setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.ChildHandle r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._parentHandle$FU
            r0.set(r1, r2)
            return
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            int r0 = r2.startInternal(r0)
            if (r0 == 0) goto Lf
            r1 = 1
            if (r0 == r1) goto Le
            goto L0
        Le:
            return r1
        Lf:
            r0 = 0
            return r0
    }

    protected final java.util.concurrent.CancellationException toCancellationException(java.lang.Throwable r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L8
            r0 = r2
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto L16
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            if (r3 != 0) goto L13
            java.lang.String r3 = access$cancellationExceptionMessage(r1)
        L13:
            r0.<init>(r3, r2, r1)
        L16:
            return r0
    }

    public final java.lang.String toDebugString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.nameString$kotlinx_coroutines_core()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            java.lang.Object r1 = r2.getState$kotlinx_coroutines_core()
            java.lang.String r1 = r2.stateString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.toDebugString()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
