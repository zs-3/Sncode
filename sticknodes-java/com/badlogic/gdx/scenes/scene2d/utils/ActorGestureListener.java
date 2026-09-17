package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public class ActorGestureListener implements com.badlogic.gdx.scenes.scene2d.EventListener {
    static final com.badlogic.gdx.math.Vector2 tmpCoords = null;
    static final com.badlogic.gdx.math.Vector2 tmpCoords2 = null;
    com.badlogic.gdx.scenes.scene2d.Actor actor;
    private final com.badlogic.gdx.input.GestureDetector detector;
    com.badlogic.gdx.scenes.scene2d.InputEvent event;
    com.badlogic.gdx.scenes.scene2d.Actor touchDownTarget;


    /* renamed from: com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type = null;

        static {
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type[] r0 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener.AnonymousClass2.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type = r0
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchDown     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener.AnonymousClass2.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type     // Catch: java.lang.NoSuchFieldError -> L1d
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchUp     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener.AnonymousClass2.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type     // Catch: java.lang.NoSuchFieldError -> L28
                com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchDragged     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener.tmpCoords = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener.tmpCoords2 = r0
            return
    }

    public ActorGestureListener() {
            r4 = this;
            r0 = 1101004800(0x41a00000, float:20.0)
            r1 = 1053609165(0x3ecccccd, float:0.4)
            r2 = 1066192077(0x3f8ccccd, float:1.1)
            r3 = 1325400064(0x4f000000, float:2.14748365E9)
            r4.<init>(r0, r1, r2, r3)
            return
    }

    public ActorGestureListener(float r8, float r9, float r10, float r11) {
            r7 = this;
            r7.<init>()
            com.badlogic.gdx.input.GestureDetector r6 = new com.badlogic.gdx.input.GestureDetector
            com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener$1 r5 = new com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener$1
            r5.<init>(r7)
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r7.detector = r6
            return
    }

    public void fling(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public com.badlogic.gdx.input.GestureDetector getGestureDetector() {
            r1 = this;
            com.badlogic.gdx.input.GestureDetector r0 = r1.detector
            return r0
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
            int[] r0 = com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener.AnonymousClass2.$SwitchMap$com$badlogic$gdx$scenes$scene2d$InputEvent$Type
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r2 = r10.getType()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            r8 = 1
            if (r0 == r8) goto L86
            r2 = 2
            if (r0 == r2) goto L38
            r2 = 3
            if (r0 == r2) goto L1e
            return r1
        L1e:
            r9.event = r10
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r10.getListenerActor()
            r9.actor = r0
            com.badlogic.gdx.input.GestureDetector r0 = r9.detector
            float r1 = r10.getStageX()
            float r2 = r10.getStageY()
            int r10 = r10.getPointer()
            r0.touchDragged(r1, r2, r10)
            return r8
        L38:
            boolean r0 = r10.isTouchFocusCancel()
            if (r0 == 0) goto L44
            com.badlogic.gdx.input.GestureDetector r10 = r9.detector
            r10.reset()
            return r1
        L44:
            r9.event = r10
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r10.getListenerActor()
            r9.actor = r0
            com.badlogic.gdx.input.GestureDetector r0 = r9.detector
            float r1 = r10.getStageX()
            float r2 = r10.getStageY()
            int r3 = r10.getPointer()
            int r4 = r10.getButton()
            r0.touchUp(r1, r2, r3, r4)
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r9.actor
            com.badlogic.gdx.math.Vector2 r1 = com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener.tmpCoords
            float r2 = r10.getStageX()
            float r3 = r10.getStageY()
            com.badlogic.gdx.math.Vector2 r2 = r1.set(r2, r3)
            r0.stageToLocalCoordinates(r2)
            float r4 = r1.x
            float r5 = r1.y
            int r6 = r10.getPointer()
            int r7 = r10.getButton()
            r2 = r9
            r3 = r10
            r2.touchUp(r3, r4, r5, r6, r7)
            return r8
        L86:
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r10.getListenerActor()
            r9.actor = r0
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r10.getTarget()
            r9.touchDownTarget = r0
            com.badlogic.gdx.input.GestureDetector r0 = r9.detector
            float r1 = r10.getStageX()
            float r2 = r10.getStageY()
            int r3 = r10.getPointer()
            int r4 = r10.getButton()
            r0.touchDown(r1, r2, r3, r4)
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r9.actor
            com.badlogic.gdx.math.Vector2 r1 = com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener.tmpCoords
            float r2 = r10.getStageX()
            float r3 = r10.getStageY()
            com.badlogic.gdx.math.Vector2 r2 = r1.set(r2, r3)
            r0.stageToLocalCoordinates(r2)
            float r4 = r1.x
            float r5 = r1.y
            int r6 = r10.getPointer()
            int r7 = r10.getButton()
            r2 = r9
            r3 = r10
            r2.touchDown(r3, r4, r5, r6, r7)
            boolean r0 = r10.getTouchFocus()
            if (r0 == 0) goto Le9
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r10.getStage()
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r10.getListenerActor()
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r10.getTarget()
            int r5 = r10.getPointer()
            int r6 = r10.getButton()
            r2 = r9
            r1.addTouchFocus(r2, r3, r4, r5, r6)
        Le9:
            return r8
    }

    public boolean longPress(com.badlogic.gdx.scenes.scene2d.Actor r1, float r2, float r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void pan(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void panStop(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
            r0 = this;
            return
    }

    public void pinch(com.badlogic.gdx.scenes.scene2d.InputEvent r1, com.badlogic.gdx.math.Vector2 r2, com.badlogic.gdx.math.Vector2 r3, com.badlogic.gdx.math.Vector2 r4, com.badlogic.gdx.math.Vector2 r5) {
            r0 = this;
            return
    }

    public void tap(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
            r0 = this;
            return
    }

    public void touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
            r0 = this;
            return
    }

    public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
            r0 = this;
            return
    }

    public void zoom(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3) {
            r0 = this;
            return
    }
}
