package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class ConnectorChangeEndpointAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen mAnimationScreenRef;
    private org.fortheloss.sticknodes.stickfigure.Connector mConnectorRef;
    private org.fortheloss.sticknodes.stickfigure.StickNode mEndpointAfterRef;
    private org.fortheloss.sticknodes.stickfigure.StickNode mEndpointBeforeRef;

    public ConnectorChangeEndpointAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>()
            r0.mAnimationScreenRef = r1
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mAnimationScreenRef = r0
            r1.mConnectorRef = r0
            r1.mEndpointBeforeRef = r0
            r1.mEndpointAfterRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.Connector r1) {
            r0 = this;
            r0.mConnectorRef = r1
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getEndNode()
            r0.mEndpointBeforeRef = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r3.mConnectorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3.mEndpointAfterRef
            r0.changeEndNode(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3.mAnimationScreenRef
            org.fortheloss.sticknodes.stickfigure.Connector r1 = r3.mConnectorRef
            r2 = 1
            r0.onUndoRedoNodeAction(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1.mConnectorRef = r0
            r1.mEndpointBeforeRef = r0
            r1.mEndpointAfterRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.mEndpointAfterRef
            if (r0 != 0) goto Lc
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r3.mConnectorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getEndNode()
            r3.mEndpointAfterRef = r0
        Lc:
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r3.mConnectorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3.mEndpointBeforeRef
            r0.changeEndNode(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3.mAnimationScreenRef
            org.fortheloss.sticknodes.stickfigure.Connector r1 = r3.mConnectorRef
            r2 = 1
            r0.onUndoRedoNodeAction(r1, r2)
            return
    }
}
