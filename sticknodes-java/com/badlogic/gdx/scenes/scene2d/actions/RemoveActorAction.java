package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class RemoveActorAction extends com.badlogic.gdx.scenes.scene2d.Action {
    private boolean removed;

    public RemoveActorAction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public boolean act(float r2) {
            r1 = this;
            boolean r2 = r1.removed
            r0 = 1
            if (r2 != 0) goto Lc
            r1.removed = r0
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r1.target
            r2.remove()
        Lc:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public void restart() {
            r1 = this;
            r0 = 0
            r1.removed = r0
            return
    }
}
