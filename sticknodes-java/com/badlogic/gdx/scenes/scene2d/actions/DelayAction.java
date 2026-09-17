package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class DelayAction extends com.badlogic.gdx.scenes.scene2d.actions.DelegateAction {
    private float duration;
    private float time;

    public DelayAction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.DelegateAction
    protected boolean delegate(float r4) {
            r3 = this;
            float r0 = r3.time
            float r1 = r3.duration
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L13
            float r0 = r0 + r4
            r3.time = r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 >= 0) goto L11
            r4 = 0
            return r4
        L11:
            float r4 = r0 - r1
        L13:
            com.badlogic.gdx.scenes.scene2d.Action r0 = r3.action
            if (r0 != 0) goto L19
            r4 = 1
            return r4
        L19:
            boolean r4 = r0.act(r4)
            return r4
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.DelegateAction, com.badlogic.gdx.scenes.scene2d.Action
    public void restart() {
            r1 = this;
            super.restart()
            r0 = 0
            r1.time = r0
            return
    }

    public void setDuration(float r1) {
            r0 = this;
            r0.duration = r1
            return
    }
}
