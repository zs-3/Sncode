package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class SideDrawToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _drawOrderButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _nodesToShowButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _testSmartStretchButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _viewOptionsButton;





    /* renamed from: -$$Nest$monViewOptionsClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1158$$Nest$monViewOptionsClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r0) {
            r0.onViewOptionsClick()
            return
    }

    /* renamed from: -$$Nest$mtoggleNodeDrawMode, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1159$$Nest$mtoggleNodeDrawMode(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r0) {
            r0.toggleNodeDrawMode()
            return
    }

    /* renamed from: -$$Nest$mtoggleShowingNodeDrawOrder, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1160$$Nest$mtoggleShowingNodeDrawOrder(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r0) {
            r0.toggleShowingNodeDrawOrder()
            return
    }

    public SideDrawToolTable(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2, org.fortheloss.sticknodes.data.ProjectData r3, org.fortheloss.sticknodes.data.SessionData r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0._animationScreenRef = r1
            return
    }

    private void onViewOptionsClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.showViewOptions()
            return
    }

    private void toggleNodeDrawMode() {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getIsOnlyDrawingMainNodes()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            boolean r1 = r1.getIsShowingCreationStaticNodes()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L23
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r0.setDrawOnlyMainNodes(r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r0.setShowCreationStaticNodes(r2)
            goto L3a
        L23:
            if (r1 == 0) goto L30
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r0.setDrawOnlyMainNodes(r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r0.setShowCreationStaticNodes(r3)
            goto L3a
        L30:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r0.setDrawOnlyMainNodes(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r0.setShowCreationStaticNodes(r2)
        L3a:
            r4.updateButtonText()
            return
    }

    private void toggleShowingNodeDrawOrder() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r0.getSessionData()
            boolean r1 = r1.getIsShowingCreationDrawOrder()
            r1 = r1 ^ 1
            r0.setShowCreationDrawOrder(r1)
            r2.updateButtonText()
            return
    }

    private void updateButtonText() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r1 = r0.getIsShowingCreationDrawOrder()
            if (r1 == 0) goto L16
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r3._drawOrderButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalShortDrawOrderOnStyle()
            r1.setStyle(r2)
            goto L1f
        L16:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r3._drawOrderButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalShortDrawOrderOffStyle()
            r1.setStyle(r2)
        L1f:
            boolean r1 = r0.getIsOnlyDrawingMainNodes()
            if (r1 == 0) goto L2f
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r3._nodesToShowButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalShortShowNodesNoneStyle()
            r0.setStyle(r1)
            goto L48
        L2f:
            boolean r0 = r0.getIsShowingCreationStaticNodes()
            if (r0 == 0) goto L3f
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r3._nodesToShowButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalShortShowNodesAllStyle()
            r0.setStyle(r1)
            goto L48
        L3f:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r3._nodesToShowButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalShortShowNodesDynamicStyle()
            r0.setStyle(r1)
        L48:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._nodesToShowButton = r0
            r1._drawOrderButton = r0
            r1._viewOptionsButton = r0
            r1._testSmartStretchButton = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r4, com.badlogic.gdx.scenes.scene2d.utils.Drawable r5) {
            r3 = this;
            super.initialize(r5)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r4 = r4.getSessionData()
            boolean r4 = r4.getRiggerModeEnabled()
            r5 = 1060320051(0x3f333333, float:0.7)
            if (r4 == 0) goto L16
            r0 = 1060320051(0x3f333333, float:0.7)
            goto L18
        L16:
            r0 = 1065353216(0x3f800000, float:1.0)
        L18:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalShortShowNodesAllStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r1)
            r3._nodesToShowButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable$1 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable$1
            r2.<init>(r3)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r3._nodesToShowButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r3.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = r3._nodesToShowButton
            float r2 = r2.getHeight()
            float r2 = r2 * r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.height(r2)
            r2 = 16
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalShortDrawOrderOffStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r1)
            r3._drawOrderButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable$2 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable$2
            r2.<init>(r3)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r3._drawOrderButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r3.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = r3._drawOrderButton
            float r2 = r2.getHeight()
            float r2 = r2 * r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.height(r2)
            r2 = 8
            r1.align(r2)
            r3.row()
            r1 = 2
            if (r4 == 0) goto La0
            java.lang.String r4 = "smartStretchTestButton"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeTestSmartStretchStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r4, r2)
            r3._testSmartStretchButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable$3 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable$3
            r2.<init>(r3)
            r4.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._testSmartStretchButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r3._testSmartStretchButton
            float r2 = r2.getHeight()
            float r2 = r2 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.height(r2)
            r4.colspan(r1)
            r3.row()
        La0:
            java.lang.String r4 = "viewOptions"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeViewOptionsStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r4, r5)
            r3._viewOptionsButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable$4 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable$4
            r5.<init>(r3)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._viewOptionsButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r5 = r3._viewOptionsButton
            float r5 = r5.getHeight()
            float r5 = r5 * r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.height(r5)
            r4.colspan(r1)
            r3.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r0 = this;
            r0.updateButtonText()
            return
    }
}
