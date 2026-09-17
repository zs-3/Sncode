package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public interface Parser<MessageType> {
    MessageType parseFrom(androidx.datastore.preferences.protobuf.ByteString r1, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(androidx.datastore.preferences.protobuf.CodedInputStream r1, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
}
