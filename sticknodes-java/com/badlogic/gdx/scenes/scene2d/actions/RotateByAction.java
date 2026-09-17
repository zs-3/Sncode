package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class RotateByAction extends com.badlogic.gdx.scenes.scene2d.actions.RelativeTemporalAction {
    private float amount;

    public RotateByAction() {
            r0 = this;
            r0.<init>()
            return
    }

    public void setAmount(float r1) {
            r0 = this;
            r0.amount = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.RelativeTemporalAction
    protected void updateRelative(float r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r2.target
            float r1 = r2.amount
            float r1 = r1 * r3
            r0.rotateBy(r1)
            return
    }
}
