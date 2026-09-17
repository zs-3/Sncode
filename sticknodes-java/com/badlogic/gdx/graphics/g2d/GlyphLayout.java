package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class GlyphLayout implements com.badlogic.gdx.utils.Pool.Poolable {
    private static final com.badlogic.gdx.utils.IntArray colorStack = null;
    private static final com.badlogic.gdx.utils.Pool<com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun> glyphRunPool = null;
    public final com.badlogic.gdx.utils.IntArray colors;
    public int glyphCount;
    public float height;
    public final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun> runs;
    public float width;

    public static class GlyphRun implements com.badlogic.gdx.utils.Pool.Poolable {
        public com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph> glyphs;
        public float width;
        public float x;
        public com.badlogic.gdx.utils.FloatArray xAdvances;
        public float y;

        public GlyphRun() {
                r1 = this;
                r1.<init>()
                com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
                r0.<init>()
                r1.glyphs = r0
                com.badlogic.gdx.utils.FloatArray r0 = new com.badlogic.gdx.utils.FloatArray
                r0.<init>()
                r1.xAdvances = r0
                return
        }

        void appendRun(com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun r3) {
                r2 = this;
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r0 = r2.glyphs
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r1 = r3.glyphs
                r0.addAll(r1)
                com.badlogic.gdx.utils.FloatArray r0 = r2.xAdvances
                boolean r0 = r0.notEmpty()
                if (r0 == 0) goto L17
                com.badlogic.gdx.utils.FloatArray r0 = r2.xAdvances
                int r1 = r0.size
                int r1 = r1 + (-1)
                r0.size = r1
            L17:
                com.badlogic.gdx.utils.FloatArray r0 = r2.xAdvances
                com.badlogic.gdx.utils.FloatArray r3 = r3.xAdvances
                r0.addAll(r3)
                return
        }

        @Override // com.badlogic.gdx.utils.Pool.Poolable
        public void reset() {
                r1 = this;
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r0 = r1.glyphs
                r0.clear()
                com.badlogic.gdx.utils.FloatArray r0 = r1.xAdvances
                r0.clear()
                return
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r1 = r5.glyphs
                int r1 = r1.size
                int r1 = r1 + 32
                r0.<init>(r1)
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r1 = r5.glyphs
                int r2 = r1.size
                r3 = 0
            L10:
                if (r3 >= r2) goto L21
                java.lang.Object r4 = r1.get(r3)
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r4 = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph) r4
                int r4 = r4.id
                char r4 = (char) r4
                r0.append(r4)
                int r3 = r3 + 1
                goto L10
            L21:
                java.lang.String r1 = ", "
                r0.append(r1)
                float r2 = r5.x
                r0.append(r2)
                r0.append(r1)
                float r2 = r5.y
                r0.append(r2)
                r0.append(r1)
                float r1 = r5.width
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r0 = com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun.class
            com.badlogic.gdx.utils.Pool r0 = com.badlogic.gdx.utils.Pools.get(r0)
            com.badlogic.gdx.graphics.g2d.GlyphLayout.glyphRunPool = r0
            com.badlogic.gdx.utils.IntArray r0 = new com.badlogic.gdx.utils.IntArray
            r1 = 4
            r0.<init>(r1)
            com.badlogic.gdx.graphics.g2d.GlyphLayout.colorStack = r0
            return
    }

    public GlyphLayout() {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r1 = 1
            r0.<init>(r1)
            r2.runs = r0
            com.badlogic.gdx.utils.IntArray r0 = new com.badlogic.gdx.utils.IntArray
            r1 = 2
            r0.<init>(r1)
            r2.colors = r0
            return
    }

    private void alignRuns(float r8, int r9) {
            r7 = this;
            r0 = r9 & 8
            if (r0 != 0) goto L2e
            r0 = 1
            r9 = r9 & r0
            r1 = 0
            if (r9 == 0) goto La
            goto Lb
        La:
            r0 = 0
        Lb:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r9 = r7.runs
            T[] r2 = r9.items
            int r9 = r9.size
        L11:
            if (r1 >= r9) goto L2e
            r3 = r2[r1]
            com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun r3 = (com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun) r3
            float r4 = r3.x
            if (r0 == 0) goto L24
            r5 = 1056964608(0x3f000000, float:0.5)
            float r6 = r3.width
            float r6 = r8 - r6
            float r6 = r6 * r5
            goto L28
        L24:
            float r5 = r3.width
            float r6 = r8 - r5
        L28:
            float r4 = r4 + r6
            r3.x = r4
            int r1 = r1 + 1
            goto L11
        L2e:
            return
    }

    private void calculateWidths(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData r15) {
            r14 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r0 = r14.runs
            T[] r1 = r0.items
            int r0 = r0.size
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        La:
            if (r4 >= r0) goto L47
            r6 = r1[r4]
            com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun r6 = (com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun) r6
            com.badlogic.gdx.utils.FloatArray r7 = r6.xAdvances
            float[] r7 = r7.items
            float r8 = r6.x
            r9 = r7[r3]
            float r8 = r8 + r9
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r9 = r6.glyphs
            T[] r10 = r9.items
            int r9 = r9.size
            r11 = 0
            r12 = 0
        L21:
            if (r11 >= r9) goto L36
            r13 = r10[r11]
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r13 = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph) r13
            float r13 = r14.getGlyphWidth(r13, r15)
            float r13 = r13 + r8
            float r12 = java.lang.Math.max(r12, r13)
            int r11 = r11 + 1
            r13 = r7[r11]
            float r8 = r8 + r13
            goto L21
        L36:
            float r7 = java.lang.Math.max(r8, r12)
            float r8 = r6.x
            float r7 = r7 - r8
            r6.width = r7
            float r8 = r8 + r7
            float r5 = java.lang.Math.max(r5, r8)
            int r4 = r4 + 1
            goto La
        L47:
            r14.width = r5
            return
    }

    private float getGlyphWidth(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph r2, com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData r3) {
            r1 = this;
            int r0 = r2.width
            int r2 = r2.xoffset
            int r0 = r0 + r2
            float r2 = (float) r0
            float r0 = r3.scaleX
            float r2 = r2 * r0
            float r3 = r3.padRight
            float r2 = r2 - r3
            return r2
    }

    private float getLineOffset(com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph> r2, com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData r3) {
            r1 = this;
            java.lang.Object r2 = r2.first()
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r2 = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph) r2
            int r2 = r2.xoffset
            int r2 = -r2
            float r2 = (float) r2
            float r0 = r3.scaleX
            float r2 = r2 * r0
            float r3 = r3.padLeft
            float r2 = r2 - r3
            return r2
    }

    private int parseColorMarkup(java.lang.CharSequence r7, int r8, int r9) {
            r6 = this;
            r0 = -1
            if (r8 != r9) goto L4
            return r0
        L4:
            char r1 = r7.charAt(r8)
            r2 = 35
            r3 = 0
            r4 = 93
            if (r1 == r2) goto L4a
            r2 = 91
            if (r1 == r2) goto L48
            if (r1 == r4) goto L3d
            int r1 = r8 + 1
        L17:
            if (r1 >= r9) goto L3c
            char r2 = r7.charAt(r1)
            if (r2 == r4) goto L22
            int r1 = r1 + 1
            goto L17
        L22:
            java.lang.CharSequence r7 = r7.subSequence(r8, r1)
            java.lang.String r7 = r7.toString()
            com.badlogic.gdx.graphics.Color r7 = com.badlogic.gdx.graphics.Colors.get(r7)
            if (r7 != 0) goto L31
            return r0
        L31:
            com.badlogic.gdx.utils.IntArray r9 = com.badlogic.gdx.graphics.g2d.GlyphLayout.colorStack
            int r7 = r7.toIntBits()
            r9.add(r7)
            int r1 = r1 - r8
            return r1
        L3c:
            return r0
        L3d:
            com.badlogic.gdx.utils.IntArray r7 = com.badlogic.gdx.graphics.g2d.GlyphLayout.colorStack
            int r8 = r7.size
            r9 = 1
            if (r8 <= r9) goto L47
            r7.pop()
        L47:
            return r3
        L48:
            r7 = -2
            return r7
        L4a:
            int r1 = r8 + 1
        L4c:
            if (r1 >= r9) goto L9a
            char r2 = r7.charAt(r1)
            if (r2 != r4) goto L74
            int r7 = r8 + 2
            if (r1 < r7) goto L9a
            int r7 = r8 + 9
            if (r1 <= r7) goto L5d
            goto L9a
        L5d:
            int r1 = r1 - r8
            r7 = 8
            if (r1 >= r7) goto L6a
            int r7 = 9 - r1
            int r7 = r7 << 2
            int r7 = r3 << r7
            r3 = r7 | 255(0xff, float:3.57E-43)
        L6a:
            com.badlogic.gdx.utils.IntArray r7 = com.badlogic.gdx.graphics.g2d.GlyphLayout.colorStack
            int r8 = java.lang.Integer.reverseBytes(r3)
            r7.add(r8)
            return r1
        L74:
            int r3 = r3 << 4
            int r3 = r3 + r2
            r5 = 48
            if (r2 < r5) goto L82
            r5 = 57
            if (r2 > r5) goto L82
            int r3 = r3 + (-48)
            goto L97
        L82:
            r5 = 65
            if (r2 < r5) goto L8d
            r5 = 70
            if (r2 > r5) goto L8d
            int r3 = r3 + (-55)
            goto L97
        L8d:
            r5 = 97
            if (r2 < r5) goto L9a
            r5 = 102(0x66, float:1.43E-43)
            if (r2 > r5) goto L9a
            int r3 = r3 + (-87)
        L97:
            int r1 = r1 + 1
            goto L4c
        L9a:
            return r0
    }

    private void setLastGlyphXAdvance(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData r3, com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun r4) {
            r2 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r0 = r4.glyphs
            java.lang.Object r0 = r0.peek()
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r0 = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph) r0
            boolean r1 = r0.fixedWidth
            if (r1 != 0) goto L1a
            com.badlogic.gdx.utils.FloatArray r4 = r4.xAdvances
            float[] r1 = r4.items
            int r4 = r4.size
            int r4 = r4 + (-1)
            float r3 = r2.getGlyphWidth(r0, r3)
            r1[r4] = r3
        L1a:
            return
    }

    private void truncate(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData r9, com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun r10, float r11, java.lang.String r12) {
            r8 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r0 = r10.glyphs
            int r0 = r0.size
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r1 = com.badlogic.gdx.graphics.g2d.GlyphLayout.glyphRunPool
            java.lang.Object r1 = r1.obtain()
            com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun r1 = (com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun) r1
            int r6 = r12.length()
            r5 = 0
            r7 = 0
            r2 = r9
            r3 = r1
            r4 = r12
            r2.getGlyphs(r3, r4, r5, r6, r7)
            com.badlogic.gdx.utils.FloatArray r2 = r1.xAdvances
            int r2 = r2.size
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto L32
            r8.setLastGlyphXAdvance(r9, r1)
            com.badlogic.gdx.utils.FloatArray r2 = r1.xAdvances
            float[] r5 = r2.items
            int r2 = r2.size
            r6 = 1
        L2a:
            if (r6 >= r2) goto L32
            r7 = r5[r6]
            float r4 = r4 + r7
            int r6 = r6 + 1
            goto L2a
        L32:
            float r11 = r11 - r4
            r2 = 0
            float r4 = r10.x
            com.badlogic.gdx.utils.FloatArray r5 = r10.xAdvances
            float[] r5 = r5.items
        L3a:
            com.badlogic.gdx.utils.FloatArray r6 = r10.xAdvances
            int r6 = r6.size
            if (r2 >= r6) goto L4b
            r6 = r5[r2]
            float r4 = r4 + r6
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 <= 0) goto L48
            goto L4b
        L48:
            int r2 = r2 + 1
            goto L3a
        L4b:
            if (r2 <= r3) goto L69
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r11 = r10.glyphs
            int r4 = r2 + (-1)
            r11.truncate(r4)
            com.badlogic.gdx.utils.FloatArray r11 = r10.xAdvances
            r11.truncate(r2)
            r8.setLastGlyphXAdvance(r9, r10)
            com.badlogic.gdx.utils.FloatArray r11 = r1.xAdvances
            int r2 = r11.size
            if (r2 <= 0) goto L7a
            com.badlogic.gdx.utils.FloatArray r4 = r10.xAdvances
            int r2 = r2 - r3
            r4.addAll(r11, r3, r2)
            goto L7a
        L69:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r11 = r10.glyphs
            r11.clear()
            com.badlogic.gdx.utils.FloatArray r11 = r10.xAdvances
            r11.clear()
            com.badlogic.gdx.utils.FloatArray r11 = r10.xAdvances
            com.badlogic.gdx.utils.FloatArray r2 = r1.xAdvances
            r11.addAll(r2)
        L7a:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r11 = r10.glyphs
            int r11 = r11.size
            int r0 = r0 - r11
            if (r0 <= 0) goto La3
            int r11 = r8.glyphCount
            int r11 = r11 - r0
            r8.glyphCount = r11
            boolean r9 = r9.markupEnabled
            if (r9 == 0) goto La3
        L8a:
            com.badlogic.gdx.utils.IntArray r9 = r8.colors
            int r11 = r9.size
            r0 = 2
            if (r11 <= r0) goto La3
            int r11 = r11 + (-2)
            int r9 = r9.get(r11)
            int r11 = r8.glyphCount
            if (r9 < r11) goto La3
            com.badlogic.gdx.utils.IntArray r9 = r8.colors
            int r11 = r9.size
            int r11 = r11 - r0
            r9.size = r11
            goto L8a
        La3:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r9 = r10.glyphs
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r10 = r1.glyphs
            r9.addAll(r10)
            int r9 = r8.glyphCount
            int r10 = r12.length()
            int r9 = r9 + r10
            r8.glyphCount = r9
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r9 = com.badlogic.gdx.graphics.g2d.GlyphLayout.glyphRunPool
            r9.free(r1)
            return
    }

    private com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun wrap(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData r11, com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun r12, int r13) {
            r10 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r0 = r12.glyphs
            int r1 = r0.size
            com.badlogic.gdx.utils.FloatArray r2 = r12.xAdvances
            r3 = r13
        L7:
            if (r3 <= 0) goto L1e
            int r4 = r3 + (-1)
            java.lang.Object r4 = r0.get(r4)
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r4 = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph) r4
            int r4 = r4.id
            char r4 = (char) r4
            boolean r4 = r11.isWhitespace(r4)
            if (r4 != 0) goto L1b
            goto L1e
        L1b:
            int r3 = r3 + (-1)
            goto L7
        L1e:
            if (r13 >= r1) goto L33
            java.lang.Object r4 = r0.get(r13)
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r4 = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph) r4
            int r4 = r4.id
            char r4 = (char) r4
            boolean r4 = r11.isWhitespace(r4)
            if (r4 != 0) goto L30
            goto L33
        L30:
            int r13 = r13 + 1
            goto L1e
        L33:
            r4 = 0
            r5 = 2
            r6 = 1
            if (r13 >= r1) goto L94
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r4 = com.badlogic.gdx.graphics.g2d.GlyphLayout.glyphRunPool
            java.lang.Object r4 = r4.obtain()
            com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun r4 = (com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun) r4
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r7 = r4.glyphs
            r8 = 0
            r7.addAll(r0, r8, r3)
            int r9 = r13 + (-1)
            r0.removeRange(r8, r9)
            r12.glyphs = r7
            r4.glyphs = r0
            com.badlogic.gdx.utils.FloatArray r7 = r4.xAdvances
            int r9 = r3 + 1
            r7.addAll(r2, r8, r9)
            r2.removeRange(r6, r13)
            float[] r13 = r2.items
            float r0 = r10.getLineOffset(r0, r11)
            r13[r8] = r0
            r12.xAdvances = r7
            r4.xAdvances = r2
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r13 = r12.glyphs
            int r13 = r13.size
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r0 = r4.glyphs
            int r0 = r0.size
            int r1 = r1 - r13
            int r1 = r1 - r0
            int r13 = r10.glyphCount
            int r13 = r13 - r1
            r10.glyphCount = r13
            boolean r2 = r11.markupEnabled
            if (r2 == 0) goto Le0
            if (r1 <= 0) goto Le0
            int r13 = r13 - r0
            com.badlogic.gdx.utils.IntArray r0 = r10.colors
            int r0 = r0.size
            int r0 = r0 - r5
        L80:
            if (r0 < r5) goto Le0
            com.badlogic.gdx.utils.IntArray r2 = r10.colors
            int r2 = r2.get(r0)
            if (r2 > r13) goto L8b
            goto Le0
        L8b:
            com.badlogic.gdx.utils.IntArray r6 = r10.colors
            int r2 = r2 - r1
            r6.set(r0, r2)
            int r0 = r0 + (-2)
            goto L80
        L94:
            r0.truncate(r3)
            int r0 = r3 + 1
            r2.truncate(r0)
            int r13 = r13 - r3
            if (r13 <= 0) goto Le0
            int r0 = r10.glyphCount
            int r0 = r0 - r13
            r10.glyphCount = r0
            boolean r13 = r11.markupEnabled
            if (r13 == 0) goto Le0
            com.badlogic.gdx.utils.IntArray r13 = r10.colors
            int r0 = r13.size
            int r0 = r0 - r5
            int r13 = r13.get(r0)
            int r0 = r10.glyphCount
            if (r13 <= r0) goto Le0
            com.badlogic.gdx.utils.IntArray r13 = r10.colors
            int r13 = r13.peek()
        Lbb:
            com.badlogic.gdx.utils.IntArray r0 = r10.colors
            int r1 = r0.size
            int r1 = r1 - r5
            int r0 = r0.get(r1)
            int r1 = r10.glyphCount
            if (r0 <= r1) goto Ld0
            com.badlogic.gdx.utils.IntArray r0 = r10.colors
            int r1 = r0.size
            int r1 = r1 - r5
            r0.size = r1
            goto Lbb
        Ld0:
            com.badlogic.gdx.utils.IntArray r0 = r10.colors
            int r2 = r0.size
            int r2 = r2 - r5
            r0.set(r2, r1)
            com.badlogic.gdx.utils.IntArray r0 = r10.colors
            int r1 = r0.size
            int r1 = r1 - r6
            r0.set(r1, r13)
        Le0:
            if (r3 != 0) goto Led
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r11 = com.badlogic.gdx.graphics.g2d.GlyphLayout.glyphRunPool
            r11.free(r12)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r11 = r10.runs
            r11.pop()
            goto Lf0
        Led:
            r10.setLastGlyphXAdvance(r11, r12)
        Lf0:
            return r4
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r0 = com.badlogic.gdx.graphics.g2d.GlyphLayout.glyphRunPool
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r1 = r2.runs
            r0.freeAll(r1)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r0 = r2.runs
            r0.clear()
            com.badlogic.gdx.utils.IntArray r0 = r2.colors
            r0.clear()
            r0 = 0
            r2.glyphCount = r0
            r0 = 0
            r2.width = r0
            r2.height = r0
            return
    }

    public void setText(com.badlogic.gdx.graphics.g2d.BitmapFont r11, java.lang.CharSequence r12) {
            r10 = this;
            int r4 = r12.length()
            com.badlogic.gdx.graphics.Color r5 = r11.getColor()
            r3 = 0
            r6 = 0
            r7 = 8
            r8 = 0
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r0.setText(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public void setText(com.badlogic.gdx.graphics.g2d.BitmapFont r26, java.lang.CharSequence r27, int r28, int r29, com.badlogic.gdx.graphics.Color r30, float r31, int r32, boolean r33, java.lang.String r34) {
            r25 = this;
            r0 = r25
            r7 = r27
            r8 = r29
            r9 = r34
            r25.reset()
            r1 = r26
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r10 = r1.data
            r1 = r28
            if (r1 != r8) goto L18
            float r1 = r10.capHeight
            r0.height = r1
            return
        L18:
            if (r33 == 0) goto L28
            float r2 = r10.spaceXadvance
            r3 = 1077936128(0x40400000, float:3.0)
            float r2 = r2 * r3
            r3 = r31
            float r2 = java.lang.Math.max(r3, r2)
            r11 = r2
            goto L2b
        L28:
            r3 = r31
            r11 = r3
        L2b:
            r12 = 0
            if (r33 != 0) goto L33
            if (r9 == 0) goto L31
            goto L33
        L31:
            r14 = 0
            goto L34
        L33:
            r14 = 1
        L34:
            int r2 = r30.toIntBits()
            com.badlogic.gdx.utils.IntArray r3 = r0.colors
            r3.add(r12, r2)
            boolean r15 = r10.markupEnabled
            if (r15 == 0) goto L46
            com.badlogic.gdx.utils.IntArray r3 = com.badlogic.gdx.graphics.g2d.GlyphLayout.colorStack
            r3.add(r2)
        L46:
            float r6 = r10.down
            r16 = 0
            r4 = r1
            r3 = r2
            r17 = r16
            r18 = r17
            r12 = 0
            r19 = 0
        L53:
            if (r1 != r8) goto L61
            if (r4 != r8) goto L59
            goto L183
        L59:
            r13 = r1
            r5 = r2
            r2 = r8
            r19 = 1
            r20 = 0
            goto L9f
        L61:
            int r13 = r1 + 1
            char r1 = r7.charAt(r1)
            r5 = 10
            if (r1 == r5) goto L96
            r5 = 91
            if (r1 == r5) goto L70
            goto L94
        L70:
            if (r15 == 0) goto L94
            int r1 = r0.parseColorMarkup(r7, r13, r8)
            if (r1 < 0) goto L8f
            int r5 = r13 + (-1)
            int r1 = r1 + 1
            int r13 = r13 + r1
            if (r13 != r8) goto L84
            r19 = 1
            r20 = 0
            goto L9a
        L84:
            com.badlogic.gdx.utils.IntArray r1 = com.badlogic.gdx.graphics.g2d.GlyphLayout.colorStack
            int r1 = r1.peek()
            r2 = r5
            r20 = 0
            r5 = r1
            goto L9f
        L8f:
            r5 = -2
            if (r1 != r5) goto L94
            int r13 = r13 + 1
        L94:
            r1 = r13
            goto L53
        L96:
            int r5 = r13 + (-1)
            r20 = 1
        L9a:
            r24 = r5
            r5 = r2
            r2 = r24
        L9f:
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r1 = com.badlogic.gdx.graphics.g2d.GlyphLayout.glyphRunPool
            java.lang.Object r21 = r1.obtain()
            r7 = r21
            com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun r7 = (com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun) r7
            r28 = r5
            r5 = 0
            r7.x = r5
            r7.y = r12
            r8 = r1
            r1 = r10
            r30 = r2
            r2 = r7
            r21 = r12
            r12 = r3
            r3 = r27
            r33 = r4
            r22 = r13
            r13 = r28
            r5 = r30
            r23 = r6
            r6 = r17
            r1.getGlyphs(r2, r3, r4, r5, r6)
            int r1 = r0.glyphCount
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r2 = r7.glyphs
            int r2 = r2.size
            int r1 = r1 + r2
            r0.glyphCount = r1
            r1 = 2
            if (r13 == r12) goto Lf8
            com.badlogic.gdx.utils.IntArray r2 = r0.colors
            int r3 = r2.size
            int r3 = r3 - r1
            int r2 = r2.get(r3)
            int r3 = r0.glyphCount
            if (r2 != r3) goto Lec
            com.badlogic.gdx.utils.IntArray r2 = r0.colors
            int r3 = r2.size
            r4 = 1
            int r3 = r3 - r4
            r2.set(r3, r13)
            goto Lf6
        Lec:
            com.badlogic.gdx.utils.IntArray r2 = r0.colors
            r2.add(r3)
            com.badlogic.gdx.utils.IntArray r2 = r0.colors
            r2.add(r13)
        Lf6:
            r3 = r13
            goto Lf9
        Lf8:
            r3 = r12
        Lf9:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r2 = r7.glyphs
            int r2 = r2.size
            if (r2 != 0) goto L110
            r8.free(r7)
            r2 = r18
            if (r2 != 0) goto L120
            r18 = r2
            r12 = r21
            r6 = 0
            r8 = 1
            r2 = r32
            goto L1ef
        L110:
            r2 = r18
            if (r2 != 0) goto L11a
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r2 = r0.runs
            r2.add(r7)
            goto L121
        L11a:
            r2.appendRun(r7)
            r8.free(r7)
        L120:
            r7 = r2
        L121:
            if (r20 != 0) goto L131
            if (r19 == 0) goto L126
            goto L131
        L126:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r2 = r7.glyphs
            java.lang.Object r2 = r2.peek()
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r2 = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph) r2
            r17 = r2
            goto L136
        L131:
            r0.setLastGlyphXAdvance(r10, r7)
            r17 = r16
        L136:
            if (r14 == 0) goto L1e7
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r2 = r7.glyphs
            int r2 = r2.size
            if (r2 != 0) goto L140
            goto L1e7
        L140:
            if (r20 != 0) goto L144
            if (r19 == 0) goto L1e7
        L144:
            com.badlogic.gdx.utils.FloatArray r2 = r7.xAdvances
            float r2 = r2.first()
            com.badlogic.gdx.utils.FloatArray r4 = r7.xAdvances
            r5 = 1
            float r4 = r4.get(r5)
            float r2 = r2 + r4
            r12 = r21
        L154:
            com.badlogic.gdx.utils.FloatArray r4 = r7.xAdvances
            int r4 = r4.size
            if (r1 >= r4) goto L1e0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r4 = r7.glyphs
            int r5 = r1 + (-1)
            java.lang.Object r4 = r4.get(r5)
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r4 = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph) r4
            float r4 = r0.getGlyphWidth(r4, r10)
            float r4 = r4 + r2
            r6 = 953267991(0x38d1b717, float:1.0E-4)
            float r4 = r4 - r6
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 > 0) goto L17e
            com.badlogic.gdx.utils.FloatArray r4 = r7.xAdvances
            float[] r4 = r4.items
            r4 = r4[r1]
            float r2 = r2 + r4
            r4 = r2
            r6 = 0
            r8 = 1
            r2 = r32
            goto L1dc
        L17e:
            if (r9 == 0) goto L19c
            r0.truncate(r10, r7, r11, r9)
        L183:
            float r1 = r10.capHeight
            float r2 = java.lang.Math.abs(r12)
            float r1 = r1 + r2
            r0.height = r1
            r0.calculateWidths(r10)
            r2 = r32
            r0.alignRuns(r11, r2)
            if (r15 == 0) goto L19b
            com.badlogic.gdx.utils.IntArray r1 = com.badlogic.gdx.graphics.g2d.GlyphLayout.colorStack
            r1.clear()
        L19b:
            return
        L19c:
            r2 = r32
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r4 = r7.glyphs
            int r1 = r10.getWrapIndex(r4, r1)
            if (r1 != 0) goto L1ae
            float r4 = r7.x
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L1b7
            goto L1af
        L1ae:
            r6 = 0
        L1af:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r4 = r7.glyphs
            int r4 = r4.size
            if (r1 < r4) goto L1b6
            goto L1b7
        L1b6:
            r5 = r1
        L1b7:
            com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun r1 = r0.wrap(r10, r7, r5)
            if (r1 != 0) goto L1c1
            r18 = r1
            r8 = 1
            goto L1ef
        L1c1:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r4 = r0.runs
            r4.add(r1)
            float r12 = r12 + r23
            r1.x = r6
            r1.y = r12
            com.badlogic.gdx.utils.FloatArray r4 = r1.xAdvances
            float r4 = r4.first()
            com.badlogic.gdx.utils.FloatArray r5 = r1.xAdvances
            r8 = 1
            float r5 = r5.get(r8)
            float r4 = r4 + r5
            r7 = r1
            r1 = 1
        L1dc:
            int r1 = r1 + r8
            r2 = r4
            goto L154
        L1e0:
            r2 = r32
            r6 = 0
            r8 = 1
            r18 = r7
            goto L1ef
        L1e7:
            r2 = r32
            r6 = 0
            r8 = 1
            r18 = r7
            r12 = r21
        L1ef:
            if (r20 == 0) goto L203
            r5 = r30
            r1 = r33
            if (r5 != r1) goto L1fd
            float r1 = r10.blankLineScale
            float r1 = r1 * r23
            float r12 = r12 + r1
            goto L1ff
        L1fd:
            float r12 = r12 + r23
        L1ff:
            r17 = r16
            r18 = r17
        L203:
            r7 = r27
            r8 = r29
            r2 = r13
            r1 = r22
            r4 = r1
            r6 = r23
            goto L53
    }

    public void setText(com.badlogic.gdx.graphics.g2d.BitmapFont r11, java.lang.CharSequence r12, com.badlogic.gdx.graphics.Color r13, float r14, int r15, boolean r16) {
            r10 = this;
            int r4 = r12.length()
            r3 = 0
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r0.setText(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public java.lang.String toString() {
            r5 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r0 = r5.runs
            int r0 = r0.size
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            float r1 = r5.width
            r0.append(r1)
            r1 = 120(0x78, float:1.68E-43)
            r0.append(r1)
            float r1 = r5.height
            r0.append(r1)
            r1 = 10
            r0.append(r1)
            r2 = 0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r3 = r5.runs
            int r3 = r3.size
        L29:
            if (r2 >= r3) goto L40
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r4 = r5.runs
            java.lang.Object r4 = r4.get(r2)
            com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun r4 = (com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun) r4
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            r0.append(r1)
            int r2 = r2 + 1
            goto L29
        L40:
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.setLength(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
