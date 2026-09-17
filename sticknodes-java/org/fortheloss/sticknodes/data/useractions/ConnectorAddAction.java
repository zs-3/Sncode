package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class ConnectorAddAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen mAnimationScreenRef;
    private int mConnectorIndexAmongSiblings;
    private org.fortheloss.sticknodes.stickfigure.Connector mConnectorRef;
    private org.fortheloss.sticknodes.stickfigure.StickNode mEndpointRef;
    private boolean mOwnsConnector;
    private org.fortheloss.sticknodes.stickfigure.StickNode mParentNodeRef;

    public ConnectorAddAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mConnectorIndexAmongSiblings = r0
            r0 = 0
            r1.mOwnsConnector = r0
            r1.mAnimationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3.mAnimationScreenRef = r0
            org.fortheloss.sticknodes.stickfigure.Connector r1 = r3.mConnectorRef
            if (r1 == 0) goto L10
            boolean r2 = r3.mOwnsConnector
            if (r2 == 0) goto Le
            r1.dispose()
        Le:
            r3.mConnectorRef = r0
        L10:
            r3.mParentNodeRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.Connector r3) {
            r2 = this;
            r2.mConnectorRef = r3
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getParentNode()
            r2.mParentNodeRef = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r3.getEndNode()
            r2.mEndpointRef = r3
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.mParentNodeRef
            java.util.ArrayList r3 = r3.getChildrenNodes()
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L1a:
            if (r3 < 0) goto L30
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.mParentNodeRef
            java.util.ArrayList r0 = r0.getChildrenNodes()
            java.lang.Object r0 = r0.get(r3)
            org.fortheloss.sticknodes.stickfigure.Connector r1 = r2.mConnectorRef
            if (r0 != r1) goto L2d
            r2.mConnectorIndexAmongSiblings = r3
            goto L30
        L2d:
            int r3 = r3 + (-1)
            goto L1a
        L30:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r4 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4.mParentNodeRef
            org.fortheloss.sticknodes.stickfigure.Connector r1 = r4.mConnectorRef
            int r2 = r4.mConnectorIndexAmongSiblings
            r3 = 1
            r0.addChildNodeAt(r1, r2, r3)
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r4.mConnectorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r4.mEndpointRef
            r0.changeEndNode(r1)
            r0 = 0
            r4.mOwnsConnector = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4.mAnimationScreenRef
            org.fortheloss.sticknodes.stickfigure.Connector r1 = r4.mConnectorRef
            r0.onUndoRedoNodeAction(r1, r3)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1.mConnectorRef = r0
            r1.mParentNodeRef = r0
            r1.mEndpointRef = r0
            r0 = 0
            r1.mOwnsConnector = r0
            r0 = -1
            r1.mConnectorIndexAmongSiblings = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r3.mConnectorRef
            r1 = 1
            r0.delete(r1)
            r3.mOwnsConnector = r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3.mAnimationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r3.mParentNodeRef
            r0.onUndoRedoNodeAction(r2, r1)
            return
    }
}
