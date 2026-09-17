package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class EditMCDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _duplicateButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _editButton;
    private int _movieclipLibraryID;



    /* renamed from: -$$Nest$monDuplicateClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m442$$Nest$monDuplicateClick(org.fortheloss.sticknodes.animationscreen.dialogs.EditMCDialog r0) {
            r0.onDuplicateClick()
            return
    }

    /* renamed from: -$$Nest$monEditClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m443$$Nest$monEditClick(org.fortheloss.sticknodes.animationscreen.dialogs.EditMCDialog r0) {
            r0.onEditClick()
            return
    }

    public EditMCDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0._movieclipLibraryID = r1
            return
    }

    private void onDuplicateClick() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3._animateToolsModuleRef
            int r1 = r3._movieclipLibraryID
            r2 = 0
            r0.editMCResult(r2, r1)
            r3.hideImmediately()
            return
    }

    private void onEditClick() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3._animateToolsModuleRef
            int r1 = r3._movieclipLibraryID
            r2 = 1
            r0.editMCResult(r2, r1)
            r3.hideImmediately()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animateToolsModuleRef = r0
            r1._editButton = r0
            r1._duplicateButton = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r5, int r6) {
            r4 = this;
            r4._movieclipLibraryID = r6
            r4._animateToolsModuleRef = r5
            java.lang.String r5 = "editDuplicateMCTitle"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            super.initialize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r4.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.defaults()
            r6 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.uniform(r6, r6)
            r5.expand(r6, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "editDuplicateInfo"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r1)
            r5.<init>(r6, r0)
            r6 = 1
            r5.setWrap(r6)
            r5.setAlignment(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r0)
            r0 = 2
            r5.colspan(r0)
            r4.addContentRow()
            java.lang.String r5 = "edit"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            r4._editButton = r5
            org.fortheloss.sticknodes.animationscreen.dialogs.EditMCDialog$1 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.EditMCDialog$1
            r0.<init>(r4)
            r5.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._editButton
            r4.addContent(r5)
            java.lang.String r5 = "duplicate"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            r4._duplicateButton = r5
            org.fortheloss.sticknodes.animationscreen.dialogs.EditMCDialog$2 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.EditMCDialog$2
            r0.<init>(r4)
            r5.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._duplicateButton
            r4.addContent(r5)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "editDuplicateEditInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r1.<init>(r2)
            r5.<init>(r0, r1)
            r5.setWrap(r6)
            r5.setAlignment(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            r5.width(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "editDuplicateDuplicateInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r2.<init>(r3)
            r5.<init>(r0, r2)
            r5.setWrap(r6)
            r5.setAlignment(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            float r6 = r6 * r1
            r5.width(r6)
            r4.addContentRow()
            java.lang.String r5 = "cancel"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r4.addButton(r5, r6)
            return
    }
}
