package org.jcodec.codecs.h264.io.write;

/* loaded from: classes2.dex */
public class CAVLCWriter {
    public static void writeBool(org.jcodec.common.io.BitWriter r1, boolean r2, java.lang.String r3) {
            r1.write1Bit(r2)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0 = 0
            r1[r0] = r3
            r3 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r3] = r2
            org.jcodec.common.tools.Debug.trace(r1)
            return
    }

    public static void writeNBit(org.jcodec.common.io.BitWriter r5, long r6, int r8, java.lang.String r9) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 1
            if (r1 >= r8) goto L12
            int r3 = r8 - r1
            int r3 = r3 - r2
            long r3 = r6 >> r3
            int r4 = (int) r3
            r2 = r2 & r4
            r5.write1Bit(r2)
            int r1 = r1 + 1
            goto L2
        L12:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r0] = r9
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5[r2] = r6
            org.jcodec.common.tools.Debug.trace(r5)
            return
    }

    public static void writeSE(org.jcodec.common.io.BitWriter r0, int r1) {
            int r1 = org.jcodec.common.tools.MathUtil.golomb(r1)
            writeUE(r0, r1)
            return
    }

    public static void writeSEtrace(org.jcodec.common.io.BitWriter r1, int r2, java.lang.String r3) {
            int r0 = org.jcodec.common.tools.MathUtil.golomb(r2)
            writeUE(r1, r0)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0 = 0
            r1[r0] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            org.jcodec.common.tools.Debug.trace(r1)
            return
    }

    public static void writeTE(org.jcodec.common.io.BitWriter r1, int r2, int r3) {
            r0 = 1
            if (r3 <= r0) goto L7
            writeUE(r1, r2)
            goto Lc
        L7:
            int r2 = ~r2
            r2 = r2 & r0
            r1.write1Bit(r2)
        Lc:
            return
    }

    public static void writeTrailingBits(org.jcodec.common.io.BitWriter r1) {
            r0 = 1
            r1.write1Bit(r0)
            r1.flush()
            return
    }

    public static void writeU(org.jcodec.common.io.BitWriter r0, int r1, int r2) {
            r0.writeNBit(r1, r2)
            return
    }

    public static void writeUE(org.jcodec.common.io.BitWriter r5, int r6) {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            r3 = 15
            r4 = 1
            if (r1 >= r3) goto L12
            int r3 = r4 << r1
            int r3 = r3 + r2
            if (r6 >= r3) goto Le
            goto L13
        Le:
            int r1 = r1 + 1
            r2 = r3
            goto L3
        L12:
            r1 = 0
        L13:
            r5.writeNBit(r0, r1)
            r5.write1Bit(r4)
            int r6 = r6 - r2
            r5.writeNBit(r6, r1)
            return
    }

    public static void writeUEtrace(org.jcodec.common.io.BitWriter r1, int r2, java.lang.String r3) {
            writeUE(r1, r2)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0 = 0
            r1[r0] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            org.jcodec.common.tools.Debug.trace(r1)
            return
    }

    public static void writeUtrace(org.jcodec.common.io.BitWriter r0, int r1, int r2, java.lang.String r3) {
            r0.writeNBit(r1, r2)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            org.jcodec.common.tools.Debug.trace(r0)
            return
    }
}
