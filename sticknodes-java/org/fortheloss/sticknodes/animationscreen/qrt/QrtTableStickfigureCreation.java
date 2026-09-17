package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QrtTableStickfigureCreation extends org.fortheloss.sticknodes.animationscreen.qrt.QrtTable {
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonDragLock;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonFlipX;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonFlipY;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonPaste;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonRotate;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonScale;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorButtonPolyfill;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorButtonStickfigure;
    private final com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> mColorPolyfillButtonCellRef;









    public QrtTableStickfigureCreation(org.fortheloss.sticknodes.animationscreen.AnimationScreen r9, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10, float r11, float r12) {
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
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r3
            r12.space(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r8.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expandY()
            r12.fillY()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$1 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$1
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r2 = 14
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r8.mDockRef
            r12.<init>(r8, r1, r2)
            r8.mButtonPaste = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mButtonPaste
            r1.<init>(r2)
            r12.addListener(r1)
            if (r10 == 0) goto L158
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonPaste
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setLeftTouchPadding(r1)
            goto L161
        L158:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonPaste
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setRightTouchPadding(r1)
        L161:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonPaste
            r11.add(r12)
            r11.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$2 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$2
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r2 = 15
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r8.mDockRef
            r12.<init>(r8, r1, r2)
            r8.mButtonFlipX = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mButtonFlipX
            r1.<init>(r2)
            r12.addListener(r1)
            if (r10 == 0) goto L190
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonFlipX
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setLeftTouchPadding(r1)
            goto L199
        L190:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonFlipX
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setRightTouchPadding(r1)
        L199:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonFlipX
            r11.add(r12)
            r11.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$3 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$3
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r2 = 16
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r8.mDockRef
            r12.<init>(r8, r1, r2)
            r8.mButtonFlipY = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mButtonFlipY
            r1.<init>(r2)
            r12.addListener(r1)
            if (r10 == 0) goto L1c8
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonFlipY
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setLeftTouchPadding(r1)
            goto L1d1
        L1c8:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonFlipY
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setRightTouchPadding(r1)
        L1d1:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonFlipY
            r11.add(r12)
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r11.<init>()
            if (r10 == 0) goto L1e3
            r12 = 12
            goto L1e5
        L1e3:
            r12 = 20
        L1e5:
            r11.align(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.defaults()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r3
            r12.space(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r8.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.fillX()
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r12.<init>()
            if (r10 == 0) goto L20c
            goto L20e
        L20c:
            r0 = 20
        L20e:
            r12.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r12.defaults()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r3
            r10.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r8.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expandX()
            r10.fillX()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$4 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$4
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r0.getColorButtonPolyfillStyle()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r2 = 1
            r10.<init>(r8, r0, r1, r2)
            r8.mColorButtonPolyfill = r10
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r8.mColorButtonPolyfill
            r0.<init>(r1)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$5 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$5
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r0.getColorButtonStyle()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r10.<init>(r8, r0, r1)
            r8.mColorButtonStickfigure = r10
            r10.setChecked(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r10 = r8.mColorButtonStickfigure
            r10.setToggleable(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r10 = r8.mColorButtonStickfigure
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r8.mColorButtonStickfigure
            r0.<init>(r1)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$6 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$6
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r1 = 27
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r10.<init>(r8, r0, r1)
            r8.mButtonScale = r10
            r10.setCapabilities(r2, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonScale
            r10.setHasDoubleClick(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonScale
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonScale
            r0.<init>(r1)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonScale
            r10.setShowText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonScale
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r10.setBottomTouchPadding(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$7 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$7
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r1 = 23
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r10.<init>(r8, r0, r1)
            r8.mButtonRotate = r10
            r10.setCapabilities(r4, r4, r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonRotate
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonRotate
            r0.<init>(r1)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonRotate
            r10.setShowText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonRotate
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r10.setBottomTouchPadding(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$8 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation$8
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r1 = 24
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r10.<init>(r8, r0, r1)
            r8.mButtonDragLock = r10
            r10.setCapabilities(r4, r4, r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonDragLock
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonDragLock
            r0.<init>(r1)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonDragLock
            r10.setShowText(r2, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonDragLock
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r10.setBottomTouchPadding(r0)
            boolean r9 = r9.getIsLeftHandMode()
            r10 = 0
            if (r9 == 0) goto L31d
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r9 = r8.mColorButtonPolyfill
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r11.add(r9)
            r8.mColorPolyfillButtonCellRef = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r9 = r8.mColorButtonStickfigure
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r11.add(r9)
            r9.spaceLeft(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonDragLock
            r12.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonRotate
            r12.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonScale
            r12.add(r9)
            goto L33d
        L31d:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r9 = r8.mColorButtonPolyfill
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r11.add(r9)
            r8.mColorPolyfillButtonCellRef = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r9 = r8.mColorButtonStickfigure
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r11.add(r9)
            r9.spaceLeft(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonScale
            r12.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonRotate
            r12.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonDragLock
            r12.add(r9)
        L33d:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.qrt.QrtTable
    public void update(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r0 == 0) goto La5
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            boolean r0 = r5.isMainNode()
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r4.mDockRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r5.getStickfigure()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r4.mButtonScale
            float r3 = r1.getScale()
            r2.setText(r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r4.mButtonRotate
            float r3 = r1.getRotation()
            r2.setText(r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r4.mButtonDragLock
            boolean r3 = r5.getIsDragLocked()
            r2.setChecked(r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r4.mButtonDragLock
            float r3 = r5.getDragLockAngle()
            r2.setText(r3)
            boolean r2 = r5.isPolyfillAnchor()
            if (r2 == 0) goto L72
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r2 = r4.mColorButtonPolyfill
            com.badlogic.gdx.graphics.Color r3 = r5.getPolyfillColor()
            boolean r5 = r5.isUsingPolyfillColor()
            r2.setProperties(r3, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r5 = r4.mColorPolyfillButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r2 = r4.mColorButtonPolyfill
            if (r5 == r2) goto L85
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r5 = r4.mColorPolyfillButtonCellRef
            r5.setActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r5 = r4.mColorPolyfillButtonCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r5.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.defaults()
            float r2 = r2.getSpaceRight()
            r5.spaceRight(r2)
            goto L85
        L72:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r5 = r4.mColorPolyfillButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getActor()
            if (r5 == 0) goto L85
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r5 = r4.mColorPolyfillButtonCellRef
            r5.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r5 = r4.mColorPolyfillButtonCellRef
            r2 = 0
            r5.spaceRight(r2)
        L85:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r5 = r4.mColorButtonStickfigure
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r2 = 1
            r5.setProperties(r1, r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r5 = r4.mButtonPaste
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getCopiedStickNode()
            if (r0 == 0) goto L98
            goto L99
        L98:
            r2 = 0
        L99:
            r5.setEnabled(r2)
            return
        L9d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "This table cannot update with a non-main node"
            r5.<init>(r0)
            throw r5
        La5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This table cannot update with an object of type "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }
}
