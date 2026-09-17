package com.badlogic.gdx.assets.loaders;

/* loaded from: classes.dex */
public class SkinLoader extends com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader<com.badlogic.gdx.scenes.scene2d.ui.Skin, com.badlogic.gdx.assets.loaders.SkinLoader.SkinParameter> {

    public static class SkinParameter extends com.badlogic.gdx.assets.AssetLoaderParameters<com.badlogic.gdx.scenes.scene2d.ui.Skin> {
        public final com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Object> resources;
        public final java.lang.String textureAtlasPath;

        public SkinParameter() {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r0)
                return
        }

        public SkinParameter(java.lang.String r1, com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Object> r2) {
                r0 = this;
                r0.<init>()
                r0.textureAtlasPath = r1
                r0.resources = r2
                return
        }
    }

    public SkinLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.Array getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.AssetLoaderParameters r3) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.SkinLoader$SkinParameter r3 = (com.badlogic.gdx.assets.loaders.SkinLoader.SkinParameter) r3
            com.badlogic.gdx.utils.Array r1 = r0.getDependencies(r1, r2, r3)
            return r1
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> getDependencies(java.lang.String r3, com.badlogic.gdx.files.FileHandle r4, com.badlogic.gdx.assets.loaders.SkinLoader.SkinParameter r5) {
            r2 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r3 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            if (r5 == 0) goto L19
            java.lang.String r5 = r5.textureAtlasPath
            if (r5 != 0) goto Le
            goto L19
        Le:
            if (r5 == 0) goto L36
            com.badlogic.gdx.assets.AssetDescriptor r4 = new com.badlogic.gdx.assets.AssetDescriptor
            r4.<init>(r5, r3)
            r0.add(r4)
            goto L36
        L19:
            com.badlogic.gdx.assets.AssetDescriptor r5 = new com.badlogic.gdx.assets.AssetDescriptor
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r4.pathWithoutExtension()
            r1.append(r4)
            java.lang.String r4 = ".atlas"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r5.<init>(r4, r3)
            r0.add(r5)
        L36:
            return r0
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.SkinLoader$SkinParameter r4 = (com.badlogic.gdx.assets.loaders.SkinLoader.SkinParameter) r4
            r0.loadAsync(r1, r2, r3, r4)
            return
    }

    public void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.loaders.SkinLoader.SkinParameter r4) {
            r0 = this;
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Skin loadSync(com.badlogic.gdx.assets.AssetManager r3, java.lang.String r4, com.badlogic.gdx.files.FileHandle r5, com.badlogic.gdx.assets.loaders.SkinLoader.SkinParameter r6) {
            r2 = this;
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = r5.pathWithoutExtension()
            r4.append(r0)
            java.lang.String r0 = ".atlas"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r0 = 0
            if (r6 == 0) goto L22
            java.lang.String r1 = r6.textureAtlasPath
            if (r1 == 0) goto L1d
            r4 = r1
        L1d:
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Object> r6 = r6.resources
            if (r6 == 0) goto L22
            r0 = r6
        L22:
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r6 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r3 = r3.get(r4, r6)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r3
            com.badlogic.gdx.scenes.scene2d.ui.Skin r3 = r2.newSkin(r3)
            if (r0 == 0) goto L4e
            com.badlogic.gdx.utils.ObjectMap$Entries r4 = r0.entries()
            com.badlogic.gdx.utils.ObjectMap$Entries r4 = r4.iterator()
        L38:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L4e
            java.lang.Object r6 = r4.next()
            com.badlogic.gdx.utils.ObjectMap$Entry r6 = (com.badlogic.gdx.utils.ObjectMap.Entry) r6
            K r0 = r6.key
            java.lang.String r0 = (java.lang.String) r0
            V r6 = r6.value
            r3.add(r0, r6)
            goto L38
        L4e:
            r3.load(r5)
            return r3
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Skin loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.SkinLoader$SkinParameter r4 = (com.badlogic.gdx.assets.loaders.SkinLoader.SkinParameter) r4
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = r0.loadSync(r1, r2, r3, r4)
            return r1
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.Skin newSkin(com.badlogic.gdx.graphics.g2d.TextureAtlas r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Skin r0 = new com.badlogic.gdx.scenes.scene2d.ui.Skin
            r0.<init>(r2)
            return r0
    }
}
