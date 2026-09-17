package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class ImmediateModeRenderer20 implements com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer {
    private final int colorOffset;
    private final int maxVertices;
    private final com.badlogic.gdx.graphics.Mesh mesh;
    private final int normalOffset;
    private int numSetTexCoords;
    private final int numTexCoords;
    private int numVertices;
    private boolean ownsShader;
    private int primitiveType;
    private final com.badlogic.gdx.math.Matrix4 projModelView;
    private com.badlogic.gdx.graphics.glutils.ShaderProgram shader;
    private final java.lang.String[] shaderUniformNames;
    private final int texCoordOffset;
    private int vertexIdx;
    private final int vertexSize;
    private final float[] vertices;

    public ImmediateModeRenderer20(int r7, boolean r8, boolean r9, int r10) {
            r6 = this;
            com.badlogic.gdx.graphics.glutils.ShaderProgram r5 = createDefaultShader(r8, r9, r10)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = 1
            r6.ownsShader = r7
            return
    }

    public ImmediateModeRenderer20(int r2, boolean r3, boolean r4, int r5, com.badlogic.gdx.graphics.glutils.ShaderProgram r6) {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r1.projModelView = r0
            r1.maxVertices = r2
            r1.numTexCoords = r5
            r1.shader = r6
            com.badlogic.gdx.graphics.VertexAttribute[] r3 = r1.buildVertexAttributes(r3, r4, r5)
            com.badlogic.gdx.graphics.Mesh r4 = new com.badlogic.gdx.graphics.Mesh
            r6 = 0
            r4.<init>(r6, r2, r6, r3)
            r1.mesh = r4
            com.badlogic.gdx.graphics.VertexAttributes r3 = r4.getVertexAttributes()
            int r3 = r3.vertexSize
            r0 = 4
            int r3 = r3 / r0
            int r2 = r2 * r3
            float[] r2 = new float[r2]
            r1.vertices = r2
            com.badlogic.gdx.graphics.VertexAttributes r2 = r4.getVertexAttributes()
            int r2 = r2.vertexSize
            int r2 = r2 / r0
            r1.vertexSize = r2
            r2 = 8
            com.badlogic.gdx.graphics.VertexAttribute r3 = r4.getVertexAttribute(r2)
            if (r3 == 0) goto L43
            com.badlogic.gdx.graphics.VertexAttribute r2 = r4.getVertexAttribute(r2)
            int r2 = r2.offset
            int r2 = r2 / r0
            goto L44
        L43:
            r2 = 0
        L44:
            r1.normalOffset = r2
            com.badlogic.gdx.graphics.VertexAttribute r2 = r4.getVertexAttribute(r0)
            if (r2 == 0) goto L54
            com.badlogic.gdx.graphics.VertexAttribute r2 = r4.getVertexAttribute(r0)
            int r2 = r2.offset
            int r2 = r2 / r0
            goto L55
        L54:
            r2 = 0
        L55:
            r1.colorOffset = r2
            r2 = 16
            com.badlogic.gdx.graphics.VertexAttribute r3 = r4.getVertexAttribute(r2)
            if (r3 == 0) goto L67
            com.badlogic.gdx.graphics.VertexAttribute r2 = r4.getVertexAttribute(r2)
            int r2 = r2.offset
            int r2 = r2 / r0
            goto L68
        L67:
            r2 = 0
        L68:
            r1.texCoordOffset = r2
            java.lang.String[] r2 = new java.lang.String[r5]
            r1.shaderUniformNames = r2
        L6e:
            if (r6 >= r5) goto L88
            java.lang.String[] r2 = r1.shaderUniformNames
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "u_sampler"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2[r6] = r3
            int r6 = r6 + 1
            goto L6e
        L88:
            return
    }

    private com.badlogic.gdx.graphics.VertexAttribute[] buildVertexAttributes(boolean r7, boolean r8, int r9) {
            r6 = this;
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            com.badlogic.gdx.graphics.VertexAttribute r1 = new com.badlogic.gdx.graphics.VertexAttribute
            r2 = 1
            r3 = 3
            java.lang.String r4 = "a_position"
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            if (r7 == 0) goto L1f
            com.badlogic.gdx.graphics.VertexAttribute r7 = new com.badlogic.gdx.graphics.VertexAttribute
            r1 = 8
            java.lang.String r2 = "a_normal"
            r7.<init>(r1, r3, r2)
            r0.add(r7)
        L1f:
            if (r8 == 0) goto L2c
            com.badlogic.gdx.graphics.VertexAttribute r7 = new com.badlogic.gdx.graphics.VertexAttribute
            r8 = 4
            java.lang.String r1 = "a_color"
            r7.<init>(r8, r8, r1)
            r0.add(r7)
        L2c:
            r7 = 0
            r8 = 0
        L2e:
            if (r8 >= r9) goto L4f
            com.badlogic.gdx.graphics.VertexAttribute r1 = new com.badlogic.gdx.graphics.VertexAttribute
            r2 = 16
            r3 = 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "a_texCoord"
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            int r8 = r8 + 1
            goto L2e
        L4f:
            int r8 = r0.size
            com.badlogic.gdx.graphics.VertexAttribute[] r8 = new com.badlogic.gdx.graphics.VertexAttribute[r8]
        L53:
            int r9 = r0.size
            if (r7 >= r9) goto L62
            java.lang.Object r9 = r0.get(r7)
            com.badlogic.gdx.graphics.VertexAttribute r9 = (com.badlogic.gdx.graphics.VertexAttribute) r9
            r8[r7] = r9
            int r7 = r7 + 1
            goto L53
        L62:
            return r8
    }

    public static com.badlogic.gdx.graphics.glutils.ShaderProgram createDefaultShader(boolean r1, boolean r2, int r3) {
            java.lang.String r0 = createVertexShader(r1, r2, r3)
            java.lang.String r1 = createFragmentShader(r1, r2, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = new com.badlogic.gdx.graphics.glutils.ShaderProgram
            r2.<init>(r0, r1)
            boolean r1 = r2.isCompiled()
            if (r1 == 0) goto L14
            return r2
        L14:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Error compiling shader: "
            r3.append(r0)
            java.lang.String r2 = r2.getLog()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }

    private static java.lang.String createFragmentShader(boolean r4, boolean r5, int r6) {
            java.lang.String r4 = "#ifdef GL_ES\nprecision mediump float;\n#endif\n"
            if (r5 == 0) goto L15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "varying vec4 v_col;\n"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L15:
            r0 = 0
            r1 = 0
        L17:
            if (r1 >= r6) goto L4c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "varying vec2 v_tex"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = ";\n"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "uniform sampler2D u_sampler"
            r3.append(r2)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            int r1 = r1 + 1
            goto L17
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = "void main() {\n   gl_FragColor = "
            r1.append(r4)
            if (r5 == 0) goto L5e
            java.lang.String r4 = "v_col"
            goto L60
        L5e:
            java.lang.String r4 = "vec4(1, 1, 1, 1)"
        L60:
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            if (r6 <= 0) goto L7a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " * "
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L7a:
            if (r0 >= r6) goto Lc2
            int r5 = r6 + (-1)
            java.lang.String r1 = ",  v_tex"
            java.lang.String r2 = " texture2D(u_sampler"
            if (r0 != r5) goto La2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            r5.append(r0)
            r5.append(r1)
            r5.append(r0)
            java.lang.String r4 = ")"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto Lbf
        La2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            r5.append(r0)
            r5.append(r1)
            r5.append(r0)
            java.lang.String r4 = ") *"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        Lbf:
            int r0 = r0 + 1
            goto L7a
        Lc2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = ";\n}"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            return r4
    }

    private static java.lang.String createVertexShader(boolean r5, boolean r6, int r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "attribute vec4 a_position;\n"
            r0.append(r1)
            java.lang.String r1 = ""
            if (r5 == 0) goto L11
            java.lang.String r5 = "attribute vec3 a_normal;\n"
            goto L12
        L11:
            r5 = r1
        L12:
            r0.append(r5)
            if (r6 == 0) goto L1a
            java.lang.String r5 = "attribute vec4 a_color;\n"
            goto L1b
        L1a:
            r5 = r1
        L1b:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r0 = 0
            r2 = 0
        L24:
            java.lang.String r3 = ";\n"
            if (r2 >= r7) goto L42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r5 = "attribute vec2 a_texCoord"
            r4.append(r5)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r5 = r4.toString()
            int r2 = r2 + 1
            goto L24
        L42:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r5 = "uniform mat4 u_projModelView;\n"
            r2.append(r5)
            if (r6 == 0) goto L53
            java.lang.String r1 = "varying vec4 v_col;\n"
        L53:
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            r1 = 0
        L5b:
            if (r1 >= r7) goto L77
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r5 = "varying vec2 v_tex"
            r2.append(r5)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r5 = r2.toString()
            int r1 = r1 + 1
            goto L5b
        L77:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = "void main() {\n   gl_Position = u_projModelView * a_position;\n"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            if (r6 == 0) goto L9b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "   v_col = a_color;\n   v_col.a *= 255.0 / 254.0;\n"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L9b:
            if (r0 >= r7) goto Lc4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "   v_tex"
            r6.append(r5)
            r6.append(r0)
            java.lang.String r5 = " = "
            r6.append(r5)
            java.lang.String r5 = "a_texCoord"
            r6.append(r5)
            r6.append(r0)
            r6.append(r3)
            java.lang.String r5 = r6.toString()
            int r0 = r0 + 1
            goto L9b
        Lc4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "   gl_PointSize = 1.0;\n}\n"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            return r5
    }

    @Override // com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer
    public void begin(com.badlogic.gdx.math.Matrix4 r2, int r3) {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.projModelView
            r0.set(r2)
            r1.primitiveType = r3
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer
    public void color(float r4) {
            r3 = this;
            float[] r0 = r3.vertices
            int r1 = r3.vertexIdx
            int r2 = r3.colorOffset
            int r1 = r1 + r2
            r0[r1] = r4
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer
    public void color(float r4, float r5, float r6, float r7) {
            r3 = this;
            float[] r0 = r3.vertices
            int r1 = r3.vertexIdx
            int r2 = r3.colorOffset
            int r1 = r1 + r2
            float r4 = com.badlogic.gdx.graphics.Color.toFloatBits(r4, r5, r6, r7)
            r0[r1] = r4
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer
    public void dispose() {
            r1 = this;
            boolean r0 = r1.ownsShader
            if (r0 == 0) goto Lb
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r1.shader
            if (r0 == 0) goto Lb
            r0.dispose()
        Lb:
            com.badlogic.gdx.graphics.Mesh r0 = r1.mesh
            r0.dispose()
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer
    public void end() {
            r0 = this;
            r0.flush()
            return
    }

    public void flush() {
            r4 = this;
            int r0 = r4.numVertices
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r4.shader
            r0.bind()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r4.shader
            com.badlogic.gdx.math.Matrix4 r1 = r4.projModelView
            java.lang.String r2 = "u_projModelView"
            r0.setUniformMatrix(r2, r1)
            r0 = 0
            r1 = 0
        L15:
            int r2 = r4.numTexCoords
            if (r1 >= r2) goto L25
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r4.shader
            java.lang.String[] r3 = r4.shaderUniformNames
            r3 = r3[r1]
            r2.setUniformi(r3, r1)
            int r1 = r1 + 1
            goto L15
        L25:
            com.badlogic.gdx.graphics.Mesh r1 = r4.mesh
            float[] r2 = r4.vertices
            int r3 = r4.vertexIdx
            r1.setVertices(r2, r0, r3)
            com.badlogic.gdx.graphics.Mesh r1 = r4.mesh
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r4.shader
            int r3 = r4.primitiveType
            r1.render(r2, r3)
            r4.numSetTexCoords = r0
            r4.vertexIdx = r0
            r4.numVertices = r0
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer
    public int getMaxVertices() {
            r1 = this;
            int r0 = r1.maxVertices
            return r0
    }

    @Override // com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer
    public int getNumVertices() {
            r1 = this;
            int r0 = r1.numVertices
            return r0
    }

    @Override // com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer
    public void vertex(float r3, float r4, float r5) {
            r2 = this;
            int r0 = r2.vertexIdx
            float[] r1 = r2.vertices
            r1[r0] = r3
            int r3 = r0 + 1
            r1[r3] = r4
            int r3 = r0 + 2
            r1[r3] = r5
            r3 = 0
            r2.numSetTexCoords = r3
            int r3 = r2.vertexSize
            int r0 = r0 + r3
            r2.vertexIdx = r0
            int r3 = r2.numVertices
            int r3 = r3 + 1
            r2.numVertices = r3
            return
    }
}
