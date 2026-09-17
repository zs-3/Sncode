package com.googlecode.mp4parser.h264.read;

/* loaded from: classes2.dex */
public class BitstreamReader {
    protected static int bitsRead;
    private int curByte;
    protected com.googlecode.mp4parser.h264.CharCache debugBits;
    private java.io.InputStream is;
    int nBit;
    private int nextByte;

    public BitstreamReader(java.io.InputStream r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            com.googlecode.mp4parser.h264.CharCache r0 = new com.googlecode.mp4parser.h264.CharCache
            r1 = 50
            r0.<init>(r1)
            r2.debugBits = r0
            r2.is = r3
            int r0 = r3.read()
            r2.curByte = r0
            int r3 = r3.read()
            r2.nextByte = r3
            return
    }

    private void advance() throws java.io.IOException {
            r1 = this;
            int r0 = r1.nextByte
            r1.curByte = r0
            java.io.InputStream r0 = r1.is
            int r0 = r0.read()
            r1.nextByte = r0
            r0 = 0
            r1.nBit = r0
            return
    }

    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    public long getBitPosition() {
            r2 = this;
            int r0 = com.googlecode.mp4parser.h264.read.BitstreamReader.bitsRead
            int r0 = r0 * 8
            int r1 = r2.nBit
            int r1 = r1 % 8
            int r0 = r0 + r1
            long r0 = (long) r0
            return r0
    }

    public int getCurBit() {
            r1 = this;
            int r0 = r1.nBit
            return r0
    }

    public boolean isByteAligned() {
            r1 = this;
            int r0 = r1.nBit
            int r0 = r0 % 8
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean moreRBSPData() throws java.io.IOException {
            r5 = this;
            int r0 = r5.nBit
            r1 = 8
            if (r0 != r1) goto L9
            r5.advance()
        L9:
            int r0 = r5.nBit
            int r1 = r1 - r0
            r0 = 1
            int r1 = r1 - r0
            int r1 = r0 << r1
            int r2 = r1 << 1
            int r2 = r2 - r0
            int r3 = r5.curByte
            r2 = r2 & r3
            r4 = 0
            if (r2 != r1) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r2 = -1
            if (r3 == r2) goto L25
            int r3 = r5.nextByte
            if (r3 != r2) goto L26
            if (r1 == 0) goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }

    public int peakNextBits(int r9) throws java.io.IOException {
            r8 = this;
            r0 = 8
            if (r9 > r0) goto L48
            int r1 = r8.nBit
            if (r1 != r0) goto L11
            r8.advance()
            int r1 = r8.curByte
            r2 = -1
            if (r1 != r2) goto L11
            return r2
        L11:
            int r1 = r8.nBit
            int r2 = 16 - r1
            int[] r2 = new int[r2]
            r3 = 0
            r4 = 0
        L19:
            if (r1 < r0) goto L39
            r1 = 0
        L1c:
            if (r1 < r0) goto L2a
            r0 = 0
        L1f:
            if (r3 < r9) goto L22
            return r0
        L22:
            int r0 = r0 << 1
            r1 = r2[r3]
            r0 = r0 | r1
            int r3 = r3 + 1
            goto L1f
        L2a:
            int r5 = r4 + 1
            int r6 = r8.nextByte
            int r7 = 7 - r1
            int r6 = r6 >> r7
            r6 = r6 & 1
            r2[r4] = r6
            int r1 = r1 + 1
            r4 = r5
            goto L1c
        L39:
            int r5 = r4 + 1
            int r6 = r8.curByte
            int r7 = 7 - r1
            int r6 = r6 >> r7
            r6 = r6 & 1
            r2[r4] = r6
            int r1 = r1 + 1
            r4 = r5
            goto L19
        L48:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "N should be less then 8"
            r9.<init>(r0)
            throw r9
    }

    public int read1Bit() throws java.io.IOException {
            r3 = this;
            int r0 = r3.nBit
            r1 = 8
            if (r0 != r1) goto Lf
            r3.advance()
            int r0 = r3.curByte
            r1 = -1
            if (r0 != r1) goto Lf
            return r1
        Lf:
            int r0 = r3.curByte
            int r1 = r3.nBit
            int r2 = 7 - r1
            int r0 = r0 >> r2
            r0 = r0 & 1
            int r1 = r1 + 1
            r3.nBit = r1
            com.googlecode.mp4parser.h264.CharCache r1 = r3.debugBits
            if (r0 != 0) goto L23
            r2 = 48
            goto L25
        L23:
            r2 = 49
        L25:
            r1.append(r2)
            int r1 = com.googlecode.mp4parser.h264.read.BitstreamReader.bitsRead
            int r1 = r1 + 1
            com.googlecode.mp4parser.h264.read.BitstreamReader.bitsRead = r1
            return r0
    }

    public boolean readBool() throws java.io.IOException {
            r2 = this;
            int r0 = r2.read1Bit()
            r1 = 1
            if (r0 != r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    public int readByte() throws java.io.IOException {
            r1 = this;
            int r0 = r1.nBit
            if (r0 <= 0) goto L7
            r1.advance()
        L7:
            int r0 = r1.curByte
            r1.advance()
            return r0
    }

    public long readNBit(int r6) throws java.io.IOException {
            r5 = this;
            r0 = 64
            if (r6 > r0) goto L15
            r0 = 0
            r2 = 0
        L7:
            if (r2 < r6) goto La
            return r0
        La:
            r3 = 1
            long r0 = r0 << r3
            int r3 = r5.read1Bit()
            long r3 = (long) r3
            long r0 = r0 | r3
            int r2 = r2 + 1
            goto L7
        L15:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can not readByte more then 64 bit"
            r6.<init>(r0)
            throw r6
    }

    public long readRemainingByte() throws java.io.IOException {
            r2 = this;
            int r0 = r2.nBit
            int r0 = 8 - r0
            long r0 = r2.readNBit(r0)
            return r0
    }
}
