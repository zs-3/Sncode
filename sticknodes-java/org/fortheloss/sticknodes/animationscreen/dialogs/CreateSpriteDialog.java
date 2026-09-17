package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class CreateSpriteDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private static boolean isFirstOpen = true;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mAaCheckbox;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mAdvancedButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mAdvancedTable;
    private org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule mAnimationBasedModuleRef;
    private org.fortheloss.framework.Assets mAssetsRef;
    private org.fortheloss.framework.ColorPicker mBgColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mClearButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField mCreateNameTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mCreateTable;
    private java.lang.String mDefaultImageSizeText;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mEditButtonsTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mEditButtonsTableCell;
    private org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData mEditingSelectionDataRef;
    private int mEditingSelectionIndex;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> mExistingSelectionsList;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mExistingSelectionsTable;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mExpandButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mHLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mImageSizeLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mImportSpritesButton;
    private org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog mImportingSpritesDialogRef;
    private org.fortheloss.framework.LabelInputIncrementSmallField mInternalScaleXField;
    private org.fortheloss.framework.LabelInputIncrementSmallField mInternalScaleYField;
    private boolean mIsInitiated;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mLockHButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mLockWButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mLockXButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mLockYButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mMainCell;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mMaskButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> mMessageCell;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mMessageLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mMinecraftButton;
    private boolean mMinecraftEnabled;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton mOkayButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mPreviewTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget> mPreviewWidgetCell;
    private com.badlogic.gdx.math.Vector2 mRememberedInternalScalePreEdit;
    private int mRememberedMaskStatePreEdit;
    private java.lang.String mRememberedNamePreEdit;
    private com.badlogic.gdx.math.Vector2 mRememberedRelativeOriginPreEdit;
    private com.badlogic.gdx.math.Rectangle mRememberedSelectionPreEdit;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton mRemoveBackgroundButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mScaleLinkedButton;
    private org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool mSpriteImporterTool;
    private org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget mSpritePreview;
    private org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget mSpriteSelector;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mTransparencyCheckbox;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mWLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mXLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mYLabel;





    /* renamed from: org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$13, reason: invalid class name */
    class AnonymousClass13 extends org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget {
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog this$0;
        final /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Table val$bottomSelectorTooltable;
        final /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Table val$selectorTooltable;


        AnonymousClass13(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r7, com.badlogic.gdx.graphics.g2d.TextureRegion r8, com.badlogic.gdx.graphics.g2d.TextureRegion r9, com.badlogic.gdx.graphics.Texture r10, org.fortheloss.sticknodes.SNShapeRenderer r11, float r12, com.badlogic.gdx.scenes.scene2d.ui.Table r13, com.badlogic.gdx.scenes.scene2d.ui.Table r14) {
                r6 = this;
                r6.this$0 = r7
                r6.val$selectorTooltable = r13
                r6.val$bottomSelectorTooltable = r14
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget
        protected void onExistingSelectionAdded(org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r3) {
                r2 = this;
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r2.this$0
                com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m380$$Nest$fgetmExistingSelectionsTable(r0)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$13$1 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$13$1
                r1.<init>(r2, r3)
                r0.add(r1)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r3 = r2.this$0
                com.badlogic.gdx.scenes.scene2d.ui.Table r3 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m380$$Nest$fgetmExistingSelectionsTable(r3)
                r3.row()
                return
        }

        @Override // org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget
        protected void onExistingSelectionRemoved(org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r5) {
                r4 = this;
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r4.this$0
                com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m380$$Nest$fgetmExistingSelectionsTable(r0)
                com.badlogic.gdx.utils.SnapshotArray r0 = r0.getChildren()
                int r1 = r0.size
                int r1 = r1 + (-1)
            Le:
                if (r1 < 0) goto L4c
                java.lang.Object r2 = r0.get(r1)
                boolean r2 = r2 instanceof org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.SpriteRegionItem
                if (r2 == 0) goto L49
                java.lang.Object r2 = r0.get(r1)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$SpriteRegionItem r2 = (org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.SpriteRegionItem) r2
                org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r3 = r2.getData()
                if (r3 != r5) goto L49
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r5 = r4.this$0
                com.badlogic.gdx.scenes.scene2d.ui.Table r5 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m380$$Nest$fgetmExistingSelectionsTable(r5)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.getCell(r2)
                r0 = 0
                r5.setActor(r0)
                r0 = 0
                r5.pad(r0)
                r5.space(r0)
                r5.height(r0)
                r5.maxHeight(r0)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r5 = r4.this$0
                com.badlogic.gdx.scenes.scene2d.ui.Table r5 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m380$$Nest$fgetmExistingSelectionsTable(r5)
                r5.invalidate()
                goto L4c
            L49:
                int r1 = r1 + (-1)
                goto Le
            L4c:
                return
        }

        @Override // org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget
        protected void onExistingSelectionTouched(org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r3) {
                r2 = this;
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r2.this$0
                int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m378$$Nest$fgetmEditingSelectionIndex(r0)
                r1 = -1
                if (r0 == r1) goto L17
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r2.this$0
                org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m377$$Nest$fgetmEditingSelectionDataRef(r0)
                if (r0 != r3) goto L17
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r3 = r2.this$0
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m414$$Nest$monCancelEditingClick(r3)
                goto L1c
            L17:
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r2.this$0
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m407$$Nest$mbeginEditingSelection(r0, r3)
            L1c:
                return
        }

        @Override // org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget
        protected void onLoaded() {
                r9 = this;
                com.badlogic.gdx.scenes.scene2d.Stage r0 = r9.getStage()
                if (r0 != 0) goto L7
                return
            L7:
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r9.this$0
                com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r0.getDialog()
                r0.pack()
                r0.clearActions()
                com.badlogic.gdx.scenes.scene2d.Stage r1 = r9.getStage()
                float r1 = r1.getHeight()
                float r2 = r0.getPrefHeight()
                float r1 = r1 - r2
                r2 = 1109393408(0x42200000, float:40.0)
                float r3 = org.fortheloss.sticknodes.App.assetScaling
                float r3 = r3 * r2
                int r2 = (int) r3
                float r2 = (float) r2
                float r1 = r1 - r2
                int r1 = java.lang.Math.round(r1)
                float r1 = (float) r1
                r0.setY(r1)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r9.this$0
                org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m398$$Nest$fgetmSpriteSelector(r0)
                float r0 = r0.getTextureWidth()
                int r0 = (int) r0
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r1 = r9.this$0
                org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m398$$Nest$fgetmSpriteSelector(r1)
                float r1 = r1.getTextureHeight()
                int r1 = (int) r1
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r2 = r9.this$0
                com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m382$$Nest$fgetmImageSizeLabel(r2)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r3 = r9.this$0
                java.lang.String r3 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m376$$Nest$fgetmDefaultImageSizeText(r3)
                java.lang.String r4 = "belowImageSizedAt"
                java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r3)
                java.lang.String r3 = "\n"
                r5.append(r3)
                r5.append(r4)
                java.lang.String r3 = " "
                r5.append(r3)
                r5.append(r0)
                java.lang.String r3 = " x "
                r5.append(r3)
                r5.append(r1)
                java.lang.String r3 = "."
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r2.setText(r3)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r2 = r9.this$0
                com.badlogic.gdx.scenes.scene2d.ui.Table r2 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m375$$Nest$fgetmCreateTable(r2)
                com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
                r2.setTouchable(r3)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r2 = r9.this$0
                com.badlogic.gdx.scenes.scene2d.ui.Table r2 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m375$$Nest$fgetmCreateTable(r2)
                r4 = 1065353216(0x3f800000, float:1.0)
                r2.setColor(r4, r4, r4, r4)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r2 = r9.this$0
                org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r2 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m397$$Nest$fgetmSpritePreview(r2)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r5 = r9.this$0
                org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r5 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m398$$Nest$fgetmSpriteSelector(r5)
                com.badlogic.gdx.graphics.Texture r5 = r5.getTexture()
                r2.setTexture(r5)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r2 = r9.this$0
                org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r2 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m398$$Nest$fgetmSpriteSelector(r2)
                com.badlogic.gdx.math.Rectangle r2 = r2.getRoundedClampedSelectionUV()
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r5 = r9.this$0
                org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r5 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m397$$Nest$fgetmSpritePreview(r5)
                float r6 = r2.x
                float r7 = r2.y
                float r8 = r2.width
                float r2 = r2.height
                r5.setUVs(r6, r7, r8, r2)
                com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9.val$selectorTooltable
                r2.setColor(r4, r4, r4, r4)
                com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9.val$selectorTooltable
                r2.setTouchable(r3)
                com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9.val$bottomSelectorTooltable
                r2.setColor(r4, r4, r4, r4)
                com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9.val$bottomSelectorTooltable
                r2.setTouchable(r3)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r2 = r9.this$0
                org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r2 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m398$$Nest$fgetmSpriteSelector(r2)
                boolean r2 = r2.imageContainTransparentPixels()
                r3 = 1
                r5 = 0
                if (r2 == 0) goto Lf1
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r2 = r9.this$0
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m429$$Nest$monTransparencyButtonClick(r2, r3)
                goto Lf6
            Lf1:
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r2 = r9.this$0
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m429$$Nest$monTransparencyButtonClick(r2, r5)
            Lf6:
                r2 = 64
                if (r0 != r2) goto Lfc
                if (r1 == r2) goto L102
            Lfc:
                r2 = 128(0x80, float:1.794E-43)
                if (r0 != r2) goto L11c
                if (r1 != r2) goto L11c
            L102:
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r2 = r9.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m393$$Nest$fgetmMinecraftButton(r2)
                r2.setColor(r4, r4, r4, r4)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r2 = r9.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m393$$Nest$fgetmMinecraftButton(r2)
                com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
                r2.setTouchable(r4)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r2 = r9.this$0
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m405$$Nest$fputmMinecraftEnabled(r2, r3)
                goto L121
            L11c:
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r2 = r9.this$0
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m405$$Nest$fputmMinecraftEnabled(r2, r5)
            L121:
                org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                java.lang.String r0 = "x"
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                java.lang.String r1 = "latest_create_sprite_loaded_img"
                r2.setCrashlyticsKeyString(r1, r0)
                return
        }

        @Override // org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget
        protected void onMaskStateChanged(int r3) {
                r2 = this;
                r0 = 1
                if (r3 == r0) goto L5f
                r0 = 2
                if (r3 == r0) goto L4f
                r0 = 3
                if (r3 == r0) goto L3f
                r0 = 4
                if (r3 == r0) goto L2f
                r0 = 5
                if (r3 == r0) goto L1f
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r2.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m390$$Nest$fgetmMaskButton(r0)
                java.lang.String r1 = "noMask"
                java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
                r0.setText(r1)
                goto L6e
            L1f:
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r2.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m390$$Nest$fgetmMaskButton(r0)
                java.lang.String r1 = "circle"
                java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
                r0.setText(r1)
                goto L6e
            L2f:
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r2.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m390$$Nest$fgetmMaskButton(r0)
                java.lang.String r1 = "left"
                java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
                r0.setText(r1)
                goto L6e
            L3f:
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r2.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m390$$Nest$fgetmMaskButton(r0)
                java.lang.String r1 = "bottom"
                java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
                r0.setText(r1)
                goto L6e
            L4f:
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r2.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m390$$Nest$fgetmMaskButton(r0)
                java.lang.String r1 = "right"
                java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
                r0.setText(r1)
                goto L6e
            L5f:
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r2.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m390$$Nest$fgetmMaskButton(r0)
                java.lang.String r1 = "top"
                java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
                r0.setText(r1)
            L6e:
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r2.this$0
                org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m397$$Nest$fgetmSpritePreview(r0)
                r0.setMaskState(r3)
                return
        }

        @Override // org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget
        protected void onSelectionChanged() {
                r6 = this;
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r6.this$0
                org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m398$$Nest$fgetmSpriteSelector(r0)
                com.badlogic.gdx.math.Rectangle r0 = r0.getRoundedClampedSelectionXY()
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r1 = r6.this$0
                com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m401$$Nest$fgetmXLabel(r1)
                float r2 = r0.x
                int r2 = (int) r2
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "X: "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.setText(r2)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r1 = r6.this$0
                com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m402$$Nest$fgetmYLabel(r1)
                float r2 = r0.y
                int r2 = (int) r2
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Y: "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.setText(r2)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r1 = r6.this$0
                com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m400$$Nest$fgetmWLabel(r1)
                java.lang.String r2 = "width_letter"
                java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
                java.util.Locale r3 = java.util.Locale.ROOT
                java.lang.String r2 = r2.toUpperCase(r3)
                float r4 = r0.width
                int r4 = (int) r4
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r2)
                java.lang.String r2 = ": "
                r5.append(r2)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                r1.setText(r4)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r1 = r6.this$0
                com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m381$$Nest$fgetmHLabel(r1)
                java.lang.String r4 = "height_letter"
                java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
                java.lang.String r3 = r4.toUpperCase(r3)
                float r0 = r0.height
                int r0 = (int) r0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r3)
                r4.append(r2)
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.setText(r0)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = r6.this$0
                org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m398$$Nest$fgetmSpriteSelector(r0)
                com.badlogic.gdx.math.Rectangle r0 = r0.getRoundedClampedSelectionUV()
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r1 = r6.this$0
                org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r1 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.m397$$Nest$fgetmSpritePreview(r1)
                float r2 = r0.x
                float r3 = r0.y
                float r4 = r0.width
                float r0 = r0.height
                r1.setUVs(r2, r3, r4, r0)
                return
        }
    }






















































    private static class SpriteRegionItem extends com.badlogic.gdx.scenes.scene2d.ui.Table {
        protected org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData mDataRef;
        private com.badlogic.gdx.scenes.scene2d.ui.Label mInfoLabel;
        private com.badlogic.gdx.scenes.scene2d.ui.Label mNameLabel;



        public SpriteRegionItem(org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r4) {
                r3 = this;
                r3.<init>()
                r3.mDataRef = r4
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTableGrayBackground()
                r3.setBackground(r4)
                float r4 = org.fortheloss.sticknodes.App.assetScaling
                r0 = 1092616192(0x41200000, float:10.0)
                float r4 = r4 * r0
                com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r3.pad(r4)
                r1 = 10
                r4.align(r1)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.defaults()
                r1 = 0
                com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.pad(r1)
                float r1 = org.fortheloss.sticknodes.App.assetScaling
                float r1 = r1 * r0
                com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.space(r1)
                r0 = 8
                com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r0)
                r1 = 0
                r4.uniform(r1, r1)
                com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
                com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
                com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
                r1.<init>(r2)
                java.lang.String r2 = ""
                r4.<init>(r2, r1)
                r3.mNameLabel = r4
                r4.setAlignment(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3.mNameLabel
                com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
                com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fillX()
                r1 = 1
                com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r1)
                r1 = 2
                r4.colspan(r1)
                r3.row()
                com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
                com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSpriteDeleteButtonStyle()
                r4.<init>(r1)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$SpriteRegionItem$1 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$SpriteRegionItem$1
                r1.<init>(r3)
                r4.addListener(r1)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
                r4.align(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
                com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
                r4.<init>(r2, r1)
                r3.mInfoLabel = r4
                r4.setAlignment(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3.mInfoLabel
                com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
                com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fillX()
                r4.align(r0)
                com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
                r3.setTouchable(r4)
                org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$SpriteRegionItem$2 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$SpriteRegionItem$2
                r4.<init>(r3)
                r3.addListener(r4)
                r3.refresh()
                return
        }

        public org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData getData() {
                r1 = this;
                org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r0 = r1.mDataRef
                return r0
        }

        protected void onDeleteClick() {
                r0 = this;
                return
        }

        protected void onSelect() {
                r0 = this;
                return
        }

        public void refresh() {
                r7 = this;
                org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r0 = r7.mDataRef
                java.lang.String r0 = r0.name
                int r1 = r0.length()
                r2 = 34
                if (r1 <= r2) goto L30
                r1 = 0
                r2 = 15
                java.lang.String r1 = r0.substring(r1, r2)
                int r3 = r0.length()
                int r3 = r3 - r2
                java.lang.String r0 = r0.substring(r3)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = "..."
                r2.append(r1)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
            L30:
                com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r7.mNameLabel
                r1.setText(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r7.mInfoLabel
                org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r1 = r7.mDataRef
                int r2 = r1.x
                int r3 = r1.y
                int r4 = r1.w
                int r1 = r1.h
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "("
                r5.append(r6)
                r5.append(r2)
                java.lang.String r2 = ", "
                r5.append(r2)
                r5.append(r3)
                java.lang.String r2 = ")\n"
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = " x "
                r5.append(r2)
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                r0.setText(r1)
                return
        }

        public void setError(boolean r2) {
                r1 = this;
                if (r2 == 0) goto L14
                com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1.mNameLabel
                com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r2.getStyle()
                com.badlogic.gdx.graphics.Color r2 = r2.fontColor
                com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
                com.badlogic.gdx.graphics.Color r0 = r0.fontColor
                r2.set(r0)
                goto L25
            L14:
                com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1.mNameLabel
                com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r2.getStyle()
                com.badlogic.gdx.graphics.Color r2 = r2.fontColor
                com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
                com.badlogic.gdx.graphics.Color r0 = r0.fontColor
                r2.set(r0)
            L25:
                return
        }

        public void setIsHighlighted(boolean r2) {
                r1 = this;
                if (r2 == 0) goto L10
                com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1.mNameLabel
                com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r2.getStyle()
                com.badlogic.gdx.graphics.Color r2 = r2.fontColor
                com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.App.COLOR_NODE_ACTIVE
                r2.set(r0)
                goto L21
            L10:
                com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1.mNameLabel
                com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r2.getStyle()
                com.badlogic.gdx.graphics.Color r2 = r2.fontColor
                com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
                com.badlogic.gdx.graphics.Color r0 = r0.fontColor
                r2.set(r0)
            L21:
                return
        }
    }

    /* renamed from: -$$Nest$fgetmAaCheckbox, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m371$$Nest$fgetmAaCheckbox(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mAaCheckbox
            return r0
    }

    /* renamed from: -$$Nest$fgetmAnimationBasedModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule m372$$Nest$fgetmAnimationBasedModuleRef(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r0.mAnimationBasedModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fgetmBgColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m373$$Nest$fgetmBgColorPicker(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            org.fortheloss.framework.ColorPicker r0 = r0.mBgColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fgetmCreateNameTextField, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m374$$Nest$fgetmCreateNameTextField(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0.mCreateNameTextField
            return r0
    }

    /* renamed from: -$$Nest$fgetmCreateTable, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Table m375$$Nest$fgetmCreateTable(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.mCreateTable
            return r0
    }

    /* renamed from: -$$Nest$fgetmDefaultImageSizeText, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m376$$Nest$fgetmDefaultImageSizeText(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            java.lang.String r0 = r0.mDefaultImageSizeText
            return r0
    }

    /* renamed from: -$$Nest$fgetmEditingSelectionDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData m377$$Nest$fgetmEditingSelectionDataRef(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r0 = r0.mEditingSelectionDataRef
            return r0
    }

    /* renamed from: -$$Nest$fgetmEditingSelectionIndex, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m378$$Nest$fgetmEditingSelectionIndex(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            int r0 = r0.mEditingSelectionIndex
            return r0
    }

    /* renamed from: -$$Nest$fgetmExistingSelectionsList, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m379$$Nest$fgetmExistingSelectionsList(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r0.mExistingSelectionsList
            return r0
    }

    /* renamed from: -$$Nest$fgetmExistingSelectionsTable, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Table m380$$Nest$fgetmExistingSelectionsTable(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.mExistingSelectionsTable
            return r0
    }

    /* renamed from: -$$Nest$fgetmHLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m381$$Nest$fgetmHLabel(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.mHLabel
            return r0
    }

    /* renamed from: -$$Nest$fgetmImageSizeLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m382$$Nest$fgetmImageSizeLabel(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.mImageSizeLabel
            return r0
    }

    /* renamed from: -$$Nest$fgetmImportingSpritesDialogRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog m383$$Nest$fgetmImportingSpritesDialogRef(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r0 = r0.mImportingSpritesDialogRef
            return r0
    }

    /* renamed from: -$$Nest$fgetmInternalScaleXField, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.LabelInputIncrementSmallField m384$$Nest$fgetmInternalScaleXField(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            org.fortheloss.framework.LabelInputIncrementSmallField r0 = r0.mInternalScaleXField
            return r0
    }

    /* renamed from: -$$Nest$fgetmInternalScaleYField, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.LabelInputIncrementSmallField m385$$Nest$fgetmInternalScaleYField(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            org.fortheloss.framework.LabelInputIncrementSmallField r0 = r0.mInternalScaleYField
            return r0
    }

    /* renamed from: -$$Nest$fgetmLockHButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m386$$Nest$fgetmLockHButton(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mLockHButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmLockWButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m387$$Nest$fgetmLockWButton(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mLockWButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmLockXButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m388$$Nest$fgetmLockXButton(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mLockXButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmLockYButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m389$$Nest$fgetmLockYButton(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mLockYButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmMaskButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextButton m390$$Nest$fgetmMaskButton(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r0.mMaskButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmMessageCell, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Cell m391$$Nest$fgetmMessageCell(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r0 = r0.mMessageCell
            return r0
    }

    /* renamed from: -$$Nest$fgetmMessageLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m392$$Nest$fgetmMessageLabel(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.mMessageLabel
            return r0
    }

    /* renamed from: -$$Nest$fgetmMinecraftButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextButton m393$$Nest$fgetmMinecraftButton(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r0.mMinecraftButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmOkayButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton m394$$Nest$fgetmOkayButton(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r0.mOkayButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmScaleLinkedButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m395$$Nest$fgetmScaleLinkedButton(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mScaleLinkedButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmSpriteImporterTool, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool m396$$Nest$fgetmSpriteImporterTool(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool r0 = r0.mSpriteImporterTool
            return r0
    }

    /* renamed from: -$$Nest$fgetmSpritePreview, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget m397$$Nest$fgetmSpritePreview(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r0 = r0.mSpritePreview
            return r0
    }

    /* renamed from: -$$Nest$fgetmSpriteSelector, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget m398$$Nest$fgetmSpriteSelector(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r0.mSpriteSelector
            return r0
    }

    /* renamed from: -$$Nest$fgetmTransparencyCheckbox, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m399$$Nest$fgetmTransparencyCheckbox(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mTransparencyCheckbox
            return r0
    }

    /* renamed from: -$$Nest$fgetmWLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m400$$Nest$fgetmWLabel(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.mWLabel
            return r0
    }

    /* renamed from: -$$Nest$fgetmXLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m401$$Nest$fgetmXLabel(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.mXLabel
            return r0
    }

    /* renamed from: -$$Nest$fgetmYLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m402$$Nest$fgetmYLabel(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.mYLabel
            return r0
    }

    /* renamed from: -$$Nest$fputmImportingSpritesDialogRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m403$$Nest$fputmImportingSpritesDialogRef(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r1) {
            r0.mImportingSpritesDialogRef = r1
            return
    }

    /* renamed from: -$$Nest$fputmIsInitiated, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m404$$Nest$fputmIsInitiated(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, boolean r1) {
            r0.mIsInitiated = r1
            return
    }

    /* renamed from: -$$Nest$fputmMinecraftEnabled, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m405$$Nest$fputmMinecraftEnabled(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, boolean r1) {
            r0.mMinecraftEnabled = r1
            return
    }

    /* renamed from: -$$Nest$mactuallyImportSelections, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m406$$Nest$mactuallyImportSelections(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, boolean r1) {
            r0.actuallyImportSelections(r1)
            return
    }

    /* renamed from: -$$Nest$mbeginEditingSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m407$$Nest$mbeginEditingSelection(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r1) {
            r0.beginEditingSelection(r1)
            return
    }

    /* renamed from: -$$Nest$mclearExistingSelections, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m408$$Nest$mclearExistingSelections(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            r0.clearExistingSelections()
            return
    }

    /* renamed from: -$$Nest$mconvertToTextData, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m409$$Nest$mconvertToTextData(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, java.util.ArrayList r1, boolean r2, boolean r3, com.badlogic.gdx.graphics.Color r4) {
            java.lang.String r0 = r0.convertToTextData(r1, r2, r3, r4)
            return r0
    }

    /* renamed from: -$$Nest$mcreateFromSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m410$$Nest$mcreateFromSelection(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, java.lang.String r1) {
            r0.createFromSelection(r1)
            return
    }

    /* renamed from: -$$Nest$mimportSelections, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m411$$Nest$mimportSelections(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            r0.importSelections()
            return
    }

    /* renamed from: -$$Nest$monAAButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m412$$Nest$monAAButtonClick(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, boolean r1) {
            r0.onAAButtonClick(r1)
            return
    }

    /* renamed from: -$$Nest$monBgColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m413$$Nest$monBgColorSelect(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            r0.onBgColorSelect()
            return
    }

    /* renamed from: -$$Nest$monCancelEditingClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m414$$Nest$monCancelEditingClick(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            r0.onCancelEditingClick()
            return
    }

    /* renamed from: -$$Nest$monClickH, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m415$$Nest$monClickH(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, int r1) {
            r0.onClickH(r1)
            return
    }

    /* renamed from: -$$Nest$monClickW, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m416$$Nest$monClickW(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, int r1) {
            r0.onClickW(r1)
            return
    }

    /* renamed from: -$$Nest$monClickX, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m417$$Nest$monClickX(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, int r1) {
            r0.onClickX(r1)
            return
    }

    /* renamed from: -$$Nest$monClickY, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m418$$Nest$monClickY(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, int r1) {
            r0.onClickY(r1)
            return
    }

    /* renamed from: -$$Nest$monCreateClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m419$$Nest$monCreateClick(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            r0.onCreateClick()
            return
    }

    /* renamed from: -$$Nest$monExpandSelectionButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m420$$Nest$monExpandSelectionButtonClick(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            r0.onExpandSelectionButtonClick()
            return
    }

    /* renamed from: -$$Nest$monLockHClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m421$$Nest$monLockHClick(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, boolean r1) {
            r0.onLockHClick(r1)
            return
    }

    /* renamed from: -$$Nest$monLockWClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m422$$Nest$monLockWClick(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, boolean r1) {
            r0.onLockWClick(r1)
            return
    }

    /* renamed from: -$$Nest$monLockXClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m423$$Nest$monLockXClick(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, boolean r1) {
            r0.onLockXClick(r1)
            return
    }

    /* renamed from: -$$Nest$monLockYClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m424$$Nest$monLockYClick(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, boolean r1) {
            r0.onLockYClick(r1)
            return
    }

    /* renamed from: -$$Nest$monMaskButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m425$$Nest$monMaskButtonClick(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            r0.onMaskButtonClick()
            return
    }

    /* renamed from: -$$Nest$monOriginButtonQuickSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m426$$Nest$monOriginButtonQuickSelect(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, int r1) {
            r0.onOriginButtonQuickSelect(r1)
            return
    }

    /* renamed from: -$$Nest$monSaveEditsClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m427$$Nest$monSaveEditsClick(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            r0.onSaveEditsClick()
            return
    }

    /* renamed from: -$$Nest$monShowHidePreviewClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m428$$Nest$monShowHidePreviewClick(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, boolean r1) {
            r0.onShowHidePreviewClick(r1)
            return
    }

    /* renamed from: -$$Nest$monTransparencyButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m429$$Nest$monTransparencyButtonClick(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0, boolean r1) {
            r0.onTransparencyButtonClick(r1)
            return
    }

    /* renamed from: -$$Nest$mtoggleMainTable, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m430$$Nest$mtoggleMainTable(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            r0.toggleMainTable()
            return
    }

    /* renamed from: -$$Nest$mupdateImportButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m431$$Nest$mupdateImportButton(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            r0.updateImportButton()
            return
    }

    /* renamed from: -$$Nest$mverifyNamesAreUnique, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m432$$Nest$mverifyNamesAreUnique(org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0) {
            boolean r0 = r0.verifyNamesAreUnique()
            return r0
    }

    static {
            return
    }

    public CreateSpriteDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2, org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r3) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.mMinecraftEnabled = r0
            r1.mIsInitiated = r0
            r0 = -1
            r1.mRememberedMaskStatePreEdit = r0
            r1.mEditingSelectionIndex = r0
            r1.mAnimationBasedModuleRef = r3
            org.fortheloss.framework.Assets r2 = r2.getAssets()
            r1.mAssetsRef = r2
            return
    }

    private void actuallyImportSelections(boolean r10) {
            r9 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r9.mSpriteSelector
            com.badlogic.gdx.graphics.Pixmap r2 = r0.getPixmap()
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r9.mSpriteSelector
            boolean r3 = r0.getIsTransparent()
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r9.mSpriteSelector
            com.badlogic.gdx.graphics.Texture r0 = r0.getTexture()
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = r0.getMinFilter()
            com.badlogic.gdx.graphics.Texture$TextureFilter r1 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r4 = 1
            if (r0 != r1) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r9.mSpriteSelector
            com.badlogic.gdx.graphics.Color r5 = r1.getBackgroundColor()
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r9._animationScreenRef
            r1.<init>(r6)
            r9.mImportingSpritesDialogRef = r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r9._animationScreenRef
            org.fortheloss.framework.Assets r6 = r6.getAssets()
            java.lang.String r7 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r8 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r4 = r6.get(r7, r8, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r4
            java.lang.String r6 = "loading_spinner"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r4.findRegion(r6)
            r1.initialize(r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r9._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r4 = r9.mImportingSpritesDialogRef
            r1.addDialogToStage(r4)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool r1 = r9.mSpriteImporterTool
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r6 = r9.mExistingSelectionsList
            r4 = r0
            r7 = r10
            r1.importSelections(r2, r3, r4, r5, r6, r7)
            return
    }

    private void applyToSelectionData(java.lang.String r18, org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r19) {
            r17 = this;
            r0 = r17
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r0.mSpriteSelector
            com.badlogic.gdx.math.Rectangle r1 = r1.getRoundedClampedSelectionUV()
            float r4 = r1.x
            float r5 = r1.y
            float r6 = r1.width
            float r7 = r1.height
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r0.mSpriteSelector
            com.badlogic.gdx.math.Rectangle r1 = r1.getRoundedClampedSelectionXY()
            float r2 = r1.x
            int r8 = (int) r2
            float r2 = r1.y
            int r9 = (int) r2
            float r2 = r1.width
            int r10 = (int) r2
            float r1 = r1.height
            int r11 = (int) r1
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r0.mSpriteSelector
            com.badlogic.gdx.math.Vector2 r1 = r1.getRelativeSpriteOrigin()
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r2 = r0.mSpriteSelector
            com.badlogic.gdx.math.Vector2 r2 = r2.getInternalScale()
            float r14 = r2.x
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r2 = r0.mSpriteSelector
            com.badlogic.gdx.math.Vector2 r2 = r2.getInternalScale()
            float r15 = r2.y
            float r12 = r1.x
            float r13 = r1.y
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r0.mSpriteSelector
            int r16 = r1.getMaskState()
            r2 = r19
            r3 = r18
            r2.setData(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
    }

    private void beginEditingSelection(org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r7) {
            r6 = this;
            int r0 = r6.mEditingSelectionIndex
            r1 = -1
            if (r0 != r1) goto L36
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r6.mSpriteSelector
            int r0 = r0.getMaskState()
            r6.mRememberedMaskStatePreEdit = r0
            com.badlogic.gdx.math.Rectangle r0 = r6.mRememberedSelectionPreEdit
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r6.mSpriteSelector
            com.badlogic.gdx.math.Rectangle r1 = r1.getSelection()
            r0.set(r1)
            com.badlogic.gdx.math.Vector2 r0 = r6.mRememberedRelativeOriginPreEdit
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r6.mSpriteSelector
            com.badlogic.gdx.math.Vector2 r1 = r1.getRelativeSpriteOrigin()
            r0.set(r1)
            com.badlogic.gdx.math.Vector2 r0 = r6.mRememberedInternalScalePreEdit
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r6.mSpriteSelector
            com.badlogic.gdx.math.Vector2 r1 = r1.getInternalScale()
            r0.set(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r6.mCreateNameTextField
            java.lang.String r0 = r0.getText()
            r6.mRememberedNamePreEdit = r0
        L36:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r6.mExistingSelectionsList
            int r0 = r0.indexOf(r7)
            r6.mEditingSelectionIndex = r0
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r6.mSpriteSelector
            r1.setEditingSelectionIndex(r0)
            r6.mEditingSelectionDataRef = r7
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r6.mExistingSelectionsTable
            com.badlogic.gdx.utils.SnapshotArray r0 = r0.getChildren()
            int r1 = r0.size
            r2 = 1
            int r1 = r1 - r2
        L4f:
            r3 = 0
            if (r1 < 0) goto L6d
            java.lang.Object r4 = r0.get(r1)
            boolean r4 = r4 instanceof org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.SpriteRegionItem
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$SpriteRegionItem r4 = (org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.SpriteRegionItem) r4
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r5 = r4.getData()
            if (r5 != r7) goto L67
            r3 = 1
        L67:
            r4.setIsHighlighted(r3)
        L6a:
            int r1 = r1 + (-1)
            goto L4f
        L6d:
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r6.mSpriteSelector
            r0.setSelection(r7)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r6.mSpriteSelector
            int r1 = r7.maskState
            r0.setMaskState(r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r6.mSpriteSelector
            float r1 = r7.originX
            float r2 = r7.originY
            r0.setRelativeSpriteOrigin(r1, r2)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r6.mSpriteSelector
            float r1 = r7.internalScaleX
            r0.setInternalScaleX(r1, r3)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r6.mSpriteSelector
            float r1 = r7.internalScaleY
            r0.setInternalScaleY(r1, r3)
            org.fortheloss.framework.LabelInputIncrementSmallField r0 = r6.mInternalScaleXField
            float r1 = r7.internalScaleX
            r0.setValue(r1)
            org.fortheloss.framework.LabelInputIncrementSmallField r0 = r6.mInternalScaleYField
            float r1 = r7.internalScaleY
            r0.setValue(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r6.mCreateNameTextField
            java.lang.String r7 = r7.name
            r0.setText(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r7 = r6.mCreateNameTextField
            r0 = 2147483647(0x7fffffff, float:NaN)
            r7.setCursorPosition(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6.mOkayButton
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r7.setTouchable(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6.mOkayButton
            r1 = 1048576000(0x3e800000, float:0.25)
            r2 = 1065353216(0x3f800000, float:1.0)
            r7.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r6.mEditButtonsTableCell
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r7.getActor()
            if (r7 != 0) goto Lcc
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r7 = r6.mEditButtonsTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r6.mEditButtonsTable
            r7.setActor(r1)
        Lcc:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.mImportSpritesButton
            r7.setTouchable(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.mImportSpritesButton
            r1 = 1056964608(0x3f000000, float:0.5)
            r7.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.mClearButton
            r7.setTouchable(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.mClearButton
            r7.setColor(r2, r2, r2, r1)
            boolean r7 = r6.mMinecraftEnabled
            if (r7 == 0) goto Lf0
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.mMinecraftButton
            r7.setTouchable(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.mMinecraftButton
            r7.setColor(r2, r2, r2, r1)
        Lf0:
            return
    }

    private void clearExistingSelections() {
            r2 = this;
            int r0 = r2.mEditingSelectionIndex
            r1 = -1
            if (r0 == r1) goto L8
            r2.onCancelEditingClick()
        L8:
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r2.mSpriteSelector
            r0.removeExistingSelections()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r2.mExistingSelectionsList
            r0.clear()
            r2.updateImportButton()
            return
    }

    private java.lang.String convertToTextData(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r17, boolean r18, boolean r19, com.badlogic.gdx.graphics.Color r20) {
            r16 = this;
            java.lang.String r0 = r20.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ";"
            r1.append(r0)
            r3 = r19
            r1.append(r3)
            r1.append(r0)
            r3 = r18
            r1.append(r3)
            java.lang.String r3 = "]"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r4 = 0
            int r5 = r17.size()
        L31:
            if (r4 >= r5) goto Lbe
            r6 = r17
            java.lang.Object r7 = r6.get(r4)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r7 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData) r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r2)
            java.lang.String r1 = r8.toString()
            java.lang.String r8 = r7.name
            float r9 = r7.u1
            float r10 = r7.v1
            float r11 = r7.u2
            float r12 = r7.v2
            float r13 = r7.originX
            float r14 = r7.originY
            float r15 = r7.internalScaleX
            r20 = r2
            float r2 = r7.internalScaleY
            int r7 = r7.maskState
            r18 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r8)
            r5.append(r0)
            r5.append(r9)
            r5.append(r0)
            r5.append(r10)
            r5.append(r0)
            r5.append(r11)
            r5.append(r0)
            r5.append(r12)
            r5.append(r0)
            r5.append(r13)
            r5.append(r0)
            r5.append(r14)
            r5.append(r0)
            r5.append(r15)
            r5.append(r0)
            r5.append(r2)
            r5.append(r0)
            r5.append(r7)
            java.lang.String r1 = r5.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            int r4 = r4 + 1
            r5 = r18
            r2 = r20
            goto L31
        Lbe:
            return r1
    }

    private void createFromSelection(java.lang.String r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r0 = new org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData
            r0.<init>()
            r1.applyToSelectionData(r2, r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r2 = r1.mExistingSelectionsList
            r2.add(r0)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r2 = r1.mSpriteSelector
            r2.addExistingSelection(r0)
            return
    }

    private <T> T getToken(java.lang.String r2, java.lang.Class<T> r3, T r4) throws java.lang.IllegalStateException, java.lang.NullPointerException, java.lang.NumberFormatException {
            r1 = this;
            if (r2 == 0) goto L34
            java.lang.String r2 = r2.trim()
            int r0 = r2.length()
            if (r0 <= 0) goto L2c
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r3 != r0) goto L11
            return r2
        L11:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r3 != r0) goto L1e
            float r2 = java.lang.Float.parseFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L1e:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r3 != r0) goto L2b
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L2b:
            return r4
        L2c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "input is empty"
            r2.<init>(r3)
            throw r2
        L34:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "input is null"
            r2.<init>(r3)
            throw r2
    }

    private void importSelections() {
            r12 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool r0 = r12.mSpriteImporterTool
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r1 = r12.mExistingSelectionsList
            java.util.HashMap r0 = r0.getSpriteGroupNameMappings(r1)
            java.util.Set r1 = r0.entrySet()
            int r1 = r1.size()
            r2 = 0
            if (r1 <= 0) goto Lc3
            java.lang.String r1 = "spriteGroupMessage1"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "\n\n"
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "- "
        L39:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L7a
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r7 = r12.mExistingSelectionsList
            int r7 = r7.size()
            r8 = 0
        L4c:
            if (r8 >= r7) goto L39
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r9 = r12.mExistingSelectionsList
            java.lang.Object r9 = r9.get(r8)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r9 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData) r9
            java.lang.String r9 = r9.name
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r11 = "_"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            boolean r10 = r9.contains(r10)
            if (r10 == 0) goto L77
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = "\n- "
        L77:
            int r8 = r8 + 1
            goto L4c
        L7a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "spriteGroupMessage2"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$58 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$58
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r12._animationScreenRef
            r1.<init>(r12, r2)
            java.lang.String r2 = "spriteGroupTitle"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r3 = "spriteGroupYes"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r4 = "spriteGroupNo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r1.initialize(r2, r0, r3, r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r12._animationScreenRef
            r0.addDialogToStage(r1)
            goto Lc6
        Lc3:
            r12.actuallyImportSelections(r2)
        Lc6:
            return
    }

    private boolean isFilenameValid(java.lang.String r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r6 = r6.trim()
            int r1 = r6.length()
            r2 = 128(0x80, float:1.794E-43)
            if (r1 >= r2) goto L44
            int r1 = r6.length()
            if (r1 > 0) goto L17
            goto L44
        L17:
            int r1 = r6.length()
            r2 = 0
        L1c:
            if (r2 >= r1) goto L42
            char r3 = r6.charAt(r2)
            boolean r4 = java.lang.Character.isLetterOrDigit(r3)
            if (r4 == 0) goto L29
            goto L3f
        L29:
            r4 = 32
            if (r3 == r4) goto L3f
            r4 = 95
            if (r3 == r4) goto L3f
            r4 = 45
            if (r3 == r4) goto L3f
            r4 = 40
            if (r3 == r4) goto L3f
            r4 = 41
            if (r3 != r4) goto L3e
            goto L3f
        L3e:
            return r0
        L3f:
            int r2 = r2 + 1
            goto L1c
        L42:
            r6 = 1
            return r6
        L44:
            return r0
    }

    private void onAAButtonClick(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r2.mSpriteSelector
            com.badlogic.gdx.graphics.Texture r0 = r0.getTexture()
            if (r0 == 0) goto L15
            if (r3 == 0) goto L10
            com.badlogic.gdx.graphics.Texture$TextureFilter r1 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r0.setFilter(r1, r1)
            goto L15
        L10:
            com.badlogic.gdx.graphics.Texture$TextureFilter r1 = com.badlogic.gdx.graphics.Texture.TextureFilter.Nearest
            r0.setFilter(r1, r1)
        L15:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2.mAaCheckbox
            r0.setChecked(r3)
            return
    }

    private void onAfterSelectionCreated() {
            r5 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r5.mExistingSelectionsList
            java.lang.String r1 = ""
            if (r0 == 0) goto L1d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r5.mExistingSelectionsList
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Object r0 = r0.get(r2)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r0 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData) r0
            java.lang.String r0 = r0.name
            goto L1e
        L1d:
            r0 = r1
        L1e:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L53
            r2 = 95
            int r2 = r0.lastIndexOf(r2)
            if (r2 <= 0) goto L53
            int r3 = r2 + 1
            java.lang.String r3 = r0.substring(r3)
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L52
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r2)     // Catch: java.lang.NumberFormatException -> L52
            int r3 = r3 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L52
            r2.<init>()     // Catch: java.lang.NumberFormatException -> L52
            r2.append(r0)     // Catch: java.lang.NumberFormatException -> L52
            java.lang.String r0 = "_"
            r2.append(r0)     // Catch: java.lang.NumberFormatException -> L52
            r2.append(r3)     // Catch: java.lang.NumberFormatException -> L52
            java.lang.String r1 = r2.toString()     // Catch: java.lang.NumberFormatException -> L52
            goto L53
        L52:
        L53:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r5.mCreateNameTextField
            r0.setText(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L6e
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r5.mOkayButton
            r1 = 1048576000(0x3e800000, float:0.25)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r5.mOkayButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
        L6e:
            r5.updateImportButton()
            return
    }

    private void onBgColorSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r2.mSpriteSelector
            if (r0 == 0) goto L1d
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r1 = r2.mSpritePreview
            if (r1 != 0) goto L9
            goto L1d
        L9:
            org.fortheloss.framework.ColorPicker r1 = r2.mBgColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setBackgroundColor(r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r0 = r2.mSpritePreview
            org.fortheloss.framework.ColorPicker r1 = r2.mBgColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setBackgroundColor(r1)
        L1d:
            return
    }

    private void onCancelEditingClick() {
            r6 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r6.mExistingSelectionsTable
            com.badlogic.gdx.utils.SnapshotArray r0 = r0.getChildren()
            int r1 = r0.size
            int r1 = r1 + (-1)
        La:
            r2 = 0
            if (r1 < 0) goto L21
            java.lang.Object r3 = r0.get(r1)
            boolean r3 = r3 instanceof org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.SpriteRegionItem
            if (r3 == 0) goto L1e
            java.lang.Object r3 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$SpriteRegionItem r3 = (org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.SpriteRegionItem) r3
            r3.setIsHighlighted(r2)
        L1e:
            int r1 = r1 + (-1)
            goto La
        L21:
            r0 = -1
            r6.mEditingSelectionIndex = r0
            r1 = 0
            r6.mEditingSelectionDataRef = r1
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r6.mSpriteSelector
            r1.setEditingSelectionIndex(r0)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r6.mSpriteSelector
            com.badlogic.gdx.math.Rectangle r1 = r6.mRememberedSelectionPreEdit
            float r3 = r1.x
            float r4 = r1.y
            float r5 = r1.width
            float r1 = r1.height
            r0.setSelection(r3, r4, r5, r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r6.mSpriteSelector
            com.badlogic.gdx.math.Vector2 r1 = r6.mRememberedRelativeOriginPreEdit
            float r3 = r1.x
            float r1 = r1.y
            r0.setRelativeSpriteOrigin(r3, r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r6.mSpriteSelector
            com.badlogic.gdx.math.Vector2 r1 = r6.mRememberedInternalScalePreEdit
            float r1 = r1.x
            r0.setInternalScaleX(r1, r2)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r6.mSpriteSelector
            com.badlogic.gdx.math.Vector2 r1 = r6.mRememberedInternalScalePreEdit
            float r1 = r1.y
            r0.setInternalScaleY(r1, r2)
            org.fortheloss.framework.LabelInputIncrementSmallField r0 = r6.mInternalScaleXField
            com.badlogic.gdx.math.Vector2 r1 = r6.mRememberedInternalScalePreEdit
            float r1 = r1.x
            r0.setValue(r1)
            org.fortheloss.framework.LabelInputIncrementSmallField r0 = r6.mInternalScaleYField
            com.badlogic.gdx.math.Vector2 r1 = r6.mRememberedInternalScalePreEdit
            float r1 = r1.y
            r0.setValue(r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r6.mSpriteSelector
            int r1 = r6.mRememberedMaskStatePreEdit
            r0.setMaskState(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r6.mCreateNameTextField
            java.lang.String r1 = r6.mRememberedNamePreEdit
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r6.mCreateNameTextField
            java.lang.String r1 = ""
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6.mEditButtonsTableCell
            r0.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6.mImportSpritesButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6.mImportSpritesButton
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6.mClearButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6.mClearButton
            r0.setColor(r2, r2, r2, r2)
            boolean r0 = r6.mMinecraftEnabled
            if (r0 == 0) goto Laa
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6.mMinecraftButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6.mMinecraftButton
            r0.setColor(r2, r2, r2, r2)
        Laa:
            return
    }

    private void onClickH(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r1.mSpriteSelector
            r0.incrementH(r2)
            return
    }

    private void onClickW(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r1.mSpriteSelector
            r0.incrementW(r2)
            return
    }

    private void onClickX(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r1.mSpriteSelector
            r0.incrementX(r2)
            return
    }

    private void onClickY(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r1.mSpriteSelector
            r0.incrementY(r2)
            return
    }

    private void onCreateClick() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r2.mCreateNameTextField
            java.lang.String r0 = r0.getText()
            java.lang.String r0 = r0.trim()
            r1 = -1
            boolean r1 = r2.showNameErrorMessage(r0, r1)
            if (r1 == 0) goto L12
            return
        L12:
            r2.createFromSelection(r0)
            r2.onAfterSelectionCreated()
            return
    }

    private void onExpandSelectionButtonClick() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r5.mSpriteSelector
            com.badlogic.gdx.math.Rectangle r0 = r0.getSelection()
            float r1 = r0.x
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L28
            float r1 = r0.y
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L28
            float r1 = r0.width
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L28
            float r0 = r0.height
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r5.mSpriteSelector
            r1 = 1
            r0.resetSelection(r1)
            goto L2d
        L28:
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r5.mSpriteSelector
            r0.setSelection(r3, r3, r2, r2)
        L2d:
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r5.mSpriteSelector
            com.badlogic.gdx.math.Rectangle r0 = r0.getRoundedClampedSelectionUV()
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r1 = r5.mSpritePreview
            float r2 = r0.x
            float r3 = r0.y
            float r4 = r0.width
            float r0 = r0.height
            r1.setUVs(r2, r3, r4, r0)
            r0 = 0
            r5.onLockXClick(r0)
            r5.onLockYClick(r0)
            r5.onLockWClick(r0)
            r5.onLockHClick(r0)
            return
    }

    private void onLockHClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r1.mSpriteSelector
            r0.setLockH(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1.mLockHButton
            r0.setChecked(r2)
            return
    }

    private void onLockWClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r1.mSpriteSelector
            r0.setLockW(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1.mLockWButton
            r0.setChecked(r2)
            return
    }

    private void onLockXClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r1.mSpriteSelector
            r0.setLockX(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1.mLockXButton
            r0.setChecked(r2)
            return
    }

    private void onLockYClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r1.mSpriteSelector
            r0.setLockY(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1.mLockYButton
            r0.setChecked(r2)
            return
    }

    private void onMaskButtonClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r1.mSpriteSelector
            r0.toggleMaskState()
            return
    }

    private void onMinecraftSkinClick() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r5.mSpriteSelector
            boolean r0 = r0.isLoaded()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r5.mSpriteSelector
            com.badlogic.gdx.graphics.Texture r0 = r0.getTexture()
            int r1 = r0.getWidth()
            r2 = 64
            if (r1 != r2) goto L1d
            int r1 = r0.getHeight()
            if (r1 == r2) goto L2c
        L1d:
            int r1 = r0.getWidth()
            r2 = 128(0x80, float:1.794E-43)
            if (r1 != r2) goto L4a
            int r1 = r0.getHeight()
            if (r1 == r2) goto L2c
            goto L4a
        L2c:
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$57 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$57
            r1.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r5._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r4 = r5.mAnimationBasedModuleRef
            r2.<init>(r3, r4)
            r2.setMinecraftSkinSelectorListener(r1)
            r2.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            r0.addDialogToStage(r2)
            r0 = 0
            r5.onAAButtonClick(r0)
            return
        L4a:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            java.lang.String r1 = "minecraftErrorTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "minecraftErrorInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
            return
    }

    private void onOriginButtonQuickSelect(int r5) {
            r4 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            if (r5 != 0) goto Lb
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r5 = r4.mSpriteSelector
            r5.setRelativeSpriteOrigin(r1, r0)
            goto L55
        Lb:
            r2 = 1
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r2) goto L16
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r5 = r4.mSpriteSelector
            r5.setRelativeSpriteOrigin(r3, r0)
            goto L55
        L16:
            r2 = 2
            if (r5 != r2) goto L1f
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r5 = r4.mSpriteSelector
            r5.setRelativeSpriteOrigin(r0, r0)
            goto L55
        L1f:
            r2 = 3
            if (r5 != r2) goto L28
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r5 = r4.mSpriteSelector
            r5.setRelativeSpriteOrigin(r1, r3)
            goto L55
        L28:
            r2 = 4
            if (r5 != r2) goto L31
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r5 = r4.mSpriteSelector
            r5.setRelativeSpriteOrigin(r3, r3)
            goto L55
        L31:
            r2 = 5
            if (r5 != r2) goto L3a
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r5 = r4.mSpriteSelector
            r5.setRelativeSpriteOrigin(r0, r3)
            goto L55
        L3a:
            r2 = 6
            if (r5 != r2) goto L43
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r5 = r4.mSpriteSelector
            r5.setRelativeSpriteOrigin(r1, r1)
            goto L55
        L43:
            r2 = 7
            if (r5 != r2) goto L4c
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r5 = r4.mSpriteSelector
            r5.setRelativeSpriteOrigin(r3, r1)
            goto L55
        L4c:
            r2 = 8
            if (r5 != r2) goto L55
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r5 = r4.mSpriteSelector
            r5.setRelativeSpriteOrigin(r0, r1)
        L55:
            return
    }

    private void onSaveEditsClick() {
            r7 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r7.mCreateNameTextField
            java.lang.String r0 = r0.getText()
            java.lang.String r0 = r0.trim()
            int r1 = r7.mEditingSelectionIndex
            boolean r1 = r7.showNameErrorMessage(r0, r1)
            if (r1 == 0) goto L13
            return
        L13:
            int r1 = r7.mEditingSelectionIndex
            r2 = 0
            r3 = -1
            if (r1 == r3) goto L4e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r4 = r7.mExistingSelectionsList
            java.lang.Object r1 = r4.get(r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r1 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData) r1
            r7.applyToSelectionData(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mExistingSelectionsTable
            com.badlogic.gdx.utils.SnapshotArray r0 = r0.getChildren()
            int r4 = r0.size
            int r4 = r4 + (-1)
        L2e:
            if (r4 < 0) goto L4e
            java.lang.Object r5 = r0.get(r4)
            boolean r5 = r5 instanceof org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.SpriteRegionItem
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r0.get(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$SpriteRegionItem r5 = (org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.SpriteRegionItem) r5
            r5.setIsHighlighted(r2)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r6 = r5.getData()
            if (r6 != r1) goto L4b
            r5.refresh()
            goto L4e
        L4b:
            int r4 = r4 + (-1)
            goto L2e
        L4e:
            r7.mEditingSelectionIndex = r3
            r0 = 0
            r7.mEditingSelectionDataRef = r0
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r7.mSpriteSelector
            r0.setEditingSelectionIndex(r3)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r7.mSpriteSelector
            com.badlogic.gdx.math.Rectangle r1 = r7.mRememberedSelectionPreEdit
            float r3 = r1.x
            float r4 = r1.y
            float r5 = r1.width
            float r1 = r1.height
            r0.setSelection(r3, r4, r5, r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r7.mSpriteSelector
            com.badlogic.gdx.math.Vector2 r1 = r7.mRememberedRelativeOriginPreEdit
            float r3 = r1.x
            float r1 = r1.y
            r0.setRelativeSpriteOrigin(r3, r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r7.mSpriteSelector
            com.badlogic.gdx.math.Vector2 r1 = r7.mRememberedInternalScalePreEdit
            float r1 = r1.x
            r0.setInternalScaleX(r1, r2)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r7.mSpriteSelector
            com.badlogic.gdx.math.Vector2 r1 = r7.mRememberedInternalScalePreEdit
            float r1 = r1.y
            r0.setInternalScaleY(r1, r2)
            org.fortheloss.framework.LabelInputIncrementSmallField r0 = r7.mInternalScaleXField
            com.badlogic.gdx.math.Vector2 r1 = r7.mRememberedInternalScalePreEdit
            float r1 = r1.x
            r0.setValue(r1)
            org.fortheloss.framework.LabelInputIncrementSmallField r0 = r7.mInternalScaleYField
            com.badlogic.gdx.math.Vector2 r1 = r7.mRememberedInternalScalePreEdit
            float r1 = r1.y
            r0.setValue(r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r7.mSpriteSelector
            int r1 = r7.mRememberedMaskStatePreEdit
            r0.setMaskState(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r7.mCreateNameTextField
            java.lang.String r1 = r7.mRememberedNamePreEdit
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r7.mCreateNameTextField
            java.lang.String r1 = ""
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r7.mEditButtonsTableCell
            r0.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mImportSpritesButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mImportSpritesButton
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mClearButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mClearButton
            r0.setColor(r2, r2, r2, r2)
            boolean r0 = r7.mMinecraftEnabled
            if (r0 == 0) goto Ld6
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mMinecraftButton
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mMinecraftButton
            r0.setColor(r2, r2, r2, r2)
        Ld6:
            return
    }

    private void onShowHidePreviewClick(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L17
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget> r2 = r1.mPreviewWidgetCell
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            if (r2 != 0) goto L1d
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget> r2 = r1.mPreviewWidgetCell
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r0 = r1.mSpritePreview
            r2.setActor(r0)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r2 = r1.mSpritePreview
            r2.computeSize()
            goto L1d
        L17:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget> r2 = r1.mPreviewWidgetCell
            r0 = 0
            r2.setActor(r0)
        L1d:
            return
    }

    private void onTransparencyButtonClick(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r2.mSpriteSelector
            r0.setIsTransparent(r3)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r0 = r2.mSpritePreview
            r0.setIsTransparent(r3)
            if (r3 == 0) goto L1a
            org.fortheloss.framework.ColorPicker r0 = r2.mBgColorPicker
            r1 = 1
            r0.disableWithAlpha(r1)
            org.fortheloss.framework.ColorPicker r0 = r2.mBgColorPicker
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            goto L27
        L1a:
            org.fortheloss.framework.ColorPicker r0 = r2.mBgColorPicker
            r1 = 0
            r0.disableWithAlpha(r1)
            org.fortheloss.framework.ColorPicker r0 = r2.mBgColorPicker
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
        L27:
            if (r3 != 0) goto L3f
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r2.mSpriteSelector
            org.fortheloss.framework.ColorPicker r1 = r2.mBgColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setBackgroundColor(r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r0 = r2.mSpritePreview
            org.fortheloss.framework.ColorPicker r1 = r2.mBgColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setBackgroundColor(r1)
        L3f:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2.mTransparencyCheckbox
            r0.setChecked(r3)
            return
    }

    private boolean showNameErrorMessage(java.lang.String r5, int r6) {
            r4 = this;
            int r0 = r5.length()
            java.lang.String r1 = "namingErrorTitle"
            r2 = 1
            if (r0 > 0) goto L19
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4._animationScreenRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r0 = "namingErrorInfo1"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r5.showErrorDialog(r6, r0)
            return r2
        L19:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r4.mExistingSelectionsList
            int r0 = r0.size()
            int r0 = r0 - r2
        L20:
            if (r0 < 0) goto L47
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r3 = r4.mExistingSelectionsList
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r3 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData) r3
            java.lang.String r3 = r3.name
            boolean r3 = r3.equalsIgnoreCase(r5)
            if (r3 == 0) goto L44
            if (r0 == r6) goto L44
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4._animationScreenRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r0 = "namingErrorInfo2"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r5.showErrorDialog(r6, r0)
            return r2
        L44:
            int r0 = r0 + (-1)
            goto L20
        L47:
            r5 = 0
            return r5
    }

    private void toggleMainTable() {
            r4 = this;
            r0 = 1
            r4.setDoNotPreserveScrollPercentFlag(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r4.mMainCell
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r4.mCreateTable
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 != r2) goto L30
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r4.mMainCell
            r1.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r4.mMainCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r4.mAdvancedTable
            r1.setActor(r2)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r4.mSpriteSelector
            r1.setMode(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4.mExpandButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4.mExpandButton
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r3, r3, r3, r1)
            goto L4e
        L30:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r4.mMainCell
            r0.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r4.mMainCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4.mCreateTable
            r0.setActor(r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r4.mSpriteSelector
            r1 = 0
            r0.setMode(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4.mExpandButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4.mExpandButton
            r0.setColor(r3, r3, r3, r3)
        L4e:
            return
    }

    private void updateImportButton() {
            r5 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r5.mExistingSelectionsList
            int r0 = r0.size()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r5.mImportSpritesButton
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "importSprites"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3, r2)
            r1.setText(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L36
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.mImportSpritesButton
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.mImportSpritesButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.mClearButton
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.mClearButton
            r0.setTouchable(r2)
            goto L4e
        L36:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.mImportSpritesButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.mImportSpritesButton
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.mClearButton
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.mClearButton
            r0.setTouchable(r3)
        L4e:
            return
    }

    private org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData validateInputs(java.lang.String r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, int r27) {
            r17 = this;
            r0 = r17
            r15 = r27
            r1 = 0
            r2 = 0
            int r3 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r3 < 0) goto Lce
            int r3 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r3 < 0) goto Lce
            int r3 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r3 < 0) goto Lce
            int r1 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r1 < 0) goto Lce
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r3 > 0) goto Lce
            int r3 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r3 > 0) goto Lce
            int r3 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r3 > 0) goto Lce
            int r1 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r1 > 0) goto Lce
            float r1 = r19 + r21
            r3 = 1065361605(0x3f8020c5, float:1.001)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto Lce
            float r1 = r20 + r22
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L39
            goto Lce
        L39:
            r1 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            int r3 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r3 < 0) goto Lce
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 >= 0) goto L46
            goto Lce
        L46:
            r1 = 1176255488(0x461c3c00, float:9999.0)
            int r3 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r3 > 0) goto Lce
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 <= 0) goto L53
            goto Lce
        L53:
            r1 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r3 < 0) goto Lce
            int r1 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r1 >= 0) goto L60
            goto Lce
        L60:
            r1 = 1120402145(0x42c7fae1, float:99.99)
            int r3 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r3 > 0) goto Lce
            int r1 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r1 <= 0) goto L6c
            goto Lce
        L6c:
            if (r15 < 0) goto Lce
            r1 = 5
            if (r15 <= r1) goto L72
            goto Lce
        L72:
            boolean r1 = r17.isFilenameValid(r18)
            if (r1 != 0) goto L79
            return r2
        L79:
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r0.mSpriteSelector
            float r1 = r1.getTextureWidth()
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r2 = r0.mSpriteSelector
            float r2 = r2.getTextureHeight()
            float r3 = r19 * r1
            int r7 = java.lang.Math.round(r3)
            float r3 = r20 * r2
            int r8 = java.lang.Math.round(r3)
            float r3 = (float) r7
            float r3 = r3 / r1
            float r3 = r3 - r19
            float r3 = r21 - r3
            float r3 = r3 * r1
            int r1 = java.lang.Math.round(r3)
            r3 = 1
            int r9 = java.lang.Math.max(r1, r3)
            float r1 = (float) r8
            float r1 = r1 / r2
            float r1 = r1 - r20
            float r1 = r22 - r1
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            int r10 = java.lang.Math.max(r1, r3)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r16 = new org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData
            r1 = r16
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r14 = r26
            r15 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
        Lce:
            return r2
    }

    private boolean verifyNamesAreUnique() {
            r7 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7.mExistingSelectionsTable
            com.badlogic.gdx.utils.SnapshotArray r0 = r0.getChildren()
            int r1 = r0.size
            r2 = 1
            int r1 = r1 - r2
            r3 = 1
        Lb:
            if (r1 < 0) goto L2b
            java.lang.Object r4 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$SpriteRegionItem r4 = (org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.SpriteRegionItem) r4
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r5 = r4.mDataRef
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r6 = r7.mAnimationBasedModuleRef
            java.lang.String r5 = r5.name
            boolean r5 = r6.isSpriteNameUnique(r5)
            r6 = 0
            if (r5 == 0) goto L24
            r4.setError(r6)
            goto L28
        L24:
            r4.setError(r2)
            r3 = 0
        L28:
            int r1 = r1 + (-1)
            goto Lb
        L2b:
            return r3
    }

    protected int convertFromTextData(java.lang.String r25, boolean r26, java.lang.String r27) {
            r24 = this;
            r11 = r24
            r12 = r27
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            java.lang.Class<java.lang.Integer> r14 = java.lang.Integer.class
            java.lang.Class<java.lang.Float> r15 = java.lang.Float.class
            java.lang.String r10 = r25.trim()
            if (r26 != 0) goto L18
            r24.clearExistingSelections()
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0 = r11.mSpriteSelector
            r0.resetSelection()
        L18:
            r16 = 0
            r0 = 0
            r9 = 0
            r17 = 0
        L1e:
            java.lang.String r1 = r10.substring(r9)
            r2 = 91
            int r2 = r1.indexOf(r2)
            r3 = 93
            int r8 = r1.indexOf(r3)
            r3 = -1
            r7 = 1
            if (r2 != r3) goto L33
            return r7
        L33:
            r4 = 2
            if (r8 != r3) goto L37
            return r4
        L37:
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2, r8)
            java.lang.String r1 = r1.trim()
            int r2 = r1.length()
            r5 = 3
            r18 = 5
            r6 = 4
            if (r2 > 0) goto L52
            if (r17 != 0) goto L4e
            return r6
        L4e:
            if (r0 != 0) goto L51
            return r18
        L51:
            return r5
        L52:
            r2 = 0
            java.lang.String r4 = ";"
            if (r17 != 0) goto Lc4
            java.lang.String[] r1 = r1.split(r4)     // Catch: java.lang.Exception -> Lc3
            int r4 = r1.length     // Catch: java.lang.Exception -> Lc3
            if (r4 == r5) goto L5f
            return r6
        L5f:
            r4 = r1[r16]     // Catch: java.lang.Exception -> Lc3
            java.lang.Object r2 = r11.getToken(r4, r13, r2)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lc3
            r4 = r1[r7]     // Catch: java.lang.Exception -> Lc3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Lc3
            java.lang.Object r4 = r11.getToken(r4, r14, r5)     // Catch: java.lang.Exception -> Lc3
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> Lc3
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> Lc3
            r5 = 2
            r1 = r1[r5]     // Catch: java.lang.Exception -> Lc3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Lc3
            java.lang.Object r1 = r11.getToken(r1, r14, r3)     // Catch: java.lang.Exception -> Lc3
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> Lc3
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lc3
            com.badlogic.gdx.graphics.Color r3 = new com.badlogic.gdx.graphics.Color     // Catch: java.lang.Exception -> Lc3
            com.badlogic.gdx.graphics.Color r2 = com.badlogic.gdx.graphics.Color.valueOf(r2)     // Catch: java.lang.Exception -> Lc3
            r3.<init>(r2)     // Catch: java.lang.Exception -> Lc3
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.a = r2     // Catch: java.lang.Exception -> Lc3
            if (r4 < 0) goto Lc3
            if (r4 <= r7) goto L9a
            goto Lc3
        L9a:
            if (r1 < 0) goto Lc3
            if (r1 <= r7) goto L9f
            goto Lc3
        L9f:
            if (r26 != 0) goto Lb9
            org.fortheloss.framework.ColorPicker r2 = r11.mBgColorPicker     // Catch: java.lang.Exception -> Lc3
            r2.setColor(r3)     // Catch: java.lang.Exception -> Lc3
            r24.onBgColorSelect()     // Catch: java.lang.Exception -> Lc3
            if (r4 != r7) goto Lad
            r2 = 1
            goto Lae
        Lad:
            r2 = 0
        Lae:
            r11.onTransparencyButtonClick(r2)     // Catch: java.lang.Exception -> Lc3
            if (r1 != r7) goto Lb5
            r1 = 1
            goto Lb6
        Lb5:
            r1 = 0
        Lb6:
            r11.onAAButtonClick(r1)     // Catch: java.lang.Exception -> Lc3
        Lb9:
            r20 = r8
            r21 = r9
            r22 = r10
            r17 = 1
            goto L1ab
        Lc3:
            return r6
        Lc4:
            java.lang.String[] r0 = r1.split(r4)     // Catch: java.lang.Exception -> L1bd
            int r1 = r0.length     // Catch: java.lang.Exception -> L1bd
            r4 = 10
            if (r1 == r4) goto Lce
            return r18
        Lce:
            r1 = r0[r16]     // Catch: java.lang.Exception -> L1bd
            java.lang.Object r1 = r11.getToken(r1, r13, r2)     // Catch: java.lang.Exception -> L1bd
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L1bd
            r2 = r0[r7]     // Catch: java.lang.Exception -> L1bd
            r4 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r7 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Exception -> L1bd
            java.lang.Object r2 = r11.getToken(r2, r15, r7)     // Catch: java.lang.Exception -> L1bd
            java.lang.Float r2 = (java.lang.Float) r2     // Catch: java.lang.Exception -> L1bd
            float r2 = r2.floatValue()     // Catch: java.lang.Exception -> L1bd
            r7 = 2
            r7 = r0[r7]     // Catch: java.lang.Exception -> L1bd
            java.lang.Float r3 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Exception -> L1bd
            java.lang.Object r3 = r11.getToken(r7, r15, r3)     // Catch: java.lang.Exception -> L1bd
            java.lang.Float r3 = (java.lang.Float) r3     // Catch: java.lang.Exception -> L1bd
            float r3 = r3.floatValue()     // Catch: java.lang.Exception -> L1bd
            r5 = r0[r5]     // Catch: java.lang.Exception -> L1bd
            java.lang.Float r7 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Exception -> L1bd
            java.lang.Object r5 = r11.getToken(r5, r15, r7)     // Catch: java.lang.Exception -> L1bd
            java.lang.Float r5 = (java.lang.Float) r5     // Catch: java.lang.Exception -> L1bd
            float r5 = r5.floatValue()     // Catch: java.lang.Exception -> L1bd
            r6 = r0[r6]     // Catch: java.lang.Exception -> L1bd
            java.lang.Float r7 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Exception -> L1bd
            java.lang.Object r6 = r11.getToken(r6, r15, r7)     // Catch: java.lang.Exception -> L1bd
            java.lang.Float r6 = (java.lang.Float) r6     // Catch: java.lang.Exception -> L1bd
            float r6 = r6.floatValue()     // Catch: java.lang.Exception -> L1bd
            r7 = r0[r18]     // Catch: java.lang.Exception -> L1bd
            r20 = r8
            java.lang.Float r8 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Exception -> L1bd
            java.lang.Object r7 = r11.getToken(r7, r15, r8)     // Catch: java.lang.Exception -> L1bd
            java.lang.Float r7 = (java.lang.Float) r7     // Catch: java.lang.Exception -> L1bd
            float r7 = r7.floatValue()     // Catch: java.lang.Exception -> L1bd
            r8 = 6
            r8 = r0[r8]     // Catch: java.lang.Exception -> L1bd
            r21 = r9
            java.lang.Float r9 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Exception -> L1bd
            java.lang.Object r8 = r11.getToken(r8, r15, r9)     // Catch: java.lang.Exception -> L1bd
            java.lang.Float r8 = (java.lang.Float) r8     // Catch: java.lang.Exception -> L1bd
            float r8 = r8.floatValue()     // Catch: java.lang.Exception -> L1bd
            r9 = 7
            r9 = r0[r9]     // Catch: java.lang.Exception -> L1bd
            r22 = r10
            java.lang.Float r10 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Exception -> L1bd
            java.lang.Object r9 = r11.getToken(r9, r15, r10)     // Catch: java.lang.Exception -> L1bd
            java.lang.Float r9 = (java.lang.Float) r9     // Catch: java.lang.Exception -> L1bd
            float r9 = r9.floatValue()     // Catch: java.lang.Exception -> L1bd
            r10 = 8
            r10 = r0[r10]     // Catch: java.lang.Exception -> L1bd
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Exception -> L1bd
            java.lang.Object r4 = r11.getToken(r10, r15, r4)     // Catch: java.lang.Exception -> L1bd
            java.lang.Float r4 = (java.lang.Float) r4     // Catch: java.lang.Exception -> L1bd
            float r10 = r4.floatValue()     // Catch: java.lang.Exception -> L1bd
            r4 = 9
            r0 = r0[r4]     // Catch: java.lang.Exception -> L1bd
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1bd
            java.lang.Object r0 = r11.getToken(r0, r14, r4)     // Catch: java.lang.Exception -> L1bd
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L1bd
            int r23 = r0.intValue()     // Catch: java.lang.Exception -> L1bd
            if (r12 == 0) goto L188
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1bd
            r0.<init>()     // Catch: java.lang.Exception -> L1bd
            r0.append(r12)     // Catch: java.lang.Exception -> L1bd
            r0.append(r1)     // Catch: java.lang.Exception -> L1bd
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1bd
            r1 = r0
        L188:
            r0 = r24
            r4 = r5
            r5 = r6
            r6 = r7
            r19 = 1
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r23
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r0 = r0.validateInputs(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L1bd
            if (r0 != 0) goto L19b
            return r18
        L19b:
            if (r26 != 0) goto L1aa
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r1 = r11.mExistingSelectionsList     // Catch: java.lang.Exception -> L1bd
            r1.add(r0)     // Catch: java.lang.Exception -> L1bd
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r11.mSpriteSelector     // Catch: java.lang.Exception -> L1bd
            r1.addExistingSelection(r0)     // Catch: java.lang.Exception -> L1bd
            r24.onAfterSelectionCreated()     // Catch: java.lang.Exception -> L1bd
        L1aa:
            r0 = 1
        L1ab:
            int r8 = r20 + 1
            int r9 = r21 + r8
            int r1 = r22.length()
            if (r9 < r1) goto L1b9
            if (r0 != 0) goto L1b8
            return r18
        L1b8:
            return r16
        L1b9:
            r10 = r22
            goto L1e
        L1bd:
            return r18
    }

    public void convertFromTextData(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.convertFromTextData(r2, r0, r3)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r4.mIsInitiated
            if (r0 != 0) goto L8
            r4.doNotHideDialog()
            return
        L8:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0 = 2
            if (r5 != r0) goto L19
            r4.doNotHideDialog()
            r4.onMinecraftSkinClick()
            goto Le4
        L19:
            r0 = 1
            if (r5 != r0) goto L78
            r4.doNotHideDialog()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r4.mCreateNameTextField
            java.lang.String r5 = r5.getText()
            int r5 = r5.length()
            if (r5 <= 0) goto L54
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$1 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r5.<init>(r4, r0)
            java.lang.String r0 = "unsavedSelectionTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r1 = "unsavedSelectionInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "okay"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r3 = "cancel"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r5.initialize(r0, r1, r2, r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r0.addDialogToStage(r5)
            goto Le4
        L54:
            boolean r5 = r4.verifyNamesAreUnique()
            if (r5 == 0) goto L65
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r5 = r4.mMessageCell
            r0 = 0
            r5.setActor(r0)
            r4.importSelections()
            goto Le4
        L65:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r5 = r4.mMessageCell
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4.mMessageLabel
            r5.setActor(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.mMessageLabel
            java.lang.String r0 = "namingErrorInfo3"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r5.setText(r0)
            goto Le4
        L78:
            r0 = 3
            java.lang.String r1 = "no"
            java.lang.String r2 = "yes"
            java.lang.String r3 = "areYouSure"
            if (r5 != r0) goto Lb1
            r4.doNotHideDialog()
            r4.onExpandSelectionButtonClick()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r5 = r4.mExistingSelectionsList
            int r5 = r5.size()
            if (r5 <= 0) goto Le4
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$2 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r5.<init>(r4, r0)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r3 = "removeSelections"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r5.initialize(r0, r3, r2, r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r0.addDialogToStage(r5)
            goto Le4
        Lb1:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r5 = r4.mExistingSelectionsList
            int r5 = r5.size()
            if (r5 <= 0) goto Lde
            r4.doNotHideDialog()
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$3 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$3
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r5.<init>(r4, r0)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r3 = "loseUnsavedSprites"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r5.initialize(r0, r3, r2, r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r0.addDialogToStage(r5)
            goto Le4
        Lde:
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r5 = r4.mSpriteSelector
            r0 = 0
            r5.setOutlinesEnabled(r0)
        Le4:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3.mAssetsRef = r0
            r3.mDefaultImageSizeText = r0
            r3.mImageSizeLabel = r0
            r3.mAaCheckbox = r0
            r3.mTransparencyCheckbox = r0
            r3.mRemoveBackgroundButton = r0
            r3.mExpandButton = r0
            r3.mCreateNameTextField = r0
            r3.mOkayButton = r0
            r3.mXLabel = r0
            r3.mYLabel = r0
            r3.mWLabel = r0
            r3.mHLabel = r0
            r3.mLockXButton = r0
            r3.mLockYButton = r0
            r3.mLockWButton = r0
            r3.mLockHButton = r0
            r3.mMaskButton = r0
            r3.mAdvancedButton = r0
            r3.mExistingSelectionsTable = r0
            r3.mImportSpritesButton = r0
            r3.mClearButton = r0
            r3.mMinecraftButton = r0
            r3.mPreviewTable = r0
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool r1 = r3.mSpriteImporterTool
            if (r1 == 0) goto L3a
            r1.dispose()
            r3.mSpriteImporterTool = r0
        L3a:
            org.fortheloss.framework.ColorPicker r1 = r3.mBgColorPicker
            if (r1 == 0) goto L43
            r1.dispose()
            r3.mBgColorPicker = r0
        L43:
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r1 = r3.mSpriteSelector
            if (r1 == 0) goto L4c
            r1.dispose()
            r3.mSpriteSelector = r0
        L4c:
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r3.mInternalScaleXField
            if (r1 == 0) goto L55
            r1.dispose()
            r3.mInternalScaleXField = r0
        L55:
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r3.mInternalScaleYField
            if (r1 == 0) goto L5e
            r1.dispose()
            r3.mInternalScaleYField = r0
        L5e:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r1 = r3.mExistingSelectionsList
            if (r1 == 0) goto L7a
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L68:
            if (r1 < 0) goto L78
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r2 = r3.mExistingSelectionsList
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r2 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L68
        L78:
            r3.mExistingSelectionsList = r0
        L7a:
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r1 = r3.mSpritePreview
            if (r1 == 0) goto L83
            r1.dispose()
            r3.mSpritePreview = r0
        L83:
            r3.mPreviewWidgetCell = r0
            r3.mMessageLabel = r0
            r3.mMessageCell = r0
            r3.mCreateTable = r0
            r3.mAdvancedTable = r0
            r3.mMainCell = r0
            r3.mRememberedSelectionPreEdit = r0
            r3.mRememberedNamePreEdit = r0
            r3.mRememberedRelativeOriginPreEdit = r0
            r3.mRememberedInternalScalePreEdit = r0
            r3.mEditingSelectionDataRef = r0
            r3.mEditButtonsTableCell = r0
            r3.mEditButtonsTable = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r1 = r3.mImportingSpritesDialogRef
            if (r1 == 0) goto Lb2
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r1 = r1.getDialog()
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            if (r1 == 0) goto Lb2
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r1 = r3.mImportingSpritesDialogRef
            r1.hideImmediately()
            r3.mImportingSpritesDialogRef = r0
        Lb2:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.Pixmap r38) {
            r37 = this;
            r9 = r37
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.String r1 = "createSpriteDialogTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            super.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r9._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r10 = r1.getSessionData()
            org.fortheloss.framework.Assets r1 = r9.mAssetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.animationMenuAtlas
            r11 = 1
            java.lang.Object r1 = r1.get(r2, r0, r11)
            r12 = r1
            com.badlogic.gdx.graphics.g2d.TextureAtlas r12 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r12
            org.fortheloss.framework.Assets r1 = r9.mAssetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            java.lang.Object r1 = r1.get(r2, r0, r11)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            org.fortheloss.framework.Assets r2 = r9.mAssetsRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.colorPickerAtlas
            java.lang.Object r0 = r2.get(r3, r0, r11)
            r4 = r0
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r4
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            r9.mRememberedSelectionPreEdit = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r9.mRememberedRelativeOriginPreEdit = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r9.mRememberedInternalScalePreEdit = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r37.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceLeft(r13)
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r0.uniform(r14, r14)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r37.getDialogScrollPane()
            r0.setScrollbarsOnTop(r11)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$4 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$4
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r9._animationScreenRef
            r0.<init>(r9, r2)
            r9.mSpriteImporterTool = r0
            boolean r0 = r10.getNerdModeEnabled()
            r8 = 2
            if (r0 != 0) goto L9c
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "createSpriteDialogInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r3)
            r0.setWrap(r11)
            r0.setAlignment(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r8)
            r37.addContentRow()
        L9c:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r2 = "1920 x 1080"
            r0[r14] = r2
            java.lang.String r2 = "spriteResize"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r2, r0)
            r9.mDefaultImageSizeText = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = r9.mDefaultImageSizeText
            java.lang.String r3 = "imageLoading"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = "\n"
            r5.append(r2)
            r5.append(r3)
            java.lang.String r7 = "..."
            r5.append(r7)
            java.lang.String r2 = r5.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r3)
            r9.mImageSizeLabel = r0
            r0.setWrap(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r9.mImageSizeLabel
            r0.setAlignment(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r9.mImageSizeLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r8)
            r37.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r3)
            java.lang.String r6 = ""
            r0.<init>(r6, r2)
            r9.mMessageLabel = r0
            r0.setWrap(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r9.mMessageLabel
            r0.setAlignment(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r9.mMessageLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r0.getStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r2 = r2.fontColor
            r0.set(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r9.mMessageLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r8)
            r9.mMessageCell = r0
            r2 = 0
            r0.setActor(r2)
            r37.addContentRow()
            java.lang.String r0 = "e_sprite_transparency"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r0)
            java.lang.String r0 = "square_for_colorpicker"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r4.findRegion(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r2.pad(r13)
            r1 = 10
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r13)
            r11 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r11)
            r0.uniform(r14, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.align(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r0.pad(r13)
            r8.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.pad(r13)
            float r17 = org.fortheloss.sticknodes.App.assetScaling
            r18 = 1092616192(0x41200000, float:10.0)
            float r1 = r17 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r8.space(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.align(r11)
            r1.uniform(r14, r14)
            r8 = 1065353216(0x3f800000, float:1.0)
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r8, r8, r8, r1)
            com.badlogic.gdx.scenes.scene2d.Touchable r14 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r20 = r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r20 = r20.expandX()
            r20.fillX()
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSpriteRemoveBackgroundButtonStyle()
            r1.<init>(r11)
            r9.mRemoveBackgroundButton = r1
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$5 r11 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$5
            r11.<init>(r9, r5)
            r1.addListener(r11)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r9.mRemoveBackgroundButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r11 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            r11.<init>(r6, r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$6 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$6
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r8 = r9.mAnimationBasedModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r8 = r8.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r22 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r23 = org.fortheloss.sticknodes.App.assetScaling
            float r23 = r23 * r18
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r13 = r9._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r13 = r13.getSessionData()
            boolean r13 = r13.getIsLeftHandMode()
            r24 = r15
            r15 = r0
            r0 = r1
            r25 = r12
            r12 = r1
            r1 = r37
            r26 = r2
            r2 = r8
            r8 = r3
            r3 = r22
            r19 = r5
            r5 = r23
            r27 = r6
            r6 = r13
            r13 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.mBgColorPicker = r12
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$7 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$7
            r0.<init>(r9)
            r12.addListener(r0)
            org.fortheloss.framework.ColorPicker r0 = r9.mBgColorPicker
            r1 = 1058444951(0x3f169697, float:0.5882353)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r0.setColor(r3, r1, r2, r2)
            org.fortheloss.framework.ColorPicker r0 = r9.mBgColorPicker
            r1 = 1
            r0.disableWithAlpha(r1)
            org.fortheloss.framework.ColorPicker r0 = r9.mBgColorPicker
            r0.setTouchable(r14)
            org.fortheloss.framework.ColorPicker r0 = r9.mBgColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r15.add(r0)
            float r1 = r11.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            float r1 = r11.getHeight()
            r0.height(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox
            java.lang.String r1 = "transparentMemory"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            r0.<init>(r1, r2)
            r9.mTransparencyCheckbox = r0
            r1 = 1
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9.mTransparencyCheckbox
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$8 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$8
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9.mTransparencyCheckbox
            r15.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox
            java.lang.String r1 = "antiAlias"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            r0.<init>(r1, r2)
            r9.mAaCheckbox = r0
            r1 = 1
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9.mAaCheckbox
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$9 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$9
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r9.mAaCheckbox
            r15.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Widget r0 = new com.badlogic.gdx.scenes.scene2d.ui.Widget
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r15.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSpriteZoomInButtonStyle()
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$10 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$10
            r1.<init>(r9)
            r0.addListener(r1)
            r15.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSpriteZoomOutButtonStyle()
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$11 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$11
            r1.<init>(r9)
            r0.addListener(r1)
            r15.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSpriteExpandButtonStyle()
            r0.<init>(r1)
            r9.mExpandButton = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$12 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$12
            r1.<init>(r9)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r9.mExpandButton
            r15.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r11.<init>()
            r0 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r11.pad(r0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r1.padTop(r2)
            r12 = 16
            r1.align(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r11.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r2)
            r2 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.align(r2)
            r2 = 0
            r1.uniform(r2, r2)
            r7 = 1065353216(0x3f800000, float:1.0)
            r11.setColor(r7, r7, r7, r0)
            r11.setTouchable(r14)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool r0 = r9.mSpriteImporterTool
            com.badlogic.gdx.graphics.Texture[] r0 = r0.getMaskTextures()
            r16 = 2
            r6 = r0[r16]
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$13 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$13
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r9._animationScreenRef
            org.fortheloss.sticknodes.SNShapeRenderer r20 = r0.getShapeRenderer()
            int r0 = r10.getOpenGLLineWidth()
            float r4 = (float) r0
            r0 = r5
            r1 = r37
            r2 = r19
            r3 = r8
            r21 = r4
            r4 = r6
            r12 = r5
            r5 = r20
            r28 = r6
            r6 = r21
            r20 = 1065353216(0x3f800000, float:1.0)
            r7 = r15
            r16 = r8
            r15 = 1065353216(0x3f800000, float:1.0)
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mSpriteSelector = r12
            r0 = r26
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r12)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r3 = 1069547520(0x3fc00000, float:1.5)
            float r2 = r2 * r3
            r1.width(r2)
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r0.fillX()
            java.lang.String r0 = "importExportRegions"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.createTextButton(r0, r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$14 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$14
            r1.<init>(r9)
            r0.addListener(r1)
            r11.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r9.mCreateTable = r0
            r0.setTouchable(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mCreateTable
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r15, r15, r15, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mCreateTable
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1101004800(0x41a00000, float:20.0)
            float r2 = r2 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r2)
            r2 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.padTop(r2)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.padRight(r4)
            r4 = 10
            r0.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r2)
            r2 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r2)
            r2 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r2, r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r0.padRight(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r9.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            float r2 = r2 * r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r2)
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r2)
            r9.mMainCell = r0
            r37.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r9.mEditButtonsTable = r0
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTableGrayBackground()
            r0.setBackground(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mEditButtonsTable
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r2)
            r0.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mEditButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            r2 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r2)
            r2 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r2)
            r2 = 0
            r0.uniform(r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9.mEditButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            r2 = 3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r9.mEditButtonsTableCell = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mCreateTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "editing"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r13)
            java.lang.String r5 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r0.<init>(r5, r6)
            r5 = 8
            r0.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9.mEditButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r5 = 2
            r0.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9.mEditButtonsTable
            r0.row()
            java.lang.String r0 = "saveEdits"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r5 = 0
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.createTextButton(r0, r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$15 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$15
            r6.<init>(r9)
            r0.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r9.mEditButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r6.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            r6 = 16
            r0.align(r6)
            java.lang.String r0 = "cancel"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r9.createTextButton(r6, r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$16 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$16
            r5.<init>(r9)
            r6.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9.mEditButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandX()
            r6 = 8
            r5.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r5 = r9.mEditButtonsTableCell
            r5.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "spriteName"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r5.<init>(r7, r8)
            r5.setAlignment(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r6.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.fillX()
            r5.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9.mCreateTable
            r5.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r5.<init>()
            r6 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r5.pad(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.pad(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.space(r6)
            r6 = 16
            r7.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.fillX()
            r6.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r9.mCreateTable
            r6.row()
            r6 = 40
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r7 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r7.<init>()
            r8 = r27
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r9.createTextField(r8, r6, r7)
            r9.mCreateNameTextField = r6
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$17 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$17
            r7.<init>(r9)
            r6.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r9.mCreateNameTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$18 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$18
            r7.<init>(r9)
            r6.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r9.mCreateNameTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.fillX()
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r7 = (float) r7
            r6.height(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getAddButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r9.createImageTextButton(r8, r6)
            r9.mOkayButton = r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.getImageCell()
            r7 = 1090519040(0x41000000, float:8.0)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r7
            r6.padLeft(r8)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r9.mOkayButton
            r7 = 1048576000(0x3e800000, float:0.25)
            r6.setColor(r15, r15, r15, r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r9.mOkayButton
            r6.setTouchable(r14)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r9.mOkayButton
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$19 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$19
            r7.<init>(r9)
            r6.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r9.mOkayButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r6)
            r6 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r9.mOkayButton
            float r6 = r6.getWidth()
            float r6 = r6 * r1
            r5.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r5.<init>()
            r6 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r5.pad(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.pad(r6)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r7.space(r6)
            r7 = 16
            r6.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r9.mCreateTable
            r6.add(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$20 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$20
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r8 = "-"
            r11 = 1045220557(0x3e4ccccd, float:0.2)
            r6.<init>(r9, r8, r7, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r6.getLabel()
            r12 = 1
            r7.setWrap(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r6.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.getCell(r7)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            r21 = 1082130432(0x40800000, float:4.0)
            float r15 = r12 * r21
            float r12 = r12 * r21
            r4 = 0
            r7.pad(r4, r15, r4, r12)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$21 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$21
            r4.<init>(r9)
            r6.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r5.add(r6)
            float r6 = r6.getWidth()
            float r6 = r6 * r1
            r4.width(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$22 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$22
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r7 = "+"
            r4.<init>(r9, r7, r6, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r4.getLabel()
            r12 = 1
            r6.setWrap(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r4.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.getCell(r6)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r15 = r12 * r21
            float r12 = r12 * r21
            r3 = 0
            r6.pad(r3, r15, r3, r12)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$23 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$23
            r3.<init>(r9)
            r4.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r5.add(r4)
            float r4 = r4.getWidth()
            float r4 = r4 * r1
            r3.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            java.lang.String r5 = "X:"
            r3.<init>(r5, r4)
            r9.mXLabel = r3
            r4 = 8
            r3.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r9.mXLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r3.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSpriteLockButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r3)
            r9.mLockXButton = r3
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$24 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$24
            r4.<init>(r9)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r9.mLockXButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            r4 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r9.mLockXButton
            float r4 = r4.getWidth()
            r3.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r3.<init>()
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r3.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.pad(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r5.space(r4)
            r5 = 16
            r4.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mCreateTable
            r4.add(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$25 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$25
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r4.<init>(r9, r8, r5, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.getLabel()
            r6 = 1
            r5.setWrap(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.getCell(r5)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r6 * r21
            float r6 = r6 * r21
            r15 = 0
            r5.pad(r15, r12, r15, r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$26 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$26
            r5.<init>(r9)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r3.add(r4)
            float r4 = r4.getWidth()
            float r4 = r4 * r1
            r5.width(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$27 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$27
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r4.<init>(r9, r7, r5, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.getLabel()
            r6 = 1
            r5.setWrap(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.getCell(r5)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r6 * r21
            float r6 = r6 * r21
            r15 = 0
            r5.pad(r15, r12, r15, r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$28 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$28
            r5.<init>(r9)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            float r4 = r4.getWidth()
            float r4 = r4 * r1
            r3.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            java.lang.String r5 = "Y:"
            r3.<init>(r5, r4)
            r9.mYLabel = r3
            r4 = 8
            r3.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r9.mYLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r3.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSpriteLockButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r3)
            r9.mLockYButton = r3
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$29 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$29
            r4.<init>(r9)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r9.mLockYButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            r4 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r9.mLockXButton
            float r4 = r4.getWidth()
            r3.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r3.<init>()
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r3.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.pad(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r5.space(r4)
            r5 = 16
            r4.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mCreateTable
            r4.add(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$30 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$30
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r4.<init>(r9, r8, r5, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.getLabel()
            r6 = 1
            r5.setWrap(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.getCell(r5)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r6 * r21
            float r6 = r6 * r21
            r15 = 0
            r5.pad(r15, r12, r15, r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$31 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$31
            r5.<init>(r9)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r3.add(r4)
            float r4 = r4.getWidth()
            float r4 = r4 * r1
            r5.width(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$32 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$32
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r4.<init>(r9, r7, r5, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.getLabel()
            r6 = 1
            r5.setWrap(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.getCell(r5)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r6 * r21
            float r6 = r6 * r21
            r15 = 0
            r5.pad(r15, r12, r15, r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$33 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$33
            r5.<init>(r9)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            float r4 = r4.getWidth()
            float r4 = r4 * r1
            r3.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "width_letter"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toUpperCase(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = ":"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r4, r6)
            r9.mWLabel = r3
            r4 = 8
            r3.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r9.mWLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r3.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSpriteLockButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r3)
            r9.mLockWButton = r3
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$34 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$34
            r4.<init>(r9)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r9.mLockWButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            r4 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r9.mLockXButton
            float r4 = r4.getWidth()
            r3.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r3.<init>()
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r3.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.pad(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r6.space(r4)
            r6 = 16
            r4.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mCreateTable
            r4.add(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$35 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$35
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r4.<init>(r9, r8, r6, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r4.getLabel()
            r8 = 1
            r6.setWrap(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r4.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.getCell(r6)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r8 * r21
            float r8 = r8 * r21
            r15 = 0
            r6.pad(r15, r12, r15, r8)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$36 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$36
            r6.<init>(r9)
            r4.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r3.add(r4)
            float r4 = r4.getWidth()
            float r4 = r4 * r1
            r6.width(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$37 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$37
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r4.<init>(r9, r7, r6, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r4.getLabel()
            r7 = 1
            r6.setWrap(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r4.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.getCell(r6)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r7 * r21
            float r7 = r7 * r21
            r11 = 0
            r6.pad(r11, r8, r11, r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$38 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$38
            r6.<init>(r9)
            r4.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            float r4 = r4.getWidth()
            float r4 = r4 * r1
            r3.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "height_letter"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r4 = r4.toUpperCase(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = ":"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r4, r5)
            r9.mHLabel = r3
            r4 = 8
            r3.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r9.mHLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r3.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSpriteLockButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r3)
            r9.mLockHButton = r3
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$39 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$39
            r4.<init>(r9)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r9.mLockHButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            r4 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r9.mLockXButton
            float r4 = r4.getWidth()
            r3.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r3.<init>()
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r3.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r5.padTop(r4)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r5.padRight(r6)
            r6 = 1
            r5.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r3.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.pad(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r5.space(r4)
            r5 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r5)
            r5 = 0
            r4.uniform(r5, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r3)
            r4.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mCreateTable
            r4.row()
            java.lang.String r4 = "noMask"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r9.createTextButton(r4, r5)
            r9.mMaskButton = r4
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$40 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$40
            r5.<init>(r9)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r9.mMaskButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            r5 = 16
            r4.align(r5)
            java.lang.String r4 = "advanced"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " >"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r9.createTextButton(r4, r5)
            r9.mAdvancedButton = r4
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$41 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$41
            r5.<init>(r9)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r9.mAdvancedButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            r4 = 8
            r3.align(r4)
            boolean r3 = r10.getNerdModeEnabled()
            if (r3 != 0) goto La4a
            boolean r3 = org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.isFirstOpen
            if (r3 == 0) goto La4a
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "scaleMemoryNotice"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "("
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = ")"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r3.<init>(r4, r5)
            r4 = 8
            r3.setAlignment(r4)
            r4 = 1
            r3.setWrap(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r3.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            r3.row()
        La4a:
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r5 = "separator"
            r6 = r25
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r6.findRegion(r5)
            r4.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r2)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.padTop(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.padBottom(r4)
            r3.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r3.<init>()
            r9.mAdvancedTable = r3
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.pad(r4)
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.padTop(r4)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.padRight(r5)
            r5 = 10
            r3.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.pad(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.space(r4)
            r4 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.align(r4)
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.uniform(r4, r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 * r5
            r3.padRight(r4)
            java.lang.String r3 = "finished"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "< "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.createTextButton(r3, r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$42 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$42
            r4.<init>(r9)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.add(r3)
            r4 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.align(r4)
            r3.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mAdvancedTable
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "mainNodePosition"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r3.<init>(r4, r5)
            r4 = 8
            r3.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r3.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mAdvancedTable
            r3.row()
            boolean r3 = r10.getNerdModeEnabled()
            if (r3 != 0) goto Lb58
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "mainNodePositionInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r4, r5)
            r4 = 8
            r3.setAlignment(r4)
            r4 = 1
            r3.setWrap(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r3.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mAdvancedTable
            r3.row()
        Lb58:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            java.lang.String r4 = "x"
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.createTextButton(r4, r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$43 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$43
            r5.<init>(r9)
            r3.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r3)
            float r7 = r3.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r7)
            float r3 = r3.getHeight()
            r7 = 1060320051(0x3f333333, float:0.7)
            float r3 = r3 * r7
            r5.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.createTextButton(r4, r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$44 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$44
            r5.<init>(r9)
            r3.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r3)
            float r8 = r3.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r8)
            float r3 = r3.getHeight()
            float r3 = r3 * r7
            r5.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.createTextButton(r4, r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$45 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$45
            r5.<init>(r9)
            r3.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r3)
            float r8 = r3.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r8)
            float r3 = r3.getHeight()
            float r3 = r3 * r7
            r5.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mAdvancedTable
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.createTextButton(r4, r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$46 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$46
            r5.<init>(r9)
            r3.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r3)
            float r8 = r3.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r8)
            float r3 = r3.getHeight()
            float r3 = r3 * r7
            r5.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.createTextButton(r4, r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$47 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$47
            r5.<init>(r9)
            r3.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r3)
            float r8 = r3.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r8)
            float r3 = r3.getHeight()
            float r3 = r3 * r7
            r5.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.createTextButton(r4, r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$48 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$48
            r5.<init>(r9)
            r3.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r3)
            float r8 = r3.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r8)
            float r3 = r3.getHeight()
            float r3 = r3 * r7
            r5.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mAdvancedTable
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.createTextButton(r4, r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$49 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$49
            r5.<init>(r9)
            r3.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r3)
            float r8 = r3.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r8)
            float r3 = r3.getHeight()
            float r3 = r3 * r7
            r5.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.createTextButton(r4, r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$50 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$50
            r5.<init>(r9)
            r3.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r3)
            float r8 = r3.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r8)
            float r3 = r3.getHeight()
            float r3 = r3 * r7
            r5.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.createTextButton(r4, r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$51 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$51
            r4.<init>(r9)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r3)
            float r5 = r3.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r5)
            float r3 = r3.getHeight()
            float r3 = r3 * r7
            r4.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mAdvancedTable
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mAdvancedTable
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "internalScale"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r3.<init>(r4, r5)
            r4 = 8
            r3.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r3.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mAdvancedTable
            r3.row()
            boolean r3 = r10.getNerdModeEnabled()
            if (r3 != 0) goto Ld2a
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "internalScaleInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r4, r5)
            r4 = 8
            r3.setAlignment(r4)
            r4 = 1
            r3.setWrap(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r3.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mAdvancedTable
            r3.row()
        Ld2a:
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.defaults()
            r5 = 0
            r7 = 1
            r4.uniform(r5, r7)
            r3.setRound(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r2)
            r4.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mAdvancedTable
            r4.row()
            org.fortheloss.framework.LabelInputIncrementSmallField r4 = new org.fortheloss.framework.LabelInputIncrementSmallField
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r9._animationScreenRef
            java.lang.String r7 = "scaleX"
            java.lang.String r31 = org.fortheloss.sticknodes.App.localize(r7)
            r33 = 5
            r34 = 1008981770(0x3c23d70a, float:0.01)
            r35 = 1120402145(0x42c7fae1, float:99.99)
            r36 = 1
            java.lang.String r32 = "1.00"
            r29 = r4
            r30 = r5
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r9.mInternalScaleXField = r4
            r5 = 1
            r4.setHighFidelity(r5)
            org.fortheloss.framework.LabelInputIncrementSmallField r4 = r9.mInternalScaleXField
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$52 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$52
            r5.<init>(r9)
            r4.setFieldListener(r5)
            org.fortheloss.framework.LabelInputIncrementSmallField r4 = r9.mInternalScaleXField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fillX()
            r5 = 2
            r4.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLinkCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r4)
            r9.mScaleLinkedButton = r4
            r5 = 1
            r4.setChecked(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r9.mScaleLinkedButton
            r5 = 1103626240(0x41c80000, float:25.0)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r7
            r8 = 1103626240(0x41c80000, float:25.0)
            float r7 = r7 * r8
            r8 = 0
            r4.pad(r5, r8, r7, r8)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r9.mScaleLinkedButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fillX()
            r5 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r5)
            r7 = 1109393408(0x42200000, float:40.0)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.padTop(r8)
            r4.align(r5)
            org.fortheloss.framework.LabelInputIncrementSmallField r4 = new org.fortheloss.framework.LabelInputIncrementSmallField
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r9._animationScreenRef
            java.lang.String r7 = "scaleY"
            java.lang.String r31 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r32 = "1.00"
            r29 = r4
            r30 = r5
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r9.mInternalScaleYField = r4
            r5 = 1
            r4.setHighFidelity(r5)
            org.fortheloss.framework.LabelInputIncrementSmallField r4 = r9.mInternalScaleYField
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$53 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$53
            r5.<init>(r9)
            r4.setFieldListener(r5)
            org.fortheloss.framework.LabelInputIncrementSmallField r4 = r9.mInternalScaleYField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r4 = 2
            r3.align(r4)
            java.lang.String r3 = "finished"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "< "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.createTextButton(r3, r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$54 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$54
            r4.<init>(r9)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mAdvancedTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.add(r3)
            r4 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.align(r4)
            r3.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mAdvancedTable
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r3.<init>()
            r9.mPreviewTable = r3
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.pad(r4)
            r5 = 10
            r3.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mPreviewTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.pad(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r18
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.space(r4)
            r4 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.align(r4)
            r4 = 0
            r3.uniform(r4, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mPreviewTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r4 = 2
            r3.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "preview"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r3.<init>(r4, r5)
            r4 = 8
            r3.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mPreviewTable
            r4.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSimpleShowHideCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r4)
            r5 = 1
            r4.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$55 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$55
            r5.<init>(r9, r4)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9.mPreviewTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r4)
            float r4 = r4.getPrefWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r5.width(r4)
            float r3 = r3.getPrefHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.height(r3)
            r4 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.align(r4)
            r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mPreviewTable
            r3.row()
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget r3 = new org.fortheloss.sticknodes.animationscreen.spritemenus.SpritePreviewWidget
            r5 = r16
            r4 = r19
            r7 = r28
            r3.<init>(r4, r5, r7)
            r9.mSpritePreview = r3
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mPreviewTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r4 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.spaceTop(r4)
            r9.mPreviewWidgetCell = r3
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mPreviewTable
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mPreviewTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r5 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r6.findRegion(r5)
            r4.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            r4 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.padTop(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.padBottom(r4)
            r3.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mPreviewTable
            r3.row()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r9.mExistingSelectionsList = r3
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r3.<init>()
            r9.mExistingSelectionsTable = r3
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.pad(r4)
            r5 = 10
            r3.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mExistingSelectionsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.space(r4)
            r4 = 1109393408(0x42200000, float:40.0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.spaceBottom(r5)
            r4 = 8
            r3.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r9.mCreateTable
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mExistingSelectionsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r3.colspan(r2)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r24
            java.lang.String r5 = "importSprites"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r5, r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r9.createTextButton(r4)
            r9.mImportSpritesButton = r4
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.setColor(r5, r5, r5, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r9.mImportSpritesButton
            r4.setTouchable(r14)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r9.mImportSpritesButton
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.addButton(r4, r3)
            java.lang.String r3 = "clearAllSprites"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.createTextButton(r3)
            r9.mClearButton = r3
            r3.setColor(r5, r5, r5, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.mClearButton
            r3.setTouchable(r14)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r9.mClearButton
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.addButton(r3, r2)
            java.lang.String r2 = "readMcSkin"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r9.createTextButton(r2)
            r9.mMinecraftButton = r2
            r2.setTouchable(r14)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r9.mMinecraftButton
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setColor(r3, r3, r3, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r9.mMinecraftButton
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.addButton(r1, r2)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r9.createTextButton(r0)
            r1 = r24
            r9.addButton(r0, r1)
            java.lang.Thread r0 = new java.lang.Thread
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$56 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog$56
            r2 = r38
            r1.<init>(r9, r2)
            r0.<init>(r1)
            r0.start()
            r0 = 0
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog.isFirstOpen = r0
            return
    }

    public int isTextDataValid(java.lang.String r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            int r3 = r2.convertFromTextData(r3, r0, r1)
            return r3
    }
}
