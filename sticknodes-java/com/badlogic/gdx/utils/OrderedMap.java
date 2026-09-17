package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class OrderedMap<K, V> extends com.badlogic.gdx.utils.ObjectMap<K, V> {
    final com.badlogic.gdx.utils.Array<K> keys;

    public static class OrderedMapEntries<K, V> extends com.badlogic.gdx.utils.ObjectMap.Entries<K, V> {
        private com.badlogic.gdx.utils.Array<K> keys;

        public OrderedMapEntries(com.badlogic.gdx.utils.OrderedMap<K, V> r1) {
                r0 = this;
                r0.<init>(r1)
                com.badlogic.gdx.utils.Array<K> r1 = r1.keys
                r0.keys = r1
                return
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Entries, java.util.Iterator
        public com.badlogic.gdx.utils.ObjectMap.Entry next() {
                r3 = this;
                boolean r0 = r3.hasNext
                if (r0 == 0) goto L3d
                boolean r0 = r3.valid
                if (r0 == 0) goto L35
                int r0 = r3.nextIndex
                r3.currentIndex = r0
                com.badlogic.gdx.utils.ObjectMap$Entry<K, V> r1 = r3.entry
                com.badlogic.gdx.utils.Array<K> r2 = r3.keys
                java.lang.Object r0 = r2.get(r0)
                r1.key = r0
                com.badlogic.gdx.utils.ObjectMap$Entry<K, V> r0 = r3.entry
                com.badlogic.gdx.utils.ObjectMap<K, V> r1 = r3.map
                K r2 = r0.key
                java.lang.Object r1 = r1.get(r2)
                r0.value = r1
                int r0 = r3.nextIndex
                r1 = 1
                int r0 = r0 + r1
                r3.nextIndex = r0
                com.badlogic.gdx.utils.ObjectMap<K, V> r2 = r3.map
                int r2 = r2.size
                if (r0 >= r2) goto L2f
                goto L30
            L2f:
                r1 = 0
            L30:
                r3.hasNext = r1
                com.badlogic.gdx.utils.ObjectMap$Entry<K, V> r0 = r3.entry
                return r0
            L35:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
            L3d:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Entries, java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                com.badlogic.gdx.utils.ObjectMap$Entry r0 = r1.next()
                return r0
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Entries, com.badlogic.gdx.utils.ObjectMap.MapIterator, java.util.Iterator
        public void remove() {
                r2 = this;
                int r0 = r2.currentIndex
                if (r0 < 0) goto L17
                com.badlogic.gdx.utils.ObjectMap<K, V> r0 = r2.map
                com.badlogic.gdx.utils.ObjectMap$Entry<K, V> r1 = r2.entry
                K r1 = r1.key
                r0.remove(r1)
                int r0 = r2.nextIndex
                int r0 = r0 + (-1)
                r2.nextIndex = r0
                r0 = -1
                r2.currentIndex = r0
                return
            L17:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "next must be called before remove."
                r0.<init>(r1)
                throw r0
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Entries, com.badlogic.gdx.utils.ObjectMap.MapIterator
        public void reset() {
                r2 = this;
                r0 = -1
                r2.currentIndex = r0
                r0 = 0
                r2.nextIndex = r0
                com.badlogic.gdx.utils.ObjectMap<K, V> r1 = r2.map
                int r1 = r1.size
                if (r1 <= 0) goto Ld
                r0 = 1
            Ld:
                r2.hasNext = r0
                return
        }
    }

    public static class OrderedMapKeys<K> extends com.badlogic.gdx.utils.ObjectMap.Keys<K> {
        private com.badlogic.gdx.utils.Array<K> keys;

        public OrderedMapKeys(com.badlogic.gdx.utils.OrderedMap<K, ?> r1) {
                r0 = this;
                r0.<init>(r1)
                com.badlogic.gdx.utils.Array<K> r1 = r1.keys
                r0.keys = r1
                return
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Keys, java.util.Iterator
        public K next() {
                r4 = this;
                boolean r0 = r4.hasNext
                if (r0 == 0) goto L2b
                boolean r0 = r4.valid
                if (r0 == 0) goto L23
                com.badlogic.gdx.utils.Array<K> r0 = r4.keys
                int r1 = r4.nextIndex
                java.lang.Object r0 = r0.get(r1)
                int r1 = r4.nextIndex
                r4.currentIndex = r1
                r2 = 1
                int r1 = r1 + r2
                r4.nextIndex = r1
                com.badlogic.gdx.utils.ObjectMap<K, V> r3 = r4.map
                int r3 = r3.size
                if (r1 >= r3) goto L1f
                goto L20
            L1f:
                r2 = 0
            L20:
                r4.hasNext = r2
                return r0
            L23:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
            L2b:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Keys, com.badlogic.gdx.utils.ObjectMap.MapIterator, java.util.Iterator
        public void remove() {
                r2 = this;
                int r0 = r2.currentIndex
                if (r0 < 0) goto L13
                com.badlogic.gdx.utils.ObjectMap<K, V> r1 = r2.map
                com.badlogic.gdx.utils.OrderedMap r1 = (com.badlogic.gdx.utils.OrderedMap) r1
                r1.removeIndex(r0)
                int r0 = r2.currentIndex
                r2.nextIndex = r0
                r0 = -1
                r2.currentIndex = r0
                return
            L13:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "next must be called before remove."
                r0.<init>(r1)
                throw r0
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Keys, com.badlogic.gdx.utils.ObjectMap.MapIterator
        public void reset() {
                r2 = this;
                r0 = -1
                r2.currentIndex = r0
                r0 = 0
                r2.nextIndex = r0
                com.badlogic.gdx.utils.ObjectMap<K, V> r1 = r2.map
                int r1 = r1.size
                if (r1 <= 0) goto Ld
                r0 = 1
            Ld:
                r2.hasNext = r0
                return
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Keys
        public com.badlogic.gdx.utils.Array<K> toArray() {
                r3 = this;
                com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
                com.badlogic.gdx.utils.Array<K> r1 = r3.keys
                int r1 = r1.size
                int r2 = r3.nextIndex
                int r1 = r1 - r2
                r2 = 1
                r0.<init>(r2, r1)
                com.badlogic.gdx.utils.Array r0 = r3.toArray(r0)
                return r0
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Keys
        public com.badlogic.gdx.utils.Array<K> toArray(com.badlogic.gdx.utils.Array<K> r4) {
                r3 = this;
                com.badlogic.gdx.utils.Array<K> r0 = r3.keys
                int r1 = r3.nextIndex
                int r2 = r0.size
                int r2 = r2 - r1
                r4.addAll(r0, r1, r2)
                com.badlogic.gdx.utils.Array<K> r0 = r3.keys
                int r0 = r0.size
                r3.nextIndex = r0
                r0 = 0
                r3.hasNext = r0
                return r4
        }
    }

    public static class OrderedMapValues<V> extends com.badlogic.gdx.utils.ObjectMap.Values<V> {
        private com.badlogic.gdx.utils.Array keys;

        public OrderedMapValues(com.badlogic.gdx.utils.OrderedMap<?, V> r1) {
                r0 = this;
                r0.<init>(r1)
                com.badlogic.gdx.utils.Array<K> r1 = r1.keys
                r0.keys = r1
                return
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Values, java.util.Iterator
        public V next() {
                r4 = this;
                boolean r0 = r4.hasNext
                if (r0 == 0) goto L31
                boolean r0 = r4.valid
                if (r0 == 0) goto L29
                com.badlogic.gdx.utils.ObjectMap<K, V> r0 = r4.map
                com.badlogic.gdx.utils.Array r1 = r4.keys
                int r2 = r4.nextIndex
                java.lang.Object r1 = r1.get(r2)
                java.lang.Object r0 = r0.get(r1)
                int r1 = r4.nextIndex
                r4.currentIndex = r1
                r2 = 1
                int r1 = r1 + r2
                r4.nextIndex = r1
                com.badlogic.gdx.utils.ObjectMap<K, V> r3 = r4.map
                int r3 = r3.size
                if (r1 >= r3) goto L25
                goto L26
            L25:
                r2 = 0
            L26:
                r4.hasNext = r2
                return r0
            L29:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
            L31:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Values, com.badlogic.gdx.utils.ObjectMap.MapIterator, java.util.Iterator
        public void remove() {
                r2 = this;
                int r0 = r2.currentIndex
                if (r0 < 0) goto L13
                com.badlogic.gdx.utils.ObjectMap<K, V> r1 = r2.map
                com.badlogic.gdx.utils.OrderedMap r1 = (com.badlogic.gdx.utils.OrderedMap) r1
                r1.removeIndex(r0)
                int r0 = r2.currentIndex
                r2.nextIndex = r0
                r0 = -1
                r2.currentIndex = r0
                return
            L13:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "next must be called before remove."
                r0.<init>(r1)
                throw r0
        }

        @Override // com.badlogic.gdx.utils.ObjectMap.Values, com.badlogic.gdx.utils.ObjectMap.MapIterator
        public void reset() {
                r2 = this;
                r0 = -1
                r2.currentIndex = r0
                r0 = 0
                r2.nextIndex = r0
                com.badlogic.gdx.utils.ObjectMap<K, V> r1 = r2.map
                int r1 = r1.size
                if (r1 <= 0) goto Ld
                r0 = 1
            Ld:
                r2.hasNext = r0
                return
        }
    }

    public OrderedMap() {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.keys = r0
            return
    }

    public OrderedMap(int r2) {
            r1 = this;
            r1.<init>(r2)
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>(r2)
            r1.keys = r0
            return
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public void clear() {
            r1 = this;
            com.badlogic.gdx.utils.Array<K> r0 = r1.keys
            r0.clear()
            super.clear()
            return
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public void clear(int r2) {
            r1 = this;
            com.badlogic.gdx.utils.Array<K> r0 = r1.keys
            r0.clear()
            super.clear(r2)
            return
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public com.badlogic.gdx.utils.ObjectMap.Entries<K, V> entries() {
            r4 = this;
            boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
            if (r0 == 0) goto La
            com.badlogic.gdx.utils.OrderedMap$OrderedMapEntries r0 = new com.badlogic.gdx.utils.OrderedMap$OrderedMapEntries
            r0.<init>(r4)
            return r0
        La:
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = r4.entries1
            if (r0 != 0) goto L1c
            com.badlogic.gdx.utils.OrderedMap$OrderedMapEntries r0 = new com.badlogic.gdx.utils.OrderedMap$OrderedMapEntries
            r0.<init>(r4)
            r4.entries1 = r0
            com.badlogic.gdx.utils.OrderedMap$OrderedMapEntries r0 = new com.badlogic.gdx.utils.OrderedMap$OrderedMapEntries
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

    @Override // com.badlogic.gdx.utils.ObjectMap, java.lang.Iterable
    public com.badlogic.gdx.utils.ObjectMap.Entries<K, V> iterator() {
            r1 = this;
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = r1.entries()
            return r0
    }

    @Override // com.badlogic.gdx.utils.ObjectMap, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = r1.iterator()
            return r0
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public com.badlogic.gdx.utils.ObjectMap.Keys<K> keys() {
            r4 = this;
            boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
            if (r0 == 0) goto La
            com.badlogic.gdx.utils.OrderedMap$OrderedMapKeys r0 = new com.badlogic.gdx.utils.OrderedMap$OrderedMapKeys
            r0.<init>(r4)
            return r0
        La:
            com.badlogic.gdx.utils.ObjectMap$Keys r0 = r4.keys1
            if (r0 != 0) goto L1c
            com.badlogic.gdx.utils.OrderedMap$OrderedMapKeys r0 = new com.badlogic.gdx.utils.OrderedMap$OrderedMapKeys
            r0.<init>(r4)
            r4.keys1 = r0
            com.badlogic.gdx.utils.OrderedMap$OrderedMapKeys r0 = new com.badlogic.gdx.utils.OrderedMap$OrderedMapKeys
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

    @Override // com.badlogic.gdx.utils.ObjectMap
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
            V[] r1 = r2.valueTable
            r1[r0] = r4
            com.badlogic.gdx.utils.Array<K> r4 = r2.keys
            r4.add(r3)
            int r3 = r2.size
            int r3 = r3 + 1
            r2.size = r3
            int r4 = r2.threshold
            if (r3 < r4) goto L2f
            K[] r3 = r2.keyTable
            int r3 = r3.length
            int r3 = r3 << 1
            r2.resize(r3)
        L2f:
            r3 = 0
            return r3
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public V remove(K r3) {
            r2 = this;
            com.badlogic.gdx.utils.Array<K> r0 = r2.keys
            r1 = 0
            r0.removeValue(r3, r1)
            java.lang.Object r3 = super.remove(r3)
            return r3
    }

    public V removeIndex(int r2) {
            r1 = this;
            com.badlogic.gdx.utils.Array<K> r0 = r1.keys
            java.lang.Object r2 = r0.removeIndex(r2)
            java.lang.Object r2 = super.remove(r2)
            return r2
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
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
            com.badlogic.gdx.utils.Array<K> r1 = r7.keys
            r2 = 0
            int r3 = r1.size
        L1f:
            if (r2 >= r3) goto L47
            java.lang.Object r4 = r1.get(r2)
            if (r2 <= 0) goto L2a
            r0.append(r8)
        L2a:
            java.lang.String r5 = "(this)"
            if (r4 != r7) goto L30
            r6 = r5
            goto L31
        L30:
            r6 = r4
        L31:
            r0.append(r6)
            r6 = 61
            r0.append(r6)
            java.lang.Object r4 = r7.get(r4)
            if (r4 != r7) goto L40
            goto L41
        L40:
            r5 = r4
        L41:
            r0.append(r5)
            int r2 = r2 + 1
            goto L1f
        L47:
            if (r9 == 0) goto L4e
            r8 = 125(0x7d, float:1.75E-43)
            r0.append(r8)
        L4e:
            java.lang.String r8 = r0.toString()
            return r8
    }

    @Override // com.badlogic.gdx.utils.ObjectMap
    public com.badlogic.gdx.utils.ObjectMap.Values<V> values() {
            r4 = this;
            boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
            if (r0 == 0) goto La
            com.badlogic.gdx.utils.OrderedMap$OrderedMapValues r0 = new com.badlogic.gdx.utils.OrderedMap$OrderedMapValues
            r0.<init>(r4)
            return r0
        La:
            com.badlogic.gdx.utils.ObjectMap$Values r0 = r4.values1
            if (r0 != 0) goto L1c
            com.badlogic.gdx.utils.OrderedMap$OrderedMapValues r0 = new com.badlogic.gdx.utils.OrderedMap$OrderedMapValues
            r0.<init>(r4)
            r4.values1 = r0
            com.badlogic.gdx.utils.OrderedMap$OrderedMapValues r0 = new com.badlogic.gdx.utils.OrderedMap$OrderedMapValues
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
