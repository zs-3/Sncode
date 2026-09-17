package com.badlogic.gdx.assets;

/* loaded from: classes.dex */
public class AssetDescriptor<T> {
    public com.badlogic.gdx.files.FileHandle file;
    public final java.lang.String fileName;
    public final com.badlogic.gdx.assets.AssetLoaderParameters params;
    public final java.lang.Class<T> type;

    public AssetDescriptor(com.badlogic.gdx.files.FileHandle r2, java.lang.Class<T> r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AssetDescriptor(com.badlogic.gdx.files.FileHandle r2, java.lang.Class<T> r3, com.badlogic.gdx.assets.AssetLoaderParameters<T> r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.path()
            r1.fileName = r0
            r1.file = r2
            r1.type = r3
            r1.params = r4
            return
    }

    public AssetDescriptor(java.lang.String r2, java.lang.Class<T> r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AssetDescriptor(java.lang.String r1, java.lang.Class<T> r2, com.badlogic.gdx.assets.AssetLoaderParameters<T> r3) {
            r0 = this;
            r0.<init>()
            r0.fileName = r1
            r0.type = r2
            r0.params = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.fileName
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Class<T> r1 = r2.type
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
