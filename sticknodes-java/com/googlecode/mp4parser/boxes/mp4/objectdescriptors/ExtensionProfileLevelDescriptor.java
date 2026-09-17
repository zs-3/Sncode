package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

@com.googlecode.mp4parser.boxes.mp4.objectdescriptors.Descriptor(tags = {19})
/* loaded from: classes2.dex */
public class ExtensionProfileLevelDescriptor extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor {
    byte[] bytes;

    public ExtensionProfileLevelDescriptor() {
            r1 = this;
            r1.<init>()
            r0 = 19
            r1.tag = r0
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    int getContentSize() {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Not Implemented"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.getSize()
            if (r0 <= 0) goto L11
            int r0 = r1.getSize()
            byte[] r0 = new byte[r0]
            r1.bytes = r0
            r2.get(r0)
        L11:
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.nio.ByteBuffer serialize() {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Not Implemented"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ExtensionDescriptor"
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
