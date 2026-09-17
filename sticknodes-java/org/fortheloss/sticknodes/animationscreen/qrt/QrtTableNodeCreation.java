package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QrtTableNodeCreation extends org.fortheloss.sticknodes.animationscreen.qrt.QrtTable {
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonCircleEllipseUpsideDown;
    private final com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> mButtonCircleEllipseUpsideDownCellRef;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonCircleHalfArc;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonCopy;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonCopySingle;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonDelete;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonDeleteSingle;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonDragLock;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonFlipX;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonFlipY;
    private final com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> mButtonGradientCellRef;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonGradientHorizontal;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonGradientRadial;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonGradientVertical;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonPaste;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonPolygonNumVerts;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonReverseGradient;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonRotate;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonScale;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonScaleRatio;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonSegmentCurve;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonStatic;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonStretch;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonThickness;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonTrapezoidCurve;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonTrapezoidEnd;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonTrapezoidStart;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonTriangleRightL;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonTriangleRightNone;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonTriangleRightR;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonTriangleUpsideDown;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorButtonGradient;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorButtonPolyfill;
    private final org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorButtonSegment;
    private final com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> mColorPolyfillButtonCellRef;
    private final com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> mRightTriangleButtonCellRef;
    private final com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> mShapeTableCellRef;
    private final com.badlogic.gdx.scenes.scene2d.ui.Table mShapeTableCircleEllipse;
    private final com.badlogic.gdx.scenes.scene2d.ui.Table mShapeTablePolygon;
    private final com.badlogic.gdx.scenes.scene2d.ui.Table mShapeTableSegment;
    private final com.badlogic.gdx.scenes.scene2d.ui.Table mShapeTableTrapezoid;
    private final com.badlogic.gdx.scenes.scene2d.ui.Table mShapeTableTriangle;

































    public QrtTableNodeCreation(org.fortheloss.sticknodes.animationscreen.AnimationScreen r17, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r18, float r19, float r20) {
            r16 = this;
            r0 = r16
            r16.<init>(r17, r18, r19, r20)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0.mContextRef
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            boolean r2 = r1.getIsLeftHandMode()
            boolean r3 = r1.getIsMagnifierVisible()
            r5 = 8
            if (r2 == 0) goto L1a
            r6 = 16
            goto L1c
        L1a:
            r6 = 8
        L1c:
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r7.<init>()
            r0.mTopTable = r7
            com.badlogic.gdx.scenes.scene2d.Touchable r8 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r7.setTouchable(r8)
            r7 = 1135804416(0x43b30000, float:358.0)
            r9 = 1109393408(0x42200000, float:40.0)
            r10 = 18
            r11 = 1101004800(0x41a00000, float:20.0)
            if (r2 == 0) goto L4e
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r0.mTopTable
            r13 = 10
            r12.align(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r0.mTopTable
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r13
            float r13 = r13 * r11
            float r7 = r7 + r13
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r12.padTop(r7)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r9
            r7.padLeft(r12)
            goto L67
        L4e:
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r0.mTopTable
            r12.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r0.mTopTable
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r13
            float r13 = r13 * r11
            float r7 = r7 + r13
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r12.padTop(r7)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r9
            r7.padRight(r12)
        L67:
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.defaults()
            r12 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.uniform(r12)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r11
            r7.space(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r0.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.fill()
            r7.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r7.<init>()
            r0.mBottomTable = r7
            r7.setTouchable(r8)
            r7 = 1128792064(0x43480000, float:200.0)
            r8 = 20
            r13 = 12
            r14 = 1114636288(0x42700000, float:60.0)
            if (r2 == 0) goto Lcc
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r0.mBottomTable
            r15.align(r13)
            if (r3 == 0) goto Lba
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.mBottomTable
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r15
            float r15 = r15 * r9
            float r7 = r7 + r15
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.padLeft(r7)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r14
            r3.padBottom(r7)
            goto Lf9
        Lba:
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.mBottomTable
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.padLeft(r7)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r14
            r3.padBottom(r7)
            goto Lf9
        Lcc:
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r0.mBottomTable
            r15.align(r8)
            if (r3 == 0) goto Le8
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.mBottomTable
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r15
            float r15 = r15 * r9
            float r7 = r7 + r15
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.padRight(r7)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r14
            r3.padBottom(r7)
            goto Lf9
        Le8:
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.mBottomTable
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.padRight(r7)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r14
            r3.padBottom(r7)
        Lf9:
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.uniform(r12)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r11
            r3.space(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expand()
            r3.fill()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r3.<init>()
            if (r2 == 0) goto L121
            r7 = 12
            goto L123
        L121:
            r7 = 20
        L123:
            r3.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r3.defaults()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r11
            r7.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.fillX()
            r7.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r7.<init>()
            if (r2 == 0) goto L14b
            r8 = 12
        L14b:
            r7.align(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.defaults()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r11
            r8.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = r0.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.expandX()
            r8.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r8.<init>()
            r0.mShapeTableSegment = r8
            r8.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r8.defaults()
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            float r15 = r15 * r11
            r9.space(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$1 r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$1
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r4 = 1
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r15 = r15.getButtonStyle(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r13 = r0.mDockRef
            r9.<init>(r0, r15, r13)
            r0.mButtonSegmentCurve = r9
            r9.setCapabilities(r12, r4, r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r13.<init>(r9)
            r9.addListener(r13)
            r9.setShowText(r4)
            r9.setTextAlign(r6)
            r8.add(r9)
            r8.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r9.<init>()
            r0.mShapeTableTrapezoid = r9
            r9.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r9.defaults()
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            float r15 = r15 * r11
            r13.space(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$2 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$2
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r15 = r15.getButtonStyle(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r13.<init>(r0, r15, r14)
            r0.mButtonTrapezoidCurve = r13
            r13.setCapabilities(r12, r4, r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r14.<init>(r13)
            r13.addListener(r14)
            r13.setShowText(r4)
            r13.setTextAlign(r6)
            r9.add(r13)
            r9.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$3 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$3
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r15 = 2
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r14 = r14.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r13.<init>(r0, r14, r15)
            r0.mButtonTrapezoidStart = r13
            r13.setCapabilities(r12, r4, r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r14.<init>(r13)
            r13.addListener(r14)
            r13.setShowText(r4)
            r13.setTextAlign(r6)
            r9.add(r13)
            r9.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$4 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$4
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r15 = 3
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r14 = r14.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r13.<init>(r0, r14, r15)
            r0.mButtonTrapezoidEnd = r13
            r13.setCapabilities(r12, r4, r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r14.<init>(r13)
            r13.addListener(r14)
            r13.setShowText(r4)
            r13.setTextAlign(r6)
            r9.add(r13)
            r9.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$5 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$5
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r15 = 35
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r14 = r14.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r13.<init>(r0, r14, r15)
            r0.mButtonScaleRatio = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r14.<init>(r13)
            r13.addListener(r14)
            r9.add(r13)
            r9.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r9.<init>()
            r0.mShapeTableCircleEllipse = r9
            r9.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r9.defaults()
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r11
            r13.space(r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$6 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$6
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r15 = 4
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r14 = r14.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r13.<init>(r0, r14, r15)
            r0.mButtonCircleHalfArc = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r14.<init>(r13)
            r13.addListener(r14)
            r13.setCapabilities(r12, r12, r12)
            r13.setShowText(r4, r12)
            r9.add(r13)
            r9.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$7 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$7
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r15 = 80
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r14 = r14.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r13.<init>(r0, r14, r15)
            r0.mButtonCircleEllipseUpsideDown = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r14.<init>(r13)
            r13.addListener(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.add(r13)
            r0.mButtonCircleEllipseUpsideDownCellRef = r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r9.<init>()
            r0.mShapeTableTriangle = r9
            r9.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r9.defaults()
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r11
            r13.space(r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$8 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$8
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r15 = 52
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r14 = r14.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r13.<init>(r0, r14, r15)
            r0.mButtonTriangleRightL = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r14.<init>(r13)
            r13.addListener(r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$9 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$9
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r15 = 51
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r14 = r14.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r13.<init>(r0, r14, r15)
            r0.mButtonTriangleRightNone = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r14.<init>(r13)
            r13.addListener(r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$10 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$10
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r15 = 50
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r14 = r14.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r13.<init>(r0, r14, r15)
            r0.mButtonTriangleRightR = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r14.<init>(r13)
            r13.addListener(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r9.add(r13)
            r0.mRightTriangleButtonCellRef = r13
            r9.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$11 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$11
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r15 = 7
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r14 = r14.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r13.<init>(r0, r14, r15)
            r0.mButtonTriangleUpsideDown = r13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r14.<init>(r13)
            r13.addListener(r14)
            r9.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r9.<init>()
            r0.mShapeTablePolygon = r9
            r9.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r9.defaults()
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r11
            r13.space(r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$12 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$12
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r5 = r14.getButtonStyle(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r13.<init>(r0, r5, r14)
            r0.mButtonPolygonNumVerts = r13
            r13.setCapabilities(r12, r4, r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r5 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r5.<init>(r13)
            r13.addListener(r5)
            r13.setShowText(r4)
            r13.setTextAlign(r6)
            r9.add(r13)
            r9.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r5.<init>()
            r5.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.defaults()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r11
            r6.space(r9)
            if (r2 == 0) goto L394
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandY()
            r6.fillY()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandY()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.fillY()
            r0.mShapeTableCellRef = r6
            goto L3b1
        L394:
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandY()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.fillY()
            r0.mShapeTableCellRef = r6
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandY()
            r6.fillY()
        L3b1:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$13 r6 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$13
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r0.mDockRef
            r9 = 11
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r8 = r8.getButtonStyle(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            r6.<init>(r0, r8, r9)
            r0.mButtonDeleteSingle = r6
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$14 r8 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$14
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            r10 = 9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r9 = r9.getButtonStyle(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r8.<init>(r0, r9, r10, r6)
            r0.mButtonDelete = r8
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$LongPressListener r6 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$LongPressListener
            r6.<init>(r8)
            r8.addListener(r6)
            if (r2 == 0) goto L3e7
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r9 = 1114636288(0x42700000, float:60.0)
            float r6 = r6 * r9
            r8.setLeftTouchPadding(r6)
            goto L3f0
        L3e7:
            r9 = 1114636288(0x42700000, float:60.0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r9
            r8.setRightTouchPadding(r6)
        L3f0:
            r5.add(r8)
            r5.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$15 r6 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$15
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r0.mDockRef
            r9 = 13
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r8 = r8.getButtonStyle(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            r6.<init>(r0, r8, r9)
            r0.mButtonCopySingle = r6
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$16 r8 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$16
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            r10 = 12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r9 = r9.getButtonStyle(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r8.<init>(r0, r9, r10, r6)
            r0.mButtonCopy = r8
            if (r2 == 0) goto L424
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r9 = 1114636288(0x42700000, float:60.0)
            float r6 = r6 * r9
            r8.setLeftTouchPadding(r6)
            goto L42d
        L424:
            r9 = 1114636288(0x42700000, float:60.0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r9
            r8.setRightTouchPadding(r6)
        L42d:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$LongPressListener r6 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$LongPressListener
            r6.<init>(r8)
            r8.addListener(r6)
            r5.add(r8)
            r5.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$17 r6 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$17
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r0.mDockRef
            r9 = 14
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r8 = r8.getButtonStyle(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            r6.<init>(r0, r8, r9)
            r0.mButtonPaste = r6
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r8 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r8.<init>(r6)
            r6.addListener(r8)
            if (r2 == 0) goto L460
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            r9 = 1114636288(0x42700000, float:60.0)
            float r8 = r8 * r9
            r6.setLeftTouchPadding(r8)
            goto L469
        L460:
            r9 = 1114636288(0x42700000, float:60.0)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r9
            r6.setRightTouchPadding(r8)
        L469:
            r5.add(r6)
            r5.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$18 r6 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$18
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r0.mDockRef
            r9 = 15
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r8 = r8.getButtonStyle(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            r6.<init>(r0, r8, r9)
            r0.mButtonFlipX = r6
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r8 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r8.<init>(r6)
            r6.addListener(r8)
            if (r2 == 0) goto L494
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            r9 = 1114636288(0x42700000, float:60.0)
            float r8 = r8 * r9
            r6.setLeftTouchPadding(r8)
            goto L49d
        L494:
            r9 = 1114636288(0x42700000, float:60.0)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r9
            r6.setRightTouchPadding(r8)
        L49d:
            r5.add(r6)
            r5.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$19 r6 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$19
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r0.mDockRef
            r9 = 16
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r8 = r8.getButtonStyle(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            r6.<init>(r0, r8, r9)
            r0.mButtonFlipY = r6
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r8 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r8.<init>(r6)
            r6.addListener(r8)
            if (r2 == 0) goto L4c8
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r8 = 1114636288(0x42700000, float:60.0)
            float r2 = r2 * r8
            r6.setLeftTouchPadding(r2)
            goto L4d1
        L4c8:
            r8 = 1114636288(0x42700000, float:60.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r8
            r6.setRightTouchPadding(r2)
        L4d1:
            r5.add(r6)
            r5.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$20 r2 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$20
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r5 = r0.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r5 = r5.getColorButtonPolyfillStyle()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r6 = r0.mDockRef
            r2.<init>(r0, r5, r6, r4)
            r0.mColorButtonPolyfill = r2
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener r5 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener
            r5.<init>(r2)
            r2.addListener(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$21 r5 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$21
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r6 = r0.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r6 = r6.getColorButtonStyle()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = r0.mDockRef
            r5.<init>(r0, r6, r8)
            r0.mColorButtonSegment = r5
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener r6 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener
            r6.<init>(r5)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r6.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r6.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.uniform(r12)
            r9 = 1092616192(0x41200000, float:10.0)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r10 * r9
            r8.space(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$22 r8 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$22
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            r10 = 17
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r9 = r9.getButtonStyle(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r8.<init>(r0, r9, r10)
            r0.mButtonReverseGradient = r8
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r9.<init>(r8)
            r8.addListener(r9)
            r8.setCapabilities(r12, r12, r12)
            r6.add(r8)
            r6.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$23 r8 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$23
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            r10 = 70
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r9 = r9.getButtonStyle(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r8.<init>(r0, r9, r10)
            r0.mButtonGradientVertical = r8
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r9.<init>(r8)
            r8.addListener(r9)
            r8.setCapabilities(r12, r12, r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$24 r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$24
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r11 = 71
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r10 = r10.getButtonStyle(r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r11 = r0.mDockRef
            r9.<init>(r0, r10, r11)
            r0.mButtonGradientHorizontal = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r10.<init>(r9)
            r9.addListener(r10)
            r9.setCapabilities(r12, r12, r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$25 r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$25
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r11 = 72
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r10 = r10.getButtonStyle(r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r11 = r0.mDockRef
            r9.<init>(r0, r10, r11)
            r0.mButtonGradientRadial = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r10.<init>(r9)
            r9.addListener(r10)
            r9.setCapabilities(r12, r12, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r6.add(r8)
            r0.mButtonGradientCellRef = r8
            r6.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$26 r8 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$26
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r9 = r0.mDockRef
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r9 = r9.getColorButtonStyle()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r8.<init>(r0, r9, r10)
            r0.mColorButtonGradient = r8
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ColorButtonListener
            r9.<init>(r8)
            r8.addListener(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$27 r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$27
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10 = r0.mDockRef
            r11 = 19
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r10 = r10.getButtonStyle(r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r11 = r0.mDockRef
            r9.<init>(r0, r10, r11)
            r0.mButtonStretch = r9
            r9.setCapabilities(r4, r12, r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r10.<init>(r9)
            r9.addListener(r10)
            r9.setShowText(r4)
            r9.setTextClickEnabled(r4)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r11 = 1114636288(0x42700000, float:60.0)
            float r10 = r10 * r11
            r9.setBottomTouchPadding(r10)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$28 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$28
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r11 = r0.mDockRef
            r13 = 21
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r11 = r11.getButtonStyle(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r13 = r0.mDockRef
            r10.<init>(r0, r11, r13)
            r0.mButtonThickness = r10
            r10.setCapabilities(r4, r12, r12)
            r10.setHasDoubleClick(r4)
            r10.setHasClickAction(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r11 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r11.<init>(r10)
            r10.addListener(r11)
            r10.setShowText(r4)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            r13 = 1114636288(0x42700000, float:60.0)
            float r11 = r11 * r13
            r10.setBottomTouchPadding(r11)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$29 r11 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$29
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r13 = r0.mDockRef
            r14 = 22
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r13 = r13.getButtonStyle(r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r11.<init>(r0, r13, r14)
            r0.mButtonScale = r11
            r11.setCapabilities(r4, r12, r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r13.<init>(r11)
            r11.addListener(r13)
            r11.setShowText(r4)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            r14 = 1114636288(0x42700000, float:60.0)
            float r13 = r13 * r14
            r11.setBottomTouchPadding(r13)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$30 r13 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$30
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            r15 = 23
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r14 = r14.getButtonStyle(r15)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r13.<init>(r0, r14, r15)
            r0.mButtonRotate = r13
            r13.setCapabilities(r12, r12, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r14.<init>(r13)
            r13.addListener(r14)
            r13.setShowText(r4)
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1114636288(0x42700000, float:60.0)
            float r14 = r14 * r15
            r13.setBottomTouchPadding(r14)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$31 r14 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$31
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r4 = 24
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r4 = r15.getButtonStyle(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r14.<init>(r0, r4, r15)
            r0.mButtonDragLock = r14
            r4 = 1
            r14.setCapabilities(r12, r12, r4)
            r14.setTextClickEnabled(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r15 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            r15.<init>(r14)
            r14.addListener(r15)
            r14.setShowText(r4, r12)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1114636288(0x42700000, float:60.0)
            float r4 = r4 * r15
            r14.setBottomTouchPadding(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$32 r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation$32
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r12 = 26
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r15.getButtonStyle(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r15 = r0.mDockRef
            r4.<init>(r0, r12, r15)
            r0.mButtonStatic = r4
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            r12.<init>(r4)
            r4.addListener(r12)
            r12 = 0
            r4.setCapabilities(r12, r12, r12)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1114636288(0x42700000, float:60.0)
            float r12 = r12 * r15
            r4.setBottomTouchPadding(r12)
            boolean r1 = r1.getIsLeftHandMode()
            r12 = 0
            if (r1 == 0) goto L6d9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r3.add(r2)
            r0.mColorPolyfillButtonCellRef = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r3.add(r5)
            r1.spaceLeft(r12)
            r3.add(r6)
            r3.add(r8)
            r7.add(r4)
            r7.add(r14)
            r7.add(r13)
            r7.add(r11)
            r7.add(r10)
            r7.add(r9)
            goto L6fe
        L6d9:
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r3.add(r2)
            r0.mColorPolyfillButtonCellRef = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r3.add(r5)
            r1.spaceLeft(r12)
            r3.add(r6)
            r3.add(r8)
            r7.add(r9)
            r7.add(r10)
            r7.add(r11)
            r7.add(r13)
            r7.add(r14)
            r7.add(r4)
        L6fe:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.qrt.QrtTable
    public void update(java.lang.Object r9) {
            r8 = this;
            boolean r0 = r9 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r0 == 0) goto L337
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = (org.fortheloss.sticknodes.stickfigure.StickNode) r9
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r8.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            int r1 = r9.getLimbType()
            r2 = 6
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L85
            int r1 = r9.getLimbType()
            if (r1 != r4) goto L1d
            goto L85
        L1d:
            int r1 = r9.getLimbType()
            if (r1 == r3) goto L75
            int r1 = r9.getLimbType()
            r5 = 5
            if (r1 != r5) goto L2b
            goto L75
        L2b:
            int r1 = r9.getLimbType()
            r5 = 3
            if (r1 != r5) goto L42
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r8.mShapeTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r8.mShapeTableTriangle
            if (r1 == r5) goto L94
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r8.mShapeTableCellRef
            r1.setActor(r5)
            goto L94
        L42:
            int r1 = r9.getLimbType()
            if (r1 != r2) goto L58
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r8.mShapeTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r8.mShapeTableTrapezoid
            if (r1 == r5) goto L94
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r8.mShapeTableCellRef
            r1.setActor(r5)
            goto L94
        L58:
            int r1 = r9.getLimbType()
            r5 = 7
            if (r1 != r5) goto L6f
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r8.mShapeTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r8.mShapeTablePolygon
            if (r1 == r5) goto L94
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r8.mShapeTableCellRef
            r1.setActor(r5)
            goto L94
        L6f:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r8.mShapeTableCellRef
            r1.clearActor()
            goto L94
        L75:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r8.mShapeTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r8.mShapeTableCircleEllipse
            if (r1 == r5) goto L94
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r8.mShapeTableCellRef
            r1.setActor(r5)
            goto L94
        L85:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r8.mShapeTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r8.mShapeTableSegment
            if (r1 == r5) goto L94
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r1 = r8.mShapeTableCellRef
            r1.setActor(r5)
        L94:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonSegmentCurve
            boolean r5 = r9.getSegmentCurveCirculization()
            r1.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonSegmentCurve
            int r5 = r9.getSegmentCurve()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r1.setText(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonTrapezoidCurve
            boolean r5 = r9.getSegmentCurveCirculization()
            r1.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonTrapezoidCurve
            int r5 = r9.getSegmentCurve()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r1.setText(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonTrapezoidStart
            boolean r5 = r9.getTrapezoidIsRounded1()
            r1.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonTrapezoidStart
            float r5 = r9.getTrapezoidThickness1()
            int r5 = java.lang.Math.round(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r1.setText(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonTrapezoidEnd
            boolean r5 = r9.getTrapezoidIsRounded2()
            r1.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonTrapezoidEnd
            float r5 = r9.getTrapezoidThickness2()
            int r5 = java.lang.Math.round(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r1.setText(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonScaleRatio
            float r5 = r9.getTrapezoidRatio()
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L123
            r5 = 1
            goto L124
        L123:
            r5 = 0
        L124:
            r1.setChecked(r5)
            short r1 = r9.getRightTriangleDirection()
            r5 = -1
            if (r1 != r5) goto L13e
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mRightTriangleButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r5 = r8.mButtonTriangleRightL
            if (r1 == r5) goto L163
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mRightTriangleButtonCellRef
            r1.setActor(r5)
            goto L163
        L13e:
            short r1 = r9.getRightTriangleDirection()
            if (r1 != 0) goto L154
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mRightTriangleButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r5 = r8.mButtonTriangleRightNone
            if (r1 == r5) goto L163
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mRightTriangleButtonCellRef
            r1.setActor(r5)
            goto L163
        L154:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mRightTriangleButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r5 = r8.mButtonTriangleRightR
            if (r1 == r5) goto L163
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mRightTriangleButtonCellRef
            r1.setActor(r5)
        L163:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonCircleHalfArc
            boolean r5 = r9.isHalfArc()
            r1.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonCircleEllipseUpsideDown
            boolean r5 = r9.getTriangleUpsideDown()
            r1.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonCircleHalfArc
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L18d
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mButtonCircleEllipseUpsideDownCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r5 = r8.mButtonCircleEllipseUpsideDown
            if (r1 == r5) goto L192
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mButtonCircleEllipseUpsideDownCellRef
            r1.setActor(r5)
            goto L192
        L18d:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mButtonCircleEllipseUpsideDownCellRef
            r1.clearActor()
        L192:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonTriangleUpsideDown
            boolean r5 = r9.getTriangleUpsideDown()
            r1.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonPolygonNumVerts
            short r5 = r9.getNumPolygonVertices()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r1.setText(r5)
            boolean r1 = r9 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r1 == 0) goto L1d5
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonStretch
            r1.setChecked(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonStretch
            r5 = r9
            org.fortheloss.sticknodes.stickfigure.Connector r5 = (org.fortheloss.sticknodes.stickfigure.Connector) r5
            float r5 = r5.getNodeValue()
            r1.setText(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonScale
            r1.setEnabled(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonRotate
            r1.setEnabled(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonDragLock
            r1.setEnabled(r7)
            goto L1f6
        L1d5:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonStretch
            boolean r5 = r9.isStretchy()
            r1.setChecked(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonStretch
            float r5 = r9.getLength()
            r1.setText(r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonScale
            r1.setEnabled(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonRotate
            r1.setEnabled(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonDragLock
            r1.setEnabled(r4)
        L1f6:
            int r1 = r9.getLimbType()
            if (r1 != r2) goto L204
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonThickness
            java.lang.String r2 = "-"
            r1.setText(r2)
            goto L219
        L204:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonThickness
            int r2 = r9.getThickness()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.setText(r2)
        L219:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonScale
            boolean r2 = r9.isUsingSegmentScale()
            r1.setChecked(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonScale
            float r2 = r9.getScale()
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonRotate
            float r2 = r9.getAngle()
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonDragLock
            boolean r2 = r9.getIsDragLocked()
            r1.setChecked(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonDragLock
            float r2 = r9.getDragLockAngle()
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonStatic
            boolean r2 = r9.isStatic()
            r1.setChecked(r2)
            boolean r1 = r9.isPolyfillAnchor()
            if (r1 == 0) goto L283
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r8.mColorButtonPolyfill
            com.badlogic.gdx.graphics.Color r2 = r9.getPolyfillColor()
            boolean r5 = r9.isUsingPolyfillColor()
            r1.setProperties(r2, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r1 = r8.mColorPolyfillButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r2 = r8.mColorButtonPolyfill
            if (r1 == r2) goto L296
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r1 = r8.mColorPolyfillButtonCellRef
            r1.setActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r1 = r8.mColorPolyfillButtonCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r1.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.defaults()
            float r2 = r2.getSpaceRight()
            r1.spaceRight(r2)
            goto L296
        L283:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r1 = r8.mColorPolyfillButtonCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            if (r1 == 0) goto L296
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r1 = r8.mColorPolyfillButtonCellRef
            r1.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton> r1 = r8.mColorPolyfillButtonCellRef
            r2 = 0
            r1.spaceRight(r2)
        L296:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r8.mColorButtonSegment
            com.badlogic.gdx.graphics.Color r2 = r9.getColor()
            boolean r5 = r9.isUsingSegmentColor()
            r1.setProperties(r2, r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r8.mColorButtonGradient
            com.badlogic.gdx.graphics.Color r2 = r9.getGradientColor()
            boolean r5 = r9.isUsingGradient()
            r1.setProperties(r2, r5)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonReverseGradient
            boolean r2 = r9.isReversedGradient()
            r1.setChecked(r2)
            short r1 = r9.getGradientMode()
            if (r1 != 0) goto L2cf
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mButtonGradientCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mButtonGradientHorizontal
            if (r1 == r2) goto L2fa
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mButtonGradientCellRef
            r1.setActor(r2)
            goto L2fa
        L2cf:
            short r1 = r9.getGradientMode()
            if (r1 != r4) goto L2e5
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mButtonGradientCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mButtonGradientVertical
            if (r1 == r2) goto L2fa
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mButtonGradientCellRef
            r1.setActor(r2)
            goto L2fa
        L2e5:
            short r1 = r9.getGradientMode()
            if (r1 != r3) goto L2fa
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mButtonGradientCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mButtonGradientRadial
            if (r1 == r2) goto L2fa
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.qrt.QrtButton> r1 = r8.mButtonGradientCellRef
            r1.setActor(r2)
        L2fa:
            boolean r9 = r9.isUsingGradient()
            if (r9 == 0) goto L315
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonReverseGradient
            r9.setEnabled(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonGradientHorizontal
            r9.setEnabled(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonGradientVertical
            r9.setEnabled(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonGradientRadial
            r9.setEnabled(r4)
            goto L329
        L315:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonReverseGradient
            r9.setEnabled(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonGradientHorizontal
            r9.setEnabled(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonGradientVertical
            r9.setEnabled(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonGradientRadial
            r9.setEnabled(r7)
        L329:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonPaste
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getCopiedStickNode()
            if (r0 == 0) goto L332
            goto L333
        L332:
            r4 = 0
        L333:
            r9.setEnabled(r4)
            return
        L337:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This table cannot update with an object of type "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
    }
}
