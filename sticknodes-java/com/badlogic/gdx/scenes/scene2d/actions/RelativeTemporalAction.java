package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public abstract class RelativeTemporalAction extends com.badlogic.gdx.scenes.scene2d.actions.TemporalAction {
    private float lastPercent;

    public RelativeTemporalAction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    protected void begin() {
            r1 = this;
            r0 = 0
            r1.lastPercent = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    protected void update(float r2) {
            r1 = this;
            float r0 = r1.lastPercent
            float r0 = r2 - r0
            r1.updateRelative(r0)
            r1.lastPercent = r2
            return
    }

    protected abstract void updateRelative(float r1);
}
