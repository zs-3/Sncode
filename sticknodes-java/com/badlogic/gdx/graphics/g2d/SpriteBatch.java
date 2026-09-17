package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class SpriteBatch implements com.badlogic.gdx.graphics.g2d.Batch {

    @java.lang.Deprecated
    public static com.badlogic.gdx.graphics.Mesh.VertexDataType defaultVertexDataType;
    private int blendDstFunc;
    private int blendDstFuncAlpha;
    private int blendSrcFunc;
    private int blendSrcFuncAlpha;
    private boolean blendingDisabled;
    private final com.badlogic.gdx.graphics.Color color;
    float colorPacked;
    private final com.badlogic.gdx.math.Matrix4 combinedMatrix;
    private com.badlogic.gdx.graphics.glutils.ShaderProgram customShader;
    boolean drawing;
    int idx;
    float invTexHeight;
    float invTexWidth;
    com.badlogic.gdx.graphics.Texture lastTexture;
    public int maxSpritesInBatch;
    private com.badlogic.gdx.graphics.Mesh mesh;
    private boolean ownsShader;
    private final com.badlogic.gdx.math.Matrix4 projectionMatrix;
    public int renderCalls;
    private final com.badlogic.gdx.graphics.glutils.ShaderProgram shader;
    public int totalRenderCalls;
    private final com.badlogic.gdx.math.Matrix4 transformMatrix;
    final float[] vertices;

    static {
            com.badlogic.gdx.graphics.Mesh$VertexDataType r0 = com.badlogic.gdx.graphics.Mesh.VertexDataType.VertexArray
            com.badlogic.gdx.graphics.g2d.SpriteBatch.defaultVertexDataType = r0
            return
    }

    public SpriteBatch() {
            r2 = this;
            r0 = 1000(0x3e8, float:1.401E-42)
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public SpriteBatch(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SpriteBatch(int r18, com.badlogic.gdx.graphics.glutils.ShaderProgram r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r17.<init>()
            r3 = 0
            r0.idx = r3
            r4 = 0
            r0.lastTexture = r4
            r5 = 0
            r0.invTexWidth = r5
            r0.invTexHeight = r5
            r0.drawing = r3
            com.badlogic.gdx.math.Matrix4 r6 = new com.badlogic.gdx.math.Matrix4
            r6.<init>()
            r0.transformMatrix = r6
            com.badlogic.gdx.math.Matrix4 r6 = new com.badlogic.gdx.math.Matrix4
            r6.<init>()
            r0.projectionMatrix = r6
            com.badlogic.gdx.math.Matrix4 r7 = new com.badlogic.gdx.math.Matrix4
            r7.<init>()
            r0.combinedMatrix = r7
            r0.blendingDisabled = r3
            r7 = 770(0x302, float:1.079E-42)
            r0.blendSrcFunc = r7
            r8 = 771(0x303, float:1.08E-42)
            r0.blendDstFunc = r8
            r0.blendSrcFuncAlpha = r7
            r0.blendDstFuncAlpha = r8
            r0.customShader = r4
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            r7 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r7, r7, r7, r7)
            r0.color = r4
            float r4 = com.badlogic.gdx.graphics.Color.WHITE_FLOAT_BITS
            r0.colorPacked = r4
            r0.renderCalls = r3
            r0.totalRenderCalls = r3
            r0.maxSpritesInBatch = r3
            r4 = 8191(0x1fff, float:1.1478E-41)
            if (r1 > r4) goto Le6
            com.badlogic.gdx.graphics.GL30 r4 = com.badlogic.gdx.Gdx.gl30
            if (r4 == 0) goto L59
            com.badlogic.gdx.graphics.Mesh$VertexDataType r4 = com.badlogic.gdx.graphics.Mesh.VertexDataType.VertexBufferObjectWithVAO
            goto L5b
        L59:
            com.badlogic.gdx.graphics.Mesh$VertexDataType r4 = com.badlogic.gdx.graphics.g2d.SpriteBatch.defaultVertexDataType
        L5b:
            r8 = r4
            com.badlogic.gdx.graphics.Mesh r4 = new com.badlogic.gdx.graphics.Mesh
            r9 = 0
            int r10 = r1 * 4
            int r13 = r1 * 6
            r7 = 3
            com.badlogic.gdx.graphics.VertexAttribute[] r12 = new com.badlogic.gdx.graphics.VertexAttribute[r7]
            com.badlogic.gdx.graphics.VertexAttribute r7 = new com.badlogic.gdx.graphics.VertexAttribute
            r14 = 1
            r11 = 2
            java.lang.String r15 = "a_position"
            r7.<init>(r14, r11, r15)
            r12[r3] = r7
            com.badlogic.gdx.graphics.VertexAttribute r7 = new com.badlogic.gdx.graphics.VertexAttribute
            r15 = 4
            java.lang.String r3 = "a_color"
            r7.<init>(r15, r15, r3)
            r12[r14] = r7
            com.badlogic.gdx.graphics.VertexAttribute r3 = new com.badlogic.gdx.graphics.VertexAttribute
            r7 = 16
            java.lang.String r14 = "a_texCoord0"
            r3.<init>(r7, r11, r14)
            r12[r11] = r3
            r7 = r4
            r11 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r0.mesh = r4
            com.badlogic.gdx.Graphics r3 = com.badlogic.gdx.Gdx.graphics
            int r3 = r3.getWidth()
            float r3 = (float) r3
            com.badlogic.gdx.Graphics r4 = com.badlogic.gdx.Gdx.graphics
            int r4 = r4.getHeight()
            float r4 = (float) r4
            r6.setToOrtho2D(r5, r5, r3, r4)
            int r1 = r1 * 20
            float[] r1 = new float[r1]
            r0.vertices = r1
            short[] r1 = new short[r13]
            r3 = 0
            r16 = 0
        La9:
            if (r3 >= r13) goto Ld2
            r1[r3] = r16
            int r4 = r3 + 1
            int r5 = r16 + 1
            short r5 = (short) r5
            r1[r4] = r5
            int r4 = r3 + 2
            int r5 = r16 + 2
            short r5 = (short) r5
            r1[r4] = r5
            int r4 = r3 + 3
            r1[r4] = r5
            int r4 = r3 + 4
            int r5 = r16 + 3
            short r5 = (short) r5
            r1[r4] = r5
            int r4 = r3 + 5
            r1[r4] = r16
            int r3 = r3 + 6
            int r4 = r16 + 4
            short r4 = (short) r4
            r16 = r4
            goto La9
        Ld2:
            com.badlogic.gdx.graphics.Mesh r3 = r0.mesh
            r3.setIndices(r1)
            if (r2 != 0) goto Le3
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = createDefaultShader()
            r0.shader = r1
            r1 = 1
            r0.ownsShader = r1
            goto Le5
        Le3:
            r0.shader = r2
        Le5:
            return
        Le6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Can't have more than 8191 sprites per batch: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    public static com.badlogic.gdx.graphics.glutils.ShaderProgram createDefaultShader() {
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = new com.badlogic.gdx.graphics.glutils.ShaderProgram
            java.lang.String r1 = "attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projTrans;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main()\n{\n   v_color = a_color;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n   gl_Position =  u_projTrans * a_position;\n}\n"
            java.lang.String r2 = "#ifdef GL_ES\n#define LOWP lowp\nprecision mediump float;\n#else\n#define LOWP \n#endif\nvarying LOWP vec4 v_color;\nvarying vec2 v_texCoords;\nuniform sampler2D u_texture;\nvoid main()\n{\n  gl_FragColor = v_color * texture2D(u_texture, v_texCoords);\n}"
            r0.<init>(r1, r2)
            boolean r1 = r0.isCompiled()
            if (r1 == 0) goto L10
            return r0
        L10:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error compiling shader: "
            r2.append(r3)
            java.lang.String r0 = r0.getLog()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void begin() {
            r2 = this;
            boolean r0 = r2.drawing
            if (r0 != 0) goto L20
            r0 = 0
            r2.renderCalls = r0
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glDepthMask(r0)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r2.customShader
            if (r0 == 0) goto L14
            r0.bind()
            goto L19
        L14:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r2.shader
            r0.bind()
        L19:
            r2.setupMatrices()
            r0 = 1
            r2.drawing = r0
            return
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "SpriteBatch.end must be called before begin."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void disableBlending() {
            r1 = this;
            boolean r0 = r1.blendingDisabled
            if (r0 == 0) goto L5
            return
        L5:
            r1.flush()
            r0 = 1
            r1.blendingDisabled = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            com.badlogic.gdx.graphics.Mesh r0 = r1.mesh
            r0.dispose()
            boolean r0 = r1.ownsShader
            if (r0 == 0) goto L10
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r1.shader
            if (r0 == 0) goto L10
            r0.dispose()
        L10:
            return
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(com.badlogic.gdx.graphics.Texture r8, float r9, float r10) {
            r7 = this;
            int r0 = r8.getWidth()
            float r5 = (float) r0
            int r0 = r8.getHeight()
            float r6 = (float) r0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.draw(r2, r3, r4, r5, r6)
            return
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(com.badlogic.gdx.graphics.Texture r6, float r7, float r8, float r9, float r10) {
            r5 = this;
            boolean r0 = r5.drawing
            if (r0 == 0) goto L72
            float[] r0 = r5.vertices
            com.badlogic.gdx.graphics.Texture r1 = r5.lastTexture
            if (r6 == r1) goto Le
            r5.switchTexture(r6)
            goto L16
        Le:
            int r6 = r5.idx
            int r1 = r0.length
            if (r6 != r1) goto L16
            r5.flush()
        L16:
            float r9 = r9 + r7
            float r10 = r10 + r8
            float r6 = r5.colorPacked
            int r1 = r5.idx
            r0[r1] = r7
            int r2 = r1 + 1
            r0[r2] = r8
            int r2 = r1 + 2
            r0[r2] = r6
            int r2 = r1 + 3
            r3 = 0
            r0[r2] = r3
            int r2 = r1 + 4
            r4 = 1065353216(0x3f800000, float:1.0)
            r0[r2] = r4
            int r2 = r1 + 5
            r0[r2] = r7
            int r7 = r1 + 6
            r0[r7] = r10
            int r7 = r1 + 7
            r0[r7] = r6
            int r7 = r1 + 8
            r0[r7] = r3
            int r7 = r1 + 9
            r0[r7] = r3
            int r7 = r1 + 10
            r0[r7] = r9
            int r7 = r1 + 11
            r0[r7] = r10
            int r7 = r1 + 12
            r0[r7] = r6
            int r7 = r1 + 13
            r0[r7] = r4
            int r7 = r1 + 14
            r0[r7] = r3
            int r7 = r1 + 15
            r0[r7] = r9
            int r7 = r1 + 16
            r0[r7] = r8
            int r7 = r1 + 17
            r0[r7] = r6
            int r6 = r1 + 18
            r0[r6] = r4
            int r6 = r1 + 19
            r0[r6] = r4
            int r1 = r1 + 20
            r5.idx = r1
            return
        L72:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "SpriteBatch.begin must be called before draw."
            r6.<init>(r7)
            throw r6
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(com.badlogic.gdx.graphics.Texture r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12) {
            r3 = this;
            boolean r0 = r3.drawing
            if (r0 == 0) goto L6f
            float[] r0 = r3.vertices
            com.badlogic.gdx.graphics.Texture r1 = r3.lastTexture
            if (r4 == r1) goto Le
            r3.switchTexture(r4)
            goto L16
        Le:
            int r4 = r3.idx
            int r1 = r0.length
            if (r4 != r1) goto L16
            r3.flush()
        L16:
            float r7 = r7 + r5
            float r8 = r8 + r6
            float r4 = r3.colorPacked
            int r1 = r3.idx
            r0[r1] = r5
            int r2 = r1 + 1
            r0[r2] = r6
            int r2 = r1 + 2
            r0[r2] = r4
            int r2 = r1 + 3
            r0[r2] = r9
            int r2 = r1 + 4
            r0[r2] = r10
            int r2 = r1 + 5
            r0[r2] = r5
            int r5 = r1 + 6
            r0[r5] = r8
            int r5 = r1 + 7
            r0[r5] = r4
            int r5 = r1 + 8
            r0[r5] = r9
            int r5 = r1 + 9
            r0[r5] = r12
            int r5 = r1 + 10
            r0[r5] = r7
            int r5 = r1 + 11
            r0[r5] = r8
            int r5 = r1 + 12
            r0[r5] = r4
            int r5 = r1 + 13
            r0[r5] = r11
            int r5 = r1 + 14
            r0[r5] = r12
            int r5 = r1 + 15
            r0[r5] = r7
            int r5 = r1 + 16
            r0[r5] = r6
            int r5 = r1 + 17
            r0[r5] = r4
            int r4 = r1 + 18
            r0[r4] = r11
            int r4 = r1 + 19
            r0[r4] = r10
            int r1 = r1 + 20
            r3.idx = r1
            return
        L6f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "SpriteBatch.begin must be called before draw."
            r4.<init>(r5)
            throw r4
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(com.badlogic.gdx.graphics.Texture r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
            r17 = this;
            r0 = r17
            r1 = r21
            r2 = r22
            r3 = r28
            r4 = r29
            boolean r5 = r0.drawing
            if (r5 == 0) goto Lf9
            float[] r5 = r0.vertices
            com.badlogic.gdx.graphics.Texture r6 = r0.lastTexture
            r7 = r18
            if (r7 == r6) goto L1a
            r17.switchTexture(r18)
            goto L22
        L1a:
            int r6 = r0.idx
            int r7 = r5.length
            if (r6 != r7) goto L22
            r17.flush()
        L22:
            float r6 = r19 + r1
            float r7 = r20 + r2
            float r8 = -r1
            float r9 = -r2
            float r1 = r23 - r1
            float r2 = r24 - r2
            r10 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r25 > r10 ? 1 : (r25 == r10 ? 0 : -1))
            if (r11 != 0) goto L36
            int r10 = (r26 > r10 ? 1 : (r26 == r10 ? 0 : -1))
            if (r10 == 0) goto L3e
        L36:
            float r8 = r8 * r25
            float r9 = r9 * r26
            float r1 = r1 * r25
            float r2 = r2 * r26
        L3e:
            r10 = 0
            int r10 = (r27 > r10 ? 1 : (r27 == r10 ? 0 : -1))
            if (r10 == 0) goto L71
            float r10 = com.badlogic.gdx.math.MathUtils.cosDeg(r27)
            float r11 = com.badlogic.gdx.math.MathUtils.sinDeg(r27)
            float r12 = r10 * r8
            float r13 = r11 * r9
            float r13 = r12 - r13
            float r8 = r8 * r11
            float r9 = r9 * r10
            float r9 = r9 + r8
            float r14 = r11 * r2
            float r12 = r12 - r14
            float r2 = r2 * r10
            float r8 = r8 + r2
            float r10 = r10 * r1
            float r10 = r10 - r14
            float r11 = r11 * r1
            float r2 = r2 + r11
            float r1 = r10 - r12
            float r1 = r1 + r13
            float r11 = r8 - r9
            float r11 = r2 - r11
            r16 = r2
            r2 = r1
            r1 = r10
            r10 = r9
            r9 = r16
            goto L78
        L71:
            r12 = r8
            r13 = r12
            r10 = r9
            r11 = r10
            r8 = r2
            r9 = r8
            r2 = r1
        L78:
            float r13 = r13 + r6
            float r10 = r10 + r7
            float r12 = r12 + r6
            float r8 = r8 + r7
            float r1 = r1 + r6
            float r9 = r9 + r7
            float r2 = r2 + r6
            float r11 = r11 + r7
            float r6 = (float) r3
            float r7 = r0.invTexWidth
            float r6 = r6 * r7
            int r14 = r4 + r31
            float r14 = (float) r14
            float r15 = r0.invTexHeight
            float r14 = r14 * r15
            int r3 = r3 + r30
            float r3 = (float) r3
            float r3 = r3 * r7
            float r4 = (float) r4
            float r4 = r4 * r15
            if (r32 == 0) goto L9b
            r16 = r6
            r6 = r3
            r3 = r16
        L9b:
            if (r33 == 0) goto La2
            r16 = r14
            r14 = r4
            r4 = r16
        La2:
            float r7 = r0.colorPacked
            int r15 = r0.idx
            r5[r15] = r13
            int r13 = r15 + 1
            r5[r13] = r10
            int r10 = r15 + 2
            r5[r10] = r7
            int r10 = r15 + 3
            r5[r10] = r6
            int r10 = r15 + 4
            r5[r10] = r14
            int r10 = r15 + 5
            r5[r10] = r12
            int r10 = r15 + 6
            r5[r10] = r8
            int r8 = r15 + 7
            r5[r8] = r7
            int r8 = r15 + 8
            r5[r8] = r6
            int r6 = r15 + 9
            r5[r6] = r4
            int r6 = r15 + 10
            r5[r6] = r1
            int r1 = r15 + 11
            r5[r1] = r9
            int r1 = r15 + 12
            r5[r1] = r7
            int r1 = r15 + 13
            r5[r1] = r3
            int r1 = r15 + 14
            r5[r1] = r4
            int r1 = r15 + 15
            r5[r1] = r2
            int r1 = r15 + 16
            r5[r1] = r11
            int r1 = r15 + 17
            r5[r1] = r7
            int r1 = r15 + 18
            r5[r1] = r3
            int r1 = r15 + 19
            r5[r1] = r14
            int r15 = r15 + 20
            r0.idx = r15
            return
        Lf9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "SpriteBatch.begin must be called before draw."
            r1.<init>(r2)
            throw r1
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(com.badlogic.gdx.graphics.Texture r4, float[] r5, int r6, int r7) {
            r3 = this;
            boolean r0 = r3.drawing
            if (r0 == 0) goto L41
            float[] r0 = r3.vertices
            int r0 = r0.length
            com.badlogic.gdx.graphics.Texture r1 = r3.lastTexture
            if (r4 == r1) goto Lf
            r3.switchTexture(r4)
            goto L18
        Lf:
            int r4 = r3.idx
            int r4 = r0 - r4
            if (r4 != 0) goto L19
            r3.flush()
        L18:
            r4 = r0
        L19:
            int r4 = java.lang.Math.min(r4, r7)
            float[] r1 = r3.vertices
            int r2 = r3.idx
            java.lang.System.arraycopy(r5, r6, r1, r2, r4)
            int r1 = r3.idx
            int r1 = r1 + r4
            r3.idx = r1
        L29:
            int r7 = r7 - r4
            if (r7 <= 0) goto L40
            int r6 = r6 + r4
            r3.flush()
            int r4 = java.lang.Math.min(r0, r7)
            float[] r1 = r3.vertices
            r2 = 0
            java.lang.System.arraycopy(r5, r6, r1, r2, r4)
            int r1 = r3.idx
            int r1 = r1 + r4
            r3.idx = r1
            goto L29
        L40:
            return
        L41:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "SpriteBatch.begin must be called before draw."
            r4.<init>(r5)
            throw r4
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(com.badlogic.gdx.graphics.g2d.TextureRegion r8, float r9, float r10) {
            r7 = this;
            int r0 = r8.getRegionWidth()
            float r5 = (float) r0
            int r0 = r8.getRegionHeight()
            float r6 = (float) r0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.draw(r2, r3, r4, r5, r6)
            return
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(com.badlogic.gdx.graphics.g2d.TextureRegion r8, float r9, float r10, float r11, float r12) {
            r7 = this;
            boolean r0 = r7.drawing
            if (r0 == 0) goto L79
            float[] r0 = r7.vertices
            com.badlogic.gdx.graphics.Texture r1 = r8.texture
            com.badlogic.gdx.graphics.Texture r2 = r7.lastTexture
            if (r1 == r2) goto L10
            r7.switchTexture(r1)
            goto L18
        L10:
            int r1 = r7.idx
            int r2 = r0.length
            if (r1 != r2) goto L18
            r7.flush()
        L18:
            float r11 = r11 + r9
            float r12 = r12 + r10
            float r1 = r8.u
            float r2 = r8.v2
            float r3 = r8.u2
            float r8 = r8.v
            float r4 = r7.colorPacked
            int r5 = r7.idx
            r0[r5] = r9
            int r6 = r5 + 1
            r0[r6] = r10
            int r6 = r5 + 2
            r0[r6] = r4
            int r6 = r5 + 3
            r0[r6] = r1
            int r6 = r5 + 4
            r0[r6] = r2
            int r6 = r5 + 5
            r0[r6] = r9
            int r9 = r5 + 6
            r0[r9] = r12
            int r9 = r5 + 7
            r0[r9] = r4
            int r9 = r5 + 8
            r0[r9] = r1
            int r9 = r5 + 9
            r0[r9] = r8
            int r9 = r5 + 10
            r0[r9] = r11
            int r9 = r5 + 11
            r0[r9] = r12
            int r9 = r5 + 12
            r0[r9] = r4
            int r9 = r5 + 13
            r0[r9] = r3
            int r9 = r5 + 14
            r0[r9] = r8
            int r8 = r5 + 15
            r0[r8] = r11
            int r8 = r5 + 16
            r0[r8] = r10
            int r8 = r5 + 17
            r0[r8] = r4
            int r8 = r5 + 18
            r0[r8] = r3
            int r8 = r5 + 19
            r0[r8] = r2
            int r5 = r5 + 20
            r7.idx = r5
            return
        L79:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "SpriteBatch.begin must be called before draw."
            r8.<init>(r9)
            throw r8
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(com.badlogic.gdx.graphics.g2d.TextureRegion r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r21
            r3 = r22
            boolean r4 = r0.drawing
            if (r4 == 0) goto Ldd
            float[] r4 = r0.vertices
            com.badlogic.gdx.graphics.Texture r5 = r1.texture
            com.badlogic.gdx.graphics.Texture r6 = r0.lastTexture
            if (r5 == r6) goto L18
            r0.switchTexture(r5)
            goto L20
        L18:
            int r5 = r0.idx
            int r6 = r4.length
            if (r5 != r6) goto L20
            r17.flush()
        L20:
            float r5 = r19 + r2
            float r6 = r20 + r3
            float r7 = -r2
            float r8 = -r3
            float r2 = r23 - r2
            float r3 = r24 - r3
            r9 = 1065353216(0x3f800000, float:1.0)
            int r10 = (r25 > r9 ? 1 : (r25 == r9 ? 0 : -1))
            if (r10 != 0) goto L34
            int r9 = (r26 > r9 ? 1 : (r26 == r9 ? 0 : -1))
            if (r9 == 0) goto L3c
        L34:
            float r7 = r7 * r25
            float r8 = r8 * r26
            float r2 = r2 * r25
            float r3 = r3 * r26
        L3c:
            r9 = 0
            int r9 = (r27 > r9 ? 1 : (r27 == r9 ? 0 : -1))
            if (r9 == 0) goto L6f
            float r9 = com.badlogic.gdx.math.MathUtils.cosDeg(r27)
            float r10 = com.badlogic.gdx.math.MathUtils.sinDeg(r27)
            float r11 = r9 * r7
            float r12 = r10 * r8
            float r12 = r11 - r12
            float r7 = r7 * r10
            float r8 = r8 * r9
            float r8 = r8 + r7
            float r13 = r10 * r3
            float r11 = r11 - r13
            float r3 = r3 * r9
            float r7 = r7 + r3
            float r9 = r9 * r2
            float r9 = r9 - r13
            float r10 = r10 * r2
            float r3 = r3 + r10
            float r2 = r9 - r11
            float r2 = r2 + r12
            float r10 = r7 - r8
            float r10 = r3 - r10
            r16 = r3
            r3 = r2
            r2 = r9
            r9 = r8
            r8 = r16
            goto L76
        L6f:
            r11 = r7
            r12 = r11
            r9 = r8
            r10 = r9
            r7 = r3
            r8 = r7
            r3 = r2
        L76:
            float r12 = r12 + r5
            float r9 = r9 + r6
            float r11 = r11 + r5
            float r7 = r7 + r6
            float r2 = r2 + r5
            float r8 = r8 + r6
            float r3 = r3 + r5
            float r10 = r10 + r6
            float r5 = r1.u
            float r6 = r1.v2
            float r13 = r1.u2
            float r1 = r1.v
            float r14 = r0.colorPacked
            int r15 = r0.idx
            r4[r15] = r12
            int r12 = r15 + 1
            r4[r12] = r9
            int r9 = r15 + 2
            r4[r9] = r14
            int r9 = r15 + 3
            r4[r9] = r5
            int r9 = r15 + 4
            r4[r9] = r6
            int r9 = r15 + 5
            r4[r9] = r11
            int r9 = r15 + 6
            r4[r9] = r7
            int r7 = r15 + 7
            r4[r7] = r14
            int r7 = r15 + 8
            r4[r7] = r5
            int r5 = r15 + 9
            r4[r5] = r1
            int r5 = r15 + 10
            r4[r5] = r2
            int r2 = r15 + 11
            r4[r2] = r8
            int r2 = r15 + 12
            r4[r2] = r14
            int r2 = r15 + 13
            r4[r2] = r13
            int r2 = r15 + 14
            r4[r2] = r1
            int r1 = r15 + 15
            r4[r1] = r3
            int r1 = r15 + 16
            r4[r1] = r10
            int r1 = r15 + 17
            r4[r1] = r14
            int r1 = r15 + 18
            r4[r1] = r13
            int r1 = r15 + 19
            r4[r1] = r6
            int r15 = r15 + 20
            r0.idx = r15
            return
        Ldd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "SpriteBatch.begin must be called before draw."
            r1.<init>(r2)
            throw r1
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void enableBlending() {
            r1 = this;
            boolean r0 = r1.blendingDisabled
            if (r0 != 0) goto L5
            return
        L5:
            r1.flush()
            r0 = 0
            r1.blendingDisabled = r0
            return
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void end() {
            r2 = this;
            boolean r0 = r2.drawing
            if (r0 == 0) goto L23
            int r0 = r2.idx
            if (r0 <= 0) goto Lb
            r2.flush()
        Lb:
            r0 = 0
            r2.lastTexture = r0
            r0 = 0
            r2.drawing = r0
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 1
            r0.glDepthMask(r1)
            boolean r1 = r2.isBlendingEnabled()
            if (r1 == 0) goto L22
            r1 = 3042(0xbe2, float:4.263E-42)
            r0.glDisable(r1)
        L22:
            return
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "SpriteBatch.begin must be called before end."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void flush() {
            r8 = this;
            int r0 = r8.idx
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r8.renderCalls
            r2 = 1
            int r1 = r1 + r2
            r8.renderCalls = r1
            int r1 = r8.totalRenderCalls
            int r1 = r1 + r2
            r8.totalRenderCalls = r1
            int r0 = r0 / 20
            int r1 = r8.maxSpritesInBatch
            if (r0 <= r1) goto L18
            r8.maxSpritesInBatch = r0
        L18:
            int r0 = r0 * 6
            com.badlogic.gdx.graphics.Texture r1 = r8.lastTexture
            r1.bind()
            com.badlogic.gdx.graphics.Mesh r1 = r8.mesh
            float[] r3 = r8.vertices
            int r4 = r8.idx
            r5 = 0
            r1.setVertices(r3, r5, r4)
            java.nio.ShortBuffer r2 = r1.getIndicesBuffer(r2)
            r2.position(r5)
            r2.limit(r0)
            boolean r2 = r8.blendingDisabled
            r3 = 3042(0xbe2, float:4.263E-42)
            if (r2 == 0) goto L3f
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r2.glDisable(r3)
            goto L54
        L3f:
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r2.glEnable(r3)
            int r2 = r8.blendSrcFunc
            r3 = -1
            if (r2 == r3) goto L54
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            int r4 = r8.blendDstFunc
            int r6 = r8.blendSrcFuncAlpha
            int r7 = r8.blendDstFuncAlpha
            r3.glBlendFuncSeparate(r2, r4, r6, r7)
        L54:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r8.customShader
            if (r2 == 0) goto L59
            goto L5b
        L59:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r8.shader
        L5b:
            r3 = 4
            r1.render(r2, r3, r5, r0)
            r8.idx = r5
            return
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public com.badlogic.gdx.graphics.Color getColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            return r0
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public float getPackedColor() {
            r1 = this;
            float r0 = r1.colorPacked
            return r0
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public com.badlogic.gdx.math.Matrix4 getProjectionMatrix() {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.projectionMatrix
            return r0
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public com.badlogic.gdx.math.Matrix4 getTransformMatrix() {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.transformMatrix
            return r0
    }

    public boolean isBlendingEnabled() {
            r1 = this;
            boolean r0 = r1.blendingDisabled
            r0 = r0 ^ 1
            return r0
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public boolean isDrawing() {
            r1 = this;
            boolean r0 = r1.drawing
            return r0
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setBlendFunction(int r1, int r2) {
            r0 = this;
            r0.setBlendFunctionSeparate(r1, r2, r1, r2)
            return
    }

    public void setBlendFunctionSeparate(int r2, int r3, int r4, int r5) {
            r1 = this;
            int r0 = r1.blendSrcFunc
            if (r0 != r2) goto L11
            int r0 = r1.blendDstFunc
            if (r0 != r3) goto L11
            int r0 = r1.blendSrcFuncAlpha
            if (r0 != r4) goto L11
            int r0 = r1.blendDstFuncAlpha
            if (r0 != r5) goto L11
            return
        L11:
            r1.flush()
            r1.blendSrcFunc = r2
            r1.blendDstFunc = r3
            r1.blendSrcFuncAlpha = r4
            r1.blendDstFuncAlpha = r5
            return
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setColor(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            r0.set(r2, r3, r4, r5)
            com.badlogic.gdx.graphics.Color r2 = r1.color
            float r2 = r2.toFloatBits()
            r1.colorPacked = r2
            return
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            r0.set(r2)
            float r2 = r2.toFloatBits()
            r1.colorPacked = r2
            return
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setPackedColor(float r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            com.badlogic.gdx.graphics.Color.abgr8888ToColor(r0, r2)
            r1.colorPacked = r2
            return
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setProjectionMatrix(com.badlogic.gdx.math.Matrix4 r2) {
            r1 = this;
            boolean r0 = r1.drawing
            if (r0 == 0) goto L7
            r1.flush()
        L7:
            com.badlogic.gdx.math.Matrix4 r0 = r1.projectionMatrix
            r0.set(r2)
            boolean r2 = r1.drawing
            if (r2 == 0) goto L13
            r1.setupMatrices()
        L13:
            return
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setShader(com.badlogic.gdx.graphics.glutils.ShaderProgram r2) {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r1.customShader
            if (r2 != r0) goto L5
            return
        L5:
            boolean r0 = r1.drawing
            if (r0 == 0) goto Lc
            r1.flush()
        Lc:
            r1.customShader = r2
            boolean r0 = r1.drawing
            if (r0 == 0) goto L20
            if (r2 == 0) goto L18
            r2.bind()
            goto L1d
        L18:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r1.shader
            r2.bind()
        L1d:
            r1.setupMatrices()
        L20:
            return
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setTransformMatrix(com.badlogic.gdx.math.Matrix4 r2) {
            r1 = this;
            boolean r0 = r1.drawing
            if (r0 == 0) goto L7
            r1.flush()
        L7:
            com.badlogic.gdx.math.Matrix4 r0 = r1.transformMatrix
            r0.set(r2)
            boolean r2 = r1.drawing
            if (r2 == 0) goto L13
            r1.setupMatrices()
        L13:
            return
    }

    protected void setupMatrices() {
            r5 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r5.combinedMatrix
            com.badlogic.gdx.math.Matrix4 r1 = r5.projectionMatrix
            com.badlogic.gdx.math.Matrix4 r0 = r0.set(r1)
            com.badlogic.gdx.math.Matrix4 r1 = r5.transformMatrix
            r0.mul(r1)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r5.customShader
            r1 = 0
            java.lang.String r2 = "u_texture"
            java.lang.String r3 = "u_projTrans"
            if (r0 == 0) goto L21
            com.badlogic.gdx.math.Matrix4 r4 = r5.combinedMatrix
            r0.setUniformMatrix(r3, r4)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r5.customShader
            r0.setUniformi(r2, r1)
            goto L2d
        L21:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r5.shader
            com.badlogic.gdx.math.Matrix4 r4 = r5.combinedMatrix
            r0.setUniformMatrix(r3, r4)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r5.shader
            r0.setUniformi(r2, r1)
        L2d:
            return
    }

    protected void switchTexture(com.badlogic.gdx.graphics.Texture r3) {
            r2 = this;
            r2.flush()
            r2.lastTexture = r3
            int r0 = r3.getWidth()
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 / r0
            r2.invTexWidth = r0
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r1 = r1 / r3
            r2.invTexHeight = r1
            return
    }
}
