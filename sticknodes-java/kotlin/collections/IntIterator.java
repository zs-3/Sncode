package kotlin.collections;

/* compiled from: PrimitiveIterators.kt */
/* loaded from: classes2.dex */
public abstract class IntIterator implements java.util.Iterator<java.lang.Integer> {
    public IntIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Integer next() {
            r1 = this;
            int r0 = r1.nextInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
