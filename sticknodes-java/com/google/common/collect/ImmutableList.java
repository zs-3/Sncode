package com.google.common.collect;

/* loaded from: classes2.dex */
public abstract class ImmutableList<E> extends com.google.common.collect.ImmutableCollection<E> implements java.util.List<E>, java.util.RandomAccess {
    private static final com.google.common.collect.UnmodifiableListIterator<java.lang.Object> EMPTY_ITR = null;

    public static final class Builder<E> extends com.google.common.collect.ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
                r1 = this;
                r0 = 4
                r1.<init>(r0)
                return
        }

        Builder(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        public com.google.common.collect.ImmutableList.Builder<E> add(E... r1) {
                r0 = this;
                super.add(r1)
                return r0
        }

        public com.google.common.collect.ImmutableList<E> build() {
                r2 = this;
                r0 = 1
                r2.forceCopy = r0
                java.lang.Object[] r0 = r2.contents
                int r1 = r2.size
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.asImmutableList(r0, r1)
                return r0
        }
    }

    static class Itr<E> extends com.google.common.collect.AbstractIndexedListIterator<E> {
        private final com.google.common.collect.ImmutableList<E> list;

        Itr(com.google.common.collect.ImmutableList<E> r2, int r3) {
                r1 = this;
                int r0 = r2.size()
                r1.<init>(r0, r3)
                r1.list = r2
                return
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected E get(int r2) {
                r1 = this;
                com.google.common.collect.ImmutableList<E> r0 = r1.list
                java.lang.Object r2 = r0.get(r2)
                return r2
        }
    }

    class SubList extends com.google.common.collect.ImmutableList<E> {
        final transient int length;
        final transient int offset;
        final /* synthetic */ com.google.common.collect.ImmutableList this$0;

        SubList(com.google.common.collect.ImmutableList r1, int r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.offset = r2
                r0.length = r3
                return
        }

        @Override // java.util.List
        public E get(int r3) {
                r2 = this;
                int r0 = r2.length
                com.google.common.base.Preconditions.checkElementIndex(r3, r0)
                com.google.common.collect.ImmutableList r0 = r2.this$0
                int r1 = r2.offset
                int r3 = r3 + r1
                java.lang.Object r3 = r0.get(r3)
                return r3
        }

        @Override // com.google.common.collect.ImmutableCollection
        java.lang.Object[] internalArray() {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = r1.this$0
                java.lang.Object[] r0 = r0.internalArray()
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection
        int internalArrayEnd() {
                r2 = this;
                com.google.common.collect.ImmutableList r0 = r2.this$0
                int r0 = r0.internalArrayStart()
                int r1 = r2.offset
                int r0 = r0 + r1
                int r1 = r2.length
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection
        int internalArrayStart() {
                r2 = this;
                com.google.common.collect.ImmutableList r0 = r2.this$0
                int r0 = r0.internalArrayStart()
                int r1 = r2.offset
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = super.iterator()
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableListIterator r0 = super.listIterator()
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
                r0 = this;
                com.google.common.collect.UnmodifiableListIterator r1 = super.listIterator(r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                int r0 = r1.length
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public com.google.common.collect.ImmutableList<E> subList(int r3, int r4) {
                r2 = this;
                int r0 = r2.length
                com.google.common.base.Preconditions.checkPositionIndexes(r3, r4, r0)
                com.google.common.collect.ImmutableList r0 = r2.this$0
                int r1 = r2.offset
                int r3 = r3 + r1
                int r4 = r4 + r1
                com.google.common.collect.ImmutableList r3 = r0.subList(r3, r4)
                return r3
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
                r0 = this;
                com.google.common.collect.ImmutableList r1 = r0.subList(r1, r2)
                return r1
        }
    }

    static {
            com.google.common.collect.ImmutableList$Itr r0 = new com.google.common.collect.ImmutableList$Itr
            com.google.common.collect.ImmutableList<java.lang.Object> r1 = com.google.common.collect.RegularImmutableList.EMPTY
            r2 = 0
            r0.<init>(r1, r2)
            com.google.common.collect.ImmutableList.EMPTY_ITR = r0
            return
    }

    ImmutableList() {
            r0 = this;
            r0.<init>()
            return
    }

    static <E> com.google.common.collect.ImmutableList<E> asImmutableList(java.lang.Object[] r1) {
            int r0 = r1.length
            com.google.common.collect.ImmutableList r1 = asImmutableList(r1, r0)
            return r1
    }

    static <E> com.google.common.collect.ImmutableList<E> asImmutableList(java.lang.Object[] r1, int r2) {
            if (r2 != 0) goto L7
            com.google.common.collect.ImmutableList r1 = of()
            return r1
        L7:
            com.google.common.collect.RegularImmutableList r0 = new com.google.common.collect.RegularImmutableList
            r0.<init>(r1, r2)
            return r0
    }

    private static <E> com.google.common.collect.ImmutableList<E> construct(java.lang.Object... r0) {
            java.lang.Object[] r0 = com.google.common.collect.ObjectArrays.checkElementsNotNull(r0)
            com.google.common.collect.ImmutableList r0 = asImmutableList(r0)
            return r0
    }

    public static <E> com.google.common.collect.ImmutableList<E> of() {
            com.google.common.collect.ImmutableList<java.lang.Object> r0 = com.google.common.collect.RegularImmutableList.EMPTY
            return r0
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2, E r3) {
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2, E r3, E r4) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2, E r3, E r4, E r5, E r6, E r7, E r8) {
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    @java.lang.SafeVarargs
    public static <E> com.google.common.collect.ImmutableList<E> of(E r5, E r6, E r7, E r8, E r9, E r10, E r11, E r12, E r13, E r14, E r15, E r16, E... r17) {
            r0 = r17
            int r1 = r0.length
            r2 = 1
            r3 = 0
            r4 = 2147483635(0x7ffffff3, float:NaN)
            if (r1 > r4) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            java.lang.String r4 = "the total number of elements must fit in an int"
            com.google.common.base.Preconditions.checkArgument(r1, r4)
            int r1 = r0.length
            r4 = 12
            int r1 = r1 + r4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r6
            r2 = 2
            r1[r2] = r7
            r2 = 3
            r1[r2] = r8
            r2 = 4
            r1[r2] = r9
            r2 = 5
            r1[r2] = r10
            r2 = 6
            r1[r2] = r11
            r2 = 7
            r1[r2] = r12
            r2 = 8
            r1[r2] = r13
            r2 = 9
            r1[r2] = r14
            r2 = 10
            r1[r2] = r15
            r2 = 11
            r1[r2] = r16
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r4, r2)
            com.google.common.collect.ImmutableList r0 = construct(r1)
            return r0
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] r5, int r6) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L12
            int r2 = r6 + r1
            java.lang.Object r3 = r4.get(r1)
            r5[r2] = r3
            int r1 = r1 + 1
            goto L5
        L12:
            int r6 = r6 + r0
            return r6
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Lists.equalsImpl(r0, r1)
            return r1
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            r2 = 0
        L6:
            if (r2 >= r0) goto L18
            int r1 = r1 * 31
            java.lang.Object r3 = r4.get(r2)
            int r3 = r3.hashCode()
            int r1 = r1 + r3
            int r1 = ~r1
            int r1 = ~r1
            int r2 = r2 + 1
            goto L6
        L18:
            return r1
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = -1
            goto L8
        L4:
            int r1 = com.google.common.collect.Lists.indexOfImpl(r0, r1)
        L8:
            return r1
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableListIterator r0 = r1.listIterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = -1
            goto L8
        L4:
            int r1 = com.google.common.collect.Lists.lastIndexOfImpl(r0, r1)
        L8:
            return r1
    }

    @Override // java.util.List
    public com.google.common.collect.UnmodifiableListIterator<E> listIterator() {
            r1 = this;
            r0 = 0
            com.google.common.collect.UnmodifiableListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.List
    public com.google.common.collect.UnmodifiableListIterator<E> listIterator(int r2) {
            r1 = this;
            int r0 = r1.size()
            com.google.common.base.Preconditions.checkPositionIndex(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L10
            com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r2 = com.google.common.collect.ImmutableList.EMPTY_ITR
            return r2
        L10:
            com.google.common.collect.ImmutableList$Itr r0 = new com.google.common.collect.ImmutableList$Itr
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableListIterator r0 = r1.listIterator()
            return r0
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            com.google.common.collect.UnmodifiableListIterator r1 = r0.listIterator(r1)
            return r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E set(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    public com.google.common.collect.ImmutableList<E> subList(int r3, int r4) {
            r2 = this;
            int r0 = r2.size()
            com.google.common.base.Preconditions.checkPositionIndexes(r3, r4, r0)
            int r0 = r4 - r3
            int r1 = r2.size()
            if (r0 != r1) goto L10
            return r2
        L10:
            if (r0 != 0) goto L17
            com.google.common.collect.ImmutableList r3 = of()
            return r3
        L17:
            com.google.common.collect.ImmutableList r3 = r2.subListUnchecked(r3, r4)
            return r3
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.subList(r1, r2)
            return r1
    }

    com.google.common.collect.ImmutableList<E> subListUnchecked(int r2, int r3) {
            r1 = this;
            com.google.common.collect.ImmutableList$SubList r0 = new com.google.common.collect.ImmutableList$SubList
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
    }
}
