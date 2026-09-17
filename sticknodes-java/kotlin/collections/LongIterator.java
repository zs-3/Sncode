package kotlin.collections;

/* compiled from: PrimitiveIterators.kt */
/* loaded from: classes2.dex */
public abstract class LongIterator implements java.util.Iterator<java.lang.Long> {
    public LongIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Long next() {
            r2 = this;
            long r0 = r2.nextLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
