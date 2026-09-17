package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public abstract class DelegateAction extends com.badlogic.gdx.scenes.scene2d.Action {
    protected com.badlogic.gdx.scenes.scene2d.Action action;

    public DelegateAction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public final boolean act(float r3) {
            r2 = this;
            com.badlogic.gdx.utils.Pool r0 = r2.getPool()
            r1 = 0
            r2.setPool(r1)
            boolean r3 = r2.delegate(r3)     // Catch: java.lang.Throwable -> L10
            r2.setPool(r0)
            return r3
        L10:
            r3 = move-exception
            r2.setPool(r0)
            throw r3
    }

    protected abstract boolean delegate(float r1);

    @Override // com.badlogic.gdx.scenes.scene2d.Action, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            super.reset()
            r0 = 0
            r1.action = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public void restart() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Action r0 = r1.action
            if (r0 == 0) goto L7
            r0.restart()
        L7:
            return
    }

    public void setAction(com.badlogic.gdx.scenes.scene2d.Action r1) {
            r0 = this;
            r0.action = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public void setActor(com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Action r0 = r1.action
            if (r0 == 0) goto L7
            r0.setActor(r2)
        L7:
            super.setActor(r2)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public void setTarget(com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Action r0 = r1.action
            if (r0 == 0) goto L7
            r0.setTarget(r2)
        L7:
            super.setTarget(r2)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            com.badlogic.gdx.scenes.scene2d.Action r1 = r3.action
            if (r1 != 0) goto L13
            java.lang.String r1 = ""
            goto L2b
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "("
            r1.append(r2)
            com.badlogic.gdx.scenes.scene2d.Action r2 = r3.action
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L2b:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
