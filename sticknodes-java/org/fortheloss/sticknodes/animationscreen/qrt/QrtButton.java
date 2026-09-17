package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QrtButton extends com.badlogic.gdx.scenes.scene2d.ui.ImageButton implements com.badlogic.gdx.utils.Disposable {
    private short mAutoIncrementDirection;
    private boolean mAutoIncrementHasBegun;
    private float mBottomTouchPadding;
    private boolean mCanDragX;
    private boolean mCanDragY;
    private boolean mCanRotate;
    private org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked mDockRef;
    private float mDragGradientSize;
    private float mDragX;
    private float mDragY;
    private boolean mEnabled;
    private boolean mHasClickAction;
    private boolean mHasDoubleClick;
    private float mInitialRotation;
    private float mLastRotation;
    private float mLeftTouchPadding;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mLongPressButton;
    private float mMaxDragExtra;
    private boolean mMaxDragHasCapped;
    private float mMaxDragSeconds;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener mNewClickListener;
    private float mPositionRememberX;
    private float mPositionRememberY;
    private float mRightTouchPadding;
    private float mRotation;
    private float mRotationAccumulator;
    private boolean mShowText;
    private boolean mShowTextWhenUnchecked;
    private byte mState;
    private java.lang.String mText;
    private int mTextAlign;
    private boolean mTextClickEnabled;

    public static class QrtButtonStyle extends com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle {
        public com.badlogic.gdx.graphics.g2d.TextureRegion dot;
        public com.badlogic.gdx.graphics.g2d.TextureRegion longPressIndicator;
        public com.badlogic.gdx.graphics.g2d.BitmapFont outlineFont;

        public QrtButtonStyle(com.badlogic.gdx.scenes.scene2d.utils.Drawable r8, com.badlogic.gdx.scenes.scene2d.utils.Drawable r9, com.badlogic.gdx.scenes.scene2d.utils.Drawable r10, com.badlogic.gdx.graphics.g2d.TextureRegion r11, com.badlogic.gdx.graphics.g2d.TextureRegion r12, com.badlogic.gdx.graphics.g2d.BitmapFont r13) {
                r7 = this;
                r0 = r7
                r1 = r8
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r10
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7.dot = r11
                r7.longPressIndicator = r12
                r7.outlineFont = r13
                float r8 = org.fortheloss.sticknodes.App.assetScaling
                r9 = 1073741824(0x40000000, float:2.0)
                float r10 = r8 * r9
                r7.unpressedOffsetY = r10
                r10 = -1073741824(0xffffffffc0000000, float:-2.0)
                float r10 = r10 * r8
                r7.pressedOffsetY = r10
                float r8 = r8 * r9
                r7.checkedOffsetY = r8
                return
        }

        public QrtButtonStyle(com.badlogic.gdx.scenes.scene2d.utils.Drawable r8, com.badlogic.gdx.scenes.scene2d.utils.Drawable r9, com.badlogic.gdx.scenes.scene2d.utils.Drawable r10, com.badlogic.gdx.scenes.scene2d.utils.Drawable r11, com.badlogic.gdx.graphics.g2d.TextureRegion r12, com.badlogic.gdx.graphics.g2d.TextureRegion r13, com.badlogic.gdx.graphics.g2d.BitmapFont r14) {
                r7 = this;
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r8
                r3 = r9
                r4 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7.dot = r12
                r7.longPressIndicator = r13
                r7.outlineFont = r14
                float r8 = org.fortheloss.sticknodes.App.assetScaling
                r9 = 1073741824(0x40000000, float:2.0)
                float r10 = r8 * r9
                r7.unpressedOffsetY = r10
                r10 = -1073741824(0xffffffffc0000000, float:-2.0)
                float r10 = r10 * r8
                r7.pressedOffsetY = r10
                float r8 = r8 * r9
                r7.checkedOffsetY = r8
                return
        }
    }

    public QrtButton(org.fortheloss.sticknodes.animationscreen.qrt.QrtButton.QrtButtonStyle r2, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public QrtButton(org.fortheloss.sticknodes.animationscreen.qrt.QrtButton.QrtButtonStyle r4, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r5, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r6) {
            r3 = this;
            r3.<init>(r4)
            r4 = 0
            r3.mCanDragX = r4
            r3.mCanDragY = r4
            r3.mCanRotate = r4
            r0 = 0
            r3.mDragGradientSize = r0
            r3.mMaxDragHasCapped = r4
            r3.mAutoIncrementHasBegun = r4
            r3.mHasDoubleClick = r4
            r1 = 1
            r3.mHasClickAction = r1
            r3.mShowText = r4
            r3.mShowTextWhenUnchecked = r4
            r3.mEnabled = r1
            java.lang.String r2 = ""
            r3.mText = r2
            r2 = 4
            r3.mTextAlign = r2
            r3.mState = r4
            r2 = 2143289344(0x7fc00000, float:NaN)
            r3.mInitialRotation = r2
            r3.mRotationAccumulator = r0
            r3.mLastRotation = r0
            r3.mMaxDragSeconds = r0
            r3.mMaxDragExtra = r0
            r3.mTextClickEnabled = r4
            r3.mBottomTouchPadding = r0
            r3.mLeftTouchPadding = r0
            r3.mRightTouchPadding = r0
            r3.mAutoIncrementDirection = r4
            r3.mDockRef = r5
            r3.setTransform(r1)
            r3.setRound(r4)
            r3.mLongPressButton = r6
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r4 = r3.getClickListener()
            r3.removeListener(r4)
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r4 = new com.badlogic.gdx.scenes.scene2d.utils.ClickListener
            r4.<init>()
            r3.mNewClickListener = r4
            r3.addListener(r4)
            return
    }

    private void doAction(boolean r5, boolean r6) {
            r4 = this;
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1116471296(0x428c0000, float:70.0)
            float r0 = r0 * r1
            r4.clearActions()
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r2 = 1067450368(0x3fa00000, float:1.25)
            if (r5 == 0) goto L35
            if (r6 == 0) goto L35
            float r5 = r4.getX()
            r4.mPositionRememberX = r5
            float r5 = r4.getY()
            r4.mPositionRememberY = r5
            com.badlogic.gdx.math.Interpolation r5 = com.badlogic.gdx.math.Interpolation.sineOut
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r2, r2, r1, r5)
            float r2 = r4.mPositionRememberX
            float r3 = r4.mPositionRememberY
            float r3 = r3 + r0
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(r2, r3, r1, r5)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r6, r5)
            r4.addAction(r5)
            goto L40
        L35:
            if (r5 == 0) goto L40
            com.badlogic.gdx.math.Interpolation r5 = com.badlogic.gdx.math.Interpolation.sineOut
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r2, r2, r1, r5)
            r4.addAction(r5)
        L40:
            return
    }

    private void drawDots(com.badlogic.gdx.graphics.g2d.Batch r14, float r15, float r16, float r17, float r18) {
            r13 = this;
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r13.getStyle()
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r0.dot
            float r1 = r17 - r15
            float r2 = r18 - r16
            float r3 = com.badlogic.gdx.math.MathUtils.atan2(r2, r1)
            float r4 = com.badlogic.gdx.math.MathUtils.cos(r3)
            float r3 = com.badlogic.gdx.math.MathUtils.sin(r3)
            float r1 = r1 * r1
            float r2 = r2 * r2
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            int r2 = r0.getRegionWidth()
            float r2 = (float) r2
            r5 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r5
            float r6 = r13.getWidth()
            float r6 = r6 * r5
            float r7 = r13.getHeight()
            float r7 = r7 * r5
            int r8 = r0.getRegionWidth()
            float r8 = (float) r8
            float r8 = r8 * r5
            int r9 = r0.getRegionHeight()
            float r9 = (float) r9
            float r9 = r9 * r5
            float r1 = r1 / r2
            double r10 = (double) r1
            double r10 = java.lang.Math.ceil(r10)
            int r1 = (int) r10
            r5 = 0
        L4c:
            if (r5 >= r1) goto L64
            float r10 = r15 + r6
            float r11 = (float) r5
            float r11 = r11 * r2
            float r12 = r4 * r11
            float r10 = r10 + r12
            float r10 = r10 - r8
            float r12 = r16 + r7
            float r11 = r11 * r3
            float r12 = r12 + r11
            float r12 = r12 - r9
            r11 = r14
            r14.draw(r0, r10, r12)
            int r5 = r5 + 1
            goto L4c
        L64:
            return
    }

    private void drawFont(com.badlogic.gdx.graphics.g2d.Batch r4, float r5, float r6, java.lang.String r7, com.badlogic.gdx.graphics.g2d.GlyphLayout r8) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r3.getStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r0.outlineFont
            float r1 = r8.width
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            float r5 = r5 - r1
            float r8 = r8.height
            float r8 = r8 * r2
            float r6 = r6 + r8
            r0.draw(r4, r7, r5, r6)
            return
    }

    private void moveToFront() {
            r3 = this;
            r0 = r3
        L1:
            r1 = 999(0x3e7, float:1.4E-42)
            if (r0 == 0) goto L11
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked
            if (r2 != 0) goto L11
            r0.setZIndex(r1)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r0.getParent()
            goto L1
        L11:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r3.mLongPressButton
            if (r0 == 0) goto L18
            r0.setZIndex(r1)
        L18:
            return
    }

    private void resetAction(boolean r5) {
            r4 = this;
            r4.clearActions()
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L20
            com.badlogic.gdx.math.Interpolation r5 = com.badlogic.gdx.math.Interpolation.sineOut
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r1, r1, r0, r5)
            float r2 = r4.mPositionRememberX
            float r3 = r4.mPositionRememberY
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(r2, r3, r0, r5)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r1, r5)
            r4.addAction(r5)
            goto L29
        L20:
            com.badlogic.gdx.math.Interpolation r5 = com.badlogic.gdx.math.Interpolation.sineOut
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r1, r1, r0, r5)
            r4.addAction(r5)
        L29:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r6) {
            r5 = this;
            super.act(r6)
            boolean r0 = r5.mCanDragX
            if (r0 != 0) goto Lb
            boolean r1 = r5.mCanDragY
            if (r1 == 0) goto L6d
        Lb:
            boolean r1 = r5.mMaxDragHasCapped
            if (r1 != 0) goto L6d
            boolean r1 = r5.mAutoIncrementHasBegun
            if (r1 == 0) goto L6d
            float r1 = r5.mDragGradientSize
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            if (r0 == 0) goto L1e
            float r0 = r5.mDragX
            goto L20
        L1e:
            float r0 = r5.mDragY
        L20:
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L27
            r3 = -1
            goto L28
        L27:
            r3 = 1
        L28:
            float r0 = java.lang.Math.abs(r0)
            float r0 = r0 - r1
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r2, r1)
            com.badlogic.gdx.math.Interpolation r4 = com.badlogic.gdx.math.Interpolation.circleIn
            float r0 = r4.apply(r2, r1, r0)
            r1 = 1106247680(0x41f00000, float:30.0)
            float r0 = r0 * r1
            r1 = 1084227584(0x40a00000, float:5.0)
            float r0 = r0 + r1
            float r1 = (float) r3
            float r0 = r0 * r1
            float r1 = r5.mMaxDragSeconds
            float r1 = r1 + r6
            r5.mMaxDragSeconds = r1
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 <= 0) goto L6d
            r5.mMaxDragSeconds = r2
            float r6 = r5.mMaxDragExtra
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            float r6 = r6 + r0
            r5.mMaxDragExtra = r6
            boolean r0 = r5.mCanDragX
            r1 = 0
            if (r0 == 0) goto L67
            float r0 = r5.mDragX
            float r0 = r0 + r6
            r5.onDrag(r0, r1)
            goto L6d
        L67:
            float r0 = r5.mDragY
            float r0 = r0 + r6
            r5.onDrag(r0, r1)
        L6d:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r2.mLongPressButton
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r2.mLongPressButton = r1
        La:
            r2.mDockRef = r1
            r2.mNewClickListener = r1
            r2.mText = r1
            r2.clear()
            return
    }

    protected void doClickVibration() {
            r1 = this;
            boolean r0 = r1.mCanRotate
            if (r0 != 0) goto L16
            boolean r0 = r1.mCanDragX
            if (r0 != 0) goto L16
            boolean r0 = r1.mCanDragY
            if (r0 == 0) goto Ld
            goto L16
        Ld:
            boolean r0 = r1.mHasClickAction
            if (r0 == 0) goto L1a
            r0 = 2
            org.fortheloss.sticknodes.App.vibrate(r0)
            goto L1a
        L16:
            r0 = 3
            org.fortheloss.sticknodes.App.vibrate(r0)
        L1a:
            return
    }

    public void drag(float r19, float r20, float r21, float r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.mEnabled
            if (r3 != 0) goto Lb
            return
        Lb:
            boolean r3 = r18.isDisabled()
            if (r3 == 0) goto L12
            return
        L12:
            r18.moveToFront()
            boolean r3 = r0.mCanRotate
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 3
            r6 = 0
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L80
            byte r1 = r0.mState
            if (r1 == 0) goto L25
            if (r1 != r5) goto L25a
        L25:
            if (r1 != 0) goto L39
            r0.mRotationAccumulator = r7
            r0.mLastRotation = r7
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r18.getClickListener()
            if (r1 == 0) goto L34
            r1.cancel()
        L34:
            r0.mState = r5
            r0.doAction(r8, r8)
        L39:
            boolean r1 = r18.hasActions()
            if (r1 != 0) goto L25a
            float r1 = r22 - r21
            r2 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 % r2
            r3 = 1141309440(0x44070000, float:540.0)
            float r1 = r1 + r3
            float r1 = r1 % r2
            r5 = 1127481344(0x43340000, float:180.0)
            float r1 = r1 - r5
            float r1 = r1 % r2
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 >= 0) goto L51
            float r1 = r1 + r2
        L51:
            float r9 = r0.mInitialRotation
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 == 0) goto L5e
            r0.mInitialRotation = r1
            r0.mLastRotation = r1
            r6 = 1
        L5e:
            r0.mRotation = r1
            float r8 = r0.mRotationAccumulator
            float r9 = r0.mLastRotation
            float r9 = r1 - r9
            float r9 = r9 % r2
            float r9 = r9 + r3
            float r9 = r9 % r2
            float r9 = r9 - r5
            float r9 = r9 * r4
            float r8 = r8 + r9
            r0.mLastRotation = r1
            float r8 = r8 % r2
            r0.mRotationAccumulator = r8
            int r1 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r1 >= 0) goto L79
            float r8 = r8 + r2
            r0.mRotationAccumulator = r8
        L79:
            float r1 = r0.mRotationAccumulator
            r0.onRotate(r1, r6)
            goto L25a
        L80:
            boolean r3 = r0.mCanDragX
            r12 = 1073741824(0x40000000, float:2.0)
            r13 = 1120403456(0x42c80000, float:100.0)
            r14 = 1137180672(0x43c80000, float:400.0)
            r15 = -1
            if (r3 == 0) goto L170
            byte r3 = r0.mState
            if (r3 == 0) goto L91
            if (r3 != r8) goto L170
        L91:
            if (r3 != 0) goto La3
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r3 = r18.getClickListener()
            if (r3 == 0) goto L9c
            r3.cancel()
        L9c:
            r0.mState = r8
            r0.doAction(r8, r6)
            r3 = 1
            goto La4
        La3:
            r3 = 0
        La4:
            r0.mDragX = r1
            java.lang.Class<com.badlogic.gdx.math.Vector2> r16 = com.badlogic.gdx.math.Vector2.class
            java.lang.Object r16 = com.badlogic.gdx.utils.Pools.obtain(r16)
            r9 = r16
            com.badlogic.gdx.math.Vector2 r9 = (com.badlogic.gdx.math.Vector2) r9
            r9.set(r7, r7)
            r0.localToStageCoordinates(r9)
            float r11 = r9.x
            com.badlogic.gdx.utils.Pools.free(r9)
            float r9 = r18.getOriginX()
            float r11 = r11 + r9
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r9 * r14
            r0.mDragGradientSize = r10
            float r9 = r9 * r13
            float r10 = r11 - r10
            float r10 = java.lang.Math.max(r10, r9)
            float r13 = r0.mDragGradientSize
            float r13 = r13 + r11
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r14 = r0.mDockRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r14 = r14.getContext()
            com.badlogic.gdx.scenes.scene2d.Stage r14 = r14.getStage()
            float r14 = r14.getWidth()
            float r14 = r14 - r9
            float r9 = java.lang.Math.min(r13, r14)
            float r13 = r11 - r10
            float r14 = r9 - r11
            int r17 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r17 >= 0) goto Lef
            float r10 = r11 - r14
            goto Lf5
        Lef:
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 >= 0) goto Lf5
            float r9 = r11 + r13
        Lf5:
            float r9 = r9 - r10
            float r9 = r9 / r12
            r0.mDragGradientSize = r9
            float r10 = r9 * r4
            float r11 = r0.mDragX
            float r13 = -r9
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 >= 0) goto L106
            float r9 = -r9
            r0.mDragX = r9
            goto L10c
        L106:
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 <= 0) goto L10c
            r0.mDragX = r9
        L10c:
            boolean r9 = r0.mAutoIncrementHasBegun
            if (r9 == 0) goto L13d
            float r3 = r0.mDragX
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 < 0) goto L12a
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 >= 0) goto L122
            short r3 = r0.mAutoIncrementDirection
            if (r3 == r8) goto L12a
        L122:
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L170
            short r1 = r0.mAutoIncrementDirection
            if (r1 != r15) goto L170
        L12a:
            r0.mAutoIncrementHasBegun = r6
            r0.mAutoIncrementDirection = r6
            r0.mMaxDragHasCapped = r6
            org.fortheloss.sticknodes.App.vibrate(r5)
            float r1 = r0.mDragX
            float r3 = -r1
            r0.mMaxDragExtra = r3
            float r1 = r1 + r3
            r0.onDrag(r1, r8)
            goto L170
        L13d:
            float r9 = r0.mDragX
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L168
            r0.mAutoIncrementHasBegun = r8
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L14f
            r1 = -1
            goto L150
        L14f:
            r1 = 1
        L150:
            r0.mAutoIncrementDirection = r1
            org.fortheloss.sticknodes.App.vibrate(r5)
            r1 = 1072693248(0x3ff00000, float:1.875)
            r0.setScale(r1)
            com.badlogic.gdx.math.Interpolation$SwingOut r1 = com.badlogic.gdx.math.Interpolation.swingOut
            r3 = 1048576000(0x3e800000, float:0.25)
            r9 = 1067450368(0x3fa00000, float:1.25)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r9, r9, r3, r1)
            r0.addAction(r1)
            goto L170
        L168:
            float r1 = r0.mDragX
            float r9 = r0.mMaxDragExtra
            float r1 = r1 + r9
            r0.onDrag(r1, r3)
        L170:
            boolean r1 = r0.mCanDragY
            if (r1 == 0) goto L25a
            byte r1 = r0.mState
            r3 = 2
            if (r1 == 0) goto L17b
            if (r1 != r3) goto L25a
        L17b:
            if (r1 != 0) goto L18d
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r18.getClickListener()
            if (r1 == 0) goto L186
            r1.cancel()
        L186:
            r0.mState = r3
            r0.doAction(r8, r6)
            r1 = 1
            goto L18e
        L18d:
            r1 = 0
        L18e:
            r0.mDragY = r2
            java.lang.Class<com.badlogic.gdx.math.Vector2> r3 = com.badlogic.gdx.math.Vector2.class
            java.lang.Object r3 = com.badlogic.gdx.utils.Pools.obtain(r3)
            com.badlogic.gdx.math.Vector2 r3 = (com.badlogic.gdx.math.Vector2) r3
            r3.set(r7, r7)
            r0.localToStageCoordinates(r3)
            float r9 = r3.y
            com.badlogic.gdx.utils.Pools.free(r3)
            float r3 = r18.getOriginY()
            float r9 = r9 + r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r10 = 1137180672(0x43c80000, float:400.0)
            float r14 = r3 * r10
            r0.mDragGradientSize = r14
            r10 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r10
            float r10 = r9 - r14
            float r10 = java.lang.Math.max(r10, r3)
            float r11 = r0.mDragGradientSize
            float r11 = r11 + r9
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r13 = r0.mDockRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r13 = r13.getContext()
            com.badlogic.gdx.scenes.scene2d.Stage r13 = r13.getStage()
            float r13 = r13.getHeight()
            float r13 = r13 - r3
            float r3 = java.lang.Math.min(r11, r13)
            float r11 = r9 - r10
            float r13 = r3 - r9
            int r14 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r14 >= 0) goto L1db
            float r10 = r9 - r13
            goto L1e1
        L1db:
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 >= 0) goto L1e1
            float r3 = r9 + r11
        L1e1:
            float r3 = r3 - r10
            float r3 = r3 / r12
            r0.mDragGradientSize = r3
            float r4 = r4 * r3
            float r9 = r0.mDragY
            float r10 = -r3
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 >= 0) goto L1f2
            float r3 = -r3
            r0.mDragY = r3
            goto L1f8
        L1f2:
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 <= 0) goto L1f8
            r0.mDragY = r3
        L1f8:
            boolean r3 = r0.mAutoIncrementHasBegun
            if (r3 == 0) goto L229
            float r1 = r0.mDragY
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L216
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 >= 0) goto L20e
            short r1 = r0.mAutoIncrementDirection
            if (r1 == r8) goto L216
        L20e:
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 <= 0) goto L25a
            short r1 = r0.mAutoIncrementDirection
            if (r1 != r15) goto L25a
        L216:
            r0.mAutoIncrementHasBegun = r6
            r0.mAutoIncrementDirection = r6
            r0.mMaxDragHasCapped = r6
            org.fortheloss.sticknodes.App.vibrate(r5)
            float r1 = r0.mDragY
            float r2 = -r1
            r0.mMaxDragExtra = r2
            float r1 = r1 + r2
            r0.onDrag(r1, r8)
            goto L25a
        L229:
            float r3 = r0.mDragY
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L252
            r0.mAutoIncrementHasBegun = r8
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 >= 0) goto L23a
            r8 = -1
        L23a:
            r0.mAutoIncrementDirection = r8
            org.fortheloss.sticknodes.App.vibrate(r5)
            r1 = 1072693248(0x3ff00000, float:1.875)
            r0.setScale(r1)
            com.badlogic.gdx.math.Interpolation$SwingOut r1 = com.badlogic.gdx.math.Interpolation.swingOut
            r2 = 1048576000(0x3e800000, float:0.25)
            r3 = 1067450368(0x3fa00000, float:1.25)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r3, r3, r2, r1)
            r0.addAction(r1)
            goto L25a
        L252:
            float r2 = r0.mDragY
            float r3 = r0.mMaxDragExtra
            float r2 = r2 + r3
            r0.onDrag(r2, r1)
        L25a:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.ImageButton, com.badlogic.gdx.scenes.scene2d.ui.Button, com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r19, float r20) {
            r18 = this;
            r6 = r18
            r7 = r19
            java.lang.Class<com.badlogic.gdx.graphics.g2d.GlyphLayout> r8 = com.badlogic.gdx.graphics.g2d.GlyphLayout.class
            com.badlogic.gdx.graphics.Color r9 = r18.getColor()
            float r0 = r9.a
            byte r1 = r6.mState
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r1 != 0) goto L35
            boolean r1 = r6.mEnabled
            if (r1 != 0) goto L23
            float r1 = r9.r
            float r2 = r9.g
            float r3 = r9.b
            float r4 = r0 * r11
            r6.setColor(r1, r2, r3, r4)
        L23:
            super.draw(r19, r20)
            boolean r1 = r6.mEnabled
            if (r1 != 0) goto L16d
            float r1 = r9.r
            float r2 = r9.g
            float r3 = r9.b
            r6.setColor(r1, r2, r3, r0)
            goto L16d
        L35:
            r0 = 3
            r12 = 0
            if (r1 != r0) goto L69
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r18.getImage()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r18.getImage()
            float r1 = r1.getWidth()
            float r1 = r1 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r18.getImage()
            float r2 = r2.getHeight()
            float r2 = r2 * r11
            r0.setOrigin(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r18.getImage()
            float r1 = r6.mRotation
            r0.setRotation(r1)
            super.draw(r19, r20)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r18.getImage()
            r0.setRotation(r12)
            goto L16d
        L69:
            float r0 = r20 * r11
            super.draw(r7, r0)
            float r13 = r18.getX()
            float r14 = r18.getY()
            float r0 = r6.mDragGradientSize
            float r0 = r0 * r11
            boolean r1 = r6.mAutoIncrementHasBegun
            if (r1 == 0) goto L96
            boolean r1 = r6.mCanDragX
            if (r1 == 0) goto L8b
            float r1 = r6.mDragX
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 >= 0) goto L89
            float r0 = -r0
        L89:
            r15 = r0
            goto L97
        L8b:
            float r1 = r6.mDragY
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 >= 0) goto L92
            float r0 = -r0
        L92:
            r16 = r0
            r15 = 0
            goto L99
        L96:
            r15 = 0
        L97:
            r16 = 0
        L99:
            float r0 = r6.mDragX
            float r0 = r0 + r13
            float r1 = r6.mDragY
            float r1 = r1 + r14
            r6.setPosition(r0, r1)
            float r0 = r9.a
            float r0 = r0 * r20
            r1 = 1061158912(0x3f400000, float:0.75)
            float r0 = r0 * r1
            r7.setColor(r10, r10, r10, r0)
            boolean r0 = r6.mAutoIncrementHasBegun
            if (r0 == 0) goto Lb8
            boolean r0 = r6.mCanDragX
            if (r0 == 0) goto Lb8
            float r0 = r13 + r15
            goto Lbc
        Lb8:
            float r0 = r18.getX()
        Lbc:
            r4 = r0
            boolean r0 = r6.mAutoIncrementHasBegun
            if (r0 == 0) goto Lc8
            boolean r0 = r6.mCanDragY
            if (r0 == 0) goto Lc8
            float r0 = r14 + r16
            goto Lcc
        Lc8:
            float r0 = r18.getY()
        Lcc:
            r5 = r0
            r0 = r18
            r1 = r19
            r2 = r13
            r3 = r14
            r0.drawDots(r1, r2, r3, r4, r5)
            float r0 = r9.r
            float r1 = r9.g
            float r2 = r9.b
            float r3 = r9.a
            float r3 = r3 * r20
            r7.setColor(r0, r1, r2, r3)
            boolean r0 = r6.mCanDragX
            if (r0 == 0) goto L149
            boolean r0 = r18.isChecked()
            if (r0 == 0) goto Lf1
            boolean r0 = r6.mShowText
            if (r0 != 0) goto Lfb
        Lf1:
            boolean r0 = r18.isChecked()
            if (r0 != 0) goto L149
            boolean r0 = r6.mShowTextWhenUnchecked
            if (r0 == 0) goto L149
        Lfb:
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r8)
            r5 = r0
            com.badlogic.gdx.graphics.g2d.GlyphLayout r5 = (com.badlogic.gdx.graphics.g2d.GlyphLayout) r5
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r18.getStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r0.outlineFont
            java.lang.String r1 = r6.mText
            r5.setText(r0, r1)
            float r0 = r9.r
            float r1 = r9.g
            float r2 = r9.b
            float r3 = r9.a
            float r3 = r3 * r20
            r7.setColor(r0, r1, r2, r3)
            float r0 = r18.getX()
            float r1 = r18.getOriginX()
            float r2 = r0 + r1
            float r0 = r18.getY()
            float r1 = r18.getHeight()
            r3 = 1114636288(0x42700000, float:60.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            float r1 = r1 + r4
            float r3 = r18.getScaleY()
            float r1 = r1 * r3
            float r3 = r0 + r1
            java.lang.String r4 = r6.mText
            r0 = r18
            r1 = r19
            r17 = r5
            r0.drawFont(r1, r2, r3, r4, r5)
            com.badlogic.gdx.utils.Pools.free(r17)
        L149:
            super.draw(r19, r20)
            boolean r0 = r6.mAutoIncrementHasBegun
            if (r0 == 0) goto L16a
            float r0 = r9.a
            float r0 = r0 * r20
            r7.setColor(r10, r12, r12, r0)
            float r2 = r13 + r15
            float r3 = r14 + r16
            float r4 = r18.getX()
            float r5 = r18.getY()
            r0 = r18
            r1 = r19
            r0.drawDots(r1, r2, r3, r4, r5)
        L16a:
            r6.setPosition(r13, r14)
        L16d:
            boolean r0 = r6.mHasDoubleClick
            if (r0 == 0) goto L1b3
            float r0 = r9.a
            float r0 = r0 * r20
            r7.setColor(r10, r10, r10, r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r18.getStyle()
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r0.dot
            float r1 = r18.getX()
            float r2 = r18.getWidth()
            float r2 = r2 * r11
            float r1 = r1 + r2
            float r2 = r18.getY()
            int r3 = r0.getRegionHeight()
            float r3 = (float) r3
            float r2 = r2 - r3
            r3 = 1098907648(0x41800000, float:16.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            float r2 = r2 + r4
            int r3 = r0.getRegionWidth()
            float r3 = (float) r3
            float r3 = r1 - r3
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1086324736(0x40c00000, float:6.0)
            float r4 = r4 * r5
            float r3 = r3 + r4
            r7.draw(r0, r3, r2)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r5
            float r1 = r1 - r3
            r7.draw(r0, r1, r2)
        L1b3:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r6.mLongPressButton
            if (r0 == 0) goto L1ee
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r18.getStyle()
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r0.longPressIndicator
            float r1 = r9.r
            float r2 = r9.g
            float r3 = r9.b
            float r4 = r9.a
            float r4 = r4 * r20
            r7.setColor(r1, r2, r3, r4)
            float r1 = r18.getX()
            float r2 = r18.getWidth()
            float r1 = r1 + r2
            int r2 = r0.getRegionWidth()
            float r2 = (float) r2
            float r1 = r1 - r2
            r2 = 1092616192(0x41200000, float:10.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r2
            float r1 = r1 - r3
            float r2 = r18.getY()
            r3 = 1094713344(0x41400000, float:12.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            float r2 = r2 + r4
            r7.draw(r0, r1, r2)
        L1ee:
            boolean r0 = r18.isChecked()
            if (r0 == 0) goto L1f8
            boolean r0 = r6.mShowText
            if (r0 != 0) goto L202
        L1f8:
            boolean r0 = r18.isChecked()
            if (r0 != 0) goto L2c2
            boolean r0 = r6.mShowTextWhenUnchecked
            if (r0 == 0) goto L2c2
        L202:
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r8)
            r8 = r0
            com.badlogic.gdx.graphics.g2d.GlyphLayout r8 = (com.badlogic.gdx.graphics.g2d.GlyphLayout) r8
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r18.getStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r0.outlineFont
            java.lang.String r1 = r6.mText
            r8.setText(r0, r1)
            float r0 = r9.r
            float r1 = r9.g
            float r2 = r9.b
            float r3 = r9.a
            float r3 = r3 * r20
            r7.setColor(r0, r1, r2, r3)
            int r0 = r6.mTextAlign
            r1 = 8
            r2 = 1082130432(0x40800000, float:4.0)
            if (r0 != r1) goto L25f
            float r0 = r18.getX()
            float r1 = r18.getOriginX()
            float r0 = r0 + r1
            float r1 = r18.getWidth()
            float r1 = r1 * r11
            float r3 = r18.getScaleX()
            float r1 = r1 * r3
            float r0 = r0 - r1
            float r1 = r8.width
            float r1 = r1 * r11
            float r0 = r0 - r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            float r2 = r0 - r1
            float r0 = r18.getY()
            float r1 = r18.getOriginY()
            float r3 = r0 + r1
            java.lang.String r4 = r6.mText
            r0 = r18
            r1 = r19
            r5 = r8
            r0.drawFont(r1, r2, r3, r4, r5)
            goto L2bf
        L25f:
            r1 = 16
            if (r0 != r1) goto L299
            float r0 = r18.getX()
            float r1 = r18.getOriginX()
            float r0 = r0 + r1
            float r1 = r18.getWidth()
            float r1 = r1 * r11
            float r3 = r18.getScaleX()
            float r1 = r1 * r3
            float r0 = r0 + r1
            float r1 = r8.width
            float r1 = r1 * r11
            float r0 = r0 + r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            float r2 = r0 + r1
            float r0 = r18.getY()
            float r1 = r18.getOriginY()
            float r3 = r0 + r1
            java.lang.String r4 = r6.mText
            r0 = r18
            r1 = r19
            r5 = r8
            r0.drawFont(r1, r2, r3, r4, r5)
            goto L2bf
        L299:
            float r0 = r18.getX()
            float r1 = r18.getOriginX()
            float r2 = r0 + r1
            float r0 = r18.getY()
            r1 = 1103101952(0x41c00000, float:24.0)
            float r3 = r18.getScaleY()
            float r3 = r3 * r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r1
            float r3 = r0 - r3
            java.lang.String r4 = r6.mText
            r0 = r18
            r1 = r19
            r5 = r8
            r0.drawFont(r1, r2, r3, r4, r5)
        L2bf:
            com.badlogic.gdx.utils.Pools.free(r8)
        L2c2:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button
    public com.badlogic.gdx.scenes.scene2d.utils.ClickListener getClickListener() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r1.mNewClickListener
            if (r0 != 0) goto L8
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = super.getClickListener()
        L8:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.ImageButton
    public org.fortheloss.sticknodes.animationscreen.qrt.QrtButton.QrtButtonStyle getStyle() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = super.getStyle()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = (org.fortheloss.sticknodes.animationscreen.qrt.QrtButton.QrtButtonStyle) r0
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public com.badlogic.gdx.scenes.scene2d.Actor hit(float r3, float r4, boolean r5) {
            r2 = this;
            float r0 = r2.mBottomTouchPadding
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L19
            float r0 = r2.mLeftTouchPadding
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L19
            float r0 = r2.mRightTouchPadding
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L14
            goto L19
        L14:
            com.badlogic.gdx.scenes.scene2d.Actor r3 = super.hit(r3, r4, r5)
            return r3
        L19:
            r2.validate()
            r0 = 0
            if (r5 == 0) goto L28
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = r2.getTouchable()
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            if (r5 != r1) goto L28
            return r0
        L28:
            float r5 = r2.mLeftTouchPadding
            float r5 = -r5
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 < 0) goto L4b
            float r5 = r2.getWidth()
            float r1 = r2.mRightTouchPadding
            float r5 = r5 + r1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L4b
            float r3 = r2.mBottomTouchPadding
            float r3 = -r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L4b
            float r3 = r2.getHeight()
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L4a
            goto L4b
        L4a:
            return r2
        L4b:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button
    public boolean isChecked() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r2.getStyle()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.up
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r2.getStyle()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.checked
            if (r0 != r1) goto L10
            r0 = 1
            goto L14
        L10:
            boolean r0 = super.isChecked()
        L14:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button
    public boolean isOver() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r1.getClickListener()
            boolean r0 = r0.isOver()
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button
    public boolean isPressed() {
            r1 = this;
            boolean r0 = r1.mEnabled
            if (r0 == 0) goto L1a
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r1.getClickListener()
            boolean r0 = r0.isVisualPressed()
            if (r0 == 0) goto L1a
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r1.getClickListener()
            int r0 = r0.getPressedPointer()
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    public void maxDragHasCapped(boolean r1) {
            r0 = this;
            r0.mMaxDragHasCapped = r1
            return
    }

    public void onCancelLongPress() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r5.mLongPressButton
            if (r0 != 0) goto L5
            return
        L5:
            r0.clearActions()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r5.mLongPressButton
            float r1 = r5.getX()
            float r2 = r5.getY()
            com.badlogic.gdx.math.Interpolation r3 = com.badlogic.gdx.math.Interpolation.sineIn
            r4 = 1036831949(0x3dcccccd, float:0.1)
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(r1, r2, r4, r3)
            r2 = 0
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r2, r4)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r1, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r2, r2)
            r3 = 0
            com.badlogic.gdx.scenes.scene2d.actions.VisibleAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.visible(r3)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r1, r2, r3)
            r0.addAction(r1)
            return
    }

    protected void onClick() {
            r5 = this;
            boolean r0 = r5.mEnabled
            if (r0 != 0) goto L5
            return
        L5:
            r5.doClickVibration()
            double r0 = java.lang.Math.random()
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L15
            r0 = -1065353216(0xffffffffc0800000, float:-4.0)
            goto L17
        L15:
            r0 = 1082130432(0x40800000, float:4.0)
        L17:
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r0)
            r1 = 1064682127(0x3f75c28f, float:0.96)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r1, r1)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r0, r1)
            r1 = 0
            com.badlogic.gdx.math.Interpolation r2 = com.badlogic.gdx.math.Interpolation.sineOut
            r3 = 1041865114(0x3e19999a, float:0.15)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r1, r3, r2)
            r4 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r4, r4, r3, r2)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r1, r2)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r0, r1)
            r5.addAction(r0)
            return
    }

    protected void onClickText() {
            r1 = this;
            boolean r0 = r1.mEnabled
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 3
            org.fortheloss.sticknodes.App.vibrate(r0)
            return
    }

    protected void onDoubleClick() {
            r0 = this;
            return
    }

    public void onDoubleTap(float r1, float r2) {
            r0 = this;
            boolean r1 = r0.mEnabled
            if (r1 != 0) goto L5
            return
        L5:
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.mInitialRotation = r1
            r1 = 0
            r0.mMaxDragSeconds = r1
            r0.mMaxDragExtra = r1
            r1 = 0
            r0.mMaxDragHasCapped = r1
            r0.mAutoIncrementHasBegun = r1
            r0.mAutoIncrementDirection = r1
            r1 = 2
            org.fortheloss.sticknodes.App.vibrate(r1)
            byte r1 = r0.mState
            if (r1 != 0) goto L28
            boolean r1 = r0.mHasDoubleClick
            if (r1 == 0) goto L25
            r0.onDoubleClick()
            goto L28
        L25:
            r0.onClick()
        L28:
            return
    }

    protected void onDrag(float r1, boolean r2) {
            r0 = this;
            return
    }

    public void onLongPress() {
            r7 = this;
            boolean r0 = r7.isDisabled()
            if (r0 == 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r7.mLongPressButton
            if (r0 != 0) goto Lc
            return
        Lc:
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto L21
            com.badlogic.gdx.scenes.scene2d.Group r0 = r7.getParent()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r7.mLongPressButton
            r0.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r7.mLongPressButton
            r1 = 0
            r0.setVisible(r1)
        L21:
            r7.moveToFront()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r7.mLongPressButton
            r0.clearActions()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r7.mLongPressButton
            float r1 = r7.getX()
            float r2 = r7.getY()
            r0.setPosition(r1, r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r7.mLongPressButton
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r2, r2, r2, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r7.mLongPressButton
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.actions.VisibleAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.visible(r1)
            float r3 = r7.getX()
            float r4 = r7.getY()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r5 = r7.mLongPressButton
            float r5 = r5.getHeight()
            float r4 = r4 - r5
            com.badlogic.gdx.math.Interpolation r5 = com.badlogic.gdx.math.Interpolation.sineOut
            r6 = 1036831949(0x3dcccccd, float:0.1)
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(r3, r4, r6, r5)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r2, r6)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r3, r2)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r1, r2)
            r0.addAction(r1)
            return
    }

    public void onLongPressDrag(float r9, float r10) {
            r8 = this;
            boolean r0 = r8.mEnabled
            if (r0 != 0) goto L5
            return
        L5:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r8.mLongPressButton
            if (r0 == 0) goto Lfa
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto L11
            goto Lfa
        L11:
            java.lang.Class<com.badlogic.gdx.math.Vector2> r0 = com.badlogic.gdx.math.Vector2.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            com.badlogic.gdx.math.Vector2 r0 = (com.badlogic.gdx.math.Vector2) r0
            com.badlogic.gdx.scenes.scene2d.Group r1 = r8.getParent()
            com.badlogic.gdx.math.Vector2 r9 = r0.set(r9, r10)
            com.badlogic.gdx.math.Vector2 r9 = r8.localToAscendantCoordinates(r1, r9)
            r0.set(r9)
            float r9 = r0.x
            float r10 = r0.y
            com.badlogic.gdx.utils.Pools.free(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r8.mLongPressButton
            float r0 = r0.getX()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r8.mLongPressButton
            float r1 = r1.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            float r0 = r0 - r1
            r1 = 3
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r4 = 1086324736(0x40c00000, float:6.0)
            r5 = 1077936128(0x40400000, float:3.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L96
            float r0 = r8.getX()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r7 = r8.mLongPressButton
            float r7 = r7.getWidth()
            float r7 = r7 * r5
            float r0 = r0 + r7
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L96
            float r0 = r8.getY()
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L96
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r8.mLongPressButton
            float r0 = r0.getY()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r7 = r8.mLongPressButton
            float r7 = r7.getHeight()
            float r7 = r7 * r4
            float r0 = r0 - r7
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L96
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mLongPressButton
            float r9 = r9.getScaleX()
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto Lfa
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mLongPressButton
            com.badlogic.gdx.math.Interpolation r10 = com.badlogic.gdx.math.Interpolation.sineOut
            r0 = 1067030938(0x3f99999a, float:1.2)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r0, r0, r3, r10)
            r9.addAction(r10)
            org.fortheloss.sticknodes.App.vibrate(r1)
            goto Lfa
        L96:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r8.mLongPressButton
            float r0 = r0.getX()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r7 = r8.mLongPressButton
            float r7 = r7.getWidth()
            float r7 = r7 * r2
            float r0 = r0 - r7
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lf7
            float r0 = r8.getX()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r8.mLongPressButton
            float r2 = r2.getWidth()
            float r2 = r2 * r5
            float r0 = r0 + r2
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto Lf7
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mLongPressButton
            float r9 = r9.getY()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r8.mLongPressButton
            float r0 = r0.getHeight()
            float r0 = r0 * r4
            float r9 = r9 - r0
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 > 0) goto Lce
            goto Lf7
        Lce:
            float r9 = r8.getY()
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 < 0) goto Lfa
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mLongPressButton
            float r9 = r9.getScaleX()
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto Lfa
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mLongPressButton
            boolean r9 = r9.hasActions()
            if (r9 != 0) goto Lfa
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r9 = r8.mLongPressButton
            com.badlogic.gdx.math.Interpolation r10 = com.badlogic.gdx.math.Interpolation.sineOut
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r6, r6, r3, r10)
            r9.addAction(r10)
            org.fortheloss.sticknodes.App.vibrate(r1)
            goto Lfa
        Lf7:
            r8.onCancelLongPress()
        Lfa:
            return
    }

    protected void onRotate(float r1, boolean r2) {
            r0 = this;
            return
    }

    public void onTouchUp(float r5, float r6) {
            r4 = this;
            boolean r0 = r4.mEnabled
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2143289344(0x7fc00000, float:NaN)
            r4.mInitialRotation = r0
            r0 = 0
            r4.mMaxDragSeconds = r0
            r4.mMaxDragExtra = r0
            r1 = 0
            r4.mMaxDragHasCapped = r1
            r4.mAutoIncrementHasBegun = r1
            r4.mAutoIncrementDirection = r1
            r2 = 1
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r4.hit(r5, r6, r2)
            if (r2 == 0) goto L40
            byte r5 = r4.mState
            if (r5 != 0) goto Lb5
            boolean r5 = r4.mTextClickEnabled
            if (r5 == 0) goto L3c
            int r5 = r4.mTextAlign
            r1 = 4
            if (r5 != r1) goto L37
            float r5 = r4.getY()
            float r6 = r6 - r5
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 >= 0) goto L37
            r4.onClickText()
            goto Lb5
        L37:
            r4.onClick()
            goto Lb5
        L3c:
            r4.onClick()
            goto Lb5
        L40:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r4.mLongPressButton
            if (r0 == 0) goto Lb5
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto Lb5
            float r0 = r4.getX()
            float r5 = r5 + r0
            float r0 = r4.getY()
            float r6 = r6 + r0
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r4.mLongPressButton
            float r0 = r0.getX()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r4.mLongPressButton
            float r2 = r2.getWidth()
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r3
            float r0 = r0 - r2
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lb5
            float r0 = r4.getX()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r4.mLongPressButton
            float r2 = r2.getWidth()
            r3 = 1077936128(0x40400000, float:3.0)
            float r2 = r2 * r3
            float r0 = r0 + r2
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto Lb5
            float r5 = r4.getY()
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 >= 0) goto Lb5
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r5 = r4.mLongPressButton
            float r5 = r5.getY()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r4.mLongPressButton
            float r0 = r0.getHeight()
            r2 = 1086324736(0x40c00000, float:6.0)
            float r0 = r0 * r2
            float r5 = r5 - r0
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto Lb5
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r5 = r4.mLongPressButton
            r5.clearActions()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r5 = r4.mLongPressButton
            float r6 = r4.getX()
            float r0 = r4.getY()
            r5.setPosition(r6, r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r5 = r4.mLongPressButton
            r5.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r5 = r4.mLongPressButton
            r5.onClick()
        Lb5:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table
    public void reset() {
            r3 = this;
            byte r0 = r3.mState
            r1 = 0
            r2 = 3
            if (r0 != r2) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            r3.resetAction(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setScale(r0, r0)
            r3.mState = r1
            r0 = 0
            r3.mDragX = r0
            r3.mDragY = r0
            r3.setRotation(r0)
            return
    }

    public void setBottomTouchPadding(float r1) {
            r0 = this;
            r0.mBottomTouchPadding = r1
            return
    }

    public void setCapabilities(boolean r1, boolean r2, boolean r3) {
            r0 = this;
            r0.mCanDragX = r1
            r0.mCanDragY = r2
            r0.mCanRotate = r3
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button
    public void setChecked(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r0 = r2.getStyle()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.up
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = r2.getStyle()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.checked
            if (r0 != r1) goto Lf
            r3 = 1
        Lf:
            super.setChecked(r3)
            return
    }

    public void setEnabled(boolean r1) {
            r0 = this;
            r0.mEnabled = r1
            return
    }

    public void setHasClickAction(boolean r1) {
            r0 = this;
            r0.mHasClickAction = r1
            return
    }

    public void setHasDoubleClick(boolean r1) {
            r0 = this;
            r0.mHasDoubleClick = r1
            return
    }

    public void setLeftTouchPadding(float r1) {
            r0 = this;
            r0.mLeftTouchPadding = r1
            return
    }

    public void setRightTouchPadding(float r1) {
            r0 = this;
            r0.mRightTouchPadding = r1
            return
    }

    public void setShowText(boolean r1) {
            r0 = this;
            r0.setShowText(r1, r1)
            return
    }

    public void setShowText(boolean r1, boolean r2) {
            r0 = this;
            r0.mShowText = r1
            r0.mShowTextWhenUnchecked = r2
            return
    }

    public void setText(float r4) {
            r3 = this;
            r0 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            float r4 = (float) r4
            float r4 = r4 / r0
            java.util.Locale r0 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "%.02f"
            java.lang.String r4 = java.lang.String.format(r0, r4, r1)
            r3.mText = r4
            return
    }

    public void setText(java.lang.String r1) {
            r0 = this;
            r0.mText = r1
            return
    }

    public void setTextAlign(int r1) {
            r0 = this;
            r0.mTextAlign = r1
            return
    }

    public void setTextClickEnabled(boolean r1) {
            r0 = this;
            r0.mTextClickEnabled = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Actor
    protected void sizeChanged() {
            r4 = this;
            super.sizeChanged()
            float r0 = r4.getWidth()
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            float r2 = r4.getHeight()
            float r2 = r2 * r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r3
            float r2 = r2 + r1
            r4.setOrigin(r0, r2)
            return
    }
}
