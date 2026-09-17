package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class SpriteToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.Label _joinAnchorNameLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _joinAnchorTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _joinAnchorTableCell;
    private org.fortheloss.framework.DegreesLabelInputIncrementField mAngleField;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mCenterButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mCopyButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton mDeleteButton;
    private org.fortheloss.framework.RepeatingImageButton mFlipXButton;
    private org.fortheloss.framework.RepeatingImageButton mFlipYButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton mJoinButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> mJoinButtonsCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mKeepDuringTweenButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mLayerPositionLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mLockButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mNextFigureButton;
    private org.fortheloss.framework.LabelInputIncrementField mOriginXField;
    private org.fortheloss.framework.LabelInputIncrementField mOriginYField;
    private org.fortheloss.sticknodes.TextButtonLongPress mPasteButton;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu mPasteMenu;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mPreviousFigureButton;
    private org.fortheloss.framework.RepeatingImageButton mPushBackButton;
    private org.fortheloss.framework.RepeatingImageButton mPushForwardButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mScaleLinkedButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton mScaleModeButton;
    private org.fortheloss.framework.LabelInputIncrementField mScaleXField;
    private org.fortheloss.framework.LabelInputIncrementField mScaleYField;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mShowInOnionSkinButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mSmartStretchButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mSpriteNameLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mStateDisabledLabel;
    private org.fortheloss.framework.LabelInputIncrementField mStateField;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> mStateLabelCell;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mStateTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mStateTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mTitleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mTweenModeButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton mUnjoinButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mUnlockFromCameraButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.TextButton> mUnlockFromCameraCellRef;



































    /* renamed from: -$$Nest$fgetmFlipXButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.RepeatingImageButton m1189$$Nest$fgetmFlipXButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0) {
            org.fortheloss.framework.RepeatingImageButton r0 = r0.mFlipXButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmFlipYButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.RepeatingImageButton m1190$$Nest$fgetmFlipYButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0) {
            org.fortheloss.framework.RepeatingImageButton r0 = r0.mFlipYButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmKeepDuringTweenButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1191$$Nest$fgetmKeepDuringTweenButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mKeepDuringTweenButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmPasteMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu m1192$$Nest$fgetmPasteMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0 = r0.mPasteMenu
            return r0
    }

    /* renamed from: -$$Nest$fgetmScaleLinkedButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1193$$Nest$fgetmScaleLinkedButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mScaleLinkedButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmScaleModeButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton m1194$$Nest$fgetmScaleModeButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r0.mScaleModeButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmShowInOnionSkinButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextButton m1195$$Nest$fgetmShowInOnionSkinButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r0.mShowInOnionSkinButton
            return r0
    }

    /* renamed from: -$$Nest$monGoToJoinAnchorClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1196$$Nest$monGoToJoinAnchorClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0) {
            r0.onGoToJoinAnchorClick()
            return
    }

    public SpriteToolTable(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void onGoToJoinAnchorClick() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._joinAnchorNameLabel
            java.lang.Object r0 = r0.getUserObject()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r2._joinAnchorNameLabel
            java.lang.Object r1 = r1.getUserObject()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.selectFigure(r1)
        L17:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2.mTitleLabel = r0
            r2.mSpriteNameLabel = r0
            r2.mStateTable = r0
            r2.mStateTableCell = r0
            r2.mStateDisabledLabel = r0
            r2.mStateLabelCell = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mStateField
            if (r1 == 0) goto L16
            r1.dispose()
            r2.mStateField = r0
        L16:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mScaleXField
            if (r1 == 0) goto L1f
            r1.dispose()
            r2.mScaleXField = r0
        L1f:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mScaleYField
            if (r1 == 0) goto L28
            r1.dispose()
            r2.mScaleYField = r0
        L28:
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r2.mAngleField
            if (r1 == 0) goto L31
            r1.dispose()
            r2.mAngleField = r0
        L31:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mOriginXField
            if (r1 == 0) goto L3a
            r1.dispose()
            r2.mOriginXField = r0
        L3a:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mOriginYField
            if (r1 == 0) goto L43
            r1.dispose()
            r2.mOriginYField = r0
        L43:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r1 = r2.mPasteMenu
            if (r1 == 0) goto L4c
            r1.dispose()
            r2.mPasteMenu = r0
        L4c:
            r2.mScaleLinkedButton = r0
            r2.mScaleModeButton = r0
            r2.mDeleteButton = r0
            r2.mPreviousFigureButton = r0
            r2.mNextFigureButton = r0
            r2.mCopyButton = r0
            r2.mPasteButton = r0
            r2.mFlipXButton = r0
            r2.mFlipYButton = r0
            r2.mPushBackButton = r0
            r2.mPushForwardButton = r0
            r2.mLayerPositionLabel = r0
            r2.mCenterButton = r0
            r2.mJoinButton = r0
            r2.mUnjoinButton = r0
            r2.mJoinButtonsCellRef = r0
            r2.mSmartStretchButton = r0
            r2.mLockButton = r0
            r2.mShowInOnionSkinButton = r0
            r2.mKeepDuringTweenButton = r0
            r2.mTweenModeButton = r0
            r2._joinAnchorTable = r0
            r2._joinAnchorTableCell = r0
            r2._joinAnchorNameLabel = r0
            r2.mUnlockFromCameraButton = r0
            r2.mUnlockFromCameraCellRef = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r28, com.badlogic.gdx.graphics.g2d.TextureAtlas r29, com.badlogic.gdx.scenes.scene2d.utils.Drawable r30) {
            r27 = this;
            r9 = r27
            r10 = r28
            r0 = r30
            super.initialize(r0)
            java.lang.String r0 = "spriteToolsTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r11 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r11, r1)
            r9.mTitleLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r12 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            r0.fillX()
            r27.row()
            java.lang.String r13 = ""
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r13, r11)
            r9.mSpriteNameLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            r0.fillX()
            r27.row()
            java.lang.String r0 = "deleteSprite"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeDeleteButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r9.mDeleteButton = r0
            r1 = 130(0x82, float:1.82E-43)
            r9.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r9.mDeleteButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$1
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r9.mDeleteButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r0.colspan(r12)
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuLeftStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r9.mPreviousFigureButton = r0
            r1 = 131(0x83, float:1.84E-43)
            r9.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r9.mPreviousFigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$2
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r9.mPreviousFigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r1 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = r9.mPreviousFigureButton
            float r2 = r2.getHeight()
            r3 = 1060320051(0x3f333333, float:0.7)
            float r2 = r2 * r3
            r0.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuRightStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r9.mNextFigureButton = r0
            r2 = 132(0x84, float:1.85E-43)
            r9.registerWidget(r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r9.mNextFigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$3 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$3
            r2.<init>(r9)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r9.mNextFigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r2 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = r9.mNextFigureButton
            float r4 = r4.getHeight()
            float r4 = r4 * r3
            r0.height(r4)
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r14 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r10.findRegion(r14)
            r0.<init>(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r4)
            r0.fillX()
            r27.row()
            java.lang.String r0 = "copySprite"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r4)
            r9.mCopyButton = r0
            r4 = 133(0x85, float:1.86E-43)
            r9.registerWidget(r0, r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.mCopyButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$4 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$4
            r4.<init>(r9)
            r0.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.mCopyButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r0.align(r1)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu
            org.fortheloss.sticknodes.data.SessionData r4 = r9.mSessionDataRef
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r0.<init>(r4, r5)
            r9.mPasteMenu = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$5 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$5
            java.lang.String r4 = "pasteSprite"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonLongPressStyle()
            r0.<init>(r9, r4, r5)
            r9.mPasteButton = r0
            r4 = 134(0x86, float:1.88E-43)
            r9.registerWidget(r0, r4)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r9.mPasteButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r0.setWrap(r11)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r9.mPasteButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1082130432(0x40800000, float:4.0)
            float r6 = r4 * r5
            float r4 = r4 * r5
            r15 = 0
            r0.pad(r15, r6, r15, r4)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r9.mPasteButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$6 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$6
            r4.<init>(r9)
            r0.addListener(r4)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r9.mPasteButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r0.align(r2)
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r10.findRegion(r14)
            r0.<init>(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r4)
            r0.fillX()
            r27.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$7 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$7
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFlipFigureX()
            r5 = 1050253722(0x3e99999a, float:0.3)
            r0.<init>(r9, r4, r5)
            r9.mFlipXButton = r0
            r4 = 135(0x87, float:1.89E-43)
            r9.registerWidget(r0, r4)
            org.fortheloss.framework.RepeatingImageButton r0 = r9.mFlipXButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$8 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$8
            r4.<init>(r9)
            r0.addListener(r4)
            org.fortheloss.framework.RepeatingImageButton r0 = r9.mFlipXButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r0.align(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$9 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$9
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFlipFigureY()
            r0.<init>(r9, r4, r5)
            r9.mFlipYButton = r0
            r4 = 136(0x88, float:1.9E-43)
            r9.registerWidget(r0, r4)
            org.fortheloss.framework.RepeatingImageButton r0 = r9.mFlipYButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$10 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$10
            r4.<init>(r9)
            r0.addListener(r4)
            org.fortheloss.framework.RepeatingImageButton r0 = r9.mFlipYButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r0.align(r2)
            r27.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$11 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$11
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFigurePushBackwardStyle()
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            r0.<init>(r9, r4, r5)
            r9.mPushBackButton = r0
            r4 = 137(0x89, float:1.92E-43)
            r9.registerWidget(r0, r4)
            org.fortheloss.framework.RepeatingImageButton r0 = r9.mPushBackButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$12 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$12
            r4.<init>(r9)
            r0.addListener(r4)
            org.fortheloss.framework.RepeatingImageButton r0 = r9.mPushBackButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r0.align(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$13 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$13
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFigurePushForwardStyle()
            r0.<init>(r9, r4, r5)
            r9.mPushForwardButton = r0
            r4 = 138(0x8a, float:1.93E-43)
            r9.registerWidget(r0, r4)
            org.fortheloss.framework.RepeatingImageButton r0 = r9.mPushForwardButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$14 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$14
            r4.<init>(r9)
            r0.addListener(r4)
            org.fortheloss.framework.RepeatingImageButton r0 = r9.mPushForwardButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r0.align(r2)
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r13, r11)
            r9.mLayerPositionLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r12)
            r27.row()
            java.lang.String r0 = "centerSprite"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r2)
            r9.mCenterButton = r0
            r2 = 139(0x8b, float:1.95E-43)
            r9.registerWidget(r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.mCenterButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$15 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$15
            r2.<init>(r9)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.mCenterButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r0.colspan(r12)
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r10.findRegion(r14)
            r0.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r2)
            r0.fillX()
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r9.mStateTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r9.mStateTableCell = r0
            r27.row()
            java.lang.String r0 = "figureStateDisabled"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r11)
            r9.mStateDisabledLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9.mStateTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r9.mStateLabelCell = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mStateTable
            r0.row()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r17 = r2.getContext()
            java.lang.String r2 = "spriteState"
            java.lang.String r18 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r19 = "1"
            r20 = 3
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 1148829696(0x4479c000, float:999.0)
            r23 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r9.mStateField = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$16 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$16
            r2.<init>(r9)
            r0.setFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mStateTable
            org.fortheloss.framework.LabelInputIncrementField r2 = r9.mStateField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mStateTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mStateTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r10.findRegion(r14)
            r2.<init>(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r2)
            r0.fillX()
            org.fortheloss.framework.DegreesLabelInputIncrementField r0 = new org.fortheloss.framework.DegreesLabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r17 = r2.getContext()
            java.lang.String r2 = "rotateSprite"
            java.lang.String r18 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r19 = "0"
            r21 = 0
            r22 = 1135837184(0x43b38000, float:359.0)
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r9.mAngleField = r0
            r2 = 15
            r9.registerWidget(r0, r2)
            org.fortheloss.framework.DegreesLabelInputIncrementField r0 = r9.mAngleField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$17 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$17
            r2.<init>(r9)
            r0.setFieldListener(r2)
            org.fortheloss.framework.DegreesLabelInputIncrementField r0 = r9.mAngleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.align(r1)
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeSpriteDragNotOriginBasedStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r13, r0)
            r9.mScaleModeButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$18 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$18
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r9.mScaleModeButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r9.mScaleModeButton
            float r1 = r1.getHeight()
            float r1 = r1 * r3
            r0.height(r1)
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r0 = 140(0x8c, float:1.96E-43)
            r9.registerWidget(r8, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.defaults()
            r7 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expand(r7, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r15)
            r0.uniform(r7, r11)
            r8.setRound(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r12)
            r0.fillX()
            r27.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$19 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$19
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0.getContext()
            java.lang.String r0 = "scaleX"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r4 = "1.00"
            r5 = 8
            r16 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            r17 = 1176255488(0x461c3c00, float:9999.0)
            r18 = 1
            r0 = r6
            r1 = r27
            r11 = r6
            r6 = r16
            r12 = 0
            r7 = r17
            r15 = r8
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mScaleXField = r11
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeFloatOnlyFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeFloatOnlyFilter
            r0.<init>()
            r11.setTextFieldFilter(r0)
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mScaleXField
            r0.setIncrementType(r12)
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mScaleXField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$20 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$20
            r1.<init>(r9)
            r0.setFieldListener(r1)
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mScaleXField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r15.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r11 = 18
            r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLinkCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r9.mScaleLinkedButton = r0
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1103626240(0x41c80000, float:25.0)
            float r3 = r1 * r2
            float r1 = r1 * r2
            r2 = 0
            r0.pad(r3, r2, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9.mScaleLinkedButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$21 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$21
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9.mScaleLinkedButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r15.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1109393408(0x42200000, float:40.0)
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1112014848(0x42480000, float:50.0)
            float r1 = r1 * r2
            r0.width(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$22 r8 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$22
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0.getContext()
            java.lang.String r0 = "scaleY"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r4 = "1.00"
            r6 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            r7 = 1176255488(0x461c3c00, float:9999.0)
            r17 = 1
            r0 = r8
            r1 = r27
            r11 = r8
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mScaleYField = r11
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeFloatOnlyFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeFloatOnlyFilter
            r0.<init>()
            r11.setTextFieldFilter(r0)
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mScaleYField
            r0.setIncrementType(r12)
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mScaleYField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$23 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$23
            r1.<init>(r9)
            r0.setFieldListener(r1)
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mScaleYField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r15.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r1 = 10
            r0.align(r1)
            r27.row()
            org.fortheloss.framework.LabelInputIncrementSmallField r0 = new org.fortheloss.framework.LabelInputIncrementSmallField
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r20 = r2.getContext()
            java.lang.String r2 = "originX"
            java.lang.String r21 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r22 = "0.00"
            r23 = 8
            r24 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            r25 = 1176255488(0x461c3c00, float:9999.0)
            r26 = 1
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r9.mOriginXField = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeFloatOnlyFilter r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeFloatOnlyFilter
            r2.<init>()
            r0.setTextFieldFilter(r2)
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mOriginXField
            r2 = 1
            r0.setExtremeHighFidelity(r2)
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mOriginXField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$24 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$24
            r2.<init>(r9)
            r0.setFieldListener(r2)
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mOriginXField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r2 = 18
            r0.align(r2)
            org.fortheloss.framework.LabelInputIncrementSmallField r0 = new org.fortheloss.framework.LabelInputIncrementSmallField
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r27.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r18 = r2.getContext()
            java.lang.String r2 = "originY"
            java.lang.String r19 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r20 = "0.00"
            r21 = 8
            r22 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            r23 = 1176255488(0x461c3c00, float:9999.0)
            r24 = 1
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r9.mOriginYField = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeFloatOnlyFilter r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeFloatOnlyFilter
            r2.<init>()
            r0.setTextFieldFilter(r2)
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mOriginYField
            r2 = 1
            r0.setExtremeHighFidelity(r2)
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mOriginYField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$25 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$25
            r2.<init>(r9)
            r0.setFieldListener(r2)
            org.fortheloss.framework.LabelInputIncrementField r0 = r9.mOriginYField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.align(r1)
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r13, r0)
            r9.mLockButton = r0
            r1 = 141(0x8d, float:1.98E-43)
            r9.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.mLockButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$26 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$26
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.mLockButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r1 = 2
            r0.colspan(r1)
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r13, r0)
            r9.mSmartStretchButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$27 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$27
            r2.<init>(r9)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.mSmartStretchButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r0.colspan(r1)
            r27.row()
            java.lang.String r0 = "keepSpriteTween"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r9.mKeepDuringTweenButton = r0
            r1 = 142(0x8e, float:1.99E-43)
            r9.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9.mKeepDuringTweenButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$28 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$28
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9.mKeepDuringTweenButton
            r9.add(r0)
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r13, r0)
            r9.mTweenModeButton = r0
            r1 = 146(0x92, float:2.05E-43)
            r9.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.mTweenModeButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$29 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$29
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.mTweenModeButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r1 = 2
            r0.colspan(r1)
            r27.row()
            java.lang.String r0 = "visibleInOnionSkin"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r9.mShowInOnionSkinButton = r0
            r1 = 143(0x8f, float:2.0E-43)
            r9.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.mShowInOnionSkinButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$30 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$30
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.mShowInOnionSkinButton
            r9.add(r0)
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r10.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            r27.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r9._joinAnchorTable = r0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r1)
            r2 = 1
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9._joinAnchorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r1)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r2)
            r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9._joinAnchorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r9._joinAnchorTableCell = r0
            r27.row()
            java.lang.String r0 = "joinedTo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ":\n"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r1)
            r9._joinAnchorNameLabel = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$31 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$31
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9._joinAnchorTable
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r9._joinAnchorNameLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1134559232(0x43a00000, float:320.0)
            float r1 = r1 * r2
            r0.width(r1)
            java.lang.String r0 = "join"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeJoin()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r9.mJoinButton = r0
            r1 = 144(0x90, float:2.02E-43)
            r9.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r9.mJoinButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$32 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$32
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r9.mJoinButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            r9.mJoinButtonsCellRef = r0
            r27.row()
            java.lang.String r0 = "unjoin"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeUnjoin()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r9.mUnjoinButton = r0
            r1 = 145(0x91, float:2.03E-43)
            r9.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r9.mUnjoinButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$33 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$33
            r1.<init>(r9)
            r0.addListener(r1)
            java.lang.String r0 = "unlockFromCamera"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getShortLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r9.mUnlockFromCameraButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$34 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable$34
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.mUnlockFromCameraButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            r9.mUnlockFromCameraCellRef = r0
            r27.row()
            r27.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r12 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r12.mSessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L16
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r12.setTouchable(r0)
            r12.setColor(r2, r2, r2, r1)
            goto L50a
        L16:
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r12.setTouchable(r3)
            r12.setColor(r2, r2, r2, r2)
            java.lang.String r3 = r0.getName()
            int r4 = r3.length()
            java.lang.String r5 = "..."
            r6 = 0
            r7 = 50
            r8 = 23
            if (r4 <= r7) goto L52
            java.lang.String r4 = r3.substring(r6, r8)
            int r9 = r3.length()
            int r9 = r9 - r8
            int r10 = r3.length()
            java.lang.String r3 = r3.substring(r9, r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r5)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
        L52:
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r12.mSpriteNameLabel
            int r9 = r0.getID()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            java.lang.String r3 = " (ID: "
            r10.append(r3)
            r10.append(r9)
            java.lang.String r9 = ")"
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            r4.setText(r10)
            boolean r4 = r0.isJoined()
            if (r4 == 0) goto L121
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> r4 = r12.mJoinButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r10 = r12.mUnjoinButton
            if (r4 == r10) goto L89
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> r4 = r12.mJoinButtonsCellRef
            r4.setActor(r10)
        L89:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r12.mJoinButton
            r4.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r12.mJoinButton
            com.badlogic.gdx.scenes.scene2d.Touchable r10 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r10)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r12.mUnjoinButton
            r4.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r12.mUnjoinButton
            com.badlogic.gdx.scenes.scene2d.Touchable r10 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r4.setTouchable(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r12.mSmartStretchButton
            r4.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r12.mSmartStretchButton
            r4.setTouchable(r10)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r0.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            java.lang.String r10 = r4.getName()
            int r11 = r10.length()
            if (r11 <= r7) goto Ldc
            java.lang.String r6 = r10.substring(r6, r8)
            int r7 = r10.length()
            int r7 = r7 - r8
            java.lang.String r7 = r10.substring(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r5)
            r8.append(r7)
            java.lang.String r10 = r8.toString()
        Ldc:
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r12._joinAnchorNameLabel
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r0.getJoinedToNode()
            r5.setUserObject(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r12._joinAnchorNameLabel
            java.lang.String r6 = "joinedTo"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            int r4 = r4.getID()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = ":\n"
            r7.append(r6)
            r7.append(r10)
            r7.append(r3)
            r7.append(r4)
            r7.append(r9)
            java.lang.String r3 = r7.toString()
            r5.setText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r3 = r12._joinAnchorTableCell
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 != 0) goto L15d
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r3 = r12._joinAnchorTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r12._joinAnchorTable
            r3.setActor(r4)
            goto L15d
        L121:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> r3 = r12.mJoinButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r12.mJoinButton
            if (r3 == r4) goto L130
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> r3 = r12.mJoinButtonsCellRef
            r3.setActor(r4)
        L130:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mJoinButton
            r3.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mJoinButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mUnjoinButton
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mUnjoinButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mSmartStretchButton
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mSmartStretchButton
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r3 = r12._joinAnchorTableCell
            r3.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r12._joinAnchorNameLabel
            r4 = 0
            r3.setUserObject(r4)
        L15d:
            byte r3 = r0.isLockedToCamera()
            if (r3 == 0) goto L17f
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mJoinButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mJoinButton
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.TextButton> r3 = r12.mUnlockFromCameraCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 != 0) goto L184
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.TextButton> r3 = r12.mUnlockFromCameraCellRef
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r12.mUnlockFromCameraButton
            r3.setActor(r4)
            goto L184
        L17f:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.TextButton> r3 = r12.mUnlockFromCameraCellRef
            r3.clearActor()
        L184:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r12.mScaleLinkedButton
            boolean r4 = r0.getScaleLinked()
            r3.setChecked(r4)
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mScaleXField
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r3.getTextField()
            boolean r3 = r3.hasKeyboardFocus()
            if (r3 != 0) goto L1a2
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mScaleXField
            float r4 = r0.getScaleX()
            r3.setValue(r4)
        L1a2:
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mScaleYField
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r3.getTextField()
            boolean r3 = r3.hasKeyboardFocus()
            if (r3 != 0) goto L1b7
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mScaleYField
            float r4 = r0.getScaleY()
            r3.setValue(r4)
        L1b7:
            org.fortheloss.framework.DegreesLabelInputIncrementField r3 = r12.mAngleField
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r3.getTextField()
            boolean r3 = r3.hasKeyboardFocus()
            if (r3 != 0) goto L1cc
            org.fortheloss.framework.DegreesLabelInputIncrementField r3 = r12.mAngleField
            float r4 = r0.getRotation()
            r3.setValue(r4)
        L1cc:
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mOriginXField
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r3.getTextField()
            boolean r3 = r3.hasKeyboardFocus()
            if (r3 != 0) goto L1e1
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mOriginXField
            float r4 = r0.getNormalizedOriginX()
            r3.setValue(r4)
        L1e1:
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mOriginYField
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r3.getTextField()
            boolean r3 = r3.hasKeyboardFocus()
            if (r3 != 0) goto L1f6
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mOriginYField
            float r4 = r0.getNormalizedOriginY()
            r3.setValue(r4)
        L1f6:
            boolean r3 = r0.isJoined()
            if (r3 == 0) goto L209
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            goto L215
        L209:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            r3.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r3.setTouchable(r4)
        L215:
            boolean r3 = r0.isDragOriginBased()
            if (r3 == 0) goto L230
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            java.lang.String r4 = "scaleToOrigin"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r3.setText(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeSpriteDragOriginBasedStyle()
            r3.setStyle(r4)
            goto L244
        L230:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            java.lang.String r4 = "scaleToEdge"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r3.setText(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeSpriteDragNotOriginBasedStyle()
            r3.setStyle(r4)
        L244:
            int r3 = r0.getSmartStretchState()
            r4 = 2
            r5 = 1
            if (r3 != 0) goto L258
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mSmartStretchButton
            java.lang.String r6 = "smartStretchNo"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            r3.setText(r6)
            goto L287
        L258:
            int r3 = r0.getSmartStretchState()
            if (r3 != r5) goto L26a
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mSmartStretchButton
            java.lang.String r6 = "smartStretchX"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            r3.setText(r6)
            goto L287
        L26a:
            int r3 = r0.getSmartStretchState()
            if (r3 != r4) goto L27c
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mSmartStretchButton
            java.lang.String r6 = "smartStretchY"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            r3.setText(r6)
            goto L287
        L27c:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mSmartStretchButton
            java.lang.String r6 = "smartStretchXY"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            r3.setText(r6)
        L287:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r12.mKeepDuringTweenButton
            boolean r6 = r0.isPersistent()
            r3.setChecked(r6)
            byte r3 = r0.getTweenMode()
            java.lang.String r6 = ": "
            java.lang.String r7 = "tween"
            if (r3 != 0) goto L2bd
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mTweenModeButton
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r8 = "none"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            r3.setText(r6)
            goto L34e
        L2bd:
            if (r3 != r5) goto L2e1
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mTweenModeButton
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r8 = "linear"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            r3.setText(r6)
            goto L34e
        L2e1:
            if (r3 != r4) goto L305
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mTweenModeButton
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r8 = "ease"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            r3.setText(r6)
            goto L34e
        L305:
            r8 = 3
            if (r3 != r8) goto L32a
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mTweenModeButton
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r8 = "easeIn"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            r3.setText(r6)
            goto L34e
        L32a:
            r8 = 4
            if (r3 != r8) goto L34e
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mTweenModeButton
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r8 = "easeOut"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            r3.setText(r6)
        L34e:
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mScaleXField
            r3.enable()
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mScaleYField
            r3.enable()
            org.fortheloss.framework.DegreesLabelInputIncrementField r3 = r12.mAngleField
            r3.enable()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r12.mScaleLinkedButton
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r3.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r12.mScaleLinkedButton
            r3.setColor(r2, r2, r2, r2)
            int r3 = r0.getLockState()
            if (r3 != 0) goto L37c
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mLockButton
            java.lang.String r7 = "lockedNo"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            r3.setText(r7)
            goto L3f5
        L37c:
            int r3 = r0.getLockState()
            if (r3 != r5) goto L3b3
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mLockButton
            java.lang.String r7 = "lockedYes"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            r3.setText(r7)
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mScaleXField
            r3.disable()
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mScaleYField
            r3.disable()
            org.fortheloss.framework.DegreesLabelInputIncrementField r3 = r12.mAngleField
            r3.disable()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r12.mScaleLinkedButton
            com.badlogic.gdx.scenes.scene2d.Touchable r7 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r12.mScaleLinkedButton
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            r3.setTouchable(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            r3.setColor(r2, r2, r2, r1)
            goto L3f5
        L3b3:
            int r3 = r0.getLockState()
            if (r3 != r4) goto L3e5
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mLockButton
            java.lang.String r7 = "lockedScale"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            r3.setText(r7)
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mScaleXField
            r3.disable()
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mScaleYField
            r3.disable()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r12.mScaleLinkedButton
            com.badlogic.gdx.scenes.scene2d.Touchable r7 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r12.mScaleLinkedButton
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            r3.setTouchable(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            r3.setColor(r2, r2, r2, r1)
            goto L3f5
        L3e5:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mLockButton
            java.lang.String r7 = "lockedRotation"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            r3.setText(r7)
            org.fortheloss.framework.DegreesLabelInputIncrementField r3 = r12.mAngleField
            r3.disable()
        L3f5:
            boolean r3 = r0.isJoined()
            if (r3 == 0) goto L40e
            int r3 = r0.getSmartStretchState()
            if (r3 == 0) goto L40e
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mLockButton
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mLockButton
            com.badlogic.gdx.scenes.scene2d.Touchable r7 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r7)
            goto L418
        L40e:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mLockButton
            r3.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mLockButton
            r3.setTouchable(r6)
        L418:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r12.mShowInOnionSkinButton
            boolean r7 = r0.isVisibleInOnionSkin()
            r3.setChecked(r7)
            byte r3 = r0.isLockedToCamera()
            if (r3 != r4) goto L44c
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r12.mScaleLinkedButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r12.mScaleLinkedButton
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12.mScaleModeButton
            r3.setColor(r2, r2, r2, r1)
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mScaleXField
            r3.disable()
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mScaleYField
            r3.disable()
            org.fortheloss.framework.DegreesLabelInputIncrementField r3 = r12.mAngleField
            r3.disable()
        L44c:
            boolean r3 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r3 == 0) goto L49d
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r3 = r12.mStateTableCell
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 != 0) goto L45f
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r3 = r12.mStateTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r12.mStateTable
            r3.setActor(r4)
        L45f:
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mStateField
            r4 = r0
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r4 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r4
            int r7 = r4.getStateIndex()
            int r7 = r7 + r5
            float r7 = (float) r7
            r3.setValue(r7)
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mStateField
            int r7 = r4.getNumStates()
            float r7 = (float) r7
            r3.setMaxValue(r7)
            boolean r3 = r4.getIsStateControlled()
            if (r3 == 0) goto L492
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r12.mStateLabelCell
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 != 0) goto L48c
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r12.mStateLabelCell
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r12.mStateDisabledLabel
            r3.setActor(r4)
        L48c:
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mStateField
            r3.disable()
            goto L4a2
        L492:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r12.mStateLabelCell
            r3.clearActor()
            org.fortheloss.framework.LabelInputIncrementField r3 = r12.mStateField
            r3.enable()
            goto L4a2
        L49d:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r3 = r12.mStateTableCell
            r3.clearActor()
        L4a2:
            org.fortheloss.sticknodes.data.SessionData r3 = r12.mSessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = r3.getCopiedSprite()
            if (r3 != 0) goto L4b7
            org.fortheloss.sticknodes.TextButtonLongPress r3 = r12.mPasteButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            org.fortheloss.sticknodes.TextButtonLongPress r3 = r12.mPasteButton
            r3.setColor(r2, r2, r2, r1)
            goto L4c1
        L4b7:
            org.fortheloss.sticknodes.TextButtonLongPress r1 = r12.mPasteButton
            r1.setTouchable(r6)
            org.fortheloss.sticknodes.TextButtonLongPress r1 = r12.mPasteButton
            r1.setColor(r2, r2, r2, r2)
        L4c1:
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r12.mLayerPositionLabel
            java.lang.String r2 = "? / ?"
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r1 = r12.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            if (r1 == 0) goto L50a
            java.util.ArrayList r1 = r1.getDrawableFigures()
            int r2 = r1.size()
            int r3 = r2 + (-1)
        L4da:
            if (r3 < 0) goto L4e6
            java.lang.Object r4 = r1.get(r3)
            if (r4 != r0) goto L4e3
            goto L4e7
        L4e3:
            int r3 = r3 + (-1)
            goto L4da
        L4e6:
            r3 = -1
        L4e7:
            if (r3 < 0) goto L4ef
            int r3 = r3 + r5
            java.lang.String r0 = java.lang.String.valueOf(r3)
            goto L4f1
        L4ef:
            java.lang.String r0 = "?"
        L4f1:
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r12.mLayerPositionLabel
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " / "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r1.setText(r0)
        L50a:
            return
    }
}
