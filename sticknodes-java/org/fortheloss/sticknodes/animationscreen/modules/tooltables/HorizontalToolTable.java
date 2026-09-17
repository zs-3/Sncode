package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class HorizontalToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.Table mContentTable;
    private int mCurrentIndex;
    private float mHeight;
    private float mHeightGoal;
    private float mHeightStart;
    private float mHeightTimer;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mLeftButton;
    private float mOffsetX;
    private float mOffsetXGoal;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mRightButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table[] mTables;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mTitleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mTitleTable;
    private java.lang.String[] mTitles;
    private float mWidth;




    /* renamed from: -$$Nest$fgetmOffsetX, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m980$$Nest$fgetmOffsetX(org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable r0) {
            float r0 = r0.mOffsetX
            return r0
    }

    /* renamed from: -$$Nest$monLeftClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m981$$Nest$monLeftClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable r0) {
            r0.onLeftClick()
            return
    }

    /* renamed from: -$$Nest$monRightClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m982$$Nest$monRightClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable r0) {
            r0.onRightClick()
            return
    }

    public HorizontalToolTable(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mCurrentIndex = r1
            r1 = 0
            r0.mWidth = r1
            r0.mHeight = r1
            r0.mHeightStart = r1
            r0.mHeightGoal = r1
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r0.mHeightTimer = r2
            r0.mOffsetX = r1
            r0.mOffsetXGoal = r1
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
            if (r3 == 0) goto L38
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
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r9.mAnimationBasedModuleRef
            r0.setNeedsToBeDrawn()
        L38:
            float r0 = r9.mHeightTimer
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto L6c
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
            if (r10 < 0) goto L5d
            float r10 = r9.mHeightGoal
            r9.mHeight = r10
        L5d:
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9.mContentTable
            float r0 = r9.mOffsetX
            r10.setX(r0)
            r9.invalidateHierarchy()
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r10 = r9.mAnimationBasedModuleRef
            r10.setNeedsToBeDrawn()
        L6c:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mLeftButton = r0
            r1.mRightButton = r0
            r1.mTables = r0
            r1.mTitles = r0
            r1.mTitleTable = r0
            r1.mContentTable = r0
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

    public void initialize(float r6, com.badlogic.gdx.graphics.g2d.TextureAtlas r7, com.badlogic.gdx.scenes.scene2d.utils.Drawable r8) {
            r5 = this;
            super.initialize(r8)
            r7 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r5.pad(r7)
            r0 = 2
            r8.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r5.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.space(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.pad(r7)
            r8.align(r0)
            r8 = 1
            r5.setClip(r8)
            r5.mWidth = r6
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r5.mTitleTable = r0
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1101004800(0x41a00000, float:20.0)
            float r1 = r1 * r2
            r0.pad(r1, r7, r7, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r5.mTitleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r7)
            r0.space(r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable$1 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable$1
            r0.<init>(r5)
            r5.mContentTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r7)
            r1 = 8
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r5.mContentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r7)
            r0.space(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r5.mContentTable
            r0.setTransform(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r5.mTitleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.add(r0)
            r0.width(r6)
            r5.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r5.mContentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.width(r6)
            r6.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuLeftStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r6)
            r5.mLeftButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable$2 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable$2
            r0.<init>(r5)
            r6.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuRightStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r6)
            r5.mRightButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable$3 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable$3
            r0.<init>(r5)
            r6.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            java.lang.String r0 = ""
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r8, r6)
            r5.mTitleLabel = r6
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r5.mTitleTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r5.mLeftButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r0)
            int r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r0 = (float) r0
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r0 * r2
            float r0 = r0 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.pad(r7, r4, r7, r0)
            r6.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r5.mTitleTable
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r5.mTitleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.fillX()
            r6.align(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r5.mTitleTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r8 = r5.mRightButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r8)
            int r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r8 = (float) r8
            float r8 = r8 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r8)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r8 * r2
            float r8 = r8 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.pad(r7, r0, r7, r8)
            r7 = 16
            r6.align(r7)
            return
    }

    public void setTables(com.badlogic.gdx.scenes.scene2d.ui.Table[] r3, java.lang.String[] r4) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table[] r0 = r2.mTables
            if (r0 == 0) goto L5
            return
        L5:
            r2.mTables = r3
            r2.mTitles = r4
            r4 = 0
            r2.mCurrentIndex = r4
            r3 = r3[r4]
            r3.validate()
            com.badlogic.gdx.scenes.scene2d.ui.Table[] r3 = r2.mTables
            r3 = r3[r4]
            float r3 = r3.getPrefHeight()
            r2.mHeight = r3
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2.mTitleLabel
            java.lang.String[] r0 = r2.mTitles
            int r1 = r2.mCurrentIndex
            r0 = r0[r1]
            r3.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table[] r3 = r2.mTables
            int r3 = r3.length
        L29:
            if (r4 >= r3) goto L42
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r2.mContentTable
            com.badlogic.gdx.scenes.scene2d.ui.Table[] r1 = r2.mTables
            r1 = r1[r4]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            float r1 = r2.mWidth
            r0.width(r1)
            int r4 = r4 + 1
            goto L29
        L42:
            r2.invalidateHierarchy()
            r2.validate()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r0 = this;
            return
    }
}
