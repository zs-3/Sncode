package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public class Mesh implements com.badlogic.gdx.utils.Disposable {
    static final java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Mesh>> meshes = null;
    boolean autoBind;
    final com.badlogic.gdx.graphics.glutils.IndexData indices;
    com.badlogic.gdx.graphics.glutils.InstanceData instances;
    boolean isInstanced;
    final boolean isVertexArray;
    private final com.badlogic.gdx.math.Vector3 tmpV;
    final com.badlogic.gdx.graphics.glutils.VertexData vertices;

    /* renamed from: com.badlogic.gdx.graphics.Mesh$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$graphics$Mesh$VertexDataType = null;

        static {
                com.badlogic.gdx.graphics.Mesh$VertexDataType[] r0 = com.badlogic.gdx.graphics.Mesh.VertexDataType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.badlogic.gdx.graphics.Mesh.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Mesh$VertexDataType = r0
                com.badlogic.gdx.graphics.Mesh$VertexDataType r1 = com.badlogic.gdx.graphics.Mesh.VertexDataType.VertexBufferObject     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.badlogic.gdx.graphics.Mesh.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Mesh$VertexDataType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.badlogic.gdx.graphics.Mesh$VertexDataType r1 = com.badlogic.gdx.graphics.Mesh.VertexDataType.VertexBufferObjectSubData     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.badlogic.gdx.graphics.Mesh.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Mesh$VertexDataType     // Catch: java.lang.NoSuchFieldError -> L28
                com.badlogic.gdx.graphics.Mesh$VertexDataType r1 = com.badlogic.gdx.graphics.Mesh.VertexDataType.VertexBufferObjectWithVAO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.badlogic.gdx.graphics.Mesh.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Mesh$VertexDataType     // Catch: java.lang.NoSuchFieldError -> L33
                com.badlogic.gdx.graphics.Mesh$VertexDataType r1 = com.badlogic.gdx.graphics.Mesh.VertexDataType.VertexArray     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public enum VertexDataType extends java.lang.Enum<com.badlogic.gdx.graphics.Mesh.VertexDataType> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.Mesh.VertexDataType[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.Mesh.VertexDataType VertexArray = null;
        public static final com.badlogic.gdx.graphics.Mesh.VertexDataType VertexBufferObject = null;
        public static final com.badlogic.gdx.graphics.Mesh.VertexDataType VertexBufferObjectSubData = null;
        public static final com.badlogic.gdx.graphics.Mesh.VertexDataType VertexBufferObjectWithVAO = null;

        static {
                com.badlogic.gdx.graphics.Mesh$VertexDataType r0 = new com.badlogic.gdx.graphics.Mesh$VertexDataType
                java.lang.String r1 = "VertexArray"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.graphics.Mesh.VertexDataType.VertexArray = r0
                com.badlogic.gdx.graphics.Mesh$VertexDataType r1 = new com.badlogic.gdx.graphics.Mesh$VertexDataType
                java.lang.String r3 = "VertexBufferObject"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.graphics.Mesh.VertexDataType.VertexBufferObject = r1
                com.badlogic.gdx.graphics.Mesh$VertexDataType r3 = new com.badlogic.gdx.graphics.Mesh$VertexDataType
                java.lang.String r5 = "VertexBufferObjectSubData"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.graphics.Mesh.VertexDataType.VertexBufferObjectSubData = r3
                com.badlogic.gdx.graphics.Mesh$VertexDataType r5 = new com.badlogic.gdx.graphics.Mesh$VertexDataType
                java.lang.String r7 = "VertexBufferObjectWithVAO"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.graphics.Mesh.VertexDataType.VertexBufferObjectWithVAO = r5
                r7 = 4
                com.badlogic.gdx.graphics.Mesh$VertexDataType[] r7 = new com.badlogic.gdx.graphics.Mesh.VertexDataType[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.badlogic.gdx.graphics.Mesh.VertexDataType.$VALUES = r7
                return
        }

        VertexDataType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.graphics.Mesh.VertexDataType valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.Mesh$VertexDataType> r0 = com.badlogic.gdx.graphics.Mesh.VertexDataType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.Mesh$VertexDataType r1 = (com.badlogic.gdx.graphics.Mesh.VertexDataType) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.Mesh.VertexDataType[] values() {
                com.badlogic.gdx.graphics.Mesh$VertexDataType[] r0 = com.badlogic.gdx.graphics.Mesh.VertexDataType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.Mesh$VertexDataType[] r0 = (com.badlogic.gdx.graphics.Mesh.VertexDataType[]) r0
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.badlogic.gdx.graphics.Mesh.meshes = r0
            return
    }

    public Mesh(com.badlogic.gdx.graphics.Mesh.VertexDataType r4, boolean r5, int r6, int r7, com.badlogic.gdx.graphics.VertexAttributes r8) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.autoBind = r0
            r1 = 0
            r3.isInstanced = r1
            com.badlogic.gdx.math.Vector3 r2 = new com.badlogic.gdx.math.Vector3
            r2.<init>()
            r3.tmpV = r2
            int[] r2 = com.badlogic.gdx.graphics.Mesh.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Mesh$VertexDataType
            int r4 = r4.ordinal()
            r4 = r2[r4]
            if (r4 == r0) goto L53
            r2 = 2
            if (r4 == r2) goto L42
            r2 = 3
            if (r4 == r2) goto L31
            com.badlogic.gdx.graphics.glutils.VertexArray r4 = new com.badlogic.gdx.graphics.glutils.VertexArray
            r4.<init>(r6, r8)
            r3.vertices = r4
            com.badlogic.gdx.graphics.glutils.IndexArray r4 = new com.badlogic.gdx.graphics.glutils.IndexArray
            r4.<init>(r7)
            r3.indices = r4
            r3.isVertexArray = r0
            goto L63
        L31:
            com.badlogic.gdx.graphics.glutils.VertexBufferObjectWithVAO r4 = new com.badlogic.gdx.graphics.glutils.VertexBufferObjectWithVAO
            r4.<init>(r5, r6, r8)
            r3.vertices = r4
            com.badlogic.gdx.graphics.glutils.IndexBufferObjectSubData r4 = new com.badlogic.gdx.graphics.glutils.IndexBufferObjectSubData
            r4.<init>(r5, r7)
            r3.indices = r4
            r3.isVertexArray = r1
            goto L63
        L42:
            com.badlogic.gdx.graphics.glutils.VertexBufferObjectSubData r4 = new com.badlogic.gdx.graphics.glutils.VertexBufferObjectSubData
            r4.<init>(r5, r6, r8)
            r3.vertices = r4
            com.badlogic.gdx.graphics.glutils.IndexBufferObjectSubData r4 = new com.badlogic.gdx.graphics.glutils.IndexBufferObjectSubData
            r4.<init>(r5, r7)
            r3.indices = r4
            r3.isVertexArray = r1
            goto L63
        L53:
            com.badlogic.gdx.graphics.glutils.VertexBufferObject r4 = new com.badlogic.gdx.graphics.glutils.VertexBufferObject
            r4.<init>(r5, r6, r8)
            r3.vertices = r4
            com.badlogic.gdx.graphics.glutils.IndexBufferObject r4 = new com.badlogic.gdx.graphics.glutils.IndexBufferObject
            r4.<init>(r5, r7)
            r3.indices = r4
            r3.isVertexArray = r1
        L63:
            com.badlogic.gdx.Application r4 = com.badlogic.gdx.Gdx.app
            addManagedMesh(r4, r3)
            return
    }

    public Mesh(com.badlogic.gdx.graphics.Mesh.VertexDataType r7, boolean r8, int r9, int r10, com.badlogic.gdx.graphics.VertexAttribute... r11) {
            r6 = this;
            com.badlogic.gdx.graphics.VertexAttributes r5 = new com.badlogic.gdx.graphics.VertexAttributes
            r5.<init>(r11)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Mesh(boolean r3, int r4, int r5, com.badlogic.gdx.graphics.VertexAttributes r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.autoBind = r0
            r0 = 0
            r2.isInstanced = r0
            com.badlogic.gdx.math.Vector3 r1 = new com.badlogic.gdx.math.Vector3
            r1.<init>()
            r2.tmpV = r1
            com.badlogic.gdx.graphics.glutils.VertexData r4 = r2.makeVertexBuffer(r3, r4, r6)
            r2.vertices = r4
            com.badlogic.gdx.graphics.glutils.IndexBufferObject r4 = new com.badlogic.gdx.graphics.glutils.IndexBufferObject
            r4.<init>(r3, r5)
            r2.indices = r4
            r2.isVertexArray = r0
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            addManagedMesh(r3, r2)
            return
    }

    public Mesh(boolean r3, int r4, int r5, com.badlogic.gdx.graphics.VertexAttribute... r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.autoBind = r0
            r0 = 0
            r2.isInstanced = r0
            com.badlogic.gdx.math.Vector3 r1 = new com.badlogic.gdx.math.Vector3
            r1.<init>()
            r2.tmpV = r1
            com.badlogic.gdx.graphics.VertexAttributes r1 = new com.badlogic.gdx.graphics.VertexAttributes
            r1.<init>(r6)
            com.badlogic.gdx.graphics.glutils.VertexData r4 = r2.makeVertexBuffer(r3, r4, r1)
            r2.vertices = r4
            com.badlogic.gdx.graphics.glutils.IndexBufferObject r4 = new com.badlogic.gdx.graphics.glutils.IndexBufferObject
            r4.<init>(r3, r5)
            r2.indices = r4
            r2.isVertexArray = r0
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            addManagedMesh(r3, r2)
            return
    }

    private static void addManagedMesh(com.badlogic.gdx.Application r2, com.badlogic.gdx.graphics.Mesh r3) {
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Mesh>> r0 = com.badlogic.gdx.graphics.Mesh.meshes
            java.lang.Object r1 = r0.get(r2)
            com.badlogic.gdx.utils.Array r1 = (com.badlogic.gdx.utils.Array) r1
            if (r1 != 0) goto Lf
            com.badlogic.gdx.utils.Array r1 = new com.badlogic.gdx.utils.Array
            r1.<init>()
        Lf:
            r1.add(r3)
            r0.put(r2, r1)
            return
    }

    public static void clearAllMeshes(com.badlogic.gdx.Application r1) {
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Mesh>> r0 = com.badlogic.gdx.graphics.Mesh.meshes
            r0.remove(r1)
            return
    }

    public static java.lang.String getManagedStatus() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Managed meshes/app: { "
            r0.append(r1)
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Mesh>> r1 = com.badlogic.gdx.graphics.Mesh.meshes
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            com.badlogic.gdx.Application r2 = (com.badlogic.gdx.Application) r2
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Mesh>> r3 = com.badlogic.gdx.graphics.Mesh.meshes
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

    public static void invalidateAllMeshes(com.badlogic.gdx.Application r2) {
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Mesh>> r0 = com.badlogic.gdx.graphics.Mesh.meshes
            java.lang.Object r2 = r0.get(r2)
            com.badlogic.gdx.utils.Array r2 = (com.badlogic.gdx.utils.Array) r2
            if (r2 != 0) goto Lb
            return
        Lb:
            r0 = 0
        Lc:
            int r1 = r2.size
            if (r0 >= r1) goto L29
            java.lang.Object r1 = r2.get(r0)
            com.badlogic.gdx.graphics.Mesh r1 = (com.badlogic.gdx.graphics.Mesh) r1
            com.badlogic.gdx.graphics.glutils.VertexData r1 = r1.vertices
            r1.invalidate()
            java.lang.Object r1 = r2.get(r0)
            com.badlogic.gdx.graphics.Mesh r1 = (com.badlogic.gdx.graphics.Mesh) r1
            com.badlogic.gdx.graphics.glutils.IndexData r1 = r1.indices
            r1.invalidate()
            int r0 = r0 + 1
            goto Lc
        L29:
            return
    }

    private com.badlogic.gdx.graphics.glutils.VertexData makeVertexBuffer(boolean r2, int r3, com.badlogic.gdx.graphics.VertexAttributes r4) {
            r1 = this;
            com.badlogic.gdx.graphics.GL30 r0 = com.badlogic.gdx.Gdx.gl30
            if (r0 == 0) goto La
            com.badlogic.gdx.graphics.glutils.VertexBufferObjectWithVAO r0 = new com.badlogic.gdx.graphics.glutils.VertexBufferObjectWithVAO
            r0.<init>(r2, r3, r4)
            return r0
        La:
            com.badlogic.gdx.graphics.glutils.VertexBufferObject r0 = new com.badlogic.gdx.graphics.glutils.VertexBufferObject
            r0.<init>(r2, r3, r4)
            return r0
    }

    public void bind(com.badlogic.gdx.graphics.glutils.ShaderProgram r2) {
            r1 = this;
            r0 = 0
            r1.bind(r2, r0, r0)
            return
    }

    public void bind(com.badlogic.gdx.graphics.glutils.ShaderProgram r2, int[] r3, int[] r4) {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.VertexData r0 = r1.vertices
            r0.bind(r2, r3)
            com.badlogic.gdx.graphics.glutils.InstanceData r3 = r1.instances
            if (r3 == 0) goto L14
            int r3 = r3.getNumInstances()
            if (r3 <= 0) goto L14
            com.badlogic.gdx.graphics.glutils.InstanceData r3 = r1.instances
            r3.bind(r2, r4)
        L14:
            com.badlogic.gdx.graphics.glutils.IndexData r2 = r1.indices
            int r2 = r2.getNumIndices()
            if (r2 <= 0) goto L21
            com.badlogic.gdx.graphics.glutils.IndexData r2 = r1.indices
            r2.bind()
        L21:
            return
    }

    public com.badlogic.gdx.math.collision.BoundingBox calculateBoundingBox(com.badlogic.gdx.math.collision.BoundingBox r1, int r2, int r3) {
            r0 = this;
            com.badlogic.gdx.math.collision.BoundingBox r1 = r1.inf()
            com.badlogic.gdx.math.collision.BoundingBox r1 = r0.extendBoundingBox(r1, r2, r3)
            return r1
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Mesh>> r0 = com.badlogic.gdx.graphics.Mesh.meshes
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L16
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.Object r0 = r0.get(r1)
            com.badlogic.gdx.utils.Array r0 = (com.badlogic.gdx.utils.Array) r0
            r1 = 1
            r0.removeValue(r2, r1)
        L16:
            com.badlogic.gdx.graphics.glutils.VertexData r0 = r2.vertices
            r0.dispose()
            com.badlogic.gdx.graphics.glutils.InstanceData r0 = r2.instances
            if (r0 == 0) goto L22
            r0.dispose()
        L22:
            com.badlogic.gdx.graphics.glutils.IndexData r0 = r2.indices
            r0.dispose()
            return
    }

    public com.badlogic.gdx.math.collision.BoundingBox extendBoundingBox(com.badlogic.gdx.math.collision.BoundingBox r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            com.badlogic.gdx.math.collision.BoundingBox r2 = r1.extendBoundingBox(r2, r3, r4, r0)
            return r2
    }

    public com.badlogic.gdx.math.collision.BoundingBox extendBoundingBox(com.badlogic.gdx.math.collision.BoundingBox r11, int r12, int r13, com.badlogic.gdx.math.Matrix4 r14) {
            r10 = this;
            int r0 = r10.getNumIndices()
            int r1 = r10.getNumVertices()
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            r1 = r0
        Lc:
            if (r12 < 0) goto L128
            r2 = 1
            if (r13 < r2) goto L128
            int r3 = r12 + r13
            if (r3 > r1) goto L128
            com.badlogic.gdx.graphics.glutils.VertexData r13 = r10.vertices
            r1 = 0
            java.nio.FloatBuffer r13 = r13.getBuffer(r1)
            com.badlogic.gdx.graphics.glutils.IndexData r4 = r10.indices
            java.nio.ShortBuffer r1 = r4.getBuffer(r1)
            com.badlogic.gdx.graphics.VertexAttribute r4 = r10.getVertexAttribute(r2)
            int r5 = r4.offset
            int r5 = r5 / 4
            com.badlogic.gdx.graphics.glutils.VertexData r6 = r10.vertices
            com.badlogic.gdx.graphics.VertexAttributes r6 = r6.getAttributes()
            int r6 = r6.vertexSize
            int r6 = r6 / 4
            int r4 = r4.numComponents
            r7 = 65535(0xffff, float:9.1834E-41)
            r8 = 0
            if (r4 == r2) goto Le6
            r9 = 2
            if (r4 == r9) goto L9b
            r2 = 3
            if (r4 == r2) goto L44
            goto L127
        L44:
            if (r0 <= 0) goto L73
        L46:
            if (r12 >= r3) goto L127
            short r0 = r1.get(r12)
            r0 = r0 & r7
            int r0 = r0 * r6
            int r0 = r0 + r5
            com.badlogic.gdx.math.Vector3 r2 = r10.tmpV
            float r4 = r13.get(r0)
            int r8 = r0 + 1
            float r8 = r13.get(r8)
            int r0 = r0 + r9
            float r0 = r13.get(r0)
            r2.set(r4, r8, r0)
            if (r14 == 0) goto L6b
            com.badlogic.gdx.math.Vector3 r0 = r10.tmpV
            r0.mul(r14)
        L6b:
            com.badlogic.gdx.math.Vector3 r0 = r10.tmpV
            r11.ext(r0)
            int r12 = r12 + 1
            goto L46
        L73:
            if (r12 >= r3) goto L127
            int r0 = r12 * r6
            int r0 = r0 + r5
            com.badlogic.gdx.math.Vector3 r1 = r10.tmpV
            float r2 = r13.get(r0)
            int r4 = r0 + 1
            float r4 = r13.get(r4)
            int r0 = r0 + r9
            float r0 = r13.get(r0)
            r1.set(r2, r4, r0)
            if (r14 == 0) goto L93
            com.badlogic.gdx.math.Vector3 r0 = r10.tmpV
            r0.mul(r14)
        L93:
            com.badlogic.gdx.math.Vector3 r0 = r10.tmpV
            r11.ext(r0)
            int r12 = r12 + 1
            goto L73
        L9b:
            if (r0 <= 0) goto Lc4
        L9d:
            if (r12 >= r3) goto L127
            short r0 = r1.get(r12)
            r0 = r0 & r7
            int r0 = r0 * r6
            int r0 = r0 + r5
            com.badlogic.gdx.math.Vector3 r4 = r10.tmpV
            float r9 = r13.get(r0)
            int r0 = r0 + r2
            float r0 = r13.get(r0)
            r4.set(r9, r0, r8)
            if (r14 == 0) goto Lbc
            com.badlogic.gdx.math.Vector3 r0 = r10.tmpV
            r0.mul(r14)
        Lbc:
            com.badlogic.gdx.math.Vector3 r0 = r10.tmpV
            r11.ext(r0)
            int r12 = r12 + 1
            goto L9d
        Lc4:
            if (r12 >= r3) goto L127
            int r0 = r12 * r6
            int r0 = r0 + r5
            com.badlogic.gdx.math.Vector3 r1 = r10.tmpV
            float r4 = r13.get(r0)
            int r0 = r0 + r2
            float r0 = r13.get(r0)
            r1.set(r4, r0, r8)
            if (r14 == 0) goto Lde
            com.badlogic.gdx.math.Vector3 r0 = r10.tmpV
            r0.mul(r14)
        Lde:
            com.badlogic.gdx.math.Vector3 r0 = r10.tmpV
            r11.ext(r0)
            int r12 = r12 + 1
            goto Lc4
        Le6:
            if (r0 <= 0) goto L10a
        Le8:
            if (r12 >= r3) goto L127
            short r0 = r1.get(r12)
            r0 = r0 & r7
            int r0 = r0 * r6
            int r0 = r0 + r5
            com.badlogic.gdx.math.Vector3 r2 = r10.tmpV
            float r0 = r13.get(r0)
            r2.set(r0, r8, r8)
            if (r14 == 0) goto L102
            com.badlogic.gdx.math.Vector3 r0 = r10.tmpV
            r0.mul(r14)
        L102:
            com.badlogic.gdx.math.Vector3 r0 = r10.tmpV
            r11.ext(r0)
            int r12 = r12 + 1
            goto Le8
        L10a:
            if (r12 >= r3) goto L127
            int r0 = r12 * r6
            int r0 = r0 + r5
            com.badlogic.gdx.math.Vector3 r1 = r10.tmpV
            float r0 = r13.get(r0)
            r1.set(r0, r8, r8)
            if (r14 == 0) goto L11f
            com.badlogic.gdx.math.Vector3 r0 = r10.tmpV
            r0.mul(r14)
        L11f:
            com.badlogic.gdx.math.Vector3 r0 = r10.tmpV
            r11.ext(r0)
            int r12 = r12 + 1
            goto L10a
        L127:
            return r11
        L128:
            com.badlogic.gdx.utils.GdxRuntimeException r11 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Invalid part specified ( offset="
            r14.append(r0)
            r14.append(r12)
            java.lang.String r12 = ", count="
            r14.append(r12)
            r14.append(r13)
            java.lang.String r12 = ", max="
            r14.append(r12)
            r14.append(r1)
            java.lang.String r12 = " )"
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r11.<init>(r12)
            throw r11
    }

    public java.nio.ShortBuffer getIndicesBuffer(boolean r2) {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.IndexData r0 = r1.indices
            java.nio.ShortBuffer r2 = r0.getBuffer(r2)
            return r2
    }

    public int getNumIndices() {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.IndexData r0 = r1.indices
            int r0 = r0.getNumIndices()
            return r0
    }

    public int getNumVertices() {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.VertexData r0 = r1.vertices
            int r0 = r0.getNumVertices()
            return r0
    }

    public com.badlogic.gdx.graphics.VertexAttribute getVertexAttribute(int r5) {
            r4 = this;
            com.badlogic.gdx.graphics.glutils.VertexData r0 = r4.vertices
            com.badlogic.gdx.graphics.VertexAttributes r0 = r0.getAttributes()
            int r1 = r0.size()
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1d
            com.badlogic.gdx.graphics.VertexAttribute r3 = r0.get(r2)
            int r3 = r3.usage
            if (r3 != r5) goto L1a
            com.badlogic.gdx.graphics.VertexAttribute r5 = r0.get(r2)
            return r5
        L1a:
            int r2 = r2 + 1
            goto Lb
        L1d:
            r5 = 0
            return r5
    }

    public com.badlogic.gdx.graphics.VertexAttributes getVertexAttributes() {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.VertexData r0 = r1.vertices
            com.badlogic.gdx.graphics.VertexAttributes r0 = r0.getAttributes()
            return r0
    }

    public java.nio.FloatBuffer getVerticesBuffer(boolean r2) {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.VertexData r0 = r1.vertices
            java.nio.FloatBuffer r2 = r0.getBuffer(r2)
            return r2
    }

    public void render(com.badlogic.gdx.graphics.glutils.ShaderProgram r8, int r9) {
            r7 = this;
            com.badlogic.gdx.graphics.glutils.IndexData r0 = r7.indices
            int r0 = r0.getNumMaxIndices()
            if (r0 <= 0) goto Ld
            int r0 = r7.getNumIndices()
            goto L11
        Ld:
            int r0 = r7.getNumVertices()
        L11:
            r5 = r0
            boolean r6 = r7.autoBind
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.render(r2, r3, r4, r5, r6)
            return
    }

    public void render(com.badlogic.gdx.graphics.glutils.ShaderProgram r7, int r8, int r9, int r10) {
            r6 = this;
            boolean r5 = r6.autoBind
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.render(r1, r2, r3, r4, r5)
            return
    }

    public void render(com.badlogic.gdx.graphics.glutils.ShaderProgram r10, int r11, int r12, int r13, boolean r14) {
            r9 = this;
            if (r13 != 0) goto L3
            return
        L3:
            if (r14 == 0) goto L8
            r9.bind(r10)
        L8:
            boolean r0 = r9.isVertexArray
            r1 = 5123(0x1403, float:7.179E-42)
            r2 = 0
            if (r0 == 0) goto L38
            com.badlogic.gdx.graphics.glutils.IndexData r0 = r9.indices
            int r0 = r0.getNumIndices()
            if (r0 <= 0) goto L31
            com.badlogic.gdx.graphics.glutils.IndexData r0 = r9.indices
            java.nio.ShortBuffer r0 = r0.getBuffer(r2)
            int r2 = r0.position()
            r0.limit()
            r0.position(r12)
            com.badlogic.gdx.graphics.GL20 r12 = com.badlogic.gdx.Gdx.gl20
            r12.glDrawElements(r11, r13, r1, r0)
            r0.position(r2)
            goto Lb4
        L31:
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r0.glDrawArrays(r11, r12, r13)
            goto Lb4
        L38:
            boolean r0 = r9.isInstanced
            if (r0 == 0) goto L44
            com.badlogic.gdx.graphics.glutils.InstanceData r0 = r9.instances
            int r2 = r0.getNumInstances()
            r8 = r2
            goto L45
        L44:
            r8 = 0
        L45:
            com.badlogic.gdx.graphics.glutils.IndexData r0 = r9.indices
            int r0 = r0.getNumIndices()
            if (r0 <= 0) goto La3
            int r0 = r13 + r12
            com.badlogic.gdx.graphics.glutils.IndexData r2 = r9.indices
            int r2 = r2.getNumMaxIndices()
            if (r0 > r2) goto L71
            boolean r0 = r9.isInstanced
            if (r0 == 0) goto L69
            if (r8 <= 0) goto L69
            com.badlogic.gdx.graphics.GL30 r3 = com.badlogic.gdx.Gdx.gl30
            r6 = 5123(0x1403, float:7.179E-42)
            int r7 = r12 * 2
            r4 = r11
            r5 = r13
            r3.glDrawElementsInstanced(r4, r5, r6, r7, r8)
            goto Lb4
        L69:
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r12 = r12 * 2
            r0.glDrawElements(r11, r13, r1, r12)
            goto Lb4
        L71:
            com.badlogic.gdx.utils.GdxRuntimeException r10 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "Mesh attempting to access memory outside of the index buffer (count: "
            r11.append(r14)
            r11.append(r13)
            java.lang.String r13 = ", offset: "
            r11.append(r13)
            r11.append(r12)
            java.lang.String r12 = ", max: "
            r11.append(r12)
            com.badlogic.gdx.graphics.glutils.IndexData r12 = r9.indices
            int r12 = r12.getNumMaxIndices()
            r11.append(r12)
            java.lang.String r12 = ")"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        La3:
            boolean r0 = r9.isInstanced
            if (r0 == 0) goto Laf
            if (r8 <= 0) goto Laf
            com.badlogic.gdx.graphics.GL30 r0 = com.badlogic.gdx.Gdx.gl30
            r0.glDrawArraysInstanced(r11, r12, r13, r8)
            goto Lb4
        Laf:
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r0.glDrawArrays(r11, r12, r13)
        Lb4:
            if (r14 == 0) goto Lb9
            r9.unbind(r10)
        Lb9:
            return
    }

    public com.badlogic.gdx.graphics.Mesh setIndices(short[] r4) {
            r3 = this;
            com.badlogic.gdx.graphics.glutils.IndexData r0 = r3.indices
            int r1 = r4.length
            r2 = 0
            r0.setIndices(r4, r2, r1)
            return r3
    }

    public com.badlogic.gdx.graphics.Mesh setVertices(float[] r2, int r3, int r4) {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.VertexData r0 = r1.vertices
            r0.setVertices(r2, r3, r4)
            return r1
    }

    public void unbind(com.badlogic.gdx.graphics.glutils.ShaderProgram r2) {
            r1 = this;
            r0 = 0
            r1.unbind(r2, r0, r0)
            return
    }

    public void unbind(com.badlogic.gdx.graphics.glutils.ShaderProgram r2, int[] r3, int[] r4) {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.VertexData r0 = r1.vertices
            r0.unbind(r2, r3)
            com.badlogic.gdx.graphics.glutils.InstanceData r3 = r1.instances
            if (r3 == 0) goto L14
            int r3 = r3.getNumInstances()
            if (r3 <= 0) goto L14
            com.badlogic.gdx.graphics.glutils.InstanceData r3 = r1.instances
            r3.unbind(r2, r4)
        L14:
            com.badlogic.gdx.graphics.glutils.IndexData r2 = r1.indices
            int r2 = r2.getNumIndices()
            if (r2 <= 0) goto L21
            com.badlogic.gdx.graphics.glutils.IndexData r2 = r1.indices
            r2.unbind()
        L21:
            return
    }
}
