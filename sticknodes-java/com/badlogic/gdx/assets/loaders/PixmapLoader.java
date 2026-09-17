package com.badlogic.gdx.assets.loaders;

/* loaded from: classes.dex */
public class PixmapLoader extends com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader<com.badlogic.gdx.graphics.Pixmap, com.badlogic.gdx.assets.loaders.PixmapLoader.PixmapParameter> {
    com.badlogic.gdx.graphics.Pixmap pixmap;

    public static class PixmapParameter extends com.badlogic.gdx.assets.AssetLoaderParameters<com.badlogic.gdx.graphics.Pixmap> {
        public PixmapParameter() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public PixmapLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.Array getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.AssetLoaderParameters r3) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.PixmapLoader$PixmapParameter r3 = (com.badlogic.gdx.assets.loaders.PixmapLoader.PixmapParameter) r3
            com.badlogic.gdx.utils.Array r1 = r0.getDependencies(r1, r2, r3)
            return r1
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.loaders.PixmapLoader.PixmapParameter r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.PixmapLoader$PixmapParameter r4 = (com.badlogic.gdx.assets.loaders.PixmapLoader.PixmapParameter) r4
            r0.loadAsync(r1, r2, r3, r4)
            return
    }

    public void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.loaders.PixmapLoader.PixmapParameter r4) {
            r0 = this;
            r1 = 0
            r0.pixmap = r1
            com.badlogic.gdx.graphics.Pixmap r1 = new com.badlogic.gdx.graphics.Pixmap
            r1.<init>(r3)
            r0.pixmap = r1
            return
    }

    public com.badlogic.gdx.graphics.Pixmap loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.loaders.PixmapLoader.PixmapParameter r4) {
            r0 = this;
            com.badlogic.gdx.graphics.Pixmap r1 = r0.pixmap
            r2 = 0
            r0.pixmap = r2
            return r1
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.Pixmap loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.PixmapLoader$PixmapParameter r4 = (com.badlogic.gdx.assets.loaders.PixmapLoader.PixmapParameter) r4
            com.badlogic.gdx.graphics.Pixmap r1 = r0.loadSync(r1, r2, r3, r4)
            return r1
    }
}
