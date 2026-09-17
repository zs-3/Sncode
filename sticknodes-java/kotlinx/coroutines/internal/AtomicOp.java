package kotlinx.coroutines.internal;

/* compiled from: Atomic.kt */
/* loaded from: classes2.dex */
public abstract class AtomicOp<T> extends kotlinx.coroutines.internal.OpDescriptor {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _consensus$FU = null;
    private volatile java.lang.Object _consensus;

    static {
            java.lang.Class<kotlinx.coroutines.internal.AtomicOp> r0 = kotlinx.coroutines.internal.AtomicOp.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_consensus"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.internal.AtomicOp._consensus$FU = r0
            return
    }

    public AtomicOp() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
            r1._consensus = r0
            return
    }

    private final java.lang.Object decide(java.lang.Object r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.AtomicOp._consensus$FU
            java.lang.Object r1 = r0.get(r3)
            java.lang.Object r2 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
            if (r1 == r2) goto Lb
            return r1
        Lb:
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r2, r4)
            if (r1 == 0) goto L12
            return r4
        L12:
            java.lang.Object r4 = r0.get(r3)
            return r4
    }

    public abstract void complete(T r1, java.lang.Object r2);

    @Override // kotlinx.coroutines.internal.OpDescriptor
    public final java.lang.Object perform(java.lang.Object r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.AtomicOp._consensus$FU
            java.lang.Object r0 = r0.get(r2)
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
            if (r0 != r1) goto L12
            java.lang.Object r0 = r2.prepare(r3)
            java.lang.Object r0 = r2.decide(r0)
        L12:
            r2.complete(r3, r0)
            return r0
    }

    public abstract java.lang.Object prepare(T r1);
}
