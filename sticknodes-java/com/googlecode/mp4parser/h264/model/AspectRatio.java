package com.googlecode.mp4parser.h264.model;

/* loaded from: classes2.dex */
public class AspectRatio {
    public static final com.googlecode.mp4parser.h264.model.AspectRatio Extended_SAR = null;
    private int value;

    static {
            com.googlecode.mp4parser.h264.model.AspectRatio r0 = new com.googlecode.mp4parser.h264.model.AspectRatio
            r1 = 255(0xff, float:3.57E-43)
            r0.<init>(r1)
            com.googlecode.mp4parser.h264.model.AspectRatio.Extended_SAR = r0
            return
    }

    private AspectRatio(int r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public static com.googlecode.mp4parser.h264.model.AspectRatio fromValue(int r2) {
            com.googlecode.mp4parser.h264.model.AspectRatio r0 = com.googlecode.mp4parser.h264.model.AspectRatio.Extended_SAR
            int r1 = r0.value
            if (r2 != r1) goto L7
            return r0
        L7:
            com.googlecode.mp4parser.h264.model.AspectRatio r0 = new com.googlecode.mp4parser.h264.model.AspectRatio
            r0.<init>(r2)
            return r0
    }

    public int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AspectRatio{"
            r0.<init>(r1)
            java.lang.String r1 = "value="
            r0.append(r1)
            int r1 = r2.value
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
