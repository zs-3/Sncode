package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class Array<T> implements java.lang.Iterable<T> {
    public T[] items;
    private com.badlogic.gdx.utils.Array.ArrayIterable iterable;
    public boolean ordered;
    public int size;

    public static class ArrayIterable<T> implements java.lang.Iterable<T> {
        private final boolean allowRemove;
        private final com.badlogic.gdx.utils.Array<T> array;
        private com.badlogic.gdx.utils.Array.ArrayIterator iterator1;
        private com.badlogic.gdx.utils.Array.ArrayIterator iterator2;

        public ArrayIterable(com.badlogic.gdx.utils.Array<T> r2) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                return
        }

        public ArrayIterable(com.badlogic.gdx.utils.Array<T> r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.array = r1
                r0.allowRemove = r2
                return
        }

        @Override // java.lang.Iterable
        public com.badlogic.gdx.utils.Array.ArrayIterator<T> iterator() {
                r4 = this;
                boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
                if (r0 == 0) goto Le
                com.badlogic.gdx.utils.Array$ArrayIterator r0 = new com.badlogic.gdx.utils.Array$ArrayIterator
                com.badlogic.gdx.utils.Array<T> r1 = r4.array
                boolean r2 = r4.allowRemove
                r0.<init>(r1, r2)
                return r0
            Le:
                com.badlogic.gdx.utils.Array$ArrayIterator r0 = r4.iterator1
                if (r0 != 0) goto L28
                com.badlogic.gdx.utils.Array$ArrayIterator r0 = new com.badlogic.gdx.utils.Array$ArrayIterator
                com.badlogic.gdx.utils.Array<T> r1 = r4.array
                boolean r2 = r4.allowRemove
                r0.<init>(r1, r2)
                r4.iterator1 = r0
                com.badlogic.gdx.utils.Array$ArrayIterator r0 = new com.badlogic.gdx.utils.Array$ArrayIterator
                com.badlogic.gdx.utils.Array<T> r1 = r4.array
                boolean r2 = r4.allowRemove
                r0.<init>(r1, r2)
                r4.iterator2 = r0
            L28:
                com.badlogic.gdx.utils.Array$ArrayIterator r0 = r4.iterator1
                boolean r1 = r0.valid
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L39
                r0.index = r3
                r0.valid = r2
                com.badlogic.gdx.utils.Array$ArrayIterator r1 = r4.iterator2
                r1.valid = r3
                return r0
            L39:
                com.badlogic.gdx.utils.Array$ArrayIterator r1 = r4.iterator2
                r1.index = r3
                r1.valid = r2
                r0.valid = r3
                return r1
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.badlogic.gdx.utils.Array$ArrayIterator r0 = r1.iterator()
                return r0
        }
    }

    public static class ArrayIterator<T> implements java.util.Iterator<T>, java.lang.Iterable<T> {
        private final boolean allowRemove;
        private final com.badlogic.gdx.utils.Array<T> array;
        int index;
        boolean valid;

        public ArrayIterator(com.badlogic.gdx.utils.Array<T> r2, boolean r3) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.valid = r0
                r1.array = r2
                r1.allowRemove = r3
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                boolean r0 = r2.valid
                if (r0 == 0) goto L10
                int r0 = r2.index
                com.badlogic.gdx.utils.Array<T> r1 = r2.array
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
        public com.badlogic.gdx.utils.Array.ArrayIterator<T> iterator() {
                r0 = this;
                return r0
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.badlogic.gdx.utils.Array$ArrayIterator r0 = r1.iterator()
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                int r0 = r3.index
                com.badlogic.gdx.utils.Array<T> r1 = r3.array
                int r2 = r1.size
                if (r0 >= r2) goto L1d
                boolean r2 = r3.valid
                if (r2 == 0) goto L15
                T[] r1 = r1.items
                int r2 = r0 + 1
                r3.index = r2
                r0 = r1[r0]
                return r0
            L15:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
            L1d:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                int r1 = r3.index
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.allowRemove
                if (r0 == 0) goto L10
                int r0 = r2.index
                int r0 = r0 + (-1)
                r2.index = r0
                com.badlogic.gdx.utils.Array<T> r1 = r2.array
                r1.removeIndex(r0)
                return
            L10:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "Remove not allowed."
                r0.<init>(r1)
                throw r0
        }
    }

    public Array() {
            r2 = this;
            r0 = 1
            r1 = 16
            r2.<init>(r0, r1)
            return
    }

    public Array(int r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            return
    }

    public Array(com.badlogic.gdx.utils.Array<? extends T> r4) {
            r3 = this;
            boolean r0 = r4.ordered
            int r1 = r4.size
            T[] r2 = r4.items
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r2 = r2.getComponentType()
            r3.<init>(r0, r1, r2)
            int r0 = r4.size
            r3.size = r0
            T[] r4 = r4.items
            T[] r1 = r3.items
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r1, r2, r0)
            return
    }

    public Array(java.lang.Class r3) {
            r2 = this;
            r0 = 1
            r1 = 16
            r2.<init>(r0, r1, r3)
            return
    }

    public Array(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.ordered = r1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0.items = r1
            return
    }

    public Array(boolean r1, int r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>()
            r0.ordered = r1
            java.lang.Object r1 = com.badlogic.gdx.utils.reflect.ArrayReflection.newInstance(r3, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0.items = r1
            return
    }

    public Array(boolean r2, T[] r3, int r4, int r5) {
            r1 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.Class r0 = r0.getComponentType()
            r1.<init>(r2, r5, r0)
            r1.size = r5
            T[] r2 = r1.items
            r0 = 0
            java.lang.System.arraycopy(r3, r4, r2, r0, r5)
            return
    }

    public Array(T[] r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 1
            r2 = 0
            r3.<init>(r1, r4, r2, r0)
            return
    }

    public static <T> com.badlogic.gdx.utils.Array<T> with(T... r1) {
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>(r1)
            return r0
    }

    public void add(T r4) {
            r3 = this;
            T[] r0 = r3.items
            int r1 = r3.size
            int r2 = r0.length
            if (r1 != r2) goto L17
            r0 = 8
            float r1 = (float) r1
            r2 = 1071644672(0x3fe00000, float:1.75)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r0 = java.lang.Math.max(r0, r1)
            java.lang.Object[] r0 = r3.resize(r0)
        L17:
            int r1 = r3.size
            int r2 = r1 + 1
            r3.size = r2
            r0[r1] = r4
            return
    }

    public void add(T r5, T r6, T r7, T r8) {
            r4 = this;
            T[] r0 = r4.items
            int r1 = r4.size
            int r2 = r1 + 3
            int r3 = r0.length
            if (r2 < r3) goto L1a
            r0 = 8
            float r1 = (float) r1
            r2 = 1072064102(0x3fe66666, float:1.8)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r0 = java.lang.Math.max(r0, r1)
            java.lang.Object[] r0 = r4.resize(r0)
        L1a:
            int r1 = r4.size
            r0[r1] = r5
            int r5 = r1 + 1
            r0[r5] = r6
            int r5 = r1 + 2
            r0[r5] = r7
            int r5 = r1 + 3
            r0[r5] = r8
            int r1 = r1 + 4
            r4.size = r1
            return
    }

    public void addAll(com.badlogic.gdx.utils.Array<? extends T> r3) {
            r2 = this;
            T[] r0 = r3.items
            int r3 = r3.size
            r1 = 0
            r2.addAll(r0, r1, r3)
            return
    }

    public void addAll(com.badlogic.gdx.utils.Array<? extends T> r4, int r5, int r6) {
            r3 = this;
            int r0 = r5 + r6
            int r1 = r4.size
            if (r0 > r1) goto Lc
            T[] r4 = r4.items
            r3.addAll(r4, r5, r6)
            return
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "start + count must be <= size: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " + "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = " <= "
            r1.append(r5)
            int r4 = r4.size
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void addAll(T... r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.addAll(r3, r1, r0)
            return
    }

    public void addAll(T[] r5, int r6, int r7) {
            r4 = this;
            T[] r0 = r4.items
            int r1 = r4.size
            int r1 = r1 + r7
            int r2 = r0.length
            if (r1 <= r2) goto L1e
            r0 = 8
            int r0 = java.lang.Math.max(r0, r1)
            int r2 = r4.size
            float r2 = (float) r2
            r3 = 1071644672(0x3fe00000, float:1.75)
            float r2 = r2 * r3
            int r2 = (int) r2
            int r0 = java.lang.Math.max(r0, r2)
            java.lang.Object[] r0 = r4.resize(r0)
        L1e:
            int r2 = r4.size
            java.lang.System.arraycopy(r5, r6, r0, r2, r7)
            r4.size = r1
            return
    }

    public void clear() {
            r4 = this;
            T[] r0 = r4.items
            int r1 = r4.size
            r2 = 0
            r3 = 0
            java.util.Arrays.fill(r0, r2, r1, r3)
            r4.size = r2
            return
    }

    public boolean contains(T r4, boolean r5) {
            r3 = this;
            T[] r0 = r3.items
            int r1 = r3.size
            r2 = 1
            int r1 = r1 - r2
            if (r5 != 0) goto L1a
            if (r4 != 0) goto Lb
            goto L1a
        Lb:
            if (r1 < 0) goto L25
            int r5 = r1 + (-1)
            r1 = r0[r1]
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L18
            return r2
        L18:
            r1 = r5
            goto Lb
        L1a:
            if (r1 < 0) goto L25
            int r5 = r1 + (-1)
            r1 = r0[r1]
            if (r1 != r4) goto L23
            return r2
        L23:
            r1 = r5
            goto L1a
        L25:
            r4 = 0
            return r4
    }

    public T[] ensureCapacity(int r4) {
            r3 = this;
            if (r4 < 0) goto L22
            int r0 = r3.size
            int r0 = r0 + r4
            T[] r4 = r3.items
            int r4 = r4.length
            if (r0 <= r4) goto L1f
            r4 = 8
            int r4 = java.lang.Math.max(r4, r0)
            int r0 = r3.size
            float r0 = (float) r0
            r1 = 1071644672(0x3fe00000, float:1.75)
            float r0 = r0 * r1
            int r0 = (int) r0
            int r4 = java.lang.Math.max(r4, r0)
            r3.resize(r4)
        L1f:
            T[] r4 = r3.items
            return r4
        L22:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "additionalCapacity must be >= 0: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7.ordered
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            boolean r1 = r8 instanceof com.badlogic.gdx.utils.Array
            if (r1 != 0) goto Lf
            return r2
        Lf:
            com.badlogic.gdx.utils.Array r8 = (com.badlogic.gdx.utils.Array) r8
            boolean r1 = r8.ordered
            if (r1 != 0) goto L16
            return r2
        L16:
            int r1 = r7.size
            int r3 = r8.size
            if (r1 == r3) goto L1d
            return r2
        L1d:
            T[] r3 = r7.items
            T[] r8 = r8.items
            r4 = 0
        L22:
            if (r4 >= r1) goto L37
            r5 = r3[r4]
            r6 = r8[r4]
            if (r5 != 0) goto L2d
            if (r6 != 0) goto L33
            goto L34
        L2d:
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L34
        L33:
            return r2
        L34:
            int r4 = r4 + 1
            goto L22
        L37:
            return r0
    }

    public T first() {
            r2 = this;
            int r0 = r2.size
            if (r0 == 0) goto La
            T[] r0 = r2.items
            r1 = 0
            r0 = r0[r1]
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Array is empty."
            r0.<init>(r1)
            throw r0
    }

    public T get(int r4) {
            r3 = this;
            int r0 = r3.size
            if (r4 >= r0) goto L9
            T[] r0 = r3.items
            r4 = r0[r4]
            return r4
        L9:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "index can't be >= size: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " >= "
            r1.append(r4)
            int r4 = r3.size
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public int hashCode() {
            r5 = this;
            boolean r0 = r5.ordered
            if (r0 != 0) goto L9
            int r0 = super.hashCode()
            return r0
        L9:
            T[] r0 = r5.items
            r1 = 0
            int r2 = r5.size
            r3 = 1
        Lf:
            if (r1 >= r2) goto L1f
            int r3 = r3 * 31
            r4 = r0[r1]
            if (r4 == 0) goto L1c
            int r4 = r4.hashCode()
            int r3 = r3 + r4
        L1c:
            int r1 = r1 + 1
            goto Lf
        L1f:
            return r3
    }

    public int indexOf(T r4, boolean r5) {
            r3 = this;
            T[] r0 = r3.items
            r1 = 0
            if (r5 != 0) goto L18
            if (r4 != 0) goto L8
            goto L18
        L8:
            int r5 = r3.size
        La:
            if (r1 >= r5) goto L24
            r2 = r0[r1]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L15
            return r1
        L15:
            int r1 = r1 + 1
            goto La
        L18:
            int r5 = r3.size
        L1a:
            if (r1 >= r5) goto L24
            r2 = r0[r1]
            if (r2 != r4) goto L21
            return r1
        L21:
            int r1 = r1 + 1
            goto L1a
        L24:
            r4 = -1
            return r4
    }

    public void insert(int r4, T r5) {
            r3 = this;
            int r0 = r3.size
            if (r4 > r0) goto L35
            T[] r1 = r3.items
            int r2 = r1.length
            if (r0 != r2) goto L19
            r1 = 8
            float r0 = (float) r0
            r2 = 1071644672(0x3fe00000, float:1.75)
            float r0 = r0 * r2
            int r0 = (int) r0
            int r0 = java.lang.Math.max(r1, r0)
            java.lang.Object[] r1 = r3.resize(r0)
        L19:
            boolean r0 = r3.ordered
            if (r0 == 0) goto L26
            int r0 = r4 + 1
            int r2 = r3.size
            int r2 = r2 - r4
            java.lang.System.arraycopy(r1, r4, r1, r0, r2)
            goto L2c
        L26:
            int r0 = r3.size
            r2 = r1[r4]
            r1[r0] = r2
        L2c:
            int r0 = r3.size
            int r0 = r0 + 1
            r3.size = r0
            r1[r4] = r5
            return
        L35:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "index can't be > size: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " > "
            r0.append(r4)
            int r4 = r3.size
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.lang.Iterable
    public com.badlogic.gdx.utils.Array.ArrayIterator<T> iterator() {
            r2 = this;
            boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
            if (r0 == 0) goto Lb
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = new com.badlogic.gdx.utils.Array$ArrayIterator
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        Lb:
            com.badlogic.gdx.utils.Array$ArrayIterable r0 = r2.iterable
            if (r0 != 0) goto L16
            com.badlogic.gdx.utils.Array$ArrayIterable r0 = new com.badlogic.gdx.utils.Array$ArrayIterable
            r0.<init>(r2)
            r2.iterable = r0
        L16:
            com.badlogic.gdx.utils.Array$ArrayIterable r0 = r2.iterable
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
            return r0
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r1.iterator()
            return r0
    }

    public T peek() {
            r2 = this;
            int r0 = r2.size
            if (r0 == 0) goto Lb
            T[] r1 = r2.items
            int r0 = r0 + (-1)
            r0 = r1[r0]
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Array is empty."
            r0.<init>(r1)
            throw r0
    }

    public T pop() {
            r4 = this;
            int r0 = r4.size
            if (r0 == 0) goto L10
            int r0 = r0 + (-1)
            r4.size = r0
            T[] r1 = r4.items
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            return r2
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Array is empty."
            r0.<init>(r1)
            throw r0
    }

    public T removeIndex(int r5) {
            r4 = this;
            int r0 = r4.size
            if (r5 >= r0) goto L21
            T[] r1 = r4.items
            r2 = r1[r5]
            int r0 = r0 + (-1)
            r4.size = r0
            boolean r3 = r4.ordered
            if (r3 == 0) goto L17
            int r3 = r5 + 1
            int r0 = r0 - r5
            java.lang.System.arraycopy(r1, r3, r1, r5, r0)
            goto L1b
        L17:
            r0 = r1[r0]
            r1[r5] = r0
        L1b:
            int r5 = r4.size
            r0 = 0
            r1[r5] = r0
            return r2
        L21:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "index can't be >= size: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " >= "
            r1.append(r5)
            int r5 = r4.size
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public void removeRange(int r6, int r7) {
            r5 = this;
            int r0 = r5.size
            if (r7 >= r0) goto L4f
            if (r6 > r7) goto L30
            T[] r1 = r5.items
            int r2 = r7 - r6
            int r2 = r2 + 1
            int r3 = r0 - r2
            boolean r4 = r5.ordered
            if (r4 == 0) goto L19
            int r2 = r2 + r6
            int r7 = r0 - r2
            java.lang.System.arraycopy(r1, r2, r1, r6, r7)
            goto L24
        L19:
            int r7 = r7 + 1
            int r7 = java.lang.Math.max(r3, r7)
            int r2 = r0 - r7
            java.lang.System.arraycopy(r1, r7, r1, r6, r2)
        L24:
            r6 = r3
        L25:
            if (r6 >= r0) goto L2d
            r7 = 0
            r1[r6] = r7
            int r6 = r6 + 1
            goto L25
        L2d:
            r5.size = r3
            return
        L30:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "start can't be > end: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " > "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L4f:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "end can't be >= size: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = " >= "
            r0.append(r7)
            int r7 = r5.size
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
    }

    public boolean removeValue(T r6, boolean r7) {
            r5 = this;
            T[] r0 = r5.items
            r1 = 0
            r2 = 1
            if (r7 != 0) goto L1d
            if (r6 != 0) goto L9
            goto L1d
        L9:
            int r7 = r5.size
            r3 = 0
        Lc:
            if (r3 >= r7) goto L2d
            r4 = r0[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1a
            r5.removeIndex(r3)
            return r2
        L1a:
            int r3 = r3 + 1
            goto Lc
        L1d:
            int r7 = r5.size
            r3 = 0
        L20:
            if (r3 >= r7) goto L2d
            r4 = r0[r3]
            if (r4 != r6) goto L2a
            r5.removeIndex(r3)
            return r2
        L2a:
            int r3 = r3 + 1
            goto L20
        L2d:
            return r1
    }

    protected T[] resize(int r4) {
            r3 = this;
            T[] r0 = r3.items
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r1 = r1.getComponentType()
            java.lang.Object r4 = com.badlogic.gdx.utils.reflect.ArrayReflection.newInstance(r1, r4)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r1 = r3.size
            int r2 = r4.length
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r3.items = r4
            return r4
    }

    public void set(int r3, T r4) {
            r2 = this;
            int r0 = r2.size
            if (r3 >= r0) goto L9
            T[] r0 = r2.items
            r0[r3] = r4
            return
        L9:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "index can't be >= size: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " >= "
            r0.append(r3)
            int r3 = r2.size
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public void sort() {
            r4 = this;
            com.badlogic.gdx.utils.Sort r0 = com.badlogic.gdx.utils.Sort.instance()
            T[] r1 = r4.items
            int r2 = r4.size
            r3 = 0
            r0.sort(r1, r3, r2)
            return
    }

    public void sort(java.util.Comparator<? super T> r5) {
            r4 = this;
            com.badlogic.gdx.utils.Sort r0 = com.badlogic.gdx.utils.Sort.instance()
            T[] r1 = r4.items
            int r2 = r4.size
            r3 = 0
            r0.sort(r1, r5, r3, r2)
            return
    }

    public <V> V[] toArray(java.lang.Class<V> r4) {
            r3 = this;
            int r0 = r3.size
            java.lang.Object r4 = com.badlogic.gdx.utils.reflect.ArrayReflection.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            T[] r0 = r3.items
            int r1 = r3.size
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            return r4
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.size
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            T[] r0 = r4.items
            com.badlogic.gdx.utils.StringBuilder r1 = new com.badlogic.gdx.utils.StringBuilder
            r2 = 32
            r1.<init>(r2)
            r2 = 91
            r1.append(r2)
            r2 = 0
            r2 = r0[r2]
            r1.append(r2)
            r2 = 1
        L1c:
            int r3 = r4.size
            if (r2 >= r3) goto L2d
            java.lang.String r3 = ", "
            r1.append(r3)
            r3 = r0[r2]
            r1.append(r3)
            int r2 = r2 + 1
            goto L1c
        L2d:
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public java.lang.String toString(java.lang.String r5) {
            r4 = this;
            int r0 = r4.size
            if (r0 != 0) goto L7
            java.lang.String r5 = ""
            return r5
        L7:
            T[] r0 = r4.items
            com.badlogic.gdx.utils.StringBuilder r1 = new com.badlogic.gdx.utils.StringBuilder
            r2 = 32
            r1.<init>(r2)
            r2 = 0
            r2 = r0[r2]
            r1.append(r2)
            r2 = 1
        L17:
            int r3 = r4.size
            if (r2 >= r3) goto L26
            r1.append(r5)
            r3 = r0[r2]
            r1.append(r3)
            int r2 = r2 + 1
            goto L17
        L26:
            java.lang.String r5 = r1.toString()
            return r5
    }

    public void truncate(int r4) {
            r3 = this;
            if (r4 < 0) goto L17
            int r0 = r3.size
            if (r0 > r4) goto L7
            return
        L7:
            r0 = r4
        L8:
            int r1 = r3.size
            if (r0 >= r1) goto L14
            T[] r1 = r3.items
            r2 = 0
            r1[r0] = r2
            int r0 = r0 + 1
            goto L8
        L14:
            r3.size = r4
            return
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "newSize must be >= 0: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
