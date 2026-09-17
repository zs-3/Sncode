package org.jcodec.codecs.h264.io.model;

/* loaded from: classes2.dex */
public class ScalingList {
    public int[] scalingList;
    public boolean useDefaultScalingMatrixFlag;

    public ScalingList() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.jcodec.codecs.h264.io.model.ScalingList read(org.jcodec.common.io.BitReader r6, int r7) {
            org.jcodec.codecs.h264.io.model.ScalingList r0 = new org.jcodec.codecs.h264.io.model.ScalingList
            r0.<init>()
            int[] r1 = new int[r7]
            r0.scalingList = r1
            r1 = 0
            r2 = 8
            r3 = 8
            r4 = 0
        Lf:
            if (r4 >= r7) goto L34
            if (r2 == 0) goto L27
            java.lang.String r2 = "deltaScale"
            int r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readSE(r6, r2)
            int r2 = r2 + r3
            int r2 = r2 + 256
            int r2 = r2 % 256
            if (r4 != 0) goto L24
            if (r2 != 0) goto L24
            r5 = 1
            goto L25
        L24:
            r5 = 0
        L25:
            r0.useDefaultScalingMatrixFlag = r5
        L27:
            int[] r5 = r0.scalingList
            if (r2 != 0) goto L2c
            goto L2d
        L2c:
            r3 = r2
        L2d:
            r5[r4] = r3
            r3 = r5[r4]
            int r4 = r4 + 1
            goto Lf
        L34:
            return r0
    }

    public void write(org.jcodec.common.io.BitWriter r6) {
            r5 = this;
            boolean r0 = r5.useDefaultScalingMatrixFlag
            java.lang.String r1 = "SPS: "
            r2 = 0
            if (r0 == 0) goto Lb
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r6, r2, r1)
            return
        Lb:
            r0 = 8
        Ld:
            int[] r3 = r5.scalingList
            int r4 = r3.length
            if (r2 >= r4) goto L21
            r3 = r3[r2]
            int r3 = r3 - r0
            int r3 = r3 + (-256)
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r6, r3, r1)
            int[] r0 = r5.scalingList
            r0 = r0[r2]
            int r2 = r2 + 1
            goto Ld
        L21:
            return
    }
}
