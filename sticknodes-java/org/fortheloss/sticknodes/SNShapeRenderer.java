package org.fortheloss.sticknodes;

/* loaded from: classes2.dex */
public class SNShapeRenderer implements com.badlogic.gdx.utils.Disposable {
    public static int CURVE_SMOOTH_QUALITY = 1;
    private final float BLACK_SHADOW_BITS;
    private final float GRAY_BITS;
    private final float ORANGE_BITS;
    private final float ORANGE_SHADOW_BITS;
    private final float RED_BITS;
    private final float RED_SHADOW_BITS;
    private boolean autoShapeType;
    private final com.badlogic.gdx.graphics.Color color;
    private final com.badlogic.gdx.math.Matrix4 combinedMatrix;
    private final float defaultRectLineWidth;
    private org.fortheloss.sticknodes.SNShapeRenderer.ColorInterpolator mColInterX;
    private org.fortheloss.sticknodes.SNShapeRenderer.ColorInterpolator mColInterY;
    private final int mainNodeRadius;
    private boolean matrixDirty;
    private final float[] mirroredCurveVerts;
    private final com.badlogic.gdx.math.Matrix4 projectionMatrix;
    private final com.badlogic.gdx.math.Matrix4 rememberedMatrix;
    private final com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer renderer;
    private final com.badlogic.gdx.graphics.Color setColor1;
    private final com.badlogic.gdx.graphics.Color setColor2;
    private org.fortheloss.sticknodes.SNShapeRenderer.ShapeType shapeType;
    private final com.badlogic.gdx.graphics.Color tempColor;
    private final com.badlogic.gdx.graphics.Color tempColor2;
    private final com.badlogic.gdx.math.Vector2 tmp;
    private final com.badlogic.gdx.math.Vector2 tmpPoint;
    private final com.badlogic.gdx.math.Matrix4 transformMatrix;

    private static abstract class ColorInterpolator {
        protected com.badlogic.gdx.graphics.Color fromColorRef;
        protected com.badlogic.gdx.graphics.Color tempColor;
        protected com.badlogic.gdx.graphics.Color toColorRef;

        private static class ColorInterpolatorX extends org.fortheloss.sticknodes.SNShapeRenderer.ColorInterpolator {
            private ColorInterpolatorX() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ ColorInterpolatorX(org.fortheloss.sticknodes.SNShapeRenderer.ColorInterpolator.ColorInterpolatorXIA r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // org.fortheloss.sticknodes.SNShapeRenderer.ColorInterpolator
            public float getBits(float r2, float r3, float r4) {
                    r1 = this;
                    com.badlogic.gdx.graphics.Color r4 = r1.tempColor
                    com.badlogic.gdx.graphics.Color r0 = r1.fromColorRef
                    com.badlogic.gdx.graphics.Color r4 = r4.set(r0)
                    com.badlogic.gdx.graphics.Color r0 = r1.toColorRef
                    float r2 = r2 / r3
                    com.badlogic.gdx.graphics.Color r2 = r4.lerp(r0, r2)
                    float r2 = r2.toFloatBits()
                    return r2
            }
        }

        /* compiled from: R8$$SyntheticClass */
        /* renamed from: org.fortheloss.sticknodes.SNShapeRenderer$ColorInterpolator$ColorInterpolatorX-IA, reason: invalid class name */
        public final /* synthetic */ class ColorInterpolatorXIA {
        }

        private static class ColorInterpolatorY extends org.fortheloss.sticknodes.SNShapeRenderer.ColorInterpolator {
            private ColorInterpolatorY() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ ColorInterpolatorY(org.fortheloss.sticknodes.SNShapeRenderer.ColorInterpolator.ColorInterpolatorYIA r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // org.fortheloss.sticknodes.SNShapeRenderer.ColorInterpolator
            public float getBits(float r1, float r2, float r3) {
                    r0 = this;
                    com.badlogic.gdx.graphics.Color r1 = r0.tempColor
                    com.badlogic.gdx.graphics.Color r2 = r0.fromColorRef
                    com.badlogic.gdx.graphics.Color r1 = r1.set(r2)
                    com.badlogic.gdx.graphics.Color r2 = r0.toColorRef
                    com.badlogic.gdx.graphics.Color r1 = r1.lerp(r2, r3)
                    float r1 = r1.toFloatBits()
                    return r1
            }
        }

        /* compiled from: R8$$SyntheticClass */
        /* renamed from: org.fortheloss.sticknodes.SNShapeRenderer$ColorInterpolator$ColorInterpolatorY-IA, reason: invalid class name */
        public final /* synthetic */ class ColorInterpolatorYIA {
        }

        public ColorInterpolator() {
                r1 = this;
                r1.<init>()
                com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
                r0.<init>()
                r1.tempColor = r0
                return
        }

        public abstract float getBits(float r1, float r2, float r3);

        public void setColors(com.badlogic.gdx.graphics.Color r1, com.badlogic.gdx.graphics.Color r2) {
                r0 = this;
                r0.fromColorRef = r1
                r0.toColorRef = r2
                return
        }
    }

    public enum ShapeType extends java.lang.Enum<org.fortheloss.sticknodes.SNShapeRenderer.ShapeType> {
        private static final /* synthetic */ org.fortheloss.sticknodes.SNShapeRenderer.ShapeType[] $VALUES = null;
        public static final org.fortheloss.sticknodes.SNShapeRenderer.ShapeType Filled = null;
        public static final org.fortheloss.sticknodes.SNShapeRenderer.ShapeType Line = null;
        public static final org.fortheloss.sticknodes.SNShapeRenderer.ShapeType Point = null;
        private final int glType;

        static {
                org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = new org.fortheloss.sticknodes.SNShapeRenderer$ShapeType
                java.lang.String r1 = "Point"
                r2 = 0
                r0.<init>(r1, r2, r2)
                org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Point = r0
                org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = new org.fortheloss.sticknodes.SNShapeRenderer$ShapeType
                java.lang.String r3 = "Line"
                r4 = 1
                r1.<init>(r3, r4, r4)
                org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line = r1
                org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r3 = new org.fortheloss.sticknodes.SNShapeRenderer$ShapeType
                java.lang.String r5 = "Filled"
                r6 = 2
                r7 = 4
                r3.<init>(r5, r6, r7)
                org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled = r3
                r5 = 3
                org.fortheloss.sticknodes.SNShapeRenderer$ShapeType[] r5 = new org.fortheloss.sticknodes.SNShapeRenderer.ShapeType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.$VALUES = r5
                return
        }

        ShapeType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.glType = r3
                return
        }

        public static org.fortheloss.sticknodes.SNShapeRenderer.ShapeType valueOf(java.lang.String r1) {
                java.lang.Class<org.fortheloss.sticknodes.SNShapeRenderer$ShapeType> r0 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = (org.fortheloss.sticknodes.SNShapeRenderer.ShapeType) r1
                return r1
        }

        public static org.fortheloss.sticknodes.SNShapeRenderer.ShapeType[] values() {
                org.fortheloss.sticknodes.SNShapeRenderer$ShapeType[] r0 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.fortheloss.sticknodes.SNShapeRenderer$ShapeType[] r0 = (org.fortheloss.sticknodes.SNShapeRenderer.ShapeType[]) r0
                return r0
        }

        public int getGlType() {
                r1 = this;
                int r0 = r1.glType
                return r0
        }
    }

    static {
            return
    }

    public SNShapeRenderer(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SNShapeRenderer(int r10, com.badlogic.gdx.graphics.glutils.ShaderProgram r11) {
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.matrixDirty = r0
            com.badlogic.gdx.math.Matrix4 r1 = new com.badlogic.gdx.math.Matrix4
            r1.<init>()
            r9.projectionMatrix = r1
            com.badlogic.gdx.math.Matrix4 r2 = new com.badlogic.gdx.math.Matrix4
            r2.<init>()
            r9.transformMatrix = r2
            com.badlogic.gdx.math.Matrix4 r2 = new com.badlogic.gdx.math.Matrix4
            r2.<init>()
            r9.combinedMatrix = r2
            com.badlogic.gdx.math.Matrix4 r2 = new com.badlogic.gdx.math.Matrix4
            r2.<init>()
            r9.rememberedMatrix = r2
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r2.<init>()
            r9.tmp = r2
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r2.<init>()
            r9.tmpPoint = r2
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r3, r3, r3)
            r9.color = r2
            r2 = 1061158912(0x3f400000, float:0.75)
            r9.defaultRectLineWidth = r2
            r2 = 1
            if (r11 != 0) goto L48
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20 r11 = new com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20
            r11.<init>(r10, r0, r2, r0)
            r9.renderer = r11
            goto L55
        L48:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20 r0 = new com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20
            r5 = 0
            r6 = 1
            r7 = 0
            r3 = r0
            r4 = r10
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r9.renderer = r0
        L55:
            com.badlogic.gdx.Graphics r10 = com.badlogic.gdx.Gdx.graphics
            int r10 = r10.getWidth()
            float r10 = (float) r10
            com.badlogic.gdx.Graphics r11 = com.badlogic.gdx.Gdx.graphics
            int r11 = r11.getHeight()
            float r11 = (float) r11
            r0 = 0
            r1.setToOrtho2D(r0, r0, r10, r11)
            r9.matrixDirty = r2
            com.badlogic.gdx.graphics.Color r10 = new com.badlogic.gdx.graphics.Color
            r10.<init>()
            r9.tempColor = r10
            com.badlogic.gdx.graphics.Color r11 = new com.badlogic.gdx.graphics.Color
            r11.<init>()
            r9.tempColor2 = r11
            com.badlogic.gdx.graphics.Color r11 = new com.badlogic.gdx.graphics.Color
            r11.<init>()
            r9.setColor1 = r11
            com.badlogic.gdx.graphics.Color r11 = new com.badlogic.gdx.graphics.Color
            r11.<init>()
            r9.setColor2 = r11
            org.fortheloss.sticknodes.SNShapeRenderer$ColorInterpolator$ColorInterpolatorX r11 = new org.fortheloss.sticknodes.SNShapeRenderer$ColorInterpolator$ColorInterpolatorX
            r0 = 0
            r11.<init>(r0)
            r9.mColInterX = r11
            org.fortheloss.sticknodes.SNShapeRenderer$ColorInterpolator$ColorInterpolatorY r11 = new org.fortheloss.sticknodes.SNShapeRenderer$ColorInterpolator$ColorInterpolatorY
            r11.<init>(r0)
            r9.mColInterY = r11
            r11 = 2304(0x900, float:3.229E-42)
            float[] r11 = new float[r11]
            r9.mirroredCurveVerts = r11
            com.badlogic.gdx.graphics.Color r11 = com.badlogic.gdx.graphics.Color.BLACK
            float r0 = r11.toFloatBits()
            r9.BLACK_SHADOW_BITS = r0
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.App.COLOR_NODE_MAIN_ORANGE
            r10.set(r0)
            float r0 = r10.toFloatBits()
            r9.ORANGE_BITS = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r10.lerp(r11, r0)
            float r1 = r10.toFloatBits()
            r9.ORANGE_SHADOW_BITS = r1
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.sticknodes.App.COLOR_NODE_SELECTED
            r10.set(r1)
            float r1 = r10.toFloatBits()
            r9.RED_BITS = r1
            r10.lerp(r11, r0)
            float r11 = r10.toFloatBits()
            r9.RED_SHADOW_BITS = r11
            com.badlogic.gdx.graphics.Color r11 = org.fortheloss.sticknodes.App.COLOR_NODE_INACTIVE
            r10.set(r11)
            float r10 = r10.toFloatBits()
            r9.GRAY_BITS = r10
            r10 = 1098907648(0x41800000, float:16.0)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r10
            int r10 = (int) r11
            r9.mainNodeRadius = r10
            return
    }

    private void check(org.fortheloss.sticknodes.SNShapeRenderer.ShapeType r4, org.fortheloss.sticknodes.SNShapeRenderer.ShapeType r5, int r6) {
            r3 = this;
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = r3.shapeType
            if (r0 == 0) goto L74
            if (r0 == r4) goto L51
            if (r0 == r5) goto L51
            boolean r6 = r3.autoShapeType
            if (r6 != 0) goto L4a
            java.lang.String r6 = ")."
            java.lang.String r0 = "Must call begin(ShapeType."
            if (r5 != 0) goto L2a
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = r1.toString()
            r5.<init>(r4)
            throw r5
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = ") or begin(ShapeType."
            r2.append(r4)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L4a:
            r3.end()
            r3.begin(r4)
            goto L73
        L51:
            boolean r4 = r3.matrixDirty
            if (r4 == 0) goto L5c
            r3.end()
            r3.begin(r0)
            goto L73
        L5c:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r3.renderer
            int r4 = r4.getMaxVertices()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r3.renderer
            int r5 = r5.getNumVertices()
            int r4 = r4 - r5
            if (r4 >= r6) goto L73
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r4 = r3.shapeType
            r3.end()
            r3.begin(r4)
        L73:
            return
        L74:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "begin must be called first."
            r4.<init>(r5)
            throw r4
    }

    public static int getSegmentsForCircle(float r2) {
            int r0 = org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY
            r1 = 1
            if (r0 != r1) goto L1b
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            float r2 = (float) r0
            r0 = 1074790400(0x40100000, float:2.25)
            float r2 = r2 * r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 + r0
            r0 = 1084227584(0x40a00000, float:5.0)
            r1 = 1109393408(0x42200000, float:40.0)
            float r2 = com.badlogic.gdx.math.MathUtils.clamp(r2, r0, r1)
            goto L31
        L1b:
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            float r2 = (float) r0
            r0 = 1076048691(0x40233333, float:2.55)
            float r2 = r2 * r0
            r0 = 1090519040(0x41000000, float:8.0)
            float r2 = r2 + r0
            r0 = 1092616192(0x41200000, float:10.0)
            r1 = 1117782016(0x42a00000, float:80.0)
            float r2 = com.badlogic.gdx.math.MathUtils.clamp(r2, r0, r1)
        L31:
            int r2 = (int) r2
            return r2
    }

    public static int getSegmentsForCurve(float r2, float r3) {
            r0 = 1
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L7
            return r0
        L7:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r1
            float r3 = java.lang.Math.abs(r3)
            float r3 = r3 * r1
            float r2 = java.lang.Math.max(r2, r3)
            int r3 = org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY
            if (r3 != r0) goto L2b
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = (double) r2
            double r2 = java.lang.Math.sqrt(r2)
            double r2 = r2 * r0
            int r2 = (int) r2
            r3 = 5
            r0 = 100
            int r2 = com.badlogic.gdx.math.MathUtils.clamp(r2, r3, r0)
            goto L3d
        L2b:
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r2 = (double) r2
            double r2 = java.lang.Math.sqrt(r2)
            double r2 = r2 * r0
            int r2 = (int) r2
            r3 = 10
            r0 = 255(0xff, float:3.57E-43)
            int r2 = com.badlogic.gdx.math.MathUtils.clamp(r2, r3, r0)
        L3d:
            return r2
    }

    public static int getSegmentsForSegmentArc(float r2) {
            int r0 = org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY
            r1 = 1
            if (r0 != r1) goto L1b
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            float r2 = (float) r0
            r0 = 1067450368(0x3fa00000, float:1.25)
            float r2 = r2 * r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 + r0
            r0 = 1084227584(0x40a00000, float:5.0)
            r1 = 1103626240(0x41c80000, float:25.0)
            float r2 = com.badlogic.gdx.math.MathUtils.clamp(r2, r0, r1)
            goto L31
        L1b:
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            float r2 = (float) r0
            r0 = 1070386381(0x3fcccccd, float:1.6)
            float r2 = r2 * r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 + r0
            r0 = 1092616192(0x41200000, float:10.0)
            r1 = 1112014848(0x42480000, float:50.0)
            float r2 = com.badlogic.gdx.math.MathUtils.clamp(r2, r0, r1)
        L31:
            int r2 = (int) r2
            return r2
    }

    public static int getSegmentsForTrapezoidCurve(float r2, float r3, float r4) {
            r0 = 1
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L7
            return r0
        L7:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r1
            float r3 = java.lang.Math.abs(r3)
            float r3 = r3 * r1
            float r2 = java.lang.Math.max(r2, r3)
            float r2 = java.lang.Math.max(r2, r4)
            int r3 = org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY
            if (r3 != r0) goto L2f
            r3 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            double r0 = r0 * r3
            int r2 = (int) r0
            r3 = 5
            r4 = 150(0x96, float:2.1E-43)
            int r2 = com.badlogic.gdx.math.MathUtils.clamp(r2, r3, r4)
            goto L41
        L2f:
            r3 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            double r0 = r0 * r3
            int r2 = (int) r0
            r3 = 10
            r4 = 255(0xff, float:3.57E-43)
            int r2 = com.badlogic.gdx.math.MathUtils.clamp(r2, r3, r4)
        L41:
            return r2
    }

    public static int getSegmentsForTrapezoidWidth(float r10) {
            int r0 = org.fortheloss.sticknodes.SNShapeRenderer.CURVE_SMOOTH_QUALITY
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r2 = (double) r10
            double r2 = java.lang.Math.sqrt(r2)
            double r4 = r2 * r0
            r6 = 4617315517961601024(0x4014000000000000, double:5.0)
            r8 = 4643985272004935680(0x4072c00000000000, double:300.0)
            double r0 = com.badlogic.gdx.math.MathUtils.clamp(r4, r6, r8)
            goto L2e
        L1a:
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r2 = (double) r10
            double r2 = java.lang.Math.sqrt(r2)
            double r4 = r2 * r0
            r6 = 4621819117588971520(0x4024000000000000, double:10.0)
            r8 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r0 = com.badlogic.gdx.math.MathUtils.clamp(r4, r6, r8)
        L2e:
            int r10 = (int) r0
            return r10
    }

    private void quickCheck(int r3) {
            r2 = this;
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r2.renderer
            int r0 = r0.getMaxVertices()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r2.renderer
            int r1 = r1.getNumVertices()
            int r0 = r0 - r1
            if (r0 >= r3) goto L17
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r3 = r2.shapeType
            r2.end()
            r2.begin(r3)
        L17:
            return
    }

    public void begin(org.fortheloss.sticknodes.SNShapeRenderer.ShapeType r3) {
            r2 = this;
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = r2.shapeType
            if (r0 != 0) goto L2d
            r2.shapeType = r3
            boolean r3 = r2.matrixDirty
            if (r3 == 0) goto L1f
            com.badlogic.gdx.math.Matrix4 r3 = r2.combinedMatrix
            com.badlogic.gdx.math.Matrix4 r0 = r2.projectionMatrix
            r3.set(r0)
            com.badlogic.gdx.math.Matrix4 r3 = r2.combinedMatrix
            float[] r3 = r3.val
            com.badlogic.gdx.math.Matrix4 r0 = r2.transformMatrix
            float[] r0 = r0.val
            com.badlogic.gdx.math.Matrix4.mul(r3, r0)
            r3 = 0
            r2.matrixDirty = r3
        L1f:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            com.badlogic.gdx.math.Matrix4 r0 = r2.combinedMatrix
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = r2.shapeType
            int r1 = r1.getGlType()
            r3.begin(r0, r1)
            return
        L2d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Call end() before beginning a new shape batch."
            r3.<init>(r0)
            throw r3
    }

    public void circle(float r3, float r4, float r5) {
            r2 = this;
            double r0 = (double) r5
            double r0 = java.lang.Math.cbrt(r0)
            float r0 = (float) r0
            r1 = 1086324736(0x40c00000, float:6.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            r2.circle(r3, r4, r5, r0)
            return
    }

    public void circle(float r11, float r12, float r13, int r14) {
            r10 = this;
            com.badlogic.gdx.graphics.Color r0 = r10.color
            float r0 = r0.toFloatBits()
            float r1 = (float) r14
            r2 = 1086918619(0x40c90fdb, float:6.2831855)
            float r2 = r2 / r1
            float r1 = com.badlogic.gdx.math.MathUtils.cos(r2)
            float r2 = com.badlogic.gdx.math.MathUtils.sin(r2)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r3 = r10.shapeType
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r4 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line
            r5 = 0
            r6 = 0
            if (r3 != r4) goto L5d
            int r3 = r14 * 2
            int r3 = r3 + 2
            r10.quickCheck(r3)
            r3 = r13
            r4 = 0
        L24:
            if (r5 >= r14) goto L50
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r10.renderer
            r7.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r10.renderer
            float r8 = r11 + r3
            float r9 = r12 + r4
            r7.vertex(r8, r9, r6)
            float r7 = r1 * r3
            float r8 = r2 * r4
            float r7 = r7 - r8
            float r3 = r3 * r2
            float r4 = r4 * r1
            float r4 = r4 + r3
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            r3.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            float r8 = r11 + r7
            float r9 = r12 + r4
            r3.vertex(r8, r9, r6)
            int r5 = r5 + 1
            r3 = r7
            goto L24
        L50:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r10.renderer
            r14.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r10.renderer
            float r3 = r3 + r11
            float r4 = r4 + r12
            r14.vertex(r3, r4, r6)
            goto Lb4
        L5d:
            int r3 = r14 * 3
            int r3 = r3 + 3
            r10.quickCheck(r3)
            int r14 = r14 + (-1)
            r3 = r13
            r4 = 0
        L68:
            if (r5 >= r14) goto L9e
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r10.renderer
            r7.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r10.renderer
            r7.vertex(r11, r12, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r10.renderer
            r7.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r10.renderer
            float r8 = r11 + r3
            float r9 = r12 + r4
            r7.vertex(r8, r9, r6)
            float r7 = r1 * r3
            float r8 = r2 * r4
            float r7 = r7 - r8
            float r3 = r3 * r2
            float r4 = r4 * r1
            float r4 = r4 + r3
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            r3.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            float r8 = r11 + r7
            float r9 = r12 + r4
            r3.vertex(r8, r9, r6)
            int r5 = r5 + 1
            r3 = r7
            goto L68
        L9e:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r10.renderer
            r14.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r10.renderer
            r14.vertex(r11, r12, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r10.renderer
            r14.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r10.renderer
            float r3 = r3 + r11
            float r4 = r4 + r12
            r14.vertex(r3, r4, r6)
        Lb4:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r10.renderer
            r14.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r10.renderer
            float r11 = r11 + r13
            float r12 = r12 + r6
            r14.vertex(r11, r12, r6)
            return
    }

    public void circle(float r10, float r11, float r12, int r13, com.badlogic.gdx.graphics.Color r14, com.badlogic.gdx.graphics.Color r15) {
            r9 = this;
            com.badlogic.gdx.graphics.Color r0 = r9.setColor1
            r0.set(r14)
            com.badlogic.gdx.graphics.Color r14 = r9.setColor1
            float r0 = r14.a
            com.badlogic.gdx.graphics.Color r1 = r9.getColor()
            float r1 = r1.a
            float r0 = r0 * r1
            r14.a = r0
            com.badlogic.gdx.graphics.Color r14 = r9.setColor2
            r14.set(r15)
            com.badlogic.gdx.graphics.Color r14 = r9.setColor2
            float r15 = r14.a
            com.badlogic.gdx.graphics.Color r0 = r9.getColor()
            float r0 = r0.a
            float r15 = r15 * r0
            r14.a = r15
            com.badlogic.gdx.graphics.Color r14 = r9.setColor1
            float r14 = r14.toFloatBits()
            com.badlogic.gdx.graphics.Color r15 = r9.setColor2
            float r15 = r15.toFloatBits()
            float r0 = (float) r13
            r1 = 1086918619(0x40c90fdb, float:6.2831855)
            float r1 = r1 / r0
            float r0 = org.fortheloss.framework.CustomMathUtils.cos(r1)
            float r1 = org.fortheloss.framework.CustomMathUtils.sin(r1)
            int r2 = r13 * 3
            int r2 = r2 + 3
            r9.quickCheck(r2)
            int r13 = r13 + (-1)
            r2 = 0
            r3 = 0
            r4 = r12
            r5 = 0
        L4c:
            if (r3 >= r13) goto L82
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r9.renderer
            r6.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r9.renderer
            r6.vertex(r10, r11, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r9.renderer
            r6.color(r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r9.renderer
            float r7 = r10 + r4
            float r8 = r11 + r5
            r6.vertex(r7, r8, r2)
            float r6 = r0 * r4
            float r7 = r1 * r5
            float r6 = r6 - r7
            float r4 = r4 * r1
            float r5 = r5 * r0
            float r5 = r5 + r4
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r9.renderer
            r4.color(r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r9.renderer
            float r7 = r10 + r6
            float r8 = r11 + r5
            r4.vertex(r7, r8, r2)
            int r3 = r3 + 1
            r4 = r6
            goto L4c
        L82:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r13 = r9.renderer
            r13.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r13 = r9.renderer
            r13.vertex(r10, r11, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r13 = r9.renderer
            r13.color(r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r13 = r9.renderer
            float r4 = r4 + r10
            float r5 = r5 + r11
            r13.vertex(r4, r5, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r13 = r9.renderer
            r13.color(r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r13 = r9.renderer
            float r10 = r10 + r12
            float r11 = r11 + r2
            r13.vertex(r10, r11, r2)
            return
    }

    public void circle(float r18, float r19, float r20, int r21, com.badlogic.gdx.graphics.Color r22, com.badlogic.gdx.graphics.Color r23, float r24, boolean r25) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            r5 = r23
            com.badlogic.gdx.graphics.Color r6 = r0.setColor1
            r6.set(r4)
            com.badlogic.gdx.graphics.Color r6 = r0.setColor1
            float r7 = r6.a
            com.badlogic.gdx.graphics.Color r8 = r17.getColor()
            float r8 = r8.a
            float r7 = r7 * r8
            r6.a = r7
            com.badlogic.gdx.graphics.Color r6 = r0.tempColor
            com.badlogic.gdx.graphics.Color r6 = r6.set(r4)
            r7 = 1056964608(0x3f000000, float:0.5)
            r6.lerp(r5, r7)
            com.badlogic.gdx.graphics.Color r6 = r0.tempColor
            float r7 = r6.a
            com.badlogic.gdx.graphics.Color r8 = r17.getColor()
            float r8 = r8.a
            float r7 = r7 * r8
            r6.a = r7
            if (r25 == 0) goto L3f
            r6 = 1119092736(0x42b40000, float:90.0)
            float r6 = r24 + r6
            goto L41
        L3f:
            r6 = r24
        L41:
            com.badlogic.gdx.graphics.Color r7 = r0.setColor1
            float r7 = r7.toFloatBits()
            com.badlogic.gdx.graphics.Color r8 = r0.tempColor
            float r8 = r8.toFloatBits()
            r9 = 1086918619(0x40c90fdb, float:6.2831855)
            float r10 = (float) r3
            float r9 = r9 / r10
            float r10 = org.fortheloss.framework.CustomMathUtils.cos(r9)
            float r9 = org.fortheloss.framework.CustomMathUtils.sin(r9)
            float r11 = org.fortheloss.framework.CustomMathUtils.cosDeg(r6)
            float r11 = r11 * r20
            float r6 = org.fortheloss.framework.CustomMathUtils.sinDeg(r6)
            float r6 = r6 * r20
            int r12 = r3 * 3
            int r12 = r12 + 3
            r0.quickCheck(r12)
            int r3 = r3 + (-1)
            r12 = 0
            r20 = r6
            r15 = r20
            r13 = r7
            r14 = r11
        L76:
            if (r12 >= r3) goto Lf0
            float r6 = (float) r12
            r24 = r11
            int r11 = r3 + (-1)
            float r11 = (float) r11
            float r6 = r6 / r11
            r11 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r11
            r11 = 1065353216(0x3f800000, float:1.0)
            float r6 = r11 - r6
            float r6 = java.lang.Math.abs(r6)
            r25 = r3
            com.badlogic.gdx.math.Interpolation r3 = com.badlogic.gdx.math.Interpolation.sine
            r16 = r7
            r7 = 0
            float r3 = r3.apply(r7, r11, r6)
            com.badlogic.gdx.graphics.Color r6 = r0.tempColor
            com.badlogic.gdx.graphics.Color r6 = r6.set(r5)
            r6.lerp(r4, r3)
            com.badlogic.gdx.graphics.Color r3 = r0.tempColor
            float r6 = r3.a
            com.badlogic.gdx.graphics.Color r7 = r17.getColor()
            float r7 = r7.a
            float r6 = r6 * r7
            r3.a = r6
            com.badlogic.gdx.graphics.Color r3 = r0.tempColor
            float r3 = r3.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r7 = 0
            r6.vertex(r1, r2, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            float r11 = r1 + r14
            float r13 = r2 + r15
            r6.vertex(r11, r13, r7)
            float r6 = r10 * r14
            float r7 = r9 * r15
            float r6 = r6 - r7
            float r14 = r14 * r9
            float r15 = r15 * r10
            float r15 = r15 + r14
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            float r11 = r1 + r6
            float r13 = r2 + r15
            r14 = 0
            r7.vertex(r11, r13, r14)
            int r12 = r12 + 1
            r11 = r24
            r13 = r3
            r14 = r6
            r7 = r16
            r3 = r25
            goto L76
        Lf0:
            r16 = r7
            r24 = r11
            r3 = 0
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.vertex(r1, r2, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            float r5 = r1 + r14
            float r6 = r2 + r15
            r4.vertex(r5, r6, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r5 = r16
            r4.color(r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            float r1 = r1 + r24
            float r2 = r2 + r20
            r4.vertex(r1, r2, r3)
            return
    }

    public void circleOutline(float r20, float r21, float r22, float r23, int r24, com.badlogic.gdx.graphics.Color r25) {
            r19 = this;
            r0 = r19
            r1 = r24
        L4:
            int r2 = r1 % 4
            if (r2 == 0) goto Lb
            int r1 = r1 + 1
            goto L4
        Lb:
            int r2 = r1 * 6
            r0.quickCheck(r2)
            float r2 = r25.toFloatBits()
            float r3 = r23 - r22
            r4 = 1135869952(0x43b40000, float:360.0)
            float r5 = (float) r1
            float r4 = r4 / r5
            r5 = 1065353216(0x3f800000, float:1.0)
            int r1 = r1 / 4
            r6 = 1
            r8 = 0
        L20:
            if (r6 > r1) goto L18b
            float r9 = (float) r6
            float r9 = r9 * r4
            float r10 = org.fortheloss.framework.CustomMathUtils.cosDeg(r9)
            float r9 = org.fortheloss.framework.CustomMathUtils.sinDeg(r9)
            float r11 = r23 * r5
            float r12 = r23 * r8
            float r5 = r5 * r3
            float r8 = r8 * r3
            float r13 = r3 * r10
            float r14 = r3 * r9
            float r15 = r23 * r10
            float r16 = r23 * r9
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r24 = r1
            float r1 = r20 + r11
            r25 = r3
            float r3 = r21 + r12
            r17 = r4
            r4 = 0
            r7.vertex(r1, r3, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r22 = r9
            float r9 = r20 + r5
            r18 = r10
            float r10 = r21 + r8
            r7.vertex(r9, r10, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            float r9 = r20 + r13
            float r10 = r21 + r14
            r7.vertex(r9, r10, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.vertex(r1, r3, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r9, r10, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r3 = r20 + r15
            float r7 = r21 + r16
            r1.vertex(r3, r7, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r3 = r20 - r11
            float r7 = r21 - r12
            r1.vertex(r3, r7, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r9 = r20 - r5
            float r10 = r21 - r8
            r1.vertex(r9, r10, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r9 = r20 - r13
            float r10 = r21 - r14
            r1.vertex(r9, r10, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r3, r7, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r9, r10, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r3 = r20 - r15
            float r7 = r21 - r16
            r1.vertex(r3, r7, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r3 = r20 + r12
            float r7 = r21 - r11
            r1.vertex(r3, r7, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r9 = r20 + r8
            float r10 = r21 - r5
            r1.vertex(r9, r10, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r9 = r20 + r14
            float r10 = r21 - r13
            r1.vertex(r9, r10, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r3, r7, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r9, r10, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r3 = r20 + r16
            float r7 = r21 - r15
            r1.vertex(r3, r7, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r3 = r20 - r12
            float r7 = r21 + r11
            r1.vertex(r3, r7, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r8 = r20 - r8
            float r5 = r21 + r5
            r1.vertex(r8, r5, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r5 = r20 - r14
            float r8 = r21 + r13
            r1.vertex(r5, r8, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r3, r7, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r5, r8, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r3 = r20 - r16
            float r5 = r21 + r15
            r1.vertex(r3, r5, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r2)
            int r6 = r6 + 1
            r8 = r22
            r1 = r24
            r3 = r25
            r4 = r17
            r5 = r18
            goto L20
        L18b:
            return
    }

    public void circleUpDown(float r18, float r19, float r20, float r21, int r22, com.badlogic.gdx.graphics.Color r23, com.badlogic.gdx.graphics.Color r24) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r22
            r4 = r23
            r5 = r24
            com.badlogic.gdx.graphics.Color r6 = r0.setColor1
            r6.set(r4)
            com.badlogic.gdx.graphics.Color r6 = r0.setColor2
            r6.set(r5)
            com.badlogic.gdx.graphics.Color r6 = r0.tempColor
            com.badlogic.gdx.graphics.Color r4 = r6.set(r4)
            r6 = 1056964608(0x3f000000, float:0.5)
            r4.lerp(r5, r6)
            com.badlogic.gdx.graphics.Color r4 = r0.setColor1
            com.badlogic.gdx.graphics.Color r5 = r0.tempColor
            r4.lerp(r5, r6)
            com.badlogic.gdx.graphics.Color r4 = r0.setColor2
            com.badlogic.gdx.graphics.Color r5 = r0.tempColor
            r4.lerp(r5, r6)
            com.badlogic.gdx.graphics.Color r4 = r0.setColor1
            float r5 = r4.a
            com.badlogic.gdx.graphics.Color r7 = r17.getColor()
            float r7 = r7.a
            float r5 = r5 * r7
            r4.a = r5
            com.badlogic.gdx.graphics.Color r4 = r0.setColor2
            float r5 = r4.a
            com.badlogic.gdx.graphics.Color r7 = r17.getColor()
            float r7 = r7.a
            float r5 = r5 * r7
            r4.a = r5
            int r4 = r3 + 2
            int r4 = r4 * 3
            r0.quickCheck(r4)
            com.badlogic.gdx.graphics.Color r4 = r0.setColor1
            float r4 = r4.toFloatBits()
            com.badlogic.gdx.graphics.Color r5 = r0.tempColor
            com.badlogic.gdx.graphics.Color r7 = r0.setColor1
            com.badlogic.gdx.graphics.Color r5 = r5.set(r7)
            com.badlogic.gdx.graphics.Color r7 = r0.setColor2
            com.badlogic.gdx.graphics.Color r5 = r5.lerp(r7, r6)
            float r5 = r5.toFloatBits()
            float r7 = org.fortheloss.framework.CustomMathUtils.cosDeg(r21)
            float r7 = r7 * r20
            float r8 = org.fortheloss.framework.CustomMathUtils.sinDeg(r21)
            float r8 = r8 * r20
            float r9 = (float) r3
            r10 = 1135869952(0x43b40000, float:360.0)
            float r10 = r10 / r9
            float r9 = org.fortheloss.framework.CustomMathUtils.cosDeg(r10)
            float r10 = org.fortheloss.framework.CustomMathUtils.sinDeg(r10)
            int r3 = r3 + (-1)
            r11 = 0
            r12 = r4
            r13 = r7
            r14 = r8
        L88:
            if (r11 >= r3) goto Leb
            com.badlogic.gdx.graphics.Color r15 = r0.tempColor
            com.badlogic.gdx.graphics.Color r6 = r0.setColor2
            com.badlogic.gdx.graphics.Color r6 = r15.set(r6)
            com.badlogic.gdx.graphics.Color r15 = r0.setColor1
            r21 = r8
            float r8 = (float) r11
            r24 = r7
            float r7 = (float) r3
            r16 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r16
            float r8 = r8 / r7
            r7 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 - r7
            float r7 = java.lang.Math.abs(r8)
            com.badlogic.gdx.graphics.Color r6 = r6.lerp(r15, r7)
            float r6 = r6.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r8 = 0
            r7.vertex(r1, r2, r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            float r12 = r1 + r13
            float r15 = r2 + r14
            r7.vertex(r12, r15, r8)
            float r7 = r9 * r13
            float r8 = r10 * r14
            float r7 = r7 - r8
            float r13 = r13 * r10
            float r14 = r14 * r9
            float r14 = r14 + r13
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r8.color(r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            float r12 = r1 + r7
            float r13 = r2 + r14
            r15 = 0
            r8.vertex(r12, r13, r15)
            int r11 = r11 + 1
            r8 = r21
            r12 = r6
            r13 = r7
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = r24
            goto L88
        Leb:
            r24 = r7
            r21 = r8
            r15 = 0
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.vertex(r1, r2, r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            float r5 = r1 + r13
            float r6 = r2 + r14
            r3.vertex(r5, r6, r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            float r1 = r1 + r24
            float r2 = r2 + r21
            r3.vertex(r1, r2, r15)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r1.renderer
            r0.dispose()
            return
    }

    public void ellipse(float r19, float r20, float r21, float r22, float r23, int r24, com.badlogic.gdx.graphics.Color r25, com.badlogic.gdx.graphics.Color r26) {
            r18 = this;
            r0 = r18
            r1 = r24
            int r2 = r1 * 3
            int r2 = r2 + 3
            r0.quickCheck(r2)
            com.badlogic.gdx.graphics.Color r2 = r0.setColor1
            r3 = r25
            r2.set(r3)
            com.badlogic.gdx.graphics.Color r2 = r0.setColor1
            float r3 = r2.a
            com.badlogic.gdx.graphics.Color r4 = r18.getColor()
            float r4 = r4.a
            float r3 = r3 * r4
            r2.a = r3
            com.badlogic.gdx.graphics.Color r2 = r0.setColor2
            r3 = r26
            r2.set(r3)
            com.badlogic.gdx.graphics.Color r2 = r0.setColor2
            float r3 = r2.a
            com.badlogic.gdx.graphics.Color r4 = r18.getColor()
            float r4 = r4.a
            float r3 = r3 * r4
            r2.a = r3
            com.badlogic.gdx.graphics.Color r2 = r0.setColor1
            float r2 = r2.toFloatBits()
            com.badlogic.gdx.graphics.Color r3 = r0.setColor2
            float r3 = r3.toFloatBits()
            float r4 = (float) r1
            r5 = 1086918619(0x40c90fdb, float:6.2831855)
            float r5 = r5 / r4
            r4 = 1078530011(0x40490fdb, float:3.1415927)
            float r4 = r4 * r23
            r6 = 1127481344(0x43340000, float:180.0)
            float r4 = r4 / r6
            float r6 = com.badlogic.gdx.math.MathUtils.sin(r4)
            float r4 = com.badlogic.gdx.math.MathUtils.cos(r4)
            r7 = 1073741824(0x40000000, float:2.0)
            float r8 = r21 / r7
            float r8 = r19 + r8
            float r7 = r22 / r7
            float r7 = r20 + r7
            r9 = 1056964608(0x3f000000, float:0.5)
            float r10 = r21 * r9
            r11 = 0
            r12 = 0
            r13 = r10
            r14 = 0
        L68:
            if (r12 >= r1) goto Lc1
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r15 = r0.renderer
            r15.color(r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r15 = r0.renderer
            float r16 = r4 * r13
            float r16 = r8 + r16
            float r17 = r6 * r14
            float r9 = r16 - r17
            float r13 = r13 * r6
            float r13 = r13 + r7
            float r14 = r14 * r4
            float r13 = r13 + r14
            r15.vertex(r9, r13, r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            r9.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            r9.vertex(r8, r7, r11)
            int r12 = r12 + 1
            float r9 = (float) r12
            float r9 = r9 * r5
            float r13 = com.badlogic.gdx.math.MathUtils.cos(r9)
            float r13 = r13 * r10
            r14 = 1056964608(0x3f000000, float:0.5)
            float r15 = r22 * r14
            float r9 = com.badlogic.gdx.math.MathUtils.sin(r9)
            float r9 = r9 * r15
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r15 = r0.renderer
            r15.color(r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r15 = r0.renderer
            float r16 = r4 * r13
            float r16 = r8 + r16
            float r17 = r6 * r9
            float r14 = r16 - r17
            float r16 = r6 * r13
            float r16 = r7 + r16
            float r17 = r4 * r9
            float r0 = r16 + r17
            r15.vertex(r14, r0, r11)
            r0 = r18
            r14 = r9
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L68
        Lc1:
            return
    }

    public void ellipse(float r20, float r21, float r22, float r23, float r24, int r25, com.badlogic.gdx.graphics.Color r26, com.badlogic.gdx.graphics.Color r27, boolean r28) {
            r19 = this;
            r0 = r19
            r1 = r25
            r2 = r26
            r3 = r27
            int r4 = r1 * 3
            int r4 = r4 + 3
            r0.quickCheck(r4)
            com.badlogic.gdx.graphics.Color r4 = r0.setColor2
            r4.set(r3)
            com.badlogic.gdx.graphics.Color r4 = r0.setColor2
            float r5 = r4.a
            com.badlogic.gdx.graphics.Color r6 = r19.getColor()
            float r6 = r6.a
            float r5 = r5 * r6
            r4.a = r5
            com.badlogic.gdx.graphics.Color r4 = r0.tempColor
            com.badlogic.gdx.graphics.Color r4 = r4.set(r2)
            r5 = 1056964608(0x3f000000, float:0.5)
            r4.lerp(r3, r5)
            com.badlogic.gdx.graphics.Color r4 = r0.tempColor
            float r6 = r4.a
            com.badlogic.gdx.graphics.Color r7 = r19.getColor()
            float r7 = r7.a
            float r6 = r6 * r7
            r4.a = r6
            if (r28 != 0) goto L47
            r4 = 1119092736(0x42b40000, float:90.0)
            float r4 = r24 - r4
            r6 = r22
            r7 = r4
            r4 = r23
            goto L4d
        L47:
            r4 = r22
            r6 = r23
            r7 = r24
        L4d:
            com.badlogic.gdx.graphics.Color r8 = r0.setColor2
            float r8 = r8.toFloatBits()
            com.badlogic.gdx.graphics.Color r9 = r0.tempColor
            float r9 = r9.toFloatBits()
            r10 = 1086918619(0x40c90fdb, float:6.2831855)
            float r11 = (float) r1
            float r10 = r10 / r11
            r11 = 1078530011(0x40490fdb, float:3.1415927)
            float r7 = r7 * r11
            r11 = 1127481344(0x43340000, float:180.0)
            float r7 = r7 / r11
            float r11 = com.badlogic.gdx.math.MathUtils.sin(r7)
            float r7 = com.badlogic.gdx.math.MathUtils.cos(r7)
            r12 = 1073741824(0x40000000, float:2.0)
            if (r28 != 0) goto L79
            float r13 = r6 / r12
            float r13 = r20 + r13
            float r14 = r4 / r12
            goto L7f
        L79:
            float r13 = r4 / r12
            float r13 = r20 + r13
            float r14 = r6 / r12
        L7f:
            float r14 = r21 + r14
            float r4 = r4 * r5
            r17 = r4
            r5 = 0
            r18 = 0
        L88:
            if (r5 >= r1) goto L11a
            float r15 = (float) r5
            int r12 = r1 + (-1)
            float r12 = (float) r12
            float r15 = r15 / r12
            r12 = 1073741824(0x40000000, float:2.0)
            float r15 = r15 * r12
            r12 = 1065353216(0x3f800000, float:1.0)
            float r15 = r12 - r15
            float r15 = java.lang.Math.abs(r15)
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.sine
            r23 = r6
            r6 = 0
            float r1 = r1.apply(r6, r12, r15)
            com.badlogic.gdx.graphics.Color r6 = r0.tempColor
            com.badlogic.gdx.graphics.Color r6 = r6.set(r2)
            r6.lerp(r3, r1)
            com.badlogic.gdx.graphics.Color r1 = r0.tempColor
            float r6 = r1.a
            com.badlogic.gdx.graphics.Color r12 = r19.getColor()
            float r12 = r12.a
            float r6 = r6 * r12
            r1.a = r6
            com.badlogic.gdx.graphics.Color r1 = r0.tempColor
            float r1 = r1.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            float r8 = r7 * r17
            float r8 = r8 + r13
            float r12 = r11 * r18
            float r8 = r8 - r12
            float r17 = r17 * r11
            float r17 = r14 + r17
            float r18 = r18 * r7
            float r12 = r17 + r18
            r15 = 0
            r6.vertex(r8, r12, r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.vertex(r13, r14, r15)
            int r5 = r5 + 1
            float r6 = (float) r5
            float r6 = r6 * r10
            float r8 = com.badlogic.gdx.math.MathUtils.cos(r6)
            float r17 = r4 * r8
            r8 = 1056964608(0x3f000000, float:0.5)
            float r12 = r23 * r8
            float r6 = com.badlogic.gdx.math.MathUtils.sin(r6)
            float r18 = r12 * r6
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            float r12 = r7 * r17
            float r12 = r12 + r13
            float r15 = r11 * r18
            float r12 = r12 - r15
            float r15 = r11 * r17
            float r15 = r15 + r14
            float r16 = r7 * r18
            float r15 = r15 + r16
            r8 = 0
            r6.vertex(r12, r15, r8)
            r6 = r23
            r8 = r1
            r12 = 1073741824(0x40000000, float:2.0)
            r1 = r25
            goto L88
        L11a:
            return
    }

    public void end() {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r1.renderer
            r0.end()
            r0 = 0
            r1.shapeType = r0
            return
    }

    public void flush() {
            r1 = this;
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = r1.shapeType
            r1.end()
            r1.begin(r0)
            return
    }

    public com.badlogic.gdx.graphics.Color getColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            return r0
    }

    public com.badlogic.gdx.math.Matrix4 getProjectionMatrix() {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.projectionMatrix
            return r0
    }

    public com.badlogic.gdx.math.Matrix4 getTransformMatrix() {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.transformMatrix
            return r0
    }

    public void halfCircle(float r8, float r9, float r10, int r11, float r12, com.badlogic.gdx.graphics.Color r13, com.badlogic.gdx.graphics.Color r14) {
            r7 = this;
            com.badlogic.gdx.graphics.Color r0 = r7.setColor1
            r0.set(r13)
            com.badlogic.gdx.graphics.Color r13 = r7.setColor1
            float r0 = r13.a
            com.badlogic.gdx.graphics.Color r1 = r7.getColor()
            float r1 = r1.a
            float r0 = r0 * r1
            r13.a = r0
            com.badlogic.gdx.graphics.Color r13 = r7.setColor2
            r13.set(r14)
            com.badlogic.gdx.graphics.Color r13 = r7.setColor2
            float r14 = r13.a
            com.badlogic.gdx.graphics.Color r0 = r7.getColor()
            float r0 = r0.a
            float r14 = r14 * r0
            r13.a = r14
            com.badlogic.gdx.graphics.Color r13 = r7.setColor1
            float r13 = r13.toFloatBits()
            com.badlogic.gdx.graphics.Color r14 = r7.setColor2
            float r14 = r14.toFloatBits()
            float r0 = (float) r11
            r1 = 1078530011(0x40490fdb, float:3.1415927)
            float r1 = r1 / r0
            float r0 = org.fortheloss.framework.CustomMathUtils.cos(r1)
            float r1 = org.fortheloss.framework.CustomMathUtils.sin(r1)
            float r2 = org.fortheloss.framework.CustomMathUtils.cosDeg(r12)
            float r2 = r2 * r10
            float r12 = org.fortheloss.framework.CustomMathUtils.sinDeg(r12)
            float r12 = r12 * r10
            int r10 = r11 * 3
            int r10 = r10 + 3
            r7.quickCheck(r10)
            r10 = 0
        L53:
            if (r10 >= r11) goto L8a
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r7.renderer
            r3.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r7.renderer
            r4 = 0
            r3.vertex(r8, r9, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r7.renderer
            r3.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r7.renderer
            float r5 = r8 + r2
            float r6 = r9 + r12
            r3.vertex(r5, r6, r4)
            float r3 = r0 * r2
            float r5 = r1 * r12
            float r3 = r3 - r5
            float r2 = r2 * r1
            float r12 = r12 * r0
            float r12 = r12 + r2
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r7.renderer
            r2.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r7.renderer
            float r5 = r8 + r3
            float r6 = r9 + r12
            r2.vertex(r5, r6, r4)
            int r10 = r10 + 1
            r2 = r3
            goto L53
        L8a:
            return
    }

    public void halfCircle(float r18, float r19, float r20, int r21, float r22, com.badlogic.gdx.graphics.Color r23, com.badlogic.gdx.graphics.Color r24, boolean r25) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r23
            r5 = r24
            int r6 = r3 * 3
            int r6 = r6 + 3
            r0.quickCheck(r6)
            com.badlogic.gdx.graphics.Color r6 = r0.setColor2
            r6.set(r5)
            com.badlogic.gdx.graphics.Color r6 = r0.setColor2
            float r7 = r6.a
            com.badlogic.gdx.graphics.Color r8 = r17.getColor()
            float r8 = r8.a
            float r7 = r7 * r8
            r6.a = r7
            com.badlogic.gdx.graphics.Color r6 = r0.tempColor
            com.badlogic.gdx.graphics.Color r6 = r6.set(r4)
            r7 = 1056964608(0x3f000000, float:0.5)
            r6.lerp(r5, r7)
            com.badlogic.gdx.graphics.Color r6 = r0.tempColor
            float r7 = r6.a
            com.badlogic.gdx.graphics.Color r8 = r17.getColor()
            float r8 = r8.a
            float r7 = r7 * r8
            r6.a = r7
            com.badlogic.gdx.graphics.Color r6 = r0.setColor2
            float r6 = r6.toFloatBits()
            com.badlogic.gdx.graphics.Color r7 = r0.tempColor
            float r7 = r7.toFloatBits()
            float r8 = (float) r3
            r9 = 1078530011(0x40490fdb, float:3.1415927)
            float r9 = r9 / r8
            float r10 = org.fortheloss.framework.CustomMathUtils.cos(r9)
            float r9 = org.fortheloss.framework.CustomMathUtils.sin(r9)
            float r11 = org.fortheloss.framework.CustomMathUtils.cosDeg(r22)
            float r11 = r11 * r20
            float r12 = org.fortheloss.framework.CustomMathUtils.sinDeg(r22)
            float r12 = r12 * r20
            r13 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r25 == 0) goto Ld6
        L69:
            if (r13 >= r3) goto L149
            float r15 = (float) r13
            float r15 = r15 / r8
            float r15 = r14 - r15
            float r15 = java.lang.Math.abs(r15)
            r16 = r8
            com.badlogic.gdx.math.Interpolation r8 = com.badlogic.gdx.math.Interpolation.sine
            r3 = 0
            float r8 = r8.apply(r3, r14, r15)
            com.badlogic.gdx.graphics.Color r3 = r0.tempColor
            com.badlogic.gdx.graphics.Color r3 = r3.set(r4)
            r3.lerp(r5, r8)
            com.badlogic.gdx.graphics.Color r3 = r0.tempColor
            float r8 = r3.a
            com.badlogic.gdx.graphics.Color r15 = r17.getColor()
            float r15 = r15.a
            float r8 = r8 * r15
            r3.a = r8
            com.badlogic.gdx.graphics.Color r3 = r0.tempColor
            float r3 = r3.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r8.color(r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r15 = 0
            r8.vertex(r1, r2, r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r8.color(r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            float r8 = r1 + r11
            float r14 = r2 + r12
            r6.vertex(r8, r14, r15)
            float r6 = r10 * r11
            float r8 = r9 * r12
            float r6 = r6 - r8
            float r11 = r11 * r9
            float r12 = r12 * r10
            float r12 = r12 + r11
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r8.color(r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            float r11 = r1 + r6
            float r14 = r2 + r12
            r15 = 0
            r8.vertex(r11, r14, r15)
            int r13 = r13 + 1
            r11 = r6
            r8 = r16
            r14 = 1065353216(0x3f800000, float:1.0)
            r6 = r3
            r3 = r21
            goto L69
        Ld6:
            r3 = r21
            r7 = r6
        Ld9:
            if (r13 >= r3) goto L149
            float r8 = (float) r13
            int r14 = r3 + (-1)
            float r14 = (float) r14
            float r8 = r8 / r14
            r14 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 * r14
            r14 = 1065353216(0x3f800000, float:1.0)
            float r8 = r14 - r8
            float r8 = java.lang.Math.abs(r8)
            com.badlogic.gdx.math.Interpolation r15 = com.badlogic.gdx.math.Interpolation.sineIn
            r3 = 0
            float r8 = r15.apply(r3, r14, r8)
            com.badlogic.gdx.graphics.Color r3 = r0.tempColor
            com.badlogic.gdx.graphics.Color r3 = r3.set(r4)
            r3.lerp(r5, r8)
            com.badlogic.gdx.graphics.Color r3 = r0.tempColor
            float r8 = r3.a
            com.badlogic.gdx.graphics.Color r15 = r17.getColor()
            float r15 = r15.a
            float r8 = r8 * r15
            r3.a = r8
            com.badlogic.gdx.graphics.Color r3 = r0.tempColor
            float r3 = r3.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r8.color(r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r15 = 0
            r8.vertex(r1, r2, r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r8.color(r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            float r8 = r1 + r11
            float r14 = r2 + r12
            r7.vertex(r8, r14, r15)
            float r7 = r10 * r11
            float r8 = r9 * r12
            float r7 = r7 - r8
            float r11 = r11 * r9
            float r12 = r12 * r10
            float r12 = r12 + r11
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r8.color(r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            float r11 = r1 + r7
            float r14 = r2 + r12
            r15 = 0
            r8.vertex(r11, r14, r15)
            int r13 = r13 + 1
            r11 = r7
            r7 = r3
            r3 = r21
            goto Ld9
        L149:
            return
    }

    public void halfEllipse(float r19, float r20, float r21, float r22, float r23, int r24, com.badlogic.gdx.graphics.Color r25, com.badlogic.gdx.graphics.Color r26) {
            r18 = this;
            r0 = r18
            r1 = r24
            int r2 = r1 * 3
            int r2 = r2 + 3
            r0.quickCheck(r2)
            com.badlogic.gdx.graphics.Color r2 = r0.setColor1
            r3 = r25
            r2.set(r3)
            com.badlogic.gdx.graphics.Color r2 = r0.setColor1
            float r3 = r2.a
            com.badlogic.gdx.graphics.Color r4 = r18.getColor()
            float r4 = r4.a
            float r3 = r3 * r4
            r2.a = r3
            com.badlogic.gdx.graphics.Color r2 = r0.setColor2
            r3 = r26
            r2.set(r3)
            com.badlogic.gdx.graphics.Color r2 = r0.setColor2
            float r3 = r2.a
            com.badlogic.gdx.graphics.Color r4 = r18.getColor()
            float r4 = r4.a
            float r3 = r3 * r4
            r2.a = r3
            com.badlogic.gdx.graphics.Color r2 = r0.setColor1
            float r2 = r2.toFloatBits()
            com.badlogic.gdx.graphics.Color r3 = r0.setColor2
            float r3 = r3.toFloatBits()
            float r4 = (float) r1
            r5 = 1078530011(0x40490fdb, float:3.1415927)
            float r4 = r5 / r4
            float r5 = r5 * r23
            r6 = 1127481344(0x43340000, float:180.0)
            float r5 = r5 / r6
            float r6 = com.badlogic.gdx.math.MathUtils.sin(r5)
            float r5 = com.badlogic.gdx.math.MathUtils.cos(r5)
            r7 = 1073741824(0x40000000, float:2.0)
            float r8 = r21 / r7
            float r8 = r19 + r8
            float r7 = r22 / r7
            float r7 = r20 + r7
            r9 = 1056964608(0x3f000000, float:0.5)
            float r10 = r21 * r9
            r11 = 0
            r12 = 0
            r13 = r10
            r14 = 0
        L66:
            if (r12 >= r1) goto Lbf
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r15 = r0.renderer
            r15.color(r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r15 = r0.renderer
            float r16 = r5 * r13
            float r16 = r8 + r16
            float r17 = r6 * r14
            float r9 = r16 - r17
            float r13 = r13 * r6
            float r13 = r13 + r7
            float r14 = r14 * r5
            float r13 = r13 + r14
            r15.vertex(r9, r13, r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            r9.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            r9.vertex(r8, r7, r11)
            int r12 = r12 + 1
            float r9 = (float) r12
            float r9 = r9 * r4
            float r13 = com.badlogic.gdx.math.MathUtils.cos(r9)
            float r13 = r13 * r10
            r14 = 1056964608(0x3f000000, float:0.5)
            float r15 = r22 * r14
            float r9 = com.badlogic.gdx.math.MathUtils.sin(r9)
            float r9 = r9 * r15
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r15 = r0.renderer
            r15.color(r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r15 = r0.renderer
            float r16 = r5 * r13
            float r16 = r8 + r16
            float r17 = r6 * r9
            float r14 = r16 - r17
            float r16 = r6 * r13
            float r16 = r7 + r16
            float r17 = r5 * r9
            float r0 = r16 + r17
            r15.vertex(r14, r0, r11)
            r0 = r18
            r14 = r9
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L66
        Lbf:
            return
    }

    public void halfEllipse(float r21, float r22, float r23, float r24, float r25, int r26, com.badlogic.gdx.graphics.Color r27, com.badlogic.gdx.graphics.Color r28, boolean r29) {
            r20 = this;
            r0 = r20
            r1 = r26
            r2 = r27
            r3 = r28
            int r4 = r1 * 3
            int r4 = r4 + 3
            r0.quickCheck(r4)
            com.badlogic.gdx.graphics.Color r4 = r0.setColor2
            r4.set(r3)
            com.badlogic.gdx.graphics.Color r4 = r0.setColor2
            float r5 = r4.a
            com.badlogic.gdx.graphics.Color r6 = r20.getColor()
            float r6 = r6.a
            float r5 = r5 * r6
            r4.a = r5
            com.badlogic.gdx.graphics.Color r4 = r0.tempColor
            com.badlogic.gdx.graphics.Color r4 = r4.set(r2)
            r5 = 1056964608(0x3f000000, float:0.5)
            r4.lerp(r3, r5)
            com.badlogic.gdx.graphics.Color r4 = r0.tempColor
            float r6 = r4.a
            com.badlogic.gdx.graphics.Color r7 = r20.getColor()
            float r7 = r7.a
            float r6 = r6 * r7
            r4.a = r6
            com.badlogic.gdx.graphics.Color r4 = r0.setColor2
            float r4 = r4.toFloatBits()
            com.badlogic.gdx.graphics.Color r6 = r0.tempColor
            float r6 = r6.toFloatBits()
            float r7 = (float) r1
            r8 = 1078530011(0x40490fdb, float:3.1415927)
            float r9 = r8 / r7
            float r8 = r8 * r25
            r10 = 1127481344(0x43340000, float:180.0)
            float r8 = r8 / r10
            float r10 = com.badlogic.gdx.math.MathUtils.sin(r8)
            float r8 = com.badlogic.gdx.math.MathUtils.cos(r8)
            r11 = 1073741824(0x40000000, float:2.0)
            float r12 = r23 / r11
            float r12 = r21 + r12
            float r13 = r24 / r11
            float r13 = r22 + r13
            float r14 = r23 * r5
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r29 == 0) goto Lf7
            r17 = r14
            r5 = 0
            r18 = 0
        L6f:
            if (r5 >= r1) goto L191
            float r11 = (float) r5
            float r11 = r11 / r7
            float r11 = r15 - r11
            float r11 = java.lang.Math.abs(r11)
            r19 = r7
            com.badlogic.gdx.math.Interpolation r7 = com.badlogic.gdx.math.Interpolation.sine
            r1 = 0
            float r7 = r7.apply(r1, r15, r11)
            com.badlogic.gdx.graphics.Color r1 = r0.tempColor
            com.badlogic.gdx.graphics.Color r1 = r1.set(r2)
            r1.lerp(r3, r7)
            com.badlogic.gdx.graphics.Color r1 = r0.tempColor
            float r7 = r1.a
            com.badlogic.gdx.graphics.Color r11 = r20.getColor()
            float r11 = r11.a
            float r7 = r7 * r11
            r1.a = r7
            com.badlogic.gdx.graphics.Color r1 = r0.tempColor
            float r1 = r1.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            float r7 = r8 * r17
            float r7 = r7 + r12
            float r11 = r10 * r18
            float r7 = r7 - r11
            float r17 = r17 * r10
            float r17 = r13 + r17
            float r18 = r18 * r8
            float r11 = r17 + r18
            r15 = 0
            r4.vertex(r7, r11, r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.vertex(r12, r13, r15)
            int r5 = r5 + 1
            float r4 = (float) r5
            float r4 = r4 * r9
            float r7 = com.badlogic.gdx.math.MathUtils.cos(r4)
            float r17 = r14 * r7
            r7 = 1056964608(0x3f000000, float:0.5)
            float r11 = r24 * r7
            float r4 = com.badlogic.gdx.math.MathUtils.sin(r4)
            float r18 = r11 * r4
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            float r7 = r8 * r17
            float r7 = r7 + r12
            float r11 = r10 * r18
            float r7 = r7 - r11
            float r11 = r10 * r17
            float r11 = r11 + r13
            float r15 = r8 * r18
            float r11 = r11 + r15
            r15 = 0
            r4.vertex(r7, r11, r15)
            r4 = r1
            r7 = r19
            r15 = 1065353216(0x3f800000, float:1.0)
            r1 = r26
            goto L6f
        Lf7:
            r5 = r26
            r6 = r4
            r7 = r14
            r1 = 0
            r15 = 0
        Lfd:
            if (r15 >= r5) goto L191
            float r11 = (float) r15
            r21 = r14
            int r14 = r5 + (-1)
            float r14 = (float) r14
            float r11 = r11 / r14
            r14 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 * r14
            r14 = 1065353216(0x3f800000, float:1.0)
            float r11 = r14 - r11
            float r11 = java.lang.Math.abs(r11)
            com.badlogic.gdx.math.Interpolation r5 = com.badlogic.gdx.math.Interpolation.sineIn
            r17 = r9
            r9 = 0
            float r5 = r5.apply(r9, r14, r11)
            com.badlogic.gdx.graphics.Color r9 = r0.tempColor
            com.badlogic.gdx.graphics.Color r9 = r9.set(r2)
            r9.lerp(r3, r5)
            com.badlogic.gdx.graphics.Color r5 = r0.tempColor
            float r9 = r5.a
            com.badlogic.gdx.graphics.Color r11 = r20.getColor()
            float r11 = r11.a
            float r9 = r9 * r11
            r5.a = r9
            com.badlogic.gdx.graphics.Color r5 = r0.tempColor
            float r5 = r5.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            r9.color(r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            float r9 = r8 * r7
            float r9 = r9 + r12
            float r11 = r10 * r1
            float r9 = r9 - r11
            float r7 = r7 * r10
            float r7 = r7 + r13
            float r1 = r1 * r8
            float r7 = r7 + r1
            r1 = 0
            r6.vertex(r9, r7, r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.vertex(r12, r13, r1)
            int r15 = r15 + 1
            float r1 = (float) r15
            float r1 = r1 * r17
            float r6 = com.badlogic.gdx.math.MathUtils.cos(r1)
            float r7 = r21 * r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r9 = r24 * r6
            float r1 = com.badlogic.gdx.math.MathUtils.sin(r1)
            float r1 = r1 * r9
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            r9.color(r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r11 = r8 * r7
            float r11 = r11 + r12
            float r16 = r10 * r1
            float r11 = r11 - r16
            float r16 = r10 * r7
            float r16 = r13 + r16
            float r18 = r8 * r1
            float r6 = r16 + r18
            r14 = 0
            r9.vertex(r11, r6, r14)
            r14 = r21
            r6 = r5
            r9 = r17
            r5 = r26
            goto Lfd
        L191:
            return
    }

    public boolean isDrawing() {
            r1 = this;
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = r1.shapeType
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void line(float r10, float r11, float r12, float r13, float r14, float r15, com.badlogic.gdx.graphics.Color r16, com.badlogic.gdx.graphics.Color r17) {
            r9 = this;
            r8 = r9
            r6 = r16
            r7 = r17
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = r8.shapeType
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            if (r0 != r1) goto L1a
            r5 = 1061158912(0x3f400000, float:0.75)
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            r6 = r16
            r7 = r17
            r0.rectLine(r1, r2, r3, r4, r5, r6, r7)
            return
        L1a:
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line
            r1 = 0
            r2 = 2
            r9.check(r0, r1, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r8.renderer
            float r1 = r6.r
            float r2 = r6.g
            float r3 = r6.b
            float r4 = r6.a
            r0.color(r1, r2, r3, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r8.renderer
            r1 = r10
            r2 = r11
            r3 = r12
            r0.vertex(r10, r11, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r8.renderer
            float r1 = r7.r
            float r2 = r7.g
            float r3 = r7.b
            float r4 = r7.a
            r0.color(r1, r2, r3, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r8.renderer
            r1 = r13
            r2 = r14
            r3 = r15
            r0.vertex(r13, r14, r15)
            return
    }

    public final void line(float r10, float r11, float r12, float r13, com.badlogic.gdx.graphics.Color r14, com.badlogic.gdx.graphics.Color r15) {
            r9 = this;
            r3 = 0
            r6 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r12
            r5 = r13
            r7 = r14
            r8 = r15
            r0.line(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void myRoundedSegment(float r26, float r27, float r28, float r29, float r30, float r31, float r32, boolean r33, com.badlogic.gdx.graphics.Color r34, com.badlogic.gdx.graphics.Color r35) {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r34
            r6 = r35
            r7 = 1056964608(0x3f000000, float:0.5)
            float r8 = r30 * r7
            int r9 = getSegmentsForSegmentArc(r8)
            int r10 = r9 + 4
            int r10 = r10 * 6
            int r10 = r10 + 6
            r0.quickCheck(r10)
            com.badlogic.gdx.graphics.Color r10 = r0.setColor1
            r10.set(r5)
            com.badlogic.gdx.graphics.Color r10 = r0.setColor1
            float r11 = r10.a
            com.badlogic.gdx.graphics.Color r12 = r25.getColor()
            float r12 = r12.a
            float r11 = r11 * r12
            r10.a = r11
            com.badlogic.gdx.graphics.Color r10 = r0.setColor2
            r10.set(r6)
            com.badlogic.gdx.graphics.Color r10 = r0.setColor2
            float r11 = r10.a
            com.badlogic.gdx.graphics.Color r12 = r25.getColor()
            float r12 = r12.a
            float r11 = r11 * r12
            r10.a = r11
            com.badlogic.gdx.graphics.Color r10 = r0.setColor1
            float r10 = r10.toFloatBits()
            com.badlogic.gdx.graphics.Color r11 = r0.setColor2
            float r11 = r11.toFloatBits()
            float r12 = r32 * r8
            float r8 = r8 * r31
            float r13 = r1 + r12
            float r14 = r2 - r8
            float r15 = r1 - r12
            float r7 = r2 + r8
            float r6 = r3 + r12
            float r5 = r4 - r8
            float r1 = r3 - r12
            float r3 = r4 + r8
            r17 = 1127481344(0x43340000, float:180.0)
            r18 = 1
            if (r33 == 0) goto L1d2
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r32 = r12
            r12 = 0
            r4.vertex(r13, r14, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.vertex(r15, r7, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.vertex(r6, r5, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.vertex(r6, r5, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.vertex(r1, r3, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.vertex(r15, r7, r12)
            float r4 = -r8
            float r8 = (float) r9
            float r17 = r17 / r8
            float r8 = org.fortheloss.framework.CustomMathUtils.cosDeg(r17)
            float r16 = org.fortheloss.framework.CustomMathUtils.sinDeg(r17)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r12.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r31 = r3
            r19 = r5
            r5 = 0
            r3 = r1
            r1 = r26
            r12.vertex(r1, r2, r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r12.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r12.vertex(r13, r14, r5)
            float r12 = r8 * r32
            float r5 = r16 * r4
            float r12 = r12 - r5
            float r5 = r16 * r32
            float r4 = r4 * r8
            float r5 = r5 + r4
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            float r13 = r1 + r12
            float r14 = r2 + r5
            r20 = r6
            r6 = 0
            r4.vertex(r13, r14, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r6 = r28
            r13 = r29
            r14 = r31
            r30 = r7
            r7 = 0
            r4.vertex(r6, r13, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.vertex(r3, r14, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            float r4 = r6 - r12
            float r14 = r13 - r5
            r3.vertex(r4, r14, r7)
            int r9 = r9 + (-1)
            r3 = 1
        L11b:
            if (r3 >= r9) goto L184
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.vertex(r1, r2, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            float r14 = r1 + r12
            r31 = r9
            float r9 = r2 + r5
            r4.vertex(r14, r9, r7)
            float r4 = r8 * r12
            float r9 = r16 * r5
            float r4 = r4 - r9
            float r9 = r16 * r12
            float r14 = r8 * r5
            float r9 = r9 + r14
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r0.renderer
            r14.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r0.renderer
            r33 = r8
            float r8 = r1 + r4
            r21 = r15
            float r15 = r2 + r9
            r14.vertex(r8, r15, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r8.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r8.vertex(r6, r13, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r8.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            float r12 = r6 - r12
            float r5 = r13 - r5
            r8.vertex(r12, r5, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r0.renderer
            r5.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r0.renderer
            float r8 = r6 - r4
            float r12 = r13 - r9
            r5.vertex(r8, r12, r7)
            int r3 = r3 + 1
            r8 = r33
            r12 = r4
            r5 = r9
            r15 = r21
            r9 = r31
            goto L11b
        L184:
            r21 = r15
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.vertex(r1, r2, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            float r1 = r1 + r12
            float r2 = r2 + r5
            r3.vertex(r1, r2, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r15 = r30
            r4 = r21
            r1.vertex(r4, r15, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r6, r13, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r2 = r6 - r12
            float r3 = r13 - r5
            r1.vertex(r2, r3, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r12 = r19
            r5 = r20
            r1.vertex(r5, r12, r7)
            goto L3a4
        L1d2:
            r22 = r3
            r32 = r12
            r4 = r15
            r3 = r1
            r12 = r5
            r5 = r6
            r15 = r7
            r1 = r26
            r6 = r28
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r6 = 0
            r7.vertex(r13, r14, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.vertex(r4, r15, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.vertex(r5, r12, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.vertex(r5, r12, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r20 = r5
            r5 = r22
            r7.vertex(r3, r5, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.vertex(r4, r15, r6)
            float r6 = -r8
            float r7 = (float) r9
            float r17 = r17 / r7
            float r7 = org.fortheloss.framework.CustomMathUtils.cosDeg(r17)
            float r8 = org.fortheloss.framework.CustomMathUtils.sinDeg(r17)
            r19 = r12
            com.badlogic.gdx.graphics.Color r12 = r0.tempColor
            r21 = r4
            r23 = r19
            r4 = r34
            com.badlogic.gdx.graphics.Color r12 = r12.set(r4)
            r17 = r15
            r24 = r20
            r4 = 1056964608(0x3f000000, float:0.5)
            r15 = r35
            com.badlogic.gdx.graphics.Color r4 = r12.lerp(r15, r4)
            float r4 = r4.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r12.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r15 = 0
            r12.vertex(r1, r2, r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r12.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r12.vertex(r13, r14, r15)
            float r12 = r7 * r32
            float r13 = r8 * r6
            float r12 = r12 - r13
            float r13 = r8 * r32
            float r6 = r6 * r7
            float r13 = r13 + r6
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            float r14 = r1 + r12
            float r15 = r2 + r13
            r16 = r11
            r11 = 0
            r6.vertex(r14, r15, r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r14 = r28
            r15 = r29
            r6.vertex(r14, r15, r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.vertex(r3, r5, r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            float r5 = r14 - r12
            float r6 = r15 - r13
            r3.vertex(r5, r6, r11)
            int r9 = r9 + (-1)
            r6 = r10
            r5 = r16
            r3 = 1
        L2a6:
            if (r3 >= r9) goto L34e
            float r11 = (float) r3
            r18 = r10
            int r10 = r9 + (-1)
            float r10 = (float) r10
            float r11 = r11 / r10
            r10 = 1065353216(0x3f800000, float:1.0)
            float r11 = r10 - r11
            float r10 = java.lang.Math.abs(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r0.renderer
            r11.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r0.renderer
            r31 = r9
            r9 = 0
            r11.vertex(r1, r2, r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r0.renderer
            r11.color(r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r0.renderer
            float r11 = r1 + r12
            r19 = r3
            float r3 = r2 + r13
            r5.vertex(r11, r3, r9)
            float r3 = r7 * r12
            float r5 = r8 * r13
            float r3 = r3 - r5
            float r5 = r8 * r12
            float r9 = r7 * r13
            float r5 = r5 + r9
            com.badlogic.gdx.graphics.Color r9 = r0.tempColor
            r11 = r34
            com.badlogic.gdx.graphics.Color r9 = r9.set(r11)
            r32 = r7
            r7 = r35
            com.badlogic.gdx.graphics.Color r9 = r9.lerp(r7, r10)
            float r9 = r9.toFloatBits()
            r33 = r8
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r8.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r20 = r9
            float r9 = r1 + r3
            float r1 = r2 + r5
            r2 = 0
            r8.vertex(r9, r1, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r14, r15, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r6 = r14 - r12
            float r8 = r15 - r13
            r1.vertex(r6, r8, r2)
            com.badlogic.gdx.graphics.Color r1 = r0.tempColor
            com.badlogic.gdx.graphics.Color r1 = r1.set(r7)
            com.badlogic.gdx.graphics.Color r1 = r1.lerp(r11, r10)
            float r6 = r1.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r8 = r14 - r3
            float r9 = r15 - r5
            r1.vertex(r8, r9, r2)
            int r1 = r19 + 1
            r2 = r27
            r9 = r31
            r7 = r32
            r8 = r33
            r12 = r3
            r13 = r5
            r10 = r18
            r5 = r20
            r3 = r1
            r1 = r26
            goto L2a6
        L34e:
            r18 = r10
            r2 = 0
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r2 = r26
            r3 = r27
            r7 = 0
            r1.vertex(r2, r3, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r2 = r2 + r12
            float r3 = r3 + r13
            r1.vertex(r2, r3, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r2 = r18
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r3 = r17
            r2 = r21
            r1.vertex(r2, r3, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r14, r15, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r2 = r14 - r12
            float r3 = r15 - r13
            r1.vertex(r2, r3, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r2 = r16
            r1.color(r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r3 = r23
            r2 = r24
            r1.vertex(r2, r3, r7)
        L3a4:
            return
    }

    public void myRoundedTrapezoid(float r36, float r37, float r38, float r39, float r40, float r41, float r42, float r43, float r44, float r45, boolean r46, boolean r47, boolean r48, com.badlogic.gdx.graphics.Color r49, com.badlogic.gdx.graphics.Color r50) {
            r35 = this;
            r0 = r35
            r1 = r44
            r2 = r45
            com.badlogic.gdx.graphics.Color r3 = r0.setColor1
            r4 = r49
            r3.set(r4)
            com.badlogic.gdx.graphics.Color r3 = r0.setColor1
            float r5 = r3.a
            com.badlogic.gdx.graphics.Color r6 = r35.getColor()
            float r6 = r6.a
            float r5 = r5 * r6
            r3.a = r5
            com.badlogic.gdx.graphics.Color r3 = r0.setColor2
            r5 = r50
            r3.set(r5)
            com.badlogic.gdx.graphics.Color r3 = r0.setColor2
            float r6 = r3.a
            com.badlogic.gdx.graphics.Color r7 = r35.getColor()
            float r7 = r7.a
            float r6 = r6 * r7
            r3.a = r6
            com.badlogic.gdx.graphics.Color r3 = r0.setColor1
            float r3 = r3.toFloatBits()
            com.badlogic.gdx.graphics.Color r6 = r0.setColor2
            float r6 = r6.toFloatBits()
            r7 = 1056964608(0x3f000000, float:0.5)
            float r8 = r40 * r7
            float r9 = r41 * r7
            float r10 = r8 - r9
            float r11 = java.lang.Math.abs(r10)
            int r11 = (r11 > r42 ? 1 : (r11 == r42 ? 0 : -1))
            if (r11 <= 0) goto L4e
            r11 = 1
            goto L4f
        L4e:
            r11 = 0
        L4f:
            int r14 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r14 <= 0) goto L56
            r15 = r47
            goto L58
        L56:
            r15 = r48
        L58:
            r16 = 1119092736(0x42b40000, float:90.0)
            r12 = 0
            if (r15 == 0) goto L111
            if (r11 == 0) goto L111
            r1 = 1132920832(0x43870000, float:270.0)
            r2 = 1135869952(0x43b40000, float:360.0)
            int r3 = (r40 > r41 ? 1 : (r40 == r41 ? 0 : -1))
            if (r3 <= 0) goto Lbd
            int r3 = getSegmentsForCircle(r8)
            if (r46 == 0) goto L80
            r38 = r35
            r39 = r36
            r40 = r37
            r41 = r8
            r42 = r3
            r43 = r49
            r44 = r49
            r38.circle(r39, r40, r41, r42, r43, r44)
            goto L110
        L80:
            float r6 = r43 % r2
        L82:
            int r7 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r7 >= 0) goto L88
            float r6 = r6 + r2
            goto L82
        L88:
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r2 <= 0) goto La7
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto La7
            float r1 = r43 - r16
            r38 = r35
            r39 = r36
            r40 = r37
            r41 = r8
            r42 = r1
            r43 = r3
            r44 = r50
            r45 = r49
            r38.circleUpDown(r39, r40, r41, r42, r43, r44, r45)
            goto L110
        La7:
            float r1 = r43 + r16
            r38 = r35
            r39 = r36
            r40 = r37
            r41 = r8
            r42 = r1
            r43 = r3
            r44 = r49
            r45 = r50
            r38.circleUpDown(r39, r40, r41, r42, r43, r44, r45)
            goto L110
        Lbd:
            int r3 = getSegmentsForCircle(r9)
            if (r46 == 0) goto Ld5
            r40 = r35
            r41 = r38
            r42 = r39
            r43 = r9
            r44 = r3
            r45 = r50
            r46 = r50
            r40.circle(r41, r42, r43, r44, r45, r46)
            goto L110
        Ld5:
            float r6 = r43 % r2
        Ld7:
            int r7 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r7 >= 0) goto Ldd
            float r6 = r6 + r2
            goto Ld7
        Ldd:
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r2 <= 0) goto Lfb
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto Lfb
            float r1 = r43 - r16
            r40 = r35
            r41 = r38
            r42 = r39
            r43 = r9
            r44 = r1
            r45 = r3
            r46 = r50
            r47 = r49
            r40.circleUpDown(r41, r42, r43, r44, r45, r46, r47)
            goto L110
        Lfb:
            float r1 = r43 + r16
            r40 = r35
            r41 = r38
            r42 = r39
            r43 = r9
            r44 = r1
            r45 = r3
            r46 = r49
            r47 = r50
            r40.circleUpDown(r41, r42, r43, r44, r45, r46, r47)
        L110:
            return
        L111:
            float r10 = r10 / r42
            float r4 = java.lang.Math.abs(r10)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L122
            float r4 = com.badlogic.gdx.math.MathUtils.acos(r10)
            goto L129
        L122:
            if (r14 <= 0) goto L126
            r4 = 0
            goto L129
        L126:
            r4 = 1078530011(0x40490fdb, float:3.1415927)
        L129:
            r8 = 1127481344(0x43340000, float:180.0)
            float r9 = r43 - r8
            r10 = 1016003125(0x3c8efa35, float:0.017453292)
            float r9 = r9 * r10
            float r10 = r9 + r4
            float r9 = r9 - r4
            int r4 = (r40 > r41 ? 1 : (r40 == r41 ? 0 : -1))
            if (r4 >= 0) goto L150
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = r37
            r4 = r38
            r11 = r40
            r14 = r41
            r15 = r47
            r18 = r48
            r13 = r3
            r8 = r6
            r19 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = r36
            r6 = r39
            goto L16b
        L150:
            if (r46 == 0) goto L157
            r34 = r6
            r6 = r3
            r3 = r34
        L157:
            r4 = r36
            r5 = r39
            r14 = r40
            r11 = r41
            r18 = r47
            r15 = r48
            r13 = r3
            r8 = r6
            r19 = 1065353216(0x3f800000, float:1.0)
            r6 = r37
            r3 = r38
        L16b:
            r20 = 1113927392(0x42652ee0, float:57.295776)
            float r20 = r20 * r10
            float r20 = r20 + r16
            float r20 = r20 - r43
            float r20 = java.lang.Math.abs(r20)
            float r11 = r11 * r7
            float r14 = r14 * r7
            if (r15 == 0) goto L1ab
            float r21 = org.fortheloss.framework.CustomMathUtils.cos(r9)
            float r21 = r21 * r11
            float r21 = r3 + r21
            float r22 = org.fortheloss.framework.CustomMathUtils.sin(r9)
            float r22 = r22 * r11
            float r22 = r5 + r22
            float r23 = org.fortheloss.framework.CustomMathUtils.cos(r10)
            float r23 = r23 * r11
            float r23 = r3 + r23
            float r24 = org.fortheloss.framework.CustomMathUtils.sin(r10)
            float r24 = r24 * r11
            float r24 = r5 + r24
            r37 = r3
            r36 = r5
            r7 = r21
            r12 = r22
            r5 = r23
            r3 = r24
            goto L1c4
        L1ab:
            float r7 = -r2
            float r7 = r7 * r11
            float r7 = r7 + r3
            float r22 = r11 * r1
            float r22 = r5 + r22
            float r23 = r11 * r2
            float r23 = r3 + r23
            float r12 = -r1
            float r12 = r12 * r11
            float r12 = r12 + r5
            r37 = r3
            r36 = r5
            r3 = r12
            r12 = r22
            r5 = r23
        L1c4:
            if (r18 == 0) goto L1e2
            float r22 = org.fortheloss.framework.CustomMathUtils.cos(r9)
            float r22 = r22 * r14
            float r22 = r4 + r22
            float r9 = org.fortheloss.framework.CustomMathUtils.sin(r9)
            float r9 = r9 * r14
            float r9 = r9 + r6
            float r23 = org.fortheloss.framework.CustomMathUtils.cos(r10)
            float r23 = r23 * r14
            float r23 = r4 + r23
            float r10 = org.fortheloss.framework.CustomMathUtils.sin(r10)
            goto L1ef
        L1e2:
            float r9 = -r2
            float r9 = r9 * r14
            float r22 = r4 + r9
            float r9 = r14 * r1
            float r9 = r9 + r6
            float r10 = r14 * r2
            float r23 = r4 + r10
            float r10 = -r1
        L1ef:
            float r10 = r10 * r14
            float r10 = r10 + r6
            r2 = r22
            r1 = r23
            if (r15 == 0) goto L1fd
            int r11 = getSegmentsForSegmentArc(r11)
            goto L1fe
        L1fd:
            r11 = 0
        L1fe:
            if (r18 == 0) goto L205
            int r14 = getSegmentsForSegmentArc(r14)
            goto L206
        L205:
            r14 = 0
        L206:
            if (r18 == 0) goto L217
            r38 = r6
            float r6 = r20 / r16
            int r6 = (int) r6
            int r6 = r6 * 10
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 + 5
            int r14 = r14 + r6
            goto L219
        L217:
            r38 = r6
        L219:
            if (r46 == 0) goto L402
            int r16 = r11 + r14
            int r16 = r16 + 4
            int r16 = r16 * 3
            int r6 = r16 + 6
            r0.quickCheck(r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r40 = r14
            r14 = 0
            r6.vertex(r7, r12, r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.vertex(r5, r3, r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.vertex(r2, r9, r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.vertex(r1, r10, r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.vertex(r2, r9, r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.vertex(r5, r3, r14)
            if (r15 == 0) goto L339
            float r6 = r7 - r5
            r14 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r14
            float r6 = r6 + r5
            float r15 = r12 - r3
            float r15 = r15 * r14
            float r15 = r15 + r3
            float r14 = r7 - r37
            float r16 = r12 - r36
            r17 = 1073741824(0x40000000, float:2.0)
            float r22 = r20 * r17
            r17 = 1127481344(0x43340000, float:180.0)
            float r22 = r17 - r22
            r23 = r8
            float r8 = (float) r11
            float r22 = r22 / r8
            float r8 = org.fortheloss.framework.CustomMathUtils.cosDeg(r22)
            float r17 = org.fortheloss.framework.CustomMathUtils.sinDeg(r22)
            r41 = r4
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r22 = r9
            r9 = 0
            r4.vertex(r6, r15, r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.vertex(r7, r12, r9)
            float r4 = r8 * r14
            r9 = r19
            float r17 = r17 * r9
            float r7 = r17 * r16
            float r4 = r4 - r7
            float r14 = r14 * r17
            float r16 = r16 * r8
            float r14 = r14 + r16
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            float r12 = r37 + r4
            r43 = r4
            float r4 = r36 + r14
            r44 = r14
            r14 = 0
            r7.vertex(r12, r4, r14)
            r4 = 1
            int r11 = r11 - r4
            r4 = r43
            r7 = r44
            r12 = 1
        L2ce:
            if (r12 >= r11) goto L312
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r0.renderer
            r14.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r0.renderer
            r43 = r11
            r11 = 0
            r14.vertex(r6, r15, r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r0.renderer
            r14.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r0.renderer
            r46 = r9
            float r9 = r37 + r4
            r16 = r10
            float r10 = r36 + r7
            r14.vertex(r9, r10, r11)
            float r9 = r8 * r4
            float r10 = r17 * r7
            float r9 = r9 - r10
            float r4 = r4 * r17
            float r7 = r7 * r8
            float r7 = r7 + r4
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            float r10 = r37 + r9
            float r11 = r36 + r7
            r14 = 0
            r4.vertex(r10, r11, r14)
            int r12 = r12 + 1
            r11 = r43
            r4 = r9
            r10 = r16
            r9 = r46
            goto L2ce
        L312:
            r46 = r9
            r16 = r10
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r8.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r0.renderer
            r8.vertex(r6, r15, r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            r6.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r0.renderer
            float r4 = r37 + r4
            float r7 = r36 + r7
            r6.vertex(r4, r7, r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r0.renderer
            r4.vertex(r5, r3, r14)
            goto L343
        L339:
            r41 = r4
            r23 = r8
            r22 = r9
            r16 = r10
            r46 = r19
        L343:
            if (r18 == 0) goto L730
            float r3 = r2 - r1
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            float r3 = r3 + r1
            float r9 = r22 - r16
            float r9 = r9 * r4
            float r10 = r16 + r9
            float r4 = r2 - r41
            float r9 = r22 - r38
            r5 = 1073741824(0x40000000, float:2.0)
            float r20 = r20 * r5
            r5 = 1127481344(0x43340000, float:180.0)
            float r20 = r20 + r5
            r14 = r40
            float r5 = (float) r14
            float r20 = r20 / r5
            float r5 = org.fortheloss.framework.CustomMathUtils.cosDeg(r20)
            float r6 = org.fortheloss.framework.CustomMathUtils.sinDeg(r20)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r8 = r23
            r7.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r11 = 0
            r7.vertex(r3, r10, r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r12 = r22
            r7.vertex(r2, r12, r11)
            float r2 = r5 * r4
            r7 = r46
            float r7 = -r7
            float r6 = r6 * r7
            float r7 = r6 * r9
            float r2 = r2 - r7
            float r4 = r4 * r6
            float r9 = r9 * r5
            float r4 = r4 + r9
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            float r9 = r41 + r2
            float r11 = r38 + r4
            r12 = 0
            r7.vertex(r9, r11, r12)
            r7 = 1
            int r14 = r14 - r7
            r13 = 1
        L3a5:
            if (r13 >= r14) goto L3dc
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.vertex(r3, r10, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            float r9 = r41 + r2
            float r11 = r38 + r4
            r7.vertex(r9, r11, r12)
            float r7 = r5 * r2
            float r9 = r6 * r4
            float r7 = r7 - r9
            float r2 = r2 * r6
            float r4 = r4 * r5
            float r4 = r4 + r2
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r2.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            float r9 = r41 + r7
            float r11 = r38 + r4
            r12 = 0
            r2.vertex(r9, r11, r12)
            int r13 = r13 + 1
            r2 = r7
            goto L3a5
        L3dc:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r0.renderer
            r5.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r0.renderer
            r5.vertex(r3, r10, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            float r2 = r41 + r2
            float r6 = r38 + r4
            r3.vertex(r2, r6, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r2.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r10 = r16
            r2.vertex(r1, r10, r12)
            goto L730
        L402:
            r41 = r4
            r4 = r19
            float r6 = r5 - r7
            float r16 = r3 - r12
            float r19 = r1 - r2
            float r22 = r10 - r9
            float r6 = r6 * r6
            float r16 = r16 * r16
            float r6 = r6 + r16
            r23 = r8
            r40 = r9
            double r8 = (double) r6
            double r8 = java.lang.Math.sqrt(r8)
            float r6 = (float) r8
            float r19 = r19 * r19
            float r22 = r22 * r22
            float r8 = r19 + r22
            double r8 = (double) r8
            double r8 = java.lang.Math.sqrt(r8)
            float r8 = (float) r8
            int r9 = getSegmentsForTrapezoidWidth(r8)
            int r16 = r9 + 2
            int r16 = r16 * 6
            int r19 = r11 + r14
            int r19 = r19 + 4
            int r19 = r19 * 3
            r22 = r14
            int r14 = r16 + r19
            r0.quickCheck(r14)
            float r14 = r7 - r5
            r16 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 * r16
            float r14 = r14 + r5
            float r19 = r12 - r3
            float r19 = r19 * r16
            r43 = r5
            float r5 = r3 + r19
            float r19 = r2 - r1
            float r19 = r19 * r16
            r47 = r2
            float r2 = r1 + r19
            float r19 = r40 - r10
            float r19 = r19 * r16
            r16 = r1
            float r1 = r10 + r19
            float r19 = r2 - r14
            float r25 = r1 - r5
            float r19 = r19 * r19
            float r25 = r25 * r25
            r46 = r1
            float r1 = r19 + r25
            r48 = r2
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r2 = (float) r9
            float r1 = r1 / r2
            r34 = r16
            r16 = r3
            r3 = r34
            float r19 = r44 * r1
            r34 = r11
            r11 = r47
            r47 = r34
            float r1 = r1 * r45
            r26 = r3
            r17 = r7
            r50 = r11
            r25 = r12
            r49 = r15
            r3 = r16
            r11 = r43
            r15 = r25
            r12 = 0
        L495:
            if (r12 >= r9) goto L51e
            r27 = r9
            float r9 = (float) r12
            r28 = r10
            float r10 = r9 / r2
            float r10 = com.badlogic.gdx.math.MathUtils.lerp(r6, r8, r10)
            r21 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r21
            float r29 = r19 * r9
            float r29 = r29 * r4
            float r29 = r14 + r29
            float r9 = r9 * r1
            float r9 = r9 * r4
            float r9 = r9 + r5
            float r30 = r45 * r10
            r31 = r1
            float r1 = r29 - r30
            float r10 = r10 * r44
            r32 = r2
            float r2 = r9 + r10
            r33 = r6
            float r6 = r29 + r30
            float r9 = r9 - r10
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r0.renderer
            r10.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r0.renderer
            r29 = r8
            r8 = 0
            r10.vertex(r7, r15, r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r0.renderer
            r8 = r23
            r10.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r0.renderer
            r23 = r4
            r4 = 0
            r10.vertex(r11, r3, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.vertex(r6, r9, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.vertex(r7, r15, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.vertex(r6, r9, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.vertex(r1, r2, r4)
            int r12 = r12 + 1
            r7 = r1
            r15 = r2
            r11 = r6
            r3 = r9
            r4 = r23
            r9 = r27
            r10 = r28
            r1 = r31
            r2 = r32
            r6 = r33
            r23 = r8
            r8 = r29
            goto L495
        L51e:
            r28 = r10
            r8 = r23
            r23 = r4
            r4 = 0
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r7, r15, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r11, r3, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r2 = r26
            r1.vertex(r2, r10, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r7, r15, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r2, r10, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r9 = r40
            r3 = r50
            r1.vertex(r3, r9, r4)
            com.badlogic.gdx.graphics.Color r1 = r0.tempColor
            com.badlogic.gdx.graphics.Color r4 = r0.setColor1
            com.badlogic.gdx.graphics.Color r1 = r1.set(r4)
            com.badlogic.gdx.graphics.Color r4 = r0.setColor2
            r6 = 1056964608(0x3f000000, float:0.5)
            com.badlogic.gdx.graphics.Color r1 = r1.lerp(r4, r6)
            float r1 = r1.toFloatBits()
            if (r49 == 0) goto L656
            float r7 = r17 - r37
            float r12 = r25 - r36
            r4 = 1073741824(0x40000000, float:2.0)
            float r6 = r20 * r4
            r4 = 1127481344(0x43340000, float:180.0)
            float r6 = r4 - r6
            r11 = r47
            float r4 = (float) r11
            float r6 = r6 / r4
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r6)
            float r6 = org.fortheloss.framework.CustomMathUtils.sinDeg(r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r15 = r0.renderer
            r15.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r15 = r0.renderer
            r26 = r2
            r2 = 0
            r15.vertex(r14, r5, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r15 = r0.renderer
            r15.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r15 = r0.renderer
            r40 = r9
            r28 = r10
            r10 = r17
            r9 = r25
            r15.vertex(r10, r9, r2)
            float r2 = r4 * r7
            float r6 = r6 * r23
            float r9 = r6 * r12
            float r2 = r2 - r9
            float r7 = r7 * r6
            float r12 = r12 * r4
            float r7 = r7 + r12
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            r9.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r10 = r37 + r2
            float r12 = r36 + r7
            r15 = 0
            r9.vertex(r10, r12, r15)
            r9 = 1
            int r11 = r11 - r9
            r9 = r7
            r10 = r13
            r7 = 1
        L5d4:
            if (r7 >= r11) goto L62a
            com.badlogic.gdx.graphics.Color r12 = r0.tempColor
            com.badlogic.gdx.graphics.Color r15 = r0.setColor1
            com.badlogic.gdx.graphics.Color r12 = r12.set(r15)
            com.badlogic.gdx.graphics.Color r15 = r0.setColor2
            r17 = r13
            float r13 = (float) r7
            r47 = r3
            float r3 = (float) r11
            float r13 = r13 / r3
            com.badlogic.gdx.graphics.Color r3 = r12.lerp(r15, r13)
            float r3 = r3.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r12.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r13 = 0
            r12.vertex(r14, r5, r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r12.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r0.renderer
            float r12 = r37 + r2
            float r15 = r36 + r9
            r10.vertex(r12, r15, r13)
            float r10 = r4 * r2
            float r12 = r6 * r9
            float r10 = r10 - r12
            float r2 = r2 * r6
            float r9 = r9 * r4
            float r9 = r9 + r2
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r2.color(r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            float r12 = r37 + r10
            float r13 = r36 + r9
            r15 = 0
            r2.vertex(r12, r13, r15)
            int r7 = r7 + 1
            r2 = r10
            r13 = r17
            r10 = r3
            r3 = r47
            goto L5d4
        L62a:
            r47 = r3
            r17 = r13
            r15 = 0
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.vertex(r14, r5, r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            float r2 = r37 + r2
            float r5 = r36 + r9
            r3.vertex(r2, r5, r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r2.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r3 = r43
            r12 = r16
            r2.vertex(r3, r12, r15)
            goto L660
        L656:
            r26 = r2
            r47 = r3
            r40 = r9
            r28 = r10
            r17 = r13
        L660:
            if (r18 == 0) goto L730
            float r2 = r47 - r41
            float r9 = r40 - r38
            r3 = 1073741824(0x40000000, float:2.0)
            float r20 = r20 * r3
            r3 = 1127481344(0x43340000, float:180.0)
            float r20 = r20 + r3
            r14 = r22
            float r3 = (float) r14
            float r20 = r20 / r3
            float r3 = org.fortheloss.framework.CustomMathUtils.cosDeg(r20)
            float r4 = org.fortheloss.framework.CustomMathUtils.sinDeg(r20)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r0.renderer
            r5.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r0.renderer
            r10 = r46
            r6 = r48
            r7 = 0
            r5.vertex(r6, r10, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r0.renderer
            r11 = r17
            r5.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r0.renderer
            r13 = r40
            r12 = r47
            r5.vertex(r12, r13, r7)
            float r5 = r3 * r2
            r7 = r23
            float r7 = -r7
            float r4 = r4 * r7
            float r7 = r4 * r9
            float r5 = r5 - r7
            float r2 = r2 * r4
            float r9 = r9 * r3
            float r2 = r2 + r9
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            r7.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            float r9 = r41 + r5
            float r12 = r38 + r2
            r13 = 0
            r7.vertex(r9, r12, r13)
            r7 = 1
            int r14 = r14 - r7
            r13 = 1
        L6bb:
            if (r13 >= r14) goto L709
            com.badlogic.gdx.graphics.Color r7 = r0.tempColor
            com.badlogic.gdx.graphics.Color r9 = r0.setColor1
            com.badlogic.gdx.graphics.Color r7 = r7.set(r9)
            com.badlogic.gdx.graphics.Color r9 = r0.setColor2
            float r12 = (float) r13
            float r15 = (float) r14
            float r12 = r12 / r15
            com.badlogic.gdx.graphics.Color r7 = r7.lerp(r9, r12)
            float r7 = r7.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            r9.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            r12 = 0
            r9.vertex(r6, r10, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            r9.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r11 = r41 + r5
            float r15 = r38 + r2
            r9.vertex(r11, r15, r12)
            float r9 = r3 * r5
            float r11 = r4 * r2
            float r9 = r9 - r11
            float r5 = r5 * r4
            float r2 = r2 * r3
            float r2 = r2 + r5
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r0.renderer
            r5.color(r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r0.renderer
            float r11 = r41 + r9
            float r12 = r38 + r2
            r15 = 0
            r5.vertex(r11, r12, r15)
            int r13 = r13 + 1
            r11 = r7
            r5 = r9
            goto L6bb
        L709:
            r15 = 0
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r6, r10, r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r4 = r41 + r5
            float r6 = r38 + r2
            r1.vertex(r4, r6, r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r2 = r26
            r10 = r28
            r1.vertex(r2, r10, r15)
        L730:
            return
    }

    public void mySegment(float r3, float r4, float r5, float r6, float r7, float r8, float r9, boolean r10, com.badlogic.gdx.graphics.Color r11, com.badlogic.gdx.graphics.Color r12) {
            r2 = this;
            r0 = 6
            r2.quickCheck(r0)
            com.badlogic.gdx.graphics.Color r0 = r2.setColor1
            r0.set(r11)
            com.badlogic.gdx.graphics.Color r11 = r2.setColor1
            float r0 = r11.a
            com.badlogic.gdx.graphics.Color r1 = r2.getColor()
            float r1 = r1.a
            float r0 = r0 * r1
            r11.a = r0
            com.badlogic.gdx.graphics.Color r11 = r2.setColor2
            r11.set(r12)
            com.badlogic.gdx.graphics.Color r11 = r2.setColor2
            float r12 = r11.a
            com.badlogic.gdx.graphics.Color r0 = r2.getColor()
            float r0 = r0.a
            float r12 = r12 * r0
            r11.a = r12
            com.badlogic.gdx.graphics.Color r11 = r2.setColor1
            float r11 = r11.toFloatBits()
            com.badlogic.gdx.graphics.Color r12 = r2.setColor2
            float r12 = r12.toFloatBits()
            r0 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r0
            float r9 = r9 * r7
            float r8 = r8 * r7
            r7 = 0
            if (r10 == 0) goto L8a
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            float r0 = r3 + r9
            float r1 = r4 - r8
            r10.vertex(r0, r1, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            float r3 = r3 - r9
            float r4 = r4 + r8
            r10.vertex(r3, r4, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            float r0 = r5 + r9
            float r1 = r6 - r8
            r10.vertex(r0, r1, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.vertex(r0, r1, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            float r5 = r5 - r9
            float r6 = r6 + r8
            r10.vertex(r5, r6, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r2.renderer
            r5.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r2.renderer
            r5.vertex(r3, r4, r7)
            goto Ld2
        L8a:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            float r0 = r3 + r9
            float r1 = r4 - r8
            r10.vertex(r0, r1, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            float r3 = r3 - r9
            float r4 = r4 + r8
            r10.vertex(r3, r4, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            float r0 = r5 + r9
            float r1 = r6 - r8
            r10.vertex(r0, r1, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.vertex(r0, r1, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            float r5 = r5 - r9
            float r6 = r6 + r8
            r10.vertex(r5, r6, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r2.renderer
            r5.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r2.renderer
            r5.vertex(r3, r4, r7)
        Ld2:
            return
    }

    public void mySegmentCurved(boolean r39, boolean r40, float r41, float r42, float r43, float r44, float r45, float r46, float r47, float r48, int r49, boolean r50, com.badlogic.gdx.graphics.Color r51, com.badlogic.gdx.graphics.Color r52) {
            r38 = this;
            r0 = r38
            r1 = r47
            r2 = r48
            int r3 = r49 % 2
            r4 = 1
            if (r3 != r4) goto Le
            int r3 = r49 + 1
            goto L10
        Le:
            r3 = r49
        L10:
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r39 == 0) goto L1b
            float r7 = r44 * r6
            int r7 = getSegmentsForSegmentArc(r7)
            goto L1c
        L1b:
            r7 = 0
        L1c:
            int r8 = r3 + 2
            int r8 = r8 * 6
            int r9 = r7 + 2
            int r9 = r9 * 6
            int r8 = r8 + r9
            r0.quickCheck(r8)
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r43 * r8
            int r9 = java.lang.Math.round(r9)
            float r9 = (float) r9
            float r9 = r9 / r8
            if (r40 != 0) goto L4e
            float r8 = r9 / r44
            r10 = 1045220557(0x3e4ccccd, float:0.2)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L4e
            float r8 = r44 * r10
            float r9 = r8 - r9
            float r10 = r1 * r9
            float r10 = r10 * r6
            float r10 = r41 - r10
            float r9 = r9 * r2
            float r9 = r9 * r6
            float r9 = r42 - r9
            goto L53
        L4e:
            r10 = r41
            r8 = r9
            r9 = r42
        L53:
            r11 = 1127481344(0x43340000, float:180.0)
            r12 = 0
            int r13 = (r45 > r12 ? 1 : (r45 == r12 ? 0 : -1))
            if (r13 >= 0) goto L6f
            float r13 = java.lang.Math.abs(r45)
            float r14 = r1 * r8
            float r10 = r10 + r14
            float r14 = r2 * r8
            float r9 = r9 + r14
            float r1 = -r1
            float r2 = -r2
            float r14 = r46 - r11
            r15 = r9
            r4 = r10
            r10 = r51
            r9 = r52
            goto L79
        L6f:
            r13 = r45
            r14 = r46
            r15 = r9
            r4 = r10
            r9 = r51
            r10 = r52
        L79:
            if (r50 == 0) goto L7e
            org.fortheloss.sticknodes.SNShapeRenderer$ColorInterpolator r5 = r0.mColInterX
            goto L80
        L7e:
            org.fortheloss.sticknodes.SNShapeRenderer$ColorInterpolator r5 = r0.mColInterY
        L80:
            if (r50 == 0) goto L85
            com.badlogic.gdx.math.Interpolation r17 = com.badlogic.gdx.math.Interpolation.sineOut
            goto L87
        L85:
            com.badlogic.gdx.math.Interpolation r17 = com.badlogic.gdx.math.Interpolation.sineIn
        L87:
            r18 = r17
            if (r50 == 0) goto L8f
            r5.setColors(r10, r9)
            goto L92
        L8f:
            r5.setColors(r9, r10)
        L92:
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r5.getBits(r6, r9, r12)
            float r17 = r5.getBits(r6, r9, r9)
            float r19 = r5.getBits(r6, r9, r12)
            float r20 = r5.getBits(r6, r9, r9)
            float r11 = r44 * r6
            float r9 = r8 * r6
            float r21 = r1 * r9
            float r6 = r4 + r21
            r45 = r13
            double r12 = (double) r6
            float r6 = r2 * r9
            float r6 = r6 + r15
            r21 = r7
            double r6 = (double) r6
            r22 = 1119092736(0x42b40000, float:90.0)
            r23 = 1073741824(0x40000000, float:2.0)
            if (r40 != 0) goto L3ec
            int r24 = (r45 > r9 ? 1 : (r45 == r9 ? 0 : -1))
            if (r24 >= 0) goto Lc1
            goto L3ec
        Lc1:
            r46 = r10
            float r10 = (float) r3
            float r10 = r8 / r10
            float r16 = r14 - r22
            float r14 = r14 + r22
            float r18 = org.fortheloss.framework.CustomMathUtils.cosDeg(r14)
            float r14 = org.fortheloss.framework.CustomMathUtils.sinDeg(r14)
            float r22 = r45 + r11
            float r0 = r18 * r22
            r47 = r1
            double r0 = (double) r0
            double r0 = r0 + r12
            float r0 = (float) r0
            float r1 = r14 * r22
            r22 = r0
            double r0 = (double) r1
            double r0 = r0 + r6
            float r0 = (float) r0
            float r1 = r45 - r11
            r24 = r0
            float r0 = r18 * r1
            r48 = r4
            r51 = r5
            double r4 = (double) r0
            double r12 = r12 + r4
            float r0 = (float) r12
            float r14 = r14 * r1
            double r4 = (double) r14
            double r6 = r6 + r4
            float r1 = (float) r6
            int r3 = r3 / 2
            int r4 = r3 + (-1)
            r13 = r46
            r5 = r0
            r40 = r1
            r6 = r40
            r12 = r4
            r14 = r17
            r1 = r24
            r7 = 0
            r4 = r5
            r0 = r22
        L108:
            if (r12 < 0) goto L267
            r44 = r5
            com.badlogic.gdx.math.Interpolation r5 = com.badlogic.gdx.math.Interpolation.sine
            r46 = r7
            float r7 = (float) r3
            r50 = r3
            float r3 = (float) r12
            float r3 = r3 / r7
            r52 = r12
            r12 = 0
            float r3 = r5.apply(r12, r7, r3)
            float r3 = r3 * r10
            float r3 = r3 - r9
            float r5 = r3 / r9
            float r5 = r5 * r5
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = r7 - r5
            r7 = r4
            double r4 = (double) r5
            double r4 = java.lang.Math.sqrt(r4)
            float r4 = (float) r4
            float r4 = r4 * r45
            float r5 = r45 * r45
            float r5 = r5 * r3
            float r12 = r9 * r9
            float r12 = r12 * r4
            float r5 = r5 / r12
            float r5 = com.badlogic.gdx.math.MathUtils.atan(r5)
            r12 = -1033556256(0xffffffffc2652ee0, float:-57.295776)
            float r5 = r5 * r12
            float r12 = r5 + r16
            float r17 = org.fortheloss.framework.CustomMathUtils.cosDeg(r12)
            float r17 = r17 * r11
            float r12 = org.fortheloss.framework.CustomMathUtils.sinDeg(r12)
            float r12 = r12 * r11
            float r3 = r3 + r9
            r18 = r10
            r25 = r11
            r10 = r51
            r51 = r7
            r7 = 0
            float r11 = r10.getBits(r3, r8, r7)
            r26 = r5
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = r10.getBits(r3, r8, r7)
            float r27 = r9 - r3
            float r27 = java.lang.Math.abs(r27)
            r28 = r5
            float r5 = r9 + r27
            r27 = r9
            r9 = 0
            float r29 = r10.getBits(r5, r8, r9)
            float r5 = r10.getBits(r5, r8, r7)
            float r7 = r3 * r47
            float r7 = r48 + r7
            float r9 = r4 * r2
            float r7 = r7 - r9
            float r30 = r3 * r2
            float r30 = r15 + r30
            float r4 = r4 * r47
            float r30 = r30 + r4
            r32 = r5
            r31 = r10
            r10 = r38
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r10.renderer
            r5.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r10.renderer
            r13 = 0
            r5.vertex(r0, r1, r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r10.renderer
            r0.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r10.renderer
            r5 = r51
            r0.vertex(r5, r6, r13)
            float r0 = r7 - r17
            float r1 = r30 - r12
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r13 = r10.renderer
            r13.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r13 = r10.renderer
            r51 = r4
            r4 = 0
            r13.vertex(r0, r1, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r13 = r10.renderer
            r13.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r13 = r10.renderer
            r13.vertex(r5, r6, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r10.renderer
            r5.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r10.renderer
            r5.vertex(r0, r1, r4)
            float r5 = r7 + r17
            float r6 = r30 + r12
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r10.renderer
            r12 = r28
            r7.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r10.renderer
            r7.vertex(r5, r6, r4)
            r4 = 1127481344(0x43340000, float:180.0)
            float r7 = r4 - r26
            float r7 = r7 + r16
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r7)
            float r4 = r4 * r25
            float r7 = org.fortheloss.framework.CustomMathUtils.sinDeg(r7)
            float r7 = r7 * r25
            float r3 = r8 - r3
            float r13 = r3 * r47
            float r13 = r48 + r13
            float r13 = r13 - r9
            float r3 = r3 * r2
            float r3 = r3 + r15
            float r3 = r3 + r51
            float[] r9 = r10.mirroredCurveVerts
            int r14 = r46 + 1
            r9[r46] = r19
            int r17 = r14 + 1
            r9[r14] = r22
            int r14 = r17 + 1
            r9[r17] = r24
            int r17 = r14 + 1
            r9[r14] = r20
            int r14 = r17 + 1
            r9[r17] = r44
            int r17 = r14 + 1
            r9[r14] = r40
            float r22 = r13 + r4
            float r24 = r3 + r7
            int r14 = r17 + 1
            r9[r17] = r29
            int r17 = r14 + 1
            r9[r14] = r22
            int r14 = r17 + 1
            r9[r17] = r24
            int r17 = r14 + 1
            r9[r14] = r20
            int r14 = r17 + 1
            r9[r17] = r44
            int r17 = r14 + 1
            r9[r14] = r40
            int r14 = r17 + 1
            r9[r17] = r29
            int r17 = r14 + 1
            r9[r14] = r22
            int r14 = r17 + 1
            r9[r17] = r24
            float r4 = r13 - r4
            float r3 = r3 - r7
            int r7 = r14 + 1
            r9[r14] = r32
            int r13 = r7 + 1
            r9[r7] = r4
            int r7 = r13 + 1
            r9[r13] = r3
            int r9 = r52 + (-1)
            r40 = r3
            r13 = r11
            r14 = r12
            r10 = r18
            r11 = r25
            r19 = r29
            r51 = r31
            r20 = r32
            r3 = r50
            r12 = r9
            r9 = r27
            r37 = r5
            r5 = r4
            r4 = r37
            goto L108
        L267:
            r10 = r38
            r31 = r51
            r44 = r5
            r5 = r4
            r2 = 0
        L26f:
            if (r2 >= r7) goto L28d
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            float[] r4 = r10.mirroredCurveVerts
            r4 = r4[r2]
            r3.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            float[] r4 = r10.mirroredCurveVerts
            int r8 = r2 + 1
            r8 = r4[r8]
            int r9 = r2 + 2
            r4 = r4[r9]
            r9 = 0
            r3.vertex(r8, r4, r9)
            int r2 = r2 + 3
            goto L26f
        L28d:
            if (r39 == 0) goto L77b
            r4 = r21
            float r2 = (float) r4
            r3 = 1127481344(0x43340000, float:180.0)
            float r11 = r3 / r2
            float r2 = org.fortheloss.framework.CustomMathUtils.cosDeg(r11)
            float r3 = org.fortheloss.framework.CustomMathUtils.sinDeg(r11)
            float r7 = r44 - r22
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r8
            float r22 = r22 + r7
            float r7 = r40 - r24
            float r7 = r7 * r8
            float r24 = r24 + r7
            float r0 = r0 - r48
            float r1 = r1 - r15
            float r5 = r5 - r48
            float r6 = r6 - r15
            int r7 = r4 / 2
            r4 = 0
            r8 = 0
        L2b6:
            if (r4 >= r7) goto L3cd
            float r9 = (float) r4
            float r11 = (float) r7
            float r11 = r11 * r23
            float r9 = r9 / r11
            r16 = r4
            r39 = r7
            r11 = r31
            r7 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            float r4 = r11.getBits(r7, r12, r9)
            float r17 = r12 - r9
            r40 = r8
            float r8 = java.lang.Math.abs(r17)
            float r8 = r11.getBits(r7, r12, r8)
            float r9 = r11.getBits(r12, r12, r9)
            float r7 = java.lang.Math.abs(r17)
            float r7 = r11.getBits(r12, r12, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r10.renderer
            r12.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r10.renderer
            float r13 = r48 + r0
            r51 = r11
            float r11 = r15 + r1
            r41 = r9
            r9 = 0
            r12.vertex(r13, r11, r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r10.renderer
            r11.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r10.renderer
            float r12 = r48 + r5
            float r13 = r15 + r6
            r11.vertex(r12, r13, r9)
            float r9 = r2 * r0
            float r11 = r3 * r1
            float r9 = r9 - r11
            float r11 = r3 * r0
            float r17 = r2 * r1
            float r11 = r11 + r17
            r44 = r8
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r10.renderer
            r8.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r10.renderer
            r45 = r3
            float r3 = r48 + r9
            r46 = r2
            float r2 = r15 + r11
            r52 = r15
            r15 = 0
            r8.vertex(r3, r2, r15)
            float[] r8 = r10.mirroredCurveVerts
            int r15 = r40 + 1
            r8[r40] = r20
            int r17 = r15 + 1
            float r0 = r22 + r0
            r8[r15] = r0
            int r0 = r17 + 1
            float r1 = r24 + r1
            r8[r17] = r1
            int r1 = r0 + 1
            r8[r0] = r19
            int r0 = r1 + 1
            float r15 = r22 + r5
            r8[r1] = r15
            int r1 = r0 + 1
            float r17 = r24 + r6
            r8[r0] = r17
            int r0 = r1 + 1
            r8[r1] = r7
            int r1 = r0 + 1
            float r18 = r22 + r9
            r8[r0] = r18
            int r0 = r1 + 1
            float r20 = r24 + r11
            r8[r1] = r20
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            r1.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            r8 = 0
            r1.vertex(r3, r2, r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            r1.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            r1.vertex(r12, r13, r8)
            float r2 = r46 * r5
            float r3 = r45 * r6
            float r1 = r2 + r3
            r2 = r45
            float r3 = -r2
            float r3 = r3 * r5
            float r5 = r46 * r6
            float r6 = r3 + r5
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            r5 = r44
            r3.color(r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            float r8 = r48 + r1
            float r12 = r52 + r6
            r13 = 0
            r3.vertex(r8, r12, r13)
            float[] r3 = r10.mirroredCurveVerts
            int r8 = r0 + 1
            r3[r0] = r7
            int r0 = r8 + 1
            r3[r8] = r18
            int r8 = r0 + 1
            r3[r0] = r20
            int r0 = r8 + 1
            r3[r8] = r19
            int r8 = r0 + 1
            r3[r0] = r15
            int r0 = r8 + 1
            r3[r8] = r17
            int r8 = r0 + 1
            r3[r0] = r41
            int r0 = r8 + 1
            float r12 = r22 + r1
            r3[r8] = r12
            int r8 = r0 + 1
            float r12 = r24 + r6
            r3[r0] = r12
            int r0 = r16 + 1
            r19 = r41
            r31 = r51
            r15 = r52
            r3 = r2
            r13 = r4
            r14 = r5
            r20 = r7
            r7 = r39
            r2 = r46
            r4 = r0
            r5 = r1
            r0 = r9
            r1 = r11
            goto L2b6
        L3cd:
            r5 = 0
        L3ce:
            if (r5 >= r8) goto L77b
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r10.renderer
            float[] r1 = r10.mirroredCurveVerts
            r1 = r1[r5]
            r0.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r10.renderer
            float[] r1 = r10.mirroredCurveVerts
            int r2 = r5 + 1
            r2 = r1[r2]
            int r3 = r5 + 2
            r1 = r1[r3]
            r9 = 0
            r0.vertex(r2, r1, r9)
            int r5 = r5 + 3
            goto L3ce
        L3ec:
            r47 = r1
            r48 = r4
            r51 = r5
            r27 = r9
            r46 = r10
            r25 = r11
            r52 = r15
            r4 = r21
            r9 = 0
            r10 = r0
            int r0 = (r27 > r9 ? 1 : (r27 == r9 ? 0 : -1))
            if (r0 != 0) goto L40f
            r8 = 4640537203540230144(0x4066800000000000, double:180.0)
            r1 = r45
            r21 = r4
            r4 = r8
            r8 = r27
            goto L421
        L40f:
            r1 = r45
            r8 = r27
            float r5 = com.badlogic.gdx.math.MathUtils.atan2(r1, r8)
            float r5 = r5 * r23
            r9 = 1113927392(0x42652ee0, float:57.295776)
            float r5 = r5 * r9
            r21 = r4
            double r4 = (double) r5
        L421:
            if (r0 != 0) goto L42c
            float r0 = -r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r9
            double r9 = (double) r0
            r45 = r1
            goto L442
        L42c:
            r9 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r9 = r9 - r4
            r26 = 4580687790437564416(0x3f91df46a0000000, double:0.01745329238474369)
            double r9 = r9 * r26
            double r9 = java.lang.Math.tan(r9)
            r45 = r1
            double r0 = (double) r8
            double r9 = r9 * r0
        L442:
            double r0 = (double) r2
            double r0 = r0 * r9
            double r12 = r12 + r0
            r1 = r47
            double r0 = (double) r1
            double r0 = r0 * r9
            double r6 = r6 - r0
            r10 = r48
            double r0 = (double) r10
            double r0 = r12 - r0
            r9 = r52
            double r10 = (double) r9
            double r10 = r6 - r10
            double r0 = r0 * r0
            double r10 = r10 * r10
            double r0 = r0 + r10
            double r0 = java.lang.Math.sqrt(r0)
            float r14 = r14 + r22
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 * r10
            float r2 = (float) r4
            float r4 = (float) r3
            float r2 = r2 / r4
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r14)
            float r5 = org.fortheloss.framework.CustomMathUtils.sinDeg(r14)
            r27 = r8
            r10 = r25
            double r8 = (double) r10
            double r10 = r0 - r8
            float r10 = (float) r10
            double r8 = r8 + r0
            float r8 = (float) r8
            float r9 = r4 * r8
            r28 = r0
            double r0 = (double) r9
            double r0 = r0 + r12
            float r0 = (float) r0
            float r8 = r8 * r5
            double r8 = (double) r8
            double r8 = r8 + r6
            float r1 = (float) r8
            float r4 = r4 * r10
            double r8 = (double) r4
            double r8 = r8 + r12
            float r4 = (float) r8
            float r5 = r5 * r10
            double r8 = (double) r5
            double r8 = r8 + r6
            float r5 = (float) r8
            int r3 = r3 / 2
            r15 = r46
            r47 = r1
            r46 = r4
            r9 = r46
            r44 = r5
            r11 = r44
            r10 = r17
            r5 = 0
            r8 = 1
            r4 = r47
            r1 = r0
        L4a5:
            if (r8 > r3) goto L5eb
            r50 = r1
            float r1 = (float) r3
            r16 = r5
            float r5 = (float) r8
            r17 = r8
            float r8 = r5 / r1
            r22 = r9
            r9 = r18
            r18 = r11
            r11 = 0
            float r8 = r9.apply(r11, r1, r8)
            float r11 = r2 * r5
            float r24 = r14 + r11
            r26 = r2
            float r2 = org.fortheloss.framework.CustomMathUtils.cosDeg(r24)
            r30 = r9
            float r9 = org.fortheloss.framework.CustomMathUtils.sinDeg(r24)
            float r24 = r2 * r25
            float r31 = r9 * r25
            r32 = r10
            r33 = r11
            double r10 = (double) r2
            double r10 = r10 * r28
            double r10 = r10 + r12
            float r2 = (float) r10
            double r9 = (double) r9
            double r9 = r9 * r28
            double r9 = r9 + r6
            float r9 = (float) r9
            if (r40 != 0) goto L4ed
            float r10 = r45 / r27
            r11 = 1065353216(0x3f800000, float:1.0)
            float r10 = java.lang.Math.max(r10, r11)
            float r8 = com.badlogic.gdx.math.MathUtils.lerp(r5, r8, r10)
            goto L4ef
        L4ed:
            r11 = 1065353216(0x3f800000, float:1.0)
        L4ef:
            float r5 = r1 - r8
            float r5 = java.lang.Math.abs(r5)
            int r10 = r3 * 2
            float r10 = (float) r10
            r34 = r3
            r35 = r6
            r6 = 0
            r3 = r51
            float r7 = r3.getBits(r5, r10, r6)
            float r5 = r3.getBits(r5, r10, r11)
            float r1 = r1 + r8
            float r8 = r3.getBits(r1, r10, r6)
            float r1 = r3.getBits(r1, r10, r11)
            r10 = r38
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r10.renderer
            r11.color(r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r10.renderer
            r11.vertex(r0, r4, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r10.renderer
            r11 = r32
            r0.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r10.renderer
            r15 = r18
            r4 = r22
            r0.vertex(r4, r15, r6)
            float r0 = r2 + r24
            float r6 = r9 + r31
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            r3.color(r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            r18 = r1
            r1 = 0
            r3.vertex(r0, r6, r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            r3.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            r3.vertex(r4, r15, r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            r3.color(r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            r3.vertex(r0, r6, r1)
            float r2 = r2 - r24
            float r11 = r9 - r31
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            r3.color(r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r10.renderer
            r3.vertex(r2, r11, r1)
            float r1 = r14 - r33
            float r3 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r4 = r3 * r25
            float r9 = r1 * r25
            r15 = r2
            double r2 = (double) r3
            double r2 = r2 * r28
            double r2 = r2 + r12
            float r2 = (float) r2
            r3 = r0
            double r0 = (double) r1
            double r0 = r0 * r28
            double r0 = r35 + r0
            float r0 = (float) r0
            float[] r1 = r10.mirroredCurveVerts
            int r22 = r16 + 1
            r1[r16] = r19
            int r16 = r22 + 1
            r1[r22] = r50
            int r19 = r16 + 1
            r1[r16] = r47
            int r16 = r19 + 1
            r1[r19] = r20
            int r19 = r16 + 1
            r1[r16] = r46
            int r16 = r19 + 1
            r1[r19] = r44
            float r19 = r2 + r4
            float r22 = r0 + r9
            int r24 = r16 + 1
            r1[r16] = r8
            int r16 = r24 + 1
            r1[r24] = r19
            int r24 = r16 + 1
            r1[r16] = r22
            int r16 = r24 + 1
            r1[r24] = r20
            int r20 = r16 + 1
            r1[r16] = r46
            int r16 = r20 + 1
            r1[r20] = r44
            int r20 = r16 + 1
            r1[r16] = r8
            int r16 = r20 + 1
            r1[r20] = r19
            int r20 = r16 + 1
            r1[r16] = r22
            float r2 = r2 - r4
            float r0 = r0 - r9
            int r4 = r20 + 1
            r1[r20] = r18
            int r9 = r4 + 1
            r1[r4] = r2
            int r4 = r9 + 1
            r1[r9] = r0
            int r1 = r17 + 1
            r44 = r0
            r46 = r2
            r0 = r3
            r10 = r5
            r9 = r15
            r20 = r18
            r47 = r22
            r2 = r26
            r18 = r30
            r3 = r34
            r5 = r4
            r4 = r6
            r15 = r7
            r6 = r35
            r37 = r8
            r8 = r1
            r1 = r19
            r19 = r37
            goto L4a5
        L5eb:
            r50 = r1
            r16 = r5
            r1 = r9
            r5 = r11
            r11 = r10
            r10 = r38
            r3 = r16
            r2 = 0
        L5f7:
            if (r2 >= r3) goto L615
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r10.renderer
            float[] r7 = r10.mirroredCurveVerts
            r7 = r7[r2]
            r6.color(r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r10.renderer
            float[] r7 = r10.mirroredCurveVerts
            int r8 = r2 + 1
            r8 = r7[r8]
            int r9 = r2 + 2
            r7 = r7[r9]
            r9 = 0
            r6.vertex(r8, r7, r9)
            int r2 = r2 + 3
            goto L5f7
        L615:
            if (r39 == 0) goto L77b
            r7 = r21
            float r2 = (float) r7
            r3 = 1127481344(0x43340000, float:180.0)
            float r2 = r3 / r2
            float r3 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r2 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            float r6 = r46 - r50
            r8 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r8
            float r6 = r50 + r6
            float r9 = r44 - r47
            float r9 = r9 * r8
            float r9 = r47 + r9
            float r0 = r0 - r48
            float r4 = r4 - r52
            float r1 = r1 - r48
            float r5 = r5 - r52
            int r7 = r7 / 2
            r8 = 0
        L63f:
            if (r8 >= r7) goto L6d3
            float r12 = (float) r8
            float r13 = (float) r7
            float r13 = r13 * r23
            float r12 = r12 / r13
            r13 = r51
            r39 = r7
            r40 = r9
            r7 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            float r9 = r13.getBits(r7, r14, r12)
            float r12 = r14 - r12
            float r12 = java.lang.Math.abs(r12)
            float r12 = r13.getBits(r7, r14, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r10.renderer
            r14.color(r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r10.renderer
            float r15 = r48 + r0
            float r13 = r52 + r4
            r14.vertex(r15, r13, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r13 = r10.renderer
            r13.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r13 = r10.renderer
            float r14 = r48 + r1
            float r15 = r52 + r5
            r13.vertex(r14, r15, r7)
            float r7 = r3 * r0
            float r13 = r2 * r4
            float r7 = r7 - r13
            float r0 = r0 * r2
            float r4 = r4 * r3
            float r4 = r4 + r0
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r10.renderer
            r0.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r10.renderer
            float r13 = r48 + r7
            r41 = r7
            float r7 = r52 + r4
            r45 = r4
            r4 = 0
            r0.vertex(r13, r7, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r10.renderer
            r0.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r10.renderer
            r0.vertex(r13, r7, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r10.renderer
            r0.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r10.renderer
            r0.vertex(r14, r15, r4)
            float r0 = r3 * r1
            float r4 = r2 * r5
            float r0 = r0 + r4
            float r4 = -r2
            float r4 = r4 * r1
            float r5 = r5 * r3
            float r5 = r5 + r4
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            r1.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            float r4 = r48 + r0
            float r15 = r52 + r5
            r7 = 0
            r1.vertex(r4, r15, r7)
            int r8 = r8 + 1
            r7 = r39
            r4 = r45
            r1 = r0
            r15 = r9
            r11 = r12
            r9 = r40
            r0 = r41
            goto L63f
        L6d3:
            r39 = r7
            r40 = r9
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r0
            float r1 = r50 - r6
            float r0 = r47 - r40
            float r4 = r46 - r6
            float r5 = r44 - r40
            r11 = r39
            r7 = r5
            r8 = r19
            r9 = r20
            r5 = 0
        L6eb:
            if (r5 >= r11) goto L77b
            float r12 = (float) r5
            float r13 = (float) r11
            float r13 = r13 * r23
            float r12 = r12 / r13
            r13 = r51
            r14 = 1065353216(0x3f800000, float:1.0)
            float r15 = r13.getBits(r14, r14, r12)
            float r12 = r14 - r12
            float r12 = java.lang.Math.abs(r12)
            float r12 = r13.getBits(r14, r14, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r10.renderer
            r14.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r10.renderer
            float r14 = r6 + r1
            r39 = r11
            float r11 = r40 + r0
            r13 = 0
            r8.vertex(r14, r11, r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r10.renderer
            r8.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r10.renderer
            float r11 = r6 + r4
            float r14 = r40 + r7
            r8.vertex(r11, r14, r13)
            float r8 = r3 * r1
            float r13 = r2 * r0
            float r8 = r8 - r13
            float r1 = r1 * r2
            float r0 = r0 * r3
            float r0 = r0 + r1
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            r1.color(r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            float r13 = r6 + r8
            r41 = r8
            float r8 = r40 + r0
            r44 = r0
            r0 = 0
            r1.vertex(r13, r8, r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            r1.color(r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            r1.vertex(r13, r8, r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            r1.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            r1.vertex(r11, r14, r0)
            float r0 = r3 * r4
            float r1 = r2 * r7
            float r0 = r0 + r1
            float r1 = -r2
            float r1 = r1 * r4
            float r7 = r7 * r3
            float r7 = r7 + r1
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            r1.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r10.renderer
            float r4 = r6 + r0
            float r9 = r40 + r7
            r8 = 0
            r1.vertex(r4, r9, r8)
            int r5 = r5 + 1
            r11 = r39
            r1 = r41
            r4 = r0
            r9 = r12
            r8 = r15
            r0 = r44
            goto L6eb
        L77b:
            return
    }

    public void myTrapezoid(float r25, float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, boolean r34, com.badlogic.gdx.graphics.Color r35, com.badlogic.gdx.graphics.Color r36) {
            r24 = this;
            r0 = r24
            r1 = r32
            r2 = r33
            com.badlogic.gdx.graphics.Color r3 = r0.setColor1
            r4 = r35
            r3.set(r4)
            com.badlogic.gdx.graphics.Color r3 = r0.setColor1
            float r4 = r3.a
            com.badlogic.gdx.graphics.Color r5 = r24.getColor()
            float r5 = r5.a
            float r4 = r4 * r5
            r3.a = r4
            com.badlogic.gdx.graphics.Color r3 = r0.setColor2
            r4 = r36
            r3.set(r4)
            com.badlogic.gdx.graphics.Color r3 = r0.setColor2
            float r4 = r3.a
            com.badlogic.gdx.graphics.Color r5 = r24.getColor()
            float r5 = r5.a
            float r4 = r4 * r5
            r3.a = r4
            com.badlogic.gdx.graphics.Color r3 = r0.setColor1
            float r3 = r3.toFloatBits()
            com.badlogic.gdx.graphics.Color r4 = r0.setColor2
            float r4 = r4.toFloatBits()
            r5 = 1056964608(0x3f000000, float:0.5)
            float r6 = r29 * r5
            float r7 = r30 * r5
            int r8 = (r29 > r30 ? 1 : (r29 == r30 ? 0 : -1))
            if (r8 >= 0) goto L81
            float r8 = -r2
            float r9 = r6 * r8
            float r9 = r25 + r9
            float r10 = r6 * r1
            float r10 = r26 + r10
            float r11 = r6 * r2
            float r11 = r25 + r11
            float r12 = -r1
            float r6 = r6 * r12
            float r6 = r26 + r6
            float r8 = r8 * r7
            float r8 = r27 + r8
            float r13 = r7 * r1
            float r13 = r28 + r13
            float r14 = r7 * r2
            float r14 = r27 + r14
            float r7 = r7 * r12
            float r7 = r28 + r7
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12 = r8
            r15 = r11
            r5 = r13
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = r3
            r11 = r7
            r13 = r9
            r7 = r29
            r9 = r4
            r4 = r14
            r14 = r10
            r10 = r6
            r6 = r30
            r23 = r26
            r26 = r25
            r25 = r23
            goto Lc0
        L81:
            if (r34 == 0) goto L88
            r23 = r4
            r4 = r3
            r3 = r23
        L88:
            float r8 = -r2
            float r9 = r7 * r8
            float r9 = r27 + r9
            float r10 = r7 * r1
            float r10 = r28 + r10
            float r11 = r7 * r2
            float r11 = r27 + r11
            float r12 = -r1
            float r7 = r7 * r12
            float r7 = r28 + r7
            float r8 = r8 * r6
            float r8 = r25 + r8
            float r13 = r6 * r1
            float r13 = r26 + r13
            float r14 = r6 * r2
            float r14 = r25 + r14
            float r6 = r6 * r12
            float r6 = r26 + r6
            r12 = 1065353216(0x3f800000, float:1.0)
            r26 = r27
            r25 = r28
            r12 = r8
            r15 = r11
            r5 = r13
            r16 = 1065353216(0x3f800000, float:1.0)
            r8 = r3
            r11 = r6
            r13 = r9
            r6 = r29
            r9 = r4
            r4 = r14
            r14 = r10
            r10 = r7
            r7 = r30
        Lc0:
            r3 = 6
            r27 = r7
            r7 = 0
            if (r34 == 0) goto L107
            r0.quickCheck(r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r13, r14, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r15, r10, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r12, r5, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r4, r11, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r12, r5, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r15, r10, r7)
            goto L1df
        L107:
            int r7 = getSegmentsForTrapezoidWidth(r6)
            int r17 = r7 * 6
            int r3 = r17 + 6
            r0.quickCheck(r3)
            float r3 = (float) r7
            float r17 = r31 / r3
            float r18 = r1 * r17
            float r17 = r17 * r2
            r19 = 0
            r19 = r5
            r5 = 0
        L11e:
            if (r5 >= r7) goto L19c
            r29 = r7
            float r7 = (float) r5
            r30 = r12
            float r12 = r7 / r3
            r34 = r3
            r3 = r27
            float r12 = com.badlogic.gdx.math.MathUtils.lerp(r3, r6, r12)
            r20 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r20
            float r21 = r18 * r7
            float r21 = r21 * r16
            float r21 = r26 + r21
            float r7 = r7 * r17
            float r7 = r7 * r16
            float r7 = r25 + r7
            float r22 = r2 * r12
            float r2 = r21 - r22
            float r12 = r12 * r1
            float r1 = r7 + r12
            float r3 = r21 + r22
            float r7 = r7 - r12
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r12.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r35 = r6
            r6 = 0
            r12.vertex(r13, r14, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r12.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r0.renderer
            r12.vertex(r15, r10, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r0.renderer
            r10.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r0.renderer
            r10.vertex(r3, r7, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r0.renderer
            r10.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r0.renderer
            r10.vertex(r13, r14, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r0.renderer
            r10.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r0.renderer
            r10.vertex(r3, r7, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r0.renderer
            r10.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r0.renderer
            r10.vertex(r2, r1, r6)
            int r5 = r5 + 1
            r12 = r30
            r6 = r35
            r14 = r1
            r13 = r2
            r15 = r3
            r10 = r7
            r7 = r29
            r1 = r32
            r2 = r33
            r3 = r34
            goto L11e
        L19c:
            r30 = r12
            r6 = 0
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r13, r14, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r15, r10, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r4, r11, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r13, r14, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r4, r11, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r8 = r30
            r13 = r19
            r1.vertex(r8, r13, r6)
        L1df:
            return
    }

    public void myTrapezoidCurved(boolean r44, float r45, float r46, float r47, float r48, float r49, float r50, float r51, float r52, float r53, int r54, boolean r55, boolean r56, boolean r57, com.badlogic.gdx.graphics.Color r58, com.badlogic.gdx.graphics.Color r59) {
            r43 = this;
            r0 = r43
            r1 = r52
            r2 = r53
            int r3 = r54 % 2
            r4 = 1
            if (r3 != r4) goto Le
            int r3 = r54 + 1
            goto L10
        Le:
            r3 = r54
        L10:
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r56 == 0) goto L1b
            float r7 = r47 * r6
            int r7 = getSegmentsForSegmentArc(r7)
            goto L1c
        L1b:
            r7 = 0
        L1c:
            if (r57 == 0) goto L25
            float r8 = r48 * r6
            int r8 = getSegmentsForSegmentArc(r8)
            goto L26
        L25:
            r8 = 0
        L26:
            int r9 = r3 + 2
            int r9 = r9 * 6
            int r10 = r7 + 2
            int r10 = r10 * 3
            int r9 = r9 + r10
            int r10 = r8 + 2
            int r10 = r10 * 3
            int r9 = r9 + r10
            r0.quickCheck(r9)
            float r9 = java.lang.Math.max(r47, r48)
            r10 = 1148846080(0x447a0000, float:1000.0)
            float r11 = r49 * r10
            int r11 = java.lang.Math.round(r11)
            float r11 = (float) r11
            float r11 = r11 / r10
            if (r44 != 0) goto L61
            float r10 = r11 / r9
            r12 = 1045220557(0x3e4ccccd, float:0.2)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L61
            float r9 = r9 * r12
            float r10 = r9 - r11
            float r11 = r1 * r10
            float r11 = r11 * r6
            float r11 = r45 - r11
            float r10 = r10 * r2
            float r10 = r10 * r6
            float r10 = r46 - r10
            goto L66
        L61:
            r10 = r46
            r9 = r11
            r11 = r45
        L66:
            r12 = 1127481344(0x43340000, float:180.0)
            r13 = 0
            int r14 = (r51 > r13 ? 1 : (r51 == r13 ? 0 : -1))
            if (r14 >= 0) goto L91
            float r14 = java.lang.Math.abs(r51)
            float r15 = r1 * r9
            float r11 = r11 + r15
            float r15 = r2 * r9
            float r10 = r10 + r15
            float r1 = -r1
            float r2 = -r2
            float r15 = r50 - r12
            r5 = r58
            r4 = r59
            r17 = r7
            r18 = r8
            r12 = r10
            r19 = r11
            r10 = r56
            r11 = r57
            r7 = r1
            r8 = r2
            r2 = r47
            r1 = r48
            goto Laa
        L91:
            r15 = r50
            r14 = r51
            r4 = r58
            r5 = r59
            r18 = r7
            r17 = r8
            r12 = r10
            r19 = r11
            r11 = r56
            r10 = r57
            r7 = r1
            r8 = r2
            r1 = r47
            r2 = r48
        Laa:
            float r13 = r1 * r6
            r47 = r11
            float r11 = r2 * r6
            float r1 = com.badlogic.gdx.math.MathUtils.lerp(r1, r2, r6)
            float r1 = r1 * r6
            if (r55 == 0) goto Lbb
            org.fortheloss.sticknodes.SNShapeRenderer$ColorInterpolator r2 = r0.mColInterX
            goto Lbd
        Lbb:
            org.fortheloss.sticknodes.SNShapeRenderer$ColorInterpolator r2 = r0.mColInterY
        Lbd:
            if (r55 == 0) goto Lc2
            com.badlogic.gdx.math.Interpolation r20 = com.badlogic.gdx.math.Interpolation.sineOut
            goto Lc4
        Lc2:
            com.badlogic.gdx.math.Interpolation r20 = com.badlogic.gdx.math.Interpolation.sineIn
        Lc4:
            r21 = r20
            if (r55 == 0) goto Lcc
            r2.setColors(r5, r4)
            goto Lcf
        Lcc:
            r2.setColors(r4, r5)
        Lcf:
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            float r20 = r2.getBits(r6, r4, r5)
            float r22 = r2.getBits(r6, r4, r4)
            float r23 = r2.getBits(r6, r4, r5)
            float r5 = r2.getBits(r6, r4, r4)
            float r4 = r9 * r6
            float r24 = r7 * r4
            r49 = r5
            r6 = r19
            float r5 = r6 + r24
            r50 = r6
            double r5 = (double) r5
            float r19 = r8 * r4
            r51 = r10
            float r10 = r12 + r19
            r52 = r12
            r53 = r13
            double r12 = (double) r10
            r10 = 1119092736(0x42b40000, float:90.0)
            r19 = 1073741824(0x40000000, float:2.0)
            if (r44 != 0) goto L461
            int r24 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r24 >= 0) goto L106
            goto L461
        L106:
            float r0 = (float) r3
            float r0 = r9 / r0
            float r16 = r15 - r10
            float r15 = r15 + r10
            float r10 = org.fortheloss.framework.CustomMathUtils.cosDeg(r15)
            float r15 = org.fortheloss.framework.CustomMathUtils.sinDeg(r15)
            float r21 = r14 + r1
            r56 = r8
            float r8 = r10 * r21
            r57 = r7
            double r7 = (double) r8
            double r7 = r7 + r5
            float r7 = (float) r7
            float r8 = r15 * r21
            r21 = r7
            double r7 = (double) r8
            double r7 = r7 + r12
            float r7 = (float) r7
            float r8 = r14 - r1
            float r10 = r10 * r8
            r24 = r9
            double r9 = (double) r10
            double r5 = r5 + r9
            float r5 = (float) r5
            float r15 = r15 * r8
            double r8 = (double) r15
            double r12 = r12 + r8
            float r6 = (float) r12
            int r3 = r3 / 2
            int r8 = r3 + (-1)
            r55 = r49
            r49 = r5
            r44 = r6
            r12 = r7
            r13 = r12
            r15 = r8
            r9 = r20
            r10 = r21
            r7 = r22
            r8 = r44
            r6 = r49
            r5 = 0
        L14c:
            if (r15 < 0) goto L2c3
            r58 = r13
            com.badlogic.gdx.math.Interpolation r13 = com.badlogic.gdx.math.Interpolation.sine
            r59 = r5
            float r5 = (float) r3
            r25 = r3
            float r3 = (float) r15
            float r3 = r3 / r5
            r20 = r15
            r15 = 0
            float r3 = r13.apply(r15, r5, r3)
            float r13 = r0 * r3
            float r13 = r13 - r4
            float r15 = r13 / r4
            float r15 = r15 * r15
            r22 = 1065353216(0x3f800000, float:1.0)
            float r15 = r22 - r15
            r22 = r6
            r26 = r7
            double r6 = (double) r15
            double r6 = java.lang.Math.sqrt(r6)
            float r6 = (float) r6
            float r6 = r6 * r14
            float r7 = r14 * r14
            float r7 = r7 * r13
            float r15 = r4 * r4
            float r15 = r15 * r6
            float r7 = r7 / r15
            float r7 = com.badlogic.gdx.math.MathUtils.atan(r7)
            r15 = -1033556256(0xffffffffc2652ee0, float:-57.295776)
            float r7 = r7 * r15
            float r3 = r3 / r5
            float r5 = com.badlogic.gdx.math.MathUtils.lerp(r11, r1, r3)
            float r15 = r7 + r16
            float r27 = org.fortheloss.framework.CustomMathUtils.cosDeg(r15)
            float r27 = r27 * r5
            float r15 = org.fortheloss.framework.CustomMathUtils.sinDeg(r15)
            float r15 = r15 * r5
            float r13 = r13 + r4
            r28 = r11
            r5 = r24
            r24 = r0
            r0 = 0
            float r11 = r2.getBits(r13, r5, r0)
            r29 = r14
            r0 = 1065353216(0x3f800000, float:1.0)
            float r14 = r2.getBits(r13, r5, r0)
            float r30 = r4 - r13
            float r30 = java.lang.Math.abs(r30)
            r31 = r7
            float r7 = r4 + r30
            r30 = r4
            r4 = 0
            float r32 = r2.getBits(r7, r5, r4)
            float r4 = r2.getBits(r7, r5, r0)
            float r7 = r13 * r57
            float r0 = r50 + r7
            float r7 = r6 * r56
            float r0 = r0 - r7
            float r33 = r13 * r56
            float r33 = r52 + r33
            float r6 = r6 * r57
            float r33 = r33 + r6
            r34 = r2
            r35 = r4
            r2 = r43
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r2.renderer
            r4.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r2.renderer
            r9 = 0
            r4.vertex(r10, r12, r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r2.renderer
            r10 = r26
            r4.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r2.renderer
            r12 = r22
            r4.vertex(r12, r8, r9)
            float r4 = r0 - r27
            float r9 = r33 - r15
            r22 = r6
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r2.renderer
            r6.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r2.renderer
            r26 = r7
            r7 = 0
            r6.vertex(r4, r9, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r2.renderer
            r6.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r2.renderer
            r6.vertex(r12, r8, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r2.renderer
            r6.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r2.renderer
            r6.vertex(r4, r9, r7)
            float r6 = r0 + r27
            float r8 = r33 + r15
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r2.renderer
            r0.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r2.renderer
            r0.vertex(r6, r8, r7)
            r0 = r53
            float r3 = com.badlogic.gdx.math.MathUtils.lerp(r0, r1, r3)
            r7 = 1127481344(0x43340000, float:180.0)
            float r12 = r7 - r31
            float r12 = r12 + r16
            float r7 = org.fortheloss.framework.CustomMathUtils.cosDeg(r12)
            float r7 = r7 * r3
            float r10 = org.fortheloss.framework.CustomMathUtils.sinDeg(r12)
            float r10 = r10 * r3
            float r3 = r5 - r13
            float r12 = r3 * r57
            float r12 = r50 + r12
            float r12 = r12 - r26
            float r3 = r3 * r56
            float r3 = r52 + r3
            float r3 = r3 + r22
            float[] r13 = r2.mirroredCurveVerts
            int r15 = r59 + 1
            r13[r59] = r23
            int r22 = r15 + 1
            r13[r15] = r21
            int r15 = r22 + 1
            r13[r22] = r58
            int r21 = r15 + 1
            r13[r15] = r55
            int r15 = r21 + 1
            r13[r21] = r49
            int r21 = r15 + 1
            r13[r15] = r44
            float r15 = r12 + r7
            float r22 = r3 + r10
            int r23 = r21 + 1
            r13[r21] = r32
            int r21 = r23 + 1
            r13[r23] = r15
            int r23 = r21 + 1
            r13[r21] = r22
            int r21 = r23 + 1
            r13[r23] = r55
            int r23 = r21 + 1
            r13[r21] = r49
            int r21 = r23 + 1
            r13[r23] = r44
            int r23 = r21 + 1
            r13[r21] = r32
            int r21 = r23 + 1
            r13[r23] = r15
            int r23 = r21 + 1
            r13[r21] = r22
            float r7 = r12 - r7
            float r3 = r3 - r10
            int r10 = r23 + 1
            r13[r23] = r35
            int r12 = r10 + 1
            r13[r10] = r7
            int r10 = r12 + 1
            r13[r12] = r3
            int r12 = r20 + (-1)
            r44 = r3
            r49 = r7
            r7 = r14
            r21 = r15
            r13 = r22
            r0 = r24
            r3 = r25
            r14 = r29
            r23 = r32
            r2 = r34
            r55 = r35
            r24 = r5
            r5 = r10
            r15 = r12
            r10 = r4
            r12 = r9
            r9 = r11
            r11 = r28
            r4 = r30
            goto L14c
        L2c3:
            r34 = r2
            r22 = r7
            r58 = r13
            r2 = r43
            r0 = r5
            r1 = 0
        L2cd:
            if (r1 >= r0) goto L2eb
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            float[] r4 = r2.mirroredCurveVerts
            r4 = r4[r1]
            r3.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            float[] r4 = r2.mirroredCurveVerts
            int r5 = r1 + 1
            r5 = r4[r5]
            int r7 = r1 + 2
            r4 = r4[r7]
            r7 = 0
            r3.vertex(r5, r4, r7)
            int r1 = r1 + 3
            goto L2cd
        L2eb:
            if (r51 == 0) goto L399
            r7 = r17
            float r0 = (float) r7
            r1 = 1127481344(0x43340000, float:180.0)
            float r0 = r1 / r0
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r0)
            float r0 = org.fortheloss.framework.CustomMathUtils.sinDeg(r0)
            float r10 = r10 - r50
            float r12 = r12 - r52
            float r6 = r6 - r50
            float r8 = r8 - r52
            int r3 = r7 / 2
            r7 = r22
            r4 = 0
        L309:
            if (r4 >= r3) goto L399
            float r5 = (float) r4
            float r11 = (float) r3
            float r11 = r11 * r19
            float r5 = r5 / r11
            r11 = r34
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            float r15 = r11.getBits(r14, r13, r5)
            float r5 = r13 - r5
            float r5 = java.lang.Math.abs(r5)
            float r5 = r11.getBits(r14, r13, r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r13 = r2.renderer
            r13.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r2.renderer
            float r13 = r50 + r10
            r51 = r3
            float r3 = r52 + r12
            r9.vertex(r13, r3, r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            r3.color(r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            float r9 = r50 + r6
            float r13 = r52 + r8
            r3.vertex(r9, r13, r14)
            float r3 = r1 * r10
            float r14 = r0 * r12
            float r3 = r3 - r14
            float r10 = r10 * r0
            float r12 = r12 * r1
            float r12 = r12 + r10
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.color(r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            float r14 = r50 + r3
            r53 = r3
            float r3 = r52 + r12
            r56 = r12
            r12 = 0
            r10.vertex(r14, r3, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.color(r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r2.renderer
            r10.vertex(r14, r3, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            r3.color(r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            r3.vertex(r9, r13, r12)
            float r3 = r1 * r6
            float r7 = r0 * r8
            float r3 = r3 + r7
            float r7 = -r0
            float r7 = r7 * r6
            float r8 = r8 * r1
            float r8 = r8 + r7
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r2.renderer
            r6.color(r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r2.renderer
            float r7 = r50 + r3
            float r12 = r52 + r8
            r9 = 0
            r6.vertex(r7, r12, r9)
            int r4 = r4 + 1
            r10 = r53
            r12 = r56
            r6 = r3
            r7 = r5
            r9 = r15
            r3 = r51
            goto L309
        L399:
            r11 = r34
            if (r47 == 0) goto L85d
            r8 = r18
            float r0 = (float) r8
            r1 = 1127481344(0x43340000, float:180.0)
            float r12 = r1 / r0
            float r0 = org.fortheloss.framework.CustomMathUtils.cosDeg(r12)
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r12)
            float r3 = r49 - r21
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            float r3 = r21 + r3
            float r5 = r44 - r58
            float r5 = r5 * r4
            float r13 = r58 + r5
            float r21 = r21 - r3
            float r4 = r58 - r13
            float r5 = r49 - r3
            float r6 = r44 - r13
            int r7 = r8 / 2
            r8 = r5
            r9 = r6
            r10 = r23
            r5 = 0
            r6 = r55
        L3cb:
            if (r5 >= r7) goto L85d
            float r12 = (float) r5
            float r14 = (float) r7
            float r14 = r14 * r19
            float r12 = r12 / r14
            r14 = 1065353216(0x3f800000, float:1.0)
            float r15 = r11.getBits(r14, r14, r12)
            float r12 = r14 - r12
            float r12 = java.lang.Math.abs(r12)
            float r12 = r11.getBits(r14, r14, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r2.renderer
            r14.color(r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r2.renderer
            float r14 = r3 - r21
            r44 = r7
            float r7 = r13 - r4
            r34 = r11
            r11 = 0
            r6.vertex(r14, r7, r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r2.renderer
            r6.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r2.renderer
            float r7 = r3 - r8
            float r14 = r13 - r9
            r6.vertex(r7, r14, r11)
            float r6 = r0 * r21
            float r11 = r1 * r4
            float r6 = r6 - r11
            float r21 = r21 * r1
            float r4 = r4 * r0
            float r4 = r21 + r4
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r2.renderer
            r11.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r2.renderer
            r16 = r5
            float r5 = r3 - r6
            r45 = r6
            float r6 = r13 - r4
            r47 = r4
            r4 = 0
            r11.vertex(r5, r6, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r2.renderer
            r11.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r2.renderer
            r11.vertex(r5, r6, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r2.renderer
            r5.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r5 = r2.renderer
            r5.vertex(r7, r14, r4)
            float r4 = r0 * r8
            float r5 = r1 * r9
            float r5 = r5 + r4
            float r4 = -r1
            float r4 = r4 * r8
            float r9 = r9 * r0
            float r9 = r9 + r4
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r2.renderer
            r4.color(r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r2.renderer
            float r6 = r3 - r5
            float r7 = r13 - r9
            r11 = 0
            r4.vertex(r6, r7, r11)
            int r4 = r16 + 1
            r7 = r44
            r21 = r45
            r8 = r5
            r6 = r12
            r10 = r15
            r11 = r34
            r5 = r4
            r4 = r47
            goto L3cb
        L461:
            r34 = r2
            r30 = r4
            r57 = r7
            r56 = r8
            r28 = r11
            r29 = r14
            r7 = r17
            r8 = r18
            r11 = 0
            r2 = r0
            r0 = r53
            int r4 = (r30 > r11 ? 1 : (r30 == r11 ? 0 : -1))
            if (r4 != 0) goto L483
            r17 = 4640537203540230144(0x4066800000000000, double:180.0)
            r14 = r29
            r9 = r30
            goto L495
        L483:
            r14 = r29
            r9 = r30
            float r11 = com.badlogic.gdx.math.MathUtils.atan2(r14, r9)
            float r11 = r11 * r19
            r17 = 1113927392(0x42652ee0, float:57.295776)
            float r11 = r11 * r17
            double r10 = (double) r11
            r17 = r10
        L495:
            if (r4 != 0) goto L4a1
            float r4 = -r14
            r10 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r10
            double r10 = (double) r4
            r4 = r7
            r24 = r8
            goto L4b9
        L4a1:
            r10 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r10 = r10 - r17
            r25 = 4580687790437564416(0x3f91df46a0000000, double:0.01745329238474369)
            double r10 = r10 * r25
            double r10 = java.lang.Math.tan(r10)
            r4 = r7
            r24 = r8
            double r7 = (double) r9
            double r10 = r10 * r7
        L4b9:
            r7 = r56
            double r7 = (double) r7
            double r7 = r7 * r10
            double r5 = r5 + r7
            r7 = r57
            double r7 = (double) r7
            double r7 = r7 * r10
            double r12 = r12 - r7
            r11 = r50
            double r7 = (double) r11
            double r7 = r5 - r7
            r10 = r52
            r50 = r4
            r55 = r5
            double r4 = (double) r10
            double r4 = r12 - r4
            double r7 = r7 * r7
            double r4 = r4 * r4
            double r7 = r7 + r4
            double r4 = java.lang.Math.sqrt(r7)
            r6 = 1119092736(0x42b40000, float:90.0)
            float r15 = r15 + r6
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 * r17
            float r6 = (float) r6
            float r7 = (float) r3
            float r6 = r6 / r7
            float r7 = org.fortheloss.framework.CustomMathUtils.cosDeg(r15)
            float r8 = org.fortheloss.framework.CustomMathUtils.sinDeg(r15)
            r17 = r11
            double r10 = (double) r1
            r18 = r0
            r53 = r1
            double r0 = r4 - r10
            float r0 = (float) r0
            double r10 = r10 + r4
            float r1 = (float) r10
            float r10 = r7 * r1
            double r10 = (double) r10
            r25 = r55
            double r10 = r25 + r10
            float r10 = (float) r10
            float r1 = r1 * r8
            r27 = r10
            double r10 = (double) r1
            double r10 = r10 + r12
            float r1 = (float) r10
            float r7 = r7 * r0
            double r10 = (double) r7
            double r10 = r25 + r10
            float r7 = (float) r10
            float r8 = r8 * r0
            double r10 = (double) r8
            double r10 = r10 + r12
            float r0 = (float) r10
            int r3 = r3 / 2
            r55 = r49
            r49 = r0
            r56 = r1
            r16 = r7
            r8 = r20
            r11 = r27
            r10 = 1
            r36 = 0
            r20 = r49
            r0 = r22
            r1 = r16
            r7 = r56
        L52d:
            if (r10 > r3) goto L6c1
            r22 = r1
            float r1 = (float) r3
            r29 = r0
            float r0 = (float) r10
            r30 = r10
            float r10 = r0 / r1
            r31 = r7
            r32 = r8
            r7 = r21
            r21 = r11
            r11 = 0
            float r8 = r7.apply(r11, r1, r10)
            float r11 = r6 * r0
            float r33 = r15 + r11
            r57 = r6
            float r6 = org.fortheloss.framework.CustomMathUtils.cosDeg(r33)
            r35 = r7
            float r7 = org.fortheloss.framework.CustomMathUtils.sinDeg(r33)
            r58 = r10
            r59 = r11
            double r10 = (double) r6
            double r10 = r10 * r4
            double r10 = r25 + r10
            float r10 = (float) r10
            r33 = r10
            double r10 = (double) r7
            double r10 = r10 * r4
            double r10 = r10 + r12
            float r10 = (float) r10
            if (r44 != 0) goto L578
            float r11 = r14 / r9
            r37 = r9
            r9 = 1065353216(0x3f800000, float:1.0)
            float r11 = java.lang.Math.max(r11, r9)
            float r8 = com.badlogic.gdx.math.MathUtils.lerp(r0, r8, r11)
            goto L57c
        L578:
            r37 = r9
            r9 = 1065353216(0x3f800000, float:1.0)
        L57c:
            float r11 = r1 - r8
            float r11 = java.lang.Math.abs(r11)
            int r9 = r3 * 2
            float r9 = (float) r9
            r38 = r3
            r39 = r12
            r3 = r34
            r12 = 0
            float r13 = r3.getBits(r11, r9, r12)
            r12 = 1065353216(0x3f800000, float:1.0)
            float r11 = r3.getBits(r11, r9, r12)
            float r8 = r8 + r1
            r41 = r4
            r4 = 0
            float r5 = r3.getBits(r8, r9, r4)
            float r8 = r3.getBits(r8, r9, r12)
            com.badlogic.gdx.math.Interpolation r9 = com.badlogic.gdx.math.Interpolation.sineOut
            r12 = r58
            float r9 = r9.apply(r4, r1, r12)
            r4 = 1101004800(0x41a00000, float:20.0)
            int r12 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r12 >= 0) goto L5b6
            float r4 = r14 / r4
            float r9 = com.badlogic.gdx.math.MathUtils.lerp(r0, r9, r4)
        L5b6:
            float r9 = r9 / r1
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = r0 - r9
            r1 = r53
            r0 = r28
            float r9 = com.badlogic.gdx.math.MathUtils.lerp(r0, r1, r4)
            float r6 = r6 * r9
            float r7 = r7 * r9
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r2.renderer
            r12 = r32
            r9.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r2.renderer
            r12 = r21
            r0 = r31
            r21 = r14
            r14 = 0
            r9.vertex(r12, r0, r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r2.renderer
            r9 = r29
            r0.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r2.renderer
            r34 = r3
            r3 = r20
            r12 = r22
            r0.vertex(r12, r3, r14)
            float r0 = r33 + r6
            float r14 = r10 + r7
            r53 = r8
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r2.renderer
            r8.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r2.renderer
            r58 = r5
            r5 = 0
            r8.vertex(r0, r14, r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r2.renderer
            r8.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r2.renderer
            r8.vertex(r12, r3, r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            r3.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            r3.vertex(r0, r14, r5)
            float r3 = r33 - r6
            float r6 = r10 - r7
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r2.renderer
            r7.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r2.renderer
            r7.vertex(r3, r6, r5)
            float r5 = r15 - r59
            float r7 = org.fortheloss.framework.CustomMathUtils.cosDeg(r5)
            float r5 = org.fortheloss.framework.CustomMathUtils.sinDeg(r5)
            r8 = r18
            float r4 = com.badlogic.gdx.math.MathUtils.lerp(r8, r1, r4)
            float r9 = r7 * r4
            float r4 = r4 * r5
            r59 = r0
            r10 = r1
            double r0 = (double) r7
            double r0 = r0 * r41
            double r0 = r25 + r0
            float r0 = (float) r0
            r1 = r6
            double r5 = (double) r5
            double r5 = r5 * r41
            double r5 = r39 + r5
            float r5 = (float) r5
            float[] r6 = r2.mirroredCurveVerts
            r7 = r36
            int r36 = r7 + 1
            r6[r7] = r23
            int r7 = r36 + 1
            r6[r36] = r27
            int r12 = r7 + 1
            r6[r7] = r56
            int r7 = r12 + 1
            r6[r12] = r55
            int r12 = r7 + 1
            r6[r7] = r16
            int r7 = r12 + 1
            r6[r12] = r49
            float r27 = r0 + r9
            float r12 = r5 + r4
            int r18 = r7 + 1
            r6[r7] = r58
            int r7 = r18 + 1
            r6[r18] = r27
            int r18 = r7 + 1
            r6[r7] = r12
            int r7 = r18 + 1
            r6[r18] = r55
            int r18 = r7 + 1
            r6[r7] = r16
            int r7 = r18 + 1
            r6[r18] = r49
            int r16 = r7 + 1
            r6[r7] = r58
            int r7 = r16 + 1
            r6[r16] = r27
            int r16 = r7 + 1
            r6[r7] = r12
            float r0 = r0 - r9
            float r4 = r5 - r4
            int r5 = r16 + 1
            r6[r16] = r53
            int r7 = r5 + 1
            r6[r5] = r0
            int r36 = r7 + 1
            r6[r7] = r4
            int r5 = r30 + 1
            r55 = r53
            r6 = r57
            r23 = r58
            r16 = r0
            r20 = r1
            r1 = r3
            r49 = r4
            r18 = r8
            r53 = r10
            r0 = r11
            r56 = r12
            r8 = r13
            r7 = r14
            r14 = r21
            r21 = r35
            r9 = r37
            r3 = r38
            r12 = r39
            r11 = r59
            r10 = r5
            r4 = r41
            goto L52d
        L6c1:
            r9 = r0
            r4 = r1
            r0 = r7
            r12 = r8
            r1 = r11
            r3 = r20
            r7 = r36
            r5 = 0
        L6cb:
            if (r5 >= r7) goto L6e9
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r2.renderer
            float[] r8 = r2.mirroredCurveVerts
            r8 = r8[r5]
            r6.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r2.renderer
            float[] r8 = r2.mirroredCurveVerts
            int r10 = r5 + 1
            r10 = r8[r10]
            int r11 = r5 + 2
            r8 = r8[r11]
            r11 = 0
            r6.vertex(r10, r8, r11)
            int r5 = r5 + 3
            goto L6cb
        L6e9:
            if (r51 == 0) goto L797
            r7 = r50
            float r5 = (float) r7
            r6 = 1127481344(0x43340000, float:180.0)
            float r5 = r6 / r5
            float r6 = org.fortheloss.framework.CustomMathUtils.cosDeg(r5)
            float r5 = org.fortheloss.framework.CustomMathUtils.sinDeg(r5)
            float r11 = r1 - r17
            float r0 = r0 - r52
            float r1 = r4 - r17
            float r20 = r3 - r52
            int r3 = r7 / 2
            r4 = r1
            r8 = r12
            r7 = 0
            r1 = r0
            r0 = r9
        L709:
            if (r7 >= r3) goto L797
            float r9 = (float) r7
            float r10 = (float) r3
            float r10 = r10 * r19
            float r9 = r9 / r10
            r10 = r34
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            float r14 = r10.getBits(r13, r12, r9)
            float r9 = r12 - r9
            float r9 = java.lang.Math.abs(r9)
            float r9 = r10.getBits(r13, r12, r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r2.renderer
            r12.color(r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r2.renderer
            float r12 = r17 + r11
            float r15 = r52 + r1
            r8.vertex(r12, r15, r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r2.renderer
            r8.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r8 = r2.renderer
            float r12 = r17 + r4
            float r15 = r52 + r20
            r8.vertex(r12, r15, r13)
            float r8 = r6 * r11
            float r13 = r5 * r1
            float r8 = r8 - r13
            float r11 = r11 * r5
            float r1 = r1 * r6
            float r1 = r1 + r11
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r2.renderer
            r11.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r2.renderer
            float r13 = r17 + r8
            r44 = r3
            float r3 = r52 + r1
            r50 = r1
            r1 = 0
            r11.vertex(r13, r3, r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r2.renderer
            r11.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r11 = r2.renderer
            r11.vertex(r13, r3, r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            r3.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r2.renderer
            r0.vertex(r12, r15, r1)
            float r0 = r6 * r4
            float r1 = r5 * r20
            float r1 = r1 + r0
            float r0 = -r5
            float r0 = r0 * r4
            float r20 = r20 * r6
            float r20 = r0 + r20
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r2.renderer
            r0.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r2.renderer
            float r3 = r17 + r1
            float r12 = r52 + r20
            r4 = 0
            r0.vertex(r3, r12, r4)
            int r7 = r7 + 1
            r3 = r44
            r4 = r1
            r11 = r8
            r0 = r9
            r8 = r14
            r1 = r50
            goto L709
        L797:
            r10 = r34
            if (r47 == 0) goto L85d
            r7 = r24
            float r0 = (float) r7
            r1 = 1127481344(0x43340000, float:180.0)
            float r12 = r1 / r0
            float r0 = org.fortheloss.framework.CustomMathUtils.cosDeg(r12)
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r12)
            float r1 = -r1
            float r3 = r16 - r27
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            float r3 = r27 + r3
            float r5 = r49 - r56
            float r5 = r5 * r4
            float r5 = r56 + r5
            float r27 = r27 - r3
            float r4 = r56 - r5
            float r16 = r16 - r3
            float r6 = r49 - r5
            int r7 = r7 / 2
            r11 = r55
            r8 = r6
            r9 = r23
            r6 = 0
        L7c9:
            if (r6 >= r7) goto L85d
            float r12 = (float) r6
            float r13 = (float) r7
            float r13 = r13 * r19
            float r12 = r12 / r13
            r13 = 1065353216(0x3f800000, float:1.0)
            float r14 = r10.getBits(r13, r13, r12)
            float r12 = r13 - r12
            float r12 = java.lang.Math.abs(r12)
            float r12 = r10.getBits(r13, r13, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r15 = r2.renderer
            r15.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r2.renderer
            float r15 = r3 + r27
            float r13 = r5 + r4
            r44 = r7
            r7 = 0
            r9.vertex(r15, r13, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r2.renderer
            r9.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r2.renderer
            float r13 = r3 + r16
            float r15 = r5 + r8
            r9.vertex(r13, r15, r7)
            float r7 = r0 * r27
            float r9 = r1 * r4
            float r7 = r7 - r9
            float r27 = r27 * r1
            float r4 = r4 * r0
            float r4 = r27 + r4
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r2.renderer
            r9.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r2.renderer
            r34 = r10
            float r10 = r3 + r7
            r45 = r7
            float r7 = r5 + r4
            r47 = r4
            r4 = 0
            r9.vertex(r10, r7, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r2.renderer
            r9.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r2.renderer
            r9.vertex(r10, r7, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r2.renderer
            r7.color(r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r2.renderer
            r7.vertex(r13, r15, r4)
            float r4 = r0 * r16
            float r7 = r1 * r8
            float r4 = r4 + r7
            float r7 = -r1
            float r7 = r7 * r16
            float r8 = r8 * r0
            float r8 = r8 + r7
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r2.renderer
            r7.color(r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r2.renderer
            float r9 = r3 + r4
            float r10 = r5 + r8
            r11 = 0
            r7.vertex(r9, r10, r11)
            int r6 = r6 + 1
            r7 = r44
            r27 = r45
            r16 = r4
            r11 = r12
            r9 = r14
            r10 = r34
            r4 = r47
            goto L7c9
        L85d:
            return
    }

    public void nodeMain(float r7, float r8, int r9) {
            r6 = this;
            r0 = 16
            r6.quickCheck(r0)
            if (r9 != 0) goto Lc
            float r9 = r6.GRAY_BITS
            float r0 = r6.BLACK_SHADOW_BITS
            goto L18
        Lc:
            r0 = 1
            if (r9 != r0) goto L14
            float r9 = r6.ORANGE_BITS
            float r0 = r6.ORANGE_SHADOW_BITS
            goto L18
        L14:
            float r9 = r6.RED_BITS
            float r0 = r6.RED_SHADOW_BITS
        L18:
            int r1 = r6.mainNodeRadius
            int r7 = (int) r7
            float r7 = (float) r7
            int r8 = (int) r8
            float r8 = (float) r8
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            r2.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            r3 = 0
            r2.vertex(r7, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            r2.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            float r1 = (float) r1
            float r4 = r7 + r1
            r2.vertex(r4, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            r2.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            r2.vertex(r4, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            r2.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            float r5 = r8 + r1
            r2.vertex(r4, r5, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            r2.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            r2.vertex(r4, r5, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            r2.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            r2.vertex(r7, r5, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            r2.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            r2.vertex(r7, r5, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r6.renderer
            r2.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.vertex(r7, r8, r3)
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r8 = r8 + r0
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.vertex(r7, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.vertex(r4, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.vertex(r4, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            float r1 = r1 + r8
            r0.vertex(r4, r1, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.vertex(r4, r1, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.vertex(r7, r1, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.vertex(r7, r1, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r6.renderer
            r9.vertex(r7, r8, r3)
            return
    }

    public void polygon(float r17, float r18, float r19, int r20, float r21, com.badlogic.gdx.graphics.Color r22, com.badlogic.gdx.graphics.Color r23) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r20
            com.badlogic.gdx.graphics.Color r4 = r0.setColor1
            r5 = r22
            r4.set(r5)
            com.badlogic.gdx.graphics.Color r4 = r0.setColor1
            float r5 = r4.a
            com.badlogic.gdx.graphics.Color r6 = r16.getColor()
            float r6 = r6.a
            float r5 = r5 * r6
            r4.a = r5
            com.badlogic.gdx.graphics.Color r4 = r0.setColor2
            r5 = r23
            r4.set(r5)
            com.badlogic.gdx.graphics.Color r4 = r0.setColor2
            float r5 = r4.a
            com.badlogic.gdx.graphics.Color r6 = r16.getColor()
            float r6 = r6.a
            float r5 = r5 * r6
            r4.a = r5
            com.badlogic.gdx.graphics.Color r4 = r0.setColor1
            float r4 = r4.toFloatBits()
            com.badlogic.gdx.graphics.Color r5 = r0.setColor2
            float r5 = r5.toFloatBits()
            float r6 = (float) r3
            r7 = 1135869952(0x43b40000, float:360.0)
            float r7 = r7 / r6
            float r6 = com.badlogic.gdx.math.MathUtils.cosDeg(r21)
            float r6 = r6 * r19
            float r8 = com.badlogic.gdx.math.MathUtils.sinDeg(r21)
            float r8 = r8 * r19
            int r9 = r3 * 3
            int r9 = r9 + 3
            r0.quickCheck(r9)
            int r3 = r3 + (-1)
            r9 = 0
            r9 = r21
            r11 = r6
            r12 = r8
            r10 = 0
        L5d:
            r13 = 0
            if (r10 >= r3) goto L98
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r0.renderer
            r14.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r0.renderer
            r14.vertex(r1, r2, r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r0.renderer
            r14.color(r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r0.renderer
            float r11 = r11 + r1
            float r12 = r12 + r2
            r14.vertex(r11, r12, r13)
            float r9 = r9 + r7
            float r11 = com.badlogic.gdx.math.MathUtils.cosDeg(r9)
            float r11 = r11 * r19
            float r12 = com.badlogic.gdx.math.MathUtils.sinDeg(r9)
            float r12 = r12 * r19
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r0.renderer
            r14.color(r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r14 = r0.renderer
            float r15 = r1 + r11
            r20 = r3
            float r3 = r2 + r12
            r14.vertex(r15, r3, r13)
            int r10 = r10 + 1
            r3 = r20
            goto L5d
        L98:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.vertex(r1, r2, r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            float r4 = r1 + r11
            float r7 = r2 + r12
            r3.vertex(r4, r7, r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            r3.color(r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r0.renderer
            float r1 = r1 + r6
            float r2 = r2 + r8
            r3.vertex(r1, r2, r13)
            return
    }

    public void rect(float r5, float r6, float r7, float r8) {
            r4 = this;
            r0 = 8
            r4.quickCheck(r0)
            com.badlogic.gdx.graphics.Color r0 = r4.color
            float r0 = r0.toFloatBits()
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = r4.shapeType
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r2 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line
            r3 = 0
            if (r1 != r2) goto L65
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.vertex(r5, r6, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            float r7 = r7 + r5
            r1.vertex(r7, r6, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.vertex(r7, r6, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            float r8 = r8 + r6
            r1.vertex(r7, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.vertex(r7, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.vertex(r5, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.vertex(r5, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.vertex(r5, r6, r3)
            goto La3
        L65:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.vertex(r5, r6, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            float r7 = r7 + r5
            r1.vertex(r7, r6, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            float r8 = r8 + r6
            r1.vertex(r7, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r4.renderer
            r1.vertex(r7, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.vertex(r5, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.vertex(r5, r6, r3)
        La3:
            return
    }

    public void rect(float r7, float r8, float r9, float r10, com.badlogic.gdx.graphics.Color r11, com.badlogic.gdx.graphics.Color r12, com.badlogic.gdx.graphics.Color r13, com.badlogic.gdx.graphics.Color r14) {
            r6 = this;
            r0 = 8
            r6.quickCheck(r0)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = r6.shapeType
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line
            r2 = 0
            if (r0 != r1) goto L9f
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            float r1 = r11.r
            float r3 = r11.g
            float r4 = r11.b
            float r5 = r11.a
            r0.color(r1, r3, r4, r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.vertex(r7, r8, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            float r1 = r12.r
            float r3 = r12.g
            float r4 = r12.b
            float r5 = r12.a
            r0.color(r1, r3, r4, r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            float r9 = r9 + r7
            r0.vertex(r9, r8, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            float r1 = r12.r
            float r3 = r12.g
            float r4 = r12.b
            float r12 = r12.a
            r0.color(r1, r3, r4, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r6.renderer
            r12.vertex(r9, r8, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r6.renderer
            float r0 = r13.r
            float r1 = r13.g
            float r3 = r13.b
            float r4 = r13.a
            r12.color(r0, r1, r3, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r6.renderer
            float r10 = r10 + r8
            r12.vertex(r9, r10, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r6.renderer
            float r0 = r13.r
            float r1 = r13.g
            float r3 = r13.b
            float r13 = r13.a
            r12.color(r0, r1, r3, r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r6.renderer
            r12.vertex(r9, r10, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r6.renderer
            float r12 = r14.r
            float r13 = r14.g
            float r0 = r14.b
            float r1 = r14.a
            r9.color(r12, r13, r0, r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r6.renderer
            r9.vertex(r7, r10, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r6.renderer
            float r12 = r14.r
            float r13 = r14.g
            float r0 = r14.b
            float r14 = r14.a
            r9.color(r12, r13, r0, r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r6.renderer
            r9.vertex(r7, r10, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r6.renderer
            float r10 = r11.r
            float r12 = r11.g
            float r13 = r11.b
            float r11 = r11.a
            r9.color(r10, r12, r13, r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r6.renderer
            r9.vertex(r7, r8, r2)
            goto L10d
        L9f:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            float r1 = r11.r
            float r3 = r11.g
            float r4 = r11.b
            float r5 = r11.a
            r0.color(r1, r3, r4, r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            r0.vertex(r7, r8, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r6.renderer
            float r1 = r12.r
            float r3 = r12.g
            float r4 = r12.b
            float r12 = r12.a
            r0.color(r1, r3, r4, r12)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r6.renderer
            float r9 = r9 + r7
            r12.vertex(r9, r8, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r6.renderer
            float r0 = r13.r
            float r1 = r13.g
            float r3 = r13.b
            float r4 = r13.a
            r12.color(r0, r1, r3, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r6.renderer
            float r10 = r10 + r8
            r12.vertex(r9, r10, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r6.renderer
            float r0 = r13.r
            float r1 = r13.g
            float r3 = r13.b
            float r13 = r13.a
            r12.color(r0, r1, r3, r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r6.renderer
            r12.vertex(r9, r10, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r6.renderer
            float r12 = r14.r
            float r13 = r14.g
            float r0 = r14.b
            float r14 = r14.a
            r9.color(r12, r13, r0, r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r6.renderer
            r9.vertex(r7, r10, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r6.renderer
            float r10 = r11.r
            float r12 = r11.g
            float r13 = r11.b
            float r11 = r11.a
            r9.color(r10, r12, r13, r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r6.renderer
            r9.vertex(r7, r8, r2)
        L10d:
            return
    }

    public void rectDashed(float r17, float r18, float r19, float r20, float r21, com.badlogic.gdx.graphics.Color r22, com.badlogic.gdx.graphics.Color r23) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r22
            r4 = r23
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r5 = r0.shapeType
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r6 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line
            if (r5 == r6) goto L11
            return
        L11:
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r5 = r5 * r21
            float r6 = r19 / r5
            int r6 = (int) r6
            int r6 = r6 * 4
            float r7 = r20 / r5
            int r7 = (int) r7
            int r7 = r7 * 4
            int r6 = r6 + r7
            r0.quickCheck(r6)
            r6 = 0
            r7 = 0
        L25:
            int r8 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r8 >= 0) goto L87
            float r8 = r7 + r21
            int r8 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r8 <= 0) goto L32
            float r8 = r19 - r7
            goto L34
        L32:
            r8 = r21
        L34:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r10 = r3.r
            float r11 = r3.g
            float r12 = r3.b
            float r13 = r3.a
            r9.color(r10, r11, r12, r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r10 = r1 + r7
            r9.vertex(r10, r2, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r11 = r4.r
            float r12 = r4.g
            float r13 = r4.b
            float r14 = r4.a
            r9.color(r11, r12, r13, r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r10 = r10 + r8
            r9.vertex(r10, r2, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r10 = r3.r
            float r11 = r3.g
            float r12 = r3.b
            float r13 = r3.a
            r9.color(r10, r11, r12, r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r10 = r1 + r19
            float r10 = r10 - r7
            float r11 = r2 + r20
            r9.vertex(r10, r11, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r12 = r4.r
            float r13 = r4.g
            float r14 = r4.b
            float r15 = r4.a
            r9.color(r12, r13, r14, r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r10 = r10 - r8
            r9.vertex(r10, r11, r6)
            float r7 = r7 + r5
            goto L25
        L87:
            r7 = 0
        L88:
            int r8 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r8 >= 0) goto Lea
            float r8 = r7 + r21
            int r8 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r8 <= 0) goto L95
            float r8 = r20 - r7
            goto L97
        L95:
            r8 = r21
        L97:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r10 = r3.r
            float r11 = r3.g
            float r12 = r3.b
            float r13 = r3.a
            r9.color(r10, r11, r12, r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r10 = r2 + r7
            r9.vertex(r1, r10, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r11 = r4.r
            float r12 = r4.g
            float r13 = r4.b
            float r14 = r4.a
            r9.color(r11, r12, r13, r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r10 = r10 + r8
            r9.vertex(r1, r10, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r10 = r3.r
            float r11 = r3.g
            float r12 = r3.b
            float r13 = r3.a
            r9.color(r10, r11, r12, r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r10 = r1 + r19
            float r11 = r2 + r20
            float r11 = r11 - r7
            r9.vertex(r10, r11, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r12 = r4.r
            float r13 = r4.g
            float r14 = r4.b
            float r15 = r4.a
            r9.color(r12, r13, r14, r15)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r11 = r11 - r8
            r9.vertex(r10, r11, r6)
            float r7 = r7 + r5
            goto L88
        Lea:
            return
    }

    public void rectLine(float r8, float r9, float r10, float r11, float r12, com.badlogic.gdx.graphics.Color r13, com.badlogic.gdx.graphics.Color r14) {
            r7 = this;
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r2 = 8
            r7.check(r0, r1, r2)
            float r13 = r13.toFloatBits()
            float r14 = r14.toFloatBits()
            com.badlogic.gdx.math.Vector2 r1 = r7.tmp
            float r2 = r11 - r9
            float r3 = r8 - r10
            com.badlogic.gdx.math.Vector2 r1 = r1.set(r2, r3)
            com.badlogic.gdx.math.Vector2 r1 = r1.nor()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r2
            float r2 = r1.x
            float r2 = r2 * r12
            float r1 = r1.y
            float r1 = r1 * r12
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r12 = r7.shapeType
            r3 = 0
            if (r12 != r0) goto L8d
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            float r0 = r8 + r2
            float r4 = r9 + r1
            r12.vertex(r0, r4, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            float r8 = r8 - r2
            float r9 = r9 - r1
            r12.vertex(r8, r9, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            float r5 = r10 + r2
            float r6 = r11 + r1
            r12.vertex(r5, r6, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            float r10 = r10 - r2
            float r11 = r11 - r1
            r12.vertex(r10, r11, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.vertex(r5, r6, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.vertex(r0, r4, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.vertex(r10, r11, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r7.renderer
            r10.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r7.renderer
            r10.vertex(r8, r9, r3)
            goto Ld5
        L8d:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            float r0 = r8 + r2
            float r4 = r9 + r1
            r12.vertex(r0, r4, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            float r8 = r8 - r2
            float r9 = r9 - r1
            r12.vertex(r8, r9, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            float r0 = r10 + r2
            float r4 = r11 + r1
            r12.vertex(r0, r4, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            r12.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r12 = r7.renderer
            float r10 = r10 - r2
            float r11 = r11 - r1
            r12.vertex(r10, r11, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r7.renderer
            r10.color(r14)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r7.renderer
            r10.vertex(r0, r4, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r7.renderer
            r10.color(r13)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r10 = r7.renderer
            r10.vertex(r8, r9, r3)
        Ld5:
            return
    }

    public void set(org.fortheloss.sticknodes.SNShapeRenderer.ShapeType r2) {
            r1 = this;
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r0 = r1.shapeType
            if (r0 != r2) goto L5
            return
        L5:
            if (r0 == 0) goto L1a
            boolean r0 = r1.autoShapeType
            if (r0 == 0) goto L12
            r1.end()
            r1.begin(r2)
            return
        L12:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "autoShapeType must be enabled."
            r2.<init>(r0)
            throw r2
        L1a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "begin must be called first."
            r2.<init>(r0)
            throw r2
    }

    public void setColor(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            r0.set(r2, r3, r4, r5)
            return
    }

    public void setColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            r0.set(r2)
            return
    }

    public void setProjectionMatrix(com.badlogic.gdx.math.Matrix4 r2) {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.projectionMatrix
            r0.set(r2)
            r2 = 1
            r1.matrixDirty = r2
            return
    }

    public void setTransformMatrix(com.badlogic.gdx.math.Matrix4 r2) {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.transformMatrix
            r0.set(r2)
            r2 = 1
            r1.matrixDirty = r2
            return
    }

    public void triangle(float r4, float r5, float r6, float r7, float r8, float r9) {
            r3 = this;
            r0 = 3
            r3.quickCheck(r0)
            com.badlogic.gdx.graphics.Color r0 = r3.color
            float r0 = r0.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r3.renderer
            r1.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r3.renderer
            r2 = 0
            r1.vertex(r4, r5, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r3.renderer
            r4.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r3.renderer
            r4.vertex(r6, r7, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r3.renderer
            r4.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r4 = r3.renderer
            r4.vertex(r8, r9, r2)
            return
    }

    public void triangle(float r3, float r4, float r5, float r6, float r7, float r8, com.badlogic.gdx.graphics.Color r9, com.badlogic.gdx.graphics.Color r10) {
            r2 = this;
            r0 = 3
            r2.quickCheck(r0)
            com.badlogic.gdx.graphics.Color r0 = r2.setColor1
            r0.set(r9)
            com.badlogic.gdx.graphics.Color r9 = r2.setColor1
            float r0 = r9.a
            com.badlogic.gdx.graphics.Color r1 = r2.getColor()
            float r1 = r1.a
            float r0 = r0 * r1
            r9.a = r0
            com.badlogic.gdx.graphics.Color r9 = r2.setColor2
            r9.set(r10)
            com.badlogic.gdx.graphics.Color r9 = r2.setColor2
            float r10 = r9.a
            com.badlogic.gdx.graphics.Color r0 = r2.getColor()
            float r0 = r0.a
            float r10 = r10 * r0
            r9.a = r10
            com.badlogic.gdx.graphics.Color r9 = r2.setColor1
            float r9 = r9.toFloatBits()
            com.badlogic.gdx.graphics.Color r10 = r2.setColor2
            float r10 = r10.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r2.renderer
            r0.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r2.renderer
            r1 = 0
            r0.vertex(r3, r4, r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            r3.color(r9)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            r3.vertex(r5, r6, r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            r3.color(r10)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r3 = r2.renderer
            r3.vertex(r7, r8, r1)
            return
    }

    public void triangleLine(float r4, float r5, float r6, float r7, float r8, float r9) {
            r3 = this;
            r0 = 6
            r3.quickCheck(r0)
            com.badlogic.gdx.graphics.Color r0 = r3.color
            float r0 = r0.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r3.renderer
            r1.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r3.renderer
            r2 = 0
            r1.vertex(r4, r5, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r3.renderer
            r1.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r3.renderer
            r1.vertex(r6, r7, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r3.renderer
            r1.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r3.renderer
            r1.vertex(r6, r7, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r3.renderer
            r6.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r3.renderer
            r6.vertex(r8, r9, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r3.renderer
            r6.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r3.renderer
            r6.vertex(r8, r9, r2)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r3.renderer
            r6.color(r0)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r6 = r3.renderer
            r6.vertex(r4, r5, r2)
            return
    }

    public void x(float r13, float r14, float r15) {
            r12 = this;
            com.badlogic.gdx.graphics.Color r0 = r12.tempColor
            com.badlogic.gdx.graphics.Color r1 = r12.color
            float r2 = r1.r
            r3 = 1060320051(0x3f333333, float:0.7)
            float r2 = r2 * r3
            float r4 = r1.g
            float r4 = r4 * r3
            float r1 = r1.b
            float r1 = r1 * r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.set(r2, r4, r1, r3)
            float r0 = r13 - r15
            float r1 = r14 - r15
            float r2 = r1 - r3
            float r13 = r13 + r15
            float r14 = r14 + r15
            float r15 = r14 - r3
            com.badlogic.gdx.graphics.Color r11 = r12.tempColor
            r5 = r12
            r6 = r0
            r7 = r2
            r8 = r13
            r9 = r15
            r10 = r11
            r5.line(r6, r7, r8, r9, r10, r11)
            com.badlogic.gdx.graphics.Color r11 = r12.color
            r7 = r1
            r9 = r14
            r10 = r11
            r5.line(r6, r7, r8, r9, r10, r11)
            com.badlogic.gdx.graphics.Color r11 = r12.tempColor
            r7 = r15
            r9 = r2
            r10 = r11
            r5.line(r6, r7, r8, r9, r10, r11)
            com.badlogic.gdx.graphics.Color r11 = r12.color
            r7 = r14
            r9 = r1
            r10 = r11
            r5.line(r6, r7, r8, r9, r10, r11)
            return
    }
}
