package com.googlecode.mp4parser.h264.read;

/* loaded from: classes2.dex */
public class CAVLCReader extends com.googlecode.mp4parser.h264.read.BitstreamReader {
    public CAVLCReader(java.io.InputStream r1) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private int readUE() throws java.io.IOException {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.read1Bit()
            if (r2 == 0) goto L16
            if (r1 <= 0) goto L15
            long r2 = r4.readNBit(r1)
            r0 = 1
            int r1 = r0 << r1
            int r1 = r1 - r0
            long r0 = (long) r1
            long r0 = r0 + r2
            int r0 = (int) r0
        L15:
            return r0
        L16:
            int r1 = r1 + 1
            goto L2
    }

    private void trace(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = com.googlecode.mp4parser.h264.read.BitstreamReader.bitsRead
            com.googlecode.mp4parser.h264.CharCache r2 = r6.debugBits
            int r2 = r2.length()
            int r1 = r1 - r2
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            int r2 = 8 - r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "@"
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            r1 = 0
            r3 = 0
        L2b:
            r4 = 32
            if (r3 < r2) goto L70
            r0.append(r7)
            int r7 = r0.length()
            int r7 = 100 - r7
            com.googlecode.mp4parser.h264.CharCache r2 = r6.debugBits
            int r2 = r2.length()
            int r5 = r7 - r2
        L40:
            if (r1 < r5) goto L6a
            com.googlecode.mp4parser.h264.CharCache r7 = r6.debugBits
            r0.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = " ("
            r7.<init>(r1)
            r7.append(r8)
            java.lang.String r8 = ")"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r0.append(r7)
            com.googlecode.mp4parser.h264.CharCache r7 = r6.debugBits
            r7.clear()
            java.lang.String r7 = r0.toString()
            com.googlecode.mp4parser.h264.Debug.println(r7)
            return
        L6a:
            r0.append(r4)
            int r1 = r1 + 1
            goto L40
        L70:
            r0.append(r4)
            int r3 = r3 + 1
            goto L2b
    }

    public byte[] read(int r4) throws java.io.IOException {
            r3 = this;
            byte[] r0 = new byte[r4]
            r1 = 0
        L3:
            if (r1 < r4) goto L6
            return r0
        L6:
            int r2 = r3.readByte()
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
    }

    public boolean readAE() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Stan"
            r0.<init>(r1)
            throw r0
    }

    public int readAEI() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Stan"
            r0.<init>(r1)
            throw r0
    }

    public boolean readBool(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.read1Bit()
            if (r0 != 0) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = 1
        L9:
            if (r0 == 0) goto Le
            java.lang.String r1 = "1"
            goto L10
        Le:
            java.lang.String r1 = "0"
        L10:
            r2.trace(r3, r1)
            return r0
    }

    public java.lang.Object readCE(com.googlecode.mp4parser.h264.BTree r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
        L0:
            int r0 = r1.read1Bit()
            com.googlecode.mp4parser.h264.BTree r2 = r2.down(r0)
            if (r2 == 0) goto L18
            java.lang.Object r0 = r2.getValue()
            if (r0 == 0) goto L0
            java.lang.String r2 = r0.toString()
            r1.trace(r3, r2)
            return r0
        L18:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Illegal code"
            r2.<init>(r3)
            throw r2
    }

    public int readME(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.readUE(r1)
            return r1
    }

    public long readNBit(int r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            long r0 = r2.readNBit(r3)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r2.trace(r4, r3)
            return r0
    }

    public int readSE(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.readUE()
            r1 = r0 & 1
            int r2 = r1 << 1
            int r2 = r2 + (-1)
            int r0 = r0 >> 1
            int r0 = r0 + r1
            int r0 = r0 * r2
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r3.trace(r4, r1)
            return r0
    }

    public int readTE(int r2) throws java.io.IOException {
            r1 = this;
            r0 = 1
            if (r2 <= r0) goto L8
            int r2 = r1.readUE()
            return r2
        L8:
            int r2 = r1.read1Bit()
            int r2 = ~r2
            r2 = r2 & r0
            return r2
    }

    public void readTrailingBits() throws java.io.IOException {
            r0 = this;
            r0.read1Bit()
            r0.readRemainingByte()
            return
    }

    public int readU(int r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            long r1 = r0.readNBit(r1, r2)
            int r2 = (int) r1
            return r2
    }

    public int readUE(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.readUE()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r2.trace(r3, r1)
            return r0
    }

    public int readZeroBitCount(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.read1Bit()
            if (r1 == 0) goto Lf
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r2.trace(r3, r1)
            return r0
        Lf:
            int r0 = r0 + 1
            goto L1
    }
}
