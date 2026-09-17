package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class Queue<T> implements java.lang.Iterable<T> {
    protected int head;
    private transient com.badlogic.gdx.utils.Queue.QueueIterable iterable;
    public int size;
    protected int tail;
    protected T[] values;

    public static class QueueIterable<T> implements java.lang.Iterable<T> {
        private final boolean allowRemove;
        private com.badlogic.gdx.utils.Queue.QueueIterator iterator1;
        private com.badlogic.gdx.utils.Queue.QueueIterator iterator2;
        private final com.badlogic.gdx.utils.Queue<T> queue;

        public QueueIterable(com.badlogic.gdx.utils.Queue<T> r2) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                return
        }

        public QueueIterable(com.badlogic.gdx.utils.Queue<T> r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.queue = r1
                r0.allowRemove = r2
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r4 = this;
                boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
                if (r0 == 0) goto Le
                com.badlogic.gdx.utils.Queue$QueueIterator r0 = new com.badlogic.gdx.utils.Queue$QueueIterator
                com.badlogic.gdx.utils.Queue<T> r1 = r4.queue
                boolean r2 = r4.allowRemove
                r0.<init>(r1, r2)
                return r0
            Le:
                com.badlogic.gdx.utils.Queue$QueueIterator r0 = r4.iterator1
                if (r0 != 0) goto L28
                com.badlogic.gdx.utils.Queue$QueueIterator r0 = new com.badlogic.gdx.utils.Queue$QueueIterator
                com.badlogic.gdx.utils.Queue<T> r1 = r4.queue
                boolean r2 = r4.allowRemove
                r0.<init>(r1, r2)
                r4.iterator1 = r0
                com.badlogic.gdx.utils.Queue$QueueIterator r0 = new com.badlogic.gdx.utils.Queue$QueueIterator
                com.badlogic.gdx.utils.Queue<T> r1 = r4.queue
                boolean r2 = r4.allowRemove
                r0.<init>(r1, r2)
                r4.iterator2 = r0
            L28:
                com.badlogic.gdx.utils.Queue$QueueIterator r0 = r4.iterator1
                boolean r1 = r0.valid
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L39
                r0.index = r3
                r0.valid = r2
                com.badlogic.gdx.utils.Queue$QueueIterator r1 = r4.iterator2
                r1.valid = r3
                return r0
            L39:
                com.badlogic.gdx.utils.Queue$QueueIterator r1 = r4.iterator2
                r1.index = r3
                r1.valid = r2
                r0.valid = r3
                return r1
        }
    }

    public static class QueueIterator<T> implements java.util.Iterator<T>, java.lang.Iterable<T> {
        private final boolean allowRemove;
        int index;
        private final com.badlogic.gdx.utils.Queue<T> queue;
        boolean valid;

        public QueueIterator(com.badlogic.gdx.utils.Queue<T> r2, boolean r3) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.valid = r0
                r1.queue = r2
                r1.allowRemove = r3
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                boolean r0 = r2.valid
                if (r0 == 0) goto L10
                int r0 = r2.index
                com.badlogic.gdx.utils.Queue<T> r1 = r2.queue
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
        public java.util.Iterator<T> iterator() {
                r0 = this;
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                int r0 = r3.index
                com.badlogic.gdx.utils.Queue<T> r1 = r3.queue
                int r2 = r1.size
                if (r0 >= r2) goto L1d
                boolean r2 = r3.valid
                if (r2 == 0) goto L15
                int r2 = r0 + 1
                r3.index = r2
                java.lang.Object r0 = r1.get(r0)
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
                com.badlogic.gdx.utils.Queue<T> r1 = r2.queue
                r1.removeIndex(r0)
                return
            L10:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "Remove not allowed."
                r0.<init>(r1)
                throw r0
        }
    }

    public Queue() {
            r1 = this;
            r0 = 16
            r1.<init>(r0)
            return
    }

    public Queue(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.head = r0
            r1.tail = r0
            r1.size = r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.values = r2
            return
    }

    public void addLast(T r4) {
            r3 = this;
            T[] r0 = r3.values
            int r1 = r3.size
            int r2 = r0.length
            if (r1 != r2) goto Lf
            int r0 = r0.length
            int r0 = r0 << 1
            r3.resize(r0)
            T[] r0 = r3.values
        Lf:
            int r1 = r3.tail
            int r2 = r1 + 1
            r3.tail = r2
            r0[r1] = r4
            int r4 = r0.length
            if (r2 != r4) goto L1d
            r4 = 0
            r3.tail = r4
        L1d:
            int r4 = r3.size
            int r4 = r4 + 1
            r3.size = r4
            return
    }

    public boolean equals(java.lang.Object r12) {
            r11 = this;
            r0 = 1
            if (r11 != r12) goto L4
            return r0
        L4:
            r1 = 0
            if (r12 == 0) goto L40
            boolean r2 = r12 instanceof com.badlogic.gdx.utils.Queue
            if (r2 != 0) goto Lc
            goto L40
        Lc:
            com.badlogic.gdx.utils.Queue r12 = (com.badlogic.gdx.utils.Queue) r12
            int r2 = r11.size
            int r3 = r12.size
            if (r3 == r2) goto L15
            return r1
        L15:
            T[] r3 = r11.values
            int r4 = r3.length
            T[] r5 = r12.values
            int r6 = r5.length
            int r7 = r11.head
            int r12 = r12.head
            r8 = 0
        L20:
            if (r8 >= r2) goto L3f
            r9 = r3[r7]
            r10 = r5[r12]
            if (r9 != 0) goto L2b
            if (r10 != 0) goto L31
            goto L32
        L2b:
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L32
        L31:
            return r1
        L32:
            int r7 = r7 + 1
            int r12 = r12 + 1
            if (r7 != r4) goto L39
            r7 = 0
        L39:
            if (r12 != r6) goto L3c
            r12 = 0
        L3c:
            int r8 = r8 + 1
            goto L20
        L3f:
            return r0
        L40:
            return r1
    }

    public T get(int r4) {
            r3 = this;
            if (r4 < 0) goto L34
            int r0 = r3.size
            if (r4 >= r0) goto L13
            T[] r0 = r3.values
            int r1 = r3.head
            int r1 = r1 + r4
            int r4 = r0.length
            if (r1 < r4) goto L10
            int r4 = r0.length
            int r1 = r1 - r4
        L10:
            r4 = r0[r1]
            return r4
        L13:
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
        L34:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "index can't be < 0: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public int hashCode() {
            r8 = this;
            int r0 = r8.size
            T[] r1 = r8.values
            int r2 = r1.length
            int r3 = r8.head
            int r4 = r0 + 1
            r5 = 0
            r6 = 0
        Lb:
            if (r6 >= r0) goto L20
            r7 = r1[r3]
            int r4 = r4 * 31
            if (r7 == 0) goto L18
            int r7 = r7.hashCode()
            int r4 = r4 + r7
        L18:
            int r3 = r3 + 1
            if (r3 != r2) goto L1d
            r3 = 0
        L1d:
            int r6 = r6 + 1
            goto Lb
        L20:
            return r4
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r2 = this;
            boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
            if (r0 == 0) goto Lb
            com.badlogic.gdx.utils.Queue$QueueIterator r0 = new com.badlogic.gdx.utils.Queue$QueueIterator
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        Lb:
            com.badlogic.gdx.utils.Queue$QueueIterable r0 = r2.iterable
            if (r0 != 0) goto L16
            com.badlogic.gdx.utils.Queue$QueueIterable r0 = new com.badlogic.gdx.utils.Queue$QueueIterable
            r0.<init>(r2)
            r2.iterable = r0
        L16:
            com.badlogic.gdx.utils.Queue$QueueIterable r0 = r2.iterable
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public T removeFirst() {
            r5 = this;
            int r0 = r5.size
            if (r0 == 0) goto L1c
            T[] r1 = r5.values
            int r2 = r5.head
            r3 = r1[r2]
            r4 = 0
            r1[r2] = r4
            int r2 = r2 + 1
            r5.head = r2
            int r1 = r1.length
            if (r2 != r1) goto L17
            r1 = 0
            r5.head = r1
        L17:
            int r0 = r0 + (-1)
            r5.size = r0
            return r3
        L1c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Queue is empty."
            r0.<init>(r1)
            throw r0
    }

    public T removeIndex(int r7) {
            r6 = this;
            if (r7 < 0) goto L75
            int r0 = r6.size
            if (r7 >= r0) goto L54
            T[] r0 = r6.values
            int r1 = r6.head
            int r2 = r6.tail
            int r7 = r7 + r1
            r3 = 0
            if (r1 >= r2) goto L22
            r1 = r0[r7]
            int r4 = r7 + 1
            int r5 = r2 - r7
            java.lang.System.arraycopy(r0, r4, r0, r7, r5)
            r0[r2] = r3
            int r7 = r6.tail
            int r7 = r7 + (-1)
            r6.tail = r7
            goto L4d
        L22:
            int r4 = r0.length
            if (r7 < r4) goto L36
            int r1 = r0.length
            int r7 = r7 - r1
            r1 = r0[r7]
            int r3 = r7 + 1
            int r2 = r2 - r7
            java.lang.System.arraycopy(r0, r3, r0, r7, r2)
            int r7 = r6.tail
            int r7 = r7 + (-1)
            r6.tail = r7
            goto L4d
        L36:
            r2 = r0[r7]
            int r4 = r1 + 1
            int r7 = r7 - r1
            java.lang.System.arraycopy(r0, r1, r0, r4, r7)
            r0[r1] = r3
            int r7 = r6.head
            int r7 = r7 + 1
            r6.head = r7
            int r0 = r0.length
            if (r7 != r0) goto L4c
            r7 = 0
            r6.head = r7
        L4c:
            r1 = r2
        L4d:
            int r7 = r6.size
            int r7 = r7 + (-1)
            r6.size = r7
            return r1
        L54:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "index can't be >= size: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " >= "
            r1.append(r7)
            int r7 = r6.size
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L75:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "index can't be < 0: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    protected void resize(int r6) {
            r5 = this;
            T[] r0 = r5.values
            int r1 = r5.head
            int r2 = r5.tail
            java.lang.Class r3 = r0.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r6 = com.badlogic.gdx.utils.reflect.ArrayReflection.newInstance(r3, r6)
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r3 = 0
            if (r1 >= r2) goto L1c
            int r2 = r2 - r1
            java.lang.System.arraycopy(r0, r1, r6, r3, r2)
            goto L28
        L1c:
            int r4 = r5.size
            if (r4 <= 0) goto L28
            int r4 = r0.length
            int r4 = r4 - r1
            java.lang.System.arraycopy(r0, r1, r6, r3, r4)
            java.lang.System.arraycopy(r0, r3, r6, r4, r2)
        L28:
            r5.values = r6
            r5.head = r3
            int r6 = r5.size
            r5.tail = r6
            return
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.size
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            T[] r0 = r6.values
            int r1 = r6.head
            int r2 = r6.tail
            com.badlogic.gdx.utils.StringBuilder r3 = new com.badlogic.gdx.utils.StringBuilder
            r4 = 64
            r3.<init>(r4)
            r4 = 91
            r3.append(r4)
            r4 = r0[r1]
            r3.append(r4)
        L1e:
            int r1 = r1 + 1
            int r4 = r0.length
            int r1 = r1 % r4
            if (r1 == r2) goto L30
            java.lang.String r4 = ", "
            com.badlogic.gdx.utils.StringBuilder r4 = r3.append(r4)
            r5 = r0[r1]
            r4.append(r5)
            goto L1e
        L30:
            r0 = 93
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
