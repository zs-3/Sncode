package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class MoveByAction extends com.badlogic.gdx.scenes.scene2d.actions.RelativeTemporalAction {
    private float amountX;
    private float amountY;

    public MoveByAction() {
            r0 = this;
            r0.<init>()
            return
    }

    public void setAmount(float r1, float r2) {
            r0 = this;
            r0.amountX = r1
            r0.amountY = r2
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.RelativeTemporalAction
    protected void updateRelative(float r4) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r3.target
            float r1 = r3.amountX
            float r1 = r1 * r4
            float r2 = r3.amountY
            float r2 = r2 * r4
            r0.moveBy(r1, r2)
            return
    }
}
