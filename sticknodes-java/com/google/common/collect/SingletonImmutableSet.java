package com.google.common.collect;

/* loaded from: classes2.dex */
final class SingletonImmutableSet<E> extends com.google.common.collect.ImmutableSet<E> {
    final transient E element;

    SingletonImmutableSet(E r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            r0.element = r1
            return
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            E r0 = r1.element
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] r2, int r3) {
            r1 = this;
            E r0 = r1.element
            r2[r3] = r0
            int r3 = r3 + 1
            return r3
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            E r0 = r1.element
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r1 = this;
            E r0 = r1.element
            com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.singletonIterator(r0)
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
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r3 = this;
            E r0 = r3.element
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r1 = 91
            r2.append(r1)
            r2.append(r0)
            r0 = 93
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
