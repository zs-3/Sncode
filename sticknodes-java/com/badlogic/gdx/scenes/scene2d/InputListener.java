package com.badlogic.gdx.scenes.scene2d;

/* loaded from: classes.dex */
public class InputListener implements com.badlogic.gdx.scenes.scene2d.EventListener {
    private static final com.badlogic.gdx.math.Vector2 tmpCoords = null;

    /* renamed from: com.badlogic.gdx.scenes.scene2d.InputListener$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type = null;

        static {
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type[] r0 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.badlogic.gdx.scenes.scene2d.InputListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type = r0
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.keyDown     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.badlogic.gdx.scenes.scene2d.InputListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type     // Catch: java.lang.NoSuchFieldError -> L1d
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.keyUp     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.badlogic.gdx.scenes.scene2d.InputListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type     // Catch: java.lang.NoSuchFieldError -> L28
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.keyTyped     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.badlogic.gdx.scenes.scene2d.InputListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type     // Catch: java.lang.NoSuchFieldError -> L33
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchDown     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.badlogic.gdx.scenes.scene2d.InputListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type     // Catch: java.lang.NoSuchFieldError -> L3e
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchUp     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.badlogic.gdx.scenes.scene2d.InputListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type     // Catch: java.lang.NoSuchFieldError -> L49
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchDragged     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.badlogic.gdx.scenes.scene2d.InputListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type     // Catch: java.lang.NoSuchFieldError -> L54
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.mouseMoved     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.badlogic.gdx.scenes.scene2d.InputListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type     // Catch: java.lang.NoSuchFieldError -> L60
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.scrolled     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = com.badlogic.gdx.scenes.scene2d.InputListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type     // Catch: java.lang.NoSuchFieldError -> L6c
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.enter     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = com.badlogic.gdx.scenes.scene2d.InputListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type     // Catch: java.lang.NoSuchFieldError -> L78
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.exit     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                return
        }
    }

    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.InputListener.tmpCoords = r0
            return
    }

    public InputListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public void enter(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, com.badlogic.gdx.scenes.scene2d.Actor r5) {
            r0 = this;
            return
    }

    public void exit(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, com.badlogic.gdx.scenes.scene2d.Actor r5) {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.EventListener
    public boolean handle(com.badlogic.gdx.scenes.scene2d.Event r10) {
            r9 = this;
            boolean r0 = r10 instanceof com.badlogic.gdx.scenes.scene2d.InputEvent
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.badlogic.gdx.scenes.scene2d.InputEvent r10 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r10
            int[] r0 = com.badlogic.gdx.scenes.scene2d.InputListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r2 = r10.getType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r8 = 1
            if (r2 == r8) goto Ld7
            r3 = 2
            if (r2 == r3) goto Lce
            r3 = 3
            if (r2 == r3) goto Lc5
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r10.getListenerActor()
            com.badlogic.gdx.math.Vector2 r3 = com.badlogic.gdx.scenes.scene2d.InputListener.tmpCoords
            r10.toCoordinates(r2, r3)
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r2 = r10.getType()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            switch(r0) {
                case 4: goto L92;
                case 5: goto L80;
                case 6: goto L74;
                case 7: goto L6b;
                case 8: goto L58;
                case 9: goto L46;
                case 10: goto L34;
                default: goto L33;
            }
        L33:
            return r1
        L34:
            float r4 = r3.x
            float r5 = r3.y
            int r6 = r10.getPointer()
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r10.getRelatedActor()
            r2 = r9
            r3 = r10
            r2.exit(r3, r4, r5, r6, r7)
            return r1
        L46:
            float r4 = r3.x
            float r5 = r3.y
            int r6 = r10.getPointer()
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r10.getRelatedActor()
            r2 = r9
            r3 = r10
            r2.enter(r3, r4, r5, r6, r7)
            return r1
        L58:
            float r4 = r3.x
            float r5 = r3.y
            float r6 = r10.getScrollAmountX()
            float r7 = r10.getScrollAmountY()
            r2 = r9
            r3 = r10
            boolean r10 = r2.scrolled(r3, r4, r5, r6, r7)
            return r10
        L6b:
            float r0 = r3.x
            float r1 = r3.y
            boolean r10 = r9.mouseMoved(r10, r0, r1)
            return r10
        L74:
            float r0 = r3.x
            float r1 = r3.y
            int r2 = r10.getPointer()
            r9.touchDragged(r10, r0, r1, r2)
            return r8
        L80:
            float r4 = r3.x
            float r5 = r3.y
            int r6 = r10.getPointer()
            int r7 = r10.getButton()
            r2 = r9
            r3 = r10
            r2.touchUp(r3, r4, r5, r6, r7)
            return r8
        L92:
            float r4 = r3.x
            float r5 = r3.y
            int r6 = r10.getPointer()
            int r7 = r10.getButton()
            r2 = r9
            r3 = r10
            boolean r0 = r2.touchDown(r3, r4, r5, r6, r7)
            if (r0 == 0) goto Lc4
            boolean r1 = r10.getTouchFocus()
            if (r1 == 0) goto Lc4
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r10.getStage()
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r10.getListenerActor()
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r10.getTarget()
            int r6 = r10.getPointer()
            int r7 = r10.getButton()
            r3 = r9
            r2.addTouchFocus(r3, r4, r5, r6, r7)
        Lc4:
            return r0
        Lc5:
            char r0 = r10.getCharacter()
            boolean r10 = r9.keyTyped(r10, r0)
            return r10
        Lce:
            int r0 = r10.getKeyCode()
            boolean r10 = r9.keyUp(r10, r0)
            return r10
        Ld7:
            int r0 = r10.getKeyCode()
            boolean r10 = r9.keyDown(r10, r0)
            return r10
    }

    public boolean keyDown(com.badlogic.gdx.scenes.scene2d.InputEvent r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean keyTyped(com.badlogic.gdx.scenes.scene2d.InputEvent r1, char r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean keyUp(com.badlogic.gdx.scenes.scene2d.InputEvent r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean mouseMoved(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean scrolled(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void touchDragged(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4) {
            r0 = this;
            return
    }

    public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
            r0 = this;
            return
    }
}
