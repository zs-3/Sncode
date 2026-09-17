package com.badlogic.gdx.assets.loaders;

/* loaded from: classes.dex */
public class CubemapLoader extends com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader<com.badlogic.gdx.graphics.Cubemap, com.badlogic.gdx.assets.loaders.CubemapLoader.CubemapParameter> {
    com.badlogic.gdx.assets.loaders.CubemapLoader.CubemapLoaderInfo info;

    public static class CubemapLoaderInfo {
        com.badlogic.gdx.graphics.Cubemap cubemap;
        com.badlogic.gdx.graphics.CubemapData data;
        java.lang.String filename;

        public CubemapLoaderInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class CubemapParameter extends com.badlogic.gdx.assets.AssetLoaderParameters<com.badlogic.gdx.graphics.Cubemap> {
        public com.badlogic.gdx.graphics.Cubemap cubemap;
        public com.badlogic.gdx.graphics.CubemapData cubemapData;
        public com.badlogic.gdx.graphics.Pixmap.Format format;
        public com.badlogic.gdx.graphics.Texture.TextureFilter magFilter;
        public com.badlogic.gdx.graphics.Texture.TextureFilter minFilter;
        public com.badlogic.gdx.graphics.Texture.TextureWrap wrapU;
        public com.badlogic.gdx.graphics.Texture.TextureWrap wrapV;

        public CubemapParameter() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.format = r0
                r1.cubemap = r0
                r1.cubemapData = r0
                com.badlogic.gdx.graphics.Texture$TextureFilter r0 = com.badlogic.gdx.graphics.Texture.TextureFilter.Nearest
                r1.minFilter = r0
                r1.magFilter = r0
                com.badlogic.gdx.graphics.Texture$TextureWrap r0 = com.badlogic.gdx.graphics.Texture.TextureWrap.ClampToEdge
                r1.wrapU = r0
                r1.wrapV = r0
                return
        }
    }

    public CubemapLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            com.badlogic.gdx.assets.loaders.CubemapLoader$CubemapLoaderInfo r1 = new com.badlogic.gdx.assets.loaders.CubemapLoader$CubemapLoaderInfo
            r1.<init>()
            r0.info = r1
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.Array getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.AssetLoaderParameters r3) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.CubemapLoader$CubemapParameter r3 = (com.badlogic.gdx.assets.loaders.CubemapLoader.CubemapParameter) r3
            com.badlogic.gdx.utils.Array r1 = r0.getDependencies(r1, r2, r3)
            return r1
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.loaders.CubemapLoader.CubemapParameter r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.CubemapLoader$CubemapParameter r4 = (com.badlogic.gdx.assets.loaders.CubemapLoader.CubemapParameter) r4
            r0.loadAsync(r1, r2, r3, r4)
            return
    }

    public void loadAsync(com.badlogic.gdx.assets.AssetManager r3, java.lang.String r4, com.badlogic.gdx.files.FileHandle r5, com.badlogic.gdx.assets.loaders.CubemapLoader.CubemapParameter r6) {
            r2 = this;
            com.badlogic.gdx.assets.loaders.CubemapLoader$CubemapLoaderInfo r3 = r2.info
            r3.filename = r4
            if (r6 == 0) goto L12
            com.badlogic.gdx.graphics.CubemapData r0 = r6.cubemapData
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            r3.data = r0
            com.badlogic.gdx.graphics.Cubemap r4 = r6.cubemap
            r3.cubemap = r4
            goto L35
        L12:
            r0 = 0
            r1 = 0
            r3.cubemap = r1
            if (r6 == 0) goto L1c
            com.badlogic.gdx.graphics.Cubemap r6 = r6.cubemap
            r3.cubemap = r6
        L1c:
            java.lang.String r3 = ".ktx"
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L2c
            java.lang.String r3 = ".zktx"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L35
        L2c:
            com.badlogic.gdx.assets.loaders.CubemapLoader$CubemapLoaderInfo r3 = r2.info
            com.badlogic.gdx.graphics.glutils.KTXTextureData r4 = new com.badlogic.gdx.graphics.glutils.KTXTextureData
            r4.<init>(r5, r0)
            r3.data = r4
        L35:
            com.badlogic.gdx.assets.loaders.CubemapLoader$CubemapLoaderInfo r3 = r2.info
            com.badlogic.gdx.graphics.CubemapData r3 = r3.data
            boolean r3 = r3.isPrepared()
            if (r3 != 0) goto L46
            com.badlogic.gdx.assets.loaders.CubemapLoader$CubemapLoaderInfo r3 = r2.info
            com.badlogic.gdx.graphics.CubemapData r3 = r3.data
            r3.prepare()
        L46:
            return
    }

    public com.badlogic.gdx.graphics.Cubemap loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.loaders.CubemapLoader.CubemapParameter r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.CubemapLoader$CubemapLoaderInfo r1 = r0.info
            if (r1 != 0) goto L6
            r1 = 0
            return r1
        L6:
            com.badlogic.gdx.graphics.Cubemap r2 = r1.cubemap
            if (r2 == 0) goto L10
            com.badlogic.gdx.graphics.CubemapData r1 = r1.data
            r2.load(r1)
            goto L19
        L10:
            com.badlogic.gdx.graphics.Cubemap r2 = new com.badlogic.gdx.graphics.Cubemap
            com.badlogic.gdx.assets.loaders.CubemapLoader$CubemapLoaderInfo r1 = r0.info
            com.badlogic.gdx.graphics.CubemapData r1 = r1.data
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
    public /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.Cubemap loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.CubemapLoader$CubemapParameter r4 = (com.badlogic.gdx.assets.loaders.CubemapLoader.CubemapParameter) r4
            com.badlogic.gdx.graphics.Cubemap r1 = r0.loadSync(r1, r2, r3, r4)
            return r1
    }
}
