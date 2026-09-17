package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class ScrollPane extends com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup {
    private com.badlogic.gdx.scenes.scene2d.Actor actor;
    final com.badlogic.gdx.math.Rectangle actorArea;
    private final com.badlogic.gdx.math.Rectangle actorCullingArea;
    float amountX;
    float amountY;
    boolean cancelTouchFocus;
    private boolean clamp;
    boolean disableX;
    boolean disableY;
    int draggingPointer;
    float fadeAlpha;
    float fadeAlphaSeconds;
    float fadeDelay;
    float fadeDelaySeconds;
    boolean fadeScrollBars;
    boolean flickScroll;
    private com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener flickScrollListener;
    float flingTime;
    float flingTimer;
    private boolean forceScrollX;
    private boolean forceScrollY;
    final com.badlogic.gdx.math.Rectangle hKnobBounds;
    final com.badlogic.gdx.math.Rectangle hScrollBounds;
    boolean hScrollOnBottom;
    final com.badlogic.gdx.math.Vector2 lastPoint;
    float maxX;
    float maxY;
    private float overscrollDistance;
    private float overscrollSpeedMax;
    private float overscrollSpeedMin;
    private boolean overscrollX;
    private boolean overscrollY;
    boolean scrollBarTouch;
    boolean scrollX;
    boolean scrollY;
    private boolean scrollbarsOnTop;
    boolean smoothScrolling;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle style;
    boolean touchScrollH;
    boolean touchScrollV;
    final com.badlogic.gdx.math.Rectangle vKnobBounds;
    final com.badlogic.gdx.math.Rectangle vScrollBounds;
    boolean vScrollOnRight;
    private boolean variableSizeKnobs;
    float velocityX;
    float velocityY;
    float visualAmountX;
    float visualAmountY;




    public static class ScrollPaneStyle {
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable background;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable corner;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable hScroll;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable hScrollKnob;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable vScroll;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable vScrollKnob;

        public ScrollPaneStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        public ScrollPaneStyle(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle r2) {
                r1 = this;
                r1.<init>()
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.background
                r1.background = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.corner
                r1.corner = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.hScroll
                r1.hScroll = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.hScrollKnob
                r1.hScrollKnob = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.vScroll
                r1.vScroll = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.vScrollKnob
                r1.vScrollKnob = r2
                return
        }
    }

    public ScrollPane(com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public ScrollPane(com.badlogic.gdx.scenes.scene2d.Actor r3, com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle r4) {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            r2.actorArea = r0
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            r2.hScrollBounds = r0
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            r2.hKnobBounds = r0
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            r2.vScrollBounds = r0
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            r2.vKnobBounds = r0
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            r2.actorCullingArea = r0
            r0 = 1
            r2.vScrollOnRight = r0
            r2.hScrollOnBottom = r0
            com.badlogic.gdx.math.Vector2 r1 = new com.badlogic.gdx.math.Vector2
            r1.<init>()
            r2.lastPoint = r1
            r2.fadeScrollBars = r0
            r2.smoothScrolling = r0
            r2.scrollBarTouch = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.fadeAlphaSeconds = r1
            r2.fadeDelaySeconds = r1
            r2.cancelTouchFocus = r0
            r2.flickScroll = r0
            r2.flingTime = r1
            r2.overscrollX = r0
            r2.overscrollY = r0
            r1 = 1112014848(0x42480000, float:50.0)
            r2.overscrollDistance = r1
            r1 = 1106247680(0x41f00000, float:30.0)
            r2.overscrollSpeedMin = r1
            r1 = 1128792064(0x43480000, float:200.0)
            r2.overscrollSpeedMax = r1
            r2.clamp = r0
            r2.variableSizeKnobs = r0
            r0 = -1
            r2.draggingPointer = r0
            if (r4 == 0) goto L7e
            r2.style = r4
            r2.setActor(r3)
            r3 = 1125515264(0x43160000, float:150.0)
            r2.setSize(r3, r3)
            r2.addCaptureListener()
            com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener r3 = r2.getFlickScrollListener()
            r2.flickScrollListener = r3
            r2.addListener(r3)
            r2.addScrollListener()
            return
        L7e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "style cannot be null."
            r3.<init>(r4)
            throw r3
    }

    private void updateActorPosition() {
            r6 = this;
            com.badlogic.gdx.math.Rectangle r0 = r6.actorArea
            float r1 = r0.x
            boolean r2 = r6.scrollX
            if (r2 == 0) goto Lc
            float r2 = r6.visualAmountX
            int r2 = (int) r2
            goto Ld
        Lc:
            r2 = 0
        Ld:
            float r2 = (float) r2
            float r1 = r1 - r2
            float r0 = r0.y
            boolean r2 = r6.scrollY
            if (r2 == 0) goto L1b
            float r2 = r6.maxY
            float r3 = r6.visualAmountY
            float r2 = r2 - r3
            goto L1d
        L1b:
            float r2 = r6.maxY
        L1d:
            int r2 = (int) r2
            float r2 = (float) r2
            float r0 = r0 - r2
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r6.actor
            r2.setPosition(r1, r0)
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r6.actor
            boolean r3 = r2 instanceof com.badlogic.gdx.scenes.scene2d.utils.Cullable
            if (r3 == 0) goto L46
            com.badlogic.gdx.math.Rectangle r3 = r6.actorCullingArea
            com.badlogic.gdx.math.Rectangle r4 = r6.actorArea
            float r5 = r4.x
            float r5 = r5 - r1
            r3.x = r5
            float r1 = r4.y
            float r1 = r1 - r0
            r3.y = r1
            float r0 = r4.width
            r3.width = r0
            float r0 = r4.height
            r3.height = r0
            com.badlogic.gdx.scenes.scene2d.utils.Cullable r2 = (com.badlogic.gdx.scenes.scene2d.utils.Cullable) r2
            r2.setCullingArea(r3)
        L46:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r10) {
            r9 = this;
            super.act(r10)
            com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener r0 = r9.flickScrollListener
            com.badlogic.gdx.input.GestureDetector r0 = r0.getGestureDetector()
            boolean r0 = r0.isPanning()
            float r1 = r9.fadeAlpha
            r2 = 1
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L35
            boolean r4 = r9.fadeScrollBars
            if (r4 == 0) goto L35
            if (r0 != 0) goto L35
            boolean r4 = r9.touchScrollH
            if (r4 != 0) goto L35
            boolean r4 = r9.touchScrollV
            if (r4 != 0) goto L35
            float r4 = r9.fadeDelay
            float r4 = r4 - r10
            r9.fadeDelay = r4
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L33
            float r1 = r1 - r10
            float r1 = java.lang.Math.max(r3, r1)
            r9.fadeAlpha = r1
        L33:
            r1 = 1
            goto L36
        L35:
            r1 = 0
        L36:
            float r4 = r9.flingTimer
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 <= 0) goto L91
            r9.setScrollbarsVisible(r2)
            float r1 = r9.flingTimer
            float r4 = r9.flingTime
            float r1 = r1 / r4
            float r4 = r9.amountX
            float r5 = r9.velocityX
            float r5 = r5 * r1
            float r5 = r5 * r10
            float r4 = r4 - r5
            r9.amountX = r4
            float r4 = r9.amountY
            float r5 = r9.velocityY
            float r5 = r5 * r1
            float r5 = r5 * r10
            float r4 = r4 - r5
            r9.amountY = r4
            r9.clamp()
            float r1 = r9.amountX
            float r4 = r9.overscrollDistance
            float r5 = -r4
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L68
            r9.velocityX = r3
        L68:
            float r5 = r9.maxX
            float r5 = r5 + r4
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto L71
            r9.velocityX = r3
        L71:
            float r1 = r9.amountY
            float r5 = -r4
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L7a
            r9.velocityY = r3
        L7a:
            float r5 = r9.maxY
            float r5 = r5 + r4
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto L83
            r9.velocityY = r3
        L83:
            float r1 = r9.flingTimer
            float r1 = r1 - r10
            r9.flingTimer = r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L90
            r9.velocityX = r3
            r9.velocityY = r3
        L90:
            r1 = 1
        L91:
            boolean r4 = r9.smoothScrolling
            if (r4 == 0) goto L14d
            float r4 = r9.flingTimer
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L14d
            if (r0 != 0) goto L14d
            boolean r4 = r9.touchScrollH
            r5 = 1036831949(0x3dcccccd, float:0.1)
            if (r4 == 0) goto Lbe
            boolean r4 = r9.scrollX
            if (r4 == 0) goto L14d
            float r4 = r9.maxX
            com.badlogic.gdx.math.Rectangle r6 = r9.hScrollBounds
            float r6 = r6.width
            com.badlogic.gdx.math.Rectangle r7 = r9.hKnobBounds
            float r7 = r7.width
            float r6 = r6 - r7
            float r4 = r4 / r6
            com.badlogic.gdx.math.Rectangle r6 = r9.actorArea
            float r6 = r6.width
            float r6 = r6 * r5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L14d
        Lbe:
            boolean r4 = r9.touchScrollV
            if (r4 == 0) goto Ldc
            boolean r4 = r9.scrollY
            if (r4 == 0) goto L14d
            float r4 = r9.maxY
            com.badlogic.gdx.math.Rectangle r6 = r9.vScrollBounds
            float r6 = r6.height
            com.badlogic.gdx.math.Rectangle r7 = r9.vKnobBounds
            float r7 = r7.height
            float r6 = r6 - r7
            float r4 = r4 / r6
            com.badlogic.gdx.math.Rectangle r6 = r9.actorArea
            float r6 = r6.height
            float r6 = r6 * r5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L14d
        Ldc:
            float r4 = r9.visualAmountX
            float r5 = r9.amountX
            r6 = 1088421888(0x40e00000, float:7.0)
            r7 = 1128792064(0x43480000, float:200.0)
            int r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r8 == 0) goto L116
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r1 >= 0) goto L101
            float r1 = r10 * r7
            float r8 = r5 - r4
            float r8 = r8 * r6
            float r8 = r8 * r10
            float r1 = java.lang.Math.max(r1, r8)
            float r4 = r4 + r1
            float r1 = java.lang.Math.min(r5, r4)
            r9.visualScrollX(r1)
            goto L115
        L101:
            float r1 = r10 * r7
            float r8 = r4 - r5
            float r8 = r8 * r6
            float r8 = r8 * r10
            float r1 = java.lang.Math.max(r1, r8)
            float r4 = r4 - r1
            float r1 = java.lang.Math.max(r5, r4)
            r9.visualScrollX(r1)
        L115:
            r1 = 1
        L116:
            float r4 = r9.visualAmountY
            float r5 = r9.amountY
            int r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r8 == 0) goto L163
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r1 >= 0) goto L137
            float r7 = r7 * r10
            float r1 = r5 - r4
            float r1 = r1 * r6
            float r1 = r1 * r10
            float r1 = java.lang.Math.max(r7, r1)
            float r4 = r4 + r1
            float r1 = java.lang.Math.min(r5, r4)
            r9.visualScrollY(r1)
            goto L14b
        L137:
            float r7 = r7 * r10
            float r1 = r4 - r5
            float r1 = r1 * r6
            float r1 = r1 * r10
            float r1 = java.lang.Math.max(r7, r1)
            float r4 = r4 - r1
            float r1 = java.lang.Math.max(r5, r4)
            r9.visualScrollY(r1)
        L14b:
            r1 = 1
            goto L163
        L14d:
            float r4 = r9.visualAmountX
            float r5 = r9.amountX
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L158
            r9.visualScrollX(r5)
        L158:
            float r4 = r9.visualAmountY
            float r5 = r9.amountY
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L163
            r9.visualScrollY(r5)
        L163:
            if (r0 != 0) goto L20e
            boolean r0 = r9.overscrollX
            if (r0 == 0) goto L1ba
            boolean r0 = r9.scrollX
            if (r0 == 0) goto L1ba
            float r0 = r9.amountX
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 >= 0) goto L192
            r9.setScrollbarsVisible(r2)
            float r0 = r9.amountX
            float r1 = r9.overscrollSpeedMin
            float r4 = r9.overscrollSpeedMax
            float r4 = r4 - r1
            float r5 = -r0
            float r4 = r4 * r5
            float r5 = r9.overscrollDistance
            float r4 = r4 / r5
            float r1 = r1 + r4
            float r1 = r1 * r10
            float r0 = r0 + r1
            r9.amountX = r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L190
            r9.scrollX(r3)
        L190:
            r1 = 1
            goto L1ba
        L192:
            float r4 = r9.maxX
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1ba
            r9.setScrollbarsVisible(r2)
            float r0 = r9.amountX
            float r1 = r9.overscrollSpeedMin
            float r4 = r9.overscrollSpeedMax
            float r4 = r4 - r1
            float r5 = r9.maxX
            float r6 = r5 - r0
            float r6 = -r6
            float r4 = r4 * r6
            float r6 = r9.overscrollDistance
            float r4 = r4 / r6
            float r1 = r1 + r4
            float r1 = r1 * r10
            float r0 = r0 - r1
            r9.amountX = r0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L190
            r9.scrollX(r5)
            goto L190
        L1ba:
            boolean r0 = r9.overscrollY
            if (r0 == 0) goto L20e
            boolean r0 = r9.scrollY
            if (r0 == 0) goto L20e
            float r0 = r9.amountY
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 >= 0) goto L1e6
            r9.setScrollbarsVisible(r2)
            float r0 = r9.amountY
            float r1 = r9.overscrollSpeedMin
            float r4 = r9.overscrollSpeedMax
            float r4 = r4 - r1
            float r5 = -r0
            float r4 = r4 * r5
            float r5 = r9.overscrollDistance
            float r4 = r4 / r5
            float r1 = r1 + r4
            float r1 = r1 * r10
            float r0 = r0 + r1
            r9.amountY = r0
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 <= 0) goto L20f
            r9.scrollY(r3)
            goto L20f
        L1e6:
            float r3 = r9.maxY
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L20e
            r9.setScrollbarsVisible(r2)
            float r0 = r9.amountY
            float r1 = r9.overscrollSpeedMin
            float r3 = r9.overscrollSpeedMax
            float r3 = r3 - r1
            float r4 = r9.maxY
            float r5 = r4 - r0
            float r5 = -r5
            float r3 = r3 * r5
            float r5 = r9.overscrollDistance
            float r3 = r3 / r5
            float r1 = r1 + r3
            float r1 = r1 * r10
            float r0 = r0 - r1
            r9.amountY = r0
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 >= 0) goto L20f
            r9.scrollY(r4)
            goto L20f
        L20e:
            r2 = r1
        L20f:
            if (r2 == 0) goto L222
            com.badlogic.gdx.scenes.scene2d.Stage r10 = r9.getStage()
            if (r10 == 0) goto L222
            boolean r10 = r10.getActionsRequestRendering()
            if (r10 == 0) goto L222
            com.badlogic.gdx.Graphics r10 = com.badlogic.gdx.Gdx.graphics
            r10.requestRendering()
        L222:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    @java.lang.Deprecated
    public void addActor(com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Use ScrollPane#setActor."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    @java.lang.Deprecated
    public void addActorAt(int r1, com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Use ScrollPane#setActor."
            r1.<init>(r2)
            throw r1
    }

    protected void addCaptureListener() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$1 r0 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$1
            r0.<init>(r1)
            r1.addCaptureListener(r0)
            return
    }

    protected void addScrollListener() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$3 r0 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$3
            r0.<init>(r1)
            r1.addListener(r0)
            return
    }

    public void cancel() {
            r1 = this;
            r0 = -1
            r1.draggingPointer = r0
            r0 = 0
            r1.touchScrollH = r0
            r1.touchScrollV = r0
            com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener r0 = r1.flickScrollListener
            com.badlogic.gdx.input.GestureDetector r0 = r0.getGestureDetector()
            r0.cancel()
            return
    }

    public void cancelTouchFocus() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
            if (r0 == 0) goto Lb
            com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener r1 = r2.flickScrollListener
            r0.cancelTouchFocusExcept(r1, r2)
        Lb:
            return
    }

    void clamp() {
            r5 = this;
            boolean r0 = r5.clamp
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r5.overscrollX
            r1 = 0
            if (r0 == 0) goto L17
            float r0 = r5.amountX
            float r2 = r5.overscrollDistance
            float r3 = -r2
            float r4 = r5.maxX
            float r4 = r4 + r2
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r3, r4)
            goto L1f
        L17:
            float r0 = r5.amountX
            float r2 = r5.maxX
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r1, r2)
        L1f:
            r5.scrollX(r0)
            boolean r0 = r5.overscrollY
            if (r0 == 0) goto L33
            float r0 = r5.amountY
            float r1 = r5.overscrollDistance
            float r2 = -r1
            float r3 = r5.maxY
            float r3 = r3 + r1
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r2, r3)
            goto L3b
        L33:
            float r0 = r5.amountY
            float r2 = r5.maxY
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r1, r2)
        L3b:
            r5.scrollY(r0)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r10, float r11) {
            r9 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r9.actor
            if (r0 != 0) goto L5
            return
        L5:
            r9.validate()
            com.badlogic.gdx.math.Matrix4 r0 = r9.computeTransform()
            r9.applyTransform(r10, r0)
            boolean r0 = r9.scrollX
            if (r0 == 0) goto L29
            com.badlogic.gdx.math.Rectangle r0 = r9.hKnobBounds
            com.badlogic.gdx.math.Rectangle r1 = r9.hScrollBounds
            float r2 = r1.x
            float r1 = r1.width
            float r3 = r0.width
            float r1 = r1 - r3
            float r3 = r9.getVisualScrollPercentX()
            float r1 = r1 * r3
            int r1 = (int) r1
            float r1 = (float) r1
            float r2 = r2 + r1
            r0.x = r2
        L29:
            boolean r0 = r9.scrollY
            if (r0 == 0) goto L46
            com.badlogic.gdx.math.Rectangle r0 = r9.vKnobBounds
            com.badlogic.gdx.math.Rectangle r1 = r9.vScrollBounds
            float r2 = r1.y
            float r1 = r1.height
            float r3 = r0.height
            float r1 = r1 - r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r9.getVisualScrollPercentY()
            float r3 = r3 - r4
            float r1 = r1 * r3
            int r1 = (int) r1
            float r1 = (float) r1
            float r2 = r2 + r1
            r0.y = r2
        L46:
            r9.updateActorPosition()
            com.badlogic.gdx.graphics.Color r0 = r9.getColor()
            float r1 = r0.a
            float r1 = r1 * r11
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r2 = r9.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.background
            if (r2 == 0) goto L72
            float r2 = r0.r
            float r3 = r0.g
            float r4 = r0.b
            r10.setColor(r2, r3, r4, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r2 = r9.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r2.background
            r5 = 0
            r6 = 0
            float r7 = r9.getWidth()
            float r8 = r9.getHeight()
            r4 = r10
            r3.draw(r4, r5, r6, r7, r8)
        L72:
            r10.flush()
            com.badlogic.gdx.math.Rectangle r2 = r9.actorArea
            float r3 = r2.x
            float r4 = r2.y
            float r5 = r2.width
            float r2 = r2.height
            boolean r2 = r9.clipBegin(r3, r4, r5, r2)
            if (r2 == 0) goto L8e
            r9.drawChildren(r10, r11)
            r10.flush()
            r9.clipEnd()
        L8e:
            float r11 = r0.r
            float r2 = r0.g
            float r3 = r0.b
            r10.setColor(r11, r2, r3, r1)
            boolean r11 = r9.fadeScrollBars
            if (r11 == 0) goto La8
            com.badlogic.gdx.math.Interpolation r11 = com.badlogic.gdx.math.Interpolation.fade
            float r2 = r9.fadeAlpha
            float r3 = r9.fadeAlphaSeconds
            float r2 = r2 / r3
            float r11 = r11.apply(r2)
            float r1 = r1 * r11
        La8:
            r7 = r1
            float r4 = r0.r
            float r5 = r0.g
            float r6 = r0.b
            r2 = r9
            r3 = r10
            r2.drawScrollBars(r3, r4, r5, r6, r7)
            r9.resetTransform(r10)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void drawDebug(com.badlogic.gdx.graphics.glutils.ShapeRenderer r5) {
            r4 = this;
            r4.drawDebugBounds(r5)
            com.badlogic.gdx.math.Matrix4 r0 = r4.computeTransform()
            r4.applyTransform(r5, r0)
            com.badlogic.gdx.math.Rectangle r0 = r4.actorArea
            float r1 = r0.x
            float r2 = r0.y
            float r3 = r0.width
            float r0 = r0.height
            boolean r0 = r4.clipBegin(r1, r2, r3, r0)
            if (r0 == 0) goto L23
            r4.drawDebugChildren(r5)
            r5.flush()
            r4.clipEnd()
        L23:
            r4.resetTransform(r5)
            return
    }

    protected void drawScrollBars(com.badlogic.gdx.graphics.g2d.Batch r7, float r8, float r9, float r10, float r11) {
            r6 = this;
            r0 = 0
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 > 0) goto L6
            return
        L6:
            r7.setColor(r8, r9, r10, r11)
            boolean r8 = r6.scrollX
            r9 = 1
            r10 = 0
            if (r8 == 0) goto L19
            com.badlogic.gdx.math.Rectangle r8 = r6.hKnobBounds
            float r8 = r8.width
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L19
            r8 = 1
            goto L1a
        L19:
            r8 = 0
        L1a:
            boolean r11 = r6.scrollY
            if (r11 == 0) goto L27
            com.badlogic.gdx.math.Rectangle r11 = r6.vKnobBounds
            float r11 = r11.height
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 <= 0) goto L27
            goto L28
        L27:
            r9 = 0
        L28:
            if (r8 == 0) goto L6e
            if (r9 == 0) goto L46
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r8 = r6.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r8.corner
            if (r0 == 0) goto L46
            com.badlogic.gdx.math.Rectangle r8 = r6.hScrollBounds
            float r10 = r8.x
            float r11 = r8.width
            float r2 = r10 + r11
            float r3 = r8.y
            com.badlogic.gdx.math.Rectangle r8 = r6.vScrollBounds
            float r4 = r8.width
            float r5 = r8.y
            r1 = r7
            r0.draw(r1, r2, r3, r4, r5)
        L46:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r8 = r6.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r8.hScroll
            if (r0 == 0) goto L5a
            com.badlogic.gdx.math.Rectangle r8 = r6.hScrollBounds
            float r2 = r8.x
            float r3 = r8.y
            float r4 = r8.width
            float r5 = r8.height
            r1 = r7
            r0.draw(r1, r2, r3, r4, r5)
        L5a:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r8 = r6.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r8.hScrollKnob
            if (r0 == 0) goto L6e
            com.badlogic.gdx.math.Rectangle r8 = r6.hKnobBounds
            float r2 = r8.x
            float r3 = r8.y
            float r4 = r8.width
            float r5 = r8.height
            r1 = r7
            r0.draw(r1, r2, r3, r4, r5)
        L6e:
            if (r9 == 0) goto L98
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r8 = r6.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r8.vScroll
            if (r0 == 0) goto L84
            com.badlogic.gdx.math.Rectangle r8 = r6.vScrollBounds
            float r2 = r8.x
            float r3 = r8.y
            float r4 = r8.width
            float r5 = r8.height
            r1 = r7
            r0.draw(r1, r2, r3, r4, r5)
        L84:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r8 = r6.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r8.vScrollKnob
            if (r0 == 0) goto L98
            com.badlogic.gdx.math.Rectangle r8 = r6.vKnobBounds
            float r2 = r8.x
            float r3 = r8.y
            float r4 = r8.width
            float r5 = r8.height
            r1 = r7
            r0.draw(r1, r2, r3, r4, r5)
        L98:
            return
    }

    public void fling(float r1, float r2, float r3) {
            r0 = this;
            r0.flingTimer = r1
            r0.velocityX = r2
            r0.velocityY = r3
            return
    }

    protected com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener getFlickScrollListener() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$2 r0 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$2
            r0.<init>(r1)
            return r0
    }

    public float getMaxX() {
            r1 = this;
            float r0 = r1.maxX
            return r0
    }

    public float getMaxY() {
            r1 = this;
            float r0 = r1.maxY
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected float getMouseWheelX() {
            r4 = this;
            com.badlogic.gdx.math.Rectangle r0 = r4.actorArea
            float r0 = r0.width
            r1 = 1063675494(0x3f666666, float:0.9)
            float r1 = r1 * r0
            float r2 = r4.maxX
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = r2 * r3
            float r1 = java.lang.Math.max(r1, r2)
            r2 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r2
            float r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    protected float getMouseWheelY() {
            r4 = this;
            com.badlogic.gdx.math.Rectangle r0 = r4.actorArea
            float r0 = r0.height
            r1 = 1063675494(0x3f666666, float:0.9)
            float r1 = r1 * r0
            float r2 = r4.maxY
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = r2 * r3
            float r1 = java.lang.Math.max(r1, r2)
            r2 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r2
            float r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r4.actor
            boolean r1 = r0 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            r2 = 0
            if (r1 == 0) goto Le
            com.badlogic.gdx.scenes.scene2d.utils.Layout r0 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r0
            float r0 = r0.getPrefHeight()
            goto L16
        Le:
            if (r0 == 0) goto L15
            float r0 = r0.getHeight()
            goto L16
        L15:
            r0 = 0
        L16:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r1 = r4.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.background
            if (r1 == 0) goto L2e
            float r3 = r1.getTopHeight()
            float r0 = r0 + r3
            float r3 = r1.getBottomHeight()
            float r0 = r0 + r3
            float r1 = r1.getMinHeight()
            float r0 = java.lang.Math.max(r0, r1)
        L2e:
            boolean r1 = r4.scrollX
            if (r1 == 0) goto L4b
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r1 = r4.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.hScrollKnob
            if (r1 == 0) goto L3c
            float r2 = r1.getMinHeight()
        L3c:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r1 = r4.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.hScroll
            if (r1 == 0) goto L4a
            float r1 = r1.getMinHeight()
            float r2 = java.lang.Math.max(r2, r1)
        L4a:
            float r0 = r0 + r2
        L4b:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r4.actor
            boolean r1 = r0 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            r2 = 0
            if (r1 == 0) goto Le
            com.badlogic.gdx.scenes.scene2d.utils.Layout r0 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r0
            float r0 = r0.getPrefWidth()
            goto L16
        Le:
            if (r0 == 0) goto L15
            float r0 = r0.getWidth()
            goto L16
        L15:
            r0 = 0
        L16:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r1 = r4.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.background
            if (r1 == 0) goto L2e
            float r3 = r1.getLeftWidth()
            float r0 = r0 + r3
            float r3 = r1.getRightWidth()
            float r0 = r0 + r3
            float r1 = r1.getMinWidth()
            float r0 = java.lang.Math.max(r0, r1)
        L2e:
            boolean r1 = r4.scrollY
            if (r1 == 0) goto L4b
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r1 = r4.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.vScrollKnob
            if (r1 == 0) goto L3c
            float r2 = r1.getMinWidth()
        L3c:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r1 = r4.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.vScroll
            if (r1 == 0) goto L4a
            float r1 = r1.getMinWidth()
            float r2 = java.lang.Math.max(r2, r1)
        L4a:
            float r0 = r0 + r2
        L4b:
            return r0
    }

    public float getScrollBarWidth() {
            r2 = this;
            boolean r0 = r2.scrollY
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r0 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.vScrollKnob
            if (r0 == 0) goto L10
            float r1 = r0.getMinWidth()
        L10:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r0 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.vScroll
            if (r0 == 0) goto L1e
            float r0 = r0.getMinWidth()
            float r1 = java.lang.Math.max(r1, r0)
        L1e:
            return r1
    }

    public float getScrollPercentX() {
            r3 = this;
            float r0 = r3.maxX
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L8
            return r1
        L8:
            float r2 = r3.amountX
            float r2 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r2, r1, r0)
            return r0
    }

    public float getScrollPercentY() {
            r3 = this;
            float r0 = r3.maxY
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L8
            return r1
        L8:
            float r2 = r3.amountY
            float r2 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r2, r1, r0)
            return r0
    }

    public float getScrollX() {
            r1 = this;
            float r0 = r1.amountX
            return r0
    }

    public float getScrollY() {
            r1 = this;
            float r0 = r1.amountY
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle getStyle() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r0 = r1.style
            return r0
    }

    public float getVisualScrollPercentX() {
            r3 = this;
            float r0 = r3.maxX
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L8
            return r1
        L8:
            float r2 = r3.visualAmountX
            float r2 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r2, r1, r0)
            return r0
    }

    public float getVisualScrollPercentY() {
            r3 = this;
            float r0 = r3.maxY
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L8
            return r1
        L8:
            float r2 = r3.visualAmountY
            float r2 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r2, r1, r0)
            return r0
    }

    public float getVisualScrollX() {
            r1 = this;
            boolean r0 = r1.scrollX
            if (r0 != 0) goto L6
            r0 = 0
            goto L8
        L6:
            float r0 = r1.visualAmountX
        L8:
            return r0
    }

    public float getVisualScrollY() {
            r1 = this;
            boolean r0 = r1.scrollY
            if (r0 != 0) goto L6
            r0 = 0
            goto L8
        L6:
            float r0 = r1.visualAmountY
        L8:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public com.badlogic.gdx.scenes.scene2d.Actor hit(float r3, float r4, boolean r5) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 < 0) goto L51
            float r1 = r2.getWidth()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L51
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L51
            float r0 = r2.getHeight()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto L51
        L1a:
            if (r5 == 0) goto L4c
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = r2.getTouchable()
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            if (r0 != r1) goto L4c
            boolean r0 = r2.isVisible()
            if (r0 == 0) goto L4c
            boolean r0 = r2.scrollX
            if (r0 == 0) goto L3b
            boolean r0 = r2.touchScrollH
            if (r0 == 0) goto L3b
            com.badlogic.gdx.math.Rectangle r0 = r2.hScrollBounds
            boolean r0 = r0.contains(r3, r4)
            if (r0 == 0) goto L3b
            return r2
        L3b:
            boolean r0 = r2.scrollY
            if (r0 == 0) goto L4c
            boolean r0 = r2.touchScrollV
            if (r0 == 0) goto L4c
            com.badlogic.gdx.math.Rectangle r0 = r2.vScrollBounds
            boolean r0 = r0.contains(r3, r4)
            if (r0 == 0) goto L4c
            return r2
        L4c:
            com.badlogic.gdx.scenes.scene2d.Actor r3 = super.hit(r3, r4, r5)
            return r3
        L51:
            r3 = 0
            return r3
    }

    public boolean isDragging() {
            r2 = this;
            int r0 = r2.draggingPointer
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public boolean isFlinging() {
            r2 = this;
            float r0 = r2.flingTimer
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean isPanning() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener r0 = r1.flickScrollListener
            com.badlogic.gdx.input.GestureDetector r0 = r0.getGestureDetector()
            boolean r0 = r0.isPanning()
            return r0
    }

    public boolean isScrollingDisabledY() {
            r1 = this;
            boolean r0 = r1.disableY
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup
    public void layout() {
            r17 = this;
            r0 = r17
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r1 = r0.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r1.background
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r1.hScrollKnob
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.vScrollKnob
            if (r2 == 0) goto L1d
            float r5 = r2.getLeftWidth()
            float r6 = r2.getRightWidth()
            float r7 = r2.getTopHeight()
            float r2 = r2.getBottomHeight()
            goto L21
        L1d:
            r2 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L21:
            float r8 = r17.getWidth()
            float r9 = r17.getHeight()
            com.badlogic.gdx.math.Rectangle r10 = r0.actorArea
            float r11 = r8 - r5
            float r11 = r11 - r6
            float r9 = r9 - r7
            float r7 = r9 - r2
            r10.set(r5, r2, r11, r7)
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r0.actor
            if (r7 != 0) goto L39
            return
        L39:
            if (r3 == 0) goto L40
            float r7 = r3.getMinHeight()
            goto L41
        L40:
            r7 = 0
        L41:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r10 = r0.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r10 = r10.hScroll
            if (r10 == 0) goto L4f
            float r10 = r10.getMinHeight()
            float r7 = java.lang.Math.max(r7, r10)
        L4f:
            if (r1 == 0) goto L56
            float r10 = r1.getMinWidth()
            goto L57
        L56:
            r10 = 0
        L57:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r11 = r0.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r11 = r11.vScroll
            if (r11 == 0) goto L65
            float r11 = r11.getMinWidth()
            float r10 = java.lang.Math.max(r10, r11)
        L65:
            com.badlogic.gdx.scenes.scene2d.Actor r11 = r0.actor
            boolean r12 = r11 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r12 == 0) goto L76
            com.badlogic.gdx.scenes.scene2d.utils.Layout r11 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r11
            float r12 = r11.getPrefWidth()
            float r11 = r11.getPrefHeight()
            goto L80
        L76:
            float r12 = r11.getWidth()
            com.badlogic.gdx.scenes.scene2d.Actor r11 = r0.actor
            float r11 = r11.getHeight()
        L80:
            boolean r13 = r0.forceScrollX
            if (r13 != 0) goto L93
            com.badlogic.gdx.math.Rectangle r13 = r0.actorArea
            float r13 = r13.width
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 <= 0) goto L91
            boolean r13 = r0.disableX
            if (r13 != 0) goto L91
            goto L93
        L91:
            r13 = 0
            goto L94
        L93:
            r13 = 1
        L94:
            r0.scrollX = r13
            boolean r14 = r0.forceScrollY
            if (r14 != 0) goto La9
            com.badlogic.gdx.math.Rectangle r14 = r0.actorArea
            float r14 = r14.height
            int r14 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r14 <= 0) goto La7
            boolean r14 = r0.disableY
            if (r14 != 0) goto La7
            goto La9
        La7:
            r14 = 0
            goto Laa
        La9:
            r14 = 1
        Laa:
            r0.scrollY = r14
            boolean r4 = r0.scrollbarsOnTop
            if (r4 != 0) goto L104
            if (r14 == 0) goto Ld2
            com.badlogic.gdx.math.Rectangle r4 = r0.actorArea
            float r15 = r4.width
            float r15 = r15 - r10
            r4.width = r15
            r16 = r2
            boolean r2 = r0.vScrollOnRight
            if (r2 != 0) goto Lc4
            float r2 = r4.x
            float r2 = r2 + r10
            r4.x = r2
        Lc4:
            if (r13 != 0) goto Ld4
            int r2 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r2 <= 0) goto Ld4
            boolean r2 = r0.disableX
            if (r2 != 0) goto Ld4
            r2 = 1
            r0.scrollX = r2
            goto Ld4
        Ld2:
            r16 = r2
        Ld4:
            boolean r2 = r0.scrollX
            if (r2 == 0) goto L106
            com.badlogic.gdx.math.Rectangle r2 = r0.actorArea
            float r4 = r2.height
            float r4 = r4 - r7
            r2.height = r4
            boolean r13 = r0.hScrollOnBottom
            if (r13 == 0) goto Le8
            float r13 = r2.y
            float r13 = r13 + r7
            r2.y = r13
        Le8:
            if (r14 != 0) goto L106
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 <= 0) goto L106
            boolean r4 = r0.disableY
            if (r4 != 0) goto L106
            r4 = 1
            r0.scrollY = r4
            float r4 = r2.width
            float r4 = r4 - r10
            r2.width = r4
            boolean r4 = r0.vScrollOnRight
            if (r4 != 0) goto L106
            float r4 = r2.x
            float r4 = r4 + r10
            r2.x = r4
            goto L106
        L104:
            r16 = r2
        L106:
            boolean r2 = r0.disableX
            if (r2 == 0) goto L10f
            com.badlogic.gdx.math.Rectangle r2 = r0.actorArea
            float r2 = r2.width
            goto L117
        L10f:
            com.badlogic.gdx.math.Rectangle r2 = r0.actorArea
            float r2 = r2.width
            float r2 = java.lang.Math.max(r2, r12)
        L117:
            boolean r4 = r0.disableY
            if (r4 == 0) goto L120
            com.badlogic.gdx.math.Rectangle r4 = r0.actorArea
            float r4 = r4.height
            goto L128
        L120:
            com.badlogic.gdx.math.Rectangle r4 = r0.actorArea
            float r4 = r4.height
            float r4 = java.lang.Math.max(r4, r11)
        L128:
            com.badlogic.gdx.math.Rectangle r11 = r0.actorArea
            float r12 = r11.width
            float r12 = r2 - r12
            r0.maxX = r12
            float r11 = r11.height
            float r11 = r4 - r11
            r0.maxY = r11
            float r11 = r0.amountX
            r13 = 0
            float r11 = com.badlogic.gdx.math.MathUtils.clamp(r11, r13, r12)
            r0.scrollX(r11)
            float r11 = r0.amountY
            float r12 = r0.maxY
            float r11 = com.badlogic.gdx.math.MathUtils.clamp(r11, r13, r12)
            r0.scrollY(r11)
            boolean r11 = r0.scrollX
            if (r11 == 0) goto L1e5
            if (r3 == 0) goto L1da
            boolean r11 = r0.scrollbarsOnTop
            if (r11 == 0) goto L157
            r11 = r5
            goto L15b
        L157:
            com.badlogic.gdx.math.Rectangle r11 = r0.actorArea
            float r11 = r11.x
        L15b:
            boolean r12 = r0.hScrollOnBottom
            if (r12 == 0) goto L162
            r9 = r16
            goto L163
        L162:
            float r9 = r9 - r7
        L163:
            com.badlogic.gdx.math.Rectangle r12 = r0.hScrollBounds
            com.badlogic.gdx.math.Rectangle r13 = r0.actorArea
            float r13 = r13.width
            r12.set(r11, r9, r13, r7)
            boolean r9 = r0.scrollY
            if (r9 == 0) goto L184
            boolean r9 = r0.scrollbarsOnTop
            if (r9 == 0) goto L184
            com.badlogic.gdx.math.Rectangle r9 = r0.hScrollBounds
            float r11 = r9.width
            float r11 = r11 - r10
            r9.width = r11
            boolean r11 = r0.vScrollOnRight
            if (r11 != 0) goto L184
            float r11 = r9.x
            float r11 = r11 + r10
            r9.x = r11
        L184:
            boolean r9 = r0.variableSizeKnobs
            if (r9 == 0) goto L1a2
            com.badlogic.gdx.math.Rectangle r9 = r0.hKnobBounds
            float r11 = r3.getMinWidth()
            com.badlogic.gdx.math.Rectangle r12 = r0.hScrollBounds
            float r12 = r12.width
            com.badlogic.gdx.math.Rectangle r13 = r0.actorArea
            float r13 = r13.width
            float r12 = r12 * r13
            float r12 = r12 / r2
            int r12 = (int) r12
            float r12 = (float) r12
            float r11 = java.lang.Math.max(r11, r12)
            r9.width = r11
            goto L1aa
        L1a2:
            com.badlogic.gdx.math.Rectangle r9 = r0.hKnobBounds
            float r11 = r3.getMinWidth()
            r9.width = r11
        L1aa:
            com.badlogic.gdx.math.Rectangle r9 = r0.hKnobBounds
            float r11 = r9.width
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 <= 0) goto L1b5
            r11 = 0
            r9.width = r11
        L1b5:
            float r3 = r3.getMinHeight()
            r9.height = r3
            com.badlogic.gdx.math.Rectangle r3 = r0.hKnobBounds
            com.badlogic.gdx.math.Rectangle r9 = r0.hScrollBounds
            float r11 = r9.x
            float r9 = r9.width
            float r12 = r3.width
            float r9 = r9 - r12
            float r12 = r17.getScrollPercentX()
            float r9 = r9 * r12
            int r9 = (int) r9
            float r9 = (float) r9
            float r11 = r11 + r9
            r3.x = r11
            com.badlogic.gdx.math.Rectangle r3 = r0.hKnobBounds
            com.badlogic.gdx.math.Rectangle r9 = r0.hScrollBounds
            float r9 = r9.y
            r3.y = r9
            goto L1e5
        L1da:
            com.badlogic.gdx.math.Rectangle r3 = r0.hScrollBounds
            r9 = 0
            r3.set(r9, r9, r9, r9)
            com.badlogic.gdx.math.Rectangle r3 = r0.hKnobBounds
            r3.set(r9, r9, r9, r9)
        L1e5:
            boolean r3 = r0.scrollY
            if (r3 == 0) goto L28b
            if (r1 == 0) goto L280
            boolean r3 = r0.vScrollOnRight
            if (r3 == 0) goto L1f3
            float r3 = r8 - r6
            float r3 = r3 - r10
            goto L1f4
        L1f3:
            r3 = r5
        L1f4:
            boolean r9 = r0.scrollbarsOnTop
            if (r9 == 0) goto L1fb
            r9 = r16
            goto L1ff
        L1fb:
            com.badlogic.gdx.math.Rectangle r9 = r0.actorArea
            float r9 = r9.y
        L1ff:
            com.badlogic.gdx.math.Rectangle r11 = r0.vScrollBounds
            com.badlogic.gdx.math.Rectangle r12 = r0.actorArea
            float r12 = r12.height
            r11.set(r3, r9, r10, r12)
            boolean r3 = r0.scrollX
            if (r3 == 0) goto L220
            boolean r3 = r0.scrollbarsOnTop
            if (r3 == 0) goto L220
            com.badlogic.gdx.math.Rectangle r3 = r0.vScrollBounds
            float r9 = r3.height
            float r9 = r9 - r7
            r3.height = r9
            boolean r9 = r0.hScrollOnBottom
            if (r9 == 0) goto L220
            float r9 = r3.y
            float r9 = r9 + r7
            r3.y = r9
        L220:
            com.badlogic.gdx.math.Rectangle r3 = r0.vKnobBounds
            float r7 = r1.getMinWidth()
            r3.width = r7
            boolean r3 = r0.variableSizeKnobs
            if (r3 == 0) goto L246
            com.badlogic.gdx.math.Rectangle r3 = r0.vKnobBounds
            float r7 = r1.getMinHeight()
            com.badlogic.gdx.math.Rectangle r9 = r0.vScrollBounds
            float r9 = r9.height
            com.badlogic.gdx.math.Rectangle r10 = r0.actorArea
            float r10 = r10.height
            float r9 = r9 * r10
            float r9 = r9 / r4
            int r9 = (int) r9
            float r9 = (float) r9
            float r7 = java.lang.Math.max(r7, r9)
            r3.height = r7
            goto L24e
        L246:
            com.badlogic.gdx.math.Rectangle r3 = r0.vKnobBounds
            float r7 = r1.getMinHeight()
            r3.height = r7
        L24e:
            com.badlogic.gdx.math.Rectangle r3 = r0.vKnobBounds
            float r7 = r3.height
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 <= 0) goto L259
            r7 = 0
            r3.height = r7
        L259:
            boolean r7 = r0.vScrollOnRight
            if (r7 == 0) goto L264
            float r8 = r8 - r6
            float r1 = r1.getMinWidth()
            float r5 = r8 - r1
        L264:
            r3.x = r5
            com.badlogic.gdx.math.Rectangle r1 = r0.vKnobBounds
            com.badlogic.gdx.math.Rectangle r3 = r0.vScrollBounds
            float r5 = r3.y
            float r3 = r3.height
            float r6 = r1.height
            float r3 = r3 - r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r7 = r17.getScrollPercentY()
            float r6 = r6 - r7
            float r3 = r3 * r6
            int r3 = (int) r3
            float r3 = (float) r3
            float r5 = r5 + r3
            r1.y = r5
            goto L28b
        L280:
            com.badlogic.gdx.math.Rectangle r1 = r0.vScrollBounds
            r3 = 0
            r1.set(r3, r3, r3, r3)
            com.badlogic.gdx.math.Rectangle r1 = r0.vKnobBounds
            r1.set(r3, r3, r3, r3)
        L28b:
            r17.updateActorPosition()
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r0.actor
            boolean r3 = r1 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r3 == 0) goto L29e
            r1.setSize(r2, r4)
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r0.actor
            com.badlogic.gdx.scenes.scene2d.utils.Layout r1 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r1
            r1.validate()
        L29e:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public boolean removeActor(com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r1 = this;
            if (r2 == 0) goto Le
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.actor
            if (r2 == r0) goto L8
            r2 = 0
            return r2
        L8:
            r2 = 0
            r1.setActor(r2)
            r2 = 1
            return r2
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "actor cannot be null."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public boolean removeActor(com.badlogic.gdx.scenes.scene2d.Actor r2, boolean r3) {
            r1 = this;
            if (r2 == 0) goto L10
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.actor
            if (r2 == r0) goto L8
            r2 = 0
            return r2
        L8:
            r0 = 0
            r1.actor = r0
            boolean r2 = super.removeActor(r2, r3)
            return r2
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "actor cannot be null."
            r2.<init>(r3)
            throw r2
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public com.badlogic.gdx.scenes.scene2d.Actor removeActorAt(int r1, boolean r2) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r1 = super.removeActorAt(r1, r2)
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r0.actor
            if (r1 != r2) goto Lb
            r2 = 0
            r0.actor = r2
        Lb:
            return r1
    }

    public void scrollTo(float r8, float r9, float r10, float r11) {
            r7 = this;
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.scrollTo(r1, r2, r3, r4, r5, r6)
            return
    }

    public void scrollTo(float r3, float r4, float r5, float r6, boolean r7, boolean r8) {
            r2 = this;
            r2.validate()
            float r0 = r2.amountX
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L11
            com.badlogic.gdx.math.Rectangle r7 = r2.actorArea
            float r7 = r7.width
            float r5 = r5 - r7
            float r5 = r5 / r1
            float r3 = r3 + r5
            goto L1b
        L11:
            float r5 = r5 + r3
            com.badlogic.gdx.math.Rectangle r7 = r2.actorArea
            float r7 = r7.width
            float r5 = r5 - r7
            float r3 = com.badlogic.gdx.math.MathUtils.clamp(r0, r5, r3)
        L1b:
            float r5 = r2.maxX
            r7 = 0
            float r3 = com.badlogic.gdx.math.MathUtils.clamp(r3, r7, r5)
            r2.scrollX(r3)
            float r3 = r2.amountY
            float r5 = r2.maxY
            float r5 = r5 - r4
            if (r8 == 0) goto L34
            com.badlogic.gdx.math.Rectangle r3 = r2.actorArea
            float r3 = r3.height
            float r3 = r3 + r6
            float r3 = r3 / r1
            float r5 = r5 + r3
            goto L3e
        L34:
            float r6 = r6 + r5
            com.badlogic.gdx.math.Rectangle r4 = r2.actorArea
            float r4 = r4.height
            float r5 = r5 + r4
            float r5 = com.badlogic.gdx.math.MathUtils.clamp(r3, r6, r5)
        L3e:
            float r3 = r2.maxY
            float r3 = com.badlogic.gdx.math.MathUtils.clamp(r5, r7, r3)
            r2.scrollY(r3)
            return
    }

    protected void scrollX(float r1) {
            r0 = this;
            r0.amountX = r1
            return
    }

    protected void scrollY(float r1) {
            r0 = this;
            r0.amountY = r1
            return
    }

    public void setActor(com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.actor
            if (r0 == r1) goto L11
            if (r0 == 0) goto L9
            super.removeActor(r0)
        L9:
            r1.actor = r2
            if (r2 == 0) goto L10
            super.addActor(r2)
        L10:
            return
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "actor cannot be the ScrollPane."
            r2.<init>(r0)
            throw r2
    }

    public void setClamp(boolean r1) {
            r0 = this;
            r0.clamp = r1
            return
    }

    public void setFadeScrollBars(boolean r2) {
            r1 = this;
            boolean r0 = r1.fadeScrollBars
            if (r0 != r2) goto L5
            return
        L5:
            r1.fadeScrollBars = r2
            if (r2 != 0) goto Ld
            float r2 = r1.fadeAlphaSeconds
            r1.fadeAlpha = r2
        Ld:
            r1.invalidate()
            return
    }

    public void setFlingTime(float r1) {
            r0 = this;
            r0.flingTime = r1
            return
    }

    public void setOverscroll(boolean r1, boolean r2) {
            r0 = this;
            r0.overscrollX = r1
            r0.overscrollY = r2
            return
    }

    public void setScrollPercentX(float r4) {
            r3 = this;
            float r0 = r3.maxX
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r4 = com.badlogic.gdx.math.MathUtils.clamp(r4, r1, r2)
            float r0 = r0 * r4
            r3.scrollX(r0)
            return
    }

    public void setScrollPercentY(float r4) {
            r3 = this;
            float r0 = r3.maxY
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r4 = com.badlogic.gdx.math.MathUtils.clamp(r4, r1, r2)
            float r0 = r0 * r4
            r3.scrollY(r0)
            return
    }

    public void setScrollX(float r3) {
            r2 = this;
            float r0 = r2.maxX
            r1 = 0
            float r3 = com.badlogic.gdx.math.MathUtils.clamp(r3, r1, r0)
            r2.scrollX(r3)
            return
    }

    public void setScrollY(float r3) {
            r2 = this;
            float r0 = r2.maxY
            r1 = 0
            float r3 = com.badlogic.gdx.math.MathUtils.clamp(r3, r1, r0)
            r2.scrollY(r3)
            return
    }

    public void setScrollbarsOnTop(boolean r1) {
            r0 = this;
            r0.scrollbarsOnTop = r1
            r0.invalidate()
            return
    }

    public void setScrollbarsVisible(boolean r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            float r1 = r0.fadeAlphaSeconds
            r0.fadeAlpha = r1
            float r1 = r0.fadeDelaySeconds
            r0.fadeDelay = r1
            goto L10
        Lb:
            r1 = 0
            r0.fadeAlpha = r1
            r0.fadeDelay = r1
        L10:
            return
    }

    public void setScrollingDisabled(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.disableX
            if (r2 != r0) goto L9
            boolean r0 = r1.disableY
            if (r3 != r0) goto L9
            return
        L9:
            r1.disableX = r2
            r1.disableY = r3
            r1.invalidate()
            return
    }

    public void setSmoothScrolling(boolean r1) {
            r0 = this;
            r0.smoothScrolling = r1
            return
    }

    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle r2) {
            r1 = this;
            if (r2 == 0) goto L8
            r1.style = r2
            r1.invalidateHierarchy()
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "style cannot be null."
            r2.<init>(r0)
            throw r2
    }

    public void setVariableSizeKnobs(boolean r1) {
            r0 = this;
            r0.variableSizeKnobs = r1
            return
    }

    @java.lang.Deprecated
    public void setWidget(com.badlogic.gdx.scenes.scene2d.Actor r1) {
            r0 = this;
            r0.setActor(r1)
            return
    }

    public void updateVisualScroll() {
            r1 = this;
            float r0 = r1.amountX
            r1.visualAmountX = r0
            float r0 = r1.amountY
            r1.visualAmountY = r0
            return
    }

    protected void visualScrollX(float r1) {
            r0 = this;
            r0.visualAmountX = r1
            return
    }

    protected void visualScrollY(float r1) {
            r0 = this;
            r0.visualAmountY = r1
            return
    }
}
