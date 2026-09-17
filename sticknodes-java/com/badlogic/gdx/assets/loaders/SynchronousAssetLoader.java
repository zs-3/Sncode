package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.AssetLoaderParameters;

/* loaded from: classes.dex */
public abstract class SynchronousAssetLoader<T, P extends com.badlogic.gdx.assets.AssetLoaderParameters<T>> extends com.badlogic.gdx.assets.loaders.AssetLoader<T, P> {
    public SynchronousAssetLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public abstract T load(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, P r4);
}
