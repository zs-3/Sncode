package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QrtTableNodeAnimation extends org.fortheloss.sticknodes.animationscreen.qrt.QrtTable {
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonDragLock;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonFlipX;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonFlipY;
    private final com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> mButtonGradientCellRef;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonGradientHorizontal;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonGradientRadial;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonGradientVertical;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonJoin;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonJumpToMain;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonLockNode;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonReverseGradient;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonRotate;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonScale;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonScaleRatio;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonSegmentCurve;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonStretch;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonThickness;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonTrapezoidCurve;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonTrapezoidEnd;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonTrapezoidStart;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonUnjoin;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorButtonGradient;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorButtonPolyfill;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorButtonSegment;
    private final com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> mColorPolyfillButtonCellRef;
    private final com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> mJoinButtonCellRef;
    private final com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mShapeTableCellRef;
    private final com.badlogic.gdx.scenes.scene2d.ui.Table mShapeTableSegment;
    private final com.badlogic.gdx.scenes.scene2d.ui.Table mShapeTableTrapezoid;
























    public QrtTableNodeAnimation(org.fortheloss.sticknodes.animationscreen.AnimationScreen r17, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r18, float r19, float r20) {
            r16 = this;
            r0 = r16
            r16.<init>(r17, r18, r19, r20)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0.mContextRef
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            boolean r2 = r1.getIsLeftHandMode()
            boolean r3 = r1.getIsMagnifierVisible()
            if (r2 == 0) goto L18
            r5 = 16
            goto L1a
        L18:
            r5 = 8
        L1a:
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r6.<init>()
            r0.mTopTable = r6
            com.badlogic.gdx.scenes.scene2d.Touchable r7 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r6.setTouchable(r7)
            r6 = 1135804416(0x43b30000, float:358.0)
            r8 = 18
            r9 = 1109393408(0x42200000, float:40.0)
            r10 = 1101004800(0x41a00000, float:20.0)
            if (r2 == 0) goto L4c
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r0.mTopTable
            r12 = 10
            r11.align(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r0.mTopTable
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r12
            float r12 = r12 * r10
            float r6 = r6 + r12
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r11.padTop(r6)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r9
            r6.padLeft(r11)
            goto L65
        L4c:
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r0.mTopTable
            r11.align(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r0.mTopTable
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r12
            float r12 = r12 * r10
            float r6 = r6 + r12
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r11.padTop(r6)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r9
            r6.padRight(r11)
        L65:
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.defaults()
            r11 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.uniform(r11)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r10
            r6.space(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.fill()
            r6.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r6.<init>()
            r0.mBottomTable = r6
            r6.setTouchable(r7)
            r6 = 1128792064(0x43480000, float:200.0)
            r7 = 12
            r12 = 20
            r13 = 1114636288(0x42700000, float:60.0)
            if (r2 == 0) goto Lca
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r0.mBottomTable
            r14.align(r7)
            if (r3 == 0) goto Lb8
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.mBottomTable
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r14
            float r14 = r14 * r9
            float r6 = r6 + r14
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.padLeft(r6)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r13
            r3.padBottom(r6)
            goto Lf7
        Lb8:
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.mBottomTable
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.padLeft(r6)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r13
            r3.padBottom(r6)
            goto Lf7
        Lca:
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r0.mBottomTable
            r14.align(r12)
            if (r3 == 0) goto Le6
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.mBottomTable
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r14
            float r14 = r14 * r9
            float r6 = r6 + r14
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.padRight(r6)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r13
            r3.padBottom(r6)
            goto Lf7
        Le6:
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.mBottomTable
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.padRight(r6)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r13
            r3.padBottom(r6)
        Lf7:
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.uniform(r11)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r10
            r3.space(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expand()
            r3.fill()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r3.<init>()
            if (r2 == 0) goto L11f
            r6 = 12
            goto L121
        L11f:
            r6 = 20
        L121:
            r3.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r3.defaults()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r10
            r6.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.fillX()
            r6.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r6.<init>()
            if (r2 == 0) goto L148
            goto L14a
        L148:
            r7 = 20
        L14a:
            r6.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.defaults()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r10
            r7.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.expandX()
            r7.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r7.<init>()
            r0.mShapeTableSegment = r7
            r7.align(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r7.defaults()
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r10
            r9.space(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$1 r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$1
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r0.mDockRef
            r14 = 1
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r12.getButtonStyle(r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r9.<init>(r0, r12, r15)
            r0.mButtonSegmentCurve = r9
            r9.setCapabilities(r11, r14, r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r12.<init>(r9)
            r9.addListener(r12)
            r9.setShowText(r14)
            r9.setTextAlign(r5)
            r7.add(r9)
            r7.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r9.<init>()
            r0.mShapeTableTrapezoid = r9
            r9.align(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r9.defaults()
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            float r15 = r15 * r10
            r12.space(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$2 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$2
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r15 = r15.getButtonStyle(r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r4 = r0.mDockRef
            r12.<init>(r0, r15, r4)
            r0.mButtonTrapezoidCurve = r12
            r12.setCapabilities(r11, r14, r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r4.<init>(r12)
            r12.addListener(r4)
            r12.setShowText(r14)
            r12.setTextAlign(r5)
            r9.add(r12)
            r9.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$3 r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$3
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r0.mDockRef
            r15 = 3
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r12.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r4.<init>(r0, r12, r15)
            r0.mButtonTrapezoidEnd = r4
            r4.setCapabilities(r11, r14, r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r12.<init>(r4)
            r4.addListener(r12)
            r4.setShowText(r14)
            r4.setTextAlign(r5)
            r9.add(r4)
            r9.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$4 r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$4
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r0.mDockRef
            r15 = 2
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r12.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r4.<init>(r0, r12, r15)
            r0.mButtonTrapezoidStart = r4
            r4.setCapabilities(r11, r14, r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r12.<init>(r4)
            r4.addListener(r12)
            r4.setShowText(r14)
            r4.setTextAlign(r5)
            r9.add(r4)
            r9.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$5 r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$5
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r5 = r0.mDockRef
            r12 = 35
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r5 = r5.getButtonStyle(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r0.mDockRef
            r4.<init>(r0, r5, r12)
            r0.mButtonScaleRatio = r4
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r5 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r5.<init>(r4)
            r4.addListener(r5)
            r9.add(r4)
            r9.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r4.<init>()
            r4.align(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.defaults()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r10
            r5.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r5.<init>()
            r5.align(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r5.defaults()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r10
            r8.space(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$6 r8 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$6
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            r10 = 28
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r9 = r9.getButtonStyle(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r8.<init>(r0, r9, r10)
            r0.mButtonJumpToMain = r8
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r9.<init>(r8)
            r8.addListener(r9)
            r5.add(r8)
            r5.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r5.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.expandY()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.fillY()
            r0.mShapeTableCellRef = r7
            if (r2 == 0) goto L2b9
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.expandY()
            r7.fillY()
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r7.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandY()
            r5.fillY()
            goto L2d3
        L2b9:
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r7.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandY()
            r5.fillY()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r0.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandY()
            r5.fillY()
        L2d3:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$7 r5 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$7
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r0.mDockRef
            r8 = 15
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r7 = r7.getButtonStyle(r8)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r0.mDockRef
            r5.<init>(r0, r7, r8)
            r0.mButtonFlipX = r5
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r7 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r7.<init>(r5)
            r5.addListener(r7)
            if (r2 == 0) goto L2f6
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r13
            r5.setLeftTouchPadding(r7)
            goto L2fd
        L2f6:
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r13
            r5.setRightTouchPadding(r7)
        L2fd:
            r4.add(r5)
            r4.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$8 r5 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$8
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r0.mDockRef
            r8 = 16
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r7 = r7.getButtonStyle(r8)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r0.mDockRef
            r5.<init>(r0, r7, r8)
            r0.mButtonFlipY = r5
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r7 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r7.<init>(r5)
            r5.addListener(r7)
            if (r2 == 0) goto L326
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r13
            r5.setLeftTouchPadding(r2)
            goto L32d
        L326:
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r13
            r5.setRightTouchPadding(r2)
        L32d:
            r4.add(r5)
            r4.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$9 r2 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$9
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r4 = r0.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r4 = r4.getColorButtonPolyfillStyle()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r5 = r0.mDockRef
            r2.<init>(r0, r4, r5, r14)
            r0.mColorButtonPolyfill = r2
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener
            r4.<init>(r2)
            r2.addListener(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$10 r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$10
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r5 = r0.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r5 = r5.getColorButtonStyle()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r7 = r0.mDockRef
            r4.<init>(r0, r5, r7)
            r0.mColorButtonSegment = r4
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener r5 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener
            r5.<init>(r4)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r5.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r5.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.uniform(r11)
            r8 = 1092616192(0x41200000, float:10.0)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.space(r9)
            r8 = 0
            r7.pad(r8)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$11 r7 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$11
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            r10 = 17
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r9 = r9.getButtonStyle(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r7.<init>(r0, r9, r10)
            r0.mButtonReverseGradient = r7
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r9.<init>(r7)
            r7.addListener(r9)
            r7.setCapabilities(r11, r11, r11)
            r5.add(r7)
            r5.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$12 r7 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$12
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            r10 = 70
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r9 = r9.getButtonStyle(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r7.<init>(r0, r9, r10)
            r0.mButtonGradientVertical = r7
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r9.<init>(r7)
            r7.addListener(r9)
            r7.setCapabilities(r11, r11, r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$13 r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$13
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r12 = 71
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r10 = r10.getButtonStyle(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r0.mDockRef
            r9.<init>(r0, r10, r12)
            r0.mButtonGradientHorizontal = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r10.<init>(r9)
            r9.addListener(r10)
            r9.setCapabilities(r11, r11, r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$14 r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$14
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r12 = 72
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r10 = r10.getButtonStyle(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r0.mDockRef
            r9.<init>(r0, r10, r12)
            r0.mButtonGradientRadial = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r10.<init>(r9)
            r9.addListener(r10)
            r9.setCapabilities(r11, r11, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r5.add(r7)
            r0.mButtonGradientCellRef = r7
            r5.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$15 r7 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$15
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r9 = r9.getColorButtonStyle()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r7.<init>(r0, r9, r10)
            r0.mColorButtonGradient = r7
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener
            r9.<init>(r7)
            r7.addListener(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$16 r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$16
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r12 = 19
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r10 = r10.getButtonStyle(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r0.mDockRef
            r9.<init>(r0, r10, r12)
            r0.mButtonStretch = r9
            r9.setCapabilities(r14, r11, r11)
            r9.setHasDoubleClick(r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r10.<init>(r9)
            r9.addListener(r10)
            r9.setShowText(r14)
            r9.setTextClickEnabled(r14)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r10 * r13
            r9.setBottomTouchPadding(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$17 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$17
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r0.mDockRef
            r15 = 21
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r12.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r10.<init>(r0, r12, r15)
            r0.mButtonThickness = r10
            r10.setCapabilities(r14, r11, r11)
            r10.setHasDoubleClick(r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r12.<init>(r10)
            r10.addListener(r12)
            r10.setShowText(r14)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r13
            r10.setBottomTouchPadding(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$18 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$18
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r8 = 22
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r8 = r15.getButtonStyle(r8)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r12.<init>(r0, r8, r15)
            r0.mButtonScale = r12
            r12.setCapabilities(r14, r11, r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r8 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r8.<init>(r12)
            r12.addListener(r8)
            r12.setShowText(r14, r11)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r13
            r12.setBottomTouchPadding(r8)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$19 r8 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$19
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r13 = 23
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r13 = r15.getButtonStyle(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r8.<init>(r0, r13, r15)
            r0.mButtonRotate = r8
            r8.setCapabilities(r11, r11, r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r13.<init>(r8)
            r8.addListener(r13)
            r8.setShowText(r14)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1114636288(0x42700000, float:60.0)
            float r13 = r13 * r15
            r8.setBottomTouchPadding(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$20 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$20
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r11 = 24
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r11 = r15.getButtonStyle(r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r13.<init>(r0, r11, r15)
            r0.mButtonDragLock = r13
            r11 = 0
            r13.setCapabilities(r11, r11, r14)
            r13.setTextClickEnabled(r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r15 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r15.<init>(r13)
            r13.addListener(r15)
            r13.setShowText(r14, r11)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            r14 = 1114636288(0x42700000, float:60.0)
            float r11 = r11 * r14
            r13.setBottomTouchPadding(r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$21 r11 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$21
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r15 = 25
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r14 = r14.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r11.<init>(r0, r14, r15)
            r0.mButtonLockNode = r11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r14.<init>(r11)
            r11.addListener(r14)
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1114636288(0x42700000, float:60.0)
            float r14 = r14 * r15
            r11.setBottomTouchPadding(r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$22 r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$22
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r19 = r9
            r9 = 29
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r9 = r15.getButtonStyle(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r14.<init>(r0, r9, r15)
            r0.mButtonJoin = r14
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r9.<init>(r14)
            r14.addListener(r9)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1114636288(0x42700000, float:60.0)
            float r9 = r9 * r15
            r14.setBottomTouchPadding(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$23 r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation$23
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r20 = r10
            r10 = 30
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r10 = r15.getButtonStyle(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r9.<init>(r0, r10, r15)
            r0.mButtonUnjoin = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r10.<init>(r9)
            r9.addListener(r10)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1114636288(0x42700000, float:60.0)
            float r10 = r10 * r15
            r9.setBottomTouchPadding(r10)
            boolean r1 = r1.getIsLeftHandMode()
            if (r1 == 0) goto L582
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r3.add(r2)
            r0.mColorPolyfillButtonCellRef = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r3.add(r4)
            r2 = 0
            r1.spaceLeft(r2)
            r3.add(r5)
            r3.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r14)
            r0.mJoinButtonCellRef = r1
            r6.add(r11)
            r6.add(r13)
            r6.add(r8)
            r6.add(r12)
            r1 = r20
            r6.add(r1)
            r9 = r19
            r6.add(r9)
            goto L5b2
        L582:
            r9 = r19
            r1 = r20
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.add(r2)
            r0.mColorPolyfillButtonCellRef = r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.add(r4)
            r4 = 0
            r2.spaceLeft(r4)
            r3.add(r5)
            r3.add(r7)
            r6.add(r9)
            r6.add(r1)
            r6.add(r12)
            r6.add(r8)
            r6.add(r13)
            r6.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r14)
            r0.mJoinButtonCellRef = r1
        L5b2:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.qrt.QrtTable
    public void update(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r0 == 0) goto L284
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = (org.fortheloss.sticknodes.stickfigure.StickNode) r8
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r8.getStickfigure()
            int r1 = r8.getLimbType()
            r2 = 6
            r3 = 1
            if (r1 == 0) goto L35
            int r1 = r8.getLimbType()
            if (r1 != r3) goto L19
            goto L35
        L19:
            int r1 = r8.getLimbType()
            if (r1 != r2) goto L2f
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r7.mShapeTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r7.mShapeTableTrapezoid
            if (r1 == r4) goto L44
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r7.mShapeTableCellRef
            r1.setActor(r4)
            goto L44
        L2f:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r7.mShapeTableCellRef
            r1.clearActor()
            goto L44
        L35:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r7.mShapeTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r7.mShapeTableSegment
            if (r1 == r4) goto L44
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r7.mShapeTableCellRef
            r1.setActor(r4)
        L44:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonSegmentCurve
            int r4 = r8.getSegmentCurve()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.setText(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonSegmentCurve
            boolean r4 = r8.getSegmentCurveCirculization()
            r1.setChecked(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonTrapezoidCurve
            int r4 = r8.getSegmentCurve()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.setText(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonTrapezoidCurve
            boolean r4 = r8.getSegmentCurveCirculization()
            r1.setChecked(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonTrapezoidStart
            boolean r4 = r8.getTrapezoidIsRounded1()
            r1.setChecked(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonTrapezoidStart
            float r4 = r8.getTrapezoidThickness1()
            int r4 = java.lang.Math.round(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.setText(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonTrapezoidEnd
            boolean r4 = r8.getTrapezoidIsRounded2()
            r1.setChecked(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonTrapezoidEnd
            float r4 = r8.getTrapezoidThickness2()
            int r4 = java.lang.Math.round(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.setText(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonScaleRatio
            float r4 = r8.getTrapezoidRatio()
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Ld3
            r4 = 1
            goto Ld4
        Ld3:
            r4 = 0
        Ld4:
            r1.setChecked(r4)
            boolean r1 = r8 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r1 == 0) goto Lfc
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonStretch
            r1.setChecked(r6)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonStretch
            r4 = r8
            org.fortheloss.sticknodes.stickfigure.Connector r4 = (org.fortheloss.sticknodes.stickfigure.Connector) r4
            float r4 = r4.getNodeValue()
            r1.setText(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonScale
            r1.setEnabled(r6)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonRotate
            r1.setEnabled(r6)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonDragLock
            r1.setEnabled(r6)
            goto L11d
        Lfc:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonStretch
            boolean r4 = r8.isStretchy()
            r1.setChecked(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonStretch
            float r4 = r8.getLength()
            r1.setText(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonScale
            r1.setEnabled(r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonRotate
            r1.setEnabled(r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonDragLock
            r1.setEnabled(r3)
        L11d:
            int r1 = r8.getLimbType()
            if (r1 != r2) goto L12b
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonThickness
            java.lang.String r2 = "-"
            r1.setText(r2)
            goto L140
        L12b:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonThickness
            int r2 = r8.getThickness()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.setText(r2)
        L140:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonScale
            boolean r2 = r8.isUsingSegmentScale()
            r1.setChecked(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonScale
            float r2 = r8.getScale()
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonRotate
            float r2 = r8.getAngle()
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonDragLock
            boolean r2 = r8.getIsDragLocked()
            r1.setChecked(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonDragLock
            float r2 = r8.getDragLockAngle()
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonLockNode
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r8.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getLockedStickNode()
            if (r2 != r8) goto L17b
            r2 = 1
            goto L17c
        L17b:
            r2 = 0
        L17c:
            r1.setChecked(r2)
            boolean r1 = r8.isPolyfillAnchor()
            if (r1 == 0) goto L1af
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r7.mColorButtonPolyfill
            com.badlogic.gdx.graphics.Color r2 = r8.getPolyfillColor()
            r1.setProperties(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r1 = r7.mColorPolyfillButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r2 = r7.mColorButtonPolyfill
            if (r1 == r2) goto L1c2
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r1 = r7.mColorPolyfillButtonCellRef
            r1.setActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r1 = r7.mColorPolyfillButtonCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r1.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.defaults()
            float r2 = r2.getSpaceRight()
            r1.spaceRight(r2)
            goto L1c2
        L1af:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r1 = r7.mColorPolyfillButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            if (r1 == 0) goto L1c2
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r1 = r7.mColorPolyfillButtonCellRef
            r1.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r1 = r7.mColorPolyfillButtonCellRef
            r2 = 0
            r1.spaceRight(r2)
        L1c2:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r7.mColorButtonSegment
            com.badlogic.gdx.graphics.Color r2 = r8.getColor()
            boolean r4 = r8.isUsingSegmentColor()
            r1.setProperties(r2, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r7.mColorButtonGradient
            com.badlogic.gdx.graphics.Color r2 = r8.getGradientColor()
            boolean r4 = r8.isUsingGradient()
            r1.setProperties(r2, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mButtonReverseGradient
            boolean r2 = r8.isReversedGradient()
            r1.setChecked(r2)
            short r1 = r8.getGradientMode()
            if (r1 == r3) goto L220
            int r1 = r8.getLimbType()
            r2 = 3
            if (r1 != r2) goto L1f3
            goto L220
        L1f3:
            short r1 = r8.getGradientMode()
            if (r1 != 0) goto L209
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r7.mButtonGradientCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r7.mButtonGradientHorizontal
            if (r1 == r2) goto L22f
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r7.mButtonGradientCellRef
            r1.setActor(r2)
            goto L22f
        L209:
            short r1 = r8.getGradientMode()
            r2 = 2
            if (r1 != r2) goto L22f
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r7.mButtonGradientCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r7.mButtonGradientRadial
            if (r1 == r2) goto L22f
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r7.mButtonGradientCellRef
            r1.setActor(r2)
            goto L22f
        L220:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r7.mButtonGradientCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r7.mButtonGradientVertical
            if (r1 == r2) goto L22f
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r7.mButtonGradientCellRef
            r1.setActor(r2)
        L22f:
            boolean r8 = r8.isUsingGradient()
            if (r8 == 0) goto L24a
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r7.mButtonReverseGradient
            r8.setEnabled(r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r7.mButtonGradientHorizontal
            r8.setEnabled(r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r7.mButtonGradientVertical
            r8.setEnabled(r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r7.mButtonGradientRadial
            r8.setEnabled(r3)
            goto L25e
        L24a:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r7.mButtonReverseGradient
            r8.setEnabled(r6)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r7.mButtonGradientHorizontal
            r8.setEnabled(r6)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r7.mButtonGradientVertical
            r8.setEnabled(r6)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r7.mButtonGradientRadial
            r8.setEnabled(r6)
        L25e:
            boolean r8 = r0.isJoined()
            if (r8 == 0) goto L274
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r8 = r7.mJoinButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r8 = r8.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r7.mButtonUnjoin
            if (r8 == r0) goto L283
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r8 = r7.mJoinButtonCellRef
            r8.setActor(r0)
            goto L283
        L274:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r8 = r7.mJoinButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r8 = r8.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r7.mButtonJoin
            if (r8 == r0) goto L283
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r8 = r7.mJoinButtonCellRef
            r8.setActor(r0)
        L283:
            return
        L284:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This table cannot update with an object of type "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }
}
