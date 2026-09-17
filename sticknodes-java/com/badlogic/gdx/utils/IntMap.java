package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class IntMap<V> implements java.lang.Iterable<com.badlogic.gdx.utils.IntMap.Entry<V>> {
    private transient com.badlogic.gdx.utils.IntMap.Entries entries1;
    private transient com.badlogic.gdx.utils.IntMap.Entries entries2;
    boolean hasZeroValue;
    int[] keyTable;
    private final float loadFactor;
    protected int mask;
    protected int shift;
    public int size;
    private int threshold;
    V[] valueTable;
    V zeroValue;

    public static class Entries<V> extends com.badlogic.gdx.utils.IntMap.MapIterator<V> implements java.lang.Iterable<com.badlogic.gdx.utils.IntMap.Entry<V>>, java.util.Iterator<com.badlogic.gdx.utils.IntMap.Entry<V>> {
        private final com.badlogic.gdx.utils.IntMap.Entry<V> entry;

        public Entries(com.badlogic.gdx.utils.IntMap r1) {
                r0 = this;
                r0.<init>(r1)
                com.badlogic.gdx.utils.IntMap$Entry r1 = new com.badlogic.gdx.utils.IntMap$Entry
                r1.<init>()
                r0.entry = r1
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
        public java.util.Iterator<com.badlogic.gdx.utils.IntMap.Entry<V>> iterator() {
                r0 = this;
                return r0
        }

        @Override // java.util.Iterator
        public com.badlogic.gdx.utils.IntMap.Entry<V> next() {
                r4 = this;
                boolean r0 = r4.hasNext
                if (r0 == 0) goto L37
                boolean r0 = r4.valid
                if (r0 == 0) goto L2f
                com.badlogic.gdx.utils.IntMap<V> r0 = r4.map
                int[] r1 = r0.keyTable
                int r2 = r4.nextIndex
                r3 = -1
                if (r2 != r3) goto L1b
                com.badlogic.gdx.utils.IntMap$Entry<V> r1 = r4.entry
                r3 = 0
                r1.key = r3
                V r0 = r0.zeroValue
                r1.value = r0
                goto L27
            L1b:
                com.badlogic.gdx.utils.IntMap$Entry<V> r3 = r4.entry
                r1 = r1[r2]
                r3.key = r1
                V[] r0 = r0.valueTable
                r0 = r0[r2]
                r3.value = r0
            L27:
                r4.currentIndex = r2
                r4.findNextIndex()
                com.badlogic.gdx.utils.IntMap$Entry<V> r0 = r4.entry
                return r0
            L2f:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
            L37:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                com.badlogic.gdx.utils.IntMap$Entry r0 = r1.next()
                return r0
        }

        @Override // com.badlogic.gdx.utils.IntMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
                r0 = this;
                super.remove()
                return
        }

        @Override // com.badlogic.gdx.utils.IntMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
                r0 = this;
                super.reset()
                return
        }
    }

    public static class Entry<V> {
        public int key;
        public V value;

        public Entry() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r2.key
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                V r1 = r2.value
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static class MapIterator<V> {
        int currentIndex;
        public boolean hasNext;
        final com.badlogic.gdx.utils.IntMap<V> map;
        int nextIndex;
        boolean valid;

        public MapIterator(com.badlogic.gdx.utils.IntMap<V> r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.valid = r0
                r1.map = r2
                r1.reset()
                return
        }

        void findNextIndex() {
                r4 = this;
                com.badlogic.gdx.utils.IntMap<V> r0 = r4.map
                int[] r0 = r0.keyTable
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

        public void remove() {
                r10 = this;
                int r0 = r10.currentIndex
                r1 = 0
                r2 = 0
                r3 = -1
                if (r0 != r3) goto L12
                com.badlogic.gdx.utils.IntMap<V> r3 = r10.map
                boolean r4 = r3.hasZeroValue
                if (r4 == 0) goto L12
                r3.hasZeroValue = r2
                r3.zeroValue = r1
                goto L49
            L12:
                if (r0 < 0) goto L55
                com.badlogic.gdx.utils.IntMap<V> r3 = r10.map
                int[] r4 = r3.keyTable
                V[] r5 = r3.valueTable
                int r3 = r3.mask
                int r6 = r0 + 1
            L1e:
                r6 = r6 & r3
                r7 = r4[r6]
                if (r7 == 0) goto L3b
                com.badlogic.gdx.utils.IntMap<V> r8 = r10.map
                int r8 = r8.place(r7)
                int r9 = r6 - r8
                r9 = r9 & r3
                int r8 = r0 - r8
                r8 = r8 & r3
                if (r9 <= r8) goto L38
                r4[r0] = r7
                r7 = r5[r6]
                r5[r0] = r7
                r0 = r6
            L38:
                int r6 = r6 + 1
                goto L1e
            L3b:
                r4[r0] = r2
                r5[r0] = r1
                int r1 = r10.currentIndex
                if (r0 == r1) goto L49
                int r0 = r10.nextIndex
                int r0 = r0 + (-1)
                r10.nextIndex = r0
            L49:
                r0 = -2
                r10.currentIndex = r0
                com.badlogic.gdx.utils.IntMap<V> r0 = r10.map
                int r1 = r0.size
                int r1 = r1 + (-1)
                r0.size = r1
                return
            L55:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "next must be called before remove."
                r0.<init>(r1)
                throw r0
        }

        public void reset() {
                r1 = this;
                r0 = -2
                r1.currentIndex = r0
                r0 = -1
                r1.nextIndex = r0
                com.badlogic.gdx.utils.IntMap<V> r0 = r1.map
                boolean r0 = r0.hasZeroValue
                if (r0 == 0) goto L10
                r0 = 1
                r1.hasNext = r0
                goto L13
            L10:
                r1.findNextIndex()
            L13:
                return
        }
    }

    public IntMap() {
            r2 = this;
            r0 = 51
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r2.<init>(r0, r1)
            return
    }

    public IntMap(int r3, float r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2e
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2e
            r2.loadFactor = r4
            int r3 = com.badlogic.gdx.utils.ObjectSet.tableSize(r3, r4)
            float r0 = (float) r3
            float r0 = r0 * r4
            int r4 = (int) r0
            r2.threshold = r4
            int r4 = r3 + (-1)
            r2.mask = r4
            long r0 = (long) r4
            int r4 = java.lang.Long.numberOfLeadingZeros(r0)
            r2.shift = r4
            int[] r4 = new int[r3]
            r2.keyTable = r4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.valueTable = r3
            return
        L2e:
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

    private int locateKey(int r4) {
            r3 = this;
            int[] r0 = r3.keyTable
            int r1 = r3.place(r4)
        L6:
            r2 = r0[r1]
            if (r2 != 0) goto Le
            int r1 = r1 + 1
            int r4 = -r1
            return r4
        Le:
            if (r2 != r4) goto L11
            return r1
        L11:
            int r1 = r1 + 1
            int r2 = r3.mask
            r1 = r1 & r2
            goto L6
    }

    private void putResize(int r4, V r5) {
            r3 = this;
            int[] r0 = r3.keyTable
            int r1 = r3.place(r4)
        L6:
            r2 = r0[r1]
            if (r2 != 0) goto L11
            r0[r1] = r4
            V[] r4 = r3.valueTable
            r4[r1] = r5
            return
        L11:
            int r1 = r1 + 1
            int r2 = r3.mask
            r1 = r1 & r2
            goto L6
    }

    private void resize(int r6) {
            r5 = this;
            int[] r0 = r5.keyTable
            int r0 = r0.length
            float r1 = (float) r6
            float r2 = r5.loadFactor
            float r1 = r1 * r2
            int r1 = (int) r1
            r5.threshold = r1
            int r1 = r6 + (-1)
            r5.mask = r1
            long r1 = (long) r1
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            r5.shift = r1
            int[] r1 = r5.keyTable
            V[] r2 = r5.valueTable
            int[] r3 = new int[r6]
            r5.keyTable = r3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r5.valueTable = r6
            int r6 = r5.size
            if (r6 <= 0) goto L35
            r6 = 0
        L27:
            if (r6 >= r0) goto L35
            r3 = r1[r6]
            if (r3 == 0) goto L32
            r4 = r2[r6]
            r5.putResize(r3, r4)
        L32:
            int r6 = r6 + 1
            goto L27
        L35:
            return
    }

    public com.badlogic.gdx.utils.IntMap.Entries<V> entries() {
            r4 = this;
            boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
            if (r0 == 0) goto La
            com.badlogic.gdx.utils.IntMap$Entries r0 = new com.badlogic.gdx.utils.IntMap$Entries
            r0.<init>(r4)
            return r0
        La:
            com.badlogic.gdx.utils.IntMap$Entries r0 = r4.entries1
            if (r0 != 0) goto L1c
            com.badlogic.gdx.utils.IntMap$Entries r0 = new com.badlogic.gdx.utils.IntMap$Entries
            r0.<init>(r4)
            r4.entries1 = r0
            com.badlogic.gdx.utils.IntMap$Entries r0 = new com.badlogic.gdx.utils.IntMap$Entries
            r0.<init>(r4)
            r4.entries2 = r0
        L1c:
            com.badlogic.gdx.utils.IntMap$Entries r0 = r4.entries1
            boolean r1 = r0.valid
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L30
            r0.reset()
            com.badlogic.gdx.utils.IntMap$Entries r0 = r4.entries1
            r0.valid = r3
            com.badlogic.gdx.utils.IntMap$Entries r1 = r4.entries2
            r1.valid = r2
            return r0
        L30:
            com.badlogic.gdx.utils.IntMap$Entries r0 = r4.entries2
            r0.reset()
            com.badlogic.gdx.utils.IntMap$Entries r0 = r4.entries2
            r0.valid = r3
            com.badlogic.gdx.utils.IntMap$Entries r1 = r4.entries1
            r1.valid = r2
            return r0
    }

    public boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r9 != r8) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.badlogic.gdx.utils.IntMap
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.badlogic.gdx.utils.IntMap r9 = (com.badlogic.gdx.utils.IntMap) r9
            int r1 = r9.size
            int r3 = r8.size
            if (r1 == r3) goto L13
            return r2
        L13:
            boolean r1 = r9.hasZeroValue
            boolean r3 = r8.hasZeroValue
            if (r1 == r3) goto L1a
            return r2
        L1a:
            if (r3 == 0) goto L2e
            V r1 = r9.zeroValue
            if (r1 != 0) goto L25
            V r1 = r8.zeroValue
            if (r1 == 0) goto L2e
            return r2
        L25:
            V r3 = r8.zeroValue
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2e
            return r2
        L2e:
            int[] r1 = r8.keyTable
            V[] r3 = r8.valueTable
            int r4 = r1.length
            r5 = 0
        L34:
            if (r5 >= r4) goto L55
            r6 = r1[r5]
            if (r6 == 0) goto L52
            r7 = r3[r5]
            if (r7 != 0) goto L47
            java.lang.Object r7 = com.badlogic.gdx.utils.ObjectMap.dummy
            java.lang.Object r6 = r9.get(r6, r7)
            if (r6 == 0) goto L52
            return r2
        L47:
            java.lang.Object r6 = r9.get(r6)
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L52
            return r2
        L52:
            int r5 = r5 + 1
            goto L34
        L55:
            return r0
    }

    public V get(int r2) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto La
            boolean r2 = r1.hasZeroValue
            if (r2 == 0) goto L9
            V r0 = r1.zeroValue
        L9:
            return r0
        La:
            int r2 = r1.locateKey(r2)
            if (r2 < 0) goto L14
            V[] r0 = r1.valueTable
            r0 = r0[r2]
        L14:
            return r0
    }

    public V get(int r1, V r2) {
            r0 = this;
            if (r1 != 0) goto L9
            boolean r1 = r0.hasZeroValue
            if (r1 == 0) goto L8
            V r2 = r0.zeroValue
        L8:
            return r2
        L9:
            int r1 = r0.locateKey(r1)
            if (r1 < 0) goto L13
            V[] r2 = r0.valueTable
            r2 = r2[r1]
        L13:
            return r2
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.size
            boolean r1 = r6.hasZeroValue
            if (r1 == 0) goto Lf
            V r1 = r6.zeroValue
            if (r1 == 0) goto Lf
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        Lf:
            int[] r1 = r6.keyTable
            V[] r2 = r6.valueTable
            r3 = 0
            int r4 = r1.length
        L15:
            if (r3 >= r4) goto L2a
            r5 = r1[r3]
            if (r5 == 0) goto L27
            int r5 = r5 * 31
            int r0 = r0 + r5
            r5 = r2[r3]
            if (r5 == 0) goto L27
            int r5 = r5.hashCode()
            int r0 = r0 + r5
        L27:
            int r3 = r3 + 1
            goto L15
        L2a:
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.badlogic.gdx.utils.IntMap.Entry<V>> iterator() {
            r1 = this;
            com.badlogic.gdx.utils.IntMap$Entries r0 = r1.entries()
            return r0
    }

    protected int place(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = -7046029254386353131(0x9e3779b97f4a7c15, double:-4.0765893351549374E-163)
            long r0 = r0 * r2
            int r5 = r4.shift
            long r0 = r0 >>> r5
            int r5 = (int) r0
            return r5
    }

    public V put(int r4, V r5) {
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L13
            V r4 = r3.zeroValue
            r3.zeroValue = r5
            boolean r5 = r3.hasZeroValue
            if (r5 != 0) goto L12
            r3.hasZeroValue = r0
            int r5 = r3.size
            int r5 = r5 + r0
            r3.size = r5
        L12:
            return r4
        L13:
            int r1 = r3.locateKey(r4)
            if (r1 < 0) goto L20
            V[] r4 = r3.valueTable
            r0 = r4[r1]
            r4[r1] = r5
            return r0
        L20:
            int r1 = r1 + r0
            int r1 = -r1
            int[] r2 = r3.keyTable
            r2[r1] = r4
            V[] r4 = r3.valueTable
            r4[r1] = r5
            int r4 = r3.size
            int r4 = r4 + r0
            r3.size = r4
            int r5 = r3.threshold
            if (r4 < r5) goto L38
            int r4 = r2.length
            int r4 = r4 << r0
            r3.resize(r4)
        L38:
            r4 = 0
            return r4
    }

    public java.lang.String toString() {
            r7 = this;
            int r0 = r7.size
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r7.keyTable
            V[] r2 = r7.valueTable
            int r3 = r1.length
            boolean r4 = r7.hasZeroValue
            r5 = 61
            if (r4 == 0) goto L29
            java.lang.String r4 = "0="
            r0.append(r4)
            V r4 = r7.zeroValue
            r0.append(r4)
            goto L3f
        L29:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L3e
            r3 = r1[r4]
            if (r3 != 0) goto L33
            r3 = r4
            goto L29
        L33:
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
        L3e:
            r3 = r4
        L3f:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L59
            r3 = r1[r4]
            if (r3 != 0) goto L48
            goto L3e
        L48:
            java.lang.String r6 = ", "
            r0.append(r6)
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
            goto L3e
        L59:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
