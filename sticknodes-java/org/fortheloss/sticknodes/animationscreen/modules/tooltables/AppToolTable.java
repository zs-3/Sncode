package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class AppToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _appSettingsButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _getProButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _lagButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _newProjectButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _openProjectButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _rateButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _screenshotButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _screenshotButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _sendFileButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _websiteButton;











    /* renamed from: -$$Nest$monAppSettingsClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m857$$Nest$monAppSettingsClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable r0) {
            r0.onAppSettingsClick()
            return
    }

    /* renamed from: -$$Nest$monGetProClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m858$$Nest$monGetProClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable r0) {
            r0.onGetProClick()
            return
    }

    /* renamed from: -$$Nest$monNewProjectClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m859$$Nest$monNewProjectClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable r0) {
            r0.onNewProjectClick()
            return
    }

    /* renamed from: -$$Nest$monOpenProjectClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m860$$Nest$monOpenProjectClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable r0) {
            r0.onOpenProjectClick()
            return
    }

    /* renamed from: -$$Nest$monRateClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m861$$Nest$monRateClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable r0) {
            r0.onRateClick()
            return
    }

    /* renamed from: -$$Nest$monSendFileClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m862$$Nest$monSendFileClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable r0) {
            r0.onSendFileClick()
            return
    }

    /* renamed from: -$$Nest$monWebsiteClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m863$$Nest$monWebsiteClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable r0) {
            r0.onWebsiteClick()
            return
    }

    /* renamed from: -$$Nest$mshowLagDialog, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m864$$Nest$mshowLagDialog(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable r0) {
            r0.showLagDialog()
            return
    }

    public AppToolTable(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void onAppSettingsClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.showAppSettings()
            return
    }

    private void onGetProClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.getPro()
            return
    }

    private void onNewProjectClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.newProject()
            return
    }

    private void onOpenProjectClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.openProject()
            return
    }

    private void onRateClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.rateApp()
            return
    }

    private void onSendFileClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.sendFile()
            return
    }

    private void onWebsiteClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.goToWebsite()
            return
    }

    private void showLagDialog() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.showLagDialog()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._titleLabel = r0
            r1._newProjectButton = r0
            r1._openProjectButton = r0
            r1._getProButton = r0
            r1._rateButton = r0
            r1._websiteButton = r0
            r1._sendFileButton = r0
            r1._lagButton = r0
            r1._appSettingsButton = r0
            r1._screenshotButton = r0
            r1._screenshotButton2 = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r7, com.badlogic.gdx.scenes.scene2d.utils.Drawable r8) {
            r6 = this;
            super.initialize(r8)
            java.lang.String r7 = "appTools"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r0 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r7, r0, r8)
            r6._titleLabel = r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            r8 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.colspan(r8)
            r7.fillX()
            r6.row()
            org.fortheloss.framework.IPlatform r7 = org.fortheloss.sticknodes.App.platform
            boolean r7 = r7.isPro()
            if (r7 == 0) goto L2e
            java.lang.String r7 = "Stick Nodes Pro "
            goto L30
        L2e:
            java.lang.String r7 = "Stick Nodes "
        L30:
            boolean r1 = org.fortheloss.sticknodes.App.isParroted
            java.lang.String r2 = ""
            java.lang.String r3 = "..."
            if (r1 == 0) goto L3a
            r1 = r3
            goto L3b
        L3a:
            r1 = r2
        L3b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r7 = "4.2.5"
            r4.append(r7)
            r4.append(r1)
            java.lang.String r7 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r7, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.colspan(r8)
            r7.fillX()
            r6.row()
            java.lang.String r7 = "newProject"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r7, r0)
            r6._newProjectButton = r7
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$1 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$1
            r0.<init>(r6)
            r7.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6._newProjectButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            r0 = 16
            r7.align(r0)
            java.lang.String r7 = "openProject"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r7, r1)
            r6._openProjectButton = r7
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$2
            r1.<init>(r6)
            r7.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6._openProjectButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            r1 = 8
            r7.align(r1)
            r6.row()
            org.fortheloss.framework.IPlatform r7 = org.fortheloss.sticknodes.App.platform
            boolean r7 = r7.isPro()
            if (r7 != 0) goto Lee
            java.lang.String r7 = "getPro2"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeUrlProButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r7, r4)
            r6._getProButton = r7
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r7.getLabel()
            r7.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6._getProButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$3 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$3
            r4.<init>(r6)
            r7.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6._getProButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            r7.colspan(r8)
            r6.row()
        Lee:
            java.lang.String r7 = "rateSN2"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeUrlRateButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r7, r4)
            r6._rateButton = r7
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r7.getLabel()
            r7.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6._rateButton
            r4 = 1101004800(0x41a00000, float:20.0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            r7.padRight(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6._rateButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$4 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$4
            r4.<init>(r6)
            r7.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6._rateButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            r7.colspan(r8)
            r6.row()
            java.lang.String r7 = "visitWebsite2"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeUrlWebsiteButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r7, r4)
            r6._websiteButton = r7
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r7.getLabel()
            r7.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6._websiteButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$5 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$5
            r4.<init>(r6)
            r7.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6._websiteButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            r7.colspan(r8)
            r6.row()
            java.lang.String r7 = "sendFiles"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r3)
            java.lang.String r7 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeShareFilesStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r7, r3)
            r6._sendFileButton = r7
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$6 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$6
            r3.<init>(r6)
            r7.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6._sendFileButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            r7.colspan(r8)
            r6.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getAppSettingsButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r2, r7)
            r6._appSettingsButton = r7
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$7 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$7
            r2.<init>(r6)
            r7.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6._appSettingsButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            r7.colspan(r8)
            org.fortheloss.sticknodes.data.SessionData r7 = r6.mSessionDataRef
            boolean r7 = r7.getIsLeftHandMode()
            if (r7 == 0) goto L1cd
            r6.row()
            java.lang.String r7 = "lagTitle"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r7, r2)
            r6._lagButton = r7
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$8 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$8
            r2.<init>(r6)
            r7.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6._lagButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            r7.colspan(r8)
        L1cd:
            com.badlogic.gdx.Application r7 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r7 = r7.getType()
            com.badlogic.gdx.Application$ApplicationType r8 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r7 != r8) goto L214
            r6.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            java.lang.String r8 = "Screenshot stickfigures"
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r8, r7)
            r6._screenshotButton = r7
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$9 r8 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$9
            r8.<init>(r6)
            r7.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6._screenshotButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            r7.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            java.lang.String r8 = "Screenshot packs"
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r8, r7)
            r6._screenshotButton2 = r7
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$10 r8 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable$10
            r8.<init>(r6)
            r7.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6._screenshotButton2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            r7.align(r1)
        L214:
            r6.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r0 = this;
            return
    }
}
