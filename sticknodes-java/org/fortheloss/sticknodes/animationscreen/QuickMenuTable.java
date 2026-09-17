package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class QuickMenuTable extends com.badlogic.gdx.scenes.scene2d.ui.Table implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule _createToolsModuleRef;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _tableCamera;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _tableCreationConnectorMode;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _tableCreationPolyfillMode;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _tableFrame;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _tableMovieclipAnimation;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _tableNothingAnimation;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _tableNothingCreation;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _tableNothingMovieclip;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _tableSpriteAnimation;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _tableStickfigureAnimationAndMovieclip;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _tableStickfigureCreation;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _tableTextfield;
    private float _topLeftX;
    private float _topLeftY;


























    /* renamed from: -$$Nest$monToolClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m248$$Nest$monToolClick(org.fortheloss.sticknodes.animationscreen.QuickMenuTable r0, int r1) {
            r0.onToolClick(r1)
            return
    }

    public QuickMenuTable(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3, org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._topLeftX = r0
            r1._topLeftY = r0
            r1._animationScreenRef = r2
            r1._canvasModuleRef = r3
            r1._createToolsModuleRef = r4
            org.fortheloss.sticknodes.data.SessionData r2 = r2.getSessionData()
            r1._sessionDataRef = r2
            return
    }

    private void onToolClick(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.quickJumpMenuTo(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModuleRef
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            r2._canvasModuleRef = r0
            r2._createToolsModuleRef = r0
            r2._sessionDataRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._tableNothingAnimation
            if (r1 == 0) goto L12
            r1.clearChildren()
            r2._tableNothingAnimation = r0
        L12:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._tableNothingCreation
            if (r1 == 0) goto L1b
            r1.clearChildren()
            r2._tableNothingCreation = r0
        L1b:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._tableNothingMovieclip
            if (r1 == 0) goto L24
            r1.clearChildren()
            r2._tableNothingMovieclip = r0
        L24:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._tableStickfigureAnimationAndMovieclip
            if (r1 == 0) goto L2d
            r1.clearChildren()
            r2._tableStickfigureAnimationAndMovieclip = r0
        L2d:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._tableStickfigureCreation
            if (r1 == 0) goto L36
            r1.clearChildren()
            r2._tableStickfigureCreation = r0
        L36:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._tableCreationPolyfillMode
            if (r1 == 0) goto L3f
            r1.clearChildren()
            r2._tableCreationPolyfillMode = r0
        L3f:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._tableCreationConnectorMode
            if (r1 == 0) goto L48
            r1.clearChildren()
            r2._tableCreationConnectorMode = r0
        L48:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._tableMovieclipAnimation
            if (r1 == 0) goto L51
            r1.clearChildren()
            r2._tableMovieclipAnimation = r0
        L51:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._tableSpriteAnimation
            if (r1 == 0) goto L5a
            r1.clearChildren()
            r2._tableSpriteAnimation = r0
        L5a:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._tableCamera
            if (r1 == 0) goto L63
            r1.clearChildren()
            r2._tableCamera = r0
        L63:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._tableFrame
            if (r1 == 0) goto L6c
            r1.clearChildren()
            r2._tableFrame = r0
        L6c:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._tableTextfield
            if (r1 == 0) goto L75
            r1.clearChildren()
            r2._tableTextfield = r0
        L75:
            r2.clear()
            return
    }

    public void initialize(float r10, float r11) {
            r9 = this;
            r9._topLeftX = r10
            r9._topLeftY = r11
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r11 = 1101004800(0x41a00000, float:20.0)
            float r10 = r10 * r11
            r0 = 0
            r9.pad(r0, r10, r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r9.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r0)
            r1 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillY()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1117782016(0x42a00000, float:80.0)
            float r2 = r2 * r3
            r10.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r9._tableNothingAnimation = r10
            r10.pad(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._tableNothingAnimation
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padRight(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padLeft(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillY()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r10.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = "quickAppTools"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r4)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$1 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$1
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableNothingAnimation
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = "quickProjectTools"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r4)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$2 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$2
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableNothingAnimation
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = "quickAnimationTools"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r4, r5)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$3 r4 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$3
            r4.<init>(r9)
            r10.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9._tableNothingAnimation
            r4.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r4 = "quickLibraryTools"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r5, r6)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$4 r5 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$4
            r5.<init>(r9)
            r10.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9._tableNothingAnimation
            r5.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r5 = "quickTextfieldTools"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r6, r7)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$5 r6 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$5
            r6.<init>(r9)
            r10.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r9._tableNothingAnimation
            r6.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r9._tableNothingCreation = r10
            r10.pad(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._tableNothingCreation
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padRight(r6)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padLeft(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillY()
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r3
            r10.height(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r6 = "quickCreationModeTools"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r6, r7)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$6 r6 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$6
            r6.<init>(r9)
            r10.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r9._tableNothingCreation
            r6.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r9._tableNothingMovieclip = r10
            r10.pad(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._tableNothingMovieclip
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padRight(r6)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padLeft(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillY()
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r3
            r10.height(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r6 = "quickMovieclipTools"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r7, r8)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$7 r7 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$7
            r7.<init>(r9)
            r10.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r9._tableNothingMovieclip
            r7.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r7)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$8 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$8
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableNothingMovieclip
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r4)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$9 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$9
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableNothingMovieclip
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r9._tableStickfigureAnimationAndMovieclip = r10
            r10.pad(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._tableStickfigureAnimationAndMovieclip
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padRight(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padLeft(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillY()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r10.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = "quickStickfigureTools"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r4, r7)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$10 r4 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$10
            r4.<init>(r9)
            r10.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9._tableStickfigureAnimationAndMovieclip
            r4.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r4 = "quickStickfigureFilters"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r4, r7)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$11 r4 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$11
            r4.<init>(r9)
            r10.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9._tableStickfigureAnimationAndMovieclip
            r4.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r4 = "quickSegmentTools"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r7, r8)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$12 r7 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$12
            r7.<init>(r9)
            r10.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r9._tableStickfigureAnimationAndMovieclip
            r7.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r9._tableStickfigureCreation = r10
            r10.pad(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._tableStickfigureCreation
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r0)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padRight(r7)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padLeft(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillY()
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r3
            r10.height(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r7 = "quickShapeTools"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r7, r8)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$13 r7 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$13
            r7.<init>(r9)
            r10.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r9._tableStickfigureCreation
            r7.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r7)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$14 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$14
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableStickfigureCreation
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r4)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$15 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$15
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableStickfigureCreation
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = "quickSpecialSegmentTools"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r4)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$16 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$16
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableStickfigureCreation
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r9._tableCreationConnectorMode = r10
            r10.pad(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._tableCreationConnectorMode
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padRight(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padLeft(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillY()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r10.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = "quickConnectorTools"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r4)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$17 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$17
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableCreationConnectorMode
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r9._tableCreationPolyfillMode = r10
            r10.pad(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._tableCreationPolyfillMode
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padRight(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padLeft(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillY()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r10.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = "quickPolyfillTools"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r4)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$18 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$18
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableCreationPolyfillMode
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r9._tableMovieclipAnimation = r10
            r10.pad(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._tableMovieclipAnimation
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padRight(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padLeft(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillY()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r10.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r4)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$19 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$19
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableMovieclipAnimation
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = "quickMovieclipFilters"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r4)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$20 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$20
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableMovieclipAnimation
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r9._tableSpriteAnimation = r10
            r10.pad(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._tableSpriteAnimation
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padRight(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padLeft(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillY()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r10.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = "quickSpriteTools"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r4)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$21 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$21
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableSpriteAnimation
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = "quickSpriteFilters"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r4)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$22 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$22
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableSpriteAnimation
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r9._tableCamera = r10
            r10.pad(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._tableCamera
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padRight(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padLeft(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillY()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r10.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = "quickCameraTools"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r4)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$23 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$23
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableCamera
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r9._tableFrame = r10
            r10.pad(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._tableFrame
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padRight(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padLeft(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillY()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r10.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r2 = "quickFrameTools"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r2, r4)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$24 r2 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$24
            r2.<init>(r9)
            r10.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r9._tableFrame
            r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r9._tableTextfield = r10
            r10.pad(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._tableTextfield
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padRight(r0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.padLeft(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillY()
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r3
            r10.height(r11)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getQuickMenuTextButtonStyle()
            r10.<init>(r11, r0)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable$25 r11 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable$25
            r11.<init>(r9)
            r10.addListener(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r9._tableTextfield
            r11.add(r10)
            r9.update()
            return
    }

    public void update() {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            int r0 = r0.getScreen()
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            int r1 = r1.getCurrentlySelected()
            r4.clearChildren()
            r2 = 1
            if (r0 != r2) goto L28
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r4._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r3.getCurrentWorkingPolyfillAnchor()
            if (r3 == 0) goto L28
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "LOL"
            r0.println(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._tableCreationPolyfillMode
            r4.add(r0)
            goto L8f
        L28:
            if (r1 != 0) goto L40
            if (r0 != 0) goto L32
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._tableNothingAnimation
            r4.add(r0)
            goto L8f
        L32:
            if (r0 != r2) goto L3a
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._tableNothingCreation
            r4.add(r0)
            goto L8f
        L3a:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._tableNothingMovieclip
            r4.add(r0)
            goto L8f
        L40:
            r3 = 2
            if (r1 != r2) goto L64
            if (r0 == 0) goto L5e
            if (r0 != r3) goto L48
            goto L5e
        L48:
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r0 == 0) goto L58
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._tableCreationConnectorMode
            r4.add(r0)
            goto L8f
        L58:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._tableStickfigureCreation
            r4.add(r0)
            goto L8f
        L5e:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._tableStickfigureAnimationAndMovieclip
            r4.add(r0)
            goto L8f
        L64:
            r0 = 5
            if (r1 != r0) goto L6d
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._tableMovieclipAnimation
            r4.add(r0)
            goto L8f
        L6d:
            r0 = 6
            if (r1 != r0) goto L76
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._tableSpriteAnimation
            r4.add(r0)
            goto L8f
        L76:
            r0 = 4
            if (r1 != r0) goto L7f
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._tableFrame
            r4.add(r0)
            goto L8f
        L7f:
            r0 = 3
            if (r1 != r0) goto L88
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._tableCamera
            r4.add(r0)
            goto L8f
        L88:
            if (r1 != r3) goto L8f
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._tableTextfield
            r4.add(r0)
        L8f:
            r4.invalidate()
            r4.pack()
            float r0 = r4._topLeftX
            float r1 = r4._topLeftY
            r2 = 10
            r4.setPosition(r0, r1, r2)
            return
    }
}
