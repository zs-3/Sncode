package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class PopupText extends com.badlogic.gdx.scenes.scene2d.Actor implements com.badlogic.gdx.utils.Disposable {
    private int mAlign;
    private float mAlpha;
    private float mFadeInSeconds;
    private float mFadeOutSeconds;
    private com.badlogic.gdx.graphics.g2d.BitmapFont mFontRef;
    private com.badlogic.gdx.graphics.g2d.GlyphLayout mGlyphLayout;
    private boolean mIsShowing;
    private float mShowSeconds;
    private java.lang.String mText;
    private float mTextHeight;
    private float mTextWidth;
    private float mTimer;

    public PopupText(org.fortheloss.sticknodes.animationscreen.AnimationScreen r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mIsShowing = r0
            r0 = 8
            r3.mAlign = r0
            org.fortheloss.framework.Assets r4 = r4.getAssets()
            java.lang.String r0 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedOutline
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r1 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            r2 = 1
            java.lang.Object r4 = r4.get(r0, r1, r2)
            com.badlogic.gdx.graphics.g2d.BitmapFont r4 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r4
            r3.mFontRef = r4
            com.badlogic.gdx.graphics.g2d.GlyphLayout r4 = new com.badlogic.gdx.graphics.g2d.GlyphLayout
            r4.<init>()
            r3.mGlyphLayout = r4
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r6) {
            r5 = this;
            super.act(r6)
            boolean r0 = r5.mIsShowing
            if (r0 != 0) goto L8
            return
        L8:
            float r0 = r5.mTimer
            float r0 = r0 + r6
            r5.mTimer = r0
            float r6 = r5.mFadeOutSeconds
            r1 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L1a
            r5.mAlpha = r1
            r6 = 0
            r5.mIsShowing = r6
            goto L39
        L1a:
            float r2 = r5.mShowSeconds
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L28
            float r0 = r0 - r2
            float r6 = r6 - r2
            float r0 = r0 / r6
            float r6 = r3 - r0
            goto L33
        L28:
            float r6 = r5.mFadeInSeconds
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L31
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L33
        L31:
            float r6 = r0 / r6
        L33:
            float r6 = com.badlogic.gdx.math.MathUtils.clamp(r6, r1, r3)
            r5.mAlpha = r6
        L39:
            return
    }

    public void align(int r1) {
            r0 = this;
            r0.mAlign = r1
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r1.hide()
            r0 = 0
            r1.mFontRef = r0
            r1.mText = r0
            r1.mGlyphLayout = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r7, float r8) {
            r6 = this;
            super.draw(r7, r8)
            boolean r0 = r6.mIsShowing
            if (r0 != 0) goto L8
            return
        L8:
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r6.mFontRef
            float r1 = r6.mAlpha
            float r8 = r8 * r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r1, r1, r1, r8)
            int r8 = r6.mAlign
            r0 = 16
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r8 != r0) goto L33
            com.badlogic.gdx.graphics.g2d.BitmapFont r8 = r6.mFontRef
            java.lang.String r0 = r6.mText
            float r3 = r6.getX()
            float r4 = r6.mTextWidth
            float r3 = r3 - r4
            float r4 = r6.getY()
            float r5 = r6.mTextHeight
            float r5 = r5 * r2
            float r4 = r4 + r5
            r8.draw(r7, r0, r3, r4)
            goto L47
        L33:
            com.badlogic.gdx.graphics.g2d.BitmapFont r8 = r6.mFontRef
            java.lang.String r0 = r6.mText
            float r3 = r6.getX()
            float r4 = r6.getY()
            float r5 = r6.mTextHeight
            float r5 = r5 * r2
            float r4 = r4 + r5
            r8.draw(r7, r0, r3, r4)
        L47:
            com.badlogic.gdx.graphics.g2d.BitmapFont r7 = r6.mFontRef
            r7.setColor(r1, r1, r1, r1)
            return
    }

    public void hide() {
            r1 = this;
            r0 = 0
            r1.mAlpha = r0
            r0 = 0
            r1.mIsShowing = r0
            r0 = 0
            r1.setUserObject(r0)
            return
    }

    public void setText(java.lang.String r3) {
            r2 = this;
            r0 = 1048576000(0x3e800000, float:0.25)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.setText(r3, r0, r1, r1)
            return
    }

    public void setText(java.lang.String r3, float r4, float r5, float r6) {
            r2 = this;
            r2.mText = r3
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = java.lang.Math.max(r4, r0)
            r2.mFadeInSeconds = r1
            float r1 = java.lang.Math.max(r5, r0)
            float r1 = r1 + r4
            r2.mShowSeconds = r1
            float r6 = java.lang.Math.max(r6, r0)
            float r6 = r6 + r5
            float r6 = r6 + r4
            r2.mFadeOutSeconds = r6
            r4 = 1
            r2.mIsShowing = r4
            r4 = 0
            r2.mAlpha = r4
            r2.mTimer = r4
            com.badlogic.gdx.graphics.g2d.GlyphLayout r4 = r2.mGlyphLayout
            com.badlogic.gdx.graphics.g2d.BitmapFont r5 = r2.mFontRef
            r4.setText(r5, r3)
            com.badlogic.gdx.graphics.g2d.GlyphLayout r3 = r2.mGlyphLayout
            float r4 = r3.height
            r2.mTextHeight = r4
            float r3 = r3.width
            r2.mTextWidth = r3
            return
    }
}
