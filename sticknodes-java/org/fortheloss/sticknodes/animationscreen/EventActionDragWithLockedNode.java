package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class EventActionDragWithLockedNode implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.stickfigure.StickNode mLockedNodeRef;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> mNodesToAffect;

    public EventActionDragWithLockedNode() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mNodesToAffect = r0
            return
    }

    public EventActionDragWithLockedNode(org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r3.mNodesToAffect
            int r1 = r1.size()
            r0.<init>(r1)
            r2.mNodesToAffect = r0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r3.mNodesToAffect
            r0.addAll(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r3.mLockedNodeRef
            r2.mLockedNodeRef = r3
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mLockedNodeRef = r0
            r1.mNodesToAffect = r0
            return
    }

    public boolean isActive() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1.mLockedNodeRef
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void lockAngles() {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r3.mNodesToAffect
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r3.mNodesToAffect
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r2.setIsAngleLocked(r1)
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }

    public void reset() {
            r1 = this;
            r0 = 0
            r1.mLockedNodeRef = r0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1.mNodesToAffect
            r0.clear()
            return
    }

    public void setLockedNode(org.fortheloss.sticknodes.stickfigure.StickNode r6) {
            r5 = this;
            r5.mLockedNodeRef = r6
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r5.mNodesToAffect
            r0.clear()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r6)
            boolean r1 = r6.isJoinAnchor()
            if (r1 == 0) goto L3b
            java.util.ArrayList r1 = r6.getJoinedFigures()
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L1f:
            if (r1 < 0) goto L3b
            java.util.ArrayList r2 = r6.getJoinedFigures()
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            boolean r3 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r3 == 0) goto L38
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getMainNode()
            r0.add(r2)
        L38:
            int r1 = r1 + (-1)
            goto L1f
        L3b:
            int r6 = r0.size()
            int r6 = r6 + (-1)
        L41:
            if (r6 < 0) goto L72
            java.lang.Object r1 = r0.get(r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            java.util.ArrayList r1 = r1.getChildrenNodes()
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L53:
            if (r2 < 0) goto L6f
            java.lang.Object r3 = r1.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            boolean r4 = r3.isStatic()
            if (r4 != 0) goto L6c
            boolean r4 = r3.getIsAngleLocked()
            if (r4 != 0) goto L6c
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r5.mNodesToAffect
            r4.add(r3)
        L6c:
            int r2 = r2 + (-1)
            goto L53
        L6f:
            int r6 = r6 + (-1)
            goto L41
        L72:
            return
    }

    public void unlockAngles() {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r3.mNodesToAffect
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L19
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r3.mNodesToAffect
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r2 = 0
            r1.setIsAngleLocked(r2)
            int r0 = r0 + (-1)
            goto L8
        L19:
            return
    }
}
