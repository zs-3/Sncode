package com.badlogic.gdx.backends.android.surfaceview;

/* loaded from: classes.dex */
public class GdxEglConfigChooser implements android.opengl.GLSurfaceView.EGLConfigChooser {
    public static final int EGL_COVERAGE_BUFFERS_NV = 12512;
    public static final int EGL_COVERAGE_SAMPLES_NV = 12513;
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private static final java.lang.String TAG = "GdxEglConfigChooser";
    protected int mAlphaSize;
    protected int mBlueSize;
    protected final int[] mConfigAttribs;
    protected int mDepthSize;
    protected int mGreenSize;
    protected int mNumSamples;
    protected int mRedSize;
    protected int mStencilSize;
    private int[] mValue;

    public GdxEglConfigChooser(int r2, int r3, int r4, int r5, int r6, int r7, int r8) {
            r1 = this;
            r1.<init>()
            r0 = 1
            int[] r0 = new int[r0]
            r1.mValue = r0
            r1.mRedSize = r2
            r1.mGreenSize = r3
            r1.mBlueSize = r4
            r1.mAlphaSize = r5
            r1.mDepthSize = r6
            r1.mStencilSize = r7
            r1.mNumSamples = r8
            r2 = 9
            int[] r2 = new int[r2]
            r2 = {x0020: FILL_ARRAY_DATA , data: [12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344} // fill-array
            r1.mConfigAttribs = r2
            return
    }

    private int findConfigAttrib(javax.microedition.khronos.egl.EGL10 r2, javax.microedition.khronos.egl.EGLDisplay r3, javax.microedition.khronos.egl.EGLConfig r4, int r5, int r6) {
            r1 = this;
            int[] r0 = r1.mValue
            boolean r2 = r2.eglGetConfigAttrib(r3, r4, r5, r0)
            if (r2 == 0) goto Le
            int[] r2 = r1.mValue
            r3 = 0
            r2 = r2[r3]
            return r2
        Le:
            return r6
    }

    private void printConfig(javax.microedition.khronos.egl.EGL10 r38, javax.microedition.khronos.egl.EGLDisplay r39, javax.microedition.khronos.egl.EGLConfig r40) {
            r37 = this;
            r0 = 35
            int[] r1 = new int[r0]
            r1 = {x0088: FILL_ARRAY_DATA , data: [12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354, 12512, 12513} // fill-array
            java.lang.String r2 = "EGL_BUFFER_SIZE"
            java.lang.String r3 = "EGL_ALPHA_SIZE"
            java.lang.String r4 = "EGL_BLUE_SIZE"
            java.lang.String r5 = "EGL_GREEN_SIZE"
            java.lang.String r6 = "EGL_RED_SIZE"
            java.lang.String r7 = "EGL_DEPTH_SIZE"
            java.lang.String r8 = "EGL_STENCIL_SIZE"
            java.lang.String r9 = "EGL_CONFIG_CAVEAT"
            java.lang.String r10 = "EGL_CONFIG_ID"
            java.lang.String r11 = "EGL_LEVEL"
            java.lang.String r12 = "EGL_MAX_PBUFFER_HEIGHT"
            java.lang.String r13 = "EGL_MAX_PBUFFER_PIXELS"
            java.lang.String r14 = "EGL_MAX_PBUFFER_WIDTH"
            java.lang.String r15 = "EGL_NATIVE_RENDERABLE"
            java.lang.String r16 = "EGL_NATIVE_VISUAL_ID"
            java.lang.String r17 = "EGL_NATIVE_VISUAL_TYPE"
            java.lang.String r18 = "EGL_PRESERVED_RESOURCES"
            java.lang.String r19 = "EGL_SAMPLES"
            java.lang.String r20 = "EGL_SAMPLE_BUFFERS"
            java.lang.String r21 = "EGL_SURFACE_TYPE"
            java.lang.String r22 = "EGL_TRANSPARENT_TYPE"
            java.lang.String r23 = "EGL_TRANSPARENT_RED_VALUE"
            java.lang.String r24 = "EGL_TRANSPARENT_GREEN_VALUE"
            java.lang.String r25 = "EGL_TRANSPARENT_BLUE_VALUE"
            java.lang.String r26 = "EGL_BIND_TO_TEXTURE_RGB"
            java.lang.String r27 = "EGL_BIND_TO_TEXTURE_RGBA"
            java.lang.String r28 = "EGL_MIN_SWAP_INTERVAL"
            java.lang.String r29 = "EGL_MAX_SWAP_INTERVAL"
            java.lang.String r30 = "EGL_LUMINANCE_SIZE"
            java.lang.String r31 = "EGL_ALPHA_MASK_SIZE"
            java.lang.String r32 = "EGL_COLOR_BUFFER_TYPE"
            java.lang.String r33 = "EGL_RENDERABLE_TYPE"
            java.lang.String r34 = "EGL_CONFORMANT"
            java.lang.String r35 = "EGL_COVERAGE_BUFFERS_NV"
            java.lang.String r36 = "EGL_COVERAGE_SAMPLES_NV"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36}
            r3 = 1
            int[] r4 = new int[r3]
            r5 = 0
            r6 = 0
        L56:
            if (r6 >= r0) goto L87
            r7 = r1[r6]
            r8 = r2[r6]
            r9 = r38
            r10 = r39
            r11 = r40
            boolean r7 = r9.eglGetConfigAttrib(r10, r11, r7, r4)
            if (r7 == 0) goto L81
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r5] = r8
            r8 = r4[r5]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r3] = r8
            java.lang.String r8 = "  %s: %d\n"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            java.lang.String r8 = "GdxEglConfigChooser"
            android.util.Log.w(r8, r7)
            goto L84
        L81:
            r38.eglGetError()
        L84:
            int r6 = r6 + 1
            goto L56
        L87:
            return
    }

    private void printConfigs(javax.microedition.khronos.egl.EGL10 r8, javax.microedition.khronos.egl.EGLDisplay r9, javax.microedition.khronos.egl.EGLConfig[] r10) {
            r7 = this;
            int r0 = r10.length
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "%d configurations"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "GdxEglConfigChooser"
            android.util.Log.w(r3, r2)
            r2 = 0
        L17:
            if (r2 >= r0) goto L32
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r5[r4] = r6
            java.lang.String r6 = "Configuration %d:\n"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            android.util.Log.w(r3, r5)
            r5 = r10[r2]
            r7.printConfig(r8, r9, r5)
            int r2 = r2 + 1
            goto L17
        L32:
            return
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 r9, javax.microedition.khronos.egl.EGLDisplay r10) {
            r8 = this;
            r0 = 1
            int[] r0 = new int[r0]
            int[] r3 = r8.mConfigAttribs
            r4 = 0
            r5 = 0
            r1 = r9
            r2 = r10
            r6 = r0
            r1.eglChooseConfig(r2, r3, r4, r5, r6)
            r1 = 0
            r5 = r0[r1]
            if (r5 <= 0) goto L22
            javax.microedition.khronos.egl.EGLConfig[] r7 = new javax.microedition.khronos.egl.EGLConfig[r5]
            int[] r3 = r8.mConfigAttribs
            r1 = r9
            r2 = r10
            r4 = r7
            r6 = r0
            r1.eglChooseConfig(r2, r3, r4, r5, r6)
            javax.microedition.khronos.egl.EGLConfig r9 = r8.chooseConfig(r9, r10, r7)
            return r9
        L22:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "No configs match configSpec"
            r9.<init>(r10)
            throw r9
    }

    public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 r20, javax.microedition.khronos.egl.EGLDisplay r21, javax.microedition.khronos.egl.EGLConfig[] r22) {
            r19 = this;
            r6 = r19
            r7 = r22
            int r8 = r7.length
            r0 = 0
            r1 = 0
            r9 = r0
            r10 = r9
            r11 = r10
            r12 = 0
        Lb:
            if (r12 >= r8) goto Lf4
            r13 = r7[r12]
            r4 = 12325(0x3025, float:1.7271E-41)
            r5 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r13
            int r14 = r0.findConfigAttrib(r1, r2, r3, r4, r5)
            r4 = 12326(0x3026, float:1.7272E-41)
            int r0 = r0.findConfigAttrib(r1, r2, r3, r4, r5)
            int r1 = r6.mDepthSize
            if (r14 < r1) goto Lea
            int r1 = r6.mStencilSize
            if (r0 >= r1) goto L2d
            goto Lea
        L2d:
            r4 = 12324(0x3024, float:1.727E-41)
            r5 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r13
            int r14 = r0.findConfigAttrib(r1, r2, r3, r4, r5)
            r4 = 12323(0x3023, float:1.7268E-41)
            int r15 = r0.findConfigAttrib(r1, r2, r3, r4, r5)
            r4 = 12322(0x3022, float:1.7267E-41)
            int r5 = r0.findConfigAttrib(r1, r2, r3, r4, r5)
            r4 = 12321(0x3021, float:1.7265E-41)
            r16 = 0
            r7 = r5
            r5 = r16
            int r5 = r0.findConfigAttrib(r1, r2, r3, r4, r5)
            if (r9 != 0) goto L5f
            r0 = 5
            if (r14 != r0) goto L5f
            r1 = 6
            if (r15 != r1) goto L5f
            if (r7 != r0) goto L5f
            if (r5 != 0) goto L5f
            r9 = r13
        L5f:
            if (r10 != 0) goto L78
            int r0 = r6.mRedSize
            if (r14 != r0) goto L78
            int r0 = r6.mGreenSize
            if (r15 != r0) goto L78
            int r0 = r6.mBlueSize
            if (r7 != r0) goto L78
            int r0 = r6.mAlphaSize
            if (r5 != r0) goto L78
            int r0 = r6.mNumSamples
            r10 = r13
            if (r0 != 0) goto L78
            goto Lf4
        L78:
            r4 = 12338(0x3032, float:1.7289E-41)
            r16 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r13
            r17 = r8
            r8 = r5
            r5 = r16
            int r5 = r0.findConfigAttrib(r1, r2, r3, r4, r5)
            r4 = 12337(0x3031, float:1.7288E-41)
            r18 = r9
            r9 = r5
            r5 = r16
            int r0 = r0.findConfigAttrib(r1, r2, r3, r4, r5)
            r5 = 1
            if (r11 != 0) goto Lb3
            if (r9 != r5) goto Lb3
            int r1 = r6.mNumSamples
            if (r0 < r1) goto Lb3
            int r0 = r6.mRedSize
            if (r14 != r0) goto Lb3
            int r0 = r6.mGreenSize
            if (r15 != r0) goto Lb3
            int r0 = r6.mBlueSize
            if (r7 != r0) goto Lb3
            int r0 = r6.mAlphaSize
            if (r8 != r0) goto Lb3
            r16 = r10
            goto Le4
        Lb3:
            r4 = 12512(0x30e0, float:1.7533E-41)
            r9 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r13
            r16 = r10
            r10 = 1
            r5 = r9
            int r9 = r0.findConfigAttrib(r1, r2, r3, r4, r5)
            r4 = 12513(0x30e1, float:1.7534E-41)
            r5 = 0
            int r0 = r0.findConfigAttrib(r1, r2, r3, r4, r5)
            if (r11 != 0) goto Le5
            if (r9 != r10) goto Le5
            int r1 = r6.mNumSamples
            if (r0 < r1) goto Le5
            int r0 = r6.mRedSize
            if (r14 != r0) goto Le5
            int r0 = r6.mGreenSize
            if (r15 != r0) goto Le5
            int r0 = r6.mBlueSize
            if (r7 != r0) goto Le5
            int r0 = r6.mAlphaSize
            if (r8 != r0) goto Le5
        Le4:
            r11 = r13
        Le5:
            r10 = r16
            r9 = r18
            goto Lec
        Lea:
            r17 = r8
        Lec:
            int r12 = r12 + 1
            r7 = r22
            r8 = r17
            goto Lb
        Lf4:
            if (r11 == 0) goto Lf7
            return r11
        Lf7:
            if (r10 == 0) goto Lfa
            return r10
        Lfa:
            return r9
    }
}
