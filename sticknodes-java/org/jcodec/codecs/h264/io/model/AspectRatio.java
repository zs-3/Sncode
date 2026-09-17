package org.jcodec.codecs.h264.io.model;

/* loaded from: classes2.dex */
public class AspectRatio {
    public static final org.jcodec.codecs.h264.io.model.AspectRatio Extended_SAR = null;
    private int value;

    static {
            org.jcodec.codecs.h264.io.model.AspectRatio r0 = new org.jcodec.codecs.h264.io.model.AspectRatio
            r1 = 255(0xff, float:3.57E-43)
            r0.<init>(r1)
            org.jcodec.codecs.h264.io.model.AspectRatio.Extended_SAR = r0
            return
    }

    private AspectRatio(int r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public static org.jcodec.codecs.h264.io.model.AspectRatio fromValue(int r2) {
            org.jcodec.codecs.h264.io.model.AspectRatio r0 = org.jcodec.codecs.h264.io.model.AspectRatio.Extended_SAR
            int r1 = r0.value
            if (r2 != r1) goto L7
            return r0
        L7:
            org.jcodec.codecs.h264.io.model.AspectRatio r0 = new org.jcodec.codecs.h264.io.model.AspectRatio
            r0.<init>(r2)
            return r0
    }

    public int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
