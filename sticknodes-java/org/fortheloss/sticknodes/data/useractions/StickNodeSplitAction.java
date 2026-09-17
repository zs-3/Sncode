package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickNodeSplitAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.data.useractions.StickNodeProperties mAfterProperties;
    private org.fortheloss.sticknodes.data.useractions.StickNodeProperties mBeforeProperties;
    private float[] mChildrenLocalAnglesAfter;
    private float[] mChildrenLocalAnglesBefore;
    private org.fortheloss.sticknodes.stickfigure.StickNode mNewBranch;
    private org.fortheloss.sticknodes.stickfigure.StickNode mNewParentNodeRef;
    private boolean mOwnsBranch;
    private org.fortheloss.sticknodes.stickfigure.StickNode mParentNodeRef;
    private org.fortheloss.sticknodes.stickfigure.StickNode mSplitNodeRef;
    private java.util.ArrayList<java.lang.Integer> mStickfigureDrawOrderSnapshotAfter;
    private java.util.ArrayList<java.lang.Integer> mStickfigureDrawOrderSnapshotBefore;
    private org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData mStickfigurePolyfillDataAfter;

    public StickNodeSplitAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mOwnsBranch = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r1.reset()
            r0 = 0
            r1._animationScreenRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4.getParentNode()
            r3.mParentNodeRef = r0
            r3.mSplitNodeRef = r4
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r0 = new org.fortheloss.sticknodes.data.useractions.StickNodeProperties
            r0.<init>(r4)
            r3.mBeforeProperties = r0
            java.util.ArrayList<java.lang.Integer> r0 = r3.mStickfigureDrawOrderSnapshotBefore
            if (r0 != 0) goto L27
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 400(0x190, float:5.6E-43)
            r0.<init>(r1)
            r3.mStickfigureDrawOrderSnapshotBefore = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.mSplitNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            java.util.ArrayList<java.lang.Integer> r1 = r3.mStickfigureDrawOrderSnapshotBefore
            r0.getAllNodeDrawOrderIndices(r1)
        L27:
            java.util.ArrayList r4 = r4.getChildrenNodes()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L52
            int r0 = r4.size()
            float[] r0 = new float[r0]
            r3.mChildrenLocalAnglesBefore = r0
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L3f:
            if (r0 < 0) goto L52
            float[] r1 = r3.mChildrenLocalAnglesBefore
            java.lang.Object r2 = r4.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            float r2 = r2.getLocalAngle()
            r1[r0] = r2
            int r0 = r0 + (-1)
            goto L3f
        L52:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r5 = this;
            float[] r0 = r5.mChildrenLocalAnglesAfter
            r1 = 1
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.mSplitNodeRef
            java.util.ArrayList r0 = r0.getChildrenNodes()
            int r2 = r0.size()
            int r2 = r2 - r1
        L10:
            if (r2 < 0) goto L22
            java.lang.Object r3 = r0.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            float[] r4 = r5.mChildrenLocalAnglesAfter
            r4 = r4[r2]
            r3.setLocalAngle(r4)
            int r2 = r2 + (-1)
            goto L10
        L22:
            r0 = 0
            r5.mOwnsBranch = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r5.mParentNodeRef
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r5.mNewBranch
            r2.addChildNode(r3, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r5.mSplitNodeRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r5.mNewParentNodeRef
            r1.changeParentNode(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r5.mSplitNodeRef
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r2 = r5.mAfterProperties
            r1.setProperties(r2)
            org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData r1 = r5.mStickfigurePolyfillDataAfter
            if (r1 == 0) goto L49
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r5.mSplitNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData r2 = r5.mStickfigurePolyfillDataAfter
            r1.reconstructPolyfillAfterNodeDeleteUndoRedo(r2)
        L49:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r5.mSplitNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            java.util.ArrayList<java.lang.Integer> r2 = r5.mStickfigureDrawOrderSnapshotAfter
            r1.drawAllNodesAt(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r5._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r5.mSplitNodeRef
            r1.onUndoRedoNodeAction(r2, r0)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            r0 = 0
            r2.mParentNodeRef = r0
            r2.mNewParentNodeRef = r0
            r2.mSplitNodeRef = r0
            boolean r1 = r2.mOwnsBranch
            if (r1 == 0) goto L12
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2.mNewBranch
            if (r1 == 0) goto L12
            r1.dispose()
        L12:
            r2.mNewBranch = r0
            r2.mChildrenLocalAnglesBefore = r0
            r2.mChildrenLocalAnglesAfter = r0
            org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData r1 = r2.mStickfigurePolyfillDataAfter
            if (r1 == 0) goto L21
            r1.dispose()
            r2.mStickfigurePolyfillDataAfter = r0
        L21:
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r1 = r2.mBeforeProperties
            if (r1 == 0) goto L28
            r1.dispose()
        L28:
            r2.mBeforeProperties = r0
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r1 = r2.mAfterProperties
            if (r1 == 0) goto L31
            r1.dispose()
        L31:
            r2.mAfterProperties = r0
            r1 = 0
            r2.mOwnsBranch = r1
            r2.mStickfigureDrawOrderSnapshotBefore = r0
            r2.mStickfigureDrawOrderSnapshotAfter = r0
            return
    }

    public void setNewBranch(org.fortheloss.sticknodes.stickfigure.StickNode r1) {
            r0 = this;
            r0.mNewBranch = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r5 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.mSplitNodeRef
            boolean r0 = r0.isPolyfillAnchor()
            if (r0 != 0) goto L10
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.mSplitNodeRef
            boolean r0 = r0.isPolynodeInPolyfill()
            if (r0 == 0) goto L1d
        L10:
            org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData r0 = new org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r5.mSplitNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            r0.<init>(r1)
            r5.mStickfigurePolyfillDataAfter = r0
        L1d:
            float[] r0 = r5.mChildrenLocalAnglesAfter
            r1 = 1
            if (r0 != 0) goto L49
            float[] r0 = r5.mChildrenLocalAnglesBefore
            if (r0 == 0) goto L49
            int r0 = r0.length
            float[] r0 = new float[r0]
            r5.mChildrenLocalAnglesAfter = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.mSplitNodeRef
            java.util.ArrayList r0 = r0.getChildrenNodes()
            int r2 = r0.size()
            int r2 = r2 - r1
        L36:
            if (r2 < 0) goto L49
            float[] r3 = r5.mChildrenLocalAnglesAfter
            java.lang.Object r4 = r0.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            float r4 = r4.getLocalAngle()
            r3[r2] = r4
            int r2 = r2 + (-1)
            goto L36
        L49:
            java.util.ArrayList<java.lang.Integer> r0 = r5.mStickfigureDrawOrderSnapshotAfter
            if (r0 != 0) goto L72
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 400(0x190, float:5.6E-43)
            r0.<init>(r2)
            r5.mStickfigureDrawOrderSnapshotAfter = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.mSplitNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            java.util.ArrayList<java.lang.Integer> r2 = r5.mStickfigureDrawOrderSnapshotAfter
            r0.getAllNodeDrawOrderIndices(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.mSplitNodeRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getParentNode()
            r5.mNewParentNodeRef = r0
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r0 = new org.fortheloss.sticknodes.data.useractions.StickNodeProperties
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r5.mSplitNodeRef
            r0.<init>(r2)
            r5.mAfterProperties = r0
        L72:
            float[] r0 = r5.mChildrenLocalAnglesBefore
            if (r0 == 0) goto L93
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.mSplitNodeRef
            java.util.ArrayList r0 = r0.getChildrenNodes()
            int r2 = r0.size()
            int r2 = r2 - r1
        L81:
            if (r2 < 0) goto L93
            java.lang.Object r3 = r0.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            float[] r4 = r5.mChildrenLocalAnglesBefore
            r4 = r4[r2]
            r3.setLocalAngle(r4)
            int r2 = r2 + (-1)
            goto L81
        L93:
            r5.mOwnsBranch = r1
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.mSplitNodeRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r5.mParentNodeRef
            r0.changeParentNode(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.mNewBranch
            r0.delete(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.mSplitNodeRef
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r1 = r5.mBeforeProperties
            r0.setProperties(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.mSplitNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            java.util.ArrayList<java.lang.Integer> r1 = r5.mStickfigureDrawOrderSnapshotBefore
            r0.drawAllNodesAt(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r5.mSplitNodeRef
            r2 = 0
            r0.onUndoRedoNodeAction(r1, r2)
            return
    }
}
