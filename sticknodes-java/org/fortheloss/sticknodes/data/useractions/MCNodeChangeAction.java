package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class MCNodeChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.data.useractions.MCNodeProperties _afterProperties;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.data.useractions.MCNodeProperties _beforeProperties;
    private org.fortheloss.sticknodes.movieclip.MCNode _mcNodeRef;
    private boolean _needsAfterProperties;

    public MCNodeChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._needsAfterProperties = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._mcNodeRef = r0
            r1._beforeProperties = r0
            r1._afterProperties = r0
            return
    }

    public org.fortheloss.sticknodes.movieclip.MCNode getMcNode() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r1._mcNodeRef
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.movieclip.MCNode r2) {
            r1 = this;
            r1._mcNodeRef = r2
            org.fortheloss.sticknodes.data.useractions.MCNodeProperties r0 = r1._beforeProperties
            if (r0 != 0) goto Le
            org.fortheloss.sticknodes.data.useractions.MCNodeProperties r0 = new org.fortheloss.sticknodes.data.useractions.MCNodeProperties
            r0.<init>(r2)
            r1._beforeProperties = r0
            goto L11
        Le:
            r0.getProperties(r2)
        L11:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r3._mcNodeRef
            org.fortheloss.sticknodes.data.useractions.MCNodeProperties r1 = r3._afterProperties
            r0.setProperties(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r3._mcNodeRef
            r2 = 1
            r0.onUndoRedoNodeAction(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._mcNodeRef = r0
            r0 = 1
            r1._needsAfterProperties = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            boolean r0 = r3._needsAfterProperties
            if (r0 == 0) goto L1a
            org.fortheloss.sticknodes.data.useractions.MCNodeProperties r0 = r3._afterProperties
            if (r0 != 0) goto L12
            org.fortheloss.sticknodes.data.useractions.MCNodeProperties r0 = new org.fortheloss.sticknodes.data.useractions.MCNodeProperties
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r3._mcNodeRef
            r0.<init>(r1)
            r3._afterProperties = r0
            goto L17
        L12:
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r3._mcNodeRef
            r0.getProperties(r1)
        L17:
            r0 = 0
            r3._needsAfterProperties = r0
        L1a:
            org.fortheloss.sticknodes.movieclip.MCNode r0 = r3._mcNodeRef
            org.fortheloss.sticknodes.data.useractions.MCNodeProperties r1 = r3._beforeProperties
            r0.setProperties(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r3._mcNodeRef
            r2 = 1
            r0.onUndoRedoNodeAction(r1, r2)
            return
    }
}
