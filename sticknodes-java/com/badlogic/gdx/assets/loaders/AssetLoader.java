package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.AssetLoaderParameters;

/* loaded from: classes.dex */
public abstract class AssetLoader<T, P extends com.badlogic.gdx.assets.AssetLoaderParameters<T>> {
    private com.badlogic.gdx.assets.loaders.FileHandleResolver resolver;

    public AssetLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>()
            r0.resolver = r1
            return
    }

    public abstract com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, P r3);

    public com.badlogic.gdx.files.FileHandle resolve(java.lang.String r2) {
            r1 = this;
            com.badlogic.gdx.assets.loaders.FileHandleResolver r0 = r1.resolver
            com.badlogic.gdx.files.FileHandle r2 = r0.resolve(r2)
            return r2
    }
}
