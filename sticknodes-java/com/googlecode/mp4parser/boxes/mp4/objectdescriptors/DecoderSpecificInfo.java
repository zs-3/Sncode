package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

@com.googlecode.mp4parser.boxes.mp4.objectdescriptors.Descriptor(tags = {5})
/* loaded from: classes2.dex */
public class DecoderSpecificInfo extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor {
    byte[] bytes;

    public DecoderSpecificInfo() {
            r1 = this;
            r1.<init>()
            r0 = 5
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
            if (r5 == 0) goto L20
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L20
        L12:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo r5 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo) r5
            byte[] r2 = r4.bytes
            byte[] r5 = r5.bytes
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 != 0) goto L1f
            return r1
        L1f:
            return r0
        L20:
            return r1
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    int getContentSize() {
            r1 = this;
            byte[] r0 = r1.bytes
            int r0 = r0.length
            return r0
    }

    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.bytes
            if (r0 == 0) goto L9
            int r0 = java.util.Arrays.hashCode(r0)
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            int r0 = r2.remaining()
            byte[] r0 = new byte[r0]
            r1.bytes = r0
            r2.get(r0)
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.nio.ByteBuffer serialize() {
            r2 = this;
            int r0 = r2.getSize()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r2.tag
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r2.getContentSize()
            r2.writeSize(r0, r1)
            byte[] r1 = r2.bytes
            r0.put(r1)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            return r0
    }

    public void setData(byte[] r1) {
            r0 = this;
            r0.bytes = r1
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DecoderSpecificInfo"
            r0.append(r1)
            java.lang.String r1 = "{bytes="
            r0.append(r1)
            byte[] r1 = r2.bytes
            if (r1 != 0) goto L16
            java.lang.String r1 = "null"
            goto L1a
        L16:
            java.lang.String r1 = com.coremedia.iso.Hex.encodeHex(r1)
        L1a:
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
