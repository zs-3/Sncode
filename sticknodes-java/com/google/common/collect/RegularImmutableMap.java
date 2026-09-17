package com.google.common.collect;

/* loaded from: classes2.dex */
final class RegularImmutableMap<K, V> extends com.google.common.collect.ImmutableMap<K, V> {
    static final com.google.common.collect.ImmutableMap<java.lang.Object, java.lang.Object> EMPTY = null;
    final transient java.lang.Object[] alternatingKeysAndValues;
    private final transient java.lang.Object hashTable;
    private final transient int size;

    static class EntrySet<K, V> extends com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {
        private final transient java.lang.Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient com.google.common.collect.ImmutableMap<K, V> map;
        private final transient int size;


        EntrySet(com.google.common.collect.ImmutableMap<K, V> r1, java.lang.Object[] r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.map = r1
                r0.alternatingKeysAndValues = r2
                r0.keyOffset = r3
                r0.size = r4
                return
        }

        static /* synthetic */ int access$000(com.google.common.collect.RegularImmutableMap.EntrySet r0) {
                int r0 = r0.size
                return r0
        }

        static /* synthetic */ java.lang.Object[] access$100(com.google.common.collect.RegularImmutableMap.EntrySet r0) {
                java.lang.Object[] r0 = r0.alternatingKeysAndValues
                return r0
        }

        static /* synthetic */ int access$200(com.google.common.collect.RegularImmutableMap.EntrySet r0) {
                int r0 = r0.keyOffset
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L1e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                if (r4 == 0) goto L1e
                com.google.common.collect.ImmutableMap<K, V> r2 = r3.map
                java.lang.Object r0 = r2.get(r0)
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L1e
                r1 = 1
            L1e:
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection
        int copyIntoArray(java.lang.Object[] r2, int r3) {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = r1.asList()
                int r2 = r0.copyIntoArray(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.ImmutableSet
        com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> createAsList() {
                r1 = this;
                com.google.common.collect.RegularImmutableMap$EntrySet$1 r0 = new com.google.common.collect.RegularImmutableMap$EntrySet$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = r1.asList()
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    static final class KeySet<K> extends com.google.common.collect.ImmutableSet<K> {
        private final transient com.google.common.collect.ImmutableList<K> list;
        private final transient com.google.common.collect.ImmutableMap<K, ?> map;

        KeySet(com.google.common.collect.ImmutableMap<K, ?> r1, com.google.common.collect.ImmutableList<K> r2) {
                r0 = this;
                r0.<init>()
                r0.map = r1
                r0.list = r2
                return
        }

        @Override // com.google.common.collect.ImmutableSet
        public com.google.common.collect.ImmutableList<K> asList() {
                r1 = this;
                com.google.common.collect.ImmutableList<K> r0 = r1.list
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, ?> r0 = r1.map
                java.lang.Object r2 = r0.get(r2)
                if (r2 == 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection
        int copyIntoArray(java.lang.Object[] r2, int r3) {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = r1.asList()
                int r2 = r0.copyIntoArray(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public com.google.common.collect.UnmodifiableIterator<K> iterator() {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = r1.asList()
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, ?> r0 = r1.map
                int r0 = r0.size()
                return r0
        }
    }

    static final class KeysOrValuesAsList extends com.google.common.collect.ImmutableList<java.lang.Object> {
        private final transient java.lang.Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        KeysOrValuesAsList(java.lang.Object[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.alternatingKeysAndValues = r1
                r0.offset = r2
                r0.size = r3
                return
        }

        @Override // java.util.List
        public java.lang.Object get(int r3) {
                r2 = this;
                int r0 = r2.size
                com.google.common.base.Preconditions.checkElementIndex(r3, r0)
                java.lang.Object[] r0 = r2.alternatingKeysAndValues
                int r3 = r3 * 2
                int r1 = r2.offset
                int r3 = r3 + r1
                r3 = r0[r3]
                java.util.Objects.requireNonNull(r3)
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    static {
            com.google.common.collect.RegularImmutableMap r0 = new com.google.common.collect.RegularImmutableMap
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r0.<init>(r3, r2, r1)
            com.google.common.collect.RegularImmutableMap.EMPTY = r0
            return
    }

    private RegularImmutableMap(java.lang.Object r1, java.lang.Object[] r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.hashTable = r1
            r0.alternatingKeysAndValues = r2
            r0.size = r3
            return
    }

    static <K, V> com.google.common.collect.RegularImmutableMap<K, V> create(int r1, java.lang.Object[] r2) {
            r0 = 0
            com.google.common.collect.RegularImmutableMap r1 = create(r1, r2, r0)
            return r1
    }

    static <K, V> com.google.common.collect.RegularImmutableMap<K, V> create(int r4, java.lang.Object[] r5, com.google.common.collect.ImmutableMap.Builder<K, V> r6) {
            if (r4 != 0) goto L7
            com.google.common.collect.ImmutableMap<java.lang.Object, java.lang.Object> r4 = com.google.common.collect.RegularImmutableMap.EMPTY
            com.google.common.collect.RegularImmutableMap r4 = (com.google.common.collect.RegularImmutableMap) r4
            return r4
        L7:
            r0 = 0
            r1 = 1
            if (r4 != r1) goto L1f
            r4 = r5[r0]
            java.util.Objects.requireNonNull(r4)
            r6 = r5[r1]
            java.util.Objects.requireNonNull(r6)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r6)
            com.google.common.collect.RegularImmutableMap r4 = new com.google.common.collect.RegularImmutableMap
            r6 = 0
            r4.<init>(r6, r5, r1)
            return r4
        L1f:
            int r2 = r5.length
            int r2 = r2 >> r1
            com.google.common.base.Preconditions.checkPositionIndex(r4, r2)
            int r2 = com.google.common.collect.ImmutableSet.chooseTableSize(r4)
            java.lang.Object r2 = createHashTable(r5, r4, r2, r0)
            boolean r3 = r2 instanceof java.lang.Object[]
            if (r3 == 0) goto L53
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r4 = 2
            r4 = r2[r4]
            com.google.common.collect.ImmutableMap$Builder$DuplicateKey r4 = (com.google.common.collect.ImmutableMap.Builder.DuplicateKey) r4
            if (r6 == 0) goto L4e
            r6.duplicateKey = r4
            r4 = r2[r0]
            r6 = r2[r1]
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r0 = r6 * 2
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            r2 = r4
            r4 = r6
            goto L53
        L4e:
            java.lang.IllegalArgumentException r4 = r4.exception()
            throw r4
        L53:
            com.google.common.collect.RegularImmutableMap r6 = new com.google.common.collect.RegularImmutableMap
            r6.<init>(r2, r5, r4)
            return r6
    }

    private static java.lang.Object createHashTable(java.lang.Object[] r16, int r17, int r18, int r19) {
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L18
            r0 = r16[r19]
            java.util.Objects.requireNonNull(r0)
            r1 = r19 ^ 1
            r1 = r16[r1]
            java.util.Objects.requireNonNull(r1)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r0, r1)
            return r2
        L18:
            int r4 = r1 + (-1)
            r5 = 128(0x80, float:1.794E-43)
            r6 = 3
            r7 = -1
            r8 = 2
            r9 = 0
            if (r1 > r5) goto L8c
            byte[] r1 = new byte[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r7 = 0
        L29:
            if (r5 >= r0) goto L7b
            int r10 = r5 * 2
            int r10 = r10 + r19
            int r11 = r7 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r12, r10)
            int r13 = r12.hashCode()
            int r13 = com.google.common.collect.Hashing.smear(r13)
        L49:
            r13 = r13 & r4
            r14 = r1[r13]
            r15 = 255(0xff, float:3.57E-43)
            r14 = r14 & r15
            if (r14 != r15) goto L5f
            byte r14 = (byte) r11
            r1[r13] = r14
            if (r7 >= r5) goto L5c
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L5c:
            int r7 = r7 + 1
            goto L75
        L5f:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L78
            com.google.common.collect.ImmutableMap$Builder$DuplicateKey r2 = new com.google.common.collect.ImmutableMap$Builder$DuplicateKey
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        L75:
            int r5 = r5 + 1
            goto L29
        L78:
            int r13 = r13 + 1
            goto L49
        L7b:
            if (r7 != r0) goto L7e
            goto L8b
        L7e:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L8b:
            return r1
        L8c:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r1 > r5) goto Lfc
            short[] r1 = new short[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r7 = 0
        L98:
            if (r5 >= r0) goto Leb
            int r10 = r5 * 2
            int r10 = r10 + r19
            int r11 = r7 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r12, r10)
            int r13 = r12.hashCode()
            int r13 = com.google.common.collect.Hashing.smear(r13)
        Lb8:
            r13 = r13 & r4
            short r14 = r1[r13]
            r15 = 65535(0xffff, float:9.1834E-41)
            r14 = r14 & r15
            if (r14 != r15) goto Lcf
            short r14 = (short) r11
            r1[r13] = r14
            if (r7 >= r5) goto Lcc
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        Lcc:
            int r7 = r7 + 1
            goto Le5
        Lcf:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto Le8
            com.google.common.collect.ImmutableMap$Builder$DuplicateKey r2 = new com.google.common.collect.ImmutableMap$Builder$DuplicateKey
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        Le5:
            int r5 = r5 + 1
            goto L98
        Le8:
            int r13 = r13 + 1
            goto Lb8
        Leb:
            if (r7 != r0) goto Lee
            goto Lfb
        Lee:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        Lfb:
            return r1
        Lfc:
            int[] r1 = new int[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r10 = 0
        L103:
            if (r5 >= r0) goto L153
            int r11 = r5 * 2
            int r11 = r11 + r19
            int r12 = r10 * 2
            int r12 = r12 + r19
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r11 = r11 ^ r3
            r11 = r16[r11]
            java.util.Objects.requireNonNull(r11)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r13, r11)
            int r14 = r13.hashCode()
            int r14 = com.google.common.collect.Hashing.smear(r14)
        L123:
            r14 = r14 & r4
            r15 = r1[r14]
            if (r15 != r7) goto L135
            r1[r14] = r12
            if (r10 >= r5) goto L132
            r16[r12] = r13
            r12 = r12 ^ 1
            r16[r12] = r11
        L132:
            int r10 = r10 + 1
            goto L14b
        L135:
            r7 = r16[r15]
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L14f
            com.google.common.collect.ImmutableMap$Builder$DuplicateKey r2 = new com.google.common.collect.ImmutableMap$Builder$DuplicateKey
            r7 = r15 ^ 1
            r12 = r16[r7]
            java.util.Objects.requireNonNull(r12)
            r2.<init>(r13, r11, r12)
            r16[r7] = r11
        L14b:
            int r5 = r5 + 1
            r7 = -1
            goto L103
        L14f:
            int r14 = r14 + 1
            r7 = -1
            goto L123
        L153:
            if (r10 != r0) goto L156
            goto L163
        L156:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L163:
            return r1
    }

    static java.lang.Object get(java.lang.Object r4, java.lang.Object[] r5, int r6, int r7, java.lang.Object r8) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r6 != r1) goto L1a
            r4 = r5[r7]
            java.util.Objects.requireNonNull(r4)
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L19
            r4 = r7 ^ 1
            r0 = r5[r4]
            java.util.Objects.requireNonNull(r0)
        L19:
            return r0
        L1a:
            if (r4 != 0) goto L1d
            return r0
        L1d:
            boolean r6 = r4 instanceof byte[]
            if (r6 == 0) goto L48
            r6 = r4
            byte[] r6 = (byte[]) r6
            int r4 = r6.length
            int r7 = r4 + (-1)
            int r4 = r8.hashCode()
            int r4 = com.google.common.collect.Hashing.smear(r4)
        L2f:
            r4 = r4 & r7
            r2 = r6[r4]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            if (r2 != r3) goto L38
            return r0
        L38:
            r3 = r5[r2]
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L45
            r4 = r2 ^ 1
            r4 = r5[r4]
            return r4
        L45:
            int r4 = r4 + 1
            goto L2f
        L48:
            boolean r6 = r4 instanceof short[]
            if (r6 == 0) goto L74
            r6 = r4
            short[] r6 = (short[]) r6
            int r4 = r6.length
            int r7 = r4 + (-1)
            int r4 = r8.hashCode()
            int r4 = com.google.common.collect.Hashing.smear(r4)
        L5a:
            r4 = r4 & r7
            short r2 = r6[r4]
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            if (r2 != r3) goto L64
            return r0
        L64:
            r3 = r5[r2]
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L71
            r4 = r2 ^ 1
            r4 = r5[r4]
            return r4
        L71:
            int r4 = r4 + 1
            goto L5a
        L74:
            int[] r4 = (int[]) r4
            int r6 = r4.length
            int r6 = r6 - r1
            int r7 = r8.hashCode()
            int r7 = com.google.common.collect.Hashing.smear(r7)
        L80:
            r7 = r7 & r6
            r2 = r4[r7]
            r3 = -1
            if (r2 != r3) goto L87
            return r0
        L87:
            r3 = r5[r2]
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L94
            r4 = r2 ^ 1
            r4 = r5[r4]
            return r4
        L94:
            int r7 = r7 + 1
            goto L80
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
            r4 = this;
            com.google.common.collect.RegularImmutableMap$EntrySet r0 = new com.google.common.collect.RegularImmutableMap$EntrySet
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            int r2 = r4.size
            r3 = 0
            r0.<init>(r4, r1, r3, r2)
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableSet<K> createKeySet() {
            r4 = this;
            com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList r0 = new com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            int r2 = r4.size
            r3 = 0
            r0.<init>(r1, r3, r2)
            com.google.common.collect.RegularImmutableMap$KeySet r1 = new com.google.common.collect.RegularImmutableMap$KeySet
            r1.<init>(r4, r0)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableCollection<V> createValues() {
            r4 = this;
            com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList r0 = new com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            int r2 = r4.size
            r3 = 1
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.hashTable
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            int r2 = r4.size
            r3 = 0
            java.lang.Object r5 = get(r0, r1, r2, r3, r5)
            if (r5 != 0) goto Le
            r5 = 0
        Le:
            return r5
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
