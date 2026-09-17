package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class CameraToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _autoMoveCameraButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _autoMoveCameraLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _centerCameraButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _copyCameraButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _copyWobbleButton;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _lockToCameraButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _modeButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _pasteCameraButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _pasteWobbleButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _widescreenButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _wobbleScaleButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _wobbleScaleLabel;
    private org.fortheloss.framework.LabelInputIncrementField mRotationField;
    private org.fortheloss.framework.CheckBoxInputIncrementField mWobbleRotationField;
    private org.fortheloss.framework.LabelInputIncrementField mWobbleSpeedField;
    private org.fortheloss.framework.CheckBoxInputIncrementField mWobbleXYField;
    private org.fortheloss.framework.LabelInputIncrementField mZoomField;
















    /* renamed from: -$$Nest$fget_wobbleScaleButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m865$$Nest$fget_wobbleScaleButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._wobbleScaleButton
            return r0
    }

    /* renamed from: -$$Nest$monAutoMoveCameraButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m866$$Nest$monAutoMoveCameraButtonClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0) {
            r0.onAutoMoveCameraButtonClick()
            return
    }

    /* renamed from: -$$Nest$monCenterCameraClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m867$$Nest$monCenterCameraClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0) {
            r0.onCenterCameraClick()
            return
    }

    /* renamed from: -$$Nest$monCopyCameraClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m868$$Nest$monCopyCameraClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0) {
            r0.onCopyCameraClick()
            return
    }

    /* renamed from: -$$Nest$monCopyCameraWobblePropertiesClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m869$$Nest$monCopyCameraWobblePropertiesClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0) {
            r0.onCopyCameraWobblePropertiesClick()
            return
    }

    /* renamed from: -$$Nest$monLockToCameraButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m870$$Nest$monLockToCameraButtonClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0) {
            r0.onLockToCameraButtonClick()
            return
    }

    /* renamed from: -$$Nest$monModeButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m871$$Nest$monModeButtonClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0) {
            r0.onModeButtonClick()
            return
    }

    /* renamed from: -$$Nest$monPasteCameraClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m872$$Nest$monPasteCameraClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0) {
            r0.onPasteCameraClick()
            return
    }

    /* renamed from: -$$Nest$monPasteCameraWobblePropertiesClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m873$$Nest$monPasteCameraWobblePropertiesClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0) {
            r0.onPasteCameraWobblePropertiesClick()
            return
    }

    /* renamed from: -$$Nest$monWidescreenButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m874$$Nest$monWidescreenButtonClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0) {
            r0.onWidescreenButtonClick()
            return
    }

    /* renamed from: -$$Nest$monWobbleScaleClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m875$$Nest$monWobbleScaleClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0, boolean r1) {
            r0.onWobbleScaleClick(r1)
            return
    }

    public CameraToolTable(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2, org.fortheloss.sticknodes.data.ProjectData r3, org.fortheloss.sticknodes.data.SessionData r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0._framesModuleRef = r2
            return
    }

    private void onAutoMoveCameraButtonClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.showAutoMoveCameraDialog()
            return
    }

    private void onCenterCameraClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.centerCamera()
            return
    }

    private void onCopyCameraClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.copyCamera()
            return
    }

    private void onCopyCameraWobblePropertiesClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.copyCameraWobbleProperties()
            return
    }

    private void onLockToCameraButtonClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.showLockToCameraDialog()
            return
    }

    private void onModeButtonClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.toggleCameraMode()
            return
    }

    private void onPasteCameraClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.pasteCamera()
            return
    }

    private void onPasteCameraWobblePropertiesClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.pasteCameraWobbleProperties()
            return
    }

    private void onWidescreenButtonClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._widescreenButton
            boolean r1 = r1.isChecked()
            r0.setCameraWidescreen(r1)
            return
    }

    private void onWobbleScaleClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.setCameraWobbleScale(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._framesModuleRef = r0
            r2._titleLabel = r0
            r2._copyCameraButton = r0
            r2._pasteCameraButton = r0
            r2._centerCameraButton = r0
            r2._autoMoveCameraLabel = r0
            r2._autoMoveCameraButton = r0
            r2._lockToCameraButton = r0
            r2._modeButton = r0
            r2._widescreenButton = r0
            r2._wobbleScaleLabel = r0
            r2._wobbleScaleButton = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mZoomField
            if (r1 != 0) goto L22
            r1.dispose()
            r2.mZoomField = r0
        L22:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mRotationField
            if (r1 != 0) goto L2b
            r1.dispose()
            r2.mRotationField = r0
        L2b:
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mWobbleXYField
            if (r1 != 0) goto L34
            r1.dispose()
            r2.mWobbleXYField = r0
        L34:
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mWobbleRotationField
            if (r1 != 0) goto L3d
            r1.dispose()
            r2.mWobbleRotationField = r0
        L3d:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mWobbleSpeedField
            if (r1 != 0) goto L46
            r1.dispose()
            r2.mWobbleSpeedField = r0
        L46:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r14, com.badlogic.gdx.scenes.scene2d.utils.Drawable r15) {
            r13 = this;
            super.initialize(r15)
            java.lang.String r15 = "cameraTools"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r15, r1, r0)
            r13._titleLabel = r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            r0 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            r15.fillX()
            r13.row()
            java.lang.String r15 = "copyCamera"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r15, r2)
            r13._copyCameraButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$1 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$1
            r2.<init>(r13)
            r15.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = r13._copyCameraButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            r2 = 16
            r15.align(r2)
            java.lang.String r15 = "pasteCamera"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r15, r3)
            r13._pasteCameraButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$2 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$2
            r3.<init>(r13)
            r15.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = r13._pasteCameraButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            r3 = 8
            r15.align(r3)
            r13.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r4 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r14.findRegion(r4)
            r15.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.padTop(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.padBottom(r5)
            r15.fillX()
            r13.row()
            org.fortheloss.framework.LabelInputIncrementField r15 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r5 = r13.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r5.getContext()
            java.lang.String r5 = "cameraZoom"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r8 = "1.00"
            r9 = 4
            r10 = 1017370378(0x3ca3d70a, float:0.02)
            r11 = 1084227584(0x40a00000, float:5.0)
            r12 = 1
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.mZoomField = r15
            r15.setHighFidelity(r1)
            org.fortheloss.framework.LabelInputIncrementField r15 = r13.mZoomField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$3 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$3
            r5.<init>(r13)
            r15.setFieldListener(r5)
            org.fortheloss.framework.LabelInputIncrementField r15 = r13.mZoomField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            r15.fillX()
            r13.row()
            org.fortheloss.framework.LabelInputIncrementField r15 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r5 = r13.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r5.getContext()
            java.lang.String r5 = "cameraRotation"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r8 = "0.00"
            r9 = 6
            r10 = 0
            r11 = 1135837184(0x43b38000, float:359.0)
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.mRotationField = r15
            r15.setIsDegreesField(r1)
            org.fortheloss.framework.LabelInputIncrementField r15 = r13.mRotationField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$4 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$4
            r5.<init>(r13)
            r15.setFieldListener(r5)
            org.fortheloss.framework.LabelInputIncrementField r15 = r13.mRotationField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            r15.fillX()
            r13.row()
            java.lang.String r15 = "centerCamera"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r15, r5)
            r13._centerCameraButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$5 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$5
            r5.<init>(r13)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = r13._centerCameraButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            r15.colspan(r0)
            r13.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r14.findRegion(r4)
            r15.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.padTop(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.padBottom(r5)
            r15.fillX()
            r13.row()
            java.lang.String r15 = "autoCameraToolTitle1"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r5.<init>(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r15, r1, r5)
            r13._autoMoveCameraLabel = r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            r15.fillX()
            r13.row()
            java.lang.String r15 = "autoCameraButton"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getAutoCameraButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r15, r5)
            r13._autoMoveCameraButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$6 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$6
            r5.<init>(r13)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r15 = r13._autoMoveCameraButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            r15.colspan(r0)
            r13.row()
            java.lang.String r15 = "lockStickfigureToCamera"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCameraStickfigureLockButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r15, r5)
            r13._lockToCameraButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$7 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$7
            r5.<init>(r13)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r15 = r13._lockToCameraButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r5 = r13._lockToCameraButton
            float r5 = r5.getWidth()
            r15.maxWidth(r5)
            r13.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r14.findRegion(r4)
            r15.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.padTop(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.padBottom(r5)
            r15.fillX()
            r13.row()
            java.lang.String r15 = "widescreenEffect"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r15, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            r15.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r15)
            r13._widescreenButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$8 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$8
            r5.<init>(r13)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r15 = r13._widescreenButton
            r13.add(r15)
            r13.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            java.lang.String r5 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r5, r15)
            r13._modeButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$9 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$9
            r5.<init>(r13)
            r15.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r15 = r13._modeButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r13.add(r15)
            r15.colspan(r0)
            r13.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r14.findRegion(r4)
            r15.<init>(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
            int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r15 = (float) r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.padTop(r15)
            int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r15 = (float) r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.padBottom(r15)
            r14.fillX()
            r13.row()
            org.fortheloss.framework.CheckBoxInputIncrementField r14 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r15 = r13.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r15.getContext()
            java.lang.String r15 = "wobbleXY"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.String r7 = "8"
            r8 = 3
            r9 = 0
            r10 = 1120403456(0x42c80000, float:100.0)
            r11 = 0
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r13.mWobbleXYField = r14
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$10 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$10
            r15.<init>(r13)
            r14.setFieldListener(r15)
            org.fortheloss.framework.CheckBoxInputIncrementField r14 = r13.mWobbleXYField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
            r14.fillX()
            r13.row()
            org.fortheloss.framework.CheckBoxInputIncrementField r14 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r15 = r13.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r15.getContext()
            java.lang.String r15 = "wobbleRotation"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.String r7 = "0.50"
            r8 = 6
            r10 = 1127481344(0x43340000, float:180.0)
            r11 = 1
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r13.mWobbleRotationField = r14
            r14.setHighFidelity(r1)
            org.fortheloss.framework.CheckBoxInputIncrementField r14 = r13.mWobbleRotationField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$11 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$11
            r15.<init>(r13)
            r14.setFieldListener(r15)
            org.fortheloss.framework.CheckBoxInputIncrementField r14 = r13.mWobbleRotationField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
            r14.fillX()
            r13.row()
            org.fortheloss.framework.LabelInputIncrementField r14 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r15 = r13.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r15.getContext()
            java.lang.String r15 = "wobbleSpeed"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.String r7 = "3.00"
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1112014848(0x42480000, float:50.0)
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r13.mWobbleSpeedField = r14
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$12 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$12
            r15.<init>(r13)
            r14.setFieldListener(r15)
            org.fortheloss.framework.LabelInputIncrementField r14 = r13.mWobbleSpeedField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
            r14.fillX()
            r13.row()
            java.lang.String r14 = "wobbleScale"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r1)
            r13._wobbleScaleLabel = r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.add(r14)
            r14.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r14)
            r13._wobbleScaleButton = r14
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$13 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$13
            r15.<init>(r13)
            r14.addListener(r15)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r14 = r13._wobbleScaleButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.add(r14)
            r14.align(r1)
            r13.row()
            java.lang.String r14 = "copyWobble"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r14, r15)
            r13._copyWobbleButton = r14
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$14 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$14
            r15.<init>(r13)
            r14.addListener(r15)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = r13._copyWobbleButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.add(r14)
            r14.align(r2)
            java.lang.String r14 = "pasteWobble"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r14, r15)
            r13._pasteWobbleButton = r14
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$15 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable$15
            r15.<init>(r13)
            r14.addListener(r15)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = r13._pasteWobbleButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.add(r14)
            r14.align(r3)
            r13.row()
            com.badlogic.gdx.scenes.scene2d.ui.Widget r14 = new com.badlogic.gdx.scenes.scene2d.ui.Widget
            r14.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1143930880(0x442f0000, float:700.0)
            float r15 = r15 * r0
            r14.height(r15)
            r13.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r9 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r9.mSessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r9._copyCameraButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r9._copyCameraButton
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.setColor(r3, r3, r3, r3)
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L2d3
            boolean r4 = r0.isAutoCamera()
            r5 = 1
            if (r4 != 0) goto L5b
            org.fortheloss.framework.LabelInputIncrementField r4 = r9.mZoomField
            r4.enable()
            org.fortheloss.framework.LabelInputIncrementField r4 = r9.mRotationField
            r4.enable()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r9._centerCameraButton
            r4.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r9._centerCameraButton
            r4.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r9._autoMoveCameraLabel
            java.lang.String r6 = "autoCameraToolTitle1"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            r4.setText(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r9._autoMoveCameraLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = r4.getStyle()
            com.badlogic.gdx.graphics.Color r4 = r4.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            com.badlogic.gdx.graphics.Color r6 = r6.fontColor
            r4.set(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r9._autoMoveCameraButton
            r4.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r9._autoMoveCameraButton
            r2.setColor(r3, r3, r3, r3)
            goto Le8
        L5b:
            org.fortheloss.framework.LabelInputIncrementField r2 = r9.mZoomField
            r2.disable()
            org.fortheloss.framework.LabelInputIncrementField r2 = r9.mRotationField
            r2.disable()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r9._centerCameraButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r2.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r9._centerCameraButton
            r2.setColor(r3, r3, r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r9._framesModuleRef
            org.fortheloss.sticknodes.data.FrameData r4 = r0.getFrameData()
            int r2 = r2.getFrameIndex(r4)
        L7b:
            if (r2 < 0) goto L8f
            int r2 = r2 + (-1)
            org.fortheloss.sticknodes.data.ProjectData r4 = r9._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r4.frames
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.data.FrameData r4 = (org.fortheloss.sticknodes.data.FrameData) r4
            boolean r4 = r4.isAutoCameraOriginFrame()
            if (r4 == 0) goto L7b
        L8f:
            org.fortheloss.sticknodes.animationscreen.modules.Module r4 = r9.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r4.getContext()
            org.fortheloss.sticknodes.data.SessionData r4 = r4.getSessionData()
            boolean r4 = r4.getNerdModeEnabled()
            r6 = 0
            if (r4 != 0) goto Lb7
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r9._autoMoveCameraLabel
            java.lang.Object[] r7 = new java.lang.Object[r5]
            int r2 = r2 + r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r6] = r2
            java.lang.String r2 = "autoCameraToolTitle2Fix"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2, r7)
            r4.setText(r2)
            goto Lcb
        Lb7:
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r9._autoMoveCameraLabel
            java.lang.Object[] r7 = new java.lang.Object[r5]
            int r2 = r2 + r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r6] = r2
            java.lang.String r2 = "autoCameraToolTitle2FixMini"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2, r7)
            r4.setText(r2)
        Lcb:
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r9._autoMoveCameraLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r2.getStyle()
            com.badlogic.gdx.graphics.Color r2 = r2.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r4 = r4.fontColor
            r2.set(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r9._autoMoveCameraButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r2.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r9._autoMoveCameraButton
            r2.setColor(r3, r3, r3, r1)
        Le8:
            org.fortheloss.framework.LabelInputIncrementField r2 = r9.mZoomField
            float r4 = r0.getCameraScale()
            r2.setValue(r4)
            org.fortheloss.framework.LabelInputIncrementField r2 = r9.mRotationField
            float r4 = r0.getCameraRotationDeg()
            r2.setValue(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r9._widescreenButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r2.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r9._widescreenButton
            r2.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r9._widescreenButton
            boolean r6 = r0.isWidescreen()
            r2.setChecked(r6)
            byte r2 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            java.lang.String r6 = ": "
            java.lang.String r7 = "cameraMode"
            if (r2 != 0) goto L13c
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r9._modeButton
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r7 = "cameraModeA"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            r2.setText(r5)
            goto L241
        L13c:
            byte r2 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            if (r2 != r5) goto L165
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r9._modeButton
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r7 = "cameraModeB"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            r2.setText(r5)
            goto L241
        L165:
            byte r2 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            r5 = 2
            if (r2 != r5) goto L18f
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r9._modeButton
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r7 = "cameraModeC"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            r2.setText(r5)
            goto L241
        L18f:
            byte r2 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            r5 = 3
            java.lang.String r8 = "cameraModeD"
            if (r2 != r5) goto L1be
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r9._modeButton
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            r8.append(r7)
            java.lang.String r5 = " 1"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r2.setText(r5)
            goto L241
        L1be:
            byte r2 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            r5 = 4
            if (r2 != r5) goto L1ea
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r9._modeButton
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            r8.append(r7)
            java.lang.String r5 = " 2"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r2.setText(r5)
            goto L241
        L1ea:
            byte r2 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            r5 = 5
            if (r2 != r5) goto L216
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r9._modeButton
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            r8.append(r7)
            java.lang.String r5 = " 3"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r2.setText(r5)
            goto L241
        L216:
            byte r2 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            r5 = 6
            if (r2 != r5) goto L241
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r9._modeButton
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            r8.append(r7)
            java.lang.String r5 = " 4"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r2.setText(r5)
        L241:
            org.fortheloss.framework.CheckBoxInputIncrementField r2 = r9.mWobbleXYField
            r2.enable()
            org.fortheloss.framework.CheckBoxInputIncrementField r2 = r9.mWobbleRotationField
            r2.enable()
            org.fortheloss.framework.CheckBoxInputIncrementField r2 = r9.mWobbleXYField
            int r5 = r0.getWobbleXYIntensity()
            float r5 = (float) r5
            boolean r6 = r0.isWobblingXY()
            r2.setValue(r5, r6)
            org.fortheloss.framework.CheckBoxInputIncrementField r2 = r9.mWobbleRotationField
            float r5 = r0.getWobbleRotationIntensity()
            boolean r6 = r0.isWobblingRotation()
            r2.setValue(r5, r6)
            org.fortheloss.framework.LabelInputIncrementField r2 = r9.mWobbleSpeedField
            float r5 = r0.getWobbleSpeed()
            r2.setValue(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r9._wobbleScaleButton
            boolean r5 = r0.isWobbleScaleEnabled()
            r2.setChecked(r5)
            boolean r0 = r0.isWobbling()
            if (r0 == 0) goto L293
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mWobbleSpeedField
            r0.enable()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9._wobbleScaleButton
            r0.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9._wobbleScaleButton
            r0.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r9._wobbleScaleLabel
            r0.setColor(r3, r3, r3, r3)
            goto L2a9
        L293:
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mWobbleSpeedField
            r0.disable()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9._wobbleScaleButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9._wobbleScaleButton
            r0.setColor(r3, r3, r3, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r9._wobbleScaleLabel
            r0.setColor(r3, r3, r3, r1)
        L2a9:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._copyWobbleButton
            r0.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._copyWobbleButton
            r0.setColor(r3, r3, r3, r3)
            org.fortheloss.sticknodes.data.SessionData r0 = r9.mSessionDataRef
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = r0.getCopiedFrameCameraProperties()
            if (r0 == 0) goto L2c6
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._pasteWobbleButton
            r0.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._pasteWobbleButton
            r0.setColor(r3, r3, r3, r3)
            goto L32f
        L2c6:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._pasteWobbleButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._pasteWobbleButton
            r0.setColor(r3, r3, r3, r1)
            goto L32f
        L2d3:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._copyCameraButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._copyCameraButton
            r0.setColor(r3, r3, r3, r1)
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mZoomField
            r0.disable()
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mRotationField
            r0.disable()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._centerCameraButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._centerCameraButton
            r0.setColor(r3, r3, r3, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9._widescreenButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9._widescreenButton
            r0.setColor(r3, r3, r3, r1)
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r9.mWobbleXYField
            r0.disable()
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r9.mWobbleRotationField
            r0.disable()
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mWobbleSpeedField
            r0.disable()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9._wobbleScaleButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9._wobbleScaleButton
            r0.setColor(r3, r3, r3, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r9._wobbleScaleLabel
            r0.setColor(r3, r3, r3, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._copyWobbleButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._copyWobbleButton
            r0.setColor(r3, r3, r3, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._pasteWobbleButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._pasteWobbleButton
            r0.setColor(r3, r3, r3, r1)
        L32f:
            org.fortheloss.sticknodes.data.SessionData r0 = r9.mSessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCopiedFrameCamera()
            if (r0 != 0) goto L344
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._pasteCameraButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._pasteCameraButton
            r0.setColor(r3, r3, r3, r1)
            goto L350
        L344:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._pasteCameraButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9._pasteCameraButton
            r0.setColor(r3, r3, r3, r3)
        L350:
            return
    }
}
