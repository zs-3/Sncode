package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public interface TextureArrayData {
    void consumeTextureArrayData();

    int getDepth();

    int getGLType();

    int getHeight();

    int getInternalFormat();

    int getWidth();

    boolean isManaged();

    boolean isPrepared();

    void prepare();
}
