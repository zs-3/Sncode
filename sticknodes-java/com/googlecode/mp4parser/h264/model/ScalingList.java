package com.googlecode.mp4parser.h264.model;

/* loaded from: classes2.dex */
public class ScalingList {
    public int[] scalingList;
    public boolean useDefaultScalingMatrixFlag;

    public ScalingList() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.googlecode.mp4parser.h264.model.ScalingList read(com.googlecode.mp4parser.h264.read.CAVLCReader r6, int r7) throws java.io.IOException {
            com.googlecode.mp4parser.h264.model.ScalingList r0 = new com.googlecode.mp4parser.h264.model.ScalingList
            r0.<init>()
            int[] r1 = new int[r7]
            r0.scalingList = r1
            r1 = 0
            r2 = 8
            r3 = 8
            r4 = 0
        Lf:
            if (r4 < r7) goto L12
            return r0
        L12:
            if (r2 == 0) goto L28
            java.lang.String r2 = "deltaScale"
            int r2 = r6.readSE(r2)
            int r2 = r2 + r3
            int r2 = r2 + 256
            int r2 = r2 % 256
            if (r4 != 0) goto L25
            if (r2 != 0) goto L25
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            r0.useDefaultScalingMatrixFlag = r5
        L28:
            int[] r5 = r0.scalingList
            if (r2 != 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            r5[r4] = r3
            r3 = r5[r4]
            int r4 = r4 + 1
            goto Lf
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScalingList{scalingList="
            r0.<init>(r1)
            int[] r1 = r2.scalingList
            r0.append(r1)
            java.lang.String r1 = ", useDefaultScalingMatrixFlag="
            r0.append(r1)
            boolean r1 = r2.useDefaultScalingMatrixFlag
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void write(com.googlecode.mp4parser.h264.write.CAVLCWriter r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.useDefaultScalingMatrixFlag
            java.lang.String r1 = "SPS: "
            r2 = 0
            if (r0 == 0) goto Lb
            r6.writeSE(r2, r1)
            return
        Lb:
            r0 = 8
        Ld:
            int[] r3 = r5.scalingList
            int r4 = r3.length
            if (r2 < r4) goto L13
            return
        L13:
            r3 = r3[r2]
            int r3 = r3 - r0
            int r3 = r3 + (-256)
            r6.writeSE(r3, r1)
            int[] r0 = r5.scalingList
            r0 = r0[r2]
            int r2 = r2 + 1
            goto Ld
    }
}
