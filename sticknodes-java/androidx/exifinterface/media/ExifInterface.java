package androidx.exifinterface.media;

/* loaded from: classes.dex */
public class ExifInterface {
    static final java.nio.charset.Charset ASCII = null;
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = null;
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = null;
    public static final int[] BITS_PER_SAMPLE_RGB = null;
    private static final java.util.regex.Pattern DATETIME_PRIMARY_FORMAT_PATTERN = null;
    private static final java.util.regex.Pattern DATETIME_SECONDARY_FORMAT_PATTERN = null;
    private static final boolean DEBUG = false;
    static final byte[] EXIF_ASCII_PREFIX = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] EXIF_POINTER_TAGS = null;
    static final androidx.exifinterface.media.ExifInterface.ExifTag[][] EXIF_TAGS = null;
    private static final java.util.List<java.lang.Integer> FLIPPED_ROTATION_ORDER = null;
    private static final java.util.regex.Pattern GPS_TIMESTAMP_PATTERN = null;
    private static final byte[] HEIF_BRAND_HEIC = null;
    private static final byte[] HEIF_BRAND_MIF1 = null;
    private static final byte[] HEIF_TYPE_FTYP = null;
    static final byte[] IDENTIFIER_EXIF_APP1 = null;
    private static final byte[] IDENTIFIER_XMP_APP1 = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_EXIF_TAGS = null;
    static final int[] IFD_FORMAT_BYTES_PER_FORMAT = null;
    static final java.lang.String[] IFD_FORMAT_NAMES = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_GPS_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_INTEROPERABILITY_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_THUMBNAIL_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_TIFF_TAGS = null;
    static final byte[] JPEG_SIGNATURE = null;
    private static final java.util.regex.Pattern NON_ZERO_TIME_PATTERN = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] ORF_CAMERA_SETTINGS_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] ORF_IMAGE_PROCESSING_TAGS = null;
    private static final byte[] ORF_MAKER_NOTE_HEADER_1 = null;
    private static final byte[] ORF_MAKER_NOTE_HEADER_2 = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] ORF_MAKER_NOTE_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] PEF_TAGS = null;
    private static final byte[] PNG_CHUNK_TYPE_EXIF = null;
    private static final byte[] PNG_CHUNK_TYPE_IEND = null;
    private static final byte[] PNG_CHUNK_TYPE_IHDR = null;
    private static final byte[] PNG_SIGNATURE = null;
    private static final java.util.List<java.lang.Integer> ROTATION_ORDER = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag TAG_RAF_IMAGE_SIZE = null;
    private static final byte[] WEBP_CHUNK_TYPE_ANIM = null;
    private static final byte[] WEBP_CHUNK_TYPE_ANMF = null;
    private static final byte[] WEBP_CHUNK_TYPE_EXIF = null;
    private static final byte[] WEBP_CHUNK_TYPE_VP8 = null;
    private static final byte[] WEBP_CHUNK_TYPE_VP8L = null;
    private static final byte[] WEBP_CHUNK_TYPE_VP8X = null;
    private static final byte[] WEBP_SIGNATURE_1 = null;
    private static final byte[] WEBP_SIGNATURE_2 = null;
    private static final byte[] WEBP_VP8_SIGNATURE = null;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> sExifPointerTagMap = null;
    private static final java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface.ExifTag>[] sExifTagMapsForReading = null;
    private static final java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifTag>[] sExifTagMapsForWriting = null;
    private static java.text.SimpleDateFormat sFormatterPrimary;
    private static java.text.SimpleDateFormat sFormatterSecondary;
    private static final java.util.HashSet<java.lang.String> sTagSetForCompatibility = null;
    private boolean mAreThumbnailStripsConsecutive;
    private android.content.res.AssetManager.AssetInputStream mAssetInputStream;
    private final java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>[] mAttributes;
    private java.util.Set<java.lang.Integer> mAttributesOffsets;
    private java.nio.ByteOrder mExifByteOrder;
    private java.lang.String mFilename;
    private boolean mHasThumbnail;
    private boolean mHasThumbnailStrips;
    private boolean mIsExifDataOnly;
    private int mMimeType;
    private int mOffsetToExifData;
    private int mOrfMakerNoteOffset;
    private int mOrfThumbnailLength;
    private int mOrfThumbnailOffset;
    private java.io.FileDescriptor mSeekableFileDescriptor;
    private byte[] mThumbnailBytes;
    private int mThumbnailCompression;
    private int mThumbnailLength;
    private int mThumbnailOffset;
    private boolean mXmpIsFromSeparateMarker;


    private static class ByteOrderedDataInputStream extends java.io.InputStream implements java.io.DataInput {
        private java.nio.ByteOrder mByteOrder;
        protected final java.io.DataInputStream mDataInputStream;
        private int mLength;
        protected int mPosition;
        private byte[] mSkipBuffer;

        ByteOrderedDataInputStream(java.io.InputStream r2) throws java.io.IOException {
                r1 = this;
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r1.<init>(r2, r0)
                return
        }

        ByteOrderedDataInputStream(java.io.InputStream r3, java.nio.ByteOrder r4) throws java.io.IOException {
                r2 = this;
                r2.<init>()
                java.io.DataInputStream r0 = new java.io.DataInputStream
                r0.<init>(r3)
                r2.mDataInputStream = r0
                r1 = 0
                r0.mark(r1)
                r2.mPosition = r1
                r2.mByteOrder = r4
                boolean r4 = r3 instanceof androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream
                if (r4 == 0) goto L1d
                androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r3 = (androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream) r3
                int r3 = r3.length()
                goto L1e
            L1d:
                r3 = -1
            L1e:
                r2.mLength = r3
                return
        }

        ByteOrderedDataInputStream(byte[] r3) throws java.io.IOException {
                r2 = this;
                java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                r0.<init>(r3)
                java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
                r2.<init>(r0, r1)
                int r3 = r3.length
                r2.mLength = r3
                return
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
                r1 = this;
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.available()
                return r0
        }

        public int length() {
                r1 = this;
                int r0 = r1.mLength
                return r0
        }

        @Override // java.io.InputStream
        public void mark(int r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Mark is currently unsupported"
                r2.<init>(r0)
                throw r2
        }

        public int position() {
                r1 = this;
                int r0 = r1.mPosition
                return r0
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.read()
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r2 = r0.read(r2, r3, r4)
                int r3 = r1.mPosition
                int r3 = r3 + r2
                r1.mPosition = r3
                return r2
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                boolean r0 = r0.readBoolean()
                return r0
        }

        @Override // java.io.DataInput
        public byte readByte() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.read()
                if (r0 < 0) goto L10
                byte r0 = (byte) r0
                return r0
            L10:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public char readChar() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 2
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                char r0 = r0.readChar()
                return r0
        }

        @Override // java.io.DataInput
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readLong()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // java.io.DataInput
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readInt()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // java.io.DataInput
        public void readFully(byte[] r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.mPosition
                int r1 = r3.length
                int r0 = r0 + r1
                r2.mPosition = r0
                java.io.DataInputStream r0 = r2.mDataInputStream
                r0.readFully(r3)
                return
        }

        @Override // java.io.DataInput
        public void readFully(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + r4
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                r0.readFully(r2, r3, r4)
                return
        }

        @Override // java.io.DataInput
        public int readInt() throws java.io.IOException {
                r6 = this;
                int r0 = r6.mPosition
                int r0 = r0 + 4
                r6.mPosition = r0
                java.io.DataInputStream r0 = r6.mDataInputStream
                int r0 = r0.read()
                java.io.DataInputStream r1 = r6.mDataInputStream
                int r1 = r1.read()
                java.io.DataInputStream r2 = r6.mDataInputStream
                int r2 = r2.read()
                java.io.DataInputStream r3 = r6.mDataInputStream
                int r3 = r3.read()
                r4 = r0 | r1
                r4 = r4 | r2
                r4 = r4 | r3
                if (r4 < 0) goto L5b
                java.nio.ByteOrder r4 = r6.mByteOrder
                java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
                if (r4 != r5) goto L34
                int r3 = r3 << 24
                int r2 = r2 << 16
                int r3 = r3 + r2
                int r1 = r1 << 8
                int r3 = r3 + r1
                int r3 = r3 + r0
                return r3
            L34:
                java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
                if (r4 != r5) goto L42
                int r0 = r0 << 24
                int r1 = r1 << 16
                int r0 = r0 + r1
                int r1 = r2 << 8
                int r0 = r0 + r1
                int r0 = r0 + r3
                return r0
            L42:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid byte order: "
                r1.append(r2)
                java.nio.ByteOrder r2 = r6.mByteOrder
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L5b:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public java.lang.String readLine() throws java.io.IOException {
                r2 = this;
                java.lang.String r0 = "ExifInterface"
                java.lang.String r1 = "Currently unsupported"
                android.util.Log.d(r0, r1)
                r0 = 0
                return r0
        }

        @Override // java.io.DataInput
        public long readLong() throws java.io.IOException {
                r19 = this;
                r0 = r19
                int r1 = r0.mPosition
                r2 = 8
                int r1 = r1 + r2
                r0.mPosition = r1
                java.io.DataInputStream r1 = r0.mDataInputStream
                int r1 = r1.read()
                java.io.DataInputStream r3 = r0.mDataInputStream
                int r3 = r3.read()
                java.io.DataInputStream r4 = r0.mDataInputStream
                int r4 = r4.read()
                java.io.DataInputStream r5 = r0.mDataInputStream
                int r5 = r5.read()
                java.io.DataInputStream r6 = r0.mDataInputStream
                int r6 = r6.read()
                java.io.DataInputStream r7 = r0.mDataInputStream
                int r7 = r7.read()
                java.io.DataInputStream r8 = r0.mDataInputStream
                int r8 = r8.read()
                java.io.DataInputStream r9 = r0.mDataInputStream
                int r9 = r9.read()
                r10 = r1 | r3
                r10 = r10 | r4
                r10 = r10 | r5
                r10 = r10 | r6
                r10 = r10 | r7
                r10 = r10 | r8
                r10 = r10 | r9
                if (r10 < 0) goto Laf
                java.nio.ByteOrder r10 = r0.mByteOrder
                java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
                r12 = 16
                r13 = 24
                r14 = 32
                r15 = 40
                r16 = 48
                r17 = 56
                if (r10 != r11) goto L74
                long r9 = (long) r9
                long r9 = r9 << r17
                r18 = r3
                long r2 = (long) r8
                long r2 = r2 << r16
                long r9 = r9 + r2
                long r2 = (long) r7
                long r2 = r2 << r15
                long r9 = r9 + r2
                long r2 = (long) r6
                long r2 = r2 << r14
                long r9 = r9 + r2
                long r2 = (long) r5
                long r2 = r2 << r13
                long r9 = r9 + r2
                long r2 = (long) r4
                long r2 = r2 << r12
                long r9 = r9 + r2
                r2 = r18
                long r2 = (long) r2
                r4 = 8
                long r2 = r2 << r4
                long r9 = r9 + r2
                long r1 = (long) r1
                long r9 = r9 + r1
                return r9
            L74:
                r2 = r3
                java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
                if (r10 != r3) goto L96
                long r11 = (long) r1
                long r11 = r11 << r17
                long r1 = (long) r2
                long r1 = r1 << r16
                long r11 = r11 + r1
                long r1 = (long) r4
                long r1 = r1 << r15
                long r11 = r11 + r1
                long r1 = (long) r5
                long r1 = r1 << r14
                long r11 = r11 + r1
                long r1 = (long) r6
                long r1 = r1 << r13
                long r11 = r11 + r1
                long r1 = (long) r7
                r4 = 16
                long r1 = r1 << r4
                long r11 = r11 + r1
                long r1 = (long) r8
                r3 = 8
                long r1 = r1 << r3
                long r11 = r11 + r1
                long r1 = (long) r9
                long r11 = r11 + r1
                return r11
            L96:
                java.io.IOException r1 = new java.io.IOException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid byte order: "
                r2.append(r3)
                java.nio.ByteOrder r3 = r0.mByteOrder
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Laf:
                java.io.EOFException r1 = new java.io.EOFException
                r1.<init>()
                throw r1
        }

        @Override // java.io.DataInput
        public short readShort() throws java.io.IOException {
                r4 = this;
                int r0 = r4.mPosition
                int r0 = r0 + 2
                r4.mPosition = r0
                java.io.DataInputStream r0 = r4.mDataInputStream
                int r0 = r0.read()
                java.io.DataInputStream r1 = r4.mDataInputStream
                int r1 = r1.read()
                r2 = r0 | r1
                if (r2 < 0) goto L43
                java.nio.ByteOrder r2 = r4.mByteOrder
                java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
                if (r2 != r3) goto L21
                int r1 = r1 << 8
                int r1 = r1 + r0
                short r0 = (short) r1
                return r0
            L21:
                java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
                if (r2 != r3) goto L2a
                int r0 = r0 << 8
                int r0 = r0 + r1
                short r0 = (short) r0
                return r0
            L2a:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid byte order: "
                r1.append(r2)
                java.nio.ByteOrder r2 = r4.mByteOrder
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L43:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public java.lang.String readUTF() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 2
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                java.lang.String r0 = r0.readUTF()
                return r0
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.readUnsignedByte()
                return r0
        }

        public long readUnsignedInt() throws java.io.IOException {
                r4 = this;
                int r0 = r4.readInt()
                long r0 = (long) r0
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r0 = r0 & r2
                return r0
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws java.io.IOException {
                r4 = this;
                int r0 = r4.mPosition
                int r0 = r0 + 2
                r4.mPosition = r0
                java.io.DataInputStream r0 = r4.mDataInputStream
                int r0 = r0.read()
                java.io.DataInputStream r1 = r4.mDataInputStream
                int r1 = r1.read()
                r2 = r0 | r1
                if (r2 < 0) goto L41
                java.nio.ByteOrder r2 = r4.mByteOrder
                java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
                if (r2 != r3) goto L20
                int r1 = r1 << 8
                int r1 = r1 + r0
                return r1
            L20:
                java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
                if (r2 != r3) goto L28
                int r0 = r0 << 8
                int r0 = r0 + r1
                return r0
            L28:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid byte order: "
                r1.append(r2)
                java.nio.ByteOrder r2 = r4.mByteOrder
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L41:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.InputStream
        public void reset() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Reset is currently unsupported"
                r0.<init>(r1)
                throw r0
        }

        public void setByteOrder(java.nio.ByteOrder r1) {
                r0 = this;
                r0.mByteOrder = r1
                return
        }

        @Override // java.io.DataInput
        public int skipBytes(int r2) throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "skipBytes is currently unsupported"
                r2.<init>(r0)
                throw r2
        }

        public void skipFully(int r7) throws java.io.IOException {
                r6 = this;
                r0 = 0
                r1 = 0
            L2:
                if (r1 >= r7) goto L48
                java.io.DataInputStream r2 = r6.mDataInputStream
                int r3 = r7 - r1
                long r4 = (long) r3
                long r4 = r2.skip(r4)
                int r2 = (int) r4
                if (r2 > 0) goto L46
                byte[] r2 = r6.mSkipBuffer
                r4 = 8192(0x2000, float:1.14794E-41)
                if (r2 != 0) goto L1a
                byte[] r2 = new byte[r4]
                r6.mSkipBuffer = r2
            L1a:
                int r2 = java.lang.Math.min(r4, r3)
                java.io.DataInputStream r3 = r6.mDataInputStream
                byte[] r4 = r6.mSkipBuffer
                int r2 = r3.read(r4, r0, r2)
                r3 = -1
                if (r2 == r3) goto L2a
                goto L46
            L2a:
                java.io.EOFException r0 = new java.io.EOFException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Reached EOF while skipping "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = " bytes."
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            L46:
                int r1 = r1 + r2
                goto L2
            L48:
                int r7 = r6.mPosition
                int r7 = r7 + r1
                r6.mPosition = r7
                return
        }
    }

    private static class ExifAttribute {
        public final byte[] bytes;
        public final long bytesOffset;
        public final int format;
        public final int numberOfComponents;

        ExifAttribute(int r1, int r2, long r3, byte[] r5) {
                r0 = this;
                r0.<init>()
                r0.format = r1
                r0.numberOfComponents = r2
                r0.bytesOffset = r3
                r0.bytes = r5
                return
        }

        ExifAttribute(int r7, int r8, byte[] r9) {
                r6 = this;
                r3 = -1
                r0 = r6
                r1 = r7
                r2 = r8
                r5 = r9
                r0.<init>(r1, r2, r3, r5)
                return
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createString(java.lang.String r3) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                r3 = 0
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.nio.charset.Charset r0 = androidx.exifinterface.media.ExifInterface.ASCII
                byte[] r3 = r3.getBytes(r0)
                androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r1 = r3.length
                r2 = 2
                r0.<init>(r2, r1, r3)
                return r0
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createULong(long r2, java.nio.ByteOrder r4) {
                r0 = 1
                long[] r0 = new long[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createULong(r0, r4)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createULong(long[] r5, java.nio.ByteOrder r6) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 4
                r0 = r0[r1]
                int r2 = r5.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r6)
                int r6 = r5.length
                r2 = 0
            L13:
                if (r2 >= r6) goto L1e
                r3 = r5[r2]
                int r4 = (int) r3
                r0.putInt(r4)
                int r2 = r2 + 1
                goto L13
            L1e:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r5 = r5.length
                byte[] r0 = r0.array()
                r6.<init>(r1, r5, r0)
                return r6
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createURational(androidx.exifinterface.media.ExifInterface.Rational r2, java.nio.ByteOrder r3) {
                r0 = 1
                androidx.exifinterface.media.ExifInterface$Rational[] r0 = new androidx.exifinterface.media.ExifInterface.Rational[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createURational(r0, r3)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createURational(androidx.exifinterface.media.ExifInterface.Rational[] r6, java.nio.ByteOrder r7) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 5
                r0 = r0[r1]
                int r2 = r6.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r7)
                int r7 = r6.length
                r2 = 0
            L13:
                if (r2 >= r7) goto L26
                r3 = r6[r2]
                long r4 = r3.numerator
                int r5 = (int) r4
                r0.putInt(r5)
                long r3 = r3.denominator
                int r4 = (int) r3
                r0.putInt(r4)
                int r2 = r2 + 1
                goto L13
            L26:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r6 = r6.length
                byte[] r0 = r0.array()
                r7.<init>(r1, r6, r0)
                return r7
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort(int r2, java.nio.ByteOrder r3) {
                r0 = 1
                int[] r0 = new int[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createUShort(r0, r3)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort(int[] r4, java.nio.ByteOrder r5) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
                r1 = 3
                r0 = r0[r1]
                int r2 = r4.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r5)
                int r5 = r4.length
                r2 = 0
            L13:
                if (r2 >= r5) goto L1e
                r3 = r4[r2]
                short r3 = (short) r3
                r0.putShort(r3)
                int r2 = r2 + 1
                goto L13
            L1e:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r4 = r4.length
                byte[] r0 = r0.array()
                r5.<init>(r1, r4, r0)
                return r5
        }

        public double getDoubleValue(java.nio.ByteOrder r5) {
                r4 = this;
                java.lang.Object r5 = r4.getValue(r5)
                if (r5 == 0) goto L6b
                boolean r0 = r5 instanceof java.lang.String
                if (r0 == 0) goto L11
                java.lang.String r5 = (java.lang.String) r5
                double r0 = java.lang.Double.parseDouble(r5)
                return r0
            L11:
                boolean r0 = r5 instanceof long[]
                r1 = 0
                java.lang.String r2 = "There are more than one component"
                r3 = 1
                if (r0 == 0) goto L28
                long[] r5 = (long[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L22
                r0 = r5[r1]
                double r0 = (double) r0
                return r0
            L22:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L28:
                boolean r0 = r5 instanceof int[]
                if (r0 == 0) goto L3b
                int[] r5 = (int[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L35
                r5 = r5[r1]
                double r0 = (double) r5
                return r0
            L35:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L3b:
                boolean r0 = r5 instanceof double[]
                if (r0 == 0) goto L4d
                double[] r5 = (double[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L47
                r0 = r5[r1]
                return r0
            L47:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L4d:
                boolean r0 = r5 instanceof androidx.exifinterface.media.ExifInterface.Rational[]
                if (r0 == 0) goto L63
                androidx.exifinterface.media.ExifInterface$Rational[] r5 = (androidx.exifinterface.media.ExifInterface.Rational[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L5d
                r5 = r5[r1]
                double r0 = r5.calculate()
                return r0
            L5d:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L63:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "Couldn't find a double value"
                r5.<init>(r0)
                throw r5
            L6b:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "NULL can't be converted to a double value"
                r5.<init>(r0)
                throw r5
        }

        public int getIntValue(java.nio.ByteOrder r5) {
                r4 = this;
                java.lang.Object r5 = r4.getValue(r5)
                if (r5 == 0) goto L42
                boolean r0 = r5 instanceof java.lang.String
                if (r0 == 0) goto L11
                java.lang.String r5 = (java.lang.String) r5
                int r5 = java.lang.Integer.parseInt(r5)
                return r5
            L11:
                boolean r0 = r5 instanceof long[]
                r1 = 0
                java.lang.String r2 = "There are more than one component"
                r3 = 1
                if (r0 == 0) goto L28
                long[] r5 = (long[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L22
                r0 = r5[r1]
                int r5 = (int) r0
                return r5
            L22:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L28:
                boolean r0 = r5 instanceof int[]
                if (r0 == 0) goto L3a
                int[] r5 = (int[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L34
                r5 = r5[r1]
                return r5
            L34:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L3a:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "Couldn't find a integer value"
                r5.<init>(r0)
                throw r5
            L42:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "NULL can't be converted to a integer value"
                r5.<init>(r0)
                throw r5
        }

        public java.lang.String getStringValue(java.nio.ByteOrder r8) {
                r7 = this;
                java.lang.Object r8 = r7.getValue(r8)
                r0 = 0
                if (r8 != 0) goto L8
                return r0
            L8:
                boolean r1 = r8 instanceof java.lang.String
                if (r1 == 0) goto Lf
                java.lang.String r8 = (java.lang.String) r8
                return r8
            Lf:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                boolean r2 = r8 instanceof long[]
                java.lang.String r3 = ","
                r4 = 0
                if (r2 == 0) goto L33
                long[] r8 = (long[]) r8
            L1d:
                int r0 = r8.length
                if (r4 >= r0) goto L2e
                r5 = r8[r4]
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L1d
                r1.append(r3)
                goto L1d
            L2e:
                java.lang.String r8 = r1.toString()
                return r8
            L33:
                boolean r2 = r8 instanceof int[]
                if (r2 == 0) goto L4f
                int[] r8 = (int[]) r8
            L39:
                int r0 = r8.length
                if (r4 >= r0) goto L4a
                r0 = r8[r4]
                r1.append(r0)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L39
                r1.append(r3)
                goto L39
            L4a:
                java.lang.String r8 = r1.toString()
                return r8
            L4f:
                boolean r2 = r8 instanceof double[]
                if (r2 == 0) goto L6b
                double[] r8 = (double[]) r8
            L55:
                int r0 = r8.length
                if (r4 >= r0) goto L66
                r5 = r8[r4]
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L55
                r1.append(r3)
                goto L55
            L66:
                java.lang.String r8 = r1.toString()
                return r8
            L6b:
                boolean r2 = r8 instanceof androidx.exifinterface.media.ExifInterface.Rational[]
                if (r2 == 0) goto L95
                androidx.exifinterface.media.ExifInterface$Rational[] r8 = (androidx.exifinterface.media.ExifInterface.Rational[]) r8
            L71:
                int r0 = r8.length
                if (r4 >= r0) goto L90
                r0 = r8[r4]
                long r5 = r0.numerator
                r1.append(r5)
                r0 = 47
                r1.append(r0)
                r0 = r8[r4]
                long r5 = r0.denominator
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L71
                r1.append(r3)
                goto L71
            L90:
                java.lang.String r8 = r1.toString()
                return r8
            L95:
                return r0
        }

        java.lang.Object getValue(java.nio.ByteOrder r11) {
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r3 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L187 java.io.IOException -> L189
                byte[] r4 = r10.bytes     // Catch: java.lang.Throwable -> L187 java.io.IOException -> L189
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L187 java.io.IOException -> L189
                r3.setByteOrder(r11)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r11 = r10.format     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L148;
                    case 2: goto Lfd;
                    case 3: goto Le3;
                    case 4: goto Lc9;
                    case 5: goto La6;
                    case 6: goto L148;
                    case 7: goto Lfd;
                    case 8: goto L8c;
                    case 9: goto L72;
                    case 10: goto L4d;
                    case 11: goto L32;
                    case 12: goto L18;
                    default: goto L16;
                }     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L16:
                goto L17c
            L18:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                double[] r11 = new double[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L1c:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto L29
                double r6 = r3.readDouble()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r6     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto L1c
            L29:
                r3.close()     // Catch: java.io.IOException -> L2d
                goto L31
            L2d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L31:
                return r11
            L32:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                double[] r11 = new double[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L36:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto L44
                float r4 = r3.readFloat()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                double r6 = (double) r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r6     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto L36
            L44:
                r3.close()     // Catch: java.io.IOException -> L48
                goto L4c
            L48:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L4c:
                return r11
            L4d:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                androidx.exifinterface.media.ExifInterface$Rational[] r11 = new androidx.exifinterface.media.ExifInterface.Rational[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L51:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto L69
                int r4 = r3.readInt()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                long r6 = (long) r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r4 = r3.readInt()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                long r8 = (long) r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                androidx.exifinterface.media.ExifInterface$Rational r4 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r4.<init>(r6, r8)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto L51
            L69:
                r3.close()     // Catch: java.io.IOException -> L6d
                goto L71
            L6d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L71:
                return r11
            L72:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int[] r11 = new int[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L76:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto L83
                int r4 = r3.readInt()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto L76
            L83:
                r3.close()     // Catch: java.io.IOException -> L87
                goto L8b
            L87:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L8b:
                return r11
            L8c:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int[] r11 = new int[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L90:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto L9d
                short r4 = r3.readShort()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto L90
            L9d:
                r3.close()     // Catch: java.io.IOException -> La1
                goto La5
            La1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            La5:
                return r11
            La6:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                androidx.exifinterface.media.ExifInterface$Rational[] r11 = new androidx.exifinterface.media.ExifInterface.Rational[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            Laa:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto Lc0
                long r6 = r3.readUnsignedInt()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                long r8 = r3.readUnsignedInt()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                androidx.exifinterface.media.ExifInterface$Rational r4 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r4.<init>(r6, r8)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto Laa
            Lc0:
                r3.close()     // Catch: java.io.IOException -> Lc4
                goto Lc8
            Lc4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            Lc8:
                return r11
            Lc9:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                long[] r11 = new long[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            Lcd:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto Lda
                long r6 = r3.readUnsignedInt()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r6     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto Lcd
            Lda:
                r3.close()     // Catch: java.io.IOException -> Lde
                goto Le2
            Lde:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            Le2:
                return r11
            Le3:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int[] r11 = new int[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            Le7:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto Lf4
                int r4 = r3.readUnsignedShort()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11[r5] = r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r5 = r5 + 1
                goto Le7
            Lf4:
                r3.close()     // Catch: java.io.IOException -> Lf8
                goto Lfc
            Lf8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            Lfc:
                return r11
            Lfd:
                int r11 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                byte[] r6 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r6 = r6.length     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r11 < r6) goto L11a
                r11 = 0
            L105:
                byte[] r6 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r7 = r6.length     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r11 >= r7) goto L117
                byte[] r7 = r10.bytes     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r7 = r7[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r8 = r6[r11]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r7 == r8) goto L114
                r4 = 0
                goto L117
            L114:
                int r11 = r11 + 1
                goto L105
            L117:
                if (r4 == 0) goto L11a
                int r5 = r6.length     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L11a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11.<init>()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L11f:
                int r4 = r10.numberOfComponents     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r5 >= r4) goto L13b
                byte[] r4 = r10.bytes     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r4 = r4[r5]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r4 != 0) goto L12a
                goto L13b
            L12a:
                r6 = 32
                if (r4 < r6) goto L133
                char r4 = (char) r4     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11.append(r4)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                goto L138
            L133:
                r4 = 63
                r11.append(r4)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
            L138:
                int r5 = r5 + 1
                goto L11f
            L13b:
                java.lang.String r11 = r11.toString()     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r3.close()     // Catch: java.io.IOException -> L143
                goto L147
            L143:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L147:
                return r11
            L148:
                byte[] r11 = r10.bytes     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r6 = r11.length     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r6 != r4) goto L16c
                r6 = r11[r5]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r6 < 0) goto L16c
                r6 = r11[r5]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                if (r6 > r4) goto L16c
                java.lang.String r6 = new java.lang.String     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                char[] r4 = new char[r4]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r11 = r11[r5]     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                int r11 = r11 + 48
                char r11 = (char) r11     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r4[r5] = r11     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r6.<init>(r4)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r3.close()     // Catch: java.io.IOException -> L167
                goto L16b
            L167:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L16b:
                return r6
            L16c:
                java.lang.String r4 = new java.lang.String     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                java.nio.charset.Charset r5 = androidx.exifinterface.media.ExifInterface.ASCII     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r4.<init>(r11, r5)     // Catch: java.io.IOException -> L185 java.lang.Throwable -> L19b
                r3.close()     // Catch: java.io.IOException -> L177
                goto L17b
            L177:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L17b:
                return r4
            L17c:
                r3.close()     // Catch: java.io.IOException -> L180
                goto L184
            L180:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L184:
                return r2
            L185:
                r11 = move-exception
                goto L18b
            L187:
                r11 = move-exception
                goto L19d
            L189:
                r11 = move-exception
                r3 = r2
            L18b:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch: java.lang.Throwable -> L19b
                if (r3 == 0) goto L19a
                r3.close()     // Catch: java.io.IOException -> L196
                goto L19a
            L196:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L19a:
                return r2
            L19b:
                r11 = move-exception
                r2 = r3
            L19d:
                if (r2 == 0) goto L1a7
                r2.close()     // Catch: java.io.IOException -> L1a3
                goto L1a7
            L1a3:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L1a7:
                throw r11
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "("
                r0.append(r1)
                java.lang.String[] r1 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES
                int r2 = r3.format
                r1 = r1[r2]
                r0.append(r1)
                java.lang.String r1 = ", data length:"
                r0.append(r1)
                byte[] r1 = r3.bytes
                int r1 = r1.length
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static class ExifTag {
        public final java.lang.String name;
        public final int number;
        public final int primaryFormat;
        public final int secondaryFormat;

        ExifTag(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.number = r2
                r0.primaryFormat = r3
                r1 = -1
                r0.secondaryFormat = r1
                return
        }

        ExifTag(java.lang.String r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.number = r2
                r0.primaryFormat = r3
                r0.secondaryFormat = r4
                return
        }

        boolean isFormatCompatible(int r5) {
                r4 = this;
                int r0 = r4.primaryFormat
                r1 = 7
                r2 = 1
                if (r0 == r1) goto L31
                if (r5 != r1) goto L9
                goto L31
            L9:
                if (r0 == r5) goto L31
                int r1 = r4.secondaryFormat
                if (r1 != r5) goto L10
                goto L31
            L10:
                r3 = 4
                if (r0 == r3) goto L15
                if (r1 != r3) goto L19
            L15:
                r3 = 3
                if (r5 != r3) goto L19
                return r2
            L19:
                r3 = 9
                if (r0 == r3) goto L1f
                if (r1 != r3) goto L24
            L1f:
                r3 = 8
                if (r5 != r3) goto L24
                return r2
            L24:
                r3 = 12
                if (r0 == r3) goto L2a
                if (r1 != r3) goto L2f
            L2a:
                r0 = 11
                if (r5 != r0) goto L2f
                return r2
            L2f:
                r5 = 0
                return r5
            L31:
                return r2
        }
    }

    private static class Rational {
        public final long denominator;
        public final long numerator;

        Rational(long r4, long r6) {
                r3 = this;
                r3.<init>()
                r0 = 0
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 != 0) goto L10
                r3.numerator = r0
                r4 = 1
                r3.denominator = r4
                return
            L10:
                r3.numerator = r4
                r3.denominator = r6
                return
        }

        public double calculate() {
                r4 = this;
                long r0 = r4.numerator
                double r0 = (double) r0
                long r2 = r4.denominator
                double r2 = (double) r2
                double r0 = r0 / r2
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r1 = r3.numerator
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                long r1 = r3.denominator
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static class SeekableByteOrderedDataInputStream extends androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream {
        SeekableByteOrderedDataInputStream(java.io.InputStream r2) throws java.io.IOException {
                r1 = this;
                r1.<init>(r2)
                boolean r2 = r2.markSupported()
                if (r2 == 0) goto L12
                java.io.DataInputStream r2 = r1.mDataInputStream
                r0 = 2147483647(0x7fffffff, float:NaN)
                r2.mark(r0)
                return
            L12:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset"
                r2.<init>(r0)
                throw r2
        }

        SeekableByteOrderedDataInputStream(byte[] r2) throws java.io.IOException {
                r1 = this;
                r1.<init>(r2)
                java.io.DataInputStream r2 = r1.mDataInputStream
                r0 = 2147483647(0x7fffffff, float:NaN)
                r2.mark(r0)
                return
        }

        public void seek(long r5) throws java.io.IOException {
                r4 = this;
                int r0 = r4.mPosition
                long r1 = (long) r0
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 <= 0) goto L10
                r0 = 0
                r4.mPosition = r0
                java.io.DataInputStream r0 = r4.mDataInputStream
                r0.reset()
                goto L12
            L10:
                long r0 = (long) r0
                long r5 = r5 - r0
            L12:
                int r6 = (int) r5
                r4.skipFully(r6)
                return
        }
    }

    static {
            java.lang.String r0 = "ExifInterface"
            r1 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            androidx.exifinterface.media.ExifInterface.DEBUG = r0
            r0 = 4
            java.lang.Integer[] r3 = new java.lang.Integer[r0]
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 0
            r3[r6] = r5
            r7 = 6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r3[r4] = r8
            r8 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r3[r8] = r2
            r10 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r3[r1] = r11
            java.util.List r3 = java.util.Arrays.asList(r3)
            androidx.exifinterface.media.ExifInterface.ROTATION_ORDER = r3
            java.lang.Integer[] r3 = new java.lang.Integer[r0]
            r3[r6] = r9
            r12 = 7
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r3[r4] = r13
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r3[r8] = r14
            r14 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r3[r1] = r15
            java.util.List r3 = java.util.Arrays.asList(r3)
            androidx.exifinterface.media.ExifInterface.FLIPPED_ROTATION_ORDER = r3
            int[] r3 = new int[r1]
            r3 = {x0cd4: FILL_ARRAY_DATA , data: [8, 8, 8} // fill-array
            androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_RGB = r3
            int[] r3 = new int[r4]
            r3[r6] = r0
            androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_GREYSCALE_1 = r3
            int[] r3 = new int[r4]
            r3[r6] = r10
            androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_GREYSCALE_2 = r3
            byte[] r3 = new byte[r1]
            r3 = {x0cde: FILL_ARRAY_DATA , data: [-1, -40, -1} // fill-array
            androidx.exifinterface.media.ExifInterface.JPEG_SIGNATURE = r3
            byte[] r3 = new byte[r0]
            r3 = {x0ce4: FILL_ARRAY_DATA , data: [102, 116, 121, 112} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_TYPE_FTYP = r3
            byte[] r3 = new byte[r0]
            r3 = {x0cea: FILL_ARRAY_DATA , data: [109, 105, 102, 49} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_BRAND_MIF1 = r3
            byte[] r3 = new byte[r0]
            r3 = {x0cf0: FILL_ARRAY_DATA , data: [104, 101, 105, 99} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_BRAND_HEIC = r3
            byte[] r3 = new byte[r7]
            r3 = {x0cf6: FILL_ARRAY_DATA , data: [79, 76, 89, 77, 80, 0} // fill-array
            androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_1 = r3
            r3 = 10
            byte[] r12 = new byte[r3]
            r12 = {x0cfe: FILL_ARRAY_DATA , data: [79, 76, 89, 77, 80, 85, 83, 0, 73, 73} // fill-array
            androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_2 = r12
            byte[] r12 = new byte[r10]
            r12 = {x0d08: FILL_ARRAY_DATA , data: [-119, 80, 78, 71, 13, 10, 26, 10} // fill-array
            androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE = r12
            byte[] r12 = new byte[r0]
            r12 = {x0d10: FILL_ARRAY_DATA , data: [101, 88, 73, 102} // fill-array
            androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_EXIF = r12
            byte[] r12 = new byte[r0]
            r12 = {x0d16: FILL_ARRAY_DATA , data: [73, 72, 68, 82} // fill-array
            androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_IHDR = r12
            byte[] r12 = new byte[r0]
            r12 = {x0d1c: FILL_ARRAY_DATA , data: [73, 69, 78, 68} // fill-array
            androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_IEND = r12
            byte[] r12 = new byte[r0]
            r12 = {x0d22: FILL_ARRAY_DATA , data: [82, 73, 70, 70} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1 = r12
            byte[] r12 = new byte[r0]
            r12 = {x0d28: FILL_ARRAY_DATA , data: [87, 69, 66, 80} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2 = r12
            byte[] r12 = new byte[r0]
            r12 = {x0d2e: FILL_ARRAY_DATA , data: [69, 88, 73, 70} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_EXIF = r12
            byte[] r12 = new byte[r1]
            r12 = {x0d34: FILL_ARRAY_DATA , data: [-99, 1, 42} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_VP8_SIGNATURE = r12
            java.nio.charset.Charset r12 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r3 = "VP8X"
            byte[] r3 = r3.getBytes(r12)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8X = r3
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "VP8L"
            byte[] r3 = r12.getBytes(r3)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L = r3
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "VP8 "
            byte[] r3 = r12.getBytes(r3)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8 = r3
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "ANIM"
            byte[] r3 = r12.getBytes(r3)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANIM = r3
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "ANMF"
            byte[] r3 = r12.getBytes(r3)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANMF = r3
            java.lang.String r16 = ""
            java.lang.String r17 = "BYTE"
            java.lang.String r18 = "STRING"
            java.lang.String r19 = "USHORT"
            java.lang.String r20 = "ULONG"
            java.lang.String r21 = "URATIONAL"
            java.lang.String r22 = "SBYTE"
            java.lang.String r23 = "UNDEFINED"
            java.lang.String r24 = "SSHORT"
            java.lang.String r25 = "SLONG"
            java.lang.String r26 = "SRATIONAL"
            java.lang.String r27 = "SINGLE"
            java.lang.String r28 = "DOUBLE"
            java.lang.String r29 = "IFD"
            java.lang.String[] r3 = new java.lang.String[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES = r3
            r3 = 14
            int[] r12 = new int[r3]
            r12 = {x0d3a: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1} // fill-array
            androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT = r12
            byte[] r12 = new byte[r10]
            r12 = {x0d5a: FILL_ARRAY_DATA , data: [65, 83, 67, 73, 73, 0, 0, 0} // fill-array
            androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX = r12
            r12 = 42
            androidx.exifinterface.media.ExifInterface$ExifTag[] r12 = new androidx.exifinterface.media.ExifInterface.ExifTag[r12]
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "NewSubfileType"
            r7 = 254(0xfe, float:3.56E-43)
            r3.<init>(r10, r7, r0)
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "SubfileType"
            r10 = 255(0xff, float:3.57E-43)
            r3.<init>(r7, r10, r0)
            r12[r4] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "ImageWidth"
            r10 = 256(0x100, float:3.59E-43)
            r3.<init>(r7, r10, r1, r0)
            r12[r8] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "ImageLength"
            r10 = 257(0x101, float:3.6E-43)
            r3.<init>(r7, r10, r1, r0)
            r12[r1] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "BitsPerSample"
            r10 = 258(0x102, float:3.62E-43)
            r3.<init>(r7, r10, r1)
            r12[r0] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "Compression"
            r10 = 259(0x103, float:3.63E-43)
            r3.<init>(r7, r10, r1)
            r12[r14] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "PhotometricInterpretation"
            r10 = 262(0x106, float:3.67E-43)
            r3.<init>(r7, r10, r1)
            r7 = 6
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "ImageDescription"
            r10 = 270(0x10e, float:3.78E-43)
            r3.<init>(r7, r10, r8)
            r7 = 7
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "Make"
            r10 = 271(0x10f, float:3.8E-43)
            r3.<init>(r7, r10, r8)
            r7 = 8
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "Model"
            r10 = 272(0x110, float:3.81E-43)
            r3.<init>(r7, r10, r8)
            r7 = 9
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "StripOffsets"
            r7 = 273(0x111, float:3.83E-43)
            r3.<init>(r10, r7, r1, r0)
            r7 = 10
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "Orientation"
            r10 = 274(0x112, float:3.84E-43)
            r3.<init>(r7, r10, r1)
            r7 = 11
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "SamplesPerPixel"
            r7 = 277(0x115, float:3.88E-43)
            r3.<init>(r10, r7, r1)
            r7 = 12
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "RowsPerStrip"
            r7 = 278(0x116, float:3.9E-43)
            r3.<init>(r10, r7, r1, r0)
            r7 = 13
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "StripByteCounts"
            r7 = 279(0x117, float:3.91E-43)
            r3.<init>(r10, r7, r1, r0)
            r7 = 14
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "XResolution"
            r10 = 282(0x11a, float:3.95E-43)
            r3.<init>(r7, r10, r14)
            r7 = 15
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "YResolution"
            r7 = 283(0x11b, float:3.97E-43)
            r3.<init>(r10, r7, r14)
            r7 = 16
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "PlanarConfiguration"
            r7 = 284(0x11c, float:3.98E-43)
            r3.<init>(r10, r7, r1)
            r7 = 17
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "ResolutionUnit"
            r7 = 296(0x128, float:4.15E-43)
            r3.<init>(r10, r7, r1)
            r7 = 18
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "TransferFunction"
            r7 = 301(0x12d, float:4.22E-43)
            r3.<init>(r10, r7, r1)
            r7 = 19
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "Software"
            r7 = 305(0x131, float:4.27E-43)
            r3.<init>(r10, r7, r8)
            r7 = 20
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "DateTime"
            r7 = 306(0x132, float:4.29E-43)
            r3.<init>(r10, r7, r8)
            r7 = 21
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "Artist"
            r10 = 315(0x13b, float:4.41E-43)
            r3.<init>(r7, r10, r8)
            r7 = 22
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "WhitePoint"
            r10 = 318(0x13e, float:4.46E-43)
            r3.<init>(r7, r10, r14)
            r7 = 23
            r12[r7] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "PrimaryChromaticities"
            r6 = 319(0x13f, float:4.47E-43)
            r3.<init>(r10, r6, r14)
            r6 = 24
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubIFDPointer"
            r10 = 330(0x14a, float:4.62E-43)
            r3.<init>(r6, r10, r0)
            r6 = 25
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "JPEGInterchangeFormat"
            r10 = 513(0x201, float:7.19E-43)
            r3.<init>(r6, r10, r0)
            r6 = 26
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "JPEGInterchangeFormatLength"
            r10 = 514(0x202, float:7.2E-43)
            r3.<init>(r6, r10, r0)
            r6 = 27
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "YCbCrCoefficients"
            r10 = 529(0x211, float:7.41E-43)
            r3.<init>(r6, r10, r14)
            r6 = 28
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "YCbCrSubSampling"
            r10 = 530(0x212, float:7.43E-43)
            r3.<init>(r6, r10, r1)
            r6 = 29
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "YCbCrPositioning"
            r10 = 531(0x213, float:7.44E-43)
            r3.<init>(r6, r10, r1)
            r6 = 30
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ReferenceBlackWhite"
            r10 = 532(0x214, float:7.45E-43)
            r3.<init>(r6, r10, r14)
            r6 = 31
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Copyright"
            r10 = 33432(0x8298, float:4.6848E-41)
            r3.<init>(r6, r10, r8)
            r6 = 32
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ExifIFDPointer"
            r10 = 34665(0x8769, float:4.8576E-41)
            r3.<init>(r6, r10, r0)
            r6 = 33
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSInfoIFDPointer"
            r10 = 34853(0x8825, float:4.884E-41)
            r3.<init>(r6, r10, r0)
            r6 = 34
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SensorTopBorder"
            r3.<init>(r6, r0, r0)
            r6 = 35
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SensorLeftBorder"
            r3.<init>(r6, r14, r0)
            r6 = 36
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SensorBottomBorder"
            r10 = 6
            r3.<init>(r6, r10, r0)
            r6 = 37
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SensorRightBorder"
            r10 = 7
            r3.<init>(r6, r10, r0)
            r6 = 38
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ISO"
            r3.<init>(r6, r7, r1)
            r6 = 39
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "JpgFromRaw"
            r7 = 46
            r3.<init>(r6, r7, r10)
            r6 = 40
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface$ExifTag r3 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Xmp"
            r7 = 700(0x2bc, float:9.81E-43)
            r3.<init>(r6, r7, r4)
            r6 = 41
            r12[r6] = r3
            androidx.exifinterface.media.ExifInterface.IFD_TIFF_TAGS = r12
            r3 = 74
            androidx.exifinterface.media.ExifInterface$ExifTag[] r3 = new androidx.exifinterface.media.ExifInterface.ExifTag[r3]
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "ExposureTime"
            r10 = 33434(0x829a, float:4.6851E-41)
            r6.<init>(r7, r10, r14)
            r7 = 0
            r3[r7] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "FNumber"
            r10 = 33437(0x829d, float:4.6855E-41)
            r6.<init>(r7, r10, r14)
            r3[r4] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "ExposureProgram"
            r10 = 34850(0x8822, float:4.8835E-41)
            r6.<init>(r7, r10, r1)
            r3[r8] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "SpectralSensitivity"
            r10 = 34852(0x8824, float:4.8838E-41)
            r6.<init>(r7, r10, r8)
            r3[r1] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "PhotographicSensitivity"
            r10 = 34855(0x8827, float:4.8842E-41)
            r6.<init>(r7, r10, r1)
            r3[r0] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "OECF"
            r10 = 34856(0x8828, float:4.8844E-41)
            r4 = 7
            r6.<init>(r7, r10, r4)
            r3[r14] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "SensitivityType"
            r10 = 34864(0x8830, float:4.8855E-41)
            r6.<init>(r7, r10, r1)
            r7 = 6
            r3[r7] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "StandardOutputSensitivity"
            r10 = 34865(0x8831, float:4.8856E-41)
            r6.<init>(r7, r10, r0)
            r3[r4] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "RecommendedExposureIndex"
            r7 = 34866(0x8832, float:4.8858E-41)
            r4.<init>(r6, r7, r0)
            r6 = 8
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ISOSpeed"
            r7 = 34867(0x8833, float:4.8859E-41)
            r4.<init>(r6, r7, r0)
            r6 = 9
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ISOSpeedLatitudeyyy"
            r7 = 34868(0x8834, float:4.886E-41)
            r4.<init>(r6, r7, r0)
            r6 = 10
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ISOSpeedLatitudezzz"
            r7 = 34869(0x8835, float:4.8862E-41)
            r4.<init>(r6, r7, r0)
            r6 = 11
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ExifVersion"
            r7 = 36864(0x9000, float:5.1657E-41)
            r4.<init>(r6, r7, r8)
            r6 = 12
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "DateTimeOriginal"
            r7 = 36867(0x9003, float:5.1662E-41)
            r4.<init>(r6, r7, r8)
            r6 = 13
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "DateTimeDigitized"
            r7 = 36868(0x9004, float:5.1663E-41)
            r4.<init>(r6, r7, r8)
            r6 = 14
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "OffsetTime"
            r7 = 36880(0x9010, float:5.168E-41)
            r4.<init>(r6, r7, r8)
            r6 = 15
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "OffsetTimeOriginal"
            r7 = 36881(0x9011, float:5.1681E-41)
            r4.<init>(r6, r7, r8)
            r6 = 16
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "OffsetTimeDigitized"
            r7 = 36882(0x9012, float:5.1683E-41)
            r4.<init>(r6, r7, r8)
            r6 = 17
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ComponentsConfiguration"
            r7 = 37121(0x9101, float:5.2018E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 18
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "CompressedBitsPerPixel"
            r7 = 37122(0x9102, float:5.2019E-41)
            r4.<init>(r6, r7, r14)
            r6 = 19
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ShutterSpeedValue"
            r7 = 37377(0x9201, float:5.2376E-41)
            r10 = 10
            r4.<init>(r6, r7, r10)
            r6 = 20
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ApertureValue"
            r7 = 37378(0x9202, float:5.2378E-41)
            r4.<init>(r6, r7, r14)
            r6 = 21
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "BrightnessValue"
            r7 = 37379(0x9203, float:5.2379E-41)
            r4.<init>(r6, r7, r10)
            r6 = 22
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ExposureBiasValue"
            r7 = 37380(0x9204, float:5.238E-41)
            r4.<init>(r6, r7, r10)
            r6 = 23
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "MaxApertureValue"
            r7 = 37381(0x9205, float:5.2382E-41)
            r4.<init>(r6, r7, r14)
            r6 = 24
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubjectDistance"
            r7 = 37382(0x9206, float:5.2383E-41)
            r4.<init>(r6, r7, r14)
            r6 = 25
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "MeteringMode"
            r7 = 37383(0x9207, float:5.2385E-41)
            r4.<init>(r6, r7, r1)
            r6 = 26
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "LightSource"
            r7 = 37384(0x9208, float:5.2386E-41)
            r4.<init>(r6, r7, r1)
            r6 = 27
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Flash"
            r7 = 37385(0x9209, float:5.2388E-41)
            r4.<init>(r6, r7, r1)
            r6 = 28
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FocalLength"
            r7 = 37386(0x920a, float:5.2389E-41)
            r4.<init>(r6, r7, r14)
            r6 = 29
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubjectArea"
            r7 = 37396(0x9214, float:5.2403E-41)
            r4.<init>(r6, r7, r1)
            r6 = 30
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "MakerNote"
            r7 = 37500(0x927c, float:5.2549E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 31
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "UserComment"
            r7 = 37510(0x9286, float:5.2563E-41)
            r4.<init>(r6, r7, r10)
            r6 = 32
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubSecTime"
            r7 = 37520(0x9290, float:5.2577E-41)
            r4.<init>(r6, r7, r8)
            r6 = 33
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubSecTimeOriginal"
            r7 = 37521(0x9291, float:5.2578E-41)
            r4.<init>(r6, r7, r8)
            r6 = 34
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubSecTimeDigitized"
            r7 = 37522(0x9292, float:5.258E-41)
            r4.<init>(r6, r7, r8)
            r6 = 35
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FlashpixVersion"
            r7 = 40960(0xa000, float:5.7397E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 36
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ColorSpace"
            r7 = 40961(0xa001, float:5.7399E-41)
            r4.<init>(r6, r7, r1)
            r6 = 37
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "PixelXDimension"
            r7 = 40962(0xa002, float:5.74E-41)
            r4.<init>(r6, r7, r1, r0)
            r6 = 38
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "PixelYDimension"
            r7 = 40963(0xa003, float:5.7401E-41)
            r4.<init>(r6, r7, r1, r0)
            r6 = 39
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "RelatedSoundFile"
            r7 = 40964(0xa004, float:5.7403E-41)
            r4.<init>(r6, r7, r8)
            r6 = 40
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "InteroperabilityIFDPointer"
            r7 = 40965(0xa005, float:5.7404E-41)
            r4.<init>(r6, r7, r0)
            r6 = 41
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FlashEnergy"
            r7 = 41483(0xa20b, float:5.813E-41)
            r4.<init>(r6, r7, r14)
            r6 = 42
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SpatialFrequencyResponse"
            r7 = 41484(0xa20c, float:5.8131E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 43
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FocalPlaneXResolution"
            r7 = 41486(0xa20e, float:5.8134E-41)
            r4.<init>(r6, r7, r14)
            r6 = 44
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FocalPlaneYResolution"
            r7 = 41487(0xa20f, float:5.8136E-41)
            r4.<init>(r6, r7, r14)
            r6 = 45
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FocalPlaneResolutionUnit"
            r7 = 41488(0xa210, float:5.8137E-41)
            r4.<init>(r6, r7, r1)
            r6 = 46
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubjectLocation"
            r7 = 41492(0xa214, float:5.8143E-41)
            r4.<init>(r6, r7, r1)
            r6 = 47
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ExposureIndex"
            r7 = 41493(0xa215, float:5.8144E-41)
            r4.<init>(r6, r7, r14)
            r6 = 48
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SensingMethod"
            r7 = 41495(0xa217, float:5.8147E-41)
            r4.<init>(r6, r7, r1)
            r6 = 49
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FileSource"
            r7 = 41728(0xa300, float:5.8473E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 50
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SceneType"
            r7 = 41729(0xa301, float:5.8475E-41)
            r4.<init>(r6, r7, r10)
            r6 = 51
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "CFAPattern"
            r7 = 41730(0xa302, float:5.8476E-41)
            r4.<init>(r6, r7, r10)
            r6 = 52
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "CustomRendered"
            r7 = 41985(0xa401, float:5.8834E-41)
            r4.<init>(r6, r7, r1)
            r6 = 53
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ExposureMode"
            r7 = 41986(0xa402, float:5.8835E-41)
            r4.<init>(r6, r7, r1)
            r6 = 54
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "WhiteBalance"
            r7 = 41987(0xa403, float:5.8836E-41)
            r4.<init>(r6, r7, r1)
            r6 = 55
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "DigitalZoomRatio"
            r7 = 41988(0xa404, float:5.8838E-41)
            r4.<init>(r6, r7, r14)
            r6 = 56
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "FocalLengthIn35mmFilm"
            r7 = 41989(0xa405, float:5.8839E-41)
            r4.<init>(r6, r7, r1)
            r6 = 57
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SceneCaptureType"
            r7 = 41990(0xa406, float:5.884E-41)
            r4.<init>(r6, r7, r1)
            r6 = 58
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GainControl"
            r7 = 41991(0xa407, float:5.8842E-41)
            r4.<init>(r6, r7, r1)
            r6 = 59
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Contrast"
            r7 = 41992(0xa408, float:5.8843E-41)
            r4.<init>(r6, r7, r1)
            r6 = 60
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Saturation"
            r7 = 41993(0xa409, float:5.8845E-41)
            r4.<init>(r6, r7, r1)
            r6 = 61
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Sharpness"
            r7 = 41994(0xa40a, float:5.8846E-41)
            r4.<init>(r6, r7, r1)
            r6 = 62
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "DeviceSettingDescription"
            r7 = 41995(0xa40b, float:5.8848E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 63
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "SubjectDistanceRange"
            r7 = 41996(0xa40c, float:5.8849E-41)
            r4.<init>(r6, r7, r1)
            r6 = 64
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ImageUniqueID"
            r7 = 42016(0xa420, float:5.8877E-41)
            r4.<init>(r6, r7, r8)
            r6 = 65
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "CameraOwnerName"
            r7 = 42032(0xa430, float:5.89E-41)
            r4.<init>(r6, r7, r8)
            r6 = 66
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "BodySerialNumber"
            r7 = 42033(0xa431, float:5.8901E-41)
            r4.<init>(r6, r7, r8)
            r6 = 67
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "LensSpecification"
            r7 = 42034(0xa432, float:5.8902E-41)
            r4.<init>(r6, r7, r14)
            r6 = 68
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "LensMake"
            r7 = 42035(0xa433, float:5.8904E-41)
            r4.<init>(r6, r7, r8)
            r6 = 69
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "LensModel"
            r7 = 42036(0xa434, float:5.8905E-41)
            r4.<init>(r6, r7, r8)
            r6 = 70
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Gamma"
            r7 = 42240(0xa500, float:5.9191E-41)
            r4.<init>(r6, r7, r14)
            r6 = 71
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "DNGVersion"
            r7 = 50706(0xc612, float:7.1054E-41)
            r10 = 1
            r4.<init>(r6, r7, r10)
            r6 = 72
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "DefaultCropSize"
            r7 = 50720(0xc620, float:7.1074E-41)
            r4.<init>(r6, r7, r1, r0)
            r6 = 73
            r3[r6] = r4
            androidx.exifinterface.media.ExifInterface.IFD_EXIF_TAGS = r3
            r4 = 32
            androidx.exifinterface.media.ExifInterface$ExifTag[] r4 = new androidx.exifinterface.media.ExifInterface.ExifTag[r4]
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "GPSVersionID"
            r0 = 1
            r10 = 0
            r6.<init>(r7, r10, r0)
            r4[r10] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r7 = "GPSLatitudeRef"
            r6.<init>(r7, r0, r8)
            r4[r0] = r6
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSLatitude"
            r7 = 10
            r0.<init>(r6, r8, r14, r7)
            r4[r8] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSLongitudeRef"
            r0.<init>(r6, r1, r8)
            r4[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSLongitude"
            r10 = 4
            r0.<init>(r6, r10, r14, r7)
            r4[r10] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSAltitudeRef"
            r7 = 1
            r0.<init>(r6, r14, r7)
            r4[r14] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSAltitude"
            r7 = 6
            r0.<init>(r6, r7, r14)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSTimeStamp"
            r7 = 7
            r0.<init>(r6, r7, r14)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSSatellites"
            r7 = 8
            r0.<init>(r6, r7, r8)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSStatus"
            r7 = 9
            r0.<init>(r6, r7, r8)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSMeasureMode"
            r7 = 10
            r0.<init>(r6, r7, r8)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDOP"
            r7 = 11
            r0.<init>(r6, r7, r14)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSSpeedRef"
            r7 = 12
            r0.<init>(r6, r7, r8)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSSpeed"
            r7 = 13
            r0.<init>(r6, r7, r14)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSTrackRef"
            r7 = 14
            r0.<init>(r6, r7, r8)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSTrack"
            r7 = 15
            r0.<init>(r6, r7, r14)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSImgDirectionRef"
            r7 = 16
            r0.<init>(r6, r7, r8)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSImgDirection"
            r7 = 17
            r0.<init>(r6, r7, r14)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSMapDatum"
            r7 = 18
            r0.<init>(r6, r7, r8)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestLatitudeRef"
            r7 = 19
            r0.<init>(r6, r7, r8)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestLatitude"
            r7 = 20
            r0.<init>(r6, r7, r14)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestLongitudeRef"
            r7 = 21
            r0.<init>(r6, r7, r8)
            r6 = 21
            r4[r6] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestLongitude"
            r7 = 22
            r0.<init>(r6, r7, r14)
            r6 = 22
            r4[r6] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestBearingRef"
            r7 = 23
            r0.<init>(r6, r7, r8)
            r4[r7] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestBearing"
            r7 = 24
            r0.<init>(r6, r7, r14)
            r6 = 24
            r4[r6] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestDistanceRef"
            r7 = 25
            r0.<init>(r6, r7, r8)
            r6 = 25
            r4[r6] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDestDistance"
            r7 = 26
            r0.<init>(r6, r7, r14)
            r6 = 26
            r4[r6] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSProcessingMethod"
            r7 = 27
            r10 = 7
            r0.<init>(r6, r7, r10)
            r6 = 27
            r4[r6] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSAreaInformation"
            r7 = 28
            r0.<init>(r6, r7, r10)
            r6 = 28
            r4[r6] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDateStamp"
            r7 = 29
            r0.<init>(r6, r7, r8)
            r6 = 29
            r4[r6] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSDifferential"
            r7 = 30
            r0.<init>(r6, r7, r1)
            r6 = 30
            r4[r6] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "GPSHPositioningError"
            r7 = 31
            r0.<init>(r6, r7, r14)
            r6 = 31
            r4[r6] = r0
            androidx.exifinterface.media.ExifInterface.IFD_GPS_TAGS = r4
            r0 = 1
            androidx.exifinterface.media.ExifInterface$ExifTag[] r6 = new androidx.exifinterface.media.ExifInterface.ExifTag[r0]
            androidx.exifinterface.media.ExifInterface$ExifTag r7 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "InteroperabilityIndex"
            r7.<init>(r10, r0, r8)
            r0 = 0
            r6[r0] = r7
            androidx.exifinterface.media.ExifInterface.IFD_INTEROPERABILITY_TAGS = r6
            r7 = 37
            androidx.exifinterface.media.ExifInterface$ExifTag[] r7 = new androidx.exifinterface.media.ExifInterface.ExifTag[r7]
            androidx.exifinterface.media.ExifInterface$ExifTag r10 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "NewSubfileType"
            r8 = 254(0xfe, float:3.56E-43)
            r1 = 4
            r10.<init>(r14, r8, r1)
            r7[r0] = r10
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "SubfileType"
            r10 = 255(0xff, float:3.57E-43)
            r0.<init>(r8, r10, r1)
            r8 = 1
            r7[r8] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "ThumbnailImageWidth"
            r10 = 256(0x100, float:3.59E-43)
            r14 = 3
            r0.<init>(r8, r10, r14, r1)
            r8 = 2
            r7[r8] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "ThumbnailImageLength"
            r10 = 257(0x101, float:3.6E-43)
            r0.<init>(r8, r10, r14, r1)
            r7[r14] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "BitsPerSample"
            r10 = 258(0x102, float:3.62E-43)
            r0.<init>(r8, r10, r14)
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "Compression"
            r8 = 259(0x103, float:3.63E-43)
            r0.<init>(r1, r8, r14)
            r1 = 5
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "PhotometricInterpretation"
            r8 = 262(0x106, float:3.67E-43)
            r0.<init>(r1, r8, r14)
            r1 = 6
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "ImageDescription"
            r8 = 270(0x10e, float:3.78E-43)
            r10 = 2
            r0.<init>(r1, r8, r10)
            r1 = 7
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "Make"
            r8 = 271(0x10f, float:3.8E-43)
            r0.<init>(r1, r8, r10)
            r1 = 8
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "Model"
            r8 = 272(0x110, float:3.81E-43)
            r0.<init>(r1, r8, r10)
            r1 = 9
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "StripOffsets"
            r8 = 273(0x111, float:3.83E-43)
            r10 = 4
            r14 = 3
            r0.<init>(r1, r8, r14, r10)
            r1 = 10
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "ThumbnailOrientation"
            r8 = 274(0x112, float:3.84E-43)
            r0.<init>(r1, r8, r14)
            r1 = 11
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "SamplesPerPixel"
            r8 = 277(0x115, float:3.88E-43)
            r0.<init>(r1, r8, r14)
            r1 = 12
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "RowsPerStrip"
            r8 = 278(0x116, float:3.9E-43)
            r10 = 4
            r0.<init>(r1, r8, r14, r10)
            r1 = 13
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "StripByteCounts"
            r8 = 279(0x117, float:3.91E-43)
            r0.<init>(r1, r8, r14, r10)
            r1 = 14
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "XResolution"
            r8 = 282(0x11a, float:3.95E-43)
            r10 = 5
            r0.<init>(r1, r8, r10)
            r1 = 15
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "YResolution"
            r8 = 283(0x11b, float:3.97E-43)
            r0.<init>(r1, r8, r10)
            r1 = 16
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "PlanarConfiguration"
            r8 = 284(0x11c, float:3.98E-43)
            r10 = 3
            r0.<init>(r1, r8, r10)
            r1 = 17
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "ResolutionUnit"
            r8 = 296(0x128, float:4.15E-43)
            r0.<init>(r1, r8, r10)
            r1 = 18
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "TransferFunction"
            r8 = 301(0x12d, float:4.22E-43)
            r0.<init>(r1, r8, r10)
            r1 = 19
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "Software"
            r8 = 305(0x131, float:4.27E-43)
            r10 = 2
            r0.<init>(r1, r8, r10)
            r1 = 20
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "DateTime"
            r8 = 306(0x132, float:4.29E-43)
            r0.<init>(r1, r8, r10)
            r1 = 21
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "Artist"
            r8 = 315(0x13b, float:4.41E-43)
            r0.<init>(r1, r8, r10)
            r1 = 22
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "WhitePoint"
            r8 = 318(0x13e, float:4.46E-43)
            r10 = 5
            r0.<init>(r1, r8, r10)
            r1 = 23
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "PrimaryChromaticities"
            r8 = 319(0x13f, float:4.47E-43)
            r0.<init>(r1, r8, r10)
            r1 = 24
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "SubIFDPointer"
            r8 = 330(0x14a, float:4.62E-43)
            r10 = 4
            r0.<init>(r1, r8, r10)
            r1 = 25
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "JPEGInterchangeFormat"
            r8 = 513(0x201, float:7.19E-43)
            r0.<init>(r1, r8, r10)
            r1 = 26
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "JPEGInterchangeFormatLength"
            r8 = 514(0x202, float:7.2E-43)
            r0.<init>(r1, r8, r10)
            r1 = 27
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "YCbCrCoefficients"
            r8 = 529(0x211, float:7.41E-43)
            r10 = 5
            r0.<init>(r1, r8, r10)
            r1 = 28
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "YCbCrSubSampling"
            r8 = 530(0x212, float:7.43E-43)
            r10 = 3
            r0.<init>(r1, r8, r10)
            r1 = 29
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "YCbCrPositioning"
            r8 = 531(0x213, float:7.44E-43)
            r0.<init>(r1, r8, r10)
            r1 = 30
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "ReferenceBlackWhite"
            r8 = 532(0x214, float:7.45E-43)
            r10 = 5
            r0.<init>(r1, r8, r10)
            r1 = 31
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "Copyright"
            r8 = 33432(0x8298, float:4.6848E-41)
            r10 = 2
            r0.<init>(r1, r8, r10)
            r1 = 32
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "ExifIFDPointer"
            r8 = 34665(0x8769, float:4.8576E-41)
            r10 = 4
            r0.<init>(r1, r8, r10)
            r1 = 33
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "GPSInfoIFDPointer"
            r8 = 34853(0x8825, float:4.884E-41)
            r0.<init>(r1, r8, r10)
            r1 = 34
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "DNGVersion"
            r8 = 50706(0xc612, float:7.1054E-41)
            r10 = 1
            r0.<init>(r1, r8, r10)
            r1 = 35
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "DefaultCropSize"
            r8 = 50720(0xc620, float:7.1074E-41)
            r10 = 4
            r14 = 3
            r0.<init>(r1, r8, r14, r10)
            r1 = 36
            r7[r1] = r0
            androidx.exifinterface.media.ExifInterface.IFD_THUMBNAIL_TAGS = r7
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "StripOffsets"
            r8 = 273(0x111, float:3.83E-43)
            r0.<init>(r1, r8, r14)
            androidx.exifinterface.media.ExifInterface.TAG_RAF_IMAGE_SIZE = r0
            androidx.exifinterface.media.ExifInterface$ExifTag[] r0 = new androidx.exifinterface.media.ExifInterface.ExifTag[r14]
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "ThumbnailImage"
            r10 = 256(0x100, float:3.59E-43)
            r14 = 7
            r1.<init>(r8, r10, r14)
            r8 = 0
            r0[r8] = r1
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "CameraSettingsIFDPointer"
            r10 = 8224(0x2020, float:1.1524E-41)
            r14 = 4
            r1.<init>(r8, r10, r14)
            r8 = 1
            r0[r8] = r1
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r8 = "ImageProcessingIFDPointer"
            r10 = 8256(0x2040, float:1.1569E-41)
            r1.<init>(r8, r10, r14)
            r8 = 2
            r0[r8] = r1
            androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_TAGS = r0
            androidx.exifinterface.media.ExifInterface$ExifTag[] r1 = new androidx.exifinterface.media.ExifInterface.ExifTag[r8]
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "PreviewImageStart"
            r16 = r11
            r11 = 257(0x101, float:3.6E-43)
            r8.<init>(r10, r11, r14)
            r10 = 0
            r1[r10] = r8
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "PreviewImageLength"
            r11 = 258(0x102, float:3.62E-43)
            r8.<init>(r10, r11, r14)
            r10 = 1
            r1[r10] = r8
            androidx.exifinterface.media.ExifInterface.ORF_CAMERA_SETTINGS_TAGS = r1
            androidx.exifinterface.media.ExifInterface$ExifTag[] r8 = new androidx.exifinterface.media.ExifInterface.ExifTag[r10]
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r14 = "AspectFrame"
            r10 = 4371(0x1113, float:6.125E-42)
            r20 = r13
            r13 = 3
            r11.<init>(r14, r10, r13)
            r10 = 0
            r8[r10] = r11
            androidx.exifinterface.media.ExifInterface.ORF_IMAGE_PROCESSING_TAGS = r8
            r11 = 1
            androidx.exifinterface.media.ExifInterface$ExifTag[] r14 = new androidx.exifinterface.media.ExifInterface.ExifTag[r11]
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r10 = "ColorSpace"
            r21 = r2
            r2 = 55
            r11.<init>(r10, r2, r13)
            r2 = 0
            r14[r2] = r11
            androidx.exifinterface.media.ExifInterface.PEF_TAGS = r14
            r10 = 10
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r10 = new androidx.exifinterface.media.ExifInterface.ExifTag[r10][]
            r10[r2] = r12
            r2 = 1
            r10[r2] = r3
            r2 = 2
            r10[r2] = r4
            r10[r13] = r6
            r2 = 4
            r10[r2] = r7
            r3 = 5
            r10[r3] = r12
            r3 = 6
            r10[r3] = r0
            r0 = 7
            r10[r0] = r1
            r0 = 8
            r10[r0] = r8
            r0 = 9
            r10[r0] = r14
            androidx.exifinterface.media.ExifInterface.EXIF_TAGS = r10
            androidx.exifinterface.media.ExifInterface$ExifTag[] r0 = new androidx.exifinterface.media.ExifInterface.ExifTag[r3]
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r3 = "SubIFDPointer"
            r4 = 330(0x14a, float:4.62E-43)
            r1.<init>(r3, r4, r2)
            r3 = 0
            r0[r3] = r1
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r3 = "ExifIFDPointer"
            r4 = 34665(0x8769, float:4.8576E-41)
            r1.<init>(r3, r4, r2)
            r3 = 1
            r0[r3] = r1
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r3 = "GPSInfoIFDPointer"
            r4 = 34853(0x8825, float:4.884E-41)
            r1.<init>(r3, r4, r2)
            r3 = 2
            r0[r3] = r1
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r3 = "InteroperabilityIFDPointer"
            r4 = 40965(0xa005, float:5.7404E-41)
            r1.<init>(r3, r4, r2)
            r3 = 3
            r0[r3] = r1
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r3 = "CameraSettingsIFDPointer"
            r4 = 8224(0x2020, float:1.1524E-41)
            r6 = 1
            r1.<init>(r3, r4, r6)
            r0[r2] = r1
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r2 = "ImageProcessingIFDPointer"
            r3 = 8256(0x2040, float:1.1569E-41)
            r1.<init>(r2, r3, r6)
            r2 = 5
            r0[r2] = r1
            androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS = r0
            int r0 = r10.length
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading = r0
            int r0 = r10.length
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "FNumber"
            java.lang.String r2 = "DigitalZoomRatio"
            java.lang.String r3 = "ExposureTime"
            java.lang.String r4 = "SubjectDistance"
            java.lang.String r6 = "GPSTimeStamp"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r6}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.exifinterface.media.ExifInterface.sTagSetForCompatibility = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.exifinterface.media.ExifInterface.sExifPointerTagMap = r0
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            androidx.exifinterface.media.ExifInterface.ASCII = r0
            java.lang.String r1 = "Exif\u0000\u0000"
            byte[] r1 = r1.getBytes(r0)
            androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1 = r1
            java.lang.String r1 = "http://ns.adobe.com/xap/1.0/\u0000"
            byte[] r0 = r1.getBytes(r0)
            androidx.exifinterface.media.ExifInterface.IDENTIFIER_XMP_APP1 = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "yyyy:MM:dd HH:mm:ss"
            r0.<init>(r2, r1)
            androidx.exifinterface.media.ExifInterface.sFormatterPrimary = r0
            java.lang.String r2 = "UTC"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            r0.setTimeZone(r2)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r2, r1)
            androidx.exifinterface.media.ExifInterface.sFormatterSecondary = r0
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            r7 = 0
        Lc25:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            if (r7 >= r1) goto Lc60
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r1 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1[r7] = r2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r1 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1[r7] = r2
            r0 = r0[r7]
            int r1 = r0.length
            r2 = 0
        Lc40:
            if (r2 >= r1) goto Lc5d
            r3 = r0[r2]
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r4 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading
            r4 = r4[r7]
            int r6 = r3.number
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r4 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            r4 = r4[r7]
            java.lang.String r6 = r3.name
            r4.put(r6, r3)
            int r2 = r2 + 1
            goto Lc40
        Lc5d:
            int r7 = r7 + 1
            goto Lc25
        Lc60:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = androidx.exifinterface.media.ExifInterface.sExifPointerTagMap
            androidx.exifinterface.media.ExifInterface$ExifTag[] r1 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r2 = 0
            r2 = r1[r2]
            int r2 = r2.number
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r15)
            r2 = 1
            r2 = r1[r2]
            int r2 = r2.number
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r5)
            r2 = 2
            r2 = r1[r2]
            int r2 = r2.number
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r9)
            r2 = 3
            r2 = r1[r2]
            int r2 = r2.number
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r21
            r0.put(r2, r3)
            r2 = 4
            r2 = r1[r2]
            int r2 = r2.number
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r20
            r0.put(r2, r3)
            r2 = 5
            r1 = r1[r2]
            int r1 = r1.number
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r16
            r0.put(r1, r2)
            java.lang.String r0 = ".*[1-9].*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.NON_ZERO_TIME_PATTERN = r0
            java.lang.String r0 = "^(\\d{2}):(\\d{2}):(\\d{2})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.GPS_TIMESTAMP_PATTERN = r0
            java.lang.String r0 = "^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.DATETIME_PRIMARY_FORMAT_PATTERN = r0
            java.lang.String r0 = "^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.DATETIME_SECONDARY_FORMAT_PATTERN = r0
            return
    }

    public ExifInterface(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ExifInterface(java.io.InputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.mExifByteOrder = r0
            java.lang.String r0 = "inputStream cannot be null"
            java.util.Objects.requireNonNull(r4, r0)
            r0 = 0
            r3.mFilename = r0
            r1 = 1
            if (r5 != r1) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            if (r5 == 0) goto L44
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            byte[] r2 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            int r2 = r2.length
            r5.<init>(r4, r2)
            boolean r4 = isExifDataOnly(r5)
            if (r4 != 0) goto L3c
            java.lang.String r4 = "ExifInterface"
            java.lang.String r5 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r4, r5)
            return
        L3c:
            r3.mIsExifDataOnly = r1
            r3.mAssetInputStream = r0
            r3.mSeekableFileDescriptor = r0
            r4 = r5
            goto L6e
        L44:
            boolean r5 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r5 == 0) goto L50
            r5 = r4
            android.content.res.AssetManager$AssetInputStream r5 = (android.content.res.AssetManager.AssetInputStream) r5
            r3.mAssetInputStream = r5
            r3.mSeekableFileDescriptor = r0
            goto L6e
        L50:
            boolean r5 = r4 instanceof java.io.FileInputStream
            if (r5 == 0) goto L6a
            r5 = r4
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            java.io.FileDescriptor r1 = r5.getFD()
            boolean r1 = isSeekableFD(r1)
            if (r1 == 0) goto L6a
            r3.mAssetInputStream = r0
            java.io.FileDescriptor r5 = r5.getFD()
            r3.mSeekableFileDescriptor = r5
            goto L6e
        L6a:
            r3.mAssetInputStream = r0
            r3.mSeekableFileDescriptor = r0
        L6e:
            r3.loadAttributes(r4)
            return
    }

    private void addDefaultValuesForCompatibility() {
            r6 = this;
            java.lang.String r0 = "DateTimeOriginal"
            java.lang.String r0 = r6.getAttribute(r0)
            r1 = 0
            if (r0 == 0) goto L1c
            java.lang.String r2 = "DateTime"
            java.lang.String r3 = r6.getAttribute(r2)
            if (r3 != 0) goto L1c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r6.mAttributes
            r3 = r3[r1]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r0)
            r3.put(r2, r0)
        L1c:
            java.lang.String r0 = "ImageWidth"
            java.lang.String r2 = r6.getAttribute(r0)
            r3 = 0
            if (r2 != 0) goto L33
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r2 = r2[r1]
            java.nio.ByteOrder r5 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r5)
            r2.put(r0, r5)
        L33:
            java.lang.String r0 = "ImageLength"
            java.lang.String r2 = r6.getAttribute(r0)
            if (r2 != 0) goto L48
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r2 = r2[r1]
            java.nio.ByteOrder r5 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r5)
            r2.put(r0, r5)
        L48:
            java.lang.String r0 = "Orientation"
            java.lang.String r2 = r6.getAttribute(r0)
            if (r2 != 0) goto L5d
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r1 = r2[r1]
            java.nio.ByteOrder r2 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r2)
            r1.put(r0, r2)
        L5d:
            java.lang.String r0 = "LightSource"
            java.lang.String r1 = r6.getAttribute(r0)
            if (r1 != 0) goto L73
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.mAttributes
            r2 = 1
            r1 = r1[r2]
            java.nio.ByteOrder r2 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r2)
            r1.put(r0, r2)
        L73:
            return
    }

    private androidx.exifinterface.media.ExifInterface.ExifAttribute getExifAttribute(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "ISOSpeedRatings"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1a
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r3 == 0) goto L18
            java.lang.String r3 = "ExifInterface"
            java.lang.String r0 = "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r3, r0)
        L18:
            java.lang.String r3 = "PhotographicSensitivity"
        L1a:
            r0 = 0
        L1b:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r1 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r1.length
            if (r0 >= r1) goto L30
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r2.mAttributes
            r1 = r1[r0]
            java.lang.Object r1 = r1.get(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r1 == 0) goto L2d
            return r1
        L2d:
            int r0 = r0 + 1
            goto L1b
        L30:
            r3 = 0
            return r3
    }

    private void getHeifAttributes(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r13) throws java.io.IOException {
            r12 = this;
            java.lang.String r0 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L130
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            androidx.exifinterface.media.ExifInterface$1 r2 = new androidx.exifinterface.media.ExifInterface$1     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r2.<init>(r12, r13)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            androidx.exifinterface.media.ExifInterfaceUtils.Api23Impl.setDataSource(r1, r2)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r6 = 0
            if (r4 == 0) goto L47
            r0 = 29
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r0 = 30
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r4 = 31
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            goto L62
        L47:
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            if (r0 == 0) goto L60
            r0 = 18
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r0 = 19
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r4 = 24
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            goto L62
        L60:
            r0 = r6
            r4 = r0
        L62:
            r5 = 0
            if (r6 == 0) goto L78
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r12.mAttributes     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            java.lang.String r8 = "ImageWidth"
            int r9 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            java.nio.ByteOrder r10 = r12.mExifByteOrder     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            androidx.exifinterface.media.ExifInterface$ExifAttribute r9 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r9, r10)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
        L78:
            if (r0 == 0) goto L8d
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r12.mAttributes     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            java.lang.String r8 = "ImageLength"
            int r9 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            java.nio.ByteOrder r10 = r12.mExifByteOrder     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            androidx.exifinterface.media.ExifInterface$ExifAttribute r9 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r9, r10)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
        L8d:
            r7 = 6
            if (r4 == 0) goto Lb7
            r8 = 1
            int r9 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r10 = 90
            if (r9 == r10) goto La7
            r10 = 180(0xb4, float:2.52E-43)
            if (r9 == r10) goto La5
            r10 = 270(0x10e, float:3.78E-43)
            if (r9 == r10) goto La2
            goto La8
        La2:
            r8 = 8
            goto La8
        La5:
            r8 = 3
            goto La8
        La7:
            r8 = 6
        La8:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r12.mAttributes     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r9 = r9[r5]     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            java.lang.String r10 = "Orientation"
            java.nio.ByteOrder r11 = r12.mExifByteOrder     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r8, r11)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r9.put(r10, r8)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
        Lb7:
            if (r2 == 0) goto Lf4
            if (r3 == 0) goto Lf4
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            if (r3 <= r7) goto Lec
            long r8 = (long) r2     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r13.seek(r8)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            byte[] r8 = new byte[r7]     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r13.readFully(r8)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            int r2 = r2 + r7
            int r3 = r3 + (-6)
            byte[] r7 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            boolean r7 = java.util.Arrays.equals(r8, r7)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            if (r7 == 0) goto Le4
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r13.readFully(r3)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r12.mOffsetToExifData = r2     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r12.readExifSegment(r3, r5)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            goto Lf4
        Le4:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            java.lang.String r0 = "Invalid identifier"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            throw r13     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
        Lec:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            java.lang.String r0 = "Invalid exif length"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            throw r13     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
        Lf4:
            boolean r13 = androidx.exifinterface.media.ExifInterface.DEBUG     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            if (r13 == 0) goto L11e
            java.lang.String r13 = "ExifInterface"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r2.<init>()     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            java.lang.String r3 = "Heif meta: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r2.append(r6)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r2.append(r0)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            java.lang.String r0 = ", rotation "
            r2.append(r0)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            r2.append(r4)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
            android.util.Log.d(r13, r0)     // Catch: java.lang.Throwable -> L122 java.lang.RuntimeException -> L124
        L11e:
            r1.release()
            return
        L122:
            r13 = move-exception
            goto L12c
        L124:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L122
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L122
            throw r13     // Catch: java.lang.Throwable -> L122
        L12c:
            r1.release()
            throw r13
        L130:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r13.<init>(r0)
            throw r13
    }

    private void getJpegAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r22, int r23, int r24) throws java.io.IOException {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L20:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.setByteOrder(r3)
            byte r3 = r22.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r3 != r6) goto L1cd
            byte r7 = r22.readByte()
            r8 = -40
            if (r7 != r8) goto L1b2
            r3 = 2
            r5 = 2
        L38:
            byte r7 = r22.readByte()
            if (r7 != r6) goto L195
            r7 = 1
            int r5 = r5 + r7
            byte r8 = r22.readByte()
            boolean r9 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r9 == 0) goto L62
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Found JPEG segment indicator: "
            r10.append(r11)
            r11 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r4, r10)
        L62:
            int r5 = r5 + r7
            r10 = -39
            if (r8 == r10) goto L18f
            r10 = -38
            if (r8 != r10) goto L6d
            goto L18f
        L6d:
            int r10 = r22.readUnsignedShort()
            int r10 = r10 - r3
            int r5 = r5 + r3
            if (r9 == 0) goto L9e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "JPEG segment: "
            r9.append(r11)
            r11 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r9.append(r11)
            java.lang.String r11 = " (length: "
            r9.append(r11)
            int r11 = r10 + 2
            r9.append(r11)
            java.lang.String r11 = ")"
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L9e:
            java.lang.String r9 = "Invalid length"
            if (r10 < 0) goto L189
            r11 = -31
            r12 = 0
            if (r8 == r11) goto L116
            r11 = -2
            if (r8 == r11) goto Lf3
            switch(r8) {
                case -64: goto Lba;
                case -63: goto Lba;
                case -62: goto Lba;
                case -61: goto Lba;
                default: goto Lad;
            }
        Lad:
            switch(r8) {
                case -59: goto Lba;
                case -58: goto Lba;
                case -57: goto Lba;
                default: goto Lb0;
            }
        Lb0:
            switch(r8) {
                case -55: goto Lba;
                case -54: goto Lba;
                case -53: goto Lba;
                default: goto Lb3;
            }
        Lb3:
            switch(r8) {
                case -51: goto Lba;
                case -50: goto Lba;
                case -49: goto Lba;
                default: goto Lb6;
            }
        Lb6:
            r20 = r4
            goto L177
        Lba:
            r1.skipFully(r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r0.mAttributes
            r7 = r7[r2]
            r8 = 4
            if (r2 == r8) goto Lc7
            java.lang.String r11 = "ImageLength"
            goto Lc9
        Lc7:
            java.lang.String r11 = "ThumbnailImageLength"
        Lc9:
            int r12 = r22.readUnsignedShort()
            long r12 = (long) r12
            java.nio.ByteOrder r14 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r12 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r12, r14)
            r7.put(r11, r12)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r0.mAttributes
            r7 = r7[r2]
            if (r2 == r8) goto Le0
            java.lang.String r8 = "ImageWidth"
            goto Le2
        Le0:
            java.lang.String r8 = "ThumbnailImageWidth"
        Le2:
            int r11 = r22.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r11 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r11, r13)
            r7.put(r8, r11)
            int r10 = r10 + (-5)
            goto Lb6
        Lf3:
            byte[] r8 = new byte[r10]
            r1.readFully(r8)
            java.lang.String r10 = "UserComment"
            java.lang.String r11 = r0.getAttribute(r10)
            if (r11 != 0) goto L112
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r11 = r0.mAttributes
            r7 = r11[r7]
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r13 = androidx.exifinterface.media.ExifInterface.ASCII
            r11.<init>(r8, r13)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r11)
            r7.put(r10, r8)
        L112:
            r20 = r4
        L114:
            r10 = 0
            goto L177
        L116:
            byte[] r8 = new byte[r10]
            r1.readFully(r8)
            int r11 = r5 + r10
            byte[] r13 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            boolean r14 = androidx.exifinterface.media.ExifInterfaceUtils.startsWith(r8, r13)
            if (r14 == 0) goto L13c
            int r7 = r13.length
            byte[] r7 = java.util.Arrays.copyOfRange(r8, r7, r10)
            int r5 = r23 + r5
            int r8 = r13.length
            int r5 = r5 + r8
            r0.mOffsetToExifData = r5
            r0.readExifSegment(r7, r2)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r5 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r5.<init>(r7)
            r0.setThumbnailData(r5)
            goto L173
        L13c:
            byte[] r13 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_XMP_APP1
            boolean r14 = androidx.exifinterface.media.ExifInterfaceUtils.startsWith(r8, r13)
            if (r14 == 0) goto L173
            int r14 = r13.length
            int r5 = r5 + r14
            int r13 = r13.length
            byte[] r8 = java.util.Arrays.copyOfRange(r8, r13, r10)
            java.lang.String r10 = "Xmp"
            java.lang.String r13 = r0.getAttribute(r10)
            if (r13 != 0) goto L173
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r13 = r0.mAttributes
            r13 = r13[r12]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r15 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
            r16 = 1
            int r14 = r8.length
            r20 = r4
            long r3 = (long) r5
            r5 = r14
            r14 = r15
            r6 = r15
            r15 = r16
            r16 = r5
            r17 = r3
            r19 = r8
            r14.<init>(r15, r16, r17, r19)
            r13.put(r10, r6)
            r0.mXmpIsFromSeparateMarker = r7
            goto L175
        L173:
            r20 = r4
        L175:
            r5 = r11
            goto L114
        L177:
            if (r10 < 0) goto L183
            r1.skipFully(r10)
            int r5 = r5 + r10
            r4 = r20
            r3 = 2
            r6 = -1
            goto L38
        L183:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r9)
            throw r1
        L189:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r9)
            throw r1
        L18f:
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            r1.setByteOrder(r2)
            return
        L195:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r7 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1b2:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1cd:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private int getMimeType(java.io.BufferedInputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 5000(0x1388, float:7.006E-42)
            r2.mark(r0)
            byte[] r0 = new byte[r0]
            r2.read(r0)
            r2.reset()
            boolean r2 = isJpegFormat(r0)
            if (r2 == 0) goto L15
            r2 = 4
            return r2
        L15:
            boolean r2 = r1.isRafFormat(r0)
            if (r2 == 0) goto L1e
            r2 = 9
            return r2
        L1e:
            boolean r2 = r1.isHeifFormat(r0)
            if (r2 == 0) goto L27
            r2 = 12
            return r2
        L27:
            boolean r2 = r1.isOrfFormat(r0)
            if (r2 == 0) goto L2f
            r2 = 7
            return r2
        L2f:
            boolean r2 = r1.isRw2Format(r0)
            if (r2 == 0) goto L38
            r2 = 10
            return r2
        L38:
            boolean r2 = r1.isPngFormat(r0)
            if (r2 == 0) goto L41
            r2 = 13
            return r2
        L41:
            boolean r2 = r1.isWebpFormat(r0)
            if (r2 == 0) goto L4a
            r2 = 14
            return r2
        L4a:
            r2 = 0
            return r2
    }

    private void getOrfAttributes(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r7) throws java.io.IOException {
            r6 = this;
            r6.getRawAttributes(r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r0 = 1
            r7 = r7[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r7 = r7.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r7
            if (r7 == 0) goto Lf7
            androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream
            byte[] r7 = r7.bytes
            r1.<init>(r7)
            java.nio.ByteOrder r7 = r6.mExifByteOrder
            r1.setByteOrder(r7)
            byte[] r7 = androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_1
            int r2 = r7.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.seek(r3)
            byte[] r3 = androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_2
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r7 = java.util.Arrays.equals(r2, r7)
            if (r7 == 0) goto L3f
            r2 = 8
            r1.seek(r2)
            goto L4a
        L3f:
            boolean r7 = java.util.Arrays.equals(r4, r3)
            if (r7 == 0) goto L4a
            r2 = 12
            r1.seek(r2)
        L4a:
            r7 = 6
            r6.readImageFileDirectory(r1, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r1 = 7
            r7 = r7[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r7 = r7.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r7
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r7 == 0) goto L7e
            if (r1 == 0) goto L7e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r7 = r7[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r7.put(r2, r1)
        L7e:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r1 = 8
            r7 = r7[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r7 = r7.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r7
            if (r7 == 0) goto Lf7
            java.nio.ByteOrder r1 = r6.mExifByteOrder
            java.lang.Object r7 = r7.getValue(r1)
            int[] r7 = (int[]) r7
            if (r7 == 0) goto Ldd
            int r1 = r7.length
            r2 = 4
            if (r1 == r2) goto L9d
            goto Ldd
        L9d:
            r1 = 2
            r2 = r7[r1]
            r3 = 0
            r4 = r7[r3]
            if (r2 <= r4) goto Lf7
            r2 = 3
            r4 = r7[r2]
            r5 = r7[r0]
            if (r4 <= r5) goto Lf7
            r1 = r7[r1]
            r4 = r7[r3]
            int r1 = r1 - r4
            int r1 = r1 + r0
            r2 = r7[r2]
            r7 = r7[r0]
            int r2 = r2 - r7
            int r2 = r2 + r0
            if (r1 >= r2) goto Lbe
            int r1 = r1 + r2
            int r2 = r1 - r2
            int r1 = r1 - r2
        Lbe:
            java.nio.ByteOrder r7 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r1, r7)
            java.nio.ByteOrder r0 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r2, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.mAttributes
            r1 = r1[r3]
            java.lang.String r2 = "ImageWidth"
            r1.put(r2, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r7 = r7[r3]
            java.lang.String r1 = "ImageLength"
            r7.put(r1, r0)
            goto Lf7
        Ldd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid aspect frame values. frame="
            r0.append(r1)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r7)
        Lf7:
            return
    }

    private void getPngAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getPngAttributes starting with: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L1a:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r7.setByteOrder(r0)
            byte[] r0 = androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE
            int r1 = r0.length
            r7.skipFully(r1)
            int r0 = r0.length
            r1 = 0
            int r0 = r0 + r1
        L28:
            int r2 = r7.readInt()     // Catch: java.io.EOFException -> Lb1
            r3 = 4
            int r0 = r0 + r3
            byte[] r4 = new byte[r3]     // Catch: java.io.EOFException -> Lb1
            r7.readFully(r4)     // Catch: java.io.EOFException -> Lb1
            int r0 = r0 + r3
            r3 = 16
            if (r0 != r3) goto L49
            byte[] r3 = androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_IHDR     // Catch: java.io.EOFException -> Lb1
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch: java.io.EOFException -> Lb1
            if (r3 == 0) goto L41
            goto L49
        L41:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> Lb1
            java.lang.String r0 = "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"
            r7.<init>(r0)     // Catch: java.io.EOFException -> Lb1
            throw r7     // Catch: java.io.EOFException -> Lb1
        L49:
            byte[] r3 = androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_IEND     // Catch: java.io.EOFException -> Lb1
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch: java.io.EOFException -> Lb1
            if (r3 == 0) goto L52
            goto L85
        L52:
            byte[] r3 = androidx.exifinterface.media.ExifInterface.PNG_CHUNK_TYPE_EXIF     // Catch: java.io.EOFException -> Lb1
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch: java.io.EOFException -> Lb1
            if (r3 == 0) goto La9
            byte[] r2 = new byte[r2]     // Catch: java.io.EOFException -> Lb1
            r7.readFully(r2)     // Catch: java.io.EOFException -> Lb1
            int r7 = r7.readInt()     // Catch: java.io.EOFException -> Lb1
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32     // Catch: java.io.EOFException -> Lb1
            r3.<init>()     // Catch: java.io.EOFException -> Lb1
            r3.update(r4)     // Catch: java.io.EOFException -> Lb1
            r3.update(r2)     // Catch: java.io.EOFException -> Lb1
            long r4 = r3.getValue()     // Catch: java.io.EOFException -> Lb1
            int r5 = (int) r4     // Catch: java.io.EOFException -> Lb1
            if (r5 != r7) goto L86
            r6.mOffsetToExifData = r0     // Catch: java.io.EOFException -> Lb1
            r6.readExifSegment(r2, r1)     // Catch: java.io.EOFException -> Lb1
            r6.validateImages()     // Catch: java.io.EOFException -> Lb1
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r7 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.io.EOFException -> Lb1
            r7.<init>(r2)     // Catch: java.io.EOFException -> Lb1
            r6.setThumbnailData(r7)     // Catch: java.io.EOFException -> Lb1
        L85:
            return
        L86:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.EOFException -> Lb1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb1
            r1.<init>()     // Catch: java.io.EOFException -> Lb1
            java.lang.String r2 = "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "
            r1.append(r2)     // Catch: java.io.EOFException -> Lb1
            r1.append(r7)     // Catch: java.io.EOFException -> Lb1
            java.lang.String r7 = ", calculated CRC value: "
            r1.append(r7)     // Catch: java.io.EOFException -> Lb1
            long r2 = r3.getValue()     // Catch: java.io.EOFException -> Lb1
            r1.append(r2)     // Catch: java.io.EOFException -> Lb1
            java.lang.String r7 = r1.toString()     // Catch: java.io.EOFException -> Lb1
            r0.<init>(r7)     // Catch: java.io.EOFException -> Lb1
            throw r0     // Catch: java.io.EOFException -> Lb1
        La9:
            int r2 = r2 + 4
            r7.skipFully(r2)     // Catch: java.io.EOFException -> Lb1
            int r0 = r0 + r2
            goto L28
        Lb1:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Encountered corrupt PNG file."
            r7.<init>(r0)
            throw r7
    }

    private void getRafAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r8) throws java.io.IOException {
            r7 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            java.lang.String r1 = "ExifInterface"
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getRafAttributes starting with: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
        L1a:
            r2 = 84
            r8.skipFully(r2)
            r2 = 4
            byte[] r3 = new byte[r2]
            byte[] r4 = new byte[r2]
            byte[] r2 = new byte[r2]
            r8.readFully(r3)
            r8.readFully(r4)
            r8.readFully(r2)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            int r3 = r3.getInt()
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            int r4 = r4.getInt()
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            int r2 = r2.getInt()
            byte[] r4 = new byte[r4]
            int r5 = r8.position()
            int r5 = r3 - r5
            r8.skipFully(r5)
            r8.readFully(r4)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r5 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r5.<init>(r4)
            r4 = 5
            r7.getJpegAttributes(r5, r3, r4)
            int r3 = r8.position()
            int r2 = r2 - r3
            r8.skipFully(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            r8.setByteOrder(r2)
            int r2 = r8.readInt()
            if (r0 == 0) goto L85
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "numberOfDirectoryEntry: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L85:
            r0 = 0
            r3 = 0
        L87:
            if (r3 >= r2) goto Le4
            int r4 = r8.readUnsignedShort()
            int r5 = r8.readUnsignedShort()
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = androidx.exifinterface.media.ExifInterface.TAG_RAF_IMAGE_SIZE
            int r6 = r6.number
            if (r4 != r6) goto Lde
            short r2 = r8.readShort()
            short r8 = r8.readShort()
            java.nio.ByteOrder r3 = r7.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r2, r3)
            java.nio.ByteOrder r4 = r7.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r8, r4)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r7.mAttributes
            r5 = r5[r0]
            java.lang.String r6 = "ImageLength"
            r5.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r7.mAttributes
            r0 = r3[r0]
            java.lang.String r3 = "ImageWidth"
            r0.put(r3, r4)
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto Ldd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Updated to length: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = ", width: "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            android.util.Log.d(r1, r8)
        Ldd:
            return
        Lde:
            r8.skipFully(r5)
            int r3 = r3 + 1
            goto L87
        Le4:
            return
    }

    private void getRawAttributes(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r4) throws java.io.IOException {
            r3 = this;
            r3.parseTiffHeaders(r4)
            r0 = 0
            r3.readImageFileDirectory(r4, r0)
            r3.updateImageSizeValues(r4, r0)
            r0 = 5
            r3.updateImageSizeValues(r4, r0)
            r0 = 4
            r3.updateImageSizeValues(r4, r0)
            r3.validateImages()
            int r4 = r3.mMimeType
            r0 = 8
            if (r4 != r0) goto L54
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r3.mAttributes
            r0 = 1
            r4 = r4[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r4 = r4.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            if (r4 == 0) goto L54
            androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream
            byte[] r4 = r4.bytes
            r1.<init>(r4)
            java.nio.ByteOrder r4 = r3.mExifByteOrder
            r1.setByteOrder(r4)
            r4 = 6
            r1.skipFully(r4)
            r4 = 9
            r3.readImageFileDirectory(r1, r4)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r3.mAttributes
            r4 = r1[r4]
            java.lang.String r1 = "ColorSpace"
            java.lang.Object r4 = r4.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            if (r4 == 0) goto L54
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r3.mAttributes
            r0 = r2[r0]
            r0.put(r1, r4)
        L54:
            return
    }

    private void getRw2Attributes(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getRw2Attributes starting with: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L1a:
            r4.getRawAttributes(r5)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r4.mAttributes
            r0 = 0
            r5 = r5[r0]
            java.lang.String r1 = "JpgFromRaw"
            java.lang.Object r5 = r5.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r5
            if (r5 == 0) goto L3a
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            byte[] r2 = r5.bytes
            r1.<init>(r2)
            long r2 = r5.bytesOffset
            int r5 = (int) r2
            r2 = 5
            r4.getJpegAttributes(r1, r5, r2)
        L3a:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r4.mAttributes
            r5 = r5[r0]
            java.lang.String r0 = "ISO"
            java.lang.Object r5 = r5.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r5
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r1 = 1
            r0 = r0[r1]
            java.lang.String r2 = "PhotographicSensitivity"
            java.lang.Object r0 = r0.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            if (r5 == 0) goto L5e
            if (r0 != 0) goto L5e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r0 = r0[r1]
            r0.put(r2, r5)
        L5e:
            return
    }

    private void getStandaloneAttributes(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r3) throws java.io.IOException {
            r2 = this;
            byte[] r0 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            int r1 = r0.length
            r3.skipFully(r1)
            int r1 = r3.available()
            byte[] r1 = new byte[r1]
            r3.readFully(r1)
            int r3 = r0.length
            r2.mOffsetToExifData = r3
            r3 = 0
            r2.readExifSegment(r1, r3)
            return
    }

    private void getWebpAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getWebpAttributes starting with: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L1a:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.setByteOrder(r0)
            byte[] r0 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r0 = r0.length
            r6.skipFully(r0)
            int r0 = r6.readInt()
            int r0 = r0 + 8
            byte[] r1 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2
            int r2 = r1.length
            r6.skipFully(r2)
            int r1 = r1.length
            int r1 = r1 + 8
        L34:
            r2 = 4
            byte[] r3 = new byte[r2]     // Catch: java.io.EOFException -> L75
            r6.readFully(r3)     // Catch: java.io.EOFException -> L75
            int r1 = r1 + r2
            int r4 = r6.readInt()     // Catch: java.io.EOFException -> L75
            int r1 = r1 + r2
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_EXIF     // Catch: java.io.EOFException -> L75
            boolean r2 = java.util.Arrays.equals(r2, r3)     // Catch: java.io.EOFException -> L75
            if (r2 == 0) goto L5c
            byte[] r0 = new byte[r4]     // Catch: java.io.EOFException -> L75
            r6.readFully(r0)     // Catch: java.io.EOFException -> L75
            r5.mOffsetToExifData = r1     // Catch: java.io.EOFException -> L75
            r6 = 0
            r5.readExifSegment(r0, r6)     // Catch: java.io.EOFException -> L75
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r6 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.io.EOFException -> L75
            r6.<init>(r0)     // Catch: java.io.EOFException -> L75
            r5.setThumbnailData(r6)     // Catch: java.io.EOFException -> L75
            goto L66
        L5c:
            int r2 = r4 % 2
            r3 = 1
            if (r2 != r3) goto L63
            int r4 = r4 + 1
        L63:
            int r1 = r1 + r4
            if (r1 != r0) goto L67
        L66:
            return
        L67:
            if (r1 > r0) goto L6d
            r6.skipFully(r4)     // Catch: java.io.EOFException -> L75
            goto L34
        L6d:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.io.EOFException -> L75
            java.lang.String r0 = "Encountered WebP file with invalid chunk size"
            r6.<init>(r0)     // Catch: java.io.EOFException -> L75
            throw r6     // Catch: java.io.EOFException -> L75
        L75:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Encountered corrupt WebP file."
            r6.<init>(r0)
            throw r6
    }

    private void handleThumbnailFromJfif(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4, java.util.HashMap r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "JPEGInterchangeFormat"
            java.lang.Object r0 = r5.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.lang.String r1 = "JPEGInterchangeFormatLength"
            java.lang.Object r5 = r5.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r5
            if (r0 == 0) goto L6b
            if (r5 == 0) goto L6b
            java.nio.ByteOrder r1 = r3.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r3.mExifByteOrder
            int r5 = r5.getIntValue(r1)
            int r1 = r3.mMimeType
            r2 = 7
            if (r1 != r2) goto L28
            int r1 = r3.mOrfMakerNoteOffset
            int r0 = r0 + r1
        L28:
            if (r0 <= 0) goto L49
            if (r5 <= 0) goto L49
            r1 = 1
            r3.mHasThumbnail = r1
            java.lang.String r1 = r3.mFilename
            if (r1 != 0) goto L45
            android.content.res.AssetManager$AssetInputStream r1 = r3.mAssetInputStream
            if (r1 != 0) goto L45
            java.io.FileDescriptor r1 = r3.mSeekableFileDescriptor
            if (r1 != 0) goto L45
            byte[] r1 = new byte[r5]
            r4.skipFully(r0)
            r4.readFully(r1)
            r3.mThumbnailBytes = r1
        L45:
            r3.mThumbnailOffset = r0
            r3.mThumbnailLength = r5
        L49:
            boolean r4 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r4 == 0) goto L6b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Setting thumbnail attributes with offset: "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = ", length: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "ExifInterface"
            android.util.Log.d(r5, r4)
        L6b:
            return
    }

    private void handleThumbnailFromStrips(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r19, java.util.HashMap r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = " bytes."
            java.lang.String r4 = "StripOffsets"
            java.lang.Object r4 = r2.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            java.lang.String r5 = "StripByteCounts"
            java.lang.Object r2 = r2.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r2
            if (r4 == 0) goto Le9
            if (r2 == 0) goto Le9
            java.nio.ByteOrder r5 = r0.mExifByteOrder
            java.lang.Object r4 = r4.getValue(r5)
            long[] r4 = androidx.exifinterface.media.ExifInterfaceUtils.convertToLongArray(r4)
            java.nio.ByteOrder r5 = r0.mExifByteOrder
            java.lang.Object r2 = r2.getValue(r5)
            long[] r2 = androidx.exifinterface.media.ExifInterfaceUtils.convertToLongArray(r2)
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto Le4
            int r6 = r4.length
            if (r6 != 0) goto L39
            goto Le4
        L39:
            if (r2 == 0) goto Lde
            int r6 = r2.length
            if (r6 != 0) goto L40
            goto Lde
        L40:
            int r6 = r4.length
            int r7 = r2.length
            if (r6 == r7) goto L4a
            java.lang.String r1 = "stripOffsets and stripByteCounts should have same length."
            android.util.Log.w(r5, r1)
            return
        L4a:
            r6 = 0
            int r8 = r2.length
            r10 = 0
        L4e:
            if (r10 >= r8) goto L56
            r11 = r2[r10]
            long r6 = r6 + r11
            int r10 = r10 + 1
            goto L4e
        L56:
            int r7 = (int) r6
            byte[] r6 = new byte[r7]
            r8 = 1
            r0.mAreThumbnailStripsConsecutive = r8
            r0.mHasThumbnailStrips = r8
            r0.mHasThumbnail = r8
            r10 = 0
            r11 = 0
            r12 = 0
        L63:
            int r13 = r4.length
            if (r10 >= r13) goto Lcf
            r13 = r4[r10]
            int r14 = (int) r13
            r8 = r2[r10]
            int r9 = (int) r8
            int r8 = r4.length
            r13 = 1
            int r8 = r8 - r13
            if (r10 >= r8) goto L81
            int r8 = r14 + r9
            r15 = r14
            long r13 = (long) r8
            int r8 = r10 + 1
            r16 = r4[r8]
            int r8 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r8 == 0) goto L82
            r8 = 0
            r0.mAreThumbnailStripsConsecutive = r8
            goto L82
        L81:
            r15 = r14
        L82:
            int r14 = r15 - r11
            if (r14 >= 0) goto L8c
            java.lang.String r1 = "Invalid strip offset value"
            android.util.Log.d(r5, r1)
            return
        L8c:
            r1.skipFully(r14)     // Catch: java.io.EOFException -> Lb7
            int r11 = r11 + r14
            byte[] r8 = new byte[r9]
            r1.readFully(r8)     // Catch: java.io.EOFException -> L9f
            int r11 = r11 + r9
            r13 = 0
            java.lang.System.arraycopy(r8, r13, r6, r12, r9)
            int r12 = r12 + r9
            int r10 = r10 + 1
            r8 = 1
            goto L63
        L9f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read "
            r1.append(r2)
            r1.append(r9)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
            return
        Lb7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to skip "
            r1.append(r2)
            r1.append(r14)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
            return
        Lcf:
            r0.mThumbnailBytes = r6
            boolean r1 = r0.mAreThumbnailStripsConsecutive
            if (r1 == 0) goto Le9
            r1 = 0
            r1 = r4[r1]
            int r2 = (int) r1
            r0.mThumbnailOffset = r2
            r0.mThumbnailLength = r7
            goto Le9
        Lde:
            java.lang.String r1 = "stripByteCounts should not be null or have zero length."
            android.util.Log.w(r5, r1)
            return
        Le4:
            java.lang.String r1 = "stripOffsets should not be null or have zero length."
            android.util.Log.w(r5, r1)
        Le9:
            return
    }

    private static boolean isExifDataOnly(java.io.BufferedInputStream r4) throws java.io.IOException {
            byte[] r0 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            int r1 = r0.length
            r4.mark(r1)
            int r0 = r0.length
            byte[] r0 = new byte[r0]
            r4.read(r0)
            r4.reset()
            r4 = 0
            r1 = 0
        L11:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            int r3 = r2.length
            if (r1 >= r3) goto L20
            r3 = r0[r1]
            r2 = r2[r1]
            if (r3 == r2) goto L1d
            return r4
        L1d:
            int r1 = r1 + 1
            goto L11
        L20:
            r4 = 1
            return r4
    }

    private boolean isHeifFormat(byte[] r15) throws java.io.IOException {
            r14 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            r2.<init>(r15)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            int r1 = r2.readInt()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            r2.readFully(r5)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            byte[] r6 = androidx.exifinterface.media.ExifInterface.HEIF_TYPE_FTYP     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            if (r5 != 0) goto L1e
            r2.close()
            return r0
        L1e:
            r5 = 16
            r7 = 8
            r9 = 1
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 != 0) goto L34
            long r3 = r2.readLong()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 >= 0) goto L35
            r2.close()
            return r0
        L34:
            r5 = r7
        L35:
            int r11 = r15.length     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            long r11 = (long) r11     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 <= 0) goto L3d
            int r15 = r15.length     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            long r3 = (long) r15
        L3d:
            long r3 = r3 - r5
            int r15 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r15 >= 0) goto L46
            r2.close()
            return r0
        L46:
            byte[] r15 = new byte[r1]     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            r5 = 0
            r1 = 0
            r7 = 0
        L4c:
            r11 = 4
            long r11 = r3 / r11
            int r8 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r8 >= 0) goto L7e
            r2.readFully(r15)     // Catch: java.io.EOFException -> L7a java.lang.Throwable -> L82 java.lang.Exception -> L85
            int r8 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r8 != 0) goto L5c
            goto L78
        L5c:
            byte[] r8 = androidx.exifinterface.media.ExifInterface.HEIF_BRAND_MIF1     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            boolean r8 = java.util.Arrays.equals(r15, r8)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            r11 = 1
            if (r8 == 0) goto L67
            r1 = 1
            goto L70
        L67:
            byte[] r8 = androidx.exifinterface.media.ExifInterface.HEIF_BRAND_HEIC     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            boolean r8 = java.util.Arrays.equals(r15, r8)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            if (r8 == 0) goto L70
            r7 = 1
        L70:
            if (r1 == 0) goto L78
            if (r7 == 0) goto L78
            r2.close()
            return r11
        L78:
            long r5 = r5 + r9
            goto L4c
        L7a:
            r2.close()
            return r0
        L7e:
            r2.close()
            goto L9b
        L82:
            r15 = move-exception
            r1 = r2
            goto L9c
        L85:
            r15 = move-exception
            r1 = r2
            goto L8b
        L88:
            r15 = move-exception
            goto L9c
        L8a:
            r15 = move-exception
        L8b:
            boolean r2 = androidx.exifinterface.media.ExifInterface.DEBUG     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L96
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch: java.lang.Throwable -> L88
        L96:
            if (r1 == 0) goto L9b
            r1.close()
        L9b:
            return r0
        L9c:
            if (r1 == 0) goto La1
            r1.close()
        La1:
            throw r15
    }

    private static boolean isJpegFormat(byte[] r4) throws java.io.IOException {
            r0 = 0
            r1 = 0
        L2:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.JPEG_SIGNATURE
            int r3 = r2.length
            if (r1 >= r3) goto L11
            r3 = r4[r1]
            r2 = r2[r1]
            if (r3 == r2) goto Le
            return r0
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            r4 = 1
            return r4
    }

    private boolean isOrfFormat(byte[] r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2d
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2d
            java.nio.ByteOrder r4 = r3.readByteOrder(r2)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r3.mExifByteOrder = r4     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r2.setByteOrder(r4)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            short r4 = r2.readShort()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L1c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L1d
        L1c:
            r0 = 1
        L1d:
            r2.close()
            return r0
        L21:
            r4 = move-exception
            r1 = r2
            goto L27
        L24:
            r1 = r2
            goto L2e
        L26:
            r4 = move-exception
        L27:
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            throw r4
        L2d:
        L2e:
            if (r1 == 0) goto L33
            r1.close()
        L33:
            return r0
    }

    private boolean isPngFormat(byte[] r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE
            int r3 = r2.length
            if (r1 >= r3) goto L11
            r3 = r5[r1]
            r2 = r2[r1]
            if (r3 == r2) goto Le
            return r0
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            r5 = 1
            return r5
    }

    private boolean isRafFormat(byte[] r6) throws java.io.IOException {
            r5 = this;
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r1 = "FUJIFILMCCD-RAW"
            byte[] r0 = r1.getBytes(r0)
            r1 = 0
            r2 = 0
        Lc:
            int r3 = r0.length
            if (r2 >= r3) goto L19
            r3 = r6[r2]
            r4 = r0[r2]
            if (r3 == r4) goto L16
            return r1
        L16:
            int r2 = r2 + 1
            goto Lc
        L19:
            r6 = 1
            return r6
    }

    private boolean isRw2Format(byte[] r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L29
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L29
            java.nio.ByteOrder r4 = r3.readByteOrder(r2)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r3.mExifByteOrder = r4     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r2.setByteOrder(r4)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            short r4 = r2.readShort()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r1 = 85
            if (r4 != r1) goto L19
            r0 = 1
        L19:
            r2.close()
            return r0
        L1d:
            r4 = move-exception
            r1 = r2
            goto L23
        L20:
            r1 = r2
            goto L2a
        L22:
            r4 = move-exception
        L23:
            if (r1 == 0) goto L28
            r1.close()
        L28:
            throw r4
        L29:
        L2a:
            if (r1 == 0) goto L2f
            r1.close()
        L2f:
            return r0
    }

    private static boolean isSeekableFD(java.io.FileDescriptor r3) {
            r0 = 0
            int r2 = android.system.OsConstants.SEEK_CUR     // Catch: java.lang.Exception -> L9
            androidx.exifinterface.media.ExifInterfaceUtils.Api21Impl.lseek(r3, r0, r2)     // Catch: java.lang.Exception -> L9
            r3 = 1
            return r3
        L9:
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r3 == 0) goto L15
            java.lang.String r3 = "ExifInterface"
            java.lang.String r0 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r3, r0)
        L15:
            r3 = 0
            return r3
    }

    private boolean isSupportedDataType(java.util.HashMap r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "BitsPerSample"
            java.lang.Object r0 = r6.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            if (r0 == 0) goto L45
            java.nio.ByteOrder r1 = r5.mExifByteOrder
            java.lang.Object r0 = r0.getValue(r1)
            int[] r0 = (int[]) r0
            int[] r1 = androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_RGB
            boolean r2 = java.util.Arrays.equals(r1, r0)
            r3 = 1
            if (r2 == 0) goto L1c
            return r3
        L1c:
            int r2 = r5.mMimeType
            r4 = 3
            if (r2 != r4) goto L45
            java.lang.String r2 = "PhotometricInterpretation"
            java.lang.Object r6 = r6.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r6
            if (r6 == 0) goto L45
            java.nio.ByteOrder r2 = r5.mExifByteOrder
            int r6 = r6.getIntValue(r2)
            if (r6 != r3) goto L3b
            int[] r2 = androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_GREYSCALE_2
            boolean r2 = java.util.Arrays.equals(r0, r2)
            if (r2 != 0) goto L44
        L3b:
            r2 = 6
            if (r6 != r2) goto L45
            boolean r6 = java.util.Arrays.equals(r0, r1)
            if (r6 == 0) goto L45
        L44:
            return r3
        L45:
            boolean r6 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r6 == 0) goto L50
            java.lang.String r6 = "ExifInterface"
            java.lang.String r0 = "Unsupported data type value"
            android.util.Log.d(r6, r0)
        L50:
            r6 = 0
            return r6
    }

    private boolean isThumbnail(java.util.HashMap r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "ImageLength"
            java.lang.Object r0 = r3.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.lang.String r1 = "ImageWidth"
            java.lang.Object r3 = r3.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            if (r0 == 0) goto L28
            if (r3 == 0) goto L28
            java.nio.ByteOrder r1 = r2.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r2.mExifByteOrder
            int r3 = r3.getIntValue(r1)
            r1 = 512(0x200, float:7.175E-43)
            if (r0 > r1) goto L28
            if (r3 > r1) goto L28
            r3 = 1
            return r3
        L28:
            r3 = 0
            return r3
    }

    private boolean isWebpFormat(byte[] r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r3 = r2.length
            if (r1 >= r3) goto L11
            r3 = r5[r1]
            r2 = r2[r1]
            if (r3 == r2) goto Le
            return r0
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            r1 = 0
        L12:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2
            int r3 = r2.length
            if (r1 >= r3) goto L27
            byte[] r3 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r3 = r3.length
            int r3 = r3 + r1
            int r3 = r3 + 4
            r3 = r5[r3]
            r2 = r2[r1]
            if (r3 == r2) goto L24
            return r0
        L24:
            int r1 = r1 + 1
            goto L12
        L27:
            r5 = 1
            return r5
    }

    private void loadAttributes(java.io.InputStream r5) {
            r4 = this;
            java.lang.String r0 = "inputstream shouldn't be null"
            java.util.Objects.requireNonNull(r5, r0)
            r0 = 0
            r1 = 0
        L7:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r2 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            int r2 = r2.length     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            if (r1 >= r2) goto L18
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r4.mAttributes     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            r3.<init>()     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            r2[r1] = r3     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            int r1 = r1 + 1
            goto L7
        L18:
            boolean r1 = r4.mIsExifDataOnly     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            if (r1 != 0) goto L2a
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            int r5 = r4.getMimeType(r1)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            r4.mMimeType = r5     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            r5 = r1
        L2a:
            int r1 = r4.mMimeType     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            boolean r1 = shouldSupportSeek(r1)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            if (r1 == 0) goto L65
            androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream r0 = new androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            boolean r5 = r4.mIsExifDataOnly     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            if (r5 == 0) goto L3f
            r4.getStandaloneAttributes(r0)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            goto L5b
        L3f:
            int r5 = r4.mMimeType     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            r1 = 12
            if (r5 != r1) goto L49
            r4.getHeifAttributes(r0)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            goto L5b
        L49:
            r1 = 7
            if (r5 != r1) goto L50
            r4.getOrfAttributes(r0)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            goto L5b
        L50:
            r1 = 10
            if (r5 != r1) goto L58
            r4.getRw2Attributes(r0)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            goto L5b
        L58:
            r4.getRawAttributes(r0)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
        L5b:
            int r5 = r4.mOffsetToExifData     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            r0.seek(r1)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            r4.setThumbnailData(r0)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            goto L8a
        L65:
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            int r5 = r4.mMimeType     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            r2 = 4
            if (r5 != r2) goto L73
            r4.getJpegAttributes(r1, r0, r0)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            goto L8a
        L73:
            r0 = 13
            if (r5 != r0) goto L7b
            r4.getPngAttributes(r1)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            goto L8a
        L7b:
            r0 = 9
            if (r5 != r0) goto L83
            r4.getRafAttributes(r1)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
            goto L8a
        L83:
            r0 = 14
            if (r5 != r0) goto L8a
            r4.getWebpAttributes(r1)     // Catch: java.lang.Throwable -> L92 java.lang.UnsupportedOperationException -> L94 java.io.IOException -> L96
        L8a:
            r4.addDefaultValuesForCompatibility()
            boolean r5 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r5 == 0) goto Laa
            goto La7
        L92:
            r5 = move-exception
            goto Lab
        L94:
            r5 = move-exception
            goto L97
        L96:
            r5 = move-exception
        L97:
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto La2
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L92
        La2:
            r4.addDefaultValuesForCompatibility()
            if (r0 == 0) goto Laa
        La7:
            r4.printAttributes()
        Laa:
            return
        Lab:
            r4.addDefaultValuesForCompatibility()
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto Lb5
            r4.printAttributes()
        Lb5:
            throw r5
    }

    private void parseTiffHeaders(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4) throws java.io.IOException {
            r3 = this;
            java.nio.ByteOrder r0 = r3.readByteOrder(r4)
            r3.mExifByteOrder = r0
            r4.setByteOrder(r0)
            int r0 = r4.readUnsignedShort()
            int r1 = r3.mMimeType
            r2 = 7
            if (r1 == r2) goto L36
            r2 = 10
            if (r1 == r2) goto L36
            r1 = 42
            if (r0 != r1) goto L1b
            goto L36
        L1b:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid start code: "
            r1.append(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L36:
            int r0 = r4.readInt()
            r1 = 8
            if (r0 < r1) goto L46
            int r0 = r0 + (-8)
            if (r0 <= 0) goto L45
            r4.skipFully(r0)
        L45:
            return
        L46:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid first Ifd offset: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
    }

    private void printAttributes() {
            r7 = this;
            r0 = 0
        L1:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r7.mAttributes
            int r1 = r1.length
            if (r0 >= r1) goto L88
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The size of tag group["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "]: "
            r1.append(r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r7.mAttributes
            r2 = r2[r0]
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ExifInterface"
            android.util.Log.d(r2, r1)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r7.mAttributes
            r1 = r1[r0]
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L38:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "tagName: "
            r5.append(r6)
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r5.append(r3)
            java.lang.String r3 = ", tagType: "
            r5.append(r3)
            java.lang.String r3 = r4.toString()
            r5.append(r3)
            java.lang.String r3 = ", tagValue: '"
            r5.append(r3)
            java.nio.ByteOrder r3 = r7.mExifByteOrder
            java.lang.String r3 = r4.getStringValue(r3)
            r5.append(r3)
            java.lang.String r3 = "'"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.d(r2, r3)
            goto L38
        L84:
            int r0 = r0 + 1
            goto L1
        L88:
            return
    }

    private java.nio.ByteOrder readByteOrder(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4) throws java.io.IOException {
            r3 = this;
            short r4 = r4.readShort()
            r0 = 18761(0x4949, float:2.629E-41)
            java.lang.String r1 = "ExifInterface"
            if (r4 == r0) goto L35
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r4 != r0) goto L1a
            boolean r4 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r4 == 0) goto L17
            java.lang.String r4 = "readExifSegment: Byte Align MM"
            android.util.Log.d(r1, r4)
        L17:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            return r4
        L1a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid byte order: "
            r1.append(r2)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L35:
            boolean r4 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r4 == 0) goto L3e
            java.lang.String r4 = "readExifSegment: Byte Align II"
            android.util.Log.d(r1, r4)
        L3e:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            return r4
    }

    private void readExifSegment(byte[] r2, int r3) throws java.io.IOException {
            r1 = this;
            androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream r0 = new androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream
            r0.<init>(r2)
            r1.parseTiffHeaders(r0)
            r1.readImageFileDirectory(r0, r3)
            return
    }

    private void readImageFileDirectory(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r30, int r31) throws java.io.IOException {
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            java.util.Set<java.lang.Integer> r3 = r0.mAttributesOffsets
            int r4 = r30.position()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            short r3 = r30.readShort()
            boolean r4 = androidx.exifinterface.media.ExifInterface.DEBUG
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L31:
            if (r3 > 0) goto L34
            return
        L34:
            r4 = 0
            r6 = 0
        L36:
            r7 = 5
            if (r6 >= r3) goto L356
            int r12 = r30.readUnsignedShort()
            int r13 = r30.readUnsignedShort()
            int r15 = r30.readInt()
            int r14 = r30.position()
            long r8 = (long) r14
            r18 = 4
            long r8 = r8 + r18
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r14 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading
            r14 = r14[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r14.get(r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = (androidx.exifinterface.media.ExifInterface.ExifTag) r11
            boolean r14 = androidx.exifinterface.media.ExifInterface.DEBUG
            r10 = 3
            if (r14 == 0) goto L92
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r31)
            r7[r4] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r12)
            r21 = 1
            r7[r21] = r23
            if (r11 == 0) goto L76
            java.lang.String r4 = r11.name
            goto L77
        L76:
            r4 = 0
        L77:
            r22 = 2
            r7[r22] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r7[r10] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r20 = 4
            r7[r20] = r4
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            android.util.Log.d(r5, r4)
        L92:
            r4 = 7
            if (r11 != 0) goto Lb0
            if (r14 == 0) goto Lab
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Skip the tag entry since tag number is not defined: "
            r7.append(r10)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        Lab:
            r10 = r5
            r25 = r6
            goto L130
        Lb0:
            if (r13 <= 0) goto L117
            int[] r7 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
            int r10 = r7.length
            if (r13 < r10) goto Lb8
            goto L117
        Lb8:
            boolean r10 = r11.isFormatCompatible(r13)
            if (r10 != 0) goto Le3
            if (r14 == 0) goto Lab
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Skip the tag entry since data format ("
            r7.append(r10)
            java.lang.String[] r10 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES
            r10 = r10[r13]
            r7.append(r10)
            java.lang.String r10 = ") is unexpected for tag: "
            r7.append(r10)
            java.lang.String r10 = r11.name
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
            goto Lab
        Le3:
            if (r13 != r4) goto Le7
            int r13 = r11.primaryFormat
        Le7:
            r10 = r5
            long r4 = (long) r15
            r7 = r7[r13]
            r25 = r6
            long r6 = (long) r7
            long r4 = r4 * r6
            r6 = 0
            int r26 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r26 < 0) goto L100
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r26 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r26 <= 0) goto Lfe
            goto L100
        Lfe:
            r6 = 1
            goto L133
        L100:
            if (r14 == 0) goto L132
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r10, r6)
            goto L132
        L117:
            r10 = r5
            r25 = r6
            if (r14 == 0) goto L130
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Skip the tag entry since data format is invalid: "
            r4.append(r5)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r10, r4)
        L130:
            r4 = 0
        L132:
            r6 = 0
        L133:
            if (r6 != 0) goto L13d
            r1.seek(r8)
            r26 = r3
            r8 = r10
            goto L34d
        L13d:
            java.lang.String r6 = "Compression"
            int r7 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r7 <= 0) goto L1c7
            int r7 = r30.readInt()
            r26 = r3
            if (r14 == 0) goto L162
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r27 = r8
            java.lang.String r8 = "seek to data offset: "
            r3.append(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r10, r3)
            goto L164
        L162:
            r27 = r8
        L164:
            int r3 = r0.mMimeType
            r8 = 7
            if (r3 != r8) goto L1be
            java.lang.String r3 = r11.name
            java.lang.String r8 = "MakerNote"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L176
            r0.mOrfMakerNoteOffset = r7
            goto L1be
        L176:
            r3 = 6
            if (r2 != r3) goto L1be
            java.lang.String r8 = r11.name
            java.lang.String r9 = "ThumbnailImage"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L1be
            r0.mOrfThumbnailOffset = r7
            r0.mOrfThumbnailLength = r15
            java.nio.ByteOrder r8 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r3, r8)
            int r8 = r0.mOrfThumbnailOffset
            long r8 = (long) r8
            r18 = r15
            java.nio.ByteOrder r15 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r8, r15)
            int r9 = r0.mOrfThumbnailLength
            r24 = r10
            long r9 = (long) r9
            java.nio.ByteOrder r15 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r9 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r9, r15)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r0.mAttributes
            r15 = 4
            r10 = r10[r15]
            r10.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r15]
            java.lang.String r10 = "JPEGInterchangeFormat"
            r3.put(r10, r8)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r15]
            java.lang.String r8 = "JPEGInterchangeFormatLength"
            r3.put(r8, r9)
            goto L1c2
        L1be:
            r24 = r10
            r18 = r15
        L1c2:
            long r7 = (long) r7
            r1.seek(r7)
            goto L1cf
        L1c7:
            r26 = r3
            r27 = r8
            r24 = r10
            r18 = r15
        L1cf:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = androidx.exifinterface.media.ExifInterface.sExifPointerTagMap
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            java.lang.Object r3 = r3.get(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r14 == 0) goto L1fc
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "nextIfdType: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = " byteCount: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            r8 = r24
            android.util.Log.d(r8, r7)
            goto L1fe
        L1fc:
            r8 = r24
        L1fe:
            r7 = 8
            if (r3 == 0) goto L2d3
            r4 = -1
            r6 = 3
            if (r13 == r6) goto L224
            r6 = 4
            if (r13 == r6) goto L21f
            if (r13 == r7) goto L21a
            r6 = 9
            if (r13 == r6) goto L215
            r6 = 13
            if (r13 == r6) goto L215
            goto L229
        L215:
            int r4 = r30.readInt()
            goto L228
        L21a:
            short r4 = r30.readShort()
            goto L228
        L21f:
            long r4 = r30.readUnsignedInt()
            goto L229
        L224:
            int r4 = r30.readUnsignedShort()
        L228:
            long r4 = (long) r4
        L229:
            if (r14 == 0) goto L243
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            r9 = 0
            r6[r9] = r7
            java.lang.String r7 = r11.name
            r9 = 1
            r6[r9] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r8, r6)
        L243:
            java.lang.String r6 = ")"
            r7 = -1
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L295
            int r9 = r30.length()
            if (r9 == r7) goto L25b
            int r9 = r30.length()
            long r9 = (long) r9
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 >= 0) goto L295
        L25b:
            java.util.Set<java.lang.Integer> r7 = r0.mAttributesOffsets
            int r9 = (int) r4
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r7 = r7.contains(r9)
            if (r7 != 0) goto L273
            r1.seek(r4)
            int r3 = r3.intValue()
            r0.readImageFileDirectory(r1, r3)
            goto L2cc
        L273:
            if (r14 == 0) goto L2cc
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "Skip jump into the IFD since it has already been read: IfdType "
            r7.append(r9)
            r7.append(r3)
            java.lang.String r3 = " (at "
            r7.append(r3)
            r7.append(r4)
            r7.append(r6)
            java.lang.String r3 = r7.toString()
            android.util.Log.d(r8, r3)
            goto L2cc
        L295:
            if (r14 == 0) goto L2cc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "Skip jump into the IFD since its offset is invalid: "
            r3.append(r9)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r4 = r30.length()
            if (r4 == r7) goto L2c9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = " (total length: "
            r4.append(r3)
            int r3 = r30.length()
            r4.append(r3)
            r4.append(r6)
            java.lang.String r3 = r4.toString()
        L2c9:
            android.util.Log.d(r8, r3)
        L2cc:
            r9 = r27
            r1.seek(r9)
            goto L34d
        L2d3:
            r9 = r27
            int r3 = r30.position()
            int r12 = r0.mOffsetToExifData
            int r3 = r3 + r12
            int r5 = (int) r4
            byte[] r4 = new byte[r5]
            r1.readFully(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
            long r14 = (long) r3
            r19 = r14
            r14 = r5
            r3 = r18
            r15 = r13
            r16 = r3
            r17 = r19
            r19 = r4
            r14.<init>(r15, r16, r17, r19)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r2]
            java.lang.String r4 = r11.name
            r3.put(r4, r5)
            java.lang.String r3 = r11.name
            java.lang.String r4 = "DNGVersion"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L30a
            r3 = 3
            r0.mMimeType = r3
        L30a:
            java.lang.String r3 = r11.name
            java.lang.String r4 = "Make"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L31e
            java.lang.String r3 = r11.name
            java.lang.String r4 = "Model"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L32c
        L31e:
            java.nio.ByteOrder r3 = r0.mExifByteOrder
            java.lang.String r3 = r5.getStringValue(r3)
            java.lang.String r4 = "PENTAX"
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L33f
        L32c:
            java.lang.String r3 = r11.name
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L341
            java.nio.ByteOrder r3 = r0.mExifByteOrder
            int r3 = r5.getIntValue(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r4) goto L341
        L33f:
            r0.mMimeType = r7
        L341:
            int r3 = r30.position()
            long r3 = (long) r3
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 == 0) goto L34d
            r1.seek(r9)
        L34d:
            int r6 = r25 + 1
            short r6 = (short) r6
            r5 = r8
            r3 = r26
            r4 = 0
            goto L36
        L356:
            r8 = r5
            int r2 = r30.readInt()
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r3 == 0) goto L372
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            android.util.Log.d(r8, r4)
        L372:
            long r4 = (long) r2
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L3bc
            java.util.Set<java.lang.Integer> r6 = r0.mAttributesOffsets
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r9)
            if (r6 != 0) goto L3a5
            r1.seek(r4)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L397
            r0.readImageFileDirectory(r1, r3)
            goto L3d2
        L397:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3d2
            r0.readImageFileDirectory(r1, r7)
            goto L3d2
        L3a5:
            if (r3 == 0) goto L3d2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r8, r1)
            goto L3d2
        L3bc:
            if (r3 == 0) goto L3d2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r8, r1)
        L3d2:
            return
    }

    private void replaceInvalidTags(int r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r2.mAttributes
            r0 = r0[r3]
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L28
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r2.mAttributes
            r0 = r0[r3]
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L28
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r2.mAttributes
            r1 = r0[r3]
            r0 = r0[r3]
            java.lang.Object r0 = r0.get(r4)
            r1.put(r5, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r2.mAttributes
            r3 = r5[r3]
            r3.remove(r4)
        L28:
            return
    }

    private void retrieveJpegImageSize(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r5, int r6) throws java.io.IOException {
            r4 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r0 = r0[r6]
            java.lang.String r1 = "ImageLength"
            java.lang.Object r0 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r4.mAttributes
            r1 = r1[r6]
            java.lang.String r2 = "ImageWidth"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r0 == 0) goto L1c
            if (r1 != 0) goto L55
        L1c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r0 = r0[r6]
            java.lang.String r1 = "JPEGInterchangeFormat"
            java.lang.Object r0 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r4.mAttributes
            r1 = r1[r6]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r0 == 0) goto L55
            if (r1 == 0) goto L55
            java.nio.ByteOrder r1 = r4.mExifByteOrder
            int r1 = r0.getIntValue(r1)
            java.nio.ByteOrder r2 = r4.mExifByteOrder
            int r0 = r0.getIntValue(r2)
            long r2 = (long) r1
            r5.seek(r2)
            byte[] r0 = new byte[r0]
            r5.readFully(r0)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r5 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r5.<init>(r0)
            r4.getJpegAttributes(r5, r1, r6)
        L55:
            return
    }

    private void setThumbnailData(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r5) throws java.io.IOException {
            r4 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r1 = 4
            r0 = r0[r1]
            java.lang.String r1 = "Compression"
            java.lang.Object r1 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            r2 = 6
            if (r1 == 0) goto L2f
            java.nio.ByteOrder r3 = r4.mExifByteOrder
            int r1 = r1.getIntValue(r3)
            r4.mThumbnailCompression = r1
            r3 = 1
            if (r1 == r3) goto L25
            if (r1 == r2) goto L21
            r2 = 7
            if (r1 == r2) goto L25
            goto L34
        L21:
            r4.handleThumbnailFromJfif(r5, r0)
            goto L34
        L25:
            boolean r1 = r4.isSupportedDataType(r0)
            if (r1 == 0) goto L34
            r4.handleThumbnailFromStrips(r5, r0)
            goto L34
        L2f:
            r4.mThumbnailCompression = r2
            r4.handleThumbnailFromJfif(r5, r0)
        L34:
            return
    }

    private static boolean shouldSupportSeek(int r1) {
            r0 = 4
            if (r1 == r0) goto L12
            r0 = 9
            if (r1 == r0) goto L12
            r0 = 13
            if (r1 == r0) goto L12
            r0 = 14
            if (r1 != r0) goto L10
            goto L12
        L10:
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    private void swapBasedOnImageSize(int r7, int r8) throws java.io.IOException {
            r6 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.mAttributes
            r0 = r0[r7]
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "ExifInterface"
            if (r0 != 0) goto L89
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.mAttributes
            r0 = r0[r8]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            goto L89
        L18:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.mAttributes
            r0 = r0[r7]
            java.lang.String r2 = "ImageLength"
            java.lang.Object r0 = r0.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r6.mAttributes
            r3 = r3[r7]
            java.lang.String r4 = "ImageWidth"
            java.lang.Object r3 = r3.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r6.mAttributes
            r5 = r5[r8]
            java.lang.Object r2 = r5.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r6.mAttributes
            r5 = r5[r8]
            java.lang.Object r4 = r5.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            if (r0 == 0) goto L7f
            if (r3 != 0) goto L49
            goto L7f
        L49:
            if (r2 == 0) goto L75
            if (r4 != 0) goto L4e
            goto L75
        L4e:
            java.nio.ByteOrder r1 = r6.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r6.mExifByteOrder
            int r1 = r3.getIntValue(r1)
            java.nio.ByteOrder r3 = r6.mExifByteOrder
            int r2 = r2.getIntValue(r3)
            java.nio.ByteOrder r3 = r6.mExifByteOrder
            int r3 = r4.getIntValue(r3)
            if (r0 >= r2) goto L88
            if (r1 >= r3) goto L88
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.mAttributes
            r1 = r0[r7]
            r2 = r0[r8]
            r0[r7] = r2
            r0[r8] = r1
            goto L88
        L75:
            boolean r7 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r7 == 0) goto L88
            java.lang.String r7 = "Second image does not contain valid size information"
            android.util.Log.d(r1, r7)
            goto L88
        L7f:
            boolean r7 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r7 == 0) goto L88
            java.lang.String r7 = "First image does not contain valid size information"
            android.util.Log.d(r1, r7)
        L88:
            return
        L89:
            boolean r7 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r7 == 0) goto L92
            java.lang.String r7 = "Cannot perform swap since only one image data exists"
            android.util.Log.d(r1, r7)
        L92:
            return
    }

    private void updateImageSizeValues(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r10, int r11) throws java.io.IOException {
            r9 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r9.mAttributes
            r0 = r0[r11]
            java.lang.String r1 = "DefaultCropSize"
            java.lang.Object r0 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r9.mAttributes
            r1 = r1[r11]
            java.lang.String r2 = "SensorTopBorder"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r9.mAttributes
            r2 = r2[r11]
            java.lang.String r3 = "SensorLeftBorder"
            java.lang.Object r2 = r2.get(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r3 = r3[r11]
            java.lang.String r4 = "SensorBottomBorder"
            java.lang.Object r3 = r3.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r9.mAttributes
            r4 = r4[r11]
            java.lang.String r5 = "SensorRightBorder"
            java.lang.Object r4 = r4.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            java.lang.String r5 = "ImageLength"
            java.lang.String r6 = "ImageWidth"
            if (r0 == 0) goto Lc8
            int r10 = r0.format
            r1 = 5
            r2 = 1
            r3 = 0
            r4 = 2
            java.lang.String r7 = "Invalid crop size values. cropSize="
            java.lang.String r8 = "ExifInterface"
            if (r10 != r1) goto L84
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            java.lang.Object r10 = r0.getValue(r10)
            androidx.exifinterface.media.ExifInterface$Rational[] r10 = (androidx.exifinterface.media.ExifInterface.Rational[]) r10
            if (r10 == 0) goto L6d
            int r0 = r10.length
            if (r0 == r4) goto L5c
            goto L6d
        L5c:
            r0 = r10[r3]
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(r0, r1)
            r10 = r10[r2]
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(r10, r1)
            goto La2
        L6d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            java.lang.String r10 = java.util.Arrays.toString(r10)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            android.util.Log.w(r8, r10)
            return
        L84:
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            java.lang.Object r10 = r0.getValue(r10)
            int[] r10 = (int[]) r10
            if (r10 == 0) goto Lb1
            int r0 = r10.length
            if (r0 == r4) goto L92
            goto Lb1
        L92:
            r0 = r10[r3]
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r0, r1)
            r10 = r10[r2]
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r10, r1)
        La2:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r9.mAttributes
            r1 = r1[r11]
            r1.put(r6, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r9.mAttributes
            r11 = r0[r11]
            r11.put(r5, r10)
            goto L10c
        Lb1:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            java.lang.String r10 = java.util.Arrays.toString(r10)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            android.util.Log.w(r8, r10)
            return
        Lc8:
            if (r1 == 0) goto L109
            if (r2 == 0) goto L109
            if (r3 == 0) goto L109
            if (r4 == 0) goto L109
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            int r10 = r1.getIntValue(r10)
            java.nio.ByteOrder r0 = r9.mExifByteOrder
            int r0 = r3.getIntValue(r0)
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            int r1 = r4.getIntValue(r1)
            java.nio.ByteOrder r3 = r9.mExifByteOrder
            int r2 = r2.getIntValue(r3)
            if (r0 <= r10) goto L10c
            if (r1 <= r2) goto L10c
            int r0 = r0 - r10
            int r1 = r1 - r2
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r0, r10)
            java.nio.ByteOrder r0 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r1, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r9.mAttributes
            r1 = r1[r11]
            r1.put(r5, r10)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r9.mAttributes
            r10 = r10[r11]
            r10.put(r6, r0)
            goto L10c
        L109:
            r9.retrieveJpegImageSize(r10, r11)
        L10c:
            return
    }

    private void validateImages() throws java.io.IOException {
            r9 = this;
            r0 = 0
            r1 = 5
            r9.swapBasedOnImageSize(r0, r1)
            r2 = 4
            r9.swapBasedOnImageSize(r0, r2)
            r9.swapBasedOnImageSize(r1, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r4 = 1
            r3 = r3[r4]
            java.lang.String r5 = "PixelXDimension"
            java.lang.Object r3 = r3.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r9.mAttributes
            r4 = r5[r4]
            java.lang.String r5 = "PixelYDimension"
            java.lang.Object r4 = r4.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            java.lang.String r5 = "ImageLength"
            java.lang.String r6 = "ImageWidth"
            if (r3 == 0) goto L3b
            if (r4 == 0) goto L3b
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r9.mAttributes
            r7 = r7[r0]
            r7.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r3 = r3[r0]
            r3.put(r5, r4)
        L3b:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r3 = r3[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L5c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r3 = r3[r1]
            boolean r3 = r9.isThumbnail(r3)
            if (r3 == 0) goto L5c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r4 = r3[r1]
            r3[r2] = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3[r1] = r4
        L5c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r3 = r3[r2]
            boolean r3 = r9.isThumbnail(r3)
            if (r3 != 0) goto L6d
            java.lang.String r3 = "ExifInterface"
            java.lang.String r4 = "No image meets the size requirements of a thumbnail image."
            android.util.Log.d(r3, r4)
        L6d:
            java.lang.String r3 = "ThumbnailOrientation"
            java.lang.String r4 = "Orientation"
            r9.replaceInvalidTags(r0, r3, r4)
            java.lang.String r7 = "ThumbnailImageLength"
            r9.replaceInvalidTags(r0, r7, r5)
            java.lang.String r8 = "ThumbnailImageWidth"
            r9.replaceInvalidTags(r0, r8, r6)
            r9.replaceInvalidTags(r1, r3, r4)
            r9.replaceInvalidTags(r1, r7, r5)
            r9.replaceInvalidTags(r1, r8, r6)
            r9.replaceInvalidTags(r2, r4, r3)
            r9.replaceInvalidTags(r2, r5, r7)
            r9.replaceInvalidTags(r2, r6, r8)
            return
    }

    public java.lang.String getAttribute(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r6, r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = r5.getExifAttribute(r6)
            r1 = 0
            if (r0 == 0) goto Lba
            java.util.HashSet<java.lang.String> r2 = androidx.exifinterface.media.ExifInterface.sTagSetForCompatibility
            boolean r2 = r2.contains(r6)
            if (r2 != 0) goto L1b
            java.nio.ByteOrder r6 = r5.mExifByteOrder
            java.lang.String r6 = r0.getStringValue(r6)
            return r6
        L1b:
            java.lang.String r2 = "GPSTimeStamp"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto Laf
            int r6 = r0.format
            r2 = 5
            java.lang.String r3 = "ExifInterface"
            if (r6 == r2) goto L45
            r2 = 10
            if (r6 == r2) goto L45
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "GPS Timestamp format is not rational. format="
            r6.append(r2)
            int r0 = r0.format
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r3, r6)
            return r1
        L45:
            java.nio.ByteOrder r6 = r5.mExifByteOrder
            java.lang.Object r6 = r0.getValue(r6)
            androidx.exifinterface.media.ExifInterface$Rational[] r6 = (androidx.exifinterface.media.ExifInterface.Rational[]) r6
            if (r6 == 0) goto L96
            int r0 = r6.length
            r2 = 3
            if (r0 == r2) goto L54
            goto L96
        L54:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1 = 0
            r2 = r6[r1]
            long r2 = r2.numerator
            float r2 = (float) r2
            r3 = r6[r1]
            long r3 = r3.denominator
            float r3 = (float) r3
            float r2 = r2 / r3
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 1
            r2 = r6[r1]
            long r2 = r2.numerator
            float r2 = (float) r2
            r3 = r6[r1]
            long r3 = r3.denominator
            float r3 = (float) r3
            float r2 = r2 / r3
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 2
            r2 = r6[r1]
            long r2 = r2.numerator
            float r2 = (float) r2
            r6 = r6[r1]
            long r3 = r6.denominator
            float r6 = (float) r3
            float r2 = r2 / r6
            int r6 = (int) r2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r1] = r6
            java.lang.String r6 = "%02d:%02d:%02d"
            java.lang.String r6 = java.lang.String.format(r6, r0)
            return r6
        L96:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Invalid GPS Timestamp array. array="
            r0.append(r2)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.w(r3, r6)
            return r1
        Laf:
            java.nio.ByteOrder r6 = r5.mExifByteOrder     // Catch: java.lang.NumberFormatException -> Lba
            double r2 = r0.getDoubleValue(r6)     // Catch: java.lang.NumberFormatException -> Lba
            java.lang.String r6 = java.lang.Double.toString(r2)     // Catch: java.lang.NumberFormatException -> Lba
            return r6
        Lba:
            return r1
    }

    public int getAttributeInt(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.String r0 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r2, r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = r1.getExifAttribute(r2)
            if (r2 != 0) goto Lc
            return r3
        Lc:
            java.nio.ByteOrder r0 = r1.mExifByteOrder     // Catch: java.lang.NumberFormatException -> L13
            int r2 = r2.getIntValue(r0)     // Catch: java.lang.NumberFormatException -> L13
            return r2
        L13:
            return r3
    }
}
