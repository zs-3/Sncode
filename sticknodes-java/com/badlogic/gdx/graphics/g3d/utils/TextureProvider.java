package com.badlogic.gdx.graphics.g3d.utils;

/* loaded from: classes.dex */
public interface TextureProvider {

    public static class AssetTextureProvider implements com.badlogic.gdx.graphics.g3d.utils.TextureProvider {
        public final com.badlogic.gdx.assets.AssetManager assetManager;

        public AssetTextureProvider(com.badlogic.gdx.assets.AssetManager r1) {
                r0 = this;
                r0.<init>()
                r0.assetManager = r1
                return
        }

        @Override // com.badlogic.gdx.graphics.g3d.utils.TextureProvider
        public com.badlogic.gdx.graphics.Texture load(java.lang.String r3) {
                r2 = this;
                com.badlogic.gdx.assets.AssetManager r0 = r2.assetManager
                java.lang.Class<com.badlogic.gdx.graphics.Texture> r1 = com.badlogic.gdx.graphics.Texture.class
                java.lang.Object r3 = r0.get(r3, r1)
                com.badlogic.gdx.graphics.Texture r3 = (com.badlogic.gdx.graphics.Texture) r3
                return r3
        }
    }

    com.badlogic.gdx.graphics.Texture load(java.lang.String r1);
}
