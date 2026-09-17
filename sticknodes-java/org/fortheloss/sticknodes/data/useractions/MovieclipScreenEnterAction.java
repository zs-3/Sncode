package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class MovieclipScreenEnterAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private int _mcFrameIndex;
    private org.fortheloss.sticknodes.movieclip.MCMovieclipSource _mcSource;
    private boolean _ownsMC;

    public MovieclipScreenEnterAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._ownsMC = r0
            r1._mcFrameIndex = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            boolean r1 = r2._ownsMC
            if (r1 == 0) goto L16
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r2._mcSource
            if (r1 == 0) goto L16
            int r1 = r1.getLibraryID()
            if (r1 >= 0) goto L16
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r2._mcSource
            r1.dispose()
        L16:
            r2._mcSource = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1, int r2) {
            r0 = this;
            r0._mcSource = r1
            r0._mcFrameIndex = r2
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r4._mcSource
            int r2 = r4._mcFrameIndex
            r3 = 0
            r0.setToMovieclipScreen(r1, r2, r3)
            r4._ownsMC = r3
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            boolean r0 = r1._ownsMC
            if (r0 == 0) goto L13
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r1._mcSource
            if (r0 == 0) goto L13
            int r0 = r0.getLibraryID()
            if (r0 >= 0) goto L13
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r1._mcSource
            r0.dispose()
        L13:
            r0 = 0
            r1._mcSource = r0
            r0 = 0
            r1._ownsMC = r0
            r1._mcFrameIndex = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r3._mcSource
            int r0 = r0.getLibraryID()
            if (r0 < 0) goto L14
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r3._mcSource
            r0.recalculateAllNextFrameStickfigureIndicesForTweening()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r3._mcSource
            r0.movieclipSourceEdited(r1)
        L14:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r1 = 0
            r2 = 1
            r0.setToAnimateScreen(r2, r1)
            r3._ownsMC = r2
            return
    }
}
