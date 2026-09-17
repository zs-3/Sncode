package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public interface LazyStringList extends java.util.List {
    void add(androidx.datastore.preferences.protobuf.ByteString r1);

    java.lang.Object getRaw(int r1);

    java.util.List<?> getUnderlyingElements();

    androidx.datastore.preferences.protobuf.LazyStringList getUnmodifiableView();
}
