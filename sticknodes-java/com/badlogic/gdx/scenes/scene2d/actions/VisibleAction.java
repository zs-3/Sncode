package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class VisibleAction extends com.badlogic.gdx.scenes.scene2d.Action {
    private boolean visible;

    public VisibleAction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public boolean act(float r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r1.target
            boolean r0 = r1.visible
            r2.setVisible(r0)
            r2 = 1
            return r2
    }

    public void setVisible(boolean r1) {
            r0 = this;
            r0.visible = r1
            return
    }
}
