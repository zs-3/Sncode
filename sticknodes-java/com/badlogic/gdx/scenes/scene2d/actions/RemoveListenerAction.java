package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class RemoveListenerAction extends com.badlogic.gdx.scenes.scene2d.Action {
    private boolean capture;
    private com.badlogic.gdx.scenes.scene2d.EventListener listener;

    public RemoveListenerAction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public boolean act(float r2) {
            r1 = this;
            boolean r2 = r1.capture
            if (r2 == 0) goto Lc
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r1.target
            com.badlogic.gdx.scenes.scene2d.EventListener r0 = r1.listener
            r2.removeCaptureListener(r0)
            goto L13
        Lc:
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r1.target
            com.badlogic.gdx.scenes.scene2d.EventListener r0 = r1.listener
            r2.removeListener(r0)
        L13:
            r2 = 1
            return r2
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            super.reset()
            r0 = 0
            r1.listener = r0
            return
    }

    public void setCapture(boolean r1) {
            r0 = this;
            r0.capture = r1
            return
    }

    public void setListener(com.badlogic.gdx.scenes.scene2d.EventListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
