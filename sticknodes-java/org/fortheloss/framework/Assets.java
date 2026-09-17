package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class Assets implements com.badlogic.gdx.assets.AssetErrorListener, com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.assets.AssetManager _assetManager;
    private int _resolution;
    private java.lang.String _resolutionFolder;

    public Assets(int r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4._resolution = r0
            com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver r0 = new com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver
            r0.<init>()
            com.badlogic.gdx.assets.AssetManager r1 = new com.badlogic.gdx.assets.AssetManager
            r1.<init>()
            r4._assetManager = r1
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r2 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            com.badlogic.gdx.assets.loaders.BitmapFontLoader r3 = new com.badlogic.gdx.assets.loaders.BitmapFontLoader
            r3.<init>(r0)
            r1.setLoader(r2, r3)
            com.badlogic.gdx.assets.AssetManager r1 = r4._assetManager
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r2 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader r3 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader
            r3.<init>(r0)
            r1.setLoader(r2, r3)
            com.badlogic.gdx.assets.AssetManager r1 = r4._assetManager
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r2 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            org.fortheloss.framework.CustomTextureAtlasLoader r3 = new org.fortheloss.framework.CustomTextureAtlasLoader
            r3.<init>(r0)
            r1.setLoader(r2, r3)
            com.badlogic.gdx.assets.AssetManager r0 = r4._assetManager
            r0.setErrorListener(r4)
            r4._resolution = r5
            if (r5 != 0) goto L42
            java.lang.String r5 = "SD"
            r4._resolutionFolder = r5
            goto L46
        L42:
            java.lang.String r5 = "HD"
            r4._resolutionFolder = r5
        L46:
            return
    }

    public void clear() {
            r1 = this;
            com.badlogic.gdx.assets.AssetManager r0 = r1._assetManager
            r0.clear()
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r2.clear()
            com.badlogic.gdx.assets.AssetManager r0 = r2._assetManager
            r1 = 0
            if (r0 == 0) goto Ld
            r0.dispose()
            r2._assetManager = r1
        Ld:
            r2._resolutionFolder = r1
            return
    }

    @Override // com.badlogic.gdx.assets.AssetErrorListener
    public void error(com.badlogic.gdx.assets.AssetDescriptor r5, java.lang.Throwable r6) {
            r4 = this;
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = r5.fileName
            java.lang.Class<T> r5 = r5.type
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Couldn't load asset "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " of type "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = "."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.Exception r6 = (java.lang.Exception) r6
            java.lang.String r1 = "AssetManager"
            r0.error(r1, r5, r6)
            return
    }

    public <T> T get(java.lang.String r3, java.lang.Class<T> r4, boolean r5) {
            r2 = this;
            if (r5 == 0) goto L1f
            com.badlogic.gdx.assets.AssetManager r5 = r2._assetManager
            java.lang.String r0 = r2._resolutionFolder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.Object r3 = r5.get(r3, r4)
            return r3
        L1f:
            com.badlogic.gdx.assets.AssetManager r5 = r2._assetManager
            java.lang.Object r3 = r5.get(r3, r4)
            return r3
    }

    public float getLoadingProgress() {
            r1 = this;
            com.badlogic.gdx.assets.AssetManager r0 = r1._assetManager
            float r0 = r0.getProgress()
            return r0
    }

    public com.badlogic.gdx.files.FileHandle getPathFromResolutionFolder(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = r3._resolutionFolder
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.badlogic.gdx.files.FileHandle r4 = r0.internal(r4)
            return r4
    }

    public int getResolution() {
            r1 = this;
            int r0 = r1._resolution
            return r0
    }

    public <T> boolean isLoaded(java.lang.String r3, java.lang.Class<T> r4, boolean r5) {
            r2 = this;
            if (r5 == 0) goto L1f
            com.badlogic.gdx.assets.AssetManager r5 = r2._assetManager
            java.lang.String r0 = r2._resolutionFolder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            boolean r3 = r5.isLoaded(r3, r4)
            return r3
        L1f:
            com.badlogic.gdx.assets.AssetManager r5 = r2._assetManager
            boolean r3 = r5.isLoaded(r3, r4)
            return r3
    }

    public <T> void load(java.lang.String r3, java.lang.Class<T> r4, com.badlogic.gdx.assets.AssetLoaderParameters<T> r5, boolean r6) {
            r2 = this;
            if (r6 == 0) goto L1e
            com.badlogic.gdx.assets.AssetManager r6 = r2._assetManager
            java.lang.String r0 = r2._resolutionFolder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r6.load(r3, r4, r5)
            goto L23
        L1e:
            com.badlogic.gdx.assets.AssetManager r6 = r2._assetManager
            r6.load(r3, r4, r5)
        L23:
            return
    }

    public <T> void load(java.lang.String r4, java.lang.Class<T> r5, boolean r6) {
            r3 = this;
            if (r6 == 0) goto L3a
            com.badlogic.gdx.assets.AssetManager r6 = r3._assetManager
            java.lang.String r0 = r3._resolutionFolder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r6 = r6.isLoaded(r1)
            if (r6 != 0) goto L47
            com.badlogic.gdx.assets.AssetManager r6 = r3._assetManager
            java.lang.String r1 = r3._resolutionFolder
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r6.load(r4, r5)
            goto L47
        L3a:
            com.badlogic.gdx.assets.AssetManager r6 = r3._assetManager
            boolean r6 = r6.isLoaded(r4)
            if (r6 != 0) goto L47
            com.badlogic.gdx.assets.AssetManager r6 = r3._assetManager
            r6.load(r4, r5)
        L47:
            return
    }

    public void unload(java.lang.String r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L3a
            com.badlogic.gdx.assets.AssetManager r5 = r3._assetManager
            java.lang.String r0 = r3._resolutionFolder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r5 = r5.isLoaded(r1)
            if (r5 == 0) goto L47
            com.badlogic.gdx.assets.AssetManager r5 = r3._assetManager
            java.lang.String r1 = r3._resolutionFolder
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r5.unload(r4)
            goto L47
        L3a:
            com.badlogic.gdx.assets.AssetManager r5 = r3._assetManager
            boolean r5 = r5.isLoaded(r4)
            if (r5 == 0) goto L47
            com.badlogic.gdx.assets.AssetManager r5 = r3._assetManager
            r5.unload(r4)
        L47:
            return
    }

    public void update() {
            r1 = this;
            com.badlogic.gdx.assets.AssetManager r0 = r1._assetManager
            r0.update()
            return
    }
}
