package com.badlogic.gdx.scenes.scene2d;

/* loaded from: classes.dex */
public class Stage extends com.badlogic.gdx.InputAdapter implements com.badlogic.gdx.utils.Disposable {
    static boolean debug;
    private boolean actionsRequestRendering;
    private final com.badlogic.gdx.graphics.g2d.Batch batch;
    private boolean debugAll;
    private final com.badlogic.gdx.graphics.Color debugColor;
    private boolean debugParentUnderMouse;
    private com.badlogic.gdx.graphics.glutils.ShapeRenderer debugShapes;
    private com.badlogic.gdx.scenes.scene2d.ui.Table.Debug debugTableUnderMouse;
    private boolean debugUnderMouse;
    private com.badlogic.gdx.scenes.scene2d.Actor keyboardFocus;
    private com.badlogic.gdx.scenes.scene2d.Actor mouseOverActor;
    private int mouseScreenX;
    private int mouseScreenY;
    private boolean ownsBatch;
    private final com.badlogic.gdx.scenes.scene2d.Actor[] pointerOverActors;
    private final int[] pointerScreenX;
    private final int[] pointerScreenY;
    private final boolean[] pointerTouched;
    private com.badlogic.gdx.scenes.scene2d.Group root;
    private com.badlogic.gdx.scenes.scene2d.Actor scrollFocus;
    private final com.badlogic.gdx.math.Vector2 tempCoords;
    final com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Stage.TouchFocus> touchFocuses;
    private com.badlogic.gdx.utils.viewport.Viewport viewport;

    public static final class TouchFocus implements com.badlogic.gdx.utils.Pool.Poolable {
        int button;
        com.badlogic.gdx.scenes.scene2d.EventListener listener;
        com.badlogic.gdx.scenes.scene2d.Actor listenerActor;
        int pointer;
        com.badlogic.gdx.scenes.scene2d.Actor target;

        public TouchFocus() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.utils.Pool.Poolable
        public void reset() {
                r1 = this;
                r0 = 0
                r1.listenerActor = r0
                r1.listener = r0
                r1.target = r0
                return
        }
    }

    public Stage(com.badlogic.gdx.utils.viewport.Viewport r6, com.badlogic.gdx.graphics.g2d.Batch r7) {
            r5 = this;
            r5.<init>()
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r5.tempCoords = r0
            r0 = 20
            com.badlogic.gdx.scenes.scene2d.Actor[] r1 = new com.badlogic.gdx.scenes.scene2d.Actor[r0]
            r5.pointerOverActors = r1
            boolean[] r1 = new boolean[r0]
            r5.pointerTouched = r1
            int[] r1 = new int[r0]
            r5.pointerScreenX = r1
            int[] r0 = new int[r0]
            r5.pointerScreenY = r0
            com.badlogic.gdx.utils.SnapshotArray r0 = new com.badlogic.gdx.utils.SnapshotArray
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus> r1 = com.badlogic.gdx.scenes.scene2d.Stage.TouchFocus.class
            r2 = 1
            r3 = 4
            r0.<init>(r2, r3, r1)
            r5.touchFocuses = r0
            r5.actionsRequestRendering = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.none
            r5.debugTableUnderMouse = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1062836634(0x3f59999a, float:0.85)
            r0.<init>(r1, r3, r1, r4)
            r5.debugColor = r0
            if (r6 == 0) goto L64
            if (r7 == 0) goto L5c
            r5.viewport = r6
            r5.batch = r7
            com.badlogic.gdx.scenes.scene2d.Group r7 = new com.badlogic.gdx.scenes.scene2d.Group
            r7.<init>()
            r5.root = r7
            r7.setStage(r5)
            com.badlogic.gdx.Graphics r7 = com.badlogic.gdx.Gdx.graphics
            int r7 = r7.getWidth()
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getHeight()
            r6.update(r7, r0, r2)
            return
        L5c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "batch cannot be null."
            r6.<init>(r7)
            throw r6
        L64:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "viewport cannot be null."
            r6.<init>(r7)
            throw r6
    }

    private void disableDebug(com.badlogic.gdx.scenes.scene2d.Actor r4, com.badlogic.gdx.scenes.scene2d.Actor r5) {
            r3 = this;
            if (r4 != r5) goto L3
            return
        L3:
            r0 = 0
            r4.setDebug(r0)
            boolean r1 = r4 instanceof com.badlogic.gdx.scenes.scene2d.Group
            if (r1 == 0) goto L1f
            com.badlogic.gdx.scenes.scene2d.Group r4 = (com.badlogic.gdx.scenes.scene2d.Group) r4
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r4 = r4.children
            int r1 = r4.size
        L11:
            if (r0 >= r1) goto L1f
            java.lang.Object r2 = r4.get(r0)
            com.badlogic.gdx.scenes.scene2d.Actor r2 = (com.badlogic.gdx.scenes.scene2d.Actor) r2
            r3.disableDebug(r2, r5)
            int r0 = r0 + 1
            goto L11
        L1f:
            return
    }

    private void drawDebug() {
            r4 = this;
            com.badlogic.gdx.graphics.glutils.ShapeRenderer r0 = r4.debugShapes
            r1 = 1
            if (r0 != 0) goto Lf
            com.badlogic.gdx.graphics.glutils.ShapeRenderer r0 = new com.badlogic.gdx.graphics.glutils.ShapeRenderer
            r0.<init>()
            r4.debugShapes = r0
            r0.setAutoShapeType(r1)
        Lf:
            boolean r0 = r4.debugUnderMouse
            if (r0 != 0) goto L28
            boolean r0 = r4.debugParentUnderMouse
            if (r0 != 0) goto L28
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r0 = r4.debugTableUnderMouse
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r2 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.none
            if (r0 == r2) goto L1e
            goto L28
        L1e:
            boolean r0 = r4.debugAll
            if (r0 == 0) goto L87
            com.badlogic.gdx.scenes.scene2d.Group r0 = r4.root
            r0.debugAll()
            goto L87
        L28:
            com.badlogic.gdx.math.Vector2 r0 = r4.tempCoords
            com.badlogic.gdx.Input r2 = com.badlogic.gdx.Gdx.input
            int r2 = r2.getX()
            float r2 = (float) r2
            com.badlogic.gdx.Input r3 = com.badlogic.gdx.Gdx.input
            int r3 = r3.getY()
            float r3 = (float) r3
            com.badlogic.gdx.math.Vector2 r0 = r0.set(r2, r3)
            r4.screenToStageCoordinates(r0)
            com.badlogic.gdx.math.Vector2 r0 = r4.tempCoords
            float r2 = r0.x
            float r0 = r0.y
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r4.hit(r2, r0, r1)
            if (r0 != 0) goto L4c
            return
        L4c:
            boolean r2 = r4.debugParentUnderMouse
            if (r2 == 0) goto L55
            com.badlogic.gdx.scenes.scene2d.Group r2 = r0.parent
            if (r2 == 0) goto L55
            r0 = r2
        L55:
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r2 = r4.debugTableUnderMouse
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r3 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.none
            if (r2 != r3) goto L5f
            r0.setDebug(r1)
            goto L74
        L5f:
            if (r0 == 0) goto L69
            boolean r1 = r0 instanceof com.badlogic.gdx.scenes.scene2d.ui.Table
            if (r1 == 0) goto L66
            goto L69
        L66:
            com.badlogic.gdx.scenes.scene2d.Group r0 = r0.parent
            goto L5f
        L69:
            if (r0 != 0) goto L6c
            return
        L6c:
            r1 = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = (com.badlogic.gdx.scenes.scene2d.ui.Table) r1
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r2 = r4.debugTableUnderMouse
            r1.debug(r2)
        L74:
            boolean r1 = r4.debugAll
            if (r1 == 0) goto L82
            boolean r1 = r0 instanceof com.badlogic.gdx.scenes.scene2d.Group
            if (r1 == 0) goto L82
            r1 = r0
            com.badlogic.gdx.scenes.scene2d.Group r1 = (com.badlogic.gdx.scenes.scene2d.Group) r1
            r1.debugAll()
        L82:
            com.badlogic.gdx.scenes.scene2d.Group r1 = r4.root
            r4.disableDebug(r1, r0)
        L87:
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 3042(0xbe2, float:4.263E-42)
            r0.glEnable(r1)
            com.badlogic.gdx.graphics.glutils.ShapeRenderer r0 = r4.debugShapes
            com.badlogic.gdx.utils.viewport.Viewport r2 = r4.viewport
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r0.setProjectionMatrix(r2)
            com.badlogic.gdx.graphics.glutils.ShapeRenderer r0 = r4.debugShapes
            r0.begin()
            com.badlogic.gdx.scenes.scene2d.Group r0 = r4.root
            com.badlogic.gdx.graphics.glutils.ShapeRenderer r2 = r4.debugShapes
            r0.drawDebug(r2)
            com.badlogic.gdx.graphics.glutils.ShapeRenderer r0 = r4.debugShapes
            r0.end()
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r0.glDisable(r1)
            return
    }

    private com.badlogic.gdx.scenes.scene2d.Actor fireEnterAndExit(com.badlogic.gdx.scenes.scene2d.Actor r3, int r4, int r5, int r6) {
            r2 = this;
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.InputEvent> r0 = com.badlogic.gdx.scenes.scene2d.InputEvent.class
            com.badlogic.gdx.math.Vector2 r1 = r2.tempCoords
            float r4 = (float) r4
            float r5 = (float) r5
            com.badlogic.gdx.math.Vector2 r4 = r1.set(r4, r5)
            r2.screenToStageCoordinates(r4)
            com.badlogic.gdx.math.Vector2 r4 = r2.tempCoords
            float r5 = r4.x
            float r4 = r4.y
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r2.hit(r5, r4, r1)
            if (r4 != r3) goto L1b
            return r3
        L1b:
            if (r3 == 0) goto L45
            java.lang.Object r5 = com.badlogic.gdx.utils.Pools.obtain(r0)
            com.badlogic.gdx.scenes.scene2d.InputEvent r5 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r5
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.exit
            r5.setType(r1)
            r5.setStage(r2)
            com.badlogic.gdx.math.Vector2 r1 = r2.tempCoords
            float r1 = r1.x
            r5.setStageX(r1)
            com.badlogic.gdx.math.Vector2 r1 = r2.tempCoords
            float r1 = r1.y
            r5.setStageY(r1)
            r5.setPointer(r6)
            r5.setRelatedActor(r4)
            r3.fire(r5)
            com.badlogic.gdx.utils.Pools.free(r5)
        L45:
            if (r4 == 0) goto L6f
            java.lang.Object r5 = com.badlogic.gdx.utils.Pools.obtain(r0)
            com.badlogic.gdx.scenes.scene2d.InputEvent r5 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r5
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r0 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.enter
            r5.setType(r0)
            r5.setStage(r2)
            com.badlogic.gdx.math.Vector2 r0 = r2.tempCoords
            float r0 = r0.x
            r5.setStageX(r0)
            com.badlogic.gdx.math.Vector2 r0 = r2.tempCoords
            float r0 = r0.y
            r5.setStageY(r0)
            r5.setPointer(r6)
            r5.setRelatedActor(r3)
            r4.fire(r5)
            com.badlogic.gdx.utils.Pools.free(r5)
        L6f:
            return r4
    }

    private void fireExit(com.badlogic.gdx.scenes.scene2d.Actor r2, int r3, int r4, int r5) {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1.tempCoords
            float r3 = (float) r3
            float r4 = (float) r4
            com.badlogic.gdx.math.Vector2 r3 = r0.set(r3, r4)
            r1.screenToStageCoordinates(r3)
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.InputEvent> r3 = com.badlogic.gdx.scenes.scene2d.InputEvent.class
            java.lang.Object r3 = com.badlogic.gdx.utils.Pools.obtain(r3)
            com.badlogic.gdx.scenes.scene2d.InputEvent r3 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r3
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r4 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.exit
            r3.setType(r4)
            r3.setStage(r1)
            com.badlogic.gdx.math.Vector2 r4 = r1.tempCoords
            float r4 = r4.x
            r3.setStageX(r4)
            com.badlogic.gdx.math.Vector2 r4 = r1.tempCoords
            float r4 = r4.y
            r3.setStageY(r4)
            r3.setPointer(r5)
            r3.setRelatedActor(r2)
            r2.fire(r3)
            com.badlogic.gdx.utils.Pools.free(r3)
            return
    }

    public void act(float r7) {
            r6 = this;
            com.badlogic.gdx.scenes.scene2d.Actor[] r0 = r6.pointerOverActors
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L32
            com.badlogic.gdx.scenes.scene2d.Actor[] r2 = r6.pointerOverActors
            r3 = r2[r1]
            boolean[] r4 = r6.pointerTouched
            boolean r4 = r4[r1]
            if (r4 == 0) goto L1f
            int[] r4 = r6.pointerScreenX
            r4 = r4[r1]
            int[] r5 = r6.pointerScreenY
            r5 = r5[r1]
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r6.fireEnterAndExit(r3, r4, r5, r1)
            r2[r1] = r3
            goto L2f
        L1f:
            if (r3 == 0) goto L2f
            r4 = 0
            r2[r1] = r4
            int[] r2 = r6.pointerScreenX
            r2 = r2[r1]
            int[] r4 = r6.pointerScreenY
            r4 = r4[r1]
            r6.fireExit(r3, r2, r4, r1)
        L2f:
            int r1 = r1 + 1
            goto L4
        L32:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r0 == r1) goto L44
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.Applet
            if (r0 == r1) goto L44
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.WebGL
            if (r0 != r1) goto L51
        L44:
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r6.mouseOverActor
            int r1 = r6.mouseScreenX
            int r2 = r6.mouseScreenY
            r3 = -1
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r6.fireEnterAndExit(r0, r1, r2, r3)
            r6.mouseOverActor = r0
        L51:
            com.badlogic.gdx.scenes.scene2d.Group r0 = r6.root
            r0.act(r7)
            return
    }

    protected void actorRemoved(com.badlogic.gdx.scenes.scene2d.Actor r6) {
            r5 = this;
            com.badlogic.gdx.scenes.scene2d.Actor[] r0 = r5.pointerOverActors
            int r0 = r0.length
            r1 = 0
        L4:
            r2 = 0
            if (r1 >= r0) goto L1d
            com.badlogic.gdx.scenes.scene2d.Actor[] r3 = r5.pointerOverActors
            r4 = r3[r1]
            if (r6 != r4) goto L1a
            r3[r1] = r2
            int[] r2 = r5.pointerScreenX
            r2 = r2[r1]
            int[] r3 = r5.pointerScreenY
            r3 = r3[r1]
            r5.fireExit(r6, r2, r3, r1)
        L1a:
            int r1 = r1 + 1
            goto L4
        L1d:
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r5.mouseOverActor
            if (r6 != r0) goto L2b
            r5.mouseOverActor = r2
            int r0 = r5.mouseScreenX
            int r1 = r5.mouseScreenY
            r2 = -1
            r5.fireExit(r6, r0, r1, r2)
        L2b:
            return
    }

    public void addActor(com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.root
            r0.addActor(r2)
            return
    }

    public boolean addCaptureListener(com.badlogic.gdx.scenes.scene2d.EventListener r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.root
            boolean r2 = r0.addCaptureListener(r2)
            return r2
    }

    public boolean addListener(com.badlogic.gdx.scenes.scene2d.EventListener r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.root
            boolean r2 = r0.addListener(r2)
            return r2
    }

    public void addTouchFocus(com.badlogic.gdx.scenes.scene2d.EventListener r2, com.badlogic.gdx.scenes.scene2d.Actor r3, com.badlogic.gdx.scenes.scene2d.Actor r4, int r5, int r6) {
            r1 = this;
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus> r0 = com.badlogic.gdx.scenes.scene2d.Stage.TouchFocus.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus r0 = (com.badlogic.gdx.scenes.scene2d.Stage.TouchFocus) r0
            r0.listenerActor = r3
            r0.target = r4
            r0.listener = r2
            r0.pointer = r5
            r0.button = r6
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus> r2 = r1.touchFocuses
            r2.add(r0)
            return
    }

    public void calculateScissors(com.badlogic.gdx.math.Rectangle r3, com.badlogic.gdx.math.Rectangle r4) {
            r2 = this;
            com.badlogic.gdx.graphics.glutils.ShapeRenderer r0 = r2.debugShapes
            if (r0 == 0) goto L11
            boolean r0 = r0.isDrawing()
            if (r0 == 0) goto L11
            com.badlogic.gdx.graphics.glutils.ShapeRenderer r0 = r2.debugShapes
            com.badlogic.gdx.math.Matrix4 r0 = r0.getTransformMatrix()
            goto L17
        L11:
            com.badlogic.gdx.graphics.g2d.Batch r0 = r2.batch
            com.badlogic.gdx.math.Matrix4 r0 = r0.getTransformMatrix()
        L17:
            com.badlogic.gdx.utils.viewport.Viewport r1 = r2.viewport
            r1.calculateScissors(r0, r3, r4)
            return
    }

    public void cancelTouchFocus() {
            r1 = this;
            r0 = 0
            r1.cancelTouchFocusExcept(r0, r0)
            return
    }

    public void cancelTouchFocus(com.badlogic.gdx.scenes.scene2d.Actor r8) {
            r7 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus> r0 = r7.touchFocuses
            java.lang.Object[] r1 = r0.begin()
            com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus[] r1 = (com.badlogic.gdx.scenes.scene2d.Stage.TouchFocus[]) r1
            int r2 = r0.size
            r3 = 0
            r4 = 0
        Lc:
            if (r4 >= r2) goto L53
            r5 = r1[r4]
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r5.listenerActor
            if (r6 == r8) goto L15
            goto L50
        L15:
            r6 = 1
            boolean r6 = r0.removeValue(r5, r6)
            if (r6 != 0) goto L1d
            goto L50
        L1d:
            if (r3 != 0) goto L37
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.InputEvent> r3 = com.badlogic.gdx.scenes.scene2d.InputEvent.class
            java.lang.Object r3 = com.badlogic.gdx.utils.Pools.obtain(r3)
            com.badlogic.gdx.scenes.scene2d.InputEvent r3 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r3
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r6 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchUp
            r3.setType(r6)
            r3.setStage(r7)
            r6 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            r3.setStageX(r6)
            r3.setStageY(r6)
        L37:
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r5.target
            r3.setTarget(r6)
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r5.listenerActor
            r3.setListenerActor(r6)
            int r6 = r5.pointer
            r3.setPointer(r6)
            int r6 = r5.button
            r3.setButton(r6)
            com.badlogic.gdx.scenes.scene2d.EventListener r5 = r5.listener
            r5.handle(r3)
        L50:
            int r4 = r4 + 1
            goto Lc
        L53:
            r0.end()
            if (r3 == 0) goto L5b
            com.badlogic.gdx.utils.Pools.free(r3)
        L5b:
            return
    }

    public void cancelTouchFocusExcept(com.badlogic.gdx.scenes.scene2d.EventListener r8, com.badlogic.gdx.scenes.scene2d.Actor r9) {
            r7 = this;
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.InputEvent> r0 = com.badlogic.gdx.scenes.scene2d.InputEvent.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            com.badlogic.gdx.scenes.scene2d.InputEvent r0 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r0
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchUp
            r0.setType(r1)
            r0.setStage(r7)
            r1 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            r0.setStageX(r1)
            r0.setStageY(r1)
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus> r1 = r7.touchFocuses
            java.lang.Object[] r2 = r1.begin()
            com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus[] r2 = (com.badlogic.gdx.scenes.scene2d.Stage.TouchFocus[]) r2
            int r3 = r1.size
            r4 = 0
        L23:
            if (r4 >= r3) goto L54
            r5 = r2[r4]
            com.badlogic.gdx.scenes.scene2d.EventListener r6 = r5.listener
            if (r6 != r8) goto L30
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r5.listenerActor
            if (r6 != r9) goto L30
            goto L51
        L30:
            r6 = 1
            boolean r6 = r1.removeValue(r5, r6)
            if (r6 != 0) goto L38
            goto L51
        L38:
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r5.target
            r0.setTarget(r6)
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r5.listenerActor
            r0.setListenerActor(r6)
            int r6 = r5.pointer
            r0.setPointer(r6)
            int r6 = r5.button
            r0.setButton(r6)
            com.badlogic.gdx.scenes.scene2d.EventListener r5 = r5.listener
            r5.handle(r0)
        L51:
            int r4 = r4 + 1
            goto L23
        L54:
            r1.end()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void clear() {
            r1 = this;
            r1.unfocusAll()
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.root
            r0.clear()
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r1.clear()
            boolean r0 = r1.ownsBatch
            if (r0 == 0) goto Lc
            com.badlogic.gdx.graphics.g2d.Batch r0 = r1.batch
            r0.dispose()
        Lc:
            com.badlogic.gdx.graphics.glutils.ShapeRenderer r0 = r1.debugShapes
            if (r0 == 0) goto L13
            r0.dispose()
        L13:
            return
    }

    public void draw() {
            r3 = this;
            com.badlogic.gdx.utils.viewport.Viewport r0 = r3.viewport
            com.badlogic.gdx.graphics.Camera r0 = r0.getCamera()
            r0.update()
            com.badlogic.gdx.scenes.scene2d.Group r1 = r3.root
            boolean r1 = r1.isVisible()
            if (r1 != 0) goto L12
            return
        L12:
            com.badlogic.gdx.graphics.g2d.Batch r1 = r3.batch
            com.badlogic.gdx.math.Matrix4 r0 = r0.combined
            r1.setProjectionMatrix(r0)
            r1.begin()
            com.badlogic.gdx.scenes.scene2d.Group r0 = r3.root
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.draw(r1, r2)
            r1.end()
            boolean r0 = com.badlogic.gdx.scenes.scene2d.Stage.debug
            if (r0 == 0) goto L2d
            r3.drawDebug()
        L2d:
            return
    }

    public boolean getActionsRequestRendering() {
            r1 = this;
            boolean r0 = r1.actionsRequestRendering
            return r0
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Actor> getActors() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.root
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r0.children
            return r0
    }

    public com.badlogic.gdx.graphics.g2d.Batch getBatch() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.Batch r0 = r1.batch
            return r0
    }

    public com.badlogic.gdx.graphics.Camera getCamera() {
            r1 = this;
            com.badlogic.gdx.utils.viewport.Viewport r0 = r1.viewport
            com.badlogic.gdx.graphics.Camera r0 = r0.getCamera()
            return r0
    }

    public com.badlogic.gdx.graphics.Color getDebugColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.debugColor
            return r0
    }

    public float getHeight() {
            r1 = this;
            com.badlogic.gdx.utils.viewport.Viewport r0 = r1.viewport
            float r0 = r0.getWorldHeight()
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Actor getKeyboardFocus() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.keyboardFocus
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Group getRoot() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.root
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Actor getScrollFocus() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.scrollFocus
            return r0
    }

    public com.badlogic.gdx.utils.viewport.Viewport getViewport() {
            r1 = this;
            com.badlogic.gdx.utils.viewport.Viewport r0 = r1.viewport
            return r0
    }

    public float getWidth() {
            r1 = this;
            com.badlogic.gdx.utils.viewport.Viewport r0 = r1.viewport
            float r0 = r0.getWorldWidth()
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Actor hit(float r3, float r4, boolean r5) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r2.root
            com.badlogic.gdx.math.Vector2 r1 = r2.tempCoords
            com.badlogic.gdx.math.Vector2 r3 = r1.set(r3, r4)
            r0.parentToLocalCoordinates(r3)
            com.badlogic.gdx.scenes.scene2d.Group r3 = r2.root
            com.badlogic.gdx.math.Vector2 r4 = r2.tempCoords
            float r0 = r4.x
            float r4 = r4.y
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.hit(r0, r4, r5)
            return r3
    }

    protected boolean isInsideViewport(int r7, int r8) {
            r6 = this;
            com.badlogic.gdx.utils.viewport.Viewport r0 = r6.viewport
            int r0 = r0.getScreenX()
            com.badlogic.gdx.utils.viewport.Viewport r1 = r6.viewport
            int r1 = r1.getScreenWidth()
            int r1 = r1 + r0
            com.badlogic.gdx.utils.viewport.Viewport r2 = r6.viewport
            int r2 = r2.getScreenY()
            com.badlogic.gdx.utils.viewport.Viewport r3 = r6.viewport
            int r3 = r3.getScreenHeight()
            int r3 = r3 + r2
            com.badlogic.gdx.Graphics r4 = com.badlogic.gdx.Gdx.graphics
            int r4 = r4.getHeight()
            r5 = 1
            int r4 = r4 - r5
            int r4 = r4 - r8
            if (r7 < r0) goto L2c
            if (r7 >= r1) goto L2c
            if (r4 < r2) goto L2c
            if (r4 >= r3) goto L2c
            goto L2d
        L2c:
            r5 = 0
        L2d:
            return r5
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean keyDown(int r4) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r3.keyboardFocus
            if (r0 != 0) goto L6
            com.badlogic.gdx.scenes.scene2d.Group r0 = r3.root
        L6:
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.InputEvent> r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.class
            java.lang.Object r1 = com.badlogic.gdx.utils.Pools.obtain(r1)
            com.badlogic.gdx.scenes.scene2d.InputEvent r1 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r1
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r2 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.keyDown
            r1.setType(r2)
            r1.setStage(r3)
            r1.setKeyCode(r4)
            r0.fire(r1)
            boolean r4 = r1.isHandled()
            com.badlogic.gdx.utils.Pools.free(r1)
            return r4
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean keyTyped(char r4) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r3.keyboardFocus
            if (r0 != 0) goto L6
            com.badlogic.gdx.scenes.scene2d.Group r0 = r3.root
        L6:
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.InputEvent> r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.class
            java.lang.Object r1 = com.badlogic.gdx.utils.Pools.obtain(r1)
            com.badlogic.gdx.scenes.scene2d.InputEvent r1 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r1
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r2 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.keyTyped
            r1.setType(r2)
            r1.setStage(r3)
            r1.setCharacter(r4)
            r0.fire(r1)
            boolean r4 = r1.isHandled()
            com.badlogic.gdx.utils.Pools.free(r1)
            return r4
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean keyUp(int r4) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r3.keyboardFocus
            if (r0 != 0) goto L6
            com.badlogic.gdx.scenes.scene2d.Group r0 = r3.root
        L6:
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.InputEvent> r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.class
            java.lang.Object r1 = com.badlogic.gdx.utils.Pools.obtain(r1)
            com.badlogic.gdx.scenes.scene2d.InputEvent r1 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r1
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r2 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.keyUp
            r1.setType(r2)
            r1.setStage(r3)
            r1.setKeyCode(r4)
            r0.fire(r1)
            boolean r4 = r1.isHandled()
            com.badlogic.gdx.utils.Pools.free(r1)
            return r4
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean mouseMoved(int r3, int r4) {
            r2 = this;
            r2.mouseScreenX = r3
            r2.mouseScreenY = r4
            boolean r0 = r2.isInsideViewport(r3, r4)
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            com.badlogic.gdx.math.Vector2 r0 = r2.tempCoords
            float r3 = (float) r3
            float r4 = (float) r4
            com.badlogic.gdx.math.Vector2 r3 = r0.set(r3, r4)
            r2.screenToStageCoordinates(r3)
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.InputEvent> r3 = com.badlogic.gdx.scenes.scene2d.InputEvent.class
            java.lang.Object r3 = com.badlogic.gdx.utils.Pools.obtain(r3)
            com.badlogic.gdx.scenes.scene2d.InputEvent r3 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r3
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r4 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.mouseMoved
            r3.setType(r4)
            r3.setStage(r2)
            com.badlogic.gdx.math.Vector2 r4 = r2.tempCoords
            float r4 = r4.x
            r3.setStageX(r4)
            com.badlogic.gdx.math.Vector2 r4 = r2.tempCoords
            float r4 = r4.y
            r3.setStageY(r4)
            com.badlogic.gdx.math.Vector2 r4 = r2.tempCoords
            float r0 = r4.x
            float r4 = r4.y
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r2.hit(r0, r4, r1)
            if (r4 != 0) goto L44
            com.badlogic.gdx.scenes.scene2d.Group r4 = r2.root
        L44:
            r4.fire(r3)
            boolean r4 = r3.isHandled()
            com.badlogic.gdx.utils.Pools.free(r3)
            return r4
    }

    public boolean removeCaptureListener(com.badlogic.gdx.scenes.scene2d.EventListener r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.root
            boolean r2 = r0.removeCaptureListener(r2)
            return r2
    }

    public boolean removeListener(com.badlogic.gdx.scenes.scene2d.EventListener r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.root
            boolean r2 = r0.removeListener(r2)
            return r2
    }

    public com.badlogic.gdx.math.Vector2 screenToStageCoordinates(com.badlogic.gdx.math.Vector2 r2) {
            r1 = this;
            com.badlogic.gdx.utils.viewport.Viewport r0 = r1.viewport
            r0.unproject(r2)
            return r2
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean scrolled(float r5, float r6) {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r4.scrollFocus
            if (r0 != 0) goto L6
            com.badlogic.gdx.scenes.scene2d.Group r0 = r4.root
        L6:
            com.badlogic.gdx.math.Vector2 r1 = r4.tempCoords
            int r2 = r4.mouseScreenX
            float r2 = (float) r2
            int r3 = r4.mouseScreenY
            float r3 = (float) r3
            com.badlogic.gdx.math.Vector2 r1 = r1.set(r2, r3)
            r4.screenToStageCoordinates(r1)
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.InputEvent> r1 = com.badlogic.gdx.scenes.scene2d.InputEvent.class
            java.lang.Object r1 = com.badlogic.gdx.utils.Pools.obtain(r1)
            com.badlogic.gdx.scenes.scene2d.InputEvent r1 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r1
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r2 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.scrolled
            r1.setType(r2)
            r1.setStage(r4)
            com.badlogic.gdx.math.Vector2 r2 = r4.tempCoords
            float r2 = r2.x
            r1.setStageX(r2)
            com.badlogic.gdx.math.Vector2 r2 = r4.tempCoords
            float r2 = r2.y
            r1.setStageY(r2)
            r1.setScrollAmountX(r5)
            r1.setScrollAmountY(r6)
            r0.fire(r1)
            boolean r5 = r1.isHandled()
            com.badlogic.gdx.utils.Pools.free(r1)
            return r5
    }

    public boolean setKeyboardFocus(com.badlogic.gdx.scenes.scene2d.Actor r5) {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r4.keyboardFocus
            r1 = 1
            if (r0 != r5) goto L6
            return r1
        L6:
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent> r0 = com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent r0 = (com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent) r0
            r0.setStage(r4)
            com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type r2 = com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type.keyboard
            r0.setType(r2)
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r4.keyboardFocus
            if (r2 == 0) goto L24
            r3 = 0
            r0.setFocused(r3)
            r0.setRelatedActor(r5)
            r2.fire(r0)
        L24:
            boolean r3 = r0.isCancelled()
            r3 = r3 ^ r1
            if (r3 == 0) goto L42
            r4.keyboardFocus = r5
            if (r5 == 0) goto L42
            r0.setFocused(r1)
            r0.setRelatedActor(r2)
            r5.fire(r0)
            boolean r5 = r0.isCancelled()
            r3 = r5 ^ 1
            if (r3 != 0) goto L42
            r4.keyboardFocus = r2
        L42:
            com.badlogic.gdx.utils.Pools.free(r0)
            return r3
    }

    public boolean setScrollFocus(com.badlogic.gdx.scenes.scene2d.Actor r5) {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r4.scrollFocus
            r1 = 1
            if (r0 != r5) goto L6
            return r1
        L6:
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent> r0 = com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent r0 = (com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent) r0
            r0.setStage(r4)
            com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type r2 = com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type.scroll
            r0.setType(r2)
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r4.scrollFocus
            if (r2 == 0) goto L24
            r3 = 0
            r0.setFocused(r3)
            r0.setRelatedActor(r5)
            r2.fire(r0)
        L24:
            boolean r3 = r0.isCancelled()
            r3 = r3 ^ r1
            if (r3 == 0) goto L42
            r4.scrollFocus = r5
            if (r5 == 0) goto L42
            r0.setFocused(r1)
            r0.setRelatedActor(r2)
            r5.fire(r0)
            boolean r5 = r0.isCancelled()
            r3 = r5 ^ 1
            if (r3 != 0) goto L42
            r4.scrollFocus = r2
        L42:
            com.badlogic.gdx.utils.Pools.free(r0)
            return r3
    }

    public void setViewport(com.badlogic.gdx.utils.viewport.Viewport r1) {
            r0 = this;
            r0.viewport = r1
            return
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean touchCancelled(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.cancelTouchFocus()
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchDown(int r3, int r4, int r5, int r6) {
            r2 = this;
            boolean r0 = r2.isInsideViewport(r3, r4)
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            boolean[] r0 = r2.pointerTouched
            r1 = 1
            r0[r5] = r1
            int[] r0 = r2.pointerScreenX
            r0[r5] = r3
            int[] r0 = r2.pointerScreenY
            r0[r5] = r4
            com.badlogic.gdx.math.Vector2 r0 = r2.tempCoords
            float r3 = (float) r3
            float r4 = (float) r4
            com.badlogic.gdx.math.Vector2 r3 = r0.set(r3, r4)
            r2.screenToStageCoordinates(r3)
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.InputEvent> r3 = com.badlogic.gdx.scenes.scene2d.InputEvent.class
            java.lang.Object r3 = com.badlogic.gdx.utils.Pools.obtain(r3)
            com.badlogic.gdx.scenes.scene2d.InputEvent r3 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r3
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r4 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchDown
            r3.setType(r4)
            r3.setStage(r2)
            com.badlogic.gdx.math.Vector2 r4 = r2.tempCoords
            float r4 = r4.x
            r3.setStageX(r4)
            com.badlogic.gdx.math.Vector2 r4 = r2.tempCoords
            float r4 = r4.y
            r3.setStageY(r4)
            r3.setPointer(r5)
            r3.setButton(r6)
            com.badlogic.gdx.math.Vector2 r4 = r2.tempCoords
            float r5 = r4.x
            float r4 = r4.y
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r2.hit(r5, r4, r1)
            if (r4 != 0) goto L60
            com.badlogic.gdx.scenes.scene2d.Group r4 = r2.root
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = r4.getTouchable()
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            if (r4 != r5) goto L63
            com.badlogic.gdx.scenes.scene2d.Group r4 = r2.root
            r4.fire(r3)
            goto L63
        L60:
            r4.fire(r3)
        L63:
            boolean r4 = r3.isHandled()
            com.badlogic.gdx.utils.Pools.free(r3)
            return r4
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchDragged(int r6, int r7, int r8) {
            r5 = this;
            int[] r0 = r5.pointerScreenX
            r0[r8] = r6
            int[] r0 = r5.pointerScreenY
            r0[r8] = r7
            r5.mouseScreenX = r6
            r5.mouseScreenY = r7
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus> r0 = r5.touchFocuses
            int r0 = r0.size
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            com.badlogic.gdx.math.Vector2 r0 = r5.tempCoords
            float r6 = (float) r6
            float r7 = (float) r7
            com.badlogic.gdx.math.Vector2 r6 = r0.set(r6, r7)
            r5.screenToStageCoordinates(r6)
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.InputEvent> r6 = com.badlogic.gdx.scenes.scene2d.InputEvent.class
            java.lang.Object r6 = com.badlogic.gdx.utils.Pools.obtain(r6)
            com.badlogic.gdx.scenes.scene2d.InputEvent r6 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r6
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r7 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchDragged
            r6.setType(r7)
            r6.setStage(r5)
            com.badlogic.gdx.math.Vector2 r7 = r5.tempCoords
            float r7 = r7.x
            r6.setStageX(r7)
            com.badlogic.gdx.math.Vector2 r7 = r5.tempCoords
            float r7 = r7.y
            r6.setStageY(r7)
            r6.setPointer(r8)
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus> r7 = r5.touchFocuses
            java.lang.Object[] r0 = r7.begin()
            com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus[] r0 = (com.badlogic.gdx.scenes.scene2d.Stage.TouchFocus[]) r0
            int r2 = r7.size
        L4a:
            if (r1 >= r2) goto L73
            r3 = r0[r1]
            int r4 = r3.pointer
            if (r4 == r8) goto L53
            goto L70
        L53:
            r4 = 1
            boolean r4 = r7.contains(r3, r4)
            if (r4 != 0) goto L5b
            goto L70
        L5b:
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r3.target
            r6.setTarget(r4)
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r3.listenerActor
            r6.setListenerActor(r4)
            com.badlogic.gdx.scenes.scene2d.EventListener r3 = r3.listener
            boolean r3 = r3.handle(r6)
            if (r3 == 0) goto L70
            r6.handle()
        L70:
            int r1 = r1 + 1
            goto L4a
        L73:
            r7.end()
            boolean r7 = r6.isHandled()
            com.badlogic.gdx.utils.Pools.free(r6)
            return r7
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchUp(int r6, int r7, int r8, int r9) {
            r5 = this;
            boolean[] r0 = r5.pointerTouched
            r1 = 0
            r0[r8] = r1
            int[] r0 = r5.pointerScreenX
            r0[r8] = r6
            int[] r0 = r5.pointerScreenY
            r0[r8] = r7
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus> r0 = r5.touchFocuses
            int r0 = r0.size
            if (r0 != 0) goto L14
            return r1
        L14:
            com.badlogic.gdx.math.Vector2 r0 = r5.tempCoords
            float r6 = (float) r6
            float r7 = (float) r7
            com.badlogic.gdx.math.Vector2 r6 = r0.set(r6, r7)
            r5.screenToStageCoordinates(r6)
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.InputEvent> r6 = com.badlogic.gdx.scenes.scene2d.InputEvent.class
            java.lang.Object r6 = com.badlogic.gdx.utils.Pools.obtain(r6)
            com.badlogic.gdx.scenes.scene2d.InputEvent r6 = (com.badlogic.gdx.scenes.scene2d.InputEvent) r6
            com.badlogic.gdx.scenes.scene2d.InputEvent$Type r7 = com.badlogic.gdx.scenes.scene2d.InputEvent.Type.touchUp
            r6.setType(r7)
            r6.setStage(r5)
            com.badlogic.gdx.math.Vector2 r7 = r5.tempCoords
            float r7 = r7.x
            r6.setStageX(r7)
            com.badlogic.gdx.math.Vector2 r7 = r5.tempCoords
            float r7 = r7.y
            r6.setStageY(r7)
            r6.setPointer(r8)
            r6.setButton(r9)
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus> r7 = r5.touchFocuses
            java.lang.Object[] r0 = r7.begin()
            com.badlogic.gdx.scenes.scene2d.Stage$TouchFocus[] r0 = (com.badlogic.gdx.scenes.scene2d.Stage.TouchFocus[]) r0
            int r2 = r7.size
        L4d:
            if (r1 >= r2) goto L7d
            r3 = r0[r1]
            int r4 = r3.pointer
            if (r4 != r8) goto L7a
            int r4 = r3.button
            if (r4 == r9) goto L5a
            goto L7a
        L5a:
            r4 = 1
            boolean r4 = r7.removeValue(r3, r4)
            if (r4 != 0) goto L62
            goto L7a
        L62:
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r3.target
            r6.setTarget(r4)
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r3.listenerActor
            r6.setListenerActor(r4)
            com.badlogic.gdx.scenes.scene2d.EventListener r4 = r3.listener
            boolean r4 = r4.handle(r6)
            if (r4 == 0) goto L77
            r6.handle()
        L77:
            com.badlogic.gdx.utils.Pools.free(r3)
        L7a:
            int r1 = r1 + 1
            goto L4d
        L7d:
            r7.end()
            boolean r7 = r6.isHandled()
            com.badlogic.gdx.utils.Pools.free(r6)
            return r7
    }

    public void unfocus(com.badlogic.gdx.scenes.scene2d.Actor r3) {
            r2 = this;
            r2.cancelTouchFocus(r3)
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r2.scrollFocus
            r1 = 0
            if (r0 == 0) goto L11
            boolean r0 = r0.isDescendantOf(r3)
            if (r0 == 0) goto L11
            r2.setScrollFocus(r1)
        L11:
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r2.keyboardFocus
            if (r0 == 0) goto L1e
            boolean r3 = r0.isDescendantOf(r3)
            if (r3 == 0) goto L1e
            r2.setKeyboardFocus(r1)
        L1e:
            return
    }

    public void unfocusAll() {
            r1 = this;
            r0 = 0
            r1.setScrollFocus(r0)
            r1.setKeyboardFocus(r0)
            r1.cancelTouchFocus()
            return
    }
}
