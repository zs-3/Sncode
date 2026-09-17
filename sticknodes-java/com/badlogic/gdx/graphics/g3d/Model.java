package com.badlogic.gdx.graphics.g3d;

/* loaded from: classes.dex */
public class Model implements com.badlogic.gdx.utils.Disposable {
    public final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Animation> animations;
    protected final com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Disposable> disposables;
    public final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Material> materials;
    public final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.MeshPart> meshParts;
    public final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Mesh> meshes;
    private com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.graphics.g3d.model.NodePart, com.badlogic.gdx.utils.ArrayMap<java.lang.String, com.badlogic.gdx.math.Matrix4>> nodePartBones;
    public final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> nodes;

    public Model() {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.materials = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.nodes = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.animations = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.meshes = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.meshParts = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.disposables = r0
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            r0.<init>()
            r1.nodePartBones = r0
            return
    }

    public Model(com.badlogic.gdx.graphics.g3d.model.data.ModelData r2, com.badlogic.gdx.graphics.g3d.utils.TextureProvider r3) {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.materials = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.nodes = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.animations = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.meshes = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.meshParts = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.disposables = r0
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            r0.<init>()
            r1.nodePartBones = r0
            r1.load(r2, r3)
            return
    }

    public void calculateTransforms() {
            r5 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> r0 = r5.nodes
            int r0 = r0.size
            r1 = 0
            r2 = 0
        L6:
            r3 = 1
            if (r2 >= r0) goto L17
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> r4 = r5.nodes
            java.lang.Object r4 = r4.get(r2)
            com.badlogic.gdx.graphics.g3d.model.Node r4 = (com.badlogic.gdx.graphics.g3d.model.Node) r4
            r4.calculateTransforms(r3)
            int r2 = r2 + 1
            goto L6
        L17:
            if (r1 >= r0) goto L27
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> r2 = r5.nodes
            java.lang.Object r2 = r2.get(r1)
            com.badlogic.gdx.graphics.g3d.model.Node r2 = (com.badlogic.gdx.graphics.g3d.model.Node) r2
            r2.calculateBoneTransforms(r3)
            int r1 = r1 + 1
            goto L17
        L27:
            return
    }

    protected com.badlogic.gdx.graphics.g3d.Material convertMaterial(com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial r18, com.badlogic.gdx.graphics.g3d.utils.TextureProvider r19) {
            r17 = this;
            r0 = r18
            com.badlogic.gdx.graphics.g3d.Material r1 = new com.badlogic.gdx.graphics.g3d.Material
            r1.<init>()
            java.lang.String r2 = r0.id
            r1.id = r2
            com.badlogic.gdx.graphics.Color r2 = r0.ambient
            if (r2 == 0) goto L1b
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute r2 = new com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute
            long r3 = com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.Ambient
            com.badlogic.gdx.graphics.Color r5 = r0.ambient
            r2.<init>(r3, r5)
            r1.set(r2)
        L1b:
            com.badlogic.gdx.graphics.Color r2 = r0.diffuse
            if (r2 == 0) goto L2b
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute r2 = new com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute
            long r3 = com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.Diffuse
            com.badlogic.gdx.graphics.Color r5 = r0.diffuse
            r2.<init>(r3, r5)
            r1.set(r2)
        L2b:
            com.badlogic.gdx.graphics.Color r2 = r0.specular
            if (r2 == 0) goto L3b
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute r2 = new com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute
            long r3 = com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.Specular
            com.badlogic.gdx.graphics.Color r5 = r0.specular
            r2.<init>(r3, r5)
            r1.set(r2)
        L3b:
            com.badlogic.gdx.graphics.Color r2 = r0.emissive
            if (r2 == 0) goto L4b
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute r2 = new com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute
            long r3 = com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.Emissive
            com.badlogic.gdx.graphics.Color r5 = r0.emissive
            r2.<init>(r3, r5)
            r1.set(r2)
        L4b:
            com.badlogic.gdx.graphics.Color r2 = r0.reflection
            if (r2 == 0) goto L5b
            com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute r2 = new com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute
            long r3 = com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.Reflection
            com.badlogic.gdx.graphics.Color r5 = r0.reflection
            r2.<init>(r3, r5)
            r1.set(r2)
        L5b:
            float r2 = r0.shininess
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L6e
            com.badlogic.gdx.graphics.g3d.attributes.FloatAttribute r2 = new com.badlogic.gdx.graphics.g3d.attributes.FloatAttribute
            long r4 = com.badlogic.gdx.graphics.g3d.attributes.FloatAttribute.Shininess
            float r6 = r0.shininess
            r2.<init>(r4, r6)
            r1.set(r2)
        L6e:
            float r2 = r0.opacity
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L84
            com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute r2 = new com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute
            r5 = 770(0x302, float:1.079E-42)
            r6 = 771(0x303, float:1.08E-42)
            float r7 = r0.opacity
            r2.<init>(r5, r6, r7)
            r1.set(r2)
        L84:
            com.badlogic.gdx.utils.ObjectMap r2 = new com.badlogic.gdx.utils.ObjectMap
            r2.<init>()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelTexture> r0 = r0.textures
            if (r0 == 0) goto L17c
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        L91:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L17c
            java.lang.Object r5 = r0.next()
            com.badlogic.gdx.graphics.g3d.model.data.ModelTexture r5 = (com.badlogic.gdx.graphics.g3d.model.data.ModelTexture) r5
            java.lang.String r6 = r5.fileName
            boolean r6 = r2.containsKey(r6)
            if (r6 == 0) goto Lb2
            java.lang.String r6 = r5.fileName
            java.lang.Object r6 = r2.get(r6)
            com.badlogic.gdx.graphics.Texture r6 = (com.badlogic.gdx.graphics.Texture) r6
            r8 = r17
            r7 = r19
            goto Lc6
        Lb2:
            java.lang.String r6 = r5.fileName
            r7 = r19
            com.badlogic.gdx.graphics.Texture r6 = r7.load(r6)
            java.lang.String r8 = r5.fileName
            r2.put(r8, r6)
            r8 = r17
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Disposable> r9 = r8.disposables
            r9.add(r6)
        Lc6:
            com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor r12 = new com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor
            r12.<init>(r6)
            com.badlogic.gdx.graphics.Texture$TextureFilter r9 = r6.getMinFilter()
            r12.minFilter = r9
            com.badlogic.gdx.graphics.Texture$TextureFilter r9 = r6.getMagFilter()
            r12.magFilter = r9
            com.badlogic.gdx.graphics.Texture$TextureWrap r9 = r6.getUWrap()
            r12.uWrap = r9
            com.badlogic.gdx.graphics.Texture$TextureWrap r6 = r6.getVWrap()
            r12.vWrap = r6
            com.badlogic.gdx.math.Vector2 r6 = r5.uvTranslation
            if (r6 != 0) goto Le9
            r13 = 0
            goto Lec
        Le9:
            float r9 = r6.x
            r13 = r9
        Lec:
            if (r6 != 0) goto Lf0
            r14 = 0
            goto Lf3
        Lf0:
            float r6 = r6.y
            r14 = r6
        Lf3:
            com.badlogic.gdx.math.Vector2 r6 = r5.uvScaling
            if (r6 != 0) goto Lfa
            r15 = 1065353216(0x3f800000, float:1.0)
            goto Lfd
        Lfa:
            float r9 = r6.x
            r15 = r9
        Lfd:
            if (r6 != 0) goto L102
            r16 = 1065353216(0x3f800000, float:1.0)
            goto L106
        L102:
            float r6 = r6.y
            r16 = r6
        L106:
            int r5 = r5.usage
            r6 = 2
            if (r5 == r6) goto L16f
            r6 = 3
            if (r5 == r6) goto L162
            r6 = 4
            if (r5 == r6) goto L155
            r6 = 5
            if (r5 == r6) goto L148
            r6 = 7
            if (r5 == r6) goto L13b
            r6 = 8
            if (r5 == r6) goto L12e
            r6 = 10
            if (r5 == r6) goto L121
            goto L91
        L121:
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute r5 = new com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute
            long r10 = com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Reflection
            r9 = r5
            r9.<init>(r10, r12, r13, r14, r15, r16)
            r1.set(r5)
            goto L91
        L12e:
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute r5 = new com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute
            long r10 = com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Bump
            r9 = r5
            r9.<init>(r10, r12, r13, r14, r15, r16)
            r1.set(r5)
            goto L91
        L13b:
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute r5 = new com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute
            long r10 = com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Normal
            r9 = r5
            r9.<init>(r10, r12, r13, r14, r15, r16)
            r1.set(r5)
            goto L91
        L148:
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute r5 = new com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute
            long r10 = com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Specular
            r9 = r5
            r9.<init>(r10, r12, r13, r14, r15, r16)
            r1.set(r5)
            goto L91
        L155:
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute r5 = new com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute
            long r10 = com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Ambient
            r9 = r5
            r9.<init>(r10, r12, r13, r14, r15, r16)
            r1.set(r5)
            goto L91
        L162:
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute r5 = new com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute
            long r10 = com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Emissive
            r9 = r5
            r9.<init>(r10, r12, r13, r14, r15, r16)
            r1.set(r5)
            goto L91
        L16f:
            com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute r5 = new com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute
            long r10 = com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Diffuse
            r9 = r5
            r9.<init>(r10, r12, r13, r14, r15, r16)
            r1.set(r5)
            goto L91
        L17c:
            r8 = r17
            return r1
    }

    protected void convertMesh(com.badlogic.gdx.graphics.g3d.model.data.ModelMesh r12) {
            r11 = this;
            com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart[] r0 = r12.parts
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = 0
        L6:
            if (r3 >= r1) goto L11
            r5 = r0[r3]
            short[] r5 = r5.indices
            int r5 = r5.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L6
        L11:
            r0 = 1
            if (r4 <= 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            com.badlogic.gdx.graphics.VertexAttributes r3 = new com.badlogic.gdx.graphics.VertexAttributes
            com.badlogic.gdx.graphics.VertexAttribute[] r5 = r12.attributes
            r3.<init>(r5)
            float[] r5 = r12.vertices
            int r5 = r5.length
            int r6 = r3.vertexSize
            int r6 = r6 / 4
            int r5 = r5 / r6
            com.badlogic.gdx.graphics.Mesh r6 = new com.badlogic.gdx.graphics.Mesh
            r6.<init>(r0, r5, r4, r3)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Mesh> r3 = r11.meshes
            r3.add(r6)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Disposable> r3 = r11.disposables
            r3.add(r6)
            float[] r3 = r12.vertices
            java.nio.FloatBuffer r4 = r6.getVerticesBuffer(r0)
            float[] r7 = r12.vertices
            int r7 = r7.length
            com.badlogic.gdx.utils.BufferUtils.copy(r3, r4, r7, r2)
            java.nio.ShortBuffer r0 = r6.getIndicesBuffer(r0)
            r0.clear()
            com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart[] r12 = r12.parts
            int r3 = r12.length
            r4 = 0
            r7 = 0
        L4d:
            if (r4 >= r3) goto L7d
            r8 = r12[r4]
            com.badlogic.gdx.graphics.g3d.model.MeshPart r9 = new com.badlogic.gdx.graphics.g3d.model.MeshPart
            r9.<init>()
            java.lang.String r10 = r8.id
            r9.id = r10
            int r10 = r8.primitiveType
            r9.primitiveType = r10
            r9.offset = r7
            if (r1 == 0) goto L66
            short[] r10 = r8.indices
            int r10 = r10.length
            goto L67
        L66:
            r10 = r5
        L67:
            r9.size = r10
            r9.mesh = r6
            if (r1 == 0) goto L72
            short[] r8 = r8.indices
            r0.put(r8)
        L72:
            int r8 = r9.size
            int r7 = r7 + r8
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.MeshPart> r8 = r11.meshParts
            r8.add(r9)
            int r4 = r4 + 1
            goto L4d
        L7d:
            r0.position(r2)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.MeshPart> r12 = r11.meshParts
            com.badlogic.gdx.utils.Array$ArrayIterator r12 = r12.iterator()
        L86:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r0 = r12.next()
            com.badlogic.gdx.graphics.g3d.model.MeshPart r0 = (com.badlogic.gdx.graphics.g3d.model.MeshPart) r0
            r0.update()
            goto L86
        L96:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Disposable> r0 = r2.disposables
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.utils.Disposable r1 = (com.badlogic.gdx.utils.Disposable) r1
            r1.dispose()
            goto L6
        L16:
            return
    }

    public java.lang.Iterable<com.badlogic.gdx.utils.Disposable> getManagedDisposables() {
            r1 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Disposable> r0 = r1.disposables
            return r0
    }

    public com.badlogic.gdx.graphics.g3d.model.Node getNode(java.lang.String r2) {
            r1 = this;
            r0 = 1
            com.badlogic.gdx.graphics.g3d.model.Node r2 = r1.getNode(r2, r0)
            return r2
    }

    public com.badlogic.gdx.graphics.g3d.model.Node getNode(java.lang.String r2, boolean r3) {
            r1 = this;
            r0 = 0
            com.badlogic.gdx.graphics.g3d.model.Node r2 = r1.getNode(r2, r3, r0)
            return r2
    }

    public com.badlogic.gdx.graphics.g3d.model.Node getNode(java.lang.String r2, boolean r3, boolean r4) {
            r1 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> r0 = r1.nodes
            com.badlogic.gdx.graphics.g3d.model.Node r2 = com.badlogic.gdx.graphics.g3d.model.Node.getNode(r0, r2, r3, r4)
            return r2
    }

    protected void load(com.badlogic.gdx.graphics.g3d.model.data.ModelData r2, com.badlogic.gdx.graphics.g3d.utils.TextureProvider r3) {
            r1 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMesh> r0 = r2.meshes
            r1.loadMeshes(r0)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial> r0 = r2.materials
            r1.loadMaterials(r0, r3)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNode> r3 = r2.nodes
            r1.loadNodes(r3)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelAnimation> r2 = r2.animations
            r1.loadAnimations(r2)
            r1.calculateTransforms()
            return
    }

    protected void loadAnimations(java.lang.Iterable<com.badlogic.gdx.graphics.g3d.model.data.ModelAnimation> r12) {
            r11 = this;
            java.util.Iterator r12 = r12.iterator()
        L4:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L13c
            java.lang.Object r0 = r12.next()
            com.badlogic.gdx.graphics.g3d.model.data.ModelAnimation r0 = (com.badlogic.gdx.graphics.g3d.model.data.ModelAnimation) r0
            com.badlogic.gdx.graphics.g3d.model.Animation r1 = new com.badlogic.gdx.graphics.g3d.model.Animation
            r1.<init>()
            java.lang.String r2 = r0.id
            r1.id = r2
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeAnimation> r0 = r0.nodeAnimations
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        L1f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L12f
            java.lang.Object r2 = r0.next()
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodeAnimation r2 = (com.badlogic.gdx.graphics.g3d.model.data.ModelNodeAnimation) r2
            java.lang.String r3 = r2.nodeId
            com.badlogic.gdx.graphics.g3d.model.Node r3 = r11.getNode(r3)
            if (r3 != 0) goto L34
            goto L1f
        L34:
            com.badlogic.gdx.graphics.g3d.model.NodeAnimation r4 = new com.badlogic.gdx.graphics.g3d.model.NodeAnimation
            r4.<init>()
            r4.node = r3
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Vector3>> r5 = r2.translation
            if (r5 == 0) goto L82
            com.badlogic.gdx.utils.Array r5 = new com.badlogic.gdx.utils.Array
            r5.<init>()
            r4.translation = r5
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Vector3>> r6 = r2.translation
            int r6 = r6.size
            r5.ensureCapacity(r6)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Vector3>> r5 = r2.translation
            com.badlogic.gdx.utils.Array$ArrayIterator r5 = r5.iterator()
        L53:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L82
            java.lang.Object r6 = r5.next()
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe r6 = (com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe) r6
            float r7 = r6.keytime
            float r8 = r1.duration
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 <= 0) goto L69
            r1.duration = r7
        L69:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.NodeKeyframe<com.badlogic.gdx.math.Vector3>> r8 = r4.translation
            com.badlogic.gdx.graphics.g3d.model.NodeKeyframe r9 = new com.badlogic.gdx.graphics.g3d.model.NodeKeyframe
            com.badlogic.gdx.math.Vector3 r10 = new com.badlogic.gdx.math.Vector3
            T r6 = r6.value
            if (r6 != 0) goto L76
            com.badlogic.gdx.math.Vector3 r6 = r3.translation
            goto L78
        L76:
            com.badlogic.gdx.math.Vector3 r6 = (com.badlogic.gdx.math.Vector3) r6
        L78:
            r10.<init>(r6)
            r9.<init>(r7, r10)
            r8.add(r9)
            goto L53
        L82:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Quaternion>> r5 = r2.rotation
            if (r5 == 0) goto Lc9
            com.badlogic.gdx.utils.Array r5 = new com.badlogic.gdx.utils.Array
            r5.<init>()
            r4.rotation = r5
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Quaternion>> r6 = r2.rotation
            int r6 = r6.size
            r5.ensureCapacity(r6)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Quaternion>> r5 = r2.rotation
            com.badlogic.gdx.utils.Array$ArrayIterator r5 = r5.iterator()
        L9a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lc9
            java.lang.Object r6 = r5.next()
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe r6 = (com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe) r6
            float r7 = r6.keytime
            float r8 = r1.duration
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 <= 0) goto Lb0
            r1.duration = r7
        Lb0:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.NodeKeyframe<com.badlogic.gdx.math.Quaternion>> r8 = r4.rotation
            com.badlogic.gdx.graphics.g3d.model.NodeKeyframe r9 = new com.badlogic.gdx.graphics.g3d.model.NodeKeyframe
            com.badlogic.gdx.math.Quaternion r10 = new com.badlogic.gdx.math.Quaternion
            T r6 = r6.value
            if (r6 != 0) goto Lbd
            com.badlogic.gdx.math.Quaternion r6 = r3.rotation
            goto Lbf
        Lbd:
            com.badlogic.gdx.math.Quaternion r6 = (com.badlogic.gdx.math.Quaternion) r6
        Lbf:
            r10.<init>(r6)
            r9.<init>(r7, r10)
            r8.add(r9)
            goto L9a
        Lc9:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Vector3>> r5 = r2.scaling
            if (r5 == 0) goto L110
            com.badlogic.gdx.utils.Array r5 = new com.badlogic.gdx.utils.Array
            r5.<init>()
            r4.scaling = r5
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Vector3>> r6 = r2.scaling
            int r6 = r6.size
            r5.ensureCapacity(r6)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Vector3>> r2 = r2.scaling
            com.badlogic.gdx.utils.Array$ArrayIterator r2 = r2.iterator()
        Le1:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L110
            java.lang.Object r5 = r2.next()
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe r5 = (com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe) r5
            float r6 = r5.keytime
            float r7 = r1.duration
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto Lf7
            r1.duration = r6
        Lf7:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.NodeKeyframe<com.badlogic.gdx.math.Vector3>> r7 = r4.scaling
            com.badlogic.gdx.graphics.g3d.model.NodeKeyframe r8 = new com.badlogic.gdx.graphics.g3d.model.NodeKeyframe
            com.badlogic.gdx.math.Vector3 r9 = new com.badlogic.gdx.math.Vector3
            T r5 = r5.value
            if (r5 != 0) goto L104
            com.badlogic.gdx.math.Vector3 r5 = r3.scale
            goto L106
        L104:
            com.badlogic.gdx.math.Vector3 r5 = (com.badlogic.gdx.math.Vector3) r5
        L106:
            r9.<init>(r5)
            r8.<init>(r6, r9)
            r7.add(r8)
            goto Le1
        L110:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.NodeKeyframe<com.badlogic.gdx.math.Vector3>> r2 = r4.translation
            if (r2 == 0) goto L118
            int r2 = r2.size
            if (r2 > 0) goto L128
        L118:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.NodeKeyframe<com.badlogic.gdx.math.Quaternion>> r2 = r4.rotation
            if (r2 == 0) goto L120
            int r2 = r2.size
            if (r2 > 0) goto L128
        L120:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.NodeKeyframe<com.badlogic.gdx.math.Vector3>> r2 = r4.scaling
            if (r2 == 0) goto L1f
            int r2 = r2.size
            if (r2 <= 0) goto L1f
        L128:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.NodeAnimation> r2 = r1.nodeAnimations
            r2.add(r4)
            goto L1f
        L12f:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.NodeAnimation> r0 = r1.nodeAnimations
            int r0 = r0.size
            if (r0 <= 0) goto L4
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Animation> r0 = r11.animations
            r0.add(r1)
            goto L4
        L13c:
            return
    }

    protected void loadMaterials(java.lang.Iterable<com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial> r3, com.badlogic.gdx.graphics.g3d.utils.TextureProvider r4) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r3.next()
            com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial r0 = (com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial) r0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Material> r1 = r2.materials
            com.badlogic.gdx.graphics.g3d.Material r0 = r2.convertMaterial(r0, r4)
            r1.add(r0)
            goto L4
        L1a:
            return
    }

    protected void loadMeshes(java.lang.Iterable<com.badlogic.gdx.graphics.g3d.model.data.ModelMesh> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            com.badlogic.gdx.graphics.g3d.model.data.ModelMesh r0 = (com.badlogic.gdx.graphics.g3d.model.data.ModelMesh) r0
            r1.convertMesh(r0)
            goto L4
        L14:
            return
    }

    protected com.badlogic.gdx.graphics.g3d.model.Node loadNode(com.badlogic.gdx.graphics.g3d.model.data.ModelNode r13) {
            r12 = this;
            com.badlogic.gdx.graphics.g3d.model.Node r0 = new com.badlogic.gdx.graphics.g3d.model.Node
            r0.<init>()
            java.lang.String r1 = r13.id
            r0.id = r1
            com.badlogic.gdx.math.Vector3 r1 = r13.translation
            if (r1 == 0) goto L12
            com.badlogic.gdx.math.Vector3 r2 = r0.translation
            r2.set(r1)
        L12:
            com.badlogic.gdx.math.Quaternion r1 = r13.rotation
            if (r1 == 0) goto L1b
            com.badlogic.gdx.math.Quaternion r2 = r0.rotation
            r2.set(r1)
        L1b:
            com.badlogic.gdx.math.Vector3 r1 = r13.scale
            if (r1 == 0) goto L24
            com.badlogic.gdx.math.Vector3 r2 = r0.scale
            r2.set(r1)
        L24:
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodePart[] r1 = r13.parts
            r2 = 0
            if (r1 == 0) goto Laa
            int r3 = r1.length
            r4 = 0
        L2b:
            if (r4 >= r3) goto Laa
            r5 = r1[r4]
            java.lang.String r6 = r5.meshPartId
            r7 = 0
            if (r6 == 0) goto L51
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.MeshPart> r6 = r12.meshParts
            com.badlogic.gdx.utils.Array$ArrayIterator r6 = r6.iterator()
        L3a:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L51
            java.lang.Object r8 = r6.next()
            com.badlogic.gdx.graphics.g3d.model.MeshPart r8 = (com.badlogic.gdx.graphics.g3d.model.MeshPart) r8
            java.lang.String r9 = r5.meshPartId
            java.lang.String r10 = r8.id
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L3a
            goto L52
        L51:
            r8 = r7
        L52:
            java.lang.String r6 = r5.materialId
            if (r6 == 0) goto L73
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Material> r6 = r12.materials
            com.badlogic.gdx.utils.Array$ArrayIterator r6 = r6.iterator()
        L5c:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L73
            java.lang.Object r9 = r6.next()
            com.badlogic.gdx.graphics.g3d.Material r9 = (com.badlogic.gdx.graphics.g3d.Material) r9
            java.lang.String r10 = r5.materialId
            java.lang.String r11 = r9.id
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L5c
            r7 = r9
        L73:
            if (r8 == 0) goto L91
            if (r7 == 0) goto L91
            com.badlogic.gdx.graphics.g3d.model.NodePart r6 = new com.badlogic.gdx.graphics.g3d.model.NodePart
            r6.<init>()
            r6.meshPart = r8
            r6.material = r7
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.NodePart> r7 = r0.parts
            r7.add(r6)
            com.badlogic.gdx.utils.ArrayMap<java.lang.String, com.badlogic.gdx.math.Matrix4> r5 = r5.bones
            if (r5 == 0) goto L8e
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.graphics.g3d.model.NodePart, com.badlogic.gdx.utils.ArrayMap<java.lang.String, com.badlogic.gdx.math.Matrix4>> r7 = r12.nodePartBones
            r7.put(r6, r5)
        L8e:
            int r4 = r4 + 1
            goto L2b
        L91:
            com.badlogic.gdx.utils.GdxRuntimeException r13 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid node: "
            r1.append(r2)
            java.lang.String r0 = r0.id
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.<init>(r0)
            throw r13
        Laa:
            com.badlogic.gdx.graphics.g3d.model.data.ModelNode[] r13 = r13.children
            if (r13 == 0) goto Lbd
            int r1 = r13.length
        Laf:
            if (r2 >= r1) goto Lbd
            r3 = r13[r2]
            com.badlogic.gdx.graphics.g3d.model.Node r3 = r12.loadNode(r3)
            r0.addChild(r3)
            int r2 = r2 + 1
            goto Laf
        Lbd:
            return r0
    }

    protected void loadNodes(java.lang.Iterable<com.badlogic.gdx.graphics.g3d.model.data.ModelNode> r7) {
            r6 = this;
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.graphics.g3d.model.NodePart, com.badlogic.gdx.utils.ArrayMap<java.lang.String, com.badlogic.gdx.math.Matrix4>> r0 = r6.nodePartBones
            r0.clear()
            java.util.Iterator r7 = r7.iterator()
        L9:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r7.next()
            com.badlogic.gdx.graphics.g3d.model.data.ModelNode r0 = (com.badlogic.gdx.graphics.g3d.model.data.ModelNode) r0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.Node> r1 = r6.nodes
            com.badlogic.gdx.graphics.g3d.model.Node r0 = r6.loadNode(r0)
            r1.add(r0)
            goto L9
        L1f:
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.graphics.g3d.model.NodePart, com.badlogic.gdx.utils.ArrayMap<java.lang.String, com.badlogic.gdx.math.Matrix4>> r7 = r6.nodePartBones
            com.badlogic.gdx.utils.ObjectMap$Entries r7 = r7.entries()
            com.badlogic.gdx.utils.ObjectMap$Entries r7 = r7.iterator()
        L29:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r7.next()
            com.badlogic.gdx.utils.ObjectMap$Entry r0 = (com.badlogic.gdx.utils.ObjectMap.Entry) r0
            K r1 = r0.key
            r2 = r1
            com.badlogic.gdx.graphics.g3d.model.NodePart r2 = (com.badlogic.gdx.graphics.g3d.model.NodePart) r2
            com.badlogic.gdx.utils.ArrayMap<com.badlogic.gdx.graphics.g3d.model.Node, com.badlogic.gdx.math.Matrix4> r2 = r2.invBoneBindTransforms
            if (r2 != 0) goto L4b
            com.badlogic.gdx.graphics.g3d.model.NodePart r1 = (com.badlogic.gdx.graphics.g3d.model.NodePart) r1
            com.badlogic.gdx.utils.ArrayMap r2 = new com.badlogic.gdx.utils.ArrayMap
            java.lang.Class<com.badlogic.gdx.graphics.g3d.model.Node> r3 = com.badlogic.gdx.graphics.g3d.model.Node.class
            java.lang.Class<com.badlogic.gdx.math.Matrix4> r4 = com.badlogic.gdx.math.Matrix4.class
            r2.<init>(r3, r4)
            r1.invBoneBindTransforms = r2
        L4b:
            K r1 = r0.key
            com.badlogic.gdx.graphics.g3d.model.NodePart r1 = (com.badlogic.gdx.graphics.g3d.model.NodePart) r1
            com.badlogic.gdx.utils.ArrayMap<com.badlogic.gdx.graphics.g3d.model.Node, com.badlogic.gdx.math.Matrix4> r1 = r1.invBoneBindTransforms
            r1.clear()
            V r1 = r0.value
            com.badlogic.gdx.utils.ArrayMap r1 = (com.badlogic.gdx.utils.ArrayMap) r1
            com.badlogic.gdx.utils.ArrayMap$Entries r1 = r1.entries()
            java.util.Iterator r1 = r1.iterator()
        L60:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            com.badlogic.gdx.utils.ObjectMap$Entry r2 = (com.badlogic.gdx.utils.ObjectMap.Entry) r2
            K r3 = r0.key
            com.badlogic.gdx.graphics.g3d.model.NodePart r3 = (com.badlogic.gdx.graphics.g3d.model.NodePart) r3
            com.badlogic.gdx.utils.ArrayMap<com.badlogic.gdx.graphics.g3d.model.Node, com.badlogic.gdx.math.Matrix4> r3 = r3.invBoneBindTransforms
            K r4 = r2.key
            java.lang.String r4 = (java.lang.String) r4
            com.badlogic.gdx.graphics.g3d.model.Node r4 = r6.getNode(r4)
            com.badlogic.gdx.math.Matrix4 r5 = new com.badlogic.gdx.math.Matrix4
            V r2 = r2.value
            com.badlogic.gdx.math.Matrix4 r2 = (com.badlogic.gdx.math.Matrix4) r2
            r5.<init>(r2)
            com.badlogic.gdx.math.Matrix4 r2 = r5.inv()
            r3.put(r4, r2)
            goto L60
        L8b:
            return
    }
}
