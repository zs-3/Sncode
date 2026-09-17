package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidApplicationLogger implements com.badlogic.gdx.ApplicationLogger {
    public AndroidApplicationLogger() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.ApplicationLogger
    public void debug(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            android.util.Log.d(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.ApplicationLogger
    public void debug(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            android.util.Log.d(r1, r2, r3)
            return
    }

    @Override // com.badlogic.gdx.ApplicationLogger
    public void error(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            android.util.Log.e(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.ApplicationLogger
    public void error(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            android.util.Log.e(r1, r2, r3)
            return
    }

    @Override // com.badlogic.gdx.ApplicationLogger
    public void log(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            android.util.Log.i(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.ApplicationLogger
    public void log(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            android.util.Log.i(r1, r2, r3)
            return
    }
}
