package com.google.common.collect;

/* loaded from: classes2.dex */
public abstract class ImmutableMap<K, V> implements java.util.Map<K, V>, java.io.Serializable {
    static final java.util.Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = null;
    private transient com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet;
    private transient com.google.common.collect.ImmutableSet<K> keySet;
    private transient com.google.common.collect.ImmutableCollection<V> values;

    public static class Builder<K, V> {
        java.lang.Object[] alternatingKeysAndValues;
        com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey;
        boolean entriesUsed;
        int size;
        java.util.Comparator<? super V> valueComparator;

        static final class DuplicateKey {
            private final java.lang.Object key;
            private final java.lang.Object value1;
            private final java.lang.Object value2;

            DuplicateKey(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
                    r0 = this;
                    r0.<init>()
                    r0.key = r1
                    r0.value1 = r2
                    r0.value2 = r3
                    return
            }

            java.lang.IllegalArgumentException exception() {
                    r7 = this;
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.Object r1 = r7.key
                    java.lang.String r1 = java.lang.String.valueOf(r1)
                    java.lang.Object r2 = r7.value1
                    java.lang.String r2 = java.lang.String.valueOf(r2)
                    java.lang.Object r3 = r7.key
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    java.lang.Object r4 = r7.value2
                    java.lang.String r4 = java.lang.String.valueOf(r4)
                    int r5 = r1.length()
                    int r5 = r5 + 39
                    int r6 = r2.length()
                    int r5 = r5 + r6
                    int r6 = r3.length()
                    int r5 = r5 + r6
                    int r6 = r4.length()
                    int r5 = r5 + r6
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>(r5)
                    java.lang.String r5 = "Multiple entries with same key: "
                    r6.append(r5)
                    r6.append(r1)
                    java.lang.String r1 = "="
                    r6.append(r1)
                    r6.append(r2)
                    java.lang.String r2 = " and "
                    r6.append(r2)
                    r6.append(r3)
                    r6.append(r1)
                    r6.append(r4)
                    java.lang.String r1 = r6.toString()
                    r0.<init>(r1)
                    return r0
            }
        }

        public Builder() {
                r1 = this;
                r0 = 4
                r1.<init>(r0)
                return
        }

        Builder(int r1) {
                r0 = this;
                r0.<init>()
                int r1 = r1 * 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r0.alternatingKeysAndValues = r1
                r1 = 0
                r0.size = r1
                r0.entriesUsed = r1
                return
        }

        private com.google.common.collect.ImmutableMap<K, V> build(boolean r6) {
                r5 = this;
                if (r6 == 0) goto Lc
                com.google.common.collect.ImmutableMap$Builder$DuplicateKey r0 = r5.duplicateKey
                if (r0 != 0) goto L7
                goto Lc
            L7:
                java.lang.IllegalArgumentException r6 = r0.exception()
                throw r6
            Lc:
                int r0 = r5.size
                java.util.Comparator<? super V> r1 = r5.valueComparator
                r2 = 1
                if (r1 != 0) goto L16
                java.lang.Object[] r1 = r5.alternatingKeysAndValues
                goto L3b
            L16:
                boolean r1 = r5.entriesUsed
                if (r1 == 0) goto L24
                java.lang.Object[] r1 = r5.alternatingKeysAndValues
                int r3 = r0 * 2
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
                r5.alternatingKeysAndValues = r1
            L24:
                java.lang.Object[] r1 = r5.alternatingKeysAndValues
                if (r6 != 0) goto L36
                int r3 = r5.size
                java.lang.Object[] r1 = r5.lastEntryForEachKey(r1, r3)
                int r3 = r1.length
                java.lang.Object[] r4 = r5.alternatingKeysAndValues
                int r4 = r4.length
                if (r3 >= r4) goto L36
                int r0 = r1.length
                int r0 = r0 >>> r2
            L36:
                java.util.Comparator<? super V> r3 = r5.valueComparator
                sortEntries(r1, r0, r3)
            L3b:
                r5.entriesUsed = r2
                com.google.common.collect.RegularImmutableMap r0 = com.google.common.collect.RegularImmutableMap.create(r0, r1, r5)
                if (r6 == 0) goto L4d
                com.google.common.collect.ImmutableMap$Builder$DuplicateKey r6 = r5.duplicateKey
                if (r6 != 0) goto L48
                goto L4d
            L48:
                java.lang.IllegalArgumentException r6 = r6.exception()
                throw r6
            L4d:
                return r0
        }

        private void ensureCapacity(int r3) {
                r2 = this;
                int r3 = r3 * 2
                java.lang.Object[] r0 = r2.alternatingKeysAndValues
                int r1 = r0.length
                if (r3 <= r1) goto L15
                int r1 = r0.length
                int r3 = com.google.common.collect.ImmutableCollection.Builder.expandedCapacity(r1, r3)
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
                r2.alternatingKeysAndValues = r3
                r3 = 0
                r2.entriesUsed = r3
            L15:
                return
        }

        private java.lang.Object[] lastEntryForEachKey(java.lang.Object[] r7, int r8) {
                r6 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.util.BitSet r1 = new java.util.BitSet
                r1.<init>()
                int r2 = r8 + (-1)
            Lc:
                if (r2 < 0) goto L21
                int r3 = r2 * 2
                r3 = r7[r3]
                java.util.Objects.requireNonNull(r3)
                boolean r3 = r0.add(r3)
                if (r3 != 0) goto L1e
                r1.set(r2)
            L1e:
                int r2 = r2 + (-1)
                goto Lc
            L21:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L28
                return r7
            L28:
                int r0 = r1.cardinality()
                int r0 = r8 - r0
                int r0 = r0 * 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r2 = 0
                r3 = 0
            L34:
                int r4 = r8 * 2
                if (r2 >= r4) goto L5a
                int r4 = r2 >>> 1
                boolean r4 = r1.get(r4)
                if (r4 == 0) goto L43
                int r2 = r2 + 2
                goto L34
            L43:
                int r4 = r3 + 1
                int r5 = r2 + 1
                r2 = r7[r2]
                java.util.Objects.requireNonNull(r2)
                r0[r3] = r2
                int r3 = r4 + 1
                int r2 = r5 + 1
                r5 = r7[r5]
                java.util.Objects.requireNonNull(r5)
                r0[r4] = r5
                goto L34
            L5a:
                return r0
        }

        static <V> void sortEntries(java.lang.Object[] r6, int r7, java.util.Comparator<? super V> r8) {
                java.util.Map$Entry[] r0 = new java.util.Map.Entry[r7]
                r1 = 0
                r2 = 0
            L4:
                if (r2 >= r7) goto L1e
                int r3 = r2 * 2
                r4 = r6[r3]
                java.util.Objects.requireNonNull(r4)
                int r3 = r3 + 1
                r3 = r6[r3]
                java.util.Objects.requireNonNull(r3)
                java.util.AbstractMap$SimpleImmutableEntry r5 = new java.util.AbstractMap$SimpleImmutableEntry
                r5.<init>(r4, r3)
                r0[r2] = r5
                int r2 = r2 + 1
                goto L4
            L1e:
                com.google.common.collect.Ordering r8 = com.google.common.collect.Ordering.from(r8)
                com.google.common.base.Function r2 = com.google.common.collect.Maps.valueFunction()
                com.google.common.collect.Ordering r8 = r8.onResultOf(r2)
                java.util.Arrays.sort(r0, r1, r7, r8)
            L2d:
                if (r1 >= r7) goto L46
                int r8 = r1 * 2
                r2 = r0[r1]
                java.lang.Object r2 = r2.getKey()
                r6[r8] = r2
                int r8 = r8 + 1
                r2 = r0[r1]
                java.lang.Object r2 = r2.getValue()
                r6[r8] = r2
                int r1 = r1 + 1
                goto L2d
            L46:
                return
        }

        public com.google.common.collect.ImmutableMap<K, V> build() {
                r1 = this;
                com.google.common.collect.ImmutableMap r0 = r1.buildOrThrow()
                return r0
        }

        public com.google.common.collect.ImmutableMap<K, V> buildOrThrow() {
                r1 = this;
                r0 = 1
                com.google.common.collect.ImmutableMap r0 = r1.build(r0)
                return r0
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> put(K r4, V r5) {
                r3 = this;
                int r0 = r3.size
                int r0 = r0 + 1
                r3.ensureCapacity(r0)
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
                java.lang.Object[] r0 = r3.alternatingKeysAndValues
                int r1 = r3.size
                int r2 = r1 * 2
                r0[r2] = r4
                int r4 = r1 * 2
                int r4 = r4 + 1
                r0[r4] = r5
                int r1 = r1 + 1
                r3.size = r1
                return r3
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> r2) {
                r1 = this;
                java.lang.Object r0 = r2.getKey()
                java.lang.Object r2 = r2.getValue()
                com.google.common.collect.ImmutableMap$Builder r2 = r1.put(r0, r2)
                return r2
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Collection
                if (r0 == 0) goto L11
                int r0 = r2.size
                r1 = r3
                java.util.Collection r1 = (java.util.Collection) r1
                int r1 = r1.size()
                int r0 = r0 + r1
                r2.ensureCapacity(r0)
            L11:
                java.util.Iterator r3 = r3.iterator()
            L15:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L25
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r2.put(r0)
                goto L15
            L25:
                return r2
        }

        public com.google.common.collect.ImmutableMap.Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> r1) {
                r0 = this;
                java.util.Set r1 = r1.entrySet()
                com.google.common.collect.ImmutableMap$Builder r1 = r0.putAll(r1)
                return r1
        }
    }

    static {
            r0 = 0
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            com.google.common.collect.ImmutableMap.EMPTY_ENTRY_ARRAY = r0
            return
    }

    ImmutableMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <K, V> com.google.common.collect.ImmutableMap.Builder<K, V> builder() {
            com.google.common.collect.ImmutableMap$Builder r0 = new com.google.common.collect.ImmutableMap$Builder
            r0.<init>()
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r2) {
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            goto Ld
        Lc:
            r0 = 4
        Ld:
            com.google.common.collect.ImmutableMap$Builder r1 = new com.google.common.collect.ImmutableMap$Builder
            r1.<init>(r0)
            r1.putAll(r2)
            com.google.common.collect.ImmutableMap r2 = r1.build()
            return r2
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K r2, V r3, K r4, V r5, K r6, V r7, K r8, V r9) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r2, r3)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r6, r7)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r8, r9)
            r0 = 8
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
            r3 = 5
            r0[r3] = r7
            r3 = 6
            r0[r3] = r8
            r3 = 7
            r0[r3] = r9
            com.google.common.collect.RegularImmutableMap r2 = com.google.common.collect.RegularImmutableMap.create(r2, r0)
            return r2
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K r2, V r3, K r4, V r5, K r6, V r7, K r8, V r9, K r10, V r11) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r2, r3)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r6, r7)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r8, r9)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r10, r11)
            r0 = 10
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
            r3 = 6
            r0[r3] = r8
            r3 = 7
            r0[r3] = r9
            r3 = 8
            r0[r3] = r10
            r3 = 9
            r0[r3] = r11
            com.google.common.collect.RegularImmutableMap r2 = com.google.common.collect.RegularImmutableMap.create(r2, r0)
            return r2
    }

    @java.lang.SafeVarargs
    public static <K, V> com.google.common.collect.ImmutableMap<K, V> ofEntries(java.util.Map.Entry<? extends K, ? extends V>... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.common.collect.ImmutableMap r0 = copyOf(r0)
            return r0
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.values()
            boolean r2 = r0.contains(r2)
            return r2
    }

    abstract com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet();

    abstract com.google.common.collect.ImmutableSet<K> createKeySet();

    abstract com.google.common.collect.ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet<java.util.Map$Entry<K, V>> r0 = r1.entrySet
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableSet r0 = r1.createEntrySet()
            r1.entrySet = r0
        La:
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entrySet()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Maps.equalsImpl(r0, r1)
            return r1
    }

    @Override // java.util.Map
    public abstract V get(java.lang.Object r1);

    @Override // java.util.Map
    public final V getOrDefault(java.lang.Object r1, V r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            return r2
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entrySet()
            int r0 = com.google.common.collect.Sets.hashCodeImpl(r0)
            return r0
    }

    @Override // java.util.Map
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

    @Override // java.util.Map
    public com.google.common.collect.ImmutableSet<K> keySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet<K> r0 = r1.keySet
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableSet r0 = r1.createKeySet()
            r1.keySet = r0
        La:
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.keySet()
            return r0
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final V put(K r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final V remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.common.collect.Maps.toStringImpl(r1)
            return r0
    }

    @Override // java.util.Map
    public com.google.common.collect.ImmutableCollection<V> values() {
            r1 = this;
            com.google.common.collect.ImmutableCollection<V> r0 = r1.values
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableCollection r0 = r1.createValues()
            r1.values = r0
        La:
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.values()
            return r0
    }
}
