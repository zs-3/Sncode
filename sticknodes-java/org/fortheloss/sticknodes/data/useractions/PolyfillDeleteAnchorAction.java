package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class PolyfillDeleteAnchorAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private boolean _isFromPolyfillEditMenu;
    private org.fortheloss.sticknodes.stickfigure.StickNode _polyAnchorRef;
    private org.fortheloss.sticknodes.stickfigure.StickNode[] _removedPolynodeChildrenRefs;

    public PolyfillDeleteAnchorAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._isFromPolyfillEditMenu = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._polyAnchorRef = r0
            r1._removedPolynodeChildrenRefs = r0
            r1._animationScreenRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r4, boolean r5) {
            r3 = this;
            r3._polyAnchorRef = r4
            r3._isFromPolyfillEditMenu = r5
            java.util.ArrayList r4 = r4.getPolynodeChildren()
            int r5 = r4.size()
            org.fortheloss.sticknodes.stickfigure.StickNode[] r0 = new org.fortheloss.sticknodes.stickfigure.StickNode[r5]
            r3._removedPolynodeChildrenRefs = r0
            r0 = 0
        L11:
            if (r0 >= r5) goto L20
            org.fortheloss.sticknodes.stickfigure.StickNode[] r1 = r3._removedPolynodeChildrenRefs
            java.lang.Object r2 = r4.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto L11
        L20:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._polyAnchorRef
            r0.deletePolyAnchor()
            boolean r0 = r3._isFromPolyfillEditMenu
            if (r0 == 0) goto L11
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._polyAnchorRef
            r0.onUndoRedoPolyfillActionCancel(r1)
            goto L19
        L11:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._polyAnchorRef
            r2 = 0
            r0.onUndoRedoNodeAction(r1, r2)
        L19:
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._polyAnchorRef = r0
            r1._removedPolynodeChildrenRefs = r0
            r0 = 1
            r1._isFromPolyfillEditMenu = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r5 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode[] r0 = r5._removedPolynodeChildrenRefs
            int r0 = r0.length
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r5._polyAnchorRef
            r1.convertToPolyAnchor()
            r1 = 0
            r2 = 0
        La:
            if (r2 >= r0) goto L18
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r5._polyAnchorRef
            org.fortheloss.sticknodes.stickfigure.StickNode[] r4 = r5._removedPolynodeChildrenRefs
            r4 = r4[r2]
            r3.addPolynodeChild(r4)
            int r2 = r2 + 1
            goto La
        L18:
            boolean r0 = r5._isFromPolyfillEditMenu
            if (r0 == 0) goto L24
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r5._polyAnchorRef
            r0.onUndoRedoPolyfillActionBegin(r1)
            goto L2b
        L24:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r5._polyAnchorRef
            r0.onUndoRedoNodeAction(r2, r1)
        L2b:
            return
    }
}
