package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class ListFieldSchema {
    private static final androidx.datastore.preferences.protobuf.ListFieldSchema FULL_INSTANCE = null;
    private static final androidx.datastore.preferences.protobuf.ListFieldSchema LITE_INSTANCE = null;

    /* renamed from: androidx.datastore.preferences.protobuf.ListFieldSchema$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class ListFieldSchemaFull extends androidx.datastore.preferences.protobuf.ListFieldSchema {
        private static final java.lang.Class<?> UNMODIFIABLE_LIST_CLASS = null;

        static {
                java.util.List r0 = java.util.Collections.emptyList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                java.lang.Class r0 = r0.getClass()
                androidx.datastore.preferences.protobuf.ListFieldSchema.ListFieldSchemaFull.UNMODIFIABLE_LIST_CLASS = r0
                return
        }

        private ListFieldSchemaFull() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ ListFieldSchemaFull(androidx.datastore.preferences.protobuf.ListFieldSchema.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static <E> java.util.List<E> getList(java.lang.Object r0, long r1) {
                java.lang.Object r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r0, r1)
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        private static <L> java.util.List<L> mutableListAt(java.lang.Object r3, long r4, int r6) {
                java.util.List r0 = getList(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L2d
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.LazyStringList
                if (r1 == 0) goto L14
                androidx.datastore.preferences.protobuf.LazyStringArrayList r0 = new androidx.datastore.preferences.protobuf.LazyStringArrayList
                r0.<init>(r6)
                goto L29
            L14:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.PrimitiveNonBoxingCollection
                if (r1 == 0) goto L24
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.Internal.ProtobufList
                if (r1 == 0) goto L24
                androidx.datastore.preferences.protobuf.Internal$ProtobufList r0 = (androidx.datastore.preferences.protobuf.Internal.ProtobufList) r0
                androidx.datastore.preferences.protobuf.Internal$ProtobufList r6 = r0.mutableCopyWithCapacity(r6)
                r0 = r6
                goto L29
            L24:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L29:
                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r3, r4, r0)
                goto L7f
            L2d:
                java.lang.Class<?> r1 = androidx.datastore.preferences.protobuf.ListFieldSchema.ListFieldSchemaFull.UNMODIFIABLE_LIST_CLASS
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L4b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r3, r4, r1)
            L49:
                r0 = r1
                goto L7f
            L4b:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList
                if (r1 == 0) goto L62
                androidx.datastore.preferences.protobuf.LazyStringArrayList r1 = new androidx.datastore.preferences.protobuf.LazyStringArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList r0 = (androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList) r0
                r1.addAll(r0)
                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r3, r4, r1)
                goto L49
            L62:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.PrimitiveNonBoxingCollection
                if (r1 == 0) goto L7f
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.Internal.ProtobufList
                if (r1 == 0) goto L7f
                r1 = r0
                androidx.datastore.preferences.protobuf.Internal$ProtobufList r1 = (androidx.datastore.preferences.protobuf.Internal.ProtobufList) r1
                boolean r2 = r1.isModifiable()
                if (r2 != 0) goto L7f
                int r0 = r0.size()
                int r0 = r0 + r6
                androidx.datastore.preferences.protobuf.Internal$ProtobufList r0 = r1.mutableCopyWithCapacity(r0)
                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r3, r4, r0)
            L7f:
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        void makeImmutableListAt(java.lang.Object r4, long r5) {
                r3 = this;
                java.lang.Object r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r4, r5)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.LazyStringList
                if (r1 == 0) goto L11
                androidx.datastore.preferences.protobuf.LazyStringList r0 = (androidx.datastore.preferences.protobuf.LazyStringList) r0
                androidx.datastore.preferences.protobuf.LazyStringList r0 = r0.getUnmodifiableView()
                goto L36
            L11:
                java.lang.Class<?> r1 = androidx.datastore.preferences.protobuf.ListFieldSchema.ListFieldSchemaFull.UNMODIFIABLE_LIST_CLASS
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L1e
                return
            L1e:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.PrimitiveNonBoxingCollection
                if (r1 == 0) goto L32
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.Internal.ProtobufList
                if (r1 == 0) goto L32
                androidx.datastore.preferences.protobuf.Internal$ProtobufList r0 = (androidx.datastore.preferences.protobuf.Internal.ProtobufList) r0
                boolean r4 = r0.isModifiable()
                if (r4 == 0) goto L31
                r0.makeImmutable()
            L31:
                return
            L32:
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            L36:
                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r4, r5, r0)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        <E> void mergeListsAt(java.lang.Object r4, java.lang.Object r5, long r6) {
                r3 = this;
                java.util.List r5 = getList(r5, r6)
                int r0 = r5.size()
                java.util.List r0 = mutableListAt(r4, r6, r0)
                int r1 = r0.size()
                int r2 = r5.size()
                if (r1 <= 0) goto L1b
                if (r2 <= 0) goto L1b
                r0.addAll(r5)
            L1b:
                if (r1 <= 0) goto L1e
                r5 = r0
            L1e:
                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r4, r6, r5)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        <L> java.util.List<L> mutableListAt(java.lang.Object r2, long r3) {
                r1 = this;
                r0 = 10
                java.util.List r2 = mutableListAt(r2, r3, r0)
                return r2
        }
    }

    private static final class ListFieldSchemaLite extends androidx.datastore.preferences.protobuf.ListFieldSchema {
        private ListFieldSchemaLite() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ ListFieldSchemaLite(androidx.datastore.preferences.protobuf.ListFieldSchema.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static <E> androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> getProtobufList(java.lang.Object r0, long r1) {
                java.lang.Object r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r0, r1)
                androidx.datastore.preferences.protobuf.Internal$ProtobufList r0 = (androidx.datastore.preferences.protobuf.Internal.ProtobufList) r0
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        void makeImmutableListAt(java.lang.Object r1, long r2) {
                r0 = this;
                androidx.datastore.preferences.protobuf.Internal$ProtobufList r1 = getProtobufList(r1, r2)
                r1.makeImmutable()
                return
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        <E> void mergeListsAt(java.lang.Object r5, java.lang.Object r6, long r7) {
                r4 = this;
                androidx.datastore.preferences.protobuf.Internal$ProtobufList r0 = getProtobufList(r5, r7)
                androidx.datastore.preferences.protobuf.Internal$ProtobufList r6 = getProtobufList(r6, r7)
                int r1 = r0.size()
                int r2 = r6.size()
                if (r1 <= 0) goto L22
                if (r2 <= 0) goto L22
                boolean r3 = r0.isModifiable()
                if (r3 != 0) goto L1f
                int r2 = r2 + r1
                androidx.datastore.preferences.protobuf.Internal$ProtobufList r0 = r0.mutableCopyWithCapacity(r2)
            L1f:
                r0.addAll(r6)
            L22:
                if (r1 <= 0) goto L25
                r6 = r0
            L25:
                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r5, r7, r6)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        <L> java.util.List<L> mutableListAt(java.lang.Object r3, long r4) {
                r2 = this;
                androidx.datastore.preferences.protobuf.Internal$ProtobufList r0 = getProtobufList(r3, r4)
                boolean r1 = r0.isModifiable()
                if (r1 != 0) goto L1c
                int r1 = r0.size()
                if (r1 != 0) goto L13
                r1 = 10
                goto L15
            L13:
                int r1 = r1 * 2
            L15:
                androidx.datastore.preferences.protobuf.Internal$ProtobufList r0 = r0.mutableCopyWithCapacity(r1)
                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r3, r4, r0)
            L1c:
                return r0
        }
    }

    static {
            androidx.datastore.preferences.protobuf.ListFieldSchema$ListFieldSchemaFull r0 = new androidx.datastore.preferences.protobuf.ListFieldSchema$ListFieldSchemaFull
            r1 = 0
            r0.<init>(r1)
            androidx.datastore.preferences.protobuf.ListFieldSchema.FULL_INSTANCE = r0
            androidx.datastore.preferences.protobuf.ListFieldSchema$ListFieldSchemaLite r0 = new androidx.datastore.preferences.protobuf.ListFieldSchema$ListFieldSchemaLite
            r0.<init>(r1)
            androidx.datastore.preferences.protobuf.ListFieldSchema.LITE_INSTANCE = r0
            return
    }

    private ListFieldSchema() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ ListFieldSchema(androidx.datastore.preferences.protobuf.ListFieldSchema.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static androidx.datastore.preferences.protobuf.ListFieldSchema full() {
            androidx.datastore.preferences.protobuf.ListFieldSchema r0 = androidx.datastore.preferences.protobuf.ListFieldSchema.FULL_INSTANCE
            return r0
    }

    static androidx.datastore.preferences.protobuf.ListFieldSchema lite() {
            androidx.datastore.preferences.protobuf.ListFieldSchema r0 = androidx.datastore.preferences.protobuf.ListFieldSchema.LITE_INSTANCE
            return r0
    }

    abstract void makeImmutableListAt(java.lang.Object r1, long r2);

    abstract <L> void mergeListsAt(java.lang.Object r1, java.lang.Object r2, long r3);

    abstract <L> java.util.List<L> mutableListAt(java.lang.Object r1, long r2);
}
