package com.google.common.collect;

/* loaded from: classes2.dex */
public abstract class ImmutableCollection<E> extends java.util.AbstractCollection<E> implements java.io.Serializable {
    private static final java.lang.Object[] EMPTY_ARRAY = null;

    static abstract class ArrayBasedBuilder<E> extends com.google.common.collect.ImmutableCollection.Builder<E> {
        java.lang.Object[] contents;
        boolean forceCopy;
        int size;

        ArrayBasedBuilder(int r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "initialCapacity"
                com.google.common.collect.CollectPreconditions.checkNonnegative(r2, r0)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r1.contents = r2
                r2 = 0
                r1.size = r2
                return
        }

        private void getReadyToExpandTo(int r4) {
                r3 = this;
                java.lang.Object[] r0 = r3.contents
                int r1 = r0.length
                r2 = 0
                if (r1 >= r4) goto L14
                int r1 = r0.length
                int r4 = com.google.common.collect.ImmutableCollection.Builder.expandedCapacity(r1, r4)
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
                r3.contents = r4
                r3.forceCopy = r2
                goto L22
            L14:
                boolean r4 = r3.forceCopy
                if (r4 == 0) goto L22
                java.lang.Object r4 = r0.clone()
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                r3.contents = r4
                r3.forceCopy = r2
            L22:
                return
        }

        public com.google.common.collect.ImmutableCollection.Builder<E> add(E... r2) {
                r1 = this;
                int r0 = r2.length
                r1.addAll(r2, r0)
                return r1
        }

        final void addAll(java.lang.Object[] r4, int r5) {
                r3 = this;
                com.google.common.collect.ObjectArrays.checkElementsNotNull(r4, r5)
                int r0 = r3.size
                int r0 = r0 + r5
                r3.getReadyToExpandTo(r0)
                java.lang.Object[] r0 = r3.contents
                int r1 = r3.size
                r2 = 0
                java.lang.System.arraycopy(r4, r2, r0, r1, r5)
                int r4 = r3.size
                int r4 = r4 + r5
                r3.size = r4
                return
        }
    }

    public static abstract class Builder<E> {
        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        static int expandedCapacity(int r1, int r2) {
                if (r2 < 0) goto L17
                int r0 = r1 >> 1
                int r1 = r1 + r0
                int r1 = r1 + 1
                if (r1 >= r2) goto L11
                int r2 = r2 + (-1)
                int r1 = java.lang.Integer.highestOneBit(r2)
                int r1 = r1 << 1
            L11:
                if (r1 >= 0) goto L16
                r1 = 2147483647(0x7fffffff, float:NaN)
            L16:
                return r1
            L17:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.String r2 = "cannot store more than MAX_VALUE elements"
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.common.collect.ImmutableCollection.EMPTY_ARRAY = r0
            return
    }

    ImmutableCollection() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(E r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection<? extends E> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(java.lang.Object r1);

    int copyIntoArray(java.lang.Object[] r4, int r5) {
            r3 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r3.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            int r2 = r5 + 1
            r4[r5] = r1
            r5 = r2
            goto L4
        L14:
            return r5
    }

    java.lang.Object[] internalArray() {
            r1 = this;
            r0 = 0
            return r0
    }

    int internalArrayEnd() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    int internalArrayStart() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = com.google.common.collect.ImmutableCollection.EMPTY_ARRAY
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            int r0 = r3.size()
            int r1 = r4.length
            if (r1 >= r0) goto L22
            java.lang.Object[] r1 = r3.internalArray()
            if (r1 == 0) goto L1d
            int r0 = r3.internalArrayStart()
            int r2 = r3.internalArrayEnd()
            java.lang.Object[] r4 = com.google.common.collect.Platform.copy(r1, r0, r2, r4)
            return r4
        L1d:
            java.lang.Object[] r4 = com.google.common.collect.ObjectArrays.newArray(r4, r0)
            goto L28
        L22:
            int r1 = r4.length
            if (r1 <= r0) goto L28
            r1 = 0
            r4[r0] = r1
        L28:
            r0 = 0
            r3.copyIntoArray(r4, r0)
            return r4
    }
}
