package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class TimecodeMediaInfoBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private short[] bgcolor;
    private short[] color;
    private short face;
    private short font;
    private java.lang.String name;
    private short size;

    public TimecodeMediaInfoBox(org.jcodec.containers.mp4.boxes.Header r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 3
            short[] r0 = new short[r2]
            r1.color = r0
            short[] r2 = new short[r2]
            r1.bgcolor = r2
            return
    }

    public static org.jcodec.containers.mp4.boxes.TimecodeMediaInfoBox createTimecodeMediaInfoBox(short r3, short r4, short r5, short[] r6, short[] r7, java.lang.String r8) {
            org.jcodec.containers.mp4.boxes.TimecodeMediaInfoBox r0 = new org.jcodec.containers.mp4.boxes.TimecodeMediaInfoBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.font = r3
            r0.face = r4
            r0.size = r5
            r0.color = r6
            r0.bgcolor = r7
            r0.name = r8
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "tcmi"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r5) {
            r4 = this;
            super.doWrite(r5)
            short r0 = r4.font
            r5.putShort(r0)
            short r0 = r4.face
            r5.putShort(r0)
            short r0 = r4.size
            r5.putShort(r0)
            r0 = 0
            r5.putShort(r0)
            short[] r1 = r4.color
            short r1 = r1[r0]
            r5.putShort(r1)
            short[] r1 = r4.color
            r2 = 1
            short r1 = r1[r2]
            r5.putShort(r1)
            short[] r1 = r4.color
            r3 = 2
            short r1 = r1[r3]
            r5.putShort(r1)
            short[] r1 = r4.bgcolor
            short r0 = r1[r0]
            r5.putShort(r0)
            short[] r0 = r4.bgcolor
            short r0 = r0[r2]
            r5.putShort(r0)
            short[] r0 = r4.bgcolor
            short r0 = r0[r3]
            r5.putShort(r0)
            java.lang.String r0 = r4.name
            org.jcodec.common.io.NIOUtils.writePascalString(r5, r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r6) {
            r5 = this;
            super.parse(r6)
            short r0 = r6.getShort()
            r5.font = r0
            short r0 = r6.getShort()
            r5.face = r0
            short r0 = r6.getShort()
            r5.size = r0
            r6.getShort()
            short[] r0 = r5.color
            short r1 = r6.getShort()
            r2 = 0
            r0[r2] = r1
            short[] r0 = r5.color
            short r1 = r6.getShort()
            r3 = 1
            r0[r3] = r1
            short[] r0 = r5.color
            short r1 = r6.getShort()
            r4 = 2
            r0[r4] = r1
            short[] r0 = r5.bgcolor
            short r1 = r6.getShort()
            r0[r2] = r1
            short[] r0 = r5.bgcolor
            short r1 = r6.getShort()
            r0[r3] = r1
            short[] r0 = r5.bgcolor
            short r1 = r6.getShort()
            r0[r4] = r1
            java.lang.String r6 = org.jcodec.common.io.NIOUtils.readPascalString(r6)
            r5.name = r6
            return
    }
}
