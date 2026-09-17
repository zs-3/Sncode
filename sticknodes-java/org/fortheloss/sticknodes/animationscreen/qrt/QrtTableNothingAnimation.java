package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QrtTableNothingAnimation extends org.fortheloss.sticknodes.animationscreen.qrt.QrtTable {
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mPasteMovieclipButton;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mPasteSpriteButton;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mPasteStickfigureButton;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mPasteTextfieldButton;





    public QrtTableNothingAnimation(org.fortheloss.sticknodes.animationscreen.AnimationScreen r7, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8, float r9, float r10) {
            r6 = this;
            r6.<init>(r7, r8, r9, r10)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r6.mContextRef
            org.fortheloss.sticknodes.data.SessionData r7 = r7.getSessionData()
            boolean r8 = r7.getIsLeftHandMode()
            boolean r7 = r7.getIsMagnifierVisible()
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r9.<init>()
            r6.mTopTable = r9
            com.badlogic.gdx.scenes.scene2d.Touchable r10 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r9.setTouchable(r10)
            r9 = 1135804416(0x43b30000, float:358.0)
            r0 = 18
            r1 = 1101004800(0x41a00000, float:20.0)
            r2 = 1109393408(0x42200000, float:40.0)
            if (r8 == 0) goto L43
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r6.mTopTable
            r4 = 10
            r3.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r6.mTopTable
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r4
            float r4 = r4 * r1
            float r9 = r9 + r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r3.padTop(r9)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r2
            r9.padLeft(r3)
            goto L5c
        L43:
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r6.mTopTable
            r3.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r6.mTopTable
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r4
            float r4 = r4 * r1
            float r9 = r9 + r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r3.padTop(r9)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r2
            r9.padRight(r3)
        L5c:
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r6.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.defaults()
            r3 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.uniform(r3)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r1
            r9.space(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r6.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r6.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.fill()
            r9.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r9.<init>()
            r6.mBottomTable = r9
            r9.setTouchable(r10)
            r9 = 1128792064(0x43480000, float:200.0)
            r10 = 1114636288(0x42700000, float:60.0)
            if (r8 == 0) goto Lbf
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r6.mBottomTable
            r5 = 12
            r4.align(r5)
            if (r7 == 0) goto Lad
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r6.mBottomTable
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r4
            float r4 = r4 * r2
            float r9 = r9 + r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r7.padLeft(r9)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r10
            r7.padBottom(r9)
            goto Lee
        Lad:
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r6.mBottomTable
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r7.padLeft(r9)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r10
            r7.padBottom(r9)
            goto Lee
        Lbf:
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r6.mBottomTable
            r5 = 20
            r4.align(r5)
            if (r7 == 0) goto Ldd
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r6.mBottomTable
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r4
            float r4 = r4 * r2
            float r9 = r9 + r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r7.padRight(r9)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r10
            r7.padBottom(r9)
            goto Lee
        Ldd:
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r6.mBottomTable
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r7.padRight(r9)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r10
            r7.padBottom(r9)
        Lee:
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r6.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.uniform(r3)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r1
            r7.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r6.mBottomTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.expand()
            r7.fill()
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r7.<init>()
            r7.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r7.defaults()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            r9.space(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r6.mTopTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.expandY()
            r9.fillY()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNothingAnimation$1 r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNothingAnimation$1
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r6.mDockRef
            r1 = 60
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r6.mDockRef
            r9.<init>(r6, r0, r1)
            r6.mPasteStickfigureButton = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r6.mPasteStickfigureButton
            r0.<init>(r1)
            r9.addListener(r0)
            if (r8 == 0) goto L153
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r6.mPasteStickfigureButton
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r10
            r9.setLeftTouchPadding(r0)
            goto L15c
        L153:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r6.mPasteStickfigureButton
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r10
            r9.setRightTouchPadding(r0)
        L15c:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r6.mPasteStickfigureButton
            r7.add(r9)
            r7.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNothingAnimation$2 r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNothingAnimation$2
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r6.mDockRef
            r1 = 61
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r6.mDockRef
            r9.<init>(r6, r0, r1)
            r6.mPasteMovieclipButton = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r6.mPasteMovieclipButton
            r0.<init>(r1)
            r9.addListener(r0)
            if (r8 == 0) goto L18b
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r6.mPasteMovieclipButton
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r10
            r9.setLeftTouchPadding(r0)
            goto L194
        L18b:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r6.mPasteMovieclipButton
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r10
            r9.setRightTouchPadding(r0)
        L194:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r6.mPasteMovieclipButton
            r7.add(r9)
            r7.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNothingAnimation$3 r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNothingAnimation$3
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r6.mDockRef
            r1 = 62
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r6.mDockRef
            r9.<init>(r6, r0, r1)
            r6.mPasteSpriteButton = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r6.mPasteSpriteButton
            r0.<init>(r1)
            r9.addListener(r0)
            if (r8 == 0) goto L1c3
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r6.mPasteSpriteButton
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r10
            r9.setLeftTouchPadding(r0)
            goto L1cc
        L1c3:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r6.mPasteSpriteButton
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r10
            r9.setRightTouchPadding(r0)
        L1cc:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r6.mPasteSpriteButton
            r7.add(r9)
            r7.row()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNothingAnimation$4 r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNothingAnimation$4
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r6.mDockRef
            r1 = 63
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r0.getButtonStyle(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r6.mDockRef
            r9.<init>(r6, r0, r1)
            r6.mPasteTextfieldButton = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener r0 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$ToggleListener
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r6.mPasteTextfieldButton
            r0.<init>(r1)
            r9.addListener(r0)
            if (r8 == 0) goto L1fb
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r6.mPasteTextfieldButton
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r10
            r8.setLeftTouchPadding(r9)
            goto L204
        L1fb:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r6.mPasteTextfieldButton
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r10
            r8.setRightTouchPadding(r9)
        L204:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r8 = r6.mPasteTextfieldButton
            r7.add(r8)
            r7.row()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.qrt.QrtTable
    public void update(java.lang.Object r5) {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4.mContextRef
            org.fortheloss.sticknodes.data.SessionData r5 = r5.getSessionData()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r4.mPasteStickfigureButton
            java.util.ArrayList r1 = r5.getCopiedStickfigureWithJoins()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            r0.setEnabled(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r4.mPasteMovieclipButton
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r5.getCopiedMovieclip()
            if (r1 == 0) goto L26
            int r1 = r5.getScreen()
            if (r1 != 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            r0.setEnabled(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r4.mPasteSpriteButton
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r5.getCopiedSprite()
            if (r1 == 0) goto L34
            r1 = 1
            goto L35
        L34:
            r1 = 0
        L35:
            r0.setEnabled(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r4.mPasteTextfieldButton
            org.fortheloss.sticknodes.TextfieldBox r1 = r5.getCopiedTextfield()
            if (r1 == 0) goto L47
            int r5 = r5.getScreen()
            if (r5 != 0) goto L47
            goto L48
        L47:
            r2 = 0
        L48:
            r0.setEnabled(r2)
            return
    }
}
