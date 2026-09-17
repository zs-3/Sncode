package com.googlecode.mp4parser.h264.write;

/* loaded from: classes2.dex */
public class CAVLCWriter extends com.googlecode.mp4parser.h264.write.BitstreamWriter {
    public CAVLCWriter(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void writeBool(boolean r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.<init>(r3)
            java.lang.String r3 = "\t"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.googlecode.mp4parser.h264.Debug.print(r0)
            r1.write1Bit(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.googlecode.mp4parser.h264.Debug.println(r2)
            return
    }

    public void writeNBit(long r4, int r6, java.lang.String r7) throws java.io.IOException {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.<init>(r7)
            java.lang.String r7 = "\t"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.googlecode.mp4parser.h264.Debug.print(r0)
            r0 = 0
        L16:
            if (r0 < r6) goto L28
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.googlecode.mp4parser.h264.Debug.println(r4)
            return
        L28:
            int r1 = r6 - r0
            int r1 = r1 + (-1)
            long r1 = r4 >> r1
            int r2 = (int) r1
            r1 = r2 & 1
            r3.write1Bit(r1)
            int r0 = r0 + 1
            goto L16
    }

    public void writeSE(int r4, java.lang.String r5) throws java.io.IOException {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.<init>(r5)
            java.lang.String r5 = "\t"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.googlecode.mp4parser.h264.Debug.print(r0)
            int r0 = r4 << 1
            r1 = 1
            if (r4 >= 0) goto L1c
            r2 = -1
            goto L1d
        L1c:
            r2 = 1
        L1d:
            int r0 = r0 * r2
            if (r4 <= 0) goto L22
            goto L23
        L22:
            r1 = 0
        L23:
            int r0 = r0 + r1
            r3.writeUE(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.googlecode.mp4parser.h264.Debug.println(r4)
            return
    }

    public void writeSliceTrailingBits() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "todo"
            r0.<init>(r1)
            throw r0
    }

    public void writeTrailingBits() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.write1Bit(r0)
            r1.writeRemainingZero()
            r1.flush()
            return
    }

    public void writeU(int r3, int r4) throws java.io.IOException {
            r2 = this;
            long r0 = (long) r3
            r2.writeNBit(r0, r4)
            return
    }

    public void writeU(int r3, int r4, java.lang.String r5) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.<init>(r5)
            java.lang.String r5 = "\t"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.googlecode.mp4parser.h264.Debug.print(r0)
            long r0 = (long) r3
            r2.writeNBit(r0, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.googlecode.mp4parser.h264.Debug.println(r3)
            return
    }

    public void writeUE(int r8) throws java.io.IOException {
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            r3 = 15
            r4 = 1
            if (r1 < r3) goto L9
            goto Lf
        L9:
            int r3 = r4 << r1
            int r3 = r3 + r2
            if (r8 >= r3) goto L1d
            r0 = r1
        Lf:
            r5 = 0
            r7.writeNBit(r5, r0)
            r7.write1Bit(r4)
            int r8 = r8 - r2
            long r1 = (long) r8
            r7.writeNBit(r1, r0)
            return
        L1d:
            int r1 = r1 + 1
            r2 = r3
            goto L3
    }

    public void writeUE(int r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.<init>(r3)
            java.lang.String r3 = "\t"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.googlecode.mp4parser.h264.Debug.print(r0)
            r1.writeUE(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.googlecode.mp4parser.h264.Debug.println(r2)
            return
    }
}
