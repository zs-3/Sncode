package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class HorizontalSubTable extends com.badlogic.gdx.scenes.scene2d.ui.Table implements com.badlogic.gdx.utils.Disposable {
    private static com.badlogic.gdx.graphics.Color _tempColor;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mContentTable;
    private int mCurrentIndex;
    private float mHeight;
    private float mHeightGoal;
    private float mHeightStart;
    private float mHeightTimer;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mLeftButton;
    private float mOffsetX;
    private float mOffsetXGoal;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable mParentTableRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mRightButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table[] mTables;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mTitleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mTitleTable;
    private java.lang.String[] mTitles;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Widget> mWidgetCell;
    private com.badlogic.gdx.scenes.scene2d.ui.Widget[] mWidgets;
    private float mWidth;




    /* renamed from: -$$Nest$fgetmOffsetX, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m977$$Nest$fgetmOffsetX(org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r0) {
            float r0 = r0.mOffsetX
            return r0
    }

    /* renamed from: -$$Nest$monLeftClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m978$$Nest$monLeftClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r0) {
            r0.onLeftClick()
            return
    }

    /* renamed from: -$$Nest$monRightClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m979$$Nest$monRightClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r0) {
            r0.onRightClick()
            return
    }

    static {
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable._tempColor = r0
            return
    }

    public HorizontalSubTable(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mCurrentIndex = r0
            r0 = 0
            r2.mWidth = r0
            r2.mHeight = r0
            r2.mHeightStart = r0
            r2.mHeightGoal = r0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.mHeightTimer = r1
            r2.mOffsetX = r0
            r2.mOffsetXGoal = r0
            r2.mParentTableRef = r3
            return
    }

    private void onLeftClick() {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table[] r0 = r4.mTables
            int r1 = r0.length
            if (r1 > 0) goto L6
            return
        L6:
            int r1 = r4.mCurrentIndex
            int r1 = r1 + (-1)
            r4.mCurrentIndex = r1
            if (r1 >= 0) goto L13
            int r1 = r0.length
            int r1 = r1 + (-1)
            r4.mCurrentIndex = r1
        L13:
            int r1 = r4.mCurrentIndex
            float r2 = (float) r1
            float r3 = r4.mWidth
            float r3 = -r3
            float r2 = r2 * r3
            r4.mOffsetXGoal = r2
            r0 = r0[r1]
            float r0 = r0.getPrefHeight()
            r4.mHeightGoal = r0
            float r0 = r4.mHeight
            r4.mHeightStart = r0
            r0 = 0
            r4.mHeightTimer = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4.mTitleLabel
            java.lang.String[] r1 = r4.mTitles
            int r2 = r4.mCurrentIndex
            r1 = r1[r2]
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Widget> r0 = r4.mWidgetCell
            com.badlogic.gdx.scenes.scene2d.ui.Widget[] r1 = r4.mWidgets
            if (r1 == 0) goto L42
            int r2 = r4.mCurrentIndex
            r1 = r1[r2]
            goto L43
        L42:
            r1 = 0
        L43:
            r0.setActor(r1)
            return
    }

    private void onRightClick() {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table[] r0 = r4.mTables
            int r1 = r0.length
            if (r1 > 0) goto L6
            return
        L6:
            int r1 = r4.mCurrentIndex
            int r1 = r1 + 1
            r4.mCurrentIndex = r1
            int r2 = r0.length
            if (r1 < r2) goto L12
            r1 = 0
            r4.mCurrentIndex = r1
        L12:
            int r1 = r4.mCurrentIndex
            float r2 = (float) r1
            float r3 = r4.mWidth
            float r3 = -r3
            float r2 = r2 * r3
            r4.mOffsetXGoal = r2
            r0 = r0[r1]
            float r0 = r0.getPrefHeight()
            r4.mHeightGoal = r0
            float r0 = r4.mHeight
            r4.mHeightStart = r0
            r0 = 0
            r4.mHeightTimer = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4.mTitleLabel
            java.lang.String[] r1 = r4.mTitles
            int r2 = r4.mCurrentIndex
            r1 = r1[r2]
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Widget> r0 = r4.mWidgetCell
            com.badlogic.gdx.scenes.scene2d.ui.Widget[] r1 = r4.mWidgets
            if (r1 == 0) goto L41
            int r2 = r4.mCurrentIndex
            r1 = r1[r2]
            goto L42
        L41:
            r1 = 0
        L42:
            r0.setActor(r1)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r10) {
            r9 = this;
            super.act(r10)
            float r0 = r9.mOffsetX
            float r1 = r9.mOffsetXGoal
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 == 0) goto L3c
            double r3 = (double) r0
            float r1 = r1 - r0
            double r0 = (double) r1
            double r5 = (double) r10
            r7 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r5 = java.lang.Math.pow(r5, r7)
            double r0 = r0 * r5
            double r3 = r3 + r0
            float r0 = (float) r3
            r9.mOffsetX = r0
            float r1 = r9.mOffsetXGoal
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2c
            float r0 = r9.mOffsetXGoal
            r9.mOffsetX = r0
        L2c:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mContentTable
            float r1 = r9.mOffsetX
            r0.setX(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r0 = r9.mParentTableRef
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = r0.getModule()
            r0.setNeedsToBeDrawn()
        L3c:
            float r0 = r9.mHeightTimer
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto L74
            float r0 = r0 + r10
            r9.mHeightTimer = r0
            com.badlogic.gdx.math.Interpolation$ElasticOut r10 = com.badlogic.gdx.math.Interpolation.elasticOut
            float r1 = r9.mHeightStart
            float r3 = r9.mHeightGoal
            float r0 = r0 / r2
            float r10 = r10.apply(r1, r3, r0)
            int r10 = java.lang.Math.round(r10)
            float r10 = (float) r10
            r9.mHeight = r10
            float r10 = r9.mHeightTimer
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 < 0) goto L61
            float r10 = r9.mHeightGoal
            r9.mHeight = r10
        L61:
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9.mContentTable
            float r0 = r9.mOffsetX
            r10.setX(r0)
            r9.invalidateHierarchy()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r10 = r9.mParentTableRef
            org.fortheloss.sticknodes.animationscreen.modules.Module r10 = r10.getModule()
            r10.setNeedsToBeDrawn()
        L74:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mParentTableRef = r0
            r1.mLeftButton = r0
            r1.mRightButton = r0
            r1.mTables = r0
            r1.mTitles = r0
            r1.mWidgets = r0
            r1.mWidgetCell = r0
            r1.mTitleTable = r0
            r1.mContentTable = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table
    protected void drawBackground(com.badlogic.gdx.graphics.g2d.Batch r3, float r4, float r5, float r6) {
            r2 = this;
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable.tableColor
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable._tempColor
            com.badlogic.gdx.graphics.Color r1 = r2.getColor()
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable.tableColor
            r2.setColor(r0)
            super.drawBackground(r3, r4, r5, r6)
            com.badlogic.gdx.graphics.Color r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable._tempColor
            r2.setColor(r3)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public float getHeight() {
            r2 = this;
            super.getHeight()
            float r0 = r2.mHeight
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mTitleTable
            float r1 = r1.getHeight()
            float r0 = r0 + r1
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
            r2 = this;
            super.getMinHeight()
            float r0 = r2.mHeight
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mTitleTable
            float r1 = r1.getMinHeight()
            float r0 = r0 + r1
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
            r1 = this;
            super.getMinWidth()
            float r0 = r1.mWidth
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r2 = this;
            super.getPrefHeight()
            float r0 = r2.mHeight
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mTitleTable
            float r1 = r1.getPrefHeight()
            float r0 = r0 + r1
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r1 = this;
            super.getPrefWidth()
            float r0 = r1.mWidth
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public float getWidth() {
            r1 = this;
            super.getWidth()
            float r0 = r1.mWidth
            return r0
    }

    public void initialize(float r7, com.badlogic.gdx.graphics.g2d.TextureAtlas r8, com.badlogic.gdx.scenes.scene2d.utils.Drawable r9) {
            r6 = this;
            r8 = 0
            r6.setRound(r8)
            r6.setBackground(r9)
            r9 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r6.pad(r9)
            r1 = 2
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r6.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.uniformX()
            r0 = 1
            r6.setClip(r0)
            r6.mWidth = r7
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r6.mTitleTable = r1
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1101004800(0x41a00000, float:20.0)
            float r2 = r2 * r3
            r1.pad(r2, r9, r9, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r6.mTitleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r9)
            r1.space(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable$1
            r1.<init>(r6)
            r6.mContentTable = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r1.pad(r9)
            r2 = 8
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r6.mContentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r9)
            r1.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r6.mContentTable
            r1.setTransform(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r6.mTitleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            r1.width(r7)
            r6.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r6.mContentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r1.width(r7)
            r7.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuLeftStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r7)
            r6.mLeftButton = r7
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable$2
            r1.<init>(r6)
            r7.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuRightStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r7)
            r6.mRightButton = r7
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable$3 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable$3
            r1.<init>(r6)
            r7.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            java.lang.String r1 = ""
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r0, r7)
            r6.mTitleLabel = r7
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r8, r8)
            r0.expand(r8, r8)
            com.badlogic.gdx.scenes.scene2d.ui.Widget r8 = new com.badlogic.gdx.scenes.scene2d.ui.Widget
            r8.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.add(r8)
            r0 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.align(r0)
            r6.mWidgetCell = r8
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = r6.mTitleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.fillX()
            r8.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r6.mTitleTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r6.mLeftButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.add(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r1 = (float) r1
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.width(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r1 * r3
            float r1 = r1 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.pad(r9, r5, r9, r1)
            r8.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r6.mTitleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r8.add(r7)
            int r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r8 = (float) r8
            r1 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r1
            r7.width(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r6.mTitleTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r8 = r6.mRightButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.add(r8)
            int r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r8 = (float) r8
            float r8 = r8 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.width(r8)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r8 * r3
            float r8 = r8 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.pad(r9, r1, r9, r8)
            r7.align(r0)
            return
    }

    public void setTables(com.badlogic.gdx.scenes.scene2d.ui.Table[] r2, java.lang.String[] r3, com.badlogic.gdx.scenes.scene2d.ui.Widget[] r4) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table[] r0 = r1.mTables
            if (r0 == 0) goto L5
            return
        L5:
            r1.mTables = r2
            r1.mTitles = r3
            r1.mWidgets = r4
            r3 = 0
            r1.mCurrentIndex = r3
            r2 = r2[r3]
            r2.validate()
            com.badlogic.gdx.scenes.scene2d.ui.Table[] r2 = r1.mTables
            r2 = r2[r3]
            float r2 = r2.getPrefHeight()
            r1.mHeight = r2
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1.mTitleLabel
            java.lang.String[] r4 = r1.mTitles
            int r0 = r1.mCurrentIndex
            r4 = r4[r0]
            r2.setText(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Widget> r2 = r1.mWidgetCell
            com.badlogic.gdx.scenes.scene2d.ui.Widget[] r4 = r1.mWidgets
            if (r4 == 0) goto L33
            int r0 = r1.mCurrentIndex
            r4 = r4[r0]
            goto L34
        L33:
            r4 = 0
        L34:
            r2.setActor(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table[] r2 = r1.mTables
            int r2 = r2.length
        L3a:
            if (r3 >= r2) goto L53
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r1.mContentTable
            com.badlogic.gdx.scenes.scene2d.ui.Table[] r0 = r1.mTables
            r0 = r0[r3]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r0)
            r0 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r0)
            float r0 = r1.mWidth
            r4.width(r0)
            int r3 = r3 + 1
            goto L3a
        L53:
            r1.invalidateHierarchy()
            r1.validate()
            return
    }
}
