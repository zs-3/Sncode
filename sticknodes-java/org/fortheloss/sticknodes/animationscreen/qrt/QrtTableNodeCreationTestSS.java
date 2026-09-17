package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QrtTableNodeCreationTestSS extends org.fortheloss.sticknodes.animationscreen.qrt.QrtTable {
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonFlipX;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonFlipY;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonRotate;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButtonStretch;





    public QrtTableNodeCreationTestSS(org.fortheloss.sticknodes.animationscreen.AnimationScreen r9, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r10, float r11, float r12) {
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
            r11.space(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r8.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r8.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.expand()
            r11.fill()
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r11.<init>()
            if (r10 == 0) goto L116
            r12 = 12
            goto L118
        L116:
            r12 = 20
        L118:
            r11.align(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r11.defaults()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r12.space(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r8.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r12.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.fillX()
            r11.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r11.<init>()
            if (r10 == 0) goto L13f
            goto L141
        L13f:
            r0 = 20
        L141:
            r11.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r11.defaults()
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r3
            r10.space(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r8.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expandX()
            r10.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r10.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r10.defaults()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r3
            r12.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r8.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expandY()
            r12.fillY()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreationTestSS$1 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreationTestSS$1
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r1 = 15
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r12.<init>(r8, r0, r1)
            r8.mButtonFlipX = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonFlipX
            r0.<init>(r1)
            r12.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonFlipX
            r10.add(r12)
            r10.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreationTestSS$2 r12 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreationTestSS$2
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r1 = 16
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r8.mDockRef
            r12.<init>(r8, r0, r1)
            r8.mButtonFlipY = r12
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonFlipY
            r0.<init>(r1)
            r12.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r12 = r8.mButtonFlipY
            r10.add(r12)
            r10.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreationTestSS$3 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreationTestSS$3
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r12 = r8.mDockRef
            r0 = 19
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r12 = r12.getButtonStyle(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r8.mDockRef
            r10.<init>(r8, r12, r0)
            r8.mButtonStretch = r10
            r12 = 1
            r10.setCapabilities(r12, r4, r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonStretch
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$DragButtonListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mButtonStretch
            r0.<init>(r1)
            r10.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonStretch
            r10.setShowText(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonStretch
            r10.setTextClickEnabled(r12)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r10 = r8.mButtonStretch
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r6
            r10.setBottomTouchPadding(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreationTestSS$4 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreationTestSS$4
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
            boolean r9 = r9.getIsLeftHandMode()
            if (r9 == 0) goto L235
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonRotate
            r11.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonStretch
            r11.add(r9)
            goto L23f
        L235:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonStretch
            r11.add(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mButtonRotate
            r11.add(r9)
        L23f:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.qrt.QrtTable
    public void update(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r0 == 0) goto L3a
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r0 == 0) goto L21
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r3.mButtonStretch
            r1 = 0
            r0.setChecked(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r3.mButtonStretch
            org.fortheloss.sticknodes.stickfigure.Connector r4 = (org.fortheloss.sticknodes.stickfigure.Connector) r4
            float r4 = r4.getNodeValue()
            r0.setText(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r4 = r3.mButtonRotate
            r4.setEnabled(r1)
            goto L39
        L21:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r3.mButtonStretch
            boolean r1 = r4.isStretchy()
            r0.setChecked(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r3.mButtonStretch
            float r4 = r4.getLength()
            r0.setText(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r4 = r3.mButtonRotate
            r0 = 1
            r4.setEnabled(r0)
        L39:
            return
        L3a:
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
