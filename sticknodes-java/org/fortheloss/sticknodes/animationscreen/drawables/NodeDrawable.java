package org.fortheloss.sticknodes.animationscreen.drawables;

/* loaded from: classes2.dex */
public class NodeDrawable extends org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable {
    private final int mHalfHeight;
    private final int mHalfWidth;
    private final int mHeight;
    private final com.badlogic.gdx.graphics.g2d.TextureRegion mRegion;
    private final int mWidth;

    public NodeDrawable(com.badlogic.gdx.graphics.g2d.TextureRegion r2) {
            r1 = this;
            r1.<init>()
            r1.mRegion = r2
            int r0 = r2.getRegionWidth()
            r1.mWidth = r0
            int r2 = r2.getRegionHeight()
            r1.mHeight = r2
            int r0 = r0 / 2
            r1.mHalfWidth = r0
            int r2 = r2 / 2
            r1.mHalfHeight = r2
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
    public void drawNode(com.badlogic.gdx.graphics.g2d.Batch r7, float r8, float r9, float r10) {
            r6 = this;
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r6.mRegion
            int r0 = r6.mHalfWidth
            float r0 = (float) r0
            float r0 = r0 * r10
            float r2 = r8 - r0
            int r8 = r6.mHalfHeight
            float r8 = (float) r8
            float r8 = r8 * r10
            float r3 = r9 - r8
            int r8 = r6.mWidth
            float r8 = (float) r8
            float r4 = r8 * r10
            int r8 = r6.mHeight
            float r8 = (float) r8
            float r5 = r8 * r10
            r0 = r7
            r0.draw(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawNode(com.badlogic.gdx.graphics.g2d.Batch r14, float r15, float r16, float r17, float r18) {
            r13 = this;
            r0 = r13
            int r1 = r0.mHalfWidth
            float r1 = (float) r1
            float r1 = r1 * r17
            float r4 = r15 - r1
            int r1 = r0.mHalfHeight
            float r1 = (float) r1
            float r1 = r1 * r17
            float r5 = r16 - r1
            int r1 = r0.mWidth
            float r1 = (float) r1
            float r8 = r1 * r17
            int r1 = r0.mHeight
            float r1 = (float) r1
            float r9 = r1 * r17
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r0.mRegion
            r1 = 1056964608(0x3f000000, float:0.5)
            float r6 = r8 * r1
            float r7 = r9 * r1
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            r2 = r14
            r12 = r18
            r2.draw(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawPatch(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5, float r6) {
            r0 = this;
            return
    }
}
