package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class BitmapFontCache {
    private static final com.badlogic.gdx.graphics.Color tempColor = null;
    private final com.badlogic.gdx.graphics.Color color;
    private float currentTint;
    private final com.badlogic.gdx.graphics.g2d.BitmapFont font;
    private int glyphCount;
    private int[] idx;
    private boolean integer;
    private final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout> layouts;
    private com.badlogic.gdx.utils.IntArray[] pageGlyphIndices;
    private float[][] pageVertices;
    private final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout> pooledLayouts;
    private int[] tempGlyphCount;
    private float x;
    private float y;

    static {
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r1, r1)
            com.badlogic.gdx.graphics.g2d.BitmapFontCache.tempColor = r0
            return
    }

    public BitmapFontCache(com.badlogic.gdx.graphics.g2d.BitmapFont r4, boolean r5) {
            r3 = this;
            r3.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r3.layouts = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r3.pooledLayouts = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r1, r1)
            r3.color = r0
            r3.font = r4
            r3.integer = r5
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> r4 = r4.regions
            int r4 = r4.size
            if (r4 == 0) goto L48
            float[][] r5 = new float[r4][]
            r3.pageVertices = r5
            int[] r5 = new int[r4]
            r3.idx = r5
            r5 = 1
            if (r4 <= r5) goto L43
            com.badlogic.gdx.utils.IntArray[] r5 = new com.badlogic.gdx.utils.IntArray[r4]
            r3.pageGlyphIndices = r5
            r0 = 0
            int r5 = r5.length
        L35:
            if (r0 >= r5) goto L43
            com.badlogic.gdx.utils.IntArray[] r1 = r3.pageGlyphIndices
            com.badlogic.gdx.utils.IntArray r2 = new com.badlogic.gdx.utils.IntArray
            r2.<init>()
            r1[r0] = r2
            int r0 = r0 + 1
            goto L35
        L43:
            int[] r4 = new int[r4]
            r3.tempGlyphCount = r4
            return
        L48:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "The specified font must contain at least one texture page."
            r4.<init>(r5)
            throw r4
    }

    private void addGlyph(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph r11, float r12, float r13, float r14) {
            r10 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r10.font
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r0.data
            float r1 = r0.scaleX
            float r0 = r0.scaleY
            int r2 = r11.xoffset
            float r2 = (float) r2
            float r2 = r2 * r1
            float r12 = r12 + r2
            int r2 = r11.yoffset
            float r2 = (float) r2
            float r2 = r2 * r0
            float r13 = r13 + r2
            int r2 = r11.width
            float r2 = (float) r2
            float r2 = r2 * r1
            int r1 = r11.height
            float r1 = (float) r1
            float r1 = r1 * r0
            float r0 = r11.u
            float r3 = r11.u2
            float r4 = r11.v
            float r5 = r11.v2
            boolean r6 = r10.integer
            if (r6 == 0) goto L3e
            int r12 = java.lang.Math.round(r12)
            float r12 = (float) r12
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
        L3e:
            float r2 = r2 + r12
            float r1 = r1 + r13
            int r11 = r11.page
            int[] r6 = r10.idx
            r7 = r6[r11]
            r8 = r6[r11]
            int r8 = r8 + 20
            r6[r11] = r8
            com.badlogic.gdx.utils.IntArray[] r6 = r10.pageGlyphIndices
            if (r6 == 0) goto L5b
            r6 = r6[r11]
            int r8 = r10.glyphCount
            int r9 = r8 + 1
            r10.glyphCount = r9
            r6.add(r8)
        L5b:
            float[][] r6 = r10.pageVertices
            r11 = r6[r11]
            int r6 = r7 + 1
            r11[r7] = r12
            int r7 = r6 + 1
            r11[r6] = r13
            int r6 = r7 + 1
            r11[r7] = r14
            int r7 = r6 + 1
            r11[r6] = r0
            int r6 = r7 + 1
            r11[r7] = r4
            int r7 = r6 + 1
            r11[r6] = r12
            int r12 = r7 + 1
            r11[r7] = r1
            int r6 = r12 + 1
            r11[r12] = r14
            int r12 = r6 + 1
            r11[r6] = r0
            int r0 = r12 + 1
            r11[r12] = r5
            int r12 = r0 + 1
            r11[r0] = r2
            int r0 = r12 + 1
            r11[r12] = r1
            int r12 = r0 + 1
            r11[r0] = r14
            int r0 = r12 + 1
            r11[r12] = r3
            int r12 = r0 + 1
            r11[r0] = r5
            int r0 = r12 + 1
            r11[r12] = r2
            int r12 = r0 + 1
            r11[r0] = r13
            int r13 = r12 + 1
            r11[r12] = r14
            int r12 = r13 + 1
            r11[r13] = r3
            r11[r12] = r4
            return
    }

    private void addToCache(com.badlogic.gdx.graphics.g2d.GlyphLayout r18, float r19, float r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r2 = r1.runs
            int r2 = r2.size
            if (r2 != 0) goto Lb
            return
        Lb:
            float[][] r3 = r0.pageVertices
            int r3 = r3.length
            com.badlogic.gdx.graphics.g2d.BitmapFont r4 = r0.font
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> r4 = r4.regions
            int r4 = r4.size
            if (r3 >= r4) goto L19
            r0.setPageCount(r4)
        L19:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout> r3 = r0.layouts
            r3.add(r1)
            r17.requireGlyphs(r18)
            com.badlogic.gdx.utils.IntArray r3 = r1.colors
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L29:
            if (r6 >= r2) goto L74
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r10 = r1.runs
            java.lang.Object r10 = r10.get(r6)
            com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun r10 = (com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun) r10
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r11 = r10.glyphs
            T[] r12 = r11.items
            com.badlogic.gdx.utils.FloatArray r13 = r10.xAdvances
            float[] r13 = r13.items
            float r14 = r10.x
            float r14 = r19 + r14
            float r10 = r10.y
            float r10 = r20 + r10
            int r11 = r11.size
            r15 = 0
        L46:
            if (r15 >= r11) goto L71
            int r16 = r8 + 1
            if (r8 != r7) goto L62
            int r9 = r9 + 1
            int r4 = r3.get(r9)
            float r4 = com.badlogic.gdx.utils.NumberUtils.intToFloatColor(r4)
            int r9 = r9 + 1
            int r7 = r3.size
            if (r9 >= r7) goto L61
            int r7 = r3.get(r9)
            goto L62
        L61:
            r7 = -1
        L62:
            r8 = r13[r15]
            float r14 = r14 + r8
            r8 = r12[r15]
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r8 = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph) r8
            r0.addGlyph(r8, r14, r10, r4)
            int r15 = r15 + 1
            r8 = r16
            goto L46
        L71:
            int r6 = r6 + 1
            goto L29
        L74:
            float r1 = com.badlogic.gdx.graphics.Color.WHITE_FLOAT_BITS
            r0.currentTint = r1
            return
    }

    private void requireGlyphs(com.badlogic.gdx.graphics.g2d.GlyphLayout r11) {
            r10 = this;
            float[][] r0 = r10.pageVertices
            int r0 = r0.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Ld
            int r11 = r11.glyphCount
            r10.requirePageGlyphs(r1, r11)
            goto L46
        Ld:
            int[] r0 = r10.tempGlyphCount
            java.util.Arrays.fill(r0, r1)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r3 = r11.runs
            int r3 = r3.size
            r4 = 0
        L17:
            if (r4 >= r3) goto L3b
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r5 = r11.runs
            java.lang.Object r5 = r5.get(r4)
            com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun r5 = (com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun) r5
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r5 = r5.glyphs
            T[] r6 = r5.items
            int r5 = r5.size
            r7 = 0
        L28:
            if (r7 >= r5) goto L38
            r8 = r6[r7]
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r8 = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph) r8
            int r8 = r8.page
            r9 = r0[r8]
            int r9 = r9 + r2
            r0[r8] = r9
            int r7 = r7 + 1
            goto L28
        L38:
            int r4 = r4 + 1
            goto L17
        L3b:
            int r11 = r0.length
        L3c:
            if (r1 >= r11) goto L46
            r2 = r0[r1]
            r10.requirePageGlyphs(r1, r2)
            int r1 = r1 + 1
            goto L3c
        L46:
            return
    }

    private void requirePageGlyphs(int r4, int r5) {
            r3 = this;
            com.badlogic.gdx.utils.IntArray[] r0 = r3.pageGlyphIndices
            if (r0 == 0) goto L16
            r1 = r0[r4]
            int[] r1 = r1.items
            int r1 = r1.length
            if (r5 <= r1) goto L16
            r1 = r0[r4]
            r0 = r0[r4]
            int r0 = r0.size
            int r0 = r5 - r0
            r1.ensureCapacity(r0)
        L16:
            int[] r0 = r3.idx
            r1 = r0[r4]
            int r5 = r5 * 20
            int r1 = r1 + r5
            float[][] r5 = r3.pageVertices
            r2 = r5[r4]
            if (r2 != 0) goto L28
            float[] r0 = new float[r1]
            r5[r4] = r0
            goto L37
        L28:
            int r5 = r2.length
            if (r5 >= r1) goto L37
            float[] r5 = new float[r1]
            r0 = r0[r4]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r5, r1, r0)
            float[][] r0 = r3.pageVertices
            r0[r4] = r5
        L37:
            return
    }

    private void setPageCount(int r6) {
            r5 = this;
            float[][] r0 = new float[r6][]
            float[][] r1 = r5.pageVertices
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            r5.pageVertices = r0
            int[] r0 = new int[r6]
            int[] r1 = r5.idx
            int r2 = r1.length
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            r5.idx = r0
            com.badlogic.gdx.utils.IntArray[] r0 = new com.badlogic.gdx.utils.IntArray[r6]
            com.badlogic.gdx.utils.IntArray[] r1 = r5.pageGlyphIndices
            if (r1 == 0) goto L21
            int r2 = r1.length
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r3, r0, r3, r4)
            r3 = r2
        L21:
            if (r3 >= r6) goto L2d
            com.badlogic.gdx.utils.IntArray r1 = new com.badlogic.gdx.utils.IntArray
            r1.<init>()
            r0[r3] = r1
            int r3 = r3 + 1
            goto L21
        L2d:
            r5.pageGlyphIndices = r0
            int[] r6 = new int[r6]
            r5.tempGlyphCount = r6
            return
    }

    public com.badlogic.gdx.graphics.g2d.GlyphLayout addText(java.lang.CharSequence r11, float r12, float r13) {
            r10 = this;
            int r5 = r11.length()
            r4 = 0
            r6 = 0
            r7 = 8
            r8 = 0
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            com.badlogic.gdx.graphics.g2d.GlyphLayout r11 = r0.addText(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public com.badlogic.gdx.graphics.g2d.GlyphLayout addText(java.lang.CharSequence r11, float r12, float r13, int r14, int r15, float r16, int r17, boolean r18) {
            r10 = this;
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            com.badlogic.gdx.graphics.g2d.GlyphLayout r0 = r0.addText(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public com.badlogic.gdx.graphics.g2d.GlyphLayout addText(java.lang.CharSequence r13, float r14, float r15, int r16, int r17, float r18, int r19, boolean r20, java.lang.String r21) {
            r12 = this;
            r0 = r12
            java.lang.Class<com.badlogic.gdx.graphics.g2d.GlyphLayout> r1 = com.badlogic.gdx.graphics.g2d.GlyphLayout.class
            java.lang.Object r1 = com.badlogic.gdx.utils.Pools.obtain(r1)
            com.badlogic.gdx.graphics.g2d.GlyphLayout r1 = (com.badlogic.gdx.graphics.g2d.GlyphLayout) r1
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout> r2 = r0.pooledLayouts
            r2.add(r1)
            com.badlogic.gdx.graphics.g2d.BitmapFont r3 = r0.font
            com.badlogic.gdx.graphics.Color r7 = r0.color
            r2 = r1
            r4 = r13
            r5 = r16
            r6 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r2.setText(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = r14
            r3 = r15
            r12.addText(r1, r14, r15)
            return r1
    }

    public void addText(com.badlogic.gdx.graphics.g2d.GlyphLayout r2, float r3, float r4) {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r1.font
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r0.data
            float r0 = r0.ascent
            float r4 = r4 + r0
            r1.addToCache(r2, r3, r4)
            return
    }

    public void clear() {
            r4 = this;
            r0 = 0
            r4.x = r0
            r4.y = r0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout> r0 = r4.pooledLayouts
            r1 = 1
            com.badlogic.gdx.utils.Pools.freeAll(r0, r1)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout> r0 = r4.pooledLayouts
            r0.clear()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout> r0 = r4.layouts
            r0.clear()
            int[] r0 = r4.idx
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L1a:
            if (r2 >= r0) goto L2c
            com.badlogic.gdx.utils.IntArray[] r3 = r4.pageGlyphIndices
            if (r3 == 0) goto L25
            r3 = r3[r2]
            r3.clear()
        L25:
            int[] r3 = r4.idx
            r3[r2] = r1
            int r2 = r2 + 1
            goto L1a
        L2c:
            return
    }

    public void draw(com.badlogic.gdx.graphics.g2d.Batch r8) {
            r7 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r7.font
            com.badlogic.gdx.utils.Array r0 = r0.getRegions()
            float[][] r1 = r7.pageVertices
            int r1 = r1.length
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r1) goto L2b
            int[] r4 = r7.idx
            r4 = r4[r3]
            if (r4 <= 0) goto L28
            float[][] r4 = r7.pageVertices
            r4 = r4[r3]
            java.lang.Object r5 = r0.get(r3)
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r5
            com.badlogic.gdx.graphics.Texture r5 = r5.getTexture()
            int[] r6 = r7.idx
            r6 = r6[r3]
            r8.draw(r5, r4, r2, r6)
        L28:
            int r3 = r3 + 1
            goto Lb
        L2b:
            return
    }

    public com.badlogic.gdx.graphics.Color getColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            return r0
    }

    public com.badlogic.gdx.graphics.g2d.BitmapFont getFont() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r1.font
            return r0
    }

    public void setPosition(float r2, float r3) {
            r1 = this;
            float r0 = r1.x
            float r2 = r2 - r0
            float r0 = r1.y
            float r3 = r3 - r0
            r1.translate(r2, r3)
            return
    }

    public void setText(com.badlogic.gdx.graphics.g2d.GlyphLayout r1, float r2, float r3) {
            r0 = this;
            r0.clear()
            r0.addText(r1, r2, r3)
            return
    }

    public void setUseIntegerPositions(boolean r1) {
            r0 = this;
            r0.integer = r1
            return
    }

    public void tint(com.badlogic.gdx.graphics.Color r21) {
            r20 = this;
            r0 = r20
            float r1 = r21.toFloatBits()
            float r2 = r0.currentTint
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 != 0) goto Ld
            return
        Ld:
            r0.currentTint = r1
            float[][] r1 = r0.pageVertices
            com.badlogic.gdx.graphics.Color r2 = com.badlogic.gdx.graphics.g2d.BitmapFontCache.tempColor
            int[] r3 = r0.tempGlyphCount
            r4 = 0
            java.util.Arrays.fill(r3, r4)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout> r5 = r0.layouts
            int r5 = r5.size
            r6 = 0
        L1e:
            if (r6 >= r5) goto Laa
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout> r7 = r0.layouts
            java.lang.Object r7 = r7.get(r6)
            com.badlogic.gdx.graphics.g2d.GlyphLayout r7 = (com.badlogic.gdx.graphics.g2d.GlyphLayout) r7
            com.badlogic.gdx.utils.IntArray r8 = r7.colors
            r9 = 0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r10 = r7.runs
            int r10 = r10.size
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L33:
            if (r11 >= r10) goto La1
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r15 = r7.runs
            java.lang.Object r15 = r15.get(r11)
            com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun r15 = (com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun) r15
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r15 = r15.glyphs
            T[] r4 = r15.items
            int r15 = r15.size
            r0 = 0
        L44:
            if (r0 >= r15) goto L99
            int r16 = r13 + 1
            if (r13 != r12) goto L6a
            int r14 = r14 + 1
            int r9 = r8.get(r14)
            com.badlogic.gdx.graphics.Color.abgr8888ToColor(r2, r9)
            r13 = r21
            com.badlogic.gdx.graphics.Color r9 = r2.mul(r13)
            float r9 = r9.toFloatBits()
            int r14 = r14 + 1
            int r12 = r8.size
            if (r14 >= r12) goto L68
            int r12 = r8.get(r14)
            goto L6c
        L68:
            r12 = -1
            goto L6c
        L6a:
            r13 = r21
        L6c:
            r17 = r4[r0]
            r18 = r2
            r2 = r17
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r2 = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph) r2
            int r2 = r2.page
            r17 = r3[r2]
            int r17 = r17 * 20
            int r17 = r17 + 2
            r19 = r3[r2]
            int r19 = r19 + 1
            r3[r2] = r19
            r2 = r1[r2]
            r2[r17] = r9
            int r19 = r17 + 5
            r2[r19] = r9
            int r19 = r17 + 10
            r2[r19] = r9
            int r17 = r17 + 15
            r2[r17] = r9
            int r0 = r0 + 1
            r13 = r16
            r2 = r18
            goto L44
        L99:
            r18 = r2
            int r11 = r11 + 1
            r0 = r20
            r4 = 0
            goto L33
        La1:
            r18 = r2
            int r6 = r6 + 1
            r0 = r20
            r4 = 0
            goto L1e
        Laa:
            return
    }

    public void translate(float r10, float r11) {
            r9 = this;
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 != 0) goto La
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto La
            return
        La:
            boolean r0 = r9.integer
            if (r0 == 0) goto L18
            int r10 = java.lang.Math.round(r10)
            float r10 = (float) r10
            int r11 = java.lang.Math.round(r11)
            float r11 = (float) r11
        L18:
            float r0 = r9.x
            float r0 = r0 + r10
            r9.x = r0
            float r0 = r9.y
            float r0 = r0 + r11
            r9.y = r0
            float[][] r0 = r9.pageVertices
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L27:
            if (r3 >= r1) goto L44
            r4 = r0[r3]
            int[] r5 = r9.idx
            r5 = r5[r3]
            r6 = 0
        L30:
            if (r6 >= r5) goto L41
            r7 = r4[r6]
            float r7 = r7 + r10
            r4[r6] = r7
            int r7 = r6 + 1
            r8 = r4[r7]
            float r8 = r8 + r11
            r4[r7] = r8
            int r6 = r6 + 5
            goto L30
        L41:
            int r3 = r3 + 1
            goto L27
        L44:
            return
    }
}
