package org.jcodec.codecs.h264.decode;

/* loaded from: classes2.dex */
public class BlockInterpolator {
    private org.jcodec.codecs.h264.decode.BlockInterpolator.LumaInterpolator[] safe;
    private int[] tmp1;
    private int[] tmp2;
    private byte[] tmp3;
    private org.jcodec.codecs.h264.decode.BlockInterpolator.LumaInterpolator[] unsafe;

































    private interface LumaInterpolator {
        void getLuma(byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10);
    }

    /* renamed from: -$$Nest$mgetLuma00, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1351$$Nest$mgetLuma00(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma00(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma00Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1352$$Nest$mgetLuma00Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma00Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma01, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1353$$Nest$mgetLuma01(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma01(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma01Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1354$$Nest$mgetLuma01Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma01Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma02, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1355$$Nest$mgetLuma02(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma02(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma02Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1356$$Nest$mgetLuma02Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma02Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma03, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1357$$Nest$mgetLuma03(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma03(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma03Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1358$$Nest$mgetLuma03Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma03Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma10, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1359$$Nest$mgetLuma10(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma10(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma10Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1360$$Nest$mgetLuma10Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma10Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma11, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1361$$Nest$mgetLuma11(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma11(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma11Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1362$$Nest$mgetLuma11Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma11Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma12, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1363$$Nest$mgetLuma12(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma12(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma12Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1364$$Nest$mgetLuma12Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma12Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma13, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1365$$Nest$mgetLuma13(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma13(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma13Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1366$$Nest$mgetLuma13Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma13Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma20, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1367$$Nest$mgetLuma20(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma20(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma20Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1368$$Nest$mgetLuma20Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma20Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma21, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1369$$Nest$mgetLuma21(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma21(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma21Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1370$$Nest$mgetLuma21Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma21Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma22, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1371$$Nest$mgetLuma22(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma22(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma22Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1372$$Nest$mgetLuma22Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma22Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma23, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1373$$Nest$mgetLuma23(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma23(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma23Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1374$$Nest$mgetLuma23Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma23Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma30, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1375$$Nest$mgetLuma30(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma30(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma30Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1376$$Nest$mgetLuma30Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma30Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma31, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1377$$Nest$mgetLuma31(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma31(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma31Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1378$$Nest$mgetLuma31Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma31Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma32, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1379$$Nest$mgetLuma32(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma32(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma32Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1380$$Nest$mgetLuma32Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma32Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* renamed from: -$$Nest$mgetLuma33, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1381$$Nest$mgetLuma33(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getLuma33(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* renamed from: -$$Nest$mgetLuma33Unsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1382$$Nest$mgetLuma33Unsafe(org.jcodec.codecs.h264.decode.BlockInterpolator r0, byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0.getLuma33Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public BlockInterpolator() {
            r2 = this;
            r2.<init>()
            r0 = 1024(0x400, float:1.435E-42)
            int[] r1 = new int[r0]
            r2.tmp1 = r1
            int[] r1 = new int[r0]
            r2.tmp2 = r1
            byte[] r0 = new byte[r0]
            r2.tmp3 = r0
            org.jcodec.codecs.h264.decode.BlockInterpolator$LumaInterpolator[] r0 = r2.initSafe()
            r2.safe = r0
            org.jcodec.codecs.h264.decode.BlockInterpolator$LumaInterpolator[] r0 = r2.initUnsafe()
            r2.unsafe = r0
            return
    }

    private void getChroma00(byte[] r1, int r2, int r3, byte[] r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0 = this;
            int r8 = r8 * r2
            int r8 = r8 + r7
            r3 = 0
        L4:
            if (r3 >= r10) goto Le
            java.lang.System.arraycopy(r1, r8, r4, r5, r9)
            int r8 = r8 + r2
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L4
        Le:
            return
    }

    private void getChroma00Unsafe(byte[] r12, int r13, int r14, byte[] r15, int r16, int r17, int r18, int r19, int r20, int r21) {
            r11 = this;
            int r0 = r14 + (-1)
            int r1 = r13 + (-1)
            r2 = 0
            r3 = r16
            r4 = r21
            r5 = 0
        La:
            if (r5 >= r4) goto L2e
            int r6 = r5 + r19
            int r6 = org.jcodec.common.tools.MathUtil.clip(r6, r2, r0)
            int r6 = r6 * r13
            r7 = r20
            r8 = 0
        L17:
            if (r8 >= r7) goto L29
            int r9 = r3 + r8
            int r10 = r18 + r8
            int r10 = org.jcodec.common.tools.MathUtil.clip(r10, r2, r1)
            int r10 = r10 + r6
            r10 = r12[r10]
            r15[r9] = r10
            int r8 = r8 + 1
            goto L17
        L29:
            int r3 = r3 + r17
            int r5 = r5 + 1
            goto La
        L2e:
            return
    }

    private void getChroma0X(byte[] r13, int r14, int r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23) {
            r12 = this;
            r0 = r20
            int r1 = r0 * r14
            int r1 = r1 + r19
            int r2 = r15 + (-1)
            r3 = 0
            if (r0 >= r2) goto Ld
            r0 = r14
            goto Le
        Ld:
            r0 = 0
        Le:
            int r0 = r0 + r1
            int r2 = 8 - r21
            r5 = r23
            r4 = r1
            r6 = 0
            r1 = r0
            r0 = r17
        L18:
            if (r6 >= r5) goto L3f
            r7 = r22
            r8 = 0
        L1d:
            if (r8 >= r7) goto L38
            int r9 = r0 + r8
            int r10 = r4 + r8
            r10 = r13[r10]
            int r10 = r10 * r2
            int r11 = r1 + r8
            r11 = r13[r11]
            int r11 = r11 * r21
            int r10 = r10 + r11
            int r10 = r10 + 4
            int r10 = r10 >> 3
            byte r10 = (byte) r10
            r16[r9] = r10
            int r8 = r8 + 1
            goto L1d
        L38:
            int r4 = r4 + r14
            int r1 = r1 + r14
            int r0 = r0 + r18
            int r6 = r6 + 1
            goto L18
        L3f:
            return
    }

    private void getChroma0XUnsafe(byte[] r15, int r16, int r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25) {
            r14 = this;
            int r0 = r16 + (-1)
            int r1 = r17 + (-1)
            int r2 = 8 - r23
            r3 = 0
            r4 = r19
            r5 = r25
            r6 = 0
        Lc:
            if (r6 >= r5) goto L49
            int r7 = r22 + r6
            int r8 = org.jcodec.common.tools.MathUtil.clip(r7, r3, r1)
            int r8 = r8 * r16
            int r7 = r7 + 1
            int r7 = org.jcodec.common.tools.MathUtil.clip(r7, r3, r1)
            int r7 = r7 * r16
            r9 = r24
            r10 = 0
        L21:
            if (r10 >= r9) goto L44
            int r11 = r21 + r10
            int r12 = org.jcodec.common.tools.MathUtil.clip(r11, r3, r0)
            int r12 = r12 + r8
            int r11 = org.jcodec.common.tools.MathUtil.clip(r11, r3, r0)
            int r11 = r11 + r7
            int r13 = r4 + r10
            r12 = r15[r12]
            int r12 = r12 * r2
            r11 = r15[r11]
            int r11 = r11 * r23
            int r12 = r12 + r11
            int r12 = r12 + 4
            int r11 = r12 >> 3
            byte r11 = (byte) r11
            r18[r13] = r11
            int r10 = r10 + 1
            goto L21
        L44:
            int r4 = r4 + r20
            int r6 = r6 + 1
            goto Lc
        L49:
            return
    }

    private void getChromaX0(byte[] r13, int r14, int r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23) {
            r12 = this;
            r0 = r19
            int r1 = r20 * r14
            int r1 = r1 + r0
            int r2 = r14 + (-1)
            r3 = 0
            if (r0 >= r2) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            int r0 = r0 + r1
            int r2 = 8 - r21
            r5 = r23
            r4 = r1
            r6 = 0
            r1 = r0
            r0 = r17
        L17:
            if (r6 >= r5) goto L3e
            r7 = r22
            r8 = 0
        L1c:
            if (r8 >= r7) goto L37
            int r9 = r0 + r8
            int r10 = r4 + r8
            r10 = r13[r10]
            int r10 = r10 * r2
            int r11 = r1 + r8
            r11 = r13[r11]
            int r11 = r11 * r21
            int r10 = r10 + r11
            int r10 = r10 + 4
            int r10 = r10 >> 3
            byte r10 = (byte) r10
            r16[r9] = r10
            int r8 = r8 + 1
            goto L1c
        L37:
            int r4 = r4 + r14
            int r1 = r1 + r14
            int r0 = r0 + r18
            int r6 = r6 + 1
            goto L17
        L3e:
            return
    }

    private void getChromaX0Unsafe(byte[] r14, int r15, int r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24) {
            r13 = this;
            int r0 = 8 - r22
            int r1 = r15 + (-1)
            int r2 = r16 + (-1)
            r3 = 0
            r4 = r18
            r5 = r24
            r6 = 0
        Lc:
            if (r6 >= r5) goto L49
            r7 = r23
            r8 = 0
        L11:
            if (r8 >= r7) goto L44
            int r9 = r21 + r6
            int r10 = org.jcodec.common.tools.MathUtil.clip(r9, r3, r2)
            int r10 = r10 * r15
            int r11 = r20 + r8
            int r12 = org.jcodec.common.tools.MathUtil.clip(r11, r3, r1)
            int r10 = r10 + r12
            int r9 = org.jcodec.common.tools.MathUtil.clip(r9, r3, r2)
            int r9 = r9 * r15
            int r11 = r11 + 1
            int r11 = org.jcodec.common.tools.MathUtil.clip(r11, r3, r1)
            int r9 = r9 + r11
            int r11 = r4 + r8
            r10 = r14[r10]
            int r10 = r10 * r0
            r9 = r14[r9]
            int r9 = r9 * r22
            int r10 = r10 + r9
            int r10 = r10 + 4
            int r9 = r10 >> 3
            byte r9 = (byte) r9
            r17[r11] = r9
            int r8 = r8 + 1
            goto L11
        L44:
            int r4 = r4 + r19
            int r6 = r6 + 1
            goto Lc
        L49:
            return
    }

    private void getChromaXX(byte[] r17, int r18, int r19, byte[] r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28) {
            r16 = this;
            r0 = r23
            r1 = r24
            int r2 = r1 * r18
            int r2 = r2 + r0
            r3 = 1
            int r4 = r19 + (-1)
            r5 = 0
            if (r1 >= r4) goto L10
            r1 = r18
            goto L11
        L10:
            r1 = 0
        L11:
            int r1 = r1 + r2
            int r4 = r18 + (-1)
            if (r0 >= r4) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            int r3 = r3 + r2
            int r0 = r3 + r1
            int r0 = r0 - r2
            int r4 = 8 - r25
            int r6 = 8 - r26
            r8 = r28
            r7 = r3
            r9 = 0
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r21
        L29:
            if (r9 >= r8) goto L6c
            r10 = r27
            r11 = 0
        L2e:
            if (r11 >= r10) goto L5f
            int r12 = r0 + r11
            int r13 = r4 * r6
            int r14 = r3 + r11
            r14 = r17[r14]
            int r13 = r13 * r14
            int r14 = r25 * r6
            int r15 = r7 + r11
            r15 = r17[r15]
            int r14 = r14 * r15
            int r13 = r13 + r14
            int r14 = r4 * r26
            int r15 = r2 + r11
            r15 = r17[r15]
            int r14 = r14 * r15
            int r13 = r13 + r14
            int r14 = r25 * r26
            int r15 = r1 + r11
            r15 = r17[r15]
            int r14 = r14 * r15
            int r13 = r13 + r14
            int r13 = r13 + 32
            int r13 = r13 >> 6
            byte r13 = (byte) r13
            r20[r12] = r13
            int r11 = r11 + 1
            goto L2e
        L5f:
            int r0 = r0 + r22
            int r3 = r3 + r18
            int r2 = r2 + r18
            int r7 = r7 + r18
            int r1 = r1 + r18
            int r9 = r9 + 1
            goto L29
        L6c:
            return
    }

    private void getChromaXXUnsafe(byte[] r17, int r18, int r19, byte[] r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28) {
            r16 = this;
            int r0 = r19 + (-1)
            int r1 = r18 + (-1)
            int r2 = 8 - r25
            int r3 = 8 - r26
            r4 = 0
            r5 = r21
            r6 = r28
            r7 = 0
        Le:
            if (r7 >= r6) goto L75
            r8 = r27
            r9 = 0
        L13:
            if (r9 >= r8) goto L70
            int r10 = r24 + r7
            int r11 = org.jcodec.common.tools.MathUtil.clip(r10, r4, r0)
            int r11 = r11 * r18
            int r12 = r23 + r9
            int r13 = org.jcodec.common.tools.MathUtil.clip(r12, r4, r1)
            int r11 = r11 + r13
            int r13 = r10 + 1
            int r14 = org.jcodec.common.tools.MathUtil.clip(r13, r4, r0)
            int r14 = r14 * r18
            int r15 = org.jcodec.common.tools.MathUtil.clip(r12, r4, r1)
            int r14 = r14 + r15
            int r10 = org.jcodec.common.tools.MathUtil.clip(r10, r4, r0)
            int r10 = r10 * r18
            int r12 = r12 + 1
            int r15 = org.jcodec.common.tools.MathUtil.clip(r12, r4, r1)
            int r10 = r10 + r15
            int r13 = org.jcodec.common.tools.MathUtil.clip(r13, r4, r0)
            int r13 = r13 * r18
            int r12 = org.jcodec.common.tools.MathUtil.clip(r12, r4, r1)
            int r13 = r13 + r12
            int r12 = r5 + r9
            int r15 = r2 * r3
            r11 = r17[r11]
            int r15 = r15 * r11
            int r11 = r25 * r3
            r10 = r17[r10]
            int r11 = r11 * r10
            int r15 = r15 + r11
            int r10 = r2 * r26
            r11 = r17[r14]
            int r10 = r10 * r11
            int r15 = r15 + r10
            int r10 = r25 * r26
            r11 = r17[r13]
            int r10 = r10 * r11
            int r15 = r15 + r10
            int r15 = r15 + 32
            int r10 = r15 >> 6
            byte r10 = (byte) r10
            r20[r12] = r10
            int r9 = r9 + 1
            goto L13
        L70:
            int r5 = r5 + r22
            int r7 = r7 + 1
            goto Le
        L75:
            return
    }

    private void getLuma00(byte[] r1, int r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            int r7 = r7 * r2
            int r7 = r7 + r6
            r6 = 0
        L4:
            if (r6 >= r9) goto Le
            java.lang.System.arraycopy(r1, r7, r3, r4, r8)
            int r7 = r7 + r2
            int r4 = r4 + r5
            int r6 = r6 + 1
            goto L4
        Le:
            return
    }

    private void getLuma00Unsafe(byte[] r12, int r13, int r14, byte[] r15, int r16, int r17, int r18, int r19, int r20, int r21) {
            r11 = this;
            int r0 = r14 + (-1)
            int r1 = r13 + (-1)
            r2 = 0
            r3 = r16
            r4 = r21
            r5 = 0
        La:
            if (r5 >= r4) goto L2e
            int r6 = r5 + r19
            int r6 = org.jcodec.common.tools.MathUtil.clip(r6, r2, r0)
            int r6 = r6 * r13
            r7 = r20
            r8 = 0
        L17:
            if (r8 >= r7) goto L29
            int r9 = r3 + r8
            int r10 = r18 + r8
            int r10 = org.jcodec.common.tools.MathUtil.clip(r10, r2, r1)
            int r10 = r10 + r6
            r10 = r12[r10]
            r15[r9] = r10
            int r8 = r8 + 1
            goto L17
        L29:
            int r3 = r3 + r17
            int r5 = r5 + 1
            goto La
        L2e:
            return
    }

    private void getLuma01(byte[] r6, int r7, byte[] r8, int r9, int r10, int r11, int r12, int r13, int r14) {
            r5 = this;
            r5.getLuma02(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            int r12 = r12 * r7
            int r12 = r12 + r11
            r11 = 0
            r0 = 0
        L8:
            if (r0 >= r14) goto L25
            r1 = 0
        Lb:
            if (r1 >= r13) goto L20
            int r2 = r9 + r1
            r3 = r8[r2]
            int r4 = r12 + r1
            r4 = r6[r4]
            int r3 = r3 + r4
            int r3 = r3 + 1
            int r3 = r3 >> 1
            byte r3 = (byte) r3
            r8[r2] = r3
            int r1 = r1 + 1
            goto Lb
        L20:
            int r12 = r12 + r7
            int r9 = r9 + r10
            int r0 = r0 + 1
            goto L8
        L25:
            return
    }

    private void getLuma01Unsafe(byte[] r13, int r14, int r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r12 = this;
            int r0 = r15 + (-1)
            int r1 = r14 + (-1)
            r12.getLuma02Unsafe(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = 0
            r3 = r17
            r4 = r22
            r5 = 0
        Ld:
            if (r5 >= r4) goto L39
            int r6 = r20 + r5
            int r6 = org.jcodec.common.tools.MathUtil.clip(r6, r2, r0)
            int r6 = r6 * r14
            r7 = r21
            r8 = 0
        L1a:
            if (r8 >= r7) goto L34
            int r9 = r3 + r8
            r10 = r16[r9]
            int r11 = r19 + r8
            int r11 = org.jcodec.common.tools.MathUtil.clip(r11, r2, r1)
            int r11 = r11 + r6
            r11 = r13[r11]
            int r10 = r10 + r11
            int r10 = r10 + 1
            int r10 = r10 >> 1
            byte r10 = (byte) r10
            r16[r9] = r10
            int r8 = r8 + 1
            goto L1a
        L34:
            int r3 = r3 + r18
            int r5 = r5 + 1
            goto Ld
        L39:
            return
    }

    private void getLuma02(byte[] r16, int r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24) {
            r15 = this;
            int r0 = r22 + (-2)
            int r0 = r0 * r17
            int r0 = r0 + r21
            int r1 = r17 + r17
            int r2 = r1 + r17
            int r3 = r2 + r17
            int r4 = r3 + r17
            r5 = 0
            r7 = r24
            r6 = r0
            r8 = 0
            r0 = r19
        L15:
            if (r8 >= r7) goto L57
            r9 = r23
            r10 = 0
        L1a:
            if (r10 >= r9) goto L50
            int r11 = r6 + r10
            r12 = r16[r11]
            int r13 = r11 + r4
            r13 = r16[r13]
            int r12 = r12 + r13
            int r13 = r11 + r17
            r13 = r16[r13]
            int r14 = r11 + r3
            r14 = r16[r14]
            int r13 = r13 + r14
            int r14 = r11 + r1
            r14 = r16[r14]
            int r11 = r11 + r2
            r11 = r16[r11]
            int r14 = r14 + r11
            int r11 = r0 + r10
            int r14 = r14 << 2
            int r14 = r14 - r13
            int r14 = r14 * 5
            int r12 = r12 + r14
            int r12 = r12 + 16
            int r12 = r12 >> 5
            r13 = -128(0xffffffffffffff80, float:NaN)
            r14 = 127(0x7f, float:1.78E-43)
            int r12 = org.jcodec.common.tools.MathUtil.clip(r12, r13, r14)
            byte r12 = (byte) r12
            r18[r11] = r12
            int r10 = r10 + 1
            goto L1a
        L50:
            int r6 = r6 + r17
            int r0 = r0 + r20
            int r8 = r8 + 1
            goto L15
        L57:
            return
    }

    private void getLuma02NoRound(byte[] r16, int r17, int[] r18, int r19, int r20, int r21, int r22, int r23, int r24) {
            r15 = this;
            int r0 = r22 + (-2)
            int r0 = r0 * r17
            int r0 = r0 + r21
            int r1 = r17 + r17
            int r2 = r1 + r17
            int r3 = r2 + r17
            int r4 = r3 + r17
            r5 = 0
            r7 = r24
            r6 = r0
            r8 = 0
            r0 = r19
        L15:
            if (r8 >= r7) goto L4a
            r9 = r23
            r10 = 0
        L1a:
            if (r10 >= r9) goto L43
            int r11 = r6 + r10
            r12 = r16[r11]
            int r13 = r11 + r4
            r13 = r16[r13]
            int r12 = r12 + r13
            int r13 = r11 + r17
            r13 = r16[r13]
            int r14 = r11 + r3
            r14 = r16[r14]
            int r13 = r13 + r14
            int r14 = r11 + r1
            r14 = r16[r14]
            int r11 = r11 + r2
            r11 = r16[r11]
            int r14 = r14 + r11
            int r11 = r0 + r10
            int r14 = r14 << 2
            int r14 = r14 - r13
            int r14 = r14 * 5
            int r12 = r12 + r14
            r18[r11] = r12
            int r10 = r10 + 1
            goto L1a
        L43:
            int r6 = r6 + r17
            int r0 = r0 + r20
            int r8 = r8 + 1
            goto L15
        L4a:
            return
    }

    private void getLuma02NoRoundInt(int[] r16, int r17, int[] r18, int r19, int r20, int r21, int r22, int r23, int r24) {
            r15 = this;
            int r0 = r22 + (-2)
            int r0 = r0 * r17
            int r0 = r0 + r21
            int r1 = r17 + r17
            int r2 = r1 + r17
            int r3 = r2 + r17
            int r4 = r3 + r17
            r5 = 0
            r7 = r24
            r6 = r0
            r8 = 0
            r0 = r19
        L15:
            if (r8 >= r7) goto L4a
            r9 = r23
            r10 = 0
        L1a:
            if (r10 >= r9) goto L43
            int r11 = r6 + r10
            r12 = r16[r11]
            int r13 = r11 + r4
            r13 = r16[r13]
            int r12 = r12 + r13
            int r13 = r11 + r17
            r13 = r16[r13]
            int r14 = r11 + r3
            r14 = r16[r14]
            int r13 = r13 + r14
            int r14 = r11 + r1
            r14 = r16[r14]
            int r11 = r11 + r2
            r11 = r16[r11]
            int r14 = r14 + r11
            int r11 = r0 + r10
            int r14 = r14 << 2
            int r14 = r14 - r13
            int r14 = r14 * 5
            int r12 = r12 + r14
            r18[r11] = r12
            int r10 = r10 + 1
            goto L1a
        L43:
            int r6 = r6 + r17
            int r0 = r0 + r20
            int r8 = r8 + 1
            goto L15
        L4a:
            return
    }

    private void getLuma02Unsafe(byte[] r13, int r14, int r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r12 = this;
            r11 = r12
            int[] r4 = r11.tmp1
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r0.getLuma02UnsafeNoRound(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 0
            r1 = r17
            r2 = r22
            r3 = 0
        L1c:
            if (r3 >= r2) goto L40
            r4 = r21
            r5 = 0
        L21:
            if (r5 >= r4) goto L3b
            int r6 = r1 + r5
            int[] r7 = r11.tmp1
            r7 = r7[r6]
            int r7 = r7 + 16
            int r7 = r7 >> 5
            r8 = -128(0xffffffffffffff80, float:NaN)
            r9 = 127(0x7f, float:1.78E-43)
            int r7 = org.jcodec.common.tools.MathUtil.clip(r7, r8, r9)
            byte r7 = (byte) r7
            r16[r6] = r7
            int r5 = r5 + 1
            goto L21
        L3b:
            int r1 = r1 + r18
            int r3 = r3 + 1
            goto L1c
        L40:
            return
    }

    private void getLuma02UnsafeNoRound(byte[] r19, int r20, int r21, int[] r22, int r23, int r24, int r25, int r26, int r27, int r28) {
            r18 = this;
            int r0 = r21 + (-1)
            int r1 = r20 + (-1)
            r2 = 0
            r3 = r23
            r4 = r28
            r5 = 0
        La:
            if (r5 >= r4) goto L78
            int r6 = r26 + r5
            int r7 = r6 + (-2)
            int r7 = org.jcodec.common.tools.MathUtil.clip(r7, r2, r0)
            int r7 = r7 * r20
            int r8 = r6 + (-1)
            int r8 = org.jcodec.common.tools.MathUtil.clip(r8, r2, r0)
            int r8 = r8 * r20
            int r9 = org.jcodec.common.tools.MathUtil.clip(r6, r2, r0)
            int r9 = r9 * r20
            int r10 = r6 + 1
            int r10 = org.jcodec.common.tools.MathUtil.clip(r10, r2, r0)
            int r10 = r10 * r20
            int r11 = r6 + 2
            int r11 = org.jcodec.common.tools.MathUtil.clip(r11, r2, r0)
            int r11 = r11 * r20
            int r6 = r6 + 3
            int r6 = org.jcodec.common.tools.MathUtil.clip(r6, r2, r0)
            int r6 = r6 * r20
            r12 = r27
            r13 = 0
        L3f:
            if (r13 >= r12) goto L73
            int r14 = r25 + r13
            int r14 = org.jcodec.common.tools.MathUtil.clip(r14, r2, r1)
            int r15 = r14 + r7
            r15 = r19[r15]
            int r16 = r14 + r6
            r16 = r19[r16]
            int r15 = r15 + r16
            int r16 = r14 + r8
            r16 = r19[r16]
            int r17 = r14 + r11
            r17 = r19[r17]
            int r16 = r16 + r17
            int r17 = r14 + r9
            r17 = r19[r17]
            int r14 = r14 + r10
            r14 = r19[r14]
            int r17 = r17 + r14
            int r14 = r3 + r13
            int r17 = r17 << 2
            int r17 = r17 - r16
            int r17 = r17 * 5
            int r15 = r15 + r17
            r22[r14] = r15
            int r13 = r13 + 1
            goto L3f
        L73:
            int r3 = r3 + r24
            int r5 = r5 + 1
            goto La
        L78:
            return
    }

    private void getLuma03(byte[] r6, int r7, byte[] r8, int r9, int r10, int r11, int r12, int r13, int r14) {
            r5 = this;
            r5.getLuma02(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            int r12 = r12 * r7
            int r12 = r12 + r11
            r11 = 0
            r0 = 0
        L8:
            if (r0 >= r14) goto L26
            r1 = 0
        Lb:
            if (r1 >= r13) goto L21
            int r2 = r9 + r1
            r3 = r8[r2]
            int r4 = r12 + r1
            int r4 = r4 + r7
            r4 = r6[r4]
            int r3 = r3 + r4
            int r3 = r3 + 1
            int r3 = r3 >> 1
            byte r3 = (byte) r3
            r8[r2] = r3
            int r1 = r1 + 1
            goto Lb
        L21:
            int r12 = r12 + r7
            int r9 = r9 + r10
            int r0 = r0 + 1
            goto L8
        L26:
            return
    }

    private void getLuma03Unsafe(byte[] r13, int r14, int r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r12 = this;
            int r0 = r15 + (-1)
            int r1 = r14 + (-1)
            r12.getLuma02Unsafe(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = 0
            r3 = r17
            r4 = r22
            r5 = 0
        Ld:
            if (r5 >= r4) goto L3b
            int r6 = r20 + r5
            int r6 = r6 + 1
            int r6 = org.jcodec.common.tools.MathUtil.clip(r6, r2, r0)
            int r6 = r6 * r14
            r7 = r21
            r8 = 0
        L1c:
            if (r8 >= r7) goto L36
            int r9 = r3 + r8
            r10 = r16[r9]
            int r11 = r19 + r8
            int r11 = org.jcodec.common.tools.MathUtil.clip(r11, r2, r1)
            int r11 = r11 + r6
            r11 = r13[r11]
            int r10 = r10 + r11
            int r10 = r10 + 1
            int r10 = r10 >> 1
            byte r10 = (byte) r10
            r16[r9] = r10
            int r8 = r8 + 1
            goto L1c
        L36:
            int r3 = r3 + r18
            int r5 = r5 + 1
            goto Ld
        L3b:
            return
    }

    private void getLuma10(byte[] r6, int r7, byte[] r8, int r9, int r10, int r11, int r12, int r13, int r14) {
            r5 = this;
            r5.getLuma20(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            int r12 = r12 * r7
            int r12 = r12 + r11
            r11 = 0
            r0 = 0
        L8:
            if (r0 >= r14) goto L25
            r1 = 0
        Lb:
            if (r1 >= r13) goto L20
            int r2 = r9 + r1
            r3 = r8[r2]
            int r4 = r12 + r1
            r4 = r6[r4]
            int r3 = r3 + r4
            int r3 = r3 + 1
            int r3 = r3 >> 1
            byte r3 = (byte) r3
            r8[r2] = r3
            int r1 = r1 + 1
            goto Lb
        L20:
            int r12 = r12 + r7
            int r9 = r9 + r10
            int r0 = r0 + 1
            goto L8
        L25:
            return
    }

    private void getLuma10Unsafe(byte[] r13, int r14, int r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r12 = this;
            int r0 = r15 + (-1)
            int r1 = r14 + (-1)
            r12.getLuma20Unsafe(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = 0
            r3 = r17
            r4 = r22
            r5 = 0
        Ld:
            if (r5 >= r4) goto L39
            int r6 = r5 + r20
            int r6 = org.jcodec.common.tools.MathUtil.clip(r6, r2, r0)
            int r6 = r6 * r14
            r7 = r21
            r8 = 0
        L1a:
            if (r8 >= r7) goto L34
            int r9 = r3 + r8
            r10 = r16[r9]
            int r11 = r19 + r8
            int r11 = org.jcodec.common.tools.MathUtil.clip(r11, r2, r1)
            int r11 = r11 + r6
            r11 = r13[r11]
            int r10 = r10 + r11
            int r10 = r10 + 1
            int r10 = r10 >> 1
            byte r10 = (byte) r10
            r16[r9] = r10
            int r8 = r8 + 1
            goto L1a
        L34:
            int r3 = r3 + r18
            int r5 = r5 + 1
            goto Ld
        L39:
            return
    }

    private void getLuma11(byte[] r12, int r13, byte[] r14, int r15, int r16, int r17, int r18, int r19, int r20) {
            r11 = this;
            r10 = r11
            r11.getLuma20(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            byte[] r3 = r10.tmp3
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r5 = r19
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r0.getLuma02(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            byte[] r2 = r10.tmp3
            r1 = r14
            r3 = r15
            r4 = r16
            r6 = r20
            r0.merge(r1, r2, r3, r4, r5, r6)
            return
    }

    private void getLuma11Unsafe(byte[] r13, int r14, int r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r12 = this;
            r11 = r12
            r12.getLuma20Unsafe(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            byte[] r4 = r11.tmp3
            r5 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r6 = r21
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r0.getLuma02Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            byte[] r2 = r11.tmp3
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r6 = r22
            r0.merge(r1, r2, r3, r4, r5, r6)
            return
    }

    private void getLuma12(byte[] r16, int r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24) {
            r15 = this;
            r10 = r15
            r11 = r23
            int r12 = r11 + 7
            int[] r3 = r10.tmp1
            r13 = 2
            int r6 = r21 + (-2)
            r4 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r5 = r12
            r7 = r22
            r8 = r12
            r9 = r24
            r0.getLuma02NoRound(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int[] r1 = r10.tmp1
            int[] r3 = r10.tmp2
            r6 = 2
            r7 = 0
            r2 = r12
            r4 = r19
            r5 = r20
            r8 = r23
            r0.getLuma20NoRoundInt(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = r19
            r2 = r24
            r3 = 0
        L2f:
            if (r3 >= r2) goto L65
            r4 = 0
        L32:
            if (r4 >= r11) goto L5f
            int[] r5 = r10.tmp2
            int r6 = r1 + r4
            r5 = r5[r6]
            int r5 = r5 + 512
            int r5 = r5 >> 10
            r7 = -128(0xffffffffffffff80, float:NaN)
            r8 = 127(0x7f, float:1.78E-43)
            int r5 = org.jcodec.common.tools.MathUtil.clip(r5, r7, r8)
            int[] r9 = r10.tmp1
            int r14 = r13 + r4
            r9 = r9[r14]
            int r9 = r9 + 16
            int r9 = r9 >> 5
            int r7 = org.jcodec.common.tools.MathUtil.clip(r9, r7, r8)
            int r5 = r5 + r7
            int r5 = r5 + 1
            int r5 = r5 >> 1
            byte r5 = (byte) r5
            r18[r6] = r5
            int r4 = r4 + 1
            goto L32
        L5f:
            int r1 = r1 + r20
            int r13 = r13 + r12
            int r3 = r3 + 1
            goto L2f
        L65:
            return
    }

    private void getLuma12Unsafe(byte[] r16, int r17, int r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25) {
            r15 = this;
            r11 = r15
            r12 = r24
            int r13 = r12 + 7
            int[] r4 = r11.tmp1
            r14 = 2
            int r7 = r22 + (-2)
            r5 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r6 = r13
            r8 = r23
            r9 = r13
            r10 = r25
            r0.getLuma02UnsafeNoRound(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int[] r1 = r11.tmp1
            int[] r3 = r11.tmp2
            r6 = 2
            r7 = 0
            r2 = r13
            r4 = r20
            r5 = r21
            r8 = r24
            r9 = r25
            r0.getLuma20NoRoundInt(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = r20
            r2 = r25
            r3 = 0
        L33:
            if (r3 >= r2) goto L69
            r4 = 0
        L36:
            if (r4 >= r12) goto L63
            int[] r5 = r11.tmp2
            int r6 = r1 + r4
            r5 = r5[r6]
            int r5 = r5 + 512
            int r5 = r5 >> 10
            r7 = -128(0xffffffffffffff80, float:NaN)
            r8 = 127(0x7f, float:1.78E-43)
            int r5 = org.jcodec.common.tools.MathUtil.clip(r5, r7, r8)
            int[] r9 = r11.tmp1
            int r10 = r14 + r4
            r9 = r9[r10]
            int r9 = r9 + 16
            int r9 = r9 >> 5
            int r7 = org.jcodec.common.tools.MathUtil.clip(r9, r7, r8)
            int r5 = r5 + r7
            int r5 = r5 + 1
            int r5 = r5 >> 1
            byte r5 = (byte) r5
            r19[r6] = r5
            int r4 = r4 + 1
            goto L36
        L63:
            int r1 = r1 + r21
            int r14 = r14 + r13
            int r3 = r3 + 1
            goto L33
        L69:
            return
    }

    private void getLuma13(byte[] r12, int r13, byte[] r14, int r15, int r16, int r17, int r18, int r19, int r20) {
            r11 = this;
            r10 = r11
            int r7 = r18 + 1
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r19
            r9 = r20
            r0.getLuma20(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            byte[] r3 = r10.tmp3
            r4 = 0
            r5 = r19
            r7 = r18
            r0.getLuma02(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            byte[] r2 = r10.tmp3
            r1 = r14
            r3 = r15
            r4 = r16
            r6 = r20
            r0.merge(r1, r2, r3, r4, r5, r6)
            return
    }

    private void getLuma13Unsafe(byte[] r13, int r14, int r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r12 = this;
            r11 = r12
            int r8 = r20 + 1
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r9 = r21
            r10 = r22
            r0.getLuma20Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            byte[] r4 = r11.tmp3
            r5 = 0
            r6 = r21
            r8 = r20
            r0.getLuma02Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            byte[] r2 = r11.tmp3
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r6 = r22
            r0.merge(r1, r2, r3, r4, r5, r6)
            return
    }

    private void getLuma20(byte[] r13, int r14, byte[] r15, int r16, int r17, int r18, int r19, int r20, int r21) {
            r12 = this;
            int r0 = r19 * r14
            int r0 = r0 + r18
            r1 = 0
            r3 = r21
            r2 = r0
            r4 = 0
            r0 = r16
        Lb:
            if (r4 >= r3) goto L50
            r5 = -2
            r6 = r20
            r7 = 0
        L11:
            if (r7 >= r6) goto L4a
            int r8 = r2 + r5
            r9 = r13[r8]
            int r10 = r8 + 5
            r10 = r13[r10]
            int r9 = r9 + r10
            int r10 = r8 + 1
            r10 = r13[r10]
            int r11 = r8 + 4
            r11 = r13[r11]
            int r10 = r10 + r11
            int r11 = r8 + 2
            r11 = r13[r11]
            int r8 = r8 + 3
            r8 = r13[r8]
            int r11 = r11 + r8
            int r8 = r0 + r7
            int r11 = r11 << 2
            int r11 = r11 - r10
            int r11 = r11 * 5
            int r9 = r9 + r11
            int r9 = r9 + 16
            int r9 = r9 >> 5
            r10 = -128(0xffffffffffffff80, float:NaN)
            r11 = 127(0x7f, float:1.78E-43)
            int r9 = org.jcodec.common.tools.MathUtil.clip(r9, r10, r11)
            byte r9 = (byte) r9
            r15[r8] = r9
            int r5 = r5 + 1
            int r7 = r7 + 1
            goto L11
        L4a:
            int r2 = r2 + r14
            int r0 = r0 + r17
            int r4 = r4 + 1
            goto Lb
        L50:
            return
    }

    private void getLuma20NoRound(byte[] r13, int r14, int[] r15, int r16, int r17, int r18, int r19, int r20, int r21) {
            r12 = this;
            int r0 = r19 * r14
            int r0 = r0 + r18
            r1 = 0
            r3 = r21
            r2 = r0
            r4 = 0
            r0 = r16
        Lb:
            if (r4 >= r3) goto L43
            r5 = -2
            r6 = r20
            r7 = 0
        L11:
            if (r7 >= r6) goto L3d
            int r8 = r2 + r5
            r9 = r13[r8]
            int r10 = r8 + 5
            r10 = r13[r10]
            int r9 = r9 + r10
            int r10 = r8 + 1
            r10 = r13[r10]
            int r11 = r8 + 4
            r11 = r13[r11]
            int r10 = r10 + r11
            int r11 = r8 + 2
            r11 = r13[r11]
            int r8 = r8 + 3
            r8 = r13[r8]
            int r11 = r11 + r8
            int r8 = r0 + r7
            int r11 = r11 << 2
            int r11 = r11 - r10
            int r11 = r11 * 5
            int r9 = r9 + r11
            r15[r8] = r9
            int r5 = r5 + 1
            int r7 = r7 + 1
            goto L11
        L3d:
            int r2 = r2 + r14
            int r0 = r0 + r17
            int r4 = r4 + 1
            goto Lb
        L43:
            return
    }

    private void getLuma20NoRoundInt(int[] r13, int r14, int[] r15, int r16, int r17, int r18, int r19, int r20, int r21) {
            r12 = this;
            int r0 = r19 * r14
            int r0 = r0 + r18
            r1 = 0
            r3 = r21
            r2 = r0
            r4 = 0
            r0 = r16
        Lb:
            if (r4 >= r3) goto L43
            r5 = -2
            r6 = r20
            r7 = 0
        L11:
            if (r7 >= r6) goto L3d
            int r8 = r2 + r5
            r9 = r13[r8]
            int r10 = r8 + 5
            r10 = r13[r10]
            int r9 = r9 + r10
            int r10 = r8 + 1
            r10 = r13[r10]
            int r11 = r8 + 4
            r11 = r13[r11]
            int r10 = r10 + r11
            int r11 = r8 + 2
            r11 = r13[r11]
            int r8 = r8 + 3
            r8 = r13[r8]
            int r11 = r11 + r8
            int r8 = r0 + r7
            int r11 = r11 << 2
            int r11 = r11 - r10
            int r11 = r11 * 5
            int r9 = r9 + r11
            r15[r8] = r9
            int r5 = r5 + 1
            int r7 = r7 + 1
            goto L11
        L3d:
            int r2 = r2 + r14
            int r0 = r0 + r17
            int r4 = r4 + 1
            goto Lb
        L43:
            return
    }

    private void getLuma20Unsafe(byte[] r13, int r14, int r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r12 = this;
            r11 = r12
            int[] r4 = r11.tmp1
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r0.getLuma20UnsafeNoRound(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 0
            r1 = r21
            r2 = 0
        L1a:
            if (r2 >= r1) goto L40
            r5 = r17
            r3 = r22
            r4 = 0
        L21:
            if (r4 >= r3) goto L3d
            int r6 = r5 + r2
            int[] r7 = r11.tmp1
            r7 = r7[r6]
            int r7 = r7 + 16
            int r7 = r7 >> 5
            r8 = -128(0xffffffffffffff80, float:NaN)
            r9 = 127(0x7f, float:1.78E-43)
            int r7 = org.jcodec.common.tools.MathUtil.clip(r7, r8, r9)
            byte r7 = (byte) r7
            r16[r6] = r7
            int r5 = r5 + r18
            int r4 = r4 + 1
            goto L21
        L3d:
            int r2 = r2 + 1
            goto L1a
        L40:
            return
    }

    private void getLuma20UnsafeNoRound(byte[] r19, int r20, int r21, int[] r22, int r23, int r24, int r25, int r26, int r27, int r28) {
            r18 = this;
            int r0 = r20 + (-1)
            int r1 = r21 + (-1)
            r2 = 0
            r3 = r27
            r4 = 0
        L8:
            if (r4 >= r3) goto L6e
            int r5 = r25 + r4
            int r6 = r5 + (-2)
            int r6 = org.jcodec.common.tools.MathUtil.clip(r6, r2, r0)
            int r7 = r5 + (-1)
            int r7 = org.jcodec.common.tools.MathUtil.clip(r7, r2, r0)
            int r8 = org.jcodec.common.tools.MathUtil.clip(r5, r2, r0)
            int r9 = r5 + 1
            int r9 = org.jcodec.common.tools.MathUtil.clip(r9, r2, r0)
            int r10 = r5 + 2
            int r10 = org.jcodec.common.tools.MathUtil.clip(r10, r2, r0)
            int r5 = r5 + 3
            int r5 = org.jcodec.common.tools.MathUtil.clip(r5, r2, r0)
            r13 = r23
            r11 = r28
            r12 = 0
        L33:
            if (r12 >= r11) goto L6b
            int r14 = r12 + r26
            int r14 = org.jcodec.common.tools.MathUtil.clip(r14, r2, r1)
            int r14 = r14 * r20
            int r15 = r14 + r6
            r15 = r19[r15]
            int r16 = r14 + r5
            r16 = r19[r16]
            int r15 = r15 + r16
            int r16 = r14 + r7
            r16 = r19[r16]
            int r17 = r14 + r10
            r17 = r19[r17]
            int r16 = r16 + r17
            int r17 = r14 + r8
            r17 = r19[r17]
            int r14 = r14 + r9
            r14 = r19[r14]
            int r17 = r17 + r14
            int r14 = r13 + r4
            int r17 = r17 << 2
            int r17 = r17 - r16
            int r17 = r17 * 5
            int r15 = r15 + r17
            r22[r14] = r15
            int r13 = r13 + r24
            int r12 = r12 + 1
            goto L33
        L6b:
            int r4 = r4 + 1
            goto L8
        L6e:
            return
    }

    private void getLuma21(byte[] r15, int r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23) {
            r14 = this;
            r10 = r14
            r11 = r22
            r12 = r23
            int[] r3 = r10.tmp1
            int r7 = r21 + (-2)
            int r9 = r12 + 7
            r4 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r5 = r22
            r6 = r20
            r8 = r22
            r0.getLuma20NoRound(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int[] r1 = r10.tmp1
            int[] r3 = r10.tmp2
            r6 = 0
            r7 = 2
            r2 = r22
            r4 = r18
            r5 = r19
            r9 = r23
            r0.getLuma02NoRoundInt(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = r11 << 1
            r1 = 0
            r2 = r0
            r3 = 0
            r0 = r18
        L31:
            if (r3 >= r12) goto L67
            r4 = 0
        L34:
            if (r4 >= r11) goto L61
            int[] r5 = r10.tmp2
            int r6 = r0 + r4
            r5 = r5[r6]
            int r5 = r5 + 512
            int r5 = r5 >> 10
            r7 = -128(0xffffffffffffff80, float:NaN)
            r8 = 127(0x7f, float:1.78E-43)
            int r5 = org.jcodec.common.tools.MathUtil.clip(r5, r7, r8)
            int[] r9 = r10.tmp1
            int r13 = r2 + r4
            r9 = r9[r13]
            int r9 = r9 + 16
            int r9 = r9 >> 5
            int r7 = org.jcodec.common.tools.MathUtil.clip(r9, r7, r8)
            int r5 = r5 + r7
            int r5 = r5 + 1
            int r5 = r5 >> 1
            byte r5 = (byte) r5
            r17[r6] = r5
            int r4 = r4 + 1
            goto L34
        L61:
            int r0 = r0 + r19
            int r2 = r2 + r11
            int r3 = r3 + 1
            goto L31
        L67:
            return
    }

    private void getLuma21Unsafe(byte[] r15, int r16, int r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24) {
            r14 = this;
            r11 = r14
            r12 = r23
            r13 = r24
            int[] r4 = r11.tmp1
            int r8 = r22 + (-2)
            int r10 = r13 + 7
            r5 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r6 = r23
            r7 = r21
            r9 = r23
            r0.getLuma20UnsafeNoRound(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int[] r1 = r11.tmp1
            int[] r3 = r11.tmp2
            r6 = 0
            r7 = 2
            r2 = r23
            r4 = r19
            r5 = r20
            r8 = r23
            r9 = r24
            r0.getLuma02NoRoundInt(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = r12 << 1
            r1 = 0
            r2 = r0
            r3 = 0
            r0 = r19
        L35:
            if (r3 >= r13) goto L6b
            r4 = 0
        L38:
            if (r4 >= r12) goto L65
            int[] r5 = r11.tmp2
            int r6 = r0 + r4
            r5 = r5[r6]
            int r5 = r5 + 512
            int r5 = r5 >> 10
            r7 = -128(0xffffffffffffff80, float:NaN)
            r8 = 127(0x7f, float:1.78E-43)
            int r5 = org.jcodec.common.tools.MathUtil.clip(r5, r7, r8)
            int[] r9 = r11.tmp1
            int r10 = r2 + r4
            r9 = r9[r10]
            int r9 = r9 + 16
            int r9 = r9 >> 5
            int r7 = org.jcodec.common.tools.MathUtil.clip(r9, r7, r8)
            int r5 = r5 + r7
            int r5 = r5 + 1
            int r5 = r5 >> 1
            byte r5 = (byte) r5
            r18[r6] = r5
            int r4 = r4 + 1
            goto L38
        L65:
            int r0 = r0 + r20
            int r2 = r2 + r12
            int r3 = r3 + 1
            goto L35
        L6b:
            return
    }

    private void getLuma22(byte[] r13, int r14, byte[] r15, int r16, int r17, int r18, int r19, int r20, int r21) {
            r12 = this;
            r10 = r12
            r11 = r21
            int[] r3 = r10.tmp1
            int r7 = r19 + (-2)
            int r9 = r11 + 7
            r4 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r5 = r20
            r6 = r18
            r8 = r20
            r0.getLuma20NoRound(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int[] r1 = r10.tmp1
            int[] r3 = r10.tmp2
            r6 = 0
            r7 = 2
            r2 = r20
            r4 = r16
            r5 = r17
            r9 = r21
            r0.getLuma02NoRoundInt(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = r16
            r2 = 0
        L2b:
            if (r2 >= r11) goto L4f
            r3 = r20
            r4 = 0
        L30:
            if (r4 >= r3) goto L4a
            int r5 = r1 + r4
            int[] r6 = r10.tmp2
            r6 = r6[r5]
            int r6 = r6 + 512
            int r6 = r6 >> 10
            r7 = -128(0xffffffffffffff80, float:NaN)
            r8 = 127(0x7f, float:1.78E-43)
            int r6 = org.jcodec.common.tools.MathUtil.clip(r6, r7, r8)
            byte r6 = (byte) r6
            r15[r5] = r6
            int r4 = r4 + 1
            goto L30
        L4a:
            int r1 = r1 + r17
            int r2 = r2 + 1
            goto L2b
        L4f:
            return
    }

    private void getLuma22Unsafe(byte[] r14, int r15, int r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23) {
            r13 = this;
            r11 = r13
            r12 = r23
            int[] r4 = r11.tmp1
            int r8 = r21 + (-2)
            int r10 = r12 + 7
            r5 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r6 = r22
            r7 = r20
            r9 = r22
            r0.getLuma20UnsafeNoRound(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int[] r1 = r11.tmp1
            int[] r3 = r11.tmp2
            r6 = 0
            r7 = 2
            r2 = r22
            r4 = r18
            r5 = r19
            r8 = r22
            r9 = r23
            r0.getLuma02NoRoundInt(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = r18
            r2 = 0
        L2f:
            if (r2 >= r12) goto L53
            r3 = r22
            r4 = 0
        L34:
            if (r4 >= r3) goto L4e
            int r5 = r1 + r4
            int[] r6 = r11.tmp2
            r6 = r6[r5]
            int r6 = r6 + 512
            int r6 = r6 >> 10
            r7 = -128(0xffffffffffffff80, float:NaN)
            r8 = 127(0x7f, float:1.78E-43)
            int r6 = org.jcodec.common.tools.MathUtil.clip(r6, r7, r8)
            byte r6 = (byte) r6
            r17[r5] = r6
            int r4 = r4 + 1
            goto L34
        L4e:
            int r1 = r1 + r19
            int r2 = r2 + 1
            goto L2f
        L53:
            return
    }

    private void getLuma23(byte[] r15, int r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23) {
            r14 = this;
            r10 = r14
            r11 = r22
            r12 = r23
            int[] r3 = r10.tmp1
            int r7 = r21 + (-2)
            int r9 = r12 + 7
            r4 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r5 = r22
            r6 = r20
            r8 = r22
            r0.getLuma20NoRound(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int[] r1 = r10.tmp1
            int[] r3 = r10.tmp2
            r6 = 0
            r7 = 2
            r2 = r22
            r4 = r18
            r5 = r19
            r9 = r23
            r0.getLuma02NoRoundInt(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = r11 << 1
            r1 = 0
            r2 = r0
            r3 = 0
            r0 = r18
        L31:
            if (r3 >= r12) goto L68
            r4 = 0
        L34:
            if (r4 >= r11) goto L62
            int[] r5 = r10.tmp2
            int r6 = r0 + r4
            r5 = r5[r6]
            int r5 = r5 + 512
            int r5 = r5 >> 10
            r7 = -128(0xffffffffffffff80, float:NaN)
            r8 = 127(0x7f, float:1.78E-43)
            int r5 = org.jcodec.common.tools.MathUtil.clip(r5, r7, r8)
            int[] r9 = r10.tmp1
            int r13 = r2 + r4
            int r13 = r13 + r11
            r9 = r9[r13]
            int r9 = r9 + 16
            int r9 = r9 >> 5
            int r7 = org.jcodec.common.tools.MathUtil.clip(r9, r7, r8)
            int r5 = r5 + r7
            int r5 = r5 + 1
            int r5 = r5 >> 1
            byte r5 = (byte) r5
            r17[r6] = r5
            int r4 = r4 + 1
            goto L34
        L62:
            int r0 = r0 + r19
            int r2 = r2 + r11
            int r3 = r3 + 1
            goto L31
        L68:
            return
    }

    private void getLuma23Unsafe(byte[] r15, int r16, int r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24) {
            r14 = this;
            r11 = r14
            r12 = r23
            r13 = r24
            int[] r4 = r11.tmp1
            int r8 = r22 + (-2)
            int r10 = r13 + 7
            r5 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r6 = r23
            r7 = r21
            r9 = r23
            r0.getLuma20UnsafeNoRound(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int[] r1 = r11.tmp1
            int[] r3 = r11.tmp2
            r6 = 0
            r7 = 2
            r2 = r23
            r4 = r19
            r5 = r20
            r8 = r23
            r9 = r24
            r0.getLuma02NoRoundInt(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = r12 << 1
            r1 = 0
            r2 = r0
            r3 = 0
            r0 = r19
        L35:
            if (r3 >= r13) goto L6c
            r4 = 0
        L38:
            if (r4 >= r12) goto L66
            int[] r5 = r11.tmp2
            int r6 = r0 + r4
            r5 = r5[r6]
            int r5 = r5 + 512
            int r5 = r5 >> 10
            r7 = -128(0xffffffffffffff80, float:NaN)
            r8 = 127(0x7f, float:1.78E-43)
            int r5 = org.jcodec.common.tools.MathUtil.clip(r5, r7, r8)
            int[] r9 = r11.tmp1
            int r10 = r2 + r4
            int r10 = r10 + r12
            r9 = r9[r10]
            int r9 = r9 + 16
            int r9 = r9 >> 5
            int r7 = org.jcodec.common.tools.MathUtil.clip(r9, r7, r8)
            int r5 = r5 + r7
            int r5 = r5 + 1
            int r5 = r5 >> 1
            byte r5 = (byte) r5
            r18[r6] = r5
            int r4 = r4 + 1
            goto L38
        L66:
            int r0 = r0 + r20
            int r2 = r2 + r12
            int r3 = r3 + 1
            goto L35
        L6c:
            return
    }

    private void getLuma30(byte[] r6, int r7, byte[] r8, int r9, int r10, int r11, int r12, int r13, int r14) {
            r5 = this;
            r5.getLuma20(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            int r12 = r12 * r7
            int r12 = r12 + r11
            r11 = 0
            r0 = 0
        L8:
            if (r0 >= r14) goto L27
            r1 = 0
        Lb:
            if (r1 >= r13) goto L22
            int r2 = r9 + r1
            int r3 = r12 + r1
            int r3 = r3 + 1
            r3 = r6[r3]
            r4 = r8[r2]
            int r3 = r3 + r4
            int r3 = r3 + 1
            int r3 = r3 >> 1
            byte r3 = (byte) r3
            r8[r2] = r3
            int r1 = r1 + 1
            goto Lb
        L22:
            int r12 = r12 + r7
            int r9 = r9 + r10
            int r0 = r0 + 1
            goto L8
        L27:
            return
    }

    private void getLuma30Unsafe(byte[] r13, int r14, int r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r12 = this;
            int r0 = r15 + (-1)
            int r1 = r14 + (-1)
            r12.getLuma20Unsafe(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = 0
            r3 = r17
            r4 = r22
            r5 = 0
        Ld:
            if (r5 >= r4) goto L3b
            int r6 = r5 + r20
            int r6 = org.jcodec.common.tools.MathUtil.clip(r6, r2, r0)
            int r6 = r6 * r14
            r7 = r21
            r8 = 0
        L1a:
            if (r8 >= r7) goto L36
            int r9 = r3 + r8
            r10 = r16[r9]
            int r11 = r19 + r8
            int r11 = r11 + 1
            int r11 = org.jcodec.common.tools.MathUtil.clip(r11, r2, r1)
            int r11 = r11 + r6
            r11 = r13[r11]
            int r10 = r10 + r11
            int r10 = r10 + 1
            int r10 = r10 >> 1
            byte r10 = (byte) r10
            r16[r9] = r10
            int r8 = r8 + 1
            goto L1a
        L36:
            int r3 = r3 + r18
            int r5 = r5 + 1
            goto Ld
        L3b:
            return
    }

    private void getLuma31(byte[] r12, int r13, byte[] r14, int r15, int r16, int r17, int r18, int r19, int r20) {
            r11 = this;
            r10 = r11
            r11.getLuma20(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            byte[] r3 = r10.tmp3
            int r6 = r17 + 1
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r5 = r19
            r7 = r18
            r8 = r19
            r9 = r20
            r0.getLuma02(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            byte[] r2 = r10.tmp3
            r1 = r14
            r3 = r15
            r4 = r16
            r6 = r20
            r0.merge(r1, r2, r3, r4, r5, r6)
            return
    }

    private void getLuma31Unsafe(byte[] r13, int r14, int r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r12 = this;
            r11 = r12
            r12.getLuma20Unsafe(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            byte[] r4 = r11.tmp3
            int r7 = r19 + 1
            r5 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r6 = r21
            r8 = r20
            r9 = r21
            r10 = r22
            r0.getLuma02Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            byte[] r2 = r11.tmp3
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r6 = r22
            r0.merge(r1, r2, r3, r4, r5, r6)
            return
    }

    private void getLuma32(byte[] r16, int r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24) {
            r15 = this;
            r10 = r15
            r11 = r23
            int r12 = r11 + 7
            int[] r3 = r10.tmp1
            r13 = 2
            int r6 = r21 + (-2)
            r4 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r5 = r12
            r7 = r22
            r8 = r12
            r9 = r24
            r0.getLuma02NoRound(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int[] r1 = r10.tmp1
            int[] r3 = r10.tmp2
            r6 = 2
            r7 = 0
            r2 = r12
            r4 = r19
            r5 = r20
            r8 = r23
            r0.getLuma20NoRoundInt(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = r19
            r2 = r24
            r3 = 0
        L2f:
            if (r3 >= r2) goto L67
            r4 = 0
        L32:
            if (r4 >= r11) goto L61
            int[] r5 = r10.tmp2
            int r6 = r1 + r4
            r5 = r5[r6]
            int r5 = r5 + 512
            int r5 = r5 >> 10
            r7 = -128(0xffffffffffffff80, float:NaN)
            r8 = 127(0x7f, float:1.78E-43)
            int r5 = org.jcodec.common.tools.MathUtil.clip(r5, r7, r8)
            int[] r9 = r10.tmp1
            int r14 = r13 + r4
            int r14 = r14 + 1
            r9 = r9[r14]
            int r9 = r9 + 16
            int r9 = r9 >> 5
            int r7 = org.jcodec.common.tools.MathUtil.clip(r9, r7, r8)
            int r5 = r5 + r7
            int r5 = r5 + 1
            int r5 = r5 >> 1
            byte r5 = (byte) r5
            r18[r6] = r5
            int r4 = r4 + 1
            goto L32
        L61:
            int r1 = r1 + r20
            int r13 = r13 + r12
            int r3 = r3 + 1
            goto L2f
        L67:
            return
    }

    private void getLuma32Unsafe(byte[] r16, int r17, int r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25) {
            r15 = this;
            r11 = r15
            r12 = r24
            int r13 = r12 + 7
            int[] r4 = r11.tmp1
            r14 = 2
            int r7 = r22 + (-2)
            r5 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r6 = r13
            r8 = r23
            r9 = r13
            r10 = r25
            r0.getLuma02UnsafeNoRound(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int[] r1 = r11.tmp1
            int[] r3 = r11.tmp2
            r6 = 2
            r7 = 0
            r2 = r13
            r4 = r20
            r5 = r21
            r8 = r24
            r9 = r25
            r0.getLuma20NoRoundInt(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = r20
            r2 = r25
            r3 = 0
        L33:
            if (r3 >= r2) goto L6b
            r4 = 0
        L36:
            if (r4 >= r12) goto L65
            int[] r5 = r11.tmp2
            int r6 = r1 + r4
            r5 = r5[r6]
            int r5 = r5 + 512
            int r5 = r5 >> 10
            r7 = -128(0xffffffffffffff80, float:NaN)
            r8 = 127(0x7f, float:1.78E-43)
            int r5 = org.jcodec.common.tools.MathUtil.clip(r5, r7, r8)
            int[] r9 = r11.tmp1
            int r10 = r14 + r4
            int r10 = r10 + 1
            r9 = r9[r10]
            int r9 = r9 + 16
            int r9 = r9 >> 5
            int r7 = org.jcodec.common.tools.MathUtil.clip(r9, r7, r8)
            int r5 = r5 + r7
            int r5 = r5 + 1
            int r5 = r5 >> 1
            byte r5 = (byte) r5
            r19[r6] = r5
            int r4 = r4 + 1
            goto L36
        L65:
            int r1 = r1 + r21
            int r14 = r14 + r13
            int r3 = r3 + 1
            goto L33
        L6b:
            return
    }

    private void getLuma33(byte[] r12, int r13, byte[] r14, int r15, int r16, int r17, int r18, int r19, int r20) {
            r11 = this;
            r10 = r11
            int r7 = r18 + 1
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r19
            r9 = r20
            r0.getLuma20(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            byte[] r3 = r10.tmp3
            int r6 = r17 + 1
            r4 = 0
            r5 = r19
            r7 = r18
            r0.getLuma02(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            byte[] r2 = r10.tmp3
            r1 = r14
            r3 = r15
            r4 = r16
            r6 = r20
            r0.merge(r1, r2, r3, r4, r5, r6)
            return
    }

    private void getLuma33Unsafe(byte[] r13, int r14, int r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r12 = this;
            r11 = r12
            int r8 = r20 + 1
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r9 = r21
            r10 = r22
            r0.getLuma20Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            byte[] r4 = r11.tmp3
            int r7 = r19 + 1
            r5 = 0
            r6 = r21
            r8 = r20
            r0.getLuma02Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            byte[] r2 = r11.tmp3
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r6 = r22
            r0.merge(r1, r2, r3, r4, r5, r6)
            return
    }

    private org.jcodec.codecs.h264.decode.BlockInterpolator.LumaInterpolator[] initSafe() {
            r3 = this;
            r0 = 16
            org.jcodec.codecs.h264.decode.BlockInterpolator$LumaInterpolator[] r0 = new org.jcodec.codecs.h264.decode.BlockInterpolator.LumaInterpolator[r0]
            org.jcodec.codecs.h264.decode.BlockInterpolator$1 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$1
            r1.<init>(r3, r3)
            r2 = 0
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$2 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$2
            r1.<init>(r3, r3)
            r2 = 1
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$3 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$3
            r1.<init>(r3, r3)
            r2 = 2
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$4 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$4
            r1.<init>(r3, r3)
            r2 = 3
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$5 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$5
            r1.<init>(r3, r3)
            r2 = 4
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$6 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$6
            r1.<init>(r3, r3)
            r2 = 5
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$7 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$7
            r1.<init>(r3, r3)
            r2 = 6
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$8 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$8
            r1.<init>(r3, r3)
            r2 = 7
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$9 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$9
            r1.<init>(r3, r3)
            r2 = 8
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$10 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$10
            r1.<init>(r3, r3)
            r2 = 9
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$11 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$11
            r1.<init>(r3, r3)
            r2 = 10
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$12 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$12
            r1.<init>(r3, r3)
            r2 = 11
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$13 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$13
            r1.<init>(r3, r3)
            r2 = 12
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$14 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$14
            r1.<init>(r3, r3)
            r2 = 13
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$15 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$15
            r1.<init>(r3, r3)
            r2 = 14
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$16 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$16
            r1.<init>(r3, r3)
            r2 = 15
            r0[r2] = r1
            return r0
    }

    private org.jcodec.codecs.h264.decode.BlockInterpolator.LumaInterpolator[] initUnsafe() {
            r3 = this;
            r0 = 16
            org.jcodec.codecs.h264.decode.BlockInterpolator$LumaInterpolator[] r0 = new org.jcodec.codecs.h264.decode.BlockInterpolator.LumaInterpolator[r0]
            org.jcodec.codecs.h264.decode.BlockInterpolator$17 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$17
            r1.<init>(r3, r3)
            r2 = 0
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$18 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$18
            r1.<init>(r3, r3)
            r2 = 1
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$19 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$19
            r1.<init>(r3, r3)
            r2 = 2
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$20 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$20
            r1.<init>(r3, r3)
            r2 = 3
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$21 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$21
            r1.<init>(r3, r3)
            r2 = 4
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$22 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$22
            r1.<init>(r3, r3)
            r2 = 5
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$23 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$23
            r1.<init>(r3, r3)
            r2 = 6
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$24 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$24
            r1.<init>(r3, r3)
            r2 = 7
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$25 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$25
            r1.<init>(r3, r3)
            r2 = 8
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$26 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$26
            r1.<init>(r3, r3)
            r2 = 9
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$27 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$27
            r1.<init>(r3, r3)
            r2 = 10
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$28 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$28
            r1.<init>(r3, r3)
            r2 = 11
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$29 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$29
            r1.<init>(r3, r3)
            r2 = 12
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$30 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$30
            r1.<init>(r3, r3)
            r2 = 13
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$31 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$31
            r1.<init>(r3, r3)
            r2 = 14
            r0[r2] = r1
            org.jcodec.codecs.h264.decode.BlockInterpolator$32 r1 = new org.jcodec.codecs.h264.decode.BlockInterpolator$32
            r1.<init>(r3, r3)
            r2 = 15
            r0[r2] = r1
            return r0
    }

    private void merge(byte[] r8, byte[] r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            if (r1 >= r13) goto L20
            r3 = 0
        L6:
            if (r3 >= r12) goto L1b
            int r4 = r10 + r3
            r5 = r8[r4]
            int r6 = r2 + r3
            r6 = r9[r6]
            int r5 = r5 + r6
            int r5 = r5 + 1
            int r5 = r5 >> 1
            byte r5 = (byte) r5
            r8[r4] = r5
            int r3 = r3 + 1
            goto L6
        L1b:
            int r10 = r10 + r11
            int r2 = r2 + r12
            int r1 = r1 + 1
            goto L3
        L20:
            return
    }

    public void getBlockChroma(byte[] r32, int r33, int r34, byte[] r35, int r36, int r37, int r38, int r39, int r40, int r41) {
            r31 = this;
            r9 = r38 & 7
            r19 = r39 & 7
            int r7 = r38 >> 3
            int r8 = r39 >> 3
            if (r7 < 0) goto L88
            int r0 = r33 - r40
            int r0 = r0 + (-1)
            if (r7 > r0) goto L88
            if (r8 < 0) goto L88
            int r0 = r34 - r41
            int r0 = r0 + (-1)
            if (r8 <= r0) goto L1a
            goto L88
        L1a:
            if (r9 != 0) goto L39
            if (r19 != 0) goto L39
            r20 = r31
            r21 = r32
            r22 = r33
            r23 = r34
            r24 = r35
            r25 = r36
            r26 = r37
            r27 = r7
            r28 = r8
            r29 = r40
            r30 = r41
            r20.getChroma00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto Lf1
        L39:
            if (r19 != 0) goto L52
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r10 = r40
            r11 = r41
            r0.getChromaX0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto Lf1
        L52:
            if (r9 != 0) goto L6f
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r16 = r37
            r17 = r7
            r18 = r8
            r20 = r40
            r21 = r41
            r10.getChroma0X(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto Lf1
        L6f:
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r10 = r19
            r11 = r40
            r12 = r41
            r0.getChromaXX(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto Lf1
        L88:
            if (r9 != 0) goto La6
            if (r19 != 0) goto La6
            r20 = r31
            r21 = r32
            r22 = r33
            r23 = r34
            r24 = r35
            r25 = r36
            r26 = r37
            r27 = r7
            r28 = r8
            r29 = r40
            r30 = r41
            r20.getChroma00Unsafe(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto Lf1
        La6:
            if (r19 != 0) goto Lbe
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r10 = r40
            r11 = r41
            r0.getChromaX0Unsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto Lf1
        Lbe:
            if (r9 != 0) goto Lda
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r16 = r37
            r17 = r7
            r18 = r8
            r20 = r40
            r21 = r41
            r10.getChroma0XUnsafe(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto Lf1
        Lda:
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r10 = r19
            r11 = r40
            r12 = r41
            r0.getChromaXXUnsafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        Lf1:
            return
    }

    public void getBlockLuma(org.jcodec.common.model.Picture8Bit r17, org.jcodec.common.model.Picture8Bit r18, int r19, int r20, int r21, int r22, int r23) {
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r20 & 3
            r3 = r21 & 3
            r4 = 2
            int r12 = r20 >> 2
            int r13 = r21 >> 2
            r5 = 0
            if (r12 < r4) goto L4e
            if (r13 < r4) goto L4e
            int r6 = r17.getWidth()
            int r6 = r6 - r22
            int r6 = r6 + (-5)
            if (r12 > r6) goto L4e
            int r6 = r17.getHeight()
            int r6 = r6 - r23
            int r6 = r6 + (-5)
            if (r13 <= r6) goto L27
            goto L4e
        L27:
            org.jcodec.codecs.h264.decode.BlockInterpolator$LumaInterpolator[] r6 = r0.safe
            int r3 = r3 << r4
            int r3 = r3 + r2
            r2 = r6[r3]
            byte[][] r3 = r17.getData()
            r6 = r3[r5]
            int r7 = r17.getWidth()
            int r8 = r17.getHeight()
            byte[] r9 = r1.getPlaneData(r5)
            int r11 = r1.getPlaneWidth(r5)
            r5 = r2
            r10 = r19
            r14 = r22
            r15 = r23
            r5.getLuma(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L74
        L4e:
            org.jcodec.codecs.h264.decode.BlockInterpolator$LumaInterpolator[] r6 = r0.unsafe
            int r3 = r3 << r4
            int r3 = r3 + r2
            r2 = r6[r3]
            byte[][] r3 = r17.getData()
            r6 = r3[r5]
            int r7 = r17.getWidth()
            int r8 = r17.getHeight()
            byte[] r9 = r1.getPlaneData(r5)
            int r11 = r1.getPlaneWidth(r5)
            r5 = r2
            r10 = r19
            r14 = r22
            r15 = r23
            r5.getLuma(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L74:
            return
    }
}
