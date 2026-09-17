package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class Header {
    private java.lang.String fourcc;
    private boolean lng;
    private long size;

    public Header(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.fourcc = r1
            return
    }

    public static org.jcodec.containers.mp4.boxes.Header createHeader(java.lang.String r1, long r2) {
            org.jcodec.containers.mp4.boxes.Header r0 = new org.jcodec.containers.mp4.boxes.Header
            r0.<init>(r1)
            r0.size = r2
            return r0
    }

    public static org.jcodec.containers.mp4.boxes.Header newHeader(java.lang.String r1, long r2, boolean r4) {
            org.jcodec.containers.mp4.boxes.Header r0 = new org.jcodec.containers.mp4.boxes.Header
            r0.<init>(r1)
            r0.size = r2
            r0.lng = r4
            return r0
    }

    public static org.jcodec.containers.mp4.boxes.Header read(java.nio.ByteBuffer r10) {
            r0 = 0
            r2 = r0
        L3:
            int r4 = r10.remaining()
            r5 = 4
            if (r4 < r5) goto L1a
            int r2 = r10.getInt()
            long r2 = (long) r2
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L1a
            goto L3
        L1a:
            int r0 = r10.remaining()
            r1 = 0
            java.lang.String r4 = "Broken atom of size "
            if (r0 < r5) goto L5f
            r6 = 8
            r8 = 1
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L30
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L30
            goto L5f
        L30:
            java.lang.String r0 = org.jcodec.common.io.NIOUtils.readString(r10, r5)
            r5 = 0
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 != 0) goto L5a
            int r5 = r10.remaining()
            r6 = 8
            if (r5 < r6) goto L47
            r5 = 1
            long r2 = r10.getLong()
            goto L5a
        L47:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            org.jcodec.common.logging.Logger.error(r10)
            return r1
        L5a:
            org.jcodec.containers.mp4.boxes.Header r10 = newHeader(r0, r2, r5)
            return r10
        L5f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            org.jcodec.common.logging.Logger.error(r10)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            org.jcodec.containers.mp4.boxes.Header r5 = (org.jcodec.containers.mp4.boxes.Header) r5
            java.lang.String r2 = r4.fourcc
            if (r2 != 0) goto L1e
            java.lang.String r5 = r5.fourcc
            if (r5 == 0) goto L27
            return r1
        L1e:
            java.lang.String r5 = r5.fourcc
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    public long getBodySize() {
            r4 = this;
            long r0 = r4.size
            long r2 = r4.headerSize()
            long r0 = r0 - r2
            return r0
    }

    public java.lang.String getFourcc() {
            r1 = this;
            java.lang.String r0 = r1.fourcc
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.fourcc
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r1 = r1 + r0
            return r1
    }

    public long headerSize() {
            r5 = this;
            boolean r0 = r5.lng
            if (r0 != 0) goto L13
            long r0 = r5.size
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L10
            goto L13
        L10:
            r0 = 8
            goto L15
        L13:
            r0 = 16
        L15:
            return r0
    }

    public void setBodySize(int r5) {
            r4 = this;
            long r0 = (long) r5
            long r2 = r4.headerSize()
            long r0 = r0 + r2
            r4.size = r0
            return
    }

    public void write(java.nio.ByteBuffer r6) {
            r5 = this;
            long r0 = r5.size
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L10
            r0 = 1
            r6.putInt(r0)
            goto L14
        L10:
            int r1 = (int) r0
            r6.putInt(r1)
        L14:
            java.lang.String r0 = r5.fourcc
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r0)
            r6.put(r0)
            long r0 = r5.size
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L26
            r6.putLong(r0)
        L26:
            return
    }
}
