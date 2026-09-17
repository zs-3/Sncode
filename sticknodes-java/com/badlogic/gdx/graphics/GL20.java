package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public interface GL20 {
    void glAttachShader(int r1, int r2);

    void glBindBuffer(int r1, int r2);

    void glBindFramebuffer(int r1, int r2);

    void glBindRenderbuffer(int r1, int r2);

    void glBindTexture(int r1, int r2);

    void glBlendFunc(int r1, int r2);

    void glBlendFuncSeparate(int r1, int r2, int r3, int r4);

    void glBufferData(int r1, int r2, java.nio.Buffer r3, int r4);

    void glBufferSubData(int r1, int r2, int r3, java.nio.Buffer r4);

    int glCheckFramebufferStatus(int r1);

    void glClear(int r1);

    void glClearColor(float r1, float r2, float r3, float r4);

    void glCompileShader(int r1);

    void glCompressedTexImage2D(int r1, int r2, int r3, int r4, int r5, int r6, int r7, java.nio.Buffer r8);

    int glCreateProgram();

    int glCreateShader(int r1);

    void glDeleteBuffer(int r1);

    void glDeleteFramebuffer(int r1);

    void glDeleteProgram(int r1);

    void glDeleteRenderbuffer(int r1);

    void glDeleteShader(int r1);

    void glDeleteTexture(int r1);

    void glDepthMask(boolean r1);

    void glDisable(int r1);

    void glDisableVertexAttribArray(int r1);

    void glDrawArrays(int r1, int r2, int r3);

    void glDrawElements(int r1, int r2, int r3, int r4);

    void glDrawElements(int r1, int r2, int r3, java.nio.Buffer r4);

    void glEnable(int r1);

    void glEnableVertexAttribArray(int r1);

    void glFramebufferRenderbuffer(int r1, int r2, int r3, int r4);

    void glFramebufferTexture2D(int r1, int r2, int r3, int r4, int r5);

    int glGenBuffer();

    int glGenFramebuffer();

    int glGenRenderbuffer();

    int glGenTexture();

    void glGenerateMipmap(int r1);

    java.lang.String glGetActiveAttrib(int r1, int r2, java.nio.IntBuffer r3, java.nio.IntBuffer r4);

    java.lang.String glGetActiveUniform(int r1, int r2, java.nio.IntBuffer r3, java.nio.IntBuffer r4);

    int glGetAttribLocation(int r1, java.lang.String r2);

    void glGetFloatv(int r1, java.nio.FloatBuffer r2);

    void glGetIntegerv(int r1, java.nio.IntBuffer r2);

    java.lang.String glGetProgramInfoLog(int r1);

    void glGetProgramiv(int r1, int r2, java.nio.IntBuffer r3);

    java.lang.String glGetShaderInfoLog(int r1);

    void glGetShaderiv(int r1, int r2, java.nio.IntBuffer r3);

    java.lang.String glGetString(int r1);

    int glGetUniformLocation(int r1, java.lang.String r2);

    void glLineWidth(float r1);

    void glLinkProgram(int r1);

    void glPixelStorei(int r1, int r2);

    void glReadPixels(int r1, int r2, int r3, int r4, int r5, int r6, java.nio.Buffer r7);

    void glRenderbufferStorage(int r1, int r2, int r3, int r4);

    void glScissor(int r1, int r2, int r3, int r4);

    void glShaderSource(int r1, java.lang.String r2);

    void glTexImage2D(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, java.nio.Buffer r9);

    void glTexParameterf(int r1, int r2, float r3);

    void glTexParameteri(int r1, int r2, int r3);

    void glUniform1f(int r1, float r2);

    void glUniform1i(int r1, int r2);

    void glUniform2f(int r1, float r2, float r3);

    void glUniform3f(int r1, float r2, float r3, float r4);

    void glUniform4f(int r1, float r2, float r3, float r4, float r5);

    void glUniformMatrix4fv(int r1, int r2, boolean r3, float[] r4, int r5);

    void glUseProgram(int r1);

    void glVertexAttribPointer(int r1, int r2, int r3, boolean r4, int r5, int r6);

    void glVertexAttribPointer(int r1, int r2, int r3, boolean r4, int r5, java.nio.Buffer r6);

    void glViewport(int r1, int r2, int r3, int r4);
}
