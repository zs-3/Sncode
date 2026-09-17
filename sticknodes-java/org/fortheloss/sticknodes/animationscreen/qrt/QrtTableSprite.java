package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QrtTableSprite extends org.fortheloss.sticknodes.animationscreen.qrt.QrtTable {
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonCopySingle;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonDeleteSingle;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonFlipX;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonFlipY;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonJoin;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonJumpToMain;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> mButtonJumpToMainCellRef;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonPaste;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonPushBackward;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonPushForward;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonRotate;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonScale;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonScaleMode;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonScaleRatio;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonUnjoin;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> mJoinButtonCellRef;















    public QrtTableSprite(org.fortheloss.sticknodes.animationscreen.AnimationScreen r10, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r11, float r12, float r13) {
            r9 = this;
            r9.<init>(r10, r11, r12, r13)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r9.mContextRef
            org.fortheloss.sticknodes.data.SessionData r10 = r10.getSessionData()
            boolean r11 = r10.getIsLeftHandMode()
            boolean r12 = r10.getIsMagnifierVisible()
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r13.<init>()
            r9.mTopTable = r13
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r13.setTouchable(r0)
            r13 = 1135804416(0x43b30000, float:358.0)
            r1 = 18
            r2 = 1109393408(0x42200000, float:40.0)
            r3 = 1101004800(0x41a00000, float:20.0)
            if (r11 == 0) goto L43
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mTopTable
            r5 = 10
            r4.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mTopTable
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r5
            float r5 = r5 * r3
            float r13 = r13 + r5
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r4.padTop(r13)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r2
            r13.padLeft(r4)
            goto L5c
        L43:
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mTopTable
            r4.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r9.mTopTable
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r5
            float r5 = r5 * r3
            float r13 = r13 + r5
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r4.padTop(r13)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r2
            r13.padRight(r4)
        L5c:
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r9.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.defaults()
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.uniform(r4)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r3
            r13.space(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r9.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r9.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.fill()
            r13.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r13.<init>()
            r9.mBottomTable = r13
            r13.setTouchable(r0)
            r13 = 1128792064(0x43480000, float:200.0)
            r0 = 12
            r5 = 20
            r6 = 1114636288(0x42700000, float:60.0)
            if (r11 == 0) goto Lc1
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r9.mBottomTable
            r7.align(r0)
            if (r12 == 0) goto Laf
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r9.mBottomTable
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r7
            float r7 = r7 * r2
            float r13 = r13 + r7
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r12.padLeft(r13)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r6
            r12.padBottom(r13)
            goto Lee
        Laf:
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r9.mBottomTable
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r12.padLeft(r13)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r6
            r12.padBottom(r13)
            goto Lee
        Lc1:
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r9.mBottomTable
            r7.align(r5)
            if (r12 == 0) goto Ldd
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r9.mBottomTable
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r7
            float r7 = r7 * r2
            float r13 = r13 + r7
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r12.padRight(r13)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r6
            r12.padBottom(r13)
            goto Lee
        Ldd:
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r9.mBottomTable
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r12.padRight(r13)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r6
            r12.padBottom(r13)
        Lee:
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r9.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.uniform(r4)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.space(r13)
            r13 = 4
            r12.align(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r9.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r9.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expand()
            r12.fill()
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r12.<init>()
            r12.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.defaults()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r13.space(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$1 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$1
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r9.mDockRef
            r7 = 28
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r2 = r2.getButtonStyle(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r9.mDockRef
            r13.<init>(r9, r2, r7)
            r9.mButtonJumpToMain = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r2 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r7 = r9.mButtonJumpToMain
            r2.<init>(r7)
            r13.addListener(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r9.mButtonJumpToMain
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r13)
            r2 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.space(r2)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.spaceBottom(r7)
            r9.mButtonJumpToMainCellRef = r13
            r12.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$2 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$2
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r9.mDockRef
            r8 = 32
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r7 = r7.getButtonStyle(r8)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r9.mDockRef
            r13.<init>(r9, r7, r8)
            r9.mButtonPushForward = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r7 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r9.mButtonPushForward
            r7.<init>(r8)
            r13.addListener(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r9.mButtonPushForward
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r13)
            r13.spaceTop(r2)
            r12.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$3 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$3
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r9.mDockRef
            r7 = 31
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r2 = r2.getButtonStyle(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r9.mDockRef
            r13.<init>(r9, r2, r7)
            r9.mButtonPushBackward = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r2 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r7 = r9.mButtonPushBackward
            r2.<init>(r7)
            r13.addListener(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r9.mButtonPushBackward
            r12.add(r13)
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r13.<init>()
            r13.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r13.defaults()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r1.space(r2)
            if (r11 == 0) goto L1d1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r9.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandY()
            r1.fillY()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r9.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r1.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expandY()
            r12.fillY()
            goto L1eb
        L1d1:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r9.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r1.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expandY()
            r12.fillY()
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r9.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expandY()
            r12.fillY()
        L1eb:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$4 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$4
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r9.mDockRef
            r2 = 11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r9.mDockRef
            r12.<init>(r9, r1, r2)
            r9.mButtonDeleteSingle = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r9.mButtonDeleteSingle
            r1.<init>(r2)
            r12.addListener(r1)
            if (r11 == 0) goto L212
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonDeleteSingle
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setLeftTouchPadding(r1)
            goto L21b
        L212:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonDeleteSingle
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setRightTouchPadding(r1)
        L21b:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonDeleteSingle
            r13.add(r12)
            r13.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$5 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$5
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r9.mDockRef
            r2 = 13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r9.mDockRef
            r12.<init>(r9, r1, r2)
            r9.mButtonCopySingle = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r9.mButtonCopySingle
            r1.<init>(r2)
            r12.addListener(r1)
            if (r11 == 0) goto L24a
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonCopySingle
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setLeftTouchPadding(r1)
            goto L253
        L24a:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonCopySingle
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setRightTouchPadding(r1)
        L253:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonCopySingle
            r13.add(r12)
            r13.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$6 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$6
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r9.mDockRef
            r2 = 14
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r9.mDockRef
            r12.<init>(r9, r1, r2)
            r9.mButtonPaste = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r9.mButtonPaste
            r1.<init>(r2)
            r12.addListener(r1)
            if (r11 == 0) goto L282
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonPaste
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setLeftTouchPadding(r1)
            goto L28b
        L282:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonPaste
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setRightTouchPadding(r1)
        L28b:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonPaste
            r13.add(r12)
            r13.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$7 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$7
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r9.mDockRef
            r2 = 15
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r9.mDockRef
            r12.<init>(r9, r1, r2)
            r9.mButtonFlipX = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r9.mButtonFlipX
            r1.<init>(r2)
            r12.addListener(r1)
            if (r11 == 0) goto L2ba
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonFlipX
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setLeftTouchPadding(r1)
            goto L2c3
        L2ba:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonFlipX
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setRightTouchPadding(r1)
        L2c3:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonFlipX
            r13.add(r12)
            r13.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$8 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$8
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r9.mDockRef
            r2 = 16
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r9.mDockRef
            r12.<init>(r9, r1, r2)
            r9.mButtonFlipY = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r9.mButtonFlipY
            r1.<init>(r2)
            r12.addListener(r1)
            if (r11 == 0) goto L2f2
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonFlipY
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setLeftTouchPadding(r1)
            goto L2fb
        L2f2:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonFlipY
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r12.setRightTouchPadding(r1)
        L2fb:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r9.mButtonFlipY
            r13.add(r12)
            r13.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r12.<init>()
            if (r11 == 0) goto L30b
            goto L30d
        L30b:
            r0 = 20
        L30d:
            r12.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r12.defaults()
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r3
            r11.space(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r9.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.expandX()
            r11.fillX()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$9 r11 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$9
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r13 = r9.mDockRef
            r0 = 27
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r13 = r13.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r9.mDockRef
            r11.<init>(r9, r13, r0)
            r9.mButtonScale = r11
            r13 = 1
            r11.setCapabilities(r13, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r9.mButtonScale
            r11.setHasDoubleClick(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r9.mButtonScale
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r9.mButtonScale
            r0.<init>(r1)
            r11.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r9.mButtonScale
            r11.setShowText(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r9.mButtonScale
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r11.setBottomTouchPadding(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$10 r11 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$10
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r9.mDockRef
            r1 = 23
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r9.mDockRef
            r11.<init>(r9, r0, r1)
            r9.mButtonRotate = r11
            r11.setCapabilities(r4, r4, r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r9.mButtonRotate
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r9.mButtonRotate
            r0.<init>(r1)
            r11.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r9.mButtonRotate
            r11.setShowText(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r9.mButtonRotate
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r6
            r11.setBottomTouchPadding(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$11 r11 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$11
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r13 = r9.mDockRef
            r0 = 35
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r13 = r13.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r9.mDockRef
            r11.<init>(r9, r13, r0)
            r9.mButtonScaleRatio = r11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r9.mButtonScaleRatio
            r13.<init>(r0)
            r11.addListener(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r9.mButtonScaleRatio
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r6
            r11.setBottomTouchPadding(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$12 r11 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$12
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r13 = r9.mDockRef
            r0 = 34
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r13 = r13.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r9.mDockRef
            r11.<init>(r9, r13, r0)
            r9.mButtonScaleMode = r11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r9.mButtonScaleMode
            r13.<init>(r0)
            r11.addListener(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r9.mButtonScaleMode
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r6
            r11.setBottomTouchPadding(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$13 r11 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$13
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r13 = r9.mDockRef
            r0 = 29
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r13 = r13.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r9.mDockRef
            r11.<init>(r9, r13, r0)
            r9.mButtonJoin = r11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r9.mButtonJoin
            r13.<init>(r0)
            r11.addListener(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r9.mButtonJoin
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r6
            r11.setBottomTouchPadding(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$14 r11 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite$14
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r13 = r9.mDockRef
            r0 = 30
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r13 = r13.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r9.mDockRef
            r11.<init>(r9, r13, r0)
            r9.mButtonUnjoin = r11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r9.mButtonUnjoin
            r13.<init>(r0)
            r11.addListener(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r9.mButtonUnjoin
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r6
            r11.setBottomTouchPadding(r13)
            boolean r10 = r10.getIsLeftHandMode()
            if (r10 == 0) goto L43d
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r9.mButtonJoin
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r12.add(r10)
            r9.mJoinButtonCellRef = r10
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r9.mButtonScaleMode
            r12.add(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r9.mButtonScaleRatio
            r12.add(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r9.mButtonRotate
            r12.add(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r9.mButtonScale
            r12.add(r10)
            goto L459
        L43d:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r9.mButtonScale
            r12.add(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r9.mButtonRotate
            r12.add(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r9.mButtonScaleRatio
            r12.add(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r9.mButtonScaleMode
            r12.add(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r9.mButtonJoin
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r12.add(r10)
            r9.mJoinButtonCellRef = r10
        L459:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.qrt.QrtTable
    public void update(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteNode
            if (r0 != 0) goto L28
            boolean r0 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L9
            goto L28
        L9:
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
        L28:
            boolean r0 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L2f
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = (org.fortheloss.sticknodes.sprite.SpriteRef) r5
            goto L35
        L2f:
            org.fortheloss.sticknodes.sprite.SpriteNode r5 = (org.fortheloss.sticknodes.sprite.SpriteNode) r5
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = r5.getSpriteReference()
        L35:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r1 = r5.isJoined()
            if (r1 == 0) goto L5c
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r4.mButtonJumpToMainCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r4.mButtonJumpToMain
            if (r1 == r2) goto L71
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r4.mButtonJumpToMainCellRef
            r1.setActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r4.mButtonJumpToMainCellRef
            r2 = 1101004800(0x41a00000, float:20.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r2
            r1.spaceBottom(r3)
            goto L71
        L5c:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r4.mButtonJumpToMainCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r4.mButtonJumpToMain
            if (r1 != r2) goto L71
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r4.mButtonJumpToMainCellRef
            r1.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r4.mButtonJumpToMainCellRef
            r2 = 0
            r1.spaceBottom(r2)
        L71:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r4.mButtonScale
            float r2 = r5.getScaleX()
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r4.mButtonRotate
            float r2 = r5.getRotation()
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r4.mButtonScaleRatio
            boolean r2 = r5.getScaleLinked()
            r1.setChecked(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r4.mButtonScaleMode
            boolean r2 = r5.isDragOriginBased()
            r3 = 1
            r2 = r2 ^ r3
            r1.setChecked(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r4.mButtonPaste
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCopiedSprite()
            if (r0 == 0) goto La0
            goto La1
        La0:
            r3 = 0
        La1:
            r1.setEnabled(r3)
            boolean r5 = r5.isJoined()
            if (r5 == 0) goto Lba
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r5 = r4.mJoinButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r4.mButtonUnjoin
            if (r5 == r0) goto Lc9
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r5 = r4.mJoinButtonCellRef
            r5.setActor(r0)
            goto Lc9
        Lba:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r5 = r4.mJoinButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r4.mButtonJoin
            if (r5 == r0) goto Lc9
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r5 = r4.mJoinButtonCellRef
            r5.setActor(r0)
        Lc9:
            return
    }
}
