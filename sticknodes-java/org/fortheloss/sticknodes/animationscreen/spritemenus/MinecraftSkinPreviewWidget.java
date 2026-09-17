package org.fortheloss.sticknodes.animationscreen.spritemenus;

/* loaded from: classes2.dex */
public class MinecraftSkinPreviewWidget extends com.badlogic.gdx.scenes.scene2d.ui.Widget implements com.badlogic.gdx.utils.Disposable {
    private float mCharHeight;
    private int mPerspective;
    private float mRes;
    private com.badlogic.gdx.graphics.Texture mSkinRef;
    private boolean[] mToggles;
    private int mType3pxOr4px;

    public MinecraftSkinPreviewWidget(com.badlogic.gdx.graphics.Texture r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mPerspective = r0
            r1.mSkinRef = r2
            r1.mType3pxOr4px = r3
            int r2 = r2.getWidth()
            float r2 = (float) r2
            r1.mRes = r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            r1.mCharHeight = r2
            r2 = 20
            boolean[] r2 = new boolean[r2]
            r1.mToggles = r2
            java.util.Arrays.fill(r2, r0)
            boolean[] r2 = r1.mToggles
            r3 = 1
            r2[r0] = r3
            r0 = 2
            r2[r0] = r3
            r0 = 4
            r2[r0] = r3
            r0 = 5
            r2[r0] = r3
            r0 = 8
            r2[r0] = r3
            r0 = 9
            r2[r0] = r3
            r0 = 12
            r2[r0] = r3
            r0 = 13
            r2[r0] = r3
            r0 = 16
            r2[r0] = r3
            r0 = 17
            r2[r0] = r3
            return
    }

    private void renderRegion(com.badlogic.gdx.graphics.g2d.Batch r22, int r23, float r24, float r25, float r26) {
            r21 = this;
            r0 = r21
            r1 = r23
            boolean[] r2 = r0.mToggles
            boolean r2 = r2[r1]
            if (r2 == 0) goto La7
            boolean r2 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.isOuterLayer(r23)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L18
            float r2 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.getOuterLayerScale()
            r13 = r2
            goto L1a
        L18:
            r13 = 1065353216(0x3f800000, float:1.0)
        L1a:
            int r2 = r0.mPerspective
            float r2 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.getScaleX(r2, r1)
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L27
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L27:
            int r4 = r0.mType3pxOr4px
            int r5 = r0.mPerspective
            float[] r4 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.getRenderPos(r4, r5, r1)
            float r5 = r21.getX()
            float r5 = r5 + r24
            r8 = 0
            r6 = r4[r8]
            float r7 = r0.mCharHeight
            float r6 = r6 * r7
            float r6 = r6 * r26
            float r6 = r6 + r5
            float r5 = r21.getY()
            float r5 = r5 + r25
            r9 = 1
            r4 = r4[r9]
            float r7 = r0.mCharHeight
            float r4 = r4 * r7
            float r4 = r4 * r26
            float r7 = r5 + r4
            int r4 = r0.mType3pxOr4px
            int r5 = r0.mPerspective
            float[] r1 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.getUVs(r4, r5, r1)
            r4 = 2
            r5 = r1[r4]
            float r10 = r0.mRes
            float r5 = r5 * r10
            float r5 = r5 * r26
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 * r5
            r10 = r2
            r5 = 3
            r11 = r1[r5]
            float r12 = r0.mRes
            float r11 = r11 * r12
            float r14 = r11 * r26
            r11 = r14
            r8 = r1[r8]
            float r8 = r8 * r12
            int r15 = (int) r8
            r8 = r1[r9]
            float r8 = r8 * r12
            int r8 = (int) r8
            r4 = r1[r4]
            float r4 = r4 * r12
            int r4 = (int) r4
            r17 = r4
            r1 = r1[r5]
            float r1 = r1 * r12
            int r1 = (int) r1
            r18 = r1
            com.badlogic.gdx.graphics.Texture r4 = r0.mSkinRef
            int r4 = r4.getHeight()
            int r4 = r4 - r8
            int r16 = r4 - r1
            com.badlogic.gdx.graphics.Texture r5 = r0.mSkinRef
            r1 = 1056964608(0x3f000000, float:0.5)
            float r8 = r2 * r1
            float r9 = r14 * r1
            float r12 = r13 * r3
            r14 = 0
            r19 = 0
            r20 = 0
            r4 = r22
            r4.draw(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        La7:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mSkinRef = r0
            r1.mToggles = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r9, float r10) {
            r8 = this;
            com.badlogic.gdx.graphics.Color r0 = r8.getColor()
            float r1 = r0.r
            float r2 = r0.g
            float r3 = r0.b
            float r0 = r0.a
            float r0 = r0 * r10
            r9.setColor(r1, r2, r3, r0)
            com.badlogic.gdx.graphics.Texture r10 = r8.mSkinRef
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = com.badlogic.gdx.graphics.Texture.TextureFilter.Nearest
            r10.setFilter(r0, r0)
            float r10 = r8.getHeight()
            float r0 = r8.mCharHeight
            float r10 = r10 / r0
            r0 = 1063675494(0x3f666666, float:0.9)
            float r10 = r10 * r0
            float r0 = r8.getWidth()
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            float r2 = r8.getHeight()
            float r7 = r2 * r1
            int r1 = r8.mPerspective
            r2 = 4
            if (r1 >= r2) goto L99
            r3 = 9
            r1 = r8
            r2 = r9
            r4 = r0
            r5 = r7
            r6 = r10
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 8
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 11
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 10
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 17
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 16
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 19
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 18
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 2
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 3
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 0
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 1
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 5
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 4
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 7
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 6
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 13
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 12
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 15
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 14
            r1.renderRegion(r2, r3, r4, r5, r6)
            goto Lfa
        L99:
            r3 = 5
            r1 = r8
            r2 = r9
            r4 = r0
            r5 = r7
            r6 = r10
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 4
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 7
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 6
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 13
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 12
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 15
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 14
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 2
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 3
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 0
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 1
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 9
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 8
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 11
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 10
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 17
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 16
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 19
            r1.renderRegion(r2, r3, r4, r5, r6)
            r3 = 18
            r1.renderRegion(r2, r3, r4, r5, r6)
        Lfa:
            return
    }

    public java.util.ArrayList<java.lang.Integer> getActiveLimbs() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean[] r1 = r4.mToggles
            int r1 = r1.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L1b
            boolean[] r3 = r4.mToggles
            boolean r3 = r3[r2]
            if (r3 == 0) goto L18
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
        L18:
            int r2 = r2 + 1
            goto L9
        L1b:
            return r0
    }

    public int getPerspective() {
            r1 = this;
            int r0 = r1.mPerspective
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r1 = this;
            float r0 = r1.getHeight()
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r1 = this;
            float r0 = r1.getWidth()
            return r0
    }

    public void setLimbVisible(int r2, boolean r3) {
            r1 = this;
            boolean[] r0 = r1.mToggles
            r0[r2] = r3
            return
    }

    public void setPerspective(int r1) {
            r0 = this;
            r0.mPerspective = r1
            return
    }
}
