package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickNodeAddAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.stickfigure.StickNode _addedStickNodeRef;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private boolean _ownsStickNode;
    private org.fortheloss.sticknodes.stickfigure.StickNode _parentNodeRef;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> mConnectorPairs;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> mOrderedBranch;

    public StickNodeAddAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._ownsStickNode = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            r2._parentNodeRef = r0
            boolean r1 = r2._ownsStickNode
            if (r1 == 0) goto L10
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2._addedStickNodeRef
            if (r1 == 0) goto L10
            r1.dispose()
        L10:
            r2._addedStickNodeRef = r0
            r2.mConnectorPairs = r0
            r2.mOrderedBranch = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            r3._addedStickNodeRef = r4
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4.getParentNode()
            r3._parentNodeRef = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mConnectorPairs = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r0.add(r4)
        L17:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L50
            java.lang.Object r4 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            boolean r1 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r1 == 0) goto L38
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r3.mConnectorPairs
            r1.add(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r3.mConnectorPairs
            r2 = r4
            org.fortheloss.sticknodes.stickfigure.Connector r2 = (org.fortheloss.sticknodes.stickfigure.Connector) r2
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getEndNode()
            r1.add(r2)
        L38:
            java.util.ArrayList r4 = r4.getChildrenNodes()
            int r1 = r4.size()
            int r1 = r1 + (-1)
        L42:
            if (r1 < 0) goto L17
            java.lang.Object r2 = r4.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r0.add(r2)
            int r1 = r1 + (-1)
            goto L42
        L50:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r3.mConnectorPairs
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L5b
            r4 = 0
            r3.mConnectorPairs = r4
        L5b:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r6 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r6._addedStickNodeRef
            r0.flagPositionAsDirty()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r6._parentNodeRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r6._addedStickNodeRef
            r2 = 0
            r0.addChildNode(r1, r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r6._addedStickNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r6._parentNodeRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r6.mOrderedBranch
            int r3 = r3.size()
            r4 = 0
        L1c:
            if (r4 >= r3) goto L2d
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r6.mOrderedBranch
            java.lang.Object r5 = r5.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            r0.addNodeToDrawOrderAfter(r5, r1)
            int r4 = r4 + 1
            r1 = r5
            goto L1c
        L2d:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r6.mConnectorPairs
            if (r0 == 0) goto L50
            int r0 = r0.size()
            r1 = 0
        L36:
            if (r1 >= r0) goto L50
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r6.mConnectorPairs
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r6.mConnectorPairs
            int r5 = r1 + 1
            java.lang.Object r4 = r4.get(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r3.changeEndNode(r4)
            int r1 = r1 + 2
            goto L36
        L50:
            r6._ownsStickNode = r2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r6._addedStickNodeRef
            r0.onUndoRedoNodeAction(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            r0 = 0
            r2._parentNodeRef = r0
            boolean r1 = r2._ownsStickNode
            if (r1 == 0) goto Le
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2._addedStickNodeRef
            if (r1 == 0) goto Le
            r1.dispose()
        Le:
            r2._addedStickNodeRef = r0
            r2.mConnectorPairs = r0
            r0 = 0
            r2._ownsStickNode = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._addedStickNodeRef
            java.util.ArrayList r0 = org.fortheloss.sticknodes.stickfigure.StickNode.orderNodesByRelativeDrawOrder(r0)
            r3.mOrderedBranch = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._addedStickNodeRef
            r1 = 1
            r0.delete(r1)
            r3._ownsStickNode = r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._parentNodeRef
            r2 = 0
            r0.onUndoRedoNodeAction(r1, r2)
            return
    }
}
