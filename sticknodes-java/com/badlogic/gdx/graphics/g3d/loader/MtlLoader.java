package com.badlogic.gdx.graphics.g3d.loader;

/* compiled from: ObjLoader.java */
/* loaded from: classes.dex */
class MtlLoader {
    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial> materials;

    /* compiled from: ObjLoader.java */
    private static class ObjMaterial {
        java.lang.String alphaTexFilename;
        com.badlogic.gdx.graphics.Color ambientColor;
        java.lang.String ambientTexFilename;
        com.badlogic.gdx.graphics.Color diffuseColor;
        java.lang.String diffuseTexFilename;
        java.lang.String materialName;
        float opacity;
        float shininess;
        java.lang.String shininessTexFilename;
        com.badlogic.gdx.graphics.Color specularColor;
        java.lang.String specularTexFilename;

        public ObjMaterial() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "default"
                r1.materialName = r0
                r1.reset()
                return
        }

        private void addTexture(com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial r2, java.lang.String r3, int r4) {
                r1 = this;
                if (r3 == 0) goto L1c
                com.badlogic.gdx.graphics.g3d.model.data.ModelTexture r0 = new com.badlogic.gdx.graphics.g3d.model.data.ModelTexture
                r0.<init>()
                r0.usage = r4
                r0.fileName = r3
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelTexture> r3 = r2.textures
                if (r3 != 0) goto L17
                com.badlogic.gdx.utils.Array r3 = new com.badlogic.gdx.utils.Array
                r4 = 1
                r3.<init>(r4)
                r2.textures = r3
            L17:
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelTexture> r2 = r2.textures
                r2.add(r0)
            L1c:
                return
        }

        public com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial build() {
                r3 = this;
                com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial r0 = new com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial
                r0.<init>()
                java.lang.String r1 = r3.materialName
                r0.id = r1
                com.badlogic.gdx.graphics.Color r1 = r3.ambientColor
                if (r1 != 0) goto Lf
                r1 = 0
                goto L16
            Lf:
                com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
                com.badlogic.gdx.graphics.Color r2 = r3.ambientColor
                r1.<init>(r2)
            L16:
                r0.ambient = r1
                com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
                com.badlogic.gdx.graphics.Color r2 = r3.diffuseColor
                r1.<init>(r2)
                r0.diffuse = r1
                com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
                com.badlogic.gdx.graphics.Color r2 = r3.specularColor
                r1.<init>(r2)
                r0.specular = r1
                float r1 = r3.opacity
                r0.opacity = r1
                float r1 = r3.shininess
                r0.shininess = r1
                java.lang.String r1 = r3.alphaTexFilename
                r2 = 9
                r3.addTexture(r0, r1, r2)
                java.lang.String r1 = r3.ambientTexFilename
                r2 = 4
                r3.addTexture(r0, r1, r2)
                java.lang.String r1 = r3.diffuseTexFilename
                r2 = 2
                r3.addTexture(r0, r1, r2)
                java.lang.String r1 = r3.specularTexFilename
                r2 = 5
                r3.addTexture(r0, r1, r2)
                java.lang.String r1 = r3.shininessTexFilename
                r2 = 6
                r3.addTexture(r0, r1, r2)
                return r0
        }

        public void reset() {
                r2 = this;
                r0 = 0
                r2.ambientColor = r0
                com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.WHITE
                r2.diffuseColor = r1
                r2.specularColor = r1
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.opacity = r1
                r1 = 0
                r2.shininess = r1
                r2.alphaTexFilename = r0
                r2.ambientTexFilename = r0
                r2.diffuseTexFilename = r0
                r2.shininessTexFilename = r0
                r2.specularTexFilename = r0
                return
        }
    }

    MtlLoader() {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.materials = r0
            return
    }

    private com.badlogic.gdx.graphics.Color parseColor(java.lang.String[] r6) {
            r5 = this;
            r0 = 1
            r0 = r6[r0]
            float r0 = java.lang.Float.parseFloat(r0)
            r1 = 2
            r1 = r6[r1]
            float r1 = java.lang.Float.parseFloat(r1)
            r2 = 3
            r2 = r6[r2]
            float r2 = java.lang.Float.parseFloat(r2)
            int r3 = r6.length
            r4 = 4
            if (r3 <= r4) goto L20
            r6 = r6[r4]
            float r6 = java.lang.Float.parseFloat(r6)
            goto L22
        L20:
            r6 = 1065353216(0x3f800000, float:1.0)
        L22:
            com.badlogic.gdx.graphics.Color r3 = new com.badlogic.gdx.graphics.Color
            r3.<init>(r0, r1, r2, r6)
            return r3
    }

    public com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial getMaterial(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial> r0 = r3.materials
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial r1 = (com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial) r1
            java.lang.String r2 = r1.id
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            return r1
        L1b:
            com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial r0 = new com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial
            r0.<init>()
            r0.id = r4
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.WHITE
            r4.<init>(r1)
            r0.diffuse = r4
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial> r4 = r3.materials
            r4.add(r0)
            return r0
    }

    public void load(com.badlogic.gdx.files.FileHandle r8) {
            r7 = this;
            com.badlogic.gdx.graphics.g3d.loader.MtlLoader$ObjMaterial r0 = new com.badlogic.gdx.graphics.g3d.loader.MtlLoader$ObjMaterial
            r0.<init>()
            if (r8 == 0) goto L173
            boolean r1 = r8.exists()
            if (r1 != 0) goto Lf
            goto L173
        Lf:
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.InputStream r3 = r8.read()
            r2.<init>(r3)
            r3 = 4096(0x1000, float:5.74E-42)
            r1.<init>(r2, r3)
        L1f:
            java.lang.String r2 = r1.readLine()     // Catch: java.io.IOException -> L173
            if (r2 == 0) goto L167
            int r3 = r2.length()     // Catch: java.io.IOException -> L173
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L3d
            char r3 = r2.charAt(r4)     // Catch: java.io.IOException -> L173
            r6 = 9
            if (r3 != r6) goto L3d
            java.lang.String r2 = r2.substring(r5)     // Catch: java.io.IOException -> L173
            java.lang.String r2 = r2.trim()     // Catch: java.io.IOException -> L173
        L3d:
            java.lang.String r3 = "\\s+"
            java.lang.String[] r2 = r2.split(r3)     // Catch: java.io.IOException -> L173
            r3 = r2[r4]     // Catch: java.io.IOException -> L173
            int r3 = r3.length()     // Catch: java.io.IOException -> L173
            if (r3 != 0) goto L4c
            goto L1f
        L4c:
            r3 = r2[r4]     // Catch: java.io.IOException -> L173
            char r3 = r3.charAt(r4)     // Catch: java.io.IOException -> L173
            r6 = 35
            if (r3 != r6) goto L57
            goto L1f
        L57:
            r3 = r2[r4]     // Catch: java.io.IOException -> L173
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.io.IOException -> L173
            java.lang.String r4 = "newmtl"
            boolean r4 = r3.equals(r4)     // Catch: java.io.IOException -> L173
            if (r4 == 0) goto L88
            com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial r3 = r0.build()     // Catch: java.io.IOException -> L173
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial> r4 = r7.materials     // Catch: java.io.IOException -> L173
            r4.add(r3)     // Catch: java.io.IOException -> L173
            int r3 = r2.length     // Catch: java.io.IOException -> L173
            if (r3 <= r5) goto L80
            r2 = r2[r5]     // Catch: java.io.IOException -> L173
            r0.materialName = r2     // Catch: java.io.IOException -> L173
            r3 = 46
            r4 = 95
            java.lang.String r2 = r2.replace(r3, r4)     // Catch: java.io.IOException -> L173
            r0.materialName = r2     // Catch: java.io.IOException -> L173
            goto L84
        L80:
            java.lang.String r2 = "default"
            r0.materialName = r2     // Catch: java.io.IOException -> L173
        L84:
            r0.reset()     // Catch: java.io.IOException -> L173
            goto L1f
        L88:
            java.lang.String r4 = "ka"
            boolean r4 = r3.equals(r4)     // Catch: java.io.IOException -> L173
            if (r4 == 0) goto L97
            com.badlogic.gdx.graphics.Color r2 = r7.parseColor(r2)     // Catch: java.io.IOException -> L173
            r0.ambientColor = r2     // Catch: java.io.IOException -> L173
            goto L1f
        L97:
            java.lang.String r4 = "kd"
            boolean r4 = r3.equals(r4)     // Catch: java.io.IOException -> L173
            if (r4 == 0) goto La7
            com.badlogic.gdx.graphics.Color r2 = r7.parseColor(r2)     // Catch: java.io.IOException -> L173
            r0.diffuseColor = r2     // Catch: java.io.IOException -> L173
            goto L1f
        La7:
            java.lang.String r4 = "ks"
            boolean r4 = r3.equals(r4)     // Catch: java.io.IOException -> L173
            if (r4 == 0) goto Lb7
            com.badlogic.gdx.graphics.Color r2 = r7.parseColor(r2)     // Catch: java.io.IOException -> L173
            r0.specularColor = r2     // Catch: java.io.IOException -> L173
            goto L1f
        Lb7:
            java.lang.String r4 = "tr"
            boolean r4 = r3.equals(r4)     // Catch: java.io.IOException -> L173
            if (r4 != 0) goto L15d
            java.lang.String r4 = "d"
            boolean r4 = r3.equals(r4)     // Catch: java.io.IOException -> L173
            if (r4 == 0) goto Lc9
            goto L15d
        Lc9:
            java.lang.String r4 = "ns"
            boolean r4 = r3.equals(r4)     // Catch: java.io.IOException -> L173
            if (r4 == 0) goto Ldb
            r2 = r2[r5]     // Catch: java.io.IOException -> L173
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.io.IOException -> L173
            r0.shininess = r2     // Catch: java.io.IOException -> L173
            goto L1f
        Ldb:
            java.lang.String r4 = "map_d"
            boolean r4 = r3.equals(r4)     // Catch: java.io.IOException -> L173
            if (r4 == 0) goto Lf5
            com.badlogic.gdx.files.FileHandle r3 = r8.parent()     // Catch: java.io.IOException -> L173
            r2 = r2[r5]     // Catch: java.io.IOException -> L173
            com.badlogic.gdx.files.FileHandle r2 = r3.child(r2)     // Catch: java.io.IOException -> L173
            java.lang.String r2 = r2.path()     // Catch: java.io.IOException -> L173
            r0.alphaTexFilename = r2     // Catch: java.io.IOException -> L173
            goto L1f
        Lf5:
            java.lang.String r4 = "map_ka"
            boolean r4 = r3.equals(r4)     // Catch: java.io.IOException -> L173
            if (r4 == 0) goto L10f
            com.badlogic.gdx.files.FileHandle r3 = r8.parent()     // Catch: java.io.IOException -> L173
            r2 = r2[r5]     // Catch: java.io.IOException -> L173
            com.badlogic.gdx.files.FileHandle r2 = r3.child(r2)     // Catch: java.io.IOException -> L173
            java.lang.String r2 = r2.path()     // Catch: java.io.IOException -> L173
            r0.ambientTexFilename = r2     // Catch: java.io.IOException -> L173
            goto L1f
        L10f:
            java.lang.String r4 = "map_kd"
            boolean r4 = r3.equals(r4)     // Catch: java.io.IOException -> L173
            if (r4 == 0) goto L129
            com.badlogic.gdx.files.FileHandle r3 = r8.parent()     // Catch: java.io.IOException -> L173
            r2 = r2[r5]     // Catch: java.io.IOException -> L173
            com.badlogic.gdx.files.FileHandle r2 = r3.child(r2)     // Catch: java.io.IOException -> L173
            java.lang.String r2 = r2.path()     // Catch: java.io.IOException -> L173
            r0.diffuseTexFilename = r2     // Catch: java.io.IOException -> L173
            goto L1f
        L129:
            java.lang.String r4 = "map_ks"
            boolean r4 = r3.equals(r4)     // Catch: java.io.IOException -> L173
            if (r4 == 0) goto L143
            com.badlogic.gdx.files.FileHandle r3 = r8.parent()     // Catch: java.io.IOException -> L173
            r2 = r2[r5]     // Catch: java.io.IOException -> L173
            com.badlogic.gdx.files.FileHandle r2 = r3.child(r2)     // Catch: java.io.IOException -> L173
            java.lang.String r2 = r2.path()     // Catch: java.io.IOException -> L173
            r0.specularTexFilename = r2     // Catch: java.io.IOException -> L173
            goto L1f
        L143:
            java.lang.String r4 = "map_ns"
            boolean r3 = r3.equals(r4)     // Catch: java.io.IOException -> L173
            if (r3 == 0) goto L1f
            com.badlogic.gdx.files.FileHandle r3 = r8.parent()     // Catch: java.io.IOException -> L173
            r2 = r2[r5]     // Catch: java.io.IOException -> L173
            com.badlogic.gdx.files.FileHandle r2 = r3.child(r2)     // Catch: java.io.IOException -> L173
            java.lang.String r2 = r2.path()     // Catch: java.io.IOException -> L173
            r0.shininessTexFilename = r2     // Catch: java.io.IOException -> L173
            goto L1f
        L15d:
            r2 = r2[r5]     // Catch: java.io.IOException -> L173
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.io.IOException -> L173
            r0.opacity = r2     // Catch: java.io.IOException -> L173
            goto L1f
        L167:
            r1.close()     // Catch: java.io.IOException -> L173
            com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial r8 = r0.build()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial> r0 = r7.materials
            r0.add(r8)
        L173:
            return
    }
}
