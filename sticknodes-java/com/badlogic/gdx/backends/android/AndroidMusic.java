package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidMusic implements com.badlogic.gdx.audio.Music, android.media.MediaPlayer.OnCompletionListener {
    private final com.badlogic.gdx.backends.android.AndroidAudio audio;
    private boolean isPrepared;
    protected com.badlogic.gdx.audio.Music.OnCompletionListener onCompletionListener;
    private android.media.MediaPlayer player;
    private float volume;
    protected boolean wasPlaying;


    AndroidMusic(com.badlogic.gdx.backends.android.AndroidAudio r2, android.media.MediaPlayer r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.isPrepared = r0
            r0 = 0
            r1.wasPlaying = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.volume = r0
            r1.audio = r2
            r1.player = r3
            r2 = 0
            r1.onCompletionListener = r2
            r3.setOnCompletionListener(r1)
            return
    }

    @Override // com.badlogic.gdx.audio.Music, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            android.media.MediaPlayer r0 = r4.player
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r0.release()     // Catch: java.lang.Throwable -> L13
        L9:
            r4.player = r1
            r4.onCompletionListener = r1
            com.badlogic.gdx.backends.android.AndroidAudio r0 = r4.audio
            r0.notifyMusicDisposed(r4)
            goto L1d
        L13:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "AndroidMusic"
            java.lang.String r3 = "error while disposing AndroidMusic instance, non-fatal"
            r0.log(r2, r3)     // Catch: java.lang.Throwable -> L1e
            goto L9
        L1d:
            return
        L1e:
            r0 = move-exception
            r4.player = r1
            r4.onCompletionListener = r1
            com.badlogic.gdx.backends.android.AndroidAudio r1 = r4.audio
            r1.notifyMusicDisposed(r4)
            throw r0
    }

    public float getDuration() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.player
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getDuration()
            float r0 = (float) r0
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r1
            return r0
    }

    public float getPosition() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.player
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getCurrentPosition()
            float r0 = (float) r0
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r1
            return r0
    }

    @Override // com.badlogic.gdx.audio.Music
    public float getVolume() {
            r1 = this;
            float r0 = r1.volume
            return r0
    }

    public boolean isLooping() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.player
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.isLooping()     // Catch: java.lang.IllegalStateException -> Lb
            return r0
        Lb:
            r0 = move-exception
            r0.printStackTrace()
            return r1
    }

    @Override // com.badlogic.gdx.audio.Music
    public boolean isPlaying() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.player
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.isPlaying()     // Catch: java.lang.IllegalStateException -> Lb
            return r0
        Lb:
            r0 = move-exception
            r0.printStackTrace()
            return r1
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer r2) {
            r1 = this;
            com.badlogic.gdx.audio.Music$OnCompletionListener r2 = r1.onCompletionListener
            if (r2 == 0) goto Le
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.backends.android.AndroidMusic$1 r0 = new com.badlogic.gdx.backends.android.AndroidMusic$1
            r0.<init>(r1)
            r2.postRunnable(r0)
        Le:
            return
    }

    public void pause() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.player
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r0.isPlaying()     // Catch: java.lang.IllegalStateException -> L11
            if (r0 == 0) goto L15
            android.media.MediaPlayer r0 = r1.player     // Catch: java.lang.IllegalStateException -> L11
            r0.pause()     // Catch: java.lang.IllegalStateException -> L11
            goto L15
        L11:
            r0 = move-exception
            r0.printStackTrace()
        L15:
            r0 = 0
            r1.wasPlaying = r0
            return
    }

    @Override // com.badlogic.gdx.audio.Music
    public void play() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.player
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r2.isPrepared     // Catch: java.io.IOException -> L15 java.lang.IllegalStateException -> L1a
            if (r1 != 0) goto Lf
            r0.prepare()     // Catch: java.io.IOException -> L15 java.lang.IllegalStateException -> L1a
            r0 = 1
            r2.isPrepared = r0     // Catch: java.io.IOException -> L15 java.lang.IllegalStateException -> L1a
        Lf:
            android.media.MediaPlayer r0 = r2.player     // Catch: java.io.IOException -> L15 java.lang.IllegalStateException -> L1a
            r0.start()     // Catch: java.io.IOException -> L15 java.lang.IllegalStateException -> L1a
            goto L1e
        L15:
            r0 = move-exception
            r0.printStackTrace()
            goto L1e
        L1a:
            r0 = move-exception
            r0.printStackTrace()
        L1e:
            return
    }

    @Override // com.badlogic.gdx.audio.Music
    public void setLooping(boolean r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.player
            if (r0 != 0) goto L5
            return
        L5:
            r0.setLooping(r2)
            return
    }

    public void setOnCompletionListener(com.badlogic.gdx.audio.Music.OnCompletionListener r1) {
            r0 = this;
            r0.onCompletionListener = r1
            return
    }

    public void setPan(float r4, float r5) {
            r3 = this;
            android.media.MediaPlayer r0 = r3.player
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto L16
            float r4 = java.lang.Math.abs(r4)
            float r0 = r0 - r4
            float r0 = r0 * r5
            r4 = r0
            r0 = r5
            goto L25
        L16:
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L23
            float r4 = java.lang.Math.abs(r4)
            float r0 = r0 - r4
            float r0 = r0 * r5
            r4 = r5
            goto L25
        L23:
            r4 = r5
            r0 = r4
        L25:
            android.media.MediaPlayer r1 = r3.player
            r1.setVolume(r0, r4)
            r3.volume = r5
            return
    }

    public void setPosition(float r3) {
            r2 = this;
            android.media.MediaPlayer r0 = r2.player
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r2.isPrepared     // Catch: java.io.IOException -> L1a java.lang.IllegalStateException -> L1f
            if (r1 != 0) goto Lf
            r0.prepare()     // Catch: java.io.IOException -> L1a java.lang.IllegalStateException -> L1f
            r0 = 1
            r2.isPrepared = r0     // Catch: java.io.IOException -> L1a java.lang.IllegalStateException -> L1f
        Lf:
            android.media.MediaPlayer r0 = r2.player     // Catch: java.io.IOException -> L1a java.lang.IllegalStateException -> L1f
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 * r1
            int r3 = (int) r3     // Catch: java.io.IOException -> L1a java.lang.IllegalStateException -> L1f
            r0.seekTo(r3)     // Catch: java.io.IOException -> L1a java.lang.IllegalStateException -> L1f
            goto L23
        L1a:
            r3 = move-exception
            r3.printStackTrace()
            goto L23
        L1f:
            r3 = move-exception
            r3.printStackTrace()
        L23:
            return
    }

    @Override // com.badlogic.gdx.audio.Music
    public void setVolume(float r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.player
            if (r0 != 0) goto L5
            return
        L5:
            r0.setVolume(r2, r2)
            r1.volume = r2
            return
    }

    @Override // com.badlogic.gdx.audio.Music
    public void stop() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.player
            if (r0 != 0) goto L5
            return
        L5:
            r0.stop()
            r0 = 0
            r1.isPrepared = r0
            return
    }
}
