package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
interface Schema<T> {
    boolean equals(T r1, T r2);

    int getSerializedSize(T r1);

    int hashCode(T r1);

    boolean isInitialized(T r1);

    void makeImmutable(T r1);

    void mergeFrom(T r1, androidx.datastore.preferences.protobuf.Reader r2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3) throws java.io.IOException;

    void mergeFrom(T r1, T r2);

    T newInstance();

    void writeTo(T r1, androidx.datastore.preferences.protobuf.Writer r2) throws java.io.IOException;
}
