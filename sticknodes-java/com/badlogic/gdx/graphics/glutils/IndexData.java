package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public interface IndexData extends com.badlogic.gdx.utils.Disposable {
    void bind();

    @Override // com.badlogic.gdx.utils.Disposable
    void dispose();

    java.nio.ShortBuffer getBuffer(boolean r1);

    int getNumIndices();

    int getNumMaxIndices();

    void invalidate();

    void setIndices(short[] r1, int r2, int r3);

    void unbind();
}
