package kotlin.sequences;

/* compiled from: SequencesJVM.kt */
/* loaded from: classes2.dex */
public final class ConstrainedOnceSequence<T> implements kotlin.sequences.Sequence<T> {
    private final java.util.concurrent.atomic.AtomicReference<kotlin.sequences.Sequence<T>> sequenceRef;

    public ConstrainedOnceSequence(kotlin.sequences.Sequence<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.sequenceRef = r0
            return
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<kotlin.sequences.Sequence<T>> r0 = r2.sequenceRef
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            if (r0 == 0) goto L10
            java.util.Iterator r0 = r0.iterator()
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This sequence can be consumed only once."
            r0.<init>(r1)
            throw r0
    }
}
