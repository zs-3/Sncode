package org.jcodec.codecs.h264.decode;

/* loaded from: classes2.dex */
public class CAVLCReader {
    public static boolean readBool(org.jcodec.common.io.BitReader r3, java.lang.String r4) {
            int r3 = r3.read1Bit()
            r0 = 0
            r1 = 1
            if (r3 != 0) goto La
            r3 = 0
            goto Lb
        La:
            r3 = 1
        Lb:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2[r1] = r4
            org.jcodec.common.tools.Debug.trace(r2)
            return r3
    }

    public static int readNBit(org.jcodec.common.io.BitReader r1, int r2, java.lang.String r3) {
            int r1 = r1.readNBit(r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0 = 1
            r2[r0] = r3
            org.jcodec.common.tools.Debug.trace(r2)
            return r1
    }

    public static int readSE(org.jcodec.common.io.BitReader r2, java.lang.String r3) {
            int r2 = readUE(r2)
            int r2 = org.jcodec.codecs.h264.H264Utils.golomb2Signed(r2)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1 = 1
            r0[r1] = r3
            org.jcodec.common.tools.Debug.trace(r0)
            return r2
    }

    public static int readUE(org.jcodec.common.io.BitReader r4) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.read1Bit()
            if (r2 != 0) goto Lf
            r2 = 32
            if (r1 >= r2) goto Lf
            int r1 = r1 + 1
            goto L2
        Lf:
            if (r1 <= 0) goto L1d
            int r4 = r4.readNBit(r1)
            long r2 = (long) r4
            r4 = 1
            int r0 = r4 << r1
            int r0 = r0 - r4
            long r0 = (long) r0
            long r0 = r0 + r2
            int r0 = (int) r0
        L1d:
            return r0
    }

    public static int readUEtrace(org.jcodec.common.io.BitReader r2, java.lang.String r3) {
            int r2 = readUE(r2)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1 = 1
            r0[r1] = r3
            org.jcodec.common.tools.Debug.trace(r0)
            return r2
    }
}
