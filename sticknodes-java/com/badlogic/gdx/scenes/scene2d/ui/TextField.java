package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class TextField extends com.badlogic.gdx.scenes.scene2d.ui.Widget {
    public static float keyRepeatInitialTime;
    public static float keyRepeatTime;
    private static final com.badlogic.gdx.math.Vector2 tmp1 = null;
    private static final com.badlogic.gdx.math.Vector2 tmp2 = null;
    private static final com.badlogic.gdx.math.Vector2 tmp3 = null;
    final com.badlogic.gdx.utils.Timer.Task blinkTask;
    float blinkTime;
    com.badlogic.gdx.utils.Clipboard clipboard;
    protected int cursor;
    boolean cursorOn;
    boolean disabled;
    protected java.lang.CharSequence displayText;
    com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter filter;
    boolean focusTraversal;
    boolean focused;
    protected float fontOffset;
    protected final com.badlogic.gdx.utils.FloatArray glyphPositions;
    protected boolean hasSelection;
    com.badlogic.gdx.scenes.scene2d.InputListener inputListener;
    final com.badlogic.gdx.scenes.scene2d.ui.TextField.KeyRepeatTask keyRepeatTask;
    com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard keyboard;
    long lastChangeTime;
    protected final com.badlogic.gdx.graphics.g2d.GlyphLayout layout;
    com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener listener;
    private int maxLength;
    private java.lang.String messageText;
    boolean onlyFontChars;
    private java.lang.StringBuilder passwordBuffer;
    private char passwordCharacter;
    boolean passwordMode;
    boolean programmaticChangeEvents;
    float renderOffset;
    protected int selectionStart;
    private float selectionWidth;
    private float selectionX;
    com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle style;
    protected java.lang.String text;
    private int textHAlign;
    protected float textHeight;
    protected float textOffset;
    java.lang.String undoText;
    protected int visibleTextEnd;
    protected int visibleTextStart;
    protected boolean writeEnters;


    public static class DefaultOnscreenKeyboard implements com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard {
        public DefaultOnscreenKeyboard() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard
        public void show(boolean r2) {
                r1 = this;
                com.badlogic.gdx.Input r0 = com.badlogic.gdx.Gdx.input
                r0.setOnscreenKeyboardVisible(r2)
                return
        }
    }

    class KeyRepeatTask extends com.badlogic.gdx.utils.Timer.Task {
        int keycode;
        final /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField this$0;

        KeyRepeatTask(com.badlogic.gdx.scenes.scene2d.ui.TextField r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r3.this$0
                com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
                if (r0 != 0) goto Lc
                r3.cancel()
                return
            Lc:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r3.this$0
                com.badlogic.gdx.scenes.scene2d.InputListener r0 = r0.inputListener
                r1 = 0
                int r2 = r3.keycode
                r0.keyDown(r1, r2)
                return
        }
    }

    public interface OnscreenKeyboard {
        void show(boolean r1);
    }

    public class TextFieldClickListener extends com.badlogic.gdx.scenes.scene2d.utils.ClickListener {
        final /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField this$0;

        public TextFieldClickListener(com.badlogic.gdx.scenes.scene2d.ui.TextField r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        protected boolean checkFocusTraversal(char r2) {
                r1 = this;
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r1.this$0
                boolean r0 = r0.focusTraversal
                if (r0 == 0) goto L1c
                r0 = 9
                if (r2 == r0) goto L1a
                r0 = 13
                if (r2 == r0) goto L12
                r0 = 10
                if (r2 != r0) goto L1c
            L12:
                boolean r2 = com.badlogic.gdx.scenes.scene2d.utils.UIUtils.isAndroid
                if (r2 != 0) goto L1a
                boolean r2 = com.badlogic.gdx.scenes.scene2d.utils.UIUtils.isIos
                if (r2 == 0) goto L1c
            L1a:
                r2 = 1
                goto L1d
            L1c:
                r2 = 0
            L1d:
                return r2
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener
        public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent r3, float r4, float r5) {
                r2 = this;
                int r3 = r2.getTapCount()
                int r3 = r3 % 4
                if (r3 != 0) goto Ld
                com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r2.this$0
                r5.clearSelection()
            Ld:
                r5 = 2
                if (r3 != r5) goto L21
                com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r2.this$0
                int[] r4 = r5.wordUnderCursor(r4)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r2.this$0
                r0 = 0
                r0 = r4[r0]
                r1 = 1
                r4 = r4[r1]
                r5.setSelection(r0, r4)
            L21:
                r4 = 3
                if (r3 != r4) goto L29
                com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r2.this$0
                r3.selectAll()
            L29:
                return
        }

        protected void goEnd(boolean r2) {
                r1 = this;
                com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1.this$0
                java.lang.String r0 = r2.text
                int r0 = r0.length()
                r2.cursor = r0
                return
        }

        protected void goHome(boolean r2) {
                r1 = this;
                com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1.this$0
                r0 = 0
                r2.cursor = r0
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.InputListener
        public boolean keyDown(com.badlogic.gdx.scenes.scene2d.InputEvent r11, int r12) {
                r10 = this;
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                boolean r0 = r11.disabled
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                boolean r0 = r11.focused
                r11.cursorOn = r0
                com.badlogic.gdx.utils.Timer$Task r11 = r11.blinkTask
                r11.cancel()
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                boolean r0 = r11.focused
                if (r0 == 0) goto L1e
                com.badlogic.gdx.utils.Timer$Task r0 = r11.blinkTask
                float r11 = r11.blinkTime
                com.badlogic.gdx.utils.Timer.schedule(r0, r11, r11)
            L1e:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                boolean r11 = r11.hasKeyboardFocus()
                if (r11 != 0) goto L27
                return r1
            L27:
                boolean r11 = com.badlogic.gdx.scenes.scene2d.utils.UIUtils.ctrl()
                r0 = 1
                if (r11 == 0) goto L36
                com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r10.this$0
                boolean r2 = r2.passwordMode
                if (r2 != 0) goto L36
                r2 = 1
                goto L37
            L36:
                r2 = 0
            L37:
                r3 = 124(0x7c, float:1.74E-43)
                if (r11 == 0) goto L84
                r11 = 29
                if (r12 == r11) goto L7e
                r11 = 31
                if (r12 == r11) goto L78
                r11 = 50
                if (r12 == r11) goto L6b
                r11 = 52
                if (r12 == r11) goto L65
                r11 = 54
                if (r12 == r11) goto L54
                if (r12 == r3) goto L78
                r11 = 0
                r4 = 0
                goto L86
            L54:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                java.lang.String r12 = r11.text
                java.lang.String r1 = r11.undoText
                r11.setText(r1)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                r11.undoText = r12
                r11.updateDisplayText()
                return r0
            L65:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                r11.cut(r0)
                return r0
            L6b:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                com.badlogic.gdx.utils.Clipboard r4 = r11.clipboard
                java.lang.String r4 = r4.getContents()
                r11.paste(r4, r0)
                r11 = 1
                goto L85
            L78:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                r11.copy()
                return r0
            L7e:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                r11.selectAll()
                return r0
            L84:
                r11 = 0
            L85:
                r4 = 1
            L86:
                boolean r5 = com.badlogic.gdx.scenes.scene2d.utils.UIUtils.shift()
                r6 = 22
                r7 = 21
                r8 = 123(0x7b, float:1.72E-43)
                r9 = 3
                if (r5 == 0) goto Ld3
                r5 = 112(0x70, float:1.57E-43)
                if (r12 == r5) goto La6
                if (r12 == r3) goto L9a
                goto Lab
            L9a:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r10.this$0
                com.badlogic.gdx.utils.Clipboard r5 = r3.clipboard
                java.lang.String r5 = r5.getContents()
                r3.paste(r5, r0)
                goto Lab
            La6:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r10.this$0
                r3.cut(r0)
            Lab:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r10.this$0
                int r5 = r3.cursor
                if (r12 == r9) goto Lc5
                if (r12 == r8) goto Lc1
                if (r12 == r7) goto Lbc
                if (r12 == r6) goto Lb8
                goto Ldb
            Lb8:
                r3.moveCursor(r0, r2)
                goto Lbf
            Lbc:
                r3.moveCursor(r1, r2)
            Lbf:
                r11 = 1
                goto Lc8
            Lc1:
                r10.goEnd(r2)
                goto Lc8
            Lc5:
                r10.goHome(r2)
            Lc8:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r10.this$0
                boolean r3 = r2.hasSelection
                if (r3 != 0) goto L104
                r2.selectionStart = r5
                r2.hasSelection = r0
                goto L104
            Ld3:
                if (r12 == r9) goto Lfc
                if (r12 == r8) goto Lf3
                if (r12 == r7) goto Le8
                if (r12 == r6) goto Ldd
            Ldb:
                r0 = r11
                goto L106
            Ldd:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                r11.moveCursor(r0, r2)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                r11.clearSelection()
                goto L105
            Le8:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                r11.moveCursor(r1, r2)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                r11.clearSelection()
                goto L105
            Lf3:
                r10.goEnd(r2)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r10.this$0
                r2.clearSelection()
                goto L104
            Lfc:
                r10.goHome(r2)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r10.this$0
                r2.clearSelection()
            L104:
                r0 = r11
            L105:
                r4 = 1
            L106:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.this$0
                int r2 = r11.cursor
                java.lang.String r3 = r11.text
                int r3 = r3.length()
                int r1 = com.badlogic.gdx.math.MathUtils.clamp(r2, r1, r3)
                r11.cursor = r1
                if (r0 == 0) goto L11b
                r10.scheduleKeyRepeatTask(r12)
            L11b:
                return r4
        }

        @Override // com.badlogic.gdx.scenes.scene2d.InputListener
        public boolean keyTyped(com.badlogic.gdx.scenes.scene2d.InputEvent r14, char r15) {
                r13 = this;
                com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13.this$0
                boolean r0 = r14.disabled
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                r0 = 13
                if (r15 == r0) goto L14
                switch(r15) {
                    case 8: goto L14;
                    case 9: goto L14;
                    case 10: goto L14;
                    default: goto Lf;
                }
            Lf:
                r2 = 32
                if (r15 >= r2) goto L14
                return r1
            L14:
                boolean r14 = r14.hasKeyboardFocus()
                if (r14 != 0) goto L1b
                return r1
            L1b:
                boolean r14 = com.badlogic.gdx.scenes.scene2d.utils.UIUtils.isMac
                r2 = 1
                if (r14 == 0) goto L2b
                com.badlogic.gdx.Input r14 = com.badlogic.gdx.Gdx.input
                r3 = 63
                boolean r14 = r14.isKeyPressed(r3)
                if (r14 == 0) goto L2b
                return r2
            L2b:
                boolean r14 = r13.checkFocusTraversal(r15)
                if (r14 == 0) goto L3c
                com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13.this$0
                boolean r0 = com.badlogic.gdx.scenes.scene2d.utils.UIUtils.shift()
                r14.next(r0)
                goto L184
            L3c:
                if (r15 == r0) goto L45
                r14 = 10
                if (r15 != r14) goto L43
                goto L45
            L43:
                r14 = 0
                goto L46
            L45:
                r14 = 1
            L46:
                r0 = 127(0x7f, float:1.78E-43)
                if (r15 != r0) goto L4c
                r0 = 1
                goto L4d
            L4c:
                r0 = 0
            L4d:
                r3 = 8
                if (r15 != r3) goto L53
                r3 = 1
                goto L54
            L53:
                r3 = 0
            L54:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r13.this$0
                if (r14 == 0) goto L5b
                boolean r4 = r4.writeEnters
                goto L71
            L5b:
                boolean r5 = r4.onlyFontChars
                if (r5 == 0) goto L70
                com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r4 = r4.style
                com.badlogic.gdx.graphics.g2d.BitmapFont r4 = r4.font
                com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r4 = r4.getData()
                boolean r4 = r4.hasGlyph(r15)
                if (r4 == 0) goto L6e
                goto L70
            L6e:
                r4 = 0
                goto L71
            L70:
                r4 = 1
            L71:
                if (r3 != 0) goto L78
                if (r0 == 0) goto L76
                goto L78
            L76:
                r5 = 0
                goto L79
            L78:
                r5 = 1
            L79:
                if (r4 != 0) goto L7d
                if (r5 == 0) goto L184
            L7d:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r13.this$0
                java.lang.String r7 = r6.text
                int r8 = r6.cursor
                if (r5 == 0) goto Lf9
                boolean r9 = r6.hasSelection
                if (r9 == 0) goto L90
                int r0 = r6.delete(r1)
                r6.cursor = r0
                goto Lf9
            L90:
                if (r3 == 0) goto Lc3
                if (r8 <= 0) goto Lc3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.badlogic.gdx.scenes.scene2d.ui.TextField r9 = r13.this$0
                java.lang.String r10 = r9.text
                int r9 = r9.cursor
                int r9 = r9 - r2
                java.lang.String r9 = r10.substring(r1, r9)
                r3.append(r9)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r9 = r13.this$0
                java.lang.String r10 = r9.text
                int r11 = r9.cursor
                int r12 = r11 + (-1)
                r9.cursor = r12
                java.lang.String r9 = r10.substring(r11)
                r3.append(r9)
                java.lang.String r3 = r3.toString()
                r6.text = r3
                com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r13.this$0
                r6 = 0
                r3.renderOffset = r6
            Lc3:
                if (r0 == 0) goto Lf9
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r13.this$0
                int r3 = r0.cursor
                java.lang.String r0 = r0.text
                int r0 = r0.length()
                if (r3 >= r0) goto Lf9
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r13.this$0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r13.this$0
                java.lang.String r9 = r6.text
                int r6 = r6.cursor
                java.lang.String r6 = r9.substring(r1, r6)
                r3.append(r6)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r13.this$0
                java.lang.String r9 = r6.text
                int r6 = r6.cursor
                int r6 = r6 + r2
                java.lang.String r6 = r9.substring(r6)
                r3.append(r6)
                java.lang.String r3 = r3.toString()
                r0.text = r3
            Lf9:
                if (r4 == 0) goto L152
                if (r5 != 0) goto L152
                if (r14 != 0) goto L10c
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r13.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter r3 = r0.filter
                if (r3 == 0) goto L10c
                boolean r0 = r3.acceptChar(r0, r15)
                if (r0 != 0) goto L10c
                return r2
            L10c:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r13.this$0
                java.lang.String r3 = r0.text
                int r3 = r3.length()
                com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r13.this$0
                boolean r5 = r4.hasSelection
                if (r5 == 0) goto L124
                int r5 = r4.cursor
                int r4 = r4.selectionStart
                int r5 = r5 - r4
                int r4 = java.lang.Math.abs(r5)
                goto L125
            L124:
                r4 = 0
            L125:
                int r3 = r3 - r4
                boolean r0 = r0.withinMaxLength(r3)
                if (r0 != 0) goto L12d
                return r2
            L12d:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r13.this$0
                boolean r3 = r0.hasSelection
                if (r3 == 0) goto L139
                int r1 = r0.delete(r1)
                r0.cursor = r1
            L139:
                if (r14 == 0) goto L13e
                java.lang.String r14 = "\n"
                goto L142
            L13e:
                java.lang.String r14 = java.lang.String.valueOf(r15)
            L142:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r13.this$0
                int r1 = r0.cursor
                int r3 = r1 + 1
                r0.cursor = r3
                java.lang.String r3 = r0.text
                java.lang.String r14 = r0.insert(r1, r14, r3)
                r0.text = r14
            L152:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13.this$0
                java.lang.String r0 = r14.undoText
                java.lang.String r0 = r14.text
                boolean r14 = r14.changeText(r7, r0)
                if (r14 == 0) goto L176
                long r0 = java.lang.System.currentTimeMillis()
                r3 = 750(0x2ee, double:3.705E-321)
                long r3 = r0 - r3
                com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13.this$0
                long r5 = r14.lastChangeTime
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 <= 0) goto L170
                r14.undoText = r7
            L170:
                r14.lastChangeTime = r0
                r14.updateDisplayText()
                goto L184
            L176:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13.this$0
                java.lang.String r14 = r14.text
                boolean r14 = r14.equals(r7)
                if (r14 != 0) goto L184
                com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13.this$0
                r14.cursor = r8
            L184:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldListener r0 = r14.listener
                if (r0 == 0) goto L18d
                r0.keyTyped(r14, r15)
            L18d:
                return r2
        }

        @Override // com.badlogic.gdx.scenes.scene2d.InputListener
        public boolean keyUp(com.badlogic.gdx.scenes.scene2d.InputEvent r1, int r2) {
                r0 = this;
                com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r0.this$0
                boolean r2 = r1.disabled
                if (r2 == 0) goto L8
                r1 = 0
                return r1
            L8:
                com.badlogic.gdx.scenes.scene2d.ui.TextField$KeyRepeatTask r1 = r1.keyRepeatTask
                r1.cancel()
                r1 = 1
                return r1
        }

        protected void scheduleKeyRepeatTask(int r3) {
                r2 = this;
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r2.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextField$KeyRepeatTask r0 = r0.keyRepeatTask
                boolean r0 = r0.isScheduled()
                if (r0 == 0) goto L12
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r2.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextField$KeyRepeatTask r0 = r0.keyRepeatTask
                int r0 = r0.keycode
                if (r0 == r3) goto L26
            L12:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r2.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextField$KeyRepeatTask r0 = r0.keyRepeatTask
                r0.keycode = r3
                r0.cancel()
                com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r2.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextField$KeyRepeatTask r3 = r3.keyRepeatTask
                float r0 = com.badlogic.gdx.scenes.scene2d.ui.TextField.keyRepeatInitialTime
                float r1 = com.badlogic.gdx.scenes.scene2d.ui.TextField.keyRepeatTime
                com.badlogic.gdx.utils.Timer.schedule(r3, r0, r1)
            L26:
                return
        }

        protected void setCursorPosition(float r1, float r2) {
                r0 = this;
                com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0.this$0
                int r1 = r2.letterUnderCursor(r1)
                r2.cursor = r1
                com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r0.this$0
                boolean r2 = r1.focused
                r1.cursorOn = r2
                com.badlogic.gdx.utils.Timer$Task r1 = r1.blinkTask
                r1.cancel()
                com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r0.this$0
                boolean r2 = r1.focused
                if (r2 == 0) goto L20
                com.badlogic.gdx.utils.Timer$Task r2 = r1.blinkTask
                float r1 = r1.blinkTime
                com.badlogic.gdx.utils.Timer.schedule(r2, r1, r1)
            L20:
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public boolean touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent r2, float r3, float r4, int r5, int r6) {
                r1 = this;
                boolean r2 = super.touchDown(r2, r3, r4, r5, r6)
                r0 = 0
                if (r2 != 0) goto L8
                return r0
            L8:
                if (r5 != 0) goto Ld
                if (r6 == 0) goto Ld
                return r0
            Ld:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1.this$0
                boolean r2 = r2.disabled
                r5 = 1
                if (r2 == 0) goto L15
                return r5
            L15:
                r1.setCursorPosition(r3, r4)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1.this$0
                int r3 = r2.cursor
                r2.selectionStart = r3
                com.badlogic.gdx.scenes.scene2d.Stage r2 = r2.getStage()
                if (r2 == 0) goto L29
                com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r1.this$0
                r2.setKeyboardFocus(r3)
            L29:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextField$OnscreenKeyboard r2 = r2.keyboard
                r2.show(r5)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1.this$0
                r2.hasSelection = r5
                return r5
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public void touchDragged(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4) {
                r0 = this;
                super.touchDragged(r1, r2, r3, r4)
                r0.setCursorPosition(r2, r3)
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent r4, float r5, float r6, int r7, int r8) {
                r3 = this;
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r3.this$0
                int r1 = r0.selectionStart
                int r2 = r0.cursor
                if (r1 != r2) goto Lb
                r1 = 0
                r0.hasSelection = r1
            Lb:
                super.touchUp(r4, r5, r6, r7, r8)
                return
        }
    }

    public interface TextFieldFilter {

        public static class DigitsOnlyFilter implements com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter {
            public DigitsOnlyFilter() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter
            public boolean acceptChar(com.badlogic.gdx.scenes.scene2d.ui.TextField r1, char r2) {
                    r0 = this;
                    boolean r1 = java.lang.Character.isDigit(r2)
                    return r1
            }
        }

        boolean acceptChar(com.badlogic.gdx.scenes.scene2d.ui.TextField r1, char r2);
    }

    public interface TextFieldListener {
        void keyTyped(com.badlogic.gdx.scenes.scene2d.ui.TextField r1, char r2);
    }

    public static class TextFieldStyle {
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable background;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable cursor;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable disabledBackground;
        public com.badlogic.gdx.graphics.Color disabledFontColor;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable focusedBackground;
        public com.badlogic.gdx.graphics.Color focusedFontColor;
        public com.badlogic.gdx.graphics.g2d.BitmapFont font;
        public com.badlogic.gdx.graphics.Color fontColor;
        public com.badlogic.gdx.graphics.g2d.BitmapFont messageFont;
        public com.badlogic.gdx.graphics.Color messageFontColor;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable selection;

        public TextFieldStyle() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.TextField.tmp1 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.TextField.tmp2 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.TextField.tmp3 = r0
            r0 = 1053609165(0x3ecccccd, float:0.4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField.keyRepeatInitialTime = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField.keyRepeatTime = r0
            return
    }

    public TextField(java.lang.String r2, com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle r3) {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.graphics.g2d.GlyphLayout r0 = new com.badlogic.gdx.graphics.g2d.GlyphLayout
            r0.<init>()
            r1.layout = r0
            com.badlogic.gdx.utils.FloatArray r0 = new com.badlogic.gdx.utils.FloatArray
            r0.<init>()
            r1.glyphPositions = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextField$DefaultOnscreenKeyboard r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$DefaultOnscreenKeyboard
            r0.<init>()
            r1.keyboard = r0
            r0 = 1
            r1.focusTraversal = r0
            r1.onlyFontChars = r0
            r0 = 8
            r1.textHAlign = r0
            java.lang.String r0 = ""
            r1.undoText = r0
            r0 = 149(0x95, float:2.09E-43)
            r1.passwordCharacter = r0
            r0 = 1050924810(0x3ea3d70a, float:0.32)
            r1.blinkTime = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextField$1 r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$1
            r0.<init>(r1)
            r1.blinkTask = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextField$KeyRepeatTask r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$KeyRepeatTask
            r0.<init>(r1)
            r1.keyRepeatTask = r0
            r1.setStyle(r3)
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.utils.Clipboard r3 = r3.getClipboard()
            r1.clipboard = r3
            r1.initialize()
            r1.setText(r2)
            float r2 = r1.getPrefWidth()
            float r3 = r1.getPrefHeight()
            r1.setSize(r2, r3)
            return
    }

    private com.badlogic.gdx.scenes.scene2d.ui.TextField findNextTextField(com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Actor> r11, com.badlogic.gdx.scenes.scene2d.ui.TextField r12, com.badlogic.gdx.math.Vector2 r13, com.badlogic.gdx.math.Vector2 r14, boolean r15) {
            r10 = this;
            int r0 = r11.size
            r1 = 0
            r4 = r12
            r12 = 0
        L5:
            if (r12 >= r0) goto Lbf
            java.lang.Object r2 = r11.get(r12)
            com.badlogic.gdx.scenes.scene2d.Actor r2 = (com.badlogic.gdx.scenes.scene2d.Actor) r2
            boolean r3 = r2 instanceof com.badlogic.gdx.scenes.scene2d.ui.TextField
            if (r3 == 0) goto La8
            if (r2 != r10) goto L15
            goto Lbb
        L15:
            r3 = r2
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = (com.badlogic.gdx.scenes.scene2d.ui.TextField) r3
            boolean r5 = r3.isDisabled()
            if (r5 != 0) goto Lbb
            boolean r5 = r3.focusTraversal
            if (r5 == 0) goto Lbb
            boolean r3 = r3.ascendantsVisible()
            if (r3 != 0) goto L2a
            goto Lbb
        L2a:
            com.badlogic.gdx.scenes.scene2d.Group r3 = r2.getParent()
            com.badlogic.gdx.math.Vector2 r5 = com.badlogic.gdx.scenes.scene2d.ui.TextField.tmp3
            float r6 = r2.getX()
            float r7 = r2.getY()
            com.badlogic.gdx.math.Vector2 r5 = r5.set(r6, r7)
            com.badlogic.gdx.math.Vector2 r3 = r3.localToStageCoordinates(r5)
            float r5 = r3.y
            float r6 = r14.y
            r7 = 1
            int r8 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r8 >= 0) goto L4f
            r8 = 1
            goto L50
        L4f:
            r8 = 0
        L50:
            r8 = r8 ^ r15
            if (r8 == 0) goto L55
            r8 = 1
            goto L56
        L55:
            r8 = 0
        L56:
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 != 0) goto L6a
            float r6 = r3.x
            float r9 = r14.x
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L64
            r6 = 1
            goto L65
        L64:
            r6 = 0
        L65:
            r6 = r6 ^ r15
            if (r6 == 0) goto L6a
            r6 = 1
            goto L6b
        L6a:
            r6 = 0
        L6b:
            if (r8 != 0) goto L70
            if (r6 != 0) goto L70
            goto Lbb
        L70:
            if (r4 == 0) goto L85
            float r6 = r13.y
            int r8 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r8 == 0) goto L83
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L7e
            r6 = 1
            goto L7f
        L7e:
            r6 = 0
        L7f:
            r6 = r6 ^ r15
            if (r6 == 0) goto L83
            goto L85
        L83:
            r6 = 0
            goto L86
        L85:
            r6 = 1
        L86:
            if (r6 != 0) goto L9f
            float r6 = r13.y
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L9d
            float r5 = r3.x
            float r6 = r13.x
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L98
            r5 = 1
            goto L99
        L98:
            r5 = 0
        L99:
            r5 = r5 ^ r15
            if (r5 == 0) goto L9d
            goto L9e
        L9d:
            r7 = 0
        L9e:
            r6 = r7
        L9f:
            if (r6 == 0) goto Lbb
            r4 = r2
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = (com.badlogic.gdx.scenes.scene2d.ui.TextField) r4
            r13.set(r3)
            goto Lbb
        La8:
            boolean r3 = r2 instanceof com.badlogic.gdx.scenes.scene2d.Group
            if (r3 == 0) goto Lbb
            com.badlogic.gdx.scenes.scene2d.Group r2 = (com.badlogic.gdx.scenes.scene2d.Group) r2
            com.badlogic.gdx.utils.SnapshotArray r3 = r2.getChildren()
            r2 = r10
            r5 = r13
            r6 = r14
            r7 = r15
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r2.findNextTextField(r3, r4, r5, r6, r7)
            r4 = r2
        Lbb:
            int r12 = r12 + 1
            goto L5
        Lbf:
            return r4
    }

    protected void calculateOffsets() {
            r10 = this;
            float r0 = r10.getWidth()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r10.getBackgroundDrawable()
            if (r1 == 0) goto L14
            float r2 = r1.getLeftWidth()
            float r1 = r1.getRightWidth()
            float r2 = r2 + r1
            float r0 = r0 - r2
        L14:
            com.badlogic.gdx.utils.FloatArray r1 = r10.glyphPositions
            int r2 = r1.size
            float[] r1 = r1.items
            int r3 = r10.cursor
            int r4 = r2 + (-1)
            r5 = 0
            int r3 = com.badlogic.gdx.math.MathUtils.clamp(r3, r5, r4)
            r10.cursor = r3
            int r3 = r3 + (-1)
            int r3 = java.lang.Math.max(r5, r3)
            r3 = r1[r3]
            float r6 = r10.renderOffset
            float r3 = r3 + r6
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 > 0) goto L39
            float r6 = r6 - r3
            r10.renderOffset = r6
            goto L4e
        L39:
            int r3 = r10.cursor
            int r3 = r3 + 1
            int r3 = java.lang.Math.min(r4, r3)
            r3 = r1[r3]
            float r3 = r3 - r0
            float r6 = r10.renderOffset
            float r6 = -r6
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 >= 0) goto L4e
            float r3 = -r3
            r10.renderOffset = r3
        L4e:
            r3 = r1[r4]
            int r4 = r2 + (-2)
            r6 = 0
        L53:
            if (r4 < 0) goto L62
            r8 = r1[r4]
            float r9 = r3 - r8
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 <= 0) goto L5e
            goto L62
        L5e:
            int r4 = r4 + (-1)
            r6 = r8
            goto L53
        L62:
            float r3 = r10.renderOffset
            float r3 = -r3
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L6c
            float r3 = -r6
            r10.renderOffset = r3
        L6c:
            r10.visibleTextStart = r5
            r3 = 0
        L6f:
            if (r3 >= r2) goto L82
            r4 = r1[r3]
            float r6 = r10.renderOffset
            float r6 = -r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L7f
            r10.visibleTextStart = r3
            r7 = r1[r3]
            goto L82
        L7f:
            int r3 = r3 + 1
            goto L6f
        L82:
            int r3 = r10.visibleTextStart
            int r3 = r3 + 1
            float r4 = r10.renderOffset
            float r4 = r0 - r4
            java.lang.CharSequence r6 = r10.displayText
            int r6 = r6.length()
            int r2 = java.lang.Math.min(r6, r2)
        L94:
            if (r3 > r2) goto La0
            r6 = r1[r3]
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L9d
            goto La0
        L9d:
            int r3 = r3 + 1
            goto L94
        La0:
            int r3 = r3 + (-1)
            int r2 = java.lang.Math.max(r5, r3)
            r10.visibleTextEnd = r2
            int r3 = r10.textHAlign
            r4 = r3 & 8
            if (r4 != 0) goto Lc8
            r2 = r1[r2]
            float r2 = r0 - r2
            float r4 = r10.fontOffset
            float r2 = r2 - r4
            float r2 = r2 + r7
            r10.textOffset = r2
            r3 = r3 & 1
            if (r3 == 0) goto Lcd
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            r10.textOffset = r2
            goto Lcd
        Lc8:
            float r2 = r10.renderOffset
            float r7 = r7 + r2
            r10.textOffset = r7
        Lcd:
            boolean r2 = r10.hasSelection
            if (r2 == 0) goto L10d
            int r2 = r10.cursor
            int r3 = r10.selectionStart
            int r2 = java.lang.Math.min(r2, r3)
            int r3 = r10.cursor
            int r4 = r10.selectionStart
            int r3 = java.lang.Math.max(r3, r4)
            r2 = r1[r2]
            int r4 = r10.visibleTextStart
            r4 = r1[r4]
            float r2 = r2 - r4
            float r4 = r10.textOffset
            float r4 = -r4
            float r2 = java.lang.Math.max(r2, r4)
            r3 = r1[r3]
            int r4 = r10.visibleTextStart
            r1 = r1[r4]
            float r3 = r3 - r1
            float r1 = r10.textOffset
            float r0 = r0 - r1
            float r0 = java.lang.Math.min(r3, r0)
            r10.selectionX = r2
            float r0 = r0 - r2
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r1 = r10.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r1.font
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r1 = r1.getData()
            float r1 = r1.cursorX
            float r0 = r0 - r1
            r10.selectionWidth = r0
        L10d:
            return
    }

    boolean changeText(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            r1.text = r3
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent> r3 = com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent.class
            java.lang.Object r3 = com.badlogic.gdx.utils.Pools.obtain(r3)
            com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent r3 = (com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent) r3
            boolean r0 = r1.fire(r3)
            if (r0 == 0) goto L1a
            r1.text = r2
        L1a:
            com.badlogic.gdx.utils.Pools.free(r3)
            r2 = r0 ^ 1
            return r2
    }

    public void clearSelection() {
            r1 = this;
            r0 = 0
            r1.hasSelection = r0
            return
    }

    protected boolean continueCursor(int r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.text
            int r2 = r2 + r3
            char r2 = r0.charAt(r2)
            boolean r2 = r1.isWordCharacter(r2)
            return r2
    }

    public void copy() {
            r5 = this;
            boolean r0 = r5.hasSelection
            if (r0 == 0) goto L23
            boolean r0 = r5.passwordMode
            if (r0 != 0) goto L23
            com.badlogic.gdx.utils.Clipboard r0 = r5.clipboard
            java.lang.String r1 = r5.text
            int r2 = r5.cursor
            int r3 = r5.selectionStart
            int r2 = java.lang.Math.min(r2, r3)
            int r3 = r5.cursor
            int r4 = r5.selectionStart
            int r3 = java.lang.Math.max(r3, r4)
            java.lang.String r1 = r1.substring(r2, r3)
            r0.setContents(r1)
        L23:
            return
    }

    protected com.badlogic.gdx.scenes.scene2d.InputListener createInputListener() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldClickListener r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldClickListener
            r0.<init>(r1)
            return r0
    }

    void cut(boolean r2) {
            r1 = this;
            boolean r0 = r1.hasSelection
            if (r0 == 0) goto L14
            boolean r0 = r1.passwordMode
            if (r0 != 0) goto L14
            r1.copy()
            int r2 = r1.delete(r2)
            r1.cursor = r2
            r1.updateDisplayText()
        L14:
            return
    }

    int delete(boolean r7) {
            r6 = this;
            int r0 = r6.selectionStart
            int r1 = r6.cursor
            int r2 = java.lang.Math.min(r0, r1)
            int r0 = java.lang.Math.max(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = ""
            if (r2 <= 0) goto L1d
            java.lang.String r4 = r6.text
            r5 = 0
            java.lang.String r4 = r4.substring(r5, r2)
            goto L1e
        L1d:
            r4 = r3
        L1e:
            r1.append(r4)
            java.lang.String r4 = r6.text
            int r4 = r4.length()
            if (r0 >= r4) goto L33
            java.lang.String r3 = r6.text
            int r4 = r3.length()
            java.lang.String r3 = r3.substring(r0, r4)
        L33:
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            if (r7 == 0) goto L42
            java.lang.String r7 = r6.text
            r6.changeText(r7, r0)
            goto L44
        L42:
            r6.text = r0
        L44:
            r6.clearSelection()
            return r2
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r22, float r23) {
            r21 = this;
            r6 = r21
            r7 = r22
            boolean r8 = r21.hasKeyboardFocus()
            boolean r0 = r6.focused
            if (r8 != r0) goto L1d
            if (r8 == 0) goto L17
            com.badlogic.gdx.utils.Timer$Task r0 = r6.blinkTask
            boolean r0 = r0.isScheduled()
            if (r0 != 0) goto L17
            goto L1d
        L17:
            if (r8 != 0) goto L35
            r0 = 0
            r6.cursorOn = r0
            goto L35
        L1d:
            r6.focused = r8
            com.badlogic.gdx.utils.Timer$Task r0 = r6.blinkTask
            r0.cancel()
            r6.cursorOn = r8
            if (r8 == 0) goto L30
            com.badlogic.gdx.utils.Timer$Task r0 = r6.blinkTask
            float r1 = r6.blinkTime
            com.badlogic.gdx.utils.Timer.schedule(r0, r1, r1)
            goto L35
        L30:
            com.badlogic.gdx.scenes.scene2d.ui.TextField$KeyRepeatTask r0 = r6.keyRepeatTask
            r0.cancel()
        L35:
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r6.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r9 = r0.font
            boolean r1 = r6.disabled
            if (r1 == 0) goto L42
            com.badlogic.gdx.graphics.Color r1 = r0.disabledFontColor
            if (r1 == 0) goto L42
        L41:
            goto L4b
        L42:
            if (r8 == 0) goto L49
            com.badlogic.gdx.graphics.Color r1 = r0.focusedFontColor
            if (r1 == 0) goto L49
            goto L41
        L49:
            com.badlogic.gdx.graphics.Color r1 = r0.fontColor
        L4b:
            r10 = r1
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r11 = r0.selection
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r12 = r0.cursor
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r13 = r21.getBackgroundDrawable()
            com.badlogic.gdx.graphics.Color r14 = r21.getColor()
            float r15 = r21.getX()
            float r16 = r21.getY()
            float r17 = r21.getWidth()
            float r5 = r21.getHeight()
            float r0 = r14.r
            float r1 = r14.g
            float r2 = r14.b
            float r3 = r14.a
            float r3 = r3 * r23
            r7.setColor(r0, r1, r2, r3)
            r18 = 0
            if (r13 == 0) goto L91
            r0 = r13
            r1 = r22
            r2 = r15
            r3 = r16
            r4 = r17
            r0.draw(r1, r2, r3, r4, r5)
            float r0 = r13.getLeftWidth()
            float r1 = r13.getRightWidth()
            r19 = r0
            r20 = r1
            goto L95
        L91:
            r19 = 0
            r20 = 0
        L95:
            float r13 = r6.getTextY(r9, r13)
            r21.calculateOffsets()
            if (r8 == 0) goto Lb1
            boolean r0 = r6.hasSelection
            if (r0 == 0) goto Lb1
            if (r11 == 0) goto Lb1
            float r4 = r15 + r19
            float r5 = r16 + r13
            r0 = r21
            r1 = r11
            r2 = r22
            r3 = r9
            r0.drawSelection(r1, r2, r3, r4, r5)
        Lb1:
            boolean r0 = r9.isFlipped()
            if (r0 == 0) goto Lbc
            float r0 = r6.textHeight
            float r0 = -r0
            r18 = r0
        Lbc:
            java.lang.CharSequence r0 = r6.displayText
            int r0 = r0.length()
            if (r0 != 0) goto L109
            if (r8 == 0) goto Lca
            boolean r0 = r6.disabled
            if (r0 == 0) goto L123
        Lca:
            java.lang.String r0 = r6.messageText
            if (r0 == 0) goto L123
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r6.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r0.messageFont
            if (r1 == 0) goto Ld6
            r2 = r1
            goto Ld7
        Ld6:
            r2 = r9
        Ld7:
            com.badlogic.gdx.graphics.Color r0 = r0.messageFontColor
            if (r0 == 0) goto Led
            float r1 = r0.r
            float r3 = r0.g
            float r4 = r0.b
            float r0 = r0.a
            float r5 = r14.a
            float r0 = r0 * r5
            float r0 = r0 * r23
            r2.setColor(r1, r3, r4, r0)
            goto Lf7
        Led:
            float r0 = r14.a
            float r0 = r0 * r23
            r1 = 1060320051(0x3f333333, float:0.7)
            r2.setColor(r1, r1, r1, r0)
        Lf7:
            float r3 = r15 + r19
            float r0 = r16 + r13
            float r4 = r0 + r18
            float r17 = r17 - r19
            float r5 = r17 - r20
            r0 = r21
            r1 = r22
            r0.drawMessageText(r1, r2, r3, r4, r5)
            goto L123
        L109:
            float r0 = r10.r
            float r1 = r10.g
            float r2 = r10.b
            float r3 = r10.a
            float r4 = r14.a
            float r3 = r3 * r4
            float r3 = r3 * r23
            r9.setColor(r0, r1, r2, r3)
            float r0 = r15 + r19
            float r1 = r16 + r13
            float r1 = r1 + r18
            r6.drawText(r7, r9, r0, r1)
        L123:
            boolean r0 = r6.disabled
            if (r0 != 0) goto L13a
            boolean r0 = r6.cursorOn
            if (r0 == 0) goto L13a
            if (r12 == 0) goto L13a
            float r4 = r15 + r19
            float r5 = r16 + r13
            r0 = r21
            r1 = r12
            r2 = r22
            r3 = r9
            r0.drawCursor(r1, r2, r3, r4, r5)
        L13a:
            return
    }

    protected void drawCursor(com.badlogic.gdx.scenes.scene2d.utils.Drawable r8, com.badlogic.gdx.graphics.g2d.Batch r9, com.badlogic.gdx.graphics.g2d.BitmapFont r10, float r11, float r12) {
            r7 = this;
            float r0 = r7.textOffset
            float r11 = r11 + r0
            com.badlogic.gdx.utils.FloatArray r0 = r7.glyphPositions
            int r1 = r7.cursor
            float r0 = r0.get(r1)
            float r11 = r11 + r0
            com.badlogic.gdx.utils.FloatArray r0 = r7.glyphPositions
            int r1 = r7.visibleTextStart
            float r0 = r0.get(r1)
            float r11 = r11 - r0
            float r0 = r7.fontOffset
            float r11 = r11 + r0
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r10.getData()
            float r0 = r0.cursorX
            float r3 = r11 + r0
            float r11 = r7.textHeight
            float r12 = r12 - r11
            float r10 = r10.getDescent()
            float r4 = r12 - r10
            float r5 = r8.getMinWidth()
            float r6 = r7.textHeight
            r1 = r8
            r2 = r9
            r1.draw(r2, r3, r4, r5, r6)
            return
    }

    protected void drawMessageText(com.badlogic.gdx.graphics.g2d.Batch r13, com.badlogic.gdx.graphics.g2d.BitmapFont r14, float r15, float r16, float r17) {
            r12 = this;
            r0 = r12
            java.lang.String r3 = r0.messageText
            int r7 = r3.length()
            int r9 = r0.textHAlign
            r6 = 0
            r10 = 0
            java.lang.String r11 = "..."
            r1 = r14
            r2 = r13
            r4 = r15
            r5 = r16
            r8 = r17
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    protected void drawSelection(com.badlogic.gdx.scenes.scene2d.utils.Drawable r8, com.badlogic.gdx.graphics.g2d.Batch r9, com.badlogic.gdx.graphics.g2d.BitmapFont r10, float r11, float r12) {
            r7 = this;
            float r0 = r7.textOffset
            float r11 = r11 + r0
            float r0 = r7.selectionX
            float r11 = r11 + r0
            float r0 = r7.fontOffset
            float r3 = r11 + r0
            float r11 = r7.textHeight
            float r12 = r12 - r11
            float r10 = r10.getDescent()
            float r4 = r12 - r10
            float r5 = r7.selectionWidth
            float r6 = r7.textHeight
            r1 = r8
            r2 = r9
            r1.draw(r2, r3, r4, r5, r6)
            return
    }

    protected void drawText(com.badlogic.gdx.graphics.g2d.Batch r11, com.badlogic.gdx.graphics.g2d.BitmapFont r12, float r13, float r14) {
            r10 = this;
            java.lang.CharSequence r2 = r10.displayText
            float r0 = r10.textOffset
            float r3 = r13 + r0
            int r5 = r10.visibleTextStart
            int r6 = r10.visibleTextEnd
            r7 = 0
            r8 = 8
            r9 = 0
            r0 = r12
            r1 = r11
            r4 = r14
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    protected com.badlogic.gdx.scenes.scene2d.utils.Drawable getBackgroundDrawable() {
            r1 = this;
            boolean r0 = r1.disabled
            if (r0 == 0) goto Lb
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.disabledBackground
            if (r0 == 0) goto Lb
            return r0
        Lb:
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.focusedBackground
            if (r0 == 0) goto L1c
            boolean r0 = r1.hasKeyboardFocus()
            if (r0 == 0) goto L1c
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.focusedBackground
            return r0
        L1c:
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.background
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r5 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r5.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.background
            r1 = 0
            if (r0 == 0) goto L28
            float r0 = r0.getBottomHeight()
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = r5.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.background
            float r2 = r2.getTopHeight()
            float r0 = r0 + r2
            float r0 = java.lang.Math.max(r1, r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = r5.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.background
            float r2 = r2.getMinHeight()
            float r1 = java.lang.Math.max(r1, r2)
            r4 = r1
            r1 = r0
            r0 = r4
            goto L29
        L28:
            r0 = 0
        L29:
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = r5.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.focusedBackground
            if (r2 == 0) goto L4c
            float r2 = r2.getBottomHeight()
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r3 = r5.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r3.focusedBackground
            float r3 = r3.getTopHeight()
            float r2 = r2 + r3
            float r1 = java.lang.Math.max(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = r5.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.focusedBackground
            float r2 = r2.getMinHeight()
            float r0 = java.lang.Math.max(r0, r2)
        L4c:
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = r5.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.disabledBackground
            if (r2 == 0) goto L6f
            float r2 = r2.getBottomHeight()
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r3 = r5.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r3.disabledBackground
            float r3 = r3.getTopHeight()
            float r2 = r2 + r3
            float r1 = java.lang.Math.max(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = r5.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.disabledBackground
            float r2 = r2.getMinHeight()
            float r0 = java.lang.Math.max(r0, r2)
        L6f:
            float r2 = r5.textHeight
            float r1 = r1 + r2
            float r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r1 = this;
            r0 = 1125515264(0x43160000, float:150.0)
            return r0
    }

    public java.lang.String getText() {
            r1 = this;
            java.lang.String r0 = r1.text
            return r0
    }

    protected float getTextY(com.badlogic.gdx.graphics.g2d.BitmapFont r5, com.badlogic.gdx.scenes.scene2d.utils.Drawable r6) {
            r4 = this;
            float r0 = r4.getHeight()
            float r1 = r4.textHeight
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r3 = r5.getDescent()
            float r1 = r1 + r3
            if (r6 == 0) goto L1e
            float r3 = r6.getBottomHeight()
            float r6 = r6.getTopHeight()
            float r0 = r0 - r6
            float r0 = r0 - r3
            float r0 = r0 / r2
            float r1 = r1 + r0
            float r1 = r1 + r3
            goto L20
        L1e:
            float r0 = r0 / r2
            float r1 = r1 + r0
        L20:
            boolean r5 = r5.usesIntegerPositions()
            if (r5 == 0) goto L28
            int r5 = (int) r1
            float r1 = (float) r5
        L28:
            return r1
    }

    protected void initialize() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.InputListener r0 = r1.createInputListener()
            r1.inputListener = r0
            r1.addListener(r0)
            return
    }

    java.lang.String insert(int r3, java.lang.CharSequence r4, java.lang.String r5) {
            r2 = this;
            int r0 = r5.length()
            if (r0 != 0) goto Lb
            java.lang.String r3 = r4.toString()
            return r3
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.String r1 = r5.substring(r1, r3)
            r0.append(r1)
            r0.append(r4)
            int r4 = r5.length()
            java.lang.String r3 = r5.substring(r3, r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public boolean isDisabled() {
            r1 = this;
            boolean r0 = r1.disabled
            return r0
    }

    protected boolean isWordCharacter(char r1) {
            r0 = this;
            boolean r1 = java.lang.Character.isLetterOrDigit(r1)
            return r1
    }

    protected int letterUnderCursor(float r6) {
            r5 = this;
            float r0 = r5.textOffset
            float r1 = r5.fontOffset
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r1 = r5.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r1.font
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r1 = r1.getData()
            float r1 = r1.cursorX
            float r0 = r0 - r1
            com.badlogic.gdx.utils.FloatArray r1 = r5.glyphPositions
            int r2 = r5.visibleTextStart
            float r1 = r1.get(r2)
            float r0 = r0 - r1
            float r6 = r6 - r0
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r5.getBackgroundDrawable()
            if (r0 == 0) goto L29
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r5.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.background
            float r0 = r0.getLeftWidth()
            float r6 = r6 - r0
        L29:
            com.badlogic.gdx.utils.FloatArray r0 = r5.glyphPositions
            int r1 = r0.size
            float[] r0 = r0.items
            r2 = 1
            r3 = 1
        L31:
            if (r3 >= r1) goto L4a
            r4 = r0[r3]
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L47
            r1 = r0[r3]
            float r1 = r1 - r6
            int r2 = r3 + (-1)
            r0 = r0[r2]
            float r6 = r6 - r0
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 > 0) goto L46
            return r3
        L46:
            return r2
        L47:
            int r3 = r3 + 1
            goto L31
        L4a:
            int r1 = r1 - r2
            return r1
    }

    protected void moveCursor(boolean r4, boolean r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto La
            java.lang.String r1 = r3.text
            int r1 = r1.length()
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r4 == 0) goto Le
            goto Lf
        Le:
            r0 = -1
        Lf:
            int r2 = r3.cursor
            if (r4 == 0) goto L1a
            int r2 = r2 + 1
            r3.cursor = r2
            if (r2 >= r1) goto L2a
            goto L20
        L1a:
            int r2 = r2 + (-1)
            r3.cursor = r2
            if (r2 <= r1) goto L2a
        L20:
            if (r5 == 0) goto L2a
            int r2 = r3.cursor
            boolean r2 = r3.continueCursor(r2, r0)
            if (r2 != 0) goto Lf
        L2a:
            return
    }

    public void next(boolean r11) {
            r10 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r10.getStage()
            if (r0 != 0) goto L7
            return
        L7:
            com.badlogic.gdx.scenes.scene2d.Group r1 = r10.getParent()
            com.badlogic.gdx.math.Vector2 r2 = com.badlogic.gdx.scenes.scene2d.ui.TextField.tmp2
            float r3 = r10.getX()
            float r4 = r10.getY()
            com.badlogic.gdx.math.Vector2 r2 = r2.set(r3, r4)
            com.badlogic.gdx.math.Vector2 r1 = r1.localToStageCoordinates(r2)
            com.badlogic.gdx.math.Vector2 r2 = com.badlogic.gdx.scenes.scene2d.ui.TextField.tmp1
            r9 = r10
        L20:
            com.badlogic.gdx.utils.Array r4 = r0.getActors()
            r5 = 0
            r3 = r9
            r6 = r2
            r7 = r1
            r8 = r11
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r3.findNextTextField(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L4b
            if (r11 == 0) goto L38
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r1.set(r3, r3)
            goto L3e
        L38:
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1.set(r3, r3)
        L3e:
            com.badlogic.gdx.utils.Array r4 = r0.getActors()
            r5 = 0
            r3 = r9
            r6 = r2
            r7 = r1
            r8 = r11
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r3.findNextTextField(r4, r5, r6, r7, r8)
        L4b:
            r9 = r3
            if (r9 != 0) goto L55
            com.badlogic.gdx.Input r11 = com.badlogic.gdx.Gdx.input
            r0 = 0
            r11.setOnscreenKeyboardVisible(r0)
            goto L5e
        L55:
            boolean r3 = r0.setKeyboardFocus(r9)
            if (r3 == 0) goto L5f
            r9.selectAll()
        L5e:
            return
        L5f:
            r1.set(r2)
            goto L20
    }

    void paste(java.lang.String r10, boolean r11) {
            r9 = this;
            if (r10 != 0) goto L3
            return
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.text
            int r1 = r1.length()
            boolean r2 = r9.hasSelection
            if (r2 == 0) goto L1c
            int r2 = r9.cursor
            int r3 = r9.selectionStart
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            int r1 = r1 - r2
        L1c:
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = r9.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r2 = r2.font
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r2 = r2.getData()
            r3 = 0
            int r4 = r10.length()
        L29:
            if (r3 >= r4) goto L68
            int r5 = r0.length()
            int r5 = r5 + r1
            boolean r5 = r9.withinMaxLength(r5)
            if (r5 != 0) goto L37
            goto L68
        L37:
            char r5 = r10.charAt(r3)
            boolean r6 = r9.writeEnters
            r7 = 10
            r8 = 13
            if (r6 == 0) goto L47
            if (r5 == r7) goto L62
            if (r5 == r8) goto L62
        L47:
            if (r5 == r8) goto L65
            if (r5 != r7) goto L4c
            goto L65
        L4c:
            boolean r6 = r9.onlyFontChars
            if (r6 == 0) goto L57
            boolean r6 = r2.hasGlyph(r5)
            if (r6 != 0) goto L57
            goto L65
        L57:
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter r6 = r9.filter
            if (r6 == 0) goto L62
            boolean r6 = r6.acceptChar(r9, r5)
            if (r6 != 0) goto L62
            goto L65
        L62:
            r0.append(r5)
        L65:
            int r3 = r3 + 1
            goto L29
        L68:
            java.lang.String r10 = r0.toString()
            boolean r0 = r9.hasSelection
            if (r0 == 0) goto L76
            int r0 = r9.delete(r11)
            r9.cursor = r0
        L76:
            if (r11 == 0) goto L84
            java.lang.String r11 = r9.text
            int r0 = r9.cursor
            java.lang.String r0 = r9.insert(r0, r10, r11)
            r9.changeText(r11, r0)
            goto L8e
        L84:
            int r11 = r9.cursor
            java.lang.String r0 = r9.text
            java.lang.String r11 = r9.insert(r11, r10, r0)
            r9.text = r11
        L8e:
            r9.updateDisplayText()
            int r11 = r9.cursor
            int r10 = r10.length()
            int r11 = r11 + r10
            r9.cursor = r11
            return
    }

    public void selectAll() {
            r2 = this;
            java.lang.String r0 = r2.text
            int r0 = r0.length()
            r1 = 0
            r2.setSelection(r1, r0)
            return
    }

    public void setBlinkTime(float r1) {
            r0 = this;
            r0.blinkTime = r1
            return
    }

    public void setCursorPosition(int r2) {
            r1 = this;
            if (r2 < 0) goto L12
            r1.clearSelection()
            java.lang.String r0 = r1.text
            int r0 = r0.length()
            int r2 = java.lang.Math.min(r2, r0)
            r1.cursor = r2
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cursorPosition must be >= 0"
            r2.<init>(r0)
            throw r2
    }

    public void setFocusTraversal(boolean r1) {
            r0 = this;
            r0.focusTraversal = r1
            return
    }

    public void setMaxLength(int r1) {
            r0 = this;
            r0.maxLength = r1
            return
    }

    public void setMessageText(java.lang.String r1) {
            r0 = this;
            r0.messageText = r1
            return
    }

    public void setOnlyFontChars(boolean r1) {
            r0 = this;
            r0.onlyFontChars = r1
            return
    }

    public void setSelection(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto L33
            if (r4 < 0) goto L2b
            java.lang.String r0 = r2.text
            int r0 = r0.length()
            int r3 = java.lang.Math.min(r0, r3)
            java.lang.String r0 = r2.text
            int r0 = r0.length()
            int r4 = java.lang.Math.min(r0, r4)
            if (r4 != r3) goto L1e
            r2.clearSelection()
            return
        L1e:
            if (r4 >= r3) goto L23
            r1 = r4
            r4 = r3
            r3 = r1
        L23:
            r0 = 1
            r2.hasSelection = r0
            r2.selectionStart = r3
            r2.cursor = r4
            return
        L2b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "selectionEnd must be >= 0"
            r3.<init>(r4)
            throw r3
        L33:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "selectionStart must be >= 0"
            r3.<init>(r4)
            throw r3
    }

    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle r3) {
            r2 = this;
            if (r3 == 0) goto L22
            r2.style = r3
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r3.font
            float r0 = r0.getCapHeight()
            com.badlogic.gdx.graphics.g2d.BitmapFont r3 = r3.font
            float r3 = r3.getDescent()
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r1
            float r0 = r0 - r3
            r2.textHeight = r0
            java.lang.String r3 = r2.text
            if (r3 == 0) goto L1e
            r2.updateDisplayText()
        L1e:
            r2.invalidateHierarchy()
            return
        L22:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "style cannot be null."
            r3.<init>(r0)
            throw r3
    }

    public void setText(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            r3 = r0
        L5:
            java.lang.String r1 = r2.text
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Le
            return
        Le:
            r2.clearSelection()
            java.lang.String r1 = r2.text
            r2.text = r0
            r0 = 0
            r2.paste(r3, r0)
            boolean r3 = r2.programmaticChangeEvents
            if (r3 == 0) goto L22
            java.lang.String r3 = r2.text
            r2.changeText(r1, r3)
        L22:
            r2.cursor = r0
            return
    }

    public void setTextFieldFilter(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter r1) {
            r0 = this;
            r0.filter = r1
            return
    }

    public void setTextFieldListener(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }

    void updateDisplayText() {
            r9 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = r9.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r0.font
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r1 = r0.getData()
            java.lang.String r2 = r9.text
            int r3 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
        L14:
            r6 = 32
            if (r5 >= r3) goto L29
            char r7 = r2.charAt(r5)
            boolean r8 = r1.hasGlyph(r7)
            if (r8 == 0) goto L23
            r6 = r7
        L23:
            r4.append(r6)
            int r5 = r5 + 1
            goto L14
        L29:
            java.lang.String r2 = r4.toString()
            boolean r4 = r9.passwordMode
            if (r4 == 0) goto L6d
            char r4 = r9.passwordCharacter
            boolean r1 = r1.hasGlyph(r4)
            if (r1 == 0) goto L6d
            java.lang.StringBuilder r1 = r9.passwordBuffer
            if (r1 != 0) goto L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = r2.length()
            r1.<init>(r4)
            r9.passwordBuffer = r1
        L48:
            java.lang.StringBuilder r1 = r9.passwordBuffer
            int r1 = r1.length()
            if (r1 <= r3) goto L56
            java.lang.StringBuilder r1 = r9.passwordBuffer
            r1.setLength(r3)
            goto L68
        L56:
            java.lang.StringBuilder r1 = r9.passwordBuffer
            int r1 = r1.length()
        L5c:
            if (r1 >= r3) goto L68
            java.lang.StringBuilder r4 = r9.passwordBuffer
            char r5 = r9.passwordCharacter
            r4.append(r5)
            int r1 = r1 + 1
            goto L5c
        L68:
            java.lang.StringBuilder r1 = r9.passwordBuffer
            r9.displayText = r1
            goto L6f
        L6d:
            r9.displayText = r2
        L6f:
            com.badlogic.gdx.graphics.g2d.GlyphLayout r1 = r9.layout
            java.lang.CharSequence r4 = r9.displayText
            java.lang.String r4 = r4.toString()
            r5 = 13
            java.lang.String r4 = r4.replace(r5, r6)
            r5 = 10
            java.lang.String r4 = r4.replace(r5, r6)
            r1.setText(r0, r4)
            com.badlogic.gdx.utils.FloatArray r0 = r9.glyphPositions
            r0.clear()
            com.badlogic.gdx.graphics.g2d.GlyphLayout r0 = r9.layout
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun> r0 = r0.runs
            int r1 = r0.size
            r4 = 0
            r5 = 1
            if (r1 <= 0) goto Lb5
            java.lang.Object r0 = r0.first()
            com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun r0 = (com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun) r0
            com.badlogic.gdx.utils.FloatArray r0 = r0.xAdvances
            float r1 = r0.first()
            r9.fontOffset = r1
            int r1 = r0.size
            r6 = 1
        La6:
            if (r6 >= r1) goto Lb7
            com.badlogic.gdx.utils.FloatArray r7 = r9.glyphPositions
            r7.add(r4)
            float r7 = r0.get(r6)
            float r4 = r4 + r7
            int r6 = r6 + 1
            goto La6
        Lb5:
            r9.fontOffset = r4
        Lb7:
            com.badlogic.gdx.utils.FloatArray r0 = r9.glyphPositions
            r0.add(r4)
            int r0 = r9.visibleTextStart
            com.badlogic.gdx.utils.FloatArray r1 = r9.glyphPositions
            int r1 = r1.size
            int r1 = r1 - r5
            int r0 = java.lang.Math.min(r0, r1)
            r9.visibleTextStart = r0
            int r1 = r9.visibleTextEnd
            com.badlogic.gdx.utils.FloatArray r4 = r9.glyphPositions
            int r4 = r4.size
            int r4 = r4 - r5
            int r0 = com.badlogic.gdx.math.MathUtils.clamp(r1, r0, r4)
            r9.visibleTextEnd = r0
            int r0 = r9.selectionStart
            int r1 = r2.length()
            if (r0 <= r1) goto Le0
            r9.selectionStart = r3
        Le0:
            return
    }

    boolean withinMaxLength(int r2) {
            r1 = this;
            int r0 = r1.maxLength
            if (r0 <= 0) goto L9
            if (r2 >= r0) goto L7
            goto L9
        L7:
            r2 = 0
            goto La
        L9:
            r2 = 1
        La:
            return r2
    }

    int[] wordUnderCursor(float r1) {
            r0 = this;
            int r1 = r0.letterUnderCursor(r1)
            int[] r1 = r0.wordUnderCursor(r1)
            return r1
    }

    protected int[] wordUnderCursor(int r7) {
            r6 = this;
            java.lang.String r0 = r6.text
            int r1 = r0.length()
            int r2 = r0.length()
            r3 = 0
            r4 = 1
            if (r7 < r2) goto L14
            int r7 = r0.length()
            r1 = 0
            goto L3a
        L14:
            r2 = r7
        L15:
            if (r2 >= r1) goto L26
            char r5 = r0.charAt(r2)
            boolean r5 = r6.isWordCharacter(r5)
            if (r5 != 0) goto L23
            r1 = r2
            goto L26
        L23:
            int r2 = r2 + 1
            goto L15
        L26:
            int r7 = r7 - r4
        L27:
            r2 = -1
            if (r7 <= r2) goto L39
            char r2 = r0.charAt(r7)
            boolean r2 = r6.isWordCharacter(r2)
            if (r2 != 0) goto L36
            int r7 = r7 + r4
            goto L3a
        L36:
            int r7 = r7 + (-1)
            goto L27
        L39:
            r7 = 0
        L3a:
            r0 = 2
            int[] r0 = new int[r0]
            r0[r3] = r7
            r0[r4] = r1
            return r0
    }
}
