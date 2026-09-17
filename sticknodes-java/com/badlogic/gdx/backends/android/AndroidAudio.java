package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public interface AndroidAudio extends com.badlogic.gdx.Audio, com.badlogic.gdx.utils.Disposable {
    @Override // com.badlogic.gdx.utils.Disposable
    /* synthetic */ void dispose();

    /* synthetic */ java.lang.String[] getAvailableOutputDevices();

    /* synthetic */ com.badlogic.gdx.audio.AudioDevice newAudioDevice(int r1, boolean r2);

    /* synthetic */ com.badlogic.gdx.audio.AudioRecorder newAudioRecorder(int r1, boolean r2);

    @Override // com.badlogic.gdx.Audio
    /* synthetic */ com.badlogic.gdx.audio.Music newMusic(com.badlogic.gdx.files.FileHandle r1);

    @Override // com.badlogic.gdx.Audio
    /* synthetic */ com.badlogic.gdx.audio.Sound newSound(com.badlogic.gdx.files.FileHandle r1);

    void notifyMusicDisposed(com.badlogic.gdx.backends.android.AndroidMusic r1);

    void pause();

    void resume();

    /* synthetic */ boolean switchOutputDevice(java.lang.String r1);
}
