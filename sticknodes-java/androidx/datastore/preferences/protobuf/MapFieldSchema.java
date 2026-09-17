package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
interface MapFieldSchema {
    java.util.Map<?, ?> forMapData(java.lang.Object r1);

    androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<?, ?> forMapMetadata(java.lang.Object r1);

    java.util.Map<?, ?> forMutableMapData(java.lang.Object r1);

    int getSerializedSize(int r1, java.lang.Object r2, java.lang.Object r3);

    boolean isImmutable(java.lang.Object r1);

    java.lang.Object mergeFrom(java.lang.Object r1, java.lang.Object r2);

    java.lang.Object newMapField(java.lang.Object r1);

    java.lang.Object toImmutable(java.lang.Object r1);
}
