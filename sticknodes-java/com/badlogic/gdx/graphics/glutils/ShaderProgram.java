package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class ShaderProgram implements com.badlogic.gdx.utils.Disposable {
    static final java.nio.IntBuffer intbuf = null;
    public static boolean pedantic = true;
    public static java.lang.String prependFragmentCode = "";
    public static java.lang.String prependVertexCode = "";
    private static final com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.ShaderProgram>> shaders = null;
    private java.lang.String[] attributeNames;
    private final com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> attributeSizes;
    private final com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> attributeTypes;
    private final com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> attributes;
    private int fragmentShaderHandle;
    private final java.lang.String fragmentShaderSource;
    private boolean invalidated;
    private boolean isCompiled;
    private java.lang.String log;
    private final java.nio.FloatBuffer matrix;
    java.nio.IntBuffer params;
    private int program;
    private int refCount;
    java.nio.IntBuffer type;
    private java.lang.String[] uniformNames;
    private final com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> uniformSizes;
    private final com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> uniformTypes;
    private final com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> uniforms;
    private int vertexShaderHandle;
    private final java.lang.String vertexShaderSource;

    static {
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            r0.<init>()
            com.badlogic.gdx.graphics.glutils.ShaderProgram.shaders = r0
            r0 = 1
            java.nio.IntBuffer r0 = com.badlogic.gdx.utils.BufferUtils.newIntBuffer(r0)
            com.badlogic.gdx.graphics.glutils.ShaderProgram.intbuf = r0
            return
    }

    public ShaderProgram(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.log = r0
            com.badlogic.gdx.utils.ObjectIntMap r0 = new com.badlogic.gdx.utils.ObjectIntMap
            r0.<init>()
            r2.uniforms = r0
            com.badlogic.gdx.utils.ObjectIntMap r0 = new com.badlogic.gdx.utils.ObjectIntMap
            r0.<init>()
            r2.uniformTypes = r0
            com.badlogic.gdx.utils.ObjectIntMap r0 = new com.badlogic.gdx.utils.ObjectIntMap
            r0.<init>()
            r2.uniformSizes = r0
            com.badlogic.gdx.utils.ObjectIntMap r0 = new com.badlogic.gdx.utils.ObjectIntMap
            r0.<init>()
            r2.attributes = r0
            com.badlogic.gdx.utils.ObjectIntMap r0 = new com.badlogic.gdx.utils.ObjectIntMap
            r0.<init>()
            r2.attributeTypes = r0
            com.badlogic.gdx.utils.ObjectIntMap r0 = new com.badlogic.gdx.utils.ObjectIntMap
            r0.<init>()
            r2.attributeSizes = r0
            r0 = 0
            r2.refCount = r0
            r0 = 1
            java.nio.IntBuffer r1 = com.badlogic.gdx.utils.BufferUtils.newIntBuffer(r0)
            r2.params = r1
            java.nio.IntBuffer r0 = com.badlogic.gdx.utils.BufferUtils.newIntBuffer(r0)
            r2.type = r0
            if (r3 == 0) goto La4
            if (r4 == 0) goto L9c
            java.lang.String r0 = com.badlogic.gdx.graphics.glutils.ShaderProgram.prependVertexCode
            if (r0 == 0) goto L60
            int r0 = r0.length()
            if (r0 <= 0) goto L60
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.badlogic.gdx.graphics.glutils.ShaderProgram.prependVertexCode
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L60:
            java.lang.String r0 = com.badlogic.gdx.graphics.glutils.ShaderProgram.prependFragmentCode
            if (r0 == 0) goto L7b
            int r0 = r0.length()
            if (r0 <= 0) goto L7b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.badlogic.gdx.graphics.glutils.ShaderProgram.prependFragmentCode
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L7b:
            r2.vertexShaderSource = r3
            r2.fragmentShaderSource = r4
            r0 = 16
            java.nio.FloatBuffer r0 = com.badlogic.gdx.utils.BufferUtils.newFloatBuffer(r0)
            r2.matrix = r0
            r2.compileShaders(r3, r4)
            boolean r3 = r2.isCompiled()
            if (r3 == 0) goto L9b
            r2.fetchAttributes()
            r2.fetchUniforms()
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            r2.addManagedShader(r3, r2)
        L9b:
            return
        L9c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "fragment shader must not be null"
            r3.<init>(r4)
            throw r3
        La4:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "vertex shader must not be null"
            r3.<init>(r4)
            throw r3
    }

    private void addManagedShader(com.badlogic.gdx.Application r3, com.badlogic.gdx.graphics.glutils.ShaderProgram r4) {
            r2 = this;
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.ShaderProgram>> r0 = com.badlogic.gdx.graphics.glutils.ShaderProgram.shaders
            java.lang.Object r1 = r0.get(r3)
            com.badlogic.gdx.utils.Array r1 = (com.badlogic.gdx.utils.Array) r1
            if (r1 != 0) goto Lf
            com.badlogic.gdx.utils.Array r1 = new com.badlogic.gdx.utils.Array
            r1.<init>()
        Lf:
            r1.add(r4)
            r0.put(r3, r1)
            return
    }

    private void checkManaged() {
            r2 = this;
            boolean r0 = r2.invalidated
            if (r0 == 0) goto Le
            java.lang.String r0 = r2.vertexShaderSource
            java.lang.String r1 = r2.fragmentShaderSource
            r2.compileShaders(r0, r1)
            r0 = 0
            r2.invalidated = r0
        Le:
            return
    }

    public static void clearAllShaderPrograms(com.badlogic.gdx.Application r1) {
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.ShaderProgram>> r0 = com.badlogic.gdx.graphics.glutils.ShaderProgram.shaders
            r0.remove(r1)
            return
    }

    private void compileShaders(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = 35633(0x8b31, float:4.9932E-41)
            int r3 = r2.loadShader(r0, r3)
            r2.vertexShaderHandle = r3
            r3 = 35632(0x8b30, float:4.9931E-41)
            int r3 = r2.loadShader(r3, r4)
            r2.fragmentShaderHandle = r3
            int r4 = r2.vertexShaderHandle
            r0 = 0
            r1 = -1
            if (r4 == r1) goto L2e
            if (r3 != r1) goto L1b
            goto L2e
        L1b:
            int r3 = r2.createProgram()
            int r3 = r2.linkProgram(r3)
            r2.program = r3
            if (r3 != r1) goto L2a
            r2.isCompiled = r0
            return
        L2a:
            r3 = 1
            r2.isCompiled = r3
            return
        L2e:
            r2.isCompiled = r0
            return
    }

    private int fetchAttributeLocation(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> r1 = r3.attributes
            r2 = -2
            int r1 = r1.get(r4, r2)
            if (r1 != r2) goto L16
            int r1 = r3.program
            int r1 = r0.glGetAttribLocation(r1, r4)
            com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> r0 = r3.attributes
            r0.put(r4, r1)
        L16:
            return r1
    }

    private void fetchAttributes() {
            r7 = this;
            java.nio.IntBuffer r0 = r7.params
            r0.clear()
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r1 = r7.program
            java.nio.IntBuffer r2 = r7.params
            r3 = 35721(0x8b89, float:5.0056E-41)
            r0.glGetProgramiv(r1, r3, r2)
            java.nio.IntBuffer r0 = r7.params
            r1 = 0
            int r0 = r0.get(r1)
            java.lang.String[] r2 = new java.lang.String[r0]
            r7.attributeNames = r2
            r2 = 0
        L1d:
            if (r2 >= r0) goto L65
            java.nio.IntBuffer r3 = r7.params
            r3.clear()
            java.nio.IntBuffer r3 = r7.params
            r4 = 1
            r3.put(r1, r4)
            java.nio.IntBuffer r3 = r7.type
            r3.clear()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl20
            int r4 = r7.program
            java.nio.IntBuffer r5 = r7.params
            java.nio.IntBuffer r6 = r7.type
            java.lang.String r3 = r3.glGetActiveAttrib(r4, r2, r5, r6)
            com.badlogic.gdx.graphics.GL20 r4 = com.badlogic.gdx.Gdx.gl20
            int r5 = r7.program
            int r4 = r4.glGetAttribLocation(r5, r3)
            com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> r5 = r7.attributes
            r5.put(r3, r4)
            com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> r4 = r7.attributeTypes
            java.nio.IntBuffer r5 = r7.type
            int r5 = r5.get(r1)
            r4.put(r3, r5)
            com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> r4 = r7.attributeSizes
            java.nio.IntBuffer r5 = r7.params
            int r5 = r5.get(r1)
            r4.put(r3, r5)
            java.lang.String[] r4 = r7.attributeNames
            r4[r2] = r3
            int r2 = r2 + 1
            goto L1d
        L65:
            return
    }

    private int fetchUniformLocation(java.lang.String r2) {
            r1 = this;
            boolean r0 = com.badlogic.gdx.graphics.glutils.ShaderProgram.pedantic
            int r2 = r1.fetchUniformLocation(r2, r0)
            return r2
    }

    private void fetchUniforms() {
            r7 = this;
            java.nio.IntBuffer r0 = r7.params
            r0.clear()
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r1 = r7.program
            java.nio.IntBuffer r2 = r7.params
            r3 = 35718(0x8b86, float:5.0052E-41)
            r0.glGetProgramiv(r1, r3, r2)
            java.nio.IntBuffer r0 = r7.params
            r1 = 0
            int r0 = r0.get(r1)
            java.lang.String[] r2 = new java.lang.String[r0]
            r7.uniformNames = r2
            r2 = 0
        L1d:
            if (r2 >= r0) goto L65
            java.nio.IntBuffer r3 = r7.params
            r3.clear()
            java.nio.IntBuffer r3 = r7.params
            r4 = 1
            r3.put(r1, r4)
            java.nio.IntBuffer r3 = r7.type
            r3.clear()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl20
            int r4 = r7.program
            java.nio.IntBuffer r5 = r7.params
            java.nio.IntBuffer r6 = r7.type
            java.lang.String r3 = r3.glGetActiveUniform(r4, r2, r5, r6)
            com.badlogic.gdx.graphics.GL20 r4 = com.badlogic.gdx.Gdx.gl20
            int r5 = r7.program
            int r4 = r4.glGetUniformLocation(r5, r3)
            com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> r5 = r7.uniforms
            r5.put(r3, r4)
            com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> r4 = r7.uniformTypes
            java.nio.IntBuffer r5 = r7.type
            int r5 = r5.get(r1)
            r4.put(r3, r5)
            com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> r4 = r7.uniformSizes
            java.nio.IntBuffer r5 = r7.params
            int r5 = r5.get(r1)
            r4.put(r3, r5)
            java.lang.String[] r4 = r7.uniformNames
            r4[r2] = r3
            int r2 = r2 + 1
            goto L1d
        L65:
            return
    }

    public static java.lang.String getManagedStatus() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Managed shaders/app: { "
            r0.append(r1)
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.ShaderProgram>> r1 = com.badlogic.gdx.graphics.glutils.ShaderProgram.shaders
            com.badlogic.gdx.utils.ObjectMap$Keys r1 = r1.keys()
            com.badlogic.gdx.utils.ObjectMap$Keys r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            com.badlogic.gdx.Application r2 = (com.badlogic.gdx.Application) r2
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.ShaderProgram>> r3 = com.badlogic.gdx.graphics.glutils.ShaderProgram.shaders
            java.lang.Object r2 = r3.get(r2)
            com.badlogic.gdx.utils.Array r2 = (com.badlogic.gdx.utils.Array) r2
            int r2 = r2.size
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            goto L14
        L33:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static void invalidateAllShaderPrograms(com.badlogic.gdx.Application r3) {
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.ShaderProgram>> r0 = com.badlogic.gdx.graphics.glutils.ShaderProgram.shaders
            java.lang.Object r3 = r0.get(r3)
            com.badlogic.gdx.utils.Array r3 = (com.badlogic.gdx.utils.Array) r3
            if (r3 != 0) goto L10
            return
        L10:
            r0 = 0
        L11:
            int r1 = r3.size
            if (r0 >= r1) goto L2a
            java.lang.Object r1 = r3.get(r0)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r1
            r2 = 1
            r1.invalidated = r2
            java.lang.Object r1 = r3.get(r0)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r1
            r1.checkManaged()
            int r0 = r0 + 1
            goto L11
        L2a:
            return
    }

    private int linkProgram(int r5) {
            r4 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r1 = -1
            if (r5 != r1) goto L6
            return r1
        L6:
            int r2 = r4.vertexShaderHandle
            r0.glAttachShader(r5, r2)
            int r2 = r4.fragmentShaderHandle
            r0.glAttachShader(r5, r2)
            r0.glLinkProgram(r5)
            r2 = 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            r2.order(r3)
            java.nio.IntBuffer r2 = r2.asIntBuffer()
            r3 = 35714(0x8b82, float:5.0046E-41)
            r0.glGetProgramiv(r5, r3, r2)
            r0 = 0
            int r0 = r2.get(r0)
            if (r0 != 0) goto L39
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            java.lang.String r5 = r0.glGetProgramInfoLog(r5)
            r4.log = r5
            return r1
        L39:
            return r5
    }

    private int loadShader(int r5, java.lang.String r6) {
            r4 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r1 = 1
            java.nio.IntBuffer r1 = com.badlogic.gdx.utils.BufferUtils.newIntBuffer(r1)
            int r2 = r0.glCreateShader(r5)
            r3 = -1
            if (r2 != 0) goto Lf
            return r3
        Lf:
            r0.glShaderSource(r2, r6)
            r0.glCompileShader(r2)
            r6 = 35713(0x8b81, float:5.0045E-41)
            r0.glGetShaderiv(r2, r6, r1)
            r6 = 0
            int r6 = r1.get(r6)
            if (r6 != 0) goto L57
            java.lang.String r6 = r0.glGetShaderInfoLog(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.log
            r0.append(r1)
            r1 = 35633(0x8b31, float:4.9932E-41)
            if (r5 != r1) goto L38
            java.lang.String r5 = "Vertex shader\n"
            goto L3a
        L38:
            java.lang.String r5 = "Fragment shader:\n"
        L3a:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.log = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r4.log
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.log = r5
            return r3
        L57:
            return r2
    }

    @java.lang.Deprecated
    public void begin() {
            r0 = this;
            r0.bind()
            return
    }

    public void bind() {
            r2 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r2.checkManaged()
            int r1 = r2.program
            r0.glUseProgram(r1)
            return
    }

    protected int createProgram() {
            r1 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r0 = r0.glCreateProgram()
            if (r0 == 0) goto L9
            goto La
        L9:
            r0 = -1
        La:
            return r0
    }

    public void disableVertexAttribute(int r2) {
            r1 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r1.checkManaged()
            r0.glDisableVertexAttribArray(r2)
            return
    }

    public void disableVertexAttribute(java.lang.String r3) {
            r2 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r2.checkManaged()
            int r3 = r2.fetchAttributeLocation(r3)
            r1 = -1
            if (r3 != r1) goto Ld
            return
        Ld:
            r0.glDisableVertexAttribArray(r3)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r1 = 0
            r0.glUseProgram(r1)
            int r1 = r2.vertexShaderHandle
            r0.glDeleteShader(r1)
            int r1 = r2.fragmentShaderHandle
            r0.glDeleteShader(r1)
            int r1 = r2.program
            r0.glDeleteProgram(r1)
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.ShaderProgram>> r0 = com.badlogic.gdx.graphics.glutils.ShaderProgram.shaders
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L2b
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.Object r0 = r0.get(r1)
            com.badlogic.gdx.utils.Array r0 = (com.badlogic.gdx.utils.Array) r0
            r1 = 1
            r0.removeValue(r2, r1)
        L2b:
            return
    }

    public void enableVertexAttribute(int r2) {
            r1 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r1.checkManaged()
            r0.glEnableVertexAttribArray(r2)
            return
    }

    @java.lang.Deprecated
    public void end() {
            r0 = this;
            return
    }

    public int fetchUniformLocation(java.lang.String r3, boolean r4) {
            r2 = this;
            com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> r0 = r2.uniforms
            r1 = -2
            int r0 = r0.get(r3, r1)
            if (r0 != r1) goto L56
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r1 = r2.program
            int r0 = r0.glGetUniformLocation(r1, r3)
            r1 = -1
            if (r0 != r1) goto L51
            if (r4 == 0) goto L51
            boolean r4 = r2.isCompiled
            if (r4 == 0) goto L36
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No uniform with name '"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "' in shader"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L36:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "An attempted fetch uniform from uncompiled shader \n"
            r4.append(r0)
            java.lang.String r0 = r2.getLog()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L51:
            com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> r4 = r2.uniforms
            r4.put(r3, r0)
        L56:
            return r0
    }

    public int getAttributeLocation(java.lang.String r3) {
            r2 = this;
            com.badlogic.gdx.utils.ObjectIntMap<java.lang.String> r0 = r2.attributes
            r1 = -1
            int r3 = r0.get(r3, r1)
            return r3
    }

    public java.lang.String getLog() {
            r2 = this;
            boolean r0 = r2.isCompiled
            if (r0 == 0) goto Lf
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r1 = r2.program
            java.lang.String r0 = r0.glGetProgramInfoLog(r1)
            r2.log = r0
            return r0
        Lf:
            java.lang.String r0 = r2.log
            return r0
    }

    public boolean isCompiled() {
            r1 = this;
            boolean r0 = r1.isCompiled
            return r0
    }

    public void setUniformMatrix(int r7, com.badlogic.gdx.math.Matrix4 r8, boolean r9) {
            r6 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r6.checkManaged()
            float[] r4 = r8.val
            r2 = 1
            r5 = 0
            r1 = r7
            r3 = r9
            r0.glUniformMatrix4fv(r1, r2, r3, r4, r5)
            return
    }

    public void setUniformMatrix(java.lang.String r2, com.badlogic.gdx.math.Matrix4 r3) {
            r1 = this;
            r0 = 0
            r1.setUniformMatrix(r2, r3, r0)
            return
    }

    public void setUniformMatrix(java.lang.String r1, com.badlogic.gdx.math.Matrix4 r2, boolean r3) {
            r0 = this;
            int r1 = r0.fetchUniformLocation(r1)
            r0.setUniformMatrix(r1, r2, r3)
            return
    }

    public void setUniformf(java.lang.String r2, float r3) {
            r1 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r1.checkManaged()
            int r2 = r1.fetchUniformLocation(r2)
            r0.glUniform1f(r2, r3)
            return
    }

    public void setUniformf(java.lang.String r2, float r3, float r4) {
            r1 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r1.checkManaged()
            int r2 = r1.fetchUniformLocation(r2)
            r0.glUniform2f(r2, r3, r4)
            return
    }

    public void setUniformf(java.lang.String r2, float r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r1.checkManaged()
            int r2 = r1.fetchUniformLocation(r2)
            r0.glUniform3f(r2, r3, r4, r5)
            return
    }

    public void setUniformf(java.lang.String r7, float r8, float r9, float r10, float r11) {
            r6 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r6.checkManaged()
            int r1 = r6.fetchUniformLocation(r7)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.glUniform4f(r1, r2, r3, r4, r5)
            return
    }

    public void setUniformi(java.lang.String r2, int r3) {
            r1 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r1.checkManaged()
            int r2 = r1.fetchUniformLocation(r2)
            r0.glUniform1i(r2, r3)
            return
    }

    public void setVertexAttribute(int r8, int r9, int r10, boolean r11, int r12, int r13) {
            r7 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r7.checkManaged()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.glVertexAttribPointer(r1, r2, r3, r4, r5, r6)
            return
    }

    public void setVertexAttribute(int r8, int r9, int r10, boolean r11, int r12, java.nio.Buffer r13) {
            r7 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r7.checkManaged()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.glVertexAttribPointer(r1, r2, r3, r4, r5, r6)
            return
    }
}
