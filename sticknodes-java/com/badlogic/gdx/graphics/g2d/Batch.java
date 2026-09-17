package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public interface Batch extends com.badlogic.gdx.utils.Disposable {
    void begin();

    void disableBlending();

    void draw(com.badlogic.gdx.graphics.Texture r1, float r2, float r3);

    void draw(com.badlogic.gdx.graphics.Texture r1, float r2, float r3, float r4, float r5);

    void draw(com.badlogic.gdx.graphics.Texture r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9);

    void draw(com.badlogic.gdx.graphics.Texture r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, int r11, int r12, int r13, int r14, boolean r15, boolean r16);

    void draw(com.badlogic.gdx.graphics.Texture r1, float[] r2, int r3, int r4);

    void draw(com.badlogic.gdx.graphics.g2d.TextureRegion r1, float r2, float r3);

    void draw(com.badlogic.gdx.graphics.g2d.TextureRegion r1, float r2, float r3, float r4, float r5);

    void draw(com.badlogic.gdx.graphics.g2d.TextureRegion r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10);

    void enableBlending();

    void end();

    void flush();

    com.badlogic.gdx.graphics.Color getColor();

    float getPackedColor();

    com.badlogic.gdx.math.Matrix4 getProjectionMatrix();

    com.badlogic.gdx.math.Matrix4 getTransformMatrix();

    boolean isDrawing();

    void setBlendFunction(int r1, int r2);

    void setColor(float r1, float r2, float r3, float r4);

    void setColor(com.badlogic.gdx.graphics.Color r1);

    void setPackedColor(float r1);

    void setProjectionMatrix(com.badlogic.gdx.math.Matrix4 r1);

    void setShader(com.badlogic.gdx.graphics.glutils.ShaderProgram r1);

    void setTransformMatrix(com.badlogic.gdx.math.Matrix4 r1);
}
