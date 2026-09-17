package androidx.work.impl.utils.futures;

/* loaded from: classes.dex */
public final class SettableFuture<V> extends androidx.work.impl.utils.futures.AbstractFuture<V> {
    private SettableFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> androidx.work.impl.utils.futures.SettableFuture<V> create() {
            androidx.work.impl.utils.futures.SettableFuture r0 = new androidx.work.impl.utils.futures.SettableFuture
            r0.<init>()
            return r0
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean set(V r1) {
            r0 = this;
            boolean r1 = super.set(r1)
            return r1
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean setException(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = super.setException(r1)
            return r1
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r1) {
            r0 = this;
            boolean r1 = super.setFuture(r1)
            return r1
    }
}
