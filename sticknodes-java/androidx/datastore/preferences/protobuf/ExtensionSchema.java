package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;

/* loaded from: classes.dex */
abstract class ExtensionSchema<T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> {
    ExtensionSchema() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract int extensionNumber(java.util.Map.Entry<?, ?> r1);

    abstract java.lang.Object findExtensionByNumber(androidx.datastore.preferences.protobuf.ExtensionRegistryLite r1, androidx.datastore.preferences.protobuf.MessageLite r2, int r3);

    abstract androidx.datastore.preferences.protobuf.FieldSet<T> getExtensions(java.lang.Object r1);

    abstract androidx.datastore.preferences.protobuf.FieldSet<T> getMutableExtensions(java.lang.Object r1);

    abstract boolean hasExtensions(androidx.datastore.preferences.protobuf.MessageLite r1);

    abstract void makeImmutable(java.lang.Object r1);

    abstract <UT, UB> UB parseExtension(androidx.datastore.preferences.protobuf.Reader r1, java.lang.Object r2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3, androidx.datastore.preferences.protobuf.FieldSet<T> r4, UB r5, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r6) throws java.io.IOException;

    abstract void parseLengthPrefixedMessageSetItem(androidx.datastore.preferences.protobuf.Reader r1, java.lang.Object r2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3, androidx.datastore.preferences.protobuf.FieldSet<T> r4) throws java.io.IOException;

    abstract void parseMessageSetItem(androidx.datastore.preferences.protobuf.ByteString r1, java.lang.Object r2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3, androidx.datastore.preferences.protobuf.FieldSet<T> r4) throws java.io.IOException;

    abstract void serializeExtension(androidx.datastore.preferences.protobuf.Writer r1, java.util.Map.Entry<?, ?> r2) throws java.io.IOException;
}
