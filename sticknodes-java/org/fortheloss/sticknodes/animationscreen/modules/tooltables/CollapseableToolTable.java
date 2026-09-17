package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class CollapseableToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.Image mCollapseIcon;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mContentTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Image mExpandIcon;
    private float mHeight;
    private float mHeightStart;
    private float mHeightTimer;
    private com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup mHorGroup;
    private boolean mIsCollapsed;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mTitleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mTitleTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable mToolTable;
    private float mWidth;



    /* renamed from: -$$Nest$fgetmIsCollapsed, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m876$$Nest$fgetmIsCollapsed(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0) {
            boolean r0 = r0.mIsCollapsed
            return r0
    }

    /* renamed from: -$$Nest$fgetmToolTable, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable m877$$Nest$fgetmToolTable(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r0 = r0.mToolTable
            return r0
    }

    /* renamed from: -$$Nest$fputmHeight, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m878$$Nest$fputmHeight(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0, float r1) {
            r0.mHeight = r1
            return
    }

    /* renamed from: -$$Nest$mtoggleCollapse, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m879$$Nest$mtoggleCollapse(org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0) {
            r0.toggleCollapse()
            return
    }

    public CollapseableToolTable(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mIsCollapsed = r1
            r1 = 0
            r0.mWidth = r1
            r0.mHeight = r1
            r0.mHeightStart = r1
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r0.mHeightTimer = r1
            return
    }

    private void toggleCollapse() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r0 = r3.mToolTable
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r3.mIsCollapsed
            r0 = r0 ^ 1
            r3.mIsCollapsed = r0
            r1 = 0
            if (r0 == 0) goto L1f
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r3.mHorGroup
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getChild(r1)
            r0.remove()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r3.mHorGroup
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r3.mExpandIcon
            r0.addActorAt(r1, r2)
            goto L2f
        L1f:
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r3.mHorGroup
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getChild(r1)
            r0.remove()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r3.mHorGroup
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r3.mCollapseIcon
            r0.addActorAt(r1, r2)
        L2f:
            float r0 = r3.mHeight
            r3.mHeightStart = r0
            r0 = 0
            r3.mHeightTimer = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r5) {
            r4 = this;
            super.act(r5)
            float r0 = r4.mHeightTimer
            r1 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3c
            boolean r0 = r4.mIsCollapsed
            if (r0 == 0) goto L11
            r0 = 0
            goto L17
        L11:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r0 = r4.mToolTable
            float r0 = r0.getPrefHeight()
        L17:
            float r2 = r4.mHeightTimer
            float r2 = r2 + r5
            r4.mHeightTimer = r2
            com.badlogic.gdx.math.Interpolation r5 = com.badlogic.gdx.math.Interpolation.sine
            float r3 = r4.mHeightStart
            float r2 = r2 / r1
            float r5 = r5.apply(r3, r0, r2)
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            r4.mHeight = r5
            float r5 = r4.mHeightTimer
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 < 0) goto L34
            r4.mHeight = r0
        L34:
            r4.invalidateHierarchy()
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r5 = r4.mAnimationBasedModuleRef
            r5.setNeedsToBeDrawn()
        L3c:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mToolTable = r0
            r1.mTitleTable = r0
            r1.mTitleLabel = r0
            r1.mExpandIcon = r0
            r1.mCollapseIcon = r0
            r1.mContentTable = r0
            r1.mHorGroup = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public float getHeight() {
            r3 = this;
            super.getHeight()
            boolean r0 = r3.mIsCollapsed
            if (r0 == 0) goto Le
            r0 = 1101004800(0x41a00000, float:20.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r0
            goto Lf
        Le:
            r1 = 0
        Lf:
            float r0 = r3.mHeight
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r3.mTitleTable
            float r2 = r2.getHeight()
            float r0 = r0 + r2
            float r0 = r0 + r1
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
            r3 = this;
            super.getMinHeight()
            boolean r0 = r3.mIsCollapsed
            if (r0 == 0) goto Le
            r0 = 1101004800(0x41a00000, float:20.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r0
            goto Lf
        Le:
            r1 = 0
        Lf:
            float r0 = r3.mHeight
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r3.mTitleTable
            float r2 = r2.getMinHeight()
            float r0 = r0 + r2
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
            r3 = this;
            super.getPrefHeight()
            boolean r0 = r3.mIsCollapsed
            if (r0 == 0) goto Le
            r0 = 1101004800(0x41a00000, float:20.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r0
            goto Lf
        Le:
            r1 = 0
        Lf:
            float r0 = r3.mHeight
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r3.mTitleTable
            float r2 = r2.getPrefHeight()
            float r0 = r0 + r2
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public com.badlogic.gdx.scenes.scene2d.Actor getWidgetWithId(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r0 = r1.mToolTable
            if (r0 == 0) goto L9
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r0.getWidgetWithId(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public float getWidth() {
            r1 = this;
            super.getWidth()
            float r0 = r1.mWidth
            return r0
    }

    public void initialize(float r5, com.badlogic.gdx.graphics.g2d.TextureAtlas r6, com.badlogic.gdx.scenes.scene2d.utils.Drawable r7) {
            r4 = this;
            super.initialize(r7)
            r7 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4.pad(r7)
            r1 = 2
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r7)
            r0.align(r1)
            r0 = 1
            r4.setClip(r0)
            r4.mWidth = r5
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r4.mTitleTable = r1
            r1.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4.mTitleTable
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1101004800(0x41a00000, float:20.0)
            float r2 = r2 * r3
            r1.pad(r2, r7, r7, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4.mTitleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r7)
            r1.space(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4.mTitleTable
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4.mTitleTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable$1 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable$1
            r2.<init>(r4)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r4.mContentTable = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r1.pad(r7)
            r2 = 8
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4.mContentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r7)
            r1.space(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r4.mContentTable
            r7.setTransform(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r4.mTitleTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r4.add(r7)
            r7.width(r5)
            r4.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r4.mContentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r4.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r7.width(r5)
            r5.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            java.lang.String r7 = ""
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r7, r2, r5)
            r4.mTitleLabel = r5
            r7 = 0
            r5.setWrap(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r7 = "g_table_collapse_icon"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r5.<init>(r7)
            r4.mCollapseIcon = r5
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r7 = "g_table_expand_icon"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r6.findRegion(r7)
            r5.<init>(r6)
            r4.mExpandIcon = r5
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = r4.mCollapseIcon
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r6 = r6.fontColor
            r5.setColor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = r4.mExpandIcon
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r6 = r6.fontColor
            r5.setColor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = r4.mExpandIcon
            r5.setOrigin(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = r4.mExpandIcon
            r6 = 1119092736(0x42b40000, float:90.0)
            r5.setRotation(r6)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r5.<init>()
            r4.mHorGroup = r5
            r5.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4.mHorGroup
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r7 = 1092616192(0x41200000, float:10.0)
            float r6 = r6 * r7
            r5.space(r6)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4.mHorGroup
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = r4.mCollapseIcon
            r5.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4.mHorGroup
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r4.mTitleLabel
            r5.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r4.mTitleTable
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r6 = r4.mHorGroup
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.fillX()
            r5.align(r0)
            return
    }

    public void setToolTable(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r2, java.lang.String r3) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r0 = r1.mToolTable
            if (r0 == 0) goto L5
            return
        L5:
            r1.mToolTable = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable$2 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable$2
            r0.<init>(r1)
            r2.addListener(r0)
            r0 = 0
            r1.mIsCollapsed = r0
            r2.validate()
            float r0 = r2.getPrefHeight()
            r1.mHeight = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1.mTitleLabel
            r0.setText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r1.mContentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.add(r2)
            r3 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.align(r3)
            float r3 = r1.mWidth
            r2.width(r3)
            r1.invalidateHierarchy()
            r1.validate()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r0 = r1.mToolTable
            if (r0 == 0) goto L13
            r0.update()
            boolean r0 = r1.mIsCollapsed
            if (r0 != 0) goto L13
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r0 = r1.mToolTable
            float r0 = r0.getPrefHeight()
            r1.mHeight = r0
        L13:
            return
    }
}
