package com.coremedia.iso.boxes.sampleentry;

/* loaded from: classes.dex */
public class TextSampleEntry extends com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry {
    public static final java.lang.String TYPE1 = "tx3g";
    public static final java.lang.String TYPE_ENCRYPTED = "enct";
    private int[] backgroundColorRgba;
    private com.coremedia.iso.boxes.sampleentry.TextSampleEntry.BoxRecord boxRecord;
    private long displayFlags;
    private int horizontalJustification;
    private com.coremedia.iso.boxes.sampleentry.TextSampleEntry.StyleRecord styleRecord;
    private int verticalJustification;

    public static class BoxRecord {
        int bottom;
        int left;
        int right;
        int top;

        public BoxRecord() {
                r0 = this;
                r0.<init>()
                return
        }

        public BoxRecord(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.top = r1
                r0.left = r2
                r0.bottom = r3
                r0.right = r4
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L31
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L31
            L12:
                com.coremedia.iso.boxes.sampleentry.TextSampleEntry$BoxRecord r5 = (com.coremedia.iso.boxes.sampleentry.TextSampleEntry.BoxRecord) r5
                int r2 = r4.bottom
                int r3 = r5.bottom
                if (r2 == r3) goto L1b
                return r1
            L1b:
                int r2 = r4.left
                int r3 = r5.left
                if (r2 == r3) goto L22
                return r1
            L22:
                int r2 = r4.right
                int r3 = r5.right
                if (r2 == r3) goto L29
                return r1
            L29:
                int r2 = r4.top
                int r5 = r5.top
                if (r2 == r5) goto L30
                return r1
            L30:
                return r0
            L31:
                return r1
        }

        public void getContent(java.nio.ByteBuffer r2) {
                r1 = this;
                int r0 = r1.top
                com.coremedia.iso.IsoTypeWriter.writeUInt16(r2, r0)
                int r0 = r1.left
                com.coremedia.iso.IsoTypeWriter.writeUInt16(r2, r0)
                int r0 = r1.bottom
                com.coremedia.iso.IsoTypeWriter.writeUInt16(r2, r0)
                int r0 = r1.right
                com.coremedia.iso.IsoTypeWriter.writeUInt16(r2, r0)
                return
        }

        public int getSize() {
                r1 = this;
                r0 = 8
                return r0
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.top
                int r0 = r0 * 31
                int r1 = r2.left
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.bottom
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.right
                int r0 = r0 + r1
                return r0
        }

        public void parse(java.nio.ByteBuffer r2) {
                r1 = this;
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
                r1.top = r0
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
                r1.left = r0
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
                r1.bottom = r0
                int r2 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
                r1.right = r2
                return
        }
    }

    public static class StyleRecord {
        int endChar;
        int faceStyleFlags;
        int fontId;
        int fontSize;
        int startChar;
        int[] textColor;

        public StyleRecord() {
                r1 = this;
                r1.<init>()
                r0 = 4
                int[] r0 = new int[r0]
                r0 = {x000c: FILL_ARRAY_DATA , data: [255, 255, 255, 255} // fill-array
                r1.textColor = r0
                return
        }

        public StyleRecord(int r1, int r2, int r3, int r4, int r5, int[] r6) {
                r0 = this;
                r0.<init>()
                r0.startChar = r1
                r0.endChar = r2
                r0.fontId = r3
                r0.faceStyleFlags = r4
                r0.fontSize = r5
                r0.textColor = r6
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L43
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L43
            L12:
                com.coremedia.iso.boxes.sampleentry.TextSampleEntry$StyleRecord r5 = (com.coremedia.iso.boxes.sampleentry.TextSampleEntry.StyleRecord) r5
                int r2 = r4.endChar
                int r3 = r5.endChar
                if (r2 == r3) goto L1b
                return r1
            L1b:
                int r2 = r4.faceStyleFlags
                int r3 = r5.faceStyleFlags
                if (r2 == r3) goto L22
                return r1
            L22:
                int r2 = r4.fontId
                int r3 = r5.fontId
                if (r2 == r3) goto L29
                return r1
            L29:
                int r2 = r4.fontSize
                int r3 = r5.fontSize
                if (r2 == r3) goto L30
                return r1
            L30:
                int r2 = r4.startChar
                int r3 = r5.startChar
                if (r2 == r3) goto L37
                return r1
            L37:
                int[] r2 = r4.textColor
                int[] r5 = r5.textColor
                boolean r5 = java.util.Arrays.equals(r2, r5)
                if (r5 != 0) goto L42
                return r1
            L42:
                return r0
            L43:
                return r1
        }

        public void getContent(java.nio.ByteBuffer r3) {
                r2 = this;
                int r0 = r2.startChar
                com.coremedia.iso.IsoTypeWriter.writeUInt16(r3, r0)
                int r0 = r2.endChar
                com.coremedia.iso.IsoTypeWriter.writeUInt16(r3, r0)
                int r0 = r2.fontId
                com.coremedia.iso.IsoTypeWriter.writeUInt16(r3, r0)
                int r0 = r2.faceStyleFlags
                com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
                int r0 = r2.fontSize
                com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
                int[] r0 = r2.textColor
                r1 = 0
                r0 = r0[r1]
                com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
                int[] r0 = r2.textColor
                r1 = 1
                r0 = r0[r1]
                com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
                int[] r0 = r2.textColor
                r1 = 2
                r0 = r0[r1]
                com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
                int[] r0 = r2.textColor
                r1 = 3
                r0 = r0[r1]
                com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
                return
        }

        public int getSize() {
                r1 = this;
                r0 = 12
                return r0
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.startChar
                int r0 = r0 * 31
                int r1 = r2.endChar
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.fontId
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.faceStyleFlags
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.fontSize
                int r0 = r0 + r1
                int r0 = r0 * 31
                int[] r1 = r2.textColor
                if (r1 == 0) goto L21
                int r1 = java.util.Arrays.hashCode(r1)
                goto L22
            L21:
                r1 = 0
            L22:
                int r0 = r0 + r1
                return r0
        }

        public void parse(java.nio.ByteBuffer r4) {
                r3 = this;
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r4)
                r3.startChar = r0
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r4)
                r3.endChar = r0
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r4)
                r3.fontId = r0
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r4)
                r3.faceStyleFlags = r0
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r4)
                r3.fontSize = r0
                r0 = 4
                int[] r0 = new int[r0]
                r3.textColor = r0
                int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r4)
                r2 = 0
                r0[r2] = r1
                int[] r0 = r3.textColor
                int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r4)
                r2 = 1
                r0[r2] = r1
                int[] r0 = r3.textColor
                int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r4)
                r2 = 2
                r0[r2] = r1
                int[] r0 = r3.textColor
                int r4 = com.coremedia.iso.IsoTypeReader.readUInt8(r4)
                r1 = 3
                r0[r1] = r4
                return
        }
    }

    public TextSampleEntry() {
            r1 = this;
            java.lang.String r0 = "tx3g"
            r1.<init>(r0)
            r0 = 4
            int[] r0 = new int[r0]
            r1.backgroundColorRgba = r0
            com.coremedia.iso.boxes.sampleentry.TextSampleEntry$BoxRecord r0 = new com.coremedia.iso.boxes.sampleentry.TextSampleEntry$BoxRecord
            r0.<init>()
            r1.boxRecord = r0
            com.coremedia.iso.boxes.sampleentry.TextSampleEntry$StyleRecord r0 = new com.coremedia.iso.boxes.sampleentry.TextSampleEntry$StyleRecord
            r0.<init>()
            r1.styleRecord = r0
            return
    }

    public TextSampleEntry(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 4
            int[] r1 = new int[r1]
            r0.backgroundColorRgba = r1
            com.coremedia.iso.boxes.sampleentry.TextSampleEntry$BoxRecord r1 = new com.coremedia.iso.boxes.sampleentry.TextSampleEntry$BoxRecord
            r1.<init>()
            r0.boxRecord = r1
            com.coremedia.iso.boxes.sampleentry.TextSampleEntry$StyleRecord r1 = new com.coremedia.iso.boxes.sampleentry.TextSampleEntry$StyleRecord
            r1.<init>()
            r0.styleRecord = r1
            return
    }

    public int[] getBackgroundColorRgba() {
            r1 = this;
            int[] r0 = r1.backgroundColorRgba
            return r0
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r4) throws java.io.IOException {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.getHeader()
            r4.write(r0)
            r0 = 38
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1 = 6
            r0.position(r1)
            int r1 = r3.dataReferenceIndex
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            long r1 = r3.displayFlags
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            int r1 = r3.horizontalJustification
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r3.verticalJustification
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int[] r1 = r3.backgroundColorRgba
            r2 = 0
            r1 = r1[r2]
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int[] r1 = r3.backgroundColorRgba
            r2 = 1
            r1 = r1[r2]
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int[] r1 = r3.backgroundColorRgba
            r2 = 2
            r1 = r1[r2]
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int[] r1 = r3.backgroundColorRgba
            r2 = 3
            r1 = r1[r2]
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            com.coremedia.iso.boxes.sampleentry.TextSampleEntry$BoxRecord r1 = r3.boxRecord
            r1.getContent(r0)
            com.coremedia.iso.boxes.sampleentry.TextSampleEntry$StyleRecord r1 = r3.styleRecord
            r1.getContent(r0)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r4.write(r0)
            r3.writeContainer(r4)
            return
    }

    public com.coremedia.iso.boxes.sampleentry.TextSampleEntry.BoxRecord getBoxRecord() {
            r1 = this;
            com.coremedia.iso.boxes.sampleentry.TextSampleEntry$BoxRecord r0 = r1.boxRecord
            return r0
    }

    public int getHorizontalJustification() {
            r1 = this;
            int r0 = r1.horizontalJustification
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
            r5 = this;
            long r0 = r5.getContainerSize()
            r2 = 38
            long r0 = r0 + r2
            boolean r2 = r5.largeBox
            if (r2 != 0) goto L18
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L15
            goto L18
        L15:
            r2 = 8
            goto L1a
        L18:
            r2 = 16
        L1a:
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    public com.coremedia.iso.boxes.sampleentry.TextSampleEntry.StyleRecord getStyleRecord() {
            r1 = this;
            com.coremedia.iso.boxes.sampleentry.TextSampleEntry$StyleRecord r0 = r1.styleRecord
            return r0
    }

    public int getVerticalJustification() {
            r1 = this;
            int r0 = r1.verticalJustification
            return r0
    }

    public boolean isContinuousKaraoke() {
            r5 = this;
            long r0 = r5.displayFlags
            r2 = 2048(0x800, double:1.0118E-320)
            long r0 = r0 & r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public boolean isFillTextRegion() {
            r5 = this;
            long r0 = r5.displayFlags
            r2 = 262144(0x40000, double:1.295163E-318)
            long r0 = r0 & r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean isScrollDirection() {
            r5 = this;
            long r0 = r5.displayFlags
            r2 = 384(0x180, double:1.897E-321)
            long r0 = r0 & r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public boolean isScrollIn() {
            r5 = this;
            long r0 = r5.displayFlags
            r2 = 32
            long r0 = r0 & r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public boolean isScrollOut() {
            r5 = this;
            long r0 = r5.displayFlags
            r2 = 64
            long r0 = r0 & r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public boolean isWriteTextVertically() {
            r5 = this;
            long r0 = r5.displayFlags
            r2 = 131072(0x20000, double:6.47582E-319)
            long r0 = r0 & r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r4, java.nio.ByteBuffer r5, long r6, com.coremedia.iso.BoxParser r8) throws java.io.IOException {
            r3 = this;
            r5 = 38
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r5)
            r4.read(r5)
            r0 = 6
            r5.position(r0)
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r5)
            r3.dataReferenceIndex = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r5)
            r3.displayFlags = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
            r3.horizontalJustification = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
            r3.verticalJustification = r0
            r0 = 4
            int[] r0 = new int[r0]
            r3.backgroundColorRgba = r0
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
            r2 = 0
            r0[r2] = r1
            int[] r0 = r3.backgroundColorRgba
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
            r2 = 1
            r0[r2] = r1
            int[] r0 = r3.backgroundColorRgba
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
            r2 = 2
            r0[r2] = r1
            int[] r0 = r3.backgroundColorRgba
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
            r2 = 3
            r0[r2] = r1
            com.coremedia.iso.boxes.sampleentry.TextSampleEntry$BoxRecord r0 = new com.coremedia.iso.boxes.sampleentry.TextSampleEntry$BoxRecord
            r0.<init>()
            r3.boxRecord = r0
            r0.parse(r5)
            com.coremedia.iso.boxes.sampleentry.TextSampleEntry$StyleRecord r0 = new com.coremedia.iso.boxes.sampleentry.TextSampleEntry$StyleRecord
            r0.<init>()
            r3.styleRecord = r0
            r0.parse(r5)
            r0 = 38
            long r6 = r6 - r0
            r3.initContainer(r4, r6, r8)
            return
    }

    public void setBackgroundColorRgba(int[] r1) {
            r0 = this;
            r0.backgroundColorRgba = r1
            return
    }

    public void setBoxRecord(com.coremedia.iso.boxes.sampleentry.TextSampleEntry.BoxRecord r1) {
            r0 = this;
            r0.boxRecord = r1
            return
    }

    public void setContinuousKaraoke(boolean r5) {
            r4 = this;
            if (r5 == 0) goto La
            long r0 = r4.displayFlags
            r2 = 2048(0x800, double:1.0118E-320)
            long r0 = r0 | r2
            r4.displayFlags = r0
            goto L11
        La:
            long r0 = r4.displayFlags
            r2 = -2049(0xfffffffffffff7ff, double:NaN)
            long r0 = r0 & r2
            r4.displayFlags = r0
        L11:
            return
    }

    public void setFillTextRegion(boolean r5) {
            r4 = this;
            if (r5 == 0) goto Lb
            long r0 = r4.displayFlags
            r2 = 262144(0x40000, double:1.295163E-318)
            long r0 = r0 | r2
            r4.displayFlags = r0
            goto L13
        Lb:
            long r0 = r4.displayFlags
            r2 = -262145(0xfffffffffffbffff, double:NaN)
            long r0 = r0 & r2
            r4.displayFlags = r0
        L13:
            return
    }

    public void setHorizontalJustification(int r1) {
            r0 = this;
            r0.horizontalJustification = r1
            return
    }

    public void setScrollDirection(boolean r5) {
            r4 = this;
            if (r5 == 0) goto La
            long r0 = r4.displayFlags
            r2 = 384(0x180, double:1.897E-321)
            long r0 = r0 | r2
            r4.displayFlags = r0
            goto L11
        La:
            long r0 = r4.displayFlags
            r2 = -385(0xfffffffffffffe7f, double:NaN)
            long r0 = r0 & r2
            r4.displayFlags = r0
        L11:
            return
    }

    public void setScrollIn(boolean r5) {
            r4 = this;
            if (r5 == 0) goto La
            long r0 = r4.displayFlags
            r2 = 32
            long r0 = r0 | r2
            r4.displayFlags = r0
            goto L11
        La:
            long r0 = r4.displayFlags
            r2 = -33
            long r0 = r0 & r2
            r4.displayFlags = r0
        L11:
            return
    }

    public void setScrollOut(boolean r5) {
            r4 = this;
            if (r5 == 0) goto La
            long r0 = r4.displayFlags
            r2 = 64
            long r0 = r0 | r2
            r4.displayFlags = r0
            goto L11
        La:
            long r0 = r4.displayFlags
            r2 = -65
            long r0 = r0 & r2
            r4.displayFlags = r0
        L11:
            return
    }

    public void setStyleRecord(com.coremedia.iso.boxes.sampleentry.TextSampleEntry.StyleRecord r1) {
            r0 = this;
            r0.styleRecord = r1
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.type = r1
            return
    }

    public void setVerticalJustification(int r1) {
            r0 = this;
            r0.verticalJustification = r1
            return
    }

    public void setWriteTextVertically(boolean r5) {
            r4 = this;
            if (r5 == 0) goto Lb
            long r0 = r4.displayFlags
            r2 = 131072(0x20000, double:6.47582E-319)
            long r0 = r0 | r2
            r4.displayFlags = r0
            goto L13
        Lb:
            long r0 = r4.displayFlags
            r2 = -131073(0xfffffffffffdffff, double:NaN)
            long r0 = r0 & r2
            r4.displayFlags = r0
        L13:
            return
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "TextSampleEntry"
            return r0
    }
}
