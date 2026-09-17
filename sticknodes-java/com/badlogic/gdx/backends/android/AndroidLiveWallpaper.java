package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidLiveWallpaper implements com.badlogic.gdx.backends.android.AndroidApplicationBase {
    protected com.badlogic.gdx.ApplicationLogger applicationLogger;
    protected com.badlogic.gdx.backends.android.AndroidAudio audio;
    protected com.badlogic.gdx.backends.android.AndroidClipboard clipboard;
    protected final com.badlogic.gdx.utils.Array<java.lang.Runnable> executedRunnables;
    protected com.badlogic.gdx.backends.android.AndroidFiles files;
    protected boolean firstResume;
    protected com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper graphics;
    protected com.badlogic.gdx.backends.android.AndroidInput input;
    protected final com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.LifecycleListener> lifecycleListeners;
    protected com.badlogic.gdx.ApplicationListener listener;
    protected int logLevel;

    /* renamed from: net, reason: collision with root package name */
    protected com.badlogic.gdx.backends.android.AndroidNet f5net;
    protected final com.badlogic.gdx.utils.Array<java.lang.Runnable> runnables;
    protected com.badlogic.gdx.backends.android.AndroidLiveWallpaperService service;
    protected volatile com.badlogic.gdx.graphics.Color[] wallpaperColors;

    public AndroidLiveWallpaper(com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.firstResume = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r2.runnables = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r2.executedRunnables = r0
            com.badlogic.gdx.utils.SnapshotArray r0 = new com.badlogic.gdx.utils.SnapshotArray
            java.lang.Class<com.badlogic.gdx.LifecycleListener> r1 = com.badlogic.gdx.LifecycleListener.class
            r0.<init>(r1)
            r2.lifecycleListeners = r0
            r0 = 2
            r2.logLevel = r0
            r0 = 0
            r2.wallpaperColors = r0
            r2.service = r3
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public void addLifecycleListener(com.badlogic.gdx.LifecycleListener r3) {
            r2 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.LifecycleListener> r0 = r2.lifecycleListeners
            monitor-enter(r0)
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.LifecycleListener> r1 = r2.lifecycleListeners     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public com.badlogic.gdx.backends.android.AndroidAudio createAudio(android.content.Context r2, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r3) {
            r1 = this;
            com.badlogic.gdx.backends.android.DefaultAndroidAudio r0 = new com.badlogic.gdx.backends.android.DefaultAndroidAudio
            r0.<init>(r2, r3)
            return r0
    }

    protected com.badlogic.gdx.backends.android.AndroidFiles createFiles() {
            r4 = this;
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r4.getService()
            r0.getFilesDir()
            com.badlogic.gdx.backends.android.DefaultAndroidFiles r0 = new com.badlogic.gdx.backends.android.DefaultAndroidFiles
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r1 = r4.getService()
            android.content.res.AssetManager r1 = r1.getAssets()
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r2 = r4.getService()
            r3 = 1
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public com.badlogic.gdx.backends.android.AndroidInput createInput(com.badlogic.gdx.Application r1, android.content.Context r2, java.lang.Object r3, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r4) {
            r0 = this;
            com.badlogic.gdx.backends.android.DefaultAndroidInput r1 = new com.badlogic.gdx.backends.android.DefaultAndroidInput
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r2 = r0.getService()
            com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper r3 = r0.graphics
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r3 = r3.view
            r1.<init>(r0, r2, r3, r4)
            return r1
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public void debug(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.logLevel
            r1 = 3
            if (r0 < r1) goto Lc
            com.badlogic.gdx.ApplicationLogger r0 = r2.getApplicationLogger()
            r0.debug(r3, r4)
        Lc:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public void debug(java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
            r2 = this;
            int r0 = r2.logLevel
            r1 = 3
            if (r0 < r1) goto Lc
            com.badlogic.gdx.ApplicationLogger r0 = r2.getApplicationLogger()
            r0.debug(r3, r4, r5)
        Lc:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public void error(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.logLevel
            r1 = 1
            if (r0 < r1) goto Lc
            com.badlogic.gdx.ApplicationLogger r0 = r2.getApplicationLogger()
            r0.error(r3, r4)
        Lc:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public void error(java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
            r2 = this;
            int r0 = r2.logLevel
            r1 = 1
            if (r0 < r1) goto Lc
            com.badlogic.gdx.ApplicationLogger r0 = r2.getApplicationLogger()
            r0.error(r3, r4, r5)
        Lc:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public void exit() {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public com.badlogic.gdx.ApplicationListener getApplicationListener() {
            r1 = this;
            com.badlogic.gdx.ApplicationListener r0 = r1.listener
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public com.badlogic.gdx.ApplicationLogger getApplicationLogger() {
            r1 = this;
            com.badlogic.gdx.ApplicationLogger r0 = r1.applicationLogger
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public android.view.Window getApplicationWindow() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public com.badlogic.gdx.Audio getAudio() {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidAudio r0 = r1.audio
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public com.badlogic.gdx.utils.Clipboard getClipboard() {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidClipboard r0 = r1.clipboard
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public android.content.Context getContext() {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r1.service
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public com.badlogic.gdx.utils.Array<java.lang.Runnable> getExecutedRunnables() {
            r1 = this;
            com.badlogic.gdx.utils.Array<java.lang.Runnable> r0 = r1.executedRunnables
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public com.badlogic.gdx.Files getFiles() {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidFiles r0 = r1.files
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public com.badlogic.gdx.Graphics getGraphics() {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper r0 = r1.graphics
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public android.os.Handler getHandler() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public /* bridge */ /* synthetic */ com.badlogic.gdx.Input getInput() {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidInput r0 = r1.mo17getInput()
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    /* renamed from: getInput */
    public com.badlogic.gdx.backends.android.AndroidInput mo17getInput() {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidInput r0 = r1.input
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public long getJavaHeap() {
            r4 = this;
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r0 = r0.totalMemory()
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            long r2 = r2.freeMemory()
            long r0 = r0 - r2
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.LifecycleListener> getLifecycleListeners() {
            r1 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.LifecycleListener> r0 = r1.lifecycleListeners
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public int getLogLevel() {
            r1 = this;
            int r0 = r1.logLevel
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public long getNativeHeap() {
            r2 = this;
            long r0 = android.os.Debug.getNativeHeapAllocatedSize()
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public com.badlogic.gdx.Net getNet() {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidNet r0 = r1.f5net
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public com.badlogic.gdx.Preferences getPreferences(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.backends.android.AndroidPreferences r0 = new com.badlogic.gdx.backends.android.AndroidPreferences
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r1 = r3.service
            r2 = 0
            android.content.SharedPreferences r4 = r1.getSharedPreferences(r4, r2)
            r0.<init>(r4)
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public com.badlogic.gdx.utils.Array<java.lang.Runnable> getRunnables() {
            r1 = this;
            com.badlogic.gdx.utils.Array<java.lang.Runnable> r0 = r1.runnables
            return r0
    }

    public com.badlogic.gdx.backends.android.AndroidLiveWallpaperService getService() {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r1.service
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public com.badlogic.gdx.Application.ApplicationType getType() {
            r1 = this;
            com.badlogic.gdx.Application$ApplicationType r0 = com.badlogic.gdx.Application.ApplicationType.Android
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public int getVersion() {
            r1 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public android.view.WindowManager getWindowManager() {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r1.service
            android.view.WindowManager r0 = r0.getWindowManager()
            return r0
    }

    public void initialize(com.badlogic.gdx.ApplicationListener r3, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r4) {
            r2 = this;
            int r0 = r2.getVersion()
            r1 = 14
            if (r0 < r1) goto L6c
            com.badlogic.gdx.utils.GdxNativesLoader.load()
            com.badlogic.gdx.backends.android.AndroidApplicationLogger r0 = new com.badlogic.gdx.backends.android.AndroidApplicationLogger
            r0.<init>()
            r2.setApplicationLogger(r0)
            com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper r0 = new com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper
            com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy r1 = r4.resolutionStrategy
            if (r1 != 0) goto L1e
            com.badlogic.gdx.backends.android.surfaceview.FillResolutionStrategy r1 = new com.badlogic.gdx.backends.android.surfaceview.FillResolutionStrategy
            r1.<init>()
        L1e:
            r0.<init>(r2, r4, r1)
            r2.graphics = r0
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r2.getService()
            com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper r1 = r2.graphics
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r1 = r1.view
            com.badlogic.gdx.backends.android.AndroidInput r0 = r2.createInput(r2, r0, r1, r4)
            r2.input = r0
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r2.getService()
            com.badlogic.gdx.backends.android.AndroidAudio r0 = r2.createAudio(r0, r4)
            r2.audio = r0
            com.badlogic.gdx.backends.android.AndroidFiles r0 = r2.createFiles()
            r2.files = r0
            com.badlogic.gdx.backends.android.AndroidNet r0 = new com.badlogic.gdx.backends.android.AndroidNet
            r0.<init>(r2, r4)
            r2.f5net = r0
            r2.listener = r3
            com.badlogic.gdx.backends.android.AndroidClipboard r3 = new com.badlogic.gdx.backends.android.AndroidClipboard
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r4 = r2.getService()
            r3.<init>(r4)
            r2.clipboard = r3
            com.badlogic.gdx.Gdx.app = r2
            com.badlogic.gdx.backends.android.AndroidInput r3 = r2.input
            com.badlogic.gdx.Gdx.input = r3
            com.badlogic.gdx.backends.android.AndroidAudio r3 = r2.audio
            com.badlogic.gdx.Gdx.audio = r3
            com.badlogic.gdx.backends.android.AndroidFiles r3 = r2.files
            com.badlogic.gdx.Gdx.files = r3
            com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper r3 = r2.graphics
            com.badlogic.gdx.Gdx.graphics = r3
            com.badlogic.gdx.backends.android.AndroidNet r3 = r2.f5net
            com.badlogic.gdx.Gdx.f1net = r3
            return
        L6c:
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r4 = "libGDX requires Android API Level 14 or later."
            r3.<init>(r4)
            throw r3
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public void log(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.logLevel
            r1 = 2
            if (r0 < r1) goto Lc
            com.badlogic.gdx.ApplicationLogger r0 = r2.getApplicationLogger()
            r0.log(r3, r4)
        Lc:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public void log(java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
            r2 = this;
            int r0 = r2.logLevel
            r1 = 2
            if (r0 < r1) goto Lc
            com.badlogic.gdx.ApplicationLogger r0 = r2.getApplicationLogger()
            r0.log(r3, r4, r5)
        Lc:
            return
    }

    public void notifyColorsChanged(com.badlogic.gdx.graphics.Color r4, com.badlogic.gdx.graphics.Color r5, com.badlogic.gdx.graphics.Color r6) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 >= r1) goto L7
            return
        L7:
            r0 = 3
            com.badlogic.gdx.graphics.Color[] r0 = new com.badlogic.gdx.graphics.Color[r0]
            r1 = 0
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r2.<init>(r4)
            r0[r1] = r2
            r4 = 1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r5)
            r0[r4] = r1
            r4 = 2
            com.badlogic.gdx.graphics.Color r5 = new com.badlogic.gdx.graphics.Color
            r5.<init>(r6)
            r0[r4] = r5
            r3.wallpaperColors = r0
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r4 = r3.service
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r4 = r4.linkedEngine
            if (r4 == 0) goto L2d
            r4.notifyColorsChanged()
        L2d:
            return
    }

    public void onDestroy() {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper r0 = r1.graphics
            if (r0 == 0) goto L7
            r0.onDestroyGLSurfaceView()
        L7:
            com.badlogic.gdx.backends.android.AndroidAudio r0 = r1.audio
            if (r0 == 0) goto Le
            r0.dispose()
        Le:
            return
    }

    public void onPause() {
            r2 = this;
            boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
            java.lang.String r1 = "WallpaperService"
            if (r0 == 0) goto Lb
            java.lang.String r0 = " > AndroidLiveWallpaper - onPause()"
            android.util.Log.d(r1, r0)
        Lb:
            com.badlogic.gdx.backends.android.AndroidAudio r0 = r2.audio
            r0.pause()
            com.badlogic.gdx.backends.android.AndroidInput r0 = r2.input
            r0.onPause()
            com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper r0 = r2.graphics
            if (r0 == 0) goto L1c
            r0.onPauseGLSurfaceView()
        L1c:
            boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
            if (r0 == 0) goto L25
            java.lang.String r0 = " > AndroidLiveWallpaper - onPause() done!"
            android.util.Log.d(r1, r0)
        L25:
            return
    }

    public void onResume() {
            r2 = this;
            com.badlogic.gdx.Gdx.app = r2
            com.badlogic.gdx.backends.android.AndroidInput r0 = r2.input
            com.badlogic.gdx.Gdx.input = r0
            com.badlogic.gdx.backends.android.AndroidAudio r1 = r2.audio
            com.badlogic.gdx.Gdx.audio = r1
            com.badlogic.gdx.backends.android.AndroidFiles r1 = r2.files
            com.badlogic.gdx.Gdx.files = r1
            com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper r1 = r2.graphics
            com.badlogic.gdx.Gdx.graphics = r1
            com.badlogic.gdx.backends.android.AndroidNet r1 = r2.f5net
            com.badlogic.gdx.Gdx.f1net = r1
            r0.onResume()
            com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper r0 = r2.graphics
            if (r0 == 0) goto L20
            r0.onResumeGLSurfaceView()
        L20:
            boolean r0 = r2.firstResume
            if (r0 != 0) goto L2f
            com.badlogic.gdx.backends.android.AndroidAudio r0 = r2.audio
            r0.resume()
            com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper r0 = r2.graphics
            r0.resume()
            goto L32
        L2f:
            r0 = 0
            r2.firstResume = r0
        L32:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public void postRunnable(java.lang.Runnable r3) {
            r2 = this;
            com.badlogic.gdx.utils.Array<java.lang.Runnable> r0 = r2.runnables
            monitor-enter(r0)
            com.badlogic.gdx.utils.Array<java.lang.Runnable> r1 = r2.runnables     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public void removeLifecycleListener(com.badlogic.gdx.LifecycleListener r4) {
            r3 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.LifecycleListener> r0 = r3.lifecycleListeners
            monitor-enter(r0)
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.LifecycleListener> r1 = r3.lifecycleListeners     // Catch: java.lang.Throwable -> Lb
            r2 = 1
            r1.removeValue(r4, r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r4
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public void runOnUiThread(java.lang.Runnable r3) {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L17
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r0.post(r3)
            goto L1a
        L17:
            r3.run()
        L1a:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public void setApplicationLogger(com.badlogic.gdx.ApplicationLogger r1) {
            r0 = this;
            r0.applicationLogger = r1
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public void setLogLevel(int r1) {
            r0 = this;
            r0.logLevel = r1
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public void startActivity(android.content.Intent r2) {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r1.service
            r0.startActivity(r2)
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public void useImmersiveMode(boolean r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
