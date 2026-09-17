package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class TextArea extends com.badlogic.gdx.scenes.scene2d.ui.TextField {
    int cursorLine;
    int firstLineShowing;
    private java.lang.String lastText;
    com.badlogic.gdx.utils.IntArray linesBreak;
    private int linesShowing;
    float moveOffset;
    private float prefRows;

    public class TextAreaListener extends com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldClickListener {
        final /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextArea this$0;

        public TextAreaListener(com.badlogic.gdx.scenes.scene2d.ui.TextArea r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldClickListener
        protected boolean checkFocusTraversal(char r2) {
                r1 = this;
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r0 = r1.this$0
                boolean r0 = r0.focusTraversal
                if (r0 == 0) goto Lc
                r0 = 9
                if (r2 != r0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldClickListener
        protected void goEnd(boolean r5) {
                r4 = this;
                if (r5 != 0) goto L26
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r5 = r4.this$0
                int r0 = r5.cursorLine
                int r5 = r5.getLines()
                if (r0 < r5) goto Ld
                goto L26
            Ld:
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r5 = r4.this$0
                int r0 = r5.cursorLine
                int r1 = r0 * 2
                int r1 = r1 + 1
                com.badlogic.gdx.utils.IntArray r2 = r5.linesBreak
                int r3 = r2.size
                if (r1 >= r3) goto L30
                int r0 = r0 * 2
                int r0 = r0 + 1
                int r0 = r2.get(r0)
                r5.cursor = r0
                goto L30
            L26:
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r5 = r4.this$0
                java.lang.String r0 = r5.text
                int r0 = r0.length()
                r5.cursor = r0
            L30:
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldClickListener
        protected void goHome(boolean r5) {
                r4 = this;
                if (r5 == 0) goto L8
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r5 = r4.this$0
                r0 = 0
                r5.cursor = r0
                goto L1c
            L8:
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r5 = r4.this$0
                int r0 = r5.cursorLine
                int r1 = r0 * 2
                com.badlogic.gdx.utils.IntArray r2 = r5.linesBreak
                int r3 = r2.size
                if (r1 >= r3) goto L1c
                int r0 = r0 * 2
                int r0 = r2.get(r0)
                r5.cursor = r0
            L1c:
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public boolean keyDown(com.badlogic.gdx.scenes.scene2d.InputEvent r4, int r5) {
                r3 = this;
                boolean r4 = super.keyDown(r4, r5)
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r0 = r3.this$0
                boolean r0 = r0.hasKeyboardFocus()
                if (r0 == 0) goto L7a
                com.badlogic.gdx.Input r4 = com.badlogic.gdx.Gdx.input
                r0 = 59
                boolean r4 = r4.isKeyPressed(r0)
                r0 = 0
                r1 = 1
                if (r4 != 0) goto L25
                com.badlogic.gdx.Input r4 = com.badlogic.gdx.Gdx.input
                r2 = 60
                boolean r4 = r4.isKeyPressed(r2)
                if (r4 == 0) goto L23
                goto L25
            L23:
                r4 = 0
                goto L26
            L25:
                r4 = 1
            L26:
                r2 = 20
                if (r5 != r2) goto L48
                if (r4 == 0) goto L39
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r4 = r3.this$0
                boolean r0 = r4.hasSelection
                if (r0 != 0) goto L3e
                int r0 = r4.cursor
                r4.selectionStart = r0
                r4.hasSelection = r1
                goto L3e
            L39:
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r4 = r3.this$0
                r4.clearSelection()
            L3e:
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r4 = r3.this$0
                int r0 = r4.cursorLine
                int r0 = r0 + r1
                r4.moveCursorLine(r0)
            L46:
                r0 = 1
                goto L6f
            L48:
                r2 = 19
                if (r5 != r2) goto L69
                if (r4 == 0) goto L5b
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r4 = r3.this$0
                boolean r0 = r4.hasSelection
                if (r0 != 0) goto L60
                int r0 = r4.cursor
                r4.selectionStart = r0
                r4.hasSelection = r1
                goto L60
            L5b:
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r4 = r3.this$0
                r4.clearSelection()
            L60:
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r4 = r3.this$0
                int r0 = r4.cursorLine
                int r0 = r0 - r1
                r4.moveCursorLine(r0)
                goto L46
            L69:
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r4 = r3.this$0
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                r4.moveOffset = r2
            L6f:
                if (r0 == 0) goto L74
                r3.scheduleKeyRepeatTask(r5)
            L74:
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r4 = r3.this$0
                r4.showCursor()
                return r1
            L7a:
                return r4
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public boolean keyTyped(com.badlogic.gdx.scenes.scene2d.InputEvent r1, char r2) {
                r0 = this;
                boolean r1 = super.keyTyped(r1, r2)
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r2 = r0.this$0
                r2.showCursor()
                return r1
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldClickListener
        protected void setCursorPosition(float r5, float r6) {
                r4 = this;
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r0 = r4.this$0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r0.moveOffset = r1
                com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r1 = r0.style
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r1.background
                com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r1.font
                float r0 = r0.getHeight()
                if (r2 == 0) goto L1c
                float r3 = r2.getTopHeight()
                float r0 = r0 - r3
                float r3 = r2.getLeftWidth()
                float r5 = r5 - r3
            L1c:
                r3 = 0
                float r5 = java.lang.Math.max(r3, r5)
                if (r2 == 0) goto L28
                float r2 = r2.getTopHeight()
                float r6 = r6 - r2
            L28:
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r2 = r4.this$0
                float r0 = r0 - r6
                float r1 = r1.getLineHeight()
                float r0 = r0 / r1
                double r0 = (double) r0
                double r0 = java.lang.Math.floor(r0)
                int r0 = (int) r0
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r1 = r4.this$0
                int r3 = r1.firstLineShowing
                int r0 = r0 + r3
                r2.cursorLine = r0
                r0 = 0
                int r2 = r1.cursorLine
                int r3 = r1.getLines()
                int r3 = r3 + (-1)
                int r2 = java.lang.Math.min(r2, r3)
                int r0 = java.lang.Math.max(r0, r2)
                r1.cursorLine = r0
                super.setCursorPosition(r5, r6)
                com.badlogic.gdx.scenes.scene2d.ui.TextArea r5 = r4.this$0
                r5.updateCurrentLine()
                return
        }
    }

    public TextArea(java.lang.String r1, com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private int calculateCurrentLineIndex(int r4) {
            r3 = this;
            r0 = 0
        L1:
            com.badlogic.gdx.utils.IntArray r1 = r3.linesBreak
            int r2 = r1.size
            if (r0 >= r2) goto L10
            int[] r1 = r1.items
            r1 = r1[r0]
            if (r4 <= r1) goto L10
            int r0 = r0 + 1
            goto L1
        L10:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    protected void calculateOffsets() {
            r10 = this;
            super.calculateOffsets()
            java.lang.String r0 = r10.text
            java.lang.String r1 = r10.lastText
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb3
            java.lang.String r0 = r10.text
            r10.lastText = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r10.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r0.font
            float r1 = r10.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = r10.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.background
            if (r2 == 0) goto L2d
            float r2 = r2.getLeftWidth()
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r3 = r10.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r3.background
            float r3 = r3.getRightWidth()
            float r2 = r2 + r3
            goto L2e
        L2d:
            r2 = 0
        L2e:
            float r1 = r1 - r2
            com.badlogic.gdx.utils.IntArray r2 = r10.linesBreak
            r2.clear()
            java.lang.Class<com.badlogic.gdx.graphics.g2d.GlyphLayout> r2 = com.badlogic.gdx.graphics.g2d.GlyphLayout.class
            com.badlogic.gdx.utils.Pool r2 = com.badlogic.gdx.utils.Pools.get(r2)
            java.lang.Object r3 = r2.obtain()
            com.badlogic.gdx.graphics.g2d.GlyphLayout r3 = (com.badlogic.gdx.graphics.g2d.GlyphLayout) r3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L44:
            java.lang.String r8 = r10.text
            int r8 = r8.length()
            if (r5 >= r8) goto L95
            java.lang.String r8 = r10.text
            char r8 = r8.charAt(r5)
            r9 = 13
            if (r8 == r9) goto L86
            r9 = 10
            if (r8 != r9) goto L5b
            goto L86
        L5b:
            boolean r8 = r10.continueCursor(r5, r4)
            if (r8 == 0) goto L62
            goto L63
        L62:
            r7 = r5
        L63:
            java.lang.String r8 = r10.text
            int r9 = r5 + 1
            java.lang.CharSequence r8 = r8.subSequence(r6, r9)
            r3.setText(r0, r8)
            float r8 = r3.width
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L92
            if (r6 < r7) goto L78
            int r7 = r5 + (-1)
        L78:
            com.badlogic.gdx.utils.IntArray r8 = r10.linesBreak
            r8.add(r6)
            com.badlogic.gdx.utils.IntArray r6 = r10.linesBreak
            int r7 = r7 + 1
            r6.add(r7)
            r6 = r7
            goto L92
        L86:
            com.badlogic.gdx.utils.IntArray r8 = r10.linesBreak
            r8.add(r6)
            com.badlogic.gdx.utils.IntArray r6 = r10.linesBreak
            r6.add(r5)
            int r6 = r5 + 1
        L92:
            int r5 = r5 + 1
            goto L44
        L95:
            r2.free(r3)
            java.lang.String r0 = r10.text
            int r0 = r0.length()
            if (r6 >= r0) goto Lb0
            com.badlogic.gdx.utils.IntArray r0 = r10.linesBreak
            r0.add(r6)
            com.badlogic.gdx.utils.IntArray r0 = r10.linesBreak
            java.lang.String r1 = r10.text
            int r1 = r1.length()
            r0.add(r1)
        Lb0:
            r10.showCursor()
        Lb3:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    protected boolean continueCursor(int r4, int r5) {
            r3 = this;
            int r0 = r4 + r5
            int r0 = r3.calculateCurrentLineIndex(r0)
            boolean r5 = super.continueCursor(r4, r5)
            if (r5 == 0) goto L28
            if (r0 < 0) goto L26
            com.badlogic.gdx.utils.IntArray r5 = r3.linesBreak
            int r1 = r5.size
            int r1 = r1 + (-2)
            if (r0 >= r1) goto L26
            int[] r5 = r5.items
            int r1 = r0 + 1
            r2 = r5[r1]
            if (r2 != r4) goto L26
            r4 = r5[r1]
            int r0 = r0 + 2
            r5 = r5[r0]
            if (r4 != r5) goto L28
        L26:
            r4 = 1
            goto L29
        L28:
            r4 = 0
        L29:
            return r4
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    protected com.badlogic.gdx.scenes.scene2d.InputListener createInputListener() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextArea$TextAreaListener r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextArea$TextAreaListener
            r0.<init>(r1)
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    protected void drawCursor(com.badlogic.gdx.scenes.scene2d.utils.Drawable r8, com.badlogic.gdx.graphics.g2d.Batch r9, com.badlogic.gdx.graphics.g2d.BitmapFont r10, float r11, float r12) {
            r7 = this;
            float r0 = r7.getCursorX()
            float r3 = r11 + r0
            float r11 = r7.getCursorY()
            float r4 = r12 + r11
            float r5 = r8.getMinWidth()
            float r6 = r10.getLineHeight()
            r1 = r8
            r2 = r9
            r1.draw(r2, r3, r4, r5, r6)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    protected void drawSelection(com.badlogic.gdx.scenes.scene2d.utils.Drawable r20, com.badlogic.gdx.graphics.g2d.Batch r21, com.badlogic.gdx.graphics.g2d.BitmapFont r22, float r23, float r24) {
            r19 = this;
            r0 = r19
            int r1 = r0.firstLineShowing
            int r1 = r1 * 2
            int r2 = r0.cursor
            int r3 = r0.selectionStart
            int r2 = java.lang.Math.min(r2, r3)
            int r3 = r0.cursor
            int r4 = r0.selectionStart
            int r3 = java.lang.Math.max(r3, r4)
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r4 = r22.getData()
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r5 = r0.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r5 = r5.font
            float r5 = r5.getLineHeight()
            r6 = 0
            r7 = 0
        L24:
            int r8 = r1 + 1
            com.badlogic.gdx.utils.IntArray r9 = r0.linesBreak
            int r10 = r9.size
            if (r8 >= r10) goto Lc4
            int r10 = r0.firstLineShowing
            int r11 = r0.linesShowing
            int r10 = r10 + r11
            int r10 = r10 * 2
            if (r1 >= r10) goto Lc4
            int r9 = r9.get(r1)
            com.badlogic.gdx.utils.IntArray r10 = r0.linesBreak
            int r8 = r10.get(r8)
            if (r2 >= r9) goto L47
            if (r2 >= r8) goto L47
            if (r3 >= r9) goto L47
            if (r3 < r8) goto Lbb
        L47:
            if (r2 <= r9) goto L4f
            if (r2 <= r8) goto L4f
            if (r3 <= r9) goto L4f
            if (r3 > r8) goto Lbb
        L4f:
            int r10 = java.lang.Math.max(r9, r2)
            int r8 = java.lang.Math.min(r8, r3)
            java.lang.CharSequence r11 = r0.displayText
            char r11 = r11.charAt(r9)
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r11 = r4.getGlyph(r11)
            if (r11 == 0) goto L8a
            if (r10 != r9) goto L79
            boolean r12 = r11.fixedWidth
            if (r12 == 0) goto L6b
            r11 = 0
            goto L76
        L6b:
            int r11 = r11.xoffset
            int r11 = -r11
            float r11 = (float) r11
            float r12 = r4.scaleX
            float r11 = r11 * r12
            float r12 = r4.padLeft
            float r11 = r11 - r12
        L76:
            r12 = r11
            r11 = 0
            goto L8c
        L79:
            boolean r12 = r11.fixedWidth
            if (r12 == 0) goto L7e
            goto L8a
        L7e:
            int r11 = r11.xoffset
            int r11 = -r11
            float r11 = (float) r11
            float r12 = r4.scaleX
            float r11 = r11 * r12
            float r12 = r4.padLeft
            float r11 = r11 - r12
            goto L8b
        L8a:
            r11 = 0
        L8b:
            r12 = 0
        L8c:
            com.badlogic.gdx.utils.FloatArray r13 = r0.glyphPositions
            float r13 = r13.get(r10)
            com.badlogic.gdx.utils.FloatArray r14 = r0.glyphPositions
            float r9 = r14.get(r9)
            float r13 = r13 - r9
            com.badlogic.gdx.utils.FloatArray r9 = r0.glyphPositions
            float r8 = r9.get(r8)
            com.badlogic.gdx.utils.FloatArray r9 = r0.glyphPositions
            float r9 = r9.get(r10)
            float r8 = r8 - r9
            float r9 = r23 + r13
            float r15 = r9 + r11
            float r9 = r24 - r5
            float r16 = r9 - r7
            float r17 = r8 + r12
            float r18 = r22.getLineHeight()
            r13 = r20
            r14 = r21
            r13.draw(r14, r15, r16, r17, r18)
        Lbb:
            float r8 = r22.getLineHeight()
            float r7 = r7 + r8
            int r1 = r1 + 2
            goto L24
        Lc4:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    protected void drawText(com.badlogic.gdx.graphics.g2d.Batch r16, com.badlogic.gdx.graphics.g2d.BitmapFont r17, float r18, float r19) {
            r15 = this;
            r0 = r15
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r1 = r0.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r1.font
            float r1 = r1.getLineHeight()
            float r2 = r0.textHeight
            float r1 = r1 - r2
            float r1 = -r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r2 = r0.firstLineShowing
            int r2 = r2 * 2
        L14:
            int r3 = r0.firstLineShowing
            int r4 = r0.linesShowing
            int r3 = r3 + r4
            int r3 = r3 * 2
            if (r2 >= r3) goto L44
            com.badlogic.gdx.utils.IntArray r3 = r0.linesBreak
            int r4 = r3.size
            if (r2 >= r4) goto L44
            java.lang.CharSequence r7 = r0.displayText
            float r9 = r19 + r1
            int[] r3 = r3.items
            r10 = r3[r2]
            int r4 = r2 + 1
            r11 = r3[r4]
            r12 = 0
            r13 = 8
            r14 = 0
            r5 = r17
            r6 = r16
            r8 = r18
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            float r3 = r17.getLineHeight()
            float r1 = r1 - r3
            int r2 = r2 + 2
            goto L14
        L44:
            return
    }

    public float getCursorX() {
            r6 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r6.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r0.font
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r0.getData()
            int r1 = r6.cursor
            com.badlogic.gdx.utils.FloatArray r2 = r6.glyphPositions
            int r2 = r2.size
            r3 = 0
            if (r1 >= r2) goto L4e
            int r1 = r6.cursorLine
            int r2 = r1 * 2
            com.badlogic.gdx.utils.IntArray r4 = r6.linesBreak
            int r5 = r4.size
            if (r2 >= r5) goto L4e
            int[] r2 = r4.items
            int r1 = r1 * 2
            r1 = r2[r1]
            java.lang.CharSequence r2 = r6.displayText
            char r2 = r2.charAt(r1)
            com.badlogic.gdx.graphics.g2d.BitmapFont$Glyph r2 = r0.getGlyph(r2)
            if (r2 == 0) goto L3e
            boolean r4 = r2.fixedWidth
            if (r4 == 0) goto L32
            goto L3e
        L32:
            int r2 = r2.xoffset
            int r2 = -r2
            float r2 = (float) r2
            float r3 = r0.scaleX
            float r2 = r2 * r3
            float r3 = r0.padLeft
            float r2 = r2 - r3
            r3 = r2
        L3e:
            com.badlogic.gdx.utils.FloatArray r2 = r6.glyphPositions
            int r4 = r6.cursor
            float r2 = r2.get(r4)
            com.badlogic.gdx.utils.FloatArray r4 = r6.glyphPositions
            float r1 = r4.get(r1)
            float r2 = r2 - r1
            float r3 = r3 + r2
        L4e:
            float r0 = r0.cursorX
            float r3 = r3 + r0
            return r3
    }

    public float getCursorY() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r3.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r0.font
            int r1 = r3.cursorLine
            int r2 = r3.firstLineShowing
            int r1 = r1 - r2
            int r1 = r1 + 1
            int r1 = -r1
            float r1 = (float) r1
            float r0 = r0.getLineHeight()
            float r1 = r1 * r0
            return r1
    }

    public int getLines() {
            r2 = this;
            com.badlogic.gdx.utils.IntArray r0 = r2.linesBreak
            int r0 = r0.size
            int r0 = r0 / 2
            boolean r1 = r2.newLineAtEnd()
            int r0 = r0 + r1
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField, com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r2 = this;
            float r0 = r2.prefRows
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lc
            float r0 = super.getPrefHeight()
            return r0
        Lc:
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r2.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r0.font
            float r0 = r0.getLineHeight()
            float r1 = r2.prefRows
            float r0 = r0 * r1
            int r0 = com.badlogic.gdx.math.MathUtils.ceil(r0)
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r1 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.background
            if (r1 == 0) goto L3d
            float r1 = r1.getBottomHeight()
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r1 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.background
            float r1 = r1.getTopHeight()
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r1 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.background
            float r1 = r1.getMinHeight()
            float r0 = java.lang.Math.max(r0, r1)
        L3d:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    protected float getTextY(com.badlogic.gdx.graphics.g2d.BitmapFont r2, com.badlogic.gdx.scenes.scene2d.utils.Drawable r3) {
            r1 = this;
            float r0 = r1.getHeight()
            if (r3 == 0) goto Lb
            float r3 = r3.getTopHeight()
            float r0 = r0 - r3
        Lb:
            boolean r2 = r2.usesIntegerPositions()
            if (r2 == 0) goto L13
            int r2 = (int) r0
            float r0 = (float) r2
        L13:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    protected void initialize() {
            r2 = this;
            super.initialize()
            r0 = 1
            r2.writeEnters = r0
            com.badlogic.gdx.utils.IntArray r0 = new com.badlogic.gdx.utils.IntArray
            r0.<init>()
            r2.linesBreak = r0
            r0 = 0
            r2.cursorLine = r0
            r2.firstLineShowing = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.moveOffset = r1
            r2.linesShowing = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    protected int letterUnderCursor(float r7) {
            r6 = this;
            com.badlogic.gdx.utils.IntArray r0 = r6.linesBreak
            int r1 = r0.size
            r2 = 0
            if (r1 <= 0) goto L49
            int r3 = r6.cursorLine
            int r4 = r3 * 2
            if (r4 < r1) goto L14
            java.lang.String r7 = r6.text
            int r7 = r7.length()
            return r7
        L14:
            com.badlogic.gdx.utils.FloatArray r1 = r6.glyphPositions
            float[] r1 = r1.items
            int[] r0 = r0.items
            int r4 = r3 * 2
            r4 = r0[r4]
            r5 = r1[r4]
            float r7 = r7 + r5
            int r3 = r3 * 2
            int r3 = r3 + 1
            r0 = r0[r3]
        L27:
            if (r4 >= r0) goto L33
            r3 = r1[r4]
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L30
            goto L33
        L30:
            int r4 = r4 + 1
            goto L27
        L33:
            if (r4 <= 0) goto L42
            r0 = r1[r4]
            float r0 = r0 - r7
            int r3 = r4 + (-1)
            r1 = r1[r3]
            float r7 = r7 - r1
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 > 0) goto L42
            return r4
        L42:
            int r4 = r4 + (-1)
            int r7 = java.lang.Math.max(r2, r4)
            return r7
        L49:
            return r2
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    protected void moveCursor(boolean r7, boolean r8) {
            r6 = this;
            if (r7 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = -1
        L5:
            int r1 = r6.cursorLine
            int r2 = r1 * 2
            int r2 = r2 + r0
            if (r2 < 0) goto L2c
            int r3 = r2 + 1
            com.badlogic.gdx.utils.IntArray r4 = r6.linesBreak
            int r5 = r4.size
            if (r3 >= r5) goto L2c
            int[] r4 = r4.items
            r2 = r4[r2]
            int r5 = r6.cursor
            if (r2 != r5) goto L2c
            r2 = r4[r3]
            if (r2 != r5) goto L2c
            int r1 = r1 + r0
            r6.cursorLine = r1
            if (r8 == 0) goto L28
            super.moveCursor(r7, r8)
        L28:
            r6.showCursor()
            goto L2f
        L2c:
            super.moveCursor(r7, r8)
        L2f:
            r6.updateCurrentLine()
            return
    }

    public void moveCursorLine(int r5) {
            r4 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r5 >= 0) goto Ld
            r5 = 0
            r4.cursorLine = r5
            r4.cursor = r5
            r4.moveOffset = r0
            goto Lbf
        Ld:
            int r1 = r4.getLines()
            if (r5 < r1) goto L31
            int r1 = r4.getLines()
            int r1 = r1 + (-1)
            java.lang.String r2 = r4.text
            int r2 = r2.length()
            r4.cursor = r2
            int r2 = r4.getLines()
            if (r5 > r2) goto L2b
            int r5 = r4.cursorLine
            if (r1 != r5) goto L2d
        L2b:
            r4.moveOffset = r0
        L2d:
            r4.cursorLine = r1
            goto Lbf
        L31:
            int r0 = r4.cursorLine
            if (r5 == r0) goto Lbf
            float r1 = r4.moveOffset
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L61
            com.badlogic.gdx.utils.IntArray r1 = r4.linesBreak
            int r1 = r1.size
            int r0 = r0 * 2
            if (r1 > r0) goto L45
            goto L5f
        L45:
            com.badlogic.gdx.utils.FloatArray r0 = r4.glyphPositions
            int r1 = r4.cursor
            float r0 = r0.get(r1)
            com.badlogic.gdx.utils.FloatArray r1 = r4.glyphPositions
            com.badlogic.gdx.utils.IntArray r2 = r4.linesBreak
            int r3 = r4.cursorLine
            int r3 = r3 * 2
            int r2 = r2.get(r3)
            float r1 = r1.get(r2)
            float r2 = r0 - r1
        L5f:
            r4.moveOffset = r2
        L61:
            r4.cursorLine = r5
            int r0 = r5 * 2
            com.badlogic.gdx.utils.IntArray r1 = r4.linesBreak
            int r2 = r1.size
            if (r0 < r2) goto L72
            java.lang.String r5 = r4.text
            int r5 = r5.length()
            goto L78
        L72:
            int r5 = r5 * 2
            int r5 = r1.get(r5)
        L78:
            r4.cursor = r5
        L7a:
            int r5 = r4.cursor
            java.lang.String r0 = r4.text
            int r0 = r0.length()
            if (r5 >= r0) goto Lbc
            int r5 = r4.cursor
            com.badlogic.gdx.utils.IntArray r0 = r4.linesBreak
            int r1 = r4.cursorLine
            int r1 = r1 * 2
            int r1 = r1 + 1
            int r0 = r0.get(r1)
            int r0 = r0 + (-1)
            if (r5 > r0) goto Lbc
            com.badlogic.gdx.utils.FloatArray r5 = r4.glyphPositions
            int r0 = r4.cursor
            float r5 = r5.get(r0)
            com.badlogic.gdx.utils.FloatArray r0 = r4.glyphPositions
            com.badlogic.gdx.utils.IntArray r1 = r4.linesBreak
            int r2 = r4.cursorLine
            int r2 = r2 * 2
            int r1 = r1.get(r2)
            float r0 = r0.get(r1)
            float r5 = r5 - r0
            float r0 = r4.moveOffset
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto Lbc
            int r5 = r4.cursor
            int r5 = r5 + 1
            r4.cursor = r5
            goto L7a
        Lbc:
            r4.showCursor()
        Lbf:
            return
    }

    public boolean newLineAtEnd() {
            r3 = this;
            java.lang.String r0 = r3.text
            int r0 = r0.length()
            r1 = 1
            if (r0 == 0) goto L28
            java.lang.String r0 = r3.text
            int r2 = r0.length()
            int r2 = r2 - r1
            char r0 = r0.charAt(r2)
            r2 = 10
            if (r0 == r2) goto L29
            java.lang.String r0 = r3.text
            int r2 = r0.length()
            int r2 = r2 - r1
            char r0 = r0.charAt(r2)
            r2 = 13
            if (r0 != r2) goto L28
            goto L29
        L28:
            r1 = 0
        L29:
            return r1
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public void setSelection(int r1, int r2) {
            r0 = this;
            super.setSelection(r1, r2)
            r0.updateCurrentLine()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle r2) {
            r1 = this;
            if (r2 == 0) goto L1e
            r1.style = r2
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r2.font
            float r0 = r0.getCapHeight()
            com.badlogic.gdx.graphics.g2d.BitmapFont r2 = r2.font
            float r2 = r2.getDescent()
            float r0 = r0 - r2
            r1.textHeight = r0
            java.lang.String r2 = r1.text
            if (r2 == 0) goto L1a
            r1.updateDisplayText()
        L1a:
            r1.invalidateHierarchy()
            return
        L1e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "style cannot be null."
            r2.<init>(r0)
            throw r2
    }

    void showCursor() {
            r0 = this;
            r0.updateCurrentLine()
            r0.updateFirstLineShowing()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    protected void sizeChanged() {
            r4 = this;
            r0 = 0
            r4.lastText = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r4.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r0.font
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.background
            float r2 = r4.getHeight()
            if (r0 != 0) goto L11
            r0 = 0
            goto L1a
        L11:
            float r3 = r0.getBottomHeight()
            float r0 = r0.getTopHeight()
            float r0 = r0 + r3
        L1a:
            float r2 = r2 - r0
            float r0 = r1.getLineHeight()
            float r2 = r2 / r0
            double r0 = (double) r2
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            r4.linesShowing = r0
            return
    }

    void updateCurrentLine() {
            r6 = this;
            int r0 = r6.cursor
            int r0 = r6.calculateCurrentLineIndex(r0)
            int r1 = r0 / 2
            int r2 = r0 % 2
            if (r2 == 0) goto L22
            int r2 = r0 + 1
            com.badlogic.gdx.utils.IntArray r3 = r6.linesBreak
            int r4 = r3.size
            if (r2 >= r4) goto L22
            int r4 = r6.cursor
            int[] r3 = r3.items
            r5 = r3[r0]
            if (r4 != r5) goto L22
            r2 = r3[r2]
            r0 = r3[r0]
            if (r2 == r0) goto L54
        L22:
            com.badlogic.gdx.utils.IntArray r0 = r6.linesBreak
            int r0 = r0.size
            int r0 = r0 / 2
            if (r1 < r0) goto L52
            java.lang.String r0 = r6.text
            int r0 = r0.length()
            if (r0 == 0) goto L52
            java.lang.String r0 = r6.text
            int r2 = r0.length()
            int r2 = r2 + (-1)
            char r0 = r0.charAt(r2)
            r2 = 10
            if (r0 == r2) goto L52
            java.lang.String r0 = r6.text
            int r2 = r0.length()
            int r2 = r2 + (-1)
            char r0 = r0.charAt(r2)
            r2 = 13
            if (r0 != r2) goto L54
        L52:
            r6.cursorLine = r1
        L54:
            r6.updateFirstLineShowing()
            return
    }

    void updateFirstLineShowing() {
            r5 = this;
            int r0 = r5.cursorLine
            int r1 = r5.firstLineShowing
            if (r0 == r1) goto L1c
            r2 = 1
            if (r0 < r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = -1
        Lc:
            int r1 = r5.firstLineShowing
            int r3 = r5.cursorLine
            if (r1 > r3) goto L18
            int r4 = r5.linesShowing
            int r4 = r4 + r1
            int r4 = r4 - r2
            if (r4 >= r3) goto L1c
        L18:
            int r1 = r1 + r0
            r5.firstLineShowing = r1
            goto Lc
        L1c:
            return
    }
}
