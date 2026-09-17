package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class BitmapFont implements com.badlogic.gdx.utils.Disposable {
    private final com.badlogic.gdx.graphics.g2d.BitmapFontCache cache;
    final com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData data;
    private boolean flipped;
    boolean integer;
    private boolean ownsTexture;
    com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> regions;

    public static class BitmapFontData {
        public float ascent;
        public float blankLineScale;
        public char[] breakChars;
        public char[] capChars;
        public float capHeight;
        public float cursorX;
        public float descent;
        public float down;
        public boolean flipped;
        public com.badlogic.gdx.files.FileHandle fontFile;
        public final com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][] glyphs;
        public java.lang.String[] imagePaths;
        public float lineHeight;
        public boolean markupEnabled;
        public com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph missingGlyph;
        public java.lang.String name;
        public float padBottom;
        public float padLeft;
        public float padRight;
        public float padTop;
        public float scaleX;
        public float scaleY;
        public float spaceXadvance;
        public char[] xChars;
        public float xHeight;

        public BitmapFontData(com.badlogic.gdx.files.FileHandle r3, boolean r4) {
                r2 = this;
                r2.<init>()
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.capHeight = r0
                r2.blankLineScale = r0
                r2.scaleX = r0
                r2.scaleY = r0
                r1 = 128(0x80, float:1.794E-43)
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph[][] r1 = new com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[r1][]
                r2.glyphs = r1
                r2.xHeight = r0
                r0 = 13
                char[] r0 = new char[r0]
                r0 = {x0030: FILL_ARRAY_DATA , data: [120, 101, 97, 111, 110, 115, 114, 99, 117, 109, 118, 119, 122} // fill-array
                r2.xChars = r0
                r0 = 26
                char[] r0 = new char[r0]
                r0 = {x0042: FILL_ARRAY_DATA , data: [77, 78, 66, 68, 67, 69, 70, 75, 65, 71, 72, 73, 74, 76, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90} // fill-array
                r2.capChars = r0
                r2.fontFile = r3
                r2.flipped = r4
                r2.load(r3, r4)
                return
        }

        public com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph getFirstGlyph() {
                r9 = this;
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph[][] r0 = r9.glyphs
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L24
                r4 = r0[r3]
                if (r4 != 0) goto Lc
                goto L21
            Lc:
                int r5 = r4.length
                r6 = 0
            Le:
                if (r6 >= r5) goto L21
                r7 = r4[r6]
                if (r7 == 0) goto L1e
                int r8 = r7.height
                if (r8 == 0) goto L1e
                int r8 = r7.width
                if (r8 != 0) goto L1d
                goto L1e
            L1d:
                return r7
            L1e:
                int r6 = r6 + 1
                goto Le
            L21:
                int r3 = r3 + 1
                goto L5
            L24:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "No glyphs found."
                r0.<init>(r1)
                throw r0
        }

        public com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph getGlyph(char r3) {
                r2 = this;
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph[][] r0 = r2.glyphs
                int r1 = r3 / 512
                r0 = r0[r1]
                if (r0 == 0) goto Ld
                r3 = r3 & 511(0x1ff, float:7.16E-43)
                r3 = r0[r3]
                return r3
            Ld:
                r3 = 0
                return r3
        }

        public void getGlyphs(com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun r7, java.lang.CharSequence r8, int r9, int r10, com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph r11) {
                r6 = this;
                int r0 = r10 - r9
                if (r0 != 0) goto L5
                return
            L5:
                boolean r1 = r6.markupEnabled
                float r2 = r6.scaleX
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph> r3 = r7.glyphs
                com.badlogic.gdx.utils.FloatArray r4 = r7.xAdvances
                r3.ensureCapacity(r0)
                com.badlogic.gdx.utils.FloatArray r7 = r7.xAdvances
                int r0 = r0 + 1
                r7.ensureCapacity(r0)
            L17:
                int r7 = r9 + 1
                char r9 = r8.charAt(r9)
                r0 = 13
                if (r9 != r0) goto L22
                goto L2c
            L22:
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r0 = r6.getGlyph(r9)
                if (r0 != 0) goto L2e
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r0 = r6.missingGlyph
                if (r0 != 0) goto L2e
            L2c:
                r9 = r7
                goto L62
            L2e:
                r3.add(r0)
                if (r11 != 0) goto L43
                boolean r11 = r0.fixedWidth
                if (r11 == 0) goto L39
                r11 = 0
                goto L4d
            L39:
                int r11 = r0.xoffset
                int r11 = -r11
                float r11 = (float) r11
                float r11 = r11 * r2
                float r5 = r6.padLeft
                float r11 = r11 - r5
                goto L4d
            L43:
                int r5 = r11.xadvance
                int r11 = r11.getKerning(r9)
                int r5 = r5 + r11
                float r11 = (float) r5
                float r11 = r11 * r2
            L4d:
                r4.add(r11)
                if (r1 == 0) goto L60
                r11 = 91
                if (r9 != r11) goto L60
                if (r7 >= r10) goto L60
                char r9 = r8.charAt(r7)
                if (r9 != r11) goto L60
                int r7 = r7 + 1
            L60:
                r9 = r7
                r11 = r0
            L62:
                if (r9 < r10) goto L17
                if (r11 == 0) goto L7e
                boolean r7 = r11.fixedWidth
                if (r7 == 0) goto L70
                int r7 = r11.xadvance
                float r7 = (float) r7
                float r7 = r7 * r2
                goto L7b
            L70:
                int r7 = r11.width
                int r8 = r11.xoffset
                int r7 = r7 + r8
                float r7 = (float) r7
                float r7 = r7 * r2
                float r8 = r6.padRight
                float r7 = r7 - r8
            L7b:
                r4.add(r7)
            L7e:
                return
        }

        public java.lang.String getImagePath(int r2) {
                r1 = this;
                java.lang.String[] r0 = r1.imagePaths
                r2 = r0[r2]
                return r2
        }

        public java.lang.String[] getImagePaths() {
                r1 = this;
                java.lang.String[] r0 = r1.imagePaths
                return r0
        }

        public int getWrapIndex(com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph> r3, int r4) {
                r2 = this;
                int r4 = r4 + (-1)
                T[] r3 = r3.items
                r0 = r3[r4]
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r0 = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph) r0
                int r0 = r0.id
                char r0 = (char) r0
                boolean r1 = r2.isWhitespace(r0)
                if (r1 == 0) goto L12
                return r4
            L12:
                boolean r0 = r2.isBreakChar(r0)
                if (r0 == 0) goto L1a
            L18:
                int r4 = r4 + (-1)
            L1a:
                if (r4 <= 0) goto L32
                r0 = r3[r4]
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r0 = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph) r0
                int r0 = r0.id
                char r0 = (char) r0
                boolean r1 = r2.isWhitespace(r0)
                if (r1 != 0) goto L2f
                boolean r0 = r2.isBreakChar(r0)
                if (r0 == 0) goto L18
            L2f:
                int r4 = r4 + 1
                return r4
            L32:
                r3 = 0
                return r3
        }

        public boolean hasGlyph(char r3) {
                r2 = this;
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r0 = r2.missingGlyph
                r1 = 1
                if (r0 == 0) goto L6
                return r1
            L6:
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r3 = r2.getGlyph(r3)
                if (r3 == 0) goto Ld
                goto Le
            Ld:
                r1 = 0
            Le:
                return r1
        }

        public boolean isBreakChar(char r6) {
                r5 = this;
                char[] r0 = r5.breakChars
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                int r2 = r0.length
                r3 = 0
            L8:
                if (r3 >= r2) goto L13
                char r4 = r0[r3]
                if (r6 != r4) goto L10
                r6 = 1
                return r6
            L10:
                int r3 = r3 + 1
                goto L8
            L13:
                return r1
        }

        public boolean isWhitespace(char r2) {
                r1 = this;
                r0 = 9
                if (r2 == r0) goto L12
                r0 = 10
                if (r2 == r0) goto L12
                r0 = 13
                if (r2 == r0) goto L12
                r0 = 32
                if (r2 == r0) goto L12
                r2 = 0
                return r2
            L12:
                r2 = 1
                return r2
        }

        public void load(com.badlogic.gdx.files.FileHandle r23, boolean r24) {
                r22 = this;
                r1 = r22
                java.lang.String[] r2 = r1.imagePaths
                if (r2 != 0) goto L465
                java.lang.String r2 = r23.nameWithoutExtension()
                r1.name = r2
                java.io.BufferedReader r2 = new java.io.BufferedReader
                java.io.InputStreamReader r3 = new java.io.InputStreamReader
                java.io.InputStream r4 = r23.read()
                r3.<init>(r4)
                r4 = 512(0x200, float:7.175E-43)
                r2.<init>(r3, r4)
                java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r3 == 0) goto L431
                java.lang.String r4 = "padding="
                int r4 = r3.indexOf(r4)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r4 = r4 + 8
                java.lang.String r3 = r3.substring(r4)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r4 = 32
                int r5 = r3.indexOf(r4)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r6 = 0
                java.lang.String r3 = r3.substring(r6, r5)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r5 = ","
                r7 = 4
                java.lang.String[] r3 = r3.split(r5, r7)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r5 = r3.length     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r5 != r7) goto L427
                r5 = r3[r6]     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r5 = (float) r5     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r1.padTop = r5     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r5 = 1
                r7 = r3[r5]     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r7 = (float) r7     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r1.padRight = r7     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r7 = 2
                r8 = r3[r7]     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r8 = (float) r8     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r1.padBottom = r8     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r8 = 3
                r3 = r3[r8]     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r3 = (float) r3     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r1.padLeft = r3     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r3 = r1.padTop     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r9 = r1.padBottom     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r3 = r3 + r9
                java.lang.String r9 = r2.readLine()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r9 == 0) goto L41d
                java.lang.String r10 = " "
                r11 = 9
                java.lang.String[] r9 = r9.split(r10, r11)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r10 = r9.length     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r10 < r8) goto L413
                r8 = r9[r5]     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r10 = "lineHeight="
                boolean r8 = r8.startsWith(r10)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r8 == 0) goto L409
                r8 = r9[r5]     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r10 = 11
                java.lang.String r8 = r8.substring(r10)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r8 = (float) r8     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r1.lineHeight = r8     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r8 = r9[r7]     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r10 = "base="
                boolean r8 = r8.startsWith(r10)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r8 == 0) goto L3ff
                r7 = r9[r7]     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r8 = 5
                java.lang.String r7 = r7.substring(r8)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r7 = (float) r7     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r10 = r9.length     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r11 = 6
                if (r10 < r11) goto Ld0
                r10 = r9[r8]     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r10 == 0) goto Ld0
                r10 = r9[r8]     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r12 = "pages="
                boolean r10 = r10.startsWith(r12)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r10 == 0) goto Ld0
                r8 = r9[r8]     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r8 = r8.substring(r11)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r8 = java.lang.Math.max(r5, r8)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.Throwable -> L43d java.lang.Exception -> L442
                goto Ld1
            Ld0:
                r8 = 1
            Ld1:
                java.lang.String[] r9 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r1.imagePaths = r9     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r9 = 0
            Ld6:
                if (r9 >= r8) goto L169
                java.lang.String r10 = r2.readLine()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r10 == 0) goto L161
                java.lang.String r11 = ".*id=(\\d+)"
                java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.util.regex.Matcher r11 = r11.matcher(r10)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                boolean r12 = r11.find()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r12 == 0) goto L129
                java.lang.String r11 = r11.group(r5)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r12 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.NumberFormatException -> L110 java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r12 != r9) goto Lf9
                goto L129
            Lf9:
                com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.NumberFormatException -> L110 java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L110 java.lang.Throwable -> L43d java.lang.Exception -> L442
                r4.<init>()     // Catch: java.lang.NumberFormatException -> L110 java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r5 = "Page IDs must be indices starting at 0: "
                r4.append(r5)     // Catch: java.lang.NumberFormatException -> L110 java.lang.Throwable -> L43d java.lang.Exception -> L442
                r4.append(r11)     // Catch: java.lang.NumberFormatException -> L110 java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> L110 java.lang.Throwable -> L43d java.lang.Exception -> L442
                r3.<init>(r4)     // Catch: java.lang.NumberFormatException -> L110 java.lang.Throwable -> L43d java.lang.Exception -> L442
                throw r3     // Catch: java.lang.NumberFormatException -> L110 java.lang.Throwable -> L43d java.lang.Exception -> L442
            L110:
                r0 = move-exception
                r3 = r0
                com.badlogic.gdx.utils.GdxRuntimeException r4 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r5.<init>()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r6 = "Invalid page id: "
                r5.append(r6)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r5.append(r11)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                throw r4     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
            L129:
                java.lang.String r11 = ".*file=\"?([^\"]+)\"?"
                java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.util.regex.Matcher r10 = r11.matcher(r10)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                boolean r11 = r10.find()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r11 == 0) goto L159
                java.lang.String r10 = r10.group(r5)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String[] r11 = r1.imagePaths     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                com.badlogic.gdx.files.FileHandle r12 = r23.parent()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                com.badlogic.gdx.files.FileHandle r10 = r12.child(r10)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r10 = r10.path()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r12 = "\\\\"
                java.lang.String r13 = "/"
                java.lang.String r10 = r10.replaceAll(r12, r13)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r11[r9] = r10     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r9 = r9 + 1
                goto Ld6
            L159:
                com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r4 = "Missing: file"
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                throw r3     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
            L161:
                com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r4 = "Missing additional page definitions."
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                throw r3     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
            L169:
                r8 = 0
                r1.descent = r8     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
            L16c:
                java.lang.String r9 = r2.readLine()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r10 = "metrics "
                r11 = 65535(0xffff, float:9.1834E-41)
                java.lang.String r12 = " ="
                if (r9 != 0) goto L17a
                goto L189
            L17a:
                java.lang.String r13 = "kernings "
                boolean r13 = r9.startsWith(r13)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r13 == 0) goto L183
                goto L189
            L183:
                boolean r13 = r9.startsWith(r10)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r13 == 0) goto L331
            L189:
                float r9 = r1.descent     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r13 = r1.padBottom     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r9 = r9 + r13
                r1.descent = r9     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
            L190:
                java.lang.String r9 = r2.readLine()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r9 != 0) goto L197
                goto L19f
            L197:
                java.lang.String r13 = "kerning "
                boolean r13 = r9.startsWith(r13)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r13 != 0) goto L2ee
            L19f:
                if (r9 == 0) goto L202
                boolean r10 = r9.startsWith(r10)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r10 == 0) goto L202
                java.util.StringTokenizer r8 = new java.util.StringTokenizer     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r8.<init>(r9, r12)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r9 = r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r10 = r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r10 = java.lang.Float.parseFloat(r10)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r11 = r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r11 = java.lang.Float.parseFloat(r11)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r12 = r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r12 = java.lang.Float.parseFloat(r12)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r13 = r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r13 = java.lang.Float.parseFloat(r13)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r14 = r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r14 = java.lang.Float.parseFloat(r14)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                java.lang.String r8 = r8.nextToken()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r8 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r21 = r9
                r9 = r8
                r8 = r21
                goto L209
            L202:
                r5 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
            L209:
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r15 = r1.getGlyph(r4)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r15 != 0) goto L229
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r15 = new com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r15.<init>()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r15.id = r4     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r6 = 108(0x6c, float:1.51E-43)
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r6 = r1.getGlyph(r6)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r6 != 0) goto L222
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r6 = r22.getFirstGlyph()     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
            L222:
                int r6 = r6.xadvance     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r15.xadvance = r6     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                r1.setGlyph(r4, r15)     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
            L229:
                int r4 = r15.width     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                if (r4 != 0) goto L240
                float r4 = r1.padLeft     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                int r6 = r15.xadvance     // Catch: java.lang.Throwable -> L43d java.lang.Exception -> L442
                float r6 = (float) r6
                float r6 = r6 + r4
                r16 = r2
                float r2 = r1.padRight     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r6 = r6 + r2
                int r2 = (int) r6     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r15.width = r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r2 = -r4
                int r2 = (int) r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r15.xoffset = r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                goto L242
            L240:
                r16 = r2
            L242:
                int r2 = r15.xadvance     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r2 = (float) r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r1.spaceXadvance = r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                char[] r2 = r1.xChars     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r4 = r2.length     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r15 = 0
                r17 = 0
            L24d:
                if (r15 >= r4) goto L25b
                char r6 = r2[r15]     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r17 = r1.getGlyph(r6)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r17 == 0) goto L258
                goto L25b
            L258:
                int r15 = r15 + 1
                goto L24d
            L25b:
                if (r17 != 0) goto L261
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r17 = r22.getFirstGlyph()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L261:
                r2 = r17
                int r2 = r2.height     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r2 = (float) r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r2 = r2 - r3
                r1.xHeight = r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                char[] r2 = r1.capChars     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r4 = r2.length     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r6 = 0
                r15 = 0
            L26e:
                if (r15 >= r4) goto L27c
                char r6 = r2[r15]     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r6 = r1.getGlyph(r6)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r6 == 0) goto L279
                goto L27c
            L279:
                int r15 = r15 + 1
                goto L26e
            L27c:
                if (r6 != 0) goto L2c0
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph[][] r2 = r1.glyphs     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r4 = r2.length     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r6 = 0
            L282:
                if (r6 >= r4) goto L2c5
                r15 = r2[r6]     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r15 != 0) goto L28d
                r17 = r2
                r18 = r4
                goto L2b9
            L28d:
                r17 = r2
                int r2 = r15.length     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r18 = r4
                r4 = 0
            L293:
                if (r4 >= r2) goto L2b9
                r19 = r2
                r2 = r15[r4]     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r2 == 0) goto L2b0
                r20 = r15
                int r15 = r2.height     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r15 == 0) goto L2b2
                int r2 = r2.width     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r2 != 0) goto L2a6
                goto L2b2
            L2a6:
                float r2 = r1.capHeight     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r15 = (float) r15     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r2 = java.lang.Math.max(r2, r15)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r1.capHeight = r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                goto L2b2
            L2b0:
                r20 = r15
            L2b2:
                int r4 = r4 + 1
                r2 = r19
                r15 = r20
                goto L293
            L2b9:
                int r6 = r6 + 1
                r2 = r17
                r4 = r18
                goto L282
            L2c0:
                int r2 = r6.height     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r2 = (float) r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r1.capHeight = r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L2c5:
                float r2 = r1.capHeight     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r2 = r2 - r3
                r1.capHeight = r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r7 = r7 - r2
                r1.ascent = r7     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r2 = r1.lineHeight     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r2 = -r2
                r1.down = r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r24 == 0) goto L2da
                float r3 = -r7
                r1.ascent = r3     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r2 = -r2
                r1.down = r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L2da:
                if (r5 == 0) goto L2ea
                r1.ascent = r8     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r1.descent = r10     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r1.down = r11     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r1.capHeight = r12     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r1.lineHeight = r13     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r1.spaceXadvance = r14     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r1.xHeight = r9     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L2ea:
                com.badlogic.gdx.utils.StreamUtils.closeQuietly(r16)
                return
            L2ee:
                r16 = r2
                java.util.StringTokenizer r2 = new java.util.StringTokenizer     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.<init>(r9, r12)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r6 = r2.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r9 = r2.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r6 < 0) goto L32c
                if (r6 > r11) goto L32c
                if (r9 < 0) goto L32c
                if (r9 <= r11) goto L317
                goto L32c
            L317:
                char r6 = (char) r6     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r6 = r1.getGlyph(r6)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r2 = r2.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r6 == 0) goto L32c
                r6.setKerning(r9, r2)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L32c:
                r2 = r16
                r6 = 0
                goto L190
            L331:
                r16 = r2
                java.lang.String r2 = "char "
                boolean r2 = r9.startsWith(r2)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r2 != 0) goto L340
            L33b:
                r2 = r16
                r6 = 0
                goto L16c
            L340:
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r2 = new com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.<init>()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.util.StringTokenizer r6 = new java.util.StringTokenizer     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r6.<init>(r9, r12)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r9 = r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r9 > 0) goto L35d
                r1.missingGlyph = r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                goto L362
            L35d:
                if (r9 > r11) goto L33b
                r1.setGlyph(r9, r2)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L362:
                r2.id = r9     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r9 = r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.srcX = r9     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r9 = r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.srcY = r9     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r9 = r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.width = r9     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r9 = r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.height = r9     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r9 = r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.xoffset = r9     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r24 == 0) goto L3b5
                java.lang.String r9 = r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.yoffset = r9     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                goto L3c3
            L3b5:
                int r9 = r2.height     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r10 = r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r9 = r9 + r10
                int r9 = -r9
                r2.yoffset = r9     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L3c3:
                r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r9 = r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.xadvance = r9     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                boolean r9 = r6.hasMoreTokens()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r9 == 0) goto L3d9
                r6.nextToken()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L3d9:
                boolean r9 = r6.hasMoreTokens()     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r9 == 0) goto L3e9
                java.lang.String r6 = r6.nextToken()     // Catch: java.lang.NumberFormatException -> L3e9 java.lang.Exception -> L43b java.lang.Throwable -> L45f
                int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L3e9 java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r2.page = r6     // Catch: java.lang.NumberFormatException -> L3e9 java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L3e9:
                int r6 = r2.width     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r6 <= 0) goto L33b
                int r6 = r2.height     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                if (r6 <= 0) goto L33b
                int r2 = r2.yoffset     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r2 = (float) r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r2 = r2 + r7
                float r6 = r1.descent     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                float r2 = java.lang.Math.min(r2, r6)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                r1.descent = r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                goto L33b
            L3ff:
                r16 = r2
                com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r3 = "Missing: base"
                r2.<init>(r3)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                throw r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L409:
                r16 = r2
                com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r3 = "Missing: lineHeight"
                r2.<init>(r3)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                throw r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L413:
                r16 = r2
                com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r3 = "Invalid common header."
                r2.<init>(r3)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                throw r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L41d:
                r16 = r2
                com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r3 = "Missing common header."
                r2.<init>(r3)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                throw r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L427:
                r16 = r2
                com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r3 = "Invalid padding."
                r2.<init>(r3)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                throw r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L431:
                r16 = r2
                com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                java.lang.String r3 = "File is empty."
                r2.<init>(r3)     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
                throw r2     // Catch: java.lang.Exception -> L43b java.lang.Throwable -> L45f
            L43b:
                r0 = move-exception
                goto L445
            L43d:
                r0 = move-exception
                r16 = r2
            L440:
                r2 = r0
                goto L461
            L442:
                r0 = move-exception
                r16 = r2
            L445:
                r2 = r0
                com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L45f
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45f
                r4.<init>()     // Catch: java.lang.Throwable -> L45f
                java.lang.String r5 = "Error loading font file: "
                r4.append(r5)     // Catch: java.lang.Throwable -> L45f
                r5 = r23
                r4.append(r5)     // Catch: java.lang.Throwable -> L45f
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L45f
                r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L45f
                throw r3     // Catch: java.lang.Throwable -> L45f
            L45f:
                r0 = move-exception
                goto L440
            L461:
                com.badlogic.gdx.utils.StreamUtils.closeQuietly(r16)
                throw r2
            L465:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "Already loaded."
                r2.<init>(r3)
                throw r2
        }

        public void setGlyph(int r4, com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph r5) {
                r3 = this;
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph[][] r0 = r3.glyphs
                int r1 = r4 / 512
                r2 = r0[r1]
                if (r2 != 0) goto Le
                r2 = 512(0x200, float:7.175E-43)
                com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph[] r2 = new com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[r2]
                r0[r1] = r2
            Le:
                r4 = r4 & 511(0x1ff, float:7.16E-43)
                r2[r4] = r5
                return
        }

        public void setGlyphRegion(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph r18, com.badlogic.gdx.graphics.g2d.TextureRegion r19) {
                r17 = this;
                r0 = r18
                r1 = r19
                com.badlogic.gdx.graphics.Texture r2 = r19.getTexture()
                int r3 = r2.getWidth()
                float r3 = (float) r3
                r4 = 1065353216(0x3f800000, float:1.0)
                float r3 = r4 / r3
                int r2 = r2.getHeight()
                float r2 = (float) r2
                float r4 = r4 / r2
                float r2 = r1.u
                float r5 = r1.v
                int r6 = r19.getRegionWidth()
                float r6 = (float) r6
                int r7 = r19.getRegionHeight()
                float r7 = (float) r7
                boolean r8 = r1 instanceof com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion
                r9 = 0
                if (r8 == 0) goto L38
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion) r1
                float r8 = r1.offsetX
                int r10 = r1.originalHeight
                int r11 = r1.packedHeight
                int r10 = r10 - r11
                float r10 = (float) r10
                float r1 = r1.offsetY
                float r10 = r10 - r1
                goto L3a
            L38:
                r8 = 0
                r10 = 0
            L3a:
                int r1 = r0.srcX
                float r11 = (float) r1
                int r12 = r0.width
                int r1 = r1 + r12
                float r1 = (float) r1
                int r13 = r0.srcY
                float r14 = (float) r13
                int r15 = r0.height
                int r13 = r13 + r15
                float r13 = (float) r13
                int r16 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
                if (r16 <= 0) goto L6c
                float r11 = r11 - r8
                int r16 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r16 >= 0) goto L5e
                float r12 = (float) r12
                float r12 = r12 + r11
                int r12 = (int) r12
                r0.width = r12
                int r12 = r0.xoffset
                float r12 = (float) r12
                float r12 = r12 - r11
                int r11 = (int) r12
                r0.xoffset = r11
                r11 = 0
            L5e:
                float r1 = r1 - r8
                int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r8 <= 0) goto L6c
                int r8 = r0.width
                float r8 = (float) r8
                float r1 = r1 - r6
                float r8 = r8 - r1
                int r1 = (int) r8
                r0.width = r1
                goto L6d
            L6c:
                r6 = r1
            L6d:
                int r1 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r1 <= 0) goto L99
                float r14 = r14 - r10
                int r1 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
                if (r1 >= 0) goto L81
                float r1 = (float) r15
                float r1 = r1 + r14
                int r1 = (int) r1
                r0.height = r1
                if (r1 >= 0) goto L82
                r1 = 0
                r0.height = r1
                goto L82
            L81:
                r9 = r14
            L82:
                float r13 = r13 - r10
                int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r1 <= 0) goto L98
                float r13 = r13 - r7
                int r1 = r0.height
                float r1 = (float) r1
                float r1 = r1 - r13
                int r1 = (int) r1
                r0.height = r1
                int r1 = r0.yoffset
                float r1 = (float) r1
                float r1 = r1 + r13
                int r1 = (int) r1
                r0.yoffset = r1
                r14 = r9
                goto L9a
            L98:
                r14 = r9
            L99:
                r7 = r13
            L9a:
                float r11 = r11 * r3
                float r11 = r11 + r2
                r0.u = r11
                float r6 = r6 * r3
                float r2 = r2 + r6
                r0.u2 = r2
                r1 = r17
                boolean r2 = r1.flipped
                if (r2 == 0) goto Lb5
                float r14 = r14 * r4
                float r14 = r14 + r5
                r0.v = r14
                float r7 = r7 * r4
                float r5 = r5 + r7
                r0.v2 = r5
                goto Lbf
            Lb5:
                float r14 = r14 * r4
                float r14 = r14 + r5
                r0.v2 = r14
                float r7 = r7 * r4
                float r5 = r5 + r7
                r0.v = r5
            Lbf:
                return
        }

        public void setLineHeight(float r2) {
                r1 = this;
                float r0 = r1.scaleY
                float r2 = r2 * r0
                r1.lineHeight = r2
                boolean r0 = r1.flipped
                if (r0 == 0) goto Lb
                goto Lc
            Lb:
                float r2 = -r2
            Lc:
                r1.down = r2
                return
        }

        public void setScale(float r1) {
                r0 = this;
                r0.setScale(r1, r1)
                return
        }

        public void setScale(float r4, float r5) {
                r3 = this;
                r0 = 0
                int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r1 == 0) goto L60
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 == 0) goto L58
                float r0 = r3.scaleX
                float r0 = r4 / r0
                float r1 = r3.scaleY
                float r1 = r5 / r1
                float r2 = r3.lineHeight
                float r2 = r2 * r1
                r3.lineHeight = r2
                float r2 = r3.spaceXadvance
                float r2 = r2 * r0
                r3.spaceXadvance = r2
                float r2 = r3.xHeight
                float r2 = r2 * r1
                r3.xHeight = r2
                float r2 = r3.capHeight
                float r2 = r2 * r1
                r3.capHeight = r2
                float r2 = r3.ascent
                float r2 = r2 * r1
                r3.ascent = r2
                float r2 = r3.descent
                float r2 = r2 * r1
                r3.descent = r2
                float r2 = r3.down
                float r2 = r2 * r1
                r3.down = r2
                float r2 = r3.padLeft
                float r2 = r2 * r0
                r3.padLeft = r2
                float r2 = r3.padRight
                float r2 = r2 * r0
                r3.padRight = r2
                float r0 = r3.padTop
                float r0 = r0 * r1
                r3.padTop = r0
                float r0 = r3.padBottom
                float r0 = r0 * r1
                r3.padBottom = r0
                r3.scaleX = r4
                r3.scaleY = r5
                return
            L58:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "scaleY cannot be 0."
                r4.<init>(r5)
                throw r4
            L60:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "scaleX cannot be 0."
                r4.<init>(r5)
                throw r4
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                if (r0 == 0) goto L5
                goto L9
            L5:
                java.lang.String r0 = super.toString()
            L9:
                return r0
        }
    }

    public static class Glyph {
        public boolean fixedWidth;
        public int height;
        public int id;
        public byte[][] kerning;
        public int page;
        public int srcX;
        public int srcY;
        public float u;
        public float u2;
        public float v;
        public float v2;
        public int width;
        public int xadvance;
        public int xoffset;
        public int yoffset;

        public Glyph() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.page = r0
                return
        }

        public int getKerning(char r3) {
                r2 = this;
                byte[][] r0 = r2.kerning
                if (r0 == 0) goto Lf
                int r1 = r3 >>> 9
                r0 = r0[r1]
                if (r0 == 0) goto Lf
                r3 = r3 & 511(0x1ff, float:7.16E-43)
                r3 = r0[r3]
                return r3
            Lf:
                r3 = 0
                return r3
        }

        public void setKerning(int r4, int r5) {
                r3 = this;
                byte[][] r0 = r3.kerning
                if (r0 != 0) goto La
                r0 = 128(0x80, float:1.794E-43)
                byte[][] r0 = new byte[r0][]
                r3.kerning = r0
            La:
                byte[][] r0 = r3.kerning
                int r1 = r4 >>> 9
                r2 = r0[r1]
                if (r2 != 0) goto L18
                r2 = 512(0x200, float:7.175E-43)
                byte[] r2 = new byte[r2]
                r0[r1] = r2
            L18:
                r4 = r4 & 511(0x1ff, float:7.16E-43)
                byte r5 = (byte) r5
                r2[r4] = r5
                return
        }

        public java.lang.String toString() {
                r1 = this;
                int r0 = r1.id
                char r0 = (char) r0
                java.lang.String r0 = java.lang.Character.toString(r0)
                return r0
        }
    }

    public BitmapFont() {
            r4 = this;
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = "com/badlogic/gdx/utils/lsans-15.fnt"
            com.badlogic.gdx.files.FileHandle r0 = r0.classpath(r1)
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = "com/badlogic/gdx/utils/lsans-15.png"
            com.badlogic.gdx.files.FileHandle r1 = r1.classpath(r2)
            r2 = 0
            r3 = 1
            r4.<init>(r0, r1, r2, r3)
            return
    }

    public BitmapFont(com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.files.FileHandle r3, boolean r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public BitmapFont(com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.files.FileHandle r4, boolean r5, boolean r6) {
            r2 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = new com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData
            r0.<init>(r3, r5)
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            com.badlogic.gdx.graphics.Texture r5 = new com.badlogic.gdx.graphics.Texture
            r1 = 0
            r5.<init>(r4, r1)
            r3.<init>(r5)
            r2.<init>(r0, r3, r6)
            r3 = 1
            r2.ownsTexture = r3
            return
    }

    public BitmapFont(com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.graphics.g2d.TextureRegion r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public BitmapFont(com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.graphics.g2d.TextureRegion r3, boolean r4) {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = new com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData
            r0.<init>(r2, r4)
            r2 = 1
            r1.<init>(r0, r3, r2)
            return
    }

    public BitmapFont(com.badlogic.gdx.files.FileHandle r2, boolean r3) {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = new com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData
            r0.<init>(r2, r3)
            r2 = 0
            r3 = 1
            r1.<init>(r0, r2, r3)
            return
    }

    public BitmapFont(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData r3, com.badlogic.gdx.graphics.g2d.TextureRegion r4, boolean r5) {
            r2 = this;
            if (r4 == 0) goto Ld
            r0 = 1
            com.badlogic.gdx.graphics.g2d.TextureRegion[] r0 = new com.badlogic.gdx.graphics.g2d.TextureRegion[r0]
            r1 = 0
            r0[r1] = r4
            com.badlogic.gdx.utils.Array r4 = com.badlogic.gdx.utils.Array.with(r0)
            goto Le
        Ld:
            r4 = 0
        Le:
            r2.<init>(r3, r4, r5)
            return
    }

    public BitmapFont(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData r6, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> r7, boolean r8) {
            r5 = this;
            r5.<init>()
            boolean r0 = r6.flipped
            r5.flipped = r0
            r5.data = r6
            r5.integer = r8
            r8 = 0
            if (r7 == 0) goto L18
            int r0 = r7.size
            if (r0 != 0) goto L13
            goto L18
        L13:
            r5.regions = r7
            r5.ownsTexture = r8
            goto L59
        L18:
            java.lang.String[] r7 = r6.imagePaths
            if (r7 == 0) goto L63
            int r7 = r7.length
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>(r7)
            r5.regions = r0
            r0 = 0
        L25:
            if (r0 >= r7) goto L56
            com.badlogic.gdx.files.FileHandle r1 = r6.fontFile
            if (r1 != 0) goto L36
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String[] r2 = r6.imagePaths
            r2 = r2[r0]
            com.badlogic.gdx.files.FileHandle r1 = r1.internal(r2)
            goto L44
        L36:
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            java.lang.String[] r3 = r6.imagePaths
            r3 = r3[r0]
            com.badlogic.gdx.Files$FileType r1 = r1.type()
            com.badlogic.gdx.files.FileHandle r1 = r2.getFileHandle(r3, r1)
        L44:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> r2 = r5.regions
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            com.badlogic.gdx.graphics.Texture r4 = new com.badlogic.gdx.graphics.Texture
            r4.<init>(r1, r8)
            r3.<init>(r4)
            r2.add(r3)
            int r0 = r0 + 1
            goto L25
        L56:
            r7 = 1
            r5.ownsTexture = r7
        L59:
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r7 = r5.newFontCache()
            r5.cache = r7
            r5.load(r6)
            return
        L63:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "If no regions are specified, the font data must have an images path."
            r6.<init>(r7)
            throw r6
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            boolean r0 = r3.ownsTexture
            if (r0 == 0) goto L1b
            r0 = 0
        L5:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> r1 = r3.regions
            int r2 = r1.size
            if (r0 >= r2) goto L1b
            java.lang.Object r1 = r1.get(r0)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r1
            com.badlogic.gdx.graphics.Texture r1 = r1.getTexture()
            r1.dispose()
            int r0 = r0 + 1
            goto L5
        L1b:
            return
    }

    public com.badlogic.gdx.graphics.g2d.GlyphLayout draw(com.badlogic.gdx.graphics.g2d.Batch r2, java.lang.CharSequence r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r0 = r1.cache
            r0.clear()
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r0 = r1.cache
            com.badlogic.gdx.graphics.g2d.GlyphLayout r3 = r0.addText(r3, r4, r5)
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r4 = r1.cache
            r4.draw(r2)
            return r3
    }

    public com.badlogic.gdx.graphics.g2d.GlyphLayout draw(com.badlogic.gdx.graphics.g2d.Batch r12, java.lang.CharSequence r13, float r14, float r15, int r16, int r17, float r18, int r19, boolean r20) {
            r11 = this;
            r0 = r11
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r1 = r0.cache
            r1.clear()
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r2 = r0.cache
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            com.badlogic.gdx.graphics.g2d.GlyphLayout r1 = r2.addText(r3, r4, r5, r6, r7, r8, r9, r10)
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r2 = r0.cache
            r3 = r12
            r2.draw(r12)
            return r1
    }

    public com.badlogic.gdx.graphics.g2d.GlyphLayout draw(com.badlogic.gdx.graphics.g2d.Batch r13, java.lang.CharSequence r14, float r15, float r16, int r17, int r18, float r19, int r20, boolean r21, java.lang.String r22) {
            r12 = this;
            r0 = r12
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r1 = r0.cache
            r1.clear()
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r2 = r0.cache
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            com.badlogic.gdx.graphics.g2d.GlyphLayout r1 = r2.addText(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r2 = r0.cache
            r3 = r13
            r2.draw(r13)
            return r1
    }

    public float getCapHeight() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r1.data
            float r0 = r0.capHeight
            return r0
    }

    public com.badlogic.gdx.graphics.Color getColor() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r0 = r1.cache
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            return r0
    }

    public com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData getData() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r1.data
            return r0
    }

    public float getDescent() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r1.data
            float r0 = r0.descent
            return r0
    }

    public float getLineHeight() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r1.data
            float r0 = r0.lineHeight
            return r0
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> getRegions() {
            r1 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> r0 = r1.regions
            return r0
    }

    public float getScaleX() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r1.data
            float r0 = r0.scaleX
            return r0
    }

    public float getScaleY() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r1.data
            float r0 = r0.scaleY
            return r0
    }

    public boolean isFlipped() {
            r1 = this;
            boolean r0 = r1.flipped
            return r0
    }

    protected void load(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData r11) {
            r10 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph[][] r0 = r11.glyphs
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L27
            r4 = r0[r3]
            if (r4 != 0) goto Lc
            goto L24
        Lc:
            int r5 = r4.length
            r6 = 0
        Le:
            if (r6 >= r5) goto L24
            r7 = r4[r6]
            if (r7 == 0) goto L21
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> r8 = r10.regions
            int r9 = r7.page
            java.lang.Object r8 = r8.get(r9)
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r8
            r11.setGlyphRegion(r7, r8)
        L21:
            int r6 = r6 + 1
            goto Le
        L24:
            int r3 = r3 + 1
            goto L5
        L27:
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r0 = r11.missingGlyph
            if (r0 == 0) goto L38
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> r1 = r10.regions
            int r2 = r0.page
            java.lang.Object r1 = r1.get(r2)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r1
            r11.setGlyphRegion(r0, r1)
        L38:
            return
    }

    public com.badlogic.gdx.graphics.g2d.BitmapFontCache newFontCache() {
            r2 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r0 = new com.badlogic.gdx.graphics.g2d.BitmapFontCache
            boolean r1 = r2.integer
            r0.<init>(r2, r1)
            return r0
    }

    public void setColor(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r0 = r1.cache
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            r0.set(r2, r3, r4, r5)
            return
    }

    public void setOwnsTexture(boolean r1) {
            r0 = this;
            r0.ownsTexture = r1
            return
    }

    public void setUseIntegerPositions(boolean r2) {
            r1 = this;
            r1.integer = r2
            com.badlogic.gdx.graphics.g2d.BitmapFontCache r0 = r1.cache
            r0.setUseIntegerPositions(r2)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r1.data
            java.lang.String r0 = r0.name
            if (r0 == 0) goto L7
            goto Lb
        L7:
            java.lang.String r0 = super.toString()
        Lb:
            return r0
    }

    public boolean usesIntegerPositions() {
            r1 = this;
            boolean r0 = r1.integer
            return r0
    }
}
