package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class PolygonRegionLoader extends com.badlogic.gdx.assets.loaders.SynchronousAssetLoader<com.badlogic.gdx.graphics.g2d.PolygonRegion, com.badlogic.gdx.graphics.g2d.PolygonRegionLoader.PolygonRegionParameters> {
    private com.badlogic.gdx.graphics.g2d.PolygonRegionLoader.PolygonRegionParameters defaultParameters;
    private com.badlogic.gdx.math.EarClippingTriangulator triangulator;

    public static class PolygonRegionParameters extends com.badlogic.gdx.assets.AssetLoaderParameters<com.badlogic.gdx.graphics.g2d.PolygonRegion> {
        public int readerBuffer;
        public java.lang.String[] textureExtensions;
        public java.lang.String texturePrefix;

        public PolygonRegionParameters() {
                r15 = this;
                r15.<init>()
                java.lang.String r0 = "i "
                r15.texturePrefix = r0
                r0 = 1024(0x400, float:1.435E-42)
                r15.readerBuffer = r0
                java.lang.String r1 = "png"
                java.lang.String r2 = "PNG"
                java.lang.String r3 = "jpeg"
                java.lang.String r4 = "JPEG"
                java.lang.String r5 = "jpg"
                java.lang.String r6 = "JPG"
                java.lang.String r7 = "cim"
                java.lang.String r8 = "CIM"
                java.lang.String r9 = "etc1"
                java.lang.String r10 = "ETC1"
                java.lang.String r11 = "ktx"
                java.lang.String r12 = "KTX"
                java.lang.String r13 = "zktx"
                java.lang.String r14 = "ZKTX"
                java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}
                r15.textureExtensions = r0
                return
        }
    }

    public PolygonRegionLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            com.badlogic.gdx.graphics.g2d.PolygonRegionLoader$PolygonRegionParameters r1 = new com.badlogic.gdx.graphics.g2d.PolygonRegionLoader$PolygonRegionParameters
            r1.<init>()
            r0.defaultParameters = r1
            com.badlogic.gdx.math.EarClippingTriangulator r1 = new com.badlogic.gdx.math.EarClippingTriangulator
            r1.<init>()
            r0.triangulator = r1
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.Array getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.AssetLoaderParameters r3) {
            r0 = this;
            com.badlogic.gdx.graphics.g2d.PolygonRegionLoader$PolygonRegionParameters r3 = (com.badlogic.gdx.graphics.g2d.PolygonRegionLoader.PolygonRegionParameters) r3
            com.badlogic.gdx.utils.Array r1 = r0.getDependencies(r1, r2, r3)
            return r1
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> getDependencies(java.lang.String r8, com.badlogic.gdx.files.FileHandle r9, com.badlogic.gdx.graphics.g2d.PolygonRegionLoader.PolygonRegionParameters r10) {
            r7 = this;
            if (r10 != 0) goto L4
            com.badlogic.gdx.graphics.g2d.PolygonRegionLoader$PolygonRegionParameters r10 = r7.defaultParameters
        L4:
            int r0 = r10.readerBuffer     // Catch: java.io.IOException -> L76
            java.io.BufferedReader r0 = r9.reader(r0)     // Catch: java.io.IOException -> L76
        La:
            java.lang.String r1 = r0.readLine()     // Catch: java.io.IOException -> L76
            r2 = 0
            if (r1 == 0) goto L24
            java.lang.String r3 = r10.texturePrefix     // Catch: java.io.IOException -> L76
            boolean r3 = r1.startsWith(r3)     // Catch: java.io.IOException -> L76
            if (r3 == 0) goto La
            java.lang.String r3 = r10.texturePrefix     // Catch: java.io.IOException -> L76
            int r3 = r3.length()     // Catch: java.io.IOException -> L76
            java.lang.String r1 = r1.substring(r3)     // Catch: java.io.IOException -> L76
            goto L25
        L24:
            r1 = r2
        L25:
            r0.close()     // Catch: java.io.IOException -> L76
            if (r1 != 0) goto L5e
            java.lang.String[] r8 = r10.textureExtensions
            if (r8 == 0) goto L5e
            int r10 = r8.length
            r0 = 0
        L30:
            if (r0 >= r10) goto L5e
            r3 = r8[r0]
            java.lang.String r4 = r9.nameWithoutExtension()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "."
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r3 = r4.concat(r3)
            com.badlogic.gdx.files.FileHandle r3 = r9.sibling(r3)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L5b
            java.lang.String r1 = r3.name()
        L5b:
            int r0 = r0 + 1
            goto L30
        L5e:
            if (r1 == 0) goto L75
            com.badlogic.gdx.utils.Array r8 = new com.badlogic.gdx.utils.Array
            r10 = 1
            r8.<init>(r10)
            com.badlogic.gdx.assets.AssetDescriptor r10 = new com.badlogic.gdx.assets.AssetDescriptor
            com.badlogic.gdx.files.FileHandle r9 = r9.sibling(r1)
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r0 = com.badlogic.gdx.graphics.Texture.class
            r10.<init>(r9, r0)
            r8.add(r10)
            return r8
        L75:
            return r2
        L76:
            r9 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r10 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error reading "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r10.<init>(r8, r9)
            throw r10
    }

    public com.badlogic.gdx.graphics.g2d.PolygonRegion load(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.graphics.g2d.PolygonRegionLoader.PolygonRegionParameters r4) {
            r0 = this;
            com.badlogic.gdx.utils.Array r2 = r1.getDependencies(r2)
            java.lang.Object r2 = r2.first()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.get(r2)
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            r2.<init>(r1)
            com.badlogic.gdx.graphics.g2d.PolygonRegion r1 = r0.load(r2, r3)
            return r1
    }

    public com.badlogic.gdx.graphics.g2d.PolygonRegion load(com.badlogic.gdx.graphics.g2d.TextureRegion r7, com.badlogic.gdx.files.FileHandle r8) {
            r6 = this;
            r0 = 256(0x100, float:3.59E-43)
            java.io.BufferedReader r0 = r8.reader(r0)
        L6:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            if (r1 == 0) goto L47
            java.lang.String r2 = "s"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            if (r2 == 0) goto L6
            r2 = 1
            java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            java.lang.String r2 = ","
            java.lang.String[] r1 = r1.split(r2)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            int r2 = r1.length     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            float[] r3 = new float[r2]     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            r4 = 0
        L27:
            if (r4 >= r2) goto L34
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            r3[r4] = r5     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            int r4 = r4 + 1
            goto L27
        L34:
            com.badlogic.gdx.graphics.g2d.PolygonRegion r1 = new com.badlogic.gdx.graphics.g2d.PolygonRegion     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            com.badlogic.gdx.math.EarClippingTriangulator r2 = r6.triangulator     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            com.badlogic.gdx.utils.ShortArray r2 = r2.computeTriangles(r3)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            short[] r2 = r2.toArray()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            r1.<init>(r7, r3, r2)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            return r1
        L47:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            com.badlogic.gdx.utils.GdxRuntimeException r7 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Polygon shape not found: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L61:
            r7 = move-exception
            goto L7b
        L63:
            r7 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r2.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "Error reading polygon shape file: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L61
            r2.append(r8)     // Catch: java.lang.Throwable -> L61
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L61
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L61
            throw r1     // Catch: java.lang.Throwable -> L61
        L7b:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            throw r7
    }

    @Override // com.badlogic.gdx.assets.loaders.SynchronousAssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.g2d.PolygonRegion load(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.graphics.g2d.PolygonRegionLoader$PolygonRegionParameters r4 = (com.badlogic.gdx.graphics.g2d.PolygonRegionLoader.PolygonRegionParameters) r4
            com.badlogic.gdx.graphics.g2d.PolygonRegion r1 = r0.load(r1, r2, r3, r4)
            return r1
    }
}
