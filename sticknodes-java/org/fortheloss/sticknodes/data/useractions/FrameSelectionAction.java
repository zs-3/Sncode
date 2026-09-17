package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class FrameSelectionAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.data.IFrameData _afterFrameDataRef;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.data.IFrameData _beforeFrameDataRef;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private int _idToPreserve;
    private int _nodeToPreserve;
    private int _preserveSelection;

    public FrameSelectionAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1._preserveSelection = r0
            r1._idToPreserve = r0
            r1._nodeToPreserve = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._beforeFrameDataRef = r0
            r1._afterFrameDataRef = r0
            r1._framesModuleRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.IFrameData r1, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2, int r3, int r4, int r5) {
            r0 = this;
            r0._beforeFrameDataRef = r1
            r0._framesModuleRef = r2
            r0._preserveSelection = r3
            r0._idToPreserve = r4
            r0._nodeToPreserve = r5
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r6 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r6._afterFrameDataRef
            r2 = 0
            r0.goToFrame(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.onUndoRedoFrameAction()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getPreserveSelectionWhenChangingFrames()
            if (r0 == 0) goto Ld7
            int r0 = r6._preserveSelection
            if (r0 < 0) goto Ld7
            org.fortheloss.sticknodes.data.IFrameData r0 = r6._afterFrameDataRef
            java.util.ArrayList r1 = r0.getDrawableFigures()
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r2 == 0) goto L2f
            r3 = r0
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            goto L30
        L2f:
            r3 = 0
        L30:
            int r4 = r6._preserveSelection
            r5 = 1
            if (r4 != r5) goto L5a
            java.util.Iterator r0 = r1.iterator()
        L39:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld7
            java.lang.Object r1 = r0.next()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            int r3 = r6._idToPreserve
            if (r2 != r3) goto L39
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            int r2 = r6._nodeToPreserve
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getNodeAtDrawOrderIndex(r2)
            r0.setSessionSelectionToNode(r1)
            goto Ld7
        L5a:
            r5 = 5
            if (r4 != r5) goto L81
            java.util.Iterator r0 = r1.iterator()
        L61:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld7
            java.lang.Object r1 = r0.next()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            int r3 = r6._idToPreserve
            if (r2 != r3) goto L61
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            int r2 = r6._nodeToPreserve
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getNodeAtDrawOrderIndex(r2)
            r0.setSessionSelectionToNode(r1)
            goto Ld7
        L81:
            r5 = 6
            if (r4 != r5) goto La4
            java.util.Iterator r0 = r1.iterator()
        L88:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld7
            java.lang.Object r1 = r0.next()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            int r3 = r6._idToPreserve
            if (r2 != r3) goto L88
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.setSessionSelectionToSprite(r1)
            goto Ld7
        La4:
            r1 = 2
            if (r4 != r1) goto Lc7
            if (r3 == 0) goto Lc7
            java.util.Iterator r0 = r3.iterator()
        Lad:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld7
            java.lang.Object r1 = r0.next()
            org.fortheloss.sticknodes.TextfieldBox r1 = (org.fortheloss.sticknodes.TextfieldBox) r1
            int r2 = r1.getID()
            int r3 = r6._idToPreserve
            if (r2 != r3) goto Lad
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.setSessionSelectionToTextFieldBox(r1)
            goto Ld7
        Lc7:
            r1 = 3
            if (r4 != r1) goto Ld7
            if (r2 == 0) goto Ld7
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r6._animationScreenRef
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            r1.setSessionSelectionToFrameCamera(r0)
        Ld7:
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._beforeFrameDataRef = r0
            r1._afterFrameDataRef = r0
            r1._framesModuleRef = r0
            r0 = -1
            r1._preserveSelection = r0
            r1._idToPreserve = r0
            r1._nodeToPreserve = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r6 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r6._afterFrameDataRef
            if (r0 != 0) goto Lc
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            r6._afterFrameDataRef = r0
        Lc:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r6._beforeFrameDataRef
            r2 = 0
            r0.goToFrame(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.onUndoRedoFrameAction()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getPreserveSelectionWhenChangingFrames()
            if (r0 == 0) goto Le3
            int r0 = r6._preserveSelection
            if (r0 < 0) goto Le3
            org.fortheloss.sticknodes.data.IFrameData r0 = r6._beforeFrameDataRef
            java.util.ArrayList r1 = r0.getDrawableFigures()
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r2 == 0) goto L3b
            r3 = r0
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            goto L3c
        L3b:
            r3 = 0
        L3c:
            int r4 = r6._preserveSelection
            r5 = 1
            if (r4 != r5) goto L66
            java.util.Iterator r0 = r1.iterator()
        L45:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le3
            java.lang.Object r1 = r0.next()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            int r3 = r6._idToPreserve
            if (r2 != r3) goto L45
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            int r2 = r6._nodeToPreserve
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getNodeAtDrawOrderIndex(r2)
            r0.setSessionSelectionToNode(r1)
            goto Le3
        L66:
            r5 = 5
            if (r4 != r5) goto L8d
            java.util.Iterator r0 = r1.iterator()
        L6d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le3
            java.lang.Object r1 = r0.next()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            int r3 = r6._idToPreserve
            if (r2 != r3) goto L6d
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            int r2 = r6._nodeToPreserve
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getNodeAtDrawOrderIndex(r2)
            r0.setSessionSelectionToNode(r1)
            goto Le3
        L8d:
            r5 = 6
            if (r4 != r5) goto Lb0
            java.util.Iterator r0 = r1.iterator()
        L94:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le3
            java.lang.Object r1 = r0.next()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            int r3 = r6._idToPreserve
            if (r2 != r3) goto L94
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.setSessionSelectionToSprite(r1)
            goto Le3
        Lb0:
            r1 = 2
            if (r4 != r1) goto Ld3
            if (r3 == 0) goto Ld3
            java.util.Iterator r0 = r3.iterator()
        Lb9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le3
            java.lang.Object r1 = r0.next()
            org.fortheloss.sticknodes.TextfieldBox r1 = (org.fortheloss.sticknodes.TextfieldBox) r1
            int r2 = r1.getID()
            int r3 = r6._idToPreserve
            if (r2 != r3) goto Lb9
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.setSessionSelectionToTextFieldBox(r1)
            goto Le3
        Ld3:
            r1 = 3
            if (r4 != r1) goto Le3
            if (r2 == 0) goto Le3
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r6._animationScreenRef
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            r1.setSessionSelectionToFrameCamera(r0)
        Le3:
            return
    }
}
