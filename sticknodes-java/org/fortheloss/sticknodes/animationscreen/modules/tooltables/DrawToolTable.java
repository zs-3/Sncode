package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class DrawToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _circleButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _ellipseButton;
    private java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Image> _icons;
    private java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> _labels;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _noneButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _polyfillButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _polygonButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _roundedSegmentButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _segmentButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _trapezoidButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _triangleButton;










    /* renamed from: -$$Nest$monDrawToolSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m926$$Nest$monDrawToolSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r0, int r1) {
            r0.onDrawToolSelect(r1)
            return
    }

    public DrawToolTable(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private java.lang.String boundChars(java.lang.String r2, int r3) {
            r1 = this;
            int r0 = r2.length()
            if (r0 <= r3) goto Lb
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r3)
        Lb:
            return r2
    }

    private void onDrawToolSelect(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.setDrawTool(r2)
            return
    }

    public void disable() {
            r4 = this;
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r0 = r4._labels
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = (com.badlogic.gdx.scenes.scene2d.ui.Label) r1
            r1.setColor(r3, r3, r3, r2)
            goto L6
        L1a:
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Image> r0 = r4._icons
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = (com.badlogic.gdx.scenes.scene2d.ui.Image) r1
            r1.setColor(r3, r3, r3, r2)
            goto L20
        L30:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._noneButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._noneButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._segmentButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._segmentButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._roundedSegmentButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._roundedSegmentButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._circleButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._circleButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._ellipseButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._ellipseButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._triangleButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._triangleButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._trapezoidButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._trapezoidButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._polygonButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._polygonButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._polyfillButton
            r0.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._polyfillButton
            r0.setTouchable(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._noneButton = r0
            r1._segmentButton = r0
            r1._roundedSegmentButton = r0
            r1._circleButton = r0
            r1._ellipseButton = r0
            r1._triangleButton = r0
            r1._trapezoidButton = r0
            r1._polygonButton = r0
            r1._polyfillButton = r0
            r1._labels = r0
            r1._icons = r0
            super.dispose()
            return
    }

    public void enable() {
            r3 = this;
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r0 = r3._labels
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = (com.badlogic.gdx.scenes.scene2d.ui.Label) r1
            r1.setColor(r2, r2, r2, r2)
            goto L6
        L18:
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Image> r0 = r3._icons
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = (com.badlogic.gdx.scenes.scene2d.ui.Image) r1
            r1.setColor(r2, r2, r2, r2)
            goto L1e
        L2e:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._noneButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._noneButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._segmentButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._segmentButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._roundedSegmentButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._roundedSegmentButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._circleButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._circleButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._ellipseButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._ellipseButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._triangleButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._triangleButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._trapezoidButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._trapezoidButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._polygonButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._polygonButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._polyfillButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._polyfillButton
            r0.setTouchable(r1)
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r5, com.badlogic.gdx.scenes.scene2d.utils.Drawable r6) {
            r4 = this;
            super.initialize(r6)
            java.lang.String r6 = "drawTools"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r1, r0)
            r4._titleLabel = r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.add(r6)
            r0 = 9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.colspan(r0)
            r6.fillX()
            r4.row()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4._labels = r6
            java.lang.String r6 = "none"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            r2 = 17
            java.lang.String r6 = r4.boundChars(r6, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r1)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r4._labels
            r3.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.add(r6)
            r6.fillX()
            java.lang.String r6 = "segment"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r6 = r4.boundChars(r6, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r1)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r4._labels
            r3.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.add(r6)
            r6.fillX()
            java.lang.String r6 = "roundedSegment"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r6 = r4.boundChars(r6, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r1)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r4._labels
            r3.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.add(r6)
            r6.fillX()
            java.lang.String r6 = "circle"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r6 = r4.boundChars(r6, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r1)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r4._labels
            r3.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.add(r6)
            r6.fillX()
            java.lang.String r6 = "ellipse"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r6 = r4.boundChars(r6, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r1)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r4._labels
            r3.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.add(r6)
            r6.fillX()
            java.lang.String r6 = "triangle"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r6 = r4.boundChars(r6, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r1)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r4._labels
            r3.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.add(r6)
            r6.fillX()
            java.lang.String r6 = "trapezoid"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r6 = r4.boundChars(r6, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r1)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r4._labels
            r3.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.add(r6)
            r6.fillX()
            java.lang.String r6 = "polygon"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r6 = r4.boundChars(r6, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r1)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r4._labels
            r3.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.add(r6)
            r6.fillX()
            java.lang.String r6 = "polyfill"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r6 = r4.boundChars(r6, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r1)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Label> r2 = r4._labels
            r2.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.add(r6)
            r6.fillX()
            r4.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r4._noneButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$1 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$1
            r2.<init>(r4)
            r6.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r4._noneButton
            r4.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r4._segmentButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$2 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$2
            r2.<init>(r4)
            r6.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r4._segmentButton
            r4.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r4._roundedSegmentButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$3 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$3
            r2.<init>(r4)
            r6.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r4._roundedSegmentButton
            r4.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r4._circleButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$4 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$4
            r2.<init>(r4)
            r6.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r4._circleButton
            r4.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r4._ellipseButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$5 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$5
            r2.<init>(r4)
            r6.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r4._ellipseButton
            r4.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r4._triangleButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$6 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$6
            r2.<init>(r4)
            r6.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r4._triangleButton
            r4.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r4._trapezoidButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$7 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$7
            r2.<init>(r4)
            r6.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r4._trapezoidButton
            r4.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r4._polygonButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$8 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$8
            r2.<init>(r4)
            r6.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r4._polygonButton
            r4.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r4._polyfillButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$9 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable$9
            r2.<init>(r4)
            r6.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r4._polyfillButton
            r4.add(r6)
            r4.row()
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r6.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Button[] r0 = new com.badlogic.gdx.scenes.scene2d.ui.Button[r0]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r4._noneButton
            r3 = 0
            r0[r3] = r2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r4._segmentButton
            r0[r1] = r2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._roundedSegmentButton
            r2 = 2
            r0[r2] = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._circleButton
            r2 = 3
            r0[r2] = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._ellipseButton
            r2 = 4
            r0[r2] = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._triangleButton
            r2 = 5
            r0[r2] = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._trapezoidButton
            r2 = 6
            r0[r2] = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._polygonButton
            r2 = 7
            r0[r2] = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._polyfillButton
            r2 = 8
            r0[r2] = r1
            r6.add(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4._icons = r6
            com.badlogic.gdx.scenes.scene2d.ui.Widget r6 = new com.badlogic.gdx.scenes.scene2d.ui.Widget
            r6.<init>()
            r4.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r0 = "draw_icon_segment"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r5.findRegion(r0)
            r6.<init>(r0)
            r4.add(r6)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Image> r0 = r4._icons
            r0.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r0 = "draw_icon_rounded_segment"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r5.findRegion(r0)
            r6.<init>(r0)
            r4.add(r6)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Image> r0 = r4._icons
            r0.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r0 = "draw_icon_circle"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r5.findRegion(r0)
            r6.<init>(r0)
            r4.add(r6)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Image> r0 = r4._icons
            r0.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r0 = "draw_icon_ellipse"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r5.findRegion(r0)
            r6.<init>(r0)
            r4.add(r6)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Image> r0 = r4._icons
            r0.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r0 = "draw_icon_triangle"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r5.findRegion(r0)
            r6.<init>(r0)
            r4.add(r6)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Image> r0 = r4._icons
            r0.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r0 = "draw_icon_trapezoid"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r5.findRegion(r0)
            r6.<init>(r0)
            r4.add(r6)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Image> r0 = r4._icons
            r0.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r0 = "draw_icon_polygon"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r5.findRegion(r0)
            r6.<init>(r0)
            r4.add(r6)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Image> r0 = r4._icons
            r0.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r0 = "draw_icon_polyfill"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r5.findRegion(r0)
            r6.<init>(r5)
            r4.add(r6)
            java.util.ArrayList<com.badlogic.gdx.scenes.scene2d.ui.Image> r5 = r4._icons
            r5.add(r6)
            r4.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._creationToolsModuleRef
            int r0 = r0.getDrawTool()
            r1 = 1
            if (r0 != 0) goto Lf
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._noneButton
            r0.setChecked(r1)
            goto L52
        Lf:
            if (r0 != r1) goto L17
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._segmentButton
            r0.setChecked(r1)
            goto L52
        L17:
            r2 = 2
            if (r0 != r2) goto L20
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._roundedSegmentButton
            r0.setChecked(r1)
            goto L52
        L20:
            r2 = 3
            if (r0 != r2) goto L29
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._circleButton
            r0.setChecked(r1)
            goto L52
        L29:
            r2 = 4
            if (r0 != r2) goto L32
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._ellipseButton
            r0.setChecked(r1)
            goto L52
        L32:
            r2 = 5
            if (r0 != r2) goto L3b
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._triangleButton
            r0.setChecked(r1)
            goto L52
        L3b:
            r2 = 6
            if (r0 != r2) goto L44
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._trapezoidButton
            r0.setChecked(r1)
            goto L52
        L44:
            r2 = 7
            if (r0 != r2) goto L4d
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._polygonButton
            r0.setChecked(r1)
            goto L52
        L4d:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._polyfillButton
            r0.setChecked(r1)
        L52:
            return
    }
}
