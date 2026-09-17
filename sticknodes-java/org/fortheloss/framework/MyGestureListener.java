package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class MyGestureListener implements com.badlogic.gdx.input.GestureDetector.GestureListener {
    public float initialX;
    public float initialY;

    public MyGestureListener() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
    public boolean fling(float r1, float r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
    public boolean longPress(float r1, float r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
    public boolean pan(float r1, float r2, float r3, float r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
    public boolean panStop(float r1, float r2, int r3, int r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
    public boolean pinch(com.badlogic.gdx.math.Vector2 r1, com.badlogic.gdx.math.Vector2 r2, com.badlogic.gdx.math.Vector2 r3, com.badlogic.gdx.math.Vector2 r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
    public void pinchStop() {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
    public boolean tap(float r1, float r2, int r3, int r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
    public boolean touchDown(float r1, float r2, int r3, int r4) {
            r0 = this;
            if (r3 != 0) goto L6
            r0.initialX = r1
            r0.initialY = r2
        L6:
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
    public boolean zoom(float r1, float r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
