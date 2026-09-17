package kotlin.ranges;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes2.dex */
public final class IntProgressionIterator extends kotlin.collections.IntIterator {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public IntProgressionIterator(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.step = r5
            r2.finalElement = r4
            r0 = 1
            r1 = 0
            if (r5 <= 0) goto Le
            if (r3 > r4) goto L11
            goto L12
        Le:
            if (r3 < r4) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            r2.hasNext = r0
            if (r0 == 0) goto L17
            goto L18
        L17:
            r3 = r4
        L18:
            r2.next = r3
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasNext
            return r0
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
            r2 = this;
            int r0 = r2.next
            int r1 = r2.finalElement
            if (r0 != r1) goto L14
            boolean r1 = r2.hasNext
            if (r1 == 0) goto Le
            r1 = 0
            r2.hasNext = r1
            goto L19
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L14:
            int r1 = r2.step
            int r1 = r1 + r0
            r2.next = r1
        L19:
            return r0
    }
}
