package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
interface Writer {

    public enum FieldOrder extends java.lang.Enum<androidx.datastore.preferences.protobuf.Writer.FieldOrder> {
        private static final /* synthetic */ androidx.datastore.preferences.protobuf.Writer.FieldOrder[] $VALUES = null;
        public static final androidx.datastore.preferences.protobuf.Writer.FieldOrder ASCENDING = null;
        public static final androidx.datastore.preferences.protobuf.Writer.FieldOrder DESCENDING = null;

        static {
                androidx.datastore.preferences.protobuf.Writer$FieldOrder r0 = new androidx.datastore.preferences.protobuf.Writer$FieldOrder
                java.lang.String r1 = "ASCENDING"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.datastore.preferences.protobuf.Writer.FieldOrder.ASCENDING = r0
                androidx.datastore.preferences.protobuf.Writer$FieldOrder r1 = new androidx.datastore.preferences.protobuf.Writer$FieldOrder
                java.lang.String r3 = "DESCENDING"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.datastore.preferences.protobuf.Writer.FieldOrder.DESCENDING = r1
                r3 = 2
                androidx.datastore.preferences.protobuf.Writer$FieldOrder[] r3 = new androidx.datastore.preferences.protobuf.Writer.FieldOrder[r3]
                r3[r2] = r0
                r3[r4] = r1
                androidx.datastore.preferences.protobuf.Writer.FieldOrder.$VALUES = r3
                return
        }

        FieldOrder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.datastore.preferences.protobuf.Writer.FieldOrder valueOf(java.lang.String r1) {
                java.lang.Class<androidx.datastore.preferences.protobuf.Writer$FieldOrder> r0 = androidx.datastore.preferences.protobuf.Writer.FieldOrder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.datastore.preferences.protobuf.Writer$FieldOrder r1 = (androidx.datastore.preferences.protobuf.Writer.FieldOrder) r1
                return r1
        }

        public static androidx.datastore.preferences.protobuf.Writer.FieldOrder[] values() {
                androidx.datastore.preferences.protobuf.Writer$FieldOrder[] r0 = androidx.datastore.preferences.protobuf.Writer.FieldOrder.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.datastore.preferences.protobuf.Writer$FieldOrder[] r0 = (androidx.datastore.preferences.protobuf.Writer.FieldOrder[]) r0
                return r0
        }
    }

    androidx.datastore.preferences.protobuf.Writer.FieldOrder fieldOrder();

    void writeBool(int r1, boolean r2) throws java.io.IOException;

    void writeBoolList(int r1, java.util.List<java.lang.Boolean> r2, boolean r3) throws java.io.IOException;

    void writeBytes(int r1, androidx.datastore.preferences.protobuf.ByteString r2) throws java.io.IOException;

    void writeBytesList(int r1, java.util.List<androidx.datastore.preferences.protobuf.ByteString> r2) throws java.io.IOException;

    void writeDouble(int r1, double r2) throws java.io.IOException;

    void writeDoubleList(int r1, java.util.List<java.lang.Double> r2, boolean r3) throws java.io.IOException;

    @java.lang.Deprecated
    void writeEndGroup(int r1) throws java.io.IOException;

    void writeEnum(int r1, int r2) throws java.io.IOException;

    void writeEnumList(int r1, java.util.List<java.lang.Integer> r2, boolean r3) throws java.io.IOException;

    void writeFixed32(int r1, int r2) throws java.io.IOException;

    void writeFixed32List(int r1, java.util.List<java.lang.Integer> r2, boolean r3) throws java.io.IOException;

    void writeFixed64(int r1, long r2) throws java.io.IOException;

    void writeFixed64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) throws java.io.IOException;

    void writeFloat(int r1, float r2) throws java.io.IOException;

    void writeFloatList(int r1, java.util.List<java.lang.Float> r2, boolean r3) throws java.io.IOException;

    @java.lang.Deprecated
    void writeGroup(int r1, java.lang.Object r2, androidx.datastore.preferences.protobuf.Schema r3) throws java.io.IOException;

    @java.lang.Deprecated
    void writeGroupList(int r1, java.util.List<?> r2, androidx.datastore.preferences.protobuf.Schema r3) throws java.io.IOException;

    void writeInt32(int r1, int r2) throws java.io.IOException;

    void writeInt32List(int r1, java.util.List<java.lang.Integer> r2, boolean r3) throws java.io.IOException;

    void writeInt64(int r1, long r2) throws java.io.IOException;

    void writeInt64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) throws java.io.IOException;

    <K, V> void writeMap(int r1, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> r2, java.util.Map<K, V> r3) throws java.io.IOException;

    void writeMessage(int r1, java.lang.Object r2, androidx.datastore.preferences.protobuf.Schema r3) throws java.io.IOException;

    void writeMessageList(int r1, java.util.List<?> r2, androidx.datastore.preferences.protobuf.Schema r3) throws java.io.IOException;

    void writeMessageSetItem(int r1, java.lang.Object r2) throws java.io.IOException;

    void writeSFixed32(int r1, int r2) throws java.io.IOException;

    void writeSFixed32List(int r1, java.util.List<java.lang.Integer> r2, boolean r3) throws java.io.IOException;

    void writeSFixed64(int r1, long r2) throws java.io.IOException;

    void writeSFixed64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) throws java.io.IOException;

    void writeSInt32(int r1, int r2) throws java.io.IOException;

    void writeSInt32List(int r1, java.util.List<java.lang.Integer> r2, boolean r3) throws java.io.IOException;

    void writeSInt64(int r1, long r2) throws java.io.IOException;

    void writeSInt64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) throws java.io.IOException;

    @java.lang.Deprecated
    void writeStartGroup(int r1) throws java.io.IOException;

    void writeString(int r1, java.lang.String r2) throws java.io.IOException;

    void writeStringList(int r1, java.util.List<java.lang.String> r2) throws java.io.IOException;

    void writeUInt32(int r1, int r2) throws java.io.IOException;

    void writeUInt32List(int r1, java.util.List<java.lang.Integer> r2, boolean r3) throws java.io.IOException;

    void writeUInt64(int r1, long r2) throws java.io.IOException;

    void writeUInt64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) throws java.io.IOException;
}
