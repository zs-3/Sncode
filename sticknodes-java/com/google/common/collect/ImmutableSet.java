package com.google.common.collect;

/* loaded from: classes2.dex */
public abstract class ImmutableSet<E> extends com.google.common.collect.ImmutableCollection<E> implements java.util.Set<E> {
    private transient com.google.common.collect.ImmutableList<E> asList;

    ImmutableSet() {
            r0 = this;
            r0.<init>()
            return
    }

    static int chooseTableSize(int r6) {
            r0 = 2
            int r6 = java.lang.Math.max(r6, r0)
            r0 = 1
            r1 = 751619276(0x2ccccccc, float:5.8207657E-12)
            if (r6 >= r1) goto L24
            int r1 = r6 + (-1)
            int r1 = java.lang.Integer.highestOneBit(r1)
            int r0 = r1 << 1
        L13:
            double r1 = (double) r0
            r3 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r1 = r1 * r3
            double r3 = (double) r6
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L23
            int r0 = r0 << 1
            goto L13
        L23:
            return r0
        L24:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r6 >= r1) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            java.lang.String r6 = "collection too large"
            com.google.common.base.Preconditions.checkArgument(r0, r6)
            return r1
    }

    private static <E> com.google.common.collect.ImmutableSet<E> construct(int r13, java.lang.Object... r14) {
            if (r13 == 0) goto L77
            r0 = 0
            r1 = 1
            if (r13 == r1) goto L6d
            int r2 = chooseTableSize(r13)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            int r7 = r2 + (-1)
            r3 = 0
            r5 = 0
            r8 = 0
        L11:
            if (r3 >= r13) goto L3c
            r4 = r14[r3]
            java.lang.Object r4 = com.google.common.collect.ObjectArrays.checkElementNotNull(r4, r3)
            int r9 = r4.hashCode()
            int r10 = com.google.common.collect.Hashing.smear(r9)
        L21:
            r11 = r10 & r7
            r12 = r6[r11]
            if (r12 != 0) goto L30
            int r10 = r8 + 1
            r14[r8] = r4
            r6[r11] = r4
            int r5 = r5 + r9
            r8 = r10
            goto L36
        L30:
            boolean r11 = r12.equals(r4)
            if (r11 == 0) goto L39
        L36:
            int r3 = r3 + 1
            goto L11
        L39:
            int r10 = r10 + 1
            goto L21
        L3c:
            r3 = 0
            java.util.Arrays.fill(r14, r8, r13, r3)
            if (r8 != r1) goto L4d
            r13 = r14[r0]
            java.util.Objects.requireNonNull(r13)
            com.google.common.collect.SingletonImmutableSet r14 = new com.google.common.collect.SingletonImmutableSet
            r14.<init>(r13)
            return r14
        L4d:
            int r13 = chooseTableSize(r8)
            int r2 = r2 / 2
            if (r13 >= r2) goto L5a
            com.google.common.collect.ImmutableSet r13 = construct(r8, r14)
            return r13
        L5a:
            int r13 = r14.length
            boolean r13 = shouldTrim(r8, r13)
            if (r13 == 0) goto L65
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r8)
        L65:
            r4 = r14
            com.google.common.collect.RegularImmutableSet r13 = new com.google.common.collect.RegularImmutableSet
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r13
        L6d:
            r13 = r14[r0]
            java.util.Objects.requireNonNull(r13)
            com.google.common.collect.ImmutableSet r13 = of(r13)
            return r13
        L77:
            com.google.common.collect.ImmutableSet r13 = of()
            return r13
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of() {
            com.google.common.collect.RegularImmutableSet<java.lang.Object> r0 = com.google.common.collect.RegularImmutableSet.EMPTY
            return r0
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E r1) {
            com.google.common.collect.SingletonImmutableSet r0 = new com.google.common.collect.SingletonImmutableSet
            r0.<init>(r1)
            return r0
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E r3, E r4, E r5) {
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            com.google.common.collect.ImmutableSet r3 = construct(r0, r1)
            return r3
    }

    @java.lang.SafeVarargs
    public static <E> com.google.common.collect.ImmutableSet<E> of(E r5, E r6, E r7, E r8, E r9, E r10, E... r11) {
            int r0 = r11.length
            r1 = 1
            r2 = 0
            r3 = 2147483641(0x7ffffff9, float:NaN)
            if (r0 > r3) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r3 = "the total number of elements must fit in an int"
            com.google.common.base.Preconditions.checkArgument(r0, r3)
            int r0 = r11.length
            r3 = 6
            int r0 = r0 + r3
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r5
            r4[r1] = r6
            r5 = 2
            r4[r5] = r7
            r5 = 3
            r4[r5] = r8
            r5 = 4
            r4[r5] = r9
            r5 = 5
            r4[r5] = r10
            int r5 = r11.length
            java.lang.System.arraycopy(r11, r2, r4, r3, r5)
            com.google.common.collect.ImmutableSet r5 = construct(r0, r4)
            return r5
    }

    private static boolean shouldTrim(int r1, int r2) {
            int r0 = r2 >> 1
            int r2 = r2 >> 2
            int r0 = r0 + r2
            if (r1 >= r0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public com.google.common.collect.ImmutableList<E> asList() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.asList
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableList r0 = r1.createAsList()
            r1.asList = r0
        La:
            return r0
    }

    com.google.common.collect.ImmutableList<E> createAsList() {
            r1 = this;
            java.lang.Object[] r0 = r1.toArray()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.asImmutableList(r0)
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof com.google.common.collect.ImmutableSet
            if (r0 == 0) goto L23
            boolean r0 = r2.isHashCodeFast()
            if (r0 == 0) goto L23
            r0 = r3
            com.google.common.collect.ImmutableSet r0 = (com.google.common.collect.ImmutableSet) r0
            boolean r0 = r0.isHashCodeFast()
            if (r0 == 0) goto L23
            int r0 = r2.hashCode()
            int r1 = r3.hashCode()
            if (r0 == r1) goto L23
            r3 = 0
            return r3
        L23:
            boolean r3 = com.google.common.collect.Sets.equalsImpl(r2, r3)
            return r3
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            int r0 = com.google.common.collect.Sets.hashCodeImpl(r1)
            return r0
    }

    boolean isHashCodeFast() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }
}
