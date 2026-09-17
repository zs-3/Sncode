package org.fortheloss.sticknodes.sprite;

/* loaded from: classes2.dex */
public class SpriteNode implements org.fortheloss.sticknodes.stickfigure.INode {
    private static float mInitialDragDistanceToOppositeSinRot;
    private static float mInitialDragDistanceToOppositeX;
    private static float mInitialDragDistanceToOppositeY;
    private static float mInitialDragDistanceToOriginSinRot;
    private static float mInitialDragDistanceToOriginX;
    private static float mInitialDragDistanceToOriginY;
    private static float mInitialDragOppositeX;
    private static float mInitialDragOppositeY;
    private static float mInitialDragOriginDistanceToOpposite;
    private static float mInitialDragOriginRelativeAngleToOpposite;
    private static float mInitialDragOriginX;
    private static float mInitialDragOriginY;
    private static float mInitialDragRelativeAngleToOpposite;
    private static float mInitialDragRelativeAngleToOrigin;
    private static float mInitialDragScaleX;
    private static float mInitialDragScaleY;
    private static float mInitialDragSpriteRotation;
    private static float mInitialDragSpriteX;
    private static float mInitialDragSpriteY;
    private org.fortheloss.sticknodes.sprite.SpriteNode mChildNodeRef;
    private int mDrawOrderIndex;
    private org.fortheloss.sticknodes.sprite.SpriteNode mParentNodeRef;
    private org.fortheloss.sticknodes.sprite.SpriteRef mSpriteRef;
    private int mType;
    private float mX;
    private float mY;

    public SpriteNode(org.fortheloss.sticknodes.sprite.SpriteRef r3, org.fortheloss.sticknodes.sprite.SpriteNode r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mDrawOrderIndex = r0
            r1 = 0
            r2.mX = r1
            r2.mY = r1
            r1 = -1
            r2.mType = r1
            r2.mSpriteRef = r3
            r2.mParentNodeRef = r4
            if (r4 == 0) goto L16
            r4.mChildNodeRef = r2
        L16:
            if (r4 != 0) goto L1b
            r2.mDrawOrderIndex = r0
            goto L1e
        L1b:
            r3 = 1
            r2.mDrawOrderIndex = r3
        L1e:
            return
    }

    public SpriteNode(org.fortheloss.sticknodes.sprite.SpriteRef r2, org.fortheloss.sticknodes.sprite.SpriteNode r3, org.fortheloss.sticknodes.sprite.SpriteNode r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mDrawOrderIndex = r0
            r0 = 0
            r1.mX = r0
            r1.mY = r0
            r0 = -1
            r1.mType = r0
            r1.mSpriteRef = r2
            r1.mParentNodeRef = r3
            if (r3 == 0) goto L16
            r3.mChildNodeRef = r1
        L16:
            int r2 = r4.mDrawOrderIndex
            r1.mDrawOrderIndex = r2
            float r2 = r4.mX
            r1.mX = r2
            float r2 = r4.mY
            r1.mY = r2
            return
    }

    private float angleDiff(float r2, float r3) {
            r1 = this;
            float r3 = r3 - r2
            r2 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r2
            r0 = 1141309440(0x44070000, float:540.0)
            float r3 = r3 + r0
            float r3 = r3 % r2
            r2 = 1127481344(0x43340000, float:180.0)
            float r3 = r3 - r2
            return r3
    }

    private int getOppositeCorner(int r9) {
            r8 = this;
            r0 = r9 & 16
            r1 = -1
            r2 = 8
            r3 = 4
            r4 = 2
            r5 = 1
            if (r0 != 0) goto Le
            r6 = r9 & 64
            if (r6 == 0) goto L17
        Le:
            r6 = r9 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L2b
            r7 = r9 & 32
            if (r7 == 0) goto L17
            goto L2b
        L17:
            r0 = r9 & 1
            if (r0 == 0) goto L1c
            return r3
        L1c:
            r0 = r9 & 2
            if (r0 == 0) goto L21
            return r2
        L21:
            r0 = r9 & 4
            if (r0 == 0) goto L26
            return r5
        L26:
            r9 = r9 & r2
            if (r9 == 0) goto L2a
            return r4
        L2a:
            return r1
        L2b:
            if (r0 == 0) goto L30
            if (r6 == 0) goto L30
            return r3
        L30:
            if (r0 == 0) goto L37
            r0 = r9 & 32
            if (r0 == 0) goto L37
            return r2
        L37:
            r0 = r9 & 64
            if (r0 == 0) goto L40
            r9 = r9 & 32
            if (r9 == 0) goto L40
            return r5
        L40:
            if (r0 == 0) goto L45
            if (r6 == 0) goto L45
            return r4
        L45:
            return r1
    }

    public void beginDrag(float r9, float r10) {
            r8 = this;
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = r8.mParentNodeRef
            if (r0 != 0) goto L5
            return
        L5:
            float r0 = r0.getGlobalX()
            float r9 = r9 - r0
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = r8.mParentNodeRef
            float r0 = r0.getGlobalY()
            float r10 = r10 - r0
            r8.setPosition(r9, r10)
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getX()
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragSpriteX = r9
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getY()
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragSpriteY = r9
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getRotation()
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragSpriteRotation = r9
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getScaleX()
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleX = r9
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getScaleY()
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleY = r9
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getNormalizedOriginX()
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginX = r9
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getNormalizedOriginY()
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginY = r9
            float r9 = r8.getGlobalX()
            org.fortheloss.sticknodes.sprite.SpriteNode r10 = r8.mParentNodeRef
            float r10 = r10.getGlobalX()
            float r9 = r9 - r10
            float r10 = r8.getGlobalY()
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = r8.mParentNodeRef
            float r0 = r0.getGlobalY()
            float r10 = r10 - r0
            float r0 = r9 * r9
            float r1 = r10 * r10
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r1 * r2
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L79
            float r0 = r1 * r2
        L79:
            double r3 = (double) r10
            double r5 = (double) r9
            double r3 = java.lang.Math.atan2(r3, r5)
            float r1 = (float) r3
            r3 = 1113927392(0x42652ee0, float:57.295776)
            float r1 = r1 * r3
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragRelativeAngleToOrigin = r1
            float r1 = com.badlogic.gdx.math.MathUtils.atan2(r10, r9)
            float r1 = r1 * r3
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = r8.mSpriteRef
            float r4 = r4.getRotation()
            float r1 = r1 - r4
            float r1 = com.badlogic.gdx.math.MathUtils.cosDeg(r1)
            float r1 = r1 * r0
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragDistanceToOriginX = r1
            float r1 = com.badlogic.gdx.math.MathUtils.atan2(r10, r9)
            float r1 = r1 * r3
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = r8.mSpriteRef
            float r4 = r4.getRotation()
            float r1 = r1 - r4
            float r1 = com.badlogic.gdx.math.MathUtils.sinDeg(r1)
            float r1 = r1 * r0
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragDistanceToOriginY = r1
            float r9 = com.badlogic.gdx.math.MathUtils.atan2(r10, r9)
            float r9 = r9 * r3
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getRotation()
            r1 = 1127481344(0x43340000, float:180.0)
            float r10 = r1 - r10
            float r9 = r9 + r10
            float r9 = com.badlogic.gdx.math.MathUtils.sinDeg(r9)
            float r9 = r9 * r0
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragDistanceToOriginSinRot = r9
            float r9 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleX
            r10 = 0
            r0 = 1
            r4 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto Ld5
            r9 = 1
            goto Ld6
        Ld5:
            r9 = 0
        Ld6:
            float r5 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleY
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 >= 0) goto Lde
            r10 = 1
            goto Ldf
        Lde:
            r10 = 0
        Ldf:
            int r5 = r8.mType
            int r5 = r8.getOppositeCorner(r5)
            r6 = -1
            if (r5 != r6) goto L16c
            int r2 = r8.mType
            r5 = r2 & 64
            if (r5 != 0) goto Lf4
            r2 = r2 & 16
            if (r2 == 0) goto Lf3
            goto Lf4
        Lf3:
            r0 = 0
        Lf4:
            if (r0 == 0) goto L123
            r9 = 90
            r0 = -90
            if (r10 == 0) goto L109
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getRotation()
            int r2 = r8.mType
            r2 = r2 & 64
            if (r2 != 0) goto L116
            goto L118
        L109:
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getRotation()
            int r2 = r8.mType
            r2 = r2 & 64
            if (r2 == 0) goto L116
            goto L118
        L116:
            r9 = -90
        L118:
            float r9 = (float) r9
            float r10 = r10 + r9
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getScaledHeight()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            goto L14e
        L123:
            r10 = -180(0xffffffffffffff4c, float:NaN)
            if (r9 == 0) goto L134
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getRotation()
            int r0 = r8.mType
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L141
            goto L143
        L134:
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getRotation()
            int r0 = r8.mType
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L141
            goto L143
        L141:
            r4 = -180(0xffffffffffffff4c, float:NaN)
        L143:
            float r10 = (float) r4
            float r9 = r9 + r10
            r10 = r9
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getScaledWidth()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
        L14e:
            float r9 = r9 * r0
            float r0 = r8.getGlobalX()
            float r2 = com.badlogic.gdx.math.MathUtils.cosDeg(r10)
            float r2 = r2 * r9
            float r0 = r0 + r2
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeX = r0
            float r0 = r8.getGlobalY()
            float r10 = com.badlogic.gdx.math.MathUtils.sinDeg(r10)
            float r9 = r9 * r10
            float r0 = r0 + r9
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeY = r0
            goto L32f
        L16c:
            if (r5 != r0) goto L1c2
            if (r9 == 0) goto L183
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getNormalizedOriginX()
            float r9 = r2 - r9
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r8.mSpriteRef
            float r0 = r0.getScaledWidth()
            float r9 = r9 * r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            goto L194
        L183:
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getNormalizedOriginX()
            float r9 = -r9
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r8.mSpriteRef
            float r0 = r0.getScaledWidth()
            float r9 = r9 * r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
        L194:
            float r9 = r9 * r0
            if (r10 == 0) goto L1ad
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getNormalizedOriginY()
            float r10 = -r10
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r8.mSpriteRef
            float r0 = r0.getScaledHeight()
            float r10 = r10 * r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
        L1a9:
            float r10 = r10 * r0
            goto L2b6
        L1ad:
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getNormalizedOriginY()
            float r2 = r2 - r10
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getScaledHeight()
            float r2 = r2 * r10
            float r10 = org.fortheloss.sticknodes.App.assetScaling
        L1be:
            float r10 = r10 * r2
            goto L2b6
        L1c2:
            r0 = 2
            if (r5 != r0) goto L213
            if (r9 == 0) goto L1d9
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getNormalizedOriginX()
            float r9 = -r9
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r8.mSpriteRef
            float r0 = r0.getScaledWidth()
            float r9 = r9 * r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            goto L1eb
        L1d9:
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getNormalizedOriginX()
            float r9 = r2 - r9
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r8.mSpriteRef
            float r0 = r0.getScaledWidth()
            float r9 = r9 * r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
        L1eb:
            float r9 = r9 * r0
            if (r10 == 0) goto L201
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getNormalizedOriginY()
            float r10 = -r10
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r8.mSpriteRef
            float r0 = r0.getScaledHeight()
            float r10 = r10 * r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            goto L1a9
        L201:
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getNormalizedOriginY()
            float r2 = r2 - r10
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getScaledHeight()
            float r2 = r2 * r10
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            goto L1be
        L213:
            r0 = 4
            if (r5 != r0) goto L266
            if (r9 == 0) goto L22a
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getNormalizedOriginX()
            float r9 = -r9
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r8.mSpriteRef
            float r0 = r0.getScaledWidth()
            float r9 = r9 * r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            goto L23c
        L22a:
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getNormalizedOriginX()
            float r9 = r2 - r9
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r8.mSpriteRef
            float r0 = r0.getScaledWidth()
            float r9 = r9 * r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
        L23c:
            float r9 = r9 * r0
            if (r10 == 0) goto L253
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getNormalizedOriginY()
            float r2 = r2 - r10
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getScaledHeight()
            float r2 = r2 * r10
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            goto L1be
        L253:
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getNormalizedOriginY()
            float r10 = -r10
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r8.mSpriteRef
            float r0 = r0.getScaledHeight()
            float r10 = r10 * r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            goto L1a9
        L266:
            if (r9 == 0) goto L27b
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getNormalizedOriginX()
            float r9 = r2 - r9
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r8.mSpriteRef
            float r0 = r0.getScaledWidth()
            float r9 = r9 * r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            goto L28c
        L27b:
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r8.mSpriteRef
            float r9 = r9.getNormalizedOriginX()
            float r9 = -r9
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r8.mSpriteRef
            float r0 = r0.getScaledWidth()
            float r9 = r9 * r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
        L28c:
            float r9 = r9 * r0
            if (r10 == 0) goto L2a3
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getNormalizedOriginY()
            float r2 = r2 - r10
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getScaledHeight()
            float r2 = r2 * r10
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            goto L1be
        L2a3:
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getNormalizedOriginY()
            float r10 = -r10
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r8.mSpriteRef
            float r0 = r0.getScaledHeight()
            float r10 = r10 * r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            goto L1a9
        L2b6:
            float r0 = r9 * r9
            float r2 = r10 * r10
            float r0 = r0 + r2
            double r4 = (double) r0
            double r4 = java.lang.Math.sqrt(r4)
            float r0 = (float) r4
            float r9 = com.badlogic.gdx.math.MathUtils.atan2(r10, r9)
            float r9 = r9 * r3
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getRotation()
            float r9 = r9 + r10
            org.fortheloss.sticknodes.sprite.SpriteNode r10 = r8.mParentNodeRef
            float r10 = r10.getGlobalX()
            float r2 = com.badlogic.gdx.math.MathUtils.cosDeg(r9)
            float r2 = r2 * r0
            float r10 = r10 + r2
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeX = r10
            org.fortheloss.sticknodes.sprite.SpriteNode r10 = r8.mParentNodeRef
            float r10 = r10.getGlobalY()
            float r9 = com.badlogic.gdx.math.MathUtils.sinDeg(r9)
            float r0 = r0 * r9
            float r10 = r10 + r0
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeY = r10
            float r9 = r8.getGlobalY()
            float r10 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeY
            float r9 = r9 - r10
            double r9 = (double) r9
            float r0 = r8.getGlobalX()
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeX
            float r0 = r0 - r2
            double r4 = (double) r0
            double r9 = java.lang.Math.atan2(r9, r4)
            float r9 = (float) r9
            float r9 = r9 * r3
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragRelativeAngleToOpposite = r9
            float r9 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeX
            org.fortheloss.sticknodes.sprite.SpriteNode r10 = r8.mParentNodeRef
            float r10 = r10.getGlobalX()
            float r9 = r9 - r10
            float r10 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeY
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = r8.mParentNodeRef
            float r0 = r0.getGlobalY()
            float r10 = r10 - r0
            double r4 = (double) r10
            double r6 = (double) r9
            double r4 = java.lang.Math.atan2(r4, r6)
            float r0 = (float) r4
            float r0 = r0 * r3
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginRelativeAngleToOpposite = r0
            float r9 = r9 * r9
            float r10 = r10 * r10
            float r9 = r9 + r10
            double r9 = (double) r9
            double r9 = java.lang.Math.sqrt(r9)
            float r9 = (float) r9
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginDistanceToOpposite = r9
        L32f:
            float r9 = r8.getGlobalX()
            float r10 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeX
            float r9 = r9 - r10
            float r10 = r8.getGlobalY()
            float r0 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeY
            float r10 = r10 - r0
            float r0 = r9 * r9
            float r2 = r10 * r10
            float r0 = r0 + r2
            double r4 = (double) r0
            double r4 = java.lang.Math.sqrt(r4)
            float r0 = (float) r4
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1084227584(0x40a00000, float:5.0)
            float r5 = r2 * r4
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L354
            float r0 = r2 * r4
        L354:
            float r2 = com.badlogic.gdx.math.MathUtils.atan2(r10, r9)
            float r2 = r2 * r3
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = r8.mSpriteRef
            float r4 = r4.getRotation()
            float r2 = r2 - r4
            float r2 = com.badlogic.gdx.math.MathUtils.cosDeg(r2)
            float r2 = r2 * r0
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragDistanceToOppositeX = r2
            float r2 = com.badlogic.gdx.math.MathUtils.atan2(r10, r9)
            float r2 = r2 * r3
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = r8.mSpriteRef
            float r4 = r4.getRotation()
            float r2 = r2 - r4
            float r2 = com.badlogic.gdx.math.MathUtils.sinDeg(r2)
            float r2 = r2 * r0
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragDistanceToOppositeY = r2
            float r9 = com.badlogic.gdx.math.MathUtils.atan2(r10, r9)
            float r9 = r9 * r3
            org.fortheloss.sticknodes.sprite.SpriteRef r10 = r8.mSpriteRef
            float r10 = r10.getRotation()
            float r1 = r1 - r10
            float r9 = r9 + r1
            float r9 = com.badlogic.gdx.math.MathUtils.sinDeg(r9)
            float r9 = r9 * r0
            org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragDistanceToOppositeSinRot = r9
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mSpriteRef = r0
            r1.mParentNodeRef = r0
            r1.mChildNodeRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public com.badlogic.gdx.math.Vector2 dragTo(float r19, float r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            org.fortheloss.sticknodes.sprite.SpriteNode r3 = r0.mParentNodeRef
            r4 = 0
            if (r3 != 0) goto L11
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = r0.mSpriteRef
            r3.setPosition(r1, r2)
            return r4
        L11:
            float r3 = r3.getGlobalX()
            float r3 = r1 - r3
            org.fortheloss.sticknodes.sprite.SpriteNode r5 = r0.mParentNodeRef
            float r5 = r5.getGlobalY()
            float r5 = r2 - r5
            r0.setPosition(r3, r5)
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = r0.mSpriteRef
            boolean r3 = r3.isJoined()
            if (r3 != 0) goto L3a
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = r0.mSpriteRef
            byte r3 = r3.isLockedToCamera()
            if (r3 == 0) goto L33
            goto L3a
        L33:
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = r0.mSpriteRef
            boolean r3 = r3.isDragOriginBased()
            goto L3b
        L3a:
            r3 = 1
        L3b:
            int r6 = r0.mType
            r7 = r6 & 1
            r8 = 1113927392(0x42652ee0, float:57.295776)
            if (r7 != 0) goto L413
            r7 = r6 & 2
            if (r7 != 0) goto L413
            r7 = r6 & 4
            if (r7 != 0) goto L413
            r6 = r6 & 8
            if (r6 == 0) goto L52
            goto L413
        L52:
            org.fortheloss.sticknodes.sprite.SpriteRef r6 = r0.mSpriteRef
            boolean r6 = r6.getScaleLinked()
            int r7 = r0.mType
            r9 = r7 & 128(0x80, float:1.794E-43)
            r10 = 0
            if (r9 != 0) goto L63
            r9 = r7 & 32
            if (r9 == 0) goto L6c
        L63:
            r9 = r7 & 16
            if (r9 != 0) goto L6e
            r9 = r7 & 64
            if (r9 == 0) goto L6c
            goto L6e
        L6c:
            r9 = 0
            goto L6f
        L6e:
            r9 = 1
        L6f:
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12 = 1119092736(0x42b40000, float:90.0)
            r13 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L1c7
            if (r6 == 0) goto L1c7
            r6 = 1127481344(0x43340000, float:180.0)
            if (r3 == 0) goto Lc0
            org.fortheloss.sticknodes.sprite.SpriteNode r3 = r0.mParentNodeRef
            float r3 = r3.getGlobalX()
            float r1 = r1 - r3
            org.fortheloss.sticknodes.sprite.SpriteNode r3 = r0.mParentNodeRef
            float r3 = r3.getGlobalY()
            float r2 = r2 - r3
            float r3 = r1 * r1
            float r5 = r2 * r2
            float r3 = r3 + r5
            double r9 = (double) r3
            double r9 = java.lang.Math.sqrt(r9)
            float r3 = (float) r9
            float r1 = com.badlogic.gdx.math.MathUtils.atan2(r2, r1)
            float r1 = r1 * r8
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            float r2 = r2.getRotation()
            float r6 = r6 - r2
            float r1 = r1 + r6
            float r1 = com.badlogic.gdx.math.MathUtils.sinDeg(r1)
            float r1 = r1 * r3
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragDistanceToOriginSinRot
            float r1 = r1 / r2
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleX
            int r3 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r3 != 0) goto Lb5
            goto Lb6
        Lb5:
            r14 = r2
        Lb6:
            float r1 = r1 * r14
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            r2.setScaleX(r1)
            r3 = 0
            goto L3ff
        Lc0:
            float r3 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleX
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 >= 0) goto Lc8
            r3 = 1
            goto Lc9
        Lc8:
            r3 = 0
        Lc9:
            float r7 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleY
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 >= 0) goto Ld1
            r5 = 1
            goto Ld2
        Ld1:
            r5 = 0
        Ld2:
            float r7 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeX
            float r1 = r1 - r7
            float r7 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeY
            float r2 = r2 - r7
            float r7 = r1 * r1
            float r9 = r2 * r2
            float r7 = r7 + r9
            double r9 = (double) r7
            double r9 = java.lang.Math.sqrt(r9)
            float r7 = (float) r9
            float r1 = com.badlogic.gdx.math.MathUtils.atan2(r2, r1)
            float r1 = r1 * r8
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            float r2 = r2.getRotation()
            float r6 = r6 - r2
            float r1 = r1 + r6
            float r1 = com.badlogic.gdx.math.MathUtils.sinDeg(r1)
            float r1 = r1 * r7
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragDistanceToOppositeSinRot
            float r1 = r1 / r2
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleX
            int r6 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r6 != 0) goto L102
            r2 = 1065353216(0x3f800000, float:1.0)
        L102:
            float r1 = r1 * r2
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            r2.setScaleX(r1)
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r0.mSpriteRef
            float r1 = r1.getScaledWidth()
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            float r2 = r2.getWidth()
            float r6 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleX
            float r2 = r2 * r6
            float r1 = r1 - r2
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            if (r3 == 0) goto L12c
            int r2 = r0.mType
            r2 = r2 & 32
            if (r2 != 0) goto L129
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginX
            goto L134
        L129:
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginX
            goto L139
        L12c:
            int r2 = r0.mType
            r2 = r2 & 32
            if (r2 == 0) goto L137
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginX
        L134:
            float r2 = r2 * r11
            goto L13b
        L137:
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginX
        L139:
            float r2 = r14 - r2
        L13b:
            float r1 = r1 * r2
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            float r2 = r2.getRotation()
            float r2 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r2 = r2 * r1
            float r2 = r2 + r13
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = r0.mSpriteRef
            float r3 = r3.getRotation()
            float r3 = org.fortheloss.framework.CustomMathUtils.sinDeg(r3)
            float r3 = r3 * r1
            float r3 = r3 + r13
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r0.mSpriteRef
            float r1 = r1.getScaledHeight()
            org.fortheloss.sticknodes.sprite.SpriteRef r6 = r0.mSpriteRef
            float r6 = r6.getHeight()
            float r7 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleY
            float r6 = r6 * r7
            float r1 = r1 - r6
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            int r6 = r0.mType
            r7 = r6 & 16
            if (r7 == 0) goto L174
            if (r5 == 0) goto L17a
        L174:
            r6 = r6 & 64
            if (r6 == 0) goto L19e
            if (r5 == 0) goto L19e
        L17a:
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = r0.mSpriteRef
            float r5 = r5.getRotation()
            float r5 = r5 + r12
            float r5 = org.fortheloss.framework.CustomMathUtils.cosDeg(r5)
            float r5 = r5 * r1
            float r6 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginY
            float r5 = r5 * r6
            float r2 = r2 - r5
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = r0.mSpriteRef
            float r5 = r5.getRotation()
            float r5 = r5 + r12
            float r5 = org.fortheloss.framework.CustomMathUtils.sinDeg(r5)
            float r5 = r5 * r1
            float r1 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginY
            float r5 = r5 * r1
            goto L1c4
        L19e:
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = r0.mSpriteRef
            float r5 = r5.getRotation()
            float r5 = r5 - r12
            float r5 = org.fortheloss.framework.CustomMathUtils.cosDeg(r5)
            float r5 = r5 * r1
            float r6 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginY
            float r6 = r14 - r6
            float r5 = r5 * r6
            float r2 = r2 - r5
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = r0.mSpriteRef
            float r5 = r5.getRotation()
            float r5 = r5 - r12
            float r5 = org.fortheloss.framework.CustomMathUtils.sinDeg(r5)
            float r5 = r5 * r1
            float r1 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginY
            float r14 = r14 - r1
            float r5 = r5 * r14
        L1c4:
            float r3 = r3 - r5
            goto L3fe
        L1c7:
            r9 = r7 & 128(0x80, float:1.794E-43)
            r15 = 1056964608(0x3f000000, float:0.5)
            if (r9 != 0) goto L1d1
            r7 = r7 & 32
            if (r7 == 0) goto L214
        L1d1:
            if (r3 == 0) goto L217
            org.fortheloss.sticknodes.sprite.SpriteNode r7 = r0.mParentNodeRef
            float r7 = r7.getGlobalX()
            float r7 = r1 - r7
            org.fortheloss.sticknodes.sprite.SpriteNode r9 = r0.mParentNodeRef
            float r9 = r9.getGlobalY()
            float r9 = r2 - r9
            float r16 = r7 * r7
            float r17 = r9 * r9
            float r5 = r16 + r17
            double r4 = (double) r5
            double r4 = java.lang.Math.sqrt(r4)
            float r4 = (float) r4
            float r5 = com.badlogic.gdx.math.MathUtils.atan2(r9, r7)
            float r5 = r5 * r8
            org.fortheloss.sticknodes.sprite.SpriteRef r7 = r0.mSpriteRef
            float r7 = r7.getRotation()
            float r5 = r5 - r7
            float r5 = com.badlogic.gdx.math.MathUtils.cosDeg(r5)
            float r5 = r5 * r4
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragDistanceToOriginX
            float r5 = r5 / r4
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleX
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 != 0) goto L20d
            r4 = 1065353216(0x3f800000, float:1.0)
        L20d:
            float r5 = r5 * r4
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = r0.mSpriteRef
            r4.setScaleX(r5)
        L214:
            r7 = 0
            goto L2e7
        L217:
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleX
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 >= 0) goto L21f
            r4 = 1
            goto L220
        L21f:
            r4 = 0
        L220:
            float r5 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeX
            float r5 = r1 - r5
            float r7 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeY
            float r7 = r2 - r7
            float r9 = r5 * r5
            float r17 = r7 * r7
            float r9 = r9 + r17
            double r12 = (double) r9
            double r12 = java.lang.Math.sqrt(r12)
            float r9 = (float) r12
            float r5 = com.badlogic.gdx.math.MathUtils.atan2(r7, r5)
            float r5 = r5 * r8
            org.fortheloss.sticknodes.sprite.SpriteRef r7 = r0.mSpriteRef
            float r7 = r7.getRotation()
            float r5 = r5 - r7
            float r5 = com.badlogic.gdx.math.MathUtils.cosDeg(r5)
            float r5 = r5 * r9
            float r7 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragDistanceToOppositeX
            float r5 = r5 / r7
            float r7 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleX
            float r5 = r5 * r7
            org.fortheloss.sticknodes.sprite.SpriteRef r7 = r0.mSpriteRef
            r7.setScaleX(r5)
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = r0.mSpriteRef
            float r5 = r5.getScaledWidth()
            org.fortheloss.sticknodes.sprite.SpriteRef r7 = r0.mSpriteRef
            float r7 = r7.getWidth()
            float r9 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleX
            float r7 = r7 * r9
            float r5 = r5 - r7
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r7
            if (r4 == 0) goto L276
            int r4 = r0.mType
            r4 = r4 & 32
            if (r4 != 0) goto L273
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginX
            goto L27e
        L273:
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginX
            goto L283
        L276:
            int r4 = r0.mType
            r4 = r4 & 32
            if (r4 == 0) goto L281
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginX
        L27e:
            float r4 = r4 * r11
            goto L285
        L281:
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginX
        L283:
            float r4 = r14 - r4
        L285:
            float r5 = r5 * r4
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = r0.mSpriteRef
            float r4 = r4.getRotation()
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r4)
            float r4 = r4 * r5
            r7 = 0
            float r4 = r4 + r7
            org.fortheloss.sticknodes.sprite.SpriteRef r9 = r0.mSpriteRef
            float r9 = r9.getRotation()
            float r9 = org.fortheloss.framework.CustomMathUtils.sinDeg(r9)
            float r9 = r9 * r5
            float r9 = r9 + r7
            if (r6 == 0) goto L2e5
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = r0.mSpriteRef
            float r5 = r5.getScaledHeight()
            org.fortheloss.sticknodes.sprite.SpriteRef r7 = r0.mSpriteRef
            float r7 = r7.getHeight()
            float r12 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleY
            float r7 = r7 * r12
            float r5 = r5 - r7
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r7
            org.fortheloss.sticknodes.sprite.SpriteRef r7 = r0.mSpriteRef
            float r7 = r7.getRotation()
            r12 = 1119092736(0x42b40000, float:90.0)
            float r7 = r7 + r12
            float r7 = org.fortheloss.framework.CustomMathUtils.cosDeg(r7)
            float r7 = r7 * r5
            float r13 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginY
            float r13 = r13 - r15
            float r7 = r7 * r13
            float r7 = r4 - r7
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = r0.mSpriteRef
            float r4 = r4.getRotation()
            float r4 = r4 + r12
            float r4 = org.fortheloss.framework.CustomMathUtils.sinDeg(r4)
            float r4 = r4 * r5
            float r5 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginY
            float r5 = r5 - r15
            float r4 = r4 * r5
            float r4 = r9 - r4
            r13 = r4
            goto L2e7
        L2e5:
            r7 = r4
            r13 = r9
        L2e7:
            int r4 = r0.mType
            r5 = r4 & 16
            if (r5 != 0) goto L2f1
            r4 = r4 & 64
            if (r4 == 0) goto L332
        L2f1:
            if (r3 == 0) goto L336
            org.fortheloss.sticknodes.sprite.SpriteNode r3 = r0.mParentNodeRef
            float r3 = r3.getGlobalX()
            float r1 = r1 - r3
            org.fortheloss.sticknodes.sprite.SpriteNode r3 = r0.mParentNodeRef
            float r3 = r3.getGlobalY()
            float r2 = r2 - r3
            float r3 = r1 * r1
            float r4 = r2 * r2
            float r3 = r3 + r4
            double r3 = (double) r3
            double r3 = java.lang.Math.sqrt(r3)
            float r3 = (float) r3
            float r1 = com.badlogic.gdx.math.MathUtils.atan2(r2, r1)
            float r1 = r1 * r8
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            float r2 = r2.getRotation()
            float r1 = r1 - r2
            float r1 = com.badlogic.gdx.math.MathUtils.sinDeg(r1)
            float r1 = r1 * r3
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragDistanceToOriginY
            float r1 = r1 / r2
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleY
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L32a
            goto L32b
        L32a:
            r14 = r2
        L32b:
            float r1 = r1 * r14
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            r2.setScaleY(r1)
        L332:
            r3 = r13
            r13 = r7
            goto L3ff
        L336:
            r3 = 0
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleY
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L33f
            r5 = 1
            goto L340
        L33f:
            r5 = 0
        L340:
            float r3 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeX
            float r1 = r1 - r3
            float r3 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeY
            float r2 = r2 - r3
            float r3 = r1 * r1
            float r4 = r2 * r2
            float r3 = r3 + r4
            double r3 = (double) r3
            double r3 = java.lang.Math.sqrt(r3)
            float r3 = (float) r3
            float r1 = com.badlogic.gdx.math.MathUtils.atan2(r2, r1)
            float r1 = r1 * r8
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            float r2 = r2.getRotation()
            float r1 = r1 - r2
            float r1 = com.badlogic.gdx.math.MathUtils.sinDeg(r1)
            float r1 = r1 * r3
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragDistanceToOppositeY
            float r1 = r1 / r2
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleY
            float r1 = r1 * r2
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            r2.setScaleY(r1)
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r0.mSpriteRef
            float r1 = r1.getScaledHeight()
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            float r2 = r2.getHeight()
            float r3 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleY
            float r2 = r2 * r3
            float r1 = r1 - r2
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            if (r5 == 0) goto L393
            int r2 = r0.mType
            r2 = r2 & 16
            if (r2 != 0) goto L390
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginY
            goto L39b
        L390:
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginY
            goto L3a0
        L393:
            int r2 = r0.mType
            r2 = r2 & 16
            if (r2 == 0) goto L39e
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginY
        L39b:
            float r2 = r2 * r11
            goto L3a2
        L39e:
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginY
        L3a0:
            float r2 = r14 - r2
        L3a2:
            float r1 = r1 * r2
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            float r2 = r2.getRotation()
            r3 = 1119092736(0x42b40000, float:90.0)
            float r2 = r2 + r3
            float r2 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r2 = r2 * r1
            float r2 = r2 + r7
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = r0.mSpriteRef
            float r4 = r4.getRotation()
            float r4 = r4 + r3
            float r3 = org.fortheloss.framework.CustomMathUtils.sinDeg(r4)
            float r3 = r3 * r1
            float r13 = r13 + r3
            if (r6 == 0) goto L3fd
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r0.mSpriteRef
            float r1 = r1.getScaledWidth()
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = r0.mSpriteRef
            float r3 = r3.getWidth()
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragScaleX
            float r3 = r3 * r4
            float r1 = r1 - r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r3
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = r0.mSpriteRef
            float r3 = r3.getRotation()
            float r3 = org.fortheloss.framework.CustomMathUtils.cosDeg(r3)
            float r3 = r3 * r1
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginX
            float r4 = r4 - r15
            float r3 = r3 * r4
            float r2 = r2 - r3
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = r0.mSpriteRef
            float r3 = r3.getRotation()
            float r3 = org.fortheloss.framework.CustomMathUtils.sinDeg(r3)
            float r3 = r3 * r1
            float r1 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginX
            float r1 = r1 - r15
            float r3 = r3 * r1
            float r13 = r13 - r3
        L3fd:
            r3 = r13
        L3fe:
            r13 = r2
        L3ff:
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r0.mSpriteRef
            boolean r1 = r1.isJoined()
            if (r1 != 0) goto L481
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r0.mSpriteRef
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragSpriteX
            float r2 = r2 - r13
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragSpriteY
            float r4 = r4 - r3
            r1.setPosition(r2, r4)
            goto L481
        L413:
            if (r3 == 0) goto L43b
            float r1 = r18.getGlobalY()
            org.fortheloss.sticknodes.sprite.SpriteNode r2 = r0.mParentNodeRef
            float r2 = r2.getGlobalY()
            float r1 = r1 - r2
            double r1 = (double) r1
            float r3 = r18.getGlobalX()
            org.fortheloss.sticknodes.sprite.SpriteNode r4 = r0.mParentNodeRef
            float r4 = r4.getGlobalX()
            float r3 = r3 - r4
            double r3 = (double) r3
            double r1 = java.lang.Math.atan2(r1, r3)
            float r1 = (float) r1
            float r1 = r1 * r8
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragRelativeAngleToOrigin
            float r1 = r0.angleDiff(r2, r1)
            goto L479
        L43b:
            float r1 = r18.getGlobalY()
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeY
            float r1 = r1 - r2
            double r1 = (double) r1
            float r3 = r18.getGlobalX()
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeX
            float r3 = r3 - r4
            double r3 = (double) r3
            double r1 = java.lang.Math.atan2(r1, r3)
            float r1 = (float) r1
            float r1 = r1 * r8
            float r2 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragRelativeAngleToOpposite
            float r1 = r0.angleDiff(r2, r1)
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            float r3 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeX
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginRelativeAngleToOpposite
            float r4 = r4 + r1
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r4)
            float r5 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginDistanceToOpposite
            float r4 = r4 * r5
            float r3 = r3 - r4
            float r4 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOppositeY
            float r5 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginRelativeAngleToOpposite
            float r5 = r5 + r1
            float r5 = org.fortheloss.framework.CustomMathUtils.sinDeg(r5)
            float r6 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragOriginDistanceToOpposite
            float r5 = r5 * r6
            float r4 = r4 - r5
            r2.setPosition(r3, r4)
        L479:
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSpriteRef
            float r3 = org.fortheloss.sticknodes.sprite.SpriteNode.mInitialDragSpriteRotation
            float r3 = r3 + r1
            r2.setFigureRotation(r3)
        L481:
            r1 = 0
            return r1
    }

    public void drawNode(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r2, float r3, float r4, float r5, boolean r6, boolean r7) {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = r1.mSpriteRef
            int r5 = r5.getLockState()
            r7 = 1
            if (r5 == r7) goto L13
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = r1.mSpriteRef
            byte r5 = r5.isLockedToCamera()
            if (r5 == 0) goto L12
            goto L13
        L12:
            r7 = 0
        L13:
            r5 = 1065353216(0x3f800000, float:1.0)
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r1.mSpriteRef
            boolean r0 = r0.isJoined()
            if (r0 != 0) goto L31
            if (r7 != 0) goto L27
            org.fortheloss.sticknodes.sprite.SpriteRef r7 = r1.mSpriteRef
            byte r7 = r7.isLockedToCamera()
            if (r7 == 0) goto L31
        L27:
            if (r6 == 0) goto L2c
            r5 = 14
            goto L2e
        L2c:
            r5 = 12
        L2e:
            r6 = 1069547520(0x3fc00000, float:1.5)
            goto L65
        L31:
            if (r0 == 0) goto L5d
            if (r6 == 0) goto L4f
            r6 = 2
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r6 = r2.getNode(r6)
            com.badlogic.gdx.graphics.g2d.Batch r7 = r2.getBatch()
            r6.drawNode(r7, r3, r4, r5)
            r6 = 30
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r6 = r2.getNode(r6)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r2.getBatch()
            r6.drawNode(r2, r3, r4, r5)
            goto L5c
        L4f:
            r6 = 28
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r6 = r2.getNode(r6)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r2.getBatch()
            r6.drawNode(r2, r3, r4, r5)
        L5c:
            return
        L5d:
            if (r6 == 0) goto L61
            r6 = 6
            goto L62
        L61:
            r6 = 4
        L62:
            r5 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
        L65:
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r5 = r2.getNode(r5)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r2.getBatch()
            r5.drawNode(r2, r3, r4, r6)
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public void flagPositionAsDirty() {
            r3 = this;
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = r3.mParentNodeRef
            if (r0 != 0) goto L48
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r3.mSpriteRef
            boolean r0 = r0.isJoined()
            if (r0 == 0) goto L48
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r3.mSpriteRef
            boolean r0 = r0.getKeepJoinDuringInterpolation()
            if (r0 == 0) goto L48
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r3.mSpriteRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getJoinedToNode()
            float r0 = r0.getAngle()
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r3.mSpriteRef
            float r1 = r1.getRotation()
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r3.mSpriteRef
            float r2 = r2.getJoinOffsetAngle()
            float r0 = r0 + r2
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r3.mSpriteRef
            float r0 = r0 - r1
            r2.rotateFigureViaJoin(r0)
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r3.mSpriteRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r0.getJoinedToNode()
            float r1 = r1.getGlobalX()
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r3.mSpriteRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getJoinedToNode()
            float r2 = r2.getGlobalY()
            r0.setPosition(r1, r2)
        L48:
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getAngle() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public int getDrawOrderIndex() {
            r1 = this;
            int r0 = r1.mDrawOrderIndex
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public org.fortheloss.sticknodes.animationscreen.IDrawableFigure getDrawableFigure() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r1.mSpriteRef
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getGlobalX() {
            r2 = this;
            float r0 = r2.getX()
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r2.mSpriteRef
            float r1 = r1.getX()
            float r0 = r0 + r1
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getGlobalY() {
            r2 = this;
            float r0 = r2.getY()
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r2.mSpriteRef
            float r1 = r1.getY()
            float r0 = r0 + r1
            return r0
    }

    public org.fortheloss.sticknodes.sprite.SpriteRef getSpriteReference() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r1.mSpriteRef
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getX() {
            r1 = this;
            float r0 = r1.mX
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getY() {
            r1 = this;
            float r0 = r1.mY
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public boolean isMainNode() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = r1.mParentNodeRef
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void setPosition(float r2, float r3) {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = r1.mParentNodeRef
            if (r0 != 0) goto L5
            return
        L5:
            r1.mX = r2
            r1.mY = r3
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0.mType = r1
            return
    }
}
