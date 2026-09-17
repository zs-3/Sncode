package kotlinx.coroutines.internal;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes2.dex */
public final class ConcurrentLinkedListKt {
    private static final kotlinx.coroutines.internal.Symbol CLOSED = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CLOSED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.ConcurrentLinkedListKt.CLOSED = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCLOSED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.CLOSED
            return r0
    }

    public static final <N extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<N>> N close(N r2) {
        L0:
            java.lang.Object r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r2)
            kotlinx.coroutines.internal.Symbol r1 = access$getCLOSED$p()
            if (r0 != r1) goto Lb
            return r2
        Lb:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            if (r0 != 0) goto L16
            boolean r0 = r2.markAsClosed()
            if (r0 == 0) goto L0
            return r2
        L16:
            r2 = r0
            goto L0
    }

    public static final <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object findSegmentInternal(S r4, long r5, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super S, ? extends S> r7) {
        L0:
            long r0 = r4.id
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L12
            boolean r0 = r4.isRemoved()
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            java.lang.Object r4 = kotlinx.coroutines.internal.SegmentOrClosed.m129constructorimpl(r4)
            return r4
        L12:
            java.lang.Object r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r4)
            kotlinx.coroutines.internal.Symbol r1 = access$getCLOSED$p()
            if (r0 != r1) goto L23
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.CLOSED
            java.lang.Object r4 = kotlinx.coroutines.internal.SegmentOrClosed.m129constructorimpl(r4)
            return r4
        L23:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            kotlinx.coroutines.internal.Segment r0 = (kotlinx.coroutines.internal.Segment) r0
            if (r0 == 0) goto L2b
        L29:
            r4 = r0
            goto L0
        L2b:
            long r0 = r4.id
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.invoke(r0, r4)
            kotlinx.coroutines.internal.Segment r0 = (kotlinx.coroutines.internal.Segment) r0
            boolean r1 = r4.trySetNext(r0)
            if (r1 == 0) goto L0
            boolean r1 = r4.isRemoved()
            if (r1 == 0) goto L29
            r4.remove()
            goto L29
    }
}
