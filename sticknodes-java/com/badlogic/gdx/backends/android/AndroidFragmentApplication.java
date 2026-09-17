package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidFragmentApplication extends androidx.fragment.app.Fragment implements com.badlogic.gdx.backends.android.AndroidApplicationBase {
    private final com.badlogic.gdx.utils.Array<com.badlogic.gdx.backends.android.AndroidEventListener> androidEventListeners;
    protected com.badlogic.gdx.ApplicationLogger applicationLogger;
    protected com.badlogic.gdx.backends.android.AndroidAudio audio;
    protected com.badlogic.gdx.backends.android.AndroidFragmentApplication.Callbacks callbacks;
    protected com.badlogic.gdx.backends.android.AndroidClipboard clipboard;
    protected final com.badlogic.gdx.utils.Array<java.lang.Runnable> executedRunnables;
    protected com.badlogic.gdx.backends.android.AndroidFiles files;
    protected boolean firstResume;
    protected com.badlogic.gdx.backends.android.AndroidGraphics graphics;
    public android.os.Handler handler;
    protected com.badlogic.gdx.backends.android.AndroidInput input;
    protected final com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.LifecycleListener> lifecycleListeners;
    protected com.badlogic.gdx.ApplicationListener listener;
    protected int logLevel;

    /* renamed from: net, reason: collision with root package name */
    protected com.badlogic.gdx.backends.android.AndroidNet f4net;
    protected final com.badlogic.gdx.utils.Array<java.lang.Runnable> runnables;



    public interface Callbacks {
        void exit();
    }

    public AndroidFragmentApplication() {
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
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r2.androidEventListeners = r0
            r0 = 2
            r2.logLevel = r0
            return
    }

    private boolean isAnyParentFragmentRemoving() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.getParentFragment()
        L4:
            if (r0 == 0) goto L13
            boolean r1 = r0.isRemoving()
            if (r1 == 0) goto Le
            r0 = 1
            return r0
        Le:
            androidx.fragment.app.Fragment r0 = r0.getParentFragment()
            goto L4
        L13:
            r0 = 0
            return r0
    }

    public void addAndroidEventListener(com.badlogic.gdx.backends.android.AndroidEventListener r3) {
            r2 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.backends.android.AndroidEventListener> r0 = r2.androidEventListeners
            monitor-enter(r0)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.backends.android.AndroidEventListener> r1 = r2.androidEventListeners     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
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
            com.badlogic.gdx.backends.android.DefaultAndroidFiles r0 = new com.badlogic.gdx.backends.android.DefaultAndroidFiles
            android.content.res.Resources r1 = r4.getResources()
            android.content.res.AssetManager r1 = r1.getAssets()
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            r3 = 1
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public com.badlogic.gdx.backends.android.AndroidInput createInput(com.badlogic.gdx.Application r1, android.content.Context r2, java.lang.Object r3, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r4) {
            r0 = this;
            com.badlogic.gdx.backends.android.DefaultAndroidInput r1 = new com.badlogic.gdx.backends.android.DefaultAndroidInput
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            com.badlogic.gdx.backends.android.AndroidGraphics r3 = r0.graphics
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r3 = r3.view
            r1.<init>(r0, r2, r3, r4)
            return r1
    }

    protected android.widget.FrameLayout.LayoutParams createLayoutParams() {
            r2 = this;
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r1 = 17
            r0.gravity = r1
            return r0
    }

    protected void createWakeLock(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            android.view.Window r2 = r2.getWindow()
            r0 = 128(0x80, float:1.794E-43)
            r2.addFlags(r0)
        Lf:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public void debug(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.logLevel
            r1 = 3
            if (r0 < r1) goto L8
            android.util.Log.d(r3, r4)
        L8:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public void debug(java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
            r2 = this;
            int r0 = r2.logLevel
            r1 = 3
            if (r0 < r1) goto L8
            android.util.Log.d(r3, r4, r5)
        L8:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public void error(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.logLevel
            r1 = 1
            if (r0 < r1) goto L8
            android.util.Log.e(r3, r4)
        L8:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public void error(java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
            r2 = this;
            int r0 = r2.logLevel
            r1 = 1
            if (r0 < r1) goto L8
            android.util.Log.e(r3, r4, r5)
        L8:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public void exit() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            com.badlogic.gdx.backends.android.AndroidFragmentApplication$2 r1 = new com.badlogic.gdx.backends.android.AndroidFragmentApplication$2
            r1.<init>(r2)
            r0.post(r1)
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
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            android.view.Window r0 = r0.getWindow()
            return r0
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

    @Override // androidx.fragment.app.Fragment, com.badlogic.gdx.backends.android.AndroidApplicationBase
    public android.content.Context getContext() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
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
            com.badlogic.gdx.backends.android.AndroidGraphics r0 = r1.graphics
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public android.os.Handler getHandler() {
            r1 = this;
            android.os.Handler r0 = r1.handler
            return r0
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
            com.badlogic.gdx.backends.android.AndroidNet r0 = r1.f4net
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public com.badlogic.gdx.Preferences getPreferences(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.backends.android.AndroidPreferences r0 = new com.badlogic.gdx.backends.android.AndroidPreferences
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
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
            r2 = this;
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            return r0
    }

    public android.view.View initializeForView(com.badlogic.gdx.ApplicationListener r2) {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r0 = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
            r0.<init>()
            android.view.View r2 = r1.initializeForView(r2, r0)
            return r2
    }

    public android.view.View initializeForView(com.badlogic.gdx.ApplicationListener r3, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r4) {
            r2 = this;
            int r0 = r2.getVersion()
            r1 = 14
            if (r0 < r1) goto Lbb
            com.badlogic.gdx.utils.GdxNativesLoader.load()
            com.badlogic.gdx.backends.android.AndroidApplicationLogger r0 = new com.badlogic.gdx.backends.android.AndroidApplicationLogger
            r0.<init>()
            r2.setApplicationLogger(r0)
            com.badlogic.gdx.backends.android.AndroidGraphics r0 = new com.badlogic.gdx.backends.android.AndroidGraphics
            com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy r1 = r4.resolutionStrategy
            if (r1 != 0) goto L1e
            com.badlogic.gdx.backends.android.surfaceview.FillResolutionStrategy r1 = new com.badlogic.gdx.backends.android.surfaceview.FillResolutionStrategy
            r1.<init>()
        L1e:
            r0.<init>(r2, r4, r1)
            r2.graphics = r0
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            com.badlogic.gdx.backends.android.AndroidGraphics r1 = r2.graphics
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r1 = r1.view
            com.badlogic.gdx.backends.android.AndroidInput r0 = r2.createInput(r2, r0, r1, r4)
            r2.input = r0
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            com.badlogic.gdx.backends.android.AndroidAudio r0 = r2.createAudio(r0, r4)
            r2.audio = r0
            com.badlogic.gdx.backends.android.AndroidFiles r0 = r2.createFiles()
            r2.files = r0
            com.badlogic.gdx.backends.android.AndroidNet r0 = new com.badlogic.gdx.backends.android.AndroidNet
            r0.<init>(r2, r4)
            r2.f4net = r0
            r2.listener = r3
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r2.handler = r3
            com.badlogic.gdx.backends.android.AndroidClipboard r3 = new com.badlogic.gdx.backends.android.AndroidClipboard
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            r3.<init>(r0)
            r2.clipboard = r3
            com.badlogic.gdx.backends.android.AndroidFragmentApplication$1 r3 = new com.badlogic.gdx.backends.android.AndroidFragmentApplication$1
            r3.<init>(r2)
            r2.addLifecycleListener(r3)
            com.badlogic.gdx.Gdx.app = r2
            com.badlogic.gdx.backends.android.AndroidInput r3 = r2.mo17getInput()
            com.badlogic.gdx.Gdx.input = r3
            com.badlogic.gdx.Audio r3 = r2.getAudio()
            com.badlogic.gdx.Gdx.audio = r3
            com.badlogic.gdx.Files r3 = r2.getFiles()
            com.badlogic.gdx.Gdx.files = r3
            com.badlogic.gdx.Graphics r3 = r2.getGraphics()
            com.badlogic.gdx.Gdx.graphics = r3
            com.badlogic.gdx.Net r3 = r2.getNet()
            com.badlogic.gdx.Gdx.f1net = r3
            boolean r3 = r4.useWakelock
            r2.createWakeLock(r3)
            boolean r3 = r4.useImmersiveMode
            r2.useImmersiveMode(r3)
            boolean r3 = r4.useImmersiveMode
            if (r3 == 0) goto La2
            int r3 = r2.getVersion()
            r4 = 19
            if (r3 < r4) goto La2
            com.badlogic.gdx.backends.android.AndroidVisibilityListener r3 = new com.badlogic.gdx.backends.android.AndroidVisibilityListener
            r3.<init>()
            r3.createListener(r2)
        La2:
            android.content.res.Resources r3 = r2.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r4 = 1
            if (r3 == r4) goto Lb4
            com.badlogic.gdx.backends.android.AndroidInput r3 = r2.input
            r3.setKeyboardAvailable(r4)
        Lb4:
            com.badlogic.gdx.backends.android.AndroidGraphics r3 = r2.graphics
            android.view.View r3 = r3.getView()
            return r3
        Lbb:
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
            if (r0 < r1) goto L8
            android.util.Log.i(r3, r4)
        L8:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public void log(java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
            r2 = this;
            int r0 = r2.logLevel
            r1 = 2
            if (r0 < r1) goto L8
            android.util.Log.i(r3, r4, r5)
        L8:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
            r4 = this;
            super.onActivityResult(r5, r6, r7)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.backends.android.AndroidEventListener> r0 = r4.androidEventListeners
            monitor-enter(r0)
            r1 = 0
        L7:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.backends.android.AndroidEventListener> r2 = r4.androidEventListeners     // Catch: java.lang.Throwable -> L1b
            int r3 = r2.size     // Catch: java.lang.Throwable -> L1b
            if (r1 >= r3) goto L19
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L1b
            com.badlogic.gdx.backends.android.AndroidEventListener r2 = (com.badlogic.gdx.backends.android.AndroidEventListener) r2     // Catch: java.lang.Throwable -> L1b
            r2.onActivityResult(r5, r6, r7)     // Catch: java.lang.Throwable -> L1b
            int r1 = r1 + 1
            goto L7
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r5
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.badlogic.gdx.backends.android.AndroidFragmentApplication.Callbacks
            if (r0 == 0) goto La
            r0 = r2
            com.badlogic.gdx.backends.android.AndroidFragmentApplication$Callbacks r0 = (com.badlogic.gdx.backends.android.AndroidFragmentApplication.Callbacks) r0
            r1.callbacks = r0
            goto L2b
        La:
            androidx.fragment.app.Fragment r0 = r1.getParentFragment()
            boolean r0 = r0 instanceof com.badlogic.gdx.backends.android.AndroidFragmentApplication.Callbacks
            if (r0 == 0) goto L1b
            androidx.fragment.app.Fragment r0 = r1.getParentFragment()
            com.badlogic.gdx.backends.android.AndroidFragmentApplication$Callbacks r0 = (com.badlogic.gdx.backends.android.AndroidFragmentApplication.Callbacks) r0
            r1.callbacks = r0
            goto L2b
        L1b:
            androidx.fragment.app.Fragment r0 = r1.getTargetFragment()
            boolean r0 = r0 instanceof com.badlogic.gdx.backends.android.AndroidFragmentApplication.Callbacks
            if (r0 == 0) goto L2f
            androidx.fragment.app.Fragment r0 = r1.getTargetFragment()
            com.badlogic.gdx.backends.android.AndroidFragmentApplication$Callbacks r0 = (com.badlogic.gdx.backends.android.AndroidFragmentApplication.Callbacks) r0
            r1.callbacks = r0
        L2b:
            super.onAttach(r2)
            return
        L2f:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Missing AndroidFragmentApplication.Callbacks. Please implement AndroidFragmentApplication.Callbacks on the parent activity, fragment or target fragment."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            int r2 = r2.hardKeyboardHidden
            r0 = 1
            if (r2 != r0) goto L9
            goto La
        L9:
            r0 = 0
        La:
            com.badlogic.gdx.backends.android.AndroidInput r2 = r1.input
            r2.setKeyboardAvailable(r0)
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
            r1 = this;
            super.onDetach()
            r0 = 0
            r1.callbacks = r0
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
            r4 = this;
            com.badlogic.gdx.backends.android.AndroidGraphics r0 = r4.graphics
            boolean r0 = r0.isContinuousRendering()
            boolean r1 = com.badlogic.gdx.backends.android.AndroidGraphics.enforceContinuousRendering
            r2 = 1
            com.badlogic.gdx.backends.android.AndroidGraphics.enforceContinuousRendering = r2
            com.badlogic.gdx.backends.android.AndroidGraphics r3 = r4.graphics
            r3.setContinuousRendering(r2)
            com.badlogic.gdx.backends.android.AndroidGraphics r2 = r4.graphics
            r2.pause()
            com.badlogic.gdx.backends.android.AndroidInput r2 = r4.input
            r2.onPause()
            boolean r2 = r4.isRemoving()
            if (r2 != 0) goto L30
            boolean r2 = r4.isAnyParentFragmentRemoving()
            if (r2 != 0) goto L30
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            boolean r2 = r2.isFinishing()
            if (r2 == 0) goto L3a
        L30:
            com.badlogic.gdx.backends.android.AndroidGraphics r2 = r4.graphics
            r2.clearManagedCaches()
            com.badlogic.gdx.backends.android.AndroidGraphics r2 = r4.graphics
            r2.destroy()
        L3a:
            com.badlogic.gdx.backends.android.AndroidGraphics.enforceContinuousRendering = r1
            com.badlogic.gdx.backends.android.AndroidGraphics r1 = r4.graphics
            r1.setContinuousRendering(r0)
            com.badlogic.gdx.backends.android.AndroidGraphics r0 = r4.graphics
            r0.onPauseGLSurfaceView()
            super.onPause()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
            r1 = this;
            com.badlogic.gdx.Gdx.app = r1
            com.badlogic.gdx.backends.android.AndroidInput r0 = r1.mo17getInput()
            com.badlogic.gdx.Gdx.input = r0
            com.badlogic.gdx.Audio r0 = r1.getAudio()
            com.badlogic.gdx.Gdx.audio = r0
            com.badlogic.gdx.Files r0 = r1.getFiles()
            com.badlogic.gdx.Gdx.files = r0
            com.badlogic.gdx.Graphics r0 = r1.getGraphics()
            com.badlogic.gdx.Gdx.graphics = r0
            com.badlogic.gdx.Net r0 = r1.getNet()
            com.badlogic.gdx.Gdx.f1net = r0
            com.badlogic.gdx.backends.android.AndroidInput r0 = r1.input
            r0.onResume()
            com.badlogic.gdx.backends.android.AndroidGraphics r0 = r1.graphics
            if (r0 == 0) goto L2c
            r0.onResumeGLSurfaceView()
        L2c:
            boolean r0 = r1.firstResume
            if (r0 != 0) goto L36
            com.badlogic.gdx.backends.android.AndroidGraphics r0 = r1.graphics
            r0.resume()
            goto L39
        L36:
            r0 = 0
            r1.firstResume = r0
        L39:
            super.onResume()
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public void postRunnable(java.lang.Runnable r3) {
            r2 = this;
            com.badlogic.gdx.utils.Array<java.lang.Runnable> r0 = r2.runnables
            monitor-enter(r0)
            com.badlogic.gdx.utils.Array<java.lang.Runnable> r1 = r2.runnables     // Catch: java.lang.Throwable -> Lf
            r1.add(r3)     // Catch: java.lang.Throwable -> Lf
            com.badlogic.gdx.Graphics r3 = com.badlogic.gdx.Gdx.graphics     // Catch: java.lang.Throwable -> Lf
            r3.requestRendering()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    public void removeAndroidEventListener(com.badlogic.gdx.backends.android.AndroidEventListener r4) {
            r3 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.backends.android.AndroidEventListener> r0 = r3.androidEventListeners
            monitor-enter(r0)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.backends.android.AndroidEventListener> r1 = r3.androidEventListeners     // Catch: java.lang.Throwable -> Lb
            r2 = 1
            r1.removeValue(r4, r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r4
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
    public void runOnUiThread(java.lang.Runnable r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            r0.runOnUiThread(r2)
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
    @android.annotation.TargetApi(19)
    public void useImmersiveMode(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L16
            int r2 = r1.getVersion()
            r0 = 19
            if (r2 >= r0) goto Lb
            goto L16
        Lb:
            com.badlogic.gdx.backends.android.AndroidGraphics r2 = r1.graphics
            android.view.View r2 = r2.getView()
            r0 = 5894(0x1706, float:8.259E-42)
            r2.setSystemUiVisibility(r0)
        L16:
            return
    }
}
