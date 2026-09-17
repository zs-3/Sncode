package com.badlogic.gdx;

/* loaded from: classes.dex */
public interface InputProcessor {
    boolean keyDown(int r1);

    boolean keyTyped(char r1);

    boolean keyUp(int r1);

    boolean mouseMoved(int r1, int r2);

    boolean scrolled(float r1, float r2);

    boolean touchCancelled(int r1, int r2, int r3, int r4);

    boolean touchDown(int r1, int r2, int r3, int r4);

    boolean touchDragged(int r1, int r2, int r3);

    boolean touchUp(int r1, int r2, int r3, int r4);
}
