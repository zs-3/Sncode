package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickNodeDeleteOneAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.stickfigure.StickNode[] _childrenNodeRefs;
    private org.fortheloss.sticknodes.stickfigure.Connector[] _connectorEndpointRefs;
    private int _deletedNodeIndex;
    private org.fortheloss.sticknodes.stickfigure.StickNode _deletedNodeRef;
    private java.util.ArrayList<java.lang.Integer> _drawOrders;
    private boolean _ownsStickNode;
    private org.fortheloss.sticknodes.stickfigure.StickNode _parentNodeRef;
    private org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData _stickfigurePolyfillData;

    public StickNodeDeleteOneAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._deletedNodeIndex = r0
            r0 = 1
            r1._ownsStickNode = r0
            r1._animationScreenRef = r2
            return
    }

    private void recordStickfigurePolyfillData(org.fortheloss.sticknodes.stickfigure.Stickfigure r2) {
            r1 = this;
            boolean r0 = r2.hasPolyfillAnchorNode()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData r0 = new org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData
            r0.<init>(r2)
            r1._stickfigurePolyfillData = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            r2._parentNodeRef = r0
            r2._childrenNodeRefs = r0
            r2._connectorEndpointRefs = r0
            boolean r1 = r2._ownsStickNode
            if (r1 == 0) goto L14
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2._deletedNodeRef
            if (r1 == 0) goto L14
            r1.dispose()
        L14:
            r2._deletedNodeRef = r0
            java.util.ArrayList<java.lang.Integer> r1 = r2._drawOrders
            if (r1 == 0) goto L1d
            r1.clear()
        L1d:
            r2._drawOrders = r0
            org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData r1 = r2._stickfigurePolyfillData
            if (r1 == 0) goto L28
            r1.dispose()
            r2._stickfigurePolyfillData = r0
        L28:
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r6) {
            r5 = this;
            r5._deletedNodeRef = r6
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r6.getParentNode()
            r5._parentNodeRef = r0
            boolean r0 = r6.isPolyfillAnchor()
            if (r0 != 0) goto L14
            boolean r0 = r6.isPolynodeInPolyfill()
            if (r0 == 0) goto L1b
        L14:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r6.getStickfigure()
            r5.recordStickfigurePolyfillData(r6)
        L1b:
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r5._parentNodeRef
            java.util.ArrayList r6 = r6.getChildrenNodes()
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L27:
            if (r0 < 0) goto L37
            java.lang.Object r1 = r6.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r5._deletedNodeRef
            if (r1 != r2) goto L34
            r5._deletedNodeIndex = r0
            goto L37
        L34:
            int r0 = r0 + (-1)
            goto L27
        L37:
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r5._deletedNodeRef
            java.util.ArrayList r6 = r6.getChildrenNodes()
            int r0 = r6.size()
            org.fortheloss.sticknodes.stickfigure.StickNode[] r1 = new org.fortheloss.sticknodes.stickfigure.StickNode[r0]
            r5._childrenNodeRefs = r1
            r1 = 0
            r2 = 0
        L47:
            if (r2 >= r0) goto L56
            org.fortheloss.sticknodes.stickfigure.StickNode[] r3 = r5._childrenNodeRefs
            java.lang.Object r4 = r6.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r3[r2] = r4
            int r2 = r2 + 1
            goto L47
        L56:
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r5._deletedNodeRef
            boolean r6 = r6.hasConnectorAttachments()
            if (r6 == 0) goto L7b
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r5._deletedNodeRef
            java.util.ArrayList r6 = r6.getConnectorAttachments()
            int r0 = r6.size()
            org.fortheloss.sticknodes.stickfigure.Connector[] r2 = new org.fortheloss.sticknodes.stickfigure.Connector[r0]
            r5._connectorEndpointRefs = r2
        L6c:
            if (r1 >= r0) goto L7b
            org.fortheloss.sticknodes.stickfigure.Connector[] r2 = r5._connectorEndpointRefs
            java.lang.Object r3 = r6.get(r1)
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L6c
        L7b:
            java.util.ArrayList<java.lang.Integer> r6 = r5._drawOrders
            if (r6 != 0) goto L88
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 400(0x190, float:5.6E-43)
            r6.<init>(r0)
            r5._drawOrders = r6
        L88:
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r5._parentNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r6.getStickfigure()
            java.util.ArrayList<java.lang.Integer> r0 = r5._drawOrders
            r6.getAllNodeDrawOrderIndices(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._deletedNodeRef
            r1 = 0
            r0.delete(r1)
            r0 = 1
            r3._ownsStickNode = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r3._parentNodeRef
            r0.onUndoRedoNodeAction(r2, r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            r0 = 0
            r2._parentNodeRef = r0
            r2._childrenNodeRefs = r0
            r2._connectorEndpointRefs = r0
            boolean r1 = r2._ownsStickNode
            if (r1 == 0) goto L12
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2._deletedNodeRef
            if (r1 == 0) goto L12
            r1.dispose()
        L12:
            r2._deletedNodeRef = r0
            java.util.ArrayList<java.lang.Integer> r1 = r2._drawOrders
            if (r1 == 0) goto L1b
            r1.clear()
        L1b:
            org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData r1 = r2._stickfigurePolyfillData
            if (r1 == 0) goto L24
            r1.dispose()
            r2._stickfigurePolyfillData = r0
        L24:
            r0 = 0
            r2._deletedNodeIndex = r0
            r0 = 1
            r2._ownsStickNode = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r14 = this;
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Class<java.util.Stack> r1 = java.util.Stack.class
            java.lang.Object r1 = com.badlogic.gdx.utils.Pools.obtain(r1)
            java.util.Stack r1 = (java.util.Stack) r1
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r14._parentNodeRef
            java.util.ArrayList r2 = r2.getChildrenNodes()
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
        L1c:
            if (r2 < 0) goto L30
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r14._parentNodeRef
            java.util.ArrayList r4 = r4.getChildrenNodes()
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r1.add(r4)
            int r2 = r2 + (-1)
            goto L1c
        L30:
            boolean r2 = r1.isEmpty()
            r4 = 0
            if (r2 != 0) goto L6e
            java.lang.Object r2 = r1.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            boolean r5 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r5 != 0) goto L53
            boolean r5 = r2.getIsAngleLocked()
            if (r5 == 0) goto L53
            boolean r5 = r2.getAngleLockIsMainNode()
            if (r5 != 0) goto L53
            r0.add(r2)
            r2.setIsAngleLocked(r4)
        L53:
            java.util.ArrayList r4 = r2.getChildrenNodes()
            int r4 = r4.size()
            int r4 = r4 - r3
        L5c:
            if (r4 < 0) goto L30
            java.util.ArrayList r5 = r2.getChildrenNodes()
            java.lang.Object r5 = r5.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            r1.add(r5)
            int r4 = r4 + (-1)
            goto L5c
        L6e:
            r1.clear()
            com.badlogic.gdx.utils.Pools.free(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r14._deletedNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            float r1 = r1.getScale()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r14._parentNodeRef
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r14._deletedNodeRef
            int r6 = r14._deletedNodeIndex
            r2.addChildNodeAt(r5, r6, r3)
            org.fortheloss.sticknodes.stickfigure.StickNode[] r2 = r14._childrenNodeRefs
            int r2 = r2.length
            r5 = 0
        L8b:
            if (r5 >= r2) goto L11b
            org.fortheloss.sticknodes.stickfigure.StickNode[] r6 = r14._childrenNodeRefs
            r6 = r6[r5]
            boolean r7 = r6.isUsingSegmentScale()
            if (r7 == 0) goto L9c
            float r7 = r6.getScale()
            goto L9e
        L9c:
            r7 = 1065353216(0x3f800000, float:1.0)
        L9e:
            r8 = 0
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 <= 0) goto Lc2
            float r8 = r6.getGlobalX()
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = r14._deletedNodeRef
            float r9 = r9.getGlobalX()
            float r8 = r8 - r9
            float r8 = r8 / r1
            float r8 = r8 / r7
            float r9 = r6.getGlobalY()
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = r14._deletedNodeRef
            float r10 = r10.getGlobalY()
            float r9 = r9 - r10
            float r9 = r9 / r1
            float r7 = r9 / r7
            r13 = r8
            r8 = r7
            r7 = r13
            goto Lc3
        Lc2:
            r7 = 0
        Lc3:
            double r9 = (double) r8
            double r11 = (double) r7
            double r9 = java.lang.Math.atan2(r9, r11)
            float r9 = (float) r9
            r10 = 1113927392(0x42652ee0, float:57.295776)
            float r9 = r9 * r10
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = r14._deletedNodeRef
            float r10 = r10.getAngle()
            float r9 = r9 - r10
            float r7 = r7 * r7
            float r8 = r8 * r8
            float r7 = r7 + r8
            double r7 = (double) r7
            double r7 = java.lang.Math.sqrt(r7)
            float r7 = (float) r7
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 / r8
            float r8 = r6.getAngle()
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = r14._deletedNodeRef
            r6.changeParentNode(r10)
            r6.setLength(r7)
            r6.setDefaultLength(r7)
            r6.setLocalAngle(r9)
            float r7 = r6.getAngle()
            float r7 = r7 - r8
            java.util.ArrayList r6 = r6.getChildrenNodes()
            int r8 = r6.size()
            int r8 = r8 - r3
        L104:
            if (r8 < 0) goto L117
            java.lang.Object r9 = r6.get(r8)
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = (org.fortheloss.sticknodes.stickfigure.StickNode) r9
            float r10 = r9.getLocalAngle()
            float r10 = r10 - r7
            r9.setLocalAngle(r10)
            int r8 = r8 + (-1)
            goto L104
        L117:
            int r5 = r5 + 1
            goto L8b
        L11b:
            org.fortheloss.sticknodes.stickfigure.Connector[] r1 = r14._connectorEndpointRefs
            if (r1 == 0) goto L12f
            int r1 = r1.length
            int r1 = r1 - r3
        L121:
            if (r1 < 0) goto L12f
            org.fortheloss.sticknodes.stickfigure.Connector[] r2 = r14._connectorEndpointRefs
            r2 = r2[r1]
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r14._deletedNodeRef
            r2.changeEndNode(r5)
            int r1 = r1 + (-1)
            goto L121
        L12f:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r14._parentNodeRef
            r1.flagPositionAsDirty()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r14._parentNodeRef
            r1.validatePosition()
            int r1 = r0.size()
            int r1 = r1 - r3
        L13e:
            if (r1 < 0) goto L155
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r2.setIsAngleLocked(r3)
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r2.setAngleLockIsMainNode(r4)
            int r1 = r1 + (-1)
            goto L13e
        L155:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r14._parentNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            java.util.ArrayList<java.lang.Integer> r1 = r14._drawOrders
            r0.drawAllNodesAt(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData r0 = r14._stickfigurePolyfillData
            if (r0 == 0) goto L175
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r14._parentNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            org.fortheloss.sticknodes.data.useractions.StickfigurePolyfillData r1 = r14._stickfigurePolyfillData
            r0.reconstructPolyfillAfterNodeDeleteUndoRedo(r1)
        L175:
            r14._ownsStickNode = r4
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r14._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r14._deletedNodeRef
            r0.onUndoRedoNodeAction(r1, r4)
            return
    }
}
