package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class ObjectMap<K, V> implements java.lang.Iterable<com.badlogic.gdx.utils.ObjectMap.Entry<K, V>> {
    static final java.lang.Object dummy = null;
    transient com.badlogic.gdx.utils.ObjectMap.Entries entries1;
    transient com.badlogic.gdx.utils.ObjectMap.Entries entries2;
    K[] keyTable;
    transient com.badlogic.gdx.utils.ObjectMap.Keys keys1;
    transient com.badlogic.gdx.utils.ObjectMap.Keys keys2;
    float loadFactor;
    protected int mask;
    protected int shift;
    public int size;
    int threshold;
    V[] valueTable;
    transient com.badlogic.gdx.utils.ObjectMap.Values values1;
    transient com.badlogic.gdx.utils.ObjectMap.Values values2;

    public static class Entries<K, V> extends com.badlogic.gdx.utils.ObjectMap.MapIterator<K, V, com.badlogic.gdx.utils.ObjectMap.Entry<K, V>> {
        com.badlogic.gdx.utils.ObjectMap.Entry<K, V> entry;

        public Entries(com.badlogic.gdx.utils.ObjectMap<K, V> r1) {
                r0 = this;
                r0.<init>(r1)
                com.badlogic.gdx.utils.ObjectMap$Entry r1 = new com.badlogic.gdx.utils.ObjectMap$Entry
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
        public com.badlogic.gdx.utils.ObjectMap.Entries<K, V> iterator() {
                r0 = this;
                return r0
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.badlogic.gdx.utils.ObjectMap$Entries r0 = r1.iterator()
                return r0
        }

        @Override // java.util.Iterator
        public com.badlogic.gdx.utils.ObjectMap.Entry<K, V> next() {
                r4 = this;
                boolean r0 = r4.hasNext
                if (r0 == 0) goto L2a
                boolean r0 = r4.valid
                if (r0 == 0) goto L22
                com.badlogic.gdx.utils.ObjectMap<K, V> r0 = r4.map
                K[] r1 = r0.keyTable
                com.badlogic.gdx.utils.ObjectMap$Entry<K, V> r2 = r4.entry
                int r3 = r4.nextIndex
                r1 = r1[r3]
                r2.key = r1
                V[] r0 = r0.valueTable
                r0 = r0[r3]
                r2.value = r0
                r4.currentIndex = r3
                r4.findNextIndex()
                com.badlogic.gdx.utils.ObjectMap$Entry<K, V> r0 = r4.entry
                return r0
            L22:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
            L2a:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                com.badlogic.gdx.utils.ObjectMap$Entry r0 = r1.next()
                return r0
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
                r0 = this;
                super.remove()
                return
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
                r0 = this;
                super.reset()
                return
        }
    }

    public static class Entry<K, V> {
        public K key;
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
                K r1 = r2.key
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                V r1 = r2.value
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class Keys<K> extends com.badlogic.gdx.utils.ObjectMap.MapIterator<K, java.lang.Object, K> {
        public Keys(com.badlogic.gdx.utils.ObjectMap<K, ?> r1) {
                r0 = this;
                r0.<init>(r1)
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
        public com.badlogic.gdx.utils.ObjectMap.Keys<K> iterator() {
                r0 = this;
                return r0
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.badlogic.gdx.utils.ObjectMap$Keys r0 = r1.iterator()
                return r0
        }

        @Override // java.util.Iterator
        public K next() {
                r2 = this;
                boolean r0 = r2.hasNext
                if (r0 == 0) goto L1e
                boolean r0 = r2.valid
                if (r0 == 0) goto L16
                com.badlogic.gdx.utils.ObjectMap<K, V> r0 = r2.map
                K[] r0 = r0.keyTable
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

        @Override // com.badlogic.gdx.utils.ObjectMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
                r0 = this;
                super.remove()
                return
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
                r0 = this;
                super.reset()
                return
        }

        public com.badlogic.gdx.utils.Array<K> toArray() {
                r3 = this;
                com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
                com.badlogic.gdx.utils.ObjectMap<K, V> r1 = r3.map
                int r1 = r1.size
                r2 = 1
                r0.<init>(r2, r1)
                com.badlogic.gdx.utils.Array r0 = r3.toArray(r0)
                return r0
        }

        public com.badlogic.gdx.utils.Array<K> toArray(com.badlogic.gdx.utils.Array<K> r2) {
                r1 = this;
            L0:
                boolean r0 = r1.hasNext
                if (r0 == 0) goto Lc
                java.lang.Object r0 = r1.next()
                r2.add(r0)
                goto L0
            Lc:
                return r2
        }
    }

    private static abstract class MapIterator<K, V, I> implements java.lang.Iterable<I>, java.util.Iterator<I> {
        int currentIndex;
        public boolean hasNext;
        final com.badlogic.gdx.utils.ObjectMap<K, V> map;
        int nextIndex;
        boolean valid;

        public MapIterator(com.badlogic.gdx.utils.ObjectMap<K, V> r2) {
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
                com.badlogic.gdx.utils.ObjectMap<K, V> r0 = r4.map
                K[] r0 = r0.keyTable
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
                r8 = this;
                int r0 = r8.currentIndex
                if (r0 < 0) goto L46
                com.badlogic.gdx.utils.ObjectMap<K, V> r1 = r8.map
                K[] r2 = r1.keyTable
                V[] r3 = r1.valueTable
                int r1 = r1.mask
                int r4 = r0 + 1
            Le:
                r4 = r4 & r1
                r5 = r2[r4]
                if (r5 == 0) goto L2b
                com.badlogic.gdx.utils.ObjectMap<K, V> r6 = r8.map
                int r6 = r6.place(r5)
                int r7 = r4 - r6
                r7 = r7 & r1
                int r6 = r0 - r6
                r6 = r6 & r1
                if (r7 <= r6) goto L28
                r2[r0] = r5
                r5 = r3[r4]
                r3[r0] = r5
                r0 = r4
            L28:
                int r4 = r4 + 1
                goto Le
            L2b:
                r1 = 0
                r2[r0] = r1
                r3[r0] = r1
                com.badlogic.gdx.utils.ObjectMap<K, V> r1 = r8.map
                int r2 = r1.size
                int r2 = r2 + (-1)
                r1.size = r2
                int r1 = r8.currentIndex
                if (r0 == r1) goto L42
                int r0 = r8.nextIndex
                int r0 = r0 + (-1)
                r8.nextIndex = r0
            L42:
                r0 = -1
                r8.currentIndex = r0
                return
            L46:
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

    public static class Values<V> extends com.badlogic.gdx.utils.ObjectMap.MapIterator<java.lang.Object, V, V> {
        public Values(com.badlogic.gdx.utils.ObjectMap<?, V> r1) {
                r0 = this;
                r0.<init>(r1)
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
        public com.badlogic.gdx.utils.ObjectMap.Values<V> iterator() {
                r0 = this;
                return r0
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.badlogic.gdx.utils.ObjectMap$Values r0 = r1.iterator()
                return r0
        }

        @Override // java.util.Iterator
        public V next() {
                r2 = this;
                boolean r0 = r2.hasNext
                if (r0 == 0) goto L1e
                boolean r0 = r2.valid
                if (r0 == 0) goto L16
                com.badlogic.gdx.utils.ObjectMap<K, V> r0 = r2.map
                V[] r0 = r0.valueTable
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

        @Override // com.badlogic.gdx.utils.ObjectMap.MapIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
                r0 = this;
                super.remove()
                return
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.MapIterator
        public /* bridge */ /* synthetic */ void reset() {
                r0 = this;
                super.reset()
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.badlogic.gdx.utils.ObjectMap.dummy = r0
            return
    }

    public ObjectMap() {
            r2 = this;
            r0 = 51
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r2.<init>(r0, r1)
            return
    }

    public ObjectMap(int r2) {
            r1 = this;
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r1.<init>(r2, r0)
            return
    }

    public ObjectMap(int r3, float r4) {
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
            java.lang.Object[] r4 = new java.lang.Object[r3]
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

    private void putResize(K r4, V r5) {
            r3 = this;
            K[] r0 = r3.keyTable
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

    public void clear() {
            r2 = this;
            int r0 = r2.size
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.size = r0
            K[] r0 = r2.keyTable
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            V[] r0 = r2.valueTable
            java.util.Arrays.fill(r0, r1)
            return
    }

    public void clear(int r2) {
            r1 = this;
            float r0 = r1.loadFactor
            int r2 = com.badlogic.gdx.utils.ObjectSet.tableSize(r2, r0)
            K[] r0 = r1.keyTable
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

    public boolean containsKey(K r1) {
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

    public com.badlogic.gdx.utils.ObjectMap.Entries<K, V> entries() {
            r4 = this;
            boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
            if (r0 == 0) goto La
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = new com.badlogic.gdx.utils.ObjectMap$Entries
            r0.<init>(r4)
            return r0
        La:
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = r4.entries1
            if (r0 != 0) goto L1c
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = new com.badlogic.gdx.utils.ObjectMap$Entries
            r0.<init>(r4)
            r4.entries1 = r0
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = new com.badlogic.gdx.utils.ObjectMap$Entries
            r0.<init>(r4)
            r4.entries2 = r0
        L1c:
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = r4.entries1
            boolean r1 = r0.valid
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L30
            r0.reset()
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = r4.entries1
            r0.valid = r3
            com.badlogic.gdx.utils.ObjectMap$Entries r1 = r4.entries2
            r1.valid = r2
            return r0
        L30:
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = r4.entries2
            r0.reset()
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = r4.entries2
            r0.valid = r3
            com.badlogic.gdx.utils.ObjectMap$Entries r1 = r4.entries1
            r1.valid = r2
            return r0
    }

    public boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r9 != r8) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.badlogic.gdx.utils.ObjectMap
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.badlogic.gdx.utils.ObjectMap r9 = (com.badlogic.gdx.utils.ObjectMap) r9
            int r1 = r9.size
            int r3 = r8.size
            if (r1 == r3) goto L13
            return r2
        L13:
            K[] r1 = r8.keyTable
            V[] r3 = r8.valueTable
            int r4 = r1.length
            r5 = 0
        L19:
            if (r5 >= r4) goto L3a
            r6 = r1[r5]
            if (r6 == 0) goto L37
            r7 = r3[r5]
            if (r7 != 0) goto L2c
            java.lang.Object r7 = com.badlogic.gdx.utils.ObjectMap.dummy
            java.lang.Object r6 = r9.get(r6, r7)
            if (r6 == 0) goto L37
            return r2
        L2c:
            java.lang.Object r6 = r9.get(r6)
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L37
            return r2
        L37:
            int r5 = r5 + 1
            goto L19
        L3a:
            return r0
    }

    public <T extends K> V get(T r2) {
            r1 = this;
            int r2 = r1.locateKey(r2)
            if (r2 >= 0) goto L8
            r2 = 0
            goto Lc
        L8:
            V[] r0 = r1.valueTable
            r2 = r0[r2]
        Lc:
            return r2
    }

    public V get(K r1, V r2) {
            r0 = this;
            int r1 = r0.locateKey(r1)
            if (r1 >= 0) goto L7
            goto Lb
        L7:
            V[] r2 = r0.valueTable
            r2 = r2[r1]
        Lb:
            return r2
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.size
            K[] r1 = r6.keyTable
            V[] r2 = r6.valueTable
            int r3 = r1.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L1f
            r5 = r1[r4]
            if (r5 == 0) goto L1c
            int r5 = r5.hashCode()
            int r0 = r0 + r5
            r5 = r2[r4]
            if (r5 == 0) goto L1c
            int r5 = r5.hashCode()
            int r0 = r0 + r5
        L1c:
            int r4 = r4 + 1
            goto L8
        L1f:
            return r0
    }

    @Override // java.lang.Iterable
    public com.badlogic.gdx.utils.ObjectMap.Entries<K, V> iterator() {
            r1 = this;
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = r1.entries()
            return r0
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = r1.iterator()
            return r0
    }

    public com.badlogic.gdx.utils.ObjectMap.Keys<K> keys() {
            r4 = this;
            boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
            if (r0 == 0) goto La
            com.badlogic.gdx.utils.ObjectMap$Keys r0 = new com.badlogic.gdx.utils.ObjectMap$Keys
            r0.<init>(r4)
            return r0
        La:
            com.badlogic.gdx.utils.ObjectMap$Keys r0 = r4.keys1
            if (r0 != 0) goto L1c
            com.badlogic.gdx.utils.ObjectMap$Keys r0 = new com.badlogic.gdx.utils.ObjectMap$Keys
            r0.<init>(r4)
            r4.keys1 = r0
            com.badlogic.gdx.utils.ObjectMap$Keys r0 = new com.badlogic.gdx.utils.ObjectMap$Keys
            r0.<init>(r4)
            r4.keys2 = r0
        L1c:
            com.badlogic.gdx.utils.ObjectMap$Keys r0 = r4.keys1
            boolean r1 = r0.valid
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L30
            r0.reset()
            com.badlogic.gdx.utils.ObjectMap$Keys r0 = r4.keys1
            r0.valid = r3
            com.badlogic.gdx.utils.ObjectMap$Keys r1 = r4.keys2
            r1.valid = r2
            return r0
        L30:
            com.badlogic.gdx.utils.ObjectMap$Keys r0 = r4.keys2
            r0.reset()
            com.badlogic.gdx.utils.ObjectMap$Keys r0 = r4.keys2
            r0.valid = r3
            com.badlogic.gdx.utils.ObjectMap$Keys r1 = r4.keys1
            r1.valid = r2
            return r0
    }

    int locateKey(K r4) {
            r3 = this;
            if (r4 == 0) goto L1d
            K[] r0 = r3.keyTable
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

    protected int place(K r5) {
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

    public V put(K r3, V r4) {
            r2 = this;
            int r0 = r2.locateKey(r3)
            if (r0 < 0) goto Ld
            V[] r3 = r2.valueTable
            r1 = r3[r0]
            r3[r0] = r4
            return r1
        Ld:
            int r0 = r0 + 1
            int r0 = -r0
            K[] r1 = r2.keyTable
            r1[r0] = r3
            V[] r3 = r2.valueTable
            r3[r0] = r4
            int r3 = r2.size
            int r3 = r3 + 1
            r2.size = r3
            int r4 = r2.threshold
            if (r3 < r4) goto L28
            int r3 = r1.length
            int r3 = r3 << 1
            r2.resize(r3)
        L28:
            r3 = 0
            return r3
    }

    public V remove(K r10) {
            r9 = this;
            int r10 = r9.locateKey(r10)
            r0 = 0
            if (r10 >= 0) goto L8
            return r0
        L8:
            K[] r1 = r9.keyTable
            V[] r2 = r9.valueTable
            r3 = r2[r10]
            int r4 = r9.mask
            int r5 = r10 + 1
        L12:
            r5 = r5 & r4
            r6 = r1[r5]
            if (r6 == 0) goto L2d
            int r7 = r9.place(r6)
            int r8 = r5 - r7
            r8 = r8 & r4
            int r7 = r10 - r7
            r7 = r7 & r4
            if (r8 <= r7) goto L2a
            r1[r10] = r6
            r6 = r2[r5]
            r2[r10] = r6
            r10 = r5
        L2a:
            int r5 = r5 + 1
            goto L12
        L2d:
            r1[r10] = r0
            r2[r10] = r0
            int r10 = r9.size
            int r10 = r10 + (-1)
            r9.size = r10
            return r3
    }

    final void resize(int r6) {
            r5 = this;
            K[] r0 = r5.keyTable
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
            K[] r1 = r5.keyTable
            V[] r2 = r5.valueTable
            java.lang.Object[] r3 = new java.lang.Object[r6]
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

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = ", "
            r1 = 1
            java.lang.String r0 = r2.toString(r0, r1)
            return r0
    }

    protected java.lang.String toString(java.lang.String r8, boolean r9) {
            r7 = this;
            int r0 = r7.size
            if (r0 != 0) goto Lc
            if (r9 == 0) goto L9
            java.lang.String r8 = "{}"
            goto Lb
        L9:
            java.lang.String r8 = ""
        Lb:
            return r8
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            if (r9 == 0) goto L1a
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
        L1a:
            K[] r1 = r7.keyTable
            V[] r2 = r7.valueTable
            int r3 = r1.length
        L1f:
            int r4 = r3 + (-1)
            r5 = 61
            java.lang.String r6 = "(this)"
            if (r3 <= 0) goto L3e
            r3 = r1[r4]
            if (r3 != 0) goto L2d
            r3 = r4
            goto L1f
        L2d:
            if (r3 != r7) goto L30
            r3 = r6
        L30:
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r4]
            if (r3 != r7) goto L3b
            r3 = r6
        L3b:
            r0.append(r3)
        L3e:
            int r3 = r4 + (-1)
            if (r4 <= 0) goto L5d
            r4 = r1[r3]
            if (r4 != 0) goto L47
            goto L5b
        L47:
            r0.append(r8)
            if (r4 != r7) goto L4d
            r4 = r6
        L4d:
            r0.append(r4)
            r0.append(r5)
            r4 = r2[r3]
            if (r4 != r7) goto L58
            r4 = r6
        L58:
            r0.append(r4)
        L5b:
            r4 = r3
            goto L3e
        L5d:
            if (r9 == 0) goto L64
            r8 = 125(0x7d, float:1.75E-43)
            r0.append(r8)
        L64:
            java.lang.String r8 = r0.toString()
            return r8
    }

    public com.badlogic.gdx.utils.ObjectMap.Values<V> values() {
            r4 = this;
            boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
            if (r0 == 0) goto La
            com.badlogic.gdx.utils.ObjectMap$Values r0 = new com.badlogic.gdx.utils.ObjectMap$Values
            r0.<init>(r4)
            return r0
        La:
            com.badlogic.gdx.utils.ObjectMap$Values r0 = r4.values1
            if (r0 != 0) goto L1c
            com.badlogic.gdx.utils.ObjectMap$Values r0 = new com.badlogic.gdx.utils.ObjectMap$Values
            r0.<init>(r4)
            r4.values1 = r0
            com.badlogic.gdx.utils.ObjectMap$Values r0 = new com.badlogic.gdx.utils.ObjectMap$Values
            r0.<init>(r4)
            r4.values2 = r0
        L1c:
            com.badlogic.gdx.utils.ObjectMap$Values r0 = r4.values1
            boolean r1 = r0.valid
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L30
            r0.reset()
            com.badlogic.gdx.utils.ObjectMap$Values r0 = r4.values1
            r0.valid = r3
            com.badlogic.gdx.utils.ObjectMap$Values r1 = r4.values2
            r1.valid = r2
            return r0
        L30:
            com.badlogic.gdx.utils.ObjectMap$Values r0 = r4.values2
            r0.reset()
            com.badlogic.gdx.utils.ObjectMap$Values r0 = r4.values2
            r0.valid = r3
            com.badlogic.gdx.utils.ObjectMap$Values r1 = r4.values1
            r1.valid = r2
            return r0
    }
}
