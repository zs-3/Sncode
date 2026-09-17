package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class ColorExtension extends org.jcodec.containers.mp4.boxes.Box {
    private java.lang.Byte colorRange;
    private short matrixIndex;
    private short primariesIndex;
    private short transferFunctionIndex;
    private java.lang.String type;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "colr"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.type
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r0)
            r2.put(r0)
            short r0 = r1.primariesIndex
            r2.putShort(r0)
            short r0 = r1.transferFunctionIndex
            r2.putShort(r0)
            short r0 = r1.matrixIndex
            r2.putShort(r0)
            java.lang.Byte r0 = r1.colorRange
            if (r0 == 0) goto L23
            byte r0 = r0.byteValue()
            r2.put(r0)
        L23:
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 4
            byte[] r0 = new byte[r0]
            r3.get(r0)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r2.type = r1
            short r0 = r3.getShort()
            r2.primariesIndex = r0
            short r0 = r3.getShort()
            r2.transferFunctionIndex = r0
            short r0 = r3.getShort()
            r2.matrixIndex = r0
            boolean r0 = r3.hasRemaining()
            if (r0 == 0) goto L2f
            byte r3 = r3.get()
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2.colorRange = r3
        L2f:
            return
    }
}
