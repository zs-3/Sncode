package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class MapEntryLite<K, V> {
    private final K key;
    private final androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata;
    private final V value;

    static class Metadata<K, V> {
        public final K defaultKey;
        public final V defaultValue;
        public final androidx.datastore.preferences.protobuf.WireFormat.FieldType keyType;
        public final androidx.datastore.preferences.protobuf.WireFormat.FieldType valueType;

        public Metadata(androidx.datastore.preferences.protobuf.WireFormat.FieldType r1, K r2, androidx.datastore.preferences.protobuf.WireFormat.FieldType r3, V r4) {
                r0 = this;
                r0.<init>()
                r0.keyType = r1
                r0.defaultKey = r2
                r0.valueType = r3
                r0.defaultValue = r4
                return
        }
    }

    private MapEntryLite(androidx.datastore.preferences.protobuf.WireFormat.FieldType r2, K r3, androidx.datastore.preferences.protobuf.WireFormat.FieldType r4, V r5) {
            r1 = this;
            r1.<init>()
            androidx.datastore.preferences.protobuf.MapEntryLite$Metadata r0 = new androidx.datastore.preferences.protobuf.MapEntryLite$Metadata
            r0.<init>(r2, r3, r4, r5)
            r1.metadata = r0
            r1.key = r3
            r1.value = r5
            return
    }

    static <K, V> int computeSerializedSize(androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> r2, K r3, V r4) {
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = r2.keyType
            r1 = 1
            int r3 = androidx.datastore.preferences.protobuf.FieldSet.computeElementSize(r0, r1, r3)
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r2 = r2.valueType
            r0 = 2
            int r2 = androidx.datastore.preferences.protobuf.FieldSet.computeElementSize(r2, r0, r4)
            int r3 = r3 + r2
            return r3
    }

    public static <K, V> androidx.datastore.preferences.protobuf.MapEntryLite<K, V> newDefaultInstance(androidx.datastore.preferences.protobuf.WireFormat.FieldType r1, K r2, androidx.datastore.preferences.protobuf.WireFormat.FieldType r3, V r4) {
            androidx.datastore.preferences.protobuf.MapEntryLite r0 = new androidx.datastore.preferences.protobuf.MapEntryLite
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    static <K, V> void writeTo(androidx.datastore.preferences.protobuf.CodedOutputStream r2, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> r3, K r4, V r5) throws java.io.IOException {
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = r3.keyType
            r1 = 1
            androidx.datastore.preferences.protobuf.FieldSet.writeElement(r2, r0, r1, r4)
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r3 = r3.valueType
            r4 = 2
            androidx.datastore.preferences.protobuf.FieldSet.writeElement(r2, r3, r4, r5)
            return
    }

    public int computeMessageSize(int r2, K r3, V r4) {
            r1 = this;
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r2)
            androidx.datastore.preferences.protobuf.MapEntryLite$Metadata<K, V> r0 = r1.metadata
            int r3 = computeSerializedSize(r0, r3, r4)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r3)
            int r2 = r2 + r3
            return r2
    }

    androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> getMetadata() {
            r1 = this;
            androidx.datastore.preferences.protobuf.MapEntryLite$Metadata<K, V> r0 = r1.metadata
            return r0
    }
}
