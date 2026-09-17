package com.googlecode.mp4parser.boxes.apple;

/* loaded from: classes2.dex */
public class QuicktimeTextSampleEntry extends com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry {
    public static final java.lang.String TYPE = "text";
    int backgroundB;
    int backgroundG;
    int backgroundR;
    int dataReferenceIndex;
    long defaultTextBox;
    int displayFlags;
    short fontFace;
    java.lang.String fontName;
    short fontNumber;
    int foregroundB;
    int foregroundG;
    int foregroundR;
    long reserved1;
    byte reserved2;
    short reserved3;
    int textJustification;

    public QuicktimeTextSampleEntry() {
            r1 = this;
            java.lang.String r0 = "text"
            r1.<init>(r0)
            r0 = 65535(0xffff, float:9.1834E-41)
            r1.foregroundR = r0
            r1.foregroundG = r0
            r1.foregroundB = r0
            java.lang.String r0 = ""
            r1.fontName = r0
            return
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void addBox(com.coremedia.iso.boxes.Box r2) {
            r1 = this;
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "QuicktimeTextSampleEntries may not have child boxes"
            r2.<init>(r0)
            throw r2
    }

    public int getBackgroundB() {
            r1 = this;
            int r0 = r1.backgroundB
            return r0
    }

    public int getBackgroundG() {
            r1 = this;
            int r0 = r1.backgroundG
            return r0
    }

    public int getBackgroundR() {
            r1 = this;
            int r0 = r1.backgroundR
            return r0
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r4) throws java.io.IOException {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.getHeader()
            r4.write(r0)
            java.lang.String r0 = r3.fontName
            if (r0 == 0) goto L10
            int r0 = r0.length()
            goto L11
        L10:
            r0 = 0
        L11:
            int r0 = r0 + 52
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1 = 6
            r0.position(r1)
            int r1 = r3.dataReferenceIndex
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            int r1 = r3.displayFlags
            r0.putInt(r1)
            int r1 = r3.textJustification
            r0.putInt(r1)
            int r1 = r3.backgroundR
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            int r1 = r3.backgroundG
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            int r1 = r3.backgroundB
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            long r1 = r3.defaultTextBox
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r0, r1)
            long r1 = r3.reserved1
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r0, r1)
            short r1 = r3.fontNumber
            r0.putShort(r1)
            short r1 = r3.fontFace
            r0.putShort(r1)
            byte r1 = r3.reserved2
            r0.put(r1)
            short r1 = r3.reserved3
            r0.putShort(r1)
            int r1 = r3.foregroundR
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            int r1 = r3.foregroundG
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            int r1 = r3.foregroundB
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            java.lang.String r1 = r3.fontName
            if (r1 == 0) goto L7a
            int r1 = r1.length()
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            java.lang.String r1 = r3.fontName
            byte[] r1 = r1.getBytes()
            r0.put(r1)
        L7a:
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r4.write(r0)
            return
    }

    public long getDefaultTextBox() {
            r2 = this;
            long r0 = r2.defaultTextBox
            return r0
    }

    public int getDisplayFlags() {
            r1 = this;
            int r0 = r1.displayFlags
            return r0
    }

    public short getFontFace() {
            r1 = this;
            short r0 = r1.fontFace
            return r0
    }

    public java.lang.String getFontName() {
            r1 = this;
            java.lang.String r0 = r1.fontName
            return r0
    }

    public short getFontNumber() {
            r1 = this;
            short r0 = r1.fontNumber
            return r0
    }

    public int getForegroundB() {
            r1 = this;
            int r0 = r1.foregroundB
            return r0
    }

    public int getForegroundG() {
            r1 = this;
            int r0 = r1.foregroundG
            return r0
    }

    public int getForegroundR() {
            r1 = this;
            int r0 = r1.foregroundR
            return r0
    }

    public long getReserved1() {
            r2 = this;
            long r0 = r2.reserved1
            return r0
    }

    public byte getReserved2() {
            r1 = this;
            byte r0 = r1.reserved2
            return r0
    }

    public short getReserved3() {
            r1 = this;
            short r0 = r1.reserved3
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
            r7 = this;
            long r0 = r7.getContainerSize()
            r2 = 52
            long r0 = r0 + r2
            java.lang.String r2 = r7.fontName
            if (r2 == 0) goto L10
            int r2 = r2.length()
            goto L11
        L10:
            r2 = 0
        L11:
            long r2 = (long) r2
            long r0 = r0 + r2
            boolean r2 = r7.largeBox
            if (r2 != 0) goto L27
            r2 = 8
            long r2 = r2 + r0
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L24
            goto L27
        L24:
            r2 = 8
            goto L29
        L27:
            r2 = 16
        L29:
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    public int getTextJustification() {
            r1 = this;
            int r0 = r1.textJustification
            return r0
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r1, java.nio.ByteBuffer r2, long r3, com.coremedia.iso.BoxParser r5) throws java.io.IOException {
            r0 = this;
            int r2 = com.googlecode.mp4parser.util.CastUtils.l2i(r3)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r1.read(r2)
            r1 = 6
            r2.position(r1)
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
            r0.dataReferenceIndex = r1
            int r1 = r2.getInt()
            r0.displayFlags = r1
            int r1 = r2.getInt()
            r0.textJustification = r1
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
            r0.backgroundR = r1
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
            r0.backgroundG = r1
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
            r0.backgroundB = r1
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt64(r2)
            r0.defaultTextBox = r3
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt64(r2)
            r0.reserved1 = r3
            short r1 = r2.getShort()
            r0.fontNumber = r1
            short r1 = r2.getShort()
            r0.fontFace = r1
            byte r1 = r2.get()
            r0.reserved2 = r1
            short r1 = r2.getShort()
            r0.reserved3 = r1
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
            r0.foregroundR = r1
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
            r0.foregroundG = r1
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
            r0.foregroundB = r1
            int r1 = r2.remaining()
            if (r1 <= 0) goto L80
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r2)
            byte[] r1 = new byte[r1]
            r2.get(r1)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r0.fontName = r2
            goto L83
        L80:
            r1 = 0
            r0.fontName = r1
        L83:
            return
    }

    public void setBackgroundB(int r1) {
            r0 = this;
            r0.backgroundB = r1
            return
    }

    public void setBackgroundG(int r1) {
            r0 = this;
            r0.backgroundG = r1
            return
    }

    public void setBackgroundR(int r1) {
            r0 = this;
            r0.backgroundR = r1
            return
    }

    @Override // com.googlecode.mp4parser.BasicContainer, com.coremedia.iso.boxes.Container
    public void setBoxes(java.util.List<com.coremedia.iso.boxes.Box> r2) {
            r1 = this;
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "QuicktimeTextSampleEntries may not have child boxes"
            r2.<init>(r0)
            throw r2
    }

    public void setDefaultTextBox(long r1) {
            r0 = this;
            r0.defaultTextBox = r1
            return
    }

    public void setDisplayFlags(int r1) {
            r0 = this;
            r0.displayFlags = r1
            return
    }

    public void setFontFace(short r1) {
            r0 = this;
            r0.fontFace = r1
            return
    }

    public void setFontName(java.lang.String r1) {
            r0 = this;
            r0.fontName = r1
            return
    }

    public void setFontNumber(short r1) {
            r0 = this;
            r0.fontNumber = r1
            return
    }

    public void setForegroundB(int r1) {
            r0 = this;
            r0.foregroundB = r1
            return
    }

    public void setForegroundG(int r1) {
            r0 = this;
            r0.foregroundG = r1
            return
    }

    public void setForegroundR(int r1) {
            r0 = this;
            r0.foregroundR = r1
            return
    }

    public void setReserved1(long r1) {
            r0 = this;
            r0.reserved1 = r1
            return
    }

    public void setReserved2(byte r1) {
            r0 = this;
            r0.reserved2 = r1
            return
    }

    public void setReserved3(short r1) {
            r0 = this;
            r0.reserved3 = r1
            return
    }

    public void setTextJustification(int r1) {
            r0 = this;
            r0.textJustification = r1
            return
    }
}
