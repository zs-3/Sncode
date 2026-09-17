package org.fortheloss.sticknodes.stickfigure;

/* loaded from: classes2.dex */
public class CurveNode implements org.fortheloss.sticknodes.stickfigure.IPolyNode, com.badlogic.gdx.utils.Pool.Poolable {
    private float mAngleFromOrigin;
    private float mDistanceFromOrigin;
    private org.fortheloss.sticknodes.stickfigure.StickNode mOriginNodeRef;

    public CurveNode() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.IPolyNode
    public float getX() {
            r4 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4.mOriginNodeRef
            boolean r0 = r0.isUsingSegmentScale()
            if (r0 == 0) goto Lf
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4.mOriginNodeRef
            float r0 = r0.getScale()
            goto L11
        Lf:
            r0 = 1065353216(0x3f800000, float:1.0)
        L11:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r4.mOriginNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            float r1 = r1.getScale()
            float r0 = r0 * r1
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r4.mOriginNodeRef
            float r1 = r1.getX()
            float r2 = r4.mAngleFromOrigin
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r4.mOriginNodeRef
            float r3 = r3.getAngle()
            float r2 = r2 + r3
            float r2 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r3 = r4.mDistanceFromOrigin
            float r2 = r2 * r3
            float r2 = r2 * r0
            float r1 = r1 + r2
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.IPolyNode
    public float getY() {
            r4 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4.mOriginNodeRef
            boolean r0 = r0.isUsingSegmentScale()
            if (r0 == 0) goto Lf
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4.mOriginNodeRef
            float r0 = r0.getScale()
            goto L11
        Lf:
            r0 = 1065353216(0x3f800000, float:1.0)
        L11:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r4.mOriginNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            float r1 = r1.getScale()
            float r0 = r0 * r1
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r4.mOriginNodeRef
            float r1 = r1.getY()
            float r2 = r4.mAngleFromOrigin
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r4.mOriginNodeRef
            float r3 = r3.getAngle()
            float r2 = r2 + r3
            float r2 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            float r3 = r4.mDistanceFromOrigin
            float r2 = r2 * r3
            float r2 = r2 * r0
            float r1 = r1 + r2
            return r1
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1.mOriginNodeRef = r0
            return
    }

    public void set(org.fortheloss.sticknodes.stickfigure.StickNode r1, float r2, float r3) {
            r0 = this;
            r0.mOriginNodeRef = r1
            float r1 = r1.getAngle()
            float r2 = r2 - r1
            r0.mAngleFromOrigin = r2
            r0.mDistanceFromOrigin = r3
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r0.mOriginNodeRef
            boolean r1 = r1.isUsingSegmentScale()
            if (r1 == 0) goto L1a
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r0.mOriginNodeRef
            float r1 = r1.getScale()
            goto L1c
        L1a:
            r1 = 1065353216(0x3f800000, float:1.0)
        L1c:
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r0.mOriginNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r2.getStickfigure()
            float r2 = r2.getScale()
            float r1 = r1 * r2
            float r2 = r0.mDistanceFromOrigin
            float r2 = r2 / r1
            r0.mDistanceFromOrigin = r2
            return
    }
}
