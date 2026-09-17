package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public interface InstanceData extends com.badlogic.gdx.utils.Disposable {
    void bind(com.badlogic.gdx.graphics.glutils.ShaderProgram r1, int[] r2);

    @Override // com.badlogic.gdx.utils.Disposable
    void dispose();

    int getNumInstances();

    void unbind(com.badlogic.gdx.graphics.glutils.ShaderProgram r1, int[] r2);
}
