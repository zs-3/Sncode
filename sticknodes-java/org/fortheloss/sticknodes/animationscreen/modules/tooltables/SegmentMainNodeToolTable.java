package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class SegmentMainNodeToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private org.fortheloss.framework.DegreesLabelInputIncrementField _dragLockAngleField;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> _dragLockAngleFieldCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _dragLockCheckbox;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _dragLockLabel;
    private org.fortheloss.framework.ColorPicker _polyfillColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _polyfillColorTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _polyfillColorTableCellRef;
    private org.fortheloss.framework.LabelInputIncrementField _polyfillCurvePrecisionField;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _usePolyfillColorButton;







    /* renamed from: -$$Nest$fget_dragLockCheckbox, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1113$$Nest$fget_dragLockCheckbox(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._dragLockCheckbox
            return r0
    }

    /* renamed from: -$$Nest$fget_polyfillColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m1114$$Nest$fget_polyfillColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._polyfillColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_usePolyfillColorButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1115$$Nest$fget_usePolyfillColorButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._usePolyfillColorButton
            return r0
    }

    public SegmentMainNodeToolTable(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._titleLabel = r0
            r2._usePolyfillColorButton = r0
            org.fortheloss.framework.ColorPicker r1 = r2._polyfillColorPicker
            if (r1 == 0) goto Le
            r1.dispose()
            r2._polyfillColorPicker = r0
        Le:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2._polyfillCurvePrecisionField
            if (r1 == 0) goto L17
            r1.dispose()
            r2._polyfillCurvePrecisionField = r0
        L17:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._polyfillColorTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._polyfillColorTable = r0
            r2._polyfillColorTableCellRef = r0
            r2._dragLockLabel = r0
            r2._dragLockCheckbox = r0
            r2._dragLockAngleFieldCellRef = r0
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r2._dragLockAngleField
            if (r1 == 0) goto L2f
            r1.dispose()
            r2._dragLockAngleField = r0
        L2f:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r13, com.badlogic.gdx.graphics.g2d.TextureAtlas r14, com.badlogic.gdx.scenes.scene2d.utils.Drawable r15) {
            r12 = this;
            super.initialize(r15)
            java.lang.String r15 = "segmentTools"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r15, r1, r0)
            r12._titleLabel = r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            r0 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            r15.fillX()
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r15.<init>()
            r12._polyfillColorTable = r15
            r2 = 30
            r12.registerWidget(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._polyfillColorTable
            r2 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r15.pad(r2)
            r15.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._polyfillColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.space(r2)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.spaceRight(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.spaceBottom(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.pad(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.expandX()
            r15.uniformX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._polyfillColorTable
            r3 = 0
            r15.setRound(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._polyfillColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.spaceRight(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.padRight(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            r12._polyfillColorTableCellRef = r15
            r12.row()
            java.lang.String r15 = "usePolyfillColor"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r15, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r12._polyfillColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r3.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r0)
            r15.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._polyfillColorTable
            r15.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r15)
            r12._usePolyfillColorButton = r15
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable$1 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable$1
            r3.<init>(r12)
            r15.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r12._polyfillColorTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r12._usePolyfillColorButton
            r15.add(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable$2 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable$2
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r3 = r12.mAnimationBasedModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r7 = r3.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r3 * r4
            org.fortheloss.sticknodes.data.SessionData r3 = r12.mSessionDataRef
            boolean r11 = r3.getIsLeftHandMode()
            r5 = r15
            r6 = r12
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12._polyfillColorPicker = r15
            r14 = 1065353216(0x3f800000, float:1.0)
            r15.setColor(r14, r14, r14, r14)
            org.fortheloss.framework.ColorPicker r14 = r12._polyfillColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable$3 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable$3
            r15.<init>(r12)
            r14.addListener(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r12._polyfillColorTable
            org.fortheloss.framework.ColorPicker r15 = r12._polyfillColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.add(r15)
            int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r15 = (float) r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.width(r15)
            int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r15 = (float) r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.height(r15)
            r15 = 8
            r14.align(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r12._polyfillColorTable
            r14.row()
            org.fortheloss.framework.LabelInputIncrementField r14 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r15 = r12.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r15.getContext()
            java.lang.String r15 = "polyfillCurvePrecision"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r15)
            java.lang.String r15 = "\n(0 - 5)"
            r3.append(r15)
            java.lang.String r5 = r3.toString()
            java.lang.String r6 = "1"
            r7 = 1
            r8 = 0
            r9 = 1084227584(0x40a00000, float:5.0)
            r10 = 0
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r12._polyfillCurvePrecisionField = r14
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable$4 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable$4
            r15.<init>(r12)
            r14.setFieldListener(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r12._polyfillColorTable
            org.fortheloss.framework.LabelInputIncrementField r15 = r12._polyfillCurvePrecisionField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
            r14.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r12._polyfillColorTable
            r14.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r12._polyfillColorTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r3 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r13 = r13.findRegion(r3)
            r15.<init>(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r14.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.colspan(r0)
            int r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r14 = (float) r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.padTop(r14)
            int r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r14 = (float) r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.padBottom(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.fillX()
            r13.spaceRight(r2)
            java.lang.String r13 = "dragLock"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r13, r1)
            r12._dragLockLabel = r13
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r13)
            r13.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r13)
            r12._dragLockCheckbox = r13
            r14 = 62
            r12.registerWidget(r13, r14)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = r12._dragLockCheckbox
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable$5 r14 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable$5
            r14.<init>(r12)
            r13.addListener(r14)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = r12._dragLockCheckbox
            r12.add(r13)
            r12.row()
            org.fortheloss.framework.DegreesLabelInputIncrementField r13 = new org.fortheloss.framework.DegreesLabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r14 = r12.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r14.getContext()
            java.lang.String r14 = "dragLockAngle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.String r4 = "0"
            r5 = 3
            r6 = 0
            r7 = 1135837184(0x43b38000, float:359.0)
            r8 = 0
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12._dragLockAngleField = r13
            r14 = 63
            r12.registerWidget(r13, r14)
            org.fortheloss.framework.DegreesLabelInputIncrementField r13 = r12._dragLockAngleField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable$6 r14 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable$6
            r14.<init>(r12)
            r13.setFieldListener(r14)
            org.fortheloss.framework.DegreesLabelInputIncrementField r13 = r12._dragLockAngleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.colspan(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.fillX()
            r12._dragLockAngleFieldCellRef = r13
            r12.row()
            r12.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4.mSessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r1 == 0) goto La8
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._dragLockCheckbox
            boolean r2 = r0.getIsDragLocked()
            r1.setChecked(r2)
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r4._dragLockAngleField
            float r2 = r0.getDragLockAngle()
            r1.setValue(r2)
            boolean r1 = r0.getIsAngleLocked()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L3f
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r4._dragLockLabel
            r3 = 1056964608(0x3f000000, float:0.5)
            r1.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._dragLockCheckbox
            r1.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._dragLockCheckbox
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r2)
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r4._dragLockAngleField
            r1.disable()
            goto L55
        L3f:
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r4._dragLockLabel
            r1.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._dragLockCheckbox
            r1.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._dragLockCheckbox
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r1.setTouchable(r2)
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r4._dragLockAngleField
            r1.enable()
        L55:
            boolean r1 = r0.getIsDragLocked()
            if (r1 == 0) goto L6b
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r1 = r4._dragLockAngleFieldCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            if (r1 != 0) goto L70
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r1 = r4._dragLockAngleFieldCellRef
            org.fortheloss.framework.DegreesLabelInputIncrementField r2 = r4._dragLockAngleField
            r1.setActor(r2)
            goto L70
        L6b:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r1 = r4._dragLockAngleFieldCellRef
            r1.clearActor()
        L70:
            boolean r1 = r0.isPolyfillAnchor()
            if (r1 == 0) goto La3
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._usePolyfillColorButton
            boolean r2 = r0.isUsingPolyfillColor()
            r1.setChecked(r2)
            org.fortheloss.framework.ColorPicker r1 = r4._polyfillColorPicker
            com.badlogic.gdx.graphics.Color r2 = r0.getPolyfillColor()
            r3 = 0
            r1.setColor(r2, r3)
            org.fortheloss.framework.LabelInputIncrementField r1 = r4._polyfillCurvePrecisionField
            int r0 = r0.getSegmentCurvePrecision()
            float r0 = (float) r0
            r1.setValue(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r4._polyfillColorTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
            if (r0 != 0) goto La8
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r4._polyfillColorTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._polyfillColorTable
            r0.setActor(r1)
            goto La8
        La3:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r4._polyfillColorTableCellRef
            r0.clearActor()
        La8:
            return
    }
}
