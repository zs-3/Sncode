package com.badlogic.gdx.scenes.scene2d;

/* loaded from: classes.dex */
public class Actor {
    private final com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> actions;
    private final com.badlogic.gdx.utils.DelayedRemovalArray<com.badlogic.gdx.scenes.scene2d.EventListener> captureListeners;
    final com.badlogic.gdx.graphics.Color color;
    private boolean debug;
    float height;
    private final com.badlogic.gdx.utils.DelayedRemovalArray<com.badlogic.gdx.scenes.scene2d.EventListener> listeners;
    private java.lang.String name;
    float originX;
    float originY;
    com.badlogic.gdx.scenes.scene2d.Group parent;
    float rotation;
    float scaleX;
    float scaleY;
    private com.badlogic.gdx.scenes.scene2d.Stage stage;
    private com.badlogic.gdx.scenes.scene2d.Touchable touchable;
    private java.lang.Object userObject;
    private boolean visible;
    float width;
    float x;
    float y;

    public Actor() {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.DelayedRemovalArray r0 = new com.badlogic.gdx.utils.DelayedRemovalArray
            r1 = 0
            r0.<init>(r1)
            r2.listeners = r0
            com.badlogic.gdx.utils.DelayedRemovalArray r0 = new com.badlogic.gdx.utils.DelayedRemovalArray
            r0.<init>(r1)
            r2.captureListeners = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>(r1)
            r2.actions = r0
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r2.touchable = r0
            r0 = 1
            r2.visible = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.scaleX = r0
            r2.scaleY = r0
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r0, r0, r0, r0)
            r2.color = r1
            return
    }

    public void act(float r8) {
            r7 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r0 = r7.actions
            int r1 = r0.size
            if (r1 != 0) goto L7
            return
        L7:
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r7.stage
            if (r1 == 0) goto L16
            boolean r1 = r1.getActionsRequestRendering()
            if (r1 == 0) goto L16
            com.badlogic.gdx.Graphics r1 = com.badlogic.gdx.Gdx.graphics
            r1.requestRendering()
        L16:
            r1 = 0
            r2 = 0
        L18:
            int r3 = r0.size     // Catch: java.lang.RuntimeException -> L4a
            if (r2 >= r3) goto L49
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.RuntimeException -> L4a
            com.badlogic.gdx.scenes.scene2d.Action r3 = (com.badlogic.gdx.scenes.scene2d.Action) r3     // Catch: java.lang.RuntimeException -> L4a
            boolean r4 = r3.act(r8)     // Catch: java.lang.RuntimeException -> L4a
            r5 = 1
            if (r4 == 0) goto L47
            int r4 = r0.size     // Catch: java.lang.RuntimeException -> L4a
            if (r2 >= r4) goto L47
            java.lang.Object r4 = r0.get(r2)     // Catch: java.lang.RuntimeException -> L4a
            com.badlogic.gdx.scenes.scene2d.Action r4 = (com.badlogic.gdx.scenes.scene2d.Action) r4     // Catch: java.lang.RuntimeException -> L4a
            if (r4 != r3) goto L37
            r4 = r2
            goto L3b
        L37:
            int r4 = r0.indexOf(r3, r5)     // Catch: java.lang.RuntimeException -> L4a
        L3b:
            r6 = -1
            if (r4 == r6) goto L47
            r0.removeIndex(r4)     // Catch: java.lang.RuntimeException -> L4a
            r4 = 0
            r3.setActor(r4)     // Catch: java.lang.RuntimeException -> L4a
            int r2 = r2 + (-1)
        L47:
            int r2 = r2 + r5
            goto L18
        L49:
            return
        L4a:
            r8 = move-exception
            java.lang.String r0 = r7.toString()
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Actor: "
            r3.append(r4)
            int r4 = r0.length()
            r5 = 128(0x80, float:1.794E-43)
            int r4 = java.lang.Math.min(r4, r5)
            java.lang.String r0 = r0.substring(r1, r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0, r8)
            throw r2
    }

    public void addAction(com.badlogic.gdx.scenes.scene2d.Action r2) {
            r1 = this;
            r2.setActor(r1)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r0 = r1.actions
            r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r1.stage
            if (r2 == 0) goto L17
            boolean r2 = r2.getActionsRequestRendering()
            if (r2 == 0) goto L17
            com.badlogic.gdx.Graphics r2 = com.badlogic.gdx.Gdx.graphics
            r2.requestRendering()
        L17:
            return
    }

    public boolean addCaptureListener(com.badlogic.gdx.scenes.scene2d.EventListener r3) {
            r2 = this;
            if (r3 == 0) goto L11
            com.badlogic.gdx.utils.DelayedRemovalArray<com.badlogic.gdx.scenes.scene2d.EventListener> r0 = r2.captureListeners
            r1 = 1
            boolean r0 = r0.contains(r3, r1)
            if (r0 != 0) goto L10
            com.badlogic.gdx.utils.DelayedRemovalArray<com.badlogic.gdx.scenes.scene2d.EventListener> r0 = r2.captureListeners
            r0.add(r3)
        L10:
            return r1
        L11:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "listener cannot be null."
            r3.<init>(r0)
            throw r3
    }

    public boolean addListener(com.badlogic.gdx.scenes.scene2d.EventListener r3) {
            r2 = this;
            if (r3 == 0) goto L13
            com.badlogic.gdx.utils.DelayedRemovalArray<com.badlogic.gdx.scenes.scene2d.EventListener> r0 = r2.listeners
            r1 = 1
            boolean r0 = r0.contains(r3, r1)
            if (r0 != 0) goto L11
            com.badlogic.gdx.utils.DelayedRemovalArray<com.badlogic.gdx.scenes.scene2d.EventListener> r0 = r2.listeners
            r0.add(r3)
            return r1
        L11:
            r3 = 0
            return r3
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "listener cannot be null."
            r3.<init>(r0)
            throw r3
    }

    public boolean ascendantsVisible() {
            r2 = this;
            r0 = r2
        L1:
            boolean r1 = r0.isVisible()
            if (r1 != 0) goto L9
            r0 = 0
            return r0
        L9:
            com.badlogic.gdx.scenes.scene2d.Group r0 = r0.parent
            if (r0 != 0) goto L1
            r0 = 1
            return r0
    }

    public void clear() {
            r0 = this;
            r0.clearActions()
            r0.clearListeners()
            return
    }

    public void clearActions() {
            r3 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r0 = r3.actions
            int r0 = r0.size
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L17
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r1 = r3.actions
            java.lang.Object r1 = r1.get(r0)
            com.badlogic.gdx.scenes.scene2d.Action r1 = (com.badlogic.gdx.scenes.scene2d.Action) r1
            r2 = 0
            r1.setActor(r2)
            int r0 = r0 + (-1)
            goto L6
        L17:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r0 = r3.actions
            r0.clear()
            return
    }

    public void clearListeners() {
            r1 = this;
            com.badlogic.gdx.utils.DelayedRemovalArray<com.badlogic.gdx.scenes.scene2d.EventListener> r0 = r1.listeners
            r0.clear()
            com.badlogic.gdx.utils.DelayedRemovalArray<com.badlogic.gdx.scenes.scene2d.EventListener> r0 = r1.captureListeners
            r0.clear()
            return
    }

    public boolean clipBegin() {
            r4 = this;
            float r0 = r4.x
            float r1 = r4.y
            float r2 = r4.width
            float r3 = r4.height
            boolean r0 = r4.clipBegin(r0, r1, r2, r3)
            return r0
    }

    public boolean clipBegin(float r4, float r5, float r6, float r7) {
            r3 = this;
            r0 = 0
            r1 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L30
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto Lb
            goto L30
        Lb:
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r3.stage
            if (r0 != 0) goto L10
            return r1
        L10:
            com.badlogic.gdx.math.Rectangle r2 = com.badlogic.gdx.math.Rectangle.tmp
            r2.x = r4
            r2.y = r5
            r2.width = r6
            r2.height = r7
            java.lang.Class<com.badlogic.gdx.math.Rectangle> r4 = com.badlogic.gdx.math.Rectangle.class
            java.lang.Object r4 = com.badlogic.gdx.utils.Pools.obtain(r4)
            com.badlogic.gdx.math.Rectangle r4 = (com.badlogic.gdx.math.Rectangle) r4
            r0.calculateScissors(r2, r4)
            boolean r5 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r4)
            if (r5 == 0) goto L2d
            r4 = 1
            return r4
        L2d:
            com.badlogic.gdx.utils.Pools.free(r4)
        L30:
            return r1
    }

    public void clipEnd() {
            r1 = this;
            com.badlogic.gdx.math.Rectangle r0 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void draw(com.badlogic.gdx.graphics.g2d.Batch r1, float r2) {
            r0 = this;
            return
    }

    public void drawDebug(com.badlogic.gdx.graphics.glutils.ShapeRenderer r1) {
            r0 = this;
            r0.drawDebugBounds(r1)
            return
    }

    protected void drawDebugBounds(com.badlogic.gdx.graphics.glutils.ShapeRenderer r12) {
            r11 = this;
            boolean r0 = r11.debug
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r0 = com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.Line
            r12.set(r0)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r11.stage
            if (r0 == 0) goto L15
            com.badlogic.gdx.graphics.Color r0 = r0.getDebugColor()
            r12.setColor(r0)
        L15:
            float r2 = r11.x
            float r3 = r11.y
            float r4 = r11.originX
            float r5 = r11.originY
            float r6 = r11.width
            float r7 = r11.height
            float r8 = r11.scaleX
            float r9 = r11.scaleY
            float r10 = r11.rotation
            r1 = r12
            r1.rect(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public boolean fire(com.badlogic.gdx.scenes.scene2d.Event r7) {
            r6 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r7.getStage()
            if (r0 != 0) goto Ld
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r6.getStage()
            r7.setStage(r0)
        Ld:
            r7.setTarget(r6)
            java.lang.Class<com.badlogic.gdx.utils.Array> r0 = com.badlogic.gdx.utils.Array.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            com.badlogic.gdx.utils.Array r0 = (com.badlogic.gdx.utils.Array) r0
            com.badlogic.gdx.scenes.scene2d.Group r1 = r6.parent
        L1a:
            if (r1 == 0) goto L22
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r1.parent
            goto L1a
        L22:
            T[] r1 = r0.items     // Catch: java.lang.Throwable -> L8c
            int r2 = r0.size     // Catch: java.lang.Throwable -> L8c
            r3 = 1
            int r2 = r2 - r3
        L28:
            if (r2 < 0) goto L45
            r4 = r1[r2]     // Catch: java.lang.Throwable -> L8c
            com.badlogic.gdx.scenes.scene2d.Group r4 = (com.badlogic.gdx.scenes.scene2d.Group) r4     // Catch: java.lang.Throwable -> L8c
            r4.notify(r7, r3)     // Catch: java.lang.Throwable -> L8c
            boolean r4 = r7.isStopped()     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L42
            boolean r7 = r7.isCancelled()     // Catch: java.lang.Throwable -> L8c
        L3b:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return r7
        L42:
            int r2 = r2 + (-1)
            goto L28
        L45:
            r6.notify(r7, r3)     // Catch: java.lang.Throwable -> L8c
            boolean r2 = r7.isStopped()     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L53
            boolean r7 = r7.isCancelled()     // Catch: java.lang.Throwable -> L8c
            goto L3b
        L53:
            r2 = 0
            r6.notify(r7, r2)     // Catch: java.lang.Throwable -> L8c
            boolean r3 = r7.getBubbles()     // Catch: java.lang.Throwable -> L8c
            if (r3 != 0) goto L62
            boolean r7 = r7.isCancelled()     // Catch: java.lang.Throwable -> L8c
            goto L3b
        L62:
            boolean r3 = r7.isStopped()     // Catch: java.lang.Throwable -> L8c
            if (r3 == 0) goto L6d
            boolean r7 = r7.isCancelled()     // Catch: java.lang.Throwable -> L8c
            goto L3b
        L6d:
            int r3 = r0.size     // Catch: java.lang.Throwable -> L8c
            r4 = 0
        L70:
            if (r4 >= r3) goto L87
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L8c
            com.badlogic.gdx.scenes.scene2d.Group r5 = (com.badlogic.gdx.scenes.scene2d.Group) r5     // Catch: java.lang.Throwable -> L8c
            r5.notify(r7, r2)     // Catch: java.lang.Throwable -> L8c
            boolean r5 = r7.isStopped()     // Catch: java.lang.Throwable -> L8c
            if (r5 == 0) goto L84
            boolean r7 = r7.isCancelled()     // Catch: java.lang.Throwable -> L8c
            goto L3b
        L84:
            int r4 = r4 + 1
            goto L70
        L87:
            boolean r7 = r7.isCancelled()     // Catch: java.lang.Throwable -> L8c
            goto L3b
        L8c:
            r7 = move-exception
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            throw r7
    }

    public com.badlogic.gdx.graphics.Color getColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            return r0
    }

    public boolean getDebug() {
            r1 = this;
            boolean r0 = r1.debug
            return r0
    }

    public float getHeight() {
            r1 = this;
            float r0 = r1.height
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public float getOriginX() {
            r1 = this;
            float r0 = r1.originX
            return r0
    }

    public float getOriginY() {
            r1 = this;
            float r0 = r1.originY
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Group getParent() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.parent
            return r0
    }

    public float getRight() {
            r2 = this;
            float r0 = r2.x
            float r1 = r2.width
            float r0 = r0 + r1
            return r0
    }

    public float getRotation() {
            r1 = this;
            float r0 = r1.rotation
            return r0
    }

    public float getScaleX() {
            r1 = this;
            float r0 = r1.scaleX
            return r0
    }

    public float getScaleY() {
            r1 = this;
            float r0 = r1.scaleY
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Stage getStage() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r1.stage
            return r0
    }

    public float getTop() {
            r2 = this;
            float r0 = r2.y
            float r1 = r2.height
            float r0 = r0 + r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Touchable getTouchable() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = r1.touchable
            return r0
    }

    public java.lang.Object getUserObject() {
            r1 = this;
            java.lang.Object r0 = r1.userObject
            return r0
    }

    public float getWidth() {
            r1 = this;
            float r0 = r1.width
            return r0
    }

    public float getX() {
            r1 = this;
            float r0 = r1.x
            return r0
    }

    public float getX(int r3) {
            r2 = this;
            float r0 = r2.x
            r1 = r3 & 16
            if (r1 == 0) goto La
            float r3 = r2.width
        L8:
            float r0 = r0 + r3
            goto L14
        La:
            r3 = r3 & 8
            if (r3 != 0) goto L14
            float r3 = r2.width
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r1
            goto L8
        L14:
            return r0
    }

    public float getY() {
            r1 = this;
            float r0 = r1.y
            return r0
    }

    public float getY(int r3) {
            r2 = this;
            float r0 = r2.y
            r1 = r3 & 2
            if (r1 == 0) goto La
            float r3 = r2.height
        L8:
            float r0 = r0 + r3
            goto L14
        La:
            r3 = r3 & 4
            if (r3 != 0) goto L14
            float r3 = r2.height
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r1
            goto L8
        L14:
            return r0
    }

    public boolean hasActions() {
            r1 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r0 = r1.actions
            int r0 = r0.size
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasKeyboardFocus() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r1.getStage()
            if (r0 == 0) goto Le
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getKeyboardFocus()
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean hasParent() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.parent
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Actor hit(float r3, float r4, boolean r5) {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto La
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = r2.touchable
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            if (r5 == r1) goto La
            return r0
        La:
            boolean r5 = r2.isVisible()
            if (r5 != 0) goto L11
            return r0
        L11:
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L27
            float r1 = r2.width
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 >= 0) goto L27
            int r3 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r3 < 0) goto L27
            float r3 = r2.height
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L27
            r0 = r2
        L27:
            return r0
    }

    public boolean isAscendantOf(com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r1 = this;
            if (r2 == 0) goto Lc
        L2:
            if (r2 != r1) goto L6
            r2 = 1
            return r2
        L6:
            com.badlogic.gdx.scenes.scene2d.Group r2 = r2.parent
            if (r2 != 0) goto L2
            r2 = 0
            return r2
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "actor cannot be null."
            r2.<init>(r0)
            throw r2
    }

    public boolean isDescendantOf(com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            r0 = r1
        L3:
            if (r0 != r2) goto L7
            r2 = 1
            return r2
        L7:
            com.badlogic.gdx.scenes.scene2d.Group r0 = r0.parent
            if (r0 != 0) goto L3
            r2 = 0
            return r2
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "actor cannot be null."
            r2.<init>(r0)
            throw r2
    }

    public boolean isTouchable() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = r2.touchable
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isVisible() {
            r1 = this;
            boolean r0 = r1.visible
            return r0
    }

    public com.badlogic.gdx.math.Vector2 localToAscendantCoordinates(com.badlogic.gdx.scenes.scene2d.Actor r3, com.badlogic.gdx.math.Vector2 r4) {
            r2 = this;
            r0 = r2
        L1:
            r0.localToParentCoordinates(r4)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r0.parent
            if (r0 != r3) goto L9
            return r4
        L9:
            if (r0 == 0) goto Lc
            goto L1
        Lc:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Actor is not an ascendant: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public com.badlogic.gdx.math.Vector2 localToParentCoordinates(com.badlogic.gdx.math.Vector2 r11) {
            r10 = this;
            float r0 = r10.rotation
            float r0 = -r0
            float r1 = r10.scaleX
            float r2 = r10.scaleY
            float r3 = r10.x
            float r4 = r10.y
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L3c
            r0 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r5 != 0) goto L25
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L25
            float r0 = r11.x
            float r0 = r0 + r3
            r11.x = r0
            float r0 = r11.y
            float r0 = r0 + r4
            r11.y = r0
            goto L6d
        L25:
            float r0 = r10.originX
            float r5 = r10.originY
            float r6 = r11.x
            float r6 = r6 - r0
            float r6 = r6 * r1
            float r6 = r6 + r0
            float r6 = r6 + r3
            r11.x = r6
            float r0 = r11.y
            float r0 = r0 - r5
            float r0 = r0 * r2
            float r0 = r0 + r5
            float r0 = r0 + r4
            r11.y = r0
            goto L6d
        L3c:
            r5 = 1016003125(0x3c8efa35, float:0.017453292)
            float r0 = r0 * r5
            double r5 = (double) r0
            double r7 = java.lang.Math.cos(r5)
            float r0 = (float) r7
            double r5 = java.lang.Math.sin(r5)
            float r5 = (float) r5
            float r6 = r10.originX
            float r7 = r10.originY
            float r8 = r11.x
            float r8 = r8 - r6
            float r8 = r8 * r1
            float r1 = r11.y
            float r1 = r1 - r7
            float r1 = r1 * r2
            float r2 = r8 * r0
            float r9 = r1 * r5
            float r2 = r2 + r9
            float r2 = r2 + r6
            float r2 = r2 + r3
            r11.x = r2
            float r2 = -r5
            float r8 = r8 * r2
            float r1 = r1 * r0
            float r8 = r8 + r1
            float r8 = r8 + r7
            float r8 = r8 + r4
            r11.y = r8
        L6d:
            return r11
    }

    public com.badlogic.gdx.math.Vector2 localToStageCoordinates(com.badlogic.gdx.math.Vector2 r2) {
            r1 = this;
            r0 = 0
            com.badlogic.gdx.math.Vector2 r2 = r1.localToAscendantCoordinates(r0, r2)
            return r2
    }

    public void moveBy(float r3, float r4) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 != 0) goto L9
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L16
        L9:
            float r0 = r2.x
            float r0 = r0 + r3
            r2.x = r0
            float r3 = r2.y
            float r3 = r3 + r4
            r2.y = r3
            r2.positionChanged()
        L16:
            return
    }

    public boolean notify(com.badlogic.gdx.scenes.scene2d.Event r6, boolean r7) {
            r5 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r6.getTarget()
            if (r0 == 0) goto L74
            if (r7 == 0) goto Lb
            com.badlogic.gdx.utils.DelayedRemovalArray<com.badlogic.gdx.scenes.scene2d.EventListener> r0 = r5.captureListeners
            goto Ld
        Lb:
            com.badlogic.gdx.utils.DelayedRemovalArray<com.badlogic.gdx.scenes.scene2d.EventListener> r0 = r5.listeners
        Ld:
            int r1 = r0.size
            if (r1 != 0) goto L16
            boolean r6 = r6.isCancelled()
            return r6
        L16:
            r6.setListenerActor(r5)
            r6.setCapture(r7)
            com.badlogic.gdx.scenes.scene2d.Stage r7 = r6.getStage()
            if (r7 != 0) goto L27
            com.badlogic.gdx.scenes.scene2d.Stage r7 = r5.stage
            r6.setStage(r7)
        L27:
            r7 = 0
            r0.begin()     // Catch: java.lang.RuntimeException -> L4a
            int r1 = r0.size     // Catch: java.lang.RuntimeException -> L4a
            r2 = 0
        L2e:
            if (r2 >= r1) goto L42
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.RuntimeException -> L4a
            com.badlogic.gdx.scenes.scene2d.EventListener r3 = (com.badlogic.gdx.scenes.scene2d.EventListener) r3     // Catch: java.lang.RuntimeException -> L4a
            boolean r3 = r3.handle(r6)     // Catch: java.lang.RuntimeException -> L4a
            if (r3 == 0) goto L3f
            r6.handle()     // Catch: java.lang.RuntimeException -> L4a
        L3f:
            int r2 = r2 + 1
            goto L2e
        L42:
            r0.end()     // Catch: java.lang.RuntimeException -> L4a
            boolean r6 = r6.isCancelled()
            return r6
        L4a:
            r6 = move-exception
            java.lang.String r0 = r5.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Actor: "
            r2.append(r3)
            int r3 = r0.length()
            r4 = 128(0x80, float:1.794E-43)
            int r3 = java.lang.Math.min(r3, r4)
            java.lang.String r7 = r0.substring(r7, r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r1.<init>(r7, r6)
            throw r1
        L74:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "The event target cannot be null."
            r6.<init>(r7)
            throw r6
    }

    public com.badlogic.gdx.math.Vector2 parentToLocalCoordinates(com.badlogic.gdx.math.Vector2 r11) {
            r10 = this;
            float r0 = r10.rotation
            float r1 = r10.scaleX
            float r2 = r10.scaleY
            float r3 = r10.x
            float r4 = r10.y
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L39
            r0 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r5 != 0) goto L24
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L24
            float r0 = r11.x
            float r0 = r0 - r3
            r11.x = r0
            float r0 = r11.y
            float r0 = r0 - r4
            r11.y = r0
            goto L68
        L24:
            float r0 = r10.originX
            float r5 = r10.originY
            float r6 = r11.x
            float r6 = r6 - r3
            float r6 = r6 - r0
            float r6 = r6 / r1
            float r6 = r6 + r0
            r11.x = r6
            float r0 = r11.y
            float r0 = r0 - r4
            float r0 = r0 - r5
            float r0 = r0 / r2
            float r0 = r0 + r5
            r11.y = r0
            goto L68
        L39:
            r5 = 1016003125(0x3c8efa35, float:0.017453292)
            float r0 = r0 * r5
            double r5 = (double) r0
            double r7 = java.lang.Math.cos(r5)
            float r0 = (float) r7
            double r5 = java.lang.Math.sin(r5)
            float r5 = (float) r5
            float r6 = r10.originX
            float r7 = r10.originY
            float r8 = r11.x
            float r8 = r8 - r3
            float r8 = r8 - r6
            float r3 = r11.y
            float r3 = r3 - r4
            float r3 = r3 - r7
            float r4 = r8 * r0
            float r9 = r3 * r5
            float r4 = r4 + r9
            float r4 = r4 / r1
            float r4 = r4 + r6
            r11.x = r4
            float r1 = -r5
            float r8 = r8 * r1
            float r3 = r3 * r0
            float r8 = r8 + r3
            float r8 = r8 / r2
            float r8 = r8 + r7
            r11.y = r8
        L68:
            return r11
    }

    protected void positionChanged() {
            r0 = this;
            return
    }

    public boolean remove() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r2.parent
            if (r0 == 0) goto La
            r1 = 1
            boolean r0 = r0.removeActor(r2, r1)
            return r0
        La:
            r0 = 0
            return r0
    }

    public void removeAction(com.badlogic.gdx.scenes.scene2d.Action r3) {
            r2 = this;
            if (r3 == 0) goto Lf
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r0 = r2.actions
            r1 = 1
            boolean r0 = r0.removeValue(r3, r1)
            if (r0 == 0) goto Lf
            r0 = 0
            r3.setActor(r0)
        Lf:
            return
    }

    public boolean removeCaptureListener(com.badlogic.gdx.scenes.scene2d.EventListener r3) {
            r2 = this;
            if (r3 == 0) goto La
            com.badlogic.gdx.utils.DelayedRemovalArray<com.badlogic.gdx.scenes.scene2d.EventListener> r0 = r2.captureListeners
            r1 = 1
            boolean r3 = r0.removeValue(r3, r1)
            return r3
        La:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "listener cannot be null."
            r3.<init>(r0)
            throw r3
    }

    public boolean removeListener(com.badlogic.gdx.scenes.scene2d.EventListener r3) {
            r2 = this;
            if (r3 == 0) goto La
            com.badlogic.gdx.utils.DelayedRemovalArray<com.badlogic.gdx.scenes.scene2d.EventListener> r0 = r2.listeners
            r1 = 1
            boolean r3 = r0.removeValue(r3, r1)
            return r3
        La:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "listener cannot be null."
            r3.<init>(r0)
            throw r3
    }

    public void rotateBy(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L10
            float r0 = r1.rotation
            float r0 = r0 + r2
            r2 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 % r2
            r1.rotation = r0
            r1.rotationChanged()
        L10:
            return
    }

    protected void rotationChanged() {
            r0 = this;
            return
    }

    public void scaleBy(float r3, float r4) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 != 0) goto L9
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L16
        L9:
            float r0 = r2.scaleX
            float r0 = r0 + r3
            r2.scaleX = r0
            float r3 = r2.scaleY
            float r3 = r3 + r4
            r2.scaleY = r3
            r2.scaleChanged()
        L16:
            return
    }

    protected void scaleChanged() {
            r0 = this;
            return
    }

    public void setBounds(float r2, float r3, float r4, float r5) {
            r1 = this;
            float r0 = r1.x
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lc
            float r0 = r1.y
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L13
        Lc:
            r1.x = r2
            r1.y = r3
            r1.positionChanged()
        L13:
            float r2 = r1.width
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L1f
            float r2 = r1.height
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L26
        L1f:
            r1.width = r4
            r1.height = r5
            r1.sizeChanged()
        L26:
            return
    }

    public void setColor(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            r0.set(r2, r3, r4, r5)
            return
    }

    public void setColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            r0.set(r2)
            return
    }

    public void setDebug(boolean r1) {
            r0 = this;
            r0.debug = r1
            if (r1 == 0) goto L7
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.Stage.debug = r1
        L7:
            return
    }

    public void setHeight(float r2) {
            r1 = this;
            float r0 = r1.height
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.height = r2
            r1.sizeChanged()
        Lb:
            return
    }

    public void setOrigin(float r1, float r2) {
            r0 = this;
            r0.originX = r1
            r0.originY = r2
            return
    }

    public void setOrigin(int r4) {
            r3 = this;
            r0 = r4 & 8
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            if (r0 == 0) goto La
            r3.originX = r2
            goto L18
        La:
            r0 = r4 & 16
            if (r0 == 0) goto L13
            float r0 = r3.width
            r3.originX = r0
            goto L18
        L13:
            float r0 = r3.width
            float r0 = r0 / r1
            r3.originX = r0
        L18:
            r0 = r4 & 4
            if (r0 == 0) goto L1f
            r3.originY = r2
            goto L2d
        L1f:
            r4 = r4 & 2
            if (r4 == 0) goto L28
            float r4 = r3.height
            r3.originY = r4
            goto L2d
        L28:
            float r4 = r3.height
            float r4 = r4 / r1
            r3.originY = r4
        L2d:
            return
    }

    public void setOriginY(float r1) {
            r0 = this;
            r0.originY = r1
            return
    }

    protected void setParent(com.badlogic.gdx.scenes.scene2d.Group r1) {
            r0 = this;
            r0.parent = r1
            return
    }

    public void setPosition(float r2, float r3) {
            r1 = this;
            float r0 = r1.x
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lc
            float r0 = r1.y
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L13
        Lc:
            r1.x = r2
            r1.y = r3
            r1.positionChanged()
        L13:
            return
    }

    public void setPosition(float r3, float r4, int r5) {
            r2 = this;
            r0 = r5 & 16
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto La
            float r0 = r2.width
        L8:
            float r3 = r3 - r0
            goto L12
        La:
            r0 = r5 & 8
            if (r0 != 0) goto L12
            float r0 = r2.width
            float r0 = r0 / r1
            goto L8
        L12:
            r0 = r5 & 2
            if (r0 == 0) goto L1a
            float r5 = r2.height
        L18:
            float r4 = r4 - r5
            goto L22
        L1a:
            r5 = r5 & 4
            if (r5 != 0) goto L22
            float r5 = r2.height
            float r5 = r5 / r1
            goto L18
        L22:
            float r5 = r2.x
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L2e
            float r5 = r2.y
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 == 0) goto L35
        L2e:
            r2.x = r3
            r2.y = r4
            r2.positionChanged()
        L35:
            return
    }

    public void setRotation(float r2) {
            r1 = this;
            float r0 = r1.rotation
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.rotation = r2
            r1.rotationChanged()
        Lb:
            return
    }

    public void setScale(float r2) {
            r1 = this;
            float r0 = r1.scaleX
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lc
            float r0 = r1.scaleY
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
        Lc:
            r1.scaleX = r2
            r1.scaleY = r2
            r1.scaleChanged()
        L13:
            return
    }

    public void setScale(float r2, float r3) {
            r1 = this;
            float r0 = r1.scaleX
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lc
            float r0 = r1.scaleY
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L13
        Lc:
            r1.scaleX = r2
            r1.scaleY = r3
            r1.scaleChanged()
        L13:
            return
    }

    public void setScaleY(float r2) {
            r1 = this;
            float r0 = r1.scaleY
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.scaleY = r2
            r1.scaleChanged()
        Lb:
            return
    }

    public void setSize(float r2, float r3) {
            r1 = this;
            float r0 = r1.width
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lc
            float r0 = r1.height
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L13
        Lc:
            r1.width = r2
            r1.height = r3
            r1.sizeChanged()
        L13:
            return
    }

    protected void setStage(com.badlogic.gdx.scenes.scene2d.Stage r1) {
            r0 = this;
            r0.stage = r1
            return
    }

    public void setTouchable(com.badlogic.gdx.scenes.scene2d.Touchable r1) {
            r0 = this;
            r0.touchable = r1
            return
    }

    public void setUserObject(java.lang.Object r1) {
            r0 = this;
            r0.userObject = r1
            return
    }

    public void setVisible(boolean r1) {
            r0 = this;
            r0.visible = r1
            return
    }

    public void setWidth(float r2) {
            r1 = this;
            float r0 = r1.width
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.width = r2
            r1.sizeChanged()
        Lb:
            return
    }

    public void setX(float r2) {
            r1 = this;
            float r0 = r1.x
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.x = r2
            r1.positionChanged()
        Lb:
            return
    }

    public void setY(float r2) {
            r1 = this;
            float r0 = r1.y
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.y = r2
            r1.positionChanged()
        Lb:
            return
    }

    public boolean setZIndex(int r5) {
            r4 = this;
            if (r5 < 0) goto L27
            com.badlogic.gdx.scenes.scene2d.Group r0 = r4.parent
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.scenes.scene2d.Actor> r0 = r0.children
            int r2 = r0.size
            r3 = 1
            if (r2 > r3) goto L10
            return r1
        L10:
            int r2 = r2 - r3
            int r5 = java.lang.Math.min(r5, r2)
            java.lang.Object r2 = r0.get(r5)
            if (r2 != r4) goto L1c
            return r1
        L1c:
            boolean r2 = r0.removeValue(r4, r3)
            if (r2 != 0) goto L23
            return r1
        L23:
            r0.insert(r5, r4)
            return r3
        L27:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ZIndex cannot be < 0."
            r5.<init>(r0)
            throw r5
    }

    protected void sizeChanged() {
            r0 = this;
            return
    }

    public com.badlogic.gdx.math.Vector2 stageToLocalCoordinates(com.badlogic.gdx.math.Vector2 r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.parent
            if (r0 == 0) goto L7
            r0.stageToLocalCoordinates(r2)
        L7:
            r1.parentToLocalCoordinates(r2)
            return r2
    }

    public void toFront() {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.setZIndex(r0)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.name
            if (r0 != 0) goto L1b
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            r2 = -1
            if (r1 == r2) goto L1b
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L1b:
            return r0
    }
}
