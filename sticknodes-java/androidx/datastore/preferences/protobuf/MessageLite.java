package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public interface MessageLite extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {

    public interface Builder extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder, java.lang.Cloneable {
        androidx.datastore.preferences.protobuf.MessageLite build();

        androidx.datastore.preferences.protobuf.MessageLite buildPartial();

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(androidx.datastore.preferences.protobuf.MessageLite r1);
    }

    androidx.datastore.preferences.protobuf.Parser<? extends androidx.datastore.preferences.protobuf.MessageLite> getParserForType();

    int getSerializedSize();

    androidx.datastore.preferences.protobuf.MessageLite.Builder newBuilderForType();

    androidx.datastore.preferences.protobuf.MessageLite.Builder toBuilder();

    androidx.datastore.preferences.protobuf.ByteString toByteString();

    void writeTo(androidx.datastore.preferences.protobuf.CodedOutputStream r1) throws java.io.IOException;
}
