package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class LazyStringArrayList extends androidx.datastore.preferences.protobuf.AbstractProtobufList<java.lang.String> implements androidx.datastore.preferences.protobuf.LazyStringList, java.util.RandomAccess {
    public static final androidx.datastore.preferences.protobuf.LazyStringList EMPTY = null;
    private static final androidx.datastore.preferences.protobuf.LazyStringArrayList EMPTY_LIST = null;
    private final java.util.List<java.lang.Object> list;

    static {
            androidx.datastore.preferences.protobuf.LazyStringArrayList r0 = new androidx.datastore.preferences.protobuf.LazyStringArrayList
            r0.<init>()
            androidx.datastore.preferences.protobuf.LazyStringArrayList.EMPTY_LIST = r0
            r0.makeImmutable()
            androidx.datastore.preferences.protobuf.LazyStringArrayList.EMPTY = r0
            return
    }

    public LazyStringArrayList() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public LazyStringArrayList(int r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    private LazyStringArrayList(java.util.ArrayList<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.list = r1
            return
    }

    private static java.lang.String asString(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L7
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L7:
            boolean r0 = r1 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r0 == 0) goto L12
            androidx.datastore.preferences.protobuf.ByteString r1 = (androidx.datastore.preferences.protobuf.ByteString) r1
            java.lang.String r1 = r1.toStringUtf8()
            return r1
        L12:
            byte[] r1 = (byte[]) r1
            java.lang.String r1 = androidx.datastore.preferences.protobuf.Internal.toStringUtf8(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r1, r2)
            return
    }

    public void add(int r2, java.lang.String r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2, r3)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(androidx.datastore.preferences.protobuf.ByteString r2) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int r2, java.util.Collection<? extends java.lang.String> r3) {
            r1 = this;
            r1.ensureIsMutable()
            boolean r0 = r3 instanceof androidx.datastore.preferences.protobuf.LazyStringList
            if (r0 == 0) goto Ld
            androidx.datastore.preferences.protobuf.LazyStringList r3 = (androidx.datastore.preferences.protobuf.LazyStringList) r3
            java.util.List r3 = r3.getUnderlyingElements()
        Ld:
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r2 = r0.addAll(r2, r3)
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
            return r2
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.String> r2) {
            r1 = this;
            int r0 = r1.size()
            boolean r2 = r1.addAll(r0, r2)
            return r2
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.clear()
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.String r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int r3) {
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.list
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld:
            boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r1 == 0) goto L23
            androidx.datastore.preferences.protobuf.ByteString r0 = (androidx.datastore.preferences.protobuf.ByteString) r0
            java.lang.String r1 = r0.toStringUtf8()
            boolean r0 = r0.isValidUtf8()
            if (r0 == 0) goto L22
            java.util.List<java.lang.Object> r0 = r2.list
            r0.set(r3, r1)
        L22:
            return r1
        L23:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = androidx.datastore.preferences.protobuf.Internal.toStringUtf8(r0)
            boolean r0 = androidx.datastore.preferences.protobuf.Internal.isValidUtf8(r0)
            if (r0 == 0) goto L34
            java.util.List<java.lang.Object> r0 = r2.list
            r0.set(r3, r1)
        L34:
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public java.lang.Object getRaw(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public androidx.datastore.preferences.protobuf.LazyStringList getUnmodifiableView() {
            r1 = this;
            boolean r0 = r1.isModifiable()
            if (r0 == 0) goto Lc
            androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList r0 = new androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList
            r0.<init>(r1)
            return r0
        Lc:
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
            r1 = this;
            boolean r0 = super.isModifiable()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.Internal.ProtobufList mutableCopyWithCapacity(int r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.LazyStringArrayList r1 = r0.mutableCopyWithCapacity(r1)
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public androidx.datastore.preferences.protobuf.LazyStringArrayList mutableCopyWithCapacity(int r2) {
            r1 = this;
            int r0 = r1.size()
            if (r2 < r0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.util.List<java.lang.Object> r2 = r1.list
            r0.addAll(r2)
            androidx.datastore.preferences.protobuf.LazyStringArrayList r2 = new androidx.datastore.preferences.protobuf.LazyStringArrayList
            r2.<init>(r0)
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.String r1 = r0.remove(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String remove(int r2) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r2 = r0.remove(r2)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            java.lang.String r2 = asString(r2)
            return r2
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.removeAll(r1)
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.retainAll(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = r0.set(r1, r2)
            return r1
    }

    public java.lang.String set(int r2, java.lang.String r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r2 = r0.set(r2, r3)
            java.lang.String r2 = asString(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            int r0 = r0.size()
            return r0
    }
}
