package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class ShapeRenderer implements com.badlogic.gdx.utils.Disposable {
    private boolean autoShapeType;
    private final com.badlogic.gdx.graphics.Color color;
    private final com.badlogic.gdx.math.Matrix4 combinedMatrix;
    private float defaultRectLineWidth;
    private boolean matrixDirty;
    private final com.badlogic.gdx.math.Matrix4 projectionMatrix;
    private final com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer renderer;
    private com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType shapeType;
    private final com.badlogic.gdx.math.Vector2 tmp;
    private final com.badlogic.gdx.math.Matrix4 transformMatrix;

    public enum ShapeType extends java.lang.Enum<com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType Filled = null;
        public static final com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType Line = null;
        public static final com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType Point = null;
        private final int glType;

        static {
                com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r0 = new com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType
                java.lang.String r1 = "Point"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.Point = r0
                com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r1 = new com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType
                java.lang.String r3 = "Line"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.Line = r1
                com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r3 = new com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType
                java.lang.String r5 = "Filled"
                r6 = 2
                r7 = 4
                r3.<init>(r5, r6, r7)
                com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.Filled = r3
                r5 = 3
                com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType[] r5 = new com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.$VALUES = r5
                return
        }

        ShapeType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.glType = r3
                return
        }

        public static com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType> r0 = com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r1 = (com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType[] values() {
                com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType[] r0 = com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType[] r0 = (com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType[]) r0
                return r0
        }

        public int getGlType() {
                r1 = this;
                int r0 = r1.glType
                return r0
        }
    }

    public ShapeRenderer() {
            r1 = this;
            r0 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r0)
            return
    }

    public ShapeRenderer(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ShapeRenderer(int r10, com.badlogic.gdx.graphics.glutils.ShaderProgram r11) {
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
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r2.<init>()
            r9.tmp = r2
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r3, r3, r3)
            r9.color = r2
            r2 = 1061158912(0x3f400000, float:0.75)
            r9.defaultRectLineWidth = r2
            r2 = 1
            if (r11 != 0) goto L3a
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20 r11 = new com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20
            r11.<init>(r10, r0, r2, r0)
            r9.renderer = r11
            goto L47
        L3a:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20 r0 = new com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20
            r5 = 0
            r6 = 1
            r7 = 0
            r3 = r0
            r4 = r10
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r9.renderer = r0
        L47:
            com.badlogic.gdx.Graphics r10 = com.badlogic.gdx.Gdx.graphics
            int r10 = r10.getWidth()
            float r10 = (float) r10
            com.badlogic.gdx.Graphics r11 = com.badlogic.gdx.Gdx.graphics
            int r11 = r11.getHeight()
            float r11 = (float) r11
            r0 = 0
            r1.setToOrtho2D(r0, r0, r10, r11)
            r9.matrixDirty = r2
            return
    }

    public void begin() {
            r2 = this;
            boolean r0 = r2.autoShapeType
            if (r0 == 0) goto La
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r0 = com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.Line
            r2.begin(r0)
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "autoShapeType must be true to use this method."
            r0.<init>(r1)
            throw r0
    }

    public void begin(com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType r3) {
            r2 = this;
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r0 = r2.shapeType
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
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r1 = r2.shapeType
            int r1 = r1.getGlType()
            r3.begin(r0, r1)
            return
        L2d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Call end() before beginning a new shape batch."
            r3.<init>(r0)
            throw r3
    }

    protected final void check(com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType r4, com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType r5, int r6) {
            r3 = this;
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r0 = r3.shapeType
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
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r4 = r3.shapeType
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

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r1.renderer
            r0.dispose()
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
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r0 = r1.shapeType
            if (r0 != 0) goto L5
            return
        L5:
            r1.end()
            r1.begin(r0)
            return
    }

    public com.badlogic.gdx.math.Matrix4 getTransformMatrix() {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.transformMatrix
            return r0
    }

    public boolean isDrawing() {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r0 = r1.shapeType
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void rect(float r5, float r6, float r7, float r8) {
            r4 = this;
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r0 = com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.Line
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r1 = com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.Filled
            r2 = 8
            r4.check(r0, r1, r2)
            com.badlogic.gdx.graphics.Color r1 = r4.color
            float r1 = r1.toFloatBits()
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r2 = r4.shapeType
            r3 = 0
            if (r2 != r0) goto L67
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.vertex(r5, r6, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            float r7 = r7 + r5
            r0.vertex(r7, r6, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.vertex(r7, r6, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            float r8 = r8 + r6
            r0.vertex(r7, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.vertex(r7, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.vertex(r5, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.vertex(r5, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.vertex(r5, r6, r3)
            goto La5
        L67:
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.vertex(r5, r6, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            float r7 = r7 + r5
            r0.vertex(r7, r6, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            float r8 = r8 + r6
            r0.vertex(r7, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r0 = r4.renderer
            r0.vertex(r7, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.vertex(r5, r8, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.color(r1)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r4.renderer
            r7.vertex(r5, r6, r3)
        La5:
            return
    }

    public void rect(float r16, float r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24) {
            r15 = this;
            r14 = r15
            com.badlogic.gdx.graphics.Color r13 = r14.color
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r13
            r11 = r13
            r12 = r13
            r0.rect(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    public void rect(float r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, com.badlogic.gdx.graphics.Color r27, com.badlogic.gdx.graphics.Color r28, com.badlogic.gdx.graphics.Color r29, com.badlogic.gdx.graphics.Color r30) {
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r7 = com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.Line
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r8 = com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.Filled
            r9 = 8
            r0.check(r7, r8, r9)
            float r8 = com.badlogic.gdx.math.MathUtils.cosDeg(r26)
            float r9 = com.badlogic.gdx.math.MathUtils.sinDeg(r26)
            float r10 = -r1
            float r11 = -r2
            float r12 = r22 - r1
            float r13 = r23 - r2
            r14 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r24 > r14 ? 1 : (r24 == r14 ? 0 : -1))
            if (r15 != 0) goto L2f
            int r14 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r14 == 0) goto L37
        L2f:
            float r10 = r10 * r24
            float r11 = r11 * r25
            float r12 = r12 * r24
            float r13 = r13 * r25
        L37:
            float r1 = r18 + r1
            float r2 = r19 + r2
            float r14 = r8 * r10
            float r15 = r9 * r11
            float r14 = r14 - r15
            float r14 = r14 + r1
            float r10 = r10 * r9
            float r11 = r11 * r8
            float r10 = r10 + r11
            float r10 = r10 + r2
            float r16 = r8 * r12
            float r15 = r16 - r15
            float r15 = r15 + r1
            float r12 = r12 * r9
            float r11 = r11 + r12
            float r11 = r11 + r2
            float r9 = r9 * r13
            float r16 = r16 - r9
            float r1 = r16 + r1
            float r8 = r8 * r13
            float r12 = r12 + r8
            float r12 = r12 + r2
            float r2 = r1 - r15
            float r2 = r2 + r14
            float r8 = r11 - r10
            float r8 = r12 - r8
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r9 = r0.shapeType
            if (r9 != r7) goto L100
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r7 = r0.renderer
            float r9 = r3.r
            float r13 = r3.g
            r19 = r2
            float r2 = r3.b
            r20 = r8
            float r8 = r3.a
            r7.color(r9, r13, r2, r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r7 = 0
            r2.vertex(r14, r10, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            float r8 = r4.r
            float r9 = r4.g
            float r13 = r4.b
            float r7 = r4.a
            r2.color(r8, r9, r13, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r7 = 0
            r2.vertex(r15, r11, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            float r8 = r4.r
            float r9 = r4.g
            float r13 = r4.b
            float r4 = r4.a
            r2.color(r8, r9, r13, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r2.vertex(r15, r11, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            float r4 = r5.r
            float r8 = r5.g
            float r9 = r5.b
            float r11 = r5.a
            r2.color(r4, r8, r9, r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r2.vertex(r1, r12, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            float r4 = r5.r
            float r8 = r5.g
            float r9 = r5.b
            float r5 = r5.a
            r2.color(r4, r8, r9, r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r2.vertex(r1, r12, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r2 = r6.r
            float r4 = r6.g
            float r5 = r6.b
            float r8 = r6.a
            r1.color(r2, r4, r5, r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r2 = r19
            r8 = r20
            r1.vertex(r2, r8, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r4 = r6.r
            float r5 = r6.g
            float r9 = r6.b
            float r6 = r6.a
            r1.color(r4, r5, r9, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r2, r8, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r2 = r3.r
            float r4 = r3.g
            float r5 = r3.b
            float r3 = r3.a
            r1.color(r2, r4, r5, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r14, r10, r7)
            goto L176
        L100:
            r7 = 0
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r9 = r0.renderer
            float r13 = r3.r
            float r7 = r3.g
            r19 = r2
            float r2 = r3.b
            r20 = r8
            float r8 = r3.a
            r9.color(r13, r7, r2, r8)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r7 = 0
            r2.vertex(r14, r10, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            float r8 = r4.r
            float r9 = r4.g
            float r13 = r4.b
            float r4 = r4.a
            r2.color(r8, r9, r13, r4)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r2.vertex(r15, r11, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            float r4 = r5.r
            float r8 = r5.g
            float r9 = r5.b
            float r11 = r5.a
            r2.color(r4, r8, r9, r11)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r2.vertex(r1, r12, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            float r4 = r5.r
            float r8 = r5.g
            float r9 = r5.b
            float r5 = r5.a
            r2.color(r4, r8, r9, r5)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r2 = r0.renderer
            r2.vertex(r1, r12, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r2 = r6.r
            float r4 = r6.g
            float r5 = r6.b
            float r6 = r6.a
            r1.color(r2, r4, r5, r6)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r2 = r19
            r12 = r20
            r1.vertex(r2, r12, r7)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            float r2 = r3.r
            float r4 = r3.g
            float r5 = r3.b
            float r3 = r3.a
            r1.color(r2, r4, r5, r3)
            com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer r1 = r0.renderer
            r1.vertex(r14, r10, r7)
        L176:
            return
    }

    public void set(com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType r2) {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r0 = r1.shapeType
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

    public void setAutoShapeType(boolean r1) {
            r0 = this;
            r0.autoShapeType = r1
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
}
