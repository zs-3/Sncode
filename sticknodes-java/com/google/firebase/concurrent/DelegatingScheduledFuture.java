package com.google.firebase.concurrent;

@android.annotation.SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
class DelegatingScheduledFuture<V> extends androidx.concurrent.futures.AbstractResolvableFuture<V> implements java.util.concurrent.ScheduledFuture<V> {
    private final java.util.concurrent.ScheduledFuture<?> upstreamFuture;


    interface Completer<T> {
        void set(T r1);

        void setException(java.lang.Throwable r1);
    }

    interface Resolver<T> {
        java.util.concurrent.ScheduledFuture<?> addCompleter(com.google.firebase.concurrent.DelegatingScheduledFuture.Completer<T> r1);
    }

    DelegatingScheduledFuture(com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver<V> r2) {
            r1 = this;
            r1.<init>()
            com.google.firebase.concurrent.DelegatingScheduledFuture$1 r0 = new com.google.firebase.concurrent.DelegatingScheduledFuture$1
            r0.<init>(r1)
            java.util.concurrent.ScheduledFuture r2 = r2.addCompleter(r0)
            r1.upstreamFuture = r2
            return
    }

    static /* synthetic */ boolean access$000(com.google.firebase.concurrent.DelegatingScheduledFuture r0, java.lang.Object r1) {
            boolean r0 = r0.set(r1)
            return r0
    }

    static /* synthetic */ boolean access$100(com.google.firebase.concurrent.DelegatingScheduledFuture r0, java.lang.Throwable r1) {
            boolean r0 = r0.setException(r1)
            return r0
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    protected void afterDone() {
            r2 = this;
            java.util.concurrent.ScheduledFuture<?> r0 = r2.upstreamFuture
            boolean r1 = r2.wasInterrupted()
            r0.cancel(r1)
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed r1) {
            r0 = this;
            java.util.concurrent.Delayed r1 = (java.util.concurrent.Delayed) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(java.util.concurrent.Delayed r2) {
            r1 = this;
            java.util.concurrent.ScheduledFuture<?> r0 = r1.upstreamFuture
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(java.util.concurrent.TimeUnit r3) {
            r2 = this;
            java.util.concurrent.ScheduledFuture<?> r0 = r2.upstreamFuture
            long r0 = r0.getDelay(r3)
            return r0
    }
}
