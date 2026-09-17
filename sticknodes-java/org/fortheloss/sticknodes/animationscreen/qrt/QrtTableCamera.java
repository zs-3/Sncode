package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QrtTableCamera extends org.fortheloss.sticknodes.animationscreen.qrt.QrtTable {
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonCopy;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonJumpToOrigin;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonModeA;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonModeB;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonModeC;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> mButtonModeCellRef;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonModeD;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonModeE;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonModeF;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonModeG;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonPaste;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonRotate;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonScale;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> mJumpToOriginCellRef;













    public QrtTableCamera(org.fortheloss.sticknodes.animationscreen.AnimationScreen r9, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10, float r11, float r12) {
            r8 = this;
            r8.<init>(r9, r10, r11, r12)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r8.mContextRef
            org.fortheloss.sticknodes.data.SessionData r9 = r9.getSessionData()
            boolean r10 = r9.getIsLeftHandMode()
            boolean r11 = r9.getIsMagnifierVisible()
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r12.<init>()
            r8.mTopTable = r12
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r12.setTouchable(r0)
            r12 = 1135804416(0x43b30000, float:358.0)
            r1 = 18
            r2 = 1109393408(0x42200000, float:40.0)
            r3 = 1101004800(0x41a00000, float:20.0)
            if (r10 == 0) goto L43
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r8.mTopTable
            r5 = 10
            r4.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r8.mTopTable
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r5
            float r5 = r5 * r3
            float r12 = r12 + r5
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r4.padTop(r12)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r2
            r12.padLeft(r4)
            goto L5c
        L43:
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r8.mTopTable
            r4.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r8.mTopTable
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r5
            float r5 = r5 * r3
            float r12 = r12 + r5
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r4.padTop(r12)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r2
            r12.padRight(r4)
        L5c:
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r8.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.defaults()
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.uniform(r4)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r3
            r12.space(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r8.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r8.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.fill()
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r12.<init>()
            r8.mBottomTable = r12
            r12.setTouchable(r0)
            r12 = 1128792064(0x43480000, float:200.0)
            r0 = 12
            r5 = 20
            r6 = 1114636288(0x42700000, float:60.0)
            if (r10 == 0) goto Lc1
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r8.mBottomTable
            r7.align(r0)
            if (r11 == 0) goto Laf
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r8.mBottomTable
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r7
            float r7 = r7 * r2
            float r12 = r12 + r7
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r11.padLeft(r12)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r6
            r11.padBottom(r12)
            goto Lee
        Laf:
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r8.mBottomTable
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r11.padLeft(r12)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r6
            r11.padBottom(r12)
            goto Lee
        Lc1:
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r8.mBottomTable
            r7.align(r5)
            if (r11 == 0) goto Ldd
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r8.mBottomTable
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r7
            float r7 = r7 * r2
            float r12 = r12 + r7
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r11.padRight(r12)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r6
            r11.padBottom(r12)
            goto Lee
        Ldd:
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r8.mBottomTable
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r11.padRight(r12)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r6
            r11.padBottom(r12)
        Lee:
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r8.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.uniform(r4)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.space(r12)
            r12 = 4
            r11.align(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r8.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r8.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.expand()
            r11.fill()
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r11.<init>()
            r11.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.defaults()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r12.space(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$1 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$1
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r8.mDockRef
            r7 = 41
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r2 = r2.getButtonStyle(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r8.mDockRef
            r12.<init>(r8, r2, r7)
            r8.mButtonJumpToOrigin = r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.add(r12)
            r2 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.space(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.spaceBottom(r2)
            r8.mJumpToOriginCellRef = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonJumpToOrigin
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r2 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r7 = r8.mButtonJumpToOrigin
            r2.<init>(r7)
            r12.addListener(r2)
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r12.<init>()
            r12.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r12.defaults()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r1.space(r2)
            if (r10 == 0) goto L187
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r8.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandY()
            r1.fillY()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r8.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r1.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.expandY()
            r11.fillY()
            goto L1a1
        L187:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r8.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r1.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.expandY()
            r11.fillY()
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r8.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.expandY()
            r11.fillY()
        L1a1:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$2 r11 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$2
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r2 = 39
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r8.mDockRef
            r11.<init>(r8, r1, r2)
            r8.mButtonCopy = r11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mButtonCopy
            r1.<init>(r2)
            r11.addListener(r1)
            if (r10 == 0) goto L1c8
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r8.mButtonCopy
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r11.setLeftTouchPadding(r1)
            goto L1d1
        L1c8:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r8.mButtonCopy
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r11.setRightTouchPadding(r1)
        L1d1:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r8.mButtonCopy
            r12.add(r11)
            r12.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$3 r11 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$3
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r2 = 14
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r8.mDockRef
            r11.<init>(r8, r1, r2)
            r8.mButtonPaste = r11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mButtonPaste
            r1.<init>(r2)
            r11.addListener(r1)
            if (r10 == 0) goto L200
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r8.mButtonPaste
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r11.setLeftTouchPadding(r1)
            goto L209
        L200:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r8.mButtonPaste
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r11.setRightTouchPadding(r1)
        L209:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r8.mButtonPaste
            r12.add(r11)
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r11.<init>()
            if (r10 == 0) goto L219
            goto L21b
        L219:
            r0 = 20
        L21b:
            r11.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r11.defaults()
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r3
            r10.space(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r8.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expandX()
            r10.fillX()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$4 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$4
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r8.mDockRef
            r0 = 40
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r12.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r10.<init>(r8, r12, r0)
            r8.mButtonScale = r10
            r12 = 1
            r10.setCapabilities(r12, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonScale
            r10.setHasDoubleClick(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonScale
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonScale
            r0.<init>(r1)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonScale
            r10.setShowText(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonScale
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r10.setBottomTouchPadding(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$5 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$5
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r1 = 23
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r10.<init>(r8, r0, r1)
            r8.mButtonRotate = r10
            r10.setCapabilities(r4, r4, r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonRotate
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonRotate
            r0.<init>(r1)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonRotate
            r10.setShowText(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonRotate
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r6
            r10.setBottomTouchPadding(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$6 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$6
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r8.mDockRef
            r0 = 42
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r12.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r10.<init>(r8, r12, r0)
            r8.mButtonModeA = r10
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r8.mButtonModeA
            r12.<init>(r0)
            r10.addListener(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeA
            r10.setCapabilities(r4, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeA
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r6
            r10.setBottomTouchPadding(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$7 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$7
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r8.mDockRef
            r0 = 43
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r12.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r10.<init>(r8, r12, r0)
            r8.mButtonModeB = r10
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r8.mButtonModeB
            r12.<init>(r0)
            r10.addListener(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeB
            r10.setCapabilities(r4, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeB
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r6
            r10.setBottomTouchPadding(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$8 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$8
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r8.mDockRef
            r0 = 44
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r12.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r10.<init>(r8, r12, r0)
            r8.mButtonModeC = r10
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r8.mButtonModeC
            r12.<init>(r0)
            r10.addListener(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeC
            r10.setCapabilities(r4, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeC
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r6
            r10.setBottomTouchPadding(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$9 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$9
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r8.mDockRef
            r0 = 45
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r12.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r10.<init>(r8, r12, r0)
            r8.mButtonModeD = r10
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r8.mButtonModeD
            r12.<init>(r0)
            r10.addListener(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeD
            r10.setCapabilities(r4, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeD
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r6
            r10.setBottomTouchPadding(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$10 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$10
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r8.mDockRef
            r0 = 46
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r12.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r10.<init>(r8, r12, r0)
            r8.mButtonModeE = r10
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r8.mButtonModeE
            r12.<init>(r0)
            r10.addListener(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeE
            r10.setCapabilities(r4, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeE
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r6
            r10.setBottomTouchPadding(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$11 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$11
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r8.mDockRef
            r0 = 47
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r12.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r10.<init>(r8, r12, r0)
            r8.mButtonModeF = r10
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r8.mButtonModeF
            r12.<init>(r0)
            r10.addListener(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeF
            r10.setCapabilities(r4, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeF
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r6
            r10.setBottomTouchPadding(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$12 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera$12
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r8.mDockRef
            r0 = 48
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r12.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r10.<init>(r8, r12, r0)
            r8.mButtonModeG = r10
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r8.mButtonModeG
            r12.<init>(r0)
            r10.addListener(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeG
            r10.setCapabilities(r4, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonModeG
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r6
            r10.setBottomTouchPadding(r12)
            boolean r9 = r9.getIsLeftHandMode()
            if (r9 == 0) goto L3d0
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonModeA
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r11.add(r9)
            r8.mButtonModeCellRef = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonRotate
            r11.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonScale
            r11.add(r9)
            goto L3e2
        L3d0:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonScale
            r11.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonRotate
            r11.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonModeA
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r11.add(r9)
            r8.mButtonModeCellRef = r9
        L3e2:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.qrt.QrtTable
    public void update(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.animationscreen.FrameCamera
            if (r0 == 0) goto Led
            org.fortheloss.sticknodes.animationscreen.FrameCamera r4 = (org.fortheloss.sticknodes.animationscreen.FrameCamera) r4
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r3.mDockRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r3.mButtonScale
            float r2 = r4.getCameraScale()
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r3.mButtonRotate
            float r2 = r4.getCameraRotationDeg()
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r3.mButtonPaste
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCopiedFrameCamera()
            r2 = 1
            if (r0 == 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            r1.setEnabled(r0)
            boolean r4 = r4.isAutoCamera()
            if (r4 == 0) goto L47
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mJumpToOriginCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r3.mButtonJumpToOrigin
            if (r4 == r0) goto L4c
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mJumpToOriginCellRef
            r4.setActor(r0)
            goto L4c
        L47:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mJumpToOriginCellRef
            r4.clearActor()
        L4c:
            byte r4 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            if (r4 != 0) goto L63
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r3.mButtonModeA
            if (r4 == r0) goto Lec
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            r4.setActor(r0)
            goto Lec
        L63:
            byte r4 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            if (r4 != r2) goto L7a
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r3.mButtonModeB
            if (r4 == r0) goto Lec
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            r4.setActor(r0)
            goto Lec
        L7a:
            byte r4 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            r0 = 2
            if (r4 != r0) goto L91
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r3.mButtonModeC
            if (r4 == r0) goto Lec
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            r4.setActor(r0)
            goto Lec
        L91:
            byte r4 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            r0 = 3
            if (r4 != r0) goto La8
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r3.mButtonModeD
            if (r4 == r0) goto Lec
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            r4.setActor(r0)
            goto Lec
        La8:
            byte r4 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            r0 = 4
            if (r4 != r0) goto Lbf
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r3.mButtonModeE
            if (r4 == r0) goto Lec
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            r4.setActor(r0)
            goto Lec
        Lbf:
            byte r4 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            r0 = 5
            if (r4 != r0) goto Ld6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r3.mButtonModeF
            if (r4 == r0) goto Lec
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            r4.setActor(r0)
            goto Lec
        Ld6:
            byte r4 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            r0 = 6
            if (r4 != r0) goto Lec
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r3.mButtonModeG
            if (r4 == r0) goto Lec
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r4 = r3.mButtonModeCellRef
            r4.setActor(r0)
        Lec:
            return
        Led:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This table cannot update with an object of type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
