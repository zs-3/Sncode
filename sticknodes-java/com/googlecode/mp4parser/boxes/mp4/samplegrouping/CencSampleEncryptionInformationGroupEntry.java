package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

/* loaded from: classes2.dex */
public class CencSampleEncryptionInformationGroupEntry extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry {
    public static final java.lang.String TYPE = "seig";
    private boolean isEncrypted;
    private byte ivSize;
    private java.util.UUID kid;

    public CencSampleEncryptionInformationGroupEntry() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L33
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L33
        L12:
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry r5 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry) r5
            boolean r2 = r4.isEncrypted
            boolean r3 = r5.isEncrypted
            if (r2 == r3) goto L1b
            return r1
        L1b:
            byte r2 = r4.ivSize
            byte r3 = r5.ivSize
            if (r2 == r3) goto L22
            return r1
        L22:
            java.util.UUID r2 = r4.kid
            java.util.UUID r5 = r5.kid
            if (r2 == 0) goto L2f
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L32
            goto L31
        L2f:
            if (r5 == 0) goto L32
        L31:
            return r1
        L32:
            return r0
        L33:
            return r1
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.nio.ByteBuffer get() {
            r2 = this;
            r0 = 20
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            boolean r1 = r2.isEncrypted
            com.coremedia.iso.IsoTypeWriter.writeUInt24(r0, r1)
            boolean r1 = r2.isEncrypted
            if (r1 == 0) goto L1e
            byte r1 = r2.ivSize
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            java.util.UUID r1 = r2.kid
            byte[] r1 = com.googlecode.mp4parser.util.UUIDConverter.convert(r1)
            r0.put(r1)
            goto L25
        L1e:
            r1 = 17
            byte[] r1 = new byte[r1]
            r0.put(r1)
        L25:
            r0.rewind()
            return r0
    }

    public byte getIvSize() {
            r1 = this;
            byte r0 = r1.ivSize
            return r0
    }

    public java.util.UUID getKid() {
            r1 = this;
            java.util.UUID r0 = r1.kid
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "seig"
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEncrypted
            if (r0 == 0) goto L6
            r0 = 7
            goto L8
        L6:
            r0 = 19
        L8:
            int r0 = r0 * 31
            byte r1 = r2.ivSize
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.UUID r1 = r2.kid
            if (r1 == 0) goto L18
            int r1 = r1.hashCode()
            goto L19
        L18:
            r1 = 0
        L19:
            int r0 = r0 + r1
            return r0
    }

    public boolean isEncrypted() {
            r1 = this;
            boolean r0 = r1.isEncrypted
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt24(r3)
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            r2.isEncrypted = r1
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            byte r0 = (byte) r0
            r2.ivSize = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r3.get(r0)
            java.util.UUID r3 = com.googlecode.mp4parser.util.UUIDConverter.convert(r0)
            r2.kid = r3
            return
    }

    public void setEncrypted(boolean r1) {
            r0 = this;
            r0.isEncrypted = r1
            return
    }

    public void setIvSize(int r1) {
            r0 = this;
            byte r1 = (byte) r1
            r0.ivSize = r1
            return
    }

    public void setKid(java.util.UUID r1) {
            r0 = this;
            r0.kid = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CencSampleEncryptionInformationGroupEntry{isEncrypted="
            r0.<init>(r1)
            boolean r1 = r2.isEncrypted
            r0.append(r1)
            java.lang.String r1 = ", ivSize="
            r0.append(r1)
            byte r1 = r2.ivSize
            r0.append(r1)
            java.lang.String r1 = ", kid="
            r0.append(r1)
            java.util.UUID r1 = r2.kid
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
