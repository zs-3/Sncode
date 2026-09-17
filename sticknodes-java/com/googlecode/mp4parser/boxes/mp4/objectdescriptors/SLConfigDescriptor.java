package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

@com.googlecode.mp4parser.boxes.mp4.objectdescriptors.Descriptor(tags = {6})
/* loaded from: classes2.dex */
public class SLConfigDescriptor extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor {
    int predefined;

    public SLConfigDescriptor() {
            r1 = this;
            r1.<init>()
            r0 = 6
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
            if (r5 == 0) goto L1c
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L1c
        L12:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r5 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor) r5
            int r2 = r4.predefined
            int r5 = r5.predefined
            if (r2 == r5) goto L1b
            return r1
        L1b:
            return r0
        L1c:
            return r1
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    int getContentSize() {
            r1 = this;
            r0 = 1
            return r0
    }

    public int getPredefined() {
            r1 = this;
            int r0 = r1.predefined
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.predefined
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(java.nio.ByteBuffer r1) throws java.io.IOException {
            r0 = this;
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt8(r1)
            r0.predefined = r1
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.nio.ByteBuffer serialize() {
            r2 = this;
            int r0 = r2.getSize()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1 = 6
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r2.getContentSize()
            r2.writeSize(r0, r1)
            int r1 = r2.predefined
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            return r0
    }

    public void setPredefined(int r1) {
            r0 = this;
            r0.predefined = r1
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SLConfigDescriptor"
            r0.append(r1)
            java.lang.String r1 = "{predefined="
            r0.append(r1)
            int r1 = r2.predefined
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
