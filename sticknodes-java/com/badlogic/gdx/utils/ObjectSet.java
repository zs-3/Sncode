package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class ObjectSet<T> implements java.lang.Iterable<T> {
    private transient com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator iterator1;
    private transient com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator iterator2;
    T[] keyTable;
    float loadFactor;
    protected int mask;
    protected int shift;
    public int size;
    int threshold;

    public static class ObjectSetIterator<K> implements java.lang.Iterable<K>, java.util.Iterator<K> {
        int currentIndex;
        public boolean hasNext;
        int nextIndex;
        final com.badlogic.gdx.utils.ObjectSet<K> set;
        boolean valid;

        public ObjectSetIterator(com.badlogic.gdx.utils.ObjectSet<K> r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.valid = r0
                r1.set = r2
                r1.reset()
                return
        }

        private void findNextIndex() {
                r4 = this;
                com.badlogic.gdx.utils.ObjectSet<K> r0 = r4.set
                T[] r0 = r0.keyTable
                int r1 = r0.length
            L5:
                int r2 = r4.nextIndex
                r3 = 1
                int r2 = r2 + r3
                r4.nextIndex = r2
                if (r2 >= r1) goto L14
                r2 = r0[r2]
                if (r2 == 0) goto L5
                r4.hasNext = r3
                return
            L14:
                r0 = 0
                r4.hasNext = r0
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                boolean r0 = r2.valid
                if (r0 == 0) goto L7
                boolean r0 = r2.hasNext
                return r0
            L7:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
        }

        @Override // java.lang.Iterable
        public com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator<K> iterator() {
                r0 = this;
                return r0
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator r0 = r1.iterator()
                return r0
        }

        @Override // java.util.Iterator
        public K next() {
                r2 = this;
                boolean r0 = r2.hasNext
                if (r0 == 0) goto L1e
                boolean r0 = r2.valid
                if (r0 == 0) goto L16
                com.badlogic.gdx.utils.ObjectSet<K> r0 = r2.set
                T[] r0 = r0.keyTable
                int r1 = r2.nextIndex
                r0 = r0[r1]
                r2.currentIndex = r1
                r2.findNextIndex()
                return r0
            L16:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
            L1e:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r7 = this;
                int r0 = r7.currentIndex
                if (r0 < 0) goto L3e
                com.badlogic.gdx.utils.ObjectSet<K> r1 = r7.set
                T[] r2 = r1.keyTable
                int r1 = r1.mask
                int r3 = r0 + 1
            Lc:
                r3 = r3 & r1
                r4 = r2[r3]
                if (r4 == 0) goto L25
                com.badlogic.gdx.utils.ObjectSet<K> r5 = r7.set
                int r5 = r5.place(r4)
                int r6 = r3 - r5
                r6 = r6 & r1
                int r5 = r0 - r5
                r5 = r5 & r1
                if (r6 <= r5) goto L22
                r2[r0] = r4
                r0 = r3
            L22:
                int r3 = r3 + 1
                goto Lc
            L25:
                r1 = 0
                r2[r0] = r1
                com.badlogic.gdx.utils.ObjectSet<K> r1 = r7.set
                int r2 = r1.size
                int r2 = r2 + (-1)
                r1.size = r2
                int r1 = r7.currentIndex
                if (r0 == r1) goto L3a
                int r0 = r7.nextIndex
                int r0 = r0 + (-1)
                r7.nextIndex = r0
            L3a:
                r0 = -1
                r7.currentIndex = r0
                return
            L3e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "next must be called before remove."
                r0.<init>(r1)
                throw r0
        }

        public void reset() {
                r1 = this;
                r0 = -1
                r1.currentIndex = r0
                r1.nextIndex = r0
                r1.findNextIndex()
                return
        }
    }

    public ObjectSet() {
            r2 = this;
            r0 = 51
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r2.<init>(r0, r1)
            return
    }

    public ObjectSet(int r2) {
            r1 = this;
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r1.<init>(r2, r0)
            return
    }

    public ObjectSet(int r3, float r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2a
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2a
            r2.loadFactor = r4
            int r3 = tableSize(r3, r4)
            float r0 = (float) r3
            float r0 = r0 * r4
            int r4 = (int) r0
            r2.threshold = r4
            int r4 = r3 + (-1)
            r2.mask = r4
            long r0 = (long) r4
            int r4 = java.lang.Long.numberOfLeadingZeros(r0)
            r2.shift = r4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.keyTable = r3
            return
        L2a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "loadFactor must be > 0 and < 1: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    private void addResize(T r4) {
            r3 = this;
            T[] r0 = r3.keyTable
            int r1 = r3.place(r4)
        L6:
            r2 = r0[r1]
            if (r2 != 0) goto Ld
            r0[r1] = r4
            return
        Ld:
            int r1 = r1 + 1
            int r2 = r3.mask
            r1 = r1 & r2
            goto L6
    }

    private void resize(int r4) {
            r3 = this;
            T[] r0 = r3.keyTable
            int r0 = r0.length
            float r1 = (float) r4
            float r2 = r3.loadFactor
            float r1 = r1 * r2
            int r1 = (int) r1
            r3.threshold = r1
            int r1 = r4 + (-1)
            r3.mask = r1
            long r1 = (long) r1
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            r3.shift = r1
            T[] r1 = r3.keyTable
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r3.keyTable = r4
            int r4 = r3.size
            if (r4 <= 0) goto L2d
            r4 = 0
        L21:
            if (r4 >= r0) goto L2d
            r2 = r1[r4]
            if (r2 == 0) goto L2a
            r3.addResize(r2)
        L2a:
            int r4 = r4 + 1
            goto L21
        L2d:
            return
    }

    static int tableSize(int r3, float r4) {
            if (r3 < 0) goto L2f
            r0 = 2
            float r1 = (float) r3
            float r1 = r1 / r4
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r4 = (int) r1
            int r4 = java.lang.Math.max(r0, r4)
            int r4 = com.badlogic.gdx.math.MathUtils.nextPowerOfTwo(r4)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 > r0) goto L18
            return r4
        L18:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The required capacity is too large: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L2f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "capacity must be >= 0: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public boolean add(T r4) {
            r3 = this;
            int r0 = r3.locateKey(r4)
            if (r0 < 0) goto L8
            r4 = 0
            return r4
        L8:
            r1 = 1
            int r0 = r0 + r1
            int r0 = -r0
            T[] r2 = r3.keyTable
            r2[r0] = r4
            int r4 = r3.size
            int r4 = r4 + r1
            r3.size = r4
            int r0 = r3.threshold
            if (r4 < r0) goto L1d
            int r4 = r2.length
            int r4 = r4 << r1
            r3.resize(r4)
        L1d:
            return r1
    }

    public void clear() {
            r2 = this;
            int r0 = r2.size
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.size = r0
            T[] r0 = r2.keyTable
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
    }

    public void clear(int r2) {
            r1 = this;
            float r0 = r1.loadFactor
            int r2 = tableSize(r2, r0)
            T[] r0 = r1.keyTable
            int r0 = r0.length
            if (r0 > r2) goto Lf
            r1.clear()
            return
        Lf:
            r0 = 0
            r1.size = r0
            r1.resize(r2)
            return
    }

    public boolean contains(T r1) {
            r0 = this;
            int r1 = r0.locateKey(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public void ensureCapacity(int r2) {
            r1 = this;
            int r0 = r1.size
            int r0 = r0 + r2
            float r2 = r1.loadFactor
            int r2 = tableSize(r0, r2)
            T[] r0 = r1.keyTable
            int r0 = r0.length
            if (r0 >= r2) goto L11
            r1.resize(r2)
        L11:
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.badlogic.gdx.utils.ObjectSet
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.badlogic.gdx.utils.ObjectSet r6 = (com.badlogic.gdx.utils.ObjectSet) r6
            int r0 = r6.size
            int r2 = r5.size
            if (r0 == r2) goto Lf
            return r1
        Lf:
            T[] r0 = r5.keyTable
            int r2 = r0.length
            r3 = 0
        L13:
            if (r3 >= r2) goto L25
            r4 = r0[r3]
            if (r4 == 0) goto L22
            r4 = r0[r3]
            boolean r4 = r6.contains(r4)
            if (r4 != 0) goto L22
            return r1
        L22:
            int r3 = r3 + 1
            goto L13
        L25:
            r6 = 1
            return r6
    }

    public T first() {
            r4 = this;
            T[] r0 = r4.keyTable
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L10
            r3 = r0[r2]
            if (r3 == 0) goto Ld
            r0 = r0[r2]
            return r0
        Ld:
            int r2 = r2 + 1
            goto L4
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ObjectSet is empty."
            r0.<init>(r1)
            throw r0
    }

    public int hashCode() {
            r5 = this;
            int r0 = r5.size
            T[] r1 = r5.keyTable
            int r2 = r1.length
            r3 = 0
        L6:
            if (r3 >= r2) goto L14
            r4 = r1[r3]
            if (r4 == 0) goto L11
            int r4 = r4.hashCode()
            int r0 = r0 + r4
        L11:
            int r3 = r3 + 1
            goto L6
        L14:
            return r0
    }

    @Override // java.lang.Iterable
    public com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator<T> iterator() {
            r4 = this;
            boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
            if (r0 == 0) goto La
            com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator r0 = new com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator
            r0.<init>(r4)
            return r0
        La:
            com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator r0 = r4.iterator1
            if (r0 != 0) goto L1c
            com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator r0 = new com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator
            r0.<init>(r4)
            r4.iterator1 = r0
            com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator r0 = new com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator
            r0.<init>(r4)
            r4.iterator2 = r0
        L1c:
            com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator r0 = r4.iterator1
            boolean r1 = r0.valid
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L30
            r0.reset()
            com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator r0 = r4.iterator1
            r0.valid = r3
            com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator r1 = r4.iterator2
            r1.valid = r2
            return r0
        L30:
            com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator r0 = r4.iterator2
            r0.reset()
            com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator r0 = r4.iterator2
            r0.valid = r3
            com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator r1 = r4.iterator1
            r1.valid = r2
            return r0
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator r0 = r1.iterator()
            return r0
    }

    int locateKey(T r4) {
            r3 = this;
            if (r4 == 0) goto L1d
            T[] r0 = r3.keyTable
            int r1 = r3.place(r4)
        L8:
            r2 = r0[r1]
            if (r2 != 0) goto L10
            int r1 = r1 + 1
            int r4 = -r1
            return r4
        L10:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L17
            return r1
        L17:
            int r1 = r1 + 1
            int r2 = r3.mask
            r1 = r1 & r2
            goto L8
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "key cannot be null."
            r4.<init>(r0)
            throw r4
    }

    protected int place(T r5) {
            r4 = this;
            int r5 = r5.hashCode()
            long r0 = (long) r5
            r2 = -7046029254386353131(0x9e3779b97f4a7c15, double:-4.0765893351549374E-163)
            long r0 = r0 * r2
            int r5 = r4.shift
            long r0 = r0 >>> r5
            int r5 = (int) r0
            return r5
    }

    public boolean remove(T r7) {
            r6 = this;
            int r7 = r6.locateKey(r7)
            if (r7 >= 0) goto L8
            r7 = 0
            return r7
        L8:
            T[] r0 = r6.keyTable
            int r1 = r6.mask
            int r2 = r7 + 1
        Le:
            r2 = r2 & r1
            r3 = r0[r2]
            if (r3 == 0) goto L25
            int r4 = r6.place(r3)
            int r5 = r2 - r4
            r5 = r5 & r1
            int r4 = r7 - r4
            r4 = r4 & r1
            if (r5 <= r4) goto L22
            r0[r7] = r3
            r7 = r2
        L22:
            int r2 = r2 + 1
            goto Le
        L25:
            r1 = 0
            r0[r7] = r1
            int r7 = r6.size
            r0 = 1
            int r7 = r7 - r0
            r6.size = r7
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.String r1 = r2.toString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString(java.lang.String r6) {
            r5 = this;
            int r0 = r5.size
            if (r0 != 0) goto L7
            java.lang.String r6 = ""
            return r6
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            T[] r1 = r5.keyTable
            int r2 = r1.length
        L11:
            int r3 = r2 + (-1)
            java.lang.String r4 = "(this)"
            if (r2 <= 0) goto L23
            r2 = r1[r3]
            if (r2 != 0) goto L1d
            r2 = r3
            goto L11
        L1d:
            if (r2 != r5) goto L20
            r2 = r4
        L20:
            r0.append(r2)
        L23:
            int r2 = r3 + (-1)
            if (r3 <= 0) goto L37
            r3 = r1[r2]
            if (r3 != 0) goto L2c
            goto L35
        L2c:
            r0.append(r6)
            if (r3 != r5) goto L32
            r3 = r4
        L32:
            r0.append(r3)
        L35:
            r3 = r2
            goto L23
        L37:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
