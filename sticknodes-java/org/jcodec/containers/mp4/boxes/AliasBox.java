package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class AliasBox extends org.jcodec.containers.mp4.boxes.FullBox {
    protected static java.util.Set<java.lang.Integer> utf16;
    private int createdLocalDate;
    private java.lang.String creatorName;
    private java.util.List<org.jcodec.containers.mp4.boxes.AliasBox.ExtraField> extra;
    private java.lang.String fileName;
    private int fileNumber;
    private java.lang.String fileTypeName;
    private short fsId;
    private short kind;
    private short nlvlFrom;
    private short nlvlTo;
    private int parentDirId;
    private short recordSize;
    private java.lang.String type;
    private short version;
    private int volumeAttributes;
    private int volumeCreateDate;
    private java.lang.String volumeName;
    private short volumeSignature;
    private short volumeType;

    public static class ExtraField {
        byte[] data;
        int len;
        short type;

        public ExtraField(short r1, int r2, byte[] r3) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                r0.len = r2
                r0.data = r3
                return
        }

        public java.lang.String toString() {
                r4 = this;
                byte[] r0 = r4.data
                int r1 = r4.len
                java.util.Set<java.lang.Integer> r2 = org.jcodec.containers.mp4.boxes.AliasBox.utf16
                short r3 = r4.type
                java.lang.Short r3 = java.lang.Short.valueOf(r3)
                boolean r2 = r2.contains(r3)
                if (r2 == 0) goto L15
                java.lang.String r2 = "UTF-16"
                goto L17
            L15:
                java.lang.String r2 = "UTF-8"
            L17:
                java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
                r3 = 0
                java.lang.String r0 = org.jcodec.platform.Platform.stringFromCharset4(r0, r3, r1, r2)
                return r0
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            org.jcodec.containers.mp4.boxes.AliasBox.utf16 = r0
            r1 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.Set<java.lang.Integer> r0 = org.jcodec.containers.mp4.boxes.AliasBox.utf16
            r1 = 15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            return
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "alis"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r5) {
            r4 = this;
            super.doWrite(r5)
            int r0 = r4.flags
            r0 = r0 & 1
            if (r0 == 0) goto La
            return
        La:
            java.lang.String r0 = r4.type
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r0)
            r1 = 0
            r2 = 4
            r5.put(r0, r1, r2)
            short r0 = r4.recordSize
            r5.putShort(r0)
            short r0 = r4.version
            r5.putShort(r0)
            short r0 = r4.kind
            r5.putShort(r0)
            java.lang.String r0 = r4.volumeName
            r3 = 27
            org.jcodec.common.io.NIOUtils.writePascalStringL(r5, r0, r3)
            int r0 = r4.volumeCreateDate
            r5.putInt(r0)
            short r0 = r4.volumeSignature
            r5.putShort(r0)
            short r0 = r4.volumeType
            r5.putShort(r0)
            int r0 = r4.parentDirId
            r5.putInt(r0)
            java.lang.String r0 = r4.fileName
            r3 = 63
            org.jcodec.common.io.NIOUtils.writePascalStringL(r5, r0, r3)
            int r0 = r4.fileNumber
            r5.putInt(r0)
            int r0 = r4.createdLocalDate
            r5.putInt(r0)
            java.lang.String r0 = r4.fileTypeName
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r0)
            r5.put(r0, r1, r2)
            java.lang.String r0 = r4.creatorName
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r0)
            r5.put(r0, r1, r2)
            short r0 = r4.nlvlFrom
            r5.putShort(r0)
            short r0 = r4.nlvlTo
            r5.putShort(r0)
            int r0 = r4.volumeAttributes
            r5.putInt(r0)
            short r0 = r4.fsId
            r5.putShort(r0)
            r0 = 10
            byte[] r0 = new byte[r0]
            r5.put(r0)
            java.util.List<org.jcodec.containers.mp4.boxes.AliasBox$ExtraField> r0 = r4.extra
            java.util.Iterator r0 = r0.iterator()
        L83:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La0
            java.lang.Object r2 = r0.next()
            org.jcodec.containers.mp4.boxes.AliasBox$ExtraField r2 = (org.jcodec.containers.mp4.boxes.AliasBox.ExtraField) r2
            short r3 = r2.type
            r5.putShort(r3)
            int r3 = r2.len
            short r3 = (short) r3
            r5.putShort(r3)
            byte[] r2 = r2.data
            r5.put(r2)
            goto L83
        La0:
            r0 = -1
            r5.putShort(r0)
            r5.putShort(r1)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r6) {
            r5 = this;
            super.parse(r6)
            int r0 = r5.flags
            r0 = r0 & 1
            if (r0 == 0) goto La
            return
        La:
            r0 = 4
            java.lang.String r1 = org.jcodec.common.io.NIOUtils.readString(r6, r0)
            r5.type = r1
            short r1 = r6.getShort()
            r5.recordSize = r1
            short r1 = r6.getShort()
            r5.version = r1
            short r1 = r6.getShort()
            r5.kind = r1
            r1 = 27
            java.lang.String r1 = org.jcodec.common.io.NIOUtils.readPascalStringL(r6, r1)
            r5.volumeName = r1
            int r1 = r6.getInt()
            r5.volumeCreateDate = r1
            short r1 = r6.getShort()
            r5.volumeSignature = r1
            short r1 = r6.getShort()
            r5.volumeType = r1
            int r1 = r6.getInt()
            r5.parentDirId = r1
            r1 = 63
            java.lang.String r1 = org.jcodec.common.io.NIOUtils.readPascalStringL(r6, r1)
            r5.fileName = r1
            int r1 = r6.getInt()
            r5.fileNumber = r1
            int r1 = r6.getInt()
            r5.createdLocalDate = r1
            java.lang.String r1 = org.jcodec.common.io.NIOUtils.readString(r6, r0)
            r5.fileTypeName = r1
            java.lang.String r0 = org.jcodec.common.io.NIOUtils.readString(r6, r0)
            r5.creatorName = r0
            short r0 = r6.getShort()
            r5.nlvlFrom = r0
            short r0 = r6.getShort()
            r5.nlvlTo = r0
            int r0 = r6.getInt()
            r5.volumeAttributes = r0
            short r0 = r6.getShort()
            r5.fsId = r0
            r0 = 10
            org.jcodec.common.io.NIOUtils.skip(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.extra = r0
        L87:
            short r0 = r6.getShort()
            r1 = -1
            if (r0 != r1) goto L8f
            goto La1
        L8f:
            short r1 = r6.getShort()
            int r2 = r1 + 1
            r2 = r2 & (-2)
            java.nio.ByteBuffer r2 = org.jcodec.common.io.NIOUtils.read(r6, r2)
            byte[] r2 = org.jcodec.common.io.NIOUtils.toArray(r2)
            if (r2 != 0) goto La2
        La1:
            return
        La2:
            java.util.List<org.jcodec.containers.mp4.boxes.AliasBox$ExtraField> r3 = r5.extra
            org.jcodec.containers.mp4.boxes.AliasBox$ExtraField r4 = new org.jcodec.containers.mp4.boxes.AliasBox$ExtraField
            r4.<init>(r0, r1, r2)
            r3.add(r4)
            goto L87
    }
}
