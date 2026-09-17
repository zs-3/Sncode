package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class RepeatAction extends com.badlogic.gdx.scenes.scene2d.actions.DelegateAction {
    private int executedCount;
    private boolean finished;
    private int repeatCount;

    public RepeatAction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.DelegateAction
    protected boolean delegate(float r4) {
            r3 = this;
            int r0 = r3.executedCount
            int r1 = r3.repeatCount
            r2 = 1
            if (r0 != r1) goto L8
            return r2
        L8:
            com.badlogic.gdx.scenes.scene2d.Action r0 = r3.action
            boolean r4 = r0.act(r4)
            if (r4 == 0) goto L2a
            boolean r4 = r3.finished
            if (r4 == 0) goto L15
            return r2
        L15:
            int r4 = r3.repeatCount
            if (r4 <= 0) goto L1e
            int r0 = r3.executedCount
            int r0 = r0 + r2
            r3.executedCount = r0
        L1e:
            int r0 = r3.executedCount
            if (r0 != r4) goto L23
            return r2
        L23:
            com.badlogic.gdx.scenes.scene2d.Action r4 = r3.action
            if (r4 == 0) goto L2a
            r4.restart()
        L2a:
            r4 = 0
            return r4
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.DelegateAction, com.badlogic.gdx.scenes.scene2d.Action
    public void restart() {
            r1 = this;
            super.restart()
            r0 = 0
            r1.executedCount = r0
            r1.finished = r0
            return
    }

    public void setCount(int r1) {
            r0 = this;
            r0.repeatCount = r1
            return
    }
}
