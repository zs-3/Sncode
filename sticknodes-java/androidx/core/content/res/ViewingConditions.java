package androidx.core.content.res;

/* loaded from: classes.dex */
final class ViewingConditions {
    static final androidx.core.content.res.ViewingConditions DEFAULT = null;
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    static {
            float[] r0 = androidx.core.content.res.CamUtils.WHITE_POINT_D65
            r1 = 1112014848(0x42480000, float:50.0)
            float r2 = androidx.core.content.res.CamUtils.yFromLStar(r1)
            double r2 = (double) r2
            r4 = 4634156444089534796(0x404fd4bbab8b494c, double:63.66197723675813)
            double r2 = r2 * r4
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r4
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            androidx.core.content.res.ViewingConditions r0 = make(r0, r2, r1, r3, r4)
            androidx.core.content.res.ViewingConditions.DEFAULT = r0
            return
    }

    private ViewingConditions(float r1, float r2, float r3, float r4, float r5, float r6, float[] r7, float r8, float r9, float r10) {
            r0 = this;
            r0.<init>()
            r0.mN = r1
            r0.mAw = r2
            r0.mNbb = r3
            r0.mNcb = r4
            r0.mC = r5
            r0.mNc = r6
            r0.mRgbD = r7
            r0.mFl = r8
            r0.mFlRoot = r9
            r0.mZ = r10
            return
    }

    static androidx.core.content.res.ViewingConditions make(float[] r21, float r22, float r23, float r24, boolean r25) {
            r0 = r22
            float[][] r1 = androidx.core.content.res.CamUtils.XYZ_TO_CAM16RGB
            r2 = 0
            r3 = r21[r2]
            r4 = r1[r2]
            r4 = r4[r2]
            float r3 = r3 * r4
            r4 = 1
            r5 = r21[r4]
            r6 = r1[r2]
            r6 = r6[r4]
            float r5 = r5 * r6
            float r3 = r3 + r5
            r5 = 2
            r6 = r21[r5]
            r7 = r1[r2]
            r7 = r7[r5]
            float r6 = r6 * r7
            float r3 = r3 + r6
            r6 = r21[r2]
            r7 = r1[r4]
            r7 = r7[r2]
            float r6 = r6 * r7
            r7 = r21[r4]
            r8 = r1[r4]
            r8 = r8[r4]
            float r7 = r7 * r8
            float r6 = r6 + r7
            r7 = r21[r5]
            r8 = r1[r4]
            r8 = r8[r5]
            float r7 = r7 * r8
            float r6 = r6 + r7
            r7 = r21[r2]
            r8 = r1[r5]
            r8 = r8[r2]
            float r7 = r7 * r8
            r8 = r21[r4]
            r9 = r1[r5]
            r9 = r9[r4]
            float r8 = r8 * r9
            float r7 = r7 + r8
            r8 = r21[r5]
            r1 = r1[r5]
            r1 = r1[r5]
            float r8 = r8 * r1
            float r7 = r7 + r8
            r1 = 1092616192(0x41200000, float:10.0)
            float r8 = r24 / r1
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            float r8 = r8 + r9
            double r10 = (double) r8
            r12 = 1058474557(0x3f170a3d, float:0.59)
            r13 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L79
            r9 = 1060152279(0x3f30a3d7, float:0.69)
            r10 = 1063675494(0x3f666666, float:0.9)
            float r10 = r8 - r10
            float r10 = r10 * r1
            float r1 = androidx.core.content.res.CamUtils.lerp(r12, r9, r10)
            goto L84
        L79:
            r10 = 1057384038(0x3f066666, float:0.525)
            float r9 = r8 - r9
            float r9 = r9 * r1
            float r1 = androidx.core.content.res.CamUtils.lerp(r10, r12, r9)
        L84:
            r15 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r25 == 0) goto L8c
            r9 = 1065353216(0x3f800000, float:1.0)
            goto La2
        L8c:
            r9 = 1049508068(0x3e8e38e4, float:0.2777778)
            float r10 = -r0
            r11 = 1109917696(0x42280000, float:42.0)
            float r10 = r10 - r11
            r11 = 1119354880(0x42b80000, float:92.0)
            float r10 = r10 / r11
            double r10 = (double) r10
            double r10 = java.lang.Math.exp(r10)
            float r10 = (float) r10
            float r10 = r10 * r9
            float r9 = r1 - r10
            float r9 = r9 * r8
        La2:
            double r10 = (double) r9
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto Lac
            r9 = 1065353216(0x3f800000, float:1.0)
            goto Lb3
        Lac:
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto Lb3
            r9 = 0
        Lb3:
            r10 = 3
            float[] r14 = new float[r10]
            r11 = 1120403456(0x42c80000, float:100.0)
            float r12 = r11 / r3
            float r12 = r12 * r9
            float r12 = r12 + r1
            float r12 = r12 - r9
            r14[r2] = r12
            float r12 = r11 / r6
            float r12 = r12 * r9
            float r12 = r12 + r1
            float r12 = r12 - r9
            r14[r4] = r12
            float r11 = r11 / r7
            float r11 = r11 * r9
            float r11 = r11 + r1
            float r11 = r11 - r9
            r14[r5] = r11
            r9 = 1084227584(0x40a00000, float:5.0)
            float r9 = r9 * r0
            float r9 = r9 + r1
            float r9 = r1 / r9
            float r11 = r9 * r9
            float r11 = r11 * r9
            float r11 = r11 * r9
            float r1 = r1 - r11
            float r11 = r11 * r0
            r9 = 1036831949(0x3dcccccd, float:0.1)
            float r9 = r9 * r1
            float r9 = r9 * r1
            r12 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r0 = (double) r0
            double r0 = r0 * r12
            double r0 = java.lang.Math.cbrt(r0)
            float r0 = (float) r0
            float r9 = r9 * r0
            float r0 = r11 + r9
            float r1 = androidx.core.content.res.CamUtils.yFromLStar(r23)
            r9 = r21[r4]
            float r11 = r1 / r9
            r1 = 1069379748(0x3fbd70a4, float:1.48)
            double r12 = (double) r11
            r16 = r6
            double r5 = java.lang.Math.sqrt(r12)
            float r5 = (float) r5
            float r20 = r5 + r1
            r1 = 1060739482(0x3f39999a, float:0.725)
            r5 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r5 = java.lang.Math.pow(r12, r5)
            float r5 = (float) r5
            float r1 = r1 / r5
            float[] r5 = new float[r10]
            r6 = r14[r2]
            float r6 = r6 * r0
            float r6 = r6 * r3
            double r12 = (double) r6
            r17 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r12 = r12 / r17
            r9 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r12 = java.lang.Math.pow(r12, r9)
            float r3 = (float) r12
            r5[r2] = r3
            r3 = r14[r4]
            float r3 = r3 * r0
            float r3 = r3 * r16
            double r12 = (double) r3
            double r12 = r12 / r17
            double r12 = java.lang.Math.pow(r12, r9)
            float r3 = (float) r12
            r5[r4] = r3
            r3 = 2
            r6 = r14[r3]
            float r6 = r6 * r0
            float r6 = r6 * r7
            double r6 = (double) r6
            double r6 = r6 / r17
            double r6 = java.lang.Math.pow(r6, r9)
            float r6 = (float) r6
            r5[r3] = r6
            r3 = 3
            float[] r3 = new float[r3]
            r6 = r5[r2]
            r7 = 1137180672(0x43c80000, float:400.0)
            float r6 = r6 * r7
            r10 = r5[r2]
            r12 = 1104742973(0x41d90a3d, float:27.13)
            float r10 = r10 + r12
            float r6 = r6 / r10
            r3[r2] = r6
            r6 = r5[r4]
            float r6 = r6 * r7
            r10 = r5[r4]
            float r10 = r10 + r12
            float r6 = r6 / r10
            r3[r4] = r6
            r6 = 2
            r9 = r5[r6]
            float r9 = r9 * r7
            r5 = r5[r6]
            float r5 = r5 + r12
            float r9 = r9 / r5
            r3[r6] = r9
            r5 = 1073741824(0x40000000, float:2.0)
            r2 = r3[r2]
            float r2 = r2 * r5
            r4 = r3[r4]
            float r2 = r2 + r4
            r4 = 1028443341(0x3d4ccccd, float:0.05)
            r3 = r3[r6]
            float r3 = r3 * r4
            float r2 = r2 + r3
            float r12 = r2 * r1
            androidx.core.content.res.ViewingConditions r2 = new androidx.core.content.res.ViewingConditions
            double r3 = (double) r0
            r5 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r3 = java.lang.Math.pow(r3, r5)
            float r3 = (float) r3
            r10 = r2
            r13 = r1
            r4 = r14
            r14 = r1
            r16 = r8
            r17 = r4
            r18 = r0
            r19 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r2
    }

    float getAw() {
            r1 = this;
            float r0 = r1.mAw
            return r0
    }

    float getC() {
            r1 = this;
            float r0 = r1.mC
            return r0
    }

    float getFl() {
            r1 = this;
            float r0 = r1.mFl
            return r0
    }

    float getFlRoot() {
            r1 = this;
            float r0 = r1.mFlRoot
            return r0
    }

    float getN() {
            r1 = this;
            float r0 = r1.mN
            return r0
    }

    float getNbb() {
            r1 = this;
            float r0 = r1.mNbb
            return r0
    }

    float getNc() {
            r1 = this;
            float r0 = r1.mNc
            return r0
    }

    float getNcb() {
            r1 = this;
            float r0 = r1.mNcb
            return r0
    }

    float[] getRgbD() {
            r1 = this;
            float[] r0 = r1.mRgbD
            return r0
    }

    float getZ() {
            r1 = this;
            float r0 = r1.mZ
            return r0
    }
}
