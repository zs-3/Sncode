package com.badlogic.gdx.assets.loaders;

/* loaded from: classes.dex */
public class BitmapFontLoader extends com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader<com.badlogic.gdx.graphics.g2d.BitmapFont, com.badlogic.gdx.assets.loaders.BitmapFontLoader.BitmapFontParameter> {
    com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData data;

    public static class BitmapFontParameter extends com.badlogic.gdx.assets.AssetLoaderParameters<com.badlogic.gdx.graphics.g2d.BitmapFont> {
        public java.lang.String atlasName;
        public com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData bitmapFontData;
        public boolean flip;
        public boolean genMipMaps;
        public com.badlogic.gdx.graphics.Texture.TextureFilter magFilter;
        public com.badlogic.gdx.graphics.Texture.TextureFilter minFilter;

        public BitmapFontParameter() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.flip = r0
                r1.genMipMaps = r0
                com.badlogic.gdx.graphics.Texture$TextureFilter r0 = com.badlogic.gdx.graphics.Texture.TextureFilter.Nearest
                r1.minFilter = r0
                r1.magFilter = r0
                r0 = 0
                r1.bitmapFontData = r0
                r1.atlasName = r0
                return
        }
    }

    public BitmapFontLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.Array getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.AssetLoaderParameters r3) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.BitmapFontLoader$BitmapFontParameter r3 = (com.badlogic.gdx.assets.loaders.BitmapFontLoader.BitmapFontParameter) r3
            com.badlogic.gdx.utils.Array r1 = r0.getDependencies(r1, r2, r3)
            return r1
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> getDependencies(java.lang.String r5, com.badlogic.gdx.files.FileHandle r6, com.badlogic.gdx.assets.loaders.BitmapFontLoader.BitmapFontParameter r7) {
            r4 = this;
            com.badlogic.gdx.utils.Array r5 = new com.badlogic.gdx.utils.Array
            r5.<init>()
            if (r7 == 0) goto Le
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r7.bitmapFontData
            if (r0 == 0) goto Le
            r4.data = r0
            return r5
        Le:
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = new com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData
            r1 = 0
            if (r7 == 0) goto L19
            boolean r2 = r7.flip
            if (r2 == 0) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            r0.<init>(r6, r2)
            r4.data = r0
            if (r7 == 0) goto L30
            java.lang.String r6 = r7.atlasName
            if (r6 == 0) goto L30
            com.badlogic.gdx.assets.AssetDescriptor r7 = new com.badlogic.gdx.assets.AssetDescriptor
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r7.<init>(r6, r0)
            r5.add(r7)
            goto L63
        L30:
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r6 = r4.data
            java.lang.String[] r6 = r6.getImagePaths()
            int r6 = r6.length
            if (r1 >= r6) goto L63
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r6 = r4.data
            java.lang.String r6 = r6.getImagePath(r1)
            com.badlogic.gdx.files.FileHandle r6 = r4.resolve(r6)
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter r0 = new com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter
            r0.<init>()
            if (r7 == 0) goto L56
            boolean r2 = r7.genMipMaps
            r0.genMipMaps = r2
            com.badlogic.gdx.graphics.Texture$TextureFilter r2 = r7.minFilter
            r0.minFilter = r2
            com.badlogic.gdx.graphics.Texture$TextureFilter r2 = r7.magFilter
            r0.magFilter = r2
        L56:
            com.badlogic.gdx.assets.AssetDescriptor r2 = new com.badlogic.gdx.assets.AssetDescriptor
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r3 = com.badlogic.gdx.graphics.Texture.class
            r2.<init>(r6, r3, r0)
            r5.add(r2)
            int r1 = r1 + 1
            goto L30
        L63:
            return r5
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.BitmapFontLoader$BitmapFontParameter r4 = (com.badlogic.gdx.assets.loaders.BitmapFontLoader.BitmapFontParameter) r4
            r0.loadAsync(r1, r2, r3, r4)
            return
    }

    public void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.loaders.BitmapFontLoader.BitmapFontParameter r4) {
            r0 = this;
            return
    }

    public com.badlogic.gdx.graphics.g2d.BitmapFont loadSync(com.badlogic.gdx.assets.AssetManager r4, java.lang.String r5, com.badlogic.gdx.files.FileHandle r6, com.badlogic.gdx.assets.loaders.BitmapFontLoader.BitmapFontParameter r7) {
            r3 = this;
            r5 = 0
            if (r7 == 0) goto L4e
            java.lang.String r0 = r7.atlasName
            if (r0 == 0) goto L4e
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r1 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r4 = r4.get(r0, r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r4
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r3.data
            java.lang.String[] r0 = r0.imagePaths
            r5 = r0[r5]
            com.badlogic.gdx.files.FileHandle r5 = r6.sibling(r5)
            java.lang.String r5 = r5.nameWithoutExtension()
            java.lang.String r5 = r5.toString()
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r4.findRegion(r5)
            if (r4 == 0) goto L2d
            com.badlogic.gdx.graphics.g2d.BitmapFont r5 = new com.badlogic.gdx.graphics.g2d.BitmapFont
            r5.<init>(r6, r4)
            return r5
        L2d:
            com.badlogic.gdx.utils.GdxRuntimeException r4 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Could not find font region "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = " in atlas "
            r6.append(r5)
            java.lang.String r5 = r7.atlasName
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L4e:
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r6 = r3.data
            java.lang.String[] r6 = r6.getImagePaths()
            int r6 = r6.length
            com.badlogic.gdx.utils.Array r7 = new com.badlogic.gdx.utils.Array
            r7.<init>(r6)
        L5a:
            if (r5 >= r6) goto L75
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r1 = r3.data
            java.lang.String r1 = r1.getImagePath(r5)
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r2 = com.badlogic.gdx.graphics.Texture.class
            java.lang.Object r1 = r4.get(r1, r2)
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            r0.<init>(r1)
            r7.add(r0)
            int r5 = r5 + 1
            goto L5a
        L75:
            com.badlogic.gdx.graphics.g2d.BitmapFont r4 = new com.badlogic.gdx.graphics.g2d.BitmapFont
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r5 = r3.data
            r6 = 1
            r4.<init>(r5, r7, r6)
            return r4
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.g2d.BitmapFont loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.BitmapFontLoader$BitmapFontParameter r4 = (com.badlogic.gdx.assets.loaders.BitmapFontLoader.BitmapFontParameter) r4
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r0.loadSync(r1, r2, r3, r4)
            return r1
    }
}
