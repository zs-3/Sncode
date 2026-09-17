package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class TextfieldBoxAddAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.TextfieldBox _addedTextfieldRef;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private org.fortheloss.sticknodes.data.FrameData _frameRef;
    private boolean _ownsTextfield;

    public TextfieldBoxAddAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._ownsTextfield = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            r2._frameRef = r0
            r2._canvasModuleRef = r0
            boolean r1 = r2._ownsTextfield
            if (r1 == 0) goto L12
            org.fortheloss.sticknodes.TextfieldBox r1 = r2._addedTextfieldRef
            if (r1 == 0) goto L12
            r1.dispose()
        L12:
            r2._addedTextfieldRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.TextfieldBox r1, org.fortheloss.sticknodes.data.FrameData r2, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3) {
            r0 = this;
            r0._addedTextfieldRef = r1
            r0._frameRef = r2
            r0._canvasModuleRef = r3
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r3._frameRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r3._addedTextfieldRef
            int r2 = r1.getID()
            r0.addTextfield(r1, r2)
            r0 = 0
            r3._ownsTextfield = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r3._addedTextfieldRef
            r0.onUndoRedoTextfieldAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            r0 = 0
            r2._frameRef = r0
            r2._canvasModuleRef = r0
            boolean r1 = r2._ownsTextfield
            if (r1 == 0) goto L10
            org.fortheloss.sticknodes.TextfieldBox r1 = r2._addedTextfieldRef
            if (r1 == 0) goto L10
            r1.dispose()
        L10:
            r2._addedTextfieldRef = r0
            r0 = 0
            r2._ownsTextfield = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r2._frameRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r2._addedTextfieldRef
            r0.deleteTextfield(r1)
            r0 = 1
            r2._ownsTextfield = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r1 = 0
            r0.onUndoRedoTextfieldAction(r1)
            return
    }
}
