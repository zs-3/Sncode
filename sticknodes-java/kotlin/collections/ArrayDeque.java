package kotlin.collections;

/* compiled from: ArrayDeque.kt */
/* loaded from: classes2.dex */
public final class ArrayDeque<E> extends kotlin.collections.AbstractMutableList<E> {
    public static final kotlin.collections.ArrayDeque.Companion Companion = null;
    private static final java.lang.Object[] emptyElementData = null;
    private java.lang.Object[] elementData;
    private int head;
    private int size;

    /* compiled from: ArrayDeque.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final int newCapacity$kotlin_stdlib(int r3, int r4) {
                r2 = this;
                int r0 = r3 >> 1
                int r3 = r3 + r0
                int r0 = r3 - r4
                if (r0 >= 0) goto L8
                r3 = r4
            L8:
                r0 = 2147483639(0x7ffffff7, float:NaN)
                int r1 = r3 - r0
                if (r1 <= 0) goto L18
                if (r4 <= r0) goto L15
                r3 = 2147483647(0x7fffffff, float:NaN)
                goto L18
            L15:
                r3 = 2147483639(0x7ffffff7, float:NaN)
            L18:
                return r3
        }
    }

    static {
            kotlin.collections.ArrayDeque$Companion r0 = new kotlin.collections.ArrayDeque$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.ArrayDeque.Companion = r0
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            kotlin.collections.ArrayDeque.emptyElementData = r0
            return
    }

    public ArrayDeque() {
            r1 = this;
            r1.<init>()
            java.lang.Object[] r0 = kotlin.collections.ArrayDeque.emptyElementData
            r1.elementData = r0
            return
    }

    private final void copyCollectionElements(int r5, java.util.Collection<? extends E> r6) {
            r4 = this;
            java.util.Iterator r0 = r6.iterator()
            java.lang.Object[] r1 = r4.elementData
            int r1 = r1.length
        L7:
            if (r5 >= r1) goto L1a
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object[] r2 = r4.elementData
            java.lang.Object r3 = r0.next()
            r2[r5] = r3
            int r5 = r5 + 1
            goto L7
        L1a:
            r5 = 0
            int r1 = r4.head
        L1d:
            if (r5 >= r1) goto L30
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object[] r2 = r4.elementData
            java.lang.Object r3 = r0.next()
            r2[r5] = r3
            int r5 = r5 + 1
            goto L1d
        L30:
            int r5 = r4.size()
            int r6 = r6.size()
            int r5 = r5 + r6
            r4.size = r5
            return
    }

    private final void copyElements(int r5) {
            r4 = this;
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object[] r0 = r4.elementData
            int r1 = r4.head
            int r2 = r0.length
            r3 = 0
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r0, r5, r3, r1, r2)
            java.lang.Object[] r0 = r4.elementData
            int r1 = r0.length
            int r2 = r4.head
            int r1 = r1 - r2
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r0, r5, r1, r3, r2)
            r4.head = r3
            r4.elementData = r5
            return
    }

    private final int decremented(int r1) {
            r0 = this;
            if (r1 != 0) goto L9
            java.lang.Object[] r1 = r0.elementData
            int r1 = kotlin.collections.ArraysKt___ArraysKt.getLastIndex(r1)
            goto Lb
        L9:
            int r1 = r1 + (-1)
        Lb:
            return r1
    }

    private final void ensureCapacity(int r3) {
            r2 = this;
            if (r3 < 0) goto L22
            java.lang.Object[] r0 = r2.elementData
            int r1 = r0.length
            if (r3 > r1) goto L8
            return
        L8:
            java.lang.Object[] r1 = kotlin.collections.ArrayDeque.emptyElementData
            if (r0 != r1) goto L17
            r0 = 10
            int r3 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r0)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.elementData = r3
            return
        L17:
            kotlin.collections.ArrayDeque$Companion r1 = kotlin.collections.ArrayDeque.Companion
            int r0 = r0.length
            int r3 = r1.newCapacity$kotlin_stdlib(r0, r3)
            r2.copyElements(r3)
            return
        L22:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Deque is too big."
            r3.<init>(r0)
            throw r3
    }

    private final int incremented(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.elementData
            int r0 = kotlin.collections.ArraysKt___ArraysKt.getLastIndex(r0)
            if (r2 != r0) goto La
            r2 = 0
            goto Lc
        La:
            int r2 = r2 + 1
        Lc:
            return r2
    }

    private final int negativeMod(int r2) {
            r1 = this;
            if (r2 >= 0) goto L6
            java.lang.Object[] r0 = r1.elementData
            int r0 = r0.length
            int r2 = r2 + r0
        L6:
            return r2
    }

    private final int positiveMod(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.elementData
            int r1 = r0.length
            if (r3 < r1) goto L7
            int r0 = r0.length
            int r3 = r3 - r0
        L7:
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r8, E r9) {
            r7 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r7.size()
            r0.checkPositionIndex$kotlin_stdlib(r8, r1)
            int r0 = r7.size()
            if (r8 != r0) goto L13
            r7.addLast(r9)
            return
        L13:
            if (r8 != 0) goto L19
            r7.addFirst(r9)
            return
        L19:
            int r0 = r7.size()
            r1 = 1
            int r0 = r0 + r1
            r7.ensureCapacity(r0)
            int r0 = r7.head
            int r0 = r0 + r8
            int r0 = r7.positiveMod(r0)
            int r2 = r7.size()
            int r2 = r2 + r1
            int r2 = r2 >> r1
            r3 = 0
            if (r8 >= r2) goto L6a
            int r8 = r7.decremented(r0)
            int r0 = r7.head
            int r0 = r7.decremented(r0)
            int r2 = r7.head
            if (r8 < r2) goto L4e
            java.lang.Object[] r3 = r7.elementData
            r4 = r3[r2]
            r3[r0] = r4
            int r4 = r2 + 1
            int r5 = r8 + 1
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r3, r3, r2, r4, r5)
            goto L63
        L4e:
            java.lang.Object[] r4 = r7.elementData
            int r5 = r2 + (-1)
            int r6 = r4.length
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r4, r4, r5, r2, r6)
            java.lang.Object[] r2 = r7.elementData
            int r4 = r2.length
            int r4 = r4 - r1
            r5 = r2[r3]
            r2[r4] = r5
            int r4 = r8 + 1
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r2, r2, r3, r1, r4)
        L63:
            java.lang.Object[] r2 = r7.elementData
            r2[r8] = r9
            r7.head = r0
            goto L97
        L6a:
            int r8 = r7.head
            int r2 = r7.size()
            int r8 = r8 + r2
            int r8 = r7.positiveMod(r8)
            if (r0 >= r8) goto L7f
            java.lang.Object[] r2 = r7.elementData
            int r3 = r0 + 1
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r2, r2, r3, r0, r8)
            goto L93
        L7f:
            java.lang.Object[] r2 = r7.elementData
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r2, r2, r1, r3, r8)
            java.lang.Object[] r8 = r7.elementData
            int r2 = r8.length
            int r2 = r2 - r1
            r2 = r8[r2]
            r8[r3] = r2
            int r2 = r0 + 1
            int r3 = r8.length
            int r3 = r3 - r1
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r8, r8, r2, r0, r3)
        L93:
            java.lang.Object[] r8 = r7.elementData
            r8[r0] = r9
        L97:
            int r8 = r7.size()
            int r8 = r8 + r1
            r7.size = r8
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r1) {
            r0 = this;
            r0.addLast(r1)
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r9, java.util.Collection<? extends E> r10) {
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r8.size()
            r0.checkPositionIndex$kotlin_stdlib(r9, r1)
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 == 0) goto L16
            return r1
        L16:
            int r0 = r8.size()
            if (r9 != r0) goto L21
            boolean r9 = r8.addAll(r10)
            return r9
        L21:
            int r0 = r8.size()
            int r2 = r10.size()
            int r0 = r0 + r2
            r8.ensureCapacity(r0)
            int r0 = r8.head
            int r2 = r8.size()
            int r0 = r0 + r2
            int r0 = r8.positiveMod(r0)
            int r2 = r8.head
            int r2 = r2 + r9
            int r2 = r8.positiveMod(r2)
            int r3 = r10.size()
            int r4 = r8.size()
            r5 = 1
            int r4 = r4 + r5
            int r4 = r4 >> r5
            if (r9 >= r4) goto L9d
            int r9 = r8.head
            int r0 = r9 - r3
            if (r2 < r9) goto L76
            if (r0 < 0) goto L5a
            java.lang.Object[] r1 = r8.elementData
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r1, r1, r0, r9, r2)
            goto L92
        L5a:
            java.lang.Object[] r4 = r8.elementData
            int r6 = r4.length
            int r0 = r0 + r6
            int r6 = r2 - r9
            int r7 = r4.length
            int r7 = r7 - r0
            if (r7 < r6) goto L68
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r4, r4, r0, r9, r2)
            goto L92
        L68:
            int r6 = r9 + r7
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r4, r4, r0, r9, r6)
            java.lang.Object[] r9 = r8.elementData
            int r4 = r8.head
            int r4 = r4 + r7
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r9, r9, r1, r4, r2)
            goto L92
        L76:
            java.lang.Object[] r4 = r8.elementData
            int r6 = r4.length
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r4, r4, r0, r9, r6)
            if (r3 < r2) goto L86
            java.lang.Object[] r9 = r8.elementData
            int r4 = r9.length
            int r4 = r4 - r3
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r9, r9, r4, r1, r2)
            goto L92
        L86:
            java.lang.Object[] r9 = r8.elementData
            int r4 = r9.length
            int r4 = r4 - r3
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r9, r9, r4, r1, r3)
            java.lang.Object[] r9 = r8.elementData
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r9, r9, r1, r3, r2)
        L92:
            r8.head = r0
            int r2 = r2 - r3
            int r9 = r8.negativeMod(r2)
            r8.copyCollectionElements(r9, r10)
            goto Le2
        L9d:
            int r9 = r2 + r3
            if (r2 >= r0) goto Lc1
            int r3 = r3 + r0
            java.lang.Object[] r4 = r8.elementData
            int r6 = r4.length
            if (r3 > r6) goto Lab
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r4, r4, r9, r2, r0)
            goto Ldf
        Lab:
            int r6 = r4.length
            if (r9 < r6) goto Lb4
            int r1 = r4.length
            int r9 = r9 - r1
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r4, r4, r9, r2, r0)
            goto Ldf
        Lb4:
            int r6 = r4.length
            int r3 = r3 - r6
            int r3 = r0 - r3
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r4, r4, r1, r3, r0)
            java.lang.Object[] r0 = r8.elementData
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r0, r0, r9, r2, r3)
            goto Ldf
        Lc1:
            java.lang.Object[] r4 = r8.elementData
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r4, r4, r3, r1, r0)
            java.lang.Object[] r0 = r8.elementData
            int r4 = r0.length
            if (r9 < r4) goto Ld2
            int r1 = r0.length
            int r9 = r9 - r1
            int r1 = r0.length
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r0, r0, r9, r2, r1)
            goto Ldf
        Ld2:
            int r4 = r0.length
            int r4 = r4 - r3
            int r6 = r0.length
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r0, r0, r1, r4, r6)
            java.lang.Object[] r0 = r8.elementData
            int r1 = r0.length
            int r1 = r1 - r3
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r0, r0, r9, r2, r1)
        Ldf:
            r8.copyCollectionElements(r2, r10)
        Le2:
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Ld
            r3 = 0
            return r3
        Ld:
            int r0 = r2.size()
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.ensureCapacity(r0)
            int r0 = r2.head
            int r1 = r2.size()
            int r0 = r0 + r1
            int r0 = r2.positiveMod(r0)
            r2.copyCollectionElements(r0, r3)
            r3 = 1
            return r3
    }

    public final void addFirst(E r3) {
            r2 = this;
            int r0 = r2.size()
            int r0 = r0 + 1
            r2.ensureCapacity(r0)
            int r0 = r2.head
            int r0 = r2.decremented(r0)
            r2.head = r0
            java.lang.Object[] r1 = r2.elementData
            r1[r0] = r3
            int r3 = r2.size()
            int r3 = r3 + 1
            r2.size = r3
            return
    }

    public final void addLast(E r4) {
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
            java.lang.Object[] r0 = r3.elementData
            int r1 = r3.head
            int r2 = r3.size()
            int r1 = r1 + r2
            int r1 = r3.positiveMod(r1)
            r0[r1] = r4
            int r4 = r3.size()
            int r4 = r4 + 1
            r3.size = r4
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r6 = this;
            int r0 = r6.head
            int r1 = r6.size()
            int r0 = r0 + r1
            int r0 = r6.positiveMod(r0)
            int r1 = r6.head
            r2 = 0
            r3 = 0
            if (r1 >= r0) goto L17
            java.lang.Object[] r4 = r6.elementData
            kotlin.collections.ArraysKt___ArraysJvmKt.fill(r4, r3, r1, r0)
            goto L2c
        L17:
            boolean r1 = r6.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L2c
            java.lang.Object[] r1 = r6.elementData
            int r4 = r6.head
            int r5 = r1.length
            kotlin.collections.ArraysKt___ArraysJvmKt.fill(r1, r3, r4, r5)
            java.lang.Object[] r1 = r6.elementData
            kotlin.collections.ArraysKt___ArraysJvmKt.fill(r1, r3, r2, r0)
        L2c:
            r6.head = r2
            r6.size = r2
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r3) {
            r2 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.size()
            r0.checkElementIndex$kotlin_stdlib(r3, r1)
            java.lang.Object[] r0 = r2.elementData
            int r1 = r2.head
            int r1 = r1 + r3
            int r3 = r2.positiveMod(r1)
            r3 = r0[r3]
            return r3
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.head
            int r1 = r4.size()
            int r0 = r0 + r1
            int r0 = r4.positiveMod(r0)
            int r1 = r4.head
            if (r1 >= r0) goto L22
        Lf:
            if (r1 >= r0) goto L50
            java.lang.Object[] r2 = r4.elementData
            r2 = r2[r1]
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
            if (r2 == 0) goto L1f
            int r5 = r4.head
        L1d:
            int r1 = r1 - r5
            return r1
        L1f:
            int r1 = r1 + 1
            goto Lf
        L22:
            if (r1 < r0) goto L50
            java.lang.Object[] r2 = r4.elementData
            int r2 = r2.length
        L27:
            if (r1 >= r2) goto L39
            java.lang.Object[] r3 = r4.elementData
            r3 = r3[r1]
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
            if (r3 == 0) goto L36
            int r5 = r4.head
            goto L1d
        L36:
            int r1 = r1 + 1
            goto L27
        L39:
            r1 = 0
        L3a:
            if (r1 >= r0) goto L50
            java.lang.Object[] r2 = r4.elementData
            r2 = r2[r1]
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
            if (r2 == 0) goto L4d
            java.lang.Object[] r5 = r4.elementData
            int r5 = r5.length
            int r1 = r1 + r5
            int r5 = r4.head
            goto L1d
        L4d:
            int r1 = r1 + 1
            goto L3a
        L50:
            r5 = -1
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.head
            int r1 = r4.size()
            int r0 = r0 + r1
            int r0 = r4.positiveMod(r0)
            int r1 = r4.head
            r2 = -1
            if (r1 >= r0) goto L27
            int r0 = r0 + (-1)
            if (r1 > r0) goto L5d
        L14:
            java.lang.Object[] r3 = r4.elementData
            r3 = r3[r0]
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
            if (r3 == 0) goto L22
            int r5 = r4.head
        L20:
            int r0 = r0 - r5
            return r0
        L22:
            if (r0 == r1) goto L5d
            int r0 = r0 + (-1)
            goto L14
        L27:
            if (r1 <= r0) goto L5d
            int r0 = r0 + (-1)
        L2b:
            if (r2 >= r0) goto L41
            java.lang.Object[] r1 = r4.elementData
            r1 = r1[r0]
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
            if (r1 == 0) goto L3e
            java.lang.Object[] r5 = r4.elementData
            int r5 = r5.length
            int r0 = r0 + r5
            int r5 = r4.head
            goto L20
        L3e:
            int r0 = r0 + (-1)
            goto L2b
        L41:
            java.lang.Object[] r0 = r4.elementData
            int r0 = kotlin.collections.ArraysKt___ArraysKt.getLastIndex(r0)
            int r1 = r4.head
            if (r1 > r0) goto L5d
        L4b:
            java.lang.Object[] r3 = r4.elementData
            r3 = r3[r0]
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
            if (r3 == 0) goto L58
            int r5 = r4.head
            goto L20
        L58:
            if (r0 == r1) goto L5d
            int r0 = r0 + (-1)
            goto L4b
        L5d:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r2 = 0
            return r2
        L9:
            r1.remove(r2)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L96
            java.lang.Object[] r0 = r11.elementData
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L19
            goto L96
        L19:
            int r0 = r11.head
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.positiveMod(r0)
            int r3 = r11.head
            r4 = 0
            if (r3 >= r0) goto L49
            r5 = r3
        L2a:
            if (r3 >= r0) goto L43
            java.lang.Object[] r6 = r11.elementData
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L3f
            java.lang.Object[] r7 = r11.elementData
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L40
        L3f:
            r1 = 1
        L40:
            int r3 = r3 + 1
            goto L2a
        L43:
            java.lang.Object[] r12 = r11.elementData
            kotlin.collections.ArraysKt___ArraysJvmKt.fill(r12, r4, r5, r0)
            goto L8b
        L49:
            java.lang.Object[] r5 = r11.elementData
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L4e:
            if (r3 >= r5) goto L69
            java.lang.Object[] r8 = r11.elementData
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L65
            java.lang.Object[] r8 = r11.elementData
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L66
        L65:
            r7 = 1
        L66:
            int r3 = r3 + 1
            goto L4e
        L69:
            int r3 = r11.positiveMod(r6)
            r5 = r3
        L6e:
            if (r1 >= r0) goto L8a
            java.lang.Object[] r3 = r11.elementData
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L86
            java.lang.Object[] r3 = r11.elementData
            r3[r5] = r6
            int r5 = r11.incremented(r5)
            goto L87
        L86:
            r7 = 1
        L87:
            int r1 = r1 + 1
            goto L6e
        L8a:
            r1 = r7
        L8b:
            if (r1 == 0) goto L96
            int r12 = r11.head
            int r5 = r5 - r12
            int r12 = r11.negativeMod(r5)
            r11.size = r12
        L96:
            return r1
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int r9) {
            r8 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r8.size()
            r0.checkElementIndex$kotlin_stdlib(r9, r1)
            int r0 = kotlin.collections.CollectionsKt.getLastIndex(r8)
            if (r9 != r0) goto L14
            java.lang.Object r9 = r8.removeLast()
            return r9
        L14:
            if (r9 != 0) goto L1b
            java.lang.Object r9 = r8.removeFirst()
            return r9
        L1b:
            int r0 = r8.head
            int r0 = r0 + r9
            int r0 = r8.positiveMod(r0)
            java.lang.Object[] r1 = r8.elementData
            r1 = r1[r0]
            int r2 = r8.size()
            r3 = 1
            int r2 = r2 >> r3
            r4 = 0
            r5 = 0
            if (r9 >= r2) goto L5f
            int r9 = r8.head
            if (r0 < r9) goto L3c
            java.lang.Object[] r2 = r8.elementData
            int r5 = r9 + 1
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r2, r2, r5, r9, r0)
            goto L52
        L3c:
            java.lang.Object[] r9 = r8.elementData
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r9, r9, r3, r5, r0)
            java.lang.Object[] r9 = r8.elementData
            int r0 = r9.length
            int r0 = r0 - r3
            r0 = r9[r0]
            r9[r5] = r0
            int r0 = r8.head
            int r2 = r0 + 1
            int r5 = r9.length
            int r5 = r5 - r3
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r9, r9, r2, r0, r5)
        L52:
            java.lang.Object[] r9 = r8.elementData
            int r0 = r8.head
            r9[r0] = r4
            int r9 = r8.incremented(r0)
            r8.head = r9
            goto L8f
        L5f:
            int r9 = r8.head
            int r2 = kotlin.collections.CollectionsKt.getLastIndex(r8)
            int r9 = r9 + r2
            int r9 = r8.positiveMod(r9)
            if (r0 > r9) goto L76
            java.lang.Object[] r2 = r8.elementData
            int r5 = r0 + 1
            int r6 = r9 + 1
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r2, r2, r0, r5, r6)
            goto L8b
        L76:
            java.lang.Object[] r2 = r8.elementData
            int r6 = r0 + 1
            int r7 = r2.length
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r2, r2, r0, r6, r7)
            java.lang.Object[] r0 = r8.elementData
            int r2 = r0.length
            int r2 = r2 - r3
            r6 = r0[r5]
            r0[r2] = r6
            int r2 = r9 + 1
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r0, r0, r5, r3, r2)
        L8b:
            java.lang.Object[] r0 = r8.elementData
            r0[r9] = r4
        L8f:
            int r9 = r8.size()
            int r9 = r9 - r3
            r8.size = r9
            return r1
    }

    public final E removeFirst() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L1e
            java.lang.Object[] r0 = r4.elementData
            int r1 = r4.head
            r2 = r0[r1]
            r3 = 0
            r0[r1] = r3
            int r0 = r4.incremented(r1)
            r4.head = r0
            int r0 = r4.size()
            int r0 = r0 + (-1)
            r4.size = r0
            return r2
        L1e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    public final E removeFirstOrNull() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto Lc
        L8:
            java.lang.Object r0 = r1.removeFirst()
        Lc:
            return r0
    }

    public final E removeLast() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L21
            int r0 = r4.head
            int r1 = kotlin.collections.CollectionsKt.getLastIndex(r4)
            int r0 = r0 + r1
            int r0 = r4.positiveMod(r0)
            java.lang.Object[] r1 = r4.elementData
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            int r0 = r4.size()
            int r0 = r0 + (-1)
            r4.size = r0
            return r2
        L21:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L93
            java.lang.Object[] r0 = r11.elementData
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L19
            goto L93
        L19:
            int r0 = r11.head
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.positiveMod(r0)
            int r3 = r11.head
            r4 = 0
            if (r3 >= r0) goto L48
            r5 = r3
        L2a:
            if (r3 >= r0) goto L42
            java.lang.Object[] r6 = r11.elementData
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L3e
            java.lang.Object[] r7 = r11.elementData
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L3f
        L3e:
            r1 = 1
        L3f:
            int r3 = r3 + 1
            goto L2a
        L42:
            java.lang.Object[] r12 = r11.elementData
            kotlin.collections.ArraysKt___ArraysJvmKt.fill(r12, r4, r5, r0)
            goto L88
        L48:
            java.lang.Object[] r5 = r11.elementData
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L4d:
            if (r3 >= r5) goto L67
            java.lang.Object[] r8 = r11.elementData
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L63
            java.lang.Object[] r8 = r11.elementData
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L64
        L63:
            r7 = 1
        L64:
            int r3 = r3 + 1
            goto L4d
        L67:
            int r3 = r11.positiveMod(r6)
            r5 = r3
        L6c:
            if (r1 >= r0) goto L87
            java.lang.Object[] r3 = r11.elementData
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L83
            java.lang.Object[] r3 = r11.elementData
            r3[r5] = r6
            int r5 = r11.incremented(r5)
            goto L84
        L83:
            r7 = 1
        L84:
            int r1 = r1 + 1
            goto L6c
        L87:
            r1 = r7
        L88:
            if (r1 == 0) goto L93
            int r12 = r11.head
            int r5 = r5 - r12
            int r12 = r11.negativeMod(r5)
            r11.size = r12
        L93:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int r3, E r4) {
            r2 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.size()
            r0.checkElementIndex$kotlin_stdlib(r3, r1)
            int r0 = r2.head
            int r0 = r0 + r3
            int r3 = r2.positiveMod(r0)
            java.lang.Object[] r0 = r2.elementData
            r1 = r0[r3]
            r0[r3] = r4
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] r8) {
            r7 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.length
            int r1 = r7.size()
            if (r0 < r1) goto Ld
            goto L15
        Ld:
            int r0 = r7.size()
            java.lang.Object[] r8 = kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls(r8, r0)
        L15:
            int r0 = r7.head
            int r1 = r7.size()
            int r0 = r0 + r1
            int r4 = r7.positiveMod(r0)
            int r3 = r7.head
            if (r3 >= r4) goto L2e
            java.lang.Object[] r0 = r7.elementData
            r2 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto$default(r0, r1, r2, r3, r4, r5, r6)
            goto L48
        L2e:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L48
            java.lang.Object[] r0 = r7.elementData
            int r1 = r7.head
            int r2 = r0.length
            r3 = 0
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r0, r8, r3, r1, r2)
            java.lang.Object[] r0 = r7.elementData
            int r1 = r0.length
            int r2 = r7.head
            int r1 = r1 - r2
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r0, r8, r1, r3, r4)
        L48:
            int r0 = r8.length
            int r1 = r7.size()
            if (r0 <= r1) goto L56
            int r0 = r7.size()
            r1 = 0
            r8[r0] = r1
        L56:
            return r8
    }
}
