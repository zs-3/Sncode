package org.fortheloss.sticknodes.animationscreen.modules;

/* loaded from: classes2.dex */
public class HorizontalThumbnailContainer extends com.badlogic.gdx.scenes.scene2d.Group implements com.badlogic.gdx.utils.Disposable {
    private static int newestFrameStartIndex = -1;
    private static int numNewestFrames;
    private com.badlogic.gdx.graphics.g2d.BitmapFont _bitmapFont;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _clickListener;
    private int _currentFrame;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _frameCopyMenuSymbol;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _frameIconAutoCam;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _frameIconAutoCamStart;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _frameIconDelay;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _frameIconDelayWithCamera;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _frameIconKeyframes;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _frameIconRepeat;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _frameIconSound;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _frameIconSoundSilenceAll;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _frameIconTween;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _frameIconTweenFast;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _frameIconTweenNone;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _frameIconTweenSlow;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> _frameThumbnails;
    private org.fortheloss.sticknodes.animationscreen.FramesContainer _framesContainerRef;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private boolean _isMovieclipThumbs;
    private float _maxVisibleX;
    private float _oldX;
    private float _oldY;
    private boolean _onlyRenderEveryThirdFrame;
    private float _originalHeight;
    private com.badlogic.gdx.math.Vector2 _pointAutocam;
    private com.badlogic.gdx.math.Vector2 _pointBR;
    private float _pointBottomPadding;
    private com.badlogic.gdx.math.Vector2 _pointCopyMenu;
    private com.badlogic.gdx.math.Vector2 _pointDelay;
    private com.badlogic.gdx.math.Vector2 _pointKeyframes;
    private boolean _positionIsDirty;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private com.badlogic.gdx.math.Matrix4 _rememberedTransformMatrix;
    private com.badlogic.gdx.math.Rectangle _scissorsBounds;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;
    private org.fortheloss.sticknodes.SNShapeRenderer _shapeRendererRef;
    private int _showCurrentFrameSelectionOffscreen;
    private int _startIndex;
    private float _textPadding;
    private com.badlogic.gdx.graphics.g2d.NinePatch _thumbnailBG;
    private float _thumbnailBGBottomPadding;
    private float _thumbnailBGSidePadding;
    private com.badlogic.gdx.math.Rectangle _thumbnailBounds;
    private int _thumbnailHeight;
    private com.badlogic.gdx.math.Vector2 _thumbnailOffset;
    private float _thumbnailScaling;
    private com.badlogic.gdx.graphics.g2d.NinePatch _thumbnailSelectedBG;
    private float _thumbnailSpacing;
    private int _thumbnailWidth;


    /* renamed from: -$$Nest$fget_frameThumbnails, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m811$$Nest$fget_frameThumbnails(org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r0 = r0._frameThumbnails
            return r0
    }

    /* renamed from: -$$Nest$fget_framesContainerRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.FramesContainer m812$$Nest$fget_framesContainerRef(org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0) {
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r0._framesContainerRef
            return r0
    }

    /* renamed from: -$$Nest$fget_thumbnailSpacing, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m813$$Nest$fget_thumbnailSpacing(org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0) {
            float r0 = r0._thumbnailSpacing
            return r0
    }

    /* renamed from: -$$Nest$fget_thumbnailWidth, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m814$$Nest$fget_thumbnailWidth(org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0) {
            int r0 = r0._thumbnailWidth
            return r0
    }

    /* renamed from: -$$Nest$monFrameContextMenuClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m815$$Nest$monFrameContextMenuClick(org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0, org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r1) {
            r0.onFrameContextMenuClick(r1)
            return
    }

    /* renamed from: -$$Nest$monFrameThumbnailClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m816$$Nest$monFrameThumbnailClick(org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer r0, org.fortheloss.sticknodes.data.IFrameData r1) {
            r0.onFrameThumbnailClick(r1)
            return
    }

    static {
            return
    }

    public HorizontalThumbnailContainer(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r10, boolean r11, org.fortheloss.sticknodes.SNShapeRenderer r12, org.fortheloss.sticknodes.data.ProjectData r13, org.fortheloss.sticknodes.data.SessionData r14, com.badlogic.gdx.graphics.g2d.TextureRegion r15, com.badlogic.gdx.graphics.g2d.TextureRegion r16, com.badlogic.gdx.graphics.g2d.TextureRegion r17, com.badlogic.gdx.graphics.g2d.TextureRegion r18, com.badlogic.gdx.graphics.g2d.TextureRegion r19, com.badlogic.gdx.graphics.g2d.TextureRegion r20, com.badlogic.gdx.graphics.g2d.TextureRegion r21, com.badlogic.gdx.graphics.g2d.TextureRegion r22, com.badlogic.gdx.graphics.g2d.TextureRegion r23, com.badlogic.gdx.graphics.g2d.TextureRegion r24, com.badlogic.gdx.graphics.g2d.TextureRegion r25, com.badlogic.gdx.graphics.g2d.TextureRegion r26, com.badlogic.gdx.graphics.g2d.TextureRegion r27, com.badlogic.gdx.graphics.g2d.TextureRegion r28, com.badlogic.gdx.graphics.g2d.TextureRegion r29, com.badlogic.gdx.graphics.g2d.BitmapFont r30, int r31, int r32, float r33, float r34, float r35, float r36) {
            r9 = this;
            r0 = r9
            r1 = r35
            r9.<init>()
            r2 = 0
            r0._onlyRenderEveryThirdFrame = r2
            r3 = 0
            r0._thumbnailBGSidePadding = r3
            r0._thumbnailBGBottomPadding = r3
            r0._textPadding = r3
            r4 = 1
            r0._positionIsDirty = r4
            r0._startIndex = r2
            r0._oldX = r3
            r0._oldY = r3
            r0._currentFrame = r2
            r0._originalHeight = r3
            r0._pointBottomPadding = r3
            r0._showCurrentFrameSelectionOffscreen = r2
            r3 = r11
            r0._isMovieclipThumbs = r3
            r3 = r10
            r0._framesModuleRef = r3
            r3 = r12
            r0._shapeRendererRef = r3
            r3 = r13
            r0._projectDataRef = r3
            r3 = r14
            r0._sessionDataRef = r3
            r3 = r31
            r0._thumbnailWidth = r3
            r3 = r32
            r0._thumbnailHeight = r3
            r3 = r33
            r0._thumbnailScaling = r3
            r3 = r34
            r0._thumbnailSpacing = r3
            r3 = r36
            r0._maxVisibleX = r3
            r3 = r30
            r0._bitmapFont = r3
            r3 = r15
            r0._frameIconTween = r3
            r3 = r16
            r0._frameIconTweenNone = r3
            r3 = r17
            r0._frameIconTweenSlow = r3
            r3 = r18
            r0._frameIconTweenFast = r3
            r3 = r19
            r0._frameIconSound = r3
            r3 = r20
            r0._frameIconSoundSilenceAll = r3
            r3 = r21
            r0._frameIconDelay = r3
            r3 = r22
            r0._frameIconDelayWithCamera = r3
            r3 = r23
            r0._frameIconAutoCamStart = r3
            r3 = r24
            r0._frameIconAutoCam = r3
            r3 = r25
            r0._frameIconKeyframes = r3
            r3 = r26
            r0._frameIconRepeat = r3
            r3 = r27
            r0._frameCopyMenuSymbol = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0._frameThumbnails = r3
            com.badlogic.gdx.math.Rectangle r3 = new com.badlogic.gdx.math.Rectangle
            r3.<init>()
            r0._thumbnailBounds = r3
            com.badlogic.gdx.math.Rectangle r3 = new com.badlogic.gdx.math.Rectangle
            r3.<init>()
            r0._scissorsBounds = r3
            com.badlogic.gdx.math.Vector2 r3 = new com.badlogic.gdx.math.Vector2
            r3.<init>()
            r0._thumbnailOffset = r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r4
            r0._textPadding = r3
            r9.setHeight(r1)
            r0._originalHeight = r1
            com.badlogic.gdx.math.Matrix4 r1 = new com.badlogic.gdx.math.Matrix4
            r1.<init>()
            r0._rememberedTransformMatrix = r1
            com.badlogic.gdx.graphics.g2d.NinePatch r1 = new com.badlogic.gdx.graphics.g2d.NinePatch
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1103101952(0x41c00000, float:24.0)
            float r6 = r3 * r5
            int r6 = (int) r6
            float r7 = r3 * r5
            int r7 = (int) r7
            float r8 = r3 * r5
            int r8 = (int) r8
            float r3 = r3 * r5
            int r3 = (int) r3
            r10 = r1
            r11 = r28
            r12 = r6
            r13 = r7
            r14 = r8
            r15 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            r0._thumbnailBG = r1
            com.badlogic.gdx.graphics.g2d.NinePatch r1 = new com.badlogic.gdx.graphics.g2d.NinePatch
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r3 * r5
            int r6 = (int) r6
            float r7 = r3 * r5
            int r7 = (int) r7
            float r8 = r3 * r5
            int r8 = (int) r8
            float r3 = r3 * r5
            int r3 = (int) r3
            r10 = r1
            r11 = r29
            r12 = r6
            r13 = r7
            r14 = r8
            r15 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            r0._thumbnailSelectedBG = r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1088421888(0x40e00000, float:7.0)
            float r3 = r3 * r1
            r0._thumbnailBGSidePadding = r3
            float r1 = r1 * r4
            r0._thumbnailBGBottomPadding = r1
            r9.setTransform(r2)
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r9.setTouchable(r1)
            r9.recalculateWidth()
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer$1
            r1.<init>(r9)
            r0._clickListener = r1
            com.badlogic.gdx.math.Vector2 r1 = new com.badlogic.gdx.math.Vector2
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1101004800(0x41a00000, float:20.0)
            float r4 = r2 * r3
            float r2 = r2 * r3
            r1.<init>(r4, r2)
            r0._pointCopyMenu = r1
            com.badlogic.gdx.math.Vector2 r1 = new com.badlogic.gdx.math.Vector2
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1136525312(0x43be0000, float:380.0)
            float r4 = r4 * r2
            r5 = 1127481344(0x43340000, float:180.0)
            float r2 = r2 * r5
            r1.<init>(r4, r2)
            r0._pointDelay = r1
            com.badlogic.gdx.math.Vector2 r1 = new com.badlogic.gdx.math.Vector2
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1136459776(0x43bd0000, float:378.0)
            float r4 = r4 * r2
            r5 = 1116733440(0x42900000, float:72.0)
            float r2 = r2 * r5
            r1.<init>(r4, r2)
            r0._pointAutocam = r1
            com.badlogic.gdx.math.Vector2 r1 = new com.badlogic.gdx.math.Vector2
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1137508352(0x43cd0000, float:410.0)
            float r4 = r4 * r2
            float r2 = r2 * r3
            r1.<init>(r4, r2)
            r0._pointBR = r1
            com.badlogic.gdx.math.Vector2 r1 = new com.badlogic.gdx.math.Vector2
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1136787456(0x43c20000, float:388.0)
            float r3 = r3 * r2
            r4 = 1127219200(0x43300000, float:176.0)
            float r2 = r2 * r4
            r1.<init>(r3, r2)
            r0._pointKeyframes = r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1112014848(0x42480000, float:50.0)
            float r1 = r1 * r2
            r0._pointBottomPadding = r1
            return
    }

    private void onFrameContextMenuClick(org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r1._framesModuleRef
            r0.showFrameContextMenu(r2)
            return
    }

    private void onFrameThumbnailClick(org.fortheloss.sticknodes.data.IFrameData r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            r1 = 1
            r0.goToFrame(r3, r1)
            return
    }

    private void recalculateOffset() {
            r3 = this;
            r0 = 0
            r3._positionIsDirty = r0
            com.badlogic.gdx.math.Vector2 r0 = r3._thumbnailOffset
            float r1 = r3.getX()
            float r2 = r3.getY()
            r0.set(r1, r2)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r3.getParent()
            com.badlogic.gdx.math.Vector2 r1 = r3._thumbnailOffset
            r0.localToStageCoordinates(r1)
            float r0 = r3.getX()
            int r1 = r3._thumbnailWidth
            float r1 = (float) r1
            float r2 = r3._thumbnailSpacing
            float r1 = r1 + r2
            float r0 = r0 / r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (int) r0
            r3._startIndex = r0
            return
    }

    private void recalculateWidth() {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r0 = r3._frameThumbnails
            int r0 = r0.size()
            float r0 = (float) r0
            int r1 = r3._thumbnailWidth
            float r1 = (float) r1
            float r2 = r3._thumbnailSpacing
            float r1 = r1 + r2
            float r0 = r0 * r1
            r3.setWidth(r0)
            return
    }

    public static void setNewestFrameIndex(int r1) {
            r0 = -1
            if (r1 != r0) goto L8
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.newestFrameStartIndex = r0
            r1 = 0
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.numNewestFrames = r1
        L8:
            return
    }

    public static void setNewestFrameIndex(int r1, int r2) {
            r0 = -1
            if (r1 != r0) goto L9
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.newestFrameStartIndex = r0
            r1 = 0
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.numNewestFrames = r1
            goto Ld
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.newestFrameStartIndex = r1
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.numNewestFrames = r2
        Ld:
            return
    }

    public void addThumbnail(int r6, org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r7) {
            r5 = this;
            int r0 = r5._thumbnailWidth
            float r0 = (float) r0
            int r1 = r5._thumbnailHeight
            float r1 = (float) r1
            r7.setSize(r0, r1)
            float r0 = r5._thumbnailScaling
            r7.setThumbnailScaling(r0)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r7.setTouchable(r0)
            r5.addActor(r7)
            r0 = -1
            if (r6 != r0) goto L1f
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r6 = r5._frameThumbnails
            r6.add(r7)
            goto L24
        L1f:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r0 = r5._frameThumbnails
            r0.add(r6, r7)
        L24:
            float r6 = r5._originalHeight
            int r7 = r5._thumbnailHeight
            float r7 = (float) r7
            float r0 = r5._thumbnailBGBottomPadding
            float r7 = r7 + r0
            float r6 = r6 - r7
            int r7 = r5._currentFrame
            if (r7 >= 0) goto L32
            r7 = 0
        L32:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r0 = r5._frameThumbnails
            int r0 = r0.size()
        L38:
            if (r7 >= r0) goto L51
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r1 = r5._frameThumbnails
            java.lang.Object r1 = r1.get(r7)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r1 = (org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail) r1
            float r2 = (float) r7
            int r3 = r5._thumbnailWidth
            float r3 = (float) r3
            float r4 = r5._thumbnailSpacing
            float r3 = r3 + r4
            float r2 = r2 * r3
            r1.setPosition(r2, r6)
            int r7 = r7 + 1
            goto L38
        L51:
            r5.recalculateWidth()
            return
    }

    public void addThumbnail(org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r2) {
            r1 = this;
            r0 = -1
            r1.addThumbnail(r0, r2)
            return
    }

    public void deleteThumbnail() {
            r6 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r0 = r6._frameThumbnails
            int r1 = r6._currentFrame
            java.lang.Object r0 = r0.remove(r1)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r0 = (org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail) r0
            r0.dispose()
            int r0 = r6._currentFrame
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r1 = r6._frameThumbnails
            int r1 = r1.size()
        L15:
            if (r0 >= r1) goto L2e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r2 = r6._frameThumbnails
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r2 = (org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail) r2
            float r3 = (float) r0
            int r4 = r6._thumbnailWidth
            float r4 = (float) r4
            float r5 = r6._thumbnailSpacing
            float r4 = r4 + r5
            float r3 = r3 * r4
            r2.setX(r3)
            int r0 = r0 + 1
            goto L15
        L2e:
            r6.recalculateWidth()
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r3._clickListener
            r1 = 0
            if (r0 == 0) goto Lf
            r3.removeListener(r0)
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r3._clickListener
            r0.cancel()
            r3._clickListener = r1
        Lf:
            r3._framesModuleRef = r1
            r3._shapeRendererRef = r1
            r3._projectDataRef = r1
            r3._framesContainerRef = r1
            r3._sessionDataRef = r1
            r3._frameIconTween = r1
            r3._frameIconTweenNone = r1
            r3._frameIconTweenFast = r1
            r3._frameIconTweenSlow = r1
            r3._frameIconSound = r1
            r3._frameIconSoundSilenceAll = r1
            r3._frameIconDelay = r1
            r3._frameIconAutoCamStart = r1
            r3._frameIconAutoCam = r1
            r3._frameIconKeyframes = r1
            r3._frameIconRepeat = r1
            r3._frameCopyMenuSymbol = r1
            r3._thumbnailBG = r1
            r3._thumbnailSelectedBG = r1
            r3._bitmapFont = r1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r0 = r3._frameThumbnails
            if (r0 == 0) goto L53
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L41:
            if (r0 < 0) goto L51
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r2 = r3._frameThumbnails
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r2 = (org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail) r2
            r2.dispose()
            int r0 = r0 + (-1)
            goto L41
        L51:
            r3._frameThumbnails = r1
        L53:
            r3._thumbnailBounds = r1
            r3._scissorsBounds = r1
            r3._thumbnailOffset = r1
            r3._rememberedTransformMatrix = r1
            r3.clear()
            r3.remove()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r24, float r25) {
            r23 = this;
            r0 = r23
            r7 = r24
            boolean r1 = r0._positionIsDirty
            if (r1 == 0) goto Lb
            r23.recalculateOffset()
        Lb:
            r8 = 1065353216(0x3f800000, float:1.0)
            r7.setColor(r8, r8, r8, r8)
            boolean r1 = r0._isMovieclipThumbs
            r10 = 1
            if (r1 != 0) goto L1e
            org.fortheloss.sticknodes.data.ProjectData r1 = r0._projectDataRef
            boolean r1 = r1.isYoutubeShorts
            if (r1 == 0) goto L1e
            r21 = 1
            goto L20
        L1e:
            r21 = 0
        L20:
            int r1 = r0._startIndex
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r2 = r0._frameThumbnails
            int r11 = r2.size()
            r12 = r1
        L29:
            r22 = 1073741824(0x40000000, float:2.0)
            if (r12 >= r11) goto L69
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r1 = r0._frameThumbnails
            java.lang.Object r1 = r1.get(r12)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r1 = (org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail) r1
            float r2 = r23.getX()
            float r3 = r1.getX()
            float r3 = r3 + r2
            float r2 = r0._maxVisibleX
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L45
            goto L69
        L45:
            com.badlogic.gdx.graphics.g2d.NinePatch r2 = r0._thumbnailBG
            float r4 = r23.getY()
            float r1 = r1.getY()
            float r4 = r4 + r1
            int r1 = r0._thumbnailWidth
            float r1 = (float) r1
            float r5 = r0._thumbnailBGSidePadding
            float r5 = r5 * r22
            float r1 = r1 + r5
            float r5 = r1 + r8
            int r1 = r0._thumbnailHeight
            float r1 = (float) r1
            float r6 = r0._thumbnailBGBottomPadding
            float r6 = r6 + r1
            r1 = r2
            r2 = r24
            r1.draw(r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L29
        L69:
            r24.end()
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r2 = 3042(0xbe2, float:4.263E-42)
            r1.glDisable(r2)
            com.badlogic.gdx.math.Matrix4 r1 = r0._rememberedTransformMatrix
            com.badlogic.gdx.math.Matrix4 r3 = r24.getTransformMatrix()
            r1.set(r3)
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r3 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r1.begin(r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            boolean r1 = r1.getStickNodeCullingEnabled()
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.newestFrameStartIndex
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.numNewestFrames
            int r4 = r4 + r3
            int r5 = r0._startIndex
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r6 = r0._frameThumbnails
            int r6 = r6.size()
        L96:
            if (r5 >= r6) goto L134
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r11 = r0._frameThumbnails
            java.lang.Object r11 = r11.get(r5)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r11 = (org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail) r11
            float r12 = r23.getX()
            float r13 = r11.getX()
            float r12 = r12 + r13
            float r13 = r0._maxVisibleX
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 <= 0) goto Lb1
            goto L134
        Lb1:
            boolean r13 = r0._onlyRenderEveryThirdFrame
            if (r13 == 0) goto Lc5
            if (r5 == 0) goto Lc5
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r13 = r0._frameThumbnails
            int r13 = r13.size()
            int r13 = r13 - r10
            if (r5 == r13) goto Lc5
            int r13 = r5 % 3
            if (r13 == 0) goto Lc5
            goto L12f
        Lc5:
            com.badlogic.gdx.math.Rectangle r13 = r0._thumbnailBounds
            float r14 = r0._thumbnailBGSidePadding
            float r12 = r12 + r14
            float r14 = r23.getY()
            float r15 = r11.getY()
            float r14 = r14 + r15
            float r15 = r0._thumbnailBGBottomPadding
            float r14 = r14 + r15
            int r15 = r0._thumbnailWidth
            float r15 = (float) r15
            int r9 = r0._thumbnailHeight
            float r9 = (float) r9
            r13.set(r12, r14, r15, r9)
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r23.getStage()
            com.badlogic.gdx.math.Rectangle r12 = r0._thumbnailBounds
            com.badlogic.gdx.math.Rectangle r13 = r0._scissorsBounds
            r9.calculateScissors(r12, r13)
            com.badlogic.gdx.math.Rectangle r9 = r0._scissorsBounds
            boolean r9 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r9)
            if (r9 == 0) goto L12f
            if (r3 < 0) goto Lfb
            if (r5 < r3) goto Lfb
            if (r5 > r4) goto Lfb
            r18 = 1
            goto Lfd
        Lfb:
            r18 = 0
        Lfd:
            org.fortheloss.sticknodes.SNShapeRenderer r12 = r0._shapeRendererRef
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r9 = r0._framesModuleRef
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r13 = r9.getNodeDrawTools()
            com.badlogic.gdx.math.Vector2 r9 = r0._thumbnailOffset
            float r14 = r9.x
            float r15 = r0._thumbnailBGSidePadding
            float r14 = r14 + r15
            float r9 = r9.y
            float r15 = r0._thumbnailBGBottomPadding
            float r15 = r15 + r9
            int r9 = r0._thumbnailWidth
            float r9 = (float) r9
            int r10 = r0._thumbnailHeight
            float r10 = (float) r10
            r16 = r9
            r17 = r10
            r19 = r1
            r20 = r21
            r11.drawThumbnail(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            com.badlogic.gdx.math.Matrix4 r9 = r0._rememberedTransformMatrix
            r7.setTransformMatrix(r9)
            org.fortheloss.sticknodes.SNShapeRenderer r9 = r0._shapeRendererRef
            r9.flush()
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
        L12f:
            int r5 = r5 + 1
            r10 = 1
            goto L96
        L134:
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            r1.end()
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glEnable(r2)
            r24.begin()
            r7.setColor(r8, r8, r8, r8)
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r0._bitmapFont
            r1.setColor(r8, r8, r8, r8)
            int r1 = r0._startIndex
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r2 = r0._frameThumbnails
            int r2 = r2.size()
        L151:
            if (r1 >= r2) goto L1a1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r3 = r0._frameThumbnails
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r3 = (org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail) r3
            float r4 = r23.getX()
            float r5 = r3.getX()
            float r4 = r4 + r5
            float r5 = r0._maxVisibleX
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L16b
            goto L1a1
        L16b:
            boolean r5 = r0._onlyRenderEveryThirdFrame
            if (r5 == 0) goto L180
            if (r1 == 0) goto L180
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r5 = r0._frameThumbnails
            int r5 = r5.size()
            r6 = 1
            int r5 = r5 - r6
            if (r1 == r5) goto L180
            int r5 = r1 % 3
            if (r5 == 0) goto L180
            goto L19e
        L180:
            com.badlogic.gdx.graphics.g2d.BitmapFont r5 = r0._bitmapFont
            int r6 = r1 + 1
            java.lang.String r6 = java.lang.String.valueOf(r6)
            float r9 = r0._thumbnailBGSidePadding
            float r4 = r4 + r9
            float r9 = r0._textPadding
            float r4 = r4 + r9
            float r9 = r23.getY()
            float r3 = r3.getY()
            float r9 = r9 + r3
            int r3 = r0._thumbnailHeight
            float r3 = (float) r3
            float r9 = r9 + r3
            r5.draw(r7, r6, r4, r9)
        L19e:
            int r1 = r1 + 1
            goto L151
        L1a1:
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            boolean r1 = r1.getPreserveSelectionWhenChangingFrames()
            r9 = 1060320051(0x3f333333, float:0.7)
            if (r1 == 0) goto L1b9
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            int r1 = r1.getCurrentlySelected()
            r2 = 4
            if (r1 == r2) goto L1b9
            r10 = 1060320051(0x3f333333, float:0.7)
            goto L1bb
        L1b9:
            r10 = 1065353216(0x3f800000, float:1.0)
        L1bb:
            r7.setColor(r8, r8, r8, r9)
            int r1 = r0._startIndex
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r2 = r0._frameThumbnails
            int r11 = r2.size()
            r12 = r1
        L1c7:
            if (r12 >= r11) goto L341
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r1 = r0._frameThumbnails
            java.lang.Object r1 = r1.get(r12)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r1 = (org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail) r1
            float r2 = r23.getX()
            float r3 = r1.getX()
            float r13 = r2 + r3
            float r2 = r23.getY()
            float r3 = r1.getY()
            float r14 = r2 + r3
            float r2 = r0._maxVisibleX
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1ed
            goto L341
        L1ed:
            org.fortheloss.sticknodes.data.IFrameData r15 = r1.getFrameData()
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._frameCopyMenuSymbol
            com.badlogic.gdx.math.Vector2 r3 = r0._pointCopyMenu
            float r4 = r3.x
            float r4 = r4 + r13
            int r4 = (int) r4
            float r4 = (float) r4
            float r3 = r3.y
            float r3 = r3 + r14
            int r3 = (int) r3
            float r3 = (float) r3
            r7.draw(r2, r4, r3)
            com.badlogic.gdx.math.Vector2 r2 = r0._pointBR
            float r2 = r2.x
            float r2 = r2 + r13
            r3 = 0
            boolean r4 = r0._isMovieclipThumbs
            if (r4 != 0) goto L2a8
            r3 = r15
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            boolean r4 = r3.isAutoCameraOriginFrame()
            if (r4 == 0) goto L227
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._frameIconAutoCamStart
            com.badlogic.gdx.math.Vector2 r5 = r0._pointAutocam
            float r6 = r5.x
            float r6 = r6 + r13
            int r6 = (int) r6
            float r6 = (float) r6
            float r5 = r5.y
            float r5 = r5 + r14
            int r5 = (int) r5
            float r5 = (float) r5
            r7.draw(r4, r6, r5)
            goto L242
        L227:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r4 = r3.getFrameCamera()
            boolean r4 = r4.isAutoCamera()
            if (r4 == 0) goto L242
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._frameIconAutoCam
            com.badlogic.gdx.math.Vector2 r5 = r0._pointAutocam
            float r6 = r5.x
            float r6 = r6 + r13
            int r6 = (int) r6
            float r6 = (float) r6
            float r5 = r5.y
            float r5 = r5 + r14
            int r5 = (int) r5
            float r5 = (float) r5
            r7.draw(r4, r6, r5)
        L242:
            boolean r4 = r3.isDelayed()
            if (r4 == 0) goto L271
            boolean r4 = r3.getCameraIsMovingDuringDelay()
            if (r4 == 0) goto L260
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._frameIconDelayWithCamera
            com.badlogic.gdx.math.Vector2 r5 = r0._pointDelay
            float r6 = r5.x
            float r6 = r6 + r13
            int r6 = (int) r6
            float r6 = (float) r6
            float r5 = r5.y
            float r5 = r5 + r14
            int r5 = (int) r5
            float r5 = (float) r5
            r7.draw(r4, r6, r5)
            goto L271
        L260:
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._frameIconDelay
            com.badlogic.gdx.math.Vector2 r5 = r0._pointDelay
            float r6 = r5.x
            float r6 = r6 + r13
            int r6 = (int) r6
            float r6 = (float) r6
            float r5 = r5.y
            float r5 = r5 + r14
            int r5 = (int) r5
            float r5 = (float) r5
            r7.draw(r4, r6, r5)
        L271:
            org.fortheloss.sticknodes.data.ProjectData r4 = r0._projectDataRef
            boolean r4 = r4.tweeningEnabled
            if (r4 == 0) goto L2bf
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._frameIconTweenNone
            boolean r5 = r15.isTweened()
            if (r5 == 0) goto L299
            boolean r4 = r15.getIsUsingSlowMotionTweenedFrames()
            if (r4 != 0) goto L288
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._frameIconTween
            goto L299
        L288:
            org.fortheloss.sticknodes.data.ProjectData r4 = r0._projectDataRef
            int r4 = r4.getActualNumTweenedFrames()
            int r5 = r15.getSlowMotionTweenedFrames()
            if (r5 < r4) goto L297
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._frameIconTweenSlow
            goto L299
        L297:
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._frameIconTweenFast
        L299:
            int r5 = (int) r2
            float r5 = (float) r5
            com.badlogic.gdx.math.Vector2 r6 = r0._pointBR
            float r6 = r6.y
            float r6 = r6 + r14
            int r6 = (int) r6
            float r6 = (float) r6
            r7.draw(r4, r5, r6)
            float r4 = r0._pointBottomPadding
            goto L2be
        L2a8:
            boolean r4 = r15.isTweened()
            if (r4 != 0) goto L2bf
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._frameIconTweenNone
            int r5 = (int) r2
            float r5 = (float) r5
            com.badlogic.gdx.math.Vector2 r6 = r0._pointBR
            float r6 = r6.y
            float r6 = r6 + r14
            int r6 = (int) r6
            float r6 = (float) r6
            r7.draw(r4, r5, r6)
            float r4 = r0._pointBottomPadding
        L2be:
            float r2 = r2 - r4
        L2bf:
            int r4 = r15.getSoundToPlayLibraryID()
            if (r4 < 0) goto L2d6
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._frameIconSound
            int r5 = (int) r2
            float r5 = (float) r5
            com.badlogic.gdx.math.Vector2 r6 = r0._pointBR
            float r6 = r6.y
            float r6 = r6 + r14
            int r6 = (int) r6
            float r6 = (float) r6
            r7.draw(r4, r5, r6)
            float r4 = r0._pointBottomPadding
            float r2 = r2 - r4
        L2d6:
            boolean r4 = r0._isMovieclipThumbs
            if (r4 != 0) goto L2ee
            boolean r3 = r3.willStopSounds()
            if (r3 == 0) goto L2ee
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r0._frameIconSoundSilenceAll
            int r2 = (int) r2
            float r2 = (float) r2
            com.badlogic.gdx.math.Vector2 r4 = r0._pointBR
            float r4 = r4.y
            float r4 = r4 + r14
            int r4 = (int) r4
            float r4 = (float) r4
            r7.draw(r3, r2, r4)
        L2ee:
            int r2 = r0._currentFrame
            if (r12 != r2) goto L31c
            r7.setColor(r8, r8, r8, r10)
            com.badlogic.gdx.graphics.g2d.NinePatch r2 = r0._thumbnailSelectedBG
            float r3 = r23.getY()
            float r1 = r1.getY()
            float r4 = r3 + r1
            int r1 = r0._thumbnailWidth
            float r1 = (float) r1
            float r3 = r0._thumbnailBGSidePadding
            float r3 = r3 * r22
            float r1 = r1 + r3
            float r5 = r1 + r8
            int r1 = r0._thumbnailHeight
            float r1 = (float) r1
            float r3 = r0._thumbnailBGBottomPadding
            float r6 = r1 + r3
            r1 = r2
            r2 = r24
            r3 = r13
            r1.draw(r2, r3, r4, r5, r6)
            r7.setColor(r8, r8, r8, r9)
        L31c:
            boolean r1 = r0._isMovieclipThumbs
            if (r1 != 0) goto L33d
            org.fortheloss.sticknodes.data.FrameData r15 = (org.fortheloss.sticknodes.data.FrameData) r15
            boolean r1 = r15.getIsRepeating()
            if (r1 == 0) goto L33d
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._frameIconRepeat
            r2 = 1099956224(0x41900000, float:18.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            float r13 = r13 + r2
            int r2 = (int) r13
            float r2 = (float) r2
            r4 = 1126825984(0x432a0000, float:170.0)
            float r3 = r3 * r4
            float r14 = r14 + r3
            int r3 = (int) r14
            float r3 = (float) r3
            r7.draw(r1, r2, r3)
        L33d:
            int r12 = r12 + 1
            goto L1c7
        L341:
            int r1 = r0._showCurrentFrameSelectionOffscreen
            r2 = -1
            r3 = 1114636288(0x42700000, float:60.0)
            r4 = 1092616192(0x41200000, float:10.0)
            if (r1 != r2) goto L36d
            r7.setColor(r8, r8, r8, r10)
            com.badlogic.gdx.graphics.g2d.NinePatch r1 = r0._thumbnailSelectedBG
            r5 = 0
            float r2 = r23.getY()
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r6
            float r8 = r2 + r3
            float r6 = r6 * r4
            int r2 = r0._thumbnailHeight
            float r2 = (float) r2
            float r3 = r0._thumbnailBGBottomPadding
            float r9 = r2 + r3
            r2 = r24
            r3 = r5
            r4 = r8
            r5 = r6
            r6 = r9
            r1.draw(r2, r3, r4, r5, r6)
            goto L399
        L36d:
            r2 = 1
            if (r1 != r2) goto L399
            r7.setColor(r8, r8, r8, r10)
            com.badlogic.gdx.graphics.g2d.NinePatch r1 = r0._thumbnailSelectedBG
            float r2 = r0._maxVisibleX
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            float r5 = r2 - r5
            float r2 = r23.getY()
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r6
            float r8 = r2 + r3
            float r6 = r6 * r4
            int r2 = r0._thumbnailHeight
            float r2 = (float) r2
            float r3 = r0._thumbnailBGBottomPadding
            float r9 = r2 + r3
            r2 = r24
            r3 = r5
            r4 = r8
            r5 = r6
            r6 = r9
            r1.draw(r2, r3, r4, r5, r6)
        L399:
            return
    }

    public org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail getCurrentThumbnail() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r0 = r2._frameThumbnails
            int r1 = r2._currentFrame
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r0 = (org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail) r0
            return r0
    }

    public int getShowCurrentFrameSelectionOffscreen() {
            r1 = this;
            int r0 = r1._showCurrentFrameSelectionOffscreen
            return r0
    }

    public float getThumbnailHeight() {
            r1 = this;
            int r0 = r1._thumbnailHeight
            float r0 = (float) r0
            return r0
    }

    public float getThumbnailWidth() {
            r1 = this;
            int r0 = r1._thumbnailWidth
            float r0 = (float) r0
            return r0
    }

    public float getThumbnailX(int r2) {
            r1 = this;
            if (r2 > 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r0 = r1._frameThumbnails
            int r0 = r0.size()
            int r0 = r0 + (-1)
            if (r2 < r0) goto L21
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r2 = r1._frameThumbnails
            int r0 = r2.size()
            int r0 = r0 + (-1)
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r2 = (org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail) r2
            float r2 = r2.getX()
            return r2
        L21:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r0 = r1._frameThumbnails
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r2 = (org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail) r2
            float r2 = r2.getX()
            return r2
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.FramesContainer r1) {
            r0 = this;
            r0.recalculateWidth()
            r0._framesContainerRef = r1
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r0._clickListener
            r0.addListener(r1)
            return
    }

    public void onlyRenderThirdFrames(boolean r1) {
            r0 = this;
            r0._onlyRenderEveryThirdFrame = r1
            return
    }

    public void reset() {
            r2 = this;
            r2.clear()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r0 = r2._frameThumbnails
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lb:
            if (r0 < 0) goto L1b
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r1 = r2._frameThumbnails
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail r1 = (org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail) r1
            r1.dispose()
            int r0 = r0 + (-1)
            goto Lb
        L1b:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.FrameThumbnail> r0 = r2._frameThumbnails
            r0.clear()
            return
    }

    public void setCurrentFrame(int r1) {
            r0 = this;
            r0._currentFrame = r1
            return
    }

    public void setMaxVisibleX(float r1) {
            r0 = this;
            r0._maxVisibleX = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void setPosition(float r2, float r3) {
            r1 = this;
            r0 = 0
            super.setPosition(r2, r0)
            float r0 = r1._oldX
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L10
            float r0 = r1._oldY
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L17
        L10:
            r1._oldX = r2
            r1._oldY = r3
            r2 = 1
            r1._positionIsDirty = r2
        L17:
            return
    }

    public void setShowCurrentFrameSelectionOffscreen(int r1) {
            r0 = this;
            r0._showCurrentFrameSelectionOffscreen = r1
            return
    }
}
