package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

@com.googlecode.mp4parser.boxes.mp4.objectdescriptors.Descriptor(tags = {19, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253})
/* loaded from: classes2.dex */
public class ExtensionDescriptor extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor {
    private static java.util.logging.Logger log;
    java.nio.ByteBuffer data;

    static {
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionDescriptor> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionDescriptor.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionDescriptor.log = r0
            return
    }

    public ExtensionDescriptor() {
            r0 = this;
            r0.<init>()
            return
    }

    static int[] allTags() {
            r0 = 148(0x94, float:2.07E-43)
            int[] r0 = new int[r0]
            r1 = 106(0x6a, float:1.49E-43)
        L6:
            r2 = 254(0xfe, float:3.56E-43)
            if (r1 < r2) goto Lb
            return r0
        Lb:
            int r2 = r1 + (-106)
            java.util.logging.Logger r3 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionDescriptor.log
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "pos:"
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.finest(r4)
            r0[r2] = r1
            int r1 = r1 + 1
            goto L6
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    int getContentSize() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.data
            int r0 = r0.remaining()
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(java.nio.ByteBuffer r3) throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r3.slice()
            r2.data = r0
            int r0 = r3.position()
            java.nio.ByteBuffer r1 = r2.data
            int r1 = r1.remaining()
            int r0 = r0 + r1
            r3.position(r0)
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
            java.nio.ByteBuffer r1 = r2.data
            java.nio.ByteBuffer r1 = r1.duplicate()
            r0.put(r1)
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ExtensionDescriptor"
            r0.append(r1)
            java.lang.String r1 = "tag="
            r0.append(r1)
            int r1 = r2.tag
            r0.append(r1)
            java.lang.String r1 = ",bytes="
            r0.append(r1)
            java.nio.ByteBuffer r1 = r2.data
            byte[] r1 = r1.array()
            java.lang.String r1 = com.coremedia.iso.Hex.encodeHex(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
