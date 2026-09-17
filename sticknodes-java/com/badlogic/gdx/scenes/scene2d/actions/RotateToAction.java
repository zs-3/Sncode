package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class RotateToAction extends com.badlogic.gdx.scenes.scene2d.actions.TemporalAction {
    private float end;
    private float start;
    private boolean useShortestDirection;

    public RotateToAction() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.useShortestDirection = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    protected void begin() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.target
            float r0 = r0.getRotation()
            r1.start = r0
            return
    }

    public void setRotation(float r1) {
            r0 = this;
            r0.end = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    protected void update(float r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L8
            float r3 = r2.start
            goto L27
        L8:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L11
            float r3 = r2.end
            goto L27
        L11:
            boolean r0 = r2.useShortestDirection
            if (r0 == 0) goto L1e
            float r0 = r2.start
            float r1 = r2.end
            float r3 = com.badlogic.gdx.math.MathUtils.lerpAngleDeg(r0, r1, r3)
            goto L27
        L1e:
            float r0 = r2.start
            float r1 = r2.end
            float r1 = r1 - r0
            float r1 = r1 * r3
            float r3 = r0 + r1
        L27:
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r2.target
            r0.setRotation(r3)
            return
    }
}
