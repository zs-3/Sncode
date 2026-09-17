package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public interface InputProcessorLW extends com.badlogic.gdx.InputProcessor {
    @Override // com.badlogic.gdx.InputProcessor
    /* synthetic */ boolean keyDown(int r1);

    @Override // com.badlogic.gdx.InputProcessor
    /* synthetic */ boolean keyTyped(char r1);

    @Override // com.badlogic.gdx.InputProcessor
    /* synthetic */ boolean keyUp(int r1);

    @Override // com.badlogic.gdx.InputProcessor
    /* synthetic */ boolean mouseMoved(int r1, int r2);

    @Override // com.badlogic.gdx.InputProcessor
    /* synthetic */ boolean scrolled(float r1, float r2);

    @Override // com.badlogic.gdx.InputProcessor
    /* synthetic */ boolean touchCancelled(int r1, int r2, int r3, int r4);

    @Override // com.badlogic.gdx.InputProcessor
    /* synthetic */ boolean touchDown(int r1, int r2, int r3, int r4);

    @Override // com.badlogic.gdx.InputProcessor
    /* synthetic */ boolean touchDragged(int r1, int r2, int r3);

    void touchDrop(int r1, int r2);

    @Override // com.badlogic.gdx.InputProcessor
    /* synthetic */ boolean touchUp(int r1, int r2, int r3, int r4);
}
