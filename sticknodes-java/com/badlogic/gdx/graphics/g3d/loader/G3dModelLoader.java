package com.badlogic.gdx.graphics.g3d.loader;

/* loaded from: classes.dex */
public class G3dModelLoader extends com.badlogic.gdx.assets.loaders.ModelLoader<com.badlogic.gdx.assets.loaders.ModelLoader.ModelParameters> {
    protected final com.badlogic.gdx.utils.BaseJsonReader reader;
    protected final com.badlogic.gdx.math.Quaternion tempQ;

    public G3dModelLoader(com.badlogic.gdx.utils.BaseJsonReader r1, com.badlogic.gdx.assets.loaders.FileHandleResolver r2) {
            r0 = this;
            r0.<init>(r2)
            com.badlogic.gdx.math.Quaternion r2 = new com.badlogic.gdx.math.Quaternion
            r2.<init>()
            r0.tempQ = r2
            r0.reader = r1
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.ModelLoader
    public com.badlogic.gdx.graphics.g3d.model.data.ModelData loadModelData(com.badlogic.gdx.files.FileHandle r1, com.badlogic.gdx.assets.loaders.ModelLoader.ModelParameters r2) {
            r0 = this;
            com.badlogic.gdx.graphics.g3d.model.data.ModelData r1 = r0.parseModel(r1)
            return r1
    }

    protected void parseAnimations(com.badlogic.gdx.graphics.g3d.model.data.ModelData r18, com.badlogic.gdx.utils.JsonValue r19) {
            r17 = this;
            r0 = r18
            java.lang.String r1 = "animations"
            r2 = r19
            com.badlogic.gdx.utils.JsonValue r1 = r2.get(r1)
            if (r1 != 0) goto Ld
            return
        Ld:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelAnimation> r2 = r0.animations
            int r3 = r1.size
            r2.ensureCapacity(r3)
            com.badlogic.gdx.utils.JsonValue r1 = r1.child
        L16:
            if (r1 == 0) goto L246
            java.lang.String r2 = "bones"
            com.badlogic.gdx.utils.JsonValue r2 = r1.get(r2)
            if (r2 != 0) goto L22
            goto L240
        L22:
            com.badlogic.gdx.graphics.g3d.model.data.ModelAnimation r3 = new com.badlogic.gdx.graphics.g3d.model.data.ModelAnimation
            r3.<init>()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelAnimation> r4 = r0.animations
            r4.add(r3)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeAnimation> r4 = r3.nodeAnimations
            int r5 = r2.size
            r4.ensureCapacity(r5)
            java.lang.String r4 = "id"
            java.lang.String r4 = r1.getString(r4)
            r3.id = r4
            com.badlogic.gdx.utils.JsonValue r2 = r2.child
        L3d:
            if (r2 == 0) goto L240
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodeAnimation r4 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNodeAnimation
            r4.<init>()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeAnimation> r5 = r3.nodeAnimations
            r5.add(r4)
            java.lang.String r5 = "boneId"
            java.lang.String r5 = r2.getString(r5)
            r4.nodeId = r5
            java.lang.String r5 = "keyframes"
            com.badlogic.gdx.utils.JsonValue r5 = r2.get(r5)
            java.lang.String r7 = "rotation"
            java.lang.String r8 = "translation"
            r9 = 1148846080(0x447a0000, float:1000.0)
            r10 = 0
            java.lang.String r11 = "keytime"
            r12 = 2
            r13 = 1
            r14 = 0
            r15 = 3
            if (r5 == 0) goto L12c
            boolean r16 = r5.isArray()
            if (r16 == 0) goto L12c
            com.badlogic.gdx.utils.JsonValue r5 = r5.child
        L6e:
            if (r5 == 0) goto L23a
            float r16 = r5.getFloat(r11, r10)
            float r10 = r16 / r9
            com.badlogic.gdx.utils.JsonValue r9 = r5.get(r8)
            if (r9 == 0) goto Laa
            int r6 = r9.size
            if (r6 != r15) goto Laa
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Vector3>> r6 = r4.translation
            if (r6 != 0) goto L8b
            com.badlogic.gdx.utils.Array r6 = new com.badlogic.gdx.utils.Array
            r6.<init>()
            r4.translation = r6
        L8b:
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe r6 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe
            r6.<init>()
            r6.keytime = r10
            com.badlogic.gdx.math.Vector3 r15 = new com.badlogic.gdx.math.Vector3
            float r0 = r9.getFloat(r14)
            float r14 = r9.getFloat(r13)
            float r9 = r9.getFloat(r12)
            r15.<init>(r0, r14, r9)
            r6.value = r15
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Vector3>> r0 = r4.translation
            r0.add(r6)
        Laa:
            com.badlogic.gdx.utils.JsonValue r0 = r5.get(r7)
            if (r0 == 0) goto Le5
            int r6 = r0.size
            r9 = 4
            if (r6 != r9) goto Le5
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Quaternion>> r6 = r4.rotation
            if (r6 != 0) goto Lc0
            com.badlogic.gdx.utils.Array r6 = new com.badlogic.gdx.utils.Array
            r6.<init>()
            r4.rotation = r6
        Lc0:
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe r6 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe
            r6.<init>()
            r6.keytime = r10
            com.badlogic.gdx.math.Quaternion r9 = new com.badlogic.gdx.math.Quaternion
            r14 = 0
            float r15 = r0.getFloat(r14)
            float r14 = r0.getFloat(r13)
            float r13 = r0.getFloat(r12)
            r12 = 3
            float r0 = r0.getFloat(r12)
            r9.<init>(r15, r14, r13, r0)
            r6.value = r9
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Quaternion>> r0 = r4.rotation
            r0.add(r6)
        Le5:
            java.lang.String r0 = "scale"
            com.badlogic.gdx.utils.JsonValue r0 = r5.get(r0)
            if (r0 == 0) goto L11f
            int r6 = r0.size
            r9 = 3
            if (r6 != r9) goto L11f
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Vector3>> r6 = r4.scaling
            if (r6 != 0) goto Lfd
            com.badlogic.gdx.utils.Array r6 = new com.badlogic.gdx.utils.Array
            r6.<init>()
            r4.scaling = r6
        Lfd:
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe r6 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe
            r6.<init>()
            r6.keytime = r10
            com.badlogic.gdx.math.Vector3 r9 = new com.badlogic.gdx.math.Vector3
            r10 = 0
            float r12 = r0.getFloat(r10)
            r10 = 1
            float r13 = r0.getFloat(r10)
            r10 = 2
            float r0 = r0.getFloat(r10)
            r9.<init>(r12, r13, r0)
            r6.value = r9
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Vector3>> r0 = r4.scaling
            r0.add(r6)
        L11f:
            com.badlogic.gdx.utils.JsonValue r5 = r5.next
            r0 = r18
            r9 = 1148846080(0x447a0000, float:1000.0)
            r10 = 0
            r12 = 2
            r13 = 1
            r14 = 0
            r15 = 3
            goto L6e
        L12c:
            com.badlogic.gdx.utils.JsonValue r0 = r2.get(r8)
            java.lang.String r5 = "value"
            if (r0 == 0) goto L182
            boolean r6 = r0.isArray()
            if (r6 == 0) goto L182
            com.badlogic.gdx.utils.Array r6 = new com.badlogic.gdx.utils.Array
            r6.<init>()
            r4.translation = r6
            int r8 = r0.size
            r6.ensureCapacity(r8)
            com.badlogic.gdx.utils.JsonValue r0 = r0.child
        L148:
            if (r0 == 0) goto L182
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe r6 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe
            r6.<init>()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Vector3>> r8 = r4.translation
            r8.add(r6)
            r8 = 0
            float r9 = r0.getFloat(r11, r8)
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r9 / r8
            r6.keytime = r9
            com.badlogic.gdx.utils.JsonValue r8 = r0.get(r5)
            if (r8 == 0) goto L17f
            int r9 = r8.size
            r10 = 3
            if (r9 < r10) goto L17f
            com.badlogic.gdx.math.Vector3 r9 = new com.badlogic.gdx.math.Vector3
            r10 = 0
            float r12 = r8.getFloat(r10)
            r10 = 1
            float r13 = r8.getFloat(r10)
            r10 = 2
            float r8 = r8.getFloat(r10)
            r9.<init>(r12, r13, r8)
            r6.value = r9
        L17f:
            com.badlogic.gdx.utils.JsonValue r0 = r0.next
            goto L148
        L182:
            com.badlogic.gdx.utils.JsonValue r0 = r2.get(r7)
            if (r0 == 0) goto L1dd
            boolean r6 = r0.isArray()
            if (r6 == 0) goto L1dd
            com.badlogic.gdx.utils.Array r6 = new com.badlogic.gdx.utils.Array
            r6.<init>()
            r4.rotation = r6
            int r7 = r0.size
            r6.ensureCapacity(r7)
            com.badlogic.gdx.utils.JsonValue r0 = r0.child
        L19c:
            if (r0 == 0) goto L1dd
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe r6 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe
            r6.<init>()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Quaternion>> r7 = r4.rotation
            r7.add(r6)
            r7 = 0
            float r8 = r0.getFloat(r11, r7)
            r7 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r8 / r7
            r6.keytime = r8
            com.badlogic.gdx.utils.JsonValue r7 = r0.get(r5)
            if (r7 == 0) goto L1d9
            int r8 = r7.size
            r9 = 4
            if (r8 < r9) goto L1da
            com.badlogic.gdx.math.Quaternion r8 = new com.badlogic.gdx.math.Quaternion
            r10 = 0
            float r12 = r7.getFloat(r10)
            r10 = 1
            float r13 = r7.getFloat(r10)
            r10 = 2
            float r14 = r7.getFloat(r10)
            r10 = 3
            float r7 = r7.getFloat(r10)
            r8.<init>(r12, r13, r14, r7)
            r6.value = r8
            goto L1da
        L1d9:
            r9 = 4
        L1da:
            com.badlogic.gdx.utils.JsonValue r0 = r0.next
            goto L19c
        L1dd:
            java.lang.String r0 = "scaling"
            com.badlogic.gdx.utils.JsonValue r0 = r2.get(r0)
            if (r0 == 0) goto L23a
            boolean r6 = r0.isArray()
            if (r6 == 0) goto L23a
            com.badlogic.gdx.utils.Array r6 = new com.badlogic.gdx.utils.Array
            r6.<init>()
            r4.scaling = r6
            int r7 = r0.size
            r6.ensureCapacity(r7)
            com.badlogic.gdx.utils.JsonValue r0 = r0.child
        L1f9:
            if (r0 == 0) goto L23a
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe r6 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe
            r6.<init>()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe<com.badlogic.gdx.math.Vector3>> r7 = r4.scaling
            r7.add(r6)
            r7 = 0
            float r8 = r0.getFloat(r11, r7)
            r9 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r8 / r9
            r6.keytime = r8
            com.badlogic.gdx.utils.JsonValue r8 = r0.get(r5)
            if (r8 == 0) goto L233
            int r10 = r8.size
            r12 = 3
            if (r10 < r12) goto L231
            com.badlogic.gdx.math.Vector3 r10 = new com.badlogic.gdx.math.Vector3
            r13 = 0
            float r14 = r8.getFloat(r13)
            r15 = 1
            float r7 = r8.getFloat(r15)
            r9 = 2
            float r8 = r8.getFloat(r9)
            r10.<init>(r14, r7, r8)
            r6.value = r10
            goto L237
        L231:
            r9 = 2
            goto L235
        L233:
            r9 = 2
            r12 = 3
        L235:
            r13 = 0
            r15 = 1
        L237:
            com.badlogic.gdx.utils.JsonValue r0 = r0.next
            goto L1f9
        L23a:
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            r0 = r18
            goto L3d
        L240:
            com.badlogic.gdx.utils.JsonValue r1 = r1.next
            r0 = r18
            goto L16
        L246:
            return
    }

    protected com.badlogic.gdx.graphics.VertexAttribute[] parseAttributes(com.badlogic.gdx.utils.JsonValue r6) {
            r5 = this;
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            com.badlogic.gdx.utils.JsonValue r6 = r6.child
            r1 = 0
            r2 = 0
        L9:
            if (r6 == 0) goto Lb5
            java.lang.String r3 = r6.asString()
            java.lang.String r4 = "POSITION"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L20
            com.badlogic.gdx.graphics.VertexAttribute r3 = com.badlogic.gdx.graphics.VertexAttribute.Position()
            r0.add(r3)
            goto L95
        L20:
            java.lang.String r4 = "NORMAL"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L30
            com.badlogic.gdx.graphics.VertexAttribute r3 = com.badlogic.gdx.graphics.VertexAttribute.Normal()
            r0.add(r3)
            goto L95
        L30:
            java.lang.String r4 = "COLOR"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L40
            com.badlogic.gdx.graphics.VertexAttribute r3 = com.badlogic.gdx.graphics.VertexAttribute.ColorUnpacked()
            r0.add(r3)
            goto L95
        L40:
            java.lang.String r4 = "COLORPACKED"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L50
            com.badlogic.gdx.graphics.VertexAttribute r3 = com.badlogic.gdx.graphics.VertexAttribute.ColorPacked()
            r0.add(r3)
            goto L95
        L50:
            java.lang.String r4 = "TANGENT"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L60
            com.badlogic.gdx.graphics.VertexAttribute r3 = com.badlogic.gdx.graphics.VertexAttribute.Tangent()
            r0.add(r3)
            goto L95
        L60:
            java.lang.String r4 = "BINORMAL"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L70
            com.badlogic.gdx.graphics.VertexAttribute r3 = com.badlogic.gdx.graphics.VertexAttribute.Binormal()
            r0.add(r3)
            goto L95
        L70:
            java.lang.String r4 = "TEXCOORD"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L83
            int r3 = r1 + 1
            com.badlogic.gdx.graphics.VertexAttribute r1 = com.badlogic.gdx.graphics.VertexAttribute.TexCoords(r1)
            r0.add(r1)
            r1 = r3
            goto L95
        L83:
            java.lang.String r4 = "BLENDWEIGHT"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L99
            int r3 = r2 + 1
            com.badlogic.gdx.graphics.VertexAttribute r2 = com.badlogic.gdx.graphics.VertexAttribute.BoneWeight(r2)
            r0.add(r2)
            r2 = r3
        L95:
            com.badlogic.gdx.utils.JsonValue r6 = r6.next
            goto L9
        L99:
            com.badlogic.gdx.utils.GdxRuntimeException r6 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown vertex attribute '"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "', should be one of position, normal, uv, tangent or binormal"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        Lb5:
            java.lang.Class<com.badlogic.gdx.graphics.VertexAttribute> r6 = com.badlogic.gdx.graphics.VertexAttribute.class
            java.lang.Object[] r6 = r0.toArray(r6)
            com.badlogic.gdx.graphics.VertexAttribute[] r6 = (com.badlogic.gdx.graphics.VertexAttribute[]) r6
            return r6
    }

    protected com.badlogic.gdx.graphics.Color parseColor(com.badlogic.gdx.utils.JsonValue r5) {
            r4 = this;
            int r0 = r5.size
            r1 = 3
            if (r0 < r1) goto L1c
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 0
            float r1 = r5.getFloat(r1)
            r2 = 1
            float r2 = r5.getFloat(r2)
            r3 = 2
            float r5 = r5.getFloat(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r2, r5, r3)
            return r0
        L1c:
            com.badlogic.gdx.utils.GdxRuntimeException r5 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "Expected Color values <> than three."
            r5.<init>(r0)
            throw r5
    }

    protected void parseMaterials(com.badlogic.gdx.graphics.g3d.model.data.ModelData r12, com.badlogic.gdx.utils.JsonValue r13, java.lang.String r14) {
            r11 = this;
            java.lang.String r0 = "materials"
            com.badlogic.gdx.utils.JsonValue r13 = r13.get(r0)
            if (r13 != 0) goto La
            goto L125
        La:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial> r0 = r12.materials
            int r1 = r13.size
            r0.ensureCapacity(r1)
            com.badlogic.gdx.utils.JsonValue r13 = r13.child
        L13:
            if (r13 == 0) goto L125
            com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial r0 = new com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial
            r0.<init>()
            java.lang.String r1 = "id"
            r2 = 0
            java.lang.String r3 = r13.getString(r1, r2)
            if (r3 == 0) goto L11d
            r0.id = r3
            java.lang.String r3 = "diffuse"
            com.badlogic.gdx.utils.JsonValue r3 = r13.get(r3)
            if (r3 == 0) goto L33
            com.badlogic.gdx.graphics.Color r3 = r11.parseColor(r3)
            r0.diffuse = r3
        L33:
            java.lang.String r3 = "ambient"
            com.badlogic.gdx.utils.JsonValue r3 = r13.get(r3)
            if (r3 == 0) goto L41
            com.badlogic.gdx.graphics.Color r3 = r11.parseColor(r3)
            r0.ambient = r3
        L41:
            java.lang.String r3 = "emissive"
            com.badlogic.gdx.utils.JsonValue r3 = r13.get(r3)
            if (r3 == 0) goto L4f
            com.badlogic.gdx.graphics.Color r3 = r11.parseColor(r3)
            r0.emissive = r3
        L4f:
            java.lang.String r3 = "specular"
            com.badlogic.gdx.utils.JsonValue r3 = r13.get(r3)
            if (r3 == 0) goto L5d
            com.badlogic.gdx.graphics.Color r3 = r11.parseColor(r3)
            r0.specular = r3
        L5d:
            java.lang.String r3 = "reflection"
            com.badlogic.gdx.utils.JsonValue r3 = r13.get(r3)
            if (r3 == 0) goto L6b
            com.badlogic.gdx.graphics.Color r3 = r11.parseColor(r3)
            r0.reflection = r3
        L6b:
            java.lang.String r3 = "shininess"
            r4 = 0
            float r3 = r13.getFloat(r3, r4)
            r0.shininess = r3
            java.lang.String r3 = "opacity"
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r13.getFloat(r3, r5)
            r0.opacity = r3
            java.lang.String r3 = "textures"
            com.badlogic.gdx.utils.JsonValue r3 = r13.get(r3)
            if (r3 == 0) goto L114
            com.badlogic.gdx.utils.JsonValue r3 = r3.child
        L88:
            if (r3 == 0) goto L114
            com.badlogic.gdx.graphics.g3d.model.data.ModelTexture r6 = new com.badlogic.gdx.graphics.g3d.model.data.ModelTexture
            r6.<init>()
            java.lang.String r7 = r3.getString(r1, r2)
            if (r7 == 0) goto L10c
            r6.id = r7
            java.lang.String r7 = "filename"
            java.lang.String r7 = r3.getString(r7, r2)
            if (r7 == 0) goto L104
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            int r9 = r14.length()
            java.lang.String r10 = "/"
            if (r9 == 0) goto Lb5
            boolean r9 = r14.endsWith(r10)
            if (r9 == 0) goto Lb7
        Lb5:
            java.lang.String r10 = ""
        Lb7:
            r8.append(r10)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.fileName = r7
            java.lang.String r7 = "uvTranslation"
            com.badlogic.gdx.utils.JsonValue r7 = r3.get(r7)
            com.badlogic.gdx.math.Vector2 r7 = r11.readVector2(r7, r4, r4)
            r6.uvTranslation = r7
            java.lang.String r7 = "uvScaling"
            com.badlogic.gdx.utils.JsonValue r7 = r3.get(r7)
            com.badlogic.gdx.math.Vector2 r7 = r11.readVector2(r7, r5, r5)
            r6.uvScaling = r7
            java.lang.String r7 = "type"
            java.lang.String r7 = r3.getString(r7, r2)
            if (r7 == 0) goto Lfc
            int r7 = r11.parseTextureUsage(r7)
            r6.usage = r7
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelTexture> r7 = r0.textures
            if (r7 != 0) goto Lf4
            com.badlogic.gdx.utils.Array r7 = new com.badlogic.gdx.utils.Array
            r7.<init>()
            r0.textures = r7
        Lf4:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelTexture> r7 = r0.textures
            r7.add(r6)
            com.badlogic.gdx.utils.JsonValue r3 = r3.next
            goto L88
        Lfc:
            com.badlogic.gdx.utils.GdxRuntimeException r12 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r13 = "Texture needs type."
            r12.<init>(r13)
            throw r12
        L104:
            com.badlogic.gdx.utils.GdxRuntimeException r12 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r13 = "Texture needs filename."
            r12.<init>(r13)
            throw r12
        L10c:
            com.badlogic.gdx.utils.GdxRuntimeException r12 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r13 = "Texture has no id."
            r12.<init>(r13)
            throw r12
        L114:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial> r1 = r12.materials
            r1.add(r0)
            com.badlogic.gdx.utils.JsonValue r13 = r13.next
            goto L13
        L11d:
            com.badlogic.gdx.utils.GdxRuntimeException r12 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r13 = "Material needs an id."
            r12.<init>(r13)
            throw r12
        L125:
            return
    }

    protected void parseMeshes(com.badlogic.gdx.graphics.g3d.model.data.ModelData r10, com.badlogic.gdx.utils.JsonValue r11) {
            r9 = this;
            java.lang.String r0 = "meshes"
            com.badlogic.gdx.utils.JsonValue r11 = r11.get(r0)
            if (r11 == 0) goto Le3
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMesh> r0 = r10.meshes
            int r1 = r11.size
            r0.ensureCapacity(r1)
            com.badlogic.gdx.utils.JsonValue r11 = r11.child
        L11:
            if (r11 == 0) goto Le3
            com.badlogic.gdx.graphics.g3d.model.data.ModelMesh r0 = new com.badlogic.gdx.graphics.g3d.model.data.ModelMesh
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r2 = ""
            java.lang.String r2 = r11.getString(r1, r2)
            r0.id = r2
            java.lang.String r2 = "attributes"
            com.badlogic.gdx.utils.JsonValue r2 = r11.require(r2)
            com.badlogic.gdx.graphics.VertexAttribute[] r2 = r9.parseAttributes(r2)
            r0.attributes = r2
            java.lang.String r2 = "vertices"
            com.badlogic.gdx.utils.JsonValue r2 = r11.require(r2)
            float[] r2 = r2.asFloatArray()
            r0.vertices = r2
            java.lang.String r2 = "parts"
            com.badlogic.gdx.utils.JsonValue r2 = r11.require(r2)
            com.badlogic.gdx.utils.Array r3 = new com.badlogic.gdx.utils.Array
            r3.<init>()
            com.badlogic.gdx.utils.JsonValue r2 = r2.child
        L47:
            if (r2 == 0) goto Ld0
            com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart r4 = new com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart
            r4.<init>()
            r5 = 0
            java.lang.String r6 = r2.getString(r1, r5)
            if (r6 == 0) goto Lc8
            com.badlogic.gdx.utils.Array$ArrayIterator r7 = r3.iterator()
        L59:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L8a
            java.lang.Object r8 = r7.next()
            com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart r8 = (com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart) r8
            java.lang.String r8 = r8.id
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L6e
            goto L59
        L6e:
            com.badlogic.gdx.utils.GdxRuntimeException r10 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Mesh part with id '"
            r11.append(r0)
            r11.append(r6)
            java.lang.String r0 = "' already in defined"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L8a:
            r4.id = r6
            java.lang.String r7 = "type"
            java.lang.String r5 = r2.getString(r7, r5)
            if (r5 == 0) goto Lac
            int r5 = r9.parseType(r5)
            r4.primitiveType = r5
            java.lang.String r5 = "indices"
            com.badlogic.gdx.utils.JsonValue r5 = r2.require(r5)
            short[] r5 = r5.asShortArray()
            r4.indices = r5
            r3.add(r4)
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            goto L47
        Lac:
            com.badlogic.gdx.utils.GdxRuntimeException r10 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "No primitive type given for mesh part '"
            r11.append(r0)
            r11.append(r6)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lc8:
            com.badlogic.gdx.utils.GdxRuntimeException r10 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r11 = "Not id given for mesh part"
            r10.<init>(r11)
            throw r10
        Ld0:
            java.lang.Class<com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart> r1 = com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart.class
            java.lang.Object[] r1 = r3.toArray(r1)
            com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart[] r1 = (com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart[]) r1
            r0.parts = r1
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMesh> r1 = r10.meshes
            r1.add(r0)
            com.badlogic.gdx.utils.JsonValue r11 = r11.next
            goto L11
        Le3:
            return
    }

    public com.badlogic.gdx.graphics.g3d.model.data.ModelData parseModel(com.badlogic.gdx.files.FileHandle r7) {
            r6 = this;
            com.badlogic.gdx.utils.BaseJsonReader r0 = r6.reader
            com.badlogic.gdx.utils.JsonValue r0 = r0.parse(r7)
            com.badlogic.gdx.graphics.g3d.model.data.ModelData r1 = new com.badlogic.gdx.graphics.g3d.model.data.ModelData
            r1.<init>()
            java.lang.String r2 = "version"
            com.badlogic.gdx.utils.JsonValue r2 = r0.require(r2)
            short[] r3 = r1.version
            r4 = 0
            short r5 = r2.getShort(r4)
            r3[r4] = r5
            short[] r3 = r1.version
            r5 = 1
            short r2 = r2.getShort(r5)
            r3[r5] = r2
            short[] r2 = r1.version
            short r3 = r2[r4]
            if (r3 != 0) goto L4c
            short r2 = r2[r5]
            if (r2 != r5) goto L4c
            java.lang.String r2 = "id"
            java.lang.String r3 = ""
            java.lang.String r2 = r0.getString(r2, r3)
            r1.id = r2
            r6.parseMeshes(r1, r0)
            com.badlogic.gdx.files.FileHandle r7 = r7.parent()
            java.lang.String r7 = r7.path()
            r6.parseMaterials(r1, r0, r7)
            r6.parseNodes(r1, r0)
            r6.parseAnimations(r1, r0)
            return r1
        L4c:
            com.badlogic.gdx.utils.GdxRuntimeException r7 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "Model version not supported"
            r7.<init>(r0)
            throw r7
    }

    protected com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNode> parseNodes(com.badlogic.gdx.graphics.g3d.model.data.ModelData r3, com.badlogic.gdx.utils.JsonValue r4) {
            r2 = this;
            java.lang.String r0 = "nodes"
            com.badlogic.gdx.utils.JsonValue r4 = r4.get(r0)
            if (r4 == 0) goto L1f
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNode> r0 = r3.nodes
            int r1 = r4.size
            r0.ensureCapacity(r1)
            com.badlogic.gdx.utils.JsonValue r4 = r4.child
        L11:
            if (r4 == 0) goto L1f
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNode> r0 = r3.nodes
            com.badlogic.gdx.graphics.g3d.model.data.ModelNode r1 = r2.parseNodesRecursively(r4)
            r0.add(r1)
            com.badlogic.gdx.utils.JsonValue r4 = r4.next
            goto L11
        L1f:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNode> r3 = r3.nodes
            return r3
    }

    protected com.badlogic.gdx.graphics.g3d.model.data.ModelNode parseNodesRecursively(com.badlogic.gdx.utils.JsonValue r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            com.badlogic.gdx.graphics.g3d.model.data.ModelNode r2 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNode
            r2.<init>()
            java.lang.String r3 = "id"
            r4 = 0
            java.lang.String r3 = r1.getString(r3, r4)
            if (r3 == 0) goto L1e2
            r2.id = r3
            java.lang.String r5 = "translation"
            com.badlogic.gdx.utils.JsonValue r6 = r1.get(r5)
            r7 = 3
            if (r6 == 0) goto L2a
            int r8 = r6.size
            if (r8 != r7) goto L22
            goto L2a
        L22:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r2 = "Node translation incomplete"
            r1.<init>(r2)
            throw r1
        L2a:
            r8 = 2
            r9 = 0
            r10 = 1
            if (r6 != 0) goto L31
            r11 = r4
            goto L42
        L31:
            com.badlogic.gdx.math.Vector3 r11 = new com.badlogic.gdx.math.Vector3
            float r12 = r6.getFloat(r9)
            float r13 = r6.getFloat(r10)
            float r6 = r6.getFloat(r8)
            r11.<init>(r12, r13, r6)
        L42:
            r2.translation = r11
            java.lang.String r6 = "rotation"
            com.badlogic.gdx.utils.JsonValue r11 = r1.get(r6)
            r12 = 4
            if (r11 == 0) goto L5a
            int r13 = r11.size
            if (r13 != r12) goto L52
            goto L5a
        L52:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r2 = "Node rotation incomplete"
            r1.<init>(r2)
            throw r1
        L5a:
            if (r11 != 0) goto L5e
            r13 = r4
            goto L73
        L5e:
            com.badlogic.gdx.math.Quaternion r13 = new com.badlogic.gdx.math.Quaternion
            float r14 = r11.getFloat(r9)
            float r15 = r11.getFloat(r10)
            float r12 = r11.getFloat(r8)
            float r11 = r11.getFloat(r7)
            r13.<init>(r14, r15, r12, r11)
        L73:
            r2.rotation = r13
            java.lang.String r11 = "scale"
            com.badlogic.gdx.utils.JsonValue r12 = r1.get(r11)
            if (r12 == 0) goto L8a
            int r13 = r12.size
            if (r13 != r7) goto L82
            goto L8a
        L82:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r2 = "Node scale incomplete"
            r1.<init>(r2)
            throw r1
        L8a:
            if (r12 != 0) goto L8e
            r13 = r4
            goto L9f
        L8e:
            com.badlogic.gdx.math.Vector3 r13 = new com.badlogic.gdx.math.Vector3
            float r14 = r12.getFloat(r9)
            float r15 = r12.getFloat(r10)
            float r12 = r12.getFloat(r8)
            r13.<init>(r14, r15, r12)
        L9f:
            r2.scale = r13
            java.lang.String r12 = "mesh"
            java.lang.String r12 = r1.getString(r12, r4)
            if (r12 == 0) goto Lab
            r2.meshId = r12
        Lab:
            java.lang.String r12 = "parts"
            com.badlogic.gdx.utils.JsonValue r12 = r1.get(r12)
            if (r12 == 0) goto L1bc
            int r13 = r12.size
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodePart[] r13 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNodePart[r13]
            r2.parts = r13
            com.badlogic.gdx.utils.JsonValue r12 = r12.child
            r13 = 0
        Lbc:
            if (r12 == 0) goto L1bc
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodePart r14 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNodePart
            r14.<init>()
            java.lang.String r15 = "meshpartid"
            java.lang.String r15 = r12.getString(r15, r4)
            java.lang.String r8 = "materialid"
            java.lang.String r8 = r12.getString(r8, r4)
            if (r15 == 0) goto L1a0
            if (r8 == 0) goto L1a0
            r14.materialId = r8
            r14.meshPartId = r15
            java.lang.String r8 = "bones"
            com.badlogic.gdx.utils.JsonValue r8 = r12.get(r8)
            if (r8 == 0) goto L185
            com.badlogic.gdx.utils.ArrayMap r15 = new com.badlogic.gdx.utils.ArrayMap
            int r9 = r8.size
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            java.lang.Class<com.badlogic.gdx.math.Matrix4> r4 = com.badlogic.gdx.math.Matrix4.class
            r15.<init>(r10, r9, r7, r4)
            r14.bones = r15
            com.badlogic.gdx.utils.JsonValue r4 = r8.child
        Lee:
            if (r4 == 0) goto L185
            java.lang.String r7 = "node"
            r8 = 0
            java.lang.String r7 = r4.getString(r7, r8)
            if (r7 == 0) goto L17d
            com.badlogic.gdx.math.Matrix4 r9 = new com.badlogic.gdx.math.Matrix4
            r9.<init>()
            com.badlogic.gdx.utils.JsonValue r15 = r4.get(r5)
            if (r15 == 0) goto L11e
            int r8 = r15.size
            r10 = 3
            if (r8 < r10) goto L11e
            r8 = 0
            float r10 = r15.getFloat(r8)
            r16 = r5
            r8 = 1
            float r5 = r15.getFloat(r8)
            r8 = 2
            float r15 = r15.getFloat(r8)
            r9.translate(r10, r5, r15)
            goto L120
        L11e:
            r16 = r5
        L120:
            com.badlogic.gdx.utils.JsonValue r5 = r4.get(r6)
            if (r5 == 0) goto L14b
            int r8 = r5.size
            r10 = 4
            if (r8 < r10) goto L14b
            com.badlogic.gdx.math.Quaternion r8 = r0.tempQ
            r15 = 0
            float r10 = r5.getFloat(r15)
            r17 = r6
            r15 = 1
            float r6 = r5.getFloat(r15)
            r15 = 2
            float r0 = r5.getFloat(r15)
            r15 = 3
            float r5 = r5.getFloat(r15)
            com.badlogic.gdx.math.Quaternion r0 = r8.set(r10, r6, r0, r5)
            r9.rotate(r0)
            goto L14e
        L14b:
            r17 = r6
            r15 = 3
        L14e:
            com.badlogic.gdx.utils.JsonValue r0 = r4.get(r11)
            if (r0 == 0) goto L16b
            int r5 = r0.size
            if (r5 < r15) goto L16b
            r5 = 0
            float r6 = r0.getFloat(r5)
            r8 = 1
            float r10 = r0.getFloat(r8)
            r8 = 2
            float r0 = r0.getFloat(r8)
            r9.scale(r6, r10, r0)
            goto L16d
        L16b:
            r5 = 0
            r8 = 2
        L16d:
            com.badlogic.gdx.utils.ArrayMap<java.lang.String, com.badlogic.gdx.math.Matrix4> r0 = r14.bones
            r0.put(r7, r9)
            com.badlogic.gdx.utils.JsonValue r4 = r4.next
            r0 = r18
            r5 = r16
            r6 = r17
            r10 = 1
            goto Lee
        L17d:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Bone node ID missing"
            r0.<init>(r1)
            throw r0
        L185:
            r16 = r5
            r17 = r6
            r5 = 0
            r8 = 2
            r15 = 3
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodePart[] r0 = r2.parts
            r0[r13] = r14
            com.badlogic.gdx.utils.JsonValue r12 = r12.next
            r0 = 1
            int r13 = r13 + r0
            r4 = 0
            r7 = 3
            r9 = 0
            r0 = r18
            r5 = r16
            r6 = r17
            r10 = 1
            goto Lbc
        L1a0:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Node "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " part is missing meshPartId or materialId"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1bc:
            r5 = 0
            java.lang.String r0 = "children"
            com.badlogic.gdx.utils.JsonValue r0 = r1.get(r0)
            if (r0 == 0) goto L1df
            int r1 = r0.size
            com.badlogic.gdx.graphics.g3d.model.data.ModelNode[] r1 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNode[r1]
            r2.children = r1
            com.badlogic.gdx.utils.JsonValue r0 = r0.child
            r9 = 0
        L1ce:
            if (r0 == 0) goto L1df
            com.badlogic.gdx.graphics.g3d.model.data.ModelNode[] r1 = r2.children
            r3 = r18
            com.badlogic.gdx.graphics.g3d.model.data.ModelNode r4 = r3.parseNodesRecursively(r0)
            r1[r9] = r4
            com.badlogic.gdx.utils.JsonValue r0 = r0.next
            r1 = 1
            int r9 = r9 + r1
            goto L1ce
        L1df:
            r3 = r18
            return r2
        L1e2:
            r3 = r0
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Node id missing."
            r0.<init>(r1)
            throw r0
    }

    protected int parseTextureUsage(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "AMBIENT"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto La
            r2 = 4
            return r2
        La:
            java.lang.String r0 = "BUMP"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L15
            r2 = 8
            return r2
        L15:
            java.lang.String r0 = "DIFFUSE"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L1f
            r2 = 2
            return r2
        L1f:
            java.lang.String r0 = "EMISSIVE"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L29
            r2 = 3
            return r2
        L29:
            java.lang.String r0 = "NONE"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L33
            r2 = 1
            return r2
        L33:
            java.lang.String r0 = "NORMAL"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L3d
            r2 = 7
            return r2
        L3d:
            java.lang.String r0 = "REFLECTION"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L48
            r2 = 10
            return r2
        L48:
            java.lang.String r0 = "SHININESS"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L52
            r2 = 6
            return r2
        L52:
            java.lang.String r0 = "SPECULAR"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L5c
            r2 = 5
            return r2
        L5c:
            java.lang.String r0 = "TRANSPARENCY"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L67
            r2 = 9
            return r2
        L67:
            r2 = 0
            return r2
    }

    protected int parseType(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "TRIANGLES"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto La
            r4 = 4
            return r4
        La:
            java.lang.String r0 = "LINES"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L14
            r4 = 1
            return r4
        L14:
            java.lang.String r0 = "POINTS"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1e
            r4 = 0
            return r4
        L1e:
            java.lang.String r0 = "TRIANGLE_STRIP"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L28
            r4 = 5
            return r4
        L28:
            java.lang.String r0 = "LINE_STRIP"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L32
            r4 = 3
            return r4
        L32:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown primitive type '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "', should be one of triangle, trianglestrip, line, linestrip or point"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    protected com.badlogic.gdx.math.Vector2 readVector2(com.badlogic.gdx.utils.JsonValue r2, float r3, float r4) {
            r1 = this;
            if (r2 != 0) goto L8
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r2.<init>(r3, r4)
            return r2
        L8:
            int r3 = r2.size
            r4 = 2
            if (r3 != r4) goto L1d
            com.badlogic.gdx.math.Vector2 r3 = new com.badlogic.gdx.math.Vector2
            r4 = 0
            float r4 = r2.getFloat(r4)
            r0 = 1
            float r2 = r2.getFloat(r0)
            r3.<init>(r4, r2)
            return r3
        L1d:
            com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r3 = "Expected Vector2 values <> than two."
            r2.<init>(r3)
            throw r2
    }
}
