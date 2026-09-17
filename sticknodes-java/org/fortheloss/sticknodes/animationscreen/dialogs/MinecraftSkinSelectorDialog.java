package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class MinecraftSkinSelectorDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule mAnimationBasedModuleRef;
    private org.fortheloss.framework.Assets mAssetsRef;
    private org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog mImportingSpritesDialogRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mIncludeButton;
    private boolean[] mIncludedPerspectives;
    private boolean mIsStandardSize;
    private org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog.MinecraftSkinSelectorListener mListener;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mNameLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField mNameTextfield;
    private org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinPreviewWidget mPreviewWidget;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mRigButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mSelectButton;
    private com.badlogic.gdx.graphics.Texture mSkinTextureRef;
    private org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool mSpriteImporterTool;
    private int mType3pxOr4px;
















    public interface MinecraftSkinSelectorListener {
        boolean checkNamesAreUnique(java.lang.String[] r1);

        void onRigImported();

        void regionsSelected(java.lang.String[] r1, float[][] r2);
    }

    /* renamed from: -$$Nest$fgetmImportingSpritesDialogRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog m537$$Nest$fgetmImportingSpritesDialogRef(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0) {
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r0 = r0.mImportingSpritesDialogRef
            return r0
    }

    /* renamed from: -$$Nest$fgetmIncludeButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m538$$Nest$fgetmIncludeButton(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mIncludeButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmListener, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog.MinecraftSkinSelectorListener m539$$Nest$fgetmListener(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0) {
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$MinecraftSkinSelectorListener r0 = r0.mListener
            return r0
    }

    /* renamed from: -$$Nest$fgetmNameTextfield, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m540$$Nest$fgetmNameTextfield(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0.mNameTextfield
            return r0
    }

    /* renamed from: -$$Nest$fgetmPreviewWidget, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinPreviewWidget m541$$Nest$fgetmPreviewWidget(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0) {
            org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinPreviewWidget r0 = r0.mPreviewWidget
            return r0
    }

    /* renamed from: -$$Nest$fgetmSpriteImporterTool, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool m542$$Nest$fgetmSpriteImporterTool(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0) {
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool r0 = r0.mSpriteImporterTool
            return r0
    }

    /* renamed from: -$$Nest$fgetmType3pxOr4px, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m543$$Nest$fgetmType3pxOr4px(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0) {
            int r0 = r0.mType3pxOr4px
            return r0
    }

    /* renamed from: -$$Nest$fputmImportingSpritesDialogRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m544$$Nest$fputmImportingSpritesDialogRef(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0, org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r1) {
            r0.mImportingSpritesDialogRef = r1
            return
    }

    /* renamed from: -$$Nest$maddPartAndJoin, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m545$$Nest$maddPartAndJoin(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0, java.lang.String r1, java.util.HashMap r2, org.fortheloss.sticknodes.stickfigure.Stickfigure r3, int r4, java.util.ArrayList r5, org.fortheloss.sticknodes.movieclip.MCMovieclipSource r6) {
            r0.addPartAndJoin(r1, r2, r3, r4, r5, r6)
            return
    }

    /* renamed from: -$$Nest$mbuildName, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m546$$Nest$mbuildName(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4, boolean r5) {
            java.lang.String r0 = r0.buildName(r1, r2, r3, r4, r5)
            return r0
    }

    /* renamed from: -$$Nest$mgetLibId, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m547$$Nest$mgetLibId(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0, java.lang.String r1, java.util.HashMap r2, org.fortheloss.sticknodes.data.ProjectData r3) {
            r0.getLibId(r1, r2, r3)
            return
    }

    /* renamed from: -$$Nest$mgetUniqueMCName, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m548$$Nest$mgetUniqueMCName(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0, java.lang.String r1, java.util.ArrayList r2) {
            java.lang.String r0 = r0.getUniqueMCName(r1, r2)
            return r0
    }

    /* renamed from: -$$Nest$msetIncludePerspective, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m549$$Nest$msetIncludePerspective(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0, int r1, boolean r2) {
            r0.setIncludePerspective(r1, r2)
            return
    }

    /* renamed from: -$$Nest$mupdateButtonsText, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m550$$Nest$mupdateButtonsText(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0) {
            r0.updateButtonsText()
            return
    }

    /* renamed from: -$$Nest$mupdateIncludeButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m551$$Nest$mupdateIncludeButton(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog r0, int r1) {
            r0.updateIncludeButton(r1)
            return
    }

    public MinecraftSkinSelectorDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2, org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r3) {
            r1 = this;
            r1.<init>(r2)
            r0 = 1
            r1.mIsStandardSize = r0
            r1.mAnimationBasedModuleRef = r3
            org.fortheloss.framework.Assets r2 = r2.getAssets()
            r1.mAssetsRef = r2
            r2 = 8
            boolean[] r2 = new boolean[r2]
            r2 = {x0018: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            r1.mIncludedPerspectives = r2
            return
    }

    private void addPartAndJoin(java.lang.String r4, java.util.HashMap<java.lang.String, java.lang.Integer> r5, org.fortheloss.sticknodes.stickfigure.Stickfigure r6, int r7, java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r8, org.fortheloss.sticknodes.movieclip.MCMovieclipSource r9) {
            r3 = this;
            int r4 = r3.findInMap(r4, r5)
            if (r4 >= 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r5 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r5.<init>()
            r0 = 1
            r5.setUseJoinParentFilters(r0)
            java.lang.Object r8 = r8.get(r4)
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r8 = (org.fortheloss.sticknodes.sprite.SpriteGroupSource) r8
            r5.setSpriteGroupSource(r8)
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r8 = r9.frames
            r1 = 0
            java.lang.Object r8 = r8.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r8 = (org.fortheloss.sticknodes.data.IFrameData) r8
            r2 = -1
            r8.addFigureAt(r5, r2, r0, r9)
            org.fortheloss.sticknodes.stickfigure.INode r8 = r6.getNodeAtDrawOrderIndex(r7)
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = (org.fortheloss.sticknodes.stickfigure.StickNode) r8
            r5.joinTo(r8)
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r8 = r9.frames
            java.lang.Object r8 = r8.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r8 = (org.fortheloss.sticknodes.data.IFrameData) r8
            org.fortheloss.sticknodes.stickfigure.INode r6 = r6.getNodeAtDrawOrderIndex(r7)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            r8.onFigureJoined(r5, r6)
            r6 = 2
            r5.setSmartStretchState(r6)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r5 = r5.getProjectData()
            r5.hideSpriteInImportList(r4, r0)
            return
    }

    private java.lang.String buildName(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8) {
            r3 = this;
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r0 = "_"
            java.lang.String r1 = ""
            if (r5 != 0) goto Lc
            r5 = r1
            goto L2a
        Lc:
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            if (r6 != 0) goto L14
            r6 = r1
            goto L18
        L14:
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
        L18:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = r2.toString()
        L2a:
            if (r7 == 0) goto L2f
            java.lang.String r6 = "2"
            goto L30
        L2f:
            r6 = r1
        L30:
            if (r8 == 0) goto L47
            java.lang.String r7 = "group"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r7)
            java.lang.String r1 = r8.toString()
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r5)
            r7.append(r6)
            r7.append(r1)
            java.lang.String r4 = r7.toString()
            return r4
    }

    private int findInMap(java.lang.String r3, java.util.HashMap<java.lang.String, java.lang.Integer> r4) {
            r2 = this;
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L8
            java.lang.Object r3 = r0.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L2c
        L2b:
            r3 = -1
        L2c:
            return r3
    }

    private float[][] getAllSelectionData(java.util.ArrayList<java.lang.Integer> r11, java.util.ArrayList<java.lang.Integer> r12, boolean r13) {
            r10 = this;
            int r0 = r11.size()
            int r1 = r12.size()
            int r0 = r0 * r1
            float[][] r0 = new float[r0][]
            int r1 = r12.size()
            r2 = 0
            r3 = 0
            r4 = 0
        L13:
            if (r3 >= r1) goto L3f
            java.lang.Object r5 = r12.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r6 = r11.size()
            r7 = 0
        L24:
            if (r7 >= r6) goto L3c
            int r8 = r4 + 1
            java.lang.Object r9 = r11.get(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            float[] r9 = r10.getSelectionData(r5, r9, r13)
            r0[r4] = r9
            int r7 = r7 + 1
            r4 = r8
            goto L24
        L3c:
            int r3 = r3 + 1
            goto L13
        L3f:
            return r0
    }

    private void getLibId(java.lang.String r5, java.util.HashMap<java.lang.String, java.lang.Integer> r6, org.fortheloss.sticknodes.data.ProjectData r7) {
            r4 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r7 = r7.libraryStickfigures
            int r0 = r7.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L1f
            java.lang.Object r2 = r7.get(r0)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L1c
            r2 = 0
            goto L21
        L1c:
            int r0 = r0 + (-1)
            goto L8
        L1f:
            r0 = -1
            r2 = 1
        L21:
            if (r2 == 0) goto L4e
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r3 = ".nodes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.badlogic.gdx.files.FileHandle r0 = r0.internal(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r4._animationScreenRef
            r2.importStickfigure(r0)
            int r7 = r7.size()
            int r0 = r7 + (-1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r7 = r7.getProjectData()
            r7.hideStickfigureInImportList(r0, r1)
        L4e:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r6.put(r5, r7)
            return
    }

    private org.fortheloss.framework.Response<java.lang.String[]> getNamesForSelections(boolean r17, java.util.ArrayList<java.lang.Integer> r18, java.util.ArrayList<java.lang.Integer> r19) {
            r16 = this;
            r0 = r16
            org.fortheloss.framework.Response r1 = new org.fortheloss.framework.Response
            r1.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0.mNameTextfield
            java.lang.String r2 = r2.getText()
            java.lang.String r2 = r2.trim()
            int r3 = r2.length()
            r4 = 1
            if (r3 > 0) goto L23
            r1.error = r4
            java.lang.String r2 = "enterNamePrefix"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r1.msg = r2
            return r1
        L23:
            int r3 = r18.size()
            int r5 = r19.size()
            int r3 = r3 * r5
            java.lang.String[] r3 = new java.lang.String[r3]
            int r5 = r19.size()
            r7 = 0
            r8 = 0
        L35:
            if (r7 >= r5) goto L81
            r9 = r19
            java.lang.Object r10 = r9.get(r7)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            int r11 = r18.size()
            r12 = 0
        L48:
            if (r12 >= r11) goto L7c
            r13 = r18
            java.lang.Object r14 = r13.get(r12)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            java.lang.String r14 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.getName(r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r2)
            java.lang.String r6 = "_"
            r15.append(r6)
            r15.append(r14)
            r15.append(r6)
            r15.append(r10)
            java.lang.String r6 = r15.toString()
            int r14 = r8 + 1
            r3[r8] = r6
            int r12 = r12 + 1
            r8 = r14
            goto L48
        L7c:
            r13 = r18
            int r7 = r7 + 1
            goto L35
        L81:
            if (r17 == 0) goto L96
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$MinecraftSkinSelectorListener r2 = r0.mListener
            boolean r2 = r2.checkNamesAreUnique(r3)
            if (r2 != 0) goto L96
            r1.error = r4
            java.lang.String r2 = "enterDifferentNamePrefix"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r1.msg = r2
            return r1
        L96:
            r1.data = r3
            return r1
    }

    private float[] getSelectionData(int r12, int r13, boolean r14) {
            r11 = this;
            int r0 = r11.mType3pxOr4px
            float[] r0 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.getUVs(r0, r12, r13)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r4 = r0[r3]
            r5 = 2
            r6 = r0[r5]
            r7 = 3
            r0 = r0[r7]
            float[] r8 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.getOrigin(r13)
            r9 = r8[r1]
            r8 = r8[r3]
            float r12 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.getScaleX(r12, r13)
            r10 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 * r10
            if (r14 == 0) goto L30
            float r14 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.getRigScale()
            float r12 = r12 * r14
            float r14 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.getRigScale()
            float r10 = r10 * r14
        L30:
            boolean r14 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.isOuterLayer(r13)
            if (r14 == 0) goto L42
            float r14 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.getOuterLayerScale()
            float r12 = r12 * r14
            float r14 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.getOuterLayerScale()
            float r10 = r10 * r14
        L42:
            boolean r14 = r11.mIsStandardSize
            if (r14 != 0) goto L4c
            r14 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r14
            float r10 = r10 * r14
        L4c:
            boolean r13 = org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinData.needsMask(r13)
            if (r13 == 0) goto L55
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L57
        L55:
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
        L57:
            r14 = 9
            float[] r14 = new float[r14]
            r14[r1] = r2
            r14[r3] = r4
            r14[r5] = r6
            r14[r7] = r0
            r0 = 4
            r14[r0] = r9
            r0 = 5
            r14[r0] = r8
            r0 = 6
            r14[r0] = r12
            r12 = 7
            r14[r12] = r10
            r12 = 8
            r14[r12] = r13
            return r14
    }

    private java.lang.String getUniqueMCName(java.lang.String r7, java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r8) {
            r6 = this;
            r0 = 0
            r1 = r7
            r2 = 0
        L3:
            int r3 = r8.size()
            r4 = 1
            int r3 = r3 - r4
        L9:
            if (r3 < 0) goto L35
            java.lang.Object r5 = r8.get(r3)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r5 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r5
            java.lang.String r5 = r5.getName()
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L32
            int r2 = r2 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r3 = "_"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L36
        L32:
            int r3 = r3 + (-1)
            goto L9
        L35:
            r4 = 0
        L36:
            if (r4 != 0) goto L3
            return r1
    }

    private void setIncludePerspective(int r2, boolean r3) {
            r1 = this;
            boolean[] r0 = r1.mIncludedPerspectives
            r0[r2] = r3
            return
    }

    private void updateButtonsText() {
            r7 = this;
            boolean[] r0 = r7.mIncludedPerspectives
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        L7:
            if (r0 < 0) goto L14
            boolean[] r4 = r7.mIncludedPerspectives
            boolean r4 = r4[r0]
            if (r4 == 0) goto L11
            int r3 = r3 + 1
        L11:
            int r0 = r0 + (-1)
            goto L7
        L14:
            org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinPreviewWidget r0 = r7.mPreviewWidget
            java.util.ArrayList r0 = r0.getActiveLimbs()
            int r4 = r0.size()
            int r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r7.mSelectButton
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r1[r2] = r5
            java.lang.String r5 = "selectTheseRegions"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r5, r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "< "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r4.setText(r1)
            r1 = 1056964608(0x3f000000, float:0.5)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 > 0) goto L57
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r7.mSelectButton
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r7.mSelectButton
            r3.setColor(r4, r4, r4, r1)
            goto L63
        L57:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r7.mSelectButton
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r3.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r7.mSelectButton
            r3.setColor(r4, r4, r4, r4)
        L63:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Le4
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Le4
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Le4
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Le4
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Le4
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Le4
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Le4
            r2 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Le4
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Le4
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld7
            goto Le4
        Ld7:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mRigButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mRigButton
            r0.setColor(r4, r4, r4, r4)
            goto Lf0
        Le4:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mRigButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mRigButton
            r0.setColor(r4, r4, r4, r1)
        Lf0:
            return
    }

    private void updateIncludeButton(int r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2.mIncludeButton
            boolean[] r1 = r2.mIncludedPerspectives
            boolean r3 = r1[r3]
            r0.setChecked(r3)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r32) {
            r31 = this;
            r0 = r31
            r1 = r32
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L73
            org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinPreviewWidget r1 = r0.mPreviewWidget
            java.util.ArrayList r1 = r1.getActiveLimbs()
            if (r1 == 0) goto L72
            int r4 = r1.size()
            if (r4 > 0) goto L1d
            goto L72
        L1d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean[] r5 = r0.mIncludedPerspectives
            int r5 = r5.length
            r6 = 0
        L26:
            if (r6 >= r5) goto L38
            boolean[] r7 = r0.mIncludedPerspectives
            boolean r7 = r7[r6]
            if (r7 == 0) goto L35
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r4.add(r7)
        L35:
            int r6 = r6 + 1
            goto L26
        L38:
            int r5 = r4.size()
            if (r5 > 0) goto L3f
            return
        L3f:
            org.fortheloss.framework.Response r3 = r0.getNamesForSelections(r3, r1, r4)
            T r5 = r3.data
            java.lang.String[] r5 = (java.lang.String[]) r5
            boolean r6 = r3.error
            if (r6 == 0) goto L67
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.mNameLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = r1.getStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r2 = r2.fontColor
            r1.set(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.mNameLabel
            java.lang.String r2 = r3.msg
            r1.setText(r2)
            r31.doNotHideDialog()
            return
        L67:
            float[][] r1 = r0.getAllSelectionData(r1, r4, r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$MinecraftSkinSelectorListener r2 = r0.mListener
            r2.regionsSelected(r5, r1)
            goto L1c3
        L72:
            return
        L73:
            r4 = 2
            if (r1 != r4) goto L1c3
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r1 = r1.getProjectData()
            org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinPreviewWidget r5 = r0.mPreviewWidget
            java.util.ArrayList r5 = r5.getActiveLimbs()
            if (r5 == 0) goto L1c3
            int r6 = r5.size()
            if (r6 > 0) goto L8c
            goto L1c3
        L8c:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
        L92:
            r8 = 8
            if (r7 >= r8) goto La0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r6.add(r8)
            int r7 = r7 + 1
            goto L92
        La0:
            org.fortheloss.framework.Response r7 = r0.getNamesForSelections(r2, r5, r6)
            T r9 = r7.data
            java.lang.String[] r9 = (java.lang.String[]) r9
            boolean r10 = r7.error
            if (r10 == 0) goto Lc8
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.mNameLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = r1.getStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r2 = r2.fontColor
            r1.set(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.mNameLabel
            java.lang.String r2 = r7.msg
            r1.setText(r2)
            r31.doNotHideDialog()
            return
        Lc8:
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r1 = r1.librarySprites
            int r7 = r1.size()
            int r7 = r7 - r3
        Lcf:
            if (r7 < 0) goto L10d
            int r10 = r9.length
            int r10 = r10 - r3
        Ld3:
            if (r10 < 0) goto L10a
            r11 = r9[r10]
            java.lang.Object r12 = r1.get(r7)
            org.fortheloss.sticknodes.sprite.ISpriteSource r12 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r12
            java.lang.String r12 = r12.getName()
            boolean r11 = r11.equalsIgnoreCase(r12)
            if (r11 == 0) goto L107
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.mNameLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = r1.getStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r2 = r2.fontColor
            r1.set(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.mNameLabel
            java.lang.String r2 = "enterDifferentNamePrefix"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r1.setText(r2)
            r31.doNotHideDialog()
            return
        L107:
            int r10 = r10 + (-1)
            goto Ld3
        L10a:
            int r7 = r7 + (-1)
            goto Lcf
        L10d:
            float[][] r1 = r0.getAllSelectionData(r5, r6, r3)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r5 = r1.length
            r6 = 0
        L118:
            if (r6 >= r5) goto L181
            com.badlogic.gdx.graphics.Texture r7 = r0.mSkinTextureRef
            int r7 = r7.getWidth()
            float r7 = (float) r7
            com.badlogic.gdx.graphics.Texture r10 = r0.mSkinTextureRef
            int r10 = r10.getHeight()
            float r10 = (float) r10
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r11 = new org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData
            r11.<init>()
            r12 = r1[r6]
            r17 = r9[r6]
            r13 = r12[r2]
            float r13 = r13 * r7
            int r13 = (int) r13
            r14 = r12[r3]
            float r14 = r14 * r10
            int r14 = (int) r14
            r16 = r12[r4]
            float r7 = r7 * r16
            int r7 = (int) r7
            r16 = 3
            r18 = r12[r16]
            float r10 = r10 * r18
            int r10 = (int) r10
            r18 = r12[r2]
            r19 = r12[r3]
            r20 = r12[r4]
            r21 = r12[r16]
            r16 = 4
            r26 = r12[r16]
            r16 = 5
            r27 = r12[r16]
            r16 = 6
            r28 = r12[r16]
            r16 = 7
            r29 = r12[r16]
            r16 = r12[r8]
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r16 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1))
            if (r16 != 0) goto L169
            r12 = 0
            goto L16b
        L169:
            r12 = r12[r8]
        L16b:
            int r12 = (int) r12
            r16 = r11
            r22 = r13
            r23 = r14
            r24 = r7
            r25 = r10
            r30 = r12
            r16.setData(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r15.add(r11)
            int r6 = r6 + 1
            goto L118
        L181:
            com.badlogic.gdx.graphics.Texture r1 = r0.mSkinTextureRef
            com.badlogic.gdx.graphics.TextureData r1 = r1.getTextureData()
            com.badlogic.gdx.graphics.Pixmap r11 = r1.consumePixmap()
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            r1.<init>(r2)
            r0.mImportingSpritesDialogRef = r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            org.fortheloss.framework.Assets r2 = r2.getAssets()
            java.lang.String r4 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r5 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r2 = r2.get(r4, r5, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r2
            java.lang.String r3 = "loading_spinner"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r3)
            r1.initialize(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r2 = r0.mImportingSpritesDialogRef
            r1.addDialogToStage(r2)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool r10 = r0.mSpriteImporterTool
            r12 = 1
            r13 = 0
            com.badlogic.gdx.graphics.Color r14 = com.badlogic.gdx.graphics.Color.WHITE
            r16 = 1
            r10.importSelections(r11, r12, r13, r14, r15, r16)
            r31.doNotHideDialog()
        L1c3:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2.mAnimationBasedModuleRef = r0
            r2.mAssetsRef = r0
            r2.mListener = r0
            r2.mSkinTextureRef = r0
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool r1 = r2.mSpriteImporterTool
            if (r1 == 0) goto L12
            r1.dispose()
            r2.mSpriteImporterTool = r0
        L12:
            r2.mNameLabel = r0
            r2.mNameTextfield = r0
            org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinPreviewWidget r1 = r2.mPreviewWidget
            if (r1 == 0) goto L1f
            r1.dispose()
            r2.mPreviewWidget = r0
        L1f:
            r2.mSelectButton = r0
            r2.mRigButton = r0
            r2.mIncludeButton = r0
            r2.mIncludedPerspectives = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r1 = r2.mImportingSpritesDialogRef
            if (r1 == 0) goto L3c
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r1 = r1.getDialog()
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            if (r1 == 0) goto L3c
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportingSpritesDialog r1 = r2.mImportingSpritesDialogRef
            r1.hideImmediately()
            r2.mImportingSpritesDialogRef = r0
        L3c:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.Texture r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "minecraftSkinSelectorTitle"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            super.initialize(r2)
            r0.mSkinTextureRef = r1
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$1 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r0._animationScreenRef
            r2.<init>(r0, r3)
            r0.mSpriteImporterTool = r2
            org.fortheloss.framework.Assets r2 = r0.mAssetsRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r4 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r5 = 1
            java.lang.Object r2 = r2.get(r3, r4, r5)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r2
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r4 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r17.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.defaults()
            r6 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.spaceRight(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.spaceLeft(r6)
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r4.uniform(r7, r7)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r4 = r17.getDialogScrollPane()
            r4.setScrollbarsOnTop(r5)
            r4 = 8
            boolean[] r9 = new boolean[r4]
            r0.mIncludedPerspectives = r9
            java.util.Arrays.fill(r9, r7)
            com.badlogic.gdx.graphics.TextureData r9 = r18.getTextureData()
            com.badlogic.gdx.graphics.Pixmap r9 = r9.consumePixmap()
            com.badlogic.gdx.graphics.Texture r10 = r0.mSkinTextureRef
            int r10 = r10.getHeight()
            r13 = 128(0x80, float:1.794E-43)
            if (r10 != r13) goto L6f
            r13 = 92
            r14 = 24
            r15 = 4
            goto L74
        L6f:
            r13 = 46
            r14 = 12
            r15 = 2
        L74:
            r11 = 0
            r16 = 1
        L77:
            if (r11 >= r14) goto L95
            r12 = 0
        L7a:
            if (r12 >= r15) goto L8f
            int r4 = r13 + r12
            int r7 = r10 - r11
            int r4 = r9.getPixel(r4, r7)
            if (r4 == 0) goto L89
            r16 = 0
            goto L8f
        L89:
            int r12 = r12 + 1
            r4 = 8
            r7 = 0
            goto L7a
        L8f:
            int r11 = r11 + 1
            r4 = 8
            r7 = 0
            goto L77
        L95:
            r4 = r16 ^ 1
            r0.mType3pxOr4px = r4
            r4 = 64
            if (r10 != r4) goto L9f
            r4 = 1
            goto La0
        L9f:
            r4 = 0
        La0:
            r0.mIsStandardSize = r4
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "minecraftSkinSelectorInfo"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r7, r9)
            r4.setWrap(r5)
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            r4.width(r3)
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r7 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r9 = r2.findRegion(r7)
            r4.<init>(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            int r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r9 = (float) r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.padTop(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r9 = (float) r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.padBottom(r9)
            r4.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r4.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r4.pad(r6)
            r10 = 10
            r9.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r4.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.pad(r6)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            r12 = 1092616192(0x41200000, float:10.0)
            float r11 = r11 * r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.space(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.align(r10)
            r11 = 0
            r9.uniform(r11, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.expand()
            r9.fill()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r11 = "namePrefix"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r13.<init>(r14)
            r9.<init>(r11, r13)
            r0.mNameLabel = r9
            r9.setWrap(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = r0.mNameLabel
            r11 = 8
            r9.setAlignment(r11)
            r9 = 40
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r11 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r11.<init>()
            java.lang.String r13 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextField r9 = r0.createTextField(r13, r9, r11)
            r0.mNameTextfield = r9
            org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinPreviewWidget r9 = new org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinPreviewWidget
            int r11 = r0.mType3pxOr4px
            r9.<init>(r1, r11)
            r0.mPreviewWidget = r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r1.pad(r6)
            r9.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.pad(r6)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.space(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.align(r10)
            r9.expandX()
            r4.add(r1)
            r9 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = r0.mNameLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r1.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.width(r3)
            r9.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r9 = r0.mNameTextfield
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r1.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.fillX()
            int r11 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r11 = (float) r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.height(r11)
            r9.row()
            org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinPreviewWidget r9 = r0.mPreviewWidget
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r3)
            r1.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r1.pad(r6)
            r3.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.pad(r6)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.align(r10)
            r9 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.uniform(r9, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            r3.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expand()
            r3.fill()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r3.<init>()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTableGrayBackground()
            r3.background(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r9 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r3.pad(r4)
            r4.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.pad(r6)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r10 * r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.space(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r5)
            r10 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.uniform(r10, r10)
            r4.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r1.add(r3)
            r10 = 4
            r4.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "include"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r10, r11)
            r4.setWrap(r5)
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            r4.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "perspective"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r10, r11)
            r4.setWrap(r5)
            r10 = 8
            r4.setAlignment(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            r4.fillX()
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r4)
            r0.mIncludeButton = r4
            r10 = 0
            r4.setChecked(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r0.mIncludeButton
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$2 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$2
            r10.<init>(r0)
            r4.addListener(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r0.mIncludeButton
            r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r4 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            r11 = 0
            r12 = 1088421888(0x40e00000, float:7.0)
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            org.fortheloss.framework.CustomStopListener r10 = new org.fortheloss.framework.CustomStopListener
            r10.<init>()
            r4.addListener(r10)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$3 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$3
            r10.<init>(r0, r4)
            r4.addListener(r10)
            org.fortheloss.sticknodes.animationscreen.spritemenus.MinecraftSkinPreviewWidget r10 = r0.mPreviewWidget
            int r10 = r10.getPerspective()
            float r10 = (float) r10
            r4.setValue(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r4)
            r3.fillX()
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r2.findRegion(r7)
            r3.<init>(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r1.add(r3)
            r4 = 4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.padTop(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.padBottom(r4)
            r3.fillX()
            r1.row()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = "head"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r10, r11)
            r10 = 0
            r4.setWrap(r10)
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r10)
            r10.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$4 r11 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$4
            r11.<init>(r0, r10)
            r10.addListener(r11)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r11 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r11.<init>()
            r12 = 16
            r11.align(r12)
            r11.pad(r6, r3, r6, r3)
            r11.fill()
            r11.addActor(r4)
            r11.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r1.add(r11)
            r10 = 1047904911(0x3e75c28f, float:0.24)
            com.badlogic.gdx.scenes.scene2d.ui.Value r11 = com.badlogic.gdx.scenes.scene2d.ui.Value.percentWidth(r10, r1)
            r4.width(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            java.lang.String r9 = " 2"
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r11, r13)
            r11 = 0
            r4.setWrap(r11)
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r13)
            r13.setChecked(r11)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$5 r11 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$5
            r11.<init>(r0, r13)
            r13.addListener(r11)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r11 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r11.<init>()
            r14 = 8
            r11.align(r14)
            r11.pad(r6, r3, r6, r3)
            r11.fill()
            r11.addActor(r4)
            r11.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r1.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Value r11 = com.badlogic.gdx.scenes.scene2d.ui.Value.percentWidth(r10, r1)
            r4.width(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r11 = "body"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r13, r14)
            r13 = 0
            r4.setWrap(r13)
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r13)
            r13.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$6 r14 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$6
            r14.<init>(r0, r13)
            r13.addListener(r14)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r14 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r14.<init>()
            r14.align(r12)
            r14.pad(r6, r3, r6, r3)
            r14.fill()
            r14.addActor(r4)
            r14.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r1.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Value r13 = com.badlogic.gdx.scenes.scene2d.ui.Value.percentWidth(r10, r1)
            r4.width(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r13.append(r9)
            java.lang.String r11 = r13.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r11, r13)
            r11 = 0
            r4.setWrap(r11)
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r13)
            r13.setChecked(r11)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$7 r11 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$7
            r11.<init>(r0, r13)
            r13.addListener(r11)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r11 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r11.<init>()
            r14 = 8
            r11.align(r14)
            r11.pad(r6, r3, r6, r3)
            r11.fill()
            r11.addActor(r4)
            r11.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r1.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Value r11 = com.badlogic.gdx.scenes.scene2d.ui.Value.percentWidth(r10, r1)
            r4.width(r11)
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r2.findRegion(r7)
            r4.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r1.add(r4)
            r11 = 4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r11)
            int r11 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r11 = (float) r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.padTop(r11)
            int r11 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r11 = (float) r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.padBottom(r11)
            r4.fillX()
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r11 = "left_letter"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r11)
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r13 = r13.toUpperCase(r14)
            java.lang.String r15 = "arm"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r13)
            java.lang.String r13 = " "
            r6.append(r13)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r6, r10)
            r6 = 0
            r4.setWrap(r6)
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            r6.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$8 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$8
            r10.<init>(r0, r6)
            r6.addListener(r10)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r10 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r10.<init>()
            r10.align(r12)
            r12 = 0
            r10.pad(r12, r3, r12, r3)
            r10.fill()
            r10.addActor(r4)
            r10.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r1.add(r10)
            r6 = 1047904911(0x3e75c28f, float:0.24)
            com.badlogic.gdx.scenes.scene2d.ui.Value r10 = com.badlogic.gdx.scenes.scene2d.ui.Value.percentWidth(r6, r1)
            r4.width(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r11)
            java.lang.String r6 = r6.toUpperCase(r14)
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            r12.append(r13)
            r12.append(r10)
            r12.append(r9)
            java.lang.String r6 = r12.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r6, r10)
            r6 = 0
            r4.setWrap(r6)
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r10)
            r10.setChecked(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$9 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$9
            r6.<init>(r0, r10)
            r10.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r6.<init>()
            r12 = 8
            r6.align(r12)
            r12 = 0
            r6.pad(r12, r3, r12, r3)
            r6.fill()
            r6.addActor(r4)
            r6.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r1.add(r6)
            r6 = 1047904911(0x3e75c28f, float:0.24)
            com.badlogic.gdx.scenes.scene2d.ui.Value r10 = com.badlogic.gdx.scenes.scene2d.ui.Value.percentWidth(r6, r1)
            r4.width(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "right_letter"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r10 = r10.toUpperCase(r14)
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            r5.append(r13)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5, r10)
            r5 = 0
            r4.setWrap(r5)
            r5 = 1
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r10)
            r10.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$10 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$10
            r5.<init>(r0, r10)
            r10.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r5.<init>()
            r12 = 16
            r5.align(r12)
            r12 = 0
            r5.pad(r12, r3, r12, r3)
            r5.fill()
            r5.addActor(r4)
            r5.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r1.add(r5)
            r5 = 1047904911(0x3e75c28f, float:0.24)
            com.badlogic.gdx.scenes.scene2d.ui.Value r10 = com.badlogic.gdx.scenes.scene2d.ui.Value.percentWidth(r5, r1)
            r4.width(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r5 = r5.toUpperCase(r14)
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            r12.append(r13)
            r12.append(r10)
            r12.append(r9)
            java.lang.String r5 = r12.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5, r10)
            r5 = 0
            r4.setWrap(r5)
            r10 = 1
            r4.setAlignment(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r10)
            r10.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$11 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$11
            r5.<init>(r0, r10)
            r10.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r5.<init>()
            r12 = 8
            r5.align(r12)
            r12 = 0
            r5.pad(r12, r3, r12, r3)
            r5.fill()
            r5.addActor(r4)
            r5.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r1.add(r5)
            r5 = 1047904911(0x3e75c28f, float:0.24)
            com.badlogic.gdx.scenes.scene2d.ui.Value r10 = com.badlogic.gdx.scenes.scene2d.ui.Value.percentWidth(r5, r1)
            r4.width(r10)
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r7)
            r4.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r4)
            r4 = 4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.padTop(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.padBottom(r4)
            r2.fillX()
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r11)
            java.lang.String r4 = r4.toUpperCase(r14)
            java.lang.String r5 = "leg"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            r10.append(r13)
            r10.append(r7)
            java.lang.String r4 = r10.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r4, r7)
            r4 = 0
            r2.setWrap(r4)
            r4 = 1
            r2.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r7)
            r7.setChecked(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$12 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$12
            r4.<init>(r0, r7)
            r7.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r4.<init>()
            r10 = 16
            r4.align(r10)
            r10 = 0
            r4.pad(r10, r3, r10, r3)
            r4.fill()
            r4.addActor(r2)
            r4.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r4)
            r4 = 1047904911(0x3e75c28f, float:0.24)
            com.badlogic.gdx.scenes.scene2d.ui.Value r7 = com.badlogic.gdx.scenes.scene2d.ui.Value.percentWidth(r4, r1)
            r2.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r11)
            java.lang.String r4 = r4.toUpperCase(r14)
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            r10.append(r13)
            r10.append(r7)
            r10.append(r9)
            java.lang.String r4 = r10.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r4, r7)
            r4 = 0
            r2.setWrap(r4)
            r7 = 1
            r2.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r7)
            r7.setChecked(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$13 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$13
            r4.<init>(r0, r7)
            r7.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r4.<init>()
            r10 = 8
            r4.align(r10)
            r10 = 0
            r4.pad(r10, r3, r10, r3)
            r4.fill()
            r4.addActor(r2)
            r4.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r4)
            r4 = 1047904911(0x3e75c28f, float:0.24)
            com.badlogic.gdx.scenes.scene2d.ui.Value r7 = com.badlogic.gdx.scenes.scene2d.ui.Value.percentWidth(r4, r1)
            r2.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r4 = r4.toUpperCase(r14)
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            r10.append(r13)
            r10.append(r7)
            java.lang.String r4 = r10.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r4, r7)
            r4 = 0
            r2.setWrap(r4)
            r4 = 1
            r2.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r7)
            r7.setChecked(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$14 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$14
            r4.<init>(r0, r7)
            r7.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r4.<init>()
            r10 = 16
            r4.align(r10)
            r10 = 0
            r4.pad(r10, r3, r10, r3)
            r4.fill()
            r4.addActor(r2)
            r4.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r4)
            r4 = 1047904911(0x3e75c28f, float:0.24)
            com.badlogic.gdx.scenes.scene2d.ui.Value r7 = com.badlogic.gdx.scenes.scene2d.ui.Value.percentWidth(r4, r1)
            r2.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r4 = r4.toUpperCase(r14)
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r13)
            r6.append(r5)
            r6.append(r9)
            java.lang.String r4 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r4, r5)
            r4 = 0
            r2.setWrap(r4)
            r5 = 1
            r2.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r5)
            r5.setChecked(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$15 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog$15
            r4.<init>(r0, r5)
            r5.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r4.<init>()
            r6 = 8
            r4.align(r6)
            r6 = 0
            r4.pad(r6, r3, r6, r3)
            r4.fill()
            r4.addActor(r2)
            r4.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r4)
            r3 = 1047904911(0x3e75c28f, float:0.24)
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.percentWidth(r3, r1)
            r2.width(r1)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r8
            java.lang.String r1 = "selectTheseRegions"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "< "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0.createTextButton(r1)
            r0.mSelectButton = r1
            r2 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r0.addButton(r1, r4)
            java.lang.String r1 = "cancel"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0.createTextButton(r1)
            r0.addButton(r1, r8)
            java.lang.String r1 = "importAndRig"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r2 = 1
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0.createTextButton(r1, r2)
            r0.mRigButton = r1
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.addButton(r1, r2)
            r17.updateButtonsText()
            return
    }

    public void setMinecraftSkinSelectorListener(org.fortheloss.sticknodes.animationscreen.dialogs.MinecraftSkinSelectorDialog.MinecraftSkinSelectorListener r1) {
            r0 = this;
            r0.mListener = r1
            return
    }
}
