package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class OrderedSet<T> extends com.badlogic.gdx.utils.ObjectSet<T> {
    final com.badlogic.gdx.utils.Array<T> items;
    transient com.badlogic.gdx.utils.OrderedSet.OrderedSetIterator iterator1;
    transient com.badlogic.gdx.utils.OrderedSet.OrderedSetIterator iterator2;

    public static class OrderedSetIterator<K> extends com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator<K> {
        private com.badlogic.gdx.utils.Array<K> items;

        public OrderedSetIterator(com.badlogic.gdx.utils.OrderedSet<K> r1) {
                r0 = this;
                r0.<init>(r1)
                com.badlogic.gdx.utils.Array<T> r1 = r1.items
                r0.items = r1
                return
        }

        @Override // com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator, java.util.Iterator
        public K next() {
                r4 = this;
                boolean r0 = r4.hasNext
                if (r0 == 0) goto L29
                boolean r0 = r4.valid
                if (r0 == 0) goto L21
                com.badlogic.gdx.utils.Array<K> r0 = r4.items
                int r1 = r4.nextIndex
                java.lang.Object r0 = r0.get(r1)
                int r1 = r4.nextIndex
                r2 = 1
                int r1 = r1 + r2
                r4.nextIndex = r1
                com.badlogic.gdx.utils.ObjectSet<K> r3 = r4.set
                int r3 = r3.size
                if (r1 >= r3) goto L1d
                goto L1e
            L1d:
                r2 = 0
            L1e:
                r4.hasNext = r2
                return r0
            L21:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
            L29:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator, java.util.Iterator
        public void remove() {
                r2 = this;
                int r0 = r2.nextIndex
                if (r0 < 0) goto L10
                int r0 = r0 + (-1)
                r2.nextIndex = r0
                com.badlogic.gdx.utils.ObjectSet<K> r1 = r2.set
                com.badlogic.gdx.utils.OrderedSet r1 = (com.badlogic.gdx.utils.OrderedSet) r1
                r1.removeIndex(r0)
                return
            L10:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "next must be called before remove."
                r0.<init>(r1)
                throw r0
        }

        @Override // com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator
        public void reset() {
                r2 = this;
                r0 = 0
                r2.nextIndex = r0
                com.badlogic.gdx.utils.ObjectSet<K> r1 = r2.set
                int r1 = r1.size
                if (r1 <= 0) goto La
                r0 = 1
            La:
                r2.hasNext = r0
                return
        }
    }

    public OrderedSet() {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.items = r0
            return
    }

    @Override // com.badlogic.gdx.utils.ObjectSet
    public boolean add(T r2) {
            r1 = this;
            boolean r0 = super.add(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            com.badlogic.gdx.utils.Array<T> r0 = r1.items
            r0.add(r2)
            r2 = 1
            return r2
    }

    public void addAll(com.badlogic.gdx.utils.OrderedSet<T> r4) {
            r3 = this;
            int r0 = r4.size
            r3.ensureCapacity(r0)
            com.badlogic.gdx.utils.Array<T> r4 = r4.items
            T[] r0 = r4.items
            int r4 = r4.size
            r1 = 0
        Lc:
            if (r1 >= r4) goto L16
            r2 = r0[r1]
            r3.add(r2)
            int r1 = r1 + 1
            goto Lc
        L16:
            return
    }

    @Override // com.badlogic.gdx.utils.ObjectSet
    public void clear() {
            r1 = this;
            com.badlogic.gdx.utils.Array<T> r0 = r1.items
            r0.clear()
            super.clear()
            return
    }

    @Override // com.badlogic.gdx.utils.ObjectSet
    public void clear(int r2) {
            r1 = this;
            com.badlogic.gdx.utils.Array<T> r0 = r1.items
            r0.clear()
            super.clear(r2)
            return
    }

    @Override // com.badlogic.gdx.utils.ObjectSet, java.lang.Iterable
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.ObjectSet.ObjectSetIterator iterator() {
            r1 = this;
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r0 = r1.iterator()
            return r0
    }

    @Override // com.badlogic.gdx.utils.ObjectSet, java.lang.Iterable
    public com.badlogic.gdx.utils.OrderedSet.OrderedSetIterator<T> iterator() {
            r4 = this;
            boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
            if (r0 == 0) goto La
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r0 = new com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator
            r0.<init>(r4)
            return r0
        La:
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r0 = r4.iterator1
            if (r0 != 0) goto L1c
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r0 = new com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator
            r0.<init>(r4)
            r4.iterator1 = r0
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r0 = new com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator
            r0.<init>(r4)
            r4.iterator2 = r0
        L1c:
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r0 = r4.iterator1
            boolean r1 = r0.valid
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L30
            r0.reset()
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r0 = r4.iterator1
            r0.valid = r3
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r1 = r4.iterator2
            r1.valid = r2
            return r0
        L30:
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r0 = r4.iterator2
            r0.reset()
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r0 = r4.iterator2
            r0.valid = r3
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r1 = r4.iterator1
            r1.valid = r2
            return r0
    }

    @Override // com.badlogic.gdx.utils.ObjectSet, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r0 = r1.iterator()
            return r0
    }

    @Override // com.badlogic.gdx.utils.ObjectSet
    public boolean remove(T r3) {
            r2 = this;
            boolean r0 = super.remove(r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.badlogic.gdx.utils.Array<T> r0 = r2.items
            r0.removeValue(r3, r1)
            r3 = 1
            return r3
    }

    public T removeIndex(int r2) {
            r1 = this;
            com.badlogic.gdx.utils.Array<T> r0 = r1.items
            java.lang.Object r2 = r0.removeIndex(r2)
            super.remove(r2)
            return r2
    }

    @Override // com.badlogic.gdx.utils.ObjectSet
    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.size
            if (r0 != 0) goto L7
            java.lang.String r0 = "{}"
            return r0
        L7:
            com.badlogic.gdx.utils.Array<T> r0 = r4.items
            T[] r0 = r0.items
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 32
            r1.<init>(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            r2 = 0
            r2 = r0[r2]
            r1.append(r2)
            r2 = 1
        L1e:
            int r3 = r4.size
            if (r2 >= r3) goto L2f
            java.lang.String r3 = ", "
            r1.append(r3)
            r3 = r0[r2]
            r1.append(r3)
            int r2 = r2 + 1
            goto L1e
        L2f:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.badlogic.gdx.utils.ObjectSet
    public java.lang.String toString(java.lang.String r2) {
            r1 = this;
            com.badlogic.gdx.utils.Array<T> r0 = r1.items
            java.lang.String r2 = r0.toString(r2)
            return r2
    }
}
