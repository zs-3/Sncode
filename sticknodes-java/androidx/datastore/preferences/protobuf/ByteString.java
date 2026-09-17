package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class ByteString implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {
    public static final androidx.datastore.preferences.protobuf.ByteString EMPTY = null;
    private static final java.util.Comparator<androidx.datastore.preferences.protobuf.ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = null;
    private static final androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier byteArrayCopier = null;
    private int hash;



    static abstract class AbstractByteIterator implements androidx.datastore.preferences.protobuf.ByteString.ByteIterator {
        AbstractByteIterator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final java.lang.Byte next() {
                r1 = this;
                byte r0 = r1.nextByte()
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Byte next() {
                r1 = this;
                java.lang.Byte r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public final void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    private static final class ArraysByteArrayCopier implements androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier {
        private ArraysByteArrayCopier() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ ArraysByteArrayCopier(androidx.datastore.preferences.protobuf.ByteString.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] r1, int r2, int r3) {
                r0 = this;
                int r3 = r3 + r2
                byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
                return r1
        }
    }

    private static final class BoundedByteString extends androidx.datastore.preferences.protobuf.ByteString.LiteralByteString {
        private final int bytesLength;
        private final int bytesOffset;

        BoundedByteString(byte[] r2, int r3, int r4) {
                r1 = this;
                r1.<init>(r2)
                int r0 = r3 + r4
                int r2 = r2.length
                androidx.datastore.preferences.protobuf.ByteString.checkRange(r3, r0, r2)
                r1.bytesOffset = r3
                r1.bytesLength = r4
                return
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int r3) {
                r2 = this;
                int r0 = r2.size()
                androidx.datastore.preferences.protobuf.ByteString.checkIndex(r3, r0)
                byte[] r0 = r2.bytes
                int r1 = r2.bytesOffset
                int r1 = r1 + r3
                r3 = r0[r1]
                return r3
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        protected void copyToInternal(byte[] r3, int r4, int r5, int r6) {
                r2 = this;
                byte[] r0 = r2.bytes
                int r1 = r2.getOffsetIntoBytes()
                int r1 = r1 + r4
                java.lang.System.arraycopy(r0, r1, r3, r5, r6)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        protected int getOffsetIntoBytes() {
                r1 = this;
                int r0 = r1.bytesOffset
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        byte internalByteAt(int r3) {
                r2 = this;
                byte[] r0 = r2.bytes
                int r1 = r2.bytesOffset
                int r1 = r1 + r3
                r3 = r0[r1]
                return r3
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public int size() {
                r1 = this;
                int r0 = r1.bytesLength
                return r0
        }
    }

    private interface ByteArrayCopier {
        byte[] copyFrom(byte[] r1, int r2, int r3);
    }

    public interface ByteIterator extends java.util.Iterator<java.lang.Byte> {
        byte nextByte();
    }

    static final class CodedBuilder {
        private final byte[] buffer;
        private final androidx.datastore.preferences.protobuf.CodedOutputStream output;

        private CodedBuilder(int r1) {
                r0 = this;
                r0.<init>()
                byte[] r1 = new byte[r1]
                r0.buffer = r1
                androidx.datastore.preferences.protobuf.CodedOutputStream r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.newInstance(r1)
                r0.output = r1
                return
        }

        /* synthetic */ CodedBuilder(int r1, androidx.datastore.preferences.protobuf.ByteString.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public androidx.datastore.preferences.protobuf.ByteString build() {
                r2 = this;
                androidx.datastore.preferences.protobuf.CodedOutputStream r0 = r2.output
                r0.checkNoSpaceLeft()
                androidx.datastore.preferences.protobuf.ByteString$LiteralByteString r0 = new androidx.datastore.preferences.protobuf.ByteString$LiteralByteString
                byte[] r1 = r2.buffer
                r0.<init>(r1)
                return r0
        }

        public androidx.datastore.preferences.protobuf.CodedOutputStream getCodedOutput() {
                r1 = this;
                androidx.datastore.preferences.protobuf.CodedOutputStream r0 = r1.output
                return r0
        }
    }

    static abstract class LeafByteString extends androidx.datastore.preferences.protobuf.ByteString {
        LeafByteString() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
                r1 = this;
                androidx.datastore.preferences.protobuf.ByteString$ByteIterator r0 = super.iterator()
                return r0
        }
    }

    private static class LiteralByteString extends androidx.datastore.preferences.protobuf.ByteString.LeafByteString {
        protected final byte[] bytes;

        LiteralByteString(byte[] r1) {
                r0 = this;
                r0.<init>()
                java.util.Objects.requireNonNull(r1)
                r0.bytes = r1
                return
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int r2) {
                r1 = this;
                byte[] r0 = r1.bytes
                r2 = r0[r2]
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected void copyToInternal(byte[] r2, int r3, int r4, int r5) {
                r1 = this;
                byte[] r0 = r1.bytes
                java.lang.System.arraycopy(r0, r3, r2, r4, r5)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.datastore.preferences.protobuf.ByteString
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                int r1 = r4.size()
                r3 = r5
                androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
                int r3 = r3.size()
                if (r1 == r3) goto L18
                return r2
            L18:
                int r1 = r4.size()
                if (r1 != 0) goto L1f
                return r0
            L1f:
                boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
                if (r0 == 0) goto L3d
                androidx.datastore.preferences.protobuf.ByteString$LiteralByteString r5 = (androidx.datastore.preferences.protobuf.ByteString.LiteralByteString) r5
                int r0 = r4.peekCachedHashCode()
                int r1 = r5.peekCachedHashCode()
                if (r0 == 0) goto L34
                if (r1 == 0) goto L34
                if (r0 == r1) goto L34
                return r2
            L34:
                int r0 = r4.size()
                boolean r5 = r4.equalsRange(r5, r2, r0)
                return r5
            L3d:
                boolean r5 = r5.equals(r4)
                return r5
        }

        final boolean equalsRange(androidx.datastore.preferences.protobuf.ByteString r6, int r7, int r8) {
                r5 = this;
                int r0 = r6.size()
                if (r8 > r0) goto L6d
                int r0 = r7 + r8
                int r1 = r6.size()
                if (r0 > r1) goto L44
                boolean r1 = r6 instanceof androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
                r2 = 0
                if (r1 == 0) goto L37
                androidx.datastore.preferences.protobuf.ByteString$LiteralByteString r6 = (androidx.datastore.preferences.protobuf.ByteString.LiteralByteString) r6
                byte[] r0 = r5.bytes
                byte[] r1 = r6.bytes
                int r3 = r5.getOffsetIntoBytes()
                int r3 = r3 + r8
                int r8 = r5.getOffsetIntoBytes()
                int r6 = r6.getOffsetIntoBytes()
                int r6 = r6 + r7
            L27:
                if (r8 >= r3) goto L35
                r7 = r0[r8]
                r4 = r1[r6]
                if (r7 == r4) goto L30
                return r2
            L30:
                int r8 = r8 + 1
                int r6 = r6 + 1
                goto L27
            L35:
                r6 = 1
                return r6
            L37:
                androidx.datastore.preferences.protobuf.ByteString r6 = r6.substring(r7, r0)
                androidx.datastore.preferences.protobuf.ByteString r7 = r5.substring(r2, r8)
                boolean r6 = r6.equals(r7)
                return r6
            L44:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Ran off end of other: "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = ", "
                r1.append(r7)
                r1.append(r8)
                r1.append(r7)
                int r6 = r6.size()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
            L6d:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Length too large: "
                r7.append(r0)
                r7.append(r8)
                int r8 = r5.size()
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
        }

        protected int getOffsetIntoBytes() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        byte internalByteAt(int r2) {
                r1 = this;
                byte[] r0 = r1.bytes
                r2 = r0[r2]
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean isValidUtf8() {
                r3 = this;
                int r0 = r3.getOffsetIntoBytes()
                byte[] r1 = r3.bytes
                int r2 = r3.size()
                int r2 = r2 + r0
                boolean r0 = androidx.datastore.preferences.protobuf.Utf8.isValidUtf8(r1, r0, r2)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final androidx.datastore.preferences.protobuf.CodedInputStream newCodedInput() {
                r4 = this;
                byte[] r0 = r4.bytes
                int r1 = r4.getOffsetIntoBytes()
                int r2 = r4.size()
                r3 = 1
                androidx.datastore.preferences.protobuf.CodedInputStream r0 = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(r0, r1, r2, r3)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final int partialHash(int r3, int r4, int r5) {
                r2 = this;
                byte[] r0 = r2.bytes
                int r1 = r2.getOffsetIntoBytes()
                int r1 = r1 + r4
                int r3 = androidx.datastore.preferences.protobuf.Internal.partialHash(r3, r0, r1, r5)
                return r3
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
                r1 = this;
                byte[] r0 = r1.bytes
                int r0 = r0.length
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final androidx.datastore.preferences.protobuf.ByteString substring(int r4, int r5) {
                r3 = this;
                int r0 = r3.size()
                int r5 = androidx.datastore.preferences.protobuf.ByteString.checkRange(r4, r5, r0)
                if (r5 != 0) goto Ld
                androidx.datastore.preferences.protobuf.ByteString r4 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
                return r4
            Ld:
                androidx.datastore.preferences.protobuf.ByteString$BoundedByteString r0 = new androidx.datastore.preferences.protobuf.ByteString$BoundedByteString
                byte[] r1 = r3.bytes
                int r2 = r3.getOffsetIntoBytes()
                int r2 = r2 + r4
                r0.<init>(r1, r2, r5)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final java.lang.String toStringInternal(java.nio.charset.Charset r5) {
                r4 = this;
                java.lang.String r0 = new java.lang.String
                byte[] r1 = r4.bytes
                int r2 = r4.getOffsetIntoBytes()
                int r3 = r4.size()
                r0.<init>(r1, r2, r3, r5)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        final void writeTo(androidx.datastore.preferences.protobuf.ByteOutput r4) throws java.io.IOException {
                r3 = this;
                byte[] r0 = r3.bytes
                int r1 = r3.getOffsetIntoBytes()
                int r2 = r3.size()
                r4.writeLazy(r0, r1, r2)
                return
        }
    }

    private static final class SystemByteArrayCopier implements androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier {
        private SystemByteArrayCopier() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ SystemByteArrayCopier(androidx.datastore.preferences.protobuf.ByteString.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] r3, int r4, int r5) {
                r2 = this;
                byte[] r0 = new byte[r5]
                r1 = 0
                java.lang.System.arraycopy(r3, r4, r0, r1, r5)
                return r0
        }
    }

    static {
            androidx.datastore.preferences.protobuf.ByteString$LiteralByteString r0 = new androidx.datastore.preferences.protobuf.ByteString$LiteralByteString
            byte[] r1 = androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY
            r0.<init>(r1)
            androidx.datastore.preferences.protobuf.ByteString.EMPTY = r0
            boolean r0 = androidx.datastore.preferences.protobuf.Android.isOnAndroidDevice()
            r1 = 0
            if (r0 == 0) goto L16
            androidx.datastore.preferences.protobuf.ByteString$SystemByteArrayCopier r0 = new androidx.datastore.preferences.protobuf.ByteString$SystemByteArrayCopier
            r0.<init>(r1)
            goto L1b
        L16:
            androidx.datastore.preferences.protobuf.ByteString$ArraysByteArrayCopier r0 = new androidx.datastore.preferences.protobuf.ByteString$ArraysByteArrayCopier
            r0.<init>(r1)
        L1b:
            androidx.datastore.preferences.protobuf.ByteString.byteArrayCopier = r0
            androidx.datastore.preferences.protobuf.ByteString$2 r0 = new androidx.datastore.preferences.protobuf.ByteString$2
            r0.<init>()
            androidx.datastore.preferences.protobuf.ByteString.UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = r0
            return
    }

    ByteString() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.hash = r0
            return
    }

    static /* synthetic */ int access$200(byte r0) {
            int r0 = toInt(r0)
            return r0
    }

    static void checkIndex(int r3, int r4) {
            int r0 = r3 + 1
            int r0 = r4 - r0
            r0 = r0 | r3
            if (r0 >= 0) goto L3f
            if (r3 >= 0) goto L20
            java.lang.ArrayIndexOutOfBoundsException r4 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Index < 0: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L20:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index > length: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ", "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L3f:
            return
    }

    static int checkRange(int r3, int r4, int r5) {
            int r0 = r4 - r3
            r1 = r3 | r4
            r1 = r1 | r0
            int r2 = r5 - r4
            r1 = r1 | r2
            if (r1 >= 0) goto L68
            if (r3 < 0) goto L4c
            if (r4 >= r3) goto L2d
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Beginning index larger than ending index: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ", "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
        L2d:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End index: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " >= "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L4c:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Beginning index: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = " < 0"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L68:
            return r0
    }

    public static androidx.datastore.preferences.protobuf.ByteString copyFrom(byte[] r2) {
            int r0 = r2.length
            r1 = 0
            androidx.datastore.preferences.protobuf.ByteString r2 = copyFrom(r2, r1, r0)
            return r2
    }

    public static androidx.datastore.preferences.protobuf.ByteString copyFrom(byte[] r2, int r3, int r4) {
            int r0 = r3 + r4
            int r1 = r2.length
            checkRange(r3, r0, r1)
            androidx.datastore.preferences.protobuf.ByteString$LiteralByteString r0 = new androidx.datastore.preferences.protobuf.ByteString$LiteralByteString
            androidx.datastore.preferences.protobuf.ByteString$ByteArrayCopier r1 = androidx.datastore.preferences.protobuf.ByteString.byteArrayCopier
            byte[] r2 = r1.copyFrom(r2, r3, r4)
            r0.<init>(r2)
            return r0
    }

    public static androidx.datastore.preferences.protobuf.ByteString copyFromUtf8(java.lang.String r2) {
            androidx.datastore.preferences.protobuf.ByteString$LiteralByteString r0 = new androidx.datastore.preferences.protobuf.ByteString$LiteralByteString
            java.nio.charset.Charset r1 = androidx.datastore.preferences.protobuf.Internal.UTF_8
            byte[] r2 = r2.getBytes(r1)
            r0.<init>(r2)
            return r0
    }

    static androidx.datastore.preferences.protobuf.ByteString.CodedBuilder newCodedBuilder(int r2) {
            androidx.datastore.preferences.protobuf.ByteString$CodedBuilder r0 = new androidx.datastore.preferences.protobuf.ByteString$CodedBuilder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private static int toInt(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    static androidx.datastore.preferences.protobuf.ByteString wrap(byte[] r1) {
            androidx.datastore.preferences.protobuf.ByteString$LiteralByteString r0 = new androidx.datastore.preferences.protobuf.ByteString$LiteralByteString
            r0.<init>(r1)
            return r0
    }

    static androidx.datastore.preferences.protobuf.ByteString wrap(byte[] r1, int r2, int r3) {
            androidx.datastore.preferences.protobuf.ByteString$BoundedByteString r0 = new androidx.datastore.preferences.protobuf.ByteString$BoundedByteString
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract byte byteAt(int r1);

    protected abstract void copyToInternal(byte[] r1, int r2, int r3, int r4);

    public abstract boolean equals(java.lang.Object r1);

    public final int hashCode() {
            r2 = this;
            int r0 = r2.hash
            if (r0 != 0) goto L12
            int r0 = r2.size()
            r1 = 0
            int r0 = r2.partialHash(r0, r1, r0)
            if (r0 != 0) goto L10
            r0 = 1
        L10:
            r2.hash = r0
        L12:
            return r0
    }

    abstract byte internalByteAt(int r1);

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            androidx.datastore.preferences.protobuf.ByteString$1 r0 = new androidx.datastore.preferences.protobuf.ByteString$1
            r0.<init>(r1)
            return r0
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator2() {
            r1 = this;
            androidx.datastore.preferences.protobuf.ByteString$ByteIterator r0 = r1.iterator()
            return r0
    }

    public abstract androidx.datastore.preferences.protobuf.CodedInputStream newCodedInput();

    protected abstract int partialHash(int r1, int r2, int r3);

    protected final int peekCachedHashCode() {
            r1 = this;
            int r0 = r1.hash
            return r0
    }

    public abstract int size();

    public abstract androidx.datastore.preferences.protobuf.ByteString substring(int r1, int r2);

    public final byte[] toByteArray() {
            r3 = this;
            int r0 = r3.size()
            if (r0 != 0) goto L9
            byte[] r0 = androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY
            return r0
        L9:
            byte[] r1 = new byte[r0]
            r2 = 0
            r3.copyToInternal(r1, r2, r2, r0)
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "<ByteString@%s size=%d>"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    public final java.lang.String toString(java.nio.charset.Charset r2) {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L9
            java.lang.String r2 = ""
            goto Ld
        L9:
            java.lang.String r2 = r1.toStringInternal(r2)
        Ld:
            return r2
    }

    protected abstract java.lang.String toStringInternal(java.nio.charset.Charset r1);

    public final java.lang.String toStringUtf8() {
            r1 = this;
            java.nio.charset.Charset r0 = androidx.datastore.preferences.protobuf.Internal.UTF_8
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    abstract void writeTo(androidx.datastore.preferences.protobuf.ByteOutput r1) throws java.io.IOException;
}
