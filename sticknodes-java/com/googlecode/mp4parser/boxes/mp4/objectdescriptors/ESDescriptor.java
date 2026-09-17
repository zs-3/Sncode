package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

@com.googlecode.mp4parser.boxes.mp4.objectdescriptors.Descriptor(tags = {3})
/* loaded from: classes2.dex */
public class ESDescriptor extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor {
    private static java.util.logging.Logger log;
    int URLFlag;
    int URLLength;
    java.lang.String URLString;
    com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor decoderConfigDescriptor;
    int dependsOnEsId;
    int esId;
    int oCREsId;
    int oCRstreamFlag;
    java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> otherDescriptors;
    int remoteODFlag;
    com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor slConfigDescriptor;
    int streamDependenceFlag;
    int streamPriority;

    static {
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor.log = r0
            return
    }

    public ESDescriptor() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.URLLength = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.otherDescriptors = r0
            r0 = 3
            r1.tag = r0
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L9b
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            goto L9b
        L13:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r5 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor) r5
            int r2 = r4.URLFlag
            int r3 = r5.URLFlag
            if (r2 == r3) goto L1c
            return r1
        L1c:
            int r2 = r4.URLLength
            int r3 = r5.URLLength
            if (r2 == r3) goto L23
            return r1
        L23:
            int r2 = r4.dependsOnEsId
            int r3 = r5.dependsOnEsId
            if (r2 == r3) goto L2a
            return r1
        L2a:
            int r2 = r4.esId
            int r3 = r5.esId
            if (r2 == r3) goto L31
            return r1
        L31:
            int r2 = r4.oCREsId
            int r3 = r5.oCREsId
            if (r2 == r3) goto L38
            return r1
        L38:
            int r2 = r4.oCRstreamFlag
            int r3 = r5.oCRstreamFlag
            if (r2 == r3) goto L3f
            return r1
        L3f:
            int r2 = r4.remoteODFlag
            int r3 = r5.remoteODFlag
            if (r2 == r3) goto L46
            return r1
        L46:
            int r2 = r4.streamDependenceFlag
            int r3 = r5.streamDependenceFlag
            if (r2 == r3) goto L4d
            return r1
        L4d:
            int r2 = r4.streamPriority
            int r3 = r5.streamPriority
            if (r2 == r3) goto L54
            return r1
        L54:
            java.lang.String r2 = r4.URLString
            if (r2 == 0) goto L61
            java.lang.String r3 = r5.URLString
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L66
            goto L65
        L61:
            java.lang.String r2 = r5.URLString
            if (r2 == 0) goto L66
        L65:
            return r1
        L66:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r2 = r4.decoderConfigDescriptor
            if (r2 == 0) goto L73
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r3 = r5.decoderConfigDescriptor
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L78
            goto L77
        L73:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r2 = r5.decoderConfigDescriptor
            if (r2 == 0) goto L78
        L77:
            return r1
        L78:
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> r2 = r4.otherDescriptors
            if (r2 == 0) goto L85
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> r3 = r5.otherDescriptors
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8a
            goto L89
        L85:
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> r2 = r5.otherDescriptors
            if (r2 == 0) goto L8a
        L89:
            return r1
        L8a:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r2 = r4.slConfigDescriptor
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r5 = r5.slConfigDescriptor
            if (r2 == 0) goto L97
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L9a
            goto L99
        L97:
            if (r5 == 0) goto L9a
        L99:
            return r1
        L9a:
            return r0
        L9b:
            return r1
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    int getContentSize() {
            r2 = this;
            int r0 = r2.streamDependenceFlag
            if (r0 <= 0) goto L6
            r0 = 5
            goto L7
        L6:
            r0 = 3
        L7:
            int r1 = r2.URLFlag
            if (r1 <= 0) goto L10
            int r1 = r2.URLLength
            int r1 = r1 + 1
            int r0 = r0 + r1
        L10:
            int r1 = r2.oCRstreamFlag
            if (r1 <= 0) goto L16
            int r0 = r0 + 2
        L16:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r1 = r2.decoderConfigDescriptor
            int r1 = r1.getSize()
            int r0 = r0 + r1
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r1 = r2.slConfigDescriptor
            int r1 = r1.getSize()
            int r0 = r0 + r1
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> r1 = r2.otherDescriptors
            int r1 = r1.size()
            if (r1 > 0) goto L2d
            return r0
        L2d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = " Doesn't handle other descriptors yet"
            r0.<init>(r1)
            throw r0
    }

    public com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor getDecoderConfigDescriptor() {
            r1 = this;
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r0 = r1.decoderConfigDescriptor
            return r0
    }

    public int getDependsOnEsId() {
            r1 = this;
            int r0 = r1.dependsOnEsId
            return r0
    }

    public int getEsId() {
            r1 = this;
            int r0 = r1.esId
            return r0
    }

    public java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> getOtherDescriptors() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> r0 = r1.otherDescriptors
            return r0
    }

    public int getRemoteODFlag() {
            r1 = this;
            int r0 = r1.remoteODFlag
            return r0
    }

    public com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor getSlConfigDescriptor() {
            r1 = this;
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r0 = r1.slConfigDescriptor
            return r0
    }

    public int getStreamDependenceFlag() {
            r1 = this;
            int r0 = r1.streamDependenceFlag
            return r0
    }

    public int getStreamPriority() {
            r1 = this;
            int r0 = r1.streamPriority
            return r0
    }

    public int getURLFlag() {
            r1 = this;
            int r0 = r1.URLFlag
            return r0
    }

    public int getURLLength() {
            r1 = this;
            int r0 = r1.URLLength
            return r0
    }

    public java.lang.String getURLString() {
            r1 = this;
            java.lang.String r0 = r1.URLString
            return r0
    }

    public int getoCREsId() {
            r1 = this;
            int r0 = r1.oCREsId
            return r0
    }

    public int getoCRstreamFlag() {
            r1 = this;
            int r0 = r1.oCRstreamFlag
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.esId
            int r0 = r0 * 31
            int r1 = r3.streamDependenceFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.URLFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.oCRstreamFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.streamPriority
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.URLLength
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.URLString
            r2 = 0
            if (r1 == 0) goto L27
            int r1 = r1.hashCode()
            goto L28
        L27:
            r1 = 0
        L28:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.remoteODFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.dependsOnEsId
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.oCREsId
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r1 = r3.decoderConfigDescriptor
            if (r1 == 0) goto L43
            int r1 = r1.hashCode()
            goto L44
        L43:
            r1 = 0
        L44:
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r1 = r3.slConfigDescriptor
            if (r1 == 0) goto L50
            int r1 = r1.hashCode()
            goto L51
        L50:
            r1 = 0
        L51:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> r1 = r3.otherDescriptors
            if (r1 == 0) goto L5c
            int r2 = r1.hashCode()
        L5c:
            int r0 = r0 + r2
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(java.nio.ByteBuffer r5) throws java.io.IOException {
            r4 = this;
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r5)
            r4.esId = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
            int r1 = r0 >>> 7
            r4.streamDependenceFlag = r1
            int r2 = r0 >>> 6
            r3 = 1
            r2 = r2 & r3
            r4.URLFlag = r2
            int r2 = r0 >>> 5
            r2 = r2 & r3
            r4.oCRstreamFlag = r2
            r0 = r0 & 31
            r4.streamPriority = r0
            if (r1 != r3) goto L25
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r5)
            r4.dependsOnEsId = r0
        L25:
            int r0 = r4.URLFlag
            if (r0 != r3) goto L35
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
            r4.URLLength = r0
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.readString(r5, r0)
            r4.URLString = r0
        L35:
            int r0 = r4.oCRstreamFlag
            if (r0 != r3) goto L3f
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r5)
            r4.oCREsId = r0
        L3f:
            int r0 = r5.remaining()
            if (r0 > r3) goto L46
            return
        L46:
            r0 = -1
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.createFrom(r0, r5)
            boolean r1 = r0 instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor
            if (r1 == 0) goto L54
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r0 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor) r0
            r4.decoderConfigDescriptor = r0
            goto L3f
        L54:
            boolean r1 = r0 instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor
            if (r1 == 0) goto L5d
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r0 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor) r0
            r4.slConfigDescriptor = r0
            goto L3f
        L5d:
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> r1 = r4.otherDescriptors
            r1.add(r0)
            goto L3f
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.nio.ByteBuffer serialize() {
            r3 = this;
            int r0 = r3.getSize()
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r1 = 3
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r3.getContentSize()
            r3.writeSize(r0, r1)
            int r1 = r3.esId
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            int r1 = r3.streamDependenceFlag
            int r1 = r1 << 7
            int r2 = r3.URLFlag
            int r2 = r2 << 6
            r1 = r1 | r2
            int r2 = r3.oCRstreamFlag
            int r2 = r2 << 5
            r1 = r1 | r2
            int r2 = r3.streamPriority
            r2 = r2 & 31
            r1 = r1 | r2
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r3.streamDependenceFlag
            if (r1 <= 0) goto L39
            int r1 = r3.dependsOnEsId
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
        L39:
            int r1 = r3.URLFlag
            if (r1 <= 0) goto L47
            int r1 = r3.URLLength
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            java.lang.String r1 = r3.URLString
            com.coremedia.iso.IsoTypeWriter.writeUtf8String(r0, r1)
        L47:
            int r1 = r3.oCRstreamFlag
            if (r1 <= 0) goto L50
            int r1 = r3.oCREsId
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
        L50:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r1 = r3.decoderConfigDescriptor
            java.nio.ByteBuffer r1 = r1.serialize()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r2 = r3.slConfigDescriptor
            java.nio.ByteBuffer r2 = r2.serialize()
            byte[] r1 = r1.array()
            r0.put(r1)
            byte[] r1 = r2.array()
            r0.put(r1)
            return r0
    }

    public void setDecoderConfigDescriptor(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r1) {
            r0 = this;
            r0.decoderConfigDescriptor = r1
            return
    }

    public void setDependsOnEsId(int r1) {
            r0 = this;
            r0.dependsOnEsId = r1
            return
    }

    public void setEsId(int r1) {
            r0 = this;
            r0.esId = r1
            return
    }

    public void setRemoteODFlag(int r1) {
            r0 = this;
            r0.remoteODFlag = r1
            return
    }

    public void setSlConfigDescriptor(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r1) {
            r0 = this;
            r0.slConfigDescriptor = r1
            return
    }

    public void setStreamDependenceFlag(int r1) {
            r0 = this;
            r0.streamDependenceFlag = r1
            return
    }

    public void setStreamPriority(int r1) {
            r0 = this;
            r0.streamPriority = r1
            return
    }

    public void setURLFlag(int r1) {
            r0 = this;
            r0.URLFlag = r1
            return
    }

    public void setURLLength(int r1) {
            r0 = this;
            r0.URLLength = r1
            return
    }

    public void setURLString(java.lang.String r1) {
            r0 = this;
            r0.URLString = r1
            return
    }

    public void setoCREsId(int r1) {
            r0 = this;
            r0.oCREsId = r1
            return
    }

    public void setoCRstreamFlag(int r1) {
            r0 = this;
            r0.oCRstreamFlag = r1
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ESDescriptor"
            r0.append(r1)
            java.lang.String r1 = "{esId="
            r0.append(r1)
            int r1 = r2.esId
            r0.append(r1)
            java.lang.String r1 = ", streamDependenceFlag="
            r0.append(r1)
            int r1 = r2.streamDependenceFlag
            r0.append(r1)
            java.lang.String r1 = ", URLFlag="
            r0.append(r1)
            int r1 = r2.URLFlag
            r0.append(r1)
            java.lang.String r1 = ", oCRstreamFlag="
            r0.append(r1)
            int r1 = r2.oCRstreamFlag
            r0.append(r1)
            java.lang.String r1 = ", streamPriority="
            r0.append(r1)
            int r1 = r2.streamPriority
            r0.append(r1)
            java.lang.String r1 = ", URLLength="
            r0.append(r1)
            int r1 = r2.URLLength
            r0.append(r1)
            java.lang.String r1 = ", URLString='"
            r0.append(r1)
            java.lang.String r1 = r2.URLString
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", remoteODFlag="
            r0.append(r1)
            int r1 = r2.remoteODFlag
            r0.append(r1)
            java.lang.String r1 = ", dependsOnEsId="
            r0.append(r1)
            int r1 = r2.dependsOnEsId
            r0.append(r1)
            java.lang.String r1 = ", oCREsId="
            r0.append(r1)
            int r1 = r2.oCREsId
            r0.append(r1)
            java.lang.String r1 = ", decoderConfigDescriptor="
            r0.append(r1)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r1 = r2.decoderConfigDescriptor
            r0.append(r1)
            java.lang.String r1 = ", slConfigDescriptor="
            r0.append(r1)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r1 = r2.slConfigDescriptor
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
