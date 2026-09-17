package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class LazyFieldLite {
    private static final androidx.datastore.preferences.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = null;
    private androidx.datastore.preferences.protobuf.ByteString delayedBytes;
    private androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry;
    private volatile androidx.datastore.preferences.protobuf.ByteString memoizedBytes;
    protected volatile androidx.datastore.preferences.protobuf.MessageLite value;

    static {
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r0 = androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            androidx.datastore.preferences.protobuf.LazyFieldLite.EMPTY_REGISTRY = r0
            return
    }

    public LazyFieldLite() {
            r0 = this;
            r0.<init>()
            return
    }

    protected void ensureInitialized(androidx.datastore.preferences.protobuf.MessageLite r4) {
            r3 = this;
            androidx.datastore.preferences.protobuf.MessageLite r0 = r3.value
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r3)
            androidx.datastore.preferences.protobuf.MessageLite r0 = r3.value     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto Lc
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            return
        Lc:
            androidx.datastore.preferences.protobuf.ByteString r0 = r3.delayedBytes     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            if (r0 == 0) goto L25
            androidx.datastore.preferences.protobuf.Parser r0 = r4.getParserForType()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            androidx.datastore.preferences.protobuf.ByteString r1 = r3.delayedBytes     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r2 = r3.extensionRegistry     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            java.lang.Object r0 = r0.parseFrom(r1, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            androidx.datastore.preferences.protobuf.MessageLite r0 = (androidx.datastore.preferences.protobuf.MessageLite) r0     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            r3.value = r0     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            androidx.datastore.preferences.protobuf.ByteString r0 = r3.delayedBytes     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            r3.memoizedBytes = r0     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            goto L32
        L25:
            r3.value = r4     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.EMPTY     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            r3.memoizedBytes = r0     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> L2c java.lang.Throwable -> L34
            goto L32
        L2c:
            r3.value = r4     // Catch: java.lang.Throwable -> L34
            androidx.datastore.preferences.protobuf.ByteString r4 = androidx.datastore.preferences.protobuf.ByteString.EMPTY     // Catch: java.lang.Throwable -> L34
            r3.memoizedBytes = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r4
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof androidx.datastore.preferences.protobuf.LazyFieldLite
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            androidx.datastore.preferences.protobuf.LazyFieldLite r3 = (androidx.datastore.preferences.protobuf.LazyFieldLite) r3
            androidx.datastore.preferences.protobuf.MessageLite r0 = r2.value
            androidx.datastore.preferences.protobuf.MessageLite r1 = r3.value
            if (r0 != 0) goto L21
            if (r1 != 0) goto L21
            androidx.datastore.preferences.protobuf.ByteString r0 = r2.toByteString()
            androidx.datastore.preferences.protobuf.ByteString r3 = r3.toByteString()
            boolean r3 = r0.equals(r3)
            return r3
        L21:
            if (r0 == 0) goto L2a
            if (r1 == 0) goto L2a
            boolean r3 = r0.equals(r1)
            return r3
        L2a:
            if (r0 == 0) goto L39
            androidx.datastore.preferences.protobuf.MessageLite r1 = r0.getDefaultInstanceForType()
            androidx.datastore.preferences.protobuf.MessageLite r3 = r3.getValue(r1)
            boolean r3 = r0.equals(r3)
            return r3
        L39:
            androidx.datastore.preferences.protobuf.MessageLite r3 = r1.getDefaultInstanceForType()
            androidx.datastore.preferences.protobuf.MessageLite r3 = r2.getValue(r3)
            boolean r3 = r3.equals(r1)
            return r3
    }

    public int getSerializedSize() {
            r1 = this;
            androidx.datastore.preferences.protobuf.ByteString r0 = r1.memoizedBytes
            if (r0 == 0) goto Lb
            androidx.datastore.preferences.protobuf.ByteString r0 = r1.memoizedBytes
            int r0 = r0.size()
            return r0
        Lb:
            androidx.datastore.preferences.protobuf.ByteString r0 = r1.delayedBytes
            if (r0 == 0) goto L14
            int r0 = r0.size()
            return r0
        L14:
            androidx.datastore.preferences.protobuf.MessageLite r0 = r1.value
            if (r0 == 0) goto L1f
            androidx.datastore.preferences.protobuf.MessageLite r0 = r1.value
            int r0 = r0.getSerializedSize()
            return r0
        L1f:
            r0 = 0
            return r0
    }

    public androidx.datastore.preferences.protobuf.MessageLite getValue(androidx.datastore.preferences.protobuf.MessageLite r1) {
            r0 = this;
            r0.ensureInitialized(r1)
            androidx.datastore.preferences.protobuf.MessageLite r1 = r0.value
            return r1
    }

    public int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }

    public androidx.datastore.preferences.protobuf.MessageLite setValue(androidx.datastore.preferences.protobuf.MessageLite r3) {
            r2 = this;
            androidx.datastore.preferences.protobuf.MessageLite r0 = r2.value
            r1 = 0
            r2.delayedBytes = r1
            r2.memoizedBytes = r1
            r2.value = r3
            return r0
    }

    public androidx.datastore.preferences.protobuf.ByteString toByteString() {
            r1 = this;
            androidx.datastore.preferences.protobuf.ByteString r0 = r1.memoizedBytes
            if (r0 == 0) goto L7
            androidx.datastore.preferences.protobuf.ByteString r0 = r1.memoizedBytes
            return r0
        L7:
            androidx.datastore.preferences.protobuf.ByteString r0 = r1.delayedBytes
            if (r0 == 0) goto Lc
            return r0
        Lc:
            monitor-enter(r1)
            androidx.datastore.preferences.protobuf.ByteString r0 = r1.memoizedBytes     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L15
            androidx.datastore.preferences.protobuf.ByteString r0 = r1.memoizedBytes     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            return r0
        L15:
            androidx.datastore.preferences.protobuf.MessageLite r0 = r1.value     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L1e
            androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.EMPTY     // Catch: java.lang.Throwable -> L2a
            r1.memoizedBytes = r0     // Catch: java.lang.Throwable -> L2a
            goto L26
        L1e:
            androidx.datastore.preferences.protobuf.MessageLite r0 = r1.value     // Catch: java.lang.Throwable -> L2a
            androidx.datastore.preferences.protobuf.ByteString r0 = r0.toByteString()     // Catch: java.lang.Throwable -> L2a
            r1.memoizedBytes = r0     // Catch: java.lang.Throwable -> L2a
        L26:
            androidx.datastore.preferences.protobuf.ByteString r0 = r1.memoizedBytes     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            return r0
        L2a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r0
    }
}
