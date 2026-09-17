package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.AssetLoaderParameters;

/* loaded from: classes.dex */
public abstract class AsynchronousAssetLoader<T, P extends com.badlogic.gdx.assets.AssetLoaderParameters<T>> extends com.badlogic.gdx.assets.loaders.AssetLoader<T, P> {
    public AsynchronousAssetLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public abstract void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, P r4);

    public abstract T loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, P r4);

    public void unloadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, P r4) {
            r0 = this;
            return
    }
}
