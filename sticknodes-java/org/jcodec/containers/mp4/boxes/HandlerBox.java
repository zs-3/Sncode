package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class HandlerBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private int componentFlags;
    private int componentFlagsMask;
    private java.lang.String componentManufacturer;
    private java.lang.String componentName;
    private java.lang.String componentSubType;
    private java.lang.String componentType;

    public HandlerBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.HandlerBox createHandlerBox(java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, int r7) {
            org.jcodec.containers.mp4.boxes.HandlerBox r0 = new org.jcodec.containers.mp4.boxes.HandlerBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.componentType = r3
            r0.componentSubType = r4
            r0.componentManufacturer = r5
            r0.componentFlags = r6
            r0.componentFlagsMask = r7
            java.lang.String r3 = ""
            r0.componentName = r3
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "hdlr"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            super.doWrite(r2)
            java.lang.String r0 = r1.componentType
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r0)
            r2.put(r0)
            java.lang.String r0 = r1.componentSubType
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r0)
            r2.put(r0)
            java.lang.String r0 = r1.componentManufacturer
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r0)
            r2.put(r0)
            int r0 = r1.componentFlags
            r2.putInt(r0)
            int r0 = r1.componentFlagsMask
            r2.putInt(r0)
            java.lang.String r0 = r1.componentName
            if (r0 == 0) goto L33
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r0)
            r2.put(r0)
        L33:
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            super.parse(r3)
            r0 = 4
            java.lang.String r1 = org.jcodec.common.io.NIOUtils.readString(r3, r0)
            r2.componentType = r1
            java.lang.String r1 = org.jcodec.common.io.NIOUtils.readString(r3, r0)
            r2.componentSubType = r1
            java.lang.String r0 = org.jcodec.common.io.NIOUtils.readString(r3, r0)
            r2.componentManufacturer = r0
            int r0 = r3.getInt()
            r2.componentFlags = r0
            int r0 = r3.getInt()
            r2.componentFlagsMask = r0
            int r0 = r3.remaining()
            java.lang.String r3 = org.jcodec.common.io.NIOUtils.readString(r3, r0)
            r2.componentName = r3
            return
    }
}
