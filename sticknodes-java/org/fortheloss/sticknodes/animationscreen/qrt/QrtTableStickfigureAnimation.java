package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QrtTableStickfigureAnimation extends org.fortheloss.sticknodes.animationscreen.qrt.QrtTable {
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonCopyAndJoins;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonCopySingle;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonDeleteAndJoins;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonDeleteSingle;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonDragLock;
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
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonUnjoin;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorButtonPolyfill;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorButtonStickfigure;
    private final com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> mColorPolyfillButtonCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> mCopyButtonCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> mDeleteButtonCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> mJoinButtonCellRef;




















    public QrtTableStickfigureAnimation(org.fortheloss.sticknodes.animationscreen.AnimationScreen r11, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12, float r13, float r14) {
            r10 = this;
            r10.<init>(r11, r12, r13, r14)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10.mContextRef
            org.fortheloss.sticknodes.data.SessionData r11 = r11.getSessionData()
            boolean r12 = r11.getIsLeftHandMode()
            boolean r13 = r11.getIsMagnifierVisible()
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r14.<init>()
            r10.mTopTable = r14
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r14.setTouchable(r0)
            r14 = 1135804416(0x43b30000, float:358.0)
            r1 = 18
            r2 = 1109393408(0x42200000, float:40.0)
            r3 = 1101004800(0x41a00000, float:20.0)
            if (r12 == 0) goto L43
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r10.mTopTable
            r5 = 10
            r4.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r10.mTopTable
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r5
            float r5 = r5 * r3
            float r14 = r14 + r5
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r4.padTop(r14)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r2
            r14.padLeft(r4)
            goto L5c
        L43:
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r10.mTopTable
            r4.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r10.mTopTable
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r5
            float r5 = r5 * r3
            float r14 = r14 + r5
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r4.padTop(r14)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r2
            r14.padRight(r4)
        L5c:
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r10.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.defaults()
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.uniform(r4)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r3
            r14.space(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r10.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r10.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.fill()
            r14.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r14.<init>()
            r10.mBottomTable = r14
            r14.setTouchable(r0)
            r14 = 1128792064(0x43480000, float:200.0)
            r0 = 20
            r5 = 12
            r6 = 1114636288(0x42700000, float:60.0)
            if (r12 == 0) goto Lc1
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r10.mBottomTable
            r7.align(r5)
            if (r13 == 0) goto Laf
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r10.mBottomTable
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r7
            float r7 = r7 * r2
            float r14 = r14 + r7
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r13.padLeft(r14)
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r6
            r13.padBottom(r14)
            goto Lee
        Laf:
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r10.mBottomTable
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r13.padLeft(r14)
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r6
            r13.padBottom(r14)
            goto Lee
        Lc1:
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r10.mBottomTable
            r7.align(r0)
            if (r13 == 0) goto Ldd
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r10.mBottomTable
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r7
            float r7 = r7 * r2
            float r14 = r14 + r7
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r13.padRight(r14)
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r6
            r13.padBottom(r14)
            goto Lee
        Ldd:
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r10.mBottomTable
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r13.padRight(r14)
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r6
            r13.padBottom(r14)
        Lee:
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r10.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.uniform(r4)
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.space(r14)
            r14 = 4
            r13.align(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r10.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r10.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.expand()
            r13.fill()
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r13.<init>()
            r13.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.defaults()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r14.space(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$1 r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$1
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2 = r10.mDockRef
            r7 = 28
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r2 = r2.getButtonStyle(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r10.mDockRef
            r14.<init>(r10, r2, r7)
            r10.mButtonJumpToMain = r14
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r2 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r7 = r10.mButtonJumpToMain
            r2.<init>(r7)
            r14.addListener(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r14 = r10.mButtonJumpToMain
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.add(r14)
            r2 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.space(r2)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.spaceBottom(r7)
            r10.mButtonJumpToMainCellRef = r14
            r13.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$2 r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$2
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r10.mDockRef
            r8 = 32
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r7 = r7.getButtonStyle(r8)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r10.mDockRef
            r14.<init>(r10, r7, r8)
            r10.mButtonPushForward = r14
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r7 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r10.mButtonPushForward
            r7.<init>(r8)
            r14.addListener(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r14 = r10.mButtonPushForward
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.add(r14)
            r14.spaceTop(r2)
            r13.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$3 r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$3
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r10.mDockRef
            r8 = 31
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r7 = r7.getButtonStyle(r8)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r10.mDockRef
            r14.<init>(r10, r7, r8)
            r10.mButtonPushBackward = r14
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r7 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r10.mButtonPushBackward
            r7.<init>(r8)
            r14.addListener(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r14 = r10.mButtonPushBackward
            r13.add(r14)
            r13.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r14.<init>()
            r14.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r14.defaults()
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r3
            r1.space(r7)
            if (r12 == 0) goto L1d1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r10.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandY()
            r1.fillY()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r10.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r1.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.expandY()
            r13.fillY()
            goto L1eb
        L1d1:
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r10.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r1.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.expandY()
            r13.fillY()
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r10.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.expandY()
            r13.fillY()
        L1eb:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$4 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$4
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            r7 = 11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r10.mDockRef
            r13.<init>(r10, r1, r8)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$5 r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$5
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r10.mDockRef
            r9 = 9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r8 = r8.getButtonStyle(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r10.mDockRef
            r1.<init>(r10, r8, r9, r13)
            r10.mButtonDeleteAndJoins = r1
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$LongPressListener r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$LongPressListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r10.mButtonDeleteAndJoins
            r13.<init>(r8)
            r1.addListener(r13)
            if (r12 == 0) goto L221
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonDeleteAndJoins
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setLeftTouchPadding(r1)
            goto L22a
        L221:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonDeleteAndJoins
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setRightTouchPadding(r1)
        L22a:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$6 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$6
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r10.mDockRef
            r13.<init>(r10, r1, r7)
            r10.mButtonDeleteSingle = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r7 = r10.mButtonDeleteSingle
            r1.<init>(r7)
            r13.addListener(r1)
            if (r12 == 0) goto L24f
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonDeleteSingle
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setLeftTouchPadding(r1)
            goto L258
        L24f:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonDeleteSingle
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setRightTouchPadding(r1)
        L258:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonDeleteAndJoins
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r14.add(r13)
            r10.mDeleteButtonCellRef = r13
            r14.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$7 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$7
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            r7 = 13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r10.mDockRef
            r13.<init>(r10, r1, r8)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$8 r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$8
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r10.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r8 = r8.getButtonStyle(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r10.mDockRef
            r1.<init>(r10, r8, r9, r13)
            r10.mButtonCopyAndJoins = r1
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$LongPressListener r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$LongPressListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r10.mButtonCopyAndJoins
            r13.<init>(r8)
            r1.addListener(r13)
            if (r12 == 0) goto L297
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonCopyAndJoins
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setLeftTouchPadding(r1)
            goto L2a0
        L297:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonCopyAndJoins
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setRightTouchPadding(r1)
        L2a0:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$9 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$9
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r10.mDockRef
            r13.<init>(r10, r1, r7)
            r10.mButtonCopySingle = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r7 = r10.mButtonCopySingle
            r1.<init>(r7)
            r13.addListener(r1)
            if (r12 == 0) goto L2c5
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonCopySingle
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setLeftTouchPadding(r1)
            goto L2ce
        L2c5:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonCopySingle
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setRightTouchPadding(r1)
        L2ce:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonCopyAndJoins
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r14.add(r13)
            r10.mCopyButtonCellRef = r13
            r14.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$10 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$10
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            r7 = 14
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r10.mDockRef
            r13.<init>(r10, r1, r7)
            r10.mButtonPaste = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r7 = r10.mButtonPaste
            r1.<init>(r7)
            r13.addListener(r1)
            if (r12 == 0) goto L300
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonPaste
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setLeftTouchPadding(r1)
            goto L309
        L300:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonPaste
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setRightTouchPadding(r1)
        L309:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonPaste
            r14.add(r13)
            r14.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$11 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$11
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            r7 = 15
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r10.mDockRef
            r13.<init>(r10, r1, r7)
            r10.mButtonFlipX = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r7 = r10.mButtonFlipX
            r1.<init>(r7)
            r13.addListener(r1)
            if (r12 == 0) goto L338
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonFlipX
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setLeftTouchPadding(r1)
            goto L341
        L338:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonFlipX
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setRightTouchPadding(r1)
        L341:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonFlipX
            r14.add(r13)
            r14.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$12 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$12
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            r7 = 16
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r1.getButtonStyle(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r10.mDockRef
            r13.<init>(r10, r1, r7)
            r10.mButtonFlipY = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r7 = r10.mButtonFlipY
            r1.<init>(r7)
            r13.addListener(r1)
            if (r12 == 0) goto L370
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonFlipY
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setLeftTouchPadding(r1)
            goto L379
        L370:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonFlipY
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r6
            r13.setRightTouchPadding(r1)
        L379:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r13 = r10.mButtonFlipY
            r14.add(r13)
            r14.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r13.<init>()
            if (r12 == 0) goto L38b
            r14 = 12
            goto L38d
        L38b:
            r14 = 20
        L38d:
            r13.align(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.defaults()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r3
            r14.space(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r10.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.fillX()
            r14.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r14.<init>()
            if (r12 == 0) goto L3b5
            r0 = 12
        L3b5:
            r14.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r14.defaults()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r3
            r12.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r10.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expandX()
            r12.fillX()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$13 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$13
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r10.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r0.getColorButtonPolyfillStyle()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            r3 = 1
            r12.<init>(r10, r0, r1, r3)
            r10.mColorButtonPolyfill = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r10.mColorButtonPolyfill
            r0.<init>(r1)
            r12.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$14 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$14
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r10.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r0.getColorButtonStyle()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            r12.<init>(r10, r0, r1)
            r10.mColorButtonStickfigure = r12
            r12.setChecked(r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r12 = r10.mColorButtonStickfigure
            r12.setToggleable(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r12 = r10.mColorButtonStickfigure
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r10.mColorButtonStickfigure
            r0.<init>(r1)
            r12.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$15 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$15
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r10.mDockRef
            r1 = 27
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            r12.<init>(r10, r0, r1)
            r10.mButtonScale = r12
            r12.setCapabilities(r3, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r10.mButtonScale
            r12.setHasDoubleClick(r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r10.mButtonScale
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r10.mButtonScale
            r0.<init>(r1)
            r12.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r10.mButtonScale
            r12.setShowText(r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r10.mButtonScale
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r12.setBottomTouchPadding(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$16 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$16
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r10.mDockRef
            r1 = 23
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            r12.<init>(r10, r0, r1)
            r10.mButtonRotate = r12
            r12.setCapabilities(r4, r4, r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r10.mButtonRotate
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r10.mButtonRotate
            r0.<init>(r1)
            r12.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r10.mButtonRotate
            r12.setShowText(r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r10.mButtonRotate
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r12.setBottomTouchPadding(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$17 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$17
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r10.mDockRef
            r1 = 24
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            r12.<init>(r10, r0, r1)
            r10.mButtonDragLock = r12
            r12.setCapabilities(r4, r4, r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r10.mButtonDragLock
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r10.mButtonDragLock
            r0.<init>(r1)
            r12.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r10.mButtonDragLock
            r12.setShowText(r3, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r10.mButtonDragLock
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r12.setBottomTouchPadding(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$18 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$18
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r10.mDockRef
            r1 = 29
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            r12.<init>(r10, r0, r1)
            r10.mButtonJoin = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r10.mButtonJoin
            r0.<init>(r1)
            r12.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r10.mButtonJoin
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r12.setBottomTouchPadding(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$19 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation$19
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r10.mDockRef
            r1 = 30
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r10.mDockRef
            r12.<init>(r10, r0, r1)
            r10.mButtonUnjoin = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r10.mButtonUnjoin
            r0.<init>(r1)
            r12.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r10.mButtonUnjoin
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r12.setBottomTouchPadding(r0)
            boolean r11 = r11.getIsLeftHandMode()
            if (r11 == 0) goto L513
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r11 = r10.mColorButtonPolyfill
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r13.add(r11)
            r10.mColorPolyfillButtonCellRef = r11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r11 = r10.mColorButtonStickfigure
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r13.add(r11)
            r11.spaceLeft(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r10.mButtonJoin
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r14.add(r11)
            r10.mJoinButtonCellRef = r11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r10.mButtonDragLock
            r14.add(r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r10.mButtonRotate
            r14.add(r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r10.mButtonScale
            r14.add(r11)
            goto L53b
        L513:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r11 = r10.mColorButtonPolyfill
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r13.add(r11)
            r10.mColorPolyfillButtonCellRef = r11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r11 = r10.mColorButtonStickfigure
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r13.add(r11)
            r11.spaceLeft(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r10.mButtonScale
            r14.add(r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r10.mButtonRotate
            r14.add(r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r10.mButtonDragLock
            r14.add(r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r11 = r10.mButtonJoin
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r14.add(r11)
            r10.mJoinButtonCellRef = r11
        L53b:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.qrt.QrtTable
    public void update(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r0 == 0) goto L13e
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = (org.fortheloss.sticknodes.stickfigure.StickNode) r7
            boolean r0 = r7.isMainNode()
            if (r0 == 0) goto L136
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r7.getStickfigure()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r6.mContextRef
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            boolean r2 = r0.isJoined()
            r3 = 0
            if (r2 == 0) goto L38
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mButtonJumpToMainCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r4 = r6.mButtonJumpToMain
            if (r2 == r4) goto L4c
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mButtonJumpToMainCellRef
            r2.setActor(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mButtonJumpToMainCellRef
            r4 = 1101004800(0x41a00000, float:20.0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            r2.spaceBottom(r5)
            goto L4c
        L38:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mButtonJumpToMainCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r4 = r6.mButtonJumpToMain
            if (r2 != r4) goto L4c
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mButtonJumpToMainCellRef
            r2.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mButtonJumpToMainCellRef
            r2.spaceBottom(r3)
        L4c:
            boolean r2 = r0.hasJoinAnchorNode()
            if (r2 == 0) goto L71
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mDeleteButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r4 = r6.mButtonDeleteAndJoins
            if (r2 == r4) goto L61
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mDeleteButtonCellRef
            r2.setActor(r4)
        L61:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mCopyButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r4 = r6.mButtonCopyAndJoins
            if (r2 == r4) goto L8f
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mCopyButtonCellRef
            r2.setActor(r4)
            goto L8f
        L71:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mDeleteButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r4 = r6.mButtonDeleteSingle
            if (r2 == r4) goto L80
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mDeleteButtonCellRef
            r2.setActor(r4)
        L80:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mCopyButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r4 = r6.mButtonCopySingle
            if (r2 == r4) goto L8f
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r2 = r6.mCopyButtonCellRef
            r2.setActor(r4)
        L8f:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r6.mButtonScale
            float r4 = r0.getScale()
            r2.setText(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r6.mButtonRotate
            float r4 = r0.getRotation()
            r2.setText(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r6.mButtonDragLock
            boolean r4 = r7.getIsDragLocked()
            r2.setChecked(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r6.mButtonDragLock
            float r4 = r7.getDragLockAngle()
            r2.setText(r4)
            boolean r2 = r7.isPolyfillAnchor()
            if (r2 == 0) goto Le7
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r2 = r6.mColorButtonPolyfill
            com.badlogic.gdx.graphics.Color r3 = r7.getPolyfillColor()
            boolean r7 = r7.isUsingPolyfillColor()
            r2.setProperties(r3, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r7 = r6.mColorPolyfillButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r7.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r2 = r6.mColorButtonPolyfill
            if (r7 == r2) goto Lf9
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r7 = r6.mColorPolyfillButtonCellRef
            r7.setActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r7 = r6.mColorPolyfillButtonCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.defaults()
            float r2 = r2.getSpaceRight()
            r7.spaceRight(r2)
            goto Lf9
        Le7:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r7 = r6.mColorPolyfillButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r7.getActor()
            if (r7 == 0) goto Lf9
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r7 = r6.mColorPolyfillButtonCellRef
            r7.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r7 = r6.mColorPolyfillButtonCellRef
            r7.spaceRight(r3)
        Lf9:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r7 = r6.mColorButtonStickfigure
            com.badlogic.gdx.graphics.Color r2 = r0.getColor()
            r3 = 1
            r7.setProperties(r2, r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r7 = r6.mButtonPaste
            java.util.ArrayList r1 = r1.getCopiedStickfigureWithJoins()
            if (r1 == 0) goto L10c
            goto L10d
        L10c:
            r3 = 0
        L10d:
            r7.setEnabled(r3)
            boolean r7 = r0.isJoined()
            if (r7 == 0) goto L126
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r7 = r6.mJoinButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r7.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r6.mButtonUnjoin
            if (r7 == r0) goto L135
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r7 = r6.mJoinButtonCellRef
            r7.setActor(r0)
            goto L135
        L126:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r7 = r6.mJoinButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r7.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r6.mButtonJoin
            if (r7 == r0) goto L135
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r7 = r6.mJoinButtonCellRef
            r7.setActor(r0)
        L135:
            return
        L136:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "This table cannot update with a non-main node"
            r7.<init>(r0)
            throw r7
        L13e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This table cannot update with an object of type "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }
}
