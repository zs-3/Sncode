package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class CustomTextureAtlasLoader extends com.badlogic.gdx.assets.loaders.SynchronousAssetLoader<com.badlogic.gdx.graphics.g2d.TextureAtlas, org.fortheloss.framework.CustomTextureAtlasLoader.CustomTextureAtlasParameter> {
    private com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData data;

    public static class CustomTextureAtlasParameter extends com.badlogic.gdx.assets.AssetLoaderParameters<com.badlogic.gdx.graphics.g2d.TextureAtlas> {
        public boolean flip;
        public java.lang.String imageDirPath;
        public boolean isInternal;

        public CustomTextureAtlasParameter() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.flip = r0
                r1 = 0
                r2.imageDirPath = r1
                r2.isInternal = r0
                return
        }

        public CustomTextureAtlasParameter(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.flip = r0
                r1.isInternal = r0
                r1.imageDirPath = r2
                return
        }

        public CustomTextureAtlasParameter(java.lang.String r2, boolean r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.flip = r0
                r1.imageDirPath = r2
                r1.isInternal = r3
                return
        }
    }

    public CustomTextureAtlasLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.Array getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.AssetLoaderParameters r3) {
            r0 = this;
            org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter r3 = (org.fortheloss.framework.CustomTextureAtlasLoader.CustomTextureAtlasParameter) r3
            com.badlogic.gdx.utils.Array r1 = r0.getDependencies(r1, r2, r3)
            return r1
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> getDependencies(java.lang.String r4, com.badlogic.gdx.files.FileHandle r5, org.fortheloss.framework.CustomTextureAtlasLoader.CustomTextureAtlasParameter r6) {
            r3 = this;
            com.badlogic.gdx.files.FileHandle r4 = r5.parent()
            if (r6 != 0) goto L8
            r0 = 0
            goto La
        L8:
            java.lang.String r0 = r6.imageDirPath
        La:
            if (r0 == 0) goto L2a
            boolean r1 = r6.isInternal
            if (r1 != 0) goto L1d
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r0 = r1.absolute(r0)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L2a
            goto L29
        L1d:
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r0 = r1.internal(r0)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L2a
        L29:
            r4 = r0
        L2a:
            if (r6 == 0) goto L36
            com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData r0 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData
            boolean r6 = r6.flip
            r0.<init>(r5, r4, r6)
            r3.data = r0
            goto L3e
        L36:
            com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData r6 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData
            r0 = 0
            r6.<init>(r5, r4, r0)
            r3.data = r6
        L3e:
            com.badlogic.gdx.utils.Array r4 = new com.badlogic.gdx.utils.Array
            r4.<init>()
            com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData r5 = r3.data
            com.badlogic.gdx.utils.Array r5 = r5.getPages()
            com.badlogic.gdx.utils.Array$ArrayIterator r5 = r5.iterator()
        L4d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7b
            java.lang.Object r6 = r5.next()
            com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Page r6 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Page) r6
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter r0 = new com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter
            r0.<init>()
            com.badlogic.gdx.graphics.Pixmap$Format r1 = r6.format
            r0.format = r1
            boolean r1 = r6.useMipMaps
            r0.genMipMaps = r1
            com.badlogic.gdx.graphics.Texture$TextureFilter r1 = r6.minFilter
            r0.minFilter = r1
            com.badlogic.gdx.graphics.Texture$TextureFilter r1 = r6.magFilter
            r0.magFilter = r1
            com.badlogic.gdx.assets.AssetDescriptor r1 = new com.badlogic.gdx.assets.AssetDescriptor
            com.badlogic.gdx.files.FileHandle r6 = r6.textureFile
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r2 = com.badlogic.gdx.graphics.Texture.class
            r1.<init>(r6, r2, r0)
            r4.add(r1)
            goto L4d
        L7b:
            return r4
    }

    public com.badlogic.gdx.graphics.g2d.TextureAtlas load(com.badlogic.gdx.assets.AssetManager r3, java.lang.String r4, com.badlogic.gdx.files.FileHandle r5, org.fortheloss.framework.CustomTextureAtlasLoader.CustomTextureAtlasParameter r6) {
            r2 = this;
            com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData r4 = r2.data
            com.badlogic.gdx.utils.Array r4 = r4.getPages()
            com.badlogic.gdx.utils.Array$ArrayIterator r4 = r4.iterator()
        La:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2f
            java.lang.Object r5 = r4.next()
            com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Page r5 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Page) r5
            com.badlogic.gdx.files.FileHandle r6 = r5.textureFile
            java.lang.String r6 = r6.path()
            java.lang.String r0 = "\\\\"
            java.lang.String r1 = "/"
            java.lang.String r6 = r6.replaceAll(r0, r1)
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r0 = com.badlogic.gdx.graphics.Texture.class
            java.lang.Object r6 = r3.get(r6, r0)
            com.badlogic.gdx.graphics.Texture r6 = (com.badlogic.gdx.graphics.Texture) r6
            r5.texture = r6
            goto La
        L2f:
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = new com.badlogic.gdx.graphics.g2d.TextureAtlas
            com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData r4 = r2.data
            r3.<init>(r4)
            r4 = 0
            r2.data = r4
            return r3
    }

    @Override // com.badlogic.gdx.assets.loaders.SynchronousAssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.g2d.TextureAtlas load(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            org.fortheloss.framework.CustomTextureAtlasLoader$CustomTextureAtlasParameter r4 = (org.fortheloss.framework.CustomTextureAtlasLoader.CustomTextureAtlasParameter) r4
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = r0.load(r1, r2, r3, r4)
            return r1
    }
}
