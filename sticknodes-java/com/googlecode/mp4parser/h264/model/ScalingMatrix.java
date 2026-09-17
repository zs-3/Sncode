package com.googlecode.mp4parser.h264.model;

/* loaded from: classes2.dex */
public class ScalingMatrix {
    public com.googlecode.mp4parser.h264.model.ScalingList[] ScalingList4x4;
    public com.googlecode.mp4parser.h264.model.ScalingList[] ScalingList8x8;

    public ScalingMatrix() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScalingMatrix{ScalingList4x4="
            r0.<init>(r1)
            com.googlecode.mp4parser.h264.model.ScalingList[] r1 = r4.ScalingList4x4
            r2 = 0
            if (r1 != 0) goto Le
            r1 = r2
            goto L12
        Le:
            java.util.List r1 = java.util.Arrays.asList(r1)
        L12:
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r3 = ", ScalingList8x8="
            r0.append(r3)
            com.googlecode.mp4parser.h264.model.ScalingList[] r3 = r4.ScalingList8x8
            if (r3 != 0) goto L24
            goto L28
        L24:
            java.util.List r2 = java.util.Arrays.asList(r3)
        L28:
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
