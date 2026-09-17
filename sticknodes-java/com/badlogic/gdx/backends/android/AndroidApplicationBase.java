package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public interface AndroidApplicationBase extends com.badlogic.gdx.Application {
    public static final int MINIMUM_SDK = 14;

    @Override // com.badlogic.gdx.Application
    /* synthetic */ void addLifecycleListener(com.badlogic.gdx.LifecycleListener r1);

    com.badlogic.gdx.backends.android.AndroidAudio createAudio(android.content.Context r1, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r2);

    com.badlogic.gdx.backends.android.AndroidInput createInput(com.badlogic.gdx.Application r1, android.content.Context r2, java.lang.Object r3, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r4);

    @Override // com.badlogic.gdx.Application
    /* synthetic */ void debug(java.lang.String r1, java.lang.String r2);

    /* synthetic */ void debug(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3);

    @Override // com.badlogic.gdx.Application
    /* synthetic */ void error(java.lang.String r1, java.lang.String r2);

    @Override // com.badlogic.gdx.Application
    /* synthetic */ void error(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3);

    @Override // com.badlogic.gdx.Application
    /* synthetic */ void exit();

    @Override // com.badlogic.gdx.Application
    /* synthetic */ com.badlogic.gdx.ApplicationListener getApplicationListener();

    /* synthetic */ com.badlogic.gdx.ApplicationLogger getApplicationLogger();

    android.view.Window getApplicationWindow();

    /* synthetic */ com.badlogic.gdx.Audio getAudio();

    @Override // com.badlogic.gdx.Application
    /* synthetic */ com.badlogic.gdx.utils.Clipboard getClipboard();

    android.content.Context getContext();

    com.badlogic.gdx.utils.Array<java.lang.Runnable> getExecutedRunnables();

    /* synthetic */ com.badlogic.gdx.Files getFiles();

    @Override // com.badlogic.gdx.Application
    /* synthetic */ com.badlogic.gdx.Graphics getGraphics();

    android.os.Handler getHandler();

    /* synthetic */ com.badlogic.gdx.Input getInput();

    /* renamed from: getInput */
    com.badlogic.gdx.backends.android.AndroidInput mo17getInput();

    @Override // com.badlogic.gdx.Application
    /* synthetic */ long getJavaHeap();

    com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.LifecycleListener> getLifecycleListeners();

    /* synthetic */ int getLogLevel();

    /* synthetic */ long getNativeHeap();

    /* synthetic */ com.badlogic.gdx.Net getNet();

    @Override // com.badlogic.gdx.Application
    /* synthetic */ com.badlogic.gdx.Preferences getPreferences(java.lang.String r1);

    com.badlogic.gdx.utils.Array<java.lang.Runnable> getRunnables();

    @Override // com.badlogic.gdx.Application
    /* synthetic */ com.badlogic.gdx.Application.ApplicationType getType();

    /* synthetic */ int getVersion();

    android.view.WindowManager getWindowManager();

    @Override // com.badlogic.gdx.Application
    /* synthetic */ void log(java.lang.String r1, java.lang.String r2);

    /* synthetic */ void log(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3);

    @Override // com.badlogic.gdx.Application
    /* synthetic */ void postRunnable(java.lang.Runnable r1);

    @Override // com.badlogic.gdx.Application
    /* synthetic */ void removeLifecycleListener(com.badlogic.gdx.LifecycleListener r1);

    void runOnUiThread(java.lang.Runnable r1);

    /* synthetic */ void setApplicationLogger(com.badlogic.gdx.ApplicationLogger r1);

    /* synthetic */ void setLogLevel(int r1);

    void startActivity(android.content.Intent r1);

    void useImmersiveMode(boolean r1);
}
