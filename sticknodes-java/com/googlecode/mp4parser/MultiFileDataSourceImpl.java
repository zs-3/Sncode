package com.googlecode.mp4parser;

/* loaded from: classes2.dex */
public class MultiFileDataSourceImpl implements com.googlecode.mp4parser.DataSource {
    java.nio.channels.FileChannel[] fcs;
    int index;

    public MultiFileDataSourceImpl(java.io.File... r5) throws java.io.FileNotFoundException {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.index = r0
            int r1 = r5.length
            java.nio.channels.FileChannel[] r1 = new java.nio.channels.FileChannel[r1]
            r4.fcs = r1
        Lb:
            int r1 = r5.length
            if (r0 < r1) goto Lf
            return
        Lf:
            java.nio.channels.FileChannel[] r1 = r4.fcs
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r3 = r5[r0]
            r2.<init>(r3)
            java.nio.channels.FileChannel r2 = r2.getChannel()
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lb
    }

    @Override // com.googlecode.mp4parser.DataSource, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r4 = this;
            java.nio.channels.FileChannel[] r0 = r4.fcs
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 < r1) goto L7
            return
        L7:
            r3 = r0[r2]
            r3.close()
            int r2 = r2 + 1
            goto L4
    }

    @Override // com.googlecode.mp4parser.DataSource
    public java.nio.ByteBuffer map(long r9, long r11) throws java.io.IOException {
            r8 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            int r1 = com.googlecode.mp4parser.util.CastUtils.l2i(r11)
            r0.<init>(r1)
            java.nio.channels.WritableByteChannel r7 = java.nio.channels.Channels.newChannel(r0)
            r2 = r8
            r3 = r9
            r5 = r11
            r2.transferTo(r3, r5, r7)
            byte[] r9 = r0.toByteArray()
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            return r9
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long position() throws java.io.IOException {
            r5 = this;
            r0 = 0
            r2 = 0
        L3:
            int r3 = r5.index
            if (r2 < r3) goto L11
            java.nio.channels.FileChannel[] r2 = r5.fcs
            r2 = r2[r3]
            long r2 = r2.position()
            long r0 = r0 + r2
            return r0
        L11:
            java.nio.channels.FileChannel[] r3 = r5.fcs
            r3 = r3[r2]
            long r3 = r3.size()
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L3
    }

    @Override // com.googlecode.mp4parser.DataSource
    public void position(long r7) throws java.io.IOException {
            r6 = this;
            r0 = 0
        L1:
            java.nio.channels.FileChannel[] r1 = r6.fcs
            int r2 = r1.length
            if (r0 < r2) goto L7
            goto L1e
        L7:
            r1 = r1[r0]
            long r1 = r1.size()
            long r1 = r7 - r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1f
            java.nio.channels.FileChannel[] r1 = r6.fcs
            r1 = r1[r0]
            r1.position(r7)
            r6.index = r0
        L1e:
            return
        L1f:
            java.nio.channels.FileChannel[] r1 = r6.fcs
            r1 = r1[r0]
            long r1 = r1.size()
            long r7 = r7 - r1
            int r0 = r0 + 1
            goto L1
    }

    @Override // com.googlecode.mp4parser.DataSource
    public int read(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            int r0 = r4.remaining()
            java.nio.channels.FileChannel[] r1 = r3.fcs
            int r2 = r3.index
            r1 = r1[r2]
            int r1 = r1.read(r4)
            if (r1 == r0) goto L1b
            int r0 = r3.index
            int r0 = r0 + 1
            r3.index = r0
            int r4 = r3.read(r4)
            int r1 = r1 + r4
        L1b:
            return r1
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long size() throws java.io.IOException {
            r7 = this;
            java.nio.channels.FileChannel[] r0 = r7.fcs
            int r1 = r0.length
            r2 = 0
            r4 = 0
        L6:
            if (r4 < r1) goto L9
            return r2
        L9:
            r5 = r0[r4]
            long r5 = r5.size()
            long r2 = r2 + r5
            int r4 = r4 + 1
            goto L6
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long transferTo(long r19, long r21, java.nio.channels.WritableByteChannel r23) throws java.io.IOException {
            r18 = this;
            r0 = r21
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return r2
        L9:
            r4 = r18
            java.nio.channels.FileChannel[] r5 = r4.fcs
            int r6 = r5.length
            r7 = 0
            r8 = r2
        L10:
            if (r7 < r6) goto L13
            return r2
        L13:
            r10 = r5[r7]
            long r11 = r10.size()
            int r13 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r13 < 0) goto L47
            long r13 = r8 + r11
            int r15 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r15 >= 0) goto L47
            long r13 = r19 + r0
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 <= 0) goto L47
            long r2 = r19 - r8
            long r11 = r11 - r2
            long r16 = java.lang.Math.min(r0, r11)
            r11 = r2
            r13 = r16
            r15 = r23
            r10.transferTo(r11, r13, r15)
            long r6 = r19 + r16
            long r8 = r0 - r16
            r5 = r18
            r10 = r23
            long r0 = r5.transferTo(r6, r8, r10)
            long r16 = r16 + r0
            return r16
        L47:
            long r8 = r8 + r11
            int r7 = r7 + 1
            goto L10
    }
}
