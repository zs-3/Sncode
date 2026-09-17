package androidx.work.impl.utils.futures;

/* loaded from: classes.dex */
public abstract class AbstractFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    static final androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper ATOMIC_HELPER = null;
    static final boolean GENERATE_CANCELLATION_CAUSES = false;
    private static final java.lang.Object NULL = null;
    private static final java.util.logging.Logger log = null;
    volatile androidx.work.impl.utils.futures.AbstractFuture.Listener listeners;
    volatile java.lang.Object value;
    volatile androidx.work.impl.utils.futures.AbstractFuture.Waiter waiters;

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static abstract class AtomicHelper {
        private AtomicHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ AtomicHelper(androidx.work.impl.utils.futures.AbstractFuture.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        abstract boolean casListeners(androidx.work.impl.utils.futures.AbstractFuture<?> r1, androidx.work.impl.utils.futures.AbstractFuture.Listener r2, androidx.work.impl.utils.futures.AbstractFuture.Listener r3);

        abstract boolean casValue(androidx.work.impl.utils.futures.AbstractFuture<?> r1, java.lang.Object r2, java.lang.Object r3);

        abstract boolean casWaiters(androidx.work.impl.utils.futures.AbstractFuture<?> r1, androidx.work.impl.utils.futures.AbstractFuture.Waiter r2, androidx.work.impl.utils.futures.AbstractFuture.Waiter r3);

        abstract void putNext(androidx.work.impl.utils.futures.AbstractFuture.Waiter r1, androidx.work.impl.utils.futures.AbstractFuture.Waiter r2);

        abstract void putThread(androidx.work.impl.utils.futures.AbstractFuture.Waiter r1, java.lang.Thread r2);
    }

    private static final class Cancellation {
        static final androidx.work.impl.utils.futures.AbstractFuture.Cancellation CAUSELESS_CANCELLED = null;
        static final androidx.work.impl.utils.futures.AbstractFuture.Cancellation CAUSELESS_INTERRUPTED = null;
        final java.lang.Throwable cause;
        final boolean wasInterrupted;

        static {
                boolean r0 = androidx.work.impl.utils.futures.AbstractFuture.GENERATE_CANCELLATION_CAUSES
                r1 = 0
                if (r0 == 0) goto La
                androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_CANCELLED = r1
                androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED = r1
                goto L1a
            La:
                androidx.work.impl.utils.futures.AbstractFuture$Cancellation r0 = new androidx.work.impl.utils.futures.AbstractFuture$Cancellation
                r2 = 0
                r0.<init>(r2, r1)
                androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_CANCELLED = r0
                androidx.work.impl.utils.futures.AbstractFuture$Cancellation r0 = new androidx.work.impl.utils.futures.AbstractFuture$Cancellation
                r2 = 1
                r0.<init>(r2, r1)
                androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED = r0
            L1a:
                return
        }

        Cancellation(boolean r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>()
                r0.wasInterrupted = r1
                r0.cause = r2
                return
        }
    }

    private static final class Failure {
        static final androidx.work.impl.utils.futures.AbstractFuture.Failure FALLBACK_INSTANCE = null;
        final java.lang.Throwable exception;


        static {
                androidx.work.impl.utils.futures.AbstractFuture$Failure r0 = new androidx.work.impl.utils.futures.AbstractFuture$Failure
                androidx.work.impl.utils.futures.AbstractFuture$Failure$1 r1 = new androidx.work.impl.utils.futures.AbstractFuture$Failure$1
                java.lang.String r2 = "Failure occurred while trying to finish a future."
                r1.<init>(r2)
                r0.<init>(r1)
                androidx.work.impl.utils.futures.AbstractFuture.Failure.FALLBACK_INSTANCE = r0
                return
        }

        Failure(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = androidx.work.impl.utils.futures.AbstractFuture.checkNotNull(r1)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.exception = r1
                return
        }
    }

    private static final class Listener {
        static final androidx.work.impl.utils.futures.AbstractFuture.Listener TOMBSTONE = null;
        final java.util.concurrent.Executor executor;
        androidx.work.impl.utils.futures.AbstractFuture.Listener next;
        final java.lang.Runnable task;

        static {
                androidx.work.impl.utils.futures.AbstractFuture$Listener r0 = new androidx.work.impl.utils.futures.AbstractFuture$Listener
                r1 = 0
                r0.<init>(r1, r1)
                androidx.work.impl.utils.futures.AbstractFuture.Listener.TOMBSTONE = r0
                return
        }

        Listener(java.lang.Runnable r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.task = r1
                r0.executor = r2
                return
        }
    }

    private static final class SafeAtomicHelper extends androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper {
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Listener> listenersUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, java.lang.Object> valueUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture.Waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter> waiterNextUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture.Waiter, java.lang.Thread> waiterThreadUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Waiter> waitersUpdater;

        SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture.Waiter, java.lang.Thread> r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture.Waiter, androidx.work.impl.utils.futures.AbstractFuture.Waiter> r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Waiter> r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture.Listener> r5, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, java.lang.Object> r6) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.waiterThreadUpdater = r2
                r1.waiterNextUpdater = r3
                r1.waitersUpdater = r4
                r1.listenersUpdater = r5
                r1.valueUpdater = r6
                return
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casListeners(androidx.work.impl.utils.futures.AbstractFuture<?> r2, androidx.work.impl.utils.futures.AbstractFuture.Listener r3, androidx.work.impl.utils.futures.AbstractFuture.Listener r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture$Listener> r0 = r1.listenersUpdater
                boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r3, r4)
                return r2
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casValue(androidx.work.impl.utils.futures.AbstractFuture<?> r2, java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, java.lang.Object> r0 = r1.valueUpdater
                boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r3, r4)
                return r2
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casWaiters(androidx.work.impl.utils.futures.AbstractFuture<?> r2, androidx.work.impl.utils.futures.AbstractFuture.Waiter r3, androidx.work.impl.utils.futures.AbstractFuture.Waiter r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture$Waiter> r0 = r1.waitersUpdater
                boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r3, r4)
                return r2
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void putNext(androidx.work.impl.utils.futures.AbstractFuture.Waiter r2, androidx.work.impl.utils.futures.AbstractFuture.Waiter r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture$Waiter, androidx.work.impl.utils.futures.AbstractFuture$Waiter> r0 = r1.waiterNextUpdater
                r0.lazySet(r2, r3)
                return
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void putThread(androidx.work.impl.utils.futures.AbstractFuture.Waiter r2, java.lang.Thread r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.work.impl.utils.futures.AbstractFuture$Waiter, java.lang.Thread> r0 = r1.waiterThreadUpdater
                r0.lazySet(r2, r3)
                return
        }
    }

    private static final class SetFuture<V> implements java.lang.Runnable {
        final com.google.common.util.concurrent.ListenableFuture<? extends V> future;
        final androidx.work.impl.utils.futures.AbstractFuture<V> owner;

        SetFuture(androidx.work.impl.utils.futures.AbstractFuture<V> r1, com.google.common.util.concurrent.ListenableFuture<? extends V> r2) {
                r0 = this;
                r0.<init>()
                r0.owner = r1
                r0.future = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.work.impl.utils.futures.AbstractFuture<V> r0 = r3.owner
                java.lang.Object r0 = r0.value
                if (r0 == r3) goto L7
                return
            L7:
                com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r3.future
                java.lang.Object r0 = androidx.work.impl.utils.futures.AbstractFuture.getFutureValue(r0)
                androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r1 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
                androidx.work.impl.utils.futures.AbstractFuture<V> r2 = r3.owner
                boolean r0 = r1.casValue(r2, r3, r0)
                if (r0 == 0) goto L1c
                androidx.work.impl.utils.futures.AbstractFuture<V> r0 = r3.owner
                androidx.work.impl.utils.futures.AbstractFuture.complete(r0)
            L1c:
                return
        }
    }

    private static final class SynchronizedHelper extends androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper {
        SynchronizedHelper() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casListeners(androidx.work.impl.utils.futures.AbstractFuture<?> r2, androidx.work.impl.utils.futures.AbstractFuture.Listener r3, androidx.work.impl.utils.futures.AbstractFuture.Listener r4) {
                r1 = this;
                monitor-enter(r2)
                androidx.work.impl.utils.futures.AbstractFuture$Listener r0 = r2.listeners     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto La
                r2.listeners = r4     // Catch: java.lang.Throwable -> Ld
                r3 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                return r3
            La:
                r3 = 0
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casValue(androidx.work.impl.utils.futures.AbstractFuture<?> r2, java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                monitor-enter(r2)
                java.lang.Object r0 = r2.value     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto La
                r2.value = r4     // Catch: java.lang.Throwable -> Ld
                r3 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                return r3
            La:
                r3 = 0
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casWaiters(androidx.work.impl.utils.futures.AbstractFuture<?> r2, androidx.work.impl.utils.futures.AbstractFuture.Waiter r3, androidx.work.impl.utils.futures.AbstractFuture.Waiter r4) {
                r1 = this;
                monitor-enter(r2)
                androidx.work.impl.utils.futures.AbstractFuture$Waiter r0 = r2.waiters     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto La
                r2.waiters = r4     // Catch: java.lang.Throwable -> Ld
                r3 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                return r3
            La:
                r3 = 0
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void putNext(androidx.work.impl.utils.futures.AbstractFuture.Waiter r1, androidx.work.impl.utils.futures.AbstractFuture.Waiter r2) {
                r0 = this;
                r1.next = r2
                return
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void putThread(androidx.work.impl.utils.futures.AbstractFuture.Waiter r1, java.lang.Thread r2) {
                r0 = this;
                r1.thread = r2
                return
        }
    }

    private static final class Waiter {
        static final androidx.work.impl.utils.futures.AbstractFuture.Waiter TOMBSTONE = null;
        volatile androidx.work.impl.utils.futures.AbstractFuture.Waiter next;
        volatile java.lang.Thread thread;

        static {
                androidx.work.impl.utils.futures.AbstractFuture$Waiter r0 = new androidx.work.impl.utils.futures.AbstractFuture$Waiter
                r1 = 0
                r0.<init>(r1)
                androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE = r0
                return
        }

        Waiter() {
                r2 = this;
                r2.<init>()
                androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r0 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r0.putThread(r2, r1)
                return
        }

        Waiter(boolean r1) {
                r0 = this;
                r0.<init>()
                return
        }

        void setNext(androidx.work.impl.utils.futures.AbstractFuture.Waiter r2) {
                r1 = this;
                androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r0 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
                r0.putNext(r1, r2)
                return
        }

        void unpark() {
                r2 = this;
                java.lang.Thread r0 = r2.thread
                if (r0 == 0) goto La
                r1 = 0
                r2.thread = r1
                java.util.concurrent.locks.LockSupport.unpark(r0)
            La:
                return
        }
    }

    static {
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$Waiter> r0 = androidx.work.impl.utils.futures.AbstractFuture.Waiter.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            androidx.work.impl.utils.futures.AbstractFuture.GENERATE_CANCELLATION_CAUSES = r1
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r1 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            androidx.work.impl.utils.futures.AbstractFuture.log = r1
            androidx.work.impl.utils.futures.AbstractFuture$SafeAtomicHelper r1 = new androidx.work.impl.utils.futures.AbstractFuture$SafeAtomicHelper     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r2 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r5 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r0 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$Listener> r2 = androidx.work.impl.utils.futures.AbstractFuture.Listener.class
            java.lang.String r6 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r0 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch: java.lang.Throwable -> L4e
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4e
            r0 = 0
            goto L54
        L4e:
            r0 = move-exception
            androidx.work.impl.utils.futures.AbstractFuture$SynchronizedHelper r1 = new androidx.work.impl.utils.futures.AbstractFuture$SynchronizedHelper
            r1.<init>()
        L54:
            androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L63
            java.util.logging.Logger r1 = androidx.work.impl.utils.futures.AbstractFuture.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L63:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.work.impl.utils.futures.AbstractFuture.NULL = r0
            return
    }

    protected AbstractFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    private void addDoneString(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = getUninterruptibly(r3)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.CancellationException -> L29 java.util.concurrent.ExecutionException -> L2f
            java.lang.String r2 = "SUCCESS, result=["
            r4.append(r2)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.CancellationException -> L29 java.util.concurrent.ExecutionException -> L2f
            java.lang.String r1 = r3.userObjectToString(r1)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.CancellationException -> L29 java.util.concurrent.ExecutionException -> L2f
            r4.append(r1)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.CancellationException -> L29 java.util.concurrent.ExecutionException -> L2f
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L16 java.util.concurrent.CancellationException -> L29 java.util.concurrent.ExecutionException -> L2f
            goto L3f
        L16:
            r0 = move-exception
            java.lang.String r1 = "UNKNOWN, cause=["
            r4.append(r1)
            java.lang.Class r0 = r0.getClass()
            r4.append(r0)
            java.lang.String r0 = " thrown from get()]"
            r4.append(r0)
            goto L3f
        L29:
            java.lang.String r0 = "CANCELLED"
            r4.append(r0)
            goto L3f
        L2f:
            r1 = move-exception
            java.lang.String r2 = "FAILURE, cause=["
            r4.append(r2)
            java.lang.Throwable r1 = r1.getCause()
            r4.append(r1)
            r4.append(r0)
        L3f:
            return
    }

    private static java.util.concurrent.CancellationException cancellationExceptionWithCause(java.lang.String r1, java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }

    static <T> T checkNotNull(T r0) {
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    private androidx.work.impl.utils.futures.AbstractFuture.Listener clearListeners(androidx.work.impl.utils.futures.AbstractFuture.Listener r5) {
            r4 = this;
        L0:
            androidx.work.impl.utils.futures.AbstractFuture$Listener r0 = r4.listeners
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r1 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            androidx.work.impl.utils.futures.AbstractFuture$Listener r2 = androidx.work.impl.utils.futures.AbstractFuture.Listener.TOMBSTONE
            boolean r1 = r1.casListeners(r4, r0, r2)
            if (r1 == 0) goto L0
            r3 = r0
            r0 = r5
            r5 = r3
        Lf:
            if (r5 == 0) goto L18
            androidx.work.impl.utils.futures.AbstractFuture$Listener r1 = r5.next
            r5.next = r0
            r0 = r5
            r5 = r1
            goto Lf
        L18:
            return r0
    }

    static void complete(androidx.work.impl.utils.futures.AbstractFuture<?> r4) {
            r0 = 0
        L1:
            r4.releaseWaiters()
            r4.afterDone()
            androidx.work.impl.utils.futures.AbstractFuture$Listener r4 = r4.clearListeners(r0)
        Lb:
            if (r4 == 0) goto L33
            androidx.work.impl.utils.futures.AbstractFuture$Listener r0 = r4.next
            java.lang.Runnable r1 = r4.task
            boolean r2 = r1 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            if (r2 == 0) goto L2c
            androidx.work.impl.utils.futures.AbstractFuture$SetFuture r1 = (androidx.work.impl.utils.futures.AbstractFuture.SetFuture) r1
            androidx.work.impl.utils.futures.AbstractFuture<V> r4 = r1.owner
            java.lang.Object r2 = r4.value
            if (r2 != r1) goto L31
            com.google.common.util.concurrent.ListenableFuture<? extends V> r2 = r1.future
            java.lang.Object r2 = getFutureValue(r2)
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r3 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            boolean r1 = r3.casValue(r4, r1, r2)
            if (r1 == 0) goto L31
            goto L1
        L2c:
            java.util.concurrent.Executor r4 = r4.executor
            executeListener(r1, r4)
        L31:
            r4 = r0
            goto Lb
        L33:
            return
    }

    private static void executeListener(java.lang.Runnable r5, java.util.concurrent.Executor r6) {
            r6.execute(r5)     // Catch: java.lang.RuntimeException -> L4
            goto L25
        L4:
            r0 = move-exception
            java.util.logging.Logger r1 = androidx.work.impl.utils.futures.AbstractFuture.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "RuntimeException while executing runnable "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = " with executor "
            r3.append(r5)
            r3.append(r6)
            java.lang.String r5 = r3.toString()
            r1.log(r2, r5, r0)
        L25:
            return
    }

    private V getDoneValue(java.lang.Object r2) throws java.util.concurrent.ExecutionException {
            r1 = this;
            boolean r0 = r2 instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation
            if (r0 != 0) goto L18
            boolean r0 = r2 instanceof androidx.work.impl.utils.futures.AbstractFuture.Failure
            if (r0 != 0) goto Le
            java.lang.Object r0 = androidx.work.impl.utils.futures.AbstractFuture.NULL
            if (r2 != r0) goto Ld
            r2 = 0
        Ld:
            return r2
        Le:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            androidx.work.impl.utils.futures.AbstractFuture$Failure r2 = (androidx.work.impl.utils.futures.AbstractFuture.Failure) r2
            java.lang.Throwable r2 = r2.exception
            r0.<init>(r2)
            throw r0
        L18:
            androidx.work.impl.utils.futures.AbstractFuture$Cancellation r2 = (androidx.work.impl.utils.futures.AbstractFuture.Cancellation) r2
            java.lang.Throwable r2 = r2.cause
            java.lang.String r0 = "Task was cancelled."
            java.util.concurrent.CancellationException r2 = cancellationExceptionWithCause(r0, r2)
            throw r2
    }

    static java.lang.Object getFutureValue(com.google.common.util.concurrent.ListenableFuture<?> r5) {
            boolean r0 = r5 instanceof androidx.work.impl.utils.futures.AbstractFuture
            r1 = 0
            if (r0 == 0) goto L23
            androidx.work.impl.utils.futures.AbstractFuture r5 = (androidx.work.impl.utils.futures.AbstractFuture) r5
            java.lang.Object r5 = r5.value
            boolean r0 = r5 instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation
            if (r0 == 0) goto L22
            r0 = r5
            androidx.work.impl.utils.futures.AbstractFuture$Cancellation r0 = (androidx.work.impl.utils.futures.AbstractFuture.Cancellation) r0
            boolean r2 = r0.wasInterrupted
            if (r2 == 0) goto L22
            java.lang.Throwable r5 = r0.cause
            if (r5 == 0) goto L20
            androidx.work.impl.utils.futures.AbstractFuture$Cancellation r5 = new androidx.work.impl.utils.futures.AbstractFuture$Cancellation
            java.lang.Throwable r0 = r0.cause
            r5.<init>(r1, r0)
            goto L22
        L20:
            androidx.work.impl.utils.futures.AbstractFuture$Cancellation r5 = androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_CANCELLED
        L22:
            return r5
        L23:
            boolean r0 = r5.isCancelled()
            boolean r2 = androidx.work.impl.utils.futures.AbstractFuture.GENERATE_CANCELLATION_CAUSES
            r2 = r2 ^ 1
            r2 = r2 & r0
            if (r2 == 0) goto L31
            androidx.work.impl.utils.futures.AbstractFuture$Cancellation r5 = androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_CANCELLED
            return r5
        L31:
            java.lang.Object r2 = getUninterruptibly(r5)     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L41 java.util.concurrent.ExecutionException -> L66
            if (r2 != 0) goto L39
            java.lang.Object r2 = androidx.work.impl.utils.futures.AbstractFuture.NULL     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L41 java.util.concurrent.ExecutionException -> L66
        L39:
            return r2
        L3a:
            r5 = move-exception
            androidx.work.impl.utils.futures.AbstractFuture$Failure r0 = new androidx.work.impl.utils.futures.AbstractFuture$Failure
            r0.<init>(r5)
            return r0
        L41:
            r2 = move-exception
            if (r0 != 0) goto L60
            androidx.work.impl.utils.futures.AbstractFuture$Failure r0 = new androidx.work.impl.utils.futures.AbstractFuture$Failure
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r1.<init>(r5, r2)
            r0.<init>(r1)
            return r0
        L60:
            androidx.work.impl.utils.futures.AbstractFuture$Cancellation r5 = new androidx.work.impl.utils.futures.AbstractFuture$Cancellation
            r5.<init>(r1, r2)
            return r5
        L66:
            r5 = move-exception
            androidx.work.impl.utils.futures.AbstractFuture$Failure r0 = new androidx.work.impl.utils.futures.AbstractFuture$Failure
            java.lang.Throwable r5 = r5.getCause()
            r0.<init>(r5)
            return r0
    }

    private static <V> V getUninterruptibly(java.util.concurrent.Future<V> r1) throws java.util.concurrent.ExecutionException {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    private void releaseWaiters() {
            r3 = this;
        L0:
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r0 = r3.waiters
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r1 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r2 = androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE
            boolean r1 = r1.casWaiters(r3, r0, r2)
            if (r1 == 0) goto L0
        Lc:
            if (r0 == 0) goto L14
            r0.unpark()
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r0 = r0.next
            goto Lc
        L14:
            return
    }

    private void removeWaiter(androidx.work.impl.utils.futures.AbstractFuture.Waiter r5) {
            r4 = this;
            r0 = 0
            r5.thread = r0
        L3:
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r5 = r4.waiters
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r1 = androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE
            if (r5 != r1) goto La
            return
        La:
            r1 = r0
        Lb:
            if (r5 == 0) goto L29
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r2 = r5.next
            java.lang.Thread r3 = r5.thread
            if (r3 == 0) goto L15
            r1 = r5
            goto L27
        L15:
            if (r1 == 0) goto L1e
            r1.next = r2
            java.lang.Thread r5 = r1.thread
            if (r5 != 0) goto L27
            goto L3
        L1e:
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r3 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            boolean r5 = r3.casWaiters(r4, r5, r2)
            if (r5 != 0) goto L27
            goto L3
        L27:
            r5 = r2
            goto Lb
        L29:
            return
    }

    private java.lang.String userObjectToString(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L5
            java.lang.String r1 = "this future"
            return r1
        L5:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable r4, java.util.concurrent.Executor r5) {
            r3 = this;
            checkNotNull(r4)
            checkNotNull(r5)
            androidx.work.impl.utils.futures.AbstractFuture$Listener r0 = r3.listeners
            androidx.work.impl.utils.futures.AbstractFuture$Listener r1 = androidx.work.impl.utils.futures.AbstractFuture.Listener.TOMBSTONE
            if (r0 == r1) goto L22
            androidx.work.impl.utils.futures.AbstractFuture$Listener r1 = new androidx.work.impl.utils.futures.AbstractFuture$Listener
            r1.<init>(r4, r5)
        L11:
            r1.next = r0
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r2 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            boolean r0 = r2.casListeners(r3, r0, r1)
            if (r0 == 0) goto L1c
            return
        L1c:
            androidx.work.impl.utils.futures.AbstractFuture$Listener r0 = r3.listeners
            androidx.work.impl.utils.futures.AbstractFuture$Listener r2 = androidx.work.impl.utils.futures.AbstractFuture.Listener.TOMBSTONE
            if (r0 != r2) goto L11
        L22:
            executeListener(r4, r5)
            return
    }

    protected void afterDone() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r8) {
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            r3 = r3 | r4
            if (r3 == 0) goto L61
            boolean r3 = androidx.work.impl.utils.futures.AbstractFuture.GENERATE_CANCELLATION_CAUSES
            if (r3 == 0) goto L1f
            androidx.work.impl.utils.futures.AbstractFuture$Cancellation r3 = new androidx.work.impl.utils.futures.AbstractFuture$Cancellation
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            androidx.work.impl.utils.futures.AbstractFuture$Cancellation r3 = androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED
            goto L26
        L24:
            androidx.work.impl.utils.futures.AbstractFuture$Cancellation r3 = androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_CANCELLED
        L26:
            r5 = 0
            r4 = r7
        L28:
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r6 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            boolean r6 = r6.casValue(r4, r0, r3)
            if (r6 == 0) goto L59
            if (r8 == 0) goto L35
            r4.interruptTask()
        L35:
            complete(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            if (r4 == 0) goto L62
            androidx.work.impl.utils.futures.AbstractFuture$SetFuture r0 = (androidx.work.impl.utils.futures.AbstractFuture.SetFuture) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.future
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture
            if (r4 == 0) goto L55
            r4 = r0
            androidx.work.impl.utils.futures.AbstractFuture r4 = (androidx.work.impl.utils.futures.AbstractFuture) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4d
            r5 = 1
            goto L4e
        L4d:
            r5 = 0
        L4e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            r5 = r5 | r6
            if (r5 == 0) goto L62
            r5 = 1
            goto L28
        L55:
            r0.cancel(r8)
            goto L62
        L59:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            if (r6 != 0) goto L28
            r1 = r5
            goto L62
        L61:
            r1 = 0
        L62:
            return r1
    }

    @Override // java.util.concurrent.Future
    public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L61
            java.lang.Object r0 = r6.value
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L1a:
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r0 = r6.waiters
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r3 = androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE
            if (r0 == r3) goto L5a
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r3 = new androidx.work.impl.utils.futures.AbstractFuture$Waiter
            r3.<init>()
        L25:
            r3.setNext(r0)
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r4 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            boolean r0 = r4.casWaiters(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.value
            if (r0 == 0) goto L3f
            r4 = 1
            goto L40
        L3f:
            r4 = 0
        L40:
            boolean r5 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L30
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L4b:
            r6.removeWaiter(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r0 = r6.waiters
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r4 = androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.value
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L61:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.Future
    public final V get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r4 = r3.toNanos(r1)
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L1ac
            java.lang.Object r6 = r0.value
            r8 = 1
            if (r6 == 0) goto L17
            r9 = 1
            goto L18
        L17:
            r9 = 0
        L18:
            boolean r10 = r6 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            r10 = r10 ^ r8
            r9 = r9 & r10
            if (r9 == 0) goto L23
            java.lang.Object r1 = r0.getDoneValue(r6)
            return r1
        L23:
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L2f
            long r11 = java.lang.System.nanoTime()
            long r11 = r11 + r4
            goto L30
        L2f:
            r11 = r9
        L30:
            r13 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 < 0) goto L8b
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r6 = r0.waiters
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r15 = androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE
            if (r6 == r15) goto L84
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r15 = new androidx.work.impl.utils.futures.AbstractFuture$Waiter
            r15.<init>()
        L41:
            r15.setNext(r6)
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r7 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            boolean r6 = r7.casWaiters(r0, r6, r15)
            if (r6 == 0) goto L7e
        L4c:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r4)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L75
            java.lang.Object r4 = r0.value
            if (r4 == 0) goto L5b
            r5 = 1
            goto L5c
        L5b:
            r5 = 0
        L5c:
            boolean r6 = r4 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto L67
            java.lang.Object r1 = r0.getDoneValue(r4)
            return r1
        L67:
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 >= 0) goto L4c
            r0.removeWaiter(r15)
            goto L8b
        L75:
            r0.removeWaiter(r15)
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L7e:
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r6 = r0.waiters
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r7 = androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE
            if (r6 != r7) goto L41
        L84:
            java.lang.Object r1 = r0.value
            java.lang.Object r1 = r0.getDoneValue(r1)
            return r1
        L8b:
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto Lb4
            java.lang.Object r4 = r0.value
            if (r4 == 0) goto L95
            r5 = 1
            goto L96
        L95:
            r5 = 0
        L96:
            boolean r6 = r4 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto La1
            java.lang.Object r1 = r0.getDoneValue(r4)
            return r1
        La1:
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto Lae
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            goto L8b
        Lae:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        Lb4:
            java.lang.String r6 = r19.toString()
            java.lang.String r7 = r22.toString()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "Waited "
            r12.append(r15)
            r12.append(r1)
            java.lang.String r1 = " "
            r12.append(r1)
            java.lang.String r2 = r22.toString()
            java.lang.String r2 = r2.toLowerCase(r11)
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            long r11 = r4 + r13
            int r15 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r15 >= 0) goto L175
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r2 = " (plus "
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            long r4 = -r4
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = r3.convert(r4, r11)
            long r17 = r3.toNanos(r11)
            long r4 = r4 - r17
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 == 0) goto L113
            int r9 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r9 <= 0) goto L110
            goto L113
        L110:
            r16 = 0
            goto L115
        L113:
            r16 = 1
        L115:
            if (r3 <= 0) goto L14e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r11)
            r3.append(r1)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
            if (r16 == 0) goto L13f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ","
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L13f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = r3.toString()
        L14e:
            if (r16 == 0) goto L164
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " nanoseconds "
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L164:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = "delay)"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L175:
            boolean r1 = r19.isDone()
            if (r1 == 0) goto L192
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " but future completed as timeout expired"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L192:
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " for "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L1ac:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
    }

    protected void interruptTask() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r3 = this;
            java.lang.Object r0 = r3.value
            r1 = 1
            if (r0 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            boolean r0 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            r0 = r0 ^ r1
            r0 = r0 & r2
            return r0
    }

    protected java.lang.String pendingToString() {
            r3 = this;
            java.lang.Object r0 = r3.value
            boolean r1 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            if (r1 == 0) goto L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setFuture=["
            r1.append(r2)
            androidx.work.impl.utils.futures.AbstractFuture$SetFuture r0 = (androidx.work.impl.utils.futures.AbstractFuture.SetFuture) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.future
            java.lang.String r0 = r3.userObjectToString(r0)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L25:
            boolean r0 = r3 instanceof java.util.concurrent.ScheduledFuture
            if (r0 == 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "remaining delay=["
            r0.append(r1)
            r1 = r3
            java.util.concurrent.ScheduledFuture r1 = (java.util.concurrent.ScheduledFuture) r1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r1.getDelay(r2)
            r0.append(r1)
            java.lang.String r1 = " ms]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L49:
            r0 = 0
            return r0
    }

    protected boolean set(V r3) {
            r2 = this;
            if (r3 != 0) goto L4
            java.lang.Object r3 = androidx.work.impl.utils.futures.AbstractFuture.NULL
        L4:
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r0 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            r1 = 0
            boolean r3 = r0.casValue(r2, r1, r3)
            if (r3 == 0) goto L12
            complete(r2)
            r3 = 1
            return r3
        L12:
            r3 = 0
            return r3
    }

    protected boolean setException(java.lang.Throwable r3) {
            r2 = this;
            androidx.work.impl.utils.futures.AbstractFuture$Failure r0 = new androidx.work.impl.utils.futures.AbstractFuture$Failure
            java.lang.Object r3 = checkNotNull(r3)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r0.<init>(r3)
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r3 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            r1 = 0
            boolean r3 = r3.casValue(r2, r1, r0)
            if (r3 == 0) goto L19
            complete(r2)
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    protected boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r6) {
            r5 = this;
            checkNotNull(r6)
            java.lang.Object r0 = r5.value
            r1 = 0
            if (r0 != 0) goto L45
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L21
            java.lang.Object r6 = getFutureValue(r6)
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r0 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            boolean r6 = r0.casValue(r5, r3, r6)
            if (r6 == 0) goto L20
            complete(r5)
            return r2
        L20:
            return r1
        L21:
            androidx.work.impl.utils.futures.AbstractFuture$SetFuture r0 = new androidx.work.impl.utils.futures.AbstractFuture$SetFuture
            r0.<init>(r5, r6)
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r4 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            boolean r3 = r4.casValue(r5, r3, r0)
            if (r3 == 0) goto L43
            androidx.work.impl.utils.futures.DirectExecutor r1 = androidx.work.impl.utils.futures.DirectExecutor.INSTANCE     // Catch: java.lang.Throwable -> L34
            r6.addListener(r0, r1)     // Catch: java.lang.Throwable -> L34
            goto L42
        L34:
            r6 = move-exception
            androidx.work.impl.utils.futures.AbstractFuture$Failure r1 = new androidx.work.impl.utils.futures.AbstractFuture$Failure     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            androidx.work.impl.utils.futures.AbstractFuture$Failure r1 = androidx.work.impl.utils.futures.AbstractFuture.Failure.FALLBACK_INSTANCE
        L3d:
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r6 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            r6.casValue(r5, r0, r1)
        L42:
            return r2
        L43:
            java.lang.Object r0 = r5.value
        L45:
            boolean r2 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.Cancellation
            if (r2 == 0) goto L50
            androidx.work.impl.utils.futures.AbstractFuture$Cancellation r0 = (androidx.work.impl.utils.futures.AbstractFuture.Cancellation) r0
            boolean r0 = r0.wasInterrupted
            r6.cancel(r0)
        L50:
            return r1
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r5.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L1f
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto L67
        L1f:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L29
            r5.addDoneString(r0)
            goto L67
        L29:
            java.lang.String r1 = r5.pendingToString()     // Catch: java.lang.RuntimeException -> L2e
            goto L44
        L2e:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception thrown from implementation: "
            r3.append(r4)
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L44:
            if (r1 == 0) goto L58
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L58
            java.lang.String r3 = "PENDING, info=["
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            goto L67
        L58:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L62
            r5.addDoneString(r0)
            goto L67
        L62:
            java.lang.String r1 = "PENDING"
            r0.append(r1)
        L67:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
