package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class ScaleToAction extends com.badlogic.gdx.scenes.scene2d.actions.TemporalAction {
    private float endX;
    private float endY;
    private float startX;
    private float startY;

    public ScaleToAction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    protected void begin() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.target
            float r0 = r0.getScaleX()
            r1.startX = r0
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.target
            float r0 = r0.getScaleY()
            r1.startY = r0
            return
    }

    public void setScale(float r1, float r2) {
            r0 = this;
            r0.endX = r1
            r0.endY = r2
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    protected void update(float r5) {
            r4 = this;
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto La
            float r5 = r4.startX
            float r0 = r4.startY
            goto L29
        La:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L15
            float r5 = r4.endX
            float r0 = r4.endY
            goto L29
        L15:
            float r0 = r4.startX
            float r1 = r4.endX
            float r1 = r1 - r0
            float r1 = r1 * r5
            float r0 = r0 + r1
            float r1 = r4.startY
            float r2 = r4.endY
            float r2 = r2 - r1
            float r2 = r2 * r5
            float r5 = r1 + r2
            r3 = r0
            r0 = r5
            r5 = r3
        L29:
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r4.target
            r1.setScale(r5, r0)
            return
    }
}
