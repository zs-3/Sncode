package kotlin.collections;

/* compiled from: AbstractMutableList.kt */
/* loaded from: classes2.dex */
public abstract class AbstractMutableList<E> extends java.util.AbstractList<E> {
    protected AbstractMutableList() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.removeAt(r1)
            return r1
    }

    public abstract E removeAt(int r1);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
