package kotlinx.coroutines.internal;

import java.lang.Comparable;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* compiled from: ThreadSafeHeap.kt */
/* loaded from: classes2.dex */
public class ThreadSafeHeap<T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>> {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _size$FU = null;
    private volatile int _size;
    private T[] a;

    static {
            java.lang.Class<kotlinx.coroutines.internal.ThreadSafeHeap> r0 = kotlinx.coroutines.internal.ThreadSafeHeap.class
            java.lang.String r1 = "_size"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.ThreadSafeHeap._size$FU = r0
            return
    }

    public ThreadSafeHeap() {
            r0 = this;
            r0.<init>()
            return
    }

    private final T[] realloc() {
            r3 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r3.a
            if (r0 != 0) goto La
            r0 = 4
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r0 = new kotlinx.coroutines.internal.ThreadSafeHeapNode[r0]
            r3.a = r0
            goto L24
        La:
            int r1 = r3.getSize()
            int r2 = r0.length
            if (r1 < r2) goto L24
            int r1 = r3.getSize()
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r0 = (kotlinx.coroutines.internal.ThreadSafeHeapNode[]) r0
            r3.a = r0
        L24:
            return r0
    }

    private final void setSize(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.ThreadSafeHeap._size$FU
            r0.set(r1, r2)
            return
    }

    private final void siftDownFrom(int r6) {
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r0 = r0 + 1
            int r1 = r5.getSize()
            if (r0 < r1) goto Lb
            return
        Lb:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r1 = r5.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r0 + 1
            int r3 = r5.getSize()
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r1[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            r0 = r2
        L2b:
            r2 = r1[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r1 = r1[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r2.compareTo(r1)
            if (r1 > 0) goto L3e
            return
        L3e:
            r5.swap(r6, r0)
            r6 = r0
            goto L0
    }

    private final void siftUpFrom(int r4) {
            r3 = this;
        L0:
            if (r4 > 0) goto L3
            return
        L3:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r3.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r4 + (-1)
            int r1 = r1 / 2
            r2 = r0[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r0 = r0[r4]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r2.compareTo(r0)
            if (r0 > 0) goto L1f
            return
        L1f:
            r3.swap(r4, r1)
            r4 = r1
            goto L0
    }

    private final void swap(int r4, int r5) {
            r3 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r3.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r0[r5]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r2 = r0[r4]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0[r4] = r1
            r0[r5] = r2
            r1.setIndex(r4)
            r2.setIndex(r5)
            return
    }

    public final void addImpl(T r4) {
            r3 = this;
            r4.setHeap(r3)
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r0 = r3.realloc()
            int r1 = r3.getSize()
            int r2 = r1 + 1
            r3.setSize(r2)
            r0[r1] = r4
            r4.setIndex(r1)
            r3.siftUpFrom(r1)
            return
    }

    public final T firstImpl() {
            r2 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r2.a
            if (r0 == 0) goto L8
            r1 = 0
            r0 = r0[r1]
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final int getSize() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.ThreadSafeHeap._size$FU
            int r0 = r0.get(r1)
            return r0
    }

    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.getSize()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final T peek() {
            r1 = this;
            monitor-enter(r1)
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r1.firstImpl()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r0
        L7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final boolean remove(T r2) {
            r1 = this;
            monitor-enter(r1)
            kotlinx.coroutines.internal.ThreadSafeHeap r0 = r2.getHeap()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L9
            r2 = 0
            goto L11
        L9:
            int r2 = r2.getIndex()     // Catch: java.lang.Throwable -> L13
            r1.removeAtImpl(r2)     // Catch: java.lang.Throwable -> L13
            r2 = 1
        L11:
            monitor-exit(r1)
            return r2
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final T removeAtImpl(int r6) {
            r5 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r5.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r5.getSize()
            r2 = -1
            int r1 = r1 + r2
            r5.setSize(r1)
            int r1 = r5.getSize()
            if (r6 >= r1) goto L3d
            int r1 = r5.getSize()
            r5.swap(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.swap(r6, r1)
            r5.siftUpFrom(r1)
            goto L3d
        L3a:
            r5.siftDownFrom(r6)
        L3d:
            int r6 = r5.getSize()
            r6 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r1 = 0
            r6.setHeap(r1)
            r6.setIndex(r2)
            int r2 = r5.getSize()
            r0[r2] = r1
            return r6
    }

    public final T removeFirstOrNull() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.getSize()     // Catch: java.lang.Throwable -> L10
            if (r0 <= 0) goto Ld
            r0 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r1.removeAtImpl(r0)     // Catch: java.lang.Throwable -> L10
            goto Le
        Ld:
            r0 = 0
        Le:
            monitor-exit(r1)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
