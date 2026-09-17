package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class MagnifierViewer extends com.badlogic.gdx.scenes.scene2d.ui.Widget implements com.badlogic.gdx.utils.Disposable {
    private int _delayFBOUpdateCheck;
    private com.badlogic.gdx.math.Vector2 _dragWaitStart;
    private boolean _enabled;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer _fbo;
    private com.badlogic.gdx.utils.viewport.Viewport _fboViewport;
    private float _fboX;
    private float _fboY;
    private float _goalZoom;
    private boolean _hasDraggedFlag;
    private boolean _hasZoomedFlag;
    private boolean _isDragging;
    private boolean _isZooming;
    private com.badlogic.gdx.math.Vector2 _lastDragPosition;
    private boolean _locked;
    private org.fortheloss.sticknodes.animationscreen.Magnifier _magnifierRef;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _squareTR;
    private com.badlogic.gdx.math.Rectangle _viewBounds;
    private com.badlogic.gdx.math.Vector2 _viewCenter;
    private com.badlogic.gdx.math.Vector2 _viewSize;
    private float _viewZoom;


    /* renamed from: -$$Nest$fget_dragWaitStart, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m238$$Nest$fget_dragWaitStart(org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._dragWaitStart
            return r0
    }

    /* renamed from: -$$Nest$fget_isDragging, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m239$$Nest$fget_isDragging(org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0) {
            boolean r0 = r0._isDragging
            return r0
    }

    /* renamed from: -$$Nest$fget_lastDragPosition, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m240$$Nest$fget_lastDragPosition(org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._lastDragPosition
            return r0
    }

    /* renamed from: -$$Nest$fget_magnifierRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.Magnifier m241$$Nest$fget_magnifierRef(org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0) {
            org.fortheloss.sticknodes.animationscreen.Magnifier r0 = r0._magnifierRef
            return r0
    }

    /* renamed from: -$$Nest$fget_viewCenter, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m242$$Nest$fget_viewCenter(org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._viewCenter
            return r0
    }

    /* renamed from: -$$Nest$fget_viewZoom, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m243$$Nest$fget_viewZoom(org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0) {
            float r0 = r0._viewZoom
            return r0
    }

    /* renamed from: -$$Nest$fput_dragWaitStart, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m244$$Nest$fput_dragWaitStart(org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0, com.badlogic.gdx.math.Vector2 r1) {
            r0._dragWaitStart = r1
            return
    }

    /* renamed from: -$$Nest$fput_hasDraggedFlag, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m245$$Nest$fput_hasDraggedFlag(org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0, boolean r1) {
            r0._hasDraggedFlag = r1
            return
    }

    /* renamed from: -$$Nest$fput_isDragging, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m246$$Nest$fput_isDragging(org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0, boolean r1) {
            r0._isDragging = r1
            return
    }

    /* renamed from: -$$Nest$mboundView, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m247$$Nest$mboundView(org.fortheloss.sticknodes.animationscreen.MagnifierViewer r0) {
            r0.boundView()
            return
    }

    public MagnifierViewer(org.fortheloss.sticknodes.animationscreen.Magnifier r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2._fboX = r0
            r2._fboY = r0
            r2._viewZoom = r0
            r1 = 0
            r2._isDragging = r1
            r2._hasZoomedFlag = r1
            r2._hasDraggedFlag = r1
            r2._isZooming = r1
            r2._goalZoom = r0
            r2._delayFBOUpdateCheck = r1
            r0 = 1
            r2._enabled = r0
            r2._locked = r1
            r2._magnifierRef = r3
            return
    }

    private void boundView() {
            r6 = this;
            com.badlogic.gdx.math.Vector2 r0 = r6._viewSize
            float r1 = r0.x
            float r2 = r6._viewZoom
            float r1 = r1 / r2
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
            float r0 = r0.y
            float r0 = r0 / r2
            float r0 = r0 * r3
            com.badlogic.gdx.math.Vector2 r2 = r6._viewCenter
            float r3 = r2.x
            float r3 = r3 - r1
            com.badlogic.gdx.math.Rectangle r4 = r6._viewBounds
            float r5 = r4.x
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L20
            float r5 = r5 + r1
            r2.x = r5
        L20:
            float r3 = r2.y
            float r3 = r3 - r0
            float r5 = r4.y
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L2c
            float r5 = r5 + r0
            r2.y = r5
        L2c:
            float r3 = r2.x
            float r3 = r3 + r1
            float r5 = r4.width
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L38
            float r5 = r5 - r1
            r2.x = r5
        L38:
            float r1 = r2.y
            float r1 = r1 + r0
            float r3 = r4.height
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L44
            float r3 = r3 - r0
            r2.y = r3
        L44:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r3) {
            r2 = this;
            super.act(r3)
            boolean r3 = r2._isZooming
            if (r3 == 0) goto L30
            float r3 = r2._viewZoom
            float r0 = r2._goalZoom
            float r0 = r0 - r3
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            float r3 = r3 + r0
            r2._viewZoom = r3
            r2.boundView()
            float r3 = r2._goalZoom
            float r0 = r2._viewZoom
            float r3 = r3 - r0
            float r3 = java.lang.Math.abs(r3)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L2d
            float r3 = r2._goalZoom
            r2._viewZoom = r3
            r3 = 0
            r2._isZooming = r3
        L2d:
            r3 = 1
            r2._hasZoomedFlag = r3
        L30:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r2._fbo
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r2._fbo = r1
        La:
            r2._fboViewport = r1
            r2._magnifierRef = r1
            r2._squareTR = r1
            r2._viewCenter = r1
            r2._viewSize = r1
            r2._viewBounds = r1
            r2._dragWaitStart = r1
            r2._lastDragPosition = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r8, float r9) {
            r7 = this;
            super.draw(r8, r9)
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.setColor(r9, r9, r9, r0)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r7._squareTR
            float r3 = r7.getX()
            float r4 = r7.getY()
            float r5 = r7.getWidth()
            float r6 = r7.getHeight()
            r1 = r8
            r1.draw(r2, r3, r4, r5, r6)
            boolean r9 = r7._enabled
            if (r9 == 0) goto L86
            int r9 = r7._delayFBOUpdateCheck
            r1 = 1
            if (r9 > 0) goto L4c
            r9 = 5
            r7._delayFBOUpdateCheck = r9
            r8.end()
            org.fortheloss.sticknodes.animationscreen.Magnifier r9 = r7._magnifierRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r7._fbo
            com.badlogic.gdx.utils.viewport.Viewport r3 = r7._fboViewport
            boolean r4 = r7._hasZoomedFlag
            r5 = 0
            if (r4 != 0) goto L41
            boolean r4 = r7._hasDraggedFlag
            if (r4 == 0) goto L40
            goto L41
        L40:
            r1 = 0
        L41:
            r9.checkAndUpdateFBO(r8, r2, r3, r1)
            r7._hasZoomedFlag = r5
            r7._hasDraggedFlag = r5
            r8.begin()
            goto L4f
        L4c:
            int r9 = r9 - r1
            r7._delayFBOUpdateCheck = r9
        L4f:
            r8.setColor(r0, r0, r0, r0)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r9 = r7._fbo
            com.badlogic.gdx.graphics.GLTexture r9 = r9.getColorBufferTexture()
            r1 = r9
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            float r9 = r7.getX()
            float r0 = r7._fboX
            float r2 = r9 + r0
            float r9 = r7.getY()
            float r0 = r7._fboY
            float r9 = r9 + r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r7._fbo
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r3 = r9 + r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r9 = r7._fbo
            int r9 = r9.getWidth()
            float r4 = (float) r9
            com.badlogic.gdx.graphics.glutils.FrameBuffer r9 = r7._fbo
            int r9 = r9.getHeight()
            int r9 = -r9
            float r5 = (float) r9
            r0 = r8
            r0.draw(r1, r2, r3, r4, r5)
        L86:
            return
    }

    public void flagDirty() {
            r1 = this;
            r0 = 1
            r1._hasZoomedFlag = r0
            return
    }

    public float getPadding() {
            r2 = this;
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 * r1
            return r0
    }

    public com.badlogic.gdx.math.Vector2 getViewCenter() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1._viewCenter
            return r0
    }

    public float getZoom() {
            r1 = this;
            float r0 = r1._viewZoom
            return r0
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureRegion r2, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3) {
            r1 = this;
            r1._squareTR = r2
            com.badlogic.gdx.math.Rectangle r2 = new com.badlogic.gdx.math.Rectangle
            r2.<init>()
            r1._viewBounds = r2
            float r0 = r3.getViewableCanvasMinWidth()
            r2.x = r0
            com.badlogic.gdx.math.Rectangle r2 = r1._viewBounds
            float r0 = r3.getViewableCanvasMinHeight()
            r2.y = r0
            com.badlogic.gdx.math.Rectangle r2 = r1._viewBounds
            float r0 = r3.getViewableCanvasMaxWidth()
            r2.width = r0
            com.badlogic.gdx.math.Rectangle r2 = r1._viewBounds
            float r0 = r3.getViewableCanvasMaxHeight()
            r2.height = r0
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r2.<init>()
            r1._viewCenter = r2
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r2.<init>()
            r1._viewSize = r2
            float r2 = r3.getWidth()
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r0
            float r3 = r3.getHeight()
            float r3 = r3 * r0
            r1.reset(r2, r3)
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r2.<init>()
            r1._dragWaitStart = r2
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r2.<init>()
            r1._lastDragPosition = r2
            com.badlogic.gdx.utils.viewport.ScreenViewport r2 = new com.badlogic.gdx.utils.viewport.ScreenViewport
            r2.<init>()
            r1._fboViewport = r2
            org.fortheloss.sticknodes.animationscreen.MagnifierViewer$1 r2 = new org.fortheloss.sticknodes.animationscreen.MagnifierViewer$1
            r2.<init>(r1)
            r1.addListener(r2)
            return
    }

    public void reset(float r2, float r3) {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1._viewCenter
            r0.set(r2, r3)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1._viewZoom = r2
            r1._goalZoom = r2
            r2 = 1
            r1._hasDraggedFlag = r2
            r1._hasZoomedFlag = r2
            r2 = 0
            r1._delayFBOUpdateCheck = r2
            return
    }

    public void setEnabled(boolean r1) {
            r0 = this;
            r0._enabled = r1
            if (r1 == 0) goto La
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            goto Lf
        La:
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
        Lf:
            r1 = 0
            r0._delayFBOUpdateCheck = r1
            return
    }

    public void setLocked(boolean r1) {
            r0 = this;
            r0._locked = r1
            return
    }

    public void setViewCenter(float r2, float r3) {
            r1 = this;
            boolean r0 = r1._locked
            if (r0 == 0) goto L5
            return
        L5:
            com.badlogic.gdx.math.Vector2 r0 = r1._viewCenter
            r0.set(r2, r3)
            r1.boundView()
            r2 = 1
            r1._hasDraggedFlag = r2
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    protected void sizeChanged() {
            r8 = this;
            super.sizeChanged()
            float r0 = r8.getPadding()
            r8._fboX = r0
            r8._fboY = r0
            com.badlogic.gdx.math.Vector2 r1 = r8._viewSize
            float r2 = r8.getWidth()
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r3
            float r2 = r2 - r0
            float r3 = r8.getHeight()
            float r3 = r3 - r0
            r1.set(r2, r3)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r8._fbo
            if (r1 == 0) goto L25
            r1.dispose()
        L25:
            com.badlogic.gdx.graphics.Pixmap$Format r2 = com.badlogic.gdx.graphics.Pixmap.Format.RGB888     // Catch: java.lang.Exception -> L3d
            float r1 = r8.getWidth()     // Catch: java.lang.Exception -> L3d
            float r1 = r1 - r0
            int r3 = (int) r1     // Catch: java.lang.Exception -> L3d
            float r1 = r8.getHeight()     // Catch: java.lang.Exception -> L3d
            float r1 = r1 - r0
            int r4 = (int) r1     // Catch: java.lang.Exception -> L3d
            r5 = 0
            r6 = 0
            r7 = 0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L3d
            r8._fbo = r1     // Catch: java.lang.Exception -> L3d
            goto L54
        L3d:
            com.badlogic.gdx.graphics.Pixmap$Format r2 = com.badlogic.gdx.graphics.Pixmap.Format.RGB565
            float r1 = r8.getWidth()
            float r1 = r1 - r0
            int r3 = (int) r1
            float r1 = r8.getHeight()
            float r1 = r1 - r0
            int r4 = (int) r1
            r5 = 0
            r6 = 0
            r7 = 0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r2, r3, r4, r5, r6, r7)
            r8._fbo = r0
        L54:
            com.badlogic.gdx.utils.viewport.Viewport r0 = r8._fboViewport
            com.badlogic.gdx.graphics.Camera r0 = r0.getCamera()
            com.badlogic.gdx.math.Vector3 r0 = r0.position
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r8._fbo
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            float r1 = (float) r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r8._fbo
            int r2 = r2.getHeight()
            int r2 = r2 / 2
            float r2 = (float) r2
            r3 = 0
            r0.set(r1, r2, r3)
            com.badlogic.gdx.utils.viewport.Viewport r0 = r8._fboViewport
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r8._fbo
            int r1 = r1.getWidth()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r8._fbo
            int r2 = r2.getHeight()
            r3 = 0
            r0.update(r1, r2, r3)
            return
    }

    public void zoom(int r8) {
            r7 = this;
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 1082130432(0x40800000, float:4.0)
            r3 = 1086324736(0x40c00000, float:6.0)
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1036831949(0x3dcccccd, float:0.1)
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r8 <= 0) goto L38
            float r8 = r7._goalZoom
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 < 0) goto L1c
            float r8 = r8 + r1
            r7._goalZoom = r8
            goto L5d
        L1c:
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 < 0) goto L24
            float r8 = r8 + r6
            r7._goalZoom = r8
            goto L5d
        L24:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 < 0) goto L2c
            float r8 = r8 + r4
            r7._goalZoom = r8
            goto L5d
        L2c:
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 < 0) goto L34
            float r8 = r8 + r5
            r7._goalZoom = r8
            goto L5d
        L34:
            float r8 = r8 + r0
            r7._goalZoom = r8
            goto L5d
        L38:
            float r8 = r7._goalZoom
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto L42
            float r8 = r8 - r1
            r7._goalZoom = r8
            goto L5d
        L42:
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 <= 0) goto L4a
            float r8 = r8 - r6
            r7._goalZoom = r8
            goto L5d
        L4a:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 <= 0) goto L52
            float r8 = r8 - r4
            r7._goalZoom = r8
            goto L5d
        L52:
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 <= 0) goto L5a
            float r8 = r8 - r5
            r7._goalZoom = r8
            goto L5d
        L5a:
            float r8 = r8 - r0
            r7._goalZoom = r8
        L5d:
            float r8 = r7._goalZoom
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 >= 0) goto L66
            r7._goalZoom = r5
            goto L6e
        L66:
            r0 = 1101004800(0x41a00000, float:20.0)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L6e
            r7._goalZoom = r0
        L6e:
            r8 = 1
            r7._isZooming = r8
            r7._hasZoomedFlag = r8
            return
    }
}
