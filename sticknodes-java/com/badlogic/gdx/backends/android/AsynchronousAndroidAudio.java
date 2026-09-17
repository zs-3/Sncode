package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AsynchronousAndroidAudio extends com.badlogic.gdx.backends.android.DefaultAndroidAudio {
    private final android.os.Handler handler;
    private final android.os.HandlerThread handlerThread;

    public AsynchronousAndroidAudio(android.content.Context r1, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r2) {
            r0 = this;
            r0.<init>(r1, r2)
            boolean r1 = r2.disableAudio
            if (r1 != 0) goto L1f
            android.os.HandlerThread r1 = new android.os.HandlerThread
            java.lang.String r2 = "libGDX Sound Management"
            r1.<init>(r2)
            r0.handlerThread = r1
            r1.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r1 = r1.getLooper()
            r2.<init>(r1)
            r0.handler = r2
            goto L24
        L1f:
            r1 = 0
            r0.handler = r1
            r0.handlerThread = r1
        L24:
            return
    }

    @Override // com.badlogic.gdx.backends.android.DefaultAndroidAudio, com.badlogic.gdx.backends.android.AndroidAudio, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            super.dispose()
            android.os.HandlerThread r0 = r1.handlerThread
            if (r0 == 0) goto La
            r0.quit()
        La:
            return
    }

    @Override // com.badlogic.gdx.backends.android.DefaultAndroidAudio, com.badlogic.gdx.backends.android.AndroidAudio, com.badlogic.gdx.Audio
    public com.badlogic.gdx.audio.Sound newSound(com.badlogic.gdx.files.FileHandle r3) {
            r2 = this;
            com.badlogic.gdx.audio.Sound r3 = super.newSound(r3)
            com.badlogic.gdx.backends.android.AsynchronousSound r0 = new com.badlogic.gdx.backends.android.AsynchronousSound
            android.os.Handler r1 = r2.handler
            r0.<init>(r3, r1)
            return r0
    }
}
