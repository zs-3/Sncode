package org.jcodec.codecs.h264.mp4;

/* loaded from: classes2.dex */
public class AvcCBox extends org.jcodec.containers.mp4.boxes.Box {
    private int level;
    private int nalLengthSize;
    private java.util.List<java.nio.ByteBuffer> ppsList;
    private int profile;
    private int profileCompat;
    private java.util.List<java.nio.ByteBuffer> spsList;

    public AvcCBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.spsList = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.ppsList = r1
            return
    }

    public static org.jcodec.codecs.h264.mp4.AvcCBox createAvcCBox(int r3, int r4, int r5, int r6, java.util.List<java.nio.ByteBuffer> r7, java.util.List<java.nio.ByteBuffer> r8) {
            org.jcodec.codecs.h264.mp4.AvcCBox r0 = new org.jcodec.codecs.h264.mp4.AvcCBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.profile = r3
            r0.profileCompat = r4
            r0.level = r5
            r0.nalLengthSize = r6
            r0.spsList = r7
            r0.ppsList = r8
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "avcC"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = 1
            r5.put(r0)
            int r1 = r4.profile
            byte r1 = (byte) r1
            r5.put(r1)
            int r1 = r4.profileCompat
            byte r1 = (byte) r1
            r5.put(r1)
            int r1 = r4.level
            byte r1 = (byte) r1
            r5.put(r1)
            r1 = -1
            r5.put(r1)
            java.util.List<java.nio.ByteBuffer> r1 = r4.spsList
            int r1 = r1.size()
            r1 = r1 | 224(0xe0, float:3.14E-43)
            byte r1 = (byte) r1
            r5.put(r1)
            java.util.List<java.nio.ByteBuffer> r1 = r4.spsList
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r1.next()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r3 = r2.remaining()
            int r3 = r3 + r0
            short r3 = (short) r3
            r5.putShort(r3)
            r3 = 103(0x67, float:1.44E-43)
            r5.put(r3)
            org.jcodec.common.io.NIOUtils.write(r5, r2)
            goto L2c
        L4a:
            java.util.List<java.nio.ByteBuffer> r1 = r4.ppsList
            int r1 = r1.size()
            byte r1 = (byte) r1
            r5.put(r1)
            java.util.List<java.nio.ByteBuffer> r1 = r4.ppsList
            java.util.Iterator r1 = r1.iterator()
        L5a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r1.next()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r3 = r2.remaining()
            int r3 = r3 + r0
            byte r3 = (byte) r3
            short r3 = (short) r3
            r5.putShort(r3)
            r3 = 104(0x68, float:1.46E-43)
            r5.put(r3)
            org.jcodec.common.io.NIOUtils.write(r5, r2)
            goto L5a
        L79:
            return
    }

    public java.util.List<java.nio.ByteBuffer> getSpsList() {
            r1 = this;
            java.util.List<java.nio.ByteBuffer> r0 = r1.spsList
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r8) {
            r7 = this;
            r0 = 1
            org.jcodec.common.io.NIOUtils.skip(r8, r0)
            byte r1 = r8.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r7.profile = r1
            byte r1 = r8.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r7.profileCompat = r1
            byte r1 = r8.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r7.level = r1
            byte r1 = r8.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 & 3
            int r1 = r1 + r0
            r7.nalLengthSize = r1
            byte r1 = r8.get()
            r1 = r1 & 31
            r2 = 0
            r3 = 0
        L2f:
            if (r3 >= r1) goto L4d
            short r4 = r8.getShort()
            r5 = 39
            byte r6 = r8.get()
            r6 = r6 & 63
            org.jcodec.common.Assert.assertEquals(r5, r6)
            java.util.List<java.nio.ByteBuffer> r5 = r7.spsList
            int r4 = r4 - r0
            java.nio.ByteBuffer r4 = org.jcodec.common.io.NIOUtils.read(r8, r4)
            r5.add(r4)
            int r3 = r3 + 1
            goto L2f
        L4d:
            byte r1 = r8.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
        L53:
            if (r2 >= r1) goto L71
            short r3 = r8.getShort()
            r4 = 40
            byte r5 = r8.get()
            r5 = r5 & 63
            org.jcodec.common.Assert.assertEquals(r4, r5)
            java.util.List<java.nio.ByteBuffer> r4 = r7.ppsList
            int r3 = r3 - r0
            java.nio.ByteBuffer r3 = org.jcodec.common.io.NIOUtils.read(r8, r3)
            r4.add(r3)
            int r2 = r2 + 1
            goto L53
        L71:
            return
    }
}
