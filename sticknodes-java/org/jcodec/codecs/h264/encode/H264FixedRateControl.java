package org.jcodec.codecs.h264.encode;

/* loaded from: classes2.dex */
public class H264FixedRateControl implements org.jcodec.codecs.h264.encode.RateControl {
    private int balance;
    private int curQp;
    private int perMb;

    public H264FixedRateControl(int r1) {
            r0 = this;
            r0.<init>()
            r0.perMb = r1
            r1 = 26
            r0.curQp = r1
            return
    }

    @Override // org.jcodec.codecs.h264.encode.RateControl
    public boolean accept(int r3) {
            r2 = this;
            int r0 = r2.balance
            int r1 = r2.perMb
            int r1 = r1 - r3
            int r0 = r0 + r1
            r2.balance = r0
            r3 = 1
            return r3
    }

    @Override // org.jcodec.codecs.h264.encode.RateControl
    public int getInitQp(org.jcodec.codecs.h264.io.model.SliceType r2) {
            r1 = this;
            org.jcodec.codecs.h264.io.model.SliceType r0 = org.jcodec.codecs.h264.io.model.SliceType.P
            if (r2 != r0) goto L6
            r2 = 4
            goto L7
        L6:
            r2 = 0
        L7:
            int r2 = r2 + 26
            return r2
    }

    @Override // org.jcodec.codecs.h264.encode.RateControl
    public int getQpDelta() {
            r4 = this;
            int r0 = r4.balance
            r1 = 2
            r2 = 1
            if (r0 >= 0) goto Lf
            int r3 = r4.perMb
            int r3 = r3 >> r2
            int r3 = -r3
            if (r0 >= r3) goto Ld
            goto L1c
        Ld:
            r1 = 1
            goto L1c
        Lf:
            int r2 = r4.perMb
            if (r0 <= r2) goto L1b
            int r1 = r2 << 2
            if (r0 <= r1) goto L19
            r1 = -2
            goto L1c
        L19:
            r1 = -1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            int r0 = r4.curQp
            int r1 = r1 + r0
            r2 = 12
            r3 = 30
            int r1 = org.jcodec.common.tools.MathUtil.clip(r1, r2, r3)
            r4.curQp = r1
            int r1 = r1 - r0
            return r1
    }

    @Override // org.jcodec.codecs.h264.encode.RateControl
    public void reset() {
            r1 = this;
            r0 = 0
            r1.balance = r0
            r0 = 26
            r1.curQp = r0
            return
    }
}
