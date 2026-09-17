package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class BranchChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] _afterProperties;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] _beforeProperties;
    private org.fortheloss.sticknodes.stickfigure.StickNode _branchRef;
    private int _lastChangedProperty;
    private boolean _needsAfterProperties;

    public BranchChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._needsAfterProperties = r0
            r0 = 0
            r1._lastChangedProperty = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._animationScreenRef = r0
            r3._branchRef = r0
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r1 = r3._beforeProperties
            if (r1 == 0) goto L1a
            int r1 = r1.length
            int r1 = r1 + (-1)
        Lc:
            if (r1 < 0) goto L18
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r2 = r3._beforeProperties
            r2 = r2[r1]
            r2.dispose()
            int r1 = r1 + (-1)
            goto Lc
        L18:
            r3._beforeProperties = r0
        L1a:
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r1 = r3._afterProperties
            if (r1 == 0) goto L2f
            int r1 = r1.length
            int r1 = r1 + (-1)
        L21:
            if (r1 < 0) goto L2d
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r2 = r3._afterProperties
            r2 = r2[r1]
            r2.dispose()
            int r1 = r1 + (-1)
            goto L21
        L2d:
            r3._afterProperties = r0
        L2f:
            return
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode getBranch() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._branchRef
            return r0
    }

    public int getLastChangedProperty() {
            r1 = this;
            int r0 = r1._lastChangedProperty
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r1, int r2) {
            r0 = this;
            r0._branchRef = r1
            r0._lastChangedProperty = r2
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r1 = r1.getBranchProperties()
            r0._beforeProperties = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._branchRef
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r1 = r3._afterProperties
            r0.setBranchProperties(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            r2 = 1
            r0.onUndoRedoNodeAction(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r4 = this;
            r0 = 0
            r4._branchRef = r0
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r1 = r4._beforeProperties
            r2 = 1
            if (r1 == 0) goto L18
            int r1 = r1.length
            int r1 = r1 - r2
        La:
            if (r1 < 0) goto L16
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r3 = r4._beforeProperties
            r3 = r3[r1]
            r3.dispose()
            int r1 = r1 + (-1)
            goto La
        L16:
            r4._beforeProperties = r0
        L18:
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r1 = r4._afterProperties
            if (r1 == 0) goto L2c
            int r1 = r1.length
            int r1 = r1 - r2
        L1e:
            if (r1 < 0) goto L2a
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r3 = r4._afterProperties
            r3 = r3[r1]
            r3.dispose()
            int r1 = r1 + (-1)
            goto L1e
        L2a:
            r4._afterProperties = r0
        L2c:
            r4._needsAfterProperties = r2
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            boolean r0 = r3._needsAfterProperties
            if (r0 == 0) goto Lf
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._branchRef
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r0 = r0.getBranchProperties()
            r3._afterProperties = r0
            r0 = 0
            r3._needsAfterProperties = r0
        Lf:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._branchRef
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r1 = r3._beforeProperties
            r0.setBranchProperties(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            r2 = 1
            r0.onUndoRedoNodeAction(r1, r2)
            return
    }
}
