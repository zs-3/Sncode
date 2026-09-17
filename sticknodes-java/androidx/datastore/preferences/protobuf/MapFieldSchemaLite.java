package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
class MapFieldSchemaLite implements androidx.datastore.preferences.protobuf.MapFieldSchema {
    MapFieldSchemaLite() {
            r0 = this;
            r0.<init>()
            return
    }

    private static <K, V> int getSerializedSizeLite(int r3, java.lang.Object r4, java.lang.Object r5) {
            androidx.datastore.preferences.protobuf.MapFieldLite r4 = (androidx.datastore.preferences.protobuf.MapFieldLite) r4
            androidx.datastore.preferences.protobuf.MapEntryLite r5 = (androidx.datastore.preferences.protobuf.MapEntryLite) r5
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            int r0 = r5.computeMessageSize(r3, r2, r0)
            int r1 = r1 + r0
            goto L14
        L2e:
            return r1
    }

    private static <K, V> androidx.datastore.preferences.protobuf.MapFieldLite<K, V> mergeFromLite(java.lang.Object r1, java.lang.Object r2) {
            androidx.datastore.preferences.protobuf.MapFieldLite r1 = (androidx.datastore.preferences.protobuf.MapFieldLite) r1
            androidx.datastore.preferences.protobuf.MapFieldLite r2 = (androidx.datastore.preferences.protobuf.MapFieldLite) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L17
            boolean r0 = r1.isMutable()
            if (r0 != 0) goto L14
            androidx.datastore.preferences.protobuf.MapFieldLite r1 = r1.mutableCopy()
        L14:
            r1.mergeFrom(r2)
        L17:
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public java.util.Map<?, ?> forMapData(java.lang.Object r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.MapFieldLite r1 = (androidx.datastore.preferences.protobuf.MapFieldLite) r1
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<?, ?> forMapMetadata(java.lang.Object r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.MapEntryLite r1 = (androidx.datastore.preferences.protobuf.MapEntryLite) r1
            androidx.datastore.preferences.protobuf.MapEntryLite$Metadata r1 = r1.getMetadata()
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public java.util.Map<?, ?> forMutableMapData(java.lang.Object r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.MapFieldLite r1 = (androidx.datastore.preferences.protobuf.MapFieldLite) r1
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public int getSerializedSize(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            int r1 = getSerializedSizeLite(r1, r2, r3)
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public boolean isImmutable(java.lang.Object r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.MapFieldLite r1 = (androidx.datastore.preferences.protobuf.MapFieldLite) r1
            boolean r1 = r1.isMutable()
            r1 = r1 ^ 1
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public java.lang.Object mergeFrom(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            androidx.datastore.preferences.protobuf.MapFieldLite r1 = mergeFromLite(r1, r2)
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public java.lang.Object newMapField(java.lang.Object r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.MapFieldLite r1 = androidx.datastore.preferences.protobuf.MapFieldLite.emptyMapField()
            androidx.datastore.preferences.protobuf.MapFieldLite r1 = r1.mutableCopy()
            return r1
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public java.lang.Object toImmutable(java.lang.Object r2) {
            r1 = this;
            r0 = r2
            androidx.datastore.preferences.protobuf.MapFieldLite r0 = (androidx.datastore.preferences.protobuf.MapFieldLite) r0
            r0.makeImmutable()
            return r2
    }
}
