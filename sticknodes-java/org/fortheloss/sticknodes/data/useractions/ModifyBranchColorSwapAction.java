package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class ModifyBranchColorSwapAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private com.badlogic.gdx.graphics.Color _color1;
    private com.badlogic.gdx.graphics.Color _color2;
    private org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule _createToolsModuleRef;

    public ModifyBranchColorSwapAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
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
            r1._color1 = r0
            r1._color2 = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2, com.badlogic.gdx.graphics.Color r3, com.badlogic.gdx.graphics.Color r4) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._color1
            if (r0 != 0) goto Lb
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r1._color1 = r0
        Lb:
            com.badlogic.gdx.graphics.Color r0 = r1._color2
            if (r0 != 0) goto L16
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r1._color2 = r0
        L16:
            r1._createToolsModuleRef = r2
            com.badlogic.gdx.graphics.Color r2 = r1._color1
            r2.set(r3)
            com.badlogic.gdx.graphics.Color r2 = r1._color2
            r2.set(r4)
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            com.badlogic.gdx.graphics.Color r1 = r3._color2
            com.badlogic.gdx.graphics.Color r2 = r3._color1
            r0.setModifyBranchSwapColors(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._createToolsModuleRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            com.badlogic.gdx.graphics.Color r1 = r3._color1
            com.badlogic.gdx.graphics.Color r2 = r3._color2
            r0.setModifyBranchSwapColors(r1, r2)
            return
    }
}
