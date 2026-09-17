package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class LagDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _cullingCheckbox;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _filtersCheckbox;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _onionSkinCheckbox;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _thumbnailsCheckbox;





    /* renamed from: -$$Nest$monCullingClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m522$$Nest$monCullingClick(org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog r0) {
            r0.onCullingClick()
            return
    }

    /* renamed from: -$$Nest$monFiltersClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m523$$Nest$monFiltersClick(org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog r0) {
            r0.onFiltersClick()
            return
    }

    /* renamed from: -$$Nest$monOnionSkinClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m524$$Nest$monOnionSkinClick(org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog r0) {
            r0.onOnionSkinClick()
            return
    }

    /* renamed from: -$$Nest$monThumbnailClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m525$$Nest$monThumbnailClick(org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog r0) {
            r0.onThumbnailClick()
            return
    }

    public LagDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void onCullingClick() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._cullingCheckbox
            boolean r0 = r0.isChecked()
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.setStickNodeCullingEnabled(r0)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._cullingCheckbox
            boolean r1 = r1.isChecked()
            r0.enableCulling(r1)
            return
    }

    private void onFiltersClick() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._filtersCheckbox
            boolean r0 = r0.isChecked()
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r0 = r0 ^ 1
            r1.setRenderFiltersWhenDragging(r0)
            return
    }

    private void onOnionSkinClick() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._onionSkinCheckbox
            boolean r0 = r0.isChecked()
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r0 = r0 ^ 1
            r1.setDrawOnionSkinWhenMovingStage(r0)
            return
    }

    private void onThumbnailClick() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._thumbnailsCheckbox
            boolean r0 = r0.isChecked()
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.setRenderEveryThirdThumbnail(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r3) {
            r2 = this;
            super.dialogResult(r3)
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            java.lang.String r0 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r3 = r3.getPreferences(r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._cullingCheckbox
            boolean r0 = r0.isChecked()
            java.lang.String r1 = "lagCullingEnabled"
            r3.putBoolean(r1, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._onionSkinCheckbox
            boolean r0 = r0.isChecked()
            java.lang.String r1 = "lagOnionSkinEnabled"
            r3.putBoolean(r1, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._filtersCheckbox
            boolean r0 = r0.isChecked()
            java.lang.String r1 = "lagFiltersEnabled"
            r3.putBoolean(r1, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._thumbnailsCheckbox
            boolean r0 = r0.isChecked()
            java.lang.String r1 = "lagThirdThumbnailEnabled"
            r3.putBoolean(r1, r0)
            r3.flush()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._sessionDataRef = r0
            r1._animateToolsModuleRef = r0
            r1._cullingCheckbox = r0
            r1._onionSkinCheckbox = r0
            r1._filtersCheckbox = r0
            r1._thumbnailsCheckbox = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r8, org.fortheloss.sticknodes.data.SessionData r9, com.badlogic.gdx.graphics.g2d.TextureAtlas r10) {
            r7 = this;
            java.lang.String r0 = "lagTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r1, r1)
            r0.expand(r1, r1)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1109393408(0x42200000, float:40.0)
            float r0 = r0 * r1
            r7._sessionDataRef = r9
            r7._animateToolsModuleRef = r8
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "lagDialogInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r2.<init>(r3)
            r8.<init>(r1, r2)
            r1 = 1
            r8.setWrap(r1)
            r8.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.width(r2)
            r2 = 3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.colspan(r2)
            r8.padBottom(r0)
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "lagDialogOption1"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r8.<init>(r3, r4)
            r8.setWrap(r1)
            r8.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r3 = (float) r3
            r8.width(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r8)
            r7._cullingCheckbox = r8
            org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog$1 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog$1
            r3.<init>(r7)
            r8.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._cullingCheckbox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            r3 = 8
            r8.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "lagDialogOption1Description"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r8.<init>(r4, r5)
            r8.setWrap(r1)
            r8.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.expandX()
            r8.fillX()
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r8 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r4 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r10.findRegion(r4)
            r8.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.padTop(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.padBottom(r0)
            r8.fillX()
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "lagDialogOption2"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r8.<init>(r5, r6)
            r8.setWrap(r1)
            r8.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r5 = (float) r5
            r8.width(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r8)
            r7._onionSkinCheckbox = r8
            org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog$2 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog$2
            r5.<init>(r7)
            r8.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._onionSkinCheckbox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            r8.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "lagDialogOption2Description"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r8.<init>(r5, r6)
            r8.setWrap(r1)
            r8.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.expandX()
            r8.fillX()
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r8 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r10.findRegion(r4)
            r8.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.padTop(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.padBottom(r0)
            r8.fillX()
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "lagDialogOption3"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r8.<init>(r5, r6)
            r8.setWrap(r1)
            r8.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r5 = (float) r5
            r8.width(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r8)
            r7._filtersCheckbox = r8
            org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog$3 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog$3
            r5.<init>(r7)
            r8.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._filtersCheckbox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            r8.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "lagDialogOption3Description"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r8.<init>(r5, r6)
            r8.setWrap(r1)
            r8.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.expandX()
            r8.fillX()
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r8 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r10 = r10.findRegion(r4)
            r8.<init>(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.padTop(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.padBottom(r0)
            r8.fillX()
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "lagDialogOption4"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r8.<init>(r10, r0)
            r8.setWrap(r1)
            r8.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            int r10 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r10 = (float) r10
            r8.width(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r8)
            r7._thumbnailsCheckbox = r8
            org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog$4 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog$4
            r10.<init>(r7)
            r8.addListener(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._thumbnailsCheckbox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            r8.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "lagDialogOption4Description"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r8.<init>(r10, r0)
            r8.setWrap(r1)
            r8.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.expandX()
            r8.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._cullingCheckbox
            boolean r10 = r9.getStickNodeCullingEnabled()
            r8.setChecked(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._onionSkinCheckbox
            boolean r10 = r9.getDrawOnionSkinWhenMovingStage()
            r10 = r10 ^ r1
            r8.setChecked(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._filtersCheckbox
            boolean r10 = r9.getRenderFiltersWhenDragging()
            r10 = r10 ^ r1
            r8.setChecked(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._thumbnailsCheckbox
            boolean r9 = r9.getRenderEveryThirdThumbnail()
            r8.setChecked(r9)
            java.lang.String r8 = "okay"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7.createTextButton(r8)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r7.addButton(r8, r9)
            return
    }
}
