package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class ModifyBranchDialogShownAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.stickfigure.StickNode _branchRef;
    private org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule _createToolsModuleRef;

    public ModifyBranchDialogShownAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>()
            r0._animationScreenRef = r1
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._createToolsModuleRef = r0
            r1._branchRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1, org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r0 = this;
            r0._createToolsModuleRef = r1
            r0._branchRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2._branchRef
            r0.showModifyBranchDialog(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._createToolsModuleRef = r0
            r1._branchRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._createToolsModuleRef
            r1 = 0
            r0.hideModifyBranchDialog(r1)
            return
    }
}
