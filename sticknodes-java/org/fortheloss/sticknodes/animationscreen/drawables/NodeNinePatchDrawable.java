package org.fortheloss.sticknodes.animationscreen.drawables;

/* loaded from: classes2.dex */
public class NodeNinePatchDrawable extends org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable {
    private final com.badlogic.gdx.graphics.g2d.NinePatch mPatch;

    public NodeNinePatchDrawable(com.badlogic.gdx.graphics.g2d.NinePatch r1) {
            r0 = this;
            r0.<init>()
            r0.mPatch = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawArrow(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawDashedLine(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawDashedLineThicker(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawLine(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawLine2(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawLineThicker(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawNode(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawNode(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawPatch(com.badlogic.gdx.graphics.g2d.Batch r14, float r15, float r16, float r17, float r18, float r19) {
            r13 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r17 * r0
            float r0 = r0 * r18
            float r2 = org.fortheloss.framework.CustomMathUtils.cosDeg(r19)
            float r3 = org.fortheloss.framework.CustomMathUtils.sinDeg(r19)
            r12 = r13
            com.badlogic.gdx.graphics.g2d.NinePatch r4 = r12.mPatch
            float r5 = r2 * r1
            float r5 = r15 - r5
            float r6 = r3 * r0
            float r5 = r5 + r6
            float r3 = r3 * r1
            float r1 = r16 - r3
            float r2 = r2 * r0
            float r0 = r1 - r2
            r6 = 0
            r7 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r1 = r4
            r2 = r14
            r3 = r5
            r4 = r0
            r5 = r6
            r6 = r7
            r7 = r17
            r8 = r18
            r11 = r19
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }
}
