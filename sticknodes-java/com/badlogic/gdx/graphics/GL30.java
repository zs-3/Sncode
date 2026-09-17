package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public interface GL30 extends com.badlogic.gdx.graphics.GL20 {
    void glBindVertexArray(int r1);

    void glDeleteVertexArrays(int r1, java.nio.IntBuffer r2);

    void glDrawArraysInstanced(int r1, int r2, int r3, int r4);

    void glDrawBuffers(int r1, java.nio.IntBuffer r2);

    void glDrawElementsInstanced(int r1, int r2, int r3, int r4, int r5);

    void glGenVertexArrays(int r1, java.nio.IntBuffer r2);

    void glTexImage3D(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, java.nio.Buffer r10);
}
