package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidGL20 implements com.badlogic.gdx.graphics.GL20 {
    private byte[] buffer;
    private int[] ints;
    private int[] ints2;
    private int[] ints3;

    public AndroidGL20() {
            r2 = this;
            r2.<init>()
            r0 = 1
            int[] r1 = new int[r0]
            r2.ints = r1
            int[] r1 = new int[r0]
            r2.ints2 = r1
            int[] r0 = new int[r0]
            r2.ints3 = r0
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]
            r2.buffer = r0
            return
    }

    public void glActiveTexture(int r1) {
            r0 = this;
            android.opengl.GLES20.glActiveTexture(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glAttachShader(int r1, int r2) {
            r0 = this;
            android.opengl.GLES20.glAttachShader(r1, r2)
            return
    }

    public void glBindAttribLocation(int r1, int r2, java.lang.String r3) {
            r0 = this;
            android.opengl.GLES20.glBindAttribLocation(r1, r2, r3)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glBindBuffer(int r1, int r2) {
            r0 = this;
            android.opengl.GLES20.glBindBuffer(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glBindFramebuffer(int r1, int r2) {
            r0 = this;
            android.opengl.GLES20.glBindFramebuffer(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glBindRenderbuffer(int r1, int r2) {
            r0 = this;
            android.opengl.GLES20.glBindRenderbuffer(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glBindTexture(int r1, int r2) {
            r0 = this;
            android.opengl.GLES20.glBindTexture(r1, r2)
            return
    }

    public void glBlendColor(float r1, float r2, float r3, float r4) {
            r0 = this;
            android.opengl.GLES20.glBlendColor(r1, r2, r3, r4)
            return
    }

    public void glBlendEquation(int r1) {
            r0 = this;
            android.opengl.GLES20.glBlendEquation(r1)
            return
    }

    public void glBlendEquationSeparate(int r1, int r2) {
            r0 = this;
            android.opengl.GLES20.glBlendEquationSeparate(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glBlendFunc(int r1, int r2) {
            r0 = this;
            android.opengl.GLES20.glBlendFunc(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glBlendFuncSeparate(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glBlendFuncSeparate(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glBufferData(int r1, int r2, java.nio.Buffer r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glBufferData(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glBufferSubData(int r1, int r2, int r3, java.nio.Buffer r4) {
            r0 = this;
            android.opengl.GLES20.glBufferSubData(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public int glCheckFramebufferStatus(int r1) {
            r0 = this;
            int r1 = android.opengl.GLES20.glCheckFramebufferStatus(r1)
            return r1
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glClear(int r1) {
            r0 = this;
            android.opengl.GLES20.glClear(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glClearColor(float r1, float r2, float r3, float r4) {
            r0 = this;
            android.opengl.GLES20.glClearColor(r1, r2, r3, r4)
            return
    }

    public void glClearDepthf(float r1) {
            r0 = this;
            android.opengl.GLES20.glClearDepthf(r1)
            return
    }

    public void glClearStencil(int r1) {
            r0 = this;
            android.opengl.GLES20.glClearStencil(r1)
            return
    }

    public void glColorMask(boolean r1, boolean r2, boolean r3, boolean r4) {
            r0 = this;
            android.opengl.GLES20.glColorMask(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glCompileShader(int r1) {
            r0 = this;
            android.opengl.GLES20.glCompileShader(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glCompressedTexImage2D(int r1, int r2, int r3, int r4, int r5, int r6, int r7, java.nio.Buffer r8) {
            r0 = this;
            android.opengl.GLES20.glCompressedTexImage2D(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void glCompressedTexSubImage2D(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, java.nio.Buffer r9) {
            r0 = this;
            android.opengl.GLES20.glCompressedTexSubImage2D(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public void glCopyTexImage2D(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8) {
            r0 = this;
            android.opengl.GLES20.glCopyTexImage2D(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void glCopyTexSubImage2D(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8) {
            r0 = this;
            android.opengl.GLES20.glCopyTexSubImage2D(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public int glCreateProgram() {
            r1 = this;
            int r0 = android.opengl.GLES20.glCreateProgram()
            return r0
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public int glCreateShader(int r1) {
            r0 = this;
            int r1 = android.opengl.GLES20.glCreateShader(r1)
            return r1
    }

    public void glCullFace(int r1) {
            r0 = this;
            android.opengl.GLES20.glCullFace(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glDeleteBuffer(int r3) {
            r2 = this;
            int[] r0 = r2.ints
            r1 = 0
            r0[r1] = r3
            r3 = 1
            android.opengl.GLES20.glDeleteBuffers(r3, r0, r1)
            return
    }

    public void glDeleteBuffers(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glDeleteBuffers(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glDeleteFramebuffer(int r3) {
            r2 = this;
            int[] r0 = r2.ints
            r1 = 0
            r0[r1] = r3
            r3 = 1
            android.opengl.GLES20.glDeleteFramebuffers(r3, r0, r1)
            return
    }

    public void glDeleteFramebuffers(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glDeleteFramebuffers(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glDeleteProgram(int r1) {
            r0 = this;
            android.opengl.GLES20.glDeleteProgram(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glDeleteRenderbuffer(int r3) {
            r2 = this;
            int[] r0 = r2.ints
            r1 = 0
            r0[r1] = r3
            r3 = 1
            android.opengl.GLES20.glDeleteRenderbuffers(r3, r0, r1)
            return
    }

    public void glDeleteRenderbuffers(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glDeleteRenderbuffers(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glDeleteShader(int r1) {
            r0 = this;
            android.opengl.GLES20.glDeleteShader(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glDeleteTexture(int r3) {
            r2 = this;
            int[] r0 = r2.ints
            r1 = 0
            r0[r1] = r3
            r3 = 1
            android.opengl.GLES20.glDeleteTextures(r3, r0, r1)
            return
    }

    public void glDeleteTextures(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glDeleteTextures(r1, r2)
            return
    }

    public void glDepthFunc(int r1) {
            r0 = this;
            android.opengl.GLES20.glDepthFunc(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glDepthMask(boolean r1) {
            r0 = this;
            android.opengl.GLES20.glDepthMask(r1)
            return
    }

    public void glDepthRangef(float r1, float r2) {
            r0 = this;
            android.opengl.GLES20.glDepthRangef(r1, r2)
            return
    }

    public void glDetachShader(int r1, int r2) {
            r0 = this;
            android.opengl.GLES20.glDetachShader(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glDisable(int r1) {
            r0 = this;
            android.opengl.GLES20.glDisable(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glDisableVertexAttribArray(int r1) {
            r0 = this;
            android.opengl.GLES20.glDisableVertexAttribArray(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glDrawArrays(int r1, int r2, int r3) {
            r0 = this;
            android.opengl.GLES20.glDrawArrays(r1, r2, r3)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glDrawElements(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glDrawElements(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glDrawElements(int r1, int r2, int r3, java.nio.Buffer r4) {
            r0 = this;
            android.opengl.GLES20.glDrawElements(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glEnable(int r1) {
            r0 = this;
            android.opengl.GLES20.glEnable(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glEnableVertexAttribArray(int r1) {
            r0 = this;
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            return
    }

    public void glFinish() {
            r0 = this;
            android.opengl.GLES20.glFinish()
            return
    }

    public void glFlush() {
            r0 = this;
            android.opengl.GLES20.glFlush()
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glFramebufferRenderbuffer(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glFramebufferRenderbuffer(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glFramebufferTexture2D(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.opengl.GLES20.glFramebufferTexture2D(r1, r2, r3, r4, r5)
            return
    }

    public void glFrontFace(int r1) {
            r0 = this;
            android.opengl.GLES20.glFrontFace(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public int glGenBuffer() {
            r3 = this;
            int[] r0 = r3.ints
            r1 = 1
            r2 = 0
            android.opengl.GLES20.glGenBuffers(r1, r0, r2)
            int[] r0 = r3.ints
            r0 = r0[r2]
            return r0
    }

    public void glGenBuffers(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glGenBuffers(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public int glGenFramebuffer() {
            r3 = this;
            int[] r0 = r3.ints
            r1 = 1
            r2 = 0
            android.opengl.GLES20.glGenFramebuffers(r1, r0, r2)
            int[] r0 = r3.ints
            r0 = r0[r2]
            return r0
    }

    public void glGenFramebuffers(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glGenFramebuffers(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public int glGenRenderbuffer() {
            r3 = this;
            int[] r0 = r3.ints
            r1 = 1
            r2 = 0
            android.opengl.GLES20.glGenRenderbuffers(r1, r0, r2)
            int[] r0 = r3.ints
            r0 = r0[r2]
            return r0
    }

    public void glGenRenderbuffers(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glGenRenderbuffers(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public int glGenTexture() {
            r3 = this;
            int[] r0 = r3.ints
            r1 = 1
            r2 = 0
            android.opengl.GLES20.glGenTextures(r1, r0, r2)
            int[] r0 = r3.ints
            r0 = r0[r2]
            return r0
    }

    public void glGenTextures(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glGenTextures(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glGenerateMipmap(int r1) {
            r0 = this;
            android.opengl.GLES20.glGenerateMipmap(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public java.lang.String glGetActiveAttrib(int r12, int r13, java.nio.IntBuffer r14, java.nio.IntBuffer r15) {
            r11 = this;
            byte[] r9 = r11.buffer
            int r2 = r9.length
            int[] r3 = r11.ints
            int[] r5 = r11.ints2
            int[] r7 = r11.ints3
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            android.opengl.GLES20.glGetActiveAttrib(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int[] r12 = r11.ints2
            r13 = 0
            r12 = r12[r13]
            r14.put(r12)
            int[] r12 = r11.ints3
            r12 = r12[r13]
            r15.put(r12)
            java.lang.String r12 = new java.lang.String
            byte[] r14 = r11.buffer
            int[] r15 = r11.ints
            r15 = r15[r13]
            r12.<init>(r14, r13, r15)
            return r12
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public java.lang.String glGetActiveUniform(int r12, int r13, java.nio.IntBuffer r14, java.nio.IntBuffer r15) {
            r11 = this;
            byte[] r9 = r11.buffer
            int r2 = r9.length
            int[] r3 = r11.ints
            int[] r5 = r11.ints2
            int[] r7 = r11.ints3
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            android.opengl.GLES20.glGetActiveUniform(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int[] r12 = r11.ints2
            r13 = 0
            r12 = r12[r13]
            r14.put(r12)
            int[] r12 = r11.ints3
            r12 = r12[r13]
            r15.put(r12)
            java.lang.String r12 = new java.lang.String
            byte[] r14 = r11.buffer
            int[] r15 = r11.ints
            r15 = r15[r13]
            r12.<init>(r14, r13, r15)
            return r12
    }

    public void glGetAttachedShaders(int r1, int r2, java.nio.Buffer r3, java.nio.IntBuffer r4) {
            r0 = this;
            java.nio.IntBuffer r3 = (java.nio.IntBuffer) r3
            android.opengl.GLES20.glGetAttachedShaders(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public int glGetAttribLocation(int r1, java.lang.String r2) {
            r0 = this;
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r2)
            return r1
    }

    public void glGetBooleanv(int r1, java.nio.Buffer r2) {
            r0 = this;
            java.nio.IntBuffer r2 = (java.nio.IntBuffer) r2
            android.opengl.GLES20.glGetBooleanv(r1, r2)
            return
    }

    public void glGetBufferParameteriv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glGetBufferParameteriv(r1, r2, r3)
            return
    }

    public int glGetError() {
            r1 = this;
            int r0 = android.opengl.GLES20.glGetError()
            return r0
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glGetFloatv(int r1, java.nio.FloatBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glGetFloatv(r1, r2)
            return
    }

    public void glGetFramebufferAttachmentParameteriv(int r1, int r2, int r3, java.nio.IntBuffer r4) {
            r0 = this;
            android.opengl.GLES20.glGetFramebufferAttachmentParameteriv(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glGetIntegerv(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glGetIntegerv(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public java.lang.String glGetProgramInfoLog(int r1) {
            r0 = this;
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r1)
            return r1
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glGetProgramiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glGetProgramiv(r1, r2, r3)
            return
    }

    public void glGetRenderbufferParameteriv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glGetRenderbufferParameteriv(r1, r2, r3)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public java.lang.String glGetShaderInfoLog(int r1) {
            r0 = this;
            java.lang.String r1 = android.opengl.GLES20.glGetShaderInfoLog(r1)
            return r1
    }

    public void glGetShaderPrecisionFormat(int r1, int r2, java.nio.IntBuffer r3, java.nio.IntBuffer r4) {
            r0 = this;
            android.opengl.GLES20.glGetShaderPrecisionFormat(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glGetShaderiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glGetShaderiv(r1, r2, r3)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public java.lang.String glGetString(int r1) {
            r0 = this;
            java.lang.String r1 = android.opengl.GLES20.glGetString(r1)
            return r1
    }

    public void glGetTexParameterfv(int r1, int r2, java.nio.FloatBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glGetTexParameterfv(r1, r2, r3)
            return
    }

    public void glGetTexParameteriv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glGetTexParameteriv(r1, r2, r3)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public int glGetUniformLocation(int r1, java.lang.String r2) {
            r0 = this;
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r2)
            return r1
    }

    public void glGetUniformfv(int r1, int r2, java.nio.FloatBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glGetUniformfv(r1, r2, r3)
            return
    }

    public void glGetUniformiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glGetUniformiv(r1, r2, r3)
            return
    }

    public void glGetVertexAttribPointerv(int r1, int r2, java.nio.Buffer r3) {
            r0 = this;
            return
    }

    public void glGetVertexAttribfv(int r1, int r2, java.nio.FloatBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glGetVertexAttribfv(r1, r2, r3)
            return
    }

    public void glGetVertexAttribiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glGetVertexAttribiv(r1, r2, r3)
            return
    }

    public void glHint(int r1, int r2) {
            r0 = this;
            android.opengl.GLES20.glHint(r1, r2)
            return
    }

    public boolean glIsBuffer(int r1) {
            r0 = this;
            boolean r1 = android.opengl.GLES20.glIsBuffer(r1)
            return r1
    }

    public boolean glIsEnabled(int r1) {
            r0 = this;
            boolean r1 = android.opengl.GLES20.glIsEnabled(r1)
            return r1
    }

    public boolean glIsFramebuffer(int r1) {
            r0 = this;
            boolean r1 = android.opengl.GLES20.glIsFramebuffer(r1)
            return r1
    }

    public boolean glIsProgram(int r1) {
            r0 = this;
            boolean r1 = android.opengl.GLES20.glIsProgram(r1)
            return r1
    }

    public boolean glIsRenderbuffer(int r1) {
            r0 = this;
            boolean r1 = android.opengl.GLES20.glIsRenderbuffer(r1)
            return r1
    }

    public boolean glIsShader(int r1) {
            r0 = this;
            boolean r1 = android.opengl.GLES20.glIsShader(r1)
            return r1
    }

    public boolean glIsTexture(int r1) {
            r0 = this;
            boolean r1 = android.opengl.GLES20.glIsTexture(r1)
            return r1
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glLineWidth(float r1) {
            r0 = this;
            android.opengl.GLES20.glLineWidth(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glLinkProgram(int r1) {
            r0 = this;
            android.opengl.GLES20.glLinkProgram(r1)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glPixelStorei(int r1, int r2) {
            r0 = this;
            android.opengl.GLES20.glPixelStorei(r1, r2)
            return
    }

    public void glPolygonOffset(float r1, float r2) {
            r0 = this;
            android.opengl.GLES20.glPolygonOffset(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glReadPixels(int r1, int r2, int r3, int r4, int r5, int r6, java.nio.Buffer r7) {
            r0 = this;
            android.opengl.GLES20.glReadPixels(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void glReleaseShaderCompiler() {
            r0 = this;
            android.opengl.GLES20.glReleaseShaderCompiler()
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glRenderbufferStorage(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glRenderbufferStorage(r1, r2, r3, r4)
            return
    }

    public void glSampleCoverage(float r1, boolean r2) {
            r0 = this;
            android.opengl.GLES20.glSampleCoverage(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glScissor(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glScissor(r1, r2, r3, r4)
            return
    }

    public void glShaderBinary(int r1, java.nio.IntBuffer r2, int r3, java.nio.Buffer r4, int r5) {
            r0 = this;
            android.opengl.GLES20.glShaderBinary(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glShaderSource(int r1, java.lang.String r2) {
            r0 = this;
            android.opengl.GLES20.glShaderSource(r1, r2)
            return
    }

    public void glStencilFunc(int r1, int r2, int r3) {
            r0 = this;
            android.opengl.GLES20.glStencilFunc(r1, r2, r3)
            return
    }

    public void glStencilFuncSeparate(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glStencilFuncSeparate(r1, r2, r3, r4)
            return
    }

    public void glStencilMask(int r1) {
            r0 = this;
            android.opengl.GLES20.glStencilMask(r1)
            return
    }

    public void glStencilMaskSeparate(int r1, int r2) {
            r0 = this;
            android.opengl.GLES20.glStencilMaskSeparate(r1, r2)
            return
    }

    public void glStencilOp(int r1, int r2, int r3) {
            r0 = this;
            android.opengl.GLES20.glStencilOp(r1, r2, r3)
            return
    }

    public void glStencilOpSeparate(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glStencilOpSeparate(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glTexImage2D(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, java.nio.Buffer r9) {
            r0 = this;
            android.opengl.GLES20.glTexImage2D(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glTexParameterf(int r1, int r2, float r3) {
            r0 = this;
            android.opengl.GLES20.glTexParameterf(r1, r2, r3)
            return
    }

    public void glTexParameterfv(int r1, int r2, java.nio.FloatBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glTexParameterfv(r1, r2, r3)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glTexParameteri(int r1, int r2, int r3) {
            r0 = this;
            android.opengl.GLES20.glTexParameteri(r1, r2, r3)
            return
    }

    public void glTexParameteriv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glTexParameteriv(r1, r2, r3)
            return
    }

    public void glTexSubImage2D(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, java.nio.Buffer r9) {
            r0 = this;
            android.opengl.GLES20.glTexSubImage2D(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glUniform1f(int r1, float r2) {
            r0 = this;
            android.opengl.GLES20.glUniform1f(r1, r2)
            return
    }

    public void glUniform1fv(int r1, int r2, java.nio.FloatBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glUniform1fv(r1, r2, r3)
            return
    }

    public void glUniform1fv(int r1, int r2, float[] r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glUniform1fv(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glUniform1i(int r1, int r2) {
            r0 = this;
            android.opengl.GLES20.glUniform1i(r1, r2)
            return
    }

    public void glUniform1iv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glUniform1iv(r1, r2, r3)
            return
    }

    public void glUniform1iv(int r1, int r2, int[] r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glUniform1iv(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glUniform2f(int r1, float r2, float r3) {
            r0 = this;
            android.opengl.GLES20.glUniform2f(r1, r2, r3)
            return
    }

    public void glUniform2fv(int r1, int r2, java.nio.FloatBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glUniform2fv(r1, r2, r3)
            return
    }

    public void glUniform2fv(int r1, int r2, float[] r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glUniform2fv(r1, r2, r3, r4)
            return
    }

    public void glUniform2i(int r1, int r2, int r3) {
            r0 = this;
            android.opengl.GLES20.glUniform2i(r1, r2, r3)
            return
    }

    public void glUniform2iv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glUniform2iv(r1, r2, r3)
            return
    }

    public void glUniform2iv(int r1, int r2, int[] r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glUniform2iv(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glUniform3f(int r1, float r2, float r3, float r4) {
            r0 = this;
            android.opengl.GLES20.glUniform3f(r1, r2, r3, r4)
            return
    }

    public void glUniform3fv(int r1, int r2, java.nio.FloatBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glUniform3fv(r1, r2, r3)
            return
    }

    public void glUniform3fv(int r1, int r2, float[] r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glUniform3fv(r1, r2, r3, r4)
            return
    }

    public void glUniform3i(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glUniform3i(r1, r2, r3, r4)
            return
    }

    public void glUniform3iv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glUniform3iv(r1, r2, r3)
            return
    }

    public void glUniform3iv(int r1, int r2, int[] r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glUniform3iv(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glUniform4f(int r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            android.opengl.GLES20.glUniform4f(r1, r2, r3, r4, r5)
            return
    }

    public void glUniform4fv(int r1, int r2, java.nio.FloatBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glUniform4fv(r1, r2, r3)
            return
    }

    public void glUniform4fv(int r1, int r2, float[] r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glUniform4fv(r1, r2, r3, r4)
            return
    }

    public void glUniform4i(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.opengl.GLES20.glUniform4i(r1, r2, r3, r4, r5)
            return
    }

    public void glUniform4iv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES20.glUniform4iv(r1, r2, r3)
            return
    }

    public void glUniform4iv(int r1, int r2, int[] r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glUniform4iv(r1, r2, r3, r4)
            return
    }

    public void glUniformMatrix2fv(int r1, int r2, boolean r3, java.nio.FloatBuffer r4) {
            r0 = this;
            android.opengl.GLES20.glUniformMatrix2fv(r1, r2, r3, r4)
            return
    }

    public void glUniformMatrix2fv(int r1, int r2, boolean r3, float[] r4, int r5) {
            r0 = this;
            android.opengl.GLES20.glUniformMatrix2fv(r1, r2, r3, r4, r5)
            return
    }

    public void glUniformMatrix3fv(int r1, int r2, boolean r3, java.nio.FloatBuffer r4) {
            r0 = this;
            android.opengl.GLES20.glUniformMatrix3fv(r1, r2, r3, r4)
            return
    }

    public void glUniformMatrix3fv(int r1, int r2, boolean r3, float[] r4, int r5) {
            r0 = this;
            android.opengl.GLES20.glUniformMatrix3fv(r1, r2, r3, r4, r5)
            return
    }

    public void glUniformMatrix4fv(int r1, int r2, boolean r3, java.nio.FloatBuffer r4) {
            r0 = this;
            android.opengl.GLES20.glUniformMatrix4fv(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glUniformMatrix4fv(int r1, int r2, boolean r3, float[] r4, int r5) {
            r0 = this;
            android.opengl.GLES20.glUniformMatrix4fv(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glUseProgram(int r1) {
            r0 = this;
            android.opengl.GLES20.glUseProgram(r1)
            return
    }

    public void glValidateProgram(int r1) {
            r0 = this;
            android.opengl.GLES20.glValidateProgram(r1)
            return
    }

    public void glVertexAttrib1f(int r1, float r2) {
            r0 = this;
            android.opengl.GLES20.glVertexAttrib1f(r1, r2)
            return
    }

    public void glVertexAttrib1fv(int r1, java.nio.FloatBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glVertexAttrib1fv(r1, r2)
            return
    }

    public void glVertexAttrib2f(int r1, float r2, float r3) {
            r0 = this;
            android.opengl.GLES20.glVertexAttrib2f(r1, r2, r3)
            return
    }

    public void glVertexAttrib2fv(int r1, java.nio.FloatBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glVertexAttrib2fv(r1, r2)
            return
    }

    public void glVertexAttrib3f(int r1, float r2, float r3, float r4) {
            r0 = this;
            android.opengl.GLES20.glVertexAttrib3f(r1, r2, r3, r4)
            return
    }

    public void glVertexAttrib3fv(int r1, java.nio.FloatBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glVertexAttrib3fv(r1, r2)
            return
    }

    public void glVertexAttrib4f(int r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            android.opengl.GLES20.glVertexAttrib4f(r1, r2, r3, r4, r5)
            return
    }

    public void glVertexAttrib4fv(int r1, java.nio.FloatBuffer r2) {
            r0 = this;
            android.opengl.GLES20.glVertexAttrib4fv(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glVertexAttribPointer(int r1, int r2, int r3, boolean r4, int r5, int r6) {
            r0 = this;
            android.opengl.GLES20.glVertexAttribPointer(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glVertexAttribPointer(int r1, int r2, int r3, boolean r4, int r5, java.nio.Buffer r6) {
            r0 = this;
            android.opengl.GLES20.glVertexAttribPointer(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL20
    public void glViewport(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.opengl.GLES20.glViewport(r1, r2, r3, r4)
            return
    }
}
