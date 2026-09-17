package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QrtTableTextfield extends org.fortheloss.sticknodes.animationscreen.qrt.QrtTable {
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> mAlignButtonCellRef;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonAlignCenter;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonAlignLeft;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonAlignRight;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonCopy;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonDelete;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonOpacity;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonPaste;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonRotate;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonScale;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorButtonShadow;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorButtonTextfield;












    public QrtTableTextfield(org.fortheloss.sticknodes.animationscreen.AnimationScreen r9, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10, float r11, float r12) {
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
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$1 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$1
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r2 = 11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r8.mDockRef
            r12.<init>(r8, r1, r2)
            r8.mButtonDelete = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mButtonDelete
            r1.<init>(r2)
            r12.addListener(r1)
            if (r10 == 0) goto L158
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonDelete
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setLeftTouchPadding(r1)
            goto L161
        L158:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonDelete
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setRightTouchPadding(r1)
        L161:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonDelete
            r11.add(r12)
            r11.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$2 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$2
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r2 = 13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r8.mDockRef
            r12.<init>(r8, r1, r2)
            r8.mButtonCopy = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mButtonCopy
            r1.<init>(r2)
            r12.addListener(r1)
            if (r10 == 0) goto L190
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonCopy
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setLeftTouchPadding(r1)
            goto L199
        L190:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonCopy
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setRightTouchPadding(r1)
        L199:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonCopy
            r11.add(r12)
            r11.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$3 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$3
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
            if (r10 == 0) goto L1c8
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonPaste
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setLeftTouchPadding(r1)
            goto L1d1
        L1c8:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonPaste
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setRightTouchPadding(r1)
        L1d1:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonPaste
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
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$4 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$4
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r0.getColorButtonStyle()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r10.<init>(r8, r0, r1)
            r8.mColorButtonTextfield = r10
            r0 = 1
            r10.setChecked(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r10 = r8.mColorButtonTextfield
            r10.setToggleable(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r10 = r8.mColorButtonTextfield
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r2 = r8.mColorButtonTextfield
            r1.<init>(r2)
            r10.addListener(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$5 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$5
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r1 = r1.getColorButtonStyle()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r8.mDockRef
            r10.<init>(r8, r1, r2)
            r8.mColorButtonShadow = r10
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r2 = r8.mColorButtonShadow
            r1.<init>(r2)
            r10.addListener(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$6 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$6
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r2 = 27
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r8.mDockRef
            r10.<init>(r8, r1, r2)
            r8.mButtonScale = r10
            r10.setCapabilities(r0, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonScale
            r10.setHasDoubleClick(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonScale
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mButtonScale
            r1.<init>(r2)
            r10.addListener(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonScale
            r10.setShowText(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonScale
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r10.setBottomTouchPadding(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$7 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$7
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r2 = 23
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r8.mDockRef
            r10.<init>(r8, r1, r2)
            r8.mButtonRotate = r10
            r10.setCapabilities(r4, r4, r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonRotate
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mButtonRotate
            r1.<init>(r2)
            r10.addListener(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonRotate
            r10.setShowText(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonRotate
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r10.setBottomTouchPadding(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$8 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$8
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r2 = 33
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r8.mDockRef
            r10.<init>(r8, r1, r2)
            r8.mButtonOpacity = r10
            r10.setCapabilities(r0, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonOpacity
            r10.setHasDoubleClick(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonOpacity
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mButtonOpacity
            r1.<init>(r2)
            r10.addListener(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonOpacity
            r10.setShowText(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonOpacity
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r10.setBottomTouchPadding(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$9 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$9
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r1 = 36
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r10.<init>(r8, r0, r1)
            r8.mButtonAlignLeft = r10
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonAlignLeft
            r0.<init>(r1)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonAlignLeft
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r10.setBottomTouchPadding(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$10 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$10
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r1 = 37
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r10.<init>(r8, r0, r1)
            r8.mButtonAlignCenter = r10
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonAlignCenter
            r0.<init>(r1)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonAlignCenter
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r10.setBottomTouchPadding(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$11 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield$11
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r1 = 38
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r10.<init>(r8, r0, r1)
            r8.mButtonAlignRight = r10
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonAlignRight
            r0.<init>(r1)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonAlignRight
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r10.setBottomTouchPadding(r0)
            boolean r9 = r9.getIsLeftHandMode()
            if (r9 == 0) goto L38e
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r9 = r8.mColorButtonTextfield
            r11.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r9 = r8.mColorButtonShadow
            r11.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonAlignCenter
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r12.add(r9)
            r8.mAlignButtonCellRef = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonOpacity
            r12.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonRotate
            r12.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonScale
            r12.add(r9)
            goto L3af
        L38e:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r9 = r8.mColorButtonTextfield
            r11.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r9 = r8.mColorButtonShadow
            r11.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonScale
            r12.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonRotate
            r12.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonOpacity
            r12.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonAlignCenter
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r12.add(r9)
            r8.mAlignButtonCellRef = r9
        L3af:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.qrt.QrtTable
    public void update(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof org.fortheloss.sticknodes.TextfieldBox
            if (r0 == 0) goto L8a
            org.fortheloss.sticknodes.TextfieldBox r6 = (org.fortheloss.sticknodes.TextfieldBox) r6
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r5.mButtonScale
            float r2 = r6.getScale()
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r5.mButtonRotate
            float r2 = r6.getRotation()
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r5.mButtonOpacity
            float r2 = r6.getAlpha()
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r5.mColorButtonTextfield
            com.badlogic.gdx.graphics.Color r2 = r6.getColor()
            r3 = 1
            r1.setProperties(r2, r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r5.mColorButtonShadow
            com.badlogic.gdx.graphics.Color r2 = r6.getShadowColor()
            boolean r4 = r6.hasShadow()
            r1.setProperties(r2, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r5.mButtonPaste
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCopiedTextfield()
            if (r0 == 0) goto L48
            r0 = 1
            goto L49
        L48:
            r0 = 0
        L49:
            r1.setEnabled(r0)
            int r0 = r6.getAlignment()
            r1 = 8
            if (r0 != r1) goto L64
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r6 = r5.mAlignButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r6.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r5.mButtonAlignLeft
            if (r6 == r0) goto L89
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r6 = r5.mAlignButtonCellRef
            r6.setActor(r0)
            goto L89
        L64:
            int r6 = r6.getAlignment()
            if (r6 != r3) goto L7a
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r6 = r5.mAlignButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r6.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r5.mButtonAlignCenter
            if (r6 == r0) goto L89
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r6 = r5.mAlignButtonCellRef
            r6.setActor(r0)
            goto L89
        L7a:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r6 = r5.mAlignButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r6.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r5.mButtonAlignRight
            if (r6 == r0) goto L89
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r6 = r5.mAlignButtonCellRef
            r6.setActor(r0)
        L89:
            return
        L8a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This table cannot update with an object of type "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }
}
