package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class ArrayMap<K, V> implements java.lang.Iterable<com.badlogic.gdx.utils.ObjectMap.Entry<K, V>> {
    private transient com.badlogic.gdx.utils.ArrayMap.Entries entries1;
    private transient com.badlogic.gdx.utils.ArrayMap.Entries entries2;
    public K[] keys;
    public boolean ordered;
    public int size;
    public V[] values;

    public static class Entries<K, V> implements java.lang.Iterable<com.badlogic.gdx.utils.ObjectMap.Entry<K, V>>, java.util.Iterator<com.badlogic.gdx.utils.ObjectMap.Entry<K, V>> {
        com.badlogic.gdx.utils.ObjectMap.Entry<K, V> entry;
        int index;
        private final com.badlogic.gdx.utils.ArrayMap<K, V> map;
        boolean valid;

        public Entries(com.badlogic.gdx.utils.ArrayMap<K, V> r2) {
                r1 = this;
                r1.<init>()
                com.badlogic.gdx.utils.ObjectMap$Entry r0 = new com.badlogic.gdx.utils.ObjectMap$Entry
                r0.<init>()
                r1.entry = r0
                r0 = 1
                r1.valid = r0
                r1.map = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                boolean r0 = r2.valid
                if (r0 == 0) goto L10
                int r0 = r2.index
                com.badlogic.gdx.utils.ArrayMap<K, V> r1 = r2.map
                int r1 = r1.size
                if (r0 >= r1) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
            L10:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<com.badlogic.gdx.utils.ObjectMap.Entry<K, V>> iterator() {
                r0 = this;
                return r0
        }

        @Override // java.util.Iterator
        public com.badlogic.gdx.utils.ObjectMap.Entry<K, V> next() {
                r4 = this;
                int r0 = r4.index
                com.badlogic.gdx.utils.ArrayMap<K, V> r1 = r4.map
                int r2 = r1.size
                if (r0 >= r2) goto L27
                boolean r2 = r4.valid
                if (r2 == 0) goto L1f
                com.badlogic.gdx.utils.ObjectMap$Entry<K, V> r2 = r4.entry
                K[] r3 = r1.keys
                r3 = r3[r0]
                r2.key = r3
                V[] r1 = r1.values
                int r3 = r0 + 1
                r4.index = r3
                r0 = r1[r0]
                r2.value = r0
                return r2
            L1f:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
            L27:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                int r1 = r4.index
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                com.badlogic.gdx.utils.ObjectMap$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                int r0 = r2.index
                int r0 = r0 + (-1)
                r2.index = r0
                com.badlogic.gdx.utils.ArrayMap<K, V> r1 = r2.map
                r1.removeIndex(r0)
                return
        }
    }

    public ArrayMap() {
            r2 = this;
            r0 = 1
            r1 = 16
            r2.<init>(r0, r1)
            return
    }

    public ArrayMap(java.lang.Class r3, java.lang.Class r4) {
            r2 = this;
            r0 = 0
            r1 = 16
            r2.<init>(r0, r1, r3, r4)
            return
    }

    public ArrayMap(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.ordered = r1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0.keys = r1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0.values = r1
            return
    }

    public ArrayMap(boolean r1, int r2, java.lang.Class r3, java.lang.Class r4) {
            r0 = this;
            r0.<init>()
            r0.ordered = r1
            java.lang.Object r1 = com.badlogic.gdx.utils.reflect.ArrayReflection.newInstance(r3, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0.keys = r1
            java.lang.Object r1 = com.badlogic.gdx.utils.reflect.ArrayReflection.newInstance(r4, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0.values = r1
            return
    }

    public void clear() {
            r4 = this;
            K[] r0 = r4.keys
            int r1 = r4.size
            r2 = 0
            r3 = 0
            java.util.Arrays.fill(r0, r2, r1, r3)
            V[] r0 = r4.values
            int r1 = r4.size
            java.util.Arrays.fill(r0, r2, r1, r3)
            r4.size = r2
            return
    }

    public com.badlogic.gdx.utils.ArrayMap.Entries<K, V> entries() {
            r4 = this;
            boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
            if (r0 == 0) goto La
            com.badlogic.gdx.utils.ArrayMap$Entries r0 = new com.badlogic.gdx.utils.ArrayMap$Entries
            r0.<init>(r4)
            return r0
        La:
            com.badlogic.gdx.utils.ArrayMap$Entries r0 = r4.entries1
            if (r0 != 0) goto L1c
            com.badlogic.gdx.utils.ArrayMap$Entries r0 = new com.badlogic.gdx.utils.ArrayMap$Entries
            r0.<init>(r4)
            r4.entries1 = r0
            com.badlogic.gdx.utils.ArrayMap$Entries r0 = new com.badlogic.gdx.utils.ArrayMap$Entries
            r0.<init>(r4)
            r4.entries2 = r0
        L1c:
            com.badlogic.gdx.utils.ArrayMap$Entries r0 = r4.entries1
            boolean r1 = r0.valid
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L2d
            r0.index = r3
            r0.valid = r2
            com.badlogic.gdx.utils.ArrayMap$Entries r1 = r4.entries2
            r1.valid = r3
            return r0
        L2d:
            com.badlogic.gdx.utils.ArrayMap$Entries r1 = r4.entries2
            r1.index = r3
            r1.valid = r2
            r0.valid = r3
            return r1
    }

    public boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r9 != r8) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.badlogic.gdx.utils.ArrayMap
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.badlogic.gdx.utils.ArrayMap r9 = (com.badlogic.gdx.utils.ArrayMap) r9
            int r1 = r9.size
            int r3 = r8.size
            if (r1 == r3) goto L13
            return r2
        L13:
            K[] r1 = r8.keys
            V[] r4 = r8.values
            r5 = 0
        L18:
            if (r5 >= r3) goto L37
            r6 = r1[r5]
            r7 = r4[r5]
            if (r7 != 0) goto L29
            java.lang.Object r7 = com.badlogic.gdx.utils.ObjectMap.dummy
            java.lang.Object r6 = r9.get(r6, r7)
            if (r6 == 0) goto L34
            return r2
        L29:
            java.lang.Object r6 = r9.get(r6)
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L34
            return r2
        L34:
            int r5 = r5 + 1
            goto L18
        L37:
            return r0
    }

    public V get(K r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.get(r2, r0)
            return r2
    }

    public V get(K r4, V r5) {
            r3 = this;
            K[] r0 = r3.keys
            int r1 = r3.size
            int r1 = r1 + (-1)
            if (r4 != 0) goto L16
        L8:
            if (r1 < 0) goto L28
            r2 = r0[r1]
            if (r2 != r4) goto L13
            V[] r4 = r3.values
            r4 = r4[r1]
            return r4
        L13:
            int r1 = r1 + (-1)
            goto L8
        L16:
            if (r1 < 0) goto L28
            r2 = r0[r1]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L25
            V[] r4 = r3.values
            r4 = r4[r1]
            return r4
        L25:
            int r1 = r1 + (-1)
            goto L16
        L28:
            return r5
    }

    public int hashCode() {
            r7 = this;
            K[] r0 = r7.keys
            V[] r1 = r7.values
            int r2 = r7.size
            r3 = 0
            r4 = 0
        L8:
            if (r3 >= r2) goto L21
            r5 = r0[r3]
            r6 = r1[r3]
            if (r5 == 0) goto L17
            int r5 = r5.hashCode()
            int r5 = r5 * 31
            int r4 = r4 + r5
        L17:
            if (r6 == 0) goto L1e
            int r5 = r6.hashCode()
            int r4 = r4 + r5
        L1e:
            int r3 = r3 + 1
            goto L8
        L21:
            return r4
    }

    public int indexOfKey(K r5) {
            r4 = this;
            K[] r0 = r4.keys
            r1 = 0
            if (r5 != 0) goto L11
            int r2 = r4.size
        L7:
            if (r1 >= r2) goto L21
            r3 = r0[r1]
            if (r3 != r5) goto Le
            return r1
        Le:
            int r1 = r1 + 1
            goto L7
        L11:
            int r2 = r4.size
        L13:
            if (r1 >= r2) goto L21
            r3 = r0[r1]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L1e
            return r1
        L1e:
            int r1 = r1 + 1
            goto L13
        L21:
            r5 = -1
            return r5
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.badlogic.gdx.utils.ObjectMap.Entry<K, V>> iterator() {
            r1 = this;
            com.badlogic.gdx.utils.ArrayMap$Entries r0 = r1.entries()
            return r0
    }

    public int put(K r4, V r5) {
            r3 = this;
            int r0 = r3.indexOfKey(r4)
            r1 = -1
            if (r0 != r1) goto L23
            int r0 = r3.size
            K[] r1 = r3.keys
            int r1 = r1.length
            if (r0 != r1) goto L1d
            r1 = 8
            float r0 = (float) r0
            r2 = 1071644672(0x3fe00000, float:1.75)
            float r0 = r0 * r2
            int r0 = (int) r0
            int r0 = java.lang.Math.max(r1, r0)
            r3.resize(r0)
        L1d:
            int r0 = r3.size
            int r1 = r0 + 1
            r3.size = r1
        L23:
            K[] r1 = r3.keys
            r1[r0] = r4
            V[] r4 = r3.values
            r4[r0] = r5
            return r0
    }

    public void removeIndex(int r5) {
            r4 = this;
            int r0 = r4.size
            if (r5 >= r0) goto L31
            K[] r1 = r4.keys
            int r0 = r0 + (-1)
            r4.size = r0
            boolean r2 = r4.ordered
            if (r2 == 0) goto L1d
            int r2 = r5 + 1
            int r0 = r0 - r5
            java.lang.System.arraycopy(r1, r2, r1, r5, r0)
            V[] r0 = r4.values
            int r3 = r4.size
            int r3 = r3 - r5
            java.lang.System.arraycopy(r0, r2, r0, r5, r3)
            goto L27
        L1d:
            r2 = r1[r0]
            r1[r5] = r2
            V[] r2 = r4.values
            r0 = r2[r0]
            r2[r5] = r0
        L27:
            int r5 = r4.size
            r0 = 0
            r1[r5] = r0
            V[] r1 = r4.values
            r1[r5] = r0
            return
        L31:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.<init>(r5)
            throw r0
    }

    protected void resize(int r5) {
            r4 = this;
            K[] r0 = r4.keys
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r0 = r0.getComponentType()
            java.lang.Object r0 = com.badlogic.gdx.utils.reflect.ArrayReflection.newInstance(r0, r5)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            K[] r1 = r4.keys
            int r2 = r4.size
            int r3 = r0.length
            int r2 = java.lang.Math.min(r2, r3)
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            r4.keys = r0
            V[] r0 = r4.values
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r0 = r0.getComponentType()
            java.lang.Object r5 = com.badlogic.gdx.utils.reflect.ArrayReflection.newInstance(r0, r5)
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            V[] r0 = r4.values
            int r1 = r4.size
            int r2 = r5.length
            int r1 = java.lang.Math.min(r1, r2)
            java.lang.System.arraycopy(r0, r3, r5, r3, r1)
            r4.values = r5
            return
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.size
            if (r0 != 0) goto L7
            java.lang.String r0 = "{}"
            return r0
        L7:
            K[] r0 = r6.keys
            V[] r1 = r6.values
            com.badlogic.gdx.utils.StringBuilder r2 = new com.badlogic.gdx.utils.StringBuilder
            r3 = 32
            r2.<init>(r3)
            r3 = 123(0x7b, float:1.72E-43)
            r2.append(r3)
            r3 = 0
            r4 = r0[r3]
            r2.append(r4)
            r4 = 61
            r2.append(r4)
            r3 = r1[r3]
            r2.append(r3)
            r3 = 1
        L28:
            int r5 = r6.size
            if (r3 >= r5) goto L41
            java.lang.String r5 = ", "
            r2.append(r5)
            r5 = r0[r3]
            r2.append(r5)
            r2.append(r4)
            r5 = r1[r3]
            r2.append(r5)
            int r3 = r3 + 1
            goto L28
        L41:
            r0 = 125(0x7d, float:1.75E-43)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
