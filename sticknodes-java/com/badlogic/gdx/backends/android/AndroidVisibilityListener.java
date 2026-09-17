package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidVisibilityListener {


    public AndroidVisibilityListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public void createListener(com.badlogic.gdx.backends.android.AndroidApplicationBase r4) {
            r3 = this;
            android.view.Window r0 = r4.getApplicationWindow()     // Catch: java.lang.Throwable -> L11
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> L11
            com.badlogic.gdx.backends.android.AndroidVisibilityListener$1 r1 = new com.badlogic.gdx.backends.android.AndroidVisibilityListener$1     // Catch: java.lang.Throwable -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11
            r0.setOnSystemUiVisibilityChangeListener(r1)     // Catch: java.lang.Throwable -> L11
            goto L19
        L11:
            r0 = move-exception
            java.lang.String r1 = "AndroidApplication"
            java.lang.String r2 = "Can't create OnSystemUiVisibilityChangeListener, unable to use immersive mode."
            r4.log(r1, r2, r0)
        L19:
            return
    }
}
