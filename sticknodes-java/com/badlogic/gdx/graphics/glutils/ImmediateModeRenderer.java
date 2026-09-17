package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public interface ImmediateModeRenderer {
    void begin(com.badlogic.gdx.math.Matrix4 r1, int r2);

    void color(float r1);

    void color(float r1, float r2, float r3, float r4);

    void dispose();

    void end();

    int getMaxVertices();

    int getNumVertices();

    void vertex(float r1, float r2, float r3);
}
