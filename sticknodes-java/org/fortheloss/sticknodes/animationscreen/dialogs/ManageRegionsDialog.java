package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ManageRegionsDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule mAnimationBasedModuleRef;
    private org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog mCreateSpriteDialogRef;
    private java.lang.String mOriginalText;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField mPrefixTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.TextArea mTextArea;






    /* renamed from: -$$Nest$fgetmCreateSpriteDialogRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog m534$$Nest$fgetmCreateSpriteDialogRef(org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog r0) {
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r0.mCreateSpriteDialogRef
            return r0
    }

    /* renamed from: -$$Nest$fgetmPrefixTextField, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m535$$Nest$fgetmPrefixTextField(org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0.mPrefixTextField
            return r0
    }

    /* renamed from: -$$Nest$fgetmTextArea, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextArea m536$$Nest$fgetmTextArea(org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r0 = r0.mTextArea
            return r0
    }

    public ManageRegionsDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mAnimationBasedModuleRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r9) {
            r8 = this;
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.String r0 = "regionsError5"
            java.lang.String r1 = "notValidTitle"
            java.lang.String r2 = "no"
            java.lang.String r3 = "yes"
            java.lang.String r4 = "areYouSure"
            r5 = 2
            r6 = 1
            if (r9 != 0) goto La3
            java.lang.String r9 = r8.mOriginalText
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r7 = r8.mTextArea
            java.lang.String r7 = r7.getText()
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 != 0) goto L124
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r9 = r8.mCreateSpriteDialogRef
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r7 = r8.mTextArea
            java.lang.String r7 = r7.getText()
            int r9 = r9.isTextDataValid(r7)
            if (r9 != 0) goto L52
            org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog$1 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog$1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r8._animationScreenRef
            r9.<init>(r8, r0)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r1 = "manageRegionsApply"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r9.initialize(r0, r1, r3, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r8._animationScreenRef
            r0.addDialogToStage(r9)
            goto L9e
        L52:
            java.lang.String r2 = "generalError"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            if (r9 != r6) goto L61
            java.lang.String r9 = "regionsError1"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r9)
            goto L7d
        L61:
            if (r9 != r5) goto L6a
            java.lang.String r9 = "regionsError2"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r9)
            goto L7d
        L6a:
            r3 = 4
            if (r9 != r3) goto L74
            java.lang.String r9 = "regionsError3"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r9)
            goto L7d
        L74:
            r3 = 5
            if (r9 != r3) goto L7d
            java.lang.String r9 = "regionsError4"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r9)
        L7d:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r8._animationScreenRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "\n\n"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r9.showErrorDialog(r1, r0)
        L9e:
            r8.doNotHideDialog()
            goto L124
        La3:
            if (r9 != r6) goto Lb8
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportRegionsDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r8._animationScreenRef
            r9.<init>(r0)
            r9.initialize(r8)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r8._animationScreenRef
            r0.addDialogToStage(r9)
            r8.doNotHideDialog()
            goto L124
        Lb8:
            if (r9 != r5) goto Lef
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r9 = r8.mCreateSpriteDialogRef
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r2 = r8.mTextArea
            java.lang.String r2 = r2.getText()
            int r9 = r9.isTextDataValid(r2)
            if (r9 != 0) goto Lde
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportRegionsDialog r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportRegionsDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r8._animationScreenRef
            r9.<init>(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r0 = r8.mTextArea
            java.lang.String r0 = r0.getText()
            r9.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r8._animationScreenRef
            r0.addDialogToStage(r9)
            goto Leb
        Lde:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r8._animationScreenRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r9.showErrorDialog(r1, r0)
        Leb:
            r8.doNotHideDialog()
            goto L124
        Lef:
            r0 = 3
            if (r9 != r0) goto L124
            java.lang.String r9 = r8.mOriginalText
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r0 = r8.mTextArea
            java.lang.String r0 = r0.getText()
            boolean r9 = r9.equalsIgnoreCase(r0)
            if (r9 != 0) goto L124
            org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog$2 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog$2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r8._animationScreenRef
            r9.<init>(r8, r0)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r1 = "manageRegionsLeave"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r9.initialize(r0, r1, r3, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r8._animationScreenRef
            r0.addDialogToStage(r9)
            r8.doNotHideDialog()
        L124:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mAnimationBasedModuleRef = r0
            r1.mCreateSpriteDialogRef = r0
            r1.mPrefixTextField = r0
            r1.mTextArea = r0
            r1.mOriginalText = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r9) {
            r8 = this;
            java.lang.String r0 = "manageRegionsTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r8.mCreateSpriteDialogRef = r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r8.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.defaults()
            r0 = 0
            r9.uniform(r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "manageRegionsInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r1, r2)
            r1 = 1
            r9.setWrap(r1)
            r9.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r8.addContent(r9)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.width(r2)
            r2 = 2
            r9.colspan(r2)
            r8.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "manageRegionsPrefixInfo"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r3, r4)
            r9.setWrap(r1)
            r9.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r8.addContent(r9)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.width(r3)
            r9.colspan(r2)
            r8.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "prefix"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ":"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r3, r4)
            r9.setWrap(r0)
            r3 = 16
            r9.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r8.addContent(r9)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            float r4 = r4 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.width(r4)
            r9.align(r3)
            java.lang.String r9 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r8.createTextField(r9)
            r8.mPrefixTextField = r4
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r5 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r5.<init>()
            r4.setTextFieldFilter(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r8.mPrefixTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r8.addContent(r4)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            r6 = 1055286886(0x3ee66666, float:0.45)
            float r5 = r5 * r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.height(r5)
            r5 = 8
            r4.align(r5)
            r8.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r4 = new com.badlogic.gdx.scenes.scene2d.ui.TextArea
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTextAreaAllLocalesStyle()
            r4.<init>(r9, r6)
            r8.mTextArea = r4
            r4.setOnlyFontChars(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r9 = r8.mTextArea
            r9.setFocusTraversal(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r9 = r8.mTextArea
            org.fortheloss.framework.CustomStopListener r4 = new org.fortheloss.framework.CustomStopListener
            r4.<init>()
            r9.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r9 = r8.mTextArea
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r8.addContent(r9)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.width(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            int r4 = r4 * 5
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.height(r4)
            r9.colspan(r2)
            r8.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r9.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.uniform(r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expand(r0, r0)
            r4.fill(r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r8.addContent(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fillX()
            r4.colspan(r2)
            r8.addContentRow()
            java.lang.String r4 = "copy"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r8.createTextButton(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog$3 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog$3
            r6.<init>(r8)
            r4.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r9.add(r4)
            float r4 = r4.getHeight()
            r7 = 1058642330(0x3f19999a, float:0.6)
            float r4 = r4 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r6.height(r4)
            r4.align(r3)
            java.lang.String r3 = "paste"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r8.createTextButton(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog$4 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog$4
            r4.<init>(r8)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r9.add(r3)
            float r3 = r3.getHeight()
            float r3 = r3 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.height(r3)
            r3.align(r1)
            java.lang.String r3 = "clear"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r8.createTextButton(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog$5 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ManageRegionsDialog$5
            r4.<init>(r8)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.add(r3)
            float r3 = r3.getHeight()
            float r3 = r3 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.height(r3)
            r9.align(r5)
            int r9 = org.fortheloss.sticknodes.App.language_id
            if (r9 != 0) goto L1d1
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            java.lang.String r4 = "[ color; transparent(0-1); anti-alias(0-1) ]\n[ name; u1; v1; u2; v2; originX; originY; scaleX; scaleY; mask(0-5) ]\n[ ... ]"
            r9.<init>(r4, r3)
            r9.setWrap(r1)
            r9.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r8.addContent(r9)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.width(r3)
            r9.colspan(r2)
            r8.addContentRow()
        L1d1:
            org.fortheloss.framework.SizeWidget r9 = new org.fortheloss.framework.SizeWidget
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1137180672(0x43c80000, float:400.0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            r9.<init>(r3, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r8.addContent(r9)
            r9.colspan(r2)
            java.lang.String r9 = "applyChanges"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = r8.createTextButton(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.addButton(r9, r0)
            java.lang.String r9 = "importRegions"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = "..."
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r8.createTextButton(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.addButton(r0, r1)
            java.lang.String r0 = "exportRegions"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = r8.createTextButton(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r8.addButton(r9, r0)
            java.lang.String r9 = "cancel"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = r8.createTextButton(r9)
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.addButton(r9, r0)
            return
    }

    public void setRegionsText(java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "\n"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replace(r0, r1)
            java.lang.String r0 = "]"
            java.lang.String r1 = "]\n"
            java.lang.String r3 = r3.replace(r0, r1)
            if (r4 == 0) goto L14
            r2.mOriginalText = r3
        L14:
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r4 = r2.mTextArea
            r4.setText(r3)
            return
    }
}
