package kotlin.ranges;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes2.dex */
public final class LongProgressionIterator extends kotlin.collections.LongIterator {
    private final long finalElement;
    private boolean hasNext;
    private long next;
    private final long step;

    public LongProgressionIterator(long r6, long r8, long r10) {
            r5 = this;
            r5.<init>()
            r5.step = r10
            r5.finalElement = r8
            r0 = 1
            r1 = 0
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L14
            if (r10 > 0) goto L17
            goto L18
        L14:
            if (r10 < 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            r5.hasNext = r0
            if (r0 == 0) goto L1d
            goto L1e
        L1d:
            r6 = r8
        L1e:
            r5.next = r6
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasNext
            return r0
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
            r5 = this;
            long r0 = r5.next
            long r2 = r5.finalElement
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
            boolean r2 = r5.hasNext
            if (r2 == 0) goto L10
            r2 = 0
            r5.hasNext = r2
            goto L1b
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L16:
            long r2 = r5.step
            long r2 = r2 + r0
            r5.next = r2
        L1b:
            return r0
    }
}
