package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class UnmodifiableLazyStringList extends java.util.AbstractList<java.lang.String> implements androidx.datastore.preferences.protobuf.LazyStringList, java.util.RandomAccess {
    private final androidx.datastore.preferences.protobuf.LazyStringList list;



    public UnmodifiableLazyStringList(androidx.datastore.preferences.protobuf.LazyStringList r1) {
            r0 = this;
            r0.<init>()
            r0.list = r1
            return
    }

    static /* synthetic */ androidx.datastore.preferences.protobuf.LazyStringList access$000(androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList r0) {
            androidx.datastore.preferences.protobuf.LazyStringList r0 = r0.list
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(androidx.datastore.preferences.protobuf.ByteString r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.String r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int r2) {
            r1 = this;
            androidx.datastore.preferences.protobuf.LazyStringList r0 = r1.list
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public java.lang.Object getRaw(int r2) {
            r1 = this;
            androidx.datastore.preferences.protobuf.LazyStringList r0 = r1.list
            java.lang.Object r2 = r0.getRaw(r2)
            return r2
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
            r1 = this;
            androidx.datastore.preferences.protobuf.LazyStringList r0 = r1.list
            java.util.List r0 = r0.getUnderlyingElements()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public androidx.datastore.preferences.protobuf.LazyStringList getUnmodifiableView() {
            r0 = this;
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList$2 r0 = new androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList$2
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<java.lang.String> listIterator(int r2) {
            r1 = this;
            androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList$1 r0 = new androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList$1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            androidx.datastore.preferences.protobuf.LazyStringList r0 = r1.list
            int r0 = r0.size()
            return r0
    }
}
