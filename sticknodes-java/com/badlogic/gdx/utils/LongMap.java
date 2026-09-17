package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class LongMap<V> implements java.lang.Iterable<com.badlogic.gdx.utils.LongMap.Entry<V>> {
    private transient com.badlogic.gdx.utils.LongMap.Entries entries1;
    private transient com.badlogic.gdx.utils.LongMap.Entries entries2;
    boolean hasZeroValue;
    long[] keyTable;
    private final float loadFactor;
    protected int mask;
    protected int shift;
    public int size;
    private int threshold;
    V[] valueTable;
    V zeroValue;

    public static class Entries<V> extends com.badlogic.gdx.utils.LongMap.MapIterator<V> implements java.lang.Iterable<com.badlogic.gdx.utils.LongMap.Entry<V>>, java.util.Iterator<com.badlogic.gdx.utils.LongMap.Entry<V>> {
        private final com.badlogic.gdx.utils.LongMap.Entry<V> entry;

        public Entries(com.badlogic.gdx.utils.LongMap r1) {
                r0 = this;
                r0.<init>(r1)
                com.badlogic.gdx.utils.LongMap$Entry r1 = new com.badlogic.gdx.utils.LongMap$Entry
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
        public java.util.Iterator<com.badlogic.gdx.utils.LongMap.Entry<V>> iterator() {
                r0 = this;
                return r0
        }

        @Override // java.util.Iterator
        public com.badlogic.gdx.utils.LongMap.Entry<V> next() {
                r6 = this;
                boolean r0 = r6.hasNext
                if (r0 == 0) goto L38
                boolean r0 = r6.valid
                if (r0 == 0) goto L30
                com.badlogic.gdx.utils.LongMap<V> r0 = r6.map
                long[] r1 = r0.keyTable
                int r2 = r6.nextIndex
                r3 = -1
                if (r2 != r3) goto L1c
                com.badlogic.gdx.utils.LongMap$Entry<V> r1 = r6.entry
                r3 = 0
                r1.key = r3
                V r0 = r0.zeroValue
                r1.value = r0
                goto L28
            L1c:
                com.badlogic.gdx.utils.LongMap$Entry<V> r3 = r6.entry
                r4 = r1[r2]
                r3.key = r4
                V[] r0 = r0.valueTable
                r0 = r0[r2]
                r3.value = r0
            L28:
                r6.currentIndex = r2
                r6.findNextIndex()
                com.badlogic.gdx.utils.LongMap$Entry<V> r0 = r6.entry
                return r0
            L30:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
            L38:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                com.badlogic.gdx.utils.LongMap$Entry r0 = r1.next()
                return r0
        }

        @Override // com.badlogic.gdx.utils.LongMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
                r0 = this;
                super.remove()
                return
        }

        @Override // com.badlogic.gdx.utils.LongMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
                r0 = this;
                super.reset()
                return
        }
    }

    public static class Entry<V> {
        public long key;
        public V value;

        public Entry() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r1 = r3.key
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                V r1 = r3.value
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static class MapIterator<V> {
        int currentIndex;
        public boolean hasNext;
        final com.badlogic.gdx.utils.LongMap<V> map;
        int nextIndex;
        boolean valid;

        public MapIterator(com.badlogic.gdx.utils.LongMap<V> r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.valid = r0
                r1.map = r2
                r1.reset()
                return
        }

        void findNextIndex() {
                r8 = this;
                com.badlogic.gdx.utils.LongMap<V> r0 = r8.map
                long[] r0 = r0.keyTable
                int r1 = r0.length
            L5:
                int r2 = r8.nextIndex
                r3 = 1
                int r2 = r2 + r3
                r8.nextIndex = r2
                if (r2 >= r1) goto L18
                r4 = r0[r2]
                r6 = 0
                int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r2 == 0) goto L5
                r8.hasNext = r3
                return
            L18:
                r0 = 0
                r8.hasNext = r0
                return
        }

        public void remove() {
                r11 = this;
                int r0 = r11.currentIndex
                r1 = 0
                r2 = -1
                if (r0 != r2) goto L12
                com.badlogic.gdx.utils.LongMap<V> r2 = r11.map
                boolean r3 = r2.hasZeroValue
                if (r3 == 0) goto L12
                r0 = 0
                r2.hasZeroValue = r0
                r2.zeroValue = r1
                goto L4d
            L12:
                if (r0 < 0) goto L59
                com.badlogic.gdx.utils.LongMap<V> r2 = r11.map
                long[] r3 = r2.keyTable
                V[] r4 = r2.valueTable
                int r2 = r2.mask
                int r5 = r0 + 1
            L1e:
                r5 = r5 & r2
                r6 = r3[r5]
                r8 = 0
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 == 0) goto L3f
                com.badlogic.gdx.utils.LongMap<V> r8 = r11.map
                int r8 = r8.place(r6)
                int r9 = r5 - r8
                r9 = r9 & r2
                int r8 = r0 - r8
                r8 = r8 & r2
                if (r9 <= r8) goto L3c
                r3[r0] = r6
                r6 = r4[r5]
                r4[r0] = r6
                r0 = r5
            L3c:
                int r5 = r5 + 1
                goto L1e
            L3f:
                r3[r0] = r8
                r4[r0] = r1
                int r1 = r11.currentIndex
                if (r0 == r1) goto L4d
                int r0 = r11.nextIndex
                int r0 = r0 + (-1)
                r11.nextIndex = r0
            L4d:
                r0 = -2
                r11.currentIndex = r0
                com.badlogic.gdx.utils.LongMap<V> r0 = r11.map
                int r1 = r0.size
                int r1 = r1 + (-1)
                r0.size = r1
                return
            L59:
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
                com.badlogic.gdx.utils.LongMap<V> r0 = r1.map
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

    public LongMap() {
            r2 = this;
            r0 = 51
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r2.<init>(r0, r1)
            return
    }

    public LongMap(int r3, float r4) {
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
            long[] r4 = new long[r3]
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

    private int locateKey(long r8) {
            r7 = this;
            long[] r0 = r7.keyTable
            int r1 = r7.place(r8)
        L6:
            r2 = r0[r1]
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L12
            int r1 = r1 + 1
            int r8 = -r1
            return r8
        L12:
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 != 0) goto L17
            return r1
        L17:
            int r1 = r1 + 1
            int r2 = r7.mask
            r1 = r1 & r2
            goto L6
    }

    private void putResize(long r8, V r10) {
            r7 = this;
            long[] r0 = r7.keyTable
            int r1 = r7.place(r8)
        L6:
            r2 = r0[r1]
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L15
            r0[r1] = r8
            V[] r8 = r7.valueTable
            r8[r1] = r10
            return
        L15:
            int r1 = r1 + 1
            int r2 = r7.mask
            r1 = r1 & r2
            goto L6
    }

    private void resize(int r9) {
            r8 = this;
            long[] r0 = r8.keyTable
            int r0 = r0.length
            float r1 = (float) r9
            float r2 = r8.loadFactor
            float r1 = r1 * r2
            int r1 = (int) r1
            r8.threshold = r1
            int r1 = r9 + (-1)
            r8.mask = r1
            long r1 = (long) r1
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            r8.shift = r1
            long[] r1 = r8.keyTable
            V[] r2 = r8.valueTable
            long[] r3 = new long[r9]
            r8.keyTable = r3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r8.valueTable = r9
            int r9 = r8.size
            if (r9 <= 0) goto L39
            r9 = 0
        L27:
            if (r9 >= r0) goto L39
            r3 = r1[r9]
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L36
            r5 = r2[r9]
            r8.putResize(r3, r5)
        L36:
            int r9 = r9 + 1
            goto L27
        L39:
            return
    }

    public com.badlogic.gdx.utils.LongMap.Entries<V> entries() {
            r4 = this;
            boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
            if (r0 == 0) goto La
            com.badlogic.gdx.utils.LongMap$Entries r0 = new com.badlogic.gdx.utils.LongMap$Entries
            r0.<init>(r4)
            return r0
        La:
            com.badlogic.gdx.utils.LongMap$Entries r0 = r4.entries1
            if (r0 != 0) goto L1c
            com.badlogic.gdx.utils.LongMap$Entries r0 = new com.badlogic.gdx.utils.LongMap$Entries
            r0.<init>(r4)
            r4.entries1 = r0
            com.badlogic.gdx.utils.LongMap$Entries r0 = new com.badlogic.gdx.utils.LongMap$Entries
            r0.<init>(r4)
            r4.entries2 = r0
        L1c:
            com.badlogic.gdx.utils.LongMap$Entries r0 = r4.entries1
            boolean r1 = r0.valid
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L30
            r0.reset()
            com.badlogic.gdx.utils.LongMap$Entries r0 = r4.entries1
            r0.valid = r3
            com.badlogic.gdx.utils.LongMap$Entries r1 = r4.entries2
            r1.valid = r2
            return r0
        L30:
            com.badlogic.gdx.utils.LongMap$Entries r0 = r4.entries2
            r0.reset()
            com.badlogic.gdx.utils.LongMap$Entries r0 = r4.entries2
            r0.valid = r3
            com.badlogic.gdx.utils.LongMap$Entries r1 = r4.entries1
            r1.valid = r2
            return r0
    }

    public boolean equals(java.lang.Object r12) {
            r11 = this;
            r0 = 1
            if (r12 != r11) goto L4
            return r0
        L4:
            boolean r1 = r12 instanceof com.badlogic.gdx.utils.LongMap
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.badlogic.gdx.utils.LongMap r12 = (com.badlogic.gdx.utils.LongMap) r12
            int r1 = r12.size
            int r3 = r11.size
            if (r1 == r3) goto L13
            return r2
        L13:
            boolean r1 = r12.hasZeroValue
            boolean r3 = r11.hasZeroValue
            if (r1 == r3) goto L1a
            return r2
        L1a:
            if (r3 == 0) goto L2e
            V r1 = r12.zeroValue
            if (r1 != 0) goto L25
            V r1 = r11.zeroValue
            if (r1 == 0) goto L2e
            return r2
        L25:
            V r3 = r11.zeroValue
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2e
            return r2
        L2e:
            long[] r1 = r11.keyTable
            V[] r3 = r11.valueTable
            int r4 = r1.length
            r5 = 0
        L34:
            if (r5 >= r4) goto L59
            r6 = r1[r5]
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L56
            r8 = r3[r5]
            if (r8 != 0) goto L4b
            java.lang.Object r8 = com.badlogic.gdx.utils.ObjectMap.dummy
            java.lang.Object r6 = r12.get(r6, r8)
            if (r6 == 0) goto L56
            return r2
        L4b:
            java.lang.Object r6 = r12.get(r6)
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L56
            return r2
        L56:
            int r5 = r5 + 1
            goto L34
        L59:
            return r0
    }

    public V get(long r5) {
            r4 = this;
            r0 = 0
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto Le
            boolean r5 = r4.hasZeroValue
            if (r5 == 0) goto Ld
            V r0 = r4.zeroValue
        Ld:
            return r0
        Le:
            int r5 = r4.locateKey(r5)
            if (r5 < 0) goto L18
            V[] r6 = r4.valueTable
            r0 = r6[r5]
        L18:
            return r0
    }

    public V get(long r4, V r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            boolean r4 = r3.hasZeroValue
            if (r4 == 0) goto Lc
            V r6 = r3.zeroValue
        Lc:
            return r6
        Ld:
            int r4 = r3.locateKey(r4)
            if (r4 < 0) goto L17
            V[] r5 = r3.valueTable
            r6 = r5[r4]
        L17:
            return r6
    }

    public int hashCode() {
            r11 = this;
            int r0 = r11.size
            boolean r1 = r11.hasZeroValue
            if (r1 == 0) goto Lf
            V r1 = r11.zeroValue
            if (r1 == 0) goto Lf
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        Lf:
            long[] r1 = r11.keyTable
            V[] r2 = r11.valueTable
            r3 = 0
            int r4 = r1.length
        L15:
            if (r3 >= r4) goto L32
            r5 = r1[r3]
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L2f
            long r7 = (long) r0
            r9 = 31
            long r5 = r5 * r9
            long r7 = r7 + r5
            int r0 = (int) r7
            r5 = r2[r3]
            if (r5 == 0) goto L2f
            int r5 = r5.hashCode()
            int r0 = r0 + r5
        L2f:
            int r3 = r3 + 1
            goto L15
        L32:
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.badlogic.gdx.utils.LongMap.Entry<V>> iterator() {
            r1 = this;
            com.badlogic.gdx.utils.LongMap$Entries r0 = r1.entries()
            return r0
    }

    protected int place(long r3) {
            r2 = this;
            r0 = 32
            long r0 = r3 >>> r0
            long r3 = r3 ^ r0
            r0 = -7046029254386353131(0x9e3779b97f4a7c15, double:-4.0765893351549374E-163)
            long r3 = r3 * r0
            int r0 = r2.shift
            long r3 = r3 >>> r0
            int r4 = (int) r3
            return r4
    }

    public V put(long r5, V r7) {
            r4 = this;
            r0 = 1
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto L17
            V r5 = r4.zeroValue
            r4.zeroValue = r7
            boolean r6 = r4.hasZeroValue
            if (r6 != 0) goto L16
            r4.hasZeroValue = r0
            int r6 = r4.size
            int r6 = r6 + r0
            r4.size = r6
        L16:
            return r5
        L17:
            int r1 = r4.locateKey(r5)
            if (r1 < 0) goto L24
            V[] r5 = r4.valueTable
            r6 = r5[r1]
            r5[r1] = r7
            return r6
        L24:
            int r1 = r1 + r0
            int r1 = -r1
            long[] r2 = r4.keyTable
            r2[r1] = r5
            V[] r5 = r4.valueTable
            r5[r1] = r7
            int r5 = r4.size
            int r5 = r5 + r0
            r4.size = r5
            int r6 = r4.threshold
            if (r5 < r6) goto L3c
            int r5 = r2.length
            int r5 = r5 << r0
            r4.resize(r5)
        L3c:
            r5 = 0
            return r5
    }

    public java.lang.String toString() {
            r10 = this;
            int r0 = r10.size
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            long[] r1 = r10.keyTable
            V[] r2 = r10.valueTable
            int r3 = r1.length
            boolean r4 = r10.hasZeroValue
            r5 = 61
            r6 = 0
            if (r4 == 0) goto L2b
            java.lang.String r4 = "0="
            r0.append(r4)
            V r4 = r10.zeroValue
            r0.append(r4)
            goto L43
        L2b:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L42
            r8 = r1[r4]
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto L37
            r3 = r4
            goto L2b
        L37:
            r0.append(r8)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
        L42:
            r3 = r4
        L43:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L5f
            r8 = r1[r4]
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto L4e
            goto L42
        L4e:
            java.lang.String r3 = ", "
            r0.append(r3)
            r0.append(r8)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
            goto L42
        L5f:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
