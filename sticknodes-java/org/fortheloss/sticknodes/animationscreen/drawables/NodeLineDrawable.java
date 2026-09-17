package org.fortheloss.sticknodes.animationscreen.drawables;

/* loaded from: classes2.dex */
public class NodeLineDrawable extends org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable {
    private final float mHalfHeight;
    private final int mHeight;
    private final com.badlogic.gdx.graphics.g2d.TextureRegion mRegion;

    public NodeLineDrawable(com.badlogic.gdx.graphics.g2d.TextureRegion r2) {
            r1 = this;
            r1.<init>()
            r1.mRegion = r2
            int r0 = r2.getRegionHeight()
            r1.mHeight = r0
            int r2 = r2.getRegionHeight()
            float r2 = (float) r2
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r0
            r1.mHalfHeight = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawArrow(com.badlogic.gdx.graphics.g2d.Batch r16, float r17, float r18, float r19) {
            r15 = this;
            r0 = r15
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1101004800(0x41a00000, float:20.0)
            float r1 = r1 * r2
            r2 = 1106247680(0x41f00000, float:30.0)
            float r3 = r19 - r2
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r3)
            float r4 = r4 * r1
            float r4 = r17 + r4
            float r3 = org.fortheloss.framework.CustomMathUtils.sinDeg(r3)
            float r3 = r3 * r1
            float r3 = r18 + r3
            float r2 = r19 + r2
            float r5 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r5 = r5 * r1
            float r12 = r17 + r5
            float r2 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            float r2 = r2 * r1
            float r13 = r18 + r2
            float r4 = r4 - r17
            float r3 = r3 - r18
            float r1 = com.badlogic.gdx.math.MathUtils.atan2(r3, r4)
            r14 = 1113927392(0x42652ee0, float:57.295776)
            float r11 = r1 * r14
            float r4 = r4 * r4
            float r3 = r3 * r3
            float r4 = r4 + r3
            double r1 = (double) r4
            double r1 = java.lang.Math.sqrt(r1)
            float r7 = (float) r1
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0.mRegion
            float r6 = r0.mHalfHeight
            int r1 = r0.mHeight
            float r8 = (float) r1
            r5 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r1 = r16
            r3 = r17
            r4 = r18
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            float r12 = r12 - r17
            float r13 = r13 - r18
            float r1 = com.badlogic.gdx.math.MathUtils.atan2(r13, r12)
            float r11 = r1 * r14
            float r12 = r12 * r12
            float r13 = r13 * r13
            float r12 = r12 + r13
            double r1 = (double) r12
            double r1 = java.lang.Math.sqrt(r1)
            float r7 = (float) r1
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0.mRegion
            float r6 = r0.mHalfHeight
            int r1 = r0.mHeight
            float r8 = (float) r1
            r1 = r16
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawDashedLine(com.badlogic.gdx.graphics.g2d.Batch r25, float r26, float r27, float r28, float r29) {
            r24 = this;
            r0 = r24
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0.mRegion
            int r1 = r1.getRegionWidth()
            float r2 = r28 - r26
            float r3 = r29 - r27
            float r4 = r2 * r2
            float r5 = r3 * r3
            float r4 = r4 + r5
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            float r4 = (float) r4
            float r2 = com.badlogic.gdx.math.MathUtils.atan2(r3, r2)
            r3 = 1113927392(0x42652ee0, float:57.295776)
            float r2 = r2 * r3
            float r3 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r22 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            r5 = 0
        L29:
            float r8 = (float) r5
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lb2
            int r15 = r5 + r1
            float r5 = (float) r15
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 <= 0) goto L91
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r0.mRegion
            float r5 = r5.getU()
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r0.mRegion
            float r6 = r6.getU2()
            float r6 = r6 - r5
            float r7 = r4 - r8
            r11 = r7
            float r9 = (float) r1
            float r7 = r7 / r9
            float r6 = r6 * r7
            float r6 = r6 + r5
            com.badlogic.gdx.graphics.g2d.TextureRegion r7 = r0.mRegion
            com.badlogic.gdx.graphics.Texture r7 = r7.getTexture()
            int r7 = r7.getWidth()
            float r7 = (float) r7
            float r9 = r5 * r7
            int r9 = (int) r9
            r16 = r9
            com.badlogic.gdx.graphics.g2d.TextureRegion r9 = r0.mRegion
            int r17 = r9.getRegionY()
            float r6 = r6 - r5
            float r6 = r6 * r7
            int r5 = (int) r6
            r18 = r5
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r0.mRegion
            int r19 = r5.getRegionHeight()
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r0.mRegion
            com.badlogic.gdx.graphics.Texture r6 = r5.getTexture()
            float r5 = r8 * r3
            float r7 = r26 + r5
            float r8 = r8 * r22
            float r8 = r27 + r8
            r9 = 0
            float r10 = r0.mHalfHeight
            int r5 = r0.mHeight
            float r12 = (float) r5
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 0
            r5 = r25
            r23 = r15
            r15 = r2
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto Lae
        L91:
            r23 = r15
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r0.mRegion
            float r5 = r8 * r3
            float r7 = r26 + r5
            float r8 = r8 * r22
            float r8 = r27 + r8
            r9 = 0
            float r10 = r0.mHalfHeight
            float r11 = (float) r1
            int r5 = r0.mHeight
            float r12 = (float) r5
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 1065353216(0x3f800000, float:1.0)
            r5 = r25
            r15 = r2
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        Lae:
            r5 = r23
            goto L29
        Lb2:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawDashedLineThicker(com.badlogic.gdx.graphics.g2d.Batch r59, float r60, float r61, float r62, float r63) {
            r58 = this;
            r0 = r58
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0.mRegion
            int r1 = r1.getRegionWidth()
            float r2 = r62 - r60
            float r3 = r63 - r61
            float r4 = r2 * r2
            float r5 = r3 * r3
            float r4 = r4 + r5
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            float r4 = (float) r4
            float r2 = com.badlogic.gdx.math.MathUtils.atan2(r3, r2)
            r3 = 1113927392(0x42652ee0, float:57.295776)
            float r2 = r2 * r3
            float r3 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r56 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            r5 = 0
        L29:
            float r8 = (float) r5
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 >= 0) goto L13b
            int r15 = r5 + r1
            float r5 = (float) r15
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 <= 0) goto Lf1
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r0.mRegion
            float r5 = r5.getU()
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r0.mRegion
            float r6 = r6.getU2()
            float r6 = r6 - r5
            float r7 = r4 - r8
            r45 = r7
            r28 = r7
            r11 = r7
            float r9 = (float) r1
            float r7 = r7 / r9
            float r6 = r6 * r7
            float r6 = r6 + r5
            com.badlogic.gdx.graphics.g2d.TextureRegion r7 = r0.mRegion
            com.badlogic.gdx.graphics.Texture r7 = r7.getTexture()
            int r7 = r7.getWidth()
            float r7 = (float) r7
            float r9 = r5 * r7
            int r9 = (int) r9
            r50 = r9
            r33 = r9
            r16 = r9
            com.badlogic.gdx.graphics.g2d.TextureRegion r9 = r0.mRegion
            int r17 = r9.getRegionY()
            r51 = r17
            r34 = r17
            float r6 = r6 - r5
            float r6 = r6 * r7
            int r5 = (int) r6
            r52 = r5
            r35 = r5
            r18 = r5
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r0.mRegion
            int r19 = r5.getRegionHeight()
            r53 = r19
            r36 = r19
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r0.mRegion
            com.badlogic.gdx.graphics.Texture r6 = r5.getTexture()
            float r5 = r8 * r3
            float r39 = r60 + r5
            r7 = r39
            float r8 = r8 * r56
            float r42 = r61 + r8
            r8 = r42
            r9 = 0
            float r10 = r0.mHalfHeight
            int r5 = r0.mHeight
            float r12 = (float) r5
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 0
            r5 = r59
            r57 = r15
            r15 = r2
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r0.mRegion
            com.badlogic.gdx.graphics.Texture r23 = r5.getTexture()
            float r24 = r39 + r56
            float r25 = r42 - r3
            r26 = 0
            float r5 = r0.mHalfHeight
            r27 = r5
            int r5 = r0.mHeight
            float r5 = (float) r5
            r29 = r5
            r30 = 1065353216(0x3f800000, float:1.0)
            r31 = 1065353216(0x3f800000, float:1.0)
            r37 = 0
            r38 = 0
            r22 = r59
            r32 = r2
            r22.draw(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r0.mRegion
            com.badlogic.gdx.graphics.Texture r40 = r5.getTexture()
            float r41 = r39 - r56
            float r42 = r42 + r3
            r43 = 0
            float r5 = r0.mHalfHeight
            r44 = r5
            int r5 = r0.mHeight
            float r5 = (float) r5
            r46 = r5
            r47 = 1065353216(0x3f800000, float:1.0)
            r48 = 1065353216(0x3f800000, float:1.0)
            r54 = 0
            r55 = 0
            r39 = r59
            r49 = r2
            r39.draw(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            goto L137
        Lf1:
            r57 = r15
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r0.mRegion
            float r5 = r8 * r3
            float r16 = r60 + r5
            float r8 = r8 * r56
            float r17 = r61 + r8
            r9 = 0
            float r10 = r0.mHalfHeight
            float r15 = (float) r1
            int r5 = r0.mHeight
            float r12 = (float) r5
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 1065353216(0x3f800000, float:1.0)
            r5 = r59
            r7 = r16
            r8 = r17
            r11 = r15
            r18 = r15
            r15 = r2
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r0.mRegion
            float r7 = r16 + r56
            float r8 = r17 - r3
            float r10 = r0.mHalfHeight
            int r5 = r0.mHeight
            float r12 = (float) r5
            r5 = r59
            r11 = r18
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r0.mRegion
            float r7 = r16 - r56
            float r8 = r17 + r3
            float r10 = r0.mHalfHeight
            int r5 = r0.mHeight
            float r12 = (float) r5
            r5 = r59
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L137:
            r5 = r57
            goto L29
        L13b:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawLine(com.badlogic.gdx.graphics.g2d.Batch r13, float r14, float r15, float r16, float r17) {
            r12 = this;
            r0 = r12
            float r1 = r16 - r14
            float r2 = r17 - r15
            float r3 = com.badlogic.gdx.math.MathUtils.atan2(r2, r1)
            r4 = 1113927392(0x42652ee0, float:57.295776)
            float r11 = r3 * r4
            float r1 = r1 * r1
            float r2 = r2 * r2
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r7 = (float) r1
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0.mRegion
            float r6 = r0.mHalfHeight
            int r1 = r0.mHeight
            float r8 = (float) r1
            r5 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r1 = r13
            r3 = r14
            r4 = r15
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawLine2(com.badlogic.gdx.graphics.g2d.Batch r13, float r14, float r15, float r16, float r17) {
            r12 = this;
            r0 = r12
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0.mRegion
            float r6 = r0.mHalfHeight
            int r1 = r0.mHeight
            float r8 = (float) r1
            r5 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r1 = r13
            r3 = r14
            r4 = r15
            r7 = r16
            r11 = r17
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable
    public void drawLineThicker(com.badlogic.gdx.graphics.g2d.Batch r20, float r21, float r22, float r23, float r24) {
            r19 = this;
            r0 = r19
            float r1 = r23 - r21
            float r2 = r24 - r22
            float r3 = com.badlogic.gdx.math.MathUtils.atan2(r2, r1)
            r4 = 1113927392(0x42652ee0, float:57.295776)
            float r16 = r3 * r4
            float r17 = org.fortheloss.framework.CustomMathUtils.cosDeg(r16)
            float r18 = org.fortheloss.framework.CustomMathUtils.sinDeg(r16)
            float r1 = r1 * r1
            float r2 = r2 * r2
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r15 = (float) r1
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0.mRegion
            float r6 = r0.mHalfHeight
            int r1 = r0.mHeight
            float r8 = (float) r1
            r5 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r1 = r20
            r3 = r21
            r4 = r22
            r7 = r15
            r11 = r16
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r0.mRegion
            float r7 = r21 + r18
            float r8 = r22 - r17
            float r10 = r0.mHalfHeight
            int r1 = r0.mHeight
            float r12 = (float) r1
            r9 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 1065353216(0x3f800000, float:1.0)
            r5 = r20
            r11 = r15
            r1 = r15
            r15 = r16
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r0.mRegion
            float r7 = r21 - r18
            float r8 = r22 + r17
            float r10 = r0.mHalfHeight
            int r2 = r0.mHeight
            float r12 = (float) r2
            r11 = r1
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
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
    public void drawPatch(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5, float r6) {
            r0 = this;
            return
    }
}
