package com.badlogic.gdx.backends.android.surfaceview;

/* loaded from: classes.dex */
public class GLSurfaceView20 extends android.opengl.GLSurfaceView {
    private static final boolean DEBUG = false;
    static java.lang.String TAG = "GL2JNIView";
    static int targetGLESVersion;
    public com.badlogic.gdx.Input.OnscreenKeyboardType onscreenKeyboardType;
    final com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy resolutionStrategy;


    private static class ConfigChooser implements android.opengl.GLSurfaceView.EGLConfigChooser {
        private static int EGL_OPENGL_ES2_BIT = 4;
        private static int[] s_configAttribs2;
        protected int mAlphaSize;
        protected int mBlueSize;
        protected int mDepthSize;
        protected int mGreenSize;
        protected int mRedSize;
        protected int mStencilSize;
        private int[] mValue;

        static {
                r0 = 9
                int[] r0 = new int[r0]
                r1 = 0
                r2 = 12324(0x3024, float:1.727E-41)
                r0[r1] = r2
                r1 = 1
                r2 = 4
                r0[r1] = r2
                r1 = 2
                r3 = 12323(0x3023, float:1.7268E-41)
                r0[r1] = r3
                r1 = 3
                r0[r1] = r2
                r1 = 12322(0x3022, float:1.7267E-41)
                r0[r2] = r1
                r1 = 5
                r0[r1] = r2
                r1 = 6
                r3 = 12352(0x3040, float:1.7309E-41)
                r0[r1] = r3
                r1 = 7
                r0[r1] = r2
                r1 = 8
                r2 = 12344(0x3038, float:1.7298E-41)
                r0[r1] = r2
                com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.ConfigChooser.s_configAttribs2 = r0
                return
        }

        public ConfigChooser(int r2, int r3, int r4, int r5, int r6, int r7) {
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

        private void printConfig(javax.microedition.khronos.egl.EGL10 r36, javax.microedition.khronos.egl.EGLDisplay r37, javax.microedition.khronos.egl.EGLConfig r38) {
                r35 = this;
                r0 = 33
                int[] r1 = new int[r0]
                r1 = {x008a: FILL_ARRAY_DATA , data: [12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354} // fill-array
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
                java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34}
                r3 = 1
                int[] r4 = new int[r3]
                r5 = 0
                r6 = 0
            L52:
                if (r6 >= r0) goto L89
                r7 = r1[r6]
                r8 = r2[r6]
                r9 = r36
                r10 = r37
                r11 = r38
                boolean r7 = r9.eglGetConfigAttrib(r10, r11, r7, r4)
                if (r7 == 0) goto L7d
                java.lang.String r7 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.TAG
                r12 = 2
                java.lang.Object[] r12 = new java.lang.Object[r12]
                r12[r5] = r8
                r8 = r4[r5]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r12[r3] = r8
                java.lang.String r8 = "  %s: %d\n"
                java.lang.String r8 = java.lang.String.format(r8, r12)
                android.util.Log.w(r7, r8)
                goto L86
            L7d:
                int r7 = r36.eglGetError()
                r8 = 12288(0x3000, float:1.7219E-41)
                if (r7 == r8) goto L86
                goto L7d
            L86:
                int r6 = r6 + 1
                goto L52
            L89:
                return
        }

        private void printConfigs(javax.microedition.khronos.egl.EGL10 r8, javax.microedition.khronos.egl.EGLDisplay r9, javax.microedition.khronos.egl.EGLConfig[] r10) {
                r7 = this;
                int r0 = r10.length
                java.lang.String r1 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.TAG
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                r5 = 0
                r3[r5] = r4
                java.lang.String r4 = "%d configurations"
                java.lang.String r3 = java.lang.String.format(r4, r3)
                android.util.Log.w(r1, r3)
                r1 = 0
            L17:
                if (r1 >= r0) goto L34
                java.lang.String r3 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.TAG
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
                r4[r5] = r6
                java.lang.String r6 = "Configuration %d:\n"
                java.lang.String r4 = java.lang.String.format(r6, r4)
                android.util.Log.w(r3, r4)
                r3 = r10[r1]
                r7.printConfig(r8, r9, r3)
                int r1 = r1 + 1
                goto L17
            L34:
                return
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 r9, javax.microedition.khronos.egl.EGLDisplay r10) {
                r8 = this;
                r0 = 1
                int[] r0 = new int[r0]
                int[] r3 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.ConfigChooser.s_configAttribs2
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
                int[] r3 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.ConfigChooser.s_configAttribs2
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

        public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 r13, javax.microedition.khronos.egl.EGLDisplay r14, javax.microedition.khronos.egl.EGLConfig[] r15) {
                r12 = this;
                int r0 = r15.length
                r1 = 0
            L2:
                if (r1 >= r0) goto L51
                r8 = r15[r1]
                r6 = 12325(0x3025, float:1.7271E-41)
                r7 = 0
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r8
                int r9 = r2.findConfigAttrib(r3, r4, r5, r6, r7)
                r6 = 12326(0x3026, float:1.7272E-41)
                int r2 = r2.findConfigAttrib(r3, r4, r5, r6, r7)
                int r3 = r12.mDepthSize
                if (r9 < r3) goto L4e
                int r3 = r12.mStencilSize
                if (r2 >= r3) goto L20
                goto L4e
            L20:
                r6 = 12324(0x3024, float:1.727E-41)
                r7 = 0
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r8
                int r9 = r2.findConfigAttrib(r3, r4, r5, r6, r7)
                r6 = 12323(0x3023, float:1.7268E-41)
                int r10 = r2.findConfigAttrib(r3, r4, r5, r6, r7)
                r6 = 12322(0x3022, float:1.7267E-41)
                int r11 = r2.findConfigAttrib(r3, r4, r5, r6, r7)
                r6 = 12321(0x3021, float:1.7265E-41)
                int r2 = r2.findConfigAttrib(r3, r4, r5, r6, r7)
                int r3 = r12.mRedSize
                if (r9 != r3) goto L4e
                int r3 = r12.mGreenSize
                if (r10 != r3) goto L4e
                int r3 = r12.mBlueSize
                if (r11 != r3) goto L4e
                int r3 = r12.mAlphaSize
                if (r2 != r3) goto L4e
                return r8
            L4e:
                int r1 = r1 + 1
                goto L2
            L51:
                r13 = 0
                return r13
        }
    }

    static class ContextFactory implements android.opengl.GLSurfaceView.EGLContextFactory {
        private static int EGL_CONTEXT_CLIENT_VERSION = 12440;

        static {
                return
        }

        ContextFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 r5, javax.microedition.khronos.egl.EGLDisplay r6, javax.microedition.khronos.egl.EGLConfig r7) {
                r4 = this;
                java.lang.String r0 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.TAG
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "creating OpenGL ES "
                r1.append(r2)
                int r2 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.targetGLESVersion
                r1.append(r2)
                java.lang.String r2 = ".0 context"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.w(r0, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Before eglCreateContext "
                r0.append(r1)
                int r1 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.targetGLESVersion
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.checkEglError(r0, r5)
                r0 = 3
                int[] r0 = new int[r0]
                int r1 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.ContextFactory.EGL_CONTEXT_CLIENT_VERSION
                r2 = 0
                r0[r2] = r1
                int r1 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.targetGLESVersion
                r2 = 1
                r0[r2] = r1
                r1 = 12344(0x3038, float:1.7298E-41)
                r2 = 2
                r0[r2] = r1
                javax.microedition.khronos.egl.EGLContext r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
                javax.microedition.khronos.egl.EGLContext r0 = r5.eglCreateContext(r6, r7, r1, r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "After eglCreateContext "
                r1.append(r3)
                int r3 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.targetGLESVersion
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                boolean r1 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.checkEglError(r1, r5)
                if (r1 == 0) goto L66
                if (r0 != 0) goto L78
            L66:
                int r1 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.targetGLESVersion
                if (r1 <= r2) goto L78
                java.lang.String r0 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.TAG
                java.lang.String r1 = "Falling back to GLES 2"
                android.util.Log.w(r0, r1)
                com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.targetGLESVersion = r2
                javax.microedition.khronos.egl.EGLContext r5 = r4.createContext(r5, r6, r7)
                return r5
            L78:
                java.lang.String r5 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.TAG
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Returning a GLES "
                r6.append(r7)
                int r7 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.targetGLESVersion
                r6.append(r7)
                java.lang.String r7 = " context"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                android.util.Log.w(r5, r6)
                return r0
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(javax.microedition.khronos.egl.EGL10 r1, javax.microedition.khronos.egl.EGLDisplay r2, javax.microedition.khronos.egl.EGLContext r3) {
                r0 = this;
                r1.eglDestroyContext(r2, r3)
                return
        }
    }

    static {
            return
    }

    public GLSurfaceView20(android.content.Context r2, com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy r3) {
            r1 = this;
            r0 = 2
            r1.<init>(r2, r3, r0)
            return
    }

    public GLSurfaceView20(android.content.Context r1, com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            com.badlogic.gdx.Input$OnscreenKeyboardType r1 = com.badlogic.gdx.Input.OnscreenKeyboardType.Default
            r0.onscreenKeyboardType = r1
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.targetGLESVersion = r3
            r0.resolutionStrategy = r2
            r1 = 0
            r2 = 16
            r0.init(r1, r2, r1)
            return
    }

    public GLSurfaceView20(android.content.Context r1, boolean r2, int r3, int r4, com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy r5) {
            r0 = this;
            r0.<init>(r1)
            com.badlogic.gdx.Input$OnscreenKeyboardType r1 = com.badlogic.gdx.Input.OnscreenKeyboardType.Default
            r0.onscreenKeyboardType = r1
            r0.resolutionStrategy = r5
            r0.init(r2, r3, r4)
            return
    }

    static boolean checkEglError(java.lang.String r5, javax.microedition.khronos.egl.EGL10 r6) {
            r0 = 0
            r1 = 1
            r2 = 1
        L3:
            int r3 = r6.eglGetError()
            r4 = 12288(0x3000, float:1.7219E-41)
            if (r3 == r4) goto L23
            java.lang.String r2 = com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.TAG
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r1] = r3
            java.lang.String r3 = "%s: EGL error: 0x%x"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            android.util.Log.e(r2, r3)
            r2 = 0
            goto L3
        L23:
            return r2
    }

    private void init(boolean r15, int r16, int r17) {
            r14 = this;
            r0 = r14
            if (r15 == 0) goto Lb
            android.view.SurfaceHolder r1 = r14.getHolder()
            r2 = -3
            r1.setFormat(r2)
        Lb:
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20$ContextFactory r1 = new com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20$ContextFactory
            r1.<init>()
            r14.setEGLContextFactory(r1)
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20$ConfigChooser r1 = new com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20$ConfigChooser
            if (r15 == 0) goto L28
            r3 = 8
            r4 = 8
            r5 = 8
            r6 = 8
            r2 = r1
            r7 = r16
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L37
        L28:
            r8 = 8
            r9 = 8
            r10 = 8
            r11 = 0
            r7 = r1
            r12 = r16
            r13 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L37:
            r14.setEGLConfigChooser(r1)
            return
    }

    @Override // android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            if (r3 == 0) goto L11
            int r0 = r3.imeOptions
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 | r1
            r3.imeOptions = r0
            com.badlogic.gdx.Input$OnscreenKeyboardType r0 = r2.onscreenKeyboardType
            int r0 = com.badlogic.gdx.backends.android.DefaultAndroidInput.getAndroidInputType(r0)
            r3.inputType = r0
        L11:
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20$1 r3 = new com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20$1
            r0 = 0
            r3.<init>(r2, r2, r0)
            return r3
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy r0 = r1.resolutionStrategy
            com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy$MeasuredDimension r2 = r0.calcMeasures(r2, r3)
            int r3 = r2.width
            int r2 = r2.height
            r1.setMeasuredDimension(r3, r2)
            return
    }
}
