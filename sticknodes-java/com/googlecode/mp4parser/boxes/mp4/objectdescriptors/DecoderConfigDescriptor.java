package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

@com.googlecode.mp4parser.boxes.mp4.objectdescriptors.Descriptor(tags = {4})
/* loaded from: classes2.dex */
public class DecoderConfigDescriptor extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor {
    private static java.util.logging.Logger log;
    com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig audioSpecificInfo;
    long avgBitRate;
    int bufferSizeDB;
    byte[] configDescriptorDeadBytes;
    com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo decoderSpecificInfo;
    long maxBitRate;
    int objectTypeIndication;
    java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor> profileLevelIndicationDescriptors;
    int streamType;
    int upStream;

    static {
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor.log = r0
            return
    }

    public DecoderConfigDescriptor() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.profileLevelIndicationDescriptors = r0
            r0 = 4
            r1.tag = r0
            return
    }

    public com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig getAudioSpecificInfo() {
            r1 = this;
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r0 = r1.audioSpecificInfo
            return r0
    }

    public long getAvgBitRate() {
            r2 = this;
            long r0 = r2.avgBitRate
            return r0
    }

    public int getBufferSizeDB() {
            r1 = this;
            int r0 = r1.bufferSizeDB
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    int getContentSize() {
            r3 = this;
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r0 = r3.audioSpecificInfo
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.getSize()
        Lb:
            int r0 = r0 + 13
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo r2 = r3.decoderSpecificInfo
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.getSize()
        L16:
            int r0 = r0 + r1
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor> r1 = r3.profileLevelIndicationDescriptors
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L24
            return r0
        L24:
            java.lang.Object r2 = r1.next()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor r2 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor) r2
            int r2 = r2.getSize()
            int r0 = r0 + r2
            goto L1d
    }

    public com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo getDecoderSpecificInfo() {
            r1 = this;
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo r0 = r1.decoderSpecificInfo
            return r0
    }

    public long getMaxBitRate() {
            r2 = this;
            long r0 = r2.maxBitRate
            return r0
    }

    public int getObjectTypeIndication() {
            r1 = this;
            int r0 = r1.objectTypeIndication
            return r0
    }

    public java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor> getProfileLevelIndicationDescriptors() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor> r0 = r1.profileLevelIndicationDescriptors
            return r0
    }

    public int getStreamType() {
            r1 = this;
            int r0 = r1.streamType
            return r0
    }

    public int getUpStream() {
            r1 = this;
            int r0 = r1.upStream
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(java.nio.ByteBuffer r6) throws java.io.IOException {
            r5 = this;
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r6)
            r5.objectTypeIndication = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r6)
            int r1 = r0 >>> 2
            r5.streamType = r1
            int r0 = r0 >> 1
            r0 = r0 & 1
            r5.upStream = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt24(r6)
            r5.bufferSizeDB = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            r5.maxBitRate = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            r5.avgBitRate = r0
        L26:
            int r0 = r6.remaining()
            r1 = 2
            if (r0 > r1) goto L2e
            return
        L2e:
            int r0 = r6.position()
            int r1 = r5.objectTypeIndication
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.createFrom(r1, r6)
            int r2 = r6.position()
            int r2 = r2 - r0
            java.util.logging.Logger r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor.log
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = " - DecoderConfigDescr1 read: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ", size: "
            r3.append(r4)
            if (r1 == 0) goto L5f
            int r4 = r1.getSize()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L60
        L5f:
            r4 = 0
        L60:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.finer(r3)
            if (r1 == 0) goto L7a
            int r0 = r1.getSize()
            if (r2 >= r0) goto L7a
            int r0 = r0 - r2
            byte[] r0 = new byte[r0]
            r5.configDescriptorDeadBytes = r0
            r6.get(r0)
        L7a:
            boolean r0 = r1 instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo
            if (r0 == 0) goto L83
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo r1 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo) r1
            r5.decoderSpecificInfo = r1
            goto L26
        L83:
            boolean r0 = r1 instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig
            if (r0 == 0) goto L8c
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r1 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig) r1
            r5.audioSpecificInfo = r1
            goto L26
        L8c:
            boolean r0 = r1 instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor
            if (r0 == 0) goto L26
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor> r0 = r5.profileLevelIndicationDescriptors
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor r1 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor) r1
            r0.add(r1)
            goto L26
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.nio.ByteBuffer serialize() {
            r3 = this;
            int r0 = r3.getSize()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r3.tag
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r3.getContentSize()
            r3.writeSize(r0, r1)
            int r1 = r3.objectTypeIndication
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r3.streamType
            int r1 = r1 << 2
            int r2 = r3.upStream
            int r2 = r2 << 1
            r1 = r1 | r2
            r1 = r1 | 1
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r3.bufferSizeDB
            com.coremedia.iso.IsoTypeWriter.writeUInt24(r0, r1)
            long r1 = r3.maxBitRate
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            long r1 = r3.avgBitRate
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo r1 = r3.decoderSpecificInfo
            if (r1 == 0) goto L41
            java.nio.ByteBuffer r1 = r1.serialize()
            r0.put(r1)
        L41:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r1 = r3.audioSpecificInfo
            if (r1 == 0) goto L4c
            java.nio.ByteBuffer r1 = r1.serialize()
            r0.put(r1)
        L4c:
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor> r1 = r3.profileLevelIndicationDescriptors
            java.util.Iterator r1 = r1.iterator()
        L52:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L5f
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            return r0
        L5f:
            java.lang.Object r2 = r1.next()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor r2 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor) r2
            java.nio.ByteBuffer r2 = r2.serialize()
            r0.put(r2)
            goto L52
    }

    public void setAudioSpecificInfo(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r1) {
            r0 = this;
            r0.audioSpecificInfo = r1
            return
    }

    public void setAvgBitRate(long r1) {
            r0 = this;
            r0.avgBitRate = r1
            return
    }

    public void setBufferSizeDB(int r1) {
            r0 = this;
            r0.bufferSizeDB = r1
            return
    }

    public void setDecoderSpecificInfo(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo r1) {
            r0 = this;
            r0.decoderSpecificInfo = r1
            return
    }

    public void setMaxBitRate(long r1) {
            r0 = this;
            r0.maxBitRate = r1
            return
    }

    public void setObjectTypeIndication(int r1) {
            r0 = this;
            r0.objectTypeIndication = r1
            return
    }

    public void setStreamType(int r1) {
            r0 = this;
            r0.streamType = r1
            return
    }

    public void setUpStream(int r1) {
            r0 = this;
            r0.upStream = r1
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DecoderConfigDescriptor"
            r0.append(r1)
            java.lang.String r1 = "{objectTypeIndication="
            r0.append(r1)
            int r1 = r4.objectTypeIndication
            r0.append(r1)
            java.lang.String r1 = ", streamType="
            r0.append(r1)
            int r1 = r4.streamType
            r0.append(r1)
            java.lang.String r1 = ", upStream="
            r0.append(r1)
            int r1 = r4.upStream
            r0.append(r1)
            java.lang.String r1 = ", bufferSizeDB="
            r0.append(r1)
            int r1 = r4.bufferSizeDB
            r0.append(r1)
            java.lang.String r1 = ", maxBitRate="
            r0.append(r1)
            long r1 = r4.maxBitRate
            r0.append(r1)
            java.lang.String r1 = ", avgBitRate="
            r0.append(r1)
            long r1 = r4.avgBitRate
            r0.append(r1)
            java.lang.String r1 = ", decoderSpecificInfo="
            r0.append(r1)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo r1 = r4.decoderSpecificInfo
            r0.append(r1)
            java.lang.String r1 = ", audioSpecificInfo="
            r0.append(r1)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r1 = r4.audioSpecificInfo
            r0.append(r1)
            java.lang.String r1 = ", configDescriptorDeadBytes="
            r0.append(r1)
            byte[] r1 = r4.configDescriptorDeadBytes
            r2 = 0
            if (r1 == 0) goto L65
            goto L67
        L65:
            byte[] r1 = new byte[r2]
        L67:
            java.lang.String r1 = com.coremedia.iso.Hex.encodeHex(r1)
            r0.append(r1)
            java.lang.String r1 = ", profileLevelIndicationDescriptors="
            r0.append(r1)
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor> r1 = r4.profileLevelIndicationDescriptors
            if (r1 != 0) goto L7a
            java.lang.String r1 = "null"
            goto L87
        L7a:
            r3 = 1
            java.util.List[] r3 = new java.util.List[r3]
            r3[r2] = r1
            java.util.List r1 = java.util.Arrays.asList(r3)
            java.lang.String r1 = r1.toString()
        L87:
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
