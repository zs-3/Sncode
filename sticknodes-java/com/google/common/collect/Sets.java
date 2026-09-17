package com.google.common.collect;

/* loaded from: classes2.dex */
public final class Sets {


    public static abstract class SetView<E> extends java.util.AbstractSet<E> {
        private SetView() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ SetView(com.google.common.collect.Sets.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean add(E r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean addAll(java.util.Collection<? extends E> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final void clear() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean remove(java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    static boolean equalsImpl(java.util.Set<?> r4, java.lang.Object r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L1e
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L1e
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L1e
            if (r1 != r3) goto L1c
            boolean r4 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
        L1e:
            return r2
    }

    static int hashCodeImpl(java.util.Set<?> r3) {
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
            r1 = 0
        L6:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L17
            int r2 = r2.hashCode()
            goto L18
        L17:
            r2 = 0
        L18:
            int r1 = r1 + r2
            int r1 = ~r1
            int r1 = ~r1
            goto L6
        L1c:
            return r1
    }

    public static <E> com.google.common.collect.Sets.SetView<E> union(java.util.Set<? extends E> r1, java.util.Set<? extends E> r2) {
            java.lang.String r0 = "set1"
            com.google.common.base.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "set2"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            com.google.common.collect.Sets$1 r0 = new com.google.common.collect.Sets$1
            r0.<init>(r1, r2)
            return r0
    }
}
