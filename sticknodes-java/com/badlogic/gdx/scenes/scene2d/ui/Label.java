package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class Label extends com.badlogic.gdx.scenes.scene2d.ui.Widget {
    private static final com.badlogic.gdx.graphics.g2d.GlyphLayout prefSizeLayout = null;
    private static final com.badlogic.gdx.graphics.Color tempColor = null;
    private com.badlogic.gdx.graphics.g2d.BitmapFontCache cache;
    private java.lang.String ellipsis;
    private boolean fontScaleChanged;
    private float fontScaleX;
    private float fontScaleY;
    private int intValue;
    private int labelAlign;
    private float lastPrefHeight;
    private final com.badlogic.gdx.graphics.g2d.GlyphLayout layout;
    private int lineAlign;
    private float prefHeight;
    private boolean prefSizeInvalid;
    private float prefWidth;
    private com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle style;
    private final com.badlogic.gdx.utils.StringBuilder text;
    private boolean wrap;

    public static class LabelStyle {
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable background;
        public com.badlogic.gdx.graphics.g2d.BitmapFont font;
        public com.badlogic.gdx.graphics.Color fontColor;

        public LabelStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        public LabelStyle(com.badlogic.gdx.graphics.g2d.BitmapFont r1, com.badlogic.gdx.graphics.Color r2) {
                r0 = this;
                r0.<init>()
                r0.font = r1
                r0.fontColor = r2
                return
        }

        public LabelStyle(com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle r3) {
                r2 = this;
                r2.<init>()
                com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r3.font
                r2.font = r0
                com.badlogic.gdx.graphics.Color r0 = r3.fontColor
                if (r0 == 0) goto L14
                com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
                com.badlogic.gdx.graphics.Color r1 = r3.fontColor
                r0.<init>(r1)
                r2.fontColor = r0
            L14:
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r3.background
                r2.background = r3
                return
        }
    }

    static {
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Label.tempColor = r0
            com.badlogic.gdx.graphics.g2d.GlyphLayout r0 = new com.badlogic.gdx.graphics.g2d.GlyphLayout
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Label.prefSizeLayout = r0
            return
    }

    public Label(java.lang.CharSequence r3, com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle r4) {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.graphics.g2d.GlyphLayout r0 = new com.badlogic.gdx.graphics.g2d.GlyphLayout
            r0.<init>()
            r2.layout = r0
            com.badlogic.gdx.utils.StringBuilder r0 = new com.badlogic.gdx.utils.StringBuilder
            r0.<init>()
            r2.text = r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.intValue = r1
            r1 = 8
            r2.labelAlign = r1
            r2.lineAlign = r1
            r1 = 1
            r2.prefSizeInvalid = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.fontScaleX = r1
            r2.fontScaleY = r1
            r1 = 0
            r2.fontScaleChanged = r1
            if (r3 == 0) goto L2c
            r0.append(r3)
        L2c:
            r2.setStyle(r4)
            if (r3 == 0) goto L42
            int r3 = r3.length()
            if (r3 <= 0) goto L42
            float r3 = r2.getPrefWidth()
            float r4 = r2.getPrefHeight()
            r2.setSize(r3, r4)
        L42:
            return
    }

    private void scaleAndComputePrefSize() {
            r6 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r0 = r6.cache
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r0.getFont()
            float r1 = r0.getScaleX()
            float r2 = r0.getScaleY()
            boolean r3 = r6.fontScaleChanged
            if (r3 == 0) goto L1d
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r3 = r0.getData()
            float r4 = r6.fontScaleX
            float r5 = r6.fontScaleY
            r3.setScale(r4, r5)
        L1d:
            com.badlogic.gdx.graphics.g2d.GlyphLayout r3 = com.badlogic.gdx.scenes.scene2d.ui.Label.prefSizeLayout
            r6.computePrefSize(r3)
            boolean r3 = r6.fontScaleChanged
            if (r3 == 0) goto L2d
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r0.getData()
            r0.setScale(r1, r2)
        L2d:
            return
    }

    protected void computePrefSize(com.badlogic.gdx.graphics.g2d.GlyphLayout r9) {
            r8 = this;
            r0 = 0
            r8.prefSizeInvalid = r0
            boolean r0 = r8.wrap
            if (r0 == 0) goto L42
            java.lang.String r0 = r8.ellipsis
            if (r0 != 0) goto L42
            float r0 = r8.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = r8.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.background
            if (r1 == 0) goto L2f
            float r1 = r1.getMinWidth()
            float r0 = java.lang.Math.max(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = r8.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.background
            float r1 = r1.getLeftWidth()
            float r0 = r0 - r1
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = r8.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.background
            float r1 = r1.getRightWidth()
            float r0 = r0 - r1
        L2f:
            r5 = r0
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r0 = r8.cache
            com.badlogic.gdx.graphics.g2d.BitmapFont r2 = r0.getFont()
            com.badlogic.gdx.utils.StringBuilder r3 = r8.text
            com.badlogic.gdx.graphics.Color r4 = com.badlogic.gdx.graphics.Color.WHITE
            r6 = 8
            r7 = 1
            r1 = r9
            r1.setText(r2, r3, r4, r5, r6, r7)
            goto L4d
        L42:
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r0 = r8.cache
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r0.getFont()
            com.badlogic.gdx.utils.StringBuilder r1 = r8.text
            r9.setText(r0, r1)
        L4d:
            float r0 = r9.width
            r8.prefWidth = r0
            float r9 = r9.height
            r8.prefHeight = r9
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r8, float r9) {
            r7 = this;
            r7.validate()
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.scenes.scene2d.ui.Label.tempColor
            com.badlogic.gdx.graphics.Color r1 = r7.getColor()
            com.badlogic.gdx.graphics.Color r0 = r0.set(r1)
            float r1 = r0.a
            float r1 = r1 * r9
            r0.a = r1
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = r7.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r9 = r9.background
            if (r9 == 0) goto L3a
            float r9 = r0.r
            float r2 = r0.g
            float r3 = r0.b
            r8.setColor(r9, r2, r3, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = r7.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r9.background
            float r3 = r7.getX()
            float r4 = r7.getY()
            float r5 = r7.getWidth()
            float r6 = r7.getHeight()
            r2 = r8
            r1.draw(r2, r3, r4, r5, r6)
        L3a:
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = r7.style
            com.badlogic.gdx.graphics.Color r9 = r9.fontColor
            if (r9 == 0) goto L43
            r0.mul(r9)
        L43:
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r9 = r7.cache
            r9.tint(r0)
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r9 = r7.cache
            float r0 = r7.getX()
            float r1 = r7.getY()
            r9.setPosition(r0, r1)
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r9 = r7.cache
            r9.draw(r8)
            return
    }

    public float getFontScaleX() {
            r1 = this;
            float r0 = r1.fontScaleX
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r3 = this;
            boolean r0 = r3.prefSizeInvalid
            if (r0 == 0) goto L7
            r3.scaleAndComputePrefSize()
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            boolean r1 = r3.fontScaleChanged
            if (r1 == 0) goto L18
            float r0 = r3.fontScaleY
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = r3.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r1.font
            float r1 = r1.getScaleY()
            float r0 = r0 / r1
        L18:
            float r1 = r3.prefHeight
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r3.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r2 = r2.font
            float r2 = r2.getDescent()
            float r2 = r2 * r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r0
            float r1 = r1 - r2
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r3.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.background
            if (r0 == 0) goto L41
            float r2 = r0.getTopHeight()
            float r1 = r1 + r2
            float r2 = r0.getBottomHeight()
            float r1 = r1 + r2
            float r0 = r0.getMinHeight()
            float r1 = java.lang.Math.max(r1, r0)
        L41:
            return r1
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r3 = this;
            boolean r0 = r3.wrap
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r3.prefSizeInvalid
            if (r0 == 0) goto Ld
            r3.scaleAndComputePrefSize()
        Ld:
            float r0 = r3.prefWidth
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = r3.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.background
            if (r1 == 0) goto L27
            float r2 = r1.getLeftWidth()
            float r0 = r0 + r2
            float r2 = r1.getRightWidth()
            float r0 = r0 + r2
            float r1 = r1.getMinWidth()
            float r0 = java.lang.Math.max(r0, r1)
        L27:
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle getStyle() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r1.style
            return r0
    }

    public com.badlogic.gdx.utils.StringBuilder getText() {
            r1 = this;
            com.badlogic.gdx.utils.StringBuilder r0 = r1.text
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget
    public void invalidate() {
            r1 = this;
            super.invalidate()
            r0 = 1
            r1.prefSizeInvalid = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget
    public void layout() {
            r23 = this;
            r0 = r23
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r1 = r0.cache
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r1.getFont()
            float r12 = r1.getScaleX()
            float r13 = r1.getScaleY()
            boolean r2 = r0.fontScaleChanged
            if (r2 == 0) goto L1f
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r2 = r1.getData()
            float r3 = r0.fontScaleX
            float r4 = r0.fontScaleY
            r2.setScale(r3, r4)
        L1f:
            boolean r2 = r0.wrap
            if (r2 == 0) goto L2a
            java.lang.String r2 = r0.ellipsis
            if (r2 != 0) goto L2a
            r2 = 1
            r14 = 1
            goto L2c
        L2a:
            r2 = 0
            r14 = 0
        L2c:
            if (r14 == 0) goto L3d
            float r2 = r23.getPrefHeight()
            float r3 = r0.lastPrefHeight
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L3d
            r0.lastPrefHeight = r2
            r23.invalidateHierarchy()
        L3d:
            float r2 = r23.getWidth()
            float r3 = r23.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = r0.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r4 = r4.background
            if (r4 == 0) goto L70
            float r5 = r4.getLeftWidth()
            float r6 = r4.getBottomHeight()
            float r7 = r4.getLeftWidth()
            float r8 = r4.getRightWidth()
            float r7 = r7 + r8
            float r2 = r2 - r7
            float r7 = r4.getBottomHeight()
            float r4 = r4.getTopHeight()
            float r7 = r7 + r4
            float r3 = r3 - r7
            r16 = r2
            r17 = r3
            r18 = r5
            r19 = r6
            goto L78
        L70:
            r16 = r2
            r17 = r3
            r18 = 0
            r19 = 0
        L78:
            com.badlogic.gdx.graphics.g2d.GlyphLayout r11 = r0.layout
            r20 = 1073741824(0x40000000, float:2.0)
            if (r14 != 0) goto L94
            com.badlogic.gdx.utils.StringBuilder r2 = r0.text
            java.lang.String r3 = "\n"
            int r2 = r2.indexOf(r3)
            r3 = -1
            if (r2 == r3) goto L8a
            goto L94
        L8a:
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r2 = r1.getData()
            float r2 = r2.capHeight
            r15 = r11
            r8 = r16
            goto Lc5
        L94:
            com.badlogic.gdx.utils.StringBuilder r4 = r0.text
            r5 = 0
            int r6 = r4.length
            com.badlogic.gdx.graphics.Color r7 = com.badlogic.gdx.graphics.Color.WHITE
            int r9 = r0.lineAlign
            java.lang.String r10 = r0.ellipsis
            r2 = r11
            r3 = r1
            r8 = r16
            r21 = r10
            r10 = r14
            r15 = r11
            r11 = r21
            r2.setText(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            float r2 = r15.width
            float r3 = r15.height
            int r4 = r0.labelAlign
            r5 = r4 & 8
            if (r5 != 0) goto Lc3
            r4 = r4 & 16
            if (r4 == 0) goto Lbd
            float r16 = r16 - r2
            goto Lc1
        Lbd:
            float r16 = r16 - r2
            float r16 = r16 / r20
        Lc1:
            float r18 = r18 + r16
        Lc3:
            r8 = r2
            r2 = r3
        Lc5:
            r11 = r18
            int r3 = r0.labelAlign
            r4 = r3 & 2
            if (r4 == 0) goto Lea
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r3 = r0.cache
            com.badlogic.gdx.graphics.g2d.BitmapFont r3 = r3.getFont()
            boolean r3 = r3.isFlipped()
            if (r3 == 0) goto Ldb
            r3 = 0
            goto Ldd
        Ldb:
            float r3 = r17 - r2
        Ldd:
            float r19 = r19 + r3
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r0.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r3 = r3.font
            float r3 = r3.getDescent()
            float r19 = r19 + r3
            goto L111
        Lea:
            r3 = r3 & 4
            if (r3 == 0) goto L10b
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r3 = r0.cache
            com.badlogic.gdx.graphics.g2d.BitmapFont r3 = r3.getFont()
            boolean r3 = r3.isFlipped()
            if (r3 == 0) goto Lfd
            float r3 = r17 - r2
            goto Lfe
        Lfd:
            r3 = 0
        Lfe:
            float r19 = r19 + r3
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r0.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r3 = r3.font
            float r3 = r3.getDescent()
            float r19 = r19 - r3
            goto L111
        L10b:
            float r17 = r17 - r2
            float r17 = r17 / r20
            float r19 = r19 + r17
        L111:
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r3 = r0.cache
            com.badlogic.gdx.graphics.g2d.BitmapFont r3 = r3.getFont()
            boolean r3 = r3.isFlipped()
            if (r3 != 0) goto L11f
            float r19 = r19 + r2
        L11f:
            r10 = r19
            com.badlogic.gdx.utils.StringBuilder r4 = r0.text
            r5 = 0
            int r6 = r4.length
            com.badlogic.gdx.graphics.Color r7 = com.badlogic.gdx.graphics.Color.WHITE
            int r9 = r0.lineAlign
            java.lang.String r3 = r0.ellipsis
            r2 = r15
            r16 = r3
            r3 = r1
            r22 = r10
            r10 = r14
            r14 = r11
            r11 = r16
            r2.setText(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r2 = r0.cache
            r3 = r22
            r2.setText(r15, r14, r3)
            boolean r2 = r0.fontScaleChanged
            if (r2 == 0) goto L14b
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r1 = r1.getData()
            r1.setScale(r12, r13)
        L14b:
            return
    }

    public void setAlignment(int r1) {
            r0 = this;
            r0.setAlignment(r1, r1)
            return
    }

    public void setAlignment(int r1, int r2) {
            r0 = this;
            r0.labelAlign = r1
            r1 = r2 & 8
            if (r1 == 0) goto Lb
            r1 = 8
            r0.lineAlign = r1
            goto L16
        Lb:
            r1 = 16
            r2 = r2 & r1
            if (r2 == 0) goto L13
            r0.lineAlign = r1
            goto L16
        L13:
            r1 = 1
            r0.lineAlign = r1
        L16:
            r0.invalidate()
            return
    }

    public void setEllipsis(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.lang.String r1 = "..."
            r0.ellipsis = r1
            goto La
        L7:
            r1 = 0
            r0.ellipsis = r1
        La:
            return
    }

    public void setFontScale(float r1) {
            r0 = this;
            r0.setFontScale(r1, r1)
            return
    }

    public void setFontScale(float r2, float r3) {
            r1 = this;
            r0 = 1
            r1.fontScaleChanged = r0
            r1.fontScaleX = r2
            r1.fontScaleY = r3
            r1.invalidateHierarchy()
            return
    }

    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle r2) {
            r1 = this;
            if (r2 == 0) goto L1a
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r2.font
            if (r0 == 0) goto L12
            r1.style = r2
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r2 = r0.newFontCache()
            r1.cache = r2
            r1.invalidateHierarchy()
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Missing LabelStyle font."
            r2.<init>(r0)
            throw r2
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "style cannot be null."
            r2.<init>(r0)
            throw r2
    }

    public void setText(java.lang.CharSequence r2) {
            r1 = this;
            if (r2 != 0) goto Ld
            com.badlogic.gdx.utils.StringBuilder r2 = r1.text
            int r0 = r2.length
            if (r0 != 0) goto L9
            return
        L9:
            r2.clear()
            goto L38
        Ld:
            boolean r0 = r2 instanceof com.badlogic.gdx.utils.StringBuilder
            if (r0 == 0) goto L27
            com.badlogic.gdx.utils.StringBuilder r0 = r1.text
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1a
            return
        L1a:
            com.badlogic.gdx.utils.StringBuilder r0 = r1.text
            r0.clear()
            com.badlogic.gdx.utils.StringBuilder r0 = r1.text
            com.badlogic.gdx.utils.StringBuilder r2 = (com.badlogic.gdx.utils.StringBuilder) r2
            r0.append(r2)
            goto L38
        L27:
            boolean r0 = r1.textEquals(r2)
            if (r0 == 0) goto L2e
            return
        L2e:
            com.badlogic.gdx.utils.StringBuilder r0 = r1.text
            r0.clear()
            com.badlogic.gdx.utils.StringBuilder r0 = r1.text
            r0.append(r2)
        L38:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.intValue = r2
            r1.invalidateHierarchy()
            return
    }

    public boolean setText(int r2) {
            r1 = this;
            int r0 = r1.intValue
            if (r0 != r2) goto L6
            r2 = 0
            return r2
        L6:
            com.badlogic.gdx.utils.StringBuilder r0 = r1.text
            r0.clear()
            com.badlogic.gdx.utils.StringBuilder r0 = r1.text
            r0.append(r2)
            r1.intValue = r2
            r1.invalidateHierarchy()
            r2 = 1
            return r2
    }

    public void setWrap(boolean r1) {
            r0 = this;
            r0.wrap = r1
            r0.invalidateHierarchy()
            return
    }

    public boolean textEquals(java.lang.CharSequence r7) {
            r6 = this;
            com.badlogic.gdx.utils.StringBuilder r0 = r6.text
            int r1 = r0.length
            char[] r0 = r0.chars
            int r2 = r7.length()
            r3 = 0
            if (r1 == r2) goto Le
            return r3
        Le:
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1d
            char r4 = r0[r2]
            char r5 = r7.charAt(r2)
            if (r4 == r5) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Lf
        L1d:
            r7 = 1
            return r7
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.getName()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            r2 = -1
            if (r1 == r2) goto L1e
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L1e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = 36
            int r3 = r0.indexOf(r3)
            if (r3 == r2) goto L2e
            java.lang.String r2 = "Label "
            goto L30
        L2e:
            java.lang.String r2 = ""
        L30:
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            com.badlogic.gdx.utils.StringBuilder r0 = r4.text
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
