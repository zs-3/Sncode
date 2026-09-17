package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class MCReferenceFlipAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private boolean _isFlipX;
    private org.fortheloss.sticknodes.movieclip.MCReference _mcRef;
    private boolean _specialJoinFlip;

    public MCReferenceFlipAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._isFlipX = r0
            r0 = 0
            r1._specialJoinFlip = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._mcRef = r0
            return
    }

    public org.fortheloss.sticknodes.movieclip.MCReference getMCRef() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._mcRef
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.movieclip.MCReference r1, boolean r2, boolean r3) {
            r0 = this;
            r0._mcRef = r1
            r0._isFlipX = r2
            r0._specialJoinFlip = r3
            return
    }

    public boolean isFlipX() {
            r1 = this;
            boolean r0 = r1._isFlipX
            return r0
    }

    public boolean isSpecialJoinFlip() {
            r1 = this;
            boolean r0 = r1._specialJoinFlip
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r4 = this;
            boolean r0 = r4._isFlipX
            if (r0 == 0) goto Lc
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r4._mcRef
            boolean r1 = r4._specialJoinFlip
            r0.flipX(r1)
            goto L13
        Lc:
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r4._mcRef
            boolean r1 = r4._specialJoinFlip
            r0.flipY(r1)
        L13:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r4._mcRef
            boolean r2 = r4._isFlipX
            boolean r3 = r4._specialJoinFlip
            r0.onUndoRedoMCReferenceFlipAction(r1, r2, r3)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._mcRef = r0
            r0 = 1
            r1._isFlipX = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r4 = this;
            boolean r0 = r4._isFlipX
            if (r0 == 0) goto Lc
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r4._mcRef
            boolean r1 = r4._specialJoinFlip
            r0.flipX(r1)
            goto L13
        Lc:
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r4._mcRef
            boolean r1 = r4._specialJoinFlip
            r0.flipY(r1)
        L13:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r4._mcRef
            boolean r2 = r4._isFlipX
            boolean r3 = r4._specialJoinFlip
            r0.onUndoRedoMCReferenceFlipAction(r1, r2, r3)
            return
    }
}
