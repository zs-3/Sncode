package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AsynchronousSound implements com.badlogic.gdx.audio.Sound {
    private final android.os.Handler handler;
    private final com.badlogic.gdx.audio.Sound sound;








    public AsynchronousSound(com.badlogic.gdx.audio.Sound r1, android.os.Handler r2) {
            r0 = this;
            r0.<init>()
            r0.sound = r1
            r0.handler = r2
            return
    }

    static /* synthetic */ com.badlogic.gdx.audio.Sound access$000(com.badlogic.gdx.backends.android.AsynchronousSound r0) {
            com.badlogic.gdx.audio.Sound r0 = r0.sound
            return r0
    }

    @Override // com.badlogic.gdx.audio.Sound, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            com.badlogic.gdx.audio.Sound r0 = r1.sound
            r0.dispose()
            return
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long loop() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            com.badlogic.gdx.backends.android.AsynchronousSound$4 r1 = new com.badlogic.gdx.backends.android.AsynchronousSound$4
            r1.<init>(r2)
            r0.post(r1)
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long loop(float r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            com.badlogic.gdx.backends.android.AsynchronousSound$5 r1 = new com.badlogic.gdx.backends.android.AsynchronousSound$5
            r1.<init>(r2, r3)
            r0.post(r1)
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long loop(float r3, float r4, float r5) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            com.badlogic.gdx.backends.android.AsynchronousSound$6 r1 = new com.badlogic.gdx.backends.android.AsynchronousSound$6
            r1.<init>(r2, r3, r4, r5)
            r0.post(r1)
            r3 = 0
            return r3
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void pause() {
            r1 = this;
            com.badlogic.gdx.audio.Sound r0 = r1.sound
            r0.pause()
            return
    }

    public void pause(long r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Asynchronous audio doesn't support sound id based operations."
            r1.<init>(r2)
            throw r1
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long play() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            com.badlogic.gdx.backends.android.AsynchronousSound$1 r1 = new com.badlogic.gdx.backends.android.AsynchronousSound$1
            r1.<init>(r2)
            r0.post(r1)
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long play(float r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            com.badlogic.gdx.backends.android.AsynchronousSound$2 r1 = new com.badlogic.gdx.backends.android.AsynchronousSound$2
            r1.<init>(r2, r3)
            r0.post(r1)
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long play(float r3, float r4, float r5) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            com.badlogic.gdx.backends.android.AsynchronousSound$3 r1 = new com.badlogic.gdx.backends.android.AsynchronousSound$3
            r1.<init>(r2, r3, r4, r5)
            r0.post(r1)
            r3 = 0
            return r3
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void resume() {
            r1 = this;
            com.badlogic.gdx.audio.Sound r0 = r1.sound
            r0.resume()
            return
    }

    public void resume(long r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Asynchronous audio doesn't support sound id based operations."
            r1.<init>(r2)
            throw r1
    }

    public void setLooping(long r1, boolean r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Asynchronous audio doesn't support sound id based operations."
            r1.<init>(r2)
            throw r1
    }

    public void setPan(long r1, float r3, float r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Asynchronous audio doesn't support sound id based operations."
            r1.<init>(r2)
            throw r1
    }

    public void setPitch(long r1, float r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Asynchronous audio doesn't support sound id based operations."
            r1.<init>(r2)
            throw r1
    }

    public void setVolume(long r1, float r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Asynchronous audio doesn't support sound id based operations."
            r1.<init>(r2)
            throw r1
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void stop() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            com.badlogic.gdx.backends.android.AsynchronousSound$7 r1 = new com.badlogic.gdx.backends.android.AsynchronousSound$7
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public void stop(long r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Asynchronous audio doesn't support sound id based operations."
            r1.<init>(r2)
            throw r1
    }
}
