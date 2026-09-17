package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidGraphics extends com.badlogic.gdx.AbstractGraphics implements android.opengl.GLSurfaceView.Renderer {
    private static final java.lang.String LOG_TAG = "AndroidGraphics";
    static volatile boolean enforceContinuousRendering;
    com.badlogic.gdx.backends.android.AndroidApplicationBase app;
    private com.badlogic.gdx.Graphics.BufferFormat bufferFormat;
    protected final com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config;
    volatile boolean created;
    protected float deltaTime;
    private float density;
    volatile boolean destroy;
    javax.microedition.khronos.egl.EGLContext eglContext;
    java.lang.String extensions;
    protected int fps;
    protected long frameId;
    protected long frameStart;
    protected int frames;
    com.badlogic.gdx.graphics.GL20 gl20;
    com.badlogic.gdx.graphics.GL30 gl30;
    com.badlogic.gdx.graphics.glutils.GLVersion glVersion;
    int height;
    private boolean isContinuous;
    protected long lastFrameTime;
    volatile boolean pause;
    private float ppcX;
    private float ppcY;
    private float ppiX;
    private float ppiY;
    volatile boolean resume;
    volatile boolean running;
    int safeInsetBottom;
    int safeInsetLeft;
    int safeInsetRight;
    int safeInsetTop;
    java.lang.Object synch;
    int[] value;
    final com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 view;
    int width;


    private class AndroidDisplayMode extends com.badlogic.gdx.Graphics.DisplayMode {
        final /* synthetic */ com.badlogic.gdx.backends.android.AndroidGraphics this$0;

        protected AndroidDisplayMode(com.badlogic.gdx.backends.android.AndroidGraphics r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3, r4, r5)
                return
        }
    }

    private class AndroidMonitor extends com.badlogic.gdx.Graphics.Monitor {
        final /* synthetic */ com.badlogic.gdx.backends.android.AndroidGraphics this$0;

        public AndroidMonitor(com.badlogic.gdx.backends.android.AndroidGraphics r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3, r4)
                return
        }
    }

    static {
            return
    }

    public AndroidGraphics(com.badlogic.gdx.backends.android.AndroidApplicationBase r2, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r3, com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public AndroidGraphics(com.badlogic.gdx.backends.android.AndroidApplicationBase r11, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r12, com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy r13, boolean r14) {
            r10 = this;
            r10.<init>()
            long r0 = java.lang.System.nanoTime()
            r10.lastFrameTime = r0
            r0 = 0
            r10.deltaTime = r0
            long r1 = java.lang.System.nanoTime()
            r10.frameStart = r1
            r1 = -1
            r10.frameId = r1
            r1 = 0
            r10.frames = r1
            r10.created = r1
            r10.running = r1
            r10.pause = r1
            r10.resume = r1
            r10.destroy = r1
            r10.ppiX = r0
            r10.ppiY = r0
            r10.ppcX = r0
            r10.ppcY = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r10.density = r0
            com.badlogic.gdx.Graphics$BufferFormat r0 = new com.badlogic.gdx.Graphics$BufferFormat
            r2 = 8
            r3 = 8
            r4 = 8
            r5 = 0
            r6 = 16
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.bufferFormat = r0
            r0 = 1
            r10.isContinuous = r0
            int[] r1 = new int[r0]
            r10.value = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r10.synch = r1
            r10.config = r12
            r10.app = r11
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r11 = r10.createGLSurfaceView(r11, r13)
            r10.view = r11
            r10.preserveEGLContextOnPause()
            if (r14 == 0) goto L66
            r11.setFocusable(r0)
            r11.setFocusableInTouchMode(r0)
        L66:
            return
    }

    private int getAttrib(javax.microedition.khronos.egl.EGL10 r2, javax.microedition.khronos.egl.EGLDisplay r3, javax.microedition.khronos.egl.EGLConfig r4, int r5, int r6) {
            r1 = this;
            int[] r0 = r1.value
            boolean r2 = r2.eglGetConfigAttrib(r3, r4, r5, r0)
            if (r2 == 0) goto Le
            int[] r2 = r1.value
            r3 = 0
            r2 = r2[r3]
            return r2
        Le:
            return r6
    }

    protected boolean checkGL20() {
            r10 = this;
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r7 = r0.eglGetDisplay(r1)
            r1 = 2
            int[] r1 = new int[r1]
            r0.eglInitialize(r7, r1)
            r1 = 9
            int[] r3 = new int[r1]
            r3 = {x0034: FILL_ARRAY_DATA , data: [12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344} // fill-array
            r1 = 10
            javax.microedition.khronos.egl.EGLConfig[] r4 = new javax.microedition.khronos.egl.EGLConfig[r1]
            r8 = 1
            int[] r9 = new int[r8]
            r5 = 10
            r1 = r0
            r2 = r7
            r6 = r9
            r1.eglChooseConfig(r2, r3, r4, r5, r6)
            r0.eglTerminate(r7)
            r0 = 0
            r1 = r9[r0]
            if (r1 <= 0) goto L31
            goto L32
        L31:
            r8 = 0
        L32:
            return r8
    }

    public void clearManagedCaches() {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidApplicationBase r0 = r1.app
            com.badlogic.gdx.graphics.Mesh.clearAllMeshes(r0)
            com.badlogic.gdx.backends.android.AndroidApplicationBase r0 = r1.app
            com.badlogic.gdx.graphics.Texture.clearAllTextures(r0)
            com.badlogic.gdx.backends.android.AndroidApplicationBase r0 = r1.app
            com.badlogic.gdx.graphics.Cubemap.clearAllCubemaps(r0)
            com.badlogic.gdx.backends.android.AndroidApplicationBase r0 = r1.app
            com.badlogic.gdx.graphics.TextureArray.clearAllTextureArrays(r0)
            com.badlogic.gdx.backends.android.AndroidApplicationBase r0 = r1.app
            com.badlogic.gdx.graphics.glutils.ShaderProgram.clearAllShaderPrograms(r0)
            com.badlogic.gdx.backends.android.AndroidApplicationBase r0 = r1.app
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer.clearAllFrameBuffers(r0)
            r1.logManagedCachesStatus()
            return
    }

    protected com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 createGLSurfaceView(com.badlogic.gdx.backends.android.AndroidApplicationBase r10, com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy r11) {
            r9 = this;
            boolean r0 = r9.checkGL20()
            if (r0 == 0) goto L38
            android.opengl.GLSurfaceView$EGLConfigChooser r0 = r9.getEglConfigChooser()
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r8 = new com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20
            android.content.Context r10 = r10.getContext()
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r1 = r9.config
            boolean r1 = r1.useGL30
            if (r1 == 0) goto L18
            r1 = 3
            goto L19
        L18:
            r1 = 2
        L19:
            r8.<init>(r10, r11, r1)
            if (r0 == 0) goto L22
            r8.setEGLConfigChooser(r0)
            goto L34
        L22:
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r10 = r9.config
            int r2 = r10.r
            int r3 = r10.g
            int r4 = r10.b
            int r5 = r10.a
            int r6 = r10.depth
            int r7 = r10.stencil
            r1 = r8
            r1.setEGLConfigChooser(r2, r3, r4, r5, r6, r7)
        L34:
            r8.setRenderer(r9)
            return r8
        L38:
            com.badlogic.gdx.utils.GdxRuntimeException r10 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r11 = "libGDX requires OpenGL ES 2.0"
            r10.<init>(r11)
            throw r10
    }

    void destroy() {
            r4 = this;
            java.lang.Object r0 = r4.synch
            monitor-enter(r0)
            r1 = 0
            r4.running = r1     // Catch: java.lang.Throwable -> L1f
            r1 = 1
            r4.destroy = r1     // Catch: java.lang.Throwable -> L1f
        L9:
            boolean r1 = r4.destroy     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r4.synch     // Catch: java.lang.InterruptedException -> L13 java.lang.Throwable -> L1f
            r1.wait()     // Catch: java.lang.InterruptedException -> L13 java.lang.Throwable -> L1f
            goto L9
        L13:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "AndroidGraphics"
            java.lang.String r3 = "waiting for destroy synchronization failed!"
            r1.log(r2, r3)     // Catch: java.lang.Throwable -> L1f
            goto L9
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
    }

    @Override // com.badlogic.gdx.Graphics
    public int getBackBufferHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    @Override // com.badlogic.gdx.Graphics
    public int getBackBufferWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    public com.badlogic.gdx.Graphics.BufferFormat getBufferFormat() {
            r1 = this;
            com.badlogic.gdx.Graphics$BufferFormat r0 = r1.bufferFormat
            return r0
    }

    @Override // com.badlogic.gdx.Graphics
    public float getDeltaTime() {
            r1 = this;
            float r0 = r1.deltaTime
            return r0
    }

    @Override // com.badlogic.gdx.AbstractGraphics
    public float getDensity() {
            r1 = this;
            float r0 = r1.density
            return r0
    }

    @Override // com.badlogic.gdx.Graphics
    public com.badlogic.gdx.Graphics.DisplayMode getDisplayMode() {
            r8 = this;
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            com.badlogic.gdx.backends.android.AndroidApplicationBase r1 = r8.app
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "display"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            r2 = 0
            android.view.Display r1 = r1.getDisplay(r2)
            r1.getRealMetrics(r0)
            int r4 = r0.widthPixels
            int r5 = r0.heightPixels
            float r0 = r1.getRefreshRate()
            int r6 = com.badlogic.gdx.math.MathUtils.roundPositive(r0)
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r0 = r8.config
            int r1 = r0.r
            int r2 = r0.g
            int r1 = r1 + r2
            int r2 = r0.b
            int r1 = r1 + r2
            int r0 = r0.a
            int r7 = r1 + r0
            com.badlogic.gdx.backends.android.AndroidGraphics$AndroidDisplayMode r0 = new com.badlogic.gdx.backends.android.AndroidGraphics$AndroidDisplayMode
            r2 = r0
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
    }

    public com.badlogic.gdx.Graphics.DisplayMode getDisplayMode(com.badlogic.gdx.Graphics.Monitor r1) {
            r0 = this;
            com.badlogic.gdx.Graphics$DisplayMode r1 = r0.getDisplayMode()
            return r1
    }

    public com.badlogic.gdx.Graphics.DisplayMode[] getDisplayModes() {
            r3 = this;
            r0 = 1
            com.badlogic.gdx.Graphics$DisplayMode[] r0 = new com.badlogic.gdx.Graphics.DisplayMode[r0]
            com.badlogic.gdx.Graphics$DisplayMode r1 = r3.getDisplayMode()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    public com.badlogic.gdx.Graphics.DisplayMode[] getDisplayModes(com.badlogic.gdx.Graphics.Monitor r1) {
            r0 = this;
            com.badlogic.gdx.Graphics$DisplayMode[] r1 = r0.getDisplayModes()
            return r1
    }

    protected android.opengl.GLSurfaceView.EGLConfigChooser getEglConfigChooser() {
            r9 = this;
            com.badlogic.gdx.backends.android.surfaceview.GdxEglConfigChooser r8 = new com.badlogic.gdx.backends.android.surfaceview.GdxEglConfigChooser
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r0 = r9.config
            int r1 = r0.r
            int r2 = r0.g
            int r3 = r0.b
            int r4 = r0.a
            int r5 = r0.depth
            int r6 = r0.stencil
            int r7 = r0.numSamples
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public long getFrameId() {
            r2 = this;
            long r0 = r2.frameId
            return r0
    }

    public int getFramesPerSecond() {
            r1 = this;
            int r0 = r1.fps
            return r0
    }

    public com.badlogic.gdx.graphics.GL20 getGL20() {
            r1 = this;
            com.badlogic.gdx.graphics.GL20 r0 = r1.gl20
            return r0
    }

    public com.badlogic.gdx.graphics.GL30 getGL30() {
            r1 = this;
            com.badlogic.gdx.graphics.GL30 r0 = r1.gl30
            return r0
    }

    public com.badlogic.gdx.graphics.GL31 getGL31() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.badlogic.gdx.graphics.GL32 getGL32() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.badlogic.gdx.graphics.glutils.GLVersion getGLVersion() {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.GLVersion r0 = r1.glVersion
            return r0
    }

    @Override // com.badlogic.gdx.Graphics
    public int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public com.badlogic.gdx.Graphics.Monitor getMonitor() {
            r1 = this;
            com.badlogic.gdx.Graphics$Monitor r0 = r1.getPrimaryMonitor()
            return r0
    }

    public com.badlogic.gdx.Graphics.Monitor[] getMonitors() {
            r3 = this;
            r0 = 1
            com.badlogic.gdx.Graphics$Monitor[] r0 = new com.badlogic.gdx.Graphics.Monitor[r0]
            com.badlogic.gdx.Graphics$Monitor r1 = r3.getPrimaryMonitor()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    public float getPpcX() {
            r1 = this;
            float r0 = r1.ppcX
            return r0
    }

    public float getPpcY() {
            r1 = this;
            float r0 = r1.ppcY
            return r0
    }

    @Override // com.badlogic.gdx.Graphics
    public float getPpiX() {
            r1 = this;
            float r0 = r1.ppiX
            return r0
    }

    @Override // com.badlogic.gdx.Graphics
    public float getPpiY() {
            r1 = this;
            float r0 = r1.ppiY
            return r0
    }

    public com.badlogic.gdx.Graphics.Monitor getPrimaryMonitor() {
            r3 = this;
            com.badlogic.gdx.backends.android.AndroidGraphics$AndroidMonitor r0 = new com.badlogic.gdx.backends.android.AndroidGraphics$AndroidMonitor
            r1 = 0
            java.lang.String r2 = "Primary Monitor"
            r0.<init>(r3, r1, r1, r2)
            return r0
    }

    public int getSafeInsetBottom() {
            r1 = this;
            int r0 = r1.safeInsetBottom
            return r0
    }

    public int getSafeInsetLeft() {
            r1 = this;
            int r0 = r1.safeInsetLeft
            return r0
    }

    public int getSafeInsetRight() {
            r1 = this;
            int r0 = r1.safeInsetRight
            return r0
    }

    public int getSafeInsetTop() {
            r1 = this;
            int r0 = r1.safeInsetTop
            return r0
    }

    public com.badlogic.gdx.Graphics.GraphicsType getType() {
            r1 = this;
            com.badlogic.gdx.Graphics$GraphicsType r0 = com.badlogic.gdx.Graphics.GraphicsType.AndroidGL
            return r0
    }

    public android.view.View getView() {
            r1 = this;
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r0 = r1.view
            return r0
    }

    @Override // com.badlogic.gdx.Graphics
    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean isContinuousRendering() {
            r1 = this;
            boolean r0 = r1.isContinuous
            return r0
    }

    public boolean isFullscreen() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean isGL30Available() {
            r1 = this;
            com.badlogic.gdx.graphics.GL30 r0 = r1.gl30
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isGL31Available() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isGL32Available() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected void logConfig(javax.microedition.khronos.egl.EGLConfig r18) {
            r17 = this;
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r7 = r0.eglGetDisplay(r1)
            r5 = 12324(0x3024, float:1.727E-41)
            r6 = 0
            r1 = r17
            r2 = r0
            r3 = r7
            r4 = r18
            int r9 = r1.getAttrib(r2, r3, r4, r5, r6)
            r5 = 12323(0x3023, float:1.7268E-41)
            int r10 = r1.getAttrib(r2, r3, r4, r5, r6)
            r5 = 12322(0x3022, float:1.7267E-41)
            int r11 = r1.getAttrib(r2, r3, r4, r5, r6)
            r5 = 12321(0x3021, float:1.7265E-41)
            int r12 = r1.getAttrib(r2, r3, r4, r5, r6)
            r5 = 12325(0x3025, float:1.7271E-41)
            int r13 = r1.getAttrib(r2, r3, r4, r5, r6)
            r5 = 12326(0x3026, float:1.7272E-41)
            int r14 = r1.getAttrib(r2, r3, r4, r5, r6)
            r5 = 12337(0x3031, float:1.7288E-41)
            int r8 = r1.getAttrib(r2, r3, r4, r5, r6)
            r5 = 12513(0x30e1, float:1.7534E-41)
            int r1 = r1.getAttrib(r2, r3, r4, r5, r6)
            int r15 = java.lang.Math.max(r8, r1)
            r1 = r17
            int r0 = r1.getAttrib(r2, r3, r4, r5, r6)
            if (r0 == 0) goto L51
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "framebuffer: ("
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r10)
            r2.append(r3)
            r2.append(r11)
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "AndroidGraphics"
            r1.log(r4, r2)
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "depthbuffer: ("
            r2.append(r5)
            r2.append(r13)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.log(r4, r2)
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "stencilbuffer: ("
            r2.append(r5)
            r2.append(r14)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.log(r4, r2)
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "samples: ("
            r2.append(r5)
            r2.append(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.log(r4, r2)
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "coverage sampling: ("
            r2.append(r5)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.log(r4, r2)
            com.badlogic.gdx.Graphics$BufferFormat r1 = new com.badlogic.gdx.Graphics$BufferFormat
            r8 = r1
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r17
            r0.bufferFormat = r1
            return
    }

    protected void logManagedCachesStatus() {
            r3 = this;
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = com.badlogic.gdx.graphics.Mesh.getManagedStatus()
            java.lang.String r2 = "AndroidGraphics"
            r0.log(r2, r1)
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = com.badlogic.gdx.graphics.Texture.getManagedStatus()
            r0.log(r2, r1)
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = com.badlogic.gdx.graphics.Cubemap.getManagedStatus()
            r0.log(r2, r1)
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = com.badlogic.gdx.graphics.glutils.ShaderProgram.getManagedStatus()
            r0.log(r2, r1)
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = com.badlogic.gdx.graphics.glutils.GLFrameBuffer.getManagedStatus()
            r0.log(r2, r1)
            return
    }

    public com.badlogic.gdx.graphics.Cursor newCursor(com.badlogic.gdx.graphics.Pixmap r1, int r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 r11) {
            r10 = this;
            long r0 = java.lang.System.nanoTime()
            boolean r11 = r10.resume
            if (r11 != 0) goto L14
            long r2 = r10.lastFrameTime
            long r2 = r0 - r2
            float r11 = (float) r2
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r11 = r11 / r2
            r10.deltaTime = r11
            goto L17
        L14:
            r11 = 0
            r10.deltaTime = r11
        L17:
            r10.lastFrameTime = r0
            java.lang.Object r11 = r10.synch
            monitor-enter(r11)
            boolean r2 = r10.running     // Catch: java.lang.Throwable -> L162
            boolean r3 = r10.pause     // Catch: java.lang.Throwable -> L162
            boolean r4 = r10.destroy     // Catch: java.lang.Throwable -> L162
            boolean r5 = r10.resume     // Catch: java.lang.Throwable -> L162
            boolean r6 = r10.resume     // Catch: java.lang.Throwable -> L162
            r7 = 0
            if (r6 == 0) goto L2b
            r10.resume = r7     // Catch: java.lang.Throwable -> L162
        L2b:
            boolean r6 = r10.pause     // Catch: java.lang.Throwable -> L162
            if (r6 == 0) goto L36
            r10.pause = r7     // Catch: java.lang.Throwable -> L162
            java.lang.Object r6 = r10.synch     // Catch: java.lang.Throwable -> L162
            r6.notifyAll()     // Catch: java.lang.Throwable -> L162
        L36:
            boolean r6 = r10.destroy     // Catch: java.lang.Throwable -> L162
            if (r6 == 0) goto L41
            r10.destroy = r7     // Catch: java.lang.Throwable -> L162
            java.lang.Object r6 = r10.synch     // Catch: java.lang.Throwable -> L162
            r6.notifyAll()     // Catch: java.lang.Throwable -> L162
        L41:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L162
            if (r5 == 0) goto L78
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.utils.SnapshotArray r11 = r11.getLifecycleListeners()
            monitor-enter(r11)
            java.lang.Object[] r5 = r11.begin()     // Catch: java.lang.Throwable -> L75
            com.badlogic.gdx.LifecycleListener[] r5 = (com.badlogic.gdx.LifecycleListener[]) r5     // Catch: java.lang.Throwable -> L75
            int r6 = r11.size     // Catch: java.lang.Throwable -> L75
            r8 = 0
        L54:
            if (r8 >= r6) goto L5e
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L75
            r9.resume()     // Catch: java.lang.Throwable -> L75
            int r8 = r8 + 1
            goto L54
        L5e:
            r11.end()     // Catch: java.lang.Throwable -> L75
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L75
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.ApplicationListener r11 = r11.getApplicationListener()
            r11.resume()
            com.badlogic.gdx.Application r11 = com.badlogic.gdx.Gdx.app
            java.lang.String r5 = "AndroidGraphics"
            java.lang.String r6 = "resumed"
            r11.log(r5, r6)
            goto L78
        L75:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L75
            throw r0
        L78:
            if (r2 == 0) goto Le2
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.utils.Array r11 = r11.getRunnables()
            monitor-enter(r11)
            com.badlogic.gdx.backends.android.AndroidApplicationBase r2 = r10.app     // Catch: java.lang.Throwable -> Ldf
            com.badlogic.gdx.utils.Array r2 = r2.getExecutedRunnables()     // Catch: java.lang.Throwable -> Ldf
            r2.clear()     // Catch: java.lang.Throwable -> Ldf
            com.badlogic.gdx.backends.android.AndroidApplicationBase r2 = r10.app     // Catch: java.lang.Throwable -> Ldf
            com.badlogic.gdx.utils.Array r2 = r2.getExecutedRunnables()     // Catch: java.lang.Throwable -> Ldf
            com.badlogic.gdx.backends.android.AndroidApplicationBase r5 = r10.app     // Catch: java.lang.Throwable -> Ldf
            com.badlogic.gdx.utils.Array r5 = r5.getRunnables()     // Catch: java.lang.Throwable -> Ldf
            r2.addAll(r5)     // Catch: java.lang.Throwable -> Ldf
            com.badlogic.gdx.backends.android.AndroidApplicationBase r2 = r10.app     // Catch: java.lang.Throwable -> Ldf
            com.badlogic.gdx.utils.Array r2 = r2.getRunnables()     // Catch: java.lang.Throwable -> Ldf
            r2.clear()     // Catch: java.lang.Throwable -> Ldf
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Ldf
            r11 = 0
        La4:
            com.badlogic.gdx.backends.android.AndroidApplicationBase r2 = r10.app
            com.badlogic.gdx.utils.Array r2 = r2.getExecutedRunnables()
            int r2 = r2.size
            if (r11 >= r2) goto Lc5
            com.badlogic.gdx.backends.android.AndroidApplicationBase r2 = r10.app     // Catch: java.lang.Throwable -> Lbe
            com.badlogic.gdx.utils.Array r2 = r2.getExecutedRunnables()     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r2 = r2.get(r11)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> Lbe
            r2.run()     // Catch: java.lang.Throwable -> Lbe
            goto Lc2
        Lbe:
            r2 = move-exception
            r2.printStackTrace()
        Lc2:
            int r11 = r11 + 1
            goto La4
        Lc5:
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.backends.android.AndroidInput r11 = r11.mo17getInput()
            r11.processEvents()
            long r5 = r10.frameId
            r8 = 1
            long r5 = r5 + r8
            r10.frameId = r5
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.ApplicationListener r11 = r11.getApplicationListener()
            r11.render()
            goto Le2
        Ldf:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Ldf
            throw r0
        Le2:
            if (r3 == 0) goto L115
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.utils.SnapshotArray r11 = r11.getLifecycleListeners()
            monitor-enter(r11)
            java.lang.Object[] r2 = r11.begin()     // Catch: java.lang.Throwable -> L112
            com.badlogic.gdx.LifecycleListener[] r2 = (com.badlogic.gdx.LifecycleListener[]) r2     // Catch: java.lang.Throwable -> L112
            int r3 = r11.size     // Catch: java.lang.Throwable -> L112
            r5 = 0
        Lf4:
            if (r5 >= r3) goto Lfe
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L112
            r6.pause()     // Catch: java.lang.Throwable -> L112
            int r5 = r5 + 1
            goto Lf4
        Lfe:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L112
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.ApplicationListener r11 = r11.getApplicationListener()
            r11.pause()
            com.badlogic.gdx.Application r11 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AndroidGraphics"
            java.lang.String r3 = "paused"
            r11.log(r2, r3)
            goto L115
        L112:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L112
            throw r0
        L115:
            if (r4 == 0) goto L148
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.utils.SnapshotArray r11 = r11.getLifecycleListeners()
            monitor-enter(r11)
            java.lang.Object[] r2 = r11.begin()     // Catch: java.lang.Throwable -> L145
            com.badlogic.gdx.LifecycleListener[] r2 = (com.badlogic.gdx.LifecycleListener[]) r2     // Catch: java.lang.Throwable -> L145
            int r3 = r11.size     // Catch: java.lang.Throwable -> L145
            r4 = 0
        L127:
            if (r4 >= r3) goto L131
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L145
            r5.dispose()     // Catch: java.lang.Throwable -> L145
            int r4 = r4 + 1
            goto L127
        L131:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L145
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.ApplicationListener r11 = r11.getApplicationListener()
            r11.dispose()
            com.badlogic.gdx.Application r11 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AndroidGraphics"
            java.lang.String r3 = "destroyed"
            r11.log(r2, r3)
            goto L148
        L145:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L145
            throw r0
        L148:
            long r2 = r10.frameStart
            long r2 = r0 - r2
            r4 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 <= 0) goto L15b
            int r11 = r10.frames
            r10.fps = r11
            r10.frames = r7
            r10.frameStart = r0
        L15b:
            int r11 = r10.frames
            int r11 = r11 + 1
            r10.frames = r11
            return
        L162:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L162
            throw r0
    }

    public void onPauseGLSurfaceView() {
            r1 = this;
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r0 = r1.view
            if (r0 == 0) goto L7
            r0.onPause()
        L7:
            return
    }

    public void onResumeGLSurfaceView() {
            r1 = this;
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r0 = r1.view
            if (r0 == 0) goto L7
            r0.onResume()
        L7:
            return
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 r4, int r5, int r6) {
            r3 = this;
            r3.width = r5
            r3.height = r6
            r3.updatePpi()
            r3.updateSafeAreaInsets()
            int r0 = r3.width
            int r1 = r3.height
            r2 = 0
            r4.glViewport(r2, r2, r0, r1)
            boolean r4 = r3.created
            if (r4 != 0) goto L2a
            com.badlogic.gdx.backends.android.AndroidApplicationBase r4 = r3.app
            com.badlogic.gdx.ApplicationListener r4 = r4.getApplicationListener()
            r4.create()
            r4 = 1
            r3.created = r4
            monitor-enter(r3)
            r3.running = r4     // Catch: java.lang.Throwable -> L27
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            goto L2a
        L27:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r4
        L2a:
            com.badlogic.gdx.backends.android.AndroidApplicationBase r4 = r3.app
            com.badlogic.gdx.ApplicationListener r4 = r4.getApplicationListener()
            r4.resize(r5, r6)
            return
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 r3, javax.microedition.khronos.egl.EGLConfig r4) {
            r2 = this;
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            javax.microedition.khronos.egl.EGLContext r0 = r0.eglGetCurrentContext()
            r2.eglContext = r0
            r2.setupGL(r3)
            r2.logConfig(r4)
            r2.updatePpi()
            r2.updateSafeAreaInsets()
            com.badlogic.gdx.backends.android.AndroidApplicationBase r4 = r2.app
            com.badlogic.gdx.graphics.Mesh.invalidateAllMeshes(r4)
            com.badlogic.gdx.backends.android.AndroidApplicationBase r4 = r2.app
            com.badlogic.gdx.graphics.Texture.invalidateAllTextures(r4)
            com.badlogic.gdx.backends.android.AndroidApplicationBase r4 = r2.app
            com.badlogic.gdx.graphics.Cubemap.invalidateAllCubemaps(r4)
            com.badlogic.gdx.backends.android.AndroidApplicationBase r4 = r2.app
            com.badlogic.gdx.graphics.TextureArray.invalidateAllTextureArrays(r4)
            com.badlogic.gdx.backends.android.AndroidApplicationBase r4 = r2.app
            com.badlogic.gdx.graphics.glutils.ShaderProgram.invalidateAllShaderPrograms(r4)
            com.badlogic.gdx.backends.android.AndroidApplicationBase r4 = r2.app
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer.invalidateAllFrameBuffers(r4)
            r2.logManagedCachesStatus()
            com.badlogic.gdx.backends.android.AndroidApplicationBase r4 = r2.app
            android.view.WindowManager r4 = r4.getWindowManager()
            android.view.Display r4 = r4.getDefaultDisplay()
            int r0 = r4.getWidth()
            r2.width = r0
            int r4 = r4.getHeight()
            r2.height = r4
            long r0 = java.lang.System.nanoTime()
            r2.lastFrameTime = r0
            int r4 = r2.width
            int r0 = r2.height
            r1 = 0
            r3.glViewport(r1, r1, r4, r0)
            return
    }

    void pause() {
            r4 = this;
            java.lang.Object r0 = r4.synch
            monitor-enter(r0)
            boolean r1 = r4.running     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L9:
            r1 = 0
            r4.running = r1     // Catch: java.lang.Throwable -> L45
            r1 = 1
            r4.pause = r1     // Catch: java.lang.Throwable -> L45
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r1 = r4.view     // Catch: java.lang.Throwable -> L45
            com.badlogic.gdx.backends.android.AndroidGraphics$1 r2 = new com.badlogic.gdx.backends.android.AndroidGraphics$1     // Catch: java.lang.Throwable -> L45
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L45
            r1.queueEvent(r2)     // Catch: java.lang.Throwable -> L45
        L19:
            boolean r1 = r4.pause     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L43
            java.lang.Object r1 = r4.synch     // Catch: java.lang.InterruptedException -> L39 java.lang.Throwable -> L45
            r2 = 4000(0xfa0, double:1.9763E-320)
            r1.wait(r2)     // Catch: java.lang.InterruptedException -> L39 java.lang.Throwable -> L45
            boolean r1 = r4.pause     // Catch: java.lang.InterruptedException -> L39 java.lang.Throwable -> L45
            if (r1 == 0) goto L19
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.InterruptedException -> L39 java.lang.Throwable -> L45
            java.lang.String r2 = "AndroidGraphics"
            java.lang.String r3 = "waiting for pause synchronization took too long; assuming deadlock and killing"
            r1.error(r2, r3)     // Catch: java.lang.InterruptedException -> L39 java.lang.Throwable -> L45
            int r1 = android.os.Process.myPid()     // Catch: java.lang.InterruptedException -> L39 java.lang.Throwable -> L45
            android.os.Process.killProcess(r1)     // Catch: java.lang.InterruptedException -> L39 java.lang.Throwable -> L45
            goto L19
        L39:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = "AndroidGraphics"
            java.lang.String r3 = "waiting for pause synchronization failed!"
            r1.log(r2, r3)     // Catch: java.lang.Throwable -> L45
            goto L19
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L45:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r1
    }

    protected void preserveEGLContextOnPause() {
            r2 = this;
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r0 = r2.view
            r1 = 1
            r0.setPreserveEGLContextOnPause(r1)
            return
    }

    @Override // com.badlogic.gdx.Graphics
    public void requestRendering() {
            r1 = this;
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r0 = r1.view
            if (r0 == 0) goto L7
            r0.requestRender()
        L7:
            return
    }

    void resume() {
            r2 = this;
            java.lang.Object r0 = r2.synch
            monitor-enter(r0)
            r1 = 1
            r2.running = r1     // Catch: java.lang.Throwable -> La
            r2.resume = r1     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.badlogic.gdx.Graphics
    public void setContinuousRendering(boolean r2) {
            r1 = this;
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r0 = r1.view
            if (r0 == 0) goto L15
            boolean r0 = com.badlogic.gdx.backends.android.AndroidGraphics.enforceContinuousRendering
            if (r0 != 0) goto Ld
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            r1.isContinuous = r2
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r0 = r1.view
            r0.setRenderMode(r2)
        L15:
            return
    }

    public void setCursor(com.badlogic.gdx.graphics.Cursor r1) {
            r0 = this;
            return
    }

    public void setForegroundFPS(int r1) {
            r0 = this;
            return
    }

    public boolean setFullscreenMode(com.badlogic.gdx.Graphics.DisplayMode r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void setGL20(com.badlogic.gdx.graphics.GL20 r2) {
            r1 = this;
            r1.gl20 = r2
            com.badlogic.gdx.graphics.GL30 r0 = r1.gl30
            if (r0 != 0) goto La
            com.badlogic.gdx.Gdx.gl = r2
            com.badlogic.gdx.Gdx.gl20 = r2
        La:
            return
    }

    public void setGL30(com.badlogic.gdx.graphics.GL30 r1) {
            r0 = this;
            r0.gl30 = r1
            if (r1 == 0) goto Lc
            r0.gl20 = r1
            com.badlogic.gdx.Gdx.gl = r1
            com.badlogic.gdx.Gdx.gl20 = r1
            com.badlogic.gdx.Gdx.gl30 = r1
        Lc:
            return
    }

    public void setGL31(com.badlogic.gdx.graphics.GL31 r1) {
            r0 = this;
            return
    }

    public void setGL32(com.badlogic.gdx.graphics.GL32 r1) {
            r0 = this;
            return
    }

    public void setResizable(boolean r1) {
            r0 = this;
            return
    }

    public void setSystemCursor(com.badlogic.gdx.graphics.Cursor.SystemCursor r2) {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidApplicationBase r0 = r1.app
            com.badlogic.gdx.Graphics r0 = r0.getGraphics()
            com.badlogic.gdx.backends.android.AndroidGraphics r0 = (com.badlogic.gdx.backends.android.AndroidGraphics) r0
            android.view.View r0 = r0.getView()
            com.badlogic.gdx.backends.android.AndroidCursor.setSystemCursor(r0, r2)
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            return
    }

    public void setUndecorated(boolean r3) {
            r2 = this;
            com.badlogic.gdx.backends.android.AndroidApplicationBase r0 = r2.app
            android.view.Window r0 = r0.getApplicationWindow()
            r1 = 1024(0x400, float:1.435E-42)
            r0.setFlags(r1, r3)
            return
    }

    public void setVSync(boolean r1) {
            r0 = this;
            return
    }

    public boolean setWindowedMode(int r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected void setupGL(javax.microedition.khronos.opengles.GL10 r9) {
            r8 = this;
            r0 = 7938(0x1f02, float:1.1124E-41)
            java.lang.String r1 = r9.glGetString(r0)
            r2 = 7936(0x1f00, float:1.1121E-41)
            java.lang.String r3 = r9.glGetString(r2)
            r4 = 7937(0x1f01, float:1.1122E-41)
            java.lang.String r5 = r9.glGetString(r4)
            com.badlogic.gdx.graphics.glutils.GLVersion r6 = new com.badlogic.gdx.graphics.glutils.GLVersion
            com.badlogic.gdx.Application$ApplicationType r7 = com.badlogic.gdx.Application.ApplicationType.Android
            r6.<init>(r7, r1, r3, r5)
            r8.glVersion = r6
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r1 = r8.config
            boolean r1 = r1.useGL30
            if (r1 == 0) goto L3d
            int r1 = r6.getMajorVersion()
            r3 = 2
            if (r1 <= r3) goto L3d
            com.badlogic.gdx.graphics.GL30 r1 = r8.gl30
            if (r1 == 0) goto L2d
            return
        L2d:
            com.badlogic.gdx.backends.android.AndroidGL30 r1 = new com.badlogic.gdx.backends.android.AndroidGL30
            r1.<init>()
            r8.gl30 = r1
            r8.gl20 = r1
            com.badlogic.gdx.Gdx.gl = r1
            com.badlogic.gdx.Gdx.gl20 = r1
            com.badlogic.gdx.Gdx.gl30 = r1
            goto L4d
        L3d:
            com.badlogic.gdx.graphics.GL20 r1 = r8.gl20
            if (r1 == 0) goto L42
            return
        L42:
            com.badlogic.gdx.backends.android.AndroidGL20 r1 = new com.badlogic.gdx.backends.android.AndroidGL20
            r1.<init>()
            r8.gl20 = r1
            com.badlogic.gdx.Gdx.gl = r1
            com.badlogic.gdx.Gdx.gl20 = r1
        L4d:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "OGL renderer: "
            r3.append(r5)
            java.lang.String r4 = r9.glGetString(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "AndroidGraphics"
            r1.log(r4, r3)
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "OGL vendor: "
            r3.append(r5)
            java.lang.String r2 = r9.glGetString(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.log(r4, r2)
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "OGL version: "
            r2.append(r3)
            java.lang.String r0 = r9.glGetString(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.log(r4, r0)
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OGL extensions: "
            r1.append(r2)
            r2 = 7939(0x1f03, float:1.1125E-41)
            java.lang.String r9 = r9.glGetString(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.log(r4, r9)
            return
    }

    public boolean supportsDisplayModeChange() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean supportsExtension(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.extensions
            if (r0 != 0) goto Le
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 7939(0x1f03, float:1.1125E-41)
            java.lang.String r0 = r0.glGetString(r1)
            r2.extensions = r0
        Le:
            java.lang.String r0 = r2.extensions
            boolean r3 = r0.contains(r3)
            return r3
    }

    protected void updatePpi() {
            r4 = this;
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            com.badlogic.gdx.backends.android.AndroidApplicationBase r1 = r4.app
            android.view.WindowManager r1 = r1.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            float r1 = r0.xdpi
            r4.ppiX = r1
            float r2 = r0.ydpi
            r4.ppiY = r2
            r3 = 1076006748(0x40228f5c, float:2.54)
            float r1 = r1 / r3
            r4.ppcX = r1
            float r2 = r2 / r3
            r4.ppcY = r2
            float r0 = r0.density
            r4.density = r0
            return
    }

    @android.annotation.TargetApi(28)
    protected void updateSafeAreaInsets() {
            r3 = this;
            r0 = 0
            r3.safeInsetLeft = r0
            r3.safeInsetTop = r0
            r3.safeInsetRight = r0
            r3.safeInsetBottom = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L45
            com.badlogic.gdx.backends.android.AndroidApplicationBase r0 = r3.app     // Catch: java.lang.UnsupportedOperationException -> L3c
            android.view.Window r0 = r0.getApplicationWindow()     // Catch: java.lang.UnsupportedOperationException -> L3c
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.UnsupportedOperationException -> L3c
            android.view.WindowInsets r0 = r0.getRootWindowInsets()     // Catch: java.lang.UnsupportedOperationException -> L3c
            android.view.DisplayCutout r0 = r0.getDisplayCutout()     // Catch: java.lang.UnsupportedOperationException -> L3c
            if (r0 == 0) goto L45
            int r1 = r0.getSafeInsetRight()     // Catch: java.lang.UnsupportedOperationException -> L3c
            r3.safeInsetRight = r1     // Catch: java.lang.UnsupportedOperationException -> L3c
            int r1 = r0.getSafeInsetBottom()     // Catch: java.lang.UnsupportedOperationException -> L3c
            r3.safeInsetBottom = r1     // Catch: java.lang.UnsupportedOperationException -> L3c
            int r1 = r0.getSafeInsetTop()     // Catch: java.lang.UnsupportedOperationException -> L3c
            r3.safeInsetTop = r1     // Catch: java.lang.UnsupportedOperationException -> L3c
            int r0 = r0.getSafeInsetLeft()     // Catch: java.lang.UnsupportedOperationException -> L3c
            r3.safeInsetLeft = r0     // Catch: java.lang.UnsupportedOperationException -> L3c
            goto L45
        L3c:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = "AndroidGraphics"
            java.lang.String r2 = "Unable to get safe area insets"
            r0.log(r1, r2)
        L45:
            return
    }
}
