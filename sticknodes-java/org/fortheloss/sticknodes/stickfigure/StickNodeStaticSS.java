package org.fortheloss.sticknodes.stickfigure;

/* loaded from: classes2.dex */
public class StickNodeStaticSS extends org.fortheloss.sticknodes.stickfigure.StickNodeStatic {
    private boolean mAngleLockIsMainNode;
    private boolean mIsAngleLocked;
    private float mLength;

    public StickNodeStaticSS(org.fortheloss.sticknodes.stickfigure.Stickfigure r1, org.fortheloss.sticknodes.stickfigure.StickNode r2, org.fortheloss.sticknodes.stickfigure.StickNode r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNodeStatic, org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValAngleLockIsMainNode() {
            r1 = this;
            boolean r0 = r1.mAngleLockIsMainNode
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNodeStatic, org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean getValIsAngleLocked() {
            r1 = this;
            boolean r0 = r1.mIsAngleLocked
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNodeStatic, org.fortheloss.sticknodes.stickfigure.StickNode
    protected float getValLength() {
            r1 = this;
            float r0 = r1.mLength
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNodeStatic
    protected void initClone(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            super.initClone(r2)
            float r0 = r2.getValLength()
            r1.mLength = r0
            boolean r0 = r2.getValIsAngleLocked()
            r1.mIsAngleLocked = r0
            boolean r2 = r2.getAngleLockIsMainNode()
            r1.mAngleLockIsMainNode = r2
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNodeStatic, org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValAngleLockIsMainNode(boolean r1) {
            r0 = this;
            r0.mAngleLockIsMainNode = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNodeStatic, org.fortheloss.sticknodes.stickfigure.StickNode
    protected boolean setValIsAngleLocked(boolean r1) {
            r0 = this;
            r0.mIsAngleLocked = r1
            return r1
    }

    @Override // org.fortheloss.sticknodes.stickfigure.StickNodeStatic, org.fortheloss.sticknodes.stickfigure.StickNode
    protected float setValLength(float r1) {
            r0 = this;
            r0.mLength = r1
            return r1
    }
}
