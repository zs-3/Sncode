package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class StickfigureCreationToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _centerStickfigureButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _flipXButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _flipYButton;
    private org.fortheloss.framework.ColorPicker _stickfigureColorPicker;
    private org.fortheloss.framework.DegreesLabelInputIncrementField mAngleField;
    private org.fortheloss.framework.LabelInputIncrementField mScaleField;








    /* renamed from: -$$Nest$fget_stickfigureColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m1197$$Nest$fget_stickfigureColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._stickfigureColorPicker
            return r0
    }

    /* renamed from: -$$Nest$monCenterStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1198$$Nest$monCenterStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable r0) {
            r0.onCenterStickfigureClick()
            return
    }

    /* renamed from: -$$Nest$monFlipXClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1199$$Nest$monFlipXClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable r0) {
            r0.onFlipXClick()
            return
    }

    /* renamed from: -$$Nest$monFlipYClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1200$$Nest$monFlipYClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable r0) {
            r0.onFlipYClick()
            return
    }

    /* renamed from: -$$Nest$monStickfigureColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1201$$Nest$monStickfigureColorSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable r0) {
            r0.onStickfigureColorSelect()
            return
    }

    public StickfigureCreationToolTable(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void onCenterStickfigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.centerStickfigure()
            return
    }

    private void onFlipXClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.flipStickfigureX()
            return
    }

    private void onFlipYClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.flipStickfigureY()
            return
    }

    private void onStickfigureColorSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._creationToolsModuleRef
            org.fortheloss.framework.ColorPicker r1 = r2._stickfigureColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setStickfigureColor(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._flipXButton = r0
            r2._flipYButton = r0
            r2._centerStickfigureButton = r0
            org.fortheloss.framework.ColorPicker r1 = r2._stickfigureColorPicker
            if (r1 == 0) goto L10
            r1.dispose()
            r2._stickfigureColorPicker = r0
        L10:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mScaleField
            if (r1 == 0) goto L19
            r1.dispose()
            r2.mScaleField = r0
        L19:
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r2.mAngleField
            if (r1 == 0) goto L22
            r1.dispose()
            r2.mAngleField = r0
        L22:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r12, com.badlogic.gdx.graphics.g2d.TextureAtlas r13, com.badlogic.gdx.scenes.scene2d.utils.Drawable r14) {
            r11 = this;
            super.initialize(r14)
            java.lang.String r14 = "stickfigureTools"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r1, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            r0 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
            r14.fillX()
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFlipFigureX()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r14)
            r11._flipXButton = r14
            r2 = 10
            r11.registerWidget(r14, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r14 = r11._flipXButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$1 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$1
            r2.<init>(r11)
            r14.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r14 = r11._flipXButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            r2 = 16
            r14.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFlipFigureY()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r14)
            r11._flipYButton = r14
            r2 = 11
            r11.registerWidget(r14, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r14 = r11._flipYButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$2 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$2
            r2.<init>(r11)
            r14.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r14 = r11._flipYButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            r2 = 8
            r14.align(r2)
            r11.row()
            java.lang.String r14 = "centerStickfigure"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r14, r3)
            r11._centerStickfigureButton = r14
            r3 = 12
            r11.registerWidget(r14, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = r11._centerStickfigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$3 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$3
            r3.<init>(r11)
            r14.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = r11._centerStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            r14.colspan(r0)
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r3 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r12.findRegion(r3)
            r14.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.colspan(r0)
            int r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r14 = (float) r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.padTop(r14)
            int r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r14 = (float) r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.padBottom(r14)
            r12.fillX()
            r11.row()
            java.lang.String r12 = "stickfigureColor"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r12, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.add(r12)
            r12.fillX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$4 r12 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$4
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r14 = r11._creationToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = r14.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1092616192(0x41200000, float:10.0)
            float r8 = r14 * r1
            org.fortheloss.sticknodes.data.SessionData r14 = r11.mSessionDataRef
            boolean r9 = r14.getIsLeftHandMode()
            r3 = r12
            r4 = r11
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11._stickfigureColorPicker = r12
            r13 = 13
            r11.registerWidget(r12, r13)
            org.fortheloss.framework.ColorPicker r12 = r11._stickfigureColorPicker
            r13 = 1065353216(0x3f800000, float:1.0)
            r12.setColor(r13, r13, r13, r13)
            org.fortheloss.framework.ColorPicker r12 = r11._stickfigureColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$5 r13 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$5
            r13.<init>(r11)
            r12.addListener(r13)
            org.fortheloss.framework.ColorPicker r12 = r11._stickfigureColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.add(r12)
            int r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r13 = (float) r13
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.width(r13)
            int r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r13 = (float) r13
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.height(r13)
            r12.align(r2)
            r11.row()
            org.fortheloss.framework.LabelInputIncrementField r12 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r13 = r11.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r13.getContext()
            java.lang.String r13 = "stickfigureScale"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r13)
            java.lang.String r6 = "1.00"
            r7 = 5
            r8 = 953267991(0x38d1b717, float:1.0E-4)
            r9 = 1101004800(0x41a00000, float:20.0)
            r10 = 1
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.mScaleField = r12
            r13 = 14
            r11.registerWidget(r12, r13)
            org.fortheloss.framework.LabelInputIncrementField r12 = r11.mScaleField
            r13 = 0
            r12.setIncrementType(r13)
            org.fortheloss.framework.LabelInputIncrementField r12 = r11.mScaleField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$6 r13 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$6
            r13.<init>(r11)
            r12.setFieldListener(r13)
            org.fortheloss.framework.LabelInputIncrementField r12 = r11.mScaleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.colspan(r0)
            r12.fillX()
            r11.row()
            org.fortheloss.framework.DegreesLabelInputIncrementField r12 = new org.fortheloss.framework.DegreesLabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r13 = r11.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r13.getContext()
            java.lang.String r13 = "stickfigureAngle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r13)
            java.lang.String r4 = "0"
            r5 = 3
            r6 = 0
            r7 = 1135837184(0x43b38000, float:359.0)
            r8 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r11.mAngleField = r12
            r13 = 15
            r11.registerWidget(r12, r13)
            org.fortheloss.framework.DegreesLabelInputIncrementField r12 = r11.mAngleField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$7 r13 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable$7
            r13.<init>(r11)
            r12.setFieldListener(r13)
            org.fortheloss.framework.DegreesLabelInputIncrementField r12 = r11.mAngleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.colspan(r0)
            r12.fillX()
            r11.row()
            r11.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L15
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            r4.setColor(r1, r1, r1, r0)
            goto L39
        L15:
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r4.setTouchable(r2)
            r4.setColor(r1, r1, r1, r1)
            org.fortheloss.framework.ColorPicker r1 = r4._stickfigureColorPicker
            com.badlogic.gdx.graphics.Color r2 = r0.getColor()
            r3 = 0
            r1.setColor(r2, r3)
            org.fortheloss.framework.LabelInputIncrementField r1 = r4.mScaleField
            float r2 = r0.getScale()
            r1.setValue(r2)
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r4.mAngleField
            float r0 = r0.getRotation()
            r1.setValue(r0)
        L39:
            return
    }
}
