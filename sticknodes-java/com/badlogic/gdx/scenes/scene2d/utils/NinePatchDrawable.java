package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public class NinePatchDrawable extends com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable implements com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable {
    private com.badlogic.gdx.graphics.g2d.NinePatch patch;

    public NinePatchDrawable() {
            r0 = this;
            r0.<init>()
            return
    }

    public NinePatchDrawable(com.badlogic.gdx.graphics.g2d.NinePatch r1) {
            r0 = this;
            r0.<init>()
            r0.setPatch(r1)
            return
    }

    public NinePatchDrawable(com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable r1) {
            r0 = this;
            r0.<init>(r1)
            com.badlogic.gdx.graphics.g2d.NinePatch r1 = r1.patch
            r0.patch = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable, com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r7, float r8, float r9, float r10, float r11) {
            r6 = this;
            com.badlogic.gdx.graphics.g2d.NinePatch r0 = r6.patch
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.draw(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r13, float r14, float r15, float r16, float r17, float r18, float r19, float r20, float r21, float r22) {
            r12 = this;
            r0 = r12
            com.badlogic.gdx.graphics.g2d.NinePatch r1 = r0.patch
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public com.badlogic.gdx.graphics.g2d.NinePatch getPatch() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.NinePatch r0 = r1.patch
            return r0
    }

    public void setPatch(com.badlogic.gdx.graphics.g2d.NinePatch r2) {
            r1 = this;
            r1.patch = r2
            if (r2 == 0) goto L2e
            float r0 = r2.getTotalWidth()
            r1.setMinWidth(r0)
            float r0 = r2.getTotalHeight()
            r1.setMinHeight(r0)
            float r0 = r2.getPadTop()
            r1.setTopHeight(r0)
            float r0 = r2.getPadRight()
            r1.setRightWidth(r0)
            float r0 = r2.getPadBottom()
            r1.setBottomHeight(r0)
            float r2 = r2.getPadLeft()
            r1.setLeftWidth(r2)
        L2e:
            return
    }

    public com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable tint(com.badlogic.gdx.graphics.Color r4) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable r0 = new com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable
            r0.<init>(r3)
            com.badlogic.gdx.graphics.g2d.NinePatch r1 = new com.badlogic.gdx.graphics.g2d.NinePatch
            com.badlogic.gdx.graphics.g2d.NinePatch r2 = r0.getPatch()
            r1.<init>(r2, r4)
            r0.patch = r1
            return r0
    }
}
