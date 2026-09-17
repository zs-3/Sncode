package com.badlogic.gdx.assets.loaders.resolvers;

/* loaded from: classes.dex */
public class InternalFileHandleResolver implements com.badlogic.gdx.assets.loaders.FileHandleResolver {
    public InternalFileHandleResolver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.FileHandleResolver
    public com.badlogic.gdx.files.FileHandle resolve(java.lang.String r2) {
            r1 = this;
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r0.internal(r2)
            return r2
    }
}
