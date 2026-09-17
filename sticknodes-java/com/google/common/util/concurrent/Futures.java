package com.google.common.util.concurrent;

/* loaded from: classes2.dex */
public final class Futures extends com.google.common.util.concurrent.GwtFuturesCatchingSpecialization {

    private static final class CallbackListener<V> implements java.lang.Runnable {
        final com.google.common.util.concurrent.FutureCallback<? super V> callback;
        final java.util.concurrent.Future<V> future;

        CallbackListener(java.util.concurrent.Future<V> r1, com.google.common.util.concurrent.FutureCallback<? super V> r2) {
                r0 = this;
                r0.<init>()
                r0.future = r1
                r0.callback = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.Future<V> r0 = r2.future
                boolean r1 = r0 instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess
                if (r1 == 0) goto L14
                com.google.common.util.concurrent.internal.InternalFutureFailureAccess r0 = (com.google.common.util.concurrent.internal.InternalFutureFailureAccess) r0
                java.lang.Throwable r0 = com.google.common.util.concurrent.internal.InternalFutures.tryInternalFastPathGetFailure(r0)
                if (r0 == 0) goto L14
                com.google.common.util.concurrent.FutureCallback<? super V> r1 = r2.callback
                r1.onFailure(r0)
                return
            L14:
                java.util.concurrent.Future<V> r0 = r2.future     // Catch: java.lang.Error -> L20 java.lang.RuntimeException -> L22 java.util.concurrent.ExecutionException -> L29
                java.lang.Object r0 = com.google.common.util.concurrent.Futures.getDone(r0)     // Catch: java.lang.Error -> L20 java.lang.RuntimeException -> L22 java.util.concurrent.ExecutionException -> L29
                com.google.common.util.concurrent.FutureCallback<? super V> r1 = r2.callback
                r1.onSuccess(r0)
                return
            L20:
                r0 = move-exception
                goto L23
            L22:
                r0 = move-exception
            L23:
                com.google.common.util.concurrent.FutureCallback<? super V> r1 = r2.callback
                r1.onFailure(r0)
                return
            L29:
                r0 = move-exception
                com.google.common.util.concurrent.FutureCallback<? super V> r1 = r2.callback
                java.lang.Throwable r0 = r0.getCause()
                r1.onFailure(r0)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r2)
                com.google.common.util.concurrent.FutureCallback<? super V> r1 = r2.callback
                com.google.common.base.MoreObjects$ToStringHelper r0 = r0.addValue(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static <V> void addCallback(com.google.common.util.concurrent.ListenableFuture<V> r1, com.google.common.util.concurrent.FutureCallback<? super V> r2, java.util.concurrent.Executor r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.util.concurrent.Futures$CallbackListener r0 = new com.google.common.util.concurrent.Futures$CallbackListener
            r0.<init>(r1, r2)
            r1.addListener(r0, r3)
            return
    }

    public static <V> V getDone(java.util.concurrent.Future<V> r2) throws java.util.concurrent.ExecutionException {
            boolean r0 = r2.isDone()
            java.lang.String r1 = "Future was expected to be done: %s"
            com.google.common.base.Preconditions.checkState(r0, r1, r2)
            java.lang.Object r2 = com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r2)
            return r2
    }
}
