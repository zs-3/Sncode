package com.badlogic.gdx.scenes.scene2d;

/* loaded from: classes.dex */
public class InputEvent extends com.badlogic.gdx.scenes.scene2d.Event {
    private int button;
    private char character;
    private int keyCode;
    private int pointer;
    private com.badlogic.gdx.scenes.scene2d.Actor relatedActor;
    private float scrollAmountX;
    private float scrollAmountY;
    private float stageX;
    private float stageY;
    private boolean touchFocus;
    private com.badlogic.gdx.scenes.scene2d.InputEvent.Type type;

    public enum Type extends java.lang.Enum<com.badlogic.gdx.scenes.scene2d.InputEvent.Type> {
        private static final /* synthetic */ com.badlogic.gdx.scenes.scene2d.InputEvent.Type[] $VALUES = null;
        public static final com.badlogic.gdx.scenes.scene2d.InputEvent.Type enter = null;
        public static final com.badlogic.gdx.scenes.scene2d.InputEvent.Type exit = null;
        public static final com.badlogic.gdx.scenes.scene2d.InputEvent.Type keyDown = null;
        public static final com.badlogic.gdx.scenes.scene2d.InputEvent.Type keyTyped = null;
        public static final com.badlogic.gdx.scenes.scene2d.InputEvent.Type keyUp = null;
        public static final com.badlogic.gdx.scenes.scene2d.InputEvent.Type mouseMoved = null;
        public static final com.badlogic.gdx.scenes.scene2d.InputEvent.Type scrolled = null;
        public static final com.badlogic.gdx.scenes.scene2d.InputEvent.Type touchDown = null;
        public static final com.badlogic.gdx.scenes.scene2d.InputEvent.Type touchDragged = null;
        public static final com.badlogic.gdx.scenes.scene2d.InputEvent.Type touchUp = null;

        static {
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r0 = new com.badlogic.gdx.scenes.scene2d.InputEvent$Type
                java.lang.String r1 = "touchDown"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchDown = r0
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = new com.badlogic.gdx.scenes.scene2d.InputEvent$Type
                java.lang.String r3 = "touchUp"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchUp = r1
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r3 = new com.badlogic.gdx.scenes.scene2d.InputEvent$Type
                java.lang.String r5 = "touchDragged"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchDragged = r3
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r5 = new com.badlogic.gdx.scenes.scene2d.InputEvent$Type
                java.lang.String r7 = "mouseMoved"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.scenes.scene2d.InputEvent.Type.mouseMoved = r5
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r7 = new com.badlogic.gdx.scenes.scene2d.InputEvent$Type
                java.lang.String r9 = "enter"
                r10 = 4
                r7.<init>(r9, r10)
                com.badlogic.gdx.scenes.scene2d.InputEvent.Type.enter = r7
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r9 = new com.badlogic.gdx.scenes.scene2d.InputEvent$Type
                java.lang.String r11 = "exit"
                r12 = 5
                r9.<init>(r11, r12)
                com.badlogic.gdx.scenes.scene2d.InputEvent.Type.exit = r9
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r11 = new com.badlogic.gdx.scenes.scene2d.InputEvent$Type
                java.lang.String r13 = "scrolled"
                r14 = 6
                r11.<init>(r13, r14)
                com.badlogic.gdx.scenes.scene2d.InputEvent.Type.scrolled = r11
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r13 = new com.badlogic.gdx.scenes.scene2d.InputEvent$Type
                java.lang.String r15 = "keyDown"
                r14 = 7
                r13.<init>(r15, r14)
                com.badlogic.gdx.scenes.scene2d.InputEvent.Type.keyDown = r13
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r15 = new com.badlogic.gdx.scenes.scene2d.InputEvent$Type
                java.lang.String r14 = "keyUp"
                r12 = 8
                r15.<init>(r14, r12)
                com.badlogic.gdx.scenes.scene2d.InputEvent.Type.keyUp = r15
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r14 = new com.badlogic.gdx.scenes.scene2d.InputEvent$Type
                java.lang.String r12 = "keyTyped"
                r10 = 9
                r14.<init>(r12, r10)
                com.badlogic.gdx.scenes.scene2d.InputEvent.Type.keyTyped = r14
                r12 = 10
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type[] r12 = new com.badlogic.gdx.scenes.scene2d.InputEvent.Type[r12]
                r12[r2] = r0
                r12[r4] = r1
                r12[r6] = r3
                r12[r8] = r5
                r0 = 4
                r12[r0] = r7
                r0 = 5
                r12[r0] = r9
                r0 = 6
                r12[r0] = r11
                r0 = 7
                r12[r0] = r13
                r0 = 8
                r12[r0] = r15
                r12[r10] = r14
                com.badlogic.gdx.scenes.scene2d.InputEvent.Type.$VALUES = r12
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.scenes.scene2d.InputEvent.Type valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.scenes.scene2d.InputEvent$Type> r0 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = (com.badlogic.gdx.scenes.scene2d.InputEvent.Type) r1
                return r1
        }

        public static com.badlogic.gdx.scenes.scene2d.InputEvent.Type[] values() {
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type[] r0 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type[] r0 = (com.badlogic.gdx.scenes.scene2d.InputEvent.Type[]) r0
                return r0
        }
    }

    public InputEvent() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.touchFocus = r0
            return
    }

    public int getButton() {
            r1 = this;
            int r0 = r1.button
            return r0
    }

    public char getCharacter() {
            r1 = this;
            char r0 = r1.character
            return r0
    }

    public int getKeyCode() {
            r1 = this;
            int r0 = r1.keyCode
            return r0
    }

    public int getPointer() {
            r1 = this;
            int r0 = r1.pointer
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Actor getRelatedActor() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.relatedActor
            return r0
    }

    public float getScrollAmountX() {
            r1 = this;
            float r0 = r1.scrollAmountX
            return r0
    }

    public float getScrollAmountY() {
            r1 = this;
            float r0 = r1.scrollAmountY
            return r0
    }

    public float getStageX() {
            r1 = this;
            float r0 = r1.stageX
            return r0
    }

    public float getStageY() {
            r1 = this;
            float r0 = r1.stageY
            return r0
    }

    public boolean getTouchFocus() {
            r1 = this;
            boolean r0 = r1.touchFocus
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.InputEvent.Type getType() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r0 = r1.type
            return r0
    }

    public boolean isTouchFocusCancel() {
            r2 = this;
            float r0 = r2.stageX
            r1 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            float r0 = r2.stageY
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Event, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            super.reset()
            r0 = 0
            r1.relatedActor = r0
            r0 = -1
            r1.button = r0
            return
    }

    public void setButton(int r1) {
            r0 = this;
            r0.button = r1
            return
    }

    public void setCharacter(char r1) {
            r0 = this;
            r0.character = r1
            return
    }

    public void setKeyCode(int r1) {
            r0 = this;
            r0.keyCode = r1
            return
    }

    public void setPointer(int r1) {
            r0 = this;
            r0.pointer = r1
            return
    }

    public void setRelatedActor(com.badlogic.gdx.scenes.scene2d.Actor r1) {
            r0 = this;
            r0.relatedActor = r1
            return
    }

    public void setScrollAmountX(float r1) {
            r0 = this;
            r0.scrollAmountX = r1
            return
    }

    public void setScrollAmountY(float r1) {
            r0 = this;
            r0.scrollAmountY = r1
            return
    }

    public void setStageX(float r1) {
            r0 = this;
            r0.stageX = r1
            return
    }

    public void setStageY(float r1) {
            r0 = this;
            r0.stageY = r1
            return
    }

    public void setType(com.badlogic.gdx.scenes.scene2d.InputEvent.Type r1) {
            r0 = this;
            r0.type = r1
            return
    }

    public com.badlogic.gdx.math.Vector2 toCoordinates(com.badlogic.gdx.scenes.scene2d.Actor r3, com.badlogic.gdx.math.Vector2 r4) {
            r2 = this;
            float r0 = r2.stageX
            float r1 = r2.stageY
            r4.set(r0, r1)
            r3.stageToLocalCoordinates(r4)
            return r4
    }

    public java.lang.String toString() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r0 = r1.type
            java.lang.String r0 = r0.toString()
            return r0
    }
}
