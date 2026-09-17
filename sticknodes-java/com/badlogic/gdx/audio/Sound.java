package com.badlogic.gdx.audio;

/* loaded from: classes.dex */
public interface Sound extends com.badlogic.gdx.utils.Disposable {
    @Override // com.badlogic.gdx.utils.Disposable
    void dispose();

    long loop();

    long loop(float r1);

    long loop(float r1, float r2, float r3);

    void pause();

    long play();

    long play(float r1);

    long play(float r1, float r2, float r3);

    void resume();

    void stop();
}
