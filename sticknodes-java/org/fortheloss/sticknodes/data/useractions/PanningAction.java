package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class PanningAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.data.IFrameData _frameRef;
    private float _panX;
    private float _panY;

    public PanningAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._panX = r0
            r1._panY = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._frameRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.IFrameData r1, float r2, float r3) {
            r0 = this;
            r0._frameRef = r1
            r0._panX = r2
            r0._panY = r3
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r6 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r6._frameRef
            java.util.ArrayList r0 = r0.getDrawableFigures()
            int r1 = r0.size()
            int r1 = r1 + (-1)
        Lc:
            if (r1 < 0) goto L45
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            boolean r3 = r2.isLocked()
            if (r3 != 0) goto L42
            boolean r3 = r2.isJoined()
            if (r3 != 0) goto L42
            byte r3 = r2.isLockedToCamera()
            if (r3 == 0) goto L27
            goto L42
        L27:
            boolean r3 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r3 == 0) goto L31
            r3 = r2
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r3
            r3.unlockStickNode()
        L31:
            float r3 = r2.getX()
            float r4 = r6._panX
            float r3 = r3 + r4
            float r4 = r2.getY()
            float r5 = r6._panY
            float r4 = r4 + r5
            r2.setPosition(r3, r4)
        L42:
            int r1 = r1 + (-1)
            goto Lc
        L45:
            org.fortheloss.sticknodes.data.IFrameData r0 = r6._frameRef
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r1 == 0) goto L80
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            java.util.ArrayList r0 = r0.getTextfieldBoxes()
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L57:
            if (r1 < 0) goto L80
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.TextfieldBox r2 = (org.fortheloss.sticknodes.TextfieldBox) r2
            boolean r3 = r2.isLocked()
            if (r3 != 0) goto L7d
            boolean r3 = r2.isLockedToCamera()
            if (r3 == 0) goto L6c
            goto L7d
        L6c:
            float r3 = r2.getX()
            float r4 = r6._panX
            float r3 = r3 + r4
            float r4 = r2.getY()
            float r5 = r6._panY
            float r4 = r4 + r5
            r2.setPosition(r3, r4)
        L7d:
            int r1 = r1 + (-1)
            goto L57
        L80:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.onUndoRedoPanningAction()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._frameRef = r0
            r0 = 0
            r1._panX = r0
            r1._panY = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r6 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r6._frameRef
            java.util.ArrayList r0 = r0.getDrawableFigures()
            int r1 = r0.size()
            int r1 = r1 + (-1)
        Lc:
            if (r1 < 0) goto L45
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            boolean r3 = r2.isLocked()
            if (r3 != 0) goto L42
            boolean r3 = r2.isJoined()
            if (r3 != 0) goto L42
            byte r3 = r2.isLockedToCamera()
            if (r3 == 0) goto L27
            goto L42
        L27:
            boolean r3 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r3 == 0) goto L31
            r3 = r2
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r3
            r3.unlockStickNode()
        L31:
            float r3 = r2.getX()
            float r4 = r6._panX
            float r3 = r3 - r4
            float r4 = r2.getY()
            float r5 = r6._panY
            float r4 = r4 - r5
            r2.setPosition(r3, r4)
        L42:
            int r1 = r1 + (-1)
            goto Lc
        L45:
            org.fortheloss.sticknodes.data.IFrameData r0 = r6._frameRef
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r1 == 0) goto L80
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            java.util.ArrayList r0 = r0.getTextfieldBoxes()
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L57:
            if (r1 < 0) goto L80
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.TextfieldBox r2 = (org.fortheloss.sticknodes.TextfieldBox) r2
            boolean r3 = r2.isLocked()
            if (r3 != 0) goto L7d
            boolean r3 = r2.isLockedToCamera()
            if (r3 == 0) goto L6c
            goto L7d
        L6c:
            float r3 = r2.getX()
            float r4 = r6._panX
            float r3 = r3 - r4
            float r4 = r2.getY()
            float r5 = r6._panY
            float r4 = r4 - r5
            r2.setPosition(r3, r4)
        L7d:
            int r1 = r1 + (-1)
            goto L57
        L80:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.onUndoRedoPanningAction()
            return
    }
}
