package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class TextfieldBoxDeleteAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.TextfieldBox _deletedTextfieldRef;
    private org.fortheloss.sticknodes.data.FrameData _frameRef;
    private boolean _ownsTextfield;
    private int _textfieldIndex;

    public TextfieldBoxDeleteAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._ownsTextfield = r0
            r0 = 0
            r1._textfieldIndex = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            r2._frameRef = r0
            boolean r1 = r2._ownsTextfield
            if (r1 == 0) goto L10
            org.fortheloss.sticknodes.TextfieldBox r1 = r2._deletedTextfieldRef
            if (r1 == 0) goto L10
            r1.dispose()
        L10:
            r2._deletedTextfieldRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.TextfieldBox r1, int r2, org.fortheloss.sticknodes.data.FrameData r3) {
            r0 = this;
            r0._deletedTextfieldRef = r1
            r0._frameRef = r3
            r0._textfieldIndex = r2
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r2._frameRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r2._deletedTextfieldRef
            r0.deleteTextfield(r1)
            r0 = 1
            r2._ownsTextfield = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r1 = 0
            r0.onUndoRedoTextfieldAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            r0 = 0
            r2._frameRef = r0
            boolean r1 = r2._ownsTextfield
            if (r1 == 0) goto Le
            org.fortheloss.sticknodes.TextfieldBox r1 = r2._deletedTextfieldRef
            if (r1 == 0) goto Le
            r1.dispose()
        Le:
            r2._deletedTextfieldRef = r0
            r0 = 1
            r2._ownsTextfield = r0
            r0 = 0
            r2._textfieldIndex = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r4 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r4._frameRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r4._deletedTextfieldRef
            int r2 = r1.getID()
            int r3 = r4._textfieldIndex
            r0.addTextfieldAt(r1, r2, r3)
            r0 = 0
            r4._ownsTextfield = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r4._deletedTextfieldRef
            r0.onUndoRedoTextfieldAction(r1)
            return
    }
}
