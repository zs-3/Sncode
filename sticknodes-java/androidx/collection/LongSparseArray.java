package androidx.collection;

/* loaded from: classes.dex */
public class LongSparseArray<E> implements java.lang.Cloneable {
    private static final java.lang.Object DELETED = null;
    private boolean mGarbage;
    private long[] mKeys;
    private int mSize;
    private java.lang.Object[] mValues;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.collection.LongSparseArray.DELETED = r0
            return
    }

    public LongSparseArray() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public LongSparseArray(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mGarbage = r0
            if (r2 != 0) goto L11
            long[] r2 = androidx.collection.ContainerHelpers.EMPTY_LONGS
            r1.mKeys = r2
            java.lang.Object[] r2 = androidx.collection.ContainerHelpers.EMPTY_OBJECTS
            r1.mValues = r2
            goto L1d
        L11:
            int r2 = androidx.collection.ContainerHelpers.idealLongArraySize(r2)
            long[] r0 = new long[r2]
            r1.mKeys = r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.mValues = r2
        L1d:
            return
    }

    private void gc() {
            r9 = this;
            int r0 = r9.mSize
            long[] r1 = r9.mKeys
            java.lang.Object[] r2 = r9.mValues
            r3 = 0
            r4 = 0
            r5 = 0
        L9:
            if (r4 >= r0) goto L21
            r6 = r2[r4]
            java.lang.Object r7 = androidx.collection.LongSparseArray.DELETED
            if (r6 == r7) goto L1e
            if (r4 == r5) goto L1c
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L1c:
            int r5 = r5 + 1
        L1e:
            int r4 = r4 + 1
            goto L9
        L21:
            r9.mGarbage = r3
            r9.mSize = r5
            return
    }

    public androidx.collection.LongSparseArray<E> clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            androidx.collection.LongSparseArray r0 = (androidx.collection.LongSparseArray) r0     // Catch: java.lang.CloneNotSupportedException -> L1b
            long[] r1 = r2.mKeys     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            long[] r1 = (long[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.mKeys = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = r2.mValues     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.mValues = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            return r0
        L1b:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m3clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.collection.LongSparseArray r0 = r1.clone()
            return r0
    }

    public E get(long r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.get(r2, r0)
            return r2
    }

    public E get(long r3, E r5) {
            r2 = this;
            long[] r0 = r2.mKeys
            int r1 = r2.mSize
            int r3 = androidx.collection.ContainerHelpers.binarySearch(r0, r1, r3)
            if (r3 < 0) goto L16
            java.lang.Object[] r4 = r2.mValues
            r0 = r4[r3]
            java.lang.Object r1 = androidx.collection.LongSparseArray.DELETED
            if (r0 != r1) goto L13
            goto L16
        L13:
            r3 = r4[r3]
            return r3
        L16:
            return r5
    }

    public long keyAt(int r4) {
            r3 = this;
            boolean r0 = r3.mGarbage
            if (r0 == 0) goto L7
            r3.gc()
        L7:
            long[] r0 = r3.mKeys
            r1 = r0[r4]
            return r1
    }

    public void put(long r7, E r9) {
            r6 = this;
            long[] r0 = r6.mKeys
            int r1 = r6.mSize
            int r0 = androidx.collection.ContainerHelpers.binarySearch(r0, r1, r7)
            if (r0 < 0) goto Lf
            java.lang.Object[] r7 = r6.mValues
            r7[r0] = r9
            goto L7e
        Lf:
            int r0 = ~r0
            int r1 = r6.mSize
            if (r0 >= r1) goto L23
            java.lang.Object[] r2 = r6.mValues
            r3 = r2[r0]
            java.lang.Object r4 = androidx.collection.LongSparseArray.DELETED
            if (r3 != r4) goto L23
            long[] r1 = r6.mKeys
            r1[r0] = r7
            r2[r0] = r9
            return
        L23:
            boolean r2 = r6.mGarbage
            if (r2 == 0) goto L38
            long[] r2 = r6.mKeys
            int r2 = r2.length
            if (r1 < r2) goto L38
            r6.gc()
            long[] r0 = r6.mKeys
            int r1 = r6.mSize
            int r0 = androidx.collection.ContainerHelpers.binarySearch(r0, r1, r7)
            int r0 = ~r0
        L38:
            int r1 = r6.mSize
            long[] r2 = r6.mKeys
            int r2 = r2.length
            if (r1 < r2) goto L5a
            int r1 = r1 + 1
            int r1 = androidx.collection.ContainerHelpers.idealLongArraySize(r1)
            long[] r2 = new long[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long[] r3 = r6.mKeys
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.mValues
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.mKeys = r2
            r6.mValues = r1
        L5a:
            int r1 = r6.mSize
            int r2 = r1 - r0
            if (r2 == 0) goto L70
            long[] r2 = r6.mKeys
            int r3 = r0 + 1
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            java.lang.Object[] r1 = r6.mValues
            int r2 = r6.mSize
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r3, r2)
        L70:
            long[] r1 = r6.mKeys
            r1[r0] = r7
            java.lang.Object[] r7 = r6.mValues
            r7[r0] = r9
            int r7 = r6.mSize
            int r7 = r7 + 1
            r6.mSize = r7
        L7e:
            return
    }

    public int size() {
            r1 = this;
            boolean r0 = r1.mGarbage
            if (r0 == 0) goto L7
            r1.gc()
        L7:
            int r0 = r1.mSize
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.size()
            if (r0 > 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.mSize
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r4.mSize
            if (r1 >= r2) goto L41
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            long r2 = r4.keyAt(r1)
            r0.append(r2)
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r4.valueAt(r1)
            if (r2 == r4) goto L39
            r0.append(r2)
            goto L3e
        L39:
            java.lang.String r2 = "(this Map)"
            r0.append(r2)
        L3e:
            int r1 = r1 + 1
            goto L18
        L41:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public E valueAt(int r2) {
            r1 = this;
            boolean r0 = r1.mGarbage
            if (r0 == 0) goto L7
            r1.gc()
        L7:
            java.lang.Object[] r0 = r1.mValues
            r2 = r0[r2]
            return r2
    }
}
