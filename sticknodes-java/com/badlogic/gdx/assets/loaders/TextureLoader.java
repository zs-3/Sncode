package com.badlogic.gdx.assets.loaders;

/* loaded from: classes.dex */
public class TextureLoader extends com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader<com.badlogic.gdx.graphics.Texture, com.badlogic.gdx.assets.loaders.TextureLoader.TextureParameter> {
    com.badlogic.gdx.assets.loaders.TextureLoader.TextureLoaderInfo info;

    public static class TextureLoaderInfo {
        com.badlogic.gdx.graphics.TextureData data;
        java.lang.String filename;
        com.badlogic.gdx.graphics.Texture texture;

        public TextureLoaderInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class TextureParameter extends com.badlogic.gdx.assets.AssetLoaderParameters<com.badlogic.gdx.graphics.Texture> {
        public com.badlogic.gdx.graphics.Pixmap.Format format;
        public boolean genMipMaps;
        public com.badlogic.gdx.graphics.Texture.TextureFilter magFilter;
        public com.badlogic.gdx.graphics.Texture.TextureFilter minFilter;
        public com.badlogic.gdx.graphics.Texture texture;
        public com.badlogic.gdx.graphics.TextureData textureData;
        public com.badlogic.gdx.graphics.Texture.TextureWrap wrapU;
        public com.badlogic.gdx.graphics.Texture.TextureWrap wrapV;

        public TextureParameter() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.format = r0
                r1 = 0
                r2.genMipMaps = r1
                r2.texture = r0
                r2.textureData = r0
                com.badlogic.gdx.graphics.Texture$TextureFilter r0 = com.badlogic.gdx.graphics.Texture.TextureFilter.Nearest
                r2.minFilter = r0
                r2.magFilter = r0
                com.badlogic.gdx.graphics.Texture$TextureWrap r0 = com.badlogic.gdx.graphics.Texture.TextureWrap.ClampToEdge
                r2.wrapU = r0
                r2.wrapV = r0
                return
        }
    }

    public TextureLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureLoaderInfo r1 = new com.badlogic.gdx.assets.loaders.TextureLoader$TextureLoaderInfo
            r1.<init>()
            r0.info = r1
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.Array getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.AssetLoaderParameters r3) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter r3 = (com.badlogic.gdx.assets.loaders.TextureLoader.TextureParameter) r3
            com.badlogic.gdx.utils.Array r1 = r0.getDependencies(r1, r2, r3)
            return r1
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.loaders.TextureLoader.TextureParameter r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter r4 = (com.badlogic.gdx.assets.loaders.TextureLoader.TextureParameter) r4
            r0.loadAsync(r1, r2, r3, r4)
            return
    }

    public void loadAsync(com.badlogic.gdx.assets.AssetManager r2, java.lang.String r3, com.badlogic.gdx.files.FileHandle r4, com.badlogic.gdx.assets.loaders.TextureLoader.TextureParameter r5) {
            r1 = this;
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureLoaderInfo r2 = r1.info
            r2.filename = r3
            if (r5 == 0) goto L12
            com.badlogic.gdx.graphics.TextureData r3 = r5.textureData
            if (r3 != 0) goto Lb
            goto L12
        Lb:
            r2.data = r3
            com.badlogic.gdx.graphics.Texture r3 = r5.texture
            r2.texture = r3
            goto L26
        L12:
            r3 = 0
            r0 = 0
            r2.texture = r0
            if (r5 == 0) goto L20
            com.badlogic.gdx.graphics.Pixmap$Format r0 = r5.format
            boolean r3 = r5.genMipMaps
            com.badlogic.gdx.graphics.Texture r5 = r5.texture
            r2.texture = r5
        L20:
            com.badlogic.gdx.graphics.TextureData r3 = com.badlogic.gdx.graphics.TextureData.Factory.loadFromFile(r4, r0, r3)
            r2.data = r3
        L26:
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureLoaderInfo r2 = r1.info
            com.badlogic.gdx.graphics.TextureData r2 = r2.data
            boolean r2 = r2.isPrepared()
            if (r2 != 0) goto L37
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureLoaderInfo r2 = r1.info
            com.badlogic.gdx.graphics.TextureData r2 = r2.data
            r2.prepare()
        L37:
            return
    }

    public com.badlogic.gdx.graphics.Texture loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.loaders.TextureLoader.TextureParameter r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureLoaderInfo r1 = r0.info
            if (r1 != 0) goto L6
            r1 = 0
            return r1
        L6:
            com.badlogic.gdx.graphics.Texture r2 = r1.texture
            if (r2 == 0) goto L10
            com.badlogic.gdx.graphics.TextureData r1 = r1.data
            r2.load(r1)
            goto L19
        L10:
            com.badlogic.gdx.graphics.Texture r2 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureLoaderInfo r1 = r0.info
            com.badlogic.gdx.graphics.TextureData r1 = r1.data
            r2.<init>(r1)
        L19:
            if (r4 == 0) goto L29
            com.badlogic.gdx.graphics.Texture$TextureFilter r1 = r4.minFilter
            com.badlogic.gdx.graphics.Texture$TextureFilter r3 = r4.magFilter
            r2.setFilter(r1, r3)
            com.badlogic.gdx.graphics.Texture$TextureWrap r1 = r4.wrapU
            com.badlogic.gdx.graphics.Texture$TextureWrap r3 = r4.wrapV
            r2.setWrap(r1, r3)
        L29:
            return r2
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.Texture loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter r4 = (com.badlogic.gdx.assets.loaders.TextureLoader.TextureParameter) r4
            com.badlogic.gdx.graphics.Texture r1 = r0.loadSync(r1, r2, r3, r4)
            return r1
    }
}
