package com.badlogic.gdx.assets.loaders;

/* loaded from: classes.dex */
public class ParticleEffectLoader extends com.badlogic.gdx.assets.loaders.SynchronousAssetLoader<com.badlogic.gdx.graphics.g2d.ParticleEffect, com.badlogic.gdx.assets.loaders.ParticleEffectLoader.ParticleEffectParameter> {

    public static class ParticleEffectParameter extends com.badlogic.gdx.assets.AssetLoaderParameters<com.badlogic.gdx.graphics.g2d.ParticleEffect> {
        public java.lang.String atlasFile;
        public java.lang.String atlasPrefix;
        public com.badlogic.gdx.files.FileHandle imagesDir;

        public ParticleEffectParameter() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ParticleEffectLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.Array getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.AssetLoaderParameters r3) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.ParticleEffectLoader$ParticleEffectParameter r3 = (com.badlogic.gdx.assets.loaders.ParticleEffectLoader.ParticleEffectParameter) r3
            com.badlogic.gdx.utils.Array r1 = r0.getDependencies(r1, r2, r3)
            return r1
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> getDependencies(java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.loaders.ParticleEffectLoader.ParticleEffectParameter r4) {
            r1 = this;
            if (r4 == 0) goto L18
            java.lang.String r2 = r4.atlasFile
            if (r2 == 0) goto L18
            com.badlogic.gdx.utils.Array r2 = new com.badlogic.gdx.utils.Array
            r2.<init>()
            com.badlogic.gdx.assets.AssetDescriptor r3 = new com.badlogic.gdx.assets.AssetDescriptor
            java.lang.String r4 = r4.atlasFile
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r3.<init>(r4, r0)
            r2.add(r3)
            goto L19
        L18:
            r2 = 0
        L19:
            return r2
    }

    public com.badlogic.gdx.graphics.g2d.ParticleEffect load(com.badlogic.gdx.assets.AssetManager r3, java.lang.String r4, com.badlogic.gdx.files.FileHandle r5, com.badlogic.gdx.assets.loaders.ParticleEffectLoader.ParticleEffectParameter r6) {
            r2 = this;
            com.badlogic.gdx.graphics.g2d.ParticleEffect r4 = new com.badlogic.gdx.graphics.g2d.ParticleEffect
            r4.<init>()
            if (r6 == 0) goto L19
            java.lang.String r0 = r6.atlasFile
            if (r0 == 0) goto L19
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r1 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r3 = r3.get(r0, r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r3
            java.lang.String r6 = r6.atlasPrefix
            r4.load(r5, r3, r6)
            goto L2a
        L19:
            if (r6 == 0) goto L23
            com.badlogic.gdx.files.FileHandle r3 = r6.imagesDir
            if (r3 == 0) goto L23
            r4.load(r5, r3)
            goto L2a
        L23:
            com.badlogic.gdx.files.FileHandle r3 = r5.parent()
            r4.load(r5, r3)
        L2a:
            return r4
    }

    @Override // com.badlogic.gdx.assets.loaders.SynchronousAssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.g2d.ParticleEffect load(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.ParticleEffectLoader$ParticleEffectParameter r4 = (com.badlogic.gdx.assets.loaders.ParticleEffectLoader.ParticleEffectParameter) r4
            com.badlogic.gdx.graphics.g2d.ParticleEffect r1 = r0.load(r1, r2, r3, r4)
            return r1
    }
}
