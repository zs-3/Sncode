package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class Internal {
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    public static final java.nio.ByteBuffer EMPTY_BYTE_BUFFER = null;
    public static final androidx.datastore.preferences.protobuf.CodedInputStream EMPTY_CODED_INPUT_STREAM = null;
    static final java.nio.charset.Charset ISO_8859_1 = null;
    static final java.nio.charset.Charset UTF_8 = null;

    public interface BooleanList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Boolean> {
    }

    public interface DoubleList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Double> {
    }

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends androidx.datastore.preferences.protobuf.Internal.EnumLite> {
        T findValueByNumber(int r1);
    }

    public interface EnumVerifier {
        boolean isInRange(int r1);
    }

    public interface FloatList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Float> {
    }

    public interface IntList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Integer> {
    }

    public interface LongList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Long> {
    }

    public interface ProtobufList<E> extends java.util.List<E>, java.util.RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> mutableCopyWithCapacity(int r1);
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            androidx.datastore.preferences.protobuf.Internal.UTF_8 = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            androidx.datastore.preferences.protobuf.Internal.ISO_8859_1 = r0
            r0 = 0
            byte[] r0 = new byte[r0]
            androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY = r0
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
            androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER = r1
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(r0)
            androidx.datastore.preferences.protobuf.Internal.EMPTY_CODED_INPUT_STREAM = r0
            return
    }

    static <T> T checkNotNull(T r0) {
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    static <T> T checkNotNull(T r0, java.lang.String r1) {
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }

    public static int hashBoolean(boolean r0) {
            if (r0 == 0) goto L5
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L7
        L5:
            r0 = 1237(0x4d5, float:1.733E-42)
        L7:
            return r0
    }

    public static int hashCode(byte[] r2) {
            int r0 = r2.length
            r1 = 0
            int r2 = hashCode(r2, r1, r0)
            return r2
    }

    static int hashCode(byte[] r0, int r1, int r2) {
            int r0 = partialHash(r2, r0, r1, r2)
            if (r0 != 0) goto L7
            r0 = 1
        L7:
            return r0
    }

    public static int hashLong(long r2) {
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r3 = (int) r2
            return r3
    }

    public static boolean isValidUtf8(byte[] r0) {
            boolean r0 = androidx.datastore.preferences.protobuf.Utf8.isValidUtf8(r0)
            return r0
    }

    static java.lang.Object mergeMessage(java.lang.Object r0, java.lang.Object r1) {
            androidx.datastore.preferences.protobuf.MessageLite r0 = (androidx.datastore.preferences.protobuf.MessageLite) r0
            androidx.datastore.preferences.protobuf.MessageLite$Builder r0 = r0.toBuilder()
            androidx.datastore.preferences.protobuf.MessageLite r1 = (androidx.datastore.preferences.protobuf.MessageLite) r1
            androidx.datastore.preferences.protobuf.MessageLite$Builder r0 = r0.mergeFrom(r1)
            androidx.datastore.preferences.protobuf.MessageLite r0 = r0.buildPartial()
            return r0
    }

    static int partialHash(int r2, byte[] r3, int r4, int r5) {
            r0 = r4
        L1:
            int r1 = r4 + r5
            if (r0 >= r1) goto Ld
            int r2 = r2 * 31
            r1 = r3[r0]
            int r2 = r2 + r1
            int r0 = r0 + 1
            goto L1
        Ld:
            return r2
    }

    public static java.lang.String toStringUtf8(byte[] r2) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = androidx.datastore.preferences.protobuf.Internal.UTF_8
            r0.<init>(r2, r1)
            return r0
    }
}
