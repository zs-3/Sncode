package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public interface VertexData extends com.badlogic.gdx.utils.Disposable {
    void bind(com.badlogic.gdx.graphics.glutils.ShaderProgram r1, int[] r2);

    @Override // com.badlogic.gdx.utils.Disposable
    void dispose();

    com.badlogic.gdx.graphics.VertexAttributes getAttributes();

    java.nio.FloatBuffer getBuffer(boolean r1);

    int getNumVertices();

    void invalidate();

    void setVertices(float[] r1, int r2, int r3);

    void unbind(com.badlogic.gdx.graphics.glutils.ShaderProgram r1, int[] r2);
}
