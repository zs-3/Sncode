package kotlinx.coroutines.internal;

/* compiled from: ThreadSafeHeap.kt */
/* loaded from: classes2.dex */
public interface ThreadSafeHeapNode {
    kotlinx.coroutines.internal.ThreadSafeHeap<?> getHeap();

    int getIndex();

    void setHeap(kotlinx.coroutines.internal.ThreadSafeHeap<?> r1);

    void setIndex(int r1);
}
