package org.fortheloss.sticknodes.stickfigure;

/* loaded from: classes2.dex */
public class StickfigureSizeCalculator {
    private static com.badlogic.gdx.math.Vector2 point1;
    private static com.badlogic.gdx.math.Vector2 point2;
    private static com.badlogic.gdx.math.Vector2 point3;
    private static com.badlogic.gdx.math.Vector2 point4;
    private boolean mForceNonZeroSizes;

    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point1 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point2 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point3 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point4 = r0
            return
    }

    public StickfigureSizeCalculator() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mForceNonZeroSizes = r0
            return
    }

    public void forceNonZeroSizes(boolean r1) {
            r0 = this;
            r0.mForceNonZeroSizes = r1
            return
    }

    public com.badlogic.gdx.math.Rectangle getSize(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto Lb
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            com.badlogic.gdx.math.Rectangle r2 = r1.getSize(r2)
            return r2
        Lb:
            boolean r0 = r2 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L16
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = (org.fortheloss.sticknodes.sprite.SpriteRef) r2
            com.badlogic.gdx.math.Rectangle r2 = r1.getSize(r2)
            return r2
        L16:
            r2 = 0
            return r2
    }

    public com.badlogic.gdx.math.Rectangle getSize(org.fortheloss.sticknodes.sprite.SpriteRef r11) {
            r10 = this;
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r2 = r11.getScaledWidth()
            float r3 = r11.getScaledHeight()
            float r4 = r11.getNormalizedOriginX()
            float r5 = r11.getNormalizedOriginY()
            float r11 = r11.getRotation()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r4 = r6 - r4
            float r7 = org.fortheloss.framework.CustomMathUtils.cosDeg(r11)
            float r4 = r4 * r7
            float r4 = r4 * r2
            float r0 = r0 + r4
            float r4 = r6 - r5
            float r5 = org.fortheloss.framework.CustomMathUtils.sinDeg(r11)
            float r4 = r4 * r5
            float r4 = r4 * r3
            float r1 = r1 + r4
            float r2 = r2 * r6
            float r3 = r3 * r6
            float r4 = r2 * r2
            float r5 = r3 * r3
            float r4 = r4 + r5
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            float r4 = (float) r4
            float r3 = -r3
            float r5 = -r2
            float r5 = com.badlogic.gdx.math.MathUtils.atan2(r3, r5)
            r6 = 1113927392(0x42652ee0, float:57.295776)
            float r5 = r5 * r6
            float r5 = r5 + r11
            float r7 = org.fortheloss.framework.CustomMathUtils.cosDeg(r5)
            float r7 = r7 * r4
            float r7 = r7 + r0
            float r8 = org.fortheloss.framework.CustomMathUtils.sinDeg(r5)
            float r8 = r8 * r4
            float r8 = r8 + r1
            float r2 = com.badlogic.gdx.math.MathUtils.atan2(r3, r2)
            float r2 = r2 * r6
            float r2 = r2 + r11
            float r11 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r11 = r11 * r4
            float r11 = r11 + r0
            float r3 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            float r3 = r3 * r4
            float r3 = r3 + r1
            r6 = 1127481344(0x43340000, float:180.0)
            float r5 = r5 - r6
            float r9 = org.fortheloss.framework.CustomMathUtils.cosDeg(r5)
            float r9 = r9 * r4
            float r9 = r9 + r0
            float r5 = org.fortheloss.framework.CustomMathUtils.sinDeg(r5)
            float r5 = r5 * r4
            float r5 = r5 + r1
            float r2 = r2 - r6
            float r6 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r6 = r6 * r4
            float r0 = r0 + r6
            float r2 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            float r2 = r2 * r4
            float r1 = r1 + r2
            float r2 = java.lang.Math.min(r9, r0)
            float r2 = java.lang.Math.min(r11, r2)
            float r2 = java.lang.Math.min(r7, r2)
            r4 = 0
            float r2 = java.lang.Math.min(r4, r2)
            float r6 = java.lang.Math.min(r5, r1)
            float r6 = java.lang.Math.min(r3, r6)
            float r6 = java.lang.Math.min(r8, r6)
            float r4 = java.lang.Math.min(r4, r6)
            float r0 = java.lang.Math.max(r9, r0)
            float r11 = java.lang.Math.max(r11, r0)
            float r11 = java.lang.Math.max(r7, r11)
            float r0 = java.lang.Math.max(r5, r1)
            float r0 = java.lang.Math.max(r3, r0)
            float r0 = java.lang.Math.max(r8, r0)
            com.badlogic.gdx.math.Rectangle r1 = new com.badlogic.gdx.math.Rectangle
            r1.<init>(r2, r4, r11, r0)
            return r1
    }

    public com.badlogic.gdx.math.Rectangle getSize(org.fortheloss.sticknodes.stickfigure.Stickfigure r25) {
            r24 = this;
            r0 = r24
            com.badlogic.gdx.math.Rectangle r1 = new com.badlogic.gdx.math.Rectangle
            r2 = 0
            r1.<init>(r2, r2, r2, r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r25.getMainNode()
            if (r3 != 0) goto Lf
            return r1
        Lf:
            java.util.Stack r3 = new java.util.Stack
            r3.<init>()
            r25.validateDirtyNodes()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r25.getMainNode()
            r4.addChildrenToStack(r3)
            float r4 = r25.getScale()
        L22:
            boolean r5 = r3.empty()
            r6 = 1
            if (r5 != 0) goto L5b5
            java.lang.Object r5 = r3.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            int r7 = r5.getLimbType()
            r8 = 7
            r9 = 4
            r10 = 2
            if (r7 == r10) goto L3f
            if (r7 == r9) goto L3f
            if (r7 != r8) goto L3d
            goto L3f
        L3d:
            r11 = 0
            goto L40
        L3f:
            r11 = 1
        L40:
            boolean r12 = r0.mForceNonZeroSizes
            if (r12 == 0) goto L53
            boolean r12 = r5.isStatic()
            if (r12 != 0) goto L53
            int r12 = r5.getThickness()
            int r12 = java.lang.Math.max(r12, r6)
            goto L57
        L53:
            int r12 = r5.getThickness()
        L57:
            if (r11 != 0) goto L61
            if (r12 <= 0) goto L5c
            goto L61
        L5c:
            r0 = r3
            r20 = r4
            goto L5aa
        L61:
            boolean r11 = r5.isUsingSegmentScale()
            if (r11 == 0) goto L6c
            float r11 = r5.getScale()
            goto L6e
        L6c:
            r11 = 1065353216(0x3f800000, float:1.0)
        L6e:
            float r11 = r11 * r4
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r12
            r15 = 1056964608(0x3f000000, float:0.5)
            if (r7 != 0) goto L139
            float r7 = r5.getGlobalX()
            float r8 = r5.getGlobalY()
            int r9 = r5.getThickness()
            float r9 = (float) r9
            float r9 = r9 * r11
            float r9 = r9 * r15
            float r10 = r7 - r9
            float r2 = r7 + r9
            float r13 = r8 - r9
            float r6 = r8 + r9
            org.fortheloss.sticknodes.stickfigure.StickNode r18 = r5.getParentNode()
            boolean r14 = r0.mForceNonZeroSizes
            if (r14 == 0) goto Lc4
            boolean r14 = r18.isStatic()
            if (r14 == 0) goto La5
            int r14 = r18.getThickness()
            if (r14 <= 0) goto Lc4
        La5:
            float r14 = r18.getGlobalX()
            float r18 = r18.getGlobalY()
            float r15 = r14 - r9
            float r10 = java.lang.Math.min(r10, r15)
            float r14 = r14 + r9
            float r2 = java.lang.Math.max(r2, r14)
            float r14 = r18 - r9
            float r13 = java.lang.Math.min(r13, r14)
            float r9 = r18 + r9
            float r6 = java.lang.Math.max(r6, r9)
        Lc4:
            int r9 = r5.getSegmentCurve()
            if (r9 == 0) goto L133
            int r9 = r5.getSegmentCurve()
            if (r9 <= 0) goto Ld2
            r9 = 1
            goto Ld3
        Ld2:
            r9 = -1
        Ld3:
            float r14 = r5.getLength()
            float r14 = r14 * r11
            int r15 = r5.getThickness()
            float r15 = (float) r15
            float r15 = r15 * r11
            int r12 = r5.getSegmentCurve()
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = java.lang.Math.abs(r12)
            float r12 = r5.getAngle()
            r16 = 1127481344(0x43340000, float:180.0)
            float r16 = r12 - r16
            float r17 = org.fortheloss.framework.CustomMathUtils.cosDeg(r16)
            float r17 = r17 * r14
            r18 = 1056964608(0x3f000000, float:0.5)
            float r17 = r17 * r18
            float r7 = r7 + r17
            r17 = 1119092736(0x42b40000, float:90.0)
            float r12 = r12 + r17
            float r17 = org.fortheloss.framework.CustomMathUtils.cosDeg(r12)
            float r15 = r15 * r18
            float r11 = r11 + r15
            float r17 = r17 * r11
            float r9 = (float) r9
            float r17 = r17 * r9
            float r7 = r7 + r17
            float r15 = org.fortheloss.framework.CustomMathUtils.sinDeg(r16)
            float r15 = r15 * r14
            float r15 = r15 * r18
            float r8 = r8 + r15
            float r12 = org.fortheloss.framework.CustomMathUtils.sinDeg(r12)
            float r12 = r12 * r11
            float r12 = r12 * r9
            float r8 = r8 + r12
            float r10 = java.lang.Math.min(r10, r7)
            float r2 = java.lang.Math.max(r2, r7)
            float r13 = java.lang.Math.min(r13, r8)
            float r6 = java.lang.Math.max(r6, r8)
        L133:
            r22 = r3
            r20 = r4
            goto L588
        L139:
            r2 = 1
            if (r7 != r2) goto L234
            float r2 = r5.getGlobalX()
            float r6 = r5.getGlobalY()
            float r7 = r5.getAngle()
            int r8 = r5.getThickness()
            float r8 = (float) r8
            float r8 = r8 * r11
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r9
            r9 = 1119092736(0x42b40000, float:90.0)
            float r10 = r7 - r9
            float r12 = org.fortheloss.framework.CustomMathUtils.cosDeg(r10)
            float r12 = r12 * r8
            float r12 = r12 + r2
            float r14 = r7 + r9
            float r9 = org.fortheloss.framework.CustomMathUtils.cosDeg(r14)
            float r9 = r9 * r8
            float r9 = r9 + r2
            float r13 = org.fortheloss.framework.CustomMathUtils.sinDeg(r10)
            float r13 = r13 * r8
            float r13 = r13 + r6
            float r15 = org.fortheloss.framework.CustomMathUtils.sinDeg(r14)
            float r15 = r15 * r8
            float r15 = r15 + r6
            org.fortheloss.sticknodes.stickfigure.StickNode r19 = r5.getParentNode()
            r20 = r4
            boolean r4 = r0.mForceNonZeroSizes
            if (r4 == 0) goto L1c5
            boolean r4 = r19.isStatic()
            if (r4 == 0) goto L18b
            int r4 = r19.getThickness()
            if (r4 <= 0) goto L1c5
        L18b:
            float r4 = r19.getGlobalX()
            float r19 = r19.getGlobalY()
            float r21 = org.fortheloss.framework.CustomMathUtils.cosDeg(r10)
            float r21 = r21 * r8
            r22 = r3
            float r3 = r4 + r21
            float r12 = java.lang.Math.min(r12, r3)
            float r3 = org.fortheloss.framework.CustomMathUtils.cosDeg(r14)
            float r3 = r3 * r8
            float r4 = r4 + r3
            float r9 = java.lang.Math.max(r9, r4)
            float r3 = org.fortheloss.framework.CustomMathUtils.sinDeg(r10)
            float r3 = r3 * r8
            float r3 = r19 + r3
            float r13 = java.lang.Math.min(r13, r3)
            float r3 = org.fortheloss.framework.CustomMathUtils.sinDeg(r14)
            float r3 = r3 * r8
            float r3 = r19 + r3
            float r15 = java.lang.Math.max(r15, r3)
            goto L1c7
        L1c5:
            r22 = r3
        L1c7:
            int r3 = r5.getSegmentCurve()
            if (r3 == 0) goto L22f
            int r3 = r5.getSegmentCurve()
            if (r3 <= 0) goto L1d5
            r3 = 1
            goto L1d6
        L1d5:
            r3 = -1
        L1d6:
            float r4 = r5.getLength()
            float r4 = r4 * r11
            int r8 = r5.getThickness()
            float r8 = (float) r8
            float r8 = r8 * r11
            int r10 = r5.getSegmentCurve()
            float r10 = (float) r10
            float r10 = r10 * r11
            float r10 = java.lang.Math.abs(r10)
            r11 = 1127481344(0x43340000, float:180.0)
            float r7 = r7 - r11
            float r11 = org.fortheloss.framework.CustomMathUtils.cosDeg(r7)
            float r11 = r11 * r4
            r16 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r16
            float r2 = r2 + r11
            float r11 = org.fortheloss.framework.CustomMathUtils.cosDeg(r14)
            float r8 = r8 * r16
            float r10 = r10 + r8
            float r11 = r11 * r10
            float r3 = (float) r3
            float r11 = r11 * r3
            float r2 = r2 + r11
            float r7 = org.fortheloss.framework.CustomMathUtils.sinDeg(r7)
            float r7 = r7 * r4
            float r7 = r7 * r16
            float r6 = r6 + r7
            float r4 = org.fortheloss.framework.CustomMathUtils.sinDeg(r14)
            float r4 = r4 * r10
            float r4 = r4 * r3
            float r6 = r6 + r4
            float r3 = java.lang.Math.min(r12, r2)
            float r2 = java.lang.Math.max(r9, r2)
            float r4 = java.lang.Math.min(r13, r6)
            float r6 = java.lang.Math.max(r15, r6)
            r10 = r3
            r13 = r4
            goto L588
        L22f:
            r2 = r9
            r10 = r12
            r6 = r15
            goto L588
        L234:
            r22 = r3
            r20 = r4
            if (r7 == r10) goto L549
            if (r7 == r9) goto L549
            if (r7 != r8) goto L240
            goto L549
        L240:
            r2 = 5
            if (r7 != r2) goto L334
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r5.getParentNode()
            float r3 = r2.getGlobalX()
            float r2 = r2.getGlobalY()
            float r4 = r5.getGlobalX()
            float r6 = r5.getGlobalY()
            float r7 = r5.getAngle()
            float r8 = r5.getLength()
            float r8 = r8 * r11
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r9
            int r10 = r5.getThickness()
            float r10 = (float) r10
            float r10 = r10 * r11
            float r10 = r10 * r9
            com.badlogic.gdx.math.Vector2 r9 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point1
            r9.set(r3, r2)
            com.badlogic.gdx.math.Vector2 r9 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point2
            r9.set(r4, r6)
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point3
            float r6 = org.fortheloss.framework.CustomMathUtils.cosDeg(r7)
            float r6 = r6 * r8
            float r6 = r6 + r3
            r9 = 1119092736(0x42b40000, float:90.0)
            float r11 = r7 - r9
            float r9 = org.fortheloss.framework.CustomMathUtils.cosDeg(r11)
            float r9 = r9 * r10
            float r6 = r6 + r9
            float r9 = org.fortheloss.framework.CustomMathUtils.sinDeg(r7)
            float r9 = r9 * r8
            float r9 = r9 + r2
            float r11 = org.fortheloss.framework.CustomMathUtils.sinDeg(r11)
            float r11 = r11 * r10
            float r9 = r9 + r11
            r4.set(r6, r9)
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point4
            float r6 = org.fortheloss.framework.CustomMathUtils.cosDeg(r7)
            float r6 = r6 * r8
            float r3 = r3 + r6
            r6 = 1119092736(0x42b40000, float:90.0)
            float r14 = r7 + r6
            float r6 = org.fortheloss.framework.CustomMathUtils.cosDeg(r14)
            float r6 = r6 * r10
            float r3 = r3 + r6
            float r6 = org.fortheloss.framework.CustomMathUtils.sinDeg(r7)
            float r6 = r6 * r8
            float r2 = r2 + r6
            float r6 = org.fortheloss.framework.CustomMathUtils.sinDeg(r14)
            float r6 = r6 * r10
            float r2 = r2 + r6
            r4.set(r3, r2)
            com.badlogic.gdx.math.Vector2 r2 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point1
            float r2 = r2.x
            com.badlogic.gdx.math.Vector2 r3 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point2
            float r3 = r3.x
            float r2 = java.lang.Math.min(r2, r3)
            com.badlogic.gdx.math.Vector2 r3 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point3
            float r3 = r3.x
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point4
            float r4 = r4.x
            float r3 = java.lang.Math.min(r3, r4)
            float r10 = java.lang.Math.min(r2, r3)
            com.badlogic.gdx.math.Vector2 r2 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point1
            float r2 = r2.x
            com.badlogic.gdx.math.Vector2 r3 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point2
            float r3 = r3.x
            float r2 = java.lang.Math.max(r2, r3)
            com.badlogic.gdx.math.Vector2 r3 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point3
            float r3 = r3.x
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point4
            float r4 = r4.x
            float r3 = java.lang.Math.max(r3, r4)
            float r2 = java.lang.Math.max(r2, r3)
            com.badlogic.gdx.math.Vector2 r3 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point1
            float r3 = r3.y
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point2
            float r4 = r4.y
            float r3 = java.lang.Math.min(r3, r4)
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point3
            float r4 = r4.y
            com.badlogic.gdx.math.Vector2 r6 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point4
            float r6 = r6.y
            float r4 = java.lang.Math.min(r4, r6)
            float r13 = java.lang.Math.min(r3, r4)
            com.badlogic.gdx.math.Vector2 r3 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point1
            float r3 = r3.y
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point2
            float r4 = r4.y
            float r3 = java.lang.Math.max(r3, r4)
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point3
            float r4 = r4.y
            com.badlogic.gdx.math.Vector2 r6 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point4
            float r6 = r6.y
            float r4 = java.lang.Math.max(r4, r6)
            float r6 = java.lang.Math.max(r3, r4)
            goto L588
        L334:
            r2 = 3
            if (r7 != r2) goto L413
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r5.getParentNode()
            float r3 = r2.getGlobalX()
            float r2 = r2.getGlobalY()
            float r4 = r5.getGlobalX()
            float r6 = r5.getGlobalY()
            float r7 = r5.getAngle()
            int r8 = r5.getThickness()
            float r8 = (float) r8
            float r8 = r8 * r11
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r9
            boolean r9 = r5.getTriangleUpsideDown()
            if (r9 != 0) goto L391
            com.badlogic.gdx.math.Vector2 r9 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point1
            r10 = 1119092736(0x42b40000, float:90.0)
            float r11 = r7 - r10
            float r12 = org.fortheloss.framework.CustomMathUtils.cosDeg(r11)
            float r12 = r12 * r8
            float r12 = r12 + r3
            float r11 = org.fortheloss.framework.CustomMathUtils.sinDeg(r11)
            float r11 = r11 * r8
            float r11 = r11 + r2
            r9.set(r12, r11)
            com.badlogic.gdx.math.Vector2 r9 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point2
            float r7 = r7 + r10
            float r10 = org.fortheloss.framework.CustomMathUtils.cosDeg(r7)
            float r10 = r10 * r8
            float r3 = r3 + r10
            float r7 = org.fortheloss.framework.CustomMathUtils.sinDeg(r7)
            float r7 = r7 * r8
            float r2 = r2 + r7
            r9.set(r3, r2)
            com.badlogic.gdx.math.Vector2 r2 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point3
            r2.set(r4, r6)
            goto L3c1
        L391:
            com.badlogic.gdx.math.Vector2 r9 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point1
            r10 = 1119092736(0x42b40000, float:90.0)
            float r11 = r7 - r10
            float r12 = org.fortheloss.framework.CustomMathUtils.cosDeg(r11)
            float r12 = r12 * r8
            float r12 = r12 + r4
            float r11 = org.fortheloss.framework.CustomMathUtils.sinDeg(r11)
            float r11 = r11 * r8
            float r11 = r11 + r6
            r9.set(r12, r11)
            com.badlogic.gdx.math.Vector2 r9 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point2
            float r7 = r7 + r10
            float r10 = org.fortheloss.framework.CustomMathUtils.cosDeg(r7)
            float r10 = r10 * r8
            float r4 = r4 + r10
            float r7 = org.fortheloss.framework.CustomMathUtils.sinDeg(r7)
            float r7 = r7 * r8
            float r6 = r6 + r7
            r9.set(r4, r6)
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point3
            r4.set(r3, r2)
        L3c1:
            com.badlogic.gdx.math.Vector2 r2 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point1
            float r2 = r2.x
            com.badlogic.gdx.math.Vector2 r3 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point2
            float r3 = r3.x
            float r2 = java.lang.Math.min(r2, r3)
            com.badlogic.gdx.math.Vector2 r3 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point3
            float r3 = r3.x
            float r10 = java.lang.Math.min(r2, r3)
            com.badlogic.gdx.math.Vector2 r2 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point1
            float r2 = r2.x
            com.badlogic.gdx.math.Vector2 r3 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point2
            float r3 = r3.x
            float r2 = java.lang.Math.max(r2, r3)
            com.badlogic.gdx.math.Vector2 r3 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point3
            float r3 = r3.x
            float r2 = java.lang.Math.max(r2, r3)
            com.badlogic.gdx.math.Vector2 r3 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point1
            float r3 = r3.y
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point2
            float r4 = r4.y
            float r3 = java.lang.Math.min(r3, r4)
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point3
            float r4 = r4.y
            float r13 = java.lang.Math.min(r3, r4)
            com.badlogic.gdx.math.Vector2 r3 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point1
            float r3 = r3.y
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point2
            float r4 = r4.y
            float r3 = java.lang.Math.max(r3, r4)
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator.point3
            float r4 = r4.y
            float r6 = java.lang.Math.max(r3, r4)
            goto L588
        L413:
            r2 = 6
            if (r7 != r2) goto L544
            float r2 = r5.getGlobalX()
            float r3 = r5.getGlobalY()
            float r4 = r5.getAngle()
            float r6 = r5.getTrapezoidThickness2()
            float r6 = r6 * r11
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r7
            boolean r7 = r5.getTrapezoidIsRounded2()
            if (r7 == 0) goto L43a
            float r7 = r2 - r6
            float r8 = r2 + r6
            float r9 = r3 - r6
            float r6 = r6 + r3
            goto L463
        L43a:
            r7 = 1119092736(0x42b40000, float:90.0)
            float r8 = r4 - r7
            float r9 = org.fortheloss.framework.CustomMathUtils.cosDeg(r8)
            float r9 = r9 * r6
            float r9 = r9 + r2
            float r14 = r4 + r7
            float r7 = org.fortheloss.framework.CustomMathUtils.cosDeg(r14)
            float r7 = r7 * r6
            float r7 = r7 + r2
            float r8 = org.fortheloss.framework.CustomMathUtils.sinDeg(r8)
            float r8 = r8 * r6
            float r8 = r8 + r3
            float r10 = org.fortheloss.framework.CustomMathUtils.sinDeg(r14)
            float r10 = r10 * r6
            float r6 = r3 + r10
            r23 = r8
            r8 = r7
            r7 = r9
            r9 = r23
        L463:
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = r5.getParentNode()
            boolean r12 = r0.mForceNonZeroSizes
            if (r12 == 0) goto L4d0
            boolean r12 = r10.isStatic()
            if (r12 == 0) goto L477
            int r12 = r10.getThickness()
            if (r12 <= 0) goto L4d0
        L477:
            float r12 = r10.getGlobalX()
            float r10 = r10.getGlobalY()
            float r13 = r5.getTrapezoidThickness1()
            float r13 = r13 * r11
            r14 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 * r14
            boolean r14 = r5.getTrapezoidIsRounded1()
            if (r14 == 0) goto L49b
            float r6 = r2 - r13
            float r7 = r2 + r13
            float r8 = r3 - r13
            float r13 = r13 + r3
            r10 = r6
            r6 = r13
            r13 = r8
            r8 = r7
            goto L4d2
        L49b:
            r14 = 1119092736(0x42b40000, float:90.0)
            float r15 = r4 - r14
            float r19 = org.fortheloss.framework.CustomMathUtils.cosDeg(r15)
            float r19 = r19 * r13
            float r0 = r12 + r19
            float r0 = java.lang.Math.min(r7, r0)
            float r7 = r4 + r14
            float r14 = org.fortheloss.framework.CustomMathUtils.cosDeg(r7)
            float r14 = r14 * r13
            float r12 = r12 + r14
            float r8 = java.lang.Math.max(r8, r12)
            float r12 = org.fortheloss.framework.CustomMathUtils.sinDeg(r15)
            float r12 = r12 * r13
            float r12 = r12 + r10
            float r9 = java.lang.Math.min(r9, r12)
            float r7 = org.fortheloss.framework.CustomMathUtils.sinDeg(r7)
            float r7 = r7 * r13
            float r10 = r10 + r7
            float r6 = java.lang.Math.max(r6, r10)
            r10 = r0
            goto L4d1
        L4d0:
            r10 = r7
        L4d1:
            r13 = r9
        L4d2:
            int r0 = r5.getSegmentCurve()
            if (r0 == 0) goto L542
            int r0 = r5.getSegmentCurve()
            if (r0 <= 0) goto L4e0
            r0 = 1
            goto L4e1
        L4e0:
            r0 = -1
        L4e1:
            float r7 = r5.getLength()
            float r7 = r7 * r11
            float r9 = r5.getTrapezoidThickness1()
            float r12 = r5.getTrapezoidThickness2()
            r14 = 1056964608(0x3f000000, float:0.5)
            float r9 = com.badlogic.gdx.math.MathUtils.lerp(r9, r12, r14)
            float r9 = r9 * r11
            int r12 = r5.getSegmentCurve()
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = java.lang.Math.abs(r12)
            r12 = 1127481344(0x43340000, float:180.0)
            float r12 = r4 - r12
            float r15 = org.fortheloss.framework.CustomMathUtils.cosDeg(r12)
            float r15 = r15 * r7
            float r15 = r15 * r14
            float r2 = r2 + r15
            r15 = 1119092736(0x42b40000, float:90.0)
            float r4 = r4 + r15
            float r15 = org.fortheloss.framework.CustomMathUtils.cosDeg(r4)
            float r9 = r9 * r14
            float r11 = r11 + r9
            float r15 = r15 * r11
            float r0 = (float) r0
            float r15 = r15 * r0
            float r2 = r2 + r15
            float r9 = org.fortheloss.framework.CustomMathUtils.sinDeg(r12)
            float r9 = r9 * r7
            float r9 = r9 * r14
            float r3 = r3 + r9
            float r4 = org.fortheloss.framework.CustomMathUtils.sinDeg(r4)
            float r4 = r4 * r11
            float r4 = r4 * r0
            float r3 = r3 + r4
            float r10 = java.lang.Math.min(r10, r2)
            float r2 = java.lang.Math.max(r8, r2)
            float r13 = java.lang.Math.min(r13, r3)
            float r6 = java.lang.Math.max(r6, r3)
            goto L588
        L542:
            r2 = r8
            goto L588
        L544:
            r2 = 0
            r6 = 0
            r10 = 0
            r13 = 0
            goto L588
        L549:
            float r0 = r5.getAngle()
            float r2 = r5.getLength()
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r5.getParentNode()
            float r4 = r3.getGlobalX()
            float r3 = r3.getGlobalY()
            float r6 = org.fortheloss.framework.CustomMathUtils.cosDeg(r0)
            float r6 = r6 * r2
            float r6 = r6 * r11
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r7
            float r4 = r4 + r6
            float r0 = org.fortheloss.framework.CustomMathUtils.sinDeg(r0)
            float r0 = r0 * r2
            float r0 = r0 * r11
            float r0 = r0 * r7
            float r3 = r3 + r0
            int r0 = r5.getThickness()
            float r0 = (float) r0
            float r2 = r2 + r0
            float r2 = r2 * r11
            float r2 = r2 * r7
            float r10 = r4 - r2
            float r0 = r4 + r2
            float r13 = r3 - r2
            float r6 = r3 + r2
            r2 = r0
        L588:
            float r0 = r1.x
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L590
            r1.x = r10
        L590:
            float r0 = r1.width
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L598
            r1.width = r2
        L598:
            float r0 = r1.y
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5a0
            r1.y = r13
        L5a0:
            float r0 = r1.height
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5a8
            r1.height = r6
        L5a8:
            r0 = r22
        L5aa:
            r5.addChildrenToStack(r0)
            r3 = r0
            r4 = r20
            r2 = 0
            r0 = r24
            goto L22
        L5b5:
            boolean r0 = r25.hasPolyfillAnchorNode()
            if (r0 == 0) goto L642
            java.util.ArrayList r0 = r25.getPolyfillAnchorNodes()
            int r2 = r0.size()
            r3 = 1
            int r2 = r2 - r3
        L5c5:
            if (r2 < 0) goto L642
            java.lang.Object r3 = r0.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            java.util.ArrayList r4 = r3.getPolynodeChildren()
            int r5 = r3.getThickness()
            if (r5 != 0) goto L5ff
            float r5 = r3.getGlobalX()
            float r3 = r3.getGlobalY()
            float r6 = r1.x
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L5e7
            r1.x = r5
        L5e7:
            float r6 = r1.width
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L5ef
            r1.width = r5
        L5ef:
            float r5 = r1.y
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L5f7
            r1.y = r3
        L5f7:
            float r5 = r1.height
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5ff
            r1.height = r3
        L5ff:
            int r3 = r4.size()
            r5 = 1
            int r3 = r3 - r5
        L605:
            if (r3 < 0) goto L63f
            java.lang.Object r6 = r4.get(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            int r7 = r6.getThickness()
            if (r7 <= 0) goto L614
            goto L63c
        L614:
            float r7 = r6.getGlobalX()
            float r6 = r6.getGlobalY()
            float r8 = r1.x
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 >= 0) goto L624
            r1.x = r7
        L624:
            float r8 = r1.width
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 <= 0) goto L62c
            r1.width = r7
        L62c:
            float r7 = r1.y
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 >= 0) goto L634
            r1.y = r6
        L634:
            float r7 = r1.height
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L63c
            r1.height = r6
        L63c:
            int r3 = r3 + (-1)
            goto L605
        L63f:
            int r2 = r2 + (-1)
            goto L5c5
        L642:
            return r1
    }
}
