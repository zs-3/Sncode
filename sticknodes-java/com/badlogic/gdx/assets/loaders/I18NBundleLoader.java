package com.badlogic.gdx.assets.loaders;

/* loaded from: classes.dex */
public class I18NBundleLoader extends com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader<com.badlogic.gdx.utils.I18NBundle, com.badlogic.gdx.assets.loaders.I18NBundleLoader.I18NBundleParameter> {
    com.badlogic.gdx.utils.I18NBundle bundle;

    public static class I18NBundleParameter extends com.badlogic.gdx.assets.AssetLoaderParameters<com.badlogic.gdx.utils.I18NBundle> {
        public final java.lang.String encoding;
        public final java.util.Locale locale;

        public I18NBundleParameter() {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r0)
                return
        }

        public I18NBundleParameter(java.util.Locale r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.locale = r1
                r0.encoding = r2
                return
        }
    }

    public I18NBundleLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.Array getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.AssetLoaderParameters r3) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.I18NBundleLoader$I18NBundleParameter r3 = (com.badlogic.gdx.assets.loaders.I18NBundleLoader.I18NBundleParameter) r3
            com.badlogic.gdx.utils.Array r1 = r0.getDependencies(r1, r2, r3)
            return r1
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.loaders.I18NBundleLoader.I18NBundleParameter r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.I18NBundleLoader$I18NBundleParameter r4 = (com.badlogic.gdx.assets.loaders.I18NBundleLoader.I18NBundleParameter) r4
            r0.loadAsync(r1, r2, r3, r4)
            return
    }

    public void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.loaders.I18NBundleLoader.I18NBundleParameter r4) {
            r0 = this;
            r1 = 0
            r0.bundle = r1
            if (r4 != 0) goto La
            java.util.Locale r2 = java.util.Locale.getDefault()
            goto L15
        La:
            java.util.Locale r1 = r4.locale
            if (r1 != 0) goto L12
            java.util.Locale r1 = java.util.Locale.getDefault()
        L12:
            r2 = r1
            java.lang.String r1 = r4.encoding
        L15:
            if (r1 != 0) goto L1e
            com.badlogic.gdx.utils.I18NBundle r1 = com.badlogic.gdx.utils.I18NBundle.createBundle(r3, r2)
            r0.bundle = r1
            goto L24
        L1e:
            com.badlogic.gdx.utils.I18NBundle r1 = com.badlogic.gdx.utils.I18NBundle.createBundle(r3, r2, r1)
            r0.bundle = r1
        L24:
            return
    }

    public com.badlogic.gdx.utils.I18NBundle loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.loaders.I18NBundleLoader.I18NBundleParameter r4) {
            r0 = this;
            com.badlogic.gdx.utils.I18NBundle r1 = r0.bundle
            r2 = 0
            r0.bundle = r2
            return r1
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.I18NBundle loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.I18NBundleLoader$I18NBundleParameter r4 = (com.badlogic.gdx.assets.loaders.I18NBundleLoader.I18NBundleParameter) r4
            com.badlogic.gdx.utils.I18NBundle r1 = r0.loadSync(r1, r2, r3, r4)
            return r1
    }
}
