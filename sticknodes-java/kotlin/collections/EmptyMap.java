package kotlin.collections;

/* compiled from: Maps.kt */
/* loaded from: classes2.dex */
final class EmptyMap implements java.util.Map, java.io.Serializable {
    public static final kotlin.collections.EmptyMap INSTANCE = null;

    static {
            kotlin.collections.EmptyMap r0 = new kotlin.collections.EmptyMap
            r0.<init>()
            kotlin.collections.EmptyMap.INSTANCE = r0
            return
    }

    private EmptyMap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Map
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Void
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Void r2 = (java.lang.Void) r2
            boolean r2 = r1.containsValue(r2)
            return r2
    }

    public boolean containsValue(java.lang.Void r2) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r2 = 0
            return r2
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.getEntries()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto Le
            java.util.Map r2 = (java.util.Map) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.Map
    public java.lang.Void get(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.util.Set<java.util.Map.Entry> getEntries() {
            r1 = this;
            kotlin.collections.EmptySet r0 = kotlin.collections.EmptySet.INSTANCE
            return r0
    }

    public java.util.Set<java.lang.Object> getKeys() {
            r1 = this;
            kotlin.collections.EmptySet r0 = kotlin.collections.EmptySet.INSTANCE
            return r0
    }

    public int getSize() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.Collection getValues() {
            r1 = this;
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            return r0
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.lang.Object> keySet() {
            r1 = this;
            java.util.Set r0 = r1.getKeys()
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public void putAll(java.util.Map r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = r0.remove(r1)
            return r1
    }

    @Override // java.util.Map
    public java.lang.Void remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "{}"
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
            r1 = this;
            java.util.Collection r0 = r1.getValues()
            return r0
    }
}
