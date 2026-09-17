package com.badlogic.gdx.audio;

/* loaded from: classes.dex */
public interface Music extends com.badlogic.gdx.utils.Disposable {

    public interface OnCompletionListener {
        void onCompletion(com.badlogic.gdx.audio.Music r1);
    }

    @Override // com.badlogic.gdx.utils.Disposable
    void dispose();

    float getVolume();

    boolean isPlaying();

    void play();

    void setLooping(boolean r1);

    void setVolume(float r1);

    void stop();
}
