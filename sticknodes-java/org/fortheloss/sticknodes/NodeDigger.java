package org.fortheloss.sticknodes;

/* loaded from: classes2.dex */
public class NodeDigger implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.stickfigure.INode mLastSelectedNodeRef;
    private long mLastTouchMillis;
    private float mLastTouchX;
    private float mLastTouchY;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> mTouchedNodes;

    public NodeDigger() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mLastTouchX = r0
            r2.mLastTouchY = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.mLastTouchMillis = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            r2.mTouchedNodes = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mTouchedNodes = r0
            return
    }

    public org.fortheloss.sticknodes.stickfigure.INode forceReset() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r0 = r2.mTouchedNodes
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            goto L13
        La:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r0 = r2.mTouchedNodes
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.stickfigure.INode r0 = (org.fortheloss.sticknodes.stickfigure.INode) r0
        L13:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r1 = r2.mTouchedNodes
            r1.clear()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r1 = r2.mTouchedNodes
            r1.add(r0)
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.INode getLastSelectedNode() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.INode r0 = r1.mLastSelectedNodeRef
            return r0
    }

    public boolean isCurrentlyNewTouch() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r0 = r1.mTouchedNodes
            boolean r0 = r0.isEmpty()
            return r0
    }

    public boolean isThisNodeNew(org.fortheloss.sticknodes.stickfigure.INode r3) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r0 = r2.mTouchedNodes
            boolean r0 = r0.contains(r3)
            r0 = r0 ^ 1
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r1 = r2.mTouchedNodes
            r1.add(r3)
            return r0
    }

    public void newTouchAt(float r9, float r10, float r11) {
            r8 = this;
            float r0 = r8.mLastTouchX
            float r0 = r9 - r0
            float r1 = r8.mLastTouchY
            float r1 = r10 - r1
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r11 = org.fortheloss.sticknodes.stickfigure.Stickfigure.getNodeClickSizeSquared(r11)
            r1 = 0
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 <= 0) goto L18
            r11 = 0
            goto L19
        L18:
            r11 = 1
        L19:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r8.mLastTouchMillis
            long r4 = r2 - r4
            r6 = 500(0x1f4, double:2.47E-321)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L28
            goto L29
        L28:
            r1 = r11
        L29:
            r8.mLastTouchX = r9
            r8.mLastTouchY = r10
            r8.mLastTouchMillis = r2
            if (r1 != 0) goto L36
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r9 = r8.mTouchedNodes
            r9.clear()
        L36:
            return
    }

    public void setLastSelectedNode(org.fortheloss.sticknodes.stickfigure.INode r1) {
            r0 = this;
            r0.mLastSelectedNodeRef = r1
            return
    }
}
