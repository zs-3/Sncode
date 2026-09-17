package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class StructuralMessageInfo implements androidx.datastore.preferences.protobuf.MessageInfo {
    private final int[] checkInitialized;
    private final androidx.datastore.preferences.protobuf.MessageLite defaultInstance;
    private final androidx.datastore.preferences.protobuf.FieldInfo[] fields;
    private final boolean messageSetWireFormat;
    private final androidx.datastore.preferences.protobuf.ProtoSyntax syntax;

    public int[] getCheckInitialized() {
            r1 = this;
            int[] r0 = r1.checkInitialized
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public androidx.datastore.preferences.protobuf.MessageLite getDefaultInstance() {
            r1 = this;
            androidx.datastore.preferences.protobuf.MessageLite r0 = r1.defaultInstance
            return r0
    }

    public androidx.datastore.preferences.protobuf.FieldInfo[] getFields() {
            r1 = this;
            androidx.datastore.preferences.protobuf.FieldInfo[] r0 = r1.fields
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public androidx.datastore.preferences.protobuf.ProtoSyntax getSyntax() {
            r1 = this;
            androidx.datastore.preferences.protobuf.ProtoSyntax r0 = r1.syntax
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
            r1 = this;
            boolean r0 = r1.messageSetWireFormat
            return r0
    }
}
