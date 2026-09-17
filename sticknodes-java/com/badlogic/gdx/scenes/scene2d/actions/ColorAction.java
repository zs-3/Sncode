package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class ColorAction extends com.badlogic.gdx.scenes.scene2d.actions.TemporalAction {
    private com.badlogic.gdx.graphics.Color color;
    private final com.badlogic.gdx.graphics.Color end;
    private float startA;
    private float startB;
    private float startG;
    private float startR;

    public ColorAction() {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r1.end = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    protected void begin() {
            r2 = this;
            com.badlogic.gdx.graphics.Color r0 = r2.color
            if (r0 != 0) goto Lc
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r2.target
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            r2.color = r0
        Lc:
            com.badlogic.gdx.graphics.Color r0 = r2.color
            float r1 = r0.r
            r2.startR = r1
            float r1 = r0.g
            r2.startG = r1
            float r1 = r0.b
            r2.startB = r1
            float r0 = r0.a
            r2.startA = r0
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

    public void setEndColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.end
            r0.set(r2)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    protected void update(float r6) {
            r5 = this;
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L13
            com.badlogic.gdx.graphics.Color r6 = r5.color
            float r0 = r5.startR
            float r1 = r5.startG
            float r2 = r5.startB
            float r3 = r5.startA
            r6.set(r0, r1, r2, r3)
            goto L48
        L13:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L21
            com.badlogic.gdx.graphics.Color r6 = r5.color
            com.badlogic.gdx.graphics.Color r0 = r5.end
            r6.set(r0)
            goto L48
        L21:
            float r0 = r5.startR
            com.badlogic.gdx.graphics.Color r1 = r5.end
            float r2 = r1.r
            float r2 = r2 - r0
            float r2 = r2 * r6
            float r0 = r0 + r2
            float r2 = r5.startG
            float r3 = r1.g
            float r3 = r3 - r2
            float r3 = r3 * r6
            float r2 = r2 + r3
            float r3 = r5.startB
            float r4 = r1.b
            float r4 = r4 - r3
            float r4 = r4 * r6
            float r3 = r3 + r4
            float r4 = r5.startA
            float r1 = r1.a
            float r1 = r1 - r4
            float r1 = r1 * r6
            float r4 = r4 + r1
            com.badlogic.gdx.graphics.Color r6 = r5.color
            r6.set(r0, r2, r3, r4)
        L48:
            return
    }
}
