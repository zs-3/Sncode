package com.badlogic.gdx.graphics.g3d.loader;

/* loaded from: classes.dex */
public class ObjLoader extends com.badlogic.gdx.assets.loaders.ModelLoader<com.badlogic.gdx.graphics.g3d.loader.ObjLoader.ObjLoaderParameters> {
    public static boolean logWarning;
    final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.loader.ObjLoader.Group> groups;
    final com.badlogic.gdx.utils.FloatArray norms;
    final com.badlogic.gdx.utils.FloatArray uvs;
    final com.badlogic.gdx.utils.FloatArray verts;

    private static class Group {
        com.badlogic.gdx.utils.Array<java.lang.Integer> faces;
        boolean hasNorms;
        boolean hasUVs;
        com.badlogic.gdx.graphics.g3d.Material mat;
        java.lang.String materialName;
        final java.lang.String name;
        int numFaces;

        Group(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                r1.name = r2
                com.badlogic.gdx.utils.Array r2 = new com.badlogic.gdx.utils.Array
                r0 = 200(0xc8, float:2.8E-43)
                r2.<init>(r0)
                r1.faces = r2
                r2 = 0
                r1.numFaces = r2
                com.badlogic.gdx.graphics.g3d.Material r2 = new com.badlogic.gdx.graphics.g3d.Material
                java.lang.String r0 = ""
                r2.<init>(r0)
                r1.mat = r2
                java.lang.String r2 = "default"
                r1.materialName = r2
                return
        }
    }

    public static class ObjLoaderParameters extends com.badlogic.gdx.assets.loaders.ModelLoader.ModelParameters {
        public boolean flipV;

        public ObjLoaderParameters() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            return
    }

    public ObjLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r2) {
            r1 = this;
            r1.<init>(r2)
            com.badlogic.gdx.utils.FloatArray r2 = new com.badlogic.gdx.utils.FloatArray
            r0 = 300(0x12c, float:4.2E-43)
            r2.<init>(r0)
            r1.verts = r2
            com.badlogic.gdx.utils.FloatArray r2 = new com.badlogic.gdx.utils.FloatArray
            r2.<init>(r0)
            r1.norms = r2
            com.badlogic.gdx.utils.FloatArray r2 = new com.badlogic.gdx.utils.FloatArray
            r0 = 200(0xc8, float:2.8E-43)
            r2.<init>(r0)
            r1.uvs = r2
            com.badlogic.gdx.utils.Array r2 = new com.badlogic.gdx.utils.Array
            r0 = 10
            r2.<init>(r0)
            r1.groups = r2
            return
    }

    private int getIndex(java.lang.String r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L14
            int r0 = r2.length()
            if (r0 != 0) goto L9
            goto L14
        L9:
            int r2 = java.lang.Integer.parseInt(r2)
            if (r2 >= 0) goto L11
            int r3 = r3 + r2
            return r3
        L11:
            int r2 = r2 + (-1)
            return r2
        L14:
            r2 = 0
            return r2
    }

    private com.badlogic.gdx.graphics.g3d.loader.ObjLoader.Group setActiveGroup(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group> r0 = r3.groups
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group r1 = (com.badlogic.gdx.graphics.g3d.loader.ObjLoader.Group) r1
            java.lang.String r2 = r1.name
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            return r1
        L1b:
            com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group r0 = new com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group
            r0.<init>(r4)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group> r4 = r3.groups
            r4.add(r0)
            return r0
    }

    @Override // com.badlogic.gdx.assets.loaders.ModelLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.g3d.model.data.ModelData loadModelData(com.badlogic.gdx.files.FileHandle r1, com.badlogic.gdx.assets.loaders.ModelLoader.ModelParameters r2) {
            r0 = this;
            com.badlogic.gdx.graphics.g3d.loader.ObjLoader$ObjLoaderParameters r2 = (com.badlogic.gdx.graphics.g3d.loader.ObjLoader.ObjLoaderParameters) r2
            com.badlogic.gdx.graphics.g3d.model.data.ModelData r1 = r0.loadModelData(r1, r2)
            return r1
    }

    public com.badlogic.gdx.graphics.g3d.model.data.ModelData loadModelData(com.badlogic.gdx.files.FileHandle r1, com.badlogic.gdx.graphics.g3d.loader.ObjLoader.ObjLoaderParameters r2) {
            r0 = this;
            if (r2 == 0) goto L8
            boolean r2 = r2.flipV
            if (r2 == 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            com.badlogic.gdx.graphics.g3d.model.data.ModelData r1 = r0.loadModelData(r1, r2)
            return r1
    }

    protected com.badlogic.gdx.graphics.g3d.model.data.ModelData loadModelData(com.badlogic.gdx.files.FileHandle r22, boolean r23) {
            r21 = this;
            r0 = r21
            java.lang.String r1 = "/"
            boolean r2 = com.badlogic.gdx.graphics.g3d.loader.ObjLoader.logWarning
            if (r2 == 0) goto L11
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            java.lang.String r3 = "ObjLoader"
            java.lang.String r4 = "Wavefront (OBJ) is not fully supported, consult the documentation for more information"
            r2.error(r3, r4)
        L11:
            com.badlogic.gdx.graphics.g3d.loader.MtlLoader r2 = new com.badlogic.gdx.graphics.g3d.loader.MtlLoader
            r2.<init>()
            com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group r3 = new com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group
            java.lang.String r4 = "default"
            r3.<init>(r4)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group> r5 = r0.groups
            r5.add(r3)
            java.io.BufferedReader r5 = new java.io.BufferedReader
            java.io.InputStreamReader r6 = new java.io.InputStreamReader
            java.io.InputStream r7 = r22.read()
            r6.<init>(r7)
            r7 = 4096(0x1000, float:5.74E-42)
            r5.<init>(r6, r7)
        L32:
            r6 = 0
            java.lang.String r7 = r5.readLine()     // Catch: java.io.IOException -> L470
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 3
            r10 = 2
            r11 = 0
            r12 = 1
            if (r7 == 0) goto L230
            java.lang.String r13 = "\\s+"
            java.lang.String[] r7 = r7.split(r13)     // Catch: java.io.IOException -> L470
            int r13 = r7.length     // Catch: java.io.IOException -> L470
            if (r13 >= r12) goto L4a
            goto L230
        L4a:
            r13 = r7[r11]     // Catch: java.io.IOException -> L470
            int r13 = r13.length()     // Catch: java.io.IOException -> L470
            if (r13 != 0) goto L53
            goto L32
        L53:
            r13 = r7[r11]     // Catch: java.io.IOException -> L470
            java.lang.String r13 = r13.toLowerCase()     // Catch: java.io.IOException -> L470
            char r13 = r13.charAt(r11)     // Catch: java.io.IOException -> L470
            r14 = 35
            if (r13 != r14) goto L62
            goto L32
        L62:
            r14 = 118(0x76, float:1.65E-43)
            if (r13 != r14) goto Le9
            r13 = r7[r11]     // Catch: java.io.IOException -> L470
            int r13 = r13.length()     // Catch: java.io.IOException -> L470
            if (r13 != r12) goto L90
            com.badlogic.gdx.utils.FloatArray r8 = r0.verts     // Catch: java.io.IOException -> L470
            r11 = r7[r12]     // Catch: java.io.IOException -> L470
            float r11 = java.lang.Float.parseFloat(r11)     // Catch: java.io.IOException -> L470
            r8.add(r11)     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r8 = r0.verts     // Catch: java.io.IOException -> L470
            r10 = r7[r10]     // Catch: java.io.IOException -> L470
            float r10 = java.lang.Float.parseFloat(r10)     // Catch: java.io.IOException -> L470
            r8.add(r10)     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r8 = r0.verts     // Catch: java.io.IOException -> L470
            r7 = r7[r9]     // Catch: java.io.IOException -> L470
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.io.IOException -> L470
            r8.add(r7)     // Catch: java.io.IOException -> L470
            goto L32
        L90:
            r13 = r7[r11]     // Catch: java.io.IOException -> L470
            char r13 = r13.charAt(r12)     // Catch: java.io.IOException -> L470
            r14 = 110(0x6e, float:1.54E-43)
            if (r13 != r14) goto Lbd
            com.badlogic.gdx.utils.FloatArray r8 = r0.norms     // Catch: java.io.IOException -> L470
            r11 = r7[r12]     // Catch: java.io.IOException -> L470
            float r11 = java.lang.Float.parseFloat(r11)     // Catch: java.io.IOException -> L470
            r8.add(r11)     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r8 = r0.norms     // Catch: java.io.IOException -> L470
            r10 = r7[r10]     // Catch: java.io.IOException -> L470
            float r10 = java.lang.Float.parseFloat(r10)     // Catch: java.io.IOException -> L470
            r8.add(r10)     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r8 = r0.norms     // Catch: java.io.IOException -> L470
            r7 = r7[r9]     // Catch: java.io.IOException -> L470
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.io.IOException -> L470
            r8.add(r7)     // Catch: java.io.IOException -> L470
            goto L32
        Lbd:
            r9 = r7[r11]     // Catch: java.io.IOException -> L470
            char r9 = r9.charAt(r12)     // Catch: java.io.IOException -> L470
            r11 = 116(0x74, float:1.63E-43)
            if (r9 != r11) goto L32
            com.badlogic.gdx.utils.FloatArray r9 = r0.uvs     // Catch: java.io.IOException -> L470
            r11 = r7[r12]     // Catch: java.io.IOException -> L470
            float r11 = java.lang.Float.parseFloat(r11)     // Catch: java.io.IOException -> L470
            r9.add(r11)     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r9 = r0.uvs     // Catch: java.io.IOException -> L470
            if (r23 == 0) goto Lde
            r7 = r7[r10]     // Catch: java.io.IOException -> L470
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.io.IOException -> L470
            float r8 = r8 - r7
            goto Le4
        Lde:
            r7 = r7[r10]     // Catch: java.io.IOException -> L470
            float r8 = java.lang.Float.parseFloat(r7)     // Catch: java.io.IOException -> L470
        Le4:
            r9.add(r8)     // Catch: java.io.IOException -> L470
            goto L32
        Le9:
            r8 = 102(0x66, float:1.43E-43)
            if (r13 != r8) goto L1de
            com.badlogic.gdx.utils.Array<java.lang.Integer> r8 = r3.faces     // Catch: java.io.IOException -> L470
            r9 = 1
        Lf0:
            int r13 = r7.length     // Catch: java.io.IOException -> L470
            int r13 = r13 - r10
            if (r9 >= r13) goto L32
            r13 = r7[r12]     // Catch: java.io.IOException -> L470
            java.lang.String[] r13 = r13.split(r1)     // Catch: java.io.IOException -> L470
            r14 = r13[r11]     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r15 = r0.verts     // Catch: java.io.IOException -> L470
            int r15 = r15.size     // Catch: java.io.IOException -> L470
            int r14 = r0.getIndex(r14, r15)     // Catch: java.io.IOException -> L470
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.io.IOException -> L470
            r8.add(r14)     // Catch: java.io.IOException -> L470
            int r14 = r13.length     // Catch: java.io.IOException -> L470
            if (r14 <= r10) goto L123
            if (r9 != r12) goto L112
            r3.hasNorms = r12     // Catch: java.io.IOException -> L470
        L112:
            r14 = r13[r10]     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r15 = r0.norms     // Catch: java.io.IOException -> L470
            int r15 = r15.size     // Catch: java.io.IOException -> L470
            int r14 = r0.getIndex(r14, r15)     // Catch: java.io.IOException -> L470
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.io.IOException -> L470
            r8.add(r14)     // Catch: java.io.IOException -> L470
        L123:
            int r14 = r13.length     // Catch: java.io.IOException -> L470
            if (r14 <= r12) goto L143
            r14 = r13[r12]     // Catch: java.io.IOException -> L470
            int r14 = r14.length()     // Catch: java.io.IOException -> L470
            if (r14 <= 0) goto L143
            if (r9 != r12) goto L132
            r3.hasUVs = r12     // Catch: java.io.IOException -> L470
        L132:
            r13 = r13[r12]     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r14 = r0.uvs     // Catch: java.io.IOException -> L470
            int r14 = r14.size     // Catch: java.io.IOException -> L470
            int r13 = r0.getIndex(r13, r14)     // Catch: java.io.IOException -> L470
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.io.IOException -> L470
            r8.add(r13)     // Catch: java.io.IOException -> L470
        L143:
            int r9 = r9 + 1
            r13 = r7[r9]     // Catch: java.io.IOException -> L470
            java.lang.String[] r13 = r13.split(r1)     // Catch: java.io.IOException -> L470
            r14 = r13[r11]     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r15 = r0.verts     // Catch: java.io.IOException -> L470
            int r15 = r15.size     // Catch: java.io.IOException -> L470
            int r14 = r0.getIndex(r14, r15)     // Catch: java.io.IOException -> L470
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.io.IOException -> L470
            r8.add(r14)     // Catch: java.io.IOException -> L470
            int r14 = r13.length     // Catch: java.io.IOException -> L470
            if (r14 <= r10) goto L170
            r14 = r13[r10]     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r15 = r0.norms     // Catch: java.io.IOException -> L470
            int r15 = r15.size     // Catch: java.io.IOException -> L470
            int r14 = r0.getIndex(r14, r15)     // Catch: java.io.IOException -> L470
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.io.IOException -> L470
            r8.add(r14)     // Catch: java.io.IOException -> L470
        L170:
            int r14 = r13.length     // Catch: java.io.IOException -> L470
            if (r14 <= r12) goto L18c
            r14 = r13[r12]     // Catch: java.io.IOException -> L470
            int r14 = r14.length()     // Catch: java.io.IOException -> L470
            if (r14 <= 0) goto L18c
            r13 = r13[r12]     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r14 = r0.uvs     // Catch: java.io.IOException -> L470
            int r14 = r14.size     // Catch: java.io.IOException -> L470
            int r13 = r0.getIndex(r13, r14)     // Catch: java.io.IOException -> L470
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.io.IOException -> L470
            r8.add(r13)     // Catch: java.io.IOException -> L470
        L18c:
            int r9 = r9 + 1
            r13 = r7[r9]     // Catch: java.io.IOException -> L470
            java.lang.String[] r13 = r13.split(r1)     // Catch: java.io.IOException -> L470
            r14 = r13[r11]     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r15 = r0.verts     // Catch: java.io.IOException -> L470
            int r15 = r15.size     // Catch: java.io.IOException -> L470
            int r14 = r0.getIndex(r14, r15)     // Catch: java.io.IOException -> L470
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.io.IOException -> L470
            r8.add(r14)     // Catch: java.io.IOException -> L470
            int r14 = r13.length     // Catch: java.io.IOException -> L470
            if (r14 <= r10) goto L1b9
            r14 = r13[r10]     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r15 = r0.norms     // Catch: java.io.IOException -> L470
            int r15 = r15.size     // Catch: java.io.IOException -> L470
            int r14 = r0.getIndex(r14, r15)     // Catch: java.io.IOException -> L470
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.io.IOException -> L470
            r8.add(r14)     // Catch: java.io.IOException -> L470
        L1b9:
            int r14 = r13.length     // Catch: java.io.IOException -> L470
            if (r14 <= r12) goto L1d5
            r14 = r13[r12]     // Catch: java.io.IOException -> L470
            int r14 = r14.length()     // Catch: java.io.IOException -> L470
            if (r14 <= 0) goto L1d5
            r13 = r13[r12]     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.utils.FloatArray r14 = r0.uvs     // Catch: java.io.IOException -> L470
            int r14 = r14.size     // Catch: java.io.IOException -> L470
            int r13 = r0.getIndex(r13, r14)     // Catch: java.io.IOException -> L470
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.io.IOException -> L470
            r8.add(r13)     // Catch: java.io.IOException -> L470
        L1d5:
            int r13 = r3.numFaces     // Catch: java.io.IOException -> L470
            int r13 = r13 + r12
            r3.numFaces = r13     // Catch: java.io.IOException -> L470
            int r9 = r9 + (-1)
            goto Lf0
        L1de:
            r8 = 111(0x6f, float:1.56E-43)
            if (r13 == r8) goto L21f
            r8 = 103(0x67, float:1.44E-43)
            if (r13 != r8) goto L1e7
            goto L21f
        L1e7:
            r8 = r7[r11]     // Catch: java.io.IOException -> L470
            java.lang.String r9 = "mtllib"
            boolean r8 = r8.equals(r9)     // Catch: java.io.IOException -> L470
            if (r8 == 0) goto L200
            com.badlogic.gdx.files.FileHandle r8 = r22.parent()     // Catch: java.io.IOException -> L470
            r7 = r7[r12]     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.files.FileHandle r7 = r8.child(r7)     // Catch: java.io.IOException -> L470
            r2.load(r7)     // Catch: java.io.IOException -> L470
            goto L32
        L200:
            r8 = r7[r11]     // Catch: java.io.IOException -> L470
            java.lang.String r9 = "usemtl"
            boolean r8 = r8.equals(r9)     // Catch: java.io.IOException -> L470
            if (r8 == 0) goto L32
            int r8 = r7.length     // Catch: java.io.IOException -> L470
            if (r8 != r12) goto L211
            r3.materialName = r4     // Catch: java.io.IOException -> L470
            goto L32
        L211:
            r7 = r7[r12]     // Catch: java.io.IOException -> L470
            r8 = 46
            r9 = 95
            java.lang.String r7 = r7.replace(r8, r9)     // Catch: java.io.IOException -> L470
            r3.materialName = r7     // Catch: java.io.IOException -> L470
            goto L32
        L21f:
            int r3 = r7.length     // Catch: java.io.IOException -> L470
            if (r3 <= r12) goto L22a
            r3 = r7[r12]     // Catch: java.io.IOException -> L470
            com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group r3 = r0.setActiveGroup(r3)     // Catch: java.io.IOException -> L470
            goto L32
        L22a:
            com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group r3 = r0.setActiveGroup(r4)     // Catch: java.io.IOException -> L470
            goto L32
        L230:
            r5.close()     // Catch: java.io.IOException -> L470
            r1 = 0
        L234:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group> r3 = r0.groups
            int r5 = r3.size
            if (r1 >= r5) goto L24d
            java.lang.Object r3 = r3.get(r1)
            com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group r3 = (com.badlogic.gdx.graphics.g3d.loader.ObjLoader.Group) r3
            int r3 = r3.numFaces
            if (r3 >= r12) goto L24b
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group> r3 = r0.groups
            r3.removeIndex(r1)
            int r1 = r1 + (-1)
        L24b:
            int r1 = r1 + r12
            goto L234
        L24d:
            if (r5 >= r12) goto L250
            return r6
        L250:
            com.badlogic.gdx.graphics.g3d.model.data.ModelData r1 = new com.badlogic.gdx.graphics.g3d.model.data.ModelData
            r1.<init>()
            r3 = 0
            r6 = 0
        L257:
            if (r3 >= r5) goto L44b
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group> r7 = r0.groups
            java.lang.Object r7 = r7.get(r3)
            com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group r7 = (com.badlogic.gdx.graphics.g3d.loader.ObjLoader.Group) r7
            com.badlogic.gdx.utils.Array<java.lang.Integer> r13 = r7.faces
            int r14 = r13.size
            int r15 = r7.numFaces
            boolean r11 = r7.hasNorms
            boolean r8 = r7.hasUVs
            int r15 = r15 * 3
            if (r11 == 0) goto L272
            r16 = 3
            goto L274
        L272:
            r16 = 0
        L274:
            int r16 = r16 + 3
            if (r8 == 0) goto L27b
            r17 = 2
            goto L27d
        L27b:
            r17 = 0
        L27d:
            int r16 = r16 + r17
            int r12 = r15 * r16
            float[] r12 = new float[r12]
            r10 = 0
            r18 = 0
        L286:
            if (r10 >= r14) goto L330
            int r9 = r10 + 1
            java.lang.Object r10 = r13.get(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r19 = 3
            int r10 = r10 * 3
            int r20 = r18 + 1
            r22 = r5
            com.badlogic.gdx.utils.FloatArray r5 = r0.verts
            r23 = r14
            int r14 = r10 + 1
            float r5 = r5.get(r10)
            r12[r18] = r5
            int r5 = r20 + 1
            com.badlogic.gdx.utils.FloatArray r10 = r0.verts
            r18 = r3
            int r3 = r14 + 1
            float r10 = r10.get(r14)
            r12[r20] = r10
            int r10 = r5 + 1
            com.badlogic.gdx.utils.FloatArray r14 = r0.verts
            float r3 = r14.get(r3)
            r12[r5] = r3
            if (r11 == 0) goto L2f7
            int r3 = r9 + 1
            java.lang.Object r5 = r13.get(r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r9 = 3
            int r5 = r5 * 3
            int r9 = r10 + 1
            com.badlogic.gdx.utils.FloatArray r14 = r0.norms
            r20 = r3
            int r3 = r5 + 1
            float r5 = r14.get(r5)
            r12[r10] = r5
            int r5 = r9 + 1
            com.badlogic.gdx.utils.FloatArray r10 = r0.norms
            int r14 = r3 + 1
            float r3 = r10.get(r3)
            r12[r9] = r3
            int r10 = r5 + 1
            com.badlogic.gdx.utils.FloatArray r3 = r0.norms
            float r3 = r3.get(r14)
            r12[r5] = r3
            r9 = r20
        L2f7:
            if (r8 == 0) goto L323
            int r3 = r9 + 1
            java.lang.Object r5 = r13.get(r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r9 = 2
            int r5 = r5 * 2
            int r9 = r10 + 1
            com.badlogic.gdx.utils.FloatArray r14 = r0.uvs
            r20 = r3
            int r3 = r5 + 1
            float r5 = r14.get(r5)
            r12[r10] = r5
            int r5 = r9 + 1
            com.badlogic.gdx.utils.FloatArray r10 = r0.uvs
            float r3 = r10.get(r3)
            r12[r9] = r3
            r10 = r20
            goto L325
        L323:
            r5 = r10
            r10 = r9
        L325:
            r14 = r23
            r3 = r18
            r9 = 3
            r18 = r5
            r5 = r22
            goto L286
        L330:
            r18 = r3
            r22 = r5
            r3 = 32767(0x7fff, float:4.5916E-41)
            if (r15 < r3) goto L339
            r15 = 0
        L339:
            short[] r3 = new short[r15]
            if (r15 <= 0) goto L346
            r5 = 0
        L33e:
            if (r5 >= r15) goto L346
            short r9 = (short) r5
            r3[r5] = r9
            int r5 = r5 + 1
            goto L33e
        L346:
            com.badlogic.gdx.utils.Array r5 = new com.badlogic.gdx.utils.Array
            r5.<init>()
            com.badlogic.gdx.graphics.VertexAttribute r9 = new com.badlogic.gdx.graphics.VertexAttribute
            java.lang.String r10 = "a_position"
            r13 = 3
            r14 = 1
            r9.<init>(r14, r13, r10)
            r5.add(r9)
            if (r11 == 0) goto L365
            com.badlogic.gdx.graphics.VertexAttribute r9 = new com.badlogic.gdx.graphics.VertexAttribute
            r10 = 8
            java.lang.String r11 = "a_normal"
            r9.<init>(r10, r13, r11)
            r5.add(r9)
        L365:
            if (r8 == 0) goto L375
            com.badlogic.gdx.graphics.VertexAttribute r8 = new com.badlogic.gdx.graphics.VertexAttribute
            r9 = 16
            java.lang.String r10 = "a_texCoord0"
            r11 = 2
            r8.<init>(r9, r11, r10)
            r5.add(r8)
            goto L376
        L375:
            r11 = 2
        L376:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r8 = java.lang.Integer.toString(r6)
            java.lang.String r9 = r7.name
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L396
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "node"
            r9.append(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            goto L398
        L396:
            java.lang.String r9 = r7.name
        L398:
            java.lang.String r10 = r7.name
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L3b2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "mesh"
            r10.append(r14)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            goto L3b4
        L3b2:
            java.lang.String r10 = r7.name
        L3b4:
            java.lang.String r14 = r7.name
            boolean r14 = r4.equals(r14)
            if (r14 == 0) goto L3ce
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "part"
            r14.append(r15)
            r14.append(r8)
            java.lang.String r8 = r14.toString()
            goto L3d0
        L3ce:
            java.lang.String r8 = r7.name
        L3d0:
            com.badlogic.gdx.graphics.g3d.model.data.ModelNode r14 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNode
            r14.<init>()
            r14.id = r9
            r14.meshId = r10
            com.badlogic.gdx.math.Vector3 r9 = new com.badlogic.gdx.math.Vector3
            r15 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r15, r15, r15)
            r14.scale = r9
            com.badlogic.gdx.math.Vector3 r9 = new com.badlogic.gdx.math.Vector3
            r9.<init>()
            r14.translation = r9
            com.badlogic.gdx.math.Quaternion r9 = new com.badlogic.gdx.math.Quaternion
            r9.<init>()
            r14.rotation = r9
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodePart r9 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNodePart
            r9.<init>()
            r9.meshPartId = r8
            java.lang.String r11 = r7.materialName
            r9.materialId = r11
            r11 = 1
            com.badlogic.gdx.graphics.g3d.model.data.ModelNodePart[] r13 = new com.badlogic.gdx.graphics.g3d.model.data.ModelNodePart[r11]
            r11 = 0
            r13[r11] = r9
            r14.parts = r13
            com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart r9 = new com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart
            r9.<init>()
            r9.id = r8
            r9.indices = r3
            r3 = 4
            r9.primitiveType = r3
            com.badlogic.gdx.graphics.g3d.model.data.ModelMesh r3 = new com.badlogic.gdx.graphics.g3d.model.data.ModelMesh
            r3.<init>()
            r3.id = r10
            java.lang.Class<com.badlogic.gdx.graphics.VertexAttribute> r8 = com.badlogic.gdx.graphics.VertexAttribute.class
            java.lang.Object[] r5 = r5.toArray(r8)
            com.badlogic.gdx.graphics.VertexAttribute[] r5 = (com.badlogic.gdx.graphics.VertexAttribute[]) r5
            r3.attributes = r5
            r3.vertices = r12
            r5 = 1
            com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart[] r8 = new com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart[r5]
            r10 = 0
            r8[r10] = r9
            r3.parts = r8
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelNode> r8 = r1.nodes
            r8.add(r14)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMesh> r8 = r1.meshes
            r8.add(r3)
            java.lang.String r3 = r7.materialName
            com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial r3 = r2.getMaterial(r3)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial> r7 = r1.materials
            r7.add(r3)
            int r3 = r18 + 1
            r5 = r22
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 3
            r10 = 2
            r11 = 0
            r12 = 1
            goto L257
        L44b:
            com.badlogic.gdx.utils.FloatArray r2 = r0.verts
            int r3 = r2.size
            if (r3 <= 0) goto L454
            r2.clear()
        L454:
            com.badlogic.gdx.utils.FloatArray r2 = r0.norms
            int r3 = r2.size
            if (r3 <= 0) goto L45d
            r2.clear()
        L45d:
            com.badlogic.gdx.utils.FloatArray r2 = r0.uvs
            int r3 = r2.size
            if (r3 <= 0) goto L466
            r2.clear()
        L466:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.loader.ObjLoader$Group> r2 = r0.groups
            int r3 = r2.size
            if (r3 <= 0) goto L46f
            r2.clear()
        L46f:
            return r1
        L470:
            return r6
    }
}
