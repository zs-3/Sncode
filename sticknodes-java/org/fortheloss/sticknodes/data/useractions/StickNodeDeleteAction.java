package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickNodeDeleteAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen mAnimationScreenRef;
    private java.util.ArrayList<java.lang.Integer> mBranchDrawOrdersAmongSiblings;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> mBranchParents;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> mDeletedBranches;
    private boolean mOwnsBranches;
    private org.fortheloss.sticknodes.data.useractions.StickfigureConnectorData mStickfigureConnectorData;
    private java.util.ArrayList<java.lang.Integer> mStickfigureDrawOrderSnapshot;
    private org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData mStickfigurePolyfillData;

    public StickNodeDeleteAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mOwnsBranches = r0
            r1.mAnimationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r1.reset()
            r0 = 0
            r1.mAnimationScreenRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r15) {
            r14 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r15.getStickfigure()
            boolean r1 = r0.hasPolyfillAnchorNode()
            if (r1 == 0) goto L11
            org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData r1 = new org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData
            r1.<init>(r0)
            r14.mStickfigurePolyfillData = r1
        L11:
            boolean r1 = r0.hasConnectors()
            if (r1 == 0) goto L1e
            org.fortheloss.sticknodes.data.useractions.StickfigureConnectorData r1 = new org.fortheloss.sticknodes.data.useractions.StickfigureConnectorData
            r1.<init>(r0)
            r14.mStickfigureConnectorData = r1
        L1e:
            java.util.ArrayList<java.lang.Integer> r0 = r14.mStickfigureDrawOrderSnapshot
            if (r0 != 0) goto L2b
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 400(0x190, float:5.6E-43)
            r0.<init>(r1)
            r14.mStickfigureDrawOrderSnapshot = r0
        L2b:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r15.getStickfigure()
            java.util.ArrayList<java.lang.Integer> r1 = r14.mStickfigureDrawOrderSnapshot
            r0.getAllNodeDrawOrderIndices(r1)
            r0 = 1
            r14.mOwnsBranches = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 2
            r1.<init>(r2)
            r14.mDeletedBranches = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            r14.mBranchParents = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            r14.mBranchDrawOrdersAmongSiblings = r1
            java.lang.Class<java.util.Stack> r1 = java.util.Stack.class
            java.lang.Object r1 = com.badlogic.gdx.utils.Pools.obtain(r1)
            java.util.Stack r1 = (java.util.Stack) r1
            java.lang.Class<java.util.Stack> r2 = java.util.Stack.class
            java.lang.Object r2 = com.badlogic.gdx.utils.Pools.obtain(r2)
            java.util.Stack r2 = (java.util.Stack) r2
            java.lang.Class<java.util.Stack> r3 = java.util.Stack.class
            java.lang.Object r3 = com.badlogic.gdx.utils.Pools.obtain(r3)
            java.util.Stack r3 = (java.util.Stack) r3
            java.lang.Class<java.util.ArrayList> r4 = java.util.ArrayList.class
            java.lang.Object r4 = com.badlogic.gdx.utils.Pools.obtain(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r1.add(r15)
        L70:
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L185
            java.lang.Object r5 = r1.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r5.getParentNode()
            boolean r7 = r4.contains(r5)
            if (r7 != 0) goto Lae
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r7 = r14.mDeletedBranches
            r7.add(r5)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r7 = r14.mBranchParents
            r7.add(r6)
            java.util.ArrayList r6 = r6.getChildrenNodes()
            int r7 = r6.size()
            int r7 = r7 - r0
        L99:
            if (r7 < 0) goto Lae
            java.lang.Object r8 = r6.get(r7)
            if (r8 != r5) goto Lab
            java.util.ArrayList<java.lang.Integer> r6 = r14.mBranchDrawOrdersAmongSiblings
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            goto Lae
        Lab:
            int r7 = r7 + (-1)
            goto L99
        Lae:
            r2.add(r5)
        Lb1:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L70
            java.lang.Object r5 = r2.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            boolean r6 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r6 == 0) goto Lc7
            r6 = r5
            org.fortheloss.sticknodes.stickfigure.Connector r6 = (org.fortheloss.sticknodes.stickfigure.Connector) r6
            r4.add(r6)
        Lc7:
            java.util.ArrayList r6 = r5.getConnectorAttachments()
            if (r6 == 0) goto L16a
            int r7 = r6.size()
            int r7 = r7 - r0
        Ld2:
            if (r7 < 0) goto L16a
            java.lang.Object r8 = r6.get(r7)
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = (org.fortheloss.sticknodes.stickfigure.StickNode) r8
            boolean r9 = r4.contains(r8)
            r10 = 0
            if (r9 != 0) goto Lfe
            r11 = r8
        Le2:
            int r12 = r1.size()
            int r12 = r12 - r0
        Le7:
            if (r12 < 0) goto Lf4
            java.lang.Object r13 = r1.get(r12)
            if (r13 != r11) goto Lf1
            r9 = 1
            goto Lf4
        Lf1:
            int r12 = r12 + (-1)
            goto Le7
        Lf4:
            if (r9 == 0) goto Lf8
            r11 = r10
            goto Lfc
        Lf8:
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = r11.getParentNode()
        Lfc:
            if (r11 != 0) goto Le2
        Lfe:
            if (r9 != 0) goto L10b
            r11 = r8
        L101:
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = r11.getParentNode()
            if (r11 != r15) goto L109
            r11 = r10
            r9 = 1
        L109:
            if (r11 != 0) goto L101
        L10b:
            if (r9 != 0) goto L166
            java.util.ArrayList r9 = r8.getChildrenNodes()
            int r9 = r9.size()
            int r9 = r9 - r0
        L116:
            if (r9 < 0) goto L128
            java.util.ArrayList r10 = r8.getChildrenNodes()
            java.lang.Object r10 = r10.get(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = (org.fortheloss.sticknodes.stickfigure.StickNode) r10
            r3.add(r10)
            int r9 = r9 + (-1)
            goto L116
        L128:
            boolean r9 = r3.isEmpty()
            if (r9 != 0) goto L163
            java.lang.Object r9 = r3.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = (org.fortheloss.sticknodes.stickfigure.StickNode) r9
            int r10 = r1.size()
            int r10 = r10 - r0
        L139:
            if (r10 < 0) goto L148
            java.lang.Object r11 = r1.get(r10)
            if (r11 != r9) goto L145
            r1.remove(r10)
            goto L148
        L145:
            int r10 = r10 + (-1)
            goto L139
        L148:
            java.util.ArrayList r10 = r9.getChildrenNodes()
            int r10 = r10.size()
            int r10 = r10 - r0
        L151:
            if (r10 < 0) goto L128
            java.util.ArrayList r11 = r9.getChildrenNodes()
            java.lang.Object r11 = r11.get(r10)
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = (org.fortheloss.sticknodes.stickfigure.StickNode) r11
            r3.add(r11)
            int r10 = r10 + (-1)
            goto L151
        L163:
            r1.add(r8)
        L166:
            int r7 = r7 + (-1)
            goto Ld2
        L16a:
            java.util.ArrayList r6 = r5.getChildrenNodes()
            int r6 = r6.size()
            int r6 = r6 - r0
        L173:
            if (r6 < 0) goto Lb1
            java.util.ArrayList r7 = r5.getChildrenNodes()
            java.lang.Object r7 = r7.get(r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = (org.fortheloss.sticknodes.stickfigure.StickNode) r7
            r2.add(r7)
            int r6 = r6 + (-1)
            goto L173
        L185:
            r1.clear()
            r2.clear()
            r3.clear()
            r4.clear()
            com.badlogic.gdx.utils.Pools.free(r1)
            com.badlogic.gdx.utils.Pools.free(r2)
            com.badlogic.gdx.utils.Pools.free(r3)
            com.badlogic.gdx.utils.Pools.free(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r15 = r14.mDeletedBranches
            int r15 = r15.size()
            int r15 = r15 - r0
        L1a4:
            if (r15 < 0) goto L1f0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r14.mDeletedBranches
            java.lang.Object r1 = r1.get(r15)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r2 != 0) goto L1b3
            goto L1ed
        L1b3:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getParentNode()
        L1b7:
            if (r1 == 0) goto L1ed
            boolean r2 = r1.isMainNode()
            if (r2 != 0) goto L1ed
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r14.mDeletedBranches
            int r2 = r2.size()
            int r2 = r2 - r0
        L1c6:
            if (r2 < 0) goto L1e8
            if (r2 != r15) goto L1cb
            goto L1e5
        L1cb:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r14.mDeletedBranches
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            if (r1 != r3) goto L1e5
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r14.mDeletedBranches
            r1.remove(r15)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r14.mBranchParents
            r1.remove(r15)
            java.util.ArrayList<java.lang.Integer> r1 = r14.mBranchDrawOrdersAmongSiblings
            r1.remove(r15)
            goto L1ed
        L1e5:
            int r2 = r2 + (-1)
            goto L1c6
        L1e8:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getParentNode()
            goto L1b7
        L1ed:
            int r15 = r15 + (-1)
            goto L1a4
        L1f0:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r3.mDeletedBranches
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r2 = 1
            r0.delete(r2)
            r3.mOwnsBranches = r2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3.mAnimationScreenRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r3.mBranchParents
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.stickfigure.INode r2 = (org.fortheloss.sticknodes.stickfigure.INode) r2
            r0.onUndoRedoNodeAction(r2, r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r4 = this;
            r0 = 0
            r4.mBranchParents = r0
            r4.mBranchDrawOrdersAmongSiblings = r0
            r4.mStickfigureDrawOrderSnapshot = r0
            org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData r1 = r4.mStickfigurePolyfillData
            if (r1 == 0) goto L10
            r1.dispose()
            r4.mStickfigurePolyfillData = r0
        L10:
            org.fortheloss.sticknodes.data.useractions.StickfigureConnectorData r1 = r4.mStickfigureConnectorData
            if (r1 == 0) goto L19
            r1.dispose()
            r4.mStickfigureConnectorData = r0
        L19:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r4.mDeletedBranches
            r2 = 1
            if (r1 == 0) goto L39
            boolean r3 = r4.mOwnsBranches
            if (r3 == 0) goto L37
            int r1 = r1.size()
            int r1 = r1 - r2
        L27:
            if (r1 < 0) goto L37
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r4.mDeletedBranches
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r3.dispose()
            int r1 = r1 + (-1)
            goto L27
        L37:
            r4.mDeletedBranches = r0
        L39:
            r4.mOwnsBranches = r2
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r9 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r9.mDeletedBranches
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r0.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.getMainNode()
            r3.flagPositionAsDirty()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r9.mDeletedBranches
            int r3 = r3.size()
            r4 = 0
        L1b:
            if (r4 >= r3) goto L40
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r9.mDeletedBranches
            java.lang.Object r5 = r5.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r6 = r9.mBranchParents
            java.lang.Object r6 = r6.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            java.util.ArrayList<java.lang.Integer> r7 = r9.mBranchDrawOrdersAmongSiblings
            java.lang.Object r7 = r7.get(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = 1
            r6.addChildNodeAt(r5, r7, r8)
            int r4 = r4 + 1
            goto L1b
        L40:
            java.util.ArrayList<java.lang.Integer> r3 = r9.mStickfigureDrawOrderSnapshot
            r2.drawAllNodesAt(r3)
            org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData r3 = r9.mStickfigurePolyfillData
            if (r3 == 0) goto L4c
            r2.reconstructPolyfillAfterNodeDeleteUndoRedo(r3)
        L4c:
            org.fortheloss.sticknodes.data.useractions.StickfigureConnectorData r3 = r9.mStickfigureConnectorData
            if (r3 == 0) goto L53
            r2.reconstructConnectorsAfterNodeDeleteUndoRedo(r3)
        L53:
            r9.mOwnsBranches = r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r9.mAnimationScreenRef
            r2.onUndoRedoNodeAction(r0, r1)
            return
    }
}
