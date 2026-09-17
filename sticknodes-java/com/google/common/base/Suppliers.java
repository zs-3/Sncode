package com.google.common.base;

/* loaded from: classes2.dex */
public final class Suppliers {

    static class MemoizingSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        final com.google.common.base.Supplier<T> delegate;
        volatile transient boolean initialized;
        transient T value;

        MemoizingSupplier(com.google.common.base.Supplier<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.base.Supplier
        public T get() {
                r2 = this;
                boolean r0 = r2.initialized
                if (r0 != 0) goto L1b
                monitor-enter(r2)
                boolean r0 = r2.initialized     // Catch: java.lang.Throwable -> L18
                if (r0 != 0) goto L16
                com.google.common.base.Supplier<T> r0 = r2.delegate     // Catch: java.lang.Throwable -> L18
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L18
                r2.value = r0     // Catch: java.lang.Throwable -> L18
                r1 = 1
                r2.initialized = r1     // Catch: java.lang.Throwable -> L18
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
                return r0
            L16:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
                goto L1b
            L18:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
                throw r0
            L1b:
                T r0 = r2.value
                java.lang.Object r0 = com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(r0)
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                boolean r0 = r3.initialized
                if (r0 == 0) goto L27
                T r0 = r3.value
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 25
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "<supplier that returned "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r0 = ">"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                goto L29
            L27:
                com.google.common.base.Supplier<T> r0 = r3.delegate
            L29:
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 19
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Suppliers.memoize("
                r2.append(r1)
                r2.append(r0)
                java.lang.String r0 = ")"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
        }
    }

    static class NonSerializableMemoizingSupplier<T> implements com.google.common.base.Supplier<T> {
        volatile com.google.common.base.Supplier<T> delegate;
        volatile boolean initialized;
        T value;

        NonSerializableMemoizingSupplier(com.google.common.base.Supplier<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.base.Supplier
        public T get() {
                r2 = this;
                boolean r0 = r2.initialized
                if (r0 != 0) goto L23
                monitor-enter(r2)
                boolean r0 = r2.initialized     // Catch: java.lang.Throwable -> L20
                if (r0 != 0) goto L1e
                com.google.common.base.Supplier<T> r0 = r2.delegate     // Catch: java.lang.Throwable -> L20
                java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.base.Supplier r0 = (com.google.common.base.Supplier) r0     // Catch: java.lang.Throwable -> L20
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L20
                r2.value = r0     // Catch: java.lang.Throwable -> L20
                r1 = 1
                r2.initialized = r1     // Catch: java.lang.Throwable -> L20
                r1 = 0
                r2.delegate = r1     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                return r0
            L1e:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                goto L23
            L20:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0
            L23:
                T r0 = r2.value
                java.lang.Object r0 = com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(r0)
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                com.google.common.base.Supplier<T> r0 = r3.delegate
                if (r0 != 0) goto L26
                T r0 = r3.value
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 25
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "<supplier that returned "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r0 = ">"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
            L26:
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 19
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Suppliers.memoize("
                r2.append(r1)
                r2.append(r0)
                java.lang.String r0 = ")"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
        }
    }

    private static class SupplierOfInstance<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        final T instance;

        SupplierOfInstance(T r1) {
                r0 = this;
                r0.<init>()
                r0.instance = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Suppliers.SupplierOfInstance
                if (r0 == 0) goto Lf
                com.google.common.base.Suppliers$SupplierOfInstance r2 = (com.google.common.base.Suppliers.SupplierOfInstance) r2
                T r0 = r1.instance
                T r2 = r2.instance
                boolean r2 = com.google.common.base.Objects.equal(r0, r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // com.google.common.base.Supplier
        public T get() {
                r1 = this;
                T r0 = r1.instance
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                T r1 = r3.instance
                r2 = 0
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                T r0 = r3.instance
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 22
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Suppliers.ofInstance("
                r2.append(r1)
                r2.append(r0)
                java.lang.String r0 = ")"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
        }
    }

    public static <T> com.google.common.base.Supplier<T> memoize(com.google.common.base.Supplier<T> r1) {
            boolean r0 = r1 instanceof com.google.common.base.Suppliers.NonSerializableMemoizingSupplier
            if (r0 != 0) goto L19
            boolean r0 = r1 instanceof com.google.common.base.Suppliers.MemoizingSupplier
            if (r0 == 0) goto L9
            goto L19
        L9:
            boolean r0 = r1 instanceof java.io.Serializable
            if (r0 == 0) goto L13
            com.google.common.base.Suppliers$MemoizingSupplier r0 = new com.google.common.base.Suppliers$MemoizingSupplier
            r0.<init>(r1)
            goto L18
        L13:
            com.google.common.base.Suppliers$NonSerializableMemoizingSupplier r0 = new com.google.common.base.Suppliers$NonSerializableMemoizingSupplier
            r0.<init>(r1)
        L18:
            return r0
        L19:
            return r1
    }

    public static <T> com.google.common.base.Supplier<T> ofInstance(T r1) {
            com.google.common.base.Suppliers$SupplierOfInstance r0 = new com.google.common.base.Suppliers$SupplierOfInstance
            r0.<init>(r1)
            return r0
    }
}
