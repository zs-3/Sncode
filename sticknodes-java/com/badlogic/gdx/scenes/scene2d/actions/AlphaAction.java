package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class AlphaAction extends com.badlogic.gdx.scenes.scene2d.actions.TemporalAction {
    private com.badlogic.gdx.graphics.Color color;
    private float end;
    private float start;

    public AlphaAction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    protected void begin() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            if (r0 != 0) goto Lc
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.target
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            r1.color = r0
        Lc:
            com.badlogic.gdx.graphics.Color r0 = r1.color
            float r0 = r0.a
            r1.start = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction, com.badlogic.gdx.scenes.scene2d.Action, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            super.reset()
            r0 = 0
            r1.color = r0
            return
    }

    public void setAlpha(float r1) {
            r0 = this;
            r0.end = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    protected void update(float r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            com.badlogic.gdx.graphics.Color r4 = r3.color
            float r0 = r3.start
            r4.a = r0
            goto L25
        Lc:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L19
            com.badlogic.gdx.graphics.Color r4 = r3.color
            float r0 = r3.end
            r4.a = r0
            goto L25
        L19:
            com.badlogic.gdx.graphics.Color r0 = r3.color
            float r1 = r3.start
            float r2 = r3.end
            float r2 = r2 - r1
            float r2 = r2 * r4
            float r1 = r1 + r2
            r0.a = r1
        L25:
            return
    }
}
