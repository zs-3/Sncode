package org.jcodec.scale;

/* loaded from: classes2.dex */
public class Yuv420pToYuv422p8Bit implements org.jcodec.scale.Transform8Bit {
    public Yuv420pToYuv422p8Bit() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final void _copy(byte[] r5, byte[] r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
            int r8 = r8 * r12
            int r7 = r7 + r8
            r8 = 0
            r0 = 0
            r1 = 0
        L6:
            if (r0 >= r13) goto L2b
            r2 = 0
        L9:
            if (r2 >= r11) goto L16
            int r3 = r1 + 1
            r1 = r5[r1]
            r6[r7] = r1
            int r7 = r7 + r9
            int r2 = r2 + 1
            r1 = r3
            goto L9
        L16:
            int r2 = r7 - r9
            int r3 = r11 * r9
        L1a:
            if (r3 >= r12) goto L23
            r4 = r6[r2]
            r6[r7] = r4
            int r7 = r7 + r9
            int r3 = r3 + r9
            goto L1a
        L23:
            int r2 = r10 + (-1)
            int r2 = r2 * r12
            int r7 = r7 + r2
            int r0 = r0 + 1
            goto L6
        L2b:
            int r5 = r10 * r12
            int r5 = r7 - r5
            int r13 = r13 * r10
        L31:
            if (r13 >= r14) goto L46
            r11 = 0
        L34:
            if (r11 >= r12) goto L3f
            int r0 = r5 + r11
            r0 = r6[r0]
            r6[r7] = r0
            int r7 = r7 + r9
            int r11 = r11 + r9
            goto L34
        L3f:
            int r11 = r10 + (-1)
            int r11 = r11 * r12
            int r7 = r7 + r11
            int r13 = r13 + r10
            goto L31
        L46:
            return
    }

    private static void copy(byte[] r8, byte[] r9, int r10, int r11, int r12) {
            int r0 = r8.length
            int r0 = r0 / r10
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L6:
            if (r2 >= r0) goto L2a
            r5 = 0
        L9:
            if (r5 >= r10) goto L18
            int r6 = r3 + 1
            int r7 = r4 + 1
            r4 = r8[r4]
            r9[r3] = r4
            int r5 = r5 + 1
            r3 = r6
            r4 = r7
            goto L9
        L18:
            r5 = r10
        L19:
            if (r5 >= r11) goto L27
            int r6 = r3 + 1
            int r7 = r10 + (-1)
            r7 = r9[r7]
            r9[r3] = r7
            int r5 = r5 + 1
            r3 = r6
            goto L19
        L27:
            int r2 = r2 + 1
            goto L6
        L2a:
            int r8 = r0 + (-1)
            int r8 = r8 * r11
        L2e:
            if (r0 >= r12) goto L42
            r10 = 0
        L31:
            if (r10 >= r11) goto L3f
            int r2 = r3 + 1
            int r4 = r8 + r10
            r4 = r9[r4]
            r9[r3] = r4
            int r10 = r10 + 1
            r3 = r2
            goto L31
        L3f:
            int r0 = r0 + 1
            goto L2e
        L42:
            return
    }

    @Override // org.jcodec.scale.Transform8Bit
    public void transform(org.jcodec.common.model.Picture8Bit r25, org.jcodec.common.model.Picture8Bit r26) {
            r24 = this;
            r0 = r25
            r1 = r26
            r2 = 0
            byte[] r3 = r0.getPlaneData(r2)
            byte[] r2 = r1.getPlaneData(r2)
            int r4 = r25.getWidth()
            int r5 = r26.getWidth()
            int r6 = r26.getHeight()
            copy(r3, r2, r4, r5, r6)
            r2 = 1
            byte[] r3 = r0.getPlaneData(r2)
            byte[] r4 = r1.getPlaneData(r2)
            int r5 = r25.getWidth()
            int r9 = r5 >> 1
            int r5 = r26.getWidth()
            int r10 = r5 >> 1
            int r5 = r25.getHeight()
            int r11 = r5 >> 1
            int r12 = r26.getHeight()
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 2
            _copy(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            byte[] r13 = r0.getPlaneData(r2)
            byte[] r14 = r1.getPlaneData(r2)
            int r3 = r25.getWidth()
            int r19 = r3 >> 1
            int r3 = r26.getWidth()
            int r20 = r3 >> 1
            int r3 = r25.getHeight()
            int r21 = r3 >> 1
            int r22 = r26.getHeight()
            r15 = 0
            r16 = 1
            r17 = 1
            r18 = 2
            _copy(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3 = 2
            byte[] r4 = r0.getPlaneData(r3)
            byte[] r5 = r1.getPlaneData(r3)
            int r6 = r25.getWidth()
            int r10 = r6 >> 1
            int r6 = r26.getWidth()
            int r11 = r6 >> 1
            int r6 = r25.getHeight()
            int r12 = r6 >> 1
            int r13 = r26.getHeight()
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 2
            _copy(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            byte[] r14 = r0.getPlaneData(r3)
            byte[] r15 = r1.getPlaneData(r3)
            int r3 = r25.getWidth()
            int r20 = r3 >> 1
            int r3 = r26.getWidth()
            int r21 = r3 >> 1
            int r0 = r25.getHeight()
            int r22 = r0 >> 1
            int r23 = r26.getHeight()
            r16 = 0
            r18 = 1
            r19 = 2
            _copy(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
    }
}
