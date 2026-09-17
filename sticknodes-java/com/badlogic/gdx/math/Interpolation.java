package com.badlogic.gdx.math;

/* loaded from: classes.dex */
public abstract class Interpolation {
    public static final com.badlogic.gdx.math.Interpolation.Bounce bounce = null;
    public static final com.badlogic.gdx.math.Interpolation.BounceIn bounceIn = null;
    public static final com.badlogic.gdx.math.Interpolation.BounceOut bounceOut = null;
    public static final com.badlogic.gdx.math.Interpolation circle = null;
    public static final com.badlogic.gdx.math.Interpolation circleIn = null;
    public static final com.badlogic.gdx.math.Interpolation circleOut = null;
    public static final com.badlogic.gdx.math.Interpolation.Elastic elastic = null;
    public static final com.badlogic.gdx.math.Interpolation.ElasticIn elasticIn = null;
    public static final com.badlogic.gdx.math.Interpolation.ElasticOut elasticOut = null;
    public static final com.badlogic.gdx.math.Interpolation.Exp exp10 = null;
    public static final com.badlogic.gdx.math.Interpolation.ExpIn exp10In = null;
    public static final com.badlogic.gdx.math.Interpolation.ExpOut exp10Out = null;
    public static final com.badlogic.gdx.math.Interpolation.Exp exp5 = null;
    public static final com.badlogic.gdx.math.Interpolation.ExpIn exp5In = null;
    public static final com.badlogic.gdx.math.Interpolation.ExpOut exp5Out = null;
    public static final com.badlogic.gdx.math.Interpolation fade = null;
    public static final com.badlogic.gdx.math.Interpolation.PowOut fastSlow = null;
    public static final com.badlogic.gdx.math.Interpolation linear = null;
    public static final com.badlogic.gdx.math.Interpolation.Pow pow2 = null;
    public static final com.badlogic.gdx.math.Interpolation.PowIn pow2In = null;
    public static final com.badlogic.gdx.math.Interpolation pow2InInverse = null;
    public static final com.badlogic.gdx.math.Interpolation.PowOut pow2Out = null;
    public static final com.badlogic.gdx.math.Interpolation pow2OutInverse = null;
    public static final com.badlogic.gdx.math.Interpolation.Pow pow3 = null;
    public static final com.badlogic.gdx.math.Interpolation.PowIn pow3In = null;
    public static final com.badlogic.gdx.math.Interpolation pow3InInverse = null;
    public static final com.badlogic.gdx.math.Interpolation.PowOut pow3Out = null;
    public static final com.badlogic.gdx.math.Interpolation pow3OutInverse = null;
    public static final com.badlogic.gdx.math.Interpolation.Pow pow4 = null;
    public static final com.badlogic.gdx.math.Interpolation.PowIn pow4In = null;
    public static final com.badlogic.gdx.math.Interpolation.PowOut pow4Out = null;
    public static final com.badlogic.gdx.math.Interpolation.Pow pow5 = null;
    public static final com.badlogic.gdx.math.Interpolation.PowIn pow5In = null;
    public static final com.badlogic.gdx.math.Interpolation.PowOut pow5Out = null;
    public static final com.badlogic.gdx.math.Interpolation sine = null;
    public static final com.badlogic.gdx.math.Interpolation sineIn = null;
    public static final com.badlogic.gdx.math.Interpolation sineOut = null;
    public static final com.badlogic.gdx.math.Interpolation.PowIn slowFast = null;
    public static final com.badlogic.gdx.math.Interpolation smooth = null;
    public static final com.badlogic.gdx.math.Interpolation smooth2 = null;
    public static final com.badlogic.gdx.math.Interpolation smoother = null;
    public static final com.badlogic.gdx.math.Interpolation.Swing swing = null;
    public static final com.badlogic.gdx.math.Interpolation.SwingIn swingIn = null;
    public static final com.badlogic.gdx.math.Interpolation.SwingOut swingOut = null;















    public static class Bounce extends com.badlogic.gdx.math.Interpolation.BounceOut {
        public Bounce(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private float out(float r6) {
                r5 = this;
                float[] r0 = r5.widths
                r1 = 0
                r2 = r0[r1]
                r3 = 1073741824(0x40000000, float:2.0)
                float r2 = r2 / r3
                float r2 = r2 + r6
                r4 = r0[r1]
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 >= 0) goto L17
                r6 = r0[r1]
                float r6 = r6 / r3
                float r2 = r2 / r6
                r6 = 1065353216(0x3f800000, float:1.0)
                float r2 = r2 - r6
                return r2
            L17:
                float r6 = super.apply(r6)
                return r6
        }

        @Override // com.badlogic.gdx.math.Interpolation.BounceOut, com.badlogic.gdx.math.Interpolation
        public float apply(float r5) {
                r4 = this;
                r0 = 1056964608(0x3f000000, float:0.5)
                r1 = 1065353216(0x3f800000, float:1.0)
                r2 = 1073741824(0x40000000, float:2.0)
                int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r3 > 0) goto L15
                float r5 = r5 * r2
                float r5 = r1 - r5
                float r5 = r4.out(r5)
                float r1 = r1 - r5
                float r1 = r1 / r2
                return r1
            L15:
                float r5 = r5 * r2
                float r5 = r5 - r1
                float r5 = r4.out(r5)
                float r5 = r5 / r2
                float r5 = r5 + r0
                return r5
        }
    }

    public static class BounceIn extends com.badlogic.gdx.math.Interpolation.BounceOut {
        public BounceIn(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.badlogic.gdx.math.Interpolation.BounceOut, com.badlogic.gdx.math.Interpolation
        public float apply(float r2) {
                r1 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                float r2 = r0 - r2
                float r2 = super.apply(r2)
                float r0 = r0 - r2
                return r0
        }
    }

    public static class BounceOut extends com.badlogic.gdx.math.Interpolation {
        final float[] heights;
        final float[] widths;

        public BounceOut(int r12) {
                r11 = this;
                r11.<init>()
                r0 = 2
                if (r12 < r0) goto L85
                r1 = 5
                if (r12 > r1) goto L85
                float[] r2 = new float[r12]
                r11.widths = r2
                float[] r3 = new float[r12]
                r11.heights = r3
                r4 = 1065353216(0x3f800000, float:1.0)
                r5 = 0
                r3[r5] = r4
                r4 = 1051260355(0x3ea8f5c3, float:0.33)
                r6 = 1053609165(0x3ecccccd, float:0.4)
                r7 = 1
                if (r12 == r0) goto L73
                r8 = 1036831949(0x3dcccccd, float:0.1)
                r9 = 1045220557(0x3e4ccccd, float:0.2)
                r10 = 3
                if (r12 == r10) goto L68
                r4 = 1041865114(0x3e19999a, float:0.15)
                r6 = 4
                if (r12 == r6) goto L4d
                if (r12 == r1) goto L31
                goto L7c
            L31:
                r12 = 1050253722(0x3e99999a, float:0.3)
                r2[r5] = r12
                r2[r7] = r12
                r2[r0] = r9
                r2[r10] = r8
                r2[r6] = r8
                r1 = 1055286886(0x3ee66666, float:0.45)
                r3[r7] = r1
                r3[r0] = r12
                r3[r10] = r4
                r12 = 1031127695(0x3d75c28f, float:0.06)
                r3[r6] = r12
                goto L7c
            L4d:
                r12 = 1051595899(0x3eae147b, float:0.34)
                r2[r5] = r12
                r2[r7] = r12
                r2[r0] = r9
                r2[r10] = r4
                r12 = 1048911544(0x3e851eb8, float:0.26)
                r3[r7] = r12
                r12 = 1038174126(0x3de147ae, float:0.11)
                r3[r0] = r12
                r12 = 1022739087(0x3cf5c28f, float:0.03)
                r3[r10] = r12
                goto L7c
            L68:
                r2[r5] = r6
                r2[r7] = r6
                r2[r0] = r9
                r3[r7] = r4
                r3[r0] = r8
                goto L7c
            L73:
                r12 = 1058642330(0x3f19999a, float:0.6)
                r2[r5] = r12
                r2[r7] = r6
                r3[r7] = r4
            L7c:
                r12 = r2[r5]
                r0 = 1073741824(0x40000000, float:2.0)
                float r12 = r12 * r0
                r2[r5] = r12
                return
            L85:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "bounces cannot be < 2 or > 5: "
                r1.append(r2)
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                r0.<init>(r12)
                throw r0
        }

        @Override // com.badlogic.gdx.math.Interpolation
        public float apply(float r7) {
                r6 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r1 != 0) goto L7
                return r0
            L7:
                float[] r1 = r6.widths
                r2 = 0
                r3 = r1[r2]
                r4 = 1073741824(0x40000000, float:2.0)
                float r3 = r3 / r4
                float r7 = r7 + r3
                int r1 = r1.length
                r3 = 0
                r4 = 0
            L13:
                if (r2 >= r1) goto L26
                float[] r4 = r6.widths
                r4 = r4[r2]
                int r5 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r5 > 0) goto L22
                float[] r1 = r6.heights
                r3 = r1[r2]
                goto L26
            L22:
                float r7 = r7 - r4
                int r2 = r2 + 1
                goto L13
            L26:
                float r7 = r7 / r4
                r1 = 1082130432(0x40800000, float:4.0)
                float r1 = r1 / r4
                float r1 = r1 * r3
                float r1 = r1 * r7
                float r7 = r7 * r1
                float r1 = r1 - r7
                float r1 = r1 * r4
                float r0 = r0 - r1
                return r0
        }
    }

    public static class Elastic extends com.badlogic.gdx.math.Interpolation {
        final float bounces;
        final float power;
        final float scale;
        final float value;

        public Elastic(float r1, float r2, int r3, float r4) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.power = r2
                r0.scale = r4
                float r1 = (float) r3
                r2 = 1078530011(0x40490fdb, float:3.1415927)
                float r1 = r1 * r2
                int r3 = r3 % 2
                if (r3 != 0) goto L15
                r2 = 1
                goto L16
            L15:
                r2 = -1
            L16:
                float r2 = (float) r2
                float r1 = r1 * r2
                r0.bounces = r1
                return
        }

        @Override // com.badlogic.gdx.math.Interpolation
        public float apply(float r7) {
                r6 = this;
                r0 = 1073741824(0x40000000, float:2.0)
                r1 = 1065353216(0x3f800000, float:1.0)
                r2 = 1056964608(0x3f000000, float:0.5)
                int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r2 > 0) goto L2b
                float r7 = r7 * r0
                float r2 = r6.value
                double r2 = (double) r2
                float r4 = r6.power
                float r1 = r7 - r1
                float r4 = r4 * r1
                double r4 = (double) r4
                double r1 = java.lang.Math.pow(r2, r4)
                float r1 = (float) r1
                float r2 = r6.bounces
                float r7 = r7 * r2
                float r7 = com.badlogic.gdx.math.MathUtils.sin(r7)
                float r1 = r1 * r7
                float r7 = r6.scale
                float r1 = r1 * r7
                float r1 = r1 / r0
                return r1
            L2b:
                float r7 = r1 - r7
                float r7 = r7 * r0
                float r2 = r6.value
                double r2 = (double) r2
                float r4 = r6.power
                float r5 = r7 - r1
                float r4 = r4 * r5
                double r4 = (double) r4
                double r2 = java.lang.Math.pow(r2, r4)
                float r2 = (float) r2
                float r3 = r6.bounces
                float r7 = r7 * r3
                float r7 = com.badlogic.gdx.math.MathUtils.sin(r7)
                float r2 = r2 * r7
                float r7 = r6.scale
                float r2 = r2 * r7
                float r2 = r2 / r0
                float r1 = r1 - r2
                return r1
        }
    }

    public static class ElasticIn extends com.badlogic.gdx.math.Interpolation.Elastic {
        public ElasticIn(float r1, float r2, int r3, float r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // com.badlogic.gdx.math.Interpolation.Elastic, com.badlogic.gdx.math.Interpolation
        public float apply(float r7) {
                r6 = this;
                double r0 = (double) r7
                r2 = 1065353216(0x3f800000, float:1.0)
                r3 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 < 0) goto Ld
                return r2
            Ld:
                float r0 = r6.value
                double r0 = (double) r0
                float r3 = r6.power
                float r2 = r7 - r2
                float r3 = r3 * r2
                double r2 = (double) r3
                double r0 = java.lang.Math.pow(r0, r2)
                float r0 = (float) r0
                float r1 = r6.bounces
                float r7 = r7 * r1
                float r7 = com.badlogic.gdx.math.MathUtils.sin(r7)
                float r0 = r0 * r7
                float r7 = r6.scale
                float r0 = r0 * r7
                return r0
        }
    }

    public static class ElasticOut extends com.badlogic.gdx.math.Interpolation.Elastic {
        public ElasticOut(float r1, float r2, int r3, float r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // com.badlogic.gdx.math.Interpolation.Elastic, com.badlogic.gdx.math.Interpolation
        public float apply(float r6) {
                r5 = this;
                r0 = 0
                int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r1 != 0) goto L6
                return r0
            L6:
                r0 = 1065353216(0x3f800000, float:1.0)
                float r6 = r0 - r6
                float r1 = r5.value
                double r1 = (double) r1
                float r3 = r5.power
                float r4 = r6 - r0
                float r3 = r3 * r4
                double r3 = (double) r3
                double r1 = java.lang.Math.pow(r1, r3)
                float r1 = (float) r1
                float r2 = r5.bounces
                float r6 = r6 * r2
                float r6 = com.badlogic.gdx.math.MathUtils.sin(r6)
                float r1 = r1 * r6
                float r6 = r5.scale
                float r1 = r1 * r6
                float r0 = r0 - r1
                return r0
        }
    }

    public static class Exp extends com.badlogic.gdx.math.Interpolation {
        final float min;
        final float power;
        final float scale;
        final float value;

        public Exp(float r3, float r4) {
                r2 = this;
                r2.<init>()
                r2.value = r3
                r2.power = r4
                double r0 = (double) r3
                float r3 = -r4
                double r3 = (double) r3
                double r3 = java.lang.Math.pow(r0, r3)
                float r3 = (float) r3
                r2.min = r3
                r4 = 1065353216(0x3f800000, float:1.0)
                float r3 = r4 - r3
                float r4 = r4 / r3
                r2.scale = r4
                return
        }

        @Override // com.badlogic.gdx.math.Interpolation
        public float apply(float r7) {
                r6 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                r1 = 1073741824(0x40000000, float:2.0)
                r2 = 1056964608(0x3f000000, float:0.5)
                int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r2 > 0) goto L23
                float r2 = r6.value
                double r2 = (double) r2
                float r4 = r6.power
                float r7 = r7 * r1
                float r7 = r7 - r0
                float r4 = r4 * r7
                double r4 = (double) r4
                double r2 = java.lang.Math.pow(r2, r4)
                float r7 = (float) r2
                float r0 = r6.min
                float r7 = r7 - r0
                float r0 = r6.scale
                float r7 = r7 * r0
            L21:
                float r7 = r7 / r1
                return r7
            L23:
                float r2 = r6.value
                double r2 = (double) r2
                float r4 = r6.power
                float r4 = -r4
                float r7 = r7 * r1
                float r7 = r7 - r0
                float r4 = r4 * r7
                double r4 = (double) r4
                double r2 = java.lang.Math.pow(r2, r4)
                float r7 = (float) r2
                float r0 = r6.min
                float r7 = r7 - r0
                float r0 = r6.scale
                float r7 = r7 * r0
                float r7 = r1 - r7
                goto L21
        }
    }

    public static class ExpIn extends com.badlogic.gdx.math.Interpolation.Exp {
        public ExpIn(float r1, float r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.badlogic.gdx.math.Interpolation.Exp, com.badlogic.gdx.math.Interpolation
        public float apply(float r5) {
                r4 = this;
                float r0 = r4.value
                double r0 = (double) r0
                float r2 = r4.power
                r3 = 1065353216(0x3f800000, float:1.0)
                float r5 = r5 - r3
                float r2 = r2 * r5
                double r2 = (double) r2
                double r0 = java.lang.Math.pow(r0, r2)
                float r5 = (float) r0
                float r0 = r4.min
                float r5 = r5 - r0
                float r0 = r4.scale
                float r5 = r5 * r0
                return r5
        }
    }

    public static class ExpOut extends com.badlogic.gdx.math.Interpolation.Exp {
        public ExpOut(float r1, float r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.badlogic.gdx.math.Interpolation.Exp, com.badlogic.gdx.math.Interpolation
        public float apply(float r5) {
                r4 = this;
                float r0 = r4.value
                double r0 = (double) r0
                float r2 = r4.power
                float r2 = -r2
                float r2 = r2 * r5
                double r2 = (double) r2
                double r0 = java.lang.Math.pow(r0, r2)
                float r5 = (float) r0
                float r0 = r4.min
                float r5 = r5 - r0
                float r0 = r4.scale
                float r5 = r5 * r0
                r0 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 - r5
                return r0
        }
    }

    public static class Pow extends com.badlogic.gdx.math.Interpolation {
        final int power;

        public Pow(int r1) {
                r0 = this;
                r0.<init>()
                r0.power = r1
                return
        }

        @Override // com.badlogic.gdx.math.Interpolation
        public float apply(float r7) {
                r6 = this;
                r0 = 1073741824(0x40000000, float:2.0)
                r1 = 1056964608(0x3f000000, float:0.5)
                int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r1 > 0) goto L15
                float r7 = r7 * r0
                double r1 = (double) r7
                int r7 = r6.power
                double r3 = (double) r7
                double r1 = java.lang.Math.pow(r1, r3)
                float r7 = (float) r1
                float r7 = r7 / r0
                return r7
            L15:
                r1 = 1065353216(0x3f800000, float:1.0)
                float r7 = r7 - r1
                float r7 = r7 * r0
                double r2 = (double) r7
                int r7 = r6.power
                double r4 = (double) r7
                double r2 = java.lang.Math.pow(r2, r4)
                float r7 = (float) r2
                int r0 = r6.power
                r2 = 2
                int r0 = r0 % r2
                if (r0 != 0) goto L2a
                r2 = -2
            L2a:
                float r0 = (float) r2
                float r7 = r7 / r0
                float r7 = r7 + r1
                return r7
        }
    }

    public static class PowIn extends com.badlogic.gdx.math.Interpolation.Pow {
        public PowIn(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.badlogic.gdx.math.Interpolation.Pow, com.badlogic.gdx.math.Interpolation
        public float apply(float r5) {
                r4 = this;
                double r0 = (double) r5
                int r5 = r4.power
                double r2 = (double) r5
                double r0 = java.lang.Math.pow(r0, r2)
                float r5 = (float) r0
                return r5
        }
    }

    public static class PowOut extends com.badlogic.gdx.math.Interpolation.Pow {
        public PowOut(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.badlogic.gdx.math.Interpolation.Pow, com.badlogic.gdx.math.Interpolation
        public float apply(float r6) {
                r5 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                float r6 = r6 - r0
                double r1 = (double) r6
                int r6 = r5.power
                double r3 = (double) r6
                double r1 = java.lang.Math.pow(r1, r3)
                float r6 = (float) r1
                int r1 = r5.power
                int r1 = r1 % 2
                if (r1 != 0) goto L14
                r1 = -1
                goto L15
            L14:
                r1 = 1
            L15:
                float r1 = (float) r1
                float r6 = r6 * r1
                float r6 = r6 + r0
                return r6
        }
    }

    public static class Swing extends com.badlogic.gdx.math.Interpolation {
        private final float scale;

        public Swing(float r2) {
                r1 = this;
                r1.<init>()
                r0 = 1073741824(0x40000000, float:2.0)
                float r2 = r2 * r0
                r1.scale = r2
                return
        }

        @Override // com.badlogic.gdx.math.Interpolation
        public float apply(float r6) {
                r5 = this;
                r0 = 1073741824(0x40000000, float:2.0)
                r1 = 1065353216(0x3f800000, float:1.0)
                r2 = 1056964608(0x3f000000, float:0.5)
                int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r2 > 0) goto L18
                float r6 = r6 * r0
                float r2 = r6 * r6
                float r3 = r5.scale
                float r1 = r1 + r3
                float r1 = r1 * r6
                float r1 = r1 - r3
                float r2 = r2 * r1
                float r2 = r2 / r0
                return r2
            L18:
                float r6 = r6 - r1
                float r6 = r6 * r0
                float r2 = r6 * r6
                float r3 = r5.scale
                float r4 = r3 + r1
                float r4 = r4 * r6
                float r4 = r4 + r3
                float r2 = r2 * r4
                float r2 = r2 / r0
                float r2 = r2 + r1
                return r2
        }
    }

    public static class SwingIn extends com.badlogic.gdx.math.Interpolation {
        private final float scale;

        public SwingIn(float r1) {
                r0 = this;
                r0.<init>()
                r0.scale = r1
                return
        }

        @Override // com.badlogic.gdx.math.Interpolation
        public float apply(float r4) {
                r3 = this;
                float r0 = r4 * r4
                float r1 = r3.scale
                r2 = 1065353216(0x3f800000, float:1.0)
                float r2 = r2 + r1
                float r2 = r2 * r4
                float r2 = r2 - r1
                float r0 = r0 * r2
                return r0
        }
    }

    public static class SwingOut extends com.badlogic.gdx.math.Interpolation {
        private final float scale;

        public SwingOut(float r1) {
                r0 = this;
                r0.<init>()
                r0.scale = r1
                return
        }

        @Override // com.badlogic.gdx.math.Interpolation
        public float apply(float r5) {
                r4 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                float r5 = r5 - r0
                float r1 = r5 * r5
                float r2 = r4.scale
                float r3 = r2 + r0
                float r3 = r3 * r5
                float r3 = r3 + r2
                float r1 = r1 * r3
                float r1 = r1 + r0
                return r1
        }
    }

    static {
            com.badlogic.gdx.math.Interpolation$1 r0 = new com.badlogic.gdx.math.Interpolation$1
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.linear = r0
            com.badlogic.gdx.math.Interpolation$2 r0 = new com.badlogic.gdx.math.Interpolation$2
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.smooth = r0
            com.badlogic.gdx.math.Interpolation$3 r0 = new com.badlogic.gdx.math.Interpolation$3
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.smooth2 = r0
            com.badlogic.gdx.math.Interpolation$4 r0 = new com.badlogic.gdx.math.Interpolation$4
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.smoother = r0
            com.badlogic.gdx.math.Interpolation.fade = r0
            com.badlogic.gdx.math.Interpolation$Pow r0 = new com.badlogic.gdx.math.Interpolation$Pow
            r1 = 2
            r0.<init>(r1)
            com.badlogic.gdx.math.Interpolation.pow2 = r0
            com.badlogic.gdx.math.Interpolation$PowIn r0 = new com.badlogic.gdx.math.Interpolation$PowIn
            r0.<init>(r1)
            com.badlogic.gdx.math.Interpolation.pow2In = r0
            com.badlogic.gdx.math.Interpolation.slowFast = r0
            com.badlogic.gdx.math.Interpolation$PowOut r0 = new com.badlogic.gdx.math.Interpolation$PowOut
            r0.<init>(r1)
            com.badlogic.gdx.math.Interpolation.pow2Out = r0
            com.badlogic.gdx.math.Interpolation.fastSlow = r0
            com.badlogic.gdx.math.Interpolation$5 r0 = new com.badlogic.gdx.math.Interpolation$5
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.pow2InInverse = r0
            com.badlogic.gdx.math.Interpolation$6 r0 = new com.badlogic.gdx.math.Interpolation$6
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.pow2OutInverse = r0
            com.badlogic.gdx.math.Interpolation$Pow r0 = new com.badlogic.gdx.math.Interpolation$Pow
            r1 = 3
            r0.<init>(r1)
            com.badlogic.gdx.math.Interpolation.pow3 = r0
            com.badlogic.gdx.math.Interpolation$PowIn r0 = new com.badlogic.gdx.math.Interpolation$PowIn
            r0.<init>(r1)
            com.badlogic.gdx.math.Interpolation.pow3In = r0
            com.badlogic.gdx.math.Interpolation$PowOut r0 = new com.badlogic.gdx.math.Interpolation$PowOut
            r0.<init>(r1)
            com.badlogic.gdx.math.Interpolation.pow3Out = r0
            com.badlogic.gdx.math.Interpolation$7 r0 = new com.badlogic.gdx.math.Interpolation$7
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.pow3InInverse = r0
            com.badlogic.gdx.math.Interpolation$8 r0 = new com.badlogic.gdx.math.Interpolation$8
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.pow3OutInverse = r0
            com.badlogic.gdx.math.Interpolation$Pow r0 = new com.badlogic.gdx.math.Interpolation$Pow
            r1 = 4
            r0.<init>(r1)
            com.badlogic.gdx.math.Interpolation.pow4 = r0
            com.badlogic.gdx.math.Interpolation$PowIn r0 = new com.badlogic.gdx.math.Interpolation$PowIn
            r0.<init>(r1)
            com.badlogic.gdx.math.Interpolation.pow4In = r0
            com.badlogic.gdx.math.Interpolation$PowOut r0 = new com.badlogic.gdx.math.Interpolation$PowOut
            r0.<init>(r1)
            com.badlogic.gdx.math.Interpolation.pow4Out = r0
            com.badlogic.gdx.math.Interpolation$Pow r0 = new com.badlogic.gdx.math.Interpolation$Pow
            r2 = 5
            r0.<init>(r2)
            com.badlogic.gdx.math.Interpolation.pow5 = r0
            com.badlogic.gdx.math.Interpolation$PowIn r0 = new com.badlogic.gdx.math.Interpolation$PowIn
            r0.<init>(r2)
            com.badlogic.gdx.math.Interpolation.pow5In = r0
            com.badlogic.gdx.math.Interpolation$PowOut r0 = new com.badlogic.gdx.math.Interpolation$PowOut
            r0.<init>(r2)
            com.badlogic.gdx.math.Interpolation.pow5Out = r0
            com.badlogic.gdx.math.Interpolation$9 r0 = new com.badlogic.gdx.math.Interpolation$9
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.sine = r0
            com.badlogic.gdx.math.Interpolation$10 r0 = new com.badlogic.gdx.math.Interpolation$10
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.sineIn = r0
            com.badlogic.gdx.math.Interpolation$11 r0 = new com.badlogic.gdx.math.Interpolation$11
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.sineOut = r0
            com.badlogic.gdx.math.Interpolation$Exp r0 = new com.badlogic.gdx.math.Interpolation$Exp
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 1092616192(0x41200000, float:10.0)
            r0.<init>(r2, r3)
            com.badlogic.gdx.math.Interpolation.exp10 = r0
            com.badlogic.gdx.math.Interpolation$ExpIn r0 = new com.badlogic.gdx.math.Interpolation$ExpIn
            r0.<init>(r2, r3)
            com.badlogic.gdx.math.Interpolation.exp10In = r0
            com.badlogic.gdx.math.Interpolation$ExpOut r0 = new com.badlogic.gdx.math.Interpolation$ExpOut
            r0.<init>(r2, r3)
            com.badlogic.gdx.math.Interpolation.exp10Out = r0
            com.badlogic.gdx.math.Interpolation$Exp r0 = new com.badlogic.gdx.math.Interpolation$Exp
            r4 = 1084227584(0x40a00000, float:5.0)
            r0.<init>(r2, r4)
            com.badlogic.gdx.math.Interpolation.exp5 = r0
            com.badlogic.gdx.math.Interpolation$ExpIn r0 = new com.badlogic.gdx.math.Interpolation$ExpIn
            r0.<init>(r2, r4)
            com.badlogic.gdx.math.Interpolation.exp5In = r0
            com.badlogic.gdx.math.Interpolation$ExpOut r0 = new com.badlogic.gdx.math.Interpolation$ExpOut
            r0.<init>(r2, r4)
            com.badlogic.gdx.math.Interpolation.exp5Out = r0
            com.badlogic.gdx.math.Interpolation$12 r0 = new com.badlogic.gdx.math.Interpolation$12
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.circle = r0
            com.badlogic.gdx.math.Interpolation$13 r0 = new com.badlogic.gdx.math.Interpolation$13
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.circleIn = r0
            com.badlogic.gdx.math.Interpolation$14 r0 = new com.badlogic.gdx.math.Interpolation$14
            r0.<init>()
            com.badlogic.gdx.math.Interpolation.circleOut = r0
            com.badlogic.gdx.math.Interpolation$Elastic r0 = new com.badlogic.gdx.math.Interpolation$Elastic
            r4 = 7
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r3, r4, r5)
            com.badlogic.gdx.math.Interpolation.elastic = r0
            com.badlogic.gdx.math.Interpolation$ElasticIn r0 = new com.badlogic.gdx.math.Interpolation$ElasticIn
            r6 = 6
            r0.<init>(r2, r3, r6, r5)
            com.badlogic.gdx.math.Interpolation.elasticIn = r0
            com.badlogic.gdx.math.Interpolation$ElasticOut r0 = new com.badlogic.gdx.math.Interpolation$ElasticOut
            r0.<init>(r2, r3, r4, r5)
            com.badlogic.gdx.math.Interpolation.elasticOut = r0
            com.badlogic.gdx.math.Interpolation$Swing r0 = new com.badlogic.gdx.math.Interpolation$Swing
            r3 = 1069547520(0x3fc00000, float:1.5)
            r0.<init>(r3)
            com.badlogic.gdx.math.Interpolation.swing = r0
            com.badlogic.gdx.math.Interpolation$SwingIn r0 = new com.badlogic.gdx.math.Interpolation$SwingIn
            r0.<init>(r2)
            com.badlogic.gdx.math.Interpolation.swingIn = r0
            com.badlogic.gdx.math.Interpolation$SwingOut r0 = new com.badlogic.gdx.math.Interpolation$SwingOut
            r0.<init>(r2)
            com.badlogic.gdx.math.Interpolation.swingOut = r0
            com.badlogic.gdx.math.Interpolation$Bounce r0 = new com.badlogic.gdx.math.Interpolation$Bounce
            r0.<init>(r1)
            com.badlogic.gdx.math.Interpolation.bounce = r0
            com.badlogic.gdx.math.Interpolation$BounceIn r0 = new com.badlogic.gdx.math.Interpolation$BounceIn
            r0.<init>(r1)
            com.badlogic.gdx.math.Interpolation.bounceIn = r0
            com.badlogic.gdx.math.Interpolation$BounceOut r0 = new com.badlogic.gdx.math.Interpolation$BounceOut
            r0.<init>(r1)
            com.badlogic.gdx.math.Interpolation.bounceOut = r0
            return
    }

    public Interpolation() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract float apply(float r1);

    public float apply(float r1, float r2, float r3) {
            r0 = this;
            float r2 = r2 - r1
            float r3 = r0.apply(r3)
            float r2 = r2 * r3
            float r1 = r1 + r2
            return r1
    }
}
