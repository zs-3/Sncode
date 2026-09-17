package com.badlogic.gdx.backends.android;

@android.annotation.TargetApi(18)
/* loaded from: classes.dex */
public class AndroidGL30 extends com.badlogic.gdx.backends.android.AndroidGL20 implements com.badlogic.gdx.graphics.GL30 {
    public AndroidGL30() {
            r0 = this;
            r0.<init>()
            return
    }

    public void glBeginQuery(int r1, int r2) {
            r0 = this;
            android.opengl.GLES30.glBeginQuery(r1, r2)
            return
    }

    public void glBeginTransformFeedback(int r1) {
            r0 = this;
            android.opengl.GLES30.glBeginTransformFeedback(r1)
            return
    }

    public void glBindBufferBase(int r1, int r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glBindBufferBase(r1, r2, r3)
            return
    }

    public void glBindBufferRange(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.opengl.GLES30.glBindBufferRange(r1, r2, r3, r4, r5)
            return
    }

    public void glBindSampler(int r1, int r2) {
            r0 = this;
            android.opengl.GLES30.glBindSampler(r1, r2)
            return
    }

    public void glBindTransformFeedback(int r1, int r2) {
            r0 = this;
            android.opengl.GLES30.glBindTransformFeedback(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL30
    public void glBindVertexArray(int r1) {
            r0 = this;
            android.opengl.GLES30.glBindVertexArray(r1)
            return
    }

    public void glBlitFramebuffer(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0 = this;
            android.opengl.GLES30.glBlitFramebuffer(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public void glClearBufferfi(int r1, int r2, float r3, int r4) {
            r0 = this;
            android.opengl.GLES30.glClearBufferfi(r1, r2, r3, r4)
            return
    }

    public void glClearBufferfv(int r1, int r2, java.nio.FloatBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glClearBufferfv(r1, r2, r3)
            return
    }

    public void glClearBufferiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glClearBufferiv(r1, r2, r3)
            return
    }

    public void glClearBufferuiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glClearBufferuiv(r1, r2, r3)
            return
    }

    public void glCopyBufferSubData(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.opengl.GLES30.glCopyBufferSubData(r1, r2, r3, r4, r5)
            return
    }

    public void glCopyTexSubImage3D(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            android.opengl.GLES30.glCopyTexSubImage3D(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public void glDeleteQueries(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES30.glDeleteQueries(r1, r2)
            return
    }

    public void glDeleteQueries(int r1, int[] r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glDeleteQueries(r1, r2, r3)
            return
    }

    public void glDeleteSamplers(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES30.glDeleteSamplers(r1, r2)
            return
    }

    public void glDeleteSamplers(int r1, int[] r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glDeleteSamplers(r1, r2, r3)
            return
    }

    public void glDeleteTransformFeedbacks(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES30.glDeleteTransformFeedbacks(r1, r2)
            return
    }

    public void glDeleteTransformFeedbacks(int r1, int[] r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glDeleteTransformFeedbacks(r1, r2, r3)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL30
    public void glDeleteVertexArrays(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES30.glDeleteVertexArrays(r1, r2)
            return
    }

    public void glDeleteVertexArrays(int r1, int[] r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glDeleteVertexArrays(r1, r2, r3)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL30
    public void glDrawArraysInstanced(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.opengl.GLES30.glDrawArraysInstanced(r1, r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL30
    public void glDrawBuffers(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES30.glDrawBuffers(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL30
    public void glDrawElementsInstanced(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.opengl.GLES30.glDrawElementsInstanced(r1, r2, r3, r4, r5)
            return
    }

    public void glDrawRangeElements(int r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            android.opengl.GLES30.glDrawRangeElements(r1, r2, r3, r4, r5, r6)
            return
    }

    public void glDrawRangeElements(int r1, int r2, int r3, int r4, int r5, java.nio.Buffer r6) {
            r0 = this;
            android.opengl.GLES30.glDrawRangeElements(r1, r2, r3, r4, r5, r6)
            return
    }

    public void glEndQuery(int r1) {
            r0 = this;
            android.opengl.GLES30.glEndQuery(r1)
            return
    }

    public void glEndTransformFeedback() {
            r0 = this;
            android.opengl.GLES30.glEndTransformFeedback()
            return
    }

    public void glFlushMappedBufferRange(int r1, int r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glFlushMappedBufferRange(r1, r2, r3)
            return
    }

    public void glFramebufferTextureLayer(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.opengl.GLES30.glFramebufferTextureLayer(r1, r2, r3, r4, r5)
            return
    }

    public void glGenQueries(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES30.glGenQueries(r1, r2)
            return
    }

    public void glGenQueries(int r1, int[] r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glGenQueries(r1, r2, r3)
            return
    }

    public void glGenSamplers(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES30.glGenSamplers(r1, r2)
            return
    }

    public void glGenSamplers(int r1, int[] r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glGenSamplers(r1, r2, r3)
            return
    }

    public void glGenTransformFeedbacks(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES30.glGenTransformFeedbacks(r1, r2)
            return
    }

    public void glGenTransformFeedbacks(int r1, int[] r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glGenTransformFeedbacks(r1, r2, r3)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL30
    public void glGenVertexArrays(int r1, java.nio.IntBuffer r2) {
            r0 = this;
            android.opengl.GLES30.glGenVertexArrays(r1, r2)
            return
    }

    public void glGenVertexArrays(int r1, int[] r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glGenVertexArrays(r1, r2, r3)
            return
    }

    public java.lang.String glGetActiveUniformBlockName(int r1, int r2) {
            r0 = this;
            java.lang.String r1 = android.opengl.GLES30.glGetActiveUniformBlockName(r1, r2)
            return r1
    }

    public void glGetActiveUniformBlockName(int r1, int r2, java.nio.Buffer r3, java.nio.Buffer r4) {
            r0 = this;
            android.opengl.GLES30.glGetActiveUniformBlockName(r1, r2, r3, r4)
            return
    }

    public void glGetActiveUniformBlockiv(int r1, int r2, int r3, java.nio.IntBuffer r4) {
            r0 = this;
            android.opengl.GLES30.glGetActiveUniformBlockiv(r1, r2, r3, r4)
            return
    }

    public void glGetActiveUniformsiv(int r1, int r2, java.nio.IntBuffer r3, int r4, java.nio.IntBuffer r5) {
            r0 = this;
            android.opengl.GLES30.glGetActiveUniformsiv(r1, r2, r3, r4, r5)
            return
    }

    public void glGetBufferParameteri64v(int r1, int r2, java.nio.LongBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glGetBufferParameteri64v(r1, r2, r3)
            return
    }

    public java.nio.Buffer glGetBufferPointerv(int r1, int r2) {
            r0 = this;
            java.nio.Buffer r1 = android.opengl.GLES30.glGetBufferPointerv(r1, r2)
            return r1
    }

    public int glGetFragDataLocation(int r1, java.lang.String r2) {
            r0 = this;
            int r1 = android.opengl.GLES30.glGetFragDataLocation(r1, r2)
            return r1
    }

    public void glGetInteger64v(int r1, java.nio.LongBuffer r2) {
            r0 = this;
            android.opengl.GLES30.glGetInteger64v(r1, r2)
            return
    }

    public void glGetQueryObjectuiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glGetQueryObjectuiv(r1, r2, r3)
            return
    }

    public void glGetQueryiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glGetQueryiv(r1, r2, r3)
            return
    }

    public void glGetSamplerParameterfv(int r1, int r2, java.nio.FloatBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glGetSamplerParameterfv(r1, r2, r3)
            return
    }

    public void glGetSamplerParameteriv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glGetSamplerParameteriv(r1, r2, r3)
            return
    }

    public java.lang.String glGetStringi(int r1, int r2) {
            r0 = this;
            java.lang.String r1 = android.opengl.GLES30.glGetStringi(r1, r2)
            return r1
    }

    public int glGetUniformBlockIndex(int r1, java.lang.String r2) {
            r0 = this;
            int r1 = android.opengl.GLES30.glGetUniformBlockIndex(r1, r2)
            return r1
    }

    public void glGetUniformIndices(int r1, java.lang.String[] r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glGetUniformIndices(r1, r2, r3)
            return
    }

    public void glGetUniformuiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glGetUniformuiv(r1, r2, r3)
            return
    }

    public void glGetVertexAttribIiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glGetVertexAttribIiv(r1, r2, r3)
            return
    }

    public void glGetVertexAttribIuiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glGetVertexAttribIuiv(r1, r2, r3)
            return
    }

    public void glInvalidateFramebuffer(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glInvalidateFramebuffer(r1, r2, r3)
            return
    }

    public void glInvalidateSubFramebuffer(int r1, int r2, java.nio.IntBuffer r3, int r4, int r5, int r6, int r7) {
            r0 = this;
            android.opengl.GLES30.glInvalidateSubFramebuffer(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public boolean glIsQuery(int r1) {
            r0 = this;
            boolean r1 = android.opengl.GLES30.glIsQuery(r1)
            return r1
    }

    public boolean glIsSampler(int r1) {
            r0 = this;
            boolean r1 = android.opengl.GLES30.glIsSampler(r1)
            return r1
    }

    public boolean glIsTransformFeedback(int r1) {
            r0 = this;
            boolean r1 = android.opengl.GLES30.glIsTransformFeedback(r1)
            return r1
    }

    public boolean glIsVertexArray(int r1) {
            r0 = this;
            boolean r1 = android.opengl.GLES30.glIsVertexArray(r1)
            return r1
    }

    public java.nio.Buffer glMapBufferRange(int r1, int r2, int r3, int r4) {
            r0 = this;
            java.nio.Buffer r1 = android.opengl.GLES30.glMapBufferRange(r1, r2, r3, r4)
            return r1
    }

    public void glPauseTransformFeedback() {
            r0 = this;
            android.opengl.GLES30.glPauseTransformFeedback()
            return
    }

    public void glProgramParameteri(int r1, int r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glProgramParameteri(r1, r2, r3)
            return
    }

    public void glReadBuffer(int r1) {
            r0 = this;
            android.opengl.GLES30.glReadBuffer(r1)
            return
    }

    public void glRenderbufferStorageMultisample(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.opengl.GLES30.glRenderbufferStorageMultisample(r1, r2, r3, r4, r5)
            return
    }

    public void glResumeTransformFeedback() {
            r0 = this;
            android.opengl.GLES30.glResumeTransformFeedback()
            return
    }

    public void glSamplerParameterf(int r1, int r2, float r3) {
            r0 = this;
            android.opengl.GLES30.glSamplerParameterf(r1, r2, r3)
            return
    }

    public void glSamplerParameterfv(int r1, int r2, java.nio.FloatBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glSamplerParameterfv(r1, r2, r3)
            return
    }

    public void glSamplerParameteri(int r1, int r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glSamplerParameteri(r1, r2, r3)
            return
    }

    public void glSamplerParameteriv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glSamplerParameteriv(r1, r2, r3)
            return
    }

    public void glTexImage2D(int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18) {
            r9 = this;
            if (r18 != 0) goto L11
            r8 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            android.opengl.GLES30.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L11:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "non zero offset is not supported"
            r0.<init>(r1)
            throw r0
    }

    public void glTexImage3D(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0 = this;
            android.opengl.GLES30.glTexImage3D(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.badlogic.gdx.graphics.GL30
    public void glTexImage3D(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, java.nio.Buffer r20) {
            r10 = this;
            if (r20 != 0) goto L14
            r9 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            android.opengl.GLES30.glTexImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L17
        L14:
            android.opengl.GLES30.glTexImage3D(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L17:
            return
    }

    public void glTexSubImage2D(int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18) {
            r9 = this;
            if (r18 != 0) goto L11
            r8 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            android.opengl.GLES30.glTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L11:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "non zero offset is not supported"
            r0.<init>(r1)
            throw r0
    }

    public void glTexSubImage3D(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
            r0 = this;
            android.opengl.GLES30.glTexSubImage3D(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public void glTexSubImage3D(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, java.nio.Buffer r11) {
            r0 = this;
            android.opengl.GLES30.glTexSubImage3D(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public void glTransformFeedbackVaryings(int r1, java.lang.String[] r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glTransformFeedbackVaryings(r1, r2, r3)
            return
    }

    public void glUniform1uiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glUniform1uiv(r1, r2, r3)
            return
    }

    public void glUniform3uiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glUniform3uiv(r1, r2, r3)
            return
    }

    public void glUniform4uiv(int r1, int r2, java.nio.IntBuffer r3) {
            r0 = this;
            android.opengl.GLES30.glUniform4uiv(r1, r2, r3)
            return
    }

    public void glUniformBlockBinding(int r1, int r2, int r3) {
            r0 = this;
            android.opengl.GLES30.glUniformBlockBinding(r1, r2, r3)
            return
    }

    public void glUniformMatrix2x3fv(int r1, int r2, boolean r3, java.nio.FloatBuffer r4) {
            r0 = this;
            android.opengl.GLES30.glUniformMatrix2x3fv(r1, r2, r3, r4)
            return
    }

    public void glUniformMatrix2x4fv(int r1, int r2, boolean r3, java.nio.FloatBuffer r4) {
            r0 = this;
            android.opengl.GLES30.glUniformMatrix2x4fv(r1, r2, r3, r4)
            return
    }

    public void glUniformMatrix3x2fv(int r1, int r2, boolean r3, java.nio.FloatBuffer r4) {
            r0 = this;
            android.opengl.GLES30.glUniformMatrix3x2fv(r1, r2, r3, r4)
            return
    }

    public void glUniformMatrix3x4fv(int r1, int r2, boolean r3, java.nio.FloatBuffer r4) {
            r0 = this;
            android.opengl.GLES30.glUniformMatrix3x4fv(r1, r2, r3, r4)
            return
    }

    public void glUniformMatrix4x2fv(int r1, int r2, boolean r3, java.nio.FloatBuffer r4) {
            r0 = this;
            android.opengl.GLES30.glUniformMatrix4x2fv(r1, r2, r3, r4)
            return
    }

    public void glUniformMatrix4x3fv(int r1, int r2, boolean r3, java.nio.FloatBuffer r4) {
            r0 = this;
            android.opengl.GLES30.glUniformMatrix4x3fv(r1, r2, r3, r4)
            return
    }

    public boolean glUnmapBuffer(int r1) {
            r0 = this;
            boolean r1 = android.opengl.GLES30.glUnmapBuffer(r1)
            return r1
    }

    public void glVertexAttribDivisor(int r1, int r2) {
            r0 = this;
            android.opengl.GLES30.glVertexAttribDivisor(r1, r2)
            return
    }

    public void glVertexAttribI4i(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.opengl.GLES30.glVertexAttribI4i(r1, r2, r3, r4, r5)
            return
    }

    public void glVertexAttribI4ui(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.opengl.GLES30.glVertexAttribI4ui(r1, r2, r3, r4, r5)
            return
    }

    public void glVertexAttribIPointer(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.opengl.GLES30.glVertexAttribIPointer(r1, r2, r3, r4, r5)
            return
    }
}
