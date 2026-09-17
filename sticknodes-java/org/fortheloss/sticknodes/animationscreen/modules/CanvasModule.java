package org.fortheloss.sticknodes.animationscreen.modules;

/* loaded from: classes2.dex */
public class CanvasModule extends org.fortheloss.sticknodes.animationscreen.modules.Module {
    public static boolean DEBUG_USE_TILDE_RENDER_AA;
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private org.fortheloss.sticknodes.animationscreen.ArrowsWindow _arrowsWindow;
    private org.fortheloss.framework.Assets _assetsRef;
    private float _backgroundImageHeight;
    private com.badlogic.gdx.graphics.Texture _backgroundImageRef;
    private float _backgroundImageWidth;
    private com.badlogic.gdx.math.Vector2 _cameraOffsetBeforeDragging;
    private com.badlogic.gdx.math.Vector2 _cameraStartDrag;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _clickListener;
    private org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule _createToolsModuleRef;
    private int _currentScreenForZoomData;
    private org.fortheloss.sticknodes.sprite.SpriteRef _deselectSpriteRef;
    private float _deselectSpriteSeconds;
    private boolean _dragIsBeyondDeadzone;
    private int _dragLockState;
    private com.badlogic.gdx.math.Vector2 _dragOffset;
    private boolean _draggedNodeIsLocked;
    private org.fortheloss.sticknodes.stickfigure.INode _draggedNodeRef;
    private org.fortheloss.sticknodes.TextfieldBox _draggedTextfieldRef;
    private boolean _draggingLeftGuide;
    private boolean _drawNodesOnTracedFbo;
    private com.badlogic.gdx.graphics.g2d.BitmapFont _drawOrderBitmapFont;
    private boolean _drawTweenedTextfieldBoxes;
    private org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode _eventActionDragWithLockedNode;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> _figuresRef;
    private org.fortheloss.sticknodes.animationscreen.FilterBundle _filterBundle;
    private boolean _flagAllowSpriteDeselectTimer;
    private boolean _flagCancelSpriteDeselection;
    private boolean _flagNextOnionSkinBlank;
    private boolean _flagPreviousOnionSkinBlank;
    private boolean _frameCameraDragWaitFlag;
    private org.fortheloss.sticknodes.data.FrameData _frameDataToTraceRef;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private float _fullscreenHeight;
    private float _fullscreenScale;
    private com.badlogic.gdx.math.Rectangle _fullscreenScissorBounds;
    private float _fullscreenWidth;
    private float _fullscreenX;
    private float _fullscreenY;
    com.badlogic.gdx.input.GestureDetector _gestureDetector;
    private com.badlogic.gdx.graphics.g2d.GlyphLayout _glyphLayout;
    private float _guideStartDrag;
    private float _guidelineX;
    private float _guidelineY;
    private boolean _hasBeenRedrawnFlag;
    private int _initialNotchBeginZooming;
    private boolean _isActiveDragging;
    private boolean _isActiveZooming;
    private boolean _isCreatingNode;
    private boolean _isDisposed;
    private boolean _isDragLockHorizontal;
    private boolean _isDraggingCamera;
    private boolean _isDraggingCanvas;
    private boolean _isDraggingGuide;
    private boolean _isTouchDownOnSameNode;
    private boolean _isTracingBG;
    private boolean _isUsingCreationOrMovieclipBackgroundImage;
    private boolean _isWaitingForUserToChooseFigure;
    private boolean _isWaitingForUserToChooseFigureAllowMCs;
    private boolean _isZoomingCanvas;
    private boolean _justCreatedPolyfill;
    private com.badlogic.gdx.math.Vector2 _lockedNodeDragOffsetAccumulation;
    private boolean _magnifiedNodeSelected;
    private org.fortheloss.sticknodes.animationscreen.Magnifier _magnifier;
    private org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule _movieclipToolsModuleRef;
    private boolean _nextOnionSkinDirty;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer _nextOnionSkinFrameBuffer;
    private float _nodeDragDeadZoneRadiusSquared;
    private float _nodeDragInitialAngle;
    private com.badlogic.gdx.math.Vector2 _nodeDragInitialPosition;
    private float _nodeDragParentInitialAngle;
    private com.badlogic.gdx.math.Vector2 _nodeDragParentInitialPosition;
    private boolean _nodeDragWaitFlag;
    private com.badlogic.gdx.math.Vector2 _oldZoomDragPosition;
    private com.badlogic.gdx.graphics.OrthographicCamera _onionSkinCamera;
    private com.badlogic.gdx.math.Vector2 _panningStartDrag;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _playingFrameCamera;
    private float _ppi;
    private boolean _previousOnionSkinDirty;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer _previousOnionSkinFrameBuffer;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private org.fortheloss.sticknodes.animationscreen.QuickMenuTable _quickMenuTable;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool _quickResizeTool;
    private com.badlogic.gdx.math.Matrix4 _rememberedMatrix;
    private int _rememberedZoomNotchAnimationScreen;
    private int _rememberedZoomNotchMovieclipScreen;
    private float _rememberedZoomPositionXAnimationScreen;
    private float _rememberedZoomPositionXMovieclipScreen;
    private float _rememberedZoomPositionYAnimationScreen;
    private float _rememberedZoomPositionYMovieclipScreen;
    private com.badlogic.gdx.math.Rectangle _scissorBounds;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;
    private org.fortheloss.sticknodes.SNShapeRenderer _shapeRendererRef;
    private boolean _showArrowsWhenEnterAnimationScreen;
    private boolean _showArrowsWhenEnterNormalMode;
    private boolean _showMagnifierWhenEnterNormalMode;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _stickfigureToTraceRef;
    private com.badlogic.gdx.graphics.glutils.ShaderProgram _textfieldBoxDFShaderRef;
    private java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> _textfieldBoxesRef;
    private boolean _textfieldDragWaitFlag;
    private java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> _textfieldsAboveWidescreenRef;
    private float _totalPanX;
    private float _totalPanY;
    private long _touchDownStartMillis;
    private com.badlogic.gdx.math.Vector2 _touchZoomPointer;
    private boolean _tracingFBODirty;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer _tracingFrameBuffer;
    private float _viewableCanvasHeight;
    private float _viewableCanvasWidth;
    private org.fortheloss.sticknodes.TextfieldBox _watermarkText;
    private com.badlogic.gdx.math.Rectangle _ytShortsFullscreenScissorBounds;
    private com.badlogic.gdx.math.Rectangle _ytShortsScissorBounds;
    private float _zoom;
    private float _zoomGoal;
    private int _zoomNotch;
    private com.badlogic.gdx.math.Vector2 _zoomPosition;
    private com.badlogic.gdx.scenes.scene2d.Actor mCanvasTouchArea;
    private org.fortheloss.sticknodes.NodeDigger mNodeDigger;
    private org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked mQrtDocked;





    /* renamed from: -$$Nest$fget_animateToolsModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule m691$$Nest$fget_animateToolsModuleRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r0._animateToolsModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_cameraOffsetBeforeDragging, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m692$$Nest$fget_cameraOffsetBeforeDragging(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._cameraOffsetBeforeDragging
            return r0
    }

    /* renamed from: -$$Nest$fget_cameraStartDrag, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m693$$Nest$fget_cameraStartDrag(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._cameraStartDrag
            return r0
    }

    /* renamed from: -$$Nest$fget_createToolsModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule m694$$Nest$fget_createToolsModuleRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r0._createToolsModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_dragIsBeyondDeadzone, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m695$$Nest$fget_dragIsBeyondDeadzone(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._dragIsBeyondDeadzone
            return r0
    }

    /* renamed from: -$$Nest$fget_dragLockState, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m696$$Nest$fget_dragLockState(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            int r0 = r0._dragLockState
            return r0
    }

    /* renamed from: -$$Nest$fget_dragOffset, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m697$$Nest$fget_dragOffset(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._dragOffset
            return r0
    }

    /* renamed from: -$$Nest$fget_draggedNodeIsLocked, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m698$$Nest$fget_draggedNodeIsLocked(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._draggedNodeIsLocked
            return r0
    }

    /* renamed from: -$$Nest$fget_draggedNodeRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.stickfigure.INode m699$$Nest$fget_draggedNodeRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0._draggedNodeRef
            return r0
    }

    /* renamed from: -$$Nest$fget_draggedTextfieldRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.TextfieldBox m700$$Nest$fget_draggedTextfieldRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            org.fortheloss.sticknodes.TextfieldBox r0 = r0._draggedTextfieldRef
            return r0
    }

    /* renamed from: -$$Nest$fget_draggingLeftGuide, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m701$$Nest$fget_draggingLeftGuide(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._draggingLeftGuide
            return r0
    }

    /* renamed from: -$$Nest$fget_eventActionDragWithLockedNode, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode m702$$Nest$fget_eventActionDragWithLockedNode(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode r0 = r0._eventActionDragWithLockedNode
            return r0
    }

    /* renamed from: -$$Nest$fget_figuresRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m703$$Nest$fget_figuresRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r0._figuresRef
            return r0
    }

    /* renamed from: -$$Nest$fget_flagAllowSpriteDeselectTimer, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m704$$Nest$fget_flagAllowSpriteDeselectTimer(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._flagAllowSpriteDeselectTimer
            return r0
    }

    /* renamed from: -$$Nest$fget_frameCameraDragWaitFlag, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m705$$Nest$fget_frameCameraDragWaitFlag(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._frameCameraDragWaitFlag
            return r0
    }

    /* renamed from: -$$Nest$fget_frameDataToTraceRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.FrameData m706$$Nest$fget_frameDataToTraceRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            org.fortheloss.sticknodes.data.FrameData r0 = r0._frameDataToTraceRef
            return r0
    }

    /* renamed from: -$$Nest$fget_framesModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.FramesModule m707$$Nest$fget_framesModuleRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r0._framesModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_guideStartDrag, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m708$$Nest$fget_guideStartDrag(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            float r0 = r0._guideStartDrag
            return r0
    }

    /* renamed from: -$$Nest$fget_guidelineX, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m709$$Nest$fget_guidelineX(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            float r0 = r0._guidelineX
            return r0
    }

    /* renamed from: -$$Nest$fget_guidelineY, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m710$$Nest$fget_guidelineY(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            float r0 = r0._guidelineY
            return r0
    }

    /* renamed from: -$$Nest$fget_initialNotchBeginZooming, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m711$$Nest$fget_initialNotchBeginZooming(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            int r0 = r0._initialNotchBeginZooming
            return r0
    }

    /* renamed from: -$$Nest$fget_isActiveDragging, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m712$$Nest$fget_isActiveDragging(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._isActiveDragging
            return r0
    }

    /* renamed from: -$$Nest$fget_isActiveZooming, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m713$$Nest$fget_isActiveZooming(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._isActiveZooming
            return r0
    }

    /* renamed from: -$$Nest$fget_isCreatingNode, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m714$$Nest$fget_isCreatingNode(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._isCreatingNode
            return r0
    }

    /* renamed from: -$$Nest$fget_isDisposed, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m715$$Nest$fget_isDisposed(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._isDisposed
            return r0
    }

    /* renamed from: -$$Nest$fget_isDragLockHorizontal, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m716$$Nest$fget_isDragLockHorizontal(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._isDragLockHorizontal
            return r0
    }

    /* renamed from: -$$Nest$fget_isDraggingCamera, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m717$$Nest$fget_isDraggingCamera(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._isDraggingCamera
            return r0
    }

    /* renamed from: -$$Nest$fget_isDraggingCanvas, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m718$$Nest$fget_isDraggingCanvas(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._isDraggingCanvas
            return r0
    }

    /* renamed from: -$$Nest$fget_isDraggingGuide, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m719$$Nest$fget_isDraggingGuide(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._isDraggingGuide
            return r0
    }

    /* renamed from: -$$Nest$fget_isTouchDownOnSameNode, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m720$$Nest$fget_isTouchDownOnSameNode(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._isTouchDownOnSameNode
            return r0
    }

    /* renamed from: -$$Nest$fget_isWaitingForUserToChooseFigure, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m721$$Nest$fget_isWaitingForUserToChooseFigure(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._isWaitingForUserToChooseFigure
            return r0
    }

    /* renamed from: -$$Nest$fget_justCreatedPolyfill, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m722$$Nest$fget_justCreatedPolyfill(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._justCreatedPolyfill
            return r0
    }

    /* renamed from: -$$Nest$fget_lockedNodeDragOffsetAccumulation, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m723$$Nest$fget_lockedNodeDragOffsetAccumulation(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._lockedNodeDragOffsetAccumulation
            return r0
    }

    /* renamed from: -$$Nest$fget_magnifiedNodeSelected, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m724$$Nest$fget_magnifiedNodeSelected(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._magnifiedNodeSelected
            return r0
    }

    /* renamed from: -$$Nest$fget_magnifier, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.Magnifier m725$$Nest$fget_magnifier(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            org.fortheloss.sticknodes.animationscreen.Magnifier r0 = r0._magnifier
            return r0
    }

    /* renamed from: -$$Nest$fget_movieclipToolsModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule m726$$Nest$fget_movieclipToolsModuleRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r0._movieclipToolsModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_nodeDragDeadZoneRadiusSquared, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m727$$Nest$fget_nodeDragDeadZoneRadiusSquared(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            float r0 = r0._nodeDragDeadZoneRadiusSquared
            return r0
    }

    /* renamed from: -$$Nest$fget_nodeDragInitialAngle, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m728$$Nest$fget_nodeDragInitialAngle(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            float r0 = r0._nodeDragInitialAngle
            return r0
    }

    /* renamed from: -$$Nest$fget_nodeDragInitialPosition, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m729$$Nest$fget_nodeDragInitialPosition(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._nodeDragInitialPosition
            return r0
    }

    /* renamed from: -$$Nest$fget_nodeDragParentInitialPosition, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m730$$Nest$fget_nodeDragParentInitialPosition(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._nodeDragParentInitialPosition
            return r0
    }

    /* renamed from: -$$Nest$fget_nodeDragWaitFlag, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m731$$Nest$fget_nodeDragWaitFlag(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._nodeDragWaitFlag
            return r0
    }

    /* renamed from: -$$Nest$fget_oldZoomDragPosition, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m732$$Nest$fget_oldZoomDragPosition(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._oldZoomDragPosition
            return r0
    }

    /* renamed from: -$$Nest$fget_panningStartDrag, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m733$$Nest$fget_panningStartDrag(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._panningStartDrag
            return r0
    }

    /* renamed from: -$$Nest$fget_ppi, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m734$$Nest$fget_ppi(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            float r0 = r0._ppi
            return r0
    }

    /* renamed from: -$$Nest$fget_projectDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.ProjectData m735$$Nest$fget_projectDataRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            org.fortheloss.sticknodes.data.ProjectData r0 = r0._projectDataRef
            return r0
    }

    /* renamed from: -$$Nest$fget_quickResizeTool, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool m736$$Nest$fget_quickResizeTool(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0 = r0._quickResizeTool
            return r0
    }

    /* renamed from: -$$Nest$fget_sessionDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.SessionData m737$$Nest$fget_sessionDataRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            org.fortheloss.sticknodes.data.SessionData r0 = r0._sessionDataRef
            return r0
    }

    /* renamed from: -$$Nest$fget_textfieldBoxesRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m738$$Nest$fget_textfieldBoxesRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r0._textfieldBoxesRef
            return r0
    }

    /* renamed from: -$$Nest$fget_textfieldDragWaitFlag, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m739$$Nest$fget_textfieldDragWaitFlag(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            boolean r0 = r0._textfieldDragWaitFlag
            return r0
    }

    /* renamed from: -$$Nest$fget_totalPanX, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m740$$Nest$fget_totalPanX(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            float r0 = r0._totalPanX
            return r0
    }

    /* renamed from: -$$Nest$fget_totalPanY, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m741$$Nest$fget_totalPanY(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            float r0 = r0._totalPanY
            return r0
    }

    /* renamed from: -$$Nest$fget_touchDownStartMillis, reason: not valid java name */
    static /* bridge */ /* synthetic */ long m742$$Nest$fget_touchDownStartMillis(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2) {
            long r0 = r2._touchDownStartMillis
            return r0
    }

    /* renamed from: -$$Nest$fget_touchZoomPointer, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m743$$Nest$fget_touchZoomPointer(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._touchZoomPointer
            return r0
    }

    /* renamed from: -$$Nest$fget_zoom, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m744$$Nest$fget_zoom(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            float r0 = r0._zoom
            return r0
    }

    /* renamed from: -$$Nest$fget_zoomNotch, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m745$$Nest$fget_zoomNotch(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            int r0 = r0._zoomNotch
            return r0
    }

    /* renamed from: -$$Nest$fget_zoomPosition, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m746$$Nest$fget_zoomPosition(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._zoomPosition
            return r0
    }

    /* renamed from: -$$Nest$fgetmCanvasTouchArea, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.Actor m747$$Nest$fgetmCanvasTouchArea(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.mCanvasTouchArea
            return r0
    }

    /* renamed from: -$$Nest$fgetmNodeDigger, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.NodeDigger m748$$Nest$fgetmNodeDigger(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            org.fortheloss.sticknodes.NodeDigger r0 = r0.mNodeDigger
            return r0
    }

    /* renamed from: -$$Nest$fput_deselectSpriteRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m749$$Nest$fput_deselectSpriteRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, org.fortheloss.sticknodes.sprite.SpriteRef r1) {
            r0._deselectSpriteRef = r1
            return
    }

    /* renamed from: -$$Nest$fput_deselectSpriteSeconds, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m750$$Nest$fput_deselectSpriteSeconds(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, float r1) {
            r0._deselectSpriteSeconds = r1
            return
    }

    /* renamed from: -$$Nest$fput_dragIsBeyondDeadzone, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m751$$Nest$fput_dragIsBeyondDeadzone(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._dragIsBeyondDeadzone = r1
            return
    }

    /* renamed from: -$$Nest$fput_dragLockState, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m752$$Nest$fput_dragLockState(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, int r1) {
            r0._dragLockState = r1
            return
    }

    /* renamed from: -$$Nest$fput_draggedNodeIsLocked, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m753$$Nest$fput_draggedNodeIsLocked(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._draggedNodeIsLocked = r1
            return
    }

    /* renamed from: -$$Nest$fput_draggedNodeRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m754$$Nest$fput_draggedNodeRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, org.fortheloss.sticknodes.stickfigure.INode r1) {
            r0._draggedNodeRef = r1
            return
    }

    /* renamed from: -$$Nest$fput_draggedTextfieldRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m755$$Nest$fput_draggedTextfieldRef(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, org.fortheloss.sticknodes.TextfieldBox r1) {
            r0._draggedTextfieldRef = r1
            return
    }

    /* renamed from: -$$Nest$fput_draggingLeftGuide, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m756$$Nest$fput_draggingLeftGuide(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._draggingLeftGuide = r1
            return
    }

    /* renamed from: -$$Nest$fput_flagAllowSpriteDeselectTimer, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m757$$Nest$fput_flagAllowSpriteDeselectTimer(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._flagAllowSpriteDeselectTimer = r1
            return
    }

    /* renamed from: -$$Nest$fput_flagCancelSpriteDeselection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m758$$Nest$fput_flagCancelSpriteDeselection(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._flagCancelSpriteDeselection = r1
            return
    }

    /* renamed from: -$$Nest$fput_frameCameraDragWaitFlag, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m759$$Nest$fput_frameCameraDragWaitFlag(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._frameCameraDragWaitFlag = r1
            return
    }

    /* renamed from: -$$Nest$fput_guideStartDrag, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m760$$Nest$fput_guideStartDrag(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, float r1) {
            r0._guideStartDrag = r1
            return
    }

    /* renamed from: -$$Nest$fput_guidelineX, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m761$$Nest$fput_guidelineX(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, float r1) {
            r0._guidelineX = r1
            return
    }

    /* renamed from: -$$Nest$fput_guidelineY, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m762$$Nest$fput_guidelineY(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, float r1) {
            r0._guidelineY = r1
            return
    }

    /* renamed from: -$$Nest$fput_initialNotchBeginZooming, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m763$$Nest$fput_initialNotchBeginZooming(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, int r1) {
            r0._initialNotchBeginZooming = r1
            return
    }

    /* renamed from: -$$Nest$fput_isActiveZooming, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m764$$Nest$fput_isActiveZooming(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._isActiveZooming = r1
            return
    }

    /* renamed from: -$$Nest$fput_isCreatingNode, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m765$$Nest$fput_isCreatingNode(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._isCreatingNode = r1
            return
    }

    /* renamed from: -$$Nest$fput_isDraggingCamera, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m766$$Nest$fput_isDraggingCamera(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._isDraggingCamera = r1
            return
    }

    /* renamed from: -$$Nest$fput_isDraggingCanvas, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m767$$Nest$fput_isDraggingCanvas(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._isDraggingCanvas = r1
            return
    }

    /* renamed from: -$$Nest$fput_isDraggingGuide, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m768$$Nest$fput_isDraggingGuide(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._isDraggingGuide = r1
            return
    }

    /* renamed from: -$$Nest$fput_isTouchDownOnSameNode, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m769$$Nest$fput_isTouchDownOnSameNode(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._isTouchDownOnSameNode = r1
            return
    }

    /* renamed from: -$$Nest$fput_justCreatedPolyfill, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m770$$Nest$fput_justCreatedPolyfill(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._justCreatedPolyfill = r1
            return
    }

    /* renamed from: -$$Nest$fput_magnifiedNodeSelected, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m771$$Nest$fput_magnifiedNodeSelected(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._magnifiedNodeSelected = r1
            return
    }

    /* renamed from: -$$Nest$fput_nextOnionSkinDirty, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m772$$Nest$fput_nextOnionSkinDirty(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._nextOnionSkinDirty = r1
            return
    }

    /* renamed from: -$$Nest$fput_nodeDragInitialAngle, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m773$$Nest$fput_nodeDragInitialAngle(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, float r1) {
            r0._nodeDragInitialAngle = r1
            return
    }

    /* renamed from: -$$Nest$fput_nodeDragParentInitialAngle, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m774$$Nest$fput_nodeDragParentInitialAngle(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, float r1) {
            r0._nodeDragParentInitialAngle = r1
            return
    }

    /* renamed from: -$$Nest$fput_nodeDragWaitFlag, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m775$$Nest$fput_nodeDragWaitFlag(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._nodeDragWaitFlag = r1
            return
    }

    /* renamed from: -$$Nest$fput_previousOnionSkinDirty, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m776$$Nest$fput_previousOnionSkinDirty(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._previousOnionSkinDirty = r1
            return
    }

    /* renamed from: -$$Nest$fput_textfieldDragWaitFlag, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m777$$Nest$fput_textfieldDragWaitFlag(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._textfieldDragWaitFlag = r1
            return
    }

    /* renamed from: -$$Nest$fput_totalPanX, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m778$$Nest$fput_totalPanX(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, float r1) {
            r0._totalPanX = r1
            return
    }

    /* renamed from: -$$Nest$fput_totalPanY, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m779$$Nest$fput_totalPanY(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, float r1) {
            r0._totalPanY = r1
            return
    }

    /* renamed from: -$$Nest$fput_touchDownStartMillis, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m780$$Nest$fput_touchDownStartMillis(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, long r1) {
            r0._touchDownStartMillis = r1
            return
    }

    /* renamed from: -$$Nest$fput_tracingFBODirty, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m781$$Nest$fput_tracingFBODirty(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0._tracingFBODirty = r1
            return
    }

    /* renamed from: -$$Nest$fput_zoomNotch, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m782$$Nest$fput_zoomNotch(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, int r1) {
            r0._zoomNotch = r1
            return
    }

    /* renamed from: -$$Nest$mboundFrameCamera, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m783$$Nest$mboundFrameCamera(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, org.fortheloss.sticknodes.animationscreen.FrameCamera r1, boolean r2) {
            r0.boundFrameCamera(r1, r2)
            return
    }

    /* renamed from: -$$Nest$mcalculateZoomFromZoomNotch, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m784$$Nest$mcalculateZoomFromZoomNotch(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0) {
            r0.calculateZoomFromZoomNotch()
            return
    }

    /* renamed from: -$$Nest$mgetSelectedNodeFromFigures, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.stickfigure.INode m785$$Nest$mgetSelectedNodeFromFigures(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, float r1, float r2, float r3, boolean r4, org.fortheloss.sticknodes.NodeDigger r5) {
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getSelectedNodeFromFigures(r1, r2, r3, r4, r5)
            return r0
    }

    /* renamed from: -$$Nest$msetActiveDragging, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m786$$Nest$msetActiveDragging(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, boolean r1) {
            r0.setActiveDragging(r1)
            return
    }

    /* renamed from: -$$Nest$msetZoomPosition, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m787$$Nest$msetZoomPosition(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, float r1, float r2) {
            r0.setZoomPosition(r1, r2)
            return
    }

    /* renamed from: -$$Nest$mupdateDragLockState, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m788$$Nest$mupdateDragLockState(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0, float r1, float r2, float r3, float r4) {
            r0.updateDragLockState(r1, r2, r3, r4)
            return
    }

    static {
            return
    }

    public CanvasModule(org.fortheloss.sticknodes.animationscreen.AnimationScreen r4, com.badlogic.gdx.graphics.glutils.FrameBuffer r5) {
            r3 = this;
            r3.<init>(r4, r5)
            r4 = 0
            r3._fullscreenScale = r4
            r3._fullscreenWidth = r4
            r3._fullscreenHeight = r4
            r3._fullscreenX = r4
            r3._fullscreenY = r4
            r5 = 0
            r3._drawTweenedTextfieldBoxes = r5
            r3._tracingFBODirty = r5
            r0 = 1
            r3._drawNodesOnTracedFbo = r0
            r3._previousOnionSkinDirty = r5
            r3._nextOnionSkinDirty = r5
            r3._flagPreviousOnionSkinBlank = r5
            r3._flagNextOnionSkinBlank = r5
            r3._dragIsBeyondDeadzone = r5
            r1 = 0
            r3._touchDownStartMillis = r1
            r3._draggedNodeIsLocked = r5
            r3._nodeDragWaitFlag = r5
            r3._textfieldDragWaitFlag = r5
            r3._frameCameraDragWaitFlag = r5
            r1 = 1065353216(0x3f800000, float:1.0)
            r3._zoom = r1
            r2 = 10
            r3._zoomNotch = r2
            r3._initialNotchBeginZooming = r5
            r3._zoomGoal = r1
            r3._isCreatingNode = r5
            r3._isDraggingCamera = r5
            r3._totalPanX = r4
            r3._totalPanY = r4
            r3._isDraggingGuide = r5
            r3._draggingLeftGuide = r5
            r3._guideStartDrag = r4
            r3._isActiveZooming = r5
            r3._isActiveDragging = r5
            r3._isDraggingCanvas = r5
            r3._isZoomingCanvas = r5
            r3._justCreatedPolyfill = r5
            r3._isTouchDownOnSameNode = r5
            r3._isDisposed = r5
            r3._isUsingCreationOrMovieclipBackgroundImage = r5
            r3._backgroundImageWidth = r4
            r3._backgroundImageHeight = r4
            r3._viewableCanvasWidth = r4
            r3._viewableCanvasHeight = r4
            r3._isWaitingForUserToChooseFigure = r5
            r3._isWaitingForUserToChooseFigureAllowMCs = r0
            r3._nodeDragDeadZoneRadiusSquared = r4
            r3._rememberedZoomNotchAnimationScreen = r5
            r3._rememberedZoomPositionXAnimationScreen = r4
            r3._rememberedZoomPositionYAnimationScreen = r4
            r3._rememberedZoomNotchMovieclipScreen = r5
            r3._rememberedZoomPositionXMovieclipScreen = r4
            r3._rememberedZoomPositionYMovieclipScreen = r4
            r3._magnifiedNodeSelected = r5
            r3._hasBeenRedrawnFlag = r5
            r3._showMagnifierWhenEnterNormalMode = r5
            r3._showArrowsWhenEnterNormalMode = r5
            r3._showArrowsWhenEnterAnimationScreen = r5
            r1 = -1
            r3._dragLockState = r1
            r3._isDragLockHorizontal = r0
            r3._ppi = r4
            r3._guidelineX = r4
            r3._guidelineY = r4
            r3._isTracingBG = r5
            r3._currentScreenForZoomData = r5
            r3._deselectSpriteSeconds = r4
            r3._flagCancelSpriteDeselection = r5
            r3._flagAllowSpriteDeselectTimer = r0
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r5 = r5.getProjectData()
            r3._projectDataRef = r5
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r5 = r5.getSessionData()
            r3._sessionDataRef = r5
            org.fortheloss.sticknodes.data.ProjectData r5 = r3._projectDataRef
            int r0 = r5.canvasWidth
            float r0 = (float) r0
            int r5 = r5.canvasHeight
            float r5 = (float) r5
            r3.setSize(r0, r5)
            float r5 = r3.getWidth()
            r0 = 1084227584(0x40a00000, float:5.0)
            float r5 = r5 * r0
            r3._viewableCanvasWidth = r5
            float r5 = r3.getHeight()
            float r5 = r5 * r0
            r3._viewableCanvasHeight = r5
            com.badlogic.gdx.Graphics r5 = com.badlogic.gdx.Gdx.graphics
            float r5 = r5.getPpiY()
            r3._ppi = r5
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 > 0) goto Ld9
            com.badlogic.gdx.Graphics r4 = com.badlogic.gdx.Gdx.graphics
            int r4 = r4.getHeight()
            float r4 = (float) r4
            r5 = 1051931443(0x3eb33333, float:0.35)
            float r4 = r4 * r5
            r3._ppi = r4
        Ld9:
            return
    }

    private void boundFrameCamera(org.fortheloss.sticknodes.animationscreen.FrameCamera r9, boolean r10) {
            r8 = this;
            float r0 = r9.getCameraOffsetX()
            float r1 = r9.getCameraOffsetY()
            float r2 = r9.getCameraScale()
            float r3 = r8.getWidth()
            float r3 = r3 * r2
            float r4 = r8.getHeight()
            float r4 = r4 * r2
            float r5 = r8.getWidth()
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r6
            float r5 = -r5
            r7 = 1077936128(0x40400000, float:3.0)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L32
            float r0 = r8.getWidth()
            float r0 = r0 * r6
            float r0 = -r0
            r9.setCameraOffsetX(r0)
            goto L47
        L32:
            float r5 = r8.getWidth()
            float r5 = r5 * r7
            float r5 = r5 - r3
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L47
            float r0 = r8.getWidth()
            float r0 = r0 * r7
            float r0 = r0 - r3
            r9.setCameraOffsetX(r0)
        L47:
            float r0 = r8.getHeight()
            float r0 = r0 * r6
            float r0 = -r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5d
            float r0 = r8.getHeight()
            float r0 = r0 * r6
            float r0 = -r0
            r9.setCameraOffsetY(r0)
            goto L72
        L5d:
            float r0 = r8.getHeight()
            float r0 = r0 * r7
            float r0 = r0 - r4
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L72
            float r0 = r8.getHeight()
            float r0 = r0 * r7
            float r0 = r0 - r4
            r9.setCameraOffsetY(r0)
        L72:
            if (r10 == 0) goto Lab
            r10 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r10
            float r10 = java.lang.Math.abs(r2)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto Lab
            float r10 = r9.getCameraOffsetX()
            float r10 = java.lang.Math.abs(r10)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1084227584(0x40a00000, float:5.0)
            float r0 = r0 * r1
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto Lab
            float r10 = r9.getCameraOffsetY()
            float r10 = java.lang.Math.abs(r10)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto Lab
            r10 = 0
            r9.setCameraOffsetX(r10)
            r9.setCameraOffsetY(r10)
        Lab:
            return
    }

    private void calculateNearestNotchFrom(float r8) {
            r7 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto Lb
            r8 = 10
            r7._zoomNotch = r8
            return
        Lb:
            r0 = 0
            r1 = 4599075939685498880(0x3fd3333340000000, double:0.30000001192092896)
            double r1 = java.lang.Math.log(r1)
            float r1 = (float) r1
            r2 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r2 = java.lang.Math.log(r2)
            float r2 = (float) r2
            float r2 = r2 - r1
            r3 = 1109393408(0x42200000, float:40.0)
            float r2 = r2 / r3
            double r3 = (double) r8
            double r3 = java.lang.Math.log(r3)
            double r5 = (double) r1
            double r3 = r3 - r5
            double r1 = (double) r2
            double r3 = r3 / r1
            double r0 = (double) r0
            double r3 = r3 + r0
            long r0 = java.lang.Math.round(r3)
            int r8 = (int) r0
            r7._zoomNotch = r8
            if (r8 >= 0) goto L39
            r8 = 0
            r7._zoomNotch = r8
            goto L3f
        L39:
            r0 = 40
            if (r8 <= r0) goto L3f
            r7._zoomNotch = r0
        L3f:
            return
    }

    private void calculateZoomFromZoomNotch() {
            r4 = this;
            int r0 = r4._zoomNotch
            r1 = 10
            if (r0 != r1) goto Lb
            r0 = 1065353216(0x3f800000, float:1.0)
            r4._zoomGoal = r0
            return
        Lb:
            if (r0 >= 0) goto L11
            r0 = 0
            r4._zoomNotch = r0
            goto L17
        L11:
            r1 = 40
            if (r0 <= r1) goto L17
            r4._zoomNotch = r1
        L17:
            r0 = 0
            r1 = 4599075939685498880(0x3fd3333340000000, double:0.30000001192092896)
            double r1 = java.lang.Math.log(r1)
            float r1 = (float) r1
            r2 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r2 = java.lang.Math.log(r2)
            float r2 = (float) r2
            float r2 = r2 - r1
            r3 = 1109393408(0x42200000, float:40.0)
            float r2 = r2 / r3
            int r3 = r4._zoomNotch
            float r3 = (float) r3
            float r3 = r3 - r0
            float r2 = r2 * r3
            float r1 = r1 + r2
            double r0 = (double) r1
            double r0 = java.lang.Math.exp(r0)
            float r0 = (float) r0
            r4._zoomGoal = r0
            r1 = 1050253722(0x3e99999a, float:0.3)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L46
            r4._zoomGoal = r1
            goto L4e
        L46:
            r1 = 1112014848(0x42480000, float:50.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4e
            r4._zoomGoal = r1
        L4e:
            float r0 = r4._zoomGoal
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r0 = r0 / r1
            r4._zoomGoal = r0
            return
    }

    private void drawDragLockNodeMaybe(org.fortheloss.sticknodes.stickfigure.INode r20, org.fortheloss.sticknodes.animationscreen.NodeDrawTools r21, float r22, float r23, boolean r24) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r3 == 0) goto Lc6
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            boolean r3 = r1.getIsDragLocked()
            if (r3 != 0) goto L18
            boolean r3 = r1.getIsAngleLocked()
            if (r3 == 0) goto Lc6
        L18:
            com.badlogic.gdx.math.Vector2 r3 = r0._nodeDragInitialPosition
            float r4 = r3.x
            float r3 = r3.y
            float r5 = r0._nodeDragParentInitialAngle
            if (r24 != 0) goto L26
            boolean r6 = r0._isActiveDragging
            if (r6 != 0) goto L3e
        L26:
            float r4 = r1.getGlobalX()
            float r3 = r1.getGlobalY()
            boolean r5 = r1.isMainNode()
            if (r5 == 0) goto L36
            r5 = 0
            goto L3e
        L36:
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r1.getParentNode()
            float r5 = r5.getAngle()
        L3e:
            float r6 = r0._zoom
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r7
            float r7 = r4 + r22
            com.badlogic.gdx.math.Vector2 r8 = r0._zoomPosition
            float r9 = r8.x
            float r10 = r4 - r9
            float r10 = r10 * r6
            float r10 = r10 + r7
            float r11 = r3 + r23
            float r8 = r8.y
            float r12 = r3 - r8
            float r12 = r12 * r6
            float r12 = r12 + r11
            float r4 = r4 - r9
            float r4 = r4 * r6
            float r7 = r7 + r4
            float r3 = r3 - r8
            float r3 = r3 * r6
            float r11 = r11 + r3
            float r3 = r19.getWidth()
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r4
            float r4 = r0._zoom
            float r3 = r3 * r4
            boolean r4 = r1.getIsAngleLocked()
            if (r4 == 0) goto L9b
            float r4 = r1.getAngle()
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r4)
            float r1 = r1.getAngle()
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r4 = r4 * r3
            float r1 = r1 * r3
            r3 = 26
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r13 = r2.getNode(r3)
            com.badlogic.gdx.graphics.g2d.Batch r14 = r21.getBatch()
            float r15 = r10 - r4
            float r16 = r12 - r1
            float r17 = r7 + r4
            float r18 = r11 + r1
            r13.drawDashedLine(r14, r15, r16, r17, r18)
            goto Lc6
        L9b:
            float r4 = r1.getDragLockAngle()
            float r4 = r4 + r5
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r4)
            float r4 = r4 * r3
            float r1 = r1.getDragLockAngle()
            float r5 = r5 + r1
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r5)
            float r1 = r1 * r3
            float r15 = r10 - r4
            float r16 = r12 - r1
            float r17 = r7 + r4
            float r18 = r11 + r1
            r1 = 24
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r13 = r2.getNode(r1)
            com.badlogic.gdx.graphics.g2d.Batch r14 = r21.getBatch()
            r13.drawDashedLine(r14, r15, r16, r17, r18)
        Lc6:
            return
    }

    private org.fortheloss.sticknodes.stickfigure.INode getSelectedNodeFromFigures(float r13, float r14, float r15, boolean r16, org.fortheloss.sticknodes.NodeDigger r17) {
            r12 = this;
            r0 = r12
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            boolean r1 = r1.getIsOnlyDrawingMainNodes()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r0._figuresRef
            int r2 = r2.size()
            int r2 = r2 + (-1)
            r3 = 0
        L10:
            if (r2 < 0) goto L60
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r0._figuresRef
            java.lang.Object r4 = r4.get(r2)
            r5 = r4
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            boolean r4 = r0._isWaitingForUserToChooseFigure
            if (r4 == 0) goto L28
            boolean r4 = r0._isWaitingForUserToChooseFigureAllowMCs
            if (r4 != 0) goto L28
            boolean r4 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r4 != 0) goto L28
            goto L5d
        L28:
            org.fortheloss.sticknodes.data.SessionData r3 = r0._sessionDataRef
            boolean r3 = r3.getAlwaysShowCurrentFigureNodes()
            r4 = 0
            if (r3 == 0) goto L4e
            org.fortheloss.sticknodes.data.SessionData r3 = r0._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r3 = r3.getCurrentlySelectedNode()
            boolean r6 = r3 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r6 == 0) goto L4e
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = r3.getDrawableFigure()
            if (r6 != r5) goto L43
            r6 = 0
            goto L44
        L43:
            r6 = r1
        L44:
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r5.getJoinedToNode()
            if (r7 != r3) goto L4c
            r10 = 0
            goto L4f
        L4c:
            r10 = r6
            goto L4f
        L4e:
            r10 = r1
        L4f:
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r11 = r17
            org.fortheloss.sticknodes.stickfigure.INode r3 = r5.getSelectedNode(r6, r7, r8, r9, r10, r11)
            if (r3 == 0) goto L5d
            goto L60
        L5d:
            int r2 = r2 + (-1)
            goto L10
        L60:
            return r3
    }

    private void redrawNextOnionSkin() {
            r5 = this;
            r0 = 0
            r5._nextOnionSkinDirty = r0
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            int r1 = r1.getNumNextOnionSkinFrames()
            r2 = 1
            if (r1 <= 0) goto L29
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r5._framesModuleRef
            int r3 = r3.getCurrentFrameIndex()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r5._framesModuleRef
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r4.getFramesContainer()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r4.frames
            int r4 = r4.size()
            int r4 = r4 - r2
            if (r3 >= r4) goto L29
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r5._nextOnionSkinFrameBuffer
            r5.redrawOnionSkin(r2, r1, r3)
            r5._flagNextOnionSkinBlank = r0
            goto L2b
        L29:
            r5._flagNextOnionSkinBlank = r2
        L2b:
            return
    }

    private void redrawOnionSkin(boolean r41, int r42, com.badlogic.gdx.graphics.glutils.FrameBuffer r43) {
            r40 = this;
            r0 = r40
            com.badlogic.gdx.math.Matrix4 r1 = r0._rememberedMatrix
            org.fortheloss.sticknodes.animationscreen.FilterBundle r2 = r0._filterBundle
            com.badlogic.gdx.graphics.g2d.Batch r2 = r2.batch
            com.badlogic.gdx.math.Matrix4 r2 = r2.getProjectionMatrix()
            r1.set(r2)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r1 = r0._filterBundle
            com.badlogic.gdx.graphics.g2d.Batch r1 = r1.batch
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            int r3 = r43.getWidth()
            int r4 = r43.getHeight()
            r15 = 0
            r2.glViewport(r15, r15, r3, r4)
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r40.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r2 = r2.getViewport()
            float r2 = r2.getWorldWidth()
            int r3 = r43.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            r16 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r16
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r40.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r3 = r3.getViewport()
            float r3 = r3.getWorldHeight()
            int r4 = r43.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r3 = r3 * r16
            org.fortheloss.sticknodes.SNShapeRenderer r4 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r5 = r4.getProjectionMatrix()
            r14 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r5 = r5.scale(r2, r3, r14)
            r4.setProjectionMatrix(r5)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r4 = r0._filterBundle
            com.badlogic.gdx.graphics.g2d.Batch r4 = r4.batch
            com.badlogic.gdx.math.Matrix4 r5 = r4.getProjectionMatrix()
            com.badlogic.gdx.math.Matrix4 r2 = r5.scale(r2, r3, r14)
            r4.setProjectionMatrix(r2)
            r43.bind()
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r13 = 0
            r2.glClearColor(r13, r13, r13, r13)
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r3 = 16384(0x4000, float:2.2959E-41)
            r2.glClear(r3)
            float r2 = r40.getWidth()
            float r2 = r2 * r16
            com.badlogic.gdx.math.Vector2 r3 = r0._zoomPosition
            float r3 = r3.x
            float r17 = r2 - r3
            float r2 = r40.getHeight()
            float r2 = r2 * r16
            com.badlogic.gdx.math.Vector2 r3 = r0._zoomPosition
            float r3 = r3.y
            float r18 = r2 - r3
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r0._framesModuleRef
            int r19 = r2.getCurrentFrameIndex()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r0._framesModuleRef
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r2.getFramesContainer()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r12 = r2.frames
            r2 = r42
        La1:
            if (r2 <= 0) goto L280
            if (r41 == 0) goto La8
            int r3 = r19 + r2
            goto Laa
        La8:
            int r3 = r19 - r2
        Laa:
            int r20 = r2 + (-1)
            if (r3 < 0) goto L274
            int r2 = r12.size()
            if (r3 < r2) goto Lb6
            goto L274
        Lb6:
            java.lang.Object r2 = r12.get(r3)
            r11 = r2
            org.fortheloss.sticknodes.data.IFrameData r11 = (org.fortheloss.sticknodes.data.IFrameData) r11
            java.util.ArrayList r10 = r11.getDrawableFigures()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r21 = r2.getNodeDrawTools()
            org.fortheloss.sticknodes.animationscreen.FilterBundle r2 = r0._filterBundle
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r3 = r43
            r2.setDefaultFBO(r3, r4, r5, r6, r7)
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r0._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r3 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r2.begin(r3)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r2 = r0._filterBundle
            org.fortheloss.sticknodes.data.SessionData r3 = r0._sessionDataRef
            boolean r3 = r3.getRenderFiltersWhenDragging()
            if (r3 != 0) goto Lf0
            boolean r3 = r0._isActiveDragging
            if (r3 != 0) goto Lef
            boolean r3 = r0._isDraggingCanvas
            if (r3 != 0) goto Lef
            boolean r3 = r0._isZoomingCanvas
            if (r3 == 0) goto Lf0
        Lef:
            r2 = 0
        Lf0:
            r22 = r2
            int r9 = r10.size()
            r8 = 0
        Lf7:
            if (r8 >= r9) goto L15c
            java.lang.Object r2 = r10.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            boolean r2 = r2.isVisibleInOnionSkin()
            if (r2 != 0) goto L10f
            r30 = r8
            r29 = r9
            r28 = r10
            r15 = r11
            r23 = r12
            goto L14e
        L10f:
            java.lang.Object r2 = r10.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r0._shapeRendererRef
            com.badlogic.gdx.math.Vector2 r4 = r0._zoomPosition
            float r7 = r4.x
            float r6 = r4.y
            float r5 = r0._zoom
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r4 = r1
            r27 = r5
            r5 = r22
            r28 = r6
            r6 = r17
            r29 = r7
            r7 = r18
            r30 = r8
            r8 = r29
            r29 = r9
            r9 = r28
            r28 = r10
            r10 = r27
            r15 = r11
            r11 = r23
            r23 = r12
            r12 = r24
            r13 = r25
            r14 = r26
            r2.drawLimbs(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L14e:
            int r8 = r30 + 1
            r11 = r15
            r12 = r23
            r10 = r28
            r9 = r29
            r13 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            goto Lf7
        L15c:
            r15 = r11
            r23 = r12
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r0._shapeRendererRef
            r2.end()
            org.fortheloss.sticknodes.animationscreen.FilterBundle r3 = r0._filterBundle
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r4 = r2.getScreenFBO()
            float r5 = r40.getX()
            float r6 = r40.getY()
            r7 = 1
            r8 = 1
            r3.setDefaultFBO(r4, r5, r6, r7, r8)
            boolean r2 = r15 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r2 == 0) goto L26f
            r2 = r15
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            java.util.ArrayList r3 = r2.getTextfieldBoxes()
            if (r3 != 0) goto L188
            r13 = 0
            goto L18d
        L188:
            int r4 = r3.size()
            r13 = r4
        L18d:
            if (r13 <= 0) goto L1ba
            r1.begin()
            r14 = 1065353216(0x3f800000, float:1.0)
            r1.setColor(r14, r14, r14, r14)
            r15 = 0
        L198:
            if (r15 >= r13) goto L1b6
            java.lang.Object r4 = r3.get(r15)
            org.fortheloss.sticknodes.TextfieldBox r4 = (org.fortheloss.sticknodes.TextfieldBox) r4
            com.badlogic.gdx.math.Vector2 r5 = r0._zoomPosition
            float r8 = r5.x
            float r9 = r5.y
            float r10 = r0._zoom
            r11 = 0
            r12 = 1
            r5 = r21
            r6 = r17
            r7 = r18
            r4.drawOutline(r5, r6, r7, r8, r9, r10, r11, r12)
            int r15 = r15 + 1
            goto L198
        L1b6:
            r1.end()
            goto L1bc
        L1ba:
            r14 = 1065353216(0x3f800000, float:1.0)
        L1bc:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r2.getFrameCamera()
            float r3 = r2.getCameraRotationDeg()
            float r4 = r2.getCameraScale()
            float r5 = r2.getCameraOffsetX()
            float r2 = r2.getCameraOffsetY()
            float r6 = r40.getWidth()
            float r6 = r6 * r4
            float r7 = r0._zoom
            float r6 = r6 * r7
            float r7 = r40.getHeight()
            float r7 = r7 * r4
            float r4 = r0._zoom
            float r7 = r7 * r4
            float r5 = r5 + r17
            float r5 = r5 * r4
            float r4 = r40.getWidth()
            float r8 = r0._zoom
            float r9 = r8 - r14
            float r4 = r4 * r9
            float r4 = r4 * r16
            float r32 = r5 - r4
            float r2 = r2 + r18
            float r2 = r2 * r8
            float r4 = r40.getHeight()
            float r5 = r0._zoom
            float r5 = r5 - r14
            float r4 = r4 * r5
            float r4 = r4 * r16
            float r33 = r2 - r4
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 == 0) goto L22b
            float r5 = r6 * r16
            float r5 = r32 + r5
            float r8 = r7 * r16
            float r8 = r33 + r8
            org.fortheloss.sticknodes.SNShapeRenderer r9 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r10 = r9.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r10 = r10.translate(r5, r8, r2)
            com.badlogic.gdx.math.Matrix4 r3 = r10.rotate(r2, r2, r14, r3)
            float r5 = -r5
            float r8 = -r8
            com.badlogic.gdx.math.Matrix4 r3 = r3.translate(r5, r8, r2)
            r9.setTransformMatrix(r3)
        L22b:
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r5 = 1
            r8 = 0
            r3.glBlendFunc(r5, r8)
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r0._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r5 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line
            r3.begin(r5)
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r0._shapeRendererRef
            r3.setColor(r14, r14, r14, r14)
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r0._shapeRendererRef
            float r34 = r6 + r14
            float r35 = r7 + r14
            com.badlogic.gdx.graphics.Color r38 = org.fortheloss.sticknodes.App.COLOR_CAM_ONIONSKIN_GRAY
            com.badlogic.gdx.graphics.Color r39 = org.fortheloss.sticknodes.App.COLOR_CAM_ONIONSKIN_RED
            r31 = r3
            r36 = r38
            r37 = r39
            r31.rect(r32, r33, r34, r35, r36, r37, r38, r39)
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r0._shapeRendererRef
            r3.end()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r5 = 770(0x302, float:1.079E-42)
            r6 = 771(0x303, float:1.08E-42)
            r3.glBlendFunc(r5, r6)
            if (r4 == 0) goto L278
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r4 = r3.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r4 = r4.idt()
            r3.setTransformMatrix(r4)
            goto L278
        L26f:
            r2 = 0
            r8 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L278
        L274:
            r23 = r12
            r2 = 0
            r8 = 0
        L278:
            r2 = r20
            r12 = r23
            r13 = 0
            r15 = 0
            goto La1
        L280:
            org.fortheloss.sticknodes.animationscreen.FilterBundle r1 = r0._filterBundle
            com.badlogic.gdx.graphics.g2d.Batch r1 = r1.batch
            com.badlogic.gdx.math.Matrix4 r2 = r0._rememberedMatrix
            r1.setProjectionMatrix(r2)
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r2 = r0._rememberedMatrix
            r1.setProjectionMatrix(r2)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r40.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r1 = r1.getViewport()
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            int r3 = r1.getScreenX()
            int r4 = r1.getScreenY()
            int r5 = r1.getScreenWidth()
            int r1 = r1.getScreenHeight()
            r2.glViewport(r3, r4, r5, r1)
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r2 = r0._rememberedMatrix
            r1.setProjectionMatrix(r2)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r1 = r0._filterBundle
            com.badlogic.gdx.graphics.g2d.Batch r1 = r1.batch
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r40.getStage()
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            return
    }

    private void redrawPreviousOnionSkin() {
            r3 = this;
            r0 = 0
            r3._previousOnionSkinDirty = r0
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            int r1 = r1.getNumPrevOnionSkinFrames()
            if (r1 <= 0) goto L1b
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r3._framesModuleRef
            int r2 = r2.getCurrentFrameIndex()
            if (r2 <= 0) goto L1b
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r3._previousOnionSkinFrameBuffer
            r3.redrawOnionSkin(r0, r1, r2)
            r3._flagPreviousOnionSkinBlank = r0
            goto L1e
        L1b:
            r0 = 1
            r3._flagPreviousOnionSkinBlank = r0
        L1e:
            return
    }

    private void redrawTracedStickfigureOrFrame() {
            r25 = this;
            r0 = r25
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r0._stickfigureToTraceRef
            if (r1 != 0) goto Lb
            org.fortheloss.sticknodes.data.FrameData r1 = r0._frameDataToTraceRef
            if (r1 != 0) goto Lb
            return
        Lb:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r1 = r1.getNodeDrawTools()
            r2 = 0
            r0._tracingFBODirty = r2
            com.badlogic.gdx.math.Matrix4 r3 = r0._rememberedMatrix
            org.fortheloss.sticknodes.SNShapeRenderer r4 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r4 = r4.getProjectionMatrix()
            r3.set(r4)
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            com.badlogic.gdx.graphics.glutils.FrameBuffer r4 = r0._tracingFrameBuffer
            int r4 = r4.getWidth()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = r0._tracingFrameBuffer
            int r5 = r5.getHeight()
            r3.glViewport(r2, r2, r4, r5)
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r25.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r3 = r3.getViewport()
            float r3 = r3.getWorldWidth()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r4 = r0._tracingFrameBuffer
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r25.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r5 = r5.getViewport()
            float r5 = r5.getWorldHeight()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r6 = r0._tracingFrameBuffer
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r5 = r5 / r6
            float r5 = r5 * r4
            org.fortheloss.sticknodes.SNShapeRenderer r6 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r7 = r6.getProjectionMatrix()
            r8 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r7 = r7.scale(r3, r5, r8)
            r6.setProjectionMatrix(r7)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r6 = r0._filterBundle
            com.badlogic.gdx.graphics.g2d.Batch r6 = r6.batch
            com.badlogic.gdx.math.Matrix4 r7 = r6.getProjectionMatrix()
            com.badlogic.gdx.math.Matrix4 r3 = r7.scale(r3, r5, r8)
            r6.setProjectionMatrix(r3)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._tracingFrameBuffer
            r3.bind()
            org.fortheloss.sticknodes.animationscreen.FilterBundle r3 = r0._filterBundle
            com.badlogic.gdx.graphics.g2d.Batch r7 = r3.batch
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._tracingFrameBuffer
            r3.begin()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r5 = 0
            r3.glClearColor(r5, r5, r5, r5)
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r5 = 16384(0x4000, float:2.2959E-41)
            r3.glClear(r5)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r0._stickfigureToTraceRef
            if (r3 == 0) goto L11d
            float r2 = r25.getWidth()
            float r3 = r25.getWidth()
            float r3 = r3 * r4
            float r5 = r0._zoom
            float r5 = r5 - r8
            float r3 = r3 * r5
            float r2 = r2 + r3
            com.badlogic.gdx.math.Vector2 r3 = r0._zoomPosition
            float r3 = r3.x
            float r5 = r2 - r3
            float r2 = r25.getHeight()
            float r3 = r25.getHeight()
            float r3 = r3 * r4
            float r4 = r0._zoom
            float r4 = r4 - r8
            float r3 = r3 * r4
            float r2 = r2 + r3
            com.badlogic.gdx.math.Vector2 r3 = r0._zoomPosition
            float r3 = r3.y
            float r6 = r2 - r3
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r0._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r3 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r2.begin(r3)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = r0._stickfigureToTraceRef
            org.fortheloss.sticknodes.SNShapeRenderer r10 = r0._shapeRendererRef
            r12 = 0
            com.badlogic.gdx.math.Vector2 r2 = r0._zoomPosition
            float r15 = r2.x
            float r2 = r2.y
            float r3 = r0._zoom
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r11 = r7
            r13 = r5
            r14 = r6
            r16 = r2
            r17 = r3
            r9.drawLimbs(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r0._shapeRendererRef
            r2.end()
            boolean r2 = r0._drawNodesOnTracedFbo
            if (r2 == 0) goto L1df
            r7.begin()
            r7.setColor(r8, r8, r8, r8)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r0._stickfigureToTraceRef
            com.badlogic.gdx.math.Vector2 r3 = r0._zoomPosition
            float r8 = r3.x
            float r9 = r3.y
            float r10 = r0._zoom
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r3 = r1
            r4 = r5
            r5 = r6
            r6 = r8
            r15 = r7
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r2.drawNodes(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.end()
            goto L1df
        L11d:
            r15 = r7
            org.fortheloss.sticknodes.data.FrameData r3 = r0._frameDataToTraceRef
            java.util.ArrayList r7 = r3.getDrawableFigures()
            float r3 = r25.getWidth()
            float r3 = r3 * r4
            com.badlogic.gdx.math.Vector2 r5 = r0._zoomPosition
            float r5 = r5.x
            float r22 = r3 - r5
            float r3 = r25.getHeight()
            float r3 = r3 * r4
            com.badlogic.gdx.math.Vector2 r4 = r0._zoomPosition
            float r4 = r4.y
            float r23 = r3 - r4
            org.fortheloss.sticknodes.animationscreen.FilterBundle r9 = r0._filterBundle
            com.badlogic.gdx.graphics.glutils.FrameBuffer r10 = r0._tracingFrameBuffer
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 1
            r9.setDefaultFBO(r10, r11, r12, r13, r14)
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r0._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r4 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r3.begin(r4)
            int r3 = r7.size()
            r4 = 0
        L153:
            if (r4 >= r3) goto L184
            java.lang.Object r5 = r7.get(r4)
            r9 = r5
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r9 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r9
            org.fortheloss.sticknodes.SNShapeRenderer r10 = r0._shapeRendererRef
            org.fortheloss.sticknodes.animationscreen.FilterBundle r12 = r0._filterBundle
            com.badlogic.gdx.math.Vector2 r5 = r0._zoomPosition
            float r6 = r5.x
            float r5 = r5.y
            float r14 = r0._zoom
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r11 = r15
            r13 = r22
            r17 = r14
            r14 = r23
            r24 = r15
            r15 = r6
            r16 = r5
            r9.drawLimbs(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            int r4 = r4 + 1
            r15 = r24
            goto L153
        L184:
            r24 = r15
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r0._shapeRendererRef
            r3.end()
            boolean r3 = r0._drawNodesOnTracedFbo
            if (r3 == 0) goto L1ca
            r24.begin()
            r13 = r24
            r13.setColor(r8, r8, r8, r8)
            int r14 = r7.size()
            r15 = 0
        L19c:
            if (r15 >= r14) goto L1c7
            java.lang.Object r2 = r7.get(r15)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            com.badlogic.gdx.math.Vector2 r3 = r0._zoomPosition
            float r6 = r3.x
            float r8 = r3.y
            float r9 = r0._zoom
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r3 = r1
            r4 = r22
            r5 = r23
            r17 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r16
            r2.drawNodes(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r15 = r15 + 1
            r7 = r17
            goto L19c
        L1c7:
            r13.end()
        L1ca:
            org.fortheloss.sticknodes.animationscreen.FilterBundle r2 = r0._filterBundle
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r1.getScreenFBO()
            float r4 = r25.getX()
            float r5 = r25.getY()
            r6 = 1
            r7 = 1
            r2.setDefaultFBO(r3, r4, r5, r6, r7)
        L1df:
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r25.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r1 = r1.getViewport()
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            int r3 = r1.getScreenX()
            int r4 = r1.getScreenY()
            int r5 = r1.getScreenWidth()
            int r1 = r1.getScreenHeight()
            r2.glViewport(r3, r4, r5, r1)
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r2 = r0._rememberedMatrix
            r1.setProjectionMatrix(r2)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r1 = r0._filterBundle
            com.badlogic.gdx.graphics.g2d.Batch r1 = r1.batch
            com.badlogic.gdx.math.Matrix4 r2 = r0._rememberedMatrix
            r1.setProjectionMatrix(r2)
            return
    }

    private void repositionQuickResizeTools() {
            r11 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r11._sessionDataRef
            int r0 = r0.getMode()
            r1 = 3
            if (r0 == r1) goto Lff
            org.fortheloss.sticknodes.data.SessionData r0 = r11._sessionDataRef
            short r0 = r0.getIsShowingQuickResizeTool()
            r1 = 1
            if (r0 != r1) goto Lff
            r0 = 0
            r2 = 0
            org.fortheloss.sticknodes.data.SessionData r3 = r11._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r3.getCurrentlySelectedStickfigure()
            r4 = 0
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r3 == 0) goto L43
            org.fortheloss.sticknodes.data.SessionData r2 = r11._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r2.getCurrentlySelectedStickfigure()
            float r4 = r2.getX()
            float r2 = r2.getY()
            org.fortheloss.sticknodes.data.SessionData r3 = r11._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r3 = r3.getCurrentlySelectedNode()
            if (r3 == 0) goto La5
            boolean r6 = r3 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r6 == 0) goto La5
            boolean r6 = r3.isMainNode()
            if (r6 != 0) goto La5
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0 = r3
            goto La5
        L43:
            org.fortheloss.sticknodes.data.SessionData r3 = r11._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r3 = r3.getCurrentlySelectedMC()
            if (r3 == 0) goto L5a
            org.fortheloss.sticknodes.data.SessionData r2 = r11._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r2 = r2.getCurrentlySelectedMC()
            float r4 = r2.getX()
            float r2 = r2.getY()
            goto La5
        L5a:
            org.fortheloss.sticknodes.data.SessionData r3 = r11._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r3 = r3.getCurrentlySelectedTextfieldBox()
            if (r3 == 0) goto L8c
            org.fortheloss.sticknodes.data.SessionData r2 = r11._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r2 = r2.getCurrentlySelectedTextfieldBox()
            float r3 = r2.getX()
            float r4 = r2.getWidth()
            float r4 = r4 * r5
            float r6 = r2.getScale()
            float r4 = r4 * r6
            float r4 = r4 + r3
            float r3 = r2.getY()
            float r6 = r2.getHeight()
            float r6 = r6 * r5
            float r2 = r2.getScale()
            float r6 = r6 * r2
            float r2 = r3 - r6
            goto La5
        L8c:
            org.fortheloss.sticknodes.data.SessionData r3 = r11._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = r3.getCurrentlySelectedSprite()
            if (r3 == 0) goto La3
            org.fortheloss.sticknodes.data.SessionData r2 = r11._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r2.getCurrentlySelectedSprite()
            float r4 = r2.getX()
            float r2 = r2.getY()
            goto La5
        La3:
            r1 = 0
            r2 = 0
        La5:
            if (r1 == 0) goto Lff
            float r1 = r11.getWidth()
            float r1 = r1 * r5
            com.badlogic.gdx.math.Vector2 r3 = r11._zoomPosition
            float r3 = r3.x
            float r1 = r1 - r3
            float r3 = r11.getHeight()
            float r3 = r3 * r5
            com.badlogic.gdx.math.Vector2 r5 = r11._zoomPosition
            float r6 = r5.y
            float r3 = r3 - r6
            float r5 = r5.x
            float r5 = r4 - r5
            float r7 = r11._zoom
            r8 = 1065353216(0x3f800000, float:1.0)
            float r9 = r7 - r8
            float r5 = r5 * r9
            float r6 = r2 - r6
            float r7 = r7 - r8
            float r6 = r6 * r7
            float r4 = r4 + r1
            float r4 = r4 + r5
            float r2 = r2 + r3
            float r2 = r2 + r6
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r5 = r11._quickResizeTool
            r5.setMainPosition(r4, r2)
            if (r0 == 0) goto Lff
            float r5 = r0.getGlobalX()
            float r0 = r0.getGlobalY()
            com.badlogic.gdx.math.Vector2 r6 = r11._zoomPosition
            float r7 = r6.x
            float r7 = r5 - r7
            float r9 = r11._zoom
            float r10 = r9 - r8
            float r7 = r7 * r10
            float r6 = r6.y
            float r6 = r0 - r6
            float r9 = r9 - r8
            float r6 = r6 * r9
            float r5 = r5 + r1
            float r5 = r5 + r7
            float r5 = r5 - r4
            float r0 = r0 + r3
            float r0 = r0 + r6
            float r0 = r0 - r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r1 = r11._quickResizeTool
            r1.setSecondaryPosition(r5, r0)
        Lff:
            return
    }

    private void setActiveDragging(boolean r3) {
            r2 = this;
            r2._isActiveDragging = r3
            boolean r0 = r2._isWaitingForUserToChooseFigure
            if (r0 != 0) goto L32
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 != 0) goto L19
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModuleRef
            r0.disableAll(r3)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            r0.disableAll(r3)
            goto L32
        L19:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto L2d
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModuleRef
            r0.disableAll(r3)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            r0.disableAll(r3)
            goto L32
        L2d:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._createToolsModuleRef
            r0.disableAll(r3)
        L32:
            return
    }

    private void setFilterBundleToDefault(boolean r6) {
            r5 = this;
            if (r6 == 0) goto L24
            org.fortheloss.sticknodes.animationscreen.FilterBundle r6 = r5._filterBundle
            float r0 = r5.getX()
            float r1 = r5.getY()
            float r2 = r5.getWidth()
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            float r3 = r5.getHeight()
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            r6.setScaleValues(r0, r1, r2, r3)
            goto L3d
        L24:
            org.fortheloss.sticknodes.animationscreen.FilterBundle r6 = r5._filterBundle
            float r0 = r5._fullscreenX
            float r1 = r5._fullscreenY
            float r2 = r5._fullscreenWidth
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            float r3 = r5._fullscreenHeight
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            r6.setScaleValues(r0, r1, r2, r3)
        L3d:
            r5.setNeedsToBeDrawn()
            return
    }

    private void setZoomPosition(float r7, float r8) {
            r6 = this;
            float r0 = r6.getWidth()
            float r1 = r6._zoom
            float r0 = r0 / r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            float r2 = r6.getHeight()
            float r3 = r6._zoom
            float r2 = r2 / r3
            float r2 = r2 * r1
            float r3 = r6.getWidth()
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r4
            float r3 = r3 - r0
            float r3 = -r3
            r5 = 1077936128(0x40400000, float:3.0)
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 >= 0) goto L2d
            float r7 = r6.getWidth()
            float r7 = r7 * r4
            float r7 = r7 - r0
            float r7 = -r7
            goto L3f
        L2d:
            float r3 = r6.getWidth()
            float r3 = r3 * r5
            float r3 = r3 - r0
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 <= 0) goto L3f
            float r7 = r6.getWidth()
            float r7 = r7 * r5
            float r7 = r7 - r0
        L3f:
            float r0 = r6.getHeight()
            float r0 = r0 * r4
            float r0 = r0 - r2
            float r0 = -r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L54
            float r8 = r6.getHeight()
            float r8 = r8 * r4
            float r8 = r8 - r2
            float r8 = -r8
            goto L66
        L54:
            float r0 = r6.getHeight()
            float r0 = r0 * r5
            float r0 = r0 - r2
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L66
            float r8 = r6.getHeight()
            float r8 = r8 * r5
            float r8 = r8 - r2
        L66:
            float r0 = r6._zoom
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto La4
            float r0 = r6.getWidth()
            float r0 = r0 * r1
            float r0 = r7 - r0
            float r0 = java.lang.Math.abs(r0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 * r3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto La4
            float r0 = r6.getHeight()
            float r0 = r0 * r1
            float r0 = r8 - r0
            float r0 = java.lang.Math.abs(r0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto La4
            float r7 = r6.getWidth()
            float r7 = r7 * r1
            float r8 = r6.getHeight()
            float r8 = r8 * r1
        La4:
            com.badlogic.gdx.math.Vector2 r0 = r6._zoomPosition
            r0.set(r7, r8)
            return
    }

    private void updateDragLockState(float r5, float r6, float r7, float r8) {
            r4 = this;
            float r0 = r4._ppi
            r1 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 / r1
            int r1 = r4._dragLockState
            r2 = -1
            r3 = 1
            if (r1 != r3) goto L34
            r1 = 1056964608(0x3f000000, float:0.5)
            org.fortheloss.sticknodes.data.SessionData r3 = r4._sessionDataRef
            float r3 = r3.getAxisLockingSensitivity()
            float r1 = r1 / r3
            boolean r3 = r4._isDragLockHorizontal
            if (r3 == 0) goto L26
            float r8 = r8 - r6
            float r5 = java.lang.Math.abs(r8)
            float r0 = r0 * r1
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L6c
            r4._dragLockState = r2
            goto L6c
        L26:
            float r7 = r7 - r5
            float r5 = java.lang.Math.abs(r7)
            float r0 = r0 * r1
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L6c
            r4._dragLockState = r2
            goto L6c
        L34:
            if (r1 != 0) goto L6c
            float r7 = r7 - r5
            float r8 = r8 - r6
            float r5 = r7 * r7
            float r6 = r8 * r8
            float r5 = r5 + r6
            float r6 = r0 * r0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L6c
            r5 = 1041865114(0x3e19999a, float:0.15)
            org.fortheloss.sticknodes.data.SessionData r6 = r4._sessionDataRef
            float r6 = r6.getAxisLockingSensitivity()
            float r5 = r5 / r6
            float r6 = java.lang.Math.abs(r7)
            float r0 = r0 * r5
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 >= 0) goto L5d
            r4._dragLockState = r3
            r5 = 0
            r4._isDragLockHorizontal = r5
            goto L6c
        L5d:
            float r5 = java.lang.Math.abs(r8)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L6a
            r4._dragLockState = r3
            r4._isDragLockHorizontal = r3
            goto L6c
        L6a:
            r4._dragLockState = r2
        L6c:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r12) {
            r11 = this;
            super.act(r12)
            float r0 = r11._zoom
            float r1 = r11._zoomGoal
            r2 = 0
            r3 = 1
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 == 0) goto L6b
            r11._isZoomingCanvas = r3
            r4 = 1112014848(0x42480000, float:50.0)
            r5 = 1050253722(0x3e99999a, float:0.3)
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 >= 0) goto L1b
            r11._zoomGoal = r5
            goto L21
        L1b:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L21
            r11._zoomGoal = r4
        L21:
            float r1 = r11._zoomGoal
            float r6 = r1 - r0
            float r6 = r6 * r12
            r7 = 1094713344(0x41400000, float:12.0)
            float r6 = r6 * r7
            float r0 = r0 + r6
            r11._zoom = r0
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r1 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L4d
            float r0 = r11._zoomGoal
            r11._zoom = r0
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 >= 0) goto L45
            r11._zoom = r5
            goto L4b
        L45:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L4b
            r11._zoom = r4
        L4b:
            r11._isZoomingCanvas = r2
        L4d:
            r11._tracingFBODirty = r3
            r11._previousOnionSkinDirty = r3
            r11._nextOnionSkinDirty = r3
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r11._animateToolsModuleRef
            float r1 = r11._zoomGoal
            r0.updateZoomDisplay(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r11._createToolsModuleRef
            float r1 = r11._zoomGoal
            r0.updateZoomDisplay(r1)
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r11._movieclipToolsModuleRef
            float r1 = r11._zoomGoal
            r0.updateZoomDisplay(r1)
            r11.setNeedsToBeDrawn()
        L6b:
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r11._deselectSpriteRef
            r1 = 0
            r4 = 3
            r5 = 0
            if (r0 == 0) goto L98
            float r0 = r11._deselectSpriteSeconds
            float r0 = r0 - r12
            r11._deselectSpriteSeconds = r0
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 > 0) goto L98
            boolean r12 = r11._flagCancelSpriteDeselection
            if (r12 != 0) goto L96
            org.fortheloss.sticknodes.data.SessionData r12 = r11._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r12 = r12.getCurrentlySelectedSprite()
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r11._deselectSpriteRef
            if (r12 != r0) goto L96
            org.fortheloss.sticknodes.data.SessionData r12 = r11._sessionDataRef
            int r12 = r12.getMode()
            if (r12 == r4) goto L96
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r11._animationScreenRef
            r12.setSessionSelectionToNothing()
        L96:
            r11._deselectSpriteRef = r1
        L98:
            org.fortheloss.sticknodes.data.SessionData r12 = r11._sessionDataRef
            int r12 = r12.getMode()
            if (r12 == r4) goto L193
            org.fortheloss.sticknodes.data.SessionData r12 = r11._sessionDataRef
            short r12 = r12.getIsShowingQuickResizeTool()
            if (r12 != r3) goto L193
            org.fortheloss.sticknodes.data.SessionData r12 = r11._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r12 = r12.getCurrentlySelectedStickfigure()
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r12 == 0) goto Ld6
            org.fortheloss.sticknodes.data.SessionData r12 = r11._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r12 = r12.getCurrentlySelectedStickfigure()
            float r5 = r12.getX()
            float r12 = r12.getY()
            org.fortheloss.sticknodes.data.SessionData r2 = r11._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r2 = r2.getCurrentlySelectedNode()
            if (r2 == 0) goto Lec
            boolean r4 = r2 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r4 == 0) goto Lec
            boolean r4 = r2.isMainNode()
            if (r4 != 0) goto Lec
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r1 = r2
            goto Lec
        Ld6:
            org.fortheloss.sticknodes.data.SessionData r12 = r11._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r12 = r12.getCurrentlySelectedMC()
            if (r12 == 0) goto Lee
            org.fortheloss.sticknodes.data.SessionData r12 = r11._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r12 = r12.getCurrentlySelectedMC()
            float r5 = r12.getX()
            float r12 = r12.getY()
        Lec:
            r2 = 1
            goto L139
        Lee:
            org.fortheloss.sticknodes.data.SessionData r12 = r11._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r12 = r12.getCurrentlySelectedTextfieldBox()
            if (r12 == 0) goto L121
            org.fortheloss.sticknodes.data.SessionData r12 = r11._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r12 = r12.getCurrentlySelectedTextfieldBox()
            float r2 = r12.getX()
            float r4 = r12.getWidth()
            float r4 = r4 * r0
            float r5 = r12.getScale()
            float r4 = r4 * r5
            float r5 = r2 + r4
            float r2 = r12.getY()
            float r4 = r12.getHeight()
            float r4 = r4 * r0
            float r12 = r12.getScale()
            float r4 = r4 * r12
            float r12 = r2 - r4
            goto Lec
        L121:
            org.fortheloss.sticknodes.data.SessionData r12 = r11._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r12 = r12.getCurrentlySelectedSprite()
            if (r12 == 0) goto L138
            org.fortheloss.sticknodes.data.SessionData r12 = r11._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r12 = r12.getCurrentlySelectedSprite()
            float r5 = r12.getX()
            float r12 = r12.getY()
            goto Lec
        L138:
            r12 = 0
        L139:
            if (r2 == 0) goto L193
            float r2 = r11.getWidth()
            float r2 = r2 * r0
            com.badlogic.gdx.math.Vector2 r4 = r11._zoomPosition
            float r4 = r4.x
            float r2 = r2 - r4
            float r4 = r11.getHeight()
            float r4 = r4 * r0
            com.badlogic.gdx.math.Vector2 r0 = r11._zoomPosition
            float r6 = r0.y
            float r4 = r4 - r6
            float r0 = r0.x
            float r0 = r5 - r0
            float r7 = r11._zoom
            r8 = 1065353216(0x3f800000, float:1.0)
            float r9 = r7 - r8
            float r0 = r0 * r9
            float r6 = r12 - r6
            float r7 = r7 - r8
            float r6 = r6 * r7
            float r5 = r5 + r2
            float r5 = r5 + r0
            float r12 = r12 + r4
            float r12 = r12 + r6
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0 = r11._quickResizeTool
            r0.setMainPosition(r5, r12)
            if (r1 == 0) goto L193
            float r0 = r1.getGlobalX()
            float r1 = r1.getGlobalY()
            com.badlogic.gdx.math.Vector2 r6 = r11._zoomPosition
            float r7 = r6.x
            float r7 = r0 - r7
            float r9 = r11._zoom
            float r10 = r9 - r8
            float r7 = r7 * r10
            float r6 = r6.y
            float r6 = r1 - r6
            float r9 = r9 - r8
            float r6 = r6 * r9
            float r0 = r0 + r2
            float r0 = r0 + r7
            float r0 = r0 - r5
            float r1 = r1 + r4
            float r1 = r1 + r6
            float r1 = r1 - r12
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r12 = r11._quickResizeTool
            r12.setSecondaryPosition(r0, r1)
        L193:
            com.badlogic.gdx.Application r12 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r12 = r12.getType()
            com.badlogic.gdx.Application$ApplicationType r0 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r12 != r0) goto L1af
            com.badlogic.gdx.Input r12 = com.badlogic.gdx.Gdx.input
            r0 = 68
            boolean r12 = r12.isKeyJustPressed(r0)
            if (r12 == 0) goto L1af
            boolean r12 = org.fortheloss.sticknodes.animationscreen.modules.CanvasModule.DEBUG_USE_TILDE_RENDER_AA
            r12 = r12 ^ r3
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule.DEBUG_USE_TILDE_RENDER_AA = r12
            r11.setNeedsToBeDrawn()
        L1af:
            return
    }

    public void actuallyPasteStickfigurePropertiesBundle(org.fortheloss.sticknodes.stickfigure.Stickfigure r10, org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18) {
            r9 = this;
            r0 = r9
            r1 = r10
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r2 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            if (r1 == 0) goto Lc7
            if (r11 != 0) goto La
            goto Lc7
        La:
            org.fortheloss.sticknodes.data.SessionData r3 = r0._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r4 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r3 = r3.getUserAction(r4)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r3 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r3
            r3.initialize(r10)
            org.fortheloss.sticknodes.data.SessionData r4 = r0._sessionDataRef
            r4.addUserAction(r3)
            if (r17 == 0) goto L61
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            int r4 = r3.getFigurePosition(r10)
            int r5 = r11.getStickfigureLayeringPosition()
            if (r4 < 0) goto L61
            if (r4 == r5) goto L61
            java.util.ArrayList r4 = r3.getDrawableFigures()
            int r4 = r4.size()
            if (r5 >= r4) goto L61
            org.fortheloss.sticknodes.data.SessionData r4 = r0._sessionDataRef
            java.lang.Object r4 = r4.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r4 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r4
            org.fortheloss.sticknodes.data.SessionData r6 = r0._sessionDataRef
            r6.addUserAction(r4)
            org.fortheloss.sticknodes.data.SessionData r4 = r0._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameStickfigureOrderSetAction> r6 = org.fortheloss.sticknodes.data.useractions.FrameStickfigureOrderSetAction.class
            java.lang.Object r4 = r4.getUserAction(r6)
            org.fortheloss.sticknodes.data.useractions.FrameStickfigureOrderSetAction r4 = (org.fortheloss.sticknodes.data.useractions.FrameStickfigureOrderSetAction) r4
            r4.initialize(r3)
            org.fortheloss.sticknodes.data.SessionData r6 = r0._sessionDataRef
            r6.addUserAction(r4)
            r3.setFigureOrder(r10, r5)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r0._framesModuleRef
            r3.setNeedsToBeDrawn()
        L61:
            if (r18 == 0) goto L87
            org.fortheloss.sticknodes.data.SessionData r3 = r0._sessionDataRef
            java.lang.Object r3 = r3.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r3 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r3
            org.fortheloss.sticknodes.data.SessionData r4 = r0._sessionDataRef
            r4.addUserAction(r3)
            org.fortheloss.sticknodes.data.SessionData r3 = r0._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.BranchChangeAction> r4 = org.fortheloss.sticknodes.data.useractions.BranchChangeAction.class
            java.lang.Object r3 = r3.getUserAction(r4)
            org.fortheloss.sticknodes.data.useractions.BranchChangeAction r3 = (org.fortheloss.sticknodes.data.useractions.BranchChangeAction) r3
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r10.getMainNode()
            r5 = 0
            r3.initialize(r4, r5)
            org.fortheloss.sticknodes.data.SessionData r4 = r0._sessionDataRef
            r4.addUserAction(r3)
        L87:
            if (r15 == 0) goto La8
            org.fortheloss.sticknodes.data.SessionData r3 = r0._sessionDataRef
            java.lang.Object r2 = r3.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r2 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r2
            org.fortheloss.sticknodes.data.SessionData r3 = r0._sessionDataRef
            r3.addUserAction(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureRotateAction> r3 = org.fortheloss.sticknodes.data.useractions.StickfigureRotateAction.class
            java.lang.Object r2 = r2.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.StickfigureRotateAction r2 = (org.fortheloss.sticknodes.data.useractions.StickfigureRotateAction) r2
            r2.initialize(r10)
            org.fortheloss.sticknodes.data.SessionData r3 = r0._sessionDataRef
            r3.addUserAction(r2)
        La8:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r18
            r1.pastePropertiesBundle(r2, r3, r4, r5, r6, r7, r8)
            r9.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModuleRef
            r1.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1 = r0._animateToolsModuleRef
            r1.updateStickfigureTools()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1 = r0._movieclipToolsModuleRef
            r1.updateStickfigureTools()
        Lc7:
            return
    }

    public void addNodeAsPolynode(org.fortheloss.sticknodes.stickfigure.StickNode r4, org.fortheloss.sticknodes.stickfigure.StickNode r5) {
            r3 = this;
            if (r4 != r5) goto L55
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r5 = r3._createToolsModuleRef
            r0 = 0
            r5.setDrawTool(r0)
            int r5 = r4.getPolynodeChildrenCount()
            r0 = 1
            if (r5 >= r0) goto L3b
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r3._animationScreenRef
            java.lang.String r1 = "polyfillError1Title"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "polyfillError1InfoNew"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r5.showErrorDialog(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r5 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction> r1 = org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction.class
            java.lang.Object r5 = r5.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction r5 = (org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction) r5
            r5.initialize(r4, r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            r0.addUserAction(r5)
            r4.deletePolyAnchor()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            r4.cancelPolyfillEditing()
            goto L7f
        L3b:
            r3._justCreatedPolyfill = r0
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r5 = r3._createToolsModuleRef
            r5.finishPolyfillEditing()
            org.fortheloss.sticknodes.data.SessionData r5 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillFinishAction> r0 = org.fortheloss.sticknodes.data.useractions.PolyfillFinishAction.class
            java.lang.Object r5 = r5.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.PolyfillFinishAction r5 = (org.fortheloss.sticknodes.data.useractions.PolyfillFinishAction) r5
            r5.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            r4.addUserAction(r5)
            goto L7f
        L55:
            boolean r0 = r4.addPolynodeChild(r5)
            if (r0 != 0) goto L6d
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            java.lang.String r5 = "polyfillError3Title"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r0 = "polyfillError3Info"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r4.showErrorDialog(r5, r0)
            goto L7f
        L6d:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillAddPolynodeAction> r1 = org.fortheloss.sticknodes.data.useractions.PolyfillAddPolynodeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.PolyfillAddPolynodeAction r0 = (org.fortheloss.sticknodes.data.useractions.PolyfillAddPolynodeAction) r0
            r0.initialize(r5, r4)
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            r4.addUserAction(r0)
        L7f:
            r3.setNeedsToBeDrawn()
            return
    }

    public void applyBranchModification(org.fortheloss.sticknodes.stickfigure.StickNode r10, int r11, java.lang.Object r12) {
            r9 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto La
            return
        La:
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.data.useractions.BranchChangeAction
            r3 = 3
            r4 = 12
            r5 = 2
            r6 = 11
            r7 = 10
            r8 = 0
            if (r2 == 0) goto L3f
            org.fortheloss.sticknodes.data.useractions.BranchChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.BranchChangeAction) r0
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r0.getBranch()
            if (r2 != r10) goto L3f
            int r2 = r0.getLastChangedProperty()
            if (r2 != r1) goto L2d
            if (r11 == r7) goto L3d
        L2d:
            int r2 = r0.getLastChangedProperty()
            if (r2 != r5) goto L35
            if (r11 == r6) goto L3d
        L35:
            int r0 = r0.getLastChangedProperty()
            if (r0 != r3) goto L3f
            if (r11 != r4) goto L3f
        L3d:
            r0 = 0
            goto L40
        L3f:
            r0 = 1
        L40:
            if (r0 == 0) goto L60
            if (r11 != r7) goto L45
            goto L4e
        L45:
            if (r11 != r6) goto L49
            r1 = 2
            goto L4e
        L49:
            if (r11 != r4) goto L4d
            r1 = 3
            goto L4e
        L4d:
            r1 = 0
        L4e:
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.BranchChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.BranchChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.BranchChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.BranchChangeAction) r0
            r0.initialize(r10, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r9._sessionDataRef
            r1.addUserAction(r0)
        L60:
            r10.applyBranchModification(r11, r12)
            r9.setNeedsToBeDrawn()
            return
    }

    public void centerCamera(org.fortheloss.sticknodes.animationscreen.FrameCamera r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            r1.addUserAction(r0)
            float r0 = r3.getWidth()
            float r1 = r4.getCameraScale()
            float r0 = r0 * r1
            float r1 = r3.getHeight()
            float r2 = r4.getCameraScale()
            float r1 = r1 * r2
            float r2 = r3.getWidth()
            float r2 = r2 - r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r0
            r4.setCameraOffsetX(r2)
            float r2 = r3.getHeight()
            float r2 = r2 - r1
            float r2 = r2 * r0
            r4.setCameraOffsetY(r2)
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModuleRef
            r4.setNeedsToBeDrawn()
            return
    }

    public void centerFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5) {
            r4 = this;
            if (r5 == 0) goto L92
            boolean r0 = r5.isJoined()
            if (r0 == 0) goto La
            goto L92
        La:
            byte r0 = r5.isLockedToCamera()
            if (r0 == 0) goto L11
            return
        L11:
            boolean r0 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L2b
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            r2 = r5
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            r1.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionDataRef
            r2.addUserAction(r1)
            goto L5a
        L2b:
            boolean r1 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r1 == 0) goto L45
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            r2 = r5
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = (org.fortheloss.sticknodes.sprite.SpriteRef) r2
            r1.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionDataRef
            r2.addUserAction(r1)
            goto L5a
        L45:
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            r2 = r5
            org.fortheloss.sticknodes.movieclip.MCReference r2 = (org.fortheloss.sticknodes.movieclip.MCReference) r2
            r1.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionDataRef
            r2.addUserAction(r1)
        L5a:
            float r1 = r4.getWidth()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            float r3 = r4.getHeight()
            float r3 = r3 * r2
            r5.setPosition(r1, r3)
            org.fortheloss.sticknodes.stickfigure.INode r1 = r5.getMainNode()
            r1.flagPositionAsDirty()
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            int r1 = r1.getScreen()
            r2 = 1
            if (r1 == r2) goto L82
            if (r0 == 0) goto L82
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r5
            r4.maybeUpdateJoinChain(r5)
        L82:
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            int r5 = r5.getScreen()
            if (r5 == r2) goto L92
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
        L92:
            return
    }

    public void clearFigureFilters(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            boolean r0 = r3 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L1d
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r3
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L1d:
            boolean r0 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L37
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r3
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L37:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r3
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
        L4c:
            r0 = 0
            r3.setFilters(r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void clearListeners() {
            r3 = this;
            super.clearListeners()
            com.badlogic.gdx.input.GestureDetector r0 = r3._gestureDetector
            r1 = 0
            if (r0 == 0) goto L14
            r0.cancel()
            com.badlogic.gdx.InputMultiplexer r0 = org.fortheloss.sticknodes.App.inputMultiplexer
            com.badlogic.gdx.input.GestureDetector r2 = r3._gestureDetector
            r0.removeProcessor(r2)
            r3._gestureDetector = r1
        L14:
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r3._clickListener
            if (r0 == 0) goto L22
            r3.removeListener(r0)
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r3._clickListener
            r0.cancel()
            r3._clickListener = r1
        L22:
            return
    }

    public void copyCameraWobbleProperties(org.fortheloss.sticknodes.animationscreen.FrameCamera r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            r0.setCopiedFrameCameraProperties(r2)
            return
    }

    public void copyFigureFilters(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            r0.setCopiedFigureFilterProperties(r2)
            return
    }

    public void copyStickfigurePropertiesBundle(org.fortheloss.sticknodes.stickfigure.Stickfigure r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r0 = new org.fortheloss.sticknodes.data.StickfigurePropertiesBundle
            r0.<init>(r3)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            int r3 = r1.getFigurePosition(r3)
            r0.setStickfigureLayeringPosition(r3)
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            r3.setCopiedStickfigurePropertiesBundle(r0)
            return
    }

    public void copyTextfieldText(org.fortheloss.sticknodes.TextfieldBox r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.String r2 = r2.getText()
            if (r2 == 0) goto L24
            int r0 = r2.length()
            if (r0 > 0) goto L10
            goto L24
        L10:
            java.lang.String r2 = r2.trim()
            int r0 = r2.length()
            if (r0 > 0) goto L1b
            return
        L1b:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.utils.Clipboard r0 = r0.getClipboard()
            r0.setContents(r2)
        L24:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.Module, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 1
            r3._isDisposed = r0
            r3.clear()
            com.badlogic.gdx.input.GestureDetector r0 = r3._gestureDetector
            r1 = 0
            if (r0 == 0) goto L12
            com.badlogic.gdx.InputMultiplexer r2 = org.fortheloss.sticknodes.App.inputMultiplexer
            r2.removeProcessor(r0)
            r3._gestureDetector = r1
        L12:
            r3.mCanvasTouchArea = r1
            r3._clickListener = r1
            r3._projectDataRef = r1
            r3._sessionDataRef = r1
            r3._shapeRendererRef = r1
            r3._animateToolsModuleRef = r1
            r3._createToolsModuleRef = r1
            r3._movieclipToolsModuleRef = r1
            r3._framesModuleRef = r1
            r3._fullscreenScissorBounds = r1
            r3._ytShortsScissorBounds = r1
            r3._ytShortsFullscreenScissorBounds = r1
            r3._figuresRef = r1
            r3._textfieldBoxesRef = r1
            r3._textfieldsAboveWidescreenRef = r1
            r3._draggedNodeRef = r1
            r3._draggedTextfieldRef = r1
            r3._dragOffset = r1
            r3._zoomPosition = r1
            r3._oldZoomDragPosition = r1
            r3._glyphLayout = r1
            r3._touchZoomPointer = r1
            r3._drawOrderBitmapFont = r1
            r3._panningStartDrag = r1
            r3._cameraStartDrag = r1
            r3._cameraOffsetBeforeDragging = r1
            r3._backgroundImageRef = r1
            r3._textfieldBoxDFShaderRef = r1
            r3._playingFrameCamera = r1
            r3._scissorBounds = r1
            r3._assetsRef = r1
            r3._rememberedMatrix = r1
            r3._stickfigureToTraceRef = r1
            r3._frameDataToTraceRef = r1
            r3._lockedNodeDragOffsetAccumulation = r1
            r3._nodeDragInitialPosition = r1
            r3._nodeDragParentInitialPosition = r1
            r3._deselectSpriteRef = r1
            org.fortheloss.sticknodes.NodeDigger r0 = r3.mNodeDigger
            if (r0 == 0) goto L67
            r0.dispose()
            r3.mNodeDigger = r1
        L67:
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r0 = r3._quickMenuTable
            if (r0 == 0) goto L70
            r0.dispose()
            r3._quickMenuTable = r1
        L70:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0 = r3._quickResizeTool
            if (r0 == 0) goto L79
            r0.dispose()
            r3._quickResizeTool = r1
        L79:
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r3.mQrtDocked
            if (r0 == 0) goto L82
            r0.dispose()
            r3.mQrtDocked = r1
        L82:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r3._tracingFrameBuffer
            if (r0 == 0) goto L8b
            r0.dispose()
            r3._tracingFrameBuffer = r1
        L8b:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r3._previousOnionSkinFrameBuffer
            if (r0 == 0) goto L94
            r0.dispose()
            r3._previousOnionSkinFrameBuffer = r1
        L94:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r3._nextOnionSkinFrameBuffer
            if (r0 == 0) goto L9d
            r0.dispose()
            r3._nextOnionSkinFrameBuffer = r1
        L9d:
            r3._onionSkinCamera = r1
            org.fortheloss.sticknodes.animationscreen.Magnifier r0 = r3._magnifier
            if (r0 == 0) goto La8
            r0.dispose()
            r3._magnifier = r1
        La8:
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0 = r3._arrowsWindow
            if (r0 == 0) goto Lb1
            r0.dispose()
            r3._arrowsWindow = r1
        Lb1:
            org.fortheloss.sticknodes.animationscreen.FilterBundle r0 = r3._filterBundle
            if (r0 == 0) goto Lba
            r0.dispose()
            r3._filterBundle = r1
        Lba:
            org.fortheloss.sticknodes.TextfieldBox r0 = r3._watermarkText
            if (r0 == 0) goto Lc3
            r0.dispose()
            r3._watermarkText = r1
        Lc3:
            org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode r0 = r3._eventActionDragWithLockedNode
            if (r0 == 0) goto Lcc
            r0.dispose()
            r3._eventActionDragWithLockedNode = r1
        Lcc:
            super.dispose()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r71, float r72) {
            r70 = this;
            r6 = r70
            r15 = r71
            boolean r0 = r6._needsToBeDrawn
            if (r0 == 0) goto L1826
            r14 = 0
            r6._needsToBeDrawn = r14
            r13 = 1
            r6._hasBeenRedrawnFlag = r13
            r71.end()
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            boolean r0 = r0.getDrawOnionSkinWhenMovingStage()
            if (r0 != 0) goto L25
            boolean r0 = r6._isDraggingCanvas
            if (r0 != 0) goto L22
            boolean r0 = r6._isZoomingCanvas
            if (r0 != 0) goto L22
            goto L25
        L22:
            r20 = 0
            goto L27
        L25:
            r20 = 1
        L27:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            r12 = 3
            if (r0 == r13) goto L48
            if (r20 == 0) goto L48
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getMode()
            if (r0 == r12) goto L48
            boolean r0 = r6._previousOnionSkinDirty
            if (r0 == 0) goto L41
            r70.redrawPreviousOnionSkin()
        L41:
            boolean r0 = r6._nextOnionSkinDirty
            if (r0 == 0) goto L48
            r70.redrawNextOnionSkin()
        L48:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 == 0) goto L63
            boolean r0 = r6._isTracingBG
            if (r0 == 0) goto L63
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r6._stickfigureToTraceRef
            if (r0 != 0) goto L5c
            org.fortheloss.sticknodes.data.FrameData r0 = r6._frameDataToTraceRef
            if (r0 == 0) goto L63
        L5c:
            boolean r0 = r6._tracingFBODirty
            if (r0 == 0) goto L63
            r70.redrawTracedStickfigureOrFrame()
        L63:
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r6._fboRef
            r0.bind()
            r71.begin()
            org.fortheloss.sticknodes.data.ProjectData r0 = r6._projectDataRef
            boolean r0 = r0.isYoutubeShorts
            if (r0 == 0) goto L7e
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 != 0) goto L7e
            r0 = 1
            goto L7f
        L7e:
            r0 = 0
        L7f:
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            int r1 = r1.getMode()
            r2 = 16384(0x4000, float:2.2959E-41)
            r11 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r1 != r12) goto Lcc
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsPlayFullscreen()
            if (r1 == 0) goto Lac
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glClearColor(r11, r11, r11, r10)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glClear(r2)
            if (r0 == 0) goto La6
            com.badlogic.gdx.math.Rectangle r1 = r6._ytShortsFullscreenScissorBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r1)
            goto Ld1
        La6:
            com.badlogic.gdx.math.Rectangle r1 = r6._fullscreenScissorBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r1)
            goto Ld1
        Lac:
            if (r0 == 0) goto Lc6
            com.badlogic.gdx.math.Rectangle r1 = r6._scissorBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r1)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glClearColor(r11, r11, r11, r10)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glClear(r2)
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
            com.badlogic.gdx.math.Rectangle r1 = r6._ytShortsScissorBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r1)
            goto Ld1
        Lc6:
            com.badlogic.gdx.math.Rectangle r1 = r6._scissorBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r1)
            goto Ld1
        Lcc:
            com.badlogic.gdx.math.Rectangle r1 = r6._scissorBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r1)
        Ld1:
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 != 0) goto Le6
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r6._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            com.badlogic.gdx.graphics.Color r1 = r1.getBackgroundColor()
            goto Lfb
        Le6:
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 != r13) goto Lf5
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r6._createToolsModuleRef
            com.badlogic.gdx.graphics.Color r1 = r1.getBackgroundColor()
            goto Lfb
        Lf5:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1 = r6._movieclipToolsModuleRef
            com.badlogic.gdx.graphics.Color r1 = r1.getBackgroundColor()
        Lfb:
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r3 = r6._quickMenuTable
            if (r3 == 0) goto L10d
            boolean r3 = r3.isVisible()
            if (r3 == 0) goto L10d
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r3 = r6._quickMenuTable
            r3.setVisible(r14)
            r30 = 1
            goto L10f
        L10d:
            r30 = 0
        L10f:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r3 = r6._quickResizeTool
            boolean r3 = r3.isVisible()
            if (r3 == 0) goto L11f
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r3 = r6._quickResizeTool
            r3.setVisible(r14)
            r31 = 1
            goto L121
        L11f:
            r31 = 0
        L121:
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            float r4 = r1.r
            float r5 = r1.g
            float r7 = r1.b
            r3.glClearColor(r4, r5, r7, r10)
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r3.glClear(r2)
            super.draw(r71, r72)
            float r2 = r70.getWidth()
            float r3 = r70.getHeight()
            float r4 = r70.getX()
            float r5 = r70.getY()
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionDataRef
            int r7 = r7.getMode()
            if (r7 != r12) goto L169
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionDataRef
            boolean r7 = r7.getIsPlayFullscreen()
            if (r7 == 0) goto L169
            float r2 = r6._fullscreenWidth
            float r3 = r6._fullscreenHeight
            float r4 = r6._fullscreenX
            float r5 = r6._fullscreenY
            float r7 = r6._fullscreenScale
            r32 = r2
            r33 = r3
            r34 = r4
            r35 = r5
            r36 = r7
            goto L173
        L169:
            r32 = r2
            r33 = r3
            r34 = r4
            r35 = r5
            r36 = 1065353216(0x3f800000, float:1.0)
        L173:
            r37 = 1056964608(0x3f000000, float:0.5)
            float r38 = r32 * r37
            com.badlogic.gdx.math.Vector2 r2 = r6._zoomPosition
            float r3 = r2.x
            float r3 = r38 - r3
            float r50 = r34 + r3
            float r51 = r33 * r37
            float r2 = r2.y
            float r2 = r51 - r2
            float r52 = r35 + r2
            r71.end()
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getMode()
            if (r2 != r12) goto L27b
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getScreen()
            if (r2 != 0) goto L258
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r6._playingFrameCamera
            boolean r2 = r2.isWobbling()
            if (r2 == 0) goto L1cb
            org.fortheloss.sticknodes.data.ProjectData r2 = r6._projectDataRef
            boolean r3 = r2.tweeningEnabled
            if (r3 == 0) goto L1b1
            int r2 = r2.getActualNumTweenedFrames()
            int r2 = r2 + r13
            float r2 = (float) r2
            float r2 = r10 / r2
            goto L1b3
        L1b1:
            r2 = 1065353216(0x3f800000, float:1.0)
        L1b3:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r6._playingFrameCamera
            r3.incrementStaticWobbleSeed(r2)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r6._playingFrameCamera
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r6._figuresRef
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r4 = r6._textfieldBoxesRef
            boolean r5 = r6._drawTweenedTextfieldBoxes
            boolean r2 = r2.applyWobble(r3, r4, r5)
            if (r2 == 0) goto L1c9
            r70.maybeUpdateJoinChains()
        L1c9:
            r2 = 1
            goto L1cc
        L1cb:
            r2 = 0
        L1cc:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r6._playingFrameCamera
            float r3 = r3.getCameraScale()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r4 = r6._playingFrameCamera
            float r4 = r4.getCameraRotationDeg()
            float r4 = -r4
            int r5 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r5 != 0) goto L1df
            if (r0 == 0) goto L239
        L1df:
            float r5 = r34 + r38
            float r7 = r35 + r51
            if (r0 == 0) goto L20e
            float r0 = r70.getWidth()
            float r8 = r70.getHeight()
            float r8 = r8 / r0
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r9 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r9 = r9.translate(r5, r7, r11)
            r16 = 1119092736(0x42b40000, float:90.0)
            float r14 = r4 + r16
            com.badlogic.gdx.math.Matrix4 r9 = r9.rotate(r11, r11, r10, r14)
            com.badlogic.gdx.math.Matrix4 r8 = r9.scale(r8, r8, r10)
            float r5 = -r5
            float r7 = -r7
            com.badlogic.gdx.math.Matrix4 r5 = r8.translate(r5, r7, r11)
            r0.setTransformMatrix(r5)
            goto L225
        L20e:
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r8 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r8 = r8.translate(r5, r7, r11)
            com.badlogic.gdx.math.Matrix4 r8 = r8.rotate(r11, r11, r10, r4)
            float r5 = -r5
            float r7 = -r7
            com.badlogic.gdx.math.Matrix4 r5 = r8.translate(r5, r7, r11)
            r0.setTransformMatrix(r5)
        L225:
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r0 = r0.getTransformMatrix()
            r15.setTransformMatrix(r0)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r0 = r6._filterBundle
            r0.setIsUsingRotatedTransformationMatrix(r13)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r0 = r6._filterBundle
            r0.setTransformationRotationDeg(r4)
            r14 = 1
        L239:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r6._playingFrameCamera
            float r0 = r0.getCameraOffsetX()
            float r0 = -r0
            float r0 = r0 / r3
            float r0 = r0 * r36
            org.fortheloss.sticknodes.animationscreen.FrameCamera r4 = r6._playingFrameCamera
            float r4 = r4.getCameraOffsetY()
            float r4 = -r4
            float r4 = r4 / r3
            float r4 = r4 * r36
            r53 = r0
            r54 = r2
            r55 = r3
            r56 = r4
            r57 = r14
            goto L285
        L258:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance
            float r3 = r0.getCameraScale()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance
            float r0 = r0.getCameraOffsetX()
            float r0 = -r0
            float r0 = r0 / r3
            float r0 = r0 * r36
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance
            float r2 = r2.getCameraOffsetY()
            float r2 = -r2
            float r2 = r2 / r3
            float r4 = r2 * r36
            r53 = r0
            r55 = r3
            r56 = r4
            r54 = 0
            goto L283
        L27b:
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
        L283:
            r57 = 0
        L285:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 != 0) goto L35c
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            boolean r2 = r0.isUsingGradient()
            if (r2 == 0) goto L35c
            com.badlogic.gdx.graphics.Color r29 = r0.getGradientColor()
            boolean r2 = r0.isExpandedGradient()
            if (r2 == 0) goto L2aa
            float r2 = r6._viewableCanvasWidth
            float r2 = r2 * r36
            goto L2ac
        L2aa:
            r2 = r32
        L2ac:
            boolean r0 = r0.isExpandedGradient()
            if (r0 == 0) goto L2b7
            float r0 = r6._viewableCanvasHeight
            float r0 = r0 * r36
            goto L2b9
        L2b7:
            r0 = r33
        L2b9:
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r4 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r3.begin(r4)
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            int r3 = r3.getMode()
            if (r3 != r12) goto L300
            float r3 = r32 - r2
            float r3 = r3 * r37
            float r3 = r3 / r55
            float r3 = r3 + r50
            float r22 = r3 + r53
            float r3 = r33 - r0
            float r3 = r3 * r37
            float r3 = r3 / r55
            float r3 = r3 + r52
            float r23 = r3 + r56
            float r2 = r2 / r55
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            float r2 = (float) r2
            float r0 = r0 / r55
            double r3 = (double) r0
            double r3 = java.lang.Math.ceil(r3)
            int r0 = (int) r3
            float r0 = (float) r0
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRendererRef
            r21 = r3
            r24 = r2
            r25 = r0
            r26 = r1
            r27 = r1
            r28 = r29
            r21.rect(r22, r23, r24, r25, r26, r27, r28, r29)
            goto L357
        L300:
            float r3 = r6._zoom
            float r2 = r2 * r3
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            float r2 = (float) r2
            float r3 = r6._zoom
            float r0 = r0 * r3
            double r3 = (double) r0
            double r3 = java.lang.Math.ceil(r3)
            int r0 = (int) r3
            float r0 = (float) r0
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRendererRef
            float r4 = r70.getX()
            float r5 = r70.getX()
            float r5 = r50 - r5
            float r7 = r6._zoom
            float r5 = r5 * r7
            float r4 = r4 + r5
            float r5 = r70.getWidth()
            float r5 = r5 - r2
            float r5 = r5 * r37
            float r22 = r4 + r5
            float r4 = r70.getY()
            float r5 = r70.getY()
            float r5 = r52 - r5
            float r7 = r6._zoom
            float r5 = r5 * r7
            float r4 = r4 + r5
            float r5 = r70.getHeight()
            float r5 = r5 - r0
            float r5 = r5 * r37
            float r23 = r4 + r5
            r21 = r3
            r24 = r2
            r25 = r0
            r26 = r1
            r27 = r1
            r28 = r29
            r21.rect(r22, r23, r24, r25, r26, r27, r28, r29)
        L357:
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            r0.end()
        L35c:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            r14 = 770(0x302, float:1.079E-42)
            r9 = 771(0x303, float:1.08E-42)
            r8 = 2
            if (r0 == 0) goto L4f3
            boolean r0 = r6._isUsingCreationOrMovieclipBackgroundImage
            if (r0 == 0) goto L4f3
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getMode()
            if (r0 == r12) goto L4f3
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 == r13) goto L391
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 != r8) goto L386
            goto L391
        L386:
            r71.disableBlending()
            r15.setColor(r10, r10, r10, r10)
            r0 = 0
            r7 = 0
        L38e:
            r18 = 0
            goto L3cd
        L391:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 != r13) goto L3a0
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r6._createToolsModuleRef
            float r0 = r0.getBackgroundImageTransparency()
            goto L3a6
        L3a0:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r6._movieclipToolsModuleRef
            float r0 = r0.getBackgroundImageTransparency()
        L3a6:
            r15.setColor(r10, r10, r10, r0)
            int r1 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r1 > 0) goto L3b0
            r7 = r0
            r0 = 1
            goto L38e
        L3b0:
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 != r13) goto L3bf
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r6._createToolsModuleRef
            boolean r1 = r1.getBackgroundImageOnTop()
            goto L3c5
        L3bf:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1 = r6._movieclipToolsModuleRef
            boolean r1 = r1.getBackgroundImageOnTop()
        L3c5:
            r7 = r0
            r18 = r1
            if (r1 == 0) goto L3cc
            r0 = 1
            goto L3cd
        L3cc:
            r0 = 0
        L3cd:
            if (r0 != 0) goto L4e5
            r71.begin()
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getMode()
            if (r0 != r12) goto L42e
            float r0 = r6._backgroundImageWidth
            float r0 = r0 * r36
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            float r1 = r6._backgroundImageHeight
            float r1 = r1 * r36
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            float r0 = (float) r0
            float r2 = r32 - r0
            float r2 = r2 * r37
            float r2 = r2 / r55
            float r2 = r2 + r50
            float r2 = r2 + r53
            float r1 = (float) r1
            float r3 = r33 - r1
            float r3 = r3 * r37
            float r3 = r3 / r55
            float r3 = r3 + r52
            float r3 = r3 + r56
            float r0 = r0 / r55
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            int r0 = (int) r4
            float r1 = r1 / r55
            double r4 = (double) r1
            double r4 = java.lang.Math.ceil(r4)
            int r1 = (int) r4
            com.badlogic.gdx.graphics.Texture r4 = r6._backgroundImageRef
            float r5 = (float) r0
            float r1 = (float) r1
            r0 = r71
            r16 = r1
            r1 = r4
            r4 = r5
            r5 = r16
            r0.draw(r1, r2, r3, r4, r5)
            r22 = r7
            r7 = 0
            r9 = 3
            r10 = 1
        L428:
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 771(0x303, float:1.08E-42)
            goto L4de
        L42e:
            boolean r0 = r6._isTracingBG
            if (r0 == 0) goto L478
            r15.setColor(r7, r7, r7, r7)
            r15.setBlendFunction(r13, r9)
            com.badlogic.gdx.graphics.Texture r0 = r6._backgroundImageRef
            float r1 = r70.getX()
            float r2 = r70.getY()
            float r3 = r70.getWidth()
            float r4 = r70.getHeight()
            r5 = 0
            r16 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = r7
            r7 = r71
            r8 = r0
            r0 = 771(0x303, float:1.08E-42)
            r9 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = r2
            r2 = 0
            r11 = r3
            r3 = 3
            r12 = r4
            r4 = 1
            r13 = r5
            r5 = 0
            r14 = r16
            r15 = r19
            r16 = r21
            r7.draw(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r15 = r71
            r14 = 770(0x302, float:1.079E-42)
            r15.setBlendFunction(r14, r0)
            r7 = 0
            r9 = 3
            r10 = 1
            r11 = 0
            goto L428
        L478:
            r22 = r7
            r0 = 771(0x303, float:1.08E-42)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3 = 3
            r4 = 1
            r5 = 0
            float r7 = r6._backgroundImageWidth
            float r8 = r6._zoom
            float r7 = r7 * r8
            double r7 = (double) r7
            double r7 = java.lang.Math.ceil(r7)
            int r7 = (int) r7
            float r8 = r6._backgroundImageHeight
            float r9 = r6._zoom
            float r8 = r8 * r9
            double r8 = (double) r8
            double r8 = java.lang.Math.ceil(r8)
            int r8 = (int) r8
            float r9 = r70.getX()
            float r10 = r70.getX()
            float r10 = r50 - r10
            float r11 = r6._zoom
            float r10 = r10 * r11
            float r9 = r9 + r10
            float r10 = r70.getWidth()
            float r7 = (float) r7
            float r10 = r10 - r7
            float r10 = r10 * r37
            float r9 = r9 + r10
            float r10 = r70.getY()
            float r11 = r70.getY()
            float r11 = r52 - r11
            float r12 = r6._zoom
            float r11 = r11 * r12
            float r10 = r10 + r11
            float r11 = r70.getHeight()
            float r8 = (float) r8
            float r11 = r11 - r8
            float r11 = r11 * r37
            float r10 = r10 + r11
            com.badlogic.gdx.graphics.Texture r11 = r6._backgroundImageRef
            r13 = 771(0x303, float:1.08E-42)
            r0 = r71
            r12 = 1065353216(0x3f800000, float:1.0)
            r1 = r11
            r11 = 0
            r2 = r9
            r9 = 3
            r3 = r10
            r10 = 1
            r4 = r7
            r7 = 0
            r5 = r8
            r0.draw(r1, r2, r3, r4, r5)
        L4de:
            r71.end()
            r71.enableBlending()
            goto L4ee
        L4e5:
            r22 = r7
            r7 = 0
            r9 = 3
            r10 = 1
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 771(0x303, float:1.08E-42)
        L4ee:
            r1 = r18
            r0 = r22
            goto L4fc
        L4f3:
            r7 = 0
            r9 = 3
            r10 = 1
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 771(0x303, float:1.08E-42)
            r0 = 0
            r1 = 0
        L4fc:
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            boolean r2 = r2.getIsNormalOnionSkin()
            if (r2 == 0) goto L597
            if (r20 == 0) goto L597
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getScreen()
            if (r2 == r10) goto L597
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getMode()
            if (r2 == r9) goto L597
            r15.setBlendFunction(r10, r13)
            r71.begin()
            r2 = 1050924810(0x3ea3d70a, float:0.32)
            r15.setColor(r2, r2, r2, r2)
            boolean r2 = r6._flagPreviousOnionSkinBlank
            if (r2 != 0) goto L562
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r6._previousOnionSkinFrameBuffer
            com.badlogic.gdx.graphics.GLTexture r2 = r2.getColorBufferTexture()
            r8 = r2
            com.badlogic.gdx.graphics.Texture r8 = (com.badlogic.gdx.graphics.Texture) r8
            float r2 = r70.getX()
            float r3 = r70.getY()
            float r4 = r70.getWidth()
            float r5 = r70.getHeight()
            r16 = 0
            r17 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 1065353216(0x3f800000, float:1.0)
            r7 = r71
            r9 = r2
            r2 = 1
            r10 = r3
            r3 = 0
            r11 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r12 = r5
            r5 = 771(0x303, float:1.08E-42)
            r13 = r16
            r4 = 770(0x302, float:1.079E-42)
            r14 = r17
            r2 = r15
            r15 = r18
            r16 = r19
            r7.draw(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L568
        L562:
            r2 = r15
            r3 = 0
            r4 = 770(0x302, float:1.079E-42)
            r5 = 771(0x303, float:1.08E-42)
        L568:
            boolean r7 = r6._flagNextOnionSkinBlank
            if (r7 != 0) goto L590
            com.badlogic.gdx.graphics.glutils.FrameBuffer r7 = r6._nextOnionSkinFrameBuffer
            com.badlogic.gdx.graphics.GLTexture r7 = r7.getColorBufferTexture()
            r8 = r7
            com.badlogic.gdx.graphics.Texture r8 = (com.badlogic.gdx.graphics.Texture) r8
            float r9 = r70.getX()
            float r10 = r70.getY()
            float r11 = r70.getWidth()
            float r12 = r70.getHeight()
            r13 = 0
            r14 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = 1065353216(0x3f800000, float:1.0)
            r7 = r71
            r7.draw(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L590:
            r71.end()
            r2.setBlendFunction(r4, r5)
            goto L59d
        L597:
            r2 = r15
            r3 = 0
            r4 = 770(0x302, float:1.079E-42)
            r5 = 771(0x303, float:1.08E-42)
        L59d:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r6._figuresRef
            if (r7 != 0) goto L5a3
            r15 = 0
            goto L5a8
        L5a3:
            int r14 = r7.size()
            r15 = r14
        L5a8:
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r14 = r7.getCurrentlySelectedStickfigure()
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r13 = r7.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r12 = r7.getCurrentlySelectedMC()
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r11 = r7.getCurrentlySelectedSprite()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r6._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r10 = r7.getNodeDrawTools()
            r9 = 24
            r58 = 1101004800(0x41a00000, float:20.0)
            if (r15 <= 0) goto Ldfe
            r3 = 0
        L5cd:
            if (r3 >= r15) goto L5dd
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r6._figuresRef
            java.lang.Object r7 = r7.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r7
            r7.validateDirtyNodes()
            int r3 = r3 + 1
            goto L5cd
        L5dd:
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r7 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r3.begin(r7)
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            int r3 = r3.getScreen()
            r7 = 1
            if (r3 != r7) goto L5ef
            r3 = 0
            goto L5f5
        L5ef:
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            boolean r3 = r3.getStickNodeCullingEnabled()
        L5f5:
            if (r3 == 0) goto L625
            float r7 = r70.getX()
            float r17 = r70.getWidth()
            float r17 = r17 * r37
            float r7 = r7 + r17
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_CENTER_X = r7
            float r7 = r70.getY()
            float r17 = r70.getHeight()
            float r17 = r17 * r37
            float r7 = r7 + r17
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_CENTER_Y = r7
            float r7 = r70.getWidth()
            r17 = 1061158912(0x3f400000, float:0.75)
            float r7 = r7 * r17
            float r18 = r70.getWidth()
            float r18 = r18 * r17
            float r7 = r7 * r18
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_DISTANCE_SQUARED = r7
        L625:
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionDataRef
            int r7 = r7.getMode()
            r4 = 3
            if (r7 != r4) goto L69b
            float r24 = r50 + r53
            float r25 = r52 + r56
            r7 = 1065353216(0x3f800000, float:1.0)
            float r17 = r7 / r55
            float r26 = r17 * r36
            r7 = 0
        L639:
            if (r7 >= r15) goto L68c
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r6._figuresRef
            java.lang.Object r4 = r4.get(r7)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            org.fortheloss.sticknodes.SNShapeRenderer r8 = r6._shapeRendererRef
            org.fortheloss.sticknodes.animationscreen.FilterBundle r5 = r6._filterBundle
            r18 = 0
            r19 = 0
            r28 = 0
            r29 = 0
            boolean r39 = org.fortheloss.sticknodes.animationscreen.modules.CanvasModule.DEBUG_USE_TILDE_RENDER_AA
            r40 = r7
            r7 = r4
            r4 = 26
            r9 = r71
            r59 = r10
            r10 = r5
            r5 = r11
            r11 = r24
            r60 = r12
            r12 = r25
            r61 = r13
            r13 = r18
            r62 = r14
            r14 = r19
            r63 = r15
            r15 = r26
            r16 = r28
            r17 = r29
            r18 = r39
            r19 = r3
            r7.drawLimbs(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r7 = r40 + 1
            r11 = r5
            r10 = r59
            r12 = r60
            r13 = r61
            r14 = r62
            r15 = r63
            r4 = 3
            r5 = 771(0x303, float:1.08E-42)
            r9 = 24
            goto L639
        L68c:
            r59 = r10
            r5 = r11
            r60 = r12
            r61 = r13
            r62 = r14
            r4 = 26
            r64 = r15
            goto L706
        L69b:
            r59 = r10
            r5 = r11
            r60 = r12
            r61 = r13
            r62 = r14
            r63 = r15
            r4 = 26
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionDataRef
            boolean r24 = r7.getIsShowingOutline()
            org.fortheloss.sticknodes.animationscreen.FilterBundle r7 = r6._filterBundle
            org.fortheloss.sticknodes.data.SessionData r8 = r6._sessionDataRef
            boolean r8 = r8.getRenderFiltersWhenDragging()
            if (r8 != 0) goto L6c7
            boolean r8 = r6._isActiveDragging
            if (r8 != 0) goto L6c4
            boolean r8 = r6._isDraggingCanvas
            if (r8 != 0) goto L6c4
            boolean r8 = r6._isZoomingCanvas
            if (r8 == 0) goto L6c7
        L6c4:
            r25 = 0
            goto L6c9
        L6c7:
            r25 = r7
        L6c9:
            r14 = r63
            r15 = 0
        L6cc:
            if (r15 >= r14) goto L704
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r6._figuresRef
            java.lang.Object r7 = r7.get(r15)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r7
            org.fortheloss.sticknodes.SNShapeRenderer r8 = r6._shapeRendererRef
            com.badlogic.gdx.math.Vector2 r9 = r6._zoomPosition
            float r13 = r9.x
            float r12 = r9.y
            float r11 = r6._zoom
            boolean r18 = org.fortheloss.sticknodes.animationscreen.modules.CanvasModule.DEBUG_USE_TILDE_RENDER_AA
            r9 = r71
            r10 = r25
            r16 = r11
            r11 = r50
            r17 = r12
            r12 = r52
            r64 = r14
            r14 = r17
            r26 = r15
            r15 = r16
            r16 = r24
            r17 = r61
            r19 = r3
            r7.drawLimbs(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r15 = r26 + 1
            r14 = r64
            goto L6cc
        L704:
            r64 = r14
        L706:
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRendererRef
            r3.end()
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            int r3 = r3.getMode()
            if (r3 != 0) goto Ld75
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            boolean r3 = r3.getIsNormalOnionSkin()
            if (r3 != 0) goto L73a
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            int r3 = r3.getScreen()
            r15 = 1
            if (r3 != r15) goto L725
            goto L73b
        L725:
            r15 = r2
            r12 = r5
            r9 = r59
            r65 = r60
            r14 = r61
            r66 = r62
            r13 = r64
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r10 = 24
            r11 = 26
            goto Lb14
        L73a:
            r15 = 1
        L73b:
            if (r1 == 0) goto L7ed
            r71.begin()
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.setColor(r1, r1, r1, r1)
            boolean r1 = r6._isTracingBG
            if (r1 == 0) goto L782
            r2.setColor(r0, r0, r0, r0)
            r0 = 771(0x303, float:1.08E-42)
            r2.setBlendFunction(r15, r0)
            com.badlogic.gdx.graphics.Texture r8 = r6._backgroundImageRef
            float r9 = r70.getX()
            float r10 = r70.getY()
            float r11 = r70.getWidth()
            float r12 = r70.getHeight()
            r13 = 0
            r14 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r16 = 1065353216(0x3f800000, float:1.0)
            r7 = r71
            r3 = 1
            r15 = r0
            r7.draw(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7 = 770(0x302, float:1.079E-42)
            r8 = 771(0x303, float:1.08E-42)
            r2.setBlendFunction(r7, r8)
            r15 = r2
            r12 = r5
            r7 = 1065353216(0x3f800000, float:1.0)
            r9 = 770(0x302, float:1.079E-42)
            r10 = 0
            r11 = 26
            r14 = 1
            goto L7e9
        L782:
            r3 = 1
            r7 = 770(0x302, float:1.079E-42)
            r8 = 771(0x303, float:1.08E-42)
            r9 = 1065353216(0x3f800000, float:1.0)
            r2.setColor(r9, r9, r9, r0)
            float r0 = r6._backgroundImageWidth
            float r1 = r6._zoom
            float r0 = r0 * r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            float r1 = r6._backgroundImageHeight
            float r10 = r6._zoom
            float r1 = r1 * r10
            double r10 = (double) r1
            double r10 = java.lang.Math.ceil(r10)
            int r1 = (int) r10
            float r10 = r70.getX()
            float r11 = r70.getX()
            float r11 = r50 - r11
            float r12 = r6._zoom
            float r11 = r11 * r12
            float r10 = r10 + r11
            float r11 = r70.getWidth()
            float r12 = (float) r0
            float r11 = r11 - r12
            float r11 = r11 * r37
            float r10 = r10 + r11
            float r0 = r70.getY()
            float r11 = r70.getY()
            float r11 = r52 - r11
            float r13 = r6._zoom
            float r11 = r11 * r13
            float r0 = r0 + r11
            float r11 = r70.getHeight()
            float r13 = (float) r1
            float r11 = r11 - r13
            float r11 = r11 * r37
            float r11 = r11 + r0
            com.badlogic.gdx.graphics.Texture r1 = r6._backgroundImageRef
            r0 = r71
            r15 = r2
            r14 = 1
            r2 = r10
            r10 = 0
            r3 = r11
            r7 = 1065353216(0x3f800000, float:1.0)
            r9 = 770(0x302, float:1.079E-42)
            r11 = 26
            r4 = r12
            r12 = r5
            r5 = r13
            r0.draw(r1, r2, r3, r4, r5)
        L7e9:
            r71.end()
            goto L7f9
        L7ed:
            r15 = r2
            r12 = r5
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 771(0x303, float:1.08E-42)
            r9 = 770(0x302, float:1.079E-42)
            r10 = 0
            r11 = 26
            r14 = 1
        L7f9:
            r71.begin()
            r15.setColor(r7, r7, r7, r7)
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 != r14) goto L819
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            boolean r0 = r0.getIsShowingCreationStaticNodes()
            if (r0 == 0) goto L819
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r6._createToolsModuleRef
            boolean r0 = r0.userIsTestingSmartStretch()
            if (r0 != 0) goto L819
            r0 = 1
            goto L81a
        L819:
            r0 = 0
        L81a:
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r29 = r1.getIsOnlyDrawingMainNodes()
            r13 = r64
            r1 = 0
        L823:
            if (r1 >= r13) goto L8a1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r6._figuresRef
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            boolean r3 = r6._isWaitingForUserToChooseFigure
            if (r3 == 0) goto L840
            boolean r3 = r6._isWaitingForUserToChooseFigureAllowMCs
            if (r3 != 0) goto L840
            boolean r3 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r3 != 0) goto L840
            r4 = r60
            r14 = r61
            r5 = r62
            goto L893
        L840:
            r5 = r62
            r4 = r60
            if (r2 == r5) goto L84e
            if (r2 == r4) goto L84e
            if (r2 != r12) goto L84b
            goto L84e
        L84b:
            r47 = 0
            goto L850
        L84e:
            r47 = 1
        L850:
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            boolean r3 = r3.getAlwaysShowCurrentFigureNodes()
            if (r3 == 0) goto L872
            if (r47 == 0) goto L85e
            r14 = r61
            r3 = 0
            goto L862
        L85e:
            r3 = r29
            r14 = r61
        L862:
            boolean r8 = r14 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r8 == 0) goto L86f
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = r2.getJoinedToNode()
            if (r8 != r14) goto L86f
            r49 = 0
            goto L876
        L86f:
            r49 = r3
            goto L876
        L872:
            r14 = r61
            r49 = r29
        L876:
            com.badlogic.gdx.math.Vector2 r3 = r6._zoomPosition
            float r8 = r3.x
            float r3 = r3.y
            float r9 = r6._zoom
            r39 = r2
            r40 = r59
            r41 = r50
            r42 = r52
            r43 = r8
            r44 = r3
            r45 = r9
            r46 = r0
            r48 = r14
            r39.drawNodes(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
        L893:
            int r1 = r1 + 1
            r60 = r4
            r62 = r5
            r61 = r14
            r8 = 771(0x303, float:1.08E-42)
            r9 = 770(0x302, float:1.079E-42)
            r14 = 1
            goto L823
        L8a1:
            r4 = r60
            r14 = r61
            r5 = r62
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r6._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getCurrentWorkingPolyfillAnchor()
            if (r1 != 0) goto L94c
            if (r29 == 0) goto L8bc
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getAlwaysShowCurrentFigureNodes()
            if (r1 == 0) goto L8ba
            goto L8bc
        L8ba:
            r1 = 0
            goto L8bd
        L8bc:
            r1 = 1
        L8bd:
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            boolean r2 = r2.getIsShowingNeighborNodes()
            if (r2 == 0) goto L94c
            if (r1 == 0) goto L94c
            if (r14 == 0) goto L94c
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r48 = r1.getNeighborNodesAffectedByJoins()
            if (r5 == 0) goto L8fb
            boolean r1 = r14 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r1 == 0) goto L8fb
            boolean r1 = r5.isLocked()
            if (r1 != 0) goto L8fb
            com.badlogic.gdx.math.Vector2 r1 = r6._zoomPosition
            float r2 = r1.x
            float r1 = r1.y
            float r3 = r6._zoom
            r47 = r14
            org.fortheloss.sticknodes.stickfigure.StickNode r47 = (org.fortheloss.sticknodes.stickfigure.StickNode) r47
            r39 = r5
            r40 = r59
            r41 = r50
            r42 = r52
            r43 = r2
            r44 = r1
            r45 = r3
            r46 = r0
            r39.highlightChildrenAndParentNodes(r40, r41, r42, r43, r44, r45, r46, r47, r48)
            goto L94c
        L8fb:
            if (r12 == 0) goto L923
            boolean r0 = r14 instanceof org.fortheloss.sticknodes.sprite.SpriteNode
            if (r0 == 0) goto L923
            boolean r0 = r12.isLocked()
            if (r0 != 0) goto L923
            com.badlogic.gdx.math.Vector2 r0 = r6._zoomPosition
            float r1 = r0.x
            float r0 = r0.y
            float r2 = r6._zoom
            r21 = r12
            r22 = r59
            r23 = r50
            r24 = r52
            r25 = r1
            r26 = r0
            r27 = r2
            r28 = r29
            r21.highlightNodes(r22, r23, r24, r25, r26, r27, r28)
            goto L94c
        L923:
            if (r4 == 0) goto L94c
            boolean r0 = r14 instanceof org.fortheloss.sticknodes.movieclip.MCNode
            if (r0 == 0) goto L94c
            boolean r0 = r4.isLocked()
            if (r0 != 0) goto L94c
            com.badlogic.gdx.math.Vector2 r0 = r6._zoomPosition
            float r1 = r0.x
            float r0 = r0.y
            float r2 = r6._zoom
            r28 = r14
            org.fortheloss.sticknodes.movieclip.MCNode r28 = (org.fortheloss.sticknodes.movieclip.MCNode) r28
            r21 = r4
            r22 = r59
            r23 = r50
            r24 = r52
            r25 = r1
            r26 = r0
            r27 = r2
            r21.highlightNodes(r22, r23, r24, r25, r26, r27, r28, r29)
        L94c:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r6._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getCurrentWorkingConnectorAnchor()
            if (r0 == 0) goto L9bb
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            if (r1 == 0) goto L9bb
            if (r1 == r0) goto L9bb
            float r2 = r6._zoom
            float r2 = r2 - r7
            float r3 = r0.getGlobalX()
            float r3 = r3 + r50
            float r8 = r0.getGlobalX()
            com.badlogic.gdx.math.Vector2 r9 = r6._zoomPosition
            float r9 = r9.x
            float r8 = r8 - r9
            float r8 = r8 * r2
            float r23 = r3 + r8
            float r3 = r0.getGlobalY()
            float r3 = r3 + r52
            float r0 = r0.getGlobalY()
            com.badlogic.gdx.math.Vector2 r8 = r6._zoomPosition
            float r8 = r8.y
            float r0 = r0 - r8
            float r0 = r0 * r2
            float r24 = r3 + r0
            float r0 = r1.getGlobalX()
            float r0 = r0 + r50
            float r3 = r1.getGlobalX()
            com.badlogic.gdx.math.Vector2 r8 = r6._zoomPosition
            float r8 = r8.x
            float r3 = r3 - r8
            float r3 = r3 * r2
            float r25 = r0 + r3
            float r0 = r1.getGlobalY()
            float r0 = r0 + r52
            float r1 = r1.getGlobalY()
            com.badlogic.gdx.math.Vector2 r3 = r6._zoomPosition
            float r3 = r3.y
            float r1 = r1 - r3
            float r1 = r1 * r2
            float r26 = r0 + r1
            r9 = r59
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r21 = r9.getNode(r11)
            com.badlogic.gdx.graphics.g2d.Batch r22 = r9.getBatch()
            r21.drawDashedLine(r22, r23, r24, r25, r26)
            goto L9bd
        L9bb:
            r9 = r59
        L9bd:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 != 0) goto L9d5
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r6._animateToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r0.getFigureToJoin()
            if (r0 == 0) goto L9d5
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r6._animateToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r0.getFigureToJoin()
            r8 = 2
            goto L9ee
        L9d5:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            r8 = 2
            if (r0 != r8) goto L9ed
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r6._movieclipToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r0.getFigureToJoin()
            if (r0 == 0) goto L9ed
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r6._movieclipToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r0.getFigureToJoin()
            goto L9ee
        L9ed:
            r0 = 0
        L9ee:
            if (r0 == 0) goto La6b
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            boolean r1 = r1 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r1 == 0) goto La6b
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r1.getStickfigure()
            if (r2 == r0) goto La6b
            float r2 = r0.getX()
            com.badlogic.gdx.math.Vector2 r3 = r6._zoomPosition
            float r3 = r3.x
            float r2 = r2 - r3
            float r3 = r6._zoom
            float r3 = r3 - r7
            float r2 = r2 * r3
            float r3 = r0.getY()
            com.badlogic.gdx.math.Vector2 r8 = r6._zoomPosition
            float r8 = r8.y
            float r3 = r3 - r8
            float r8 = r6._zoom
            float r8 = r8 - r7
            float r3 = r3 * r8
            float r8 = r0.getX()
            float r8 = r8 + r50
            float r23 = r8 + r2
            float r0 = r0.getY()
            float r0 = r0 + r52
            float r24 = r0 + r3
            float r0 = r1.getGlobalX()
            com.badlogic.gdx.math.Vector2 r2 = r6._zoomPosition
            float r2 = r2.x
            float r0 = r0 - r2
            float r2 = r6._zoom
            float r2 = r2 - r7
            float r0 = r0 * r2
            float r2 = r1.getGlobalY()
            com.badlogic.gdx.math.Vector2 r3 = r6._zoomPosition
            float r3 = r3.y
            float r2 = r2 - r3
            float r3 = r6._zoom
            float r3 = r3 - r7
            float r2 = r2 * r3
            float r3 = r1.getGlobalX()
            float r3 = r3 + r50
            float r25 = r3 + r0
            float r0 = r1.getGlobalY()
            float r0 = r0 + r52
            float r26 = r0 + r2
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r21 = r9.getNode(r11)
            com.badlogic.gdx.graphics.g2d.Batch r22 = r9.getBatch()
            r21.drawDashedLine(r22, r23, r24, r25, r26)
        La6b:
            com.badlogic.gdx.math.Vector2 r0 = r6._lockedNodeDragOffsetAccumulation
            float r1 = r0.x
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 != 0) goto La7c
            float r0 = r0.y
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto La7a
            goto La7c
        La7a:
            r0 = 0
            goto La7d
        La7c:
            r0 = 1
        La7d:
            if (r0 == 0) goto Laf6
            org.fortheloss.sticknodes.stickfigure.INode r0 = r6._draggedNodeRef
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r1 == 0) goto Laf6
            boolean r1 = r6._isActiveDragging
            if (r1 == 0) goto Laf6
            boolean r0 = r0.isMainNode()
            if (r0 != 0) goto Laf6
            float r0 = r6._zoom
            float r0 = r0 - r7
            com.badlogic.gdx.math.Vector2 r1 = r6._nodeDragParentInitialPosition
            float r2 = r1.x
            float r3 = r2 + r50
            com.badlogic.gdx.math.Vector2 r8 = r6._zoomPosition
            float r10 = r8.x
            float r2 = r2 - r10
            float r2 = r2 * r0
            float r3 = r3 + r2
            float r1 = r1.y
            float r2 = r1 + r52
            float r8 = r8.y
            float r1 = r1 - r8
            float r1 = r1 * r0
            float r2 = r2 + r1
            org.fortheloss.sticknodes.stickfigure.INode r1 = r6._draggedNodeRef
            float r1 = r1.getGlobalX()
            float r1 = r1 + r50
            org.fortheloss.sticknodes.stickfigure.INode r8 = r6._draggedNodeRef
            float r8 = r8.getGlobalX()
            com.badlogic.gdx.math.Vector2 r10 = r6._zoomPosition
            float r10 = r10.x
            float r8 = r8 - r10
            float r8 = r8 * r0
            float r25 = r1 + r8
            org.fortheloss.sticknodes.stickfigure.INode r1 = r6._draggedNodeRef
            float r1 = r1.getGlobalY()
            float r1 = r1 + r52
            org.fortheloss.sticknodes.stickfigure.INode r8 = r6._draggedNodeRef
            float r8 = r8.getGlobalY()
            com.badlogic.gdx.math.Vector2 r10 = r6._zoomPosition
            float r10 = r10.y
            float r8 = r8 - r10
            float r8 = r8 * r0
            float r26 = r1 + r8
            r10 = 24
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r21 = r9.getNode(r10)
            com.badlogic.gdx.graphics.g2d.Batch r22 = r9.getBatch()
            r23 = r3
            r24 = r2
            r21.drawDashedLine(r22, r23, r24, r25, r26)
            r8 = 0
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r0 = r9.getNode(r8)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r9.getBatch()
            r0.drawNode(r1, r3, r2, r7)
            goto Laf9
        Laf6:
            r8 = 0
            r10 = 24
        Laf9:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r0.getCurrentlySelectedNode()
            r19 = 0
            r0 = r70
            r2 = r9
            r3 = r50
            r65 = r4
            r4 = r52
            r66 = r5
            r5 = r19
            r0.drawDragLockNodeMaybe(r1, r2, r3, r4, r5)
            r71.end()
        Lb14:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto Lcd8
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r6._createToolsModuleRef
            boolean r0 = r0.userIsTestingSmartStretch()
            if (r0 != 0) goto Lcd8
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            boolean r19 = r0.getIsOnlyDrawingMainNodes()
            if (r19 != 0) goto Lb38
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            boolean r0 = r0.getIsShowingCreationStaticNodes()
            if (r0 == 0) goto Lb38
            r21 = 1
            goto Lb3a
        Lb38:
            r21 = 0
        Lb3a:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            short r0 = r0.getNodeHighlightMode()
            r1 = 3
            if (r0 != r1) goto Lc16
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r5 = r0.getCurrentlySelectedNode()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r6._figuresRef
            java.lang.Object r0 = r0.get(r8)
            r22 = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r22 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r22
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            r4 = r0
            java.util.Stack r4 = (java.util.Stack) r4
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r22.getMainNode()
            r4.push(r0)
        Lb63:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Lc0d
            java.lang.Object r0 = r4.pop()
            r3 = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            if (r3 == r5) goto Lb82
            if (r19 != 0) goto Lb82
            boolean r0 = r3.isStatic()
            if (r0 == 0) goto Lb7c
            if (r21 == 0) goto Lb82
        Lb7c:
            boolean r0 = r3.getIsDragLocked()
            if (r0 != 0) goto Lb88
        Lb82:
            boolean r0 = r3.getIsAngleLocked()
            if (r0 == 0) goto Lbe5
        Lb88:
            boolean r0 = r71.isDrawing()
            if (r0 != 0) goto Lb91
            r71.begin()
        Lb91:
            r23 = 1
            r0 = r70
            r1 = r3
            r2 = r9
            r24 = r3
            r3 = r50
            r10 = r4
            r4 = r52
            r25 = r5
            r5 = r23
            r0.drawDragLockNodeMaybe(r1, r2, r3, r4, r5)
            float r0 = r22.getX()
            com.badlogic.gdx.math.Vector2 r1 = r6._zoomPosition
            float r1 = r1.x
            float r0 = r0 - r1
            float r1 = r6._zoom
            float r1 = r1 - r7
            float r0 = r0 * r1
            float r1 = r22.getY()
            com.badlogic.gdx.math.Vector2 r2 = r6._zoomPosition
            float r2 = r2.y
            float r1 = r1 - r2
            float r2 = r6._zoom
            float r2 = r2 - r7
            float r1 = r1 * r2
            float r2 = r22.getX()
            float r2 = r2 + r50
            float r41 = r2 + r0
            float r0 = r22.getY()
            float r0 = r0 + r52
            float r42 = r0 + r1
            float r0 = r6._zoom
            r45 = 1
            r46 = 0
            r47 = 1
            r39 = r24
            r40 = r9
            r43 = r0
            r44 = r21
            r39.drawNode(r40, r41, r42, r43, r44, r45, r46, r47)
            goto Lbea
        Lbe5:
            r24 = r3
            r10 = r4
            r25 = r5
        Lbea:
            java.util.ArrayList r0 = r24.getChildrenNodes()
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        Lbf4:
            if (r0 < 0) goto Lc06
            java.util.ArrayList r1 = r24.getChildrenNodes()
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r10.push(r1)
            int r0 = r0 + (-1)
            goto Lbf4
        Lc06:
            r4 = r10
            r5 = r25
            r10 = 24
            goto Lb63
        Lc0d:
            r10 = r4
            r10.clear()
            com.badlogic.gdx.utils.Pools.free(r10)
            goto Lccf
        Lc16:
            r1 = 1
            if (r0 == r1) goto Lc1c
            r1 = 2
            if (r0 != r1) goto Lccf
        Lc1c:
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r6._figuresRef
            java.lang.Object r2 = r2.get(r8)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            java.lang.Class<java.util.Stack> r3 = java.util.Stack.class
            java.lang.Object r3 = com.badlogic.gdx.utils.Pools.obtain(r3)
            java.util.Stack r3 = (java.util.Stack) r3
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r2.getMainNode()
            r3.push(r4)
        Lc39:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto Lccc
            java.lang.Object r4 = r3.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            if (r4 == r1) goto Lcac
            if (r19 != 0) goto Lcac
            boolean r5 = r4.isStatic()
            if (r5 == 0) goto Lc51
            if (r21 == 0) goto Lcac
        Lc51:
            r5 = 1
            if (r0 != r5) goto Lc5d
            boolean r5 = r4.isPolyfillAnchor()
            if (r5 != 0) goto Lc5b
            goto Lc5d
        Lc5b:
            r5 = 2
            goto Lc64
        Lc5d:
            r5 = 2
            if (r0 != r5) goto Lcac
            boolean r10 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r10 == 0) goto Lcac
        Lc64:
            boolean r10 = r71.isDrawing()
            if (r10 != 0) goto Lc6d
            r71.begin()
        Lc6d:
            float r10 = r2.getX()
            com.badlogic.gdx.math.Vector2 r5 = r6._zoomPosition
            float r5 = r5.x
            float r10 = r10 - r5
            float r5 = r6._zoom
            float r5 = r5 - r7
            float r10 = r10 * r5
            float r5 = r2.getY()
            com.badlogic.gdx.math.Vector2 r11 = r6._zoomPosition
            float r11 = r11.y
            float r5 = r5 - r11
            float r11 = r6._zoom
            float r11 = r11 - r7
            float r5 = r5 * r11
            float r11 = r2.getX()
            float r11 = r11 + r50
            float r41 = r11 + r10
            float r10 = r2.getY()
            float r10 = r10 + r52
            float r42 = r10 + r5
            float r5 = r6._zoom
            r45 = 1
            r46 = 0
            r47 = 1
            r39 = r4
            r40 = r9
            r43 = r5
            r44 = r21
            r39.drawNode(r40, r41, r42, r43, r44, r45, r46, r47)
        Lcac:
            java.util.ArrayList r5 = r4.getChildrenNodes()
            int r5 = r5.size()
            r10 = 1
            int r5 = r5 - r10
        Lcb6:
            if (r5 < 0) goto Lcc8
            java.util.ArrayList r10 = r4.getChildrenNodes()
            java.lang.Object r10 = r10.get(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = (org.fortheloss.sticknodes.stickfigure.StickNode) r10
            r3.push(r10)
            int r5 = r5 + (-1)
            goto Lcb6
        Lcc8:
            r11 = 26
            goto Lc39
        Lccc:
            com.badlogic.gdx.utils.Pools.free(r3)
        Lccf:
            boolean r0 = r71.isDrawing()
            if (r0 == 0) goto Lcd8
            r71.end()
        Lcd8:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto Ld84
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r6._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getCurrentWorkingPolyfillAnchor()
            if (r0 == 0) goto Lcf3
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r6._createToolsModuleRef
            boolean r0 = r0.getPolynodeIsShowingNumbers()
            if (r0 == 0) goto Lcf3
            r0 = 1
            goto Lcf4
        Lcf3:
            r0 = 0
        Lcf4:
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsShowingCreationDrawOrder()
            if (r1 == 0) goto Ld38
            if (r0 != 0) goto Ld38
            boolean r1 = r71.isDrawing()
            if (r1 != 0) goto Ld07
            r71.begin()
        Ld07:
            r1 = 0
        Ld08:
            if (r1 >= r13) goto Ld38
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r6._figuresRef
            java.lang.Object r2 = r2.get(r1)
            r21 = r2
            org.fortheloss.sticknodes.stickfigure.Stickfigure r21 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r21
            com.badlogic.gdx.graphics.g2d.GlyphLayout r2 = r6._glyphLayout
            com.badlogic.gdx.graphics.g2d.BitmapFont r3 = r6._drawOrderBitmapFont
            r24 = r15
            com.badlogic.gdx.graphics.g2d.SpriteBatch r24 = (com.badlogic.gdx.graphics.g2d.SpriteBatch) r24
            com.badlogic.gdx.math.Vector2 r4 = r6._zoomPosition
            float r5 = r4.x
            float r4 = r4.y
            float r10 = r6._zoom
            r22 = r2
            r23 = r3
            r25 = r50
            r26 = r52
            r27 = r5
            r28 = r4
            r29 = r10
            r21.drawDrawOrderText(r22, r23, r24, r25, r26, r27, r28, r29)
            int r1 = r1 + 1
            goto Ld08
        Ld38:
            if (r0 == 0) goto Ld84
            boolean r0 = r71.isDrawing()
            if (r0 != 0) goto Ld43
            r71.begin()
        Ld43:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r6._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r40 = r0.getCurrentWorkingPolyfillAnchor()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r6._figuresRef
            java.lang.Object r0 = r0.get(r8)
            r39 = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r39 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r39
            com.badlogic.gdx.graphics.g2d.GlyphLayout r0 = r6._glyphLayout
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r6._drawOrderBitmapFont
            r43 = r15
            com.badlogic.gdx.graphics.g2d.SpriteBatch r43 = (com.badlogic.gdx.graphics.g2d.SpriteBatch) r43
            com.badlogic.gdx.math.Vector2 r2 = r6._zoomPosition
            float r3 = r2.x
            float r2 = r2.y
            float r4 = r6._zoom
            r41 = r0
            r42 = r1
            r44 = r50
            r45 = r52
            r46 = r3
            r47 = r2
            r48 = r4
            r39.drawPolyfillNumbers(r40, r41, r42, r43, r44, r45, r46, r47, r48)
            goto Ld84
        Ld75:
            r15 = r2
            r12 = r5
            r9 = r59
            r65 = r60
            r14 = r61
            r66 = r62
            r13 = r64
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
        Ld84:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            boolean r0 = r0.getIsShowingFigureIDs()
            if (r0 == 0) goto Ldfc
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto Le0b
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getMode()
            if (r0 != 0) goto Le0b
            boolean r0 = r71.isDrawing()
            if (r0 != 0) goto Lda6
            r71.begin()
        Lda6:
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r6._drawOrderBitmapFont
            r0.setColor(r7, r7, r7, r7)
            r0 = 0
        Ldac:
            if (r0 >= r13) goto Le0b
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r6._figuresRef
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            float r3 = r2.getX()
            com.badlogic.gdx.math.Vector2 r4 = r6._zoomPosition
            float r4 = r4.x
            float r3 = r3 - r4
            float r4 = r6._zoom
            float r4 = r4 - r7
            float r3 = r3 * r4
            float r4 = r2.getY()
            com.badlogic.gdx.math.Vector2 r5 = r6._zoomPosition
            float r5 = r5.y
            float r4 = r4 - r5
            float r5 = r6._zoom
            float r5 = r5 - r7
            float r4 = r4 * r5
            float r5 = r2.getX()
            float r5 = r5 + r50
            float r5 = r5 + r3
            r3 = 1092616192(0x41200000, float:10.0)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r10 * r3
            float r5 = r5 + r10
            float r3 = r2.getY()
            float r3 = r3 + r52
            float r3 = r3 + r4
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r58
            float r3 = r3 + r4
            com.badlogic.gdx.graphics.g2d.BitmapFont r4 = r6._drawOrderBitmapFont
            int r2 = r2.getID()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.draw(r15, r2, r5, r3)
            int r0 = r0 + 1
            goto Ldac
        Ldfc:
            r1 = 1
            goto Le0b
        Ldfe:
            r9 = r10
            r65 = r12
            r66 = r14
            r1 = 1
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r12 = r11
            r14 = r13
            r13 = r15
            r15 = r2
        Le0b:
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r6._textfieldBoxesRef
            if (r0 != 0) goto Le11
            r0 = 0
            goto Le15
        Le11:
            int r0 = r0.size()
        Le15:
            if (r0 <= 0) goto Lf4c
            boolean r2 = r71.isDrawing()
            if (r2 != 0) goto Le20
            r71.begin()
        Le20:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r6._textfieldBoxDFShaderRef
            r15.setShader(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getMode()
            r3 = 3
            if (r2 != r3) goto Lebf
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r6._playingFrameCamera
            boolean r2 = r2.isWidescreen()
            if (r2 == 0) goto Le3e
            org.fortheloss.sticknodes.data.ProjectData r2 = r6._projectDataRef
            boolean r2 = r2.isYoutubeShorts
            if (r2 != 0) goto Le3e
            r2 = 0
            goto Le3f
        Le3e:
            r2 = 1
        Le3f:
            float r4 = r50 + r53
            float r5 = r52 + r56
            float r10 = r7 / r55
            float r16 = r10 * r36
            r11 = 0
        Le48:
            if (r11 >= r0) goto Leb0
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r10 = r6._textfieldBoxesRef
            java.lang.Object r10 = r10.get(r11)
            org.fortheloss.sticknodes.TextfieldBox r10 = (org.fortheloss.sticknodes.TextfieldBox) r10
            if (r2 != 0) goto Le6e
            boolean r19 = r10.getDrawAboveWidescreenBars()
            if (r19 == 0) goto Le6e
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r1 = r6._textfieldsAboveWidescreenRef
            r1.add(r10)
            r72 = r5
            r59 = r9
            r17 = r11
            r67 = r12
            r68 = r13
            r69 = r14
            r5 = r15
            r1 = 0
            goto Le9d
        Le6e:
            r71.flush()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r6._textfieldBoxDFShaderRef
            r19 = 0
            r22 = 0
            boolean r3 = r6._drawTweenedTextfieldBoxes
            r7 = r10
            r10 = 771(0x303, float:1.08E-42)
            r8 = r71
            r59 = r9
            r9 = r1
            r1 = 0
            r10 = r4
            r17 = r11
            r11 = r5
            r67 = r12
            r12 = r19
            r68 = r13
            r13 = r22
            r72 = r5
            r69 = r14
            r5 = 1
            r14 = r16
            r5 = r15
            r15 = r3
            r7.draw(r8, r9, r10, r11, r12, r13, r14, r15)
            r71.flush()
        Le9d:
            int r11 = r17 + 1
            r15 = r5
            r9 = r59
            r12 = r67
            r13 = r68
            r14 = r69
            r1 = 1
            r3 = 3
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r5 = r72
            goto Le48
        Leb0:
            r72 = r5
            r59 = r9
            r67 = r12
            r68 = r13
            r69 = r14
            r5 = r15
            r1 = 0
            r2 = r72
            goto Lef7
        Lebf:
            r59 = r9
            r67 = r12
            r68 = r13
            r69 = r14
            r5 = r15
            r1 = 0
            r2 = 0
        Leca:
            if (r2 >= r0) goto Lef3
            r71.flush()
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r3 = r6._textfieldBoxesRef
            java.lang.Object r3 = r3.get(r2)
            r7 = r3
            org.fortheloss.sticknodes.TextfieldBox r7 = (org.fortheloss.sticknodes.TextfieldBox) r7
            com.badlogic.gdx.graphics.glutils.ShaderProgram r9 = r6._textfieldBoxDFShaderRef
            com.badlogic.gdx.math.Vector2 r3 = r6._zoomPosition
            float r12 = r3.x
            float r13 = r3.y
            float r14 = r6._zoom
            boolean r15 = r6._drawTweenedTextfieldBoxes
            r8 = r71
            r10 = r50
            r11 = r52
            r7.draw(r8, r9, r10, r11, r12, r13, r14, r15)
            r71.flush()
            int r2 = r2 + 1
            goto Leca
        Lef3:
            r4 = r50
            r2 = r52
        Lef7:
            r3 = 0
            r5.setShader(r3)
            r71.end()
            org.fortheloss.sticknodes.data.SessionData r7 = r6._sessionDataRef
            int r7 = r7.getMode()
            if (r7 != 0) goto Lf57
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r7 = r6._textfieldBoxesRef
            if (r7 == 0) goto Lf57
            r71.begin()
            r15 = 1065353216(0x3f800000, float:1.0)
            r5.setColor(r15, r15, r15, r15)
            r14 = 0
        Lf13:
            if (r14 >= r0) goto Lf48
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r7 = r6._textfieldBoxesRef
            java.lang.Object r7 = r7.get(r14)
            org.fortheloss.sticknodes.TextfieldBox r7 = (org.fortheloss.sticknodes.TextfieldBox) r7
            org.fortheloss.sticknodes.data.SessionData r8 = r6._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r8 = r8.getCurrentlySelectedTextfieldBox()
            if (r7 != r8) goto Lf28
            r46 = 1
            goto Lf2a
        Lf28:
            r46 = 0
        Lf2a:
            com.badlogic.gdx.math.Vector2 r8 = r6._zoomPosition
            float r9 = r8.x
            float r8 = r8.y
            float r10 = r6._zoom
            r47 = 0
            r39 = r7
            r40 = r59
            r41 = r4
            r42 = r2
            r43 = r9
            r44 = r8
            r45 = r10
            r39.drawOutline(r40, r41, r42, r43, r44, r45, r46, r47)
            int r14 = r14 + 1
            goto Lf13
        Lf48:
            r71.end()
            goto Lf59
        Lf4c:
            r59 = r9
            r67 = r12
            r68 = r13
            r69 = r14
            r5 = r15
            r1 = 0
            r3 = 0
        Lf57:
            r15 = 1065353216(0x3f800000, float:1.0)
        Lf59:
            boolean r0 = r71.isDrawing()
            if (r0 == 0) goto Lf62
            r71.end()
        Lf62:
            if (r57 == 0) goto Lf8a
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r2 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r2 = r2.idt()
            r0.setTransformMatrix(r2)
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r0 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r0 = r0.idt()
            r5.setTransformMatrix(r0)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r0 = r6._filterBundle
            r4 = 0
            r0.setIsUsingRotatedTransformationMatrix(r4)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r0 = r6._filterBundle
            r0.setTransformationRotationDeg(r1)
            goto Lf8b
        Lf8a:
            r4 = 0
        Lf8b:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            boolean r0 = r0.getIsNormalOnionSkin()
            if (r0 != 0) goto L12c6
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            r2 = 1
            if (r0 == r2) goto L12c6
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getMode()
            r14 = 3
            if (r0 == r14) goto L12c6
            if (r20 == 0) goto L1017
            r0 = 771(0x303, float:1.08E-42)
            r5.setBlendFunction(r2, r0)
            r71.begin()
            r0 = 1047904911(0x3e75c28f, float:0.24)
            r5.setColor(r0, r0, r0, r0)
            boolean r0 = r6._flagPreviousOnionSkinBlank
            if (r0 != 0) goto Lfe2
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r6._previousOnionSkinFrameBuffer
            com.badlogic.gdx.graphics.GLTexture r0 = r0.getColorBufferTexture()
            r8 = r0
            com.badlogic.gdx.graphics.Texture r8 = (com.badlogic.gdx.graphics.Texture) r8
            float r9 = r70.getX()
            float r10 = r70.getY()
            float r11 = r70.getWidth()
            float r12 = r70.getHeight()
            r13 = 0
            r0 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r16 = 1065353216(0x3f800000, float:1.0)
            r7 = r71
            r14 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r15 = r2
            r7.draw(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto Lfe4
        Lfe2:
            r0 = 1065353216(0x3f800000, float:1.0)
        Lfe4:
            boolean r2 = r6._flagNextOnionSkinBlank
            if (r2 != 0) goto L100c
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r6._nextOnionSkinFrameBuffer
            com.badlogic.gdx.graphics.GLTexture r2 = r2.getColorBufferTexture()
            r8 = r2
            com.badlogic.gdx.graphics.Texture r8 = (com.badlogic.gdx.graphics.Texture) r8
            float r9 = r70.getX()
            float r10 = r70.getY()
            float r11 = r70.getWidth()
            float r12 = r70.getHeight()
            r13 = 0
            r14 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = 1065353216(0x3f800000, float:1.0)
            r7 = r71
            r7.draw(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L100c:
            r71.end()
            r2 = 770(0x302, float:1.079E-42)
            r7 = 771(0x303, float:1.08E-42)
            r5.setBlendFunction(r2, r7)
            goto L1019
        L1017:
            r0 = 1065353216(0x3f800000, float:1.0)
        L1019:
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getMode()
            if (r2 != 0) goto L12bd
            r14 = r68
            if (r14 <= 0) goto L12bd
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            boolean r29 = r2.getIsOnlyDrawingMainNodes()
            r71.begin()
            r5.setColor(r0, r0, r0, r0)
            r2 = 0
        L1032:
            if (r2 >= r14) goto L10b1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r6._figuresRef
            java.lang.Object r7 = r7.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r7
            boolean r8 = r6._isWaitingForUserToChooseFigure
            if (r8 == 0) goto L1051
            boolean r8 = r6._isWaitingForUserToChooseFigureAllowMCs
            if (r8 != 0) goto L1051
            boolean r8 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r8 != 0) goto L1051
            r9 = r65
            r8 = r66
            r10 = r67
            r12 = r69
            goto L10a6
        L1051:
            r8 = r66
            r9 = r65
            r10 = r67
            if (r7 == r8) goto L1061
            if (r7 == r9) goto L1061
            if (r7 != r10) goto L105e
            goto L1061
        L105e:
            r47 = 0
            goto L1063
        L1061:
            r47 = 1
        L1063:
            org.fortheloss.sticknodes.data.SessionData r11 = r6._sessionDataRef
            boolean r11 = r11.getAlwaysShowCurrentFigureNodes()
            if (r11 == 0) goto L1085
            if (r47 == 0) goto L1071
            r12 = r69
            r11 = 0
            goto L1075
        L1071:
            r11 = r29
            r12 = r69
        L1075:
            boolean r13 = r12 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r13 == 0) goto L1082
            org.fortheloss.sticknodes.stickfigure.StickNode r13 = r7.getJoinedToNode()
            if (r13 != r12) goto L1082
            r49 = 0
            goto L1089
        L1082:
            r49 = r11
            goto L1089
        L1085:
            r12 = r69
            r49 = r29
        L1089:
            com.badlogic.gdx.math.Vector2 r11 = r6._zoomPosition
            float r13 = r11.x
            float r11 = r11.y
            float r15 = r6._zoom
            r46 = 0
            r39 = r7
            r40 = r59
            r41 = r50
            r42 = r52
            r43 = r13
            r44 = r11
            r45 = r15
            r48 = r12
            r39.drawNodes(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
        L10a6:
            int r2 = r2 + 1
            r66 = r8
            r65 = r9
            r67 = r10
            r69 = r12
            goto L1032
        L10b1:
            r9 = r65
            r8 = r66
            r10 = r67
            r12 = r69
            if (r29 == 0) goto L10c6
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            boolean r2 = r2.getAlwaysShowCurrentFigureNodes()
            if (r2 == 0) goto L10c4
            goto L10c6
        L10c4:
            r14 = 0
            goto L10c7
        L10c6:
            r14 = 1
        L10c7:
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            boolean r2 = r2.getIsShowingNeighborNodes()
            if (r2 == 0) goto L1161
            if (r14 == 0) goto L1161
            if (r12 == 0) goto L1161
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            boolean r48 = r2.getNeighborNodesAffectedByJoins()
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getScreen()
            r7 = 1
            if (r2 != r7) goto L10f5
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            boolean r2 = r2.getIsShowingCreationStaticNodes()
            if (r2 == 0) goto L10f5
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r6._createToolsModuleRef
            boolean r2 = r2.userIsTestingSmartStretch()
            if (r2 != 0) goto L10f5
            r46 = 1
            goto L10f7
        L10f5:
            r46 = 0
        L10f7:
            if (r8 == 0) goto L111b
            boolean r2 = r12 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r2 == 0) goto L111b
            com.badlogic.gdx.math.Vector2 r2 = r6._zoomPosition
            float r9 = r2.x
            float r2 = r2.y
            float r10 = r6._zoom
            r47 = r12
            org.fortheloss.sticknodes.stickfigure.StickNode r47 = (org.fortheloss.sticknodes.stickfigure.StickNode) r47
            r39 = r8
            r40 = r59
            r41 = r50
            r42 = r52
            r43 = r9
            r44 = r2
            r45 = r10
            r39.highlightChildrenAndParentNodes(r40, r41, r42, r43, r44, r45, r46, r47, r48)
            goto L1162
        L111b:
            if (r10 == 0) goto L113d
            boolean r2 = r12 instanceof org.fortheloss.sticknodes.sprite.SpriteNode
            if (r2 == 0) goto L113d
            com.badlogic.gdx.math.Vector2 r2 = r6._zoomPosition
            float r8 = r2.x
            float r2 = r2.y
            float r9 = r6._zoom
            r21 = r10
            r22 = r59
            r23 = r50
            r24 = r52
            r25 = r8
            r26 = r2
            r27 = r9
            r28 = r29
            r21.highlightNodes(r22, r23, r24, r25, r26, r27, r28)
            goto L1162
        L113d:
            if (r9 == 0) goto L1162
            boolean r2 = r12 instanceof org.fortheloss.sticknodes.movieclip.MCNode
            if (r2 == 0) goto L1162
            com.badlogic.gdx.math.Vector2 r2 = r6._zoomPosition
            float r8 = r2.x
            float r2 = r2.y
            float r10 = r6._zoom
            r28 = r12
            org.fortheloss.sticknodes.movieclip.MCNode r28 = (org.fortheloss.sticknodes.movieclip.MCNode) r28
            r21 = r9
            r22 = r59
            r23 = r50
            r24 = r52
            r25 = r8
            r26 = r2
            r27 = r10
            r21.highlightNodes(r22, r23, r24, r25, r26, r27, r28, r29)
            goto L1162
        L1161:
            r7 = 1
        L1162:
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getScreen()
            if (r2 != 0) goto L117a
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r6._animateToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = r2.getFigureToJoin()
            if (r2 == 0) goto L117a
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r6._animateToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = r2.getFigureToJoin()
            r8 = 2
            goto L1193
        L117a:
            org.fortheloss.sticknodes.data.SessionData r2 = r6._sessionDataRef
            int r2 = r2.getScreen()
            r8 = 2
            if (r2 != r8) goto L1192
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r6._movieclipToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = r2.getFigureToJoin()
            if (r2 == 0) goto L1192
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r6._movieclipToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = r2.getFigureToJoin()
            goto L1193
        L1192:
            r2 = r3
        L1193:
            if (r2 == 0) goto L1215
            org.fortheloss.sticknodes.data.SessionData r9 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r9 = r9.getCurrentlySelectedNode()
            boolean r9 = r9 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r9 == 0) goto L1215
            org.fortheloss.sticknodes.data.SessionData r9 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r9 = r9.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = (org.fortheloss.sticknodes.stickfigure.StickNode) r9
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = r9.getStickfigure()
            if (r10 == r2) goto L1215
            float r10 = r2.getX()
            com.badlogic.gdx.math.Vector2 r11 = r6._zoomPosition
            float r11 = r11.x
            float r10 = r10 - r11
            float r11 = r6._zoom
            float r11 = r11 - r0
            float r10 = r10 * r11
            float r11 = r2.getY()
            com.badlogic.gdx.math.Vector2 r12 = r6._zoomPosition
            float r12 = r12.y
            float r11 = r11 - r12
            float r12 = r6._zoom
            float r12 = r12 - r0
            float r11 = r11 * r12
            float r12 = r2.getX()
            float r12 = r12 + r50
            float r15 = r12 + r10
            float r2 = r2.getY()
            float r2 = r2 + r52
            float r16 = r2 + r11
            float r2 = r9.getGlobalX()
            com.badlogic.gdx.math.Vector2 r10 = r6._zoomPosition
            float r10 = r10.x
            float r2 = r2 - r10
            float r10 = r6._zoom
            float r10 = r10 - r0
            float r2 = r2 * r10
            float r10 = r9.getGlobalY()
            com.badlogic.gdx.math.Vector2 r11 = r6._zoomPosition
            float r11 = r11.y
            float r10 = r10 - r11
            float r11 = r6._zoom
            float r11 = r11 - r0
            float r10 = r10 * r11
            float r11 = r9.getGlobalX()
            float r11 = r11 + r50
            float r17 = r11 + r2
            float r2 = r9.getGlobalY()
            float r2 = r2 + r52
            float r18 = r2 + r10
            r2 = r59
            r9 = 26
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r13 = r2.getNode(r9)
            com.badlogic.gdx.graphics.g2d.Batch r14 = r2.getBatch()
            r13.drawDashedLine(r14, r15, r16, r17, r18)
            goto L1217
        L1215:
            r2 = r59
        L1217:
            com.badlogic.gdx.math.Vector2 r9 = r6._lockedNodeDragOffsetAccumulation
            float r10 = r9.x
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 != 0) goto L1228
            float r9 = r9.y
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 == 0) goto L1226
            goto L1228
        L1226:
            r14 = 0
            goto L1229
        L1228:
            r14 = 1
        L1229:
            if (r14 == 0) goto L12a0
            org.fortheloss.sticknodes.stickfigure.INode r9 = r6._draggedNodeRef
            boolean r10 = r9 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r10 == 0) goto L12a0
            boolean r10 = r6._isActiveDragging
            if (r10 == 0) goto L12a0
            boolean r9 = r9.isMainNode()
            if (r9 != 0) goto L12a0
            float r9 = r6._zoom
            float r9 = r9 - r0
            com.badlogic.gdx.math.Vector2 r10 = r6._nodeDragParentInitialPosition
            float r11 = r10.x
            float r12 = r11 + r50
            com.badlogic.gdx.math.Vector2 r13 = r6._zoomPosition
            float r14 = r13.x
            float r11 = r11 - r14
            float r11 = r11 * r9
            float r12 = r12 + r11
            float r10 = r10.y
            float r11 = r10 + r52
            float r13 = r13.y
            float r10 = r10 - r13
            float r10 = r10 * r9
            float r11 = r11 + r10
            org.fortheloss.sticknodes.stickfigure.INode r10 = r6._draggedNodeRef
            float r10 = r10.getGlobalX()
            float r10 = r10 + r50
            org.fortheloss.sticknodes.stickfigure.INode r13 = r6._draggedNodeRef
            float r13 = r13.getGlobalX()
            com.badlogic.gdx.math.Vector2 r14 = r6._zoomPosition
            float r14 = r14.x
            float r13 = r13 - r14
            float r13 = r13 * r9
            float r18 = r10 + r13
            org.fortheloss.sticknodes.stickfigure.INode r10 = r6._draggedNodeRef
            float r10 = r10.getGlobalY()
            float r10 = r10 + r52
            org.fortheloss.sticknodes.stickfigure.INode r13 = r6._draggedNodeRef
            float r13 = r13.getGlobalY()
            com.badlogic.gdx.math.Vector2 r14 = r6._zoomPosition
            float r14 = r14.y
            float r13 = r13 - r14
            float r13 = r13 * r9
            float r19 = r10 + r13
            r9 = 24
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r14 = r2.getNode(r9)
            com.badlogic.gdx.graphics.g2d.Batch r15 = r2.getBatch()
            r16 = r12
            r17 = r11
            r14.drawDashedLine(r15, r16, r17, r18, r19)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r9 = r2.getNode(r4)
            com.badlogic.gdx.graphics.g2d.Batch r10 = r2.getBatch()
            r9.drawNode(r10, r12, r11, r0)
        L12a0:
            org.fortheloss.sticknodes.data.SessionData r9 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r9 = r9.getCurrentlySelectedNode()
            r10 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r0 = r70
            r11 = 0
            r1 = r9
            r14 = r3
            r3 = r50
            r9 = 0
            r4 = r52
            r13 = r5
            r12 = 1
            r5 = r10
            r0.drawDragLockNodeMaybe(r1, r2, r3, r4, r5)
            r71.end()
            goto L12cc
        L12bd:
            r14 = r3
            r13 = r5
            r8 = 2
            r9 = 0
            r11 = 0
            r12 = 1
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L12cc
        L12c6:
            r14 = r3
            r13 = r5
            r8 = 2
            r9 = 0
            r11 = 0
            r12 = 1
        L12cc:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getMode()
            r1 = 3
            if (r0 == r1) goto L164d
            float r0 = r70.getWidth()
            float r2 = r6._zoom
            float r0 = r0 * r2
            float r2 = r70.getHeight()
            float r3 = r6._zoom
            float r2 = r2 * r3
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRendererRef
            boolean r3 = r3.isDrawing()
            if (r3 != 0) goto L12f4
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r4 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line
            r3.begin(r4)
        L12f4:
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            int r3 = r3.getScreen()
            if (r3 != r8) goto L1338
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRendererRef
            com.badlogic.gdx.graphics.Color r4 = org.fortheloss.sticknodes.App.COLOR_DARK_GRAY
            r3.setColor(r4)
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRendererRef
            float r4 = r70.getX()
            float r5 = r70.getX()
            float r5 = r50 - r5
            float r7 = r6._zoom
            float r5 = r5 * r7
            float r4 = r4 + r5
            float r5 = r70.getWidth()
            float r5 = r5 * r37
            float r4 = r4 + r5
            float r5 = r70.getY()
            float r7 = r70.getY()
            float r7 = r52 - r7
            float r10 = r6._zoom
            float r7 = r7 * r10
            float r5 = r5 + r7
            float r7 = r70.getHeight()
            float r7 = r7 * r37
            float r5 = r5 + r7
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r58
            r3.x(r4, r5, r7)
        L1338:
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            int r3 = r3.getScreen()
            if (r3 == r8) goto L13a1
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            boolean r3 = r3.getIsShowingStageBox()
            if (r3 == 0) goto L13a1
            float r3 = r6._zoom
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 != 0) goto L135e
            float r3 = r70.getX()
            int r3 = (r50 > r3 ? 1 : (r50 == r3 ? 0 : -1))
            if (r3 != 0) goto L135e
            float r3 = r70.getY()
            int r3 = (r52 > r3 ? 1 : (r52 == r3 ? 0 : -1))
            if (r3 == 0) goto L13a1
        L135e:
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRendererRef
            float r4 = r70.getX()
            float r5 = r70.getX()
            float r5 = r50 - r5
            float r7 = r6._zoom
            float r5 = r5 * r7
            float r4 = r4 + r5
            float r5 = r70.getWidth()
            float r5 = r5 - r0
            float r5 = r5 * r37
            float r17 = r4 + r5
            float r4 = r70.getY()
            float r5 = r70.getY()
            float r5 = r52 - r5
            float r7 = r6._zoom
            float r5 = r5 * r7
            float r4 = r4 + r5
            float r5 = r70.getHeight()
            float r5 = r5 - r2
            float r5 = r5 * r37
            float r18 = r4 + r5
            float r19 = r0 + r15
            float r20 = r2 + r15
            com.badlogic.gdx.graphics.Color r23 = com.badlogic.gdx.graphics.Color.WHITE
            com.badlogic.gdx.graphics.Color r24 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY
            r16 = r3
            r21 = r23
            r22 = r24
            r16.rect(r17, r18, r19, r20, r21, r22, r23, r24)
        L13a1:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 == r12) goto L14ce
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 != 0) goto L13ce
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r7 = r0.getFrameCamera()
            float r0 = r7.getCameraScale()
            float r2 = r7.getCameraOffsetX()
            float r3 = r7.getCameraOffsetY()
            float r4 = r7.getCameraRotationDeg()
            goto L13e6
        L13ce:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r6._movieclipToolsModuleRef
            float r0 = r0.getPreviewZoom()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r6._movieclipToolsModuleRef
            com.badlogic.gdx.math.Vector2 r2 = r2.getPreviewZoomPosition()
            float r2 = r2.x
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3 = r6._movieclipToolsModuleRef
            com.badlogic.gdx.math.Vector2 r3 = r3.getPreviewZoomPosition()
            float r3 = r3.y
            r7 = r14
            r4 = 0
        L13e6:
            float r5 = r70.getWidth()
            float r5 = r5 * r0
            float r10 = r6._zoom
            float r19 = r5 * r10
            float r5 = r70.getHeight()
            float r5 = r5 * r0
            float r10 = r6._zoom
            float r20 = r5 * r10
            float r5 = r70.getX()
            float r2 = r2 + r50
            float r10 = r70.getX()
            float r2 = r2 - r10
            float r10 = r6._zoom
            float r2 = r2 * r10
            float r5 = r5 + r2
            float r2 = r70.getWidth()
            float r10 = r6._zoom
            float r10 = r10 - r15
            float r2 = r2 * r10
            float r2 = r2 * r37
            float r22 = r5 - r2
            float r2 = r70.getY()
            float r3 = r3 + r52
            float r5 = r70.getY()
            float r3 = r3 - r5
            float r5 = r6._zoom
            float r3 = r3 * r5
            float r2 = r2 + r3
            float r3 = r70.getHeight()
            float r5 = r6._zoom
            float r5 = r5 - r15
            float r3 = r3 * r5
            float r3 = r3 * r37
            float r23 = r2 - r3
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 == 0) goto L1463
            float r3 = r19 * r37
            float r3 = r22 + r3
            float r5 = r20 * r37
            float r5 = r23 + r5
            org.fortheloss.sticknodes.SNShapeRenderer r10 = r6._shapeRendererRef
            r10.end()
            org.fortheloss.sticknodes.SNShapeRenderer r10 = r6._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r9 = r10.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r9 = r9.translate(r3, r5, r11)
            com.badlogic.gdx.math.Matrix4 r4 = r9.rotate(r11, r11, r15, r4)
            float r3 = -r3
            float r5 = -r5
            com.badlogic.gdx.math.Matrix4 r3 = r4.translate(r3, r5, r11)
            r10.setTransformMatrix(r3)
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r4 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line
            r3.begin(r4)
        L1463:
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            int r3 = r3.getScreen()
            if (r3 != 0) goto L14a0
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            int r3 = r3.getMode()
            if (r3 == r12) goto L14a0
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRendererRef
            float r4 = r6._zoom
            float r21 = r0 * r4
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getMode()
            if (r0 != r8) goto L1483
            r0 = 1
            goto L1484
        L1483:
            r0 = 0
        L1484:
            boolean r4 = r7.isAutoCamera()
            boolean r24 = r7.isWidescreen()
            org.fortheloss.sticknodes.data.ProjectData r5 = r6._projectDataRef
            boolean r5 = r5.isYoutubeShorts
            r16 = r3
            r17 = r22
            r18 = r23
            r22 = r0
            r23 = r4
            r25 = r5
            org.fortheloss.sticknodes.animationscreen.FrameCamera.draw(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L14b3
        L14a0:
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            float r24 = r19 + r15
            float r25 = r20 + r15
            com.badlogic.gdx.graphics.Color r28 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY
            com.badlogic.gdx.graphics.Color r29 = com.badlogic.gdx.graphics.Color.DARK_GRAY
            r21 = r0
            r26 = r28
            r27 = r29
            r21.rect(r22, r23, r24, r25, r26, r27, r28, r29)
        L14b3:
            if (r2 == 0) goto L14ce
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            r0.end()
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r2 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r2 = r2.idt()
            r0.setTransformMatrix(r2)
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r2 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line
            r0.begin(r2)
        L14ce:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            boolean r0 = r0.getIsShowingGuides()
            if (r0 == 0) goto L1739
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            boolean r0 = r0.isDrawing()
            if (r0 != 0) goto L14e5
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r2 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line
            r0.begin(r2)
        L14e5:
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            com.badlogic.gdx.graphics.Color r2 = com.badlogic.gdx.graphics.Color.ORANGE
            r0.setColor(r2)
            r0 = 1115684864(0x42800000, float:64.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r0
            int r0 = (int) r3
            int r3 = r0 / 2
            float r0 = (float) r0
            r4 = 1048576000(0x3e800000, float:0.25)
            float r4 = r4 * r0
            float r5 = r70.getY()
            float r7 = r6._guidelineY
            float r7 = r7 + r52
            float r8 = r70.getY()
            float r7 = r7 - r8
            float r8 = r6._zoom
            float r7 = r7 * r8
            float r5 = r5 + r7
            float r7 = r70.getHeight()
            float r8 = r6._zoom
            float r8 = r8 - r15
            float r7 = r7 * r8
            float r7 = r7 * r37
            float r5 = r5 - r7
            int r5 = (int) r5
            float r5 = (float) r5
            org.fortheloss.sticknodes.SNShapeRenderer r7 = r6._shapeRendererRef
            float r8 = r70.getX()
            float r17 = r8 + r0
            float r8 = r70.getX()
            float r9 = r70.getWidth()
            float r19 = r8 + r9
            com.badlogic.gdx.graphics.Color r8 = com.badlogic.gdx.graphics.Color.GREEN
            r16 = r7
            r18 = r5
            r20 = r5
            r21 = r2
            r22 = r8
            r16.line(r17, r18, r19, r20, r21, r22)
            org.fortheloss.sticknodes.SNShapeRenderer r7 = r6._shapeRendererRef
            float r9 = r70.getX()
            r7.circle(r9, r5, r0)
            org.fortheloss.sticknodes.SNShapeRenderer r7 = r6._shapeRendererRef
            float r9 = r70.getX()
            r10 = 1053609165(0x3ecccccd, float:0.4)
            float r10 = r10 * r0
            float r17 = r9 + r10
            float r3 = (float) r3
            float r18 = r5 + r3
            float r9 = r70.getX()
            r11 = 1045220557(0x3e4ccccd, float:0.2)
            float r11 = r11 * r0
            float r19 = r9 + r11
            float r22 = r5 + r4
            float r9 = r70.getX()
            r16 = 1058642330(0x3f19999a, float:0.6)
            float r23 = r0 * r16
            float r21 = r9 + r23
            r16 = r7
            r20 = r22
            r16.triangleLine(r17, r18, r19, r20, r21, r22)
            org.fortheloss.sticknodes.SNShapeRenderer r7 = r6._shapeRendererRef
            float r9 = r70.getX()
            float r40 = r9 + r10
            float r41 = r5 - r3
            float r9 = r70.getX()
            float r42 = r9 + r11
            float r45 = r5 - r4
            float r5 = r70.getX()
            float r44 = r5 + r23
            r39 = r7
            r43 = r45
            r39.triangleLine(r40, r41, r42, r43, r44, r45)
            float r5 = r70.getX()
            float r7 = r6._guidelineX
            float r7 = r7 + r50
            float r9 = r70.getX()
            float r7 = r7 - r9
            float r9 = r6._zoom
            float r7 = r7 * r9
            float r5 = r5 + r7
            float r7 = r70.getWidth()
            float r9 = r6._zoom
            float r9 = r9 - r15
            float r7 = r7 * r9
            float r7 = r7 * r37
            float r5 = r5 - r7
            int r5 = (int) r5
            float r5 = (float) r5
            float r7 = r70.getY()
            float r9 = r70.getHeight()
            float r7 = r7 + r9
            org.fortheloss.sticknodes.SNShapeRenderer r9 = r6._shapeRendererRef
            float r18 = r7 - r0
            float r16 = r70.getY()
            float r20 = r16 + r0
            r16 = r9
            r17 = r5
            r19 = r5
            r21 = r8
            r22 = r2
            r16.line(r17, r18, r19, r20, r21, r22)
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r6._shapeRendererRef
            float r9 = r70.getY()
            r2.circle(r5, r9, r0)
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r6._shapeRendererRef
            float r9 = r5 + r3
            float r16 = r70.getY()
            float r18 = r16 + r10
            float r24 = r5 + r4
            float r16 = r70.getY()
            float r20 = r16 + r11
            float r16 = r70.getY()
            float r22 = r16 + r23
            r16 = r2
            r17 = r9
            r19 = r24
            r21 = r24
            r16.triangleLine(r17, r18, r19, r20, r21, r22)
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r6._shapeRendererRef
            float r3 = r5 - r3
            float r16 = r70.getY()
            float r41 = r16 + r10
            float r4 = r5 - r4
            float r16 = r70.getY()
            float r43 = r16 + r11
            float r16 = r70.getY()
            float r45 = r16 + r23
            r39 = r2
            r40 = r3
            r42 = r4
            r44 = r4
            r39.triangleLine(r40, r41, r42, r43, r44, r45)
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r6._shapeRendererRef
            r2.setColor(r8)
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r6._shapeRendererRef
            r2.circle(r5, r7, r0)
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            float r2 = r7 - r10
            float r5 = r7 - r11
            float r7 = r7 - r23
            r16 = r0
            r18 = r2
            r20 = r5
            r22 = r7
            r16.triangleLine(r17, r18, r19, r20, r21, r22)
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            r16 = r0
            r17 = r3
            r19 = r4
            r21 = r4
            r16.triangleLine(r17, r18, r19, r20, r21, r22)
            goto L1739
        L164d:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 != 0) goto L1739
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            boolean r0 = r0.isWidescreen()
            if (r0 == 0) goto L1739
            org.fortheloss.sticknodes.data.ProjectData r0 = r6._projectDataRef
            boolean r0 = r0.isYoutubeShorts
            if (r0 != 0) goto L1739
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            boolean r0 = r0.isDrawing()
            if (r0 != 0) goto L167d
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r2 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r0.begin(r2)
            goto L1684
        L167d:
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r2 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r0.set(r2)
        L1684:
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r34 - r0
            r3 = 1082130432(0x40800000, float:4.0)
            float r4 = r32 + r3
            r5 = 1124335616(0x43040000, float:132.0)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r5
            float r7 = r7 * r36
            org.fortheloss.sticknodes.SNShapeRenderer r5 = r6._shapeRendererRef
            r5.setColor(r11, r11, r11, r15)
            org.fortheloss.sticknodes.SNShapeRenderer r5 = r6._shapeRendererRef
            float r8 = r35 - r0
            float r3 = r3 + r7
            r5.rect(r2, r8, r4, r3)
            org.fortheloss.sticknodes.SNShapeRenderer r3 = r6._shapeRendererRef
            float r5 = r35 + r33
            float r5 = r5 - r7
            float r7 = r7 + r0
            r3.rect(r2, r5, r4, r7)
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r6._textfieldsAboveWidescreenRef
            int r0 = r0.size()
            if (r0 <= 0) goto L1739
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r6._shapeRendererRef
            r2.end()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r6._playingFrameCamera
            float r2 = r2.getCameraRotationDeg()
            float r2 = -r2
            int r3 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r3 == 0) goto L16db
            float r3 = r34 + r38
            float r4 = r35 + r51
            com.badlogic.gdx.math.Matrix4 r5 = r71.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r5 = r5.translate(r3, r4, r11)
            com.badlogic.gdx.math.Matrix4 r2 = r5.rotate(r11, r11, r15, r2)
            float r3 = -r3
            float r4 = -r4
            com.badlogic.gdx.math.Matrix4 r2 = r2.translate(r3, r4, r11)
            r13.setTransformMatrix(r2)
        L16db:
            boolean r2 = r71.isDrawing()
            if (r2 != 0) goto L16e4
            r71.begin()
        L16e4:
            float r50 = r50 + r53
            float r52 = r52 + r56
            float r10 = r15 / r55
            float r2 = r10 * r36
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r6._textfieldBoxDFShaderRef
            r13.setShader(r3)
            r3 = 0
        L16f2:
            if (r3 >= r0) goto L1723
            r71.flush()
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r4 = r6._textfieldsAboveWidescreenRef
            java.lang.Object r4 = r4.get(r3)
            r7 = r4
            org.fortheloss.sticknodes.TextfieldBox r7 = (org.fortheloss.sticknodes.TextfieldBox) r7
            com.badlogic.gdx.graphics.glutils.ShaderProgram r9 = r6._textfieldBoxDFShaderRef
            r4 = 0
            r5 = 0
            boolean r11 = r6._drawTweenedTextfieldBoxes
            r8 = r71
            r10 = r50
            r16 = r11
            r11 = r52
            r12 = r4
            r4 = r13
            r13 = r5
            r5 = r14
            r14 = r2
            r15 = r16
            r7.draw(r8, r9, r10, r11, r12, r13, r14, r15)
            r71.flush()
            int r3 = r3 + 1
            r13 = r4
            r14 = r5
            r12 = 1
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L16f2
        L1723:
            r4 = r13
            r5 = r14
            r4.setShader(r5)
            r71.end()
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r0 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r0 = r0.idt()
            r4.setTransformMatrix(r0)
            goto L173b
        L1739:
            r4 = r13
            r5 = r14
        L173b:
            if (r54 == 0) goto L174e
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r6._playingFrameCamera
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r6._figuresRef
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r3 = r6._textfieldBoxesRef
            boolean r7 = r6._drawTweenedTextfieldBoxes
            boolean r0 = r0.removeAppliedWobble(r2, r3, r7)
            if (r0 == 0) goto L174e
            r70.maybeUpdateJoinChains()
        L174e:
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            boolean r0 = r0.isDrawing()
            if (r0 == 0) goto L175b
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r6._shapeRendererRef
            r0.end()
        L175b:
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r6._textfieldsAboveWidescreenRef
            r0.clear()
            r71.begin()
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getMode()
            if (r0 != r1) goto L17bb
            org.fortheloss.sticknodes.data.ProjectData r0 = r6._projectDataRef
            boolean r0 = r0.watermarkEnabled
            if (r0 == 0) goto L17bb
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 != 0) goto L17bb
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r6._textfieldBoxDFShaderRef
            r4.setShader(r0)
            org.fortheloss.sticknodes.data.ProjectData r0 = r6._projectDataRef
            boolean r0 = r0.isYoutubeShorts
            if (r0 == 0) goto L17a6
            float r0 = r70.getHeight()
            float r1 = r70.getWidth()
            float r0 = r0 / r1
            float r34 = r34 + r38
            float r0 = r0 * r33
            float r0 = r0 * r37
            float r10 = r34 + r0
            org.fortheloss.sticknodes.TextfieldBox r7 = r6._watermarkText
            com.badlogic.gdx.graphics.glutils.ShaderProgram r9 = r6._textfieldBoxDFShaderRef
            float r11 = r35 + r33
            r12 = 0
            r13 = 0
            r15 = 0
            r8 = r71
            r14 = r36
            r7.draw(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L17b8
        L17a6:
            org.fortheloss.sticknodes.TextfieldBox r7 = r6._watermarkText
            com.badlogic.gdx.graphics.glutils.ShaderProgram r9 = r6._textfieldBoxDFShaderRef
            float r10 = r34 + r32
            float r11 = r35 + r33
            r12 = 0
            r13 = 0
            r15 = 0
            r8 = r71
            r14 = r36
            r7.draw(r8, r9, r10, r11, r12, r13, r14, r15)
        L17b8:
            r4.setShader(r5)
        L17bb:
            if (r30 == 0) goto L17ee
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r0 = r6._quickMenuTable
            float r0 = r0.getX()
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r1 = r6._quickMenuTable
            float r1 = r1.getY()
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r2 = r6._quickMenuTable
            float r3 = r70.getX()
            float r3 = r3 + r0
            float r5 = r70.getY()
            float r5 = r5 + r1
            r2.setPosition(r3, r5)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r2 = r6._quickMenuTable
            r3 = 1
            r2.setVisible(r3)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r2 = r6._quickMenuTable
            r5 = 1065353216(0x3f800000, float:1.0)
            r2.draw(r4, r5)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r2 = r6._quickMenuTable
            r2.setPosition(r0, r1)
            r71.flush()
            goto L17f1
        L17ee:
            r3 = 1
            r5 = 1065353216(0x3f800000, float:1.0)
        L17f1:
            if (r31 == 0) goto L1820
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0 = r6._quickResizeTool
            float r0 = r0.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r1 = r6._quickResizeTool
            float r1 = r1.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r2 = r6._quickResizeTool
            float r7 = r70.getX()
            float r7 = r7 + r0
            float r8 = r70.getY()
            float r8 = r8 + r1
            r2.setPosition(r7, r8)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r2 = r6._quickResizeTool
            r2.setVisible(r3)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r2 = r6._quickResizeTool
            r2.draw(r4, r5)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r2 = r6._quickResizeTool
            r2.setPosition(r0, r1)
            r71.flush()
        L1820:
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
        L1826:
            return
    }

    public void enableQuickResizeTool(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0 = r1._quickResizeTool
            r0.setEnabled(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r1.mQrtDocked
            r0.setEnabled(r2)
            r1.setNeedsToBeDrawn()
            return
    }

    public void enableQuickResizeToolDuringDrag(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0 = r1._quickResizeTool
            r0.setEnabledDuringDrag(r2)
            r1.setNeedsToBeDrawn()
            return
    }

    public void flagOnionSkinDirty() {
            r1 = this;
            r0 = 1
            r1._previousOnionSkinDirty = r0
            r1._nextOnionSkinDirty = r0
            r1.setNeedsToBeDrawn()
            return
    }

    public void flagTracingFBODirty() {
            r1 = this;
            r0 = 1
            r1._tracingFBODirty = r0
            r1.setNeedsToBeDrawn()
            return
    }

    public void flipFigureX(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7, boolean r8) {
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            boolean r0 = r7.isJoined()
            if (r0 != 0) goto La
            r8 = 0
        La:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            boolean r1 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r2 = 1
            if (r1 == 0) goto L4f
            r3 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r3
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r3.getMainNode()
            boolean r4 = r0 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction
            if (r4 == 0) goto L3b
            org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction) r0
            boolean r4 = r0.isFlipX()
            if (r4 == 0) goto L3b
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r0.getStickNode()
            if (r4 != r3) goto L3b
            boolean r0 = r0.isSpecialJoinFlip()
            if (r0 != r8) goto L3b
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            r0.removeLatestUserAction()
            goto Lbb
        L3b:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction> r4 = org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction.class
            java.lang.Object r0 = r0.getUserAction(r4)
            org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction) r0
            r0.initialize(r3, r2, r8)
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            r3.addUserAction(r0)
            goto Lbb
        L4f:
            boolean r3 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r3 == 0) goto L88
            r3 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = (org.fortheloss.sticknodes.sprite.SpriteRef) r3
            if (r8 == 0) goto L5b
            r4 = 23
            goto L5d
        L5b:
            r4 = 22
        L5d:
            boolean r5 = r0 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r5 == 0) goto L75
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            int r5 = r0.getLastChangedProperty()
            if (r5 != r4) goto L75
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getSpriteRef()
            if (r0 != r3) goto L75
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            r0.removeLatestUserAction()
            goto Lbb
        L75:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r5 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r5)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r0.initialize(r3, r4)
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            r3.addUserAction(r0)
            goto Lbb
        L88:
            r3 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r3 = (org.fortheloss.sticknodes.movieclip.MCReference) r3
            boolean r4 = r0 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction
            if (r4 == 0) goto La9
            org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction) r0
            boolean r4 = r0.isFlipX()
            if (r4 == 0) goto La9
            org.fortheloss.sticknodes.movieclip.MCReference r4 = r0.getMCRef()
            if (r4 != r3) goto La9
            boolean r0 = r0.isSpecialJoinFlip()
            if (r0 != r8) goto La9
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            r0.removeLatestUserAction()
            goto Lbb
        La9:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction> r4 = org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction.class
            java.lang.Object r0 = r0.getUserAction(r4)
            org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction) r0
            r0.initialize(r3, r2, r8)
            org.fortheloss.sticknodes.data.SessionData r3 = r6._sessionDataRef
            r3.addUserAction(r0)
        Lbb:
            r7.flipX(r8)
            r6.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 == r2) goto Ld1
            if (r1 == 0) goto Ld1
            r0 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r6.maybeUpdateJoinChain(r0)
        Ld1:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 == r2) goto Le7
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r6._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            r0.onFigureFlippedX(r7, r8)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r7 = r6._framesModuleRef
            r7.setNeedsToBeDrawn()
        Le7:
            return
    }

    public void flipFigureY(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6, boolean r7) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            boolean r0 = r6.isJoined()
            r1 = 0
            if (r0 != 0) goto Lb
            r7 = 0
        Lb:
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            boolean r2 = r6 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r2 == 0) goto L4f
            r3 = r6
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r3
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r3.getMainNode()
            boolean r4 = r0 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction
            if (r4 == 0) goto L3b
            org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction) r0
            boolean r4 = r0.isFlipX()
            if (r4 != 0) goto L3b
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r0.getStickNode()
            if (r4 != r3) goto L3b
            boolean r0 = r0.isSpecialJoinFlip()
            if (r0 != r7) goto L3b
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            r0.removeLatestUserAction()
            goto Lbb
        L3b:
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction> r4 = org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction.class
            java.lang.Object r0 = r0.getUserAction(r4)
            org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction) r0
            r0.initialize(r3, r1, r7)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto Lbb
        L4f:
            boolean r3 = r6 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r3 == 0) goto L88
            r1 = r6
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            if (r7 == 0) goto L5b
            r3 = 25
            goto L5d
        L5b:
            r3 = 24
        L5d:
            boolean r4 = r0 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r4 == 0) goto L75
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            int r4 = r0.getLastChangedProperty()
            if (r4 != r3) goto L75
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getSpriteRef()
            if (r0 != r1) goto L75
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            r0.removeLatestUserAction()
            goto Lbb
        L75:
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r4 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r4)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r0.initialize(r1, r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto Lbb
        L88:
            r3 = r6
            org.fortheloss.sticknodes.movieclip.MCReference r3 = (org.fortheloss.sticknodes.movieclip.MCReference) r3
            boolean r4 = r0 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction
            if (r4 == 0) goto La9
            org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction) r0
            boolean r4 = r0.isFlipX()
            if (r4 != 0) goto La9
            org.fortheloss.sticknodes.movieclip.MCReference r4 = r0.getMCRef()
            if (r4 != r3) goto La9
            boolean r0 = r0.isSpecialJoinFlip()
            if (r0 != r7) goto La9
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            r0.removeLatestUserAction()
            goto Lbb
        La9:
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction> r4 = org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction.class
            java.lang.Object r0 = r0.getUserAction(r4)
            org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction) r0
            r0.initialize(r3, r1, r7)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        Lbb:
            r6.flipY(r7)
            r5.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto Ld2
            if (r2 == 0) goto Ld2
            r0 = r6
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r5.maybeUpdateJoinChain(r0)
        Ld2:
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 == r1) goto Le8
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r5._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            r0.onFigureFlippedY(r6, r7)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r5._framesModuleRef
            r6.setNeedsToBeDrawn()
        Le8:
            return
    }

    public void flipSegmentX(org.fortheloss.sticknodes.stickfigure.StickNode r4, boolean r5) {
            r3 = this;
            if (r4 == 0) goto L72
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L72
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction
            r2 = 1
            if (r1 == 0) goto L28
            org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction) r0
            boolean r1 = r0.isFlipX()
            if (r1 == 0) goto L28
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getStickNode()
            if (r0 != r4) goto L28
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            r0.removeLatestUserAction()
            goto L3b
        L28:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction) r0
            r1 = 0
            r0.initialize(r4, r2, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            r1.addUserAction(r0)
        L3b:
            r4.flipX(r5)
            org.fortheloss.sticknodes.data.SessionData r5 = r3._sessionDataRef
            int r5 = r5.getScreen()
            if (r5 == r2) goto L4d
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r4.getStickfigure()
            r3.maybeUpdateJoinChain(r5)
        L4d:
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r5 = r3._sessionDataRef
            int r5 = r5.getScreen()
            if (r5 == r2) goto L72
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r3._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r5 = r5.getCurrentFrame()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r4.getStickfigure()
            int r0 = r0.getID()
            int r4 = r4.getDrawOrderIndex()
            r5.onStickNodeFlippedX(r0, r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModuleRef
            r4.setNeedsToBeDrawn()
        L72:
            return
    }

    public void flipSegmentY(org.fortheloss.sticknodes.stickfigure.StickNode r3, boolean r4) {
            r2 = this;
            if (r3 == 0) goto L72
            boolean r0 = r3.isMainNode()
            if (r0 == 0) goto L9
            goto L72
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction
            if (r1 == 0) goto L27
            org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction) r0
            boolean r1 = r0.isFlipX()
            if (r1 != 0) goto L27
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getStickNode()
            if (r0 != r3) goto L27
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            r0.removeLatestUserAction()
            goto L3a
        L27:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction) r0
            r1 = 0
            r0.initialize(r3, r1, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
        L3a:
            r3.flipY(r4)
            org.fortheloss.sticknodes.data.SessionData r4 = r2._sessionDataRef
            int r4 = r4.getScreen()
            r0 = 1
            if (r4 == r0) goto L4d
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r3.getStickfigure()
            r2.maybeUpdateJoinChain(r4)
        L4d:
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r4 = r2._sessionDataRef
            int r4 = r4.getScreen()
            if (r4 == r0) goto L72
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r4 = r4.getCurrentFrame()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3.getStickfigure()
            int r0 = r0.getID()
            int r3 = r3.getDrawOrderIndex()
            r4.onStickNodeFlippedY(r0, r3)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L72:
            return
    }

    public boolean getAndConsumeRedrawnFlag() {
            r2 = this;
            boolean r0 = r2._hasBeenRedrawnFlag
            r1 = 0
            r2._hasBeenRedrawnFlag = r1
            return r0
    }

    public boolean getDrawNodesOnTracedFbo() {
            r1 = this;
            boolean r0 = r1._drawNodesOnTracedFbo
            return r0
    }

    public org.fortheloss.sticknodes.animationscreen.FrameCamera getPlayingFrameCamera() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r1._playingFrameCamera
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.INode getSelectedNodeFromFigures(float r9, float r10, float r11) {
            r8 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto L13
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionDataRef
            boolean r0 = r0.getIsShowingCreationStaticNodes()
            if (r0 == 0) goto L13
            r6 = 1
            goto L15
        L13:
            r1 = 0
            r6 = 0
        L15:
            r7 = 0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            org.fortheloss.sticknodes.stickfigure.INode r9 = r2.getSelectedNodeFromFigures(r3, r4, r5, r6, r7)
            return r9
    }

    public com.badlogic.gdx.scenes.scene2d.Actor getTouchArea() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.mCanvasTouchArea
            return r0
    }

    public com.badlogic.gdx.graphics.glutils.FrameBuffer getTracingFBO() {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r1._tracingFrameBuffer
            return r0
    }

    public float getViewableCanvasMaxHeight() {
            r3 = this;
            float r0 = r3._viewableCanvasHeight
            float r1 = r3.getHeight()
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            float r0 = r0 - r1
            return r0
    }

    public float getViewableCanvasMaxWidth() {
            r3 = this;
            float r0 = r3._viewableCanvasWidth
            float r1 = r3.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            float r0 = r0 - r1
            return r0
    }

    public float getViewableCanvasMinHeight() {
            r2 = this;
            float r0 = r2.getHeight()
            float r0 = -r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            return r0
    }

    public float getViewableCanvasMinWidth() {
            r2 = this;
            float r0 = r2.getWidth()
            float r0 = -r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            return r0
    }

    public float getZoomPositionX() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1._zoomPosition
            float r0 = r0.x
            return r0
    }

    public float getZoomPositionY() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1._zoomPosition
            float r0 = r0.y
            return r0
    }

    public float getZoomedCanvasX(float r4) {
            r3 = this;
            float r0 = r3.getWidth()
            float r1 = r3._zoom
            float r0 = r0 / r1
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r2
            com.badlogic.gdx.math.Vector2 r2 = r3._zoomPosition
            float r2 = r2.x
            float r2 = r2 - r0
            float r4 = r4 / r1
            float r4 = r4 + r2
            return r4
    }

    public float getZoomedCanvasY(float r4) {
            r3 = this;
            float r0 = r3.getHeight()
            float r1 = r3._zoom
            float r0 = r0 / r1
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r2
            com.badlogic.gdx.math.Vector2 r2 = r3._zoomPosition
            float r2 = r2.y
            float r2 = r2 - r0
            float r4 = r4 / r1
            float r4 = r4 + r2
            return r4
    }

    public void hideArrows() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0 = r2._arrowsWindow
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 == 0) goto Ld
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0 = r2._arrowsWindow
            r0.remove()
        Ld:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            r1 = 0
            r0.setArrowsVisible(r1)
            return
    }

    public void hideMagnifier() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.Magnifier r0 = r2._magnifier
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 == 0) goto Ld
            org.fortheloss.sticknodes.animationscreen.Magnifier r0 = r2._magnifier
            r0.remove()
        Ld:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            r1 = 0
            r0.setMagnifierVisible(r1)
            return
    }

    public void hideQuickMenu(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r0 = r1._quickMenuTable
            if (r0 != 0) goto L5
            return
        L5:
            if (r2 == 0) goto L16
            r0.dispose()
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r2 = r1._quickMenuTable
            r2.remove()
            r2 = 0
            r1._quickMenuTable = r2
            r1.setNeedsToBeDrawn()
            goto L1d
        L16:
            r2 = 0
            r0.setVisible(r2)
            r1.setNeedsToBeDrawn()
        L1d:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.Module
    public void initialize(org.fortheloss.framework.Assets r28) {
            r27 = this;
            r7 = r27
            r8 = r28
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r9 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r10 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            super.initialize(r28)
            r7._assetsRef = r8
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r7.setTouchable(r0)
            java.lang.String r0 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r1 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            r11 = 0
            java.lang.Object r0 = r8.get(r0, r1, r11)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r7._textfieldBoxDFShaderRef = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedOutline
            r12 = 1
            java.lang.Object r0 = r8.get(r0, r9, r12)
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r0
            r7._drawOrderBitmapFont = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r7._animationScreenRef
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r0.getShapeRenderer()
            r7._shapeRendererRef = r0
            org.fortheloss.sticknodes.NodeDigger r0 = new org.fortheloss.sticknodes.NodeDigger
            r0.<init>()
            r7.mNodeDigger = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r7._dragOffset = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r7._lockedNodeDragOffsetAccumulation = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r7._nodeDragInitialPosition = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r7._nodeDragParentInitialPosition = r0
            org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode r0 = new org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode
            r0.<init>()
            r7._eventActionDragWithLockedNode = r0
            r27.calculateZoomFromZoomNotch()
            float r0 = r7._zoomGoal
            r7._zoom = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            float r1 = r27.getWidth()
            r13 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r13
            float r2 = r27.getHeight()
            float r2 = r2 * r13
            r0.<init>(r1, r2)
            r7._zoomPosition = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r7._oldZoomDragPosition = r0
            r7._currentScreenForZoomData = r11
            int r0 = r7._zoomNotch
            r7._rememberedZoomNotchAnimationScreen = r0
            com.badlogic.gdx.math.Vector2 r1 = r7._zoomPosition
            float r2 = r1.x
            r7._rememberedZoomPositionXAnimationScreen = r2
            float r1 = r1.y
            r7._rememberedZoomPositionYAnimationScreen = r1
            r7._rememberedZoomNotchMovieclipScreen = r0
            r7._rememberedZoomPositionXMovieclipScreen = r2
            r7._rememberedZoomPositionYMovieclipScreen = r1
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r7._touchZoomPointer = r0
            com.badlogic.gdx.graphics.g2d.GlyphLayout r0 = new com.badlogic.gdx.graphics.g2d.GlyphLayout
            r0.<init>()
            r7._glyphLayout = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r7._panningStartDrag = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r7._cameraStartDrag = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r7._cameraOffsetBeforeDragging = r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = new org.fortheloss.sticknodes.animationscreen.FrameCamera
            r1 = 0
            r0.<init>(r1)
            r7._playingFrameCamera = r0
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r0 != r1) goto Lcc
            r2 = 0
            goto Ld6
        Lcc:
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1092616192(0x41200000, float:10.0)
            float r2 = r0 * r1
            float r0 = r0 * r1
            float r2 = r2 * r0
        Ld6:
            r7._nodeDragDeadZoneRadiusSquared = r2
            org.fortheloss.sticknodes.TextfieldBox r0 = new org.fortheloss.sticknodes.TextfieldBox
            org.fortheloss.sticknodes.data.ProjectData r1 = r7._projectDataRef
            org.fortheloss.sticknodes.animationscreen.FontLoader r1 = r1.getFontLoader()
            r0.<init>(r1)
            r7._watermarkText = r0
            r1 = 16
            r0.setAlignment(r1)
            r27.updateWatermark()
            float r0 = r27.getWidth()
            float r0 = r0 * r13
            int r0 = (int) r0
            float r0 = (float) r0
            r7._guidelineX = r0
            float r0 = r27.getHeight()
            float r0 = r0 * r13
            int r0 = (int) r0
            float r0 = (float) r0
            r7._guidelineY = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r7._rememberedMatrix = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7._textfieldsAboveWidescreenRef = r0
            org.fortheloss.sticknodes.animationscreen.FilterBundle r0 = new org.fortheloss.sticknodes.animationscreen.FilterBundle
            r16 = 2
            float r1 = r27.getWidth()
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            float r2 = r27.getHeight()
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r7._animationScreenRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r19 = r3.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r27.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r20 = r3.getViewport()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r7._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r3.getStage()
            com.badlogic.gdx.graphics.g2d.Batch r21 = r3.getBatch()
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            float r23 = r27.getX()
            float r24 = r27.getY()
            r25 = 1
            r26 = 0
            r15 = r0
            r17 = r1
            r18 = r2
            r22 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r7._filterBundle = r0
            r7.setFilterBundleToDefault(r12)
            org.fortheloss.sticknodes.animationscreen.Magnifier r0 = new org.fortheloss.sticknodes.animationscreen.Magnifier
            org.fortheloss.sticknodes.data.SessionData r1 = r7._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r7._animationScreenRef
            r0.<init>(r1, r2, r7)
            r7._magnifier = r0
            java.lang.String r1 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Object r1 = r8.get(r1, r10, r12)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.Magnifier r0 = r7._magnifier
            float r1 = r27.getX()
            float r2 = r27.getY()
            float r3 = r27.getHeight()
            org.fortheloss.sticknodes.animationscreen.Magnifier r4 = r7._magnifier
            float r4 = r4.getHeight()
            float r3 = r3 - r4
            float r2 = r2 + r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1106247680(0x41f00000, float:30.0)
            float r3 = r3 * r15
            float r2 = r2 + r3
            r0.setPosition(r1, r2)
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r6 = new org.fortheloss.sticknodes.animationscreen.ArrowsWindow
            org.fortheloss.sticknodes.data.SessionData r1 = r7._sessionDataRef
            org.fortheloss.sticknodes.data.ProjectData r2 = r7._projectDataRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r7._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r5 = r7._animateToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r4 = r7._movieclipToolsModuleRef
            r0 = r6
            r16 = r4
            r4 = r27
            r11 = r6
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7._arrowsWindow = r11
            java.lang.String r0 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Object r0 = r8.get(r0, r10, r12)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r0 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r0
            r11.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0 = r7._arrowsWindow
            float r1 = r27.getX()
            float r2 = r27.getY()
            float r3 = r27.getHeight()
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r4 = r7._arrowsWindow
            float r4 = r4.getHeight()
            float r3 = r3 - r4
            float r2 = r2 + r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r15
            float r2 = r2 + r3
            r0.setPosition(r1, r2)
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0 = r7._arrowsWindow
            r0.update()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r7._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            com.badlogic.gdx.graphics.g2d.Batch r0 = r0.getBatch()
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r27.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r1 = r1.getViewport()
            float r1 = r1.getWorldWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r27.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r2 = r2.getViewport()
            float r2 = r2.getWorldHeight()
            float r3 = r2 / r1
            float r4 = r27.getHeight()
            float r5 = r27.getWidth()
            float r4 = r4 / r5
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L213
            float r3 = r27.getHeight()
            float r3 = r2 / r3
            r7._fullscreenScale = r3
            goto L21b
        L213:
            float r3 = r27.getWidth()
            float r3 = r1 / r3
            r7._fullscreenScale = r3
        L21b:
            float r3 = r27.getWidth()
            float r4 = r7._fullscreenScale
            float r3 = r3 * r4
            r7._fullscreenWidth = r3
            float r3 = r27.getHeight()
            float r4 = r7._fullscreenScale
            float r3 = r3 * r4
            r7._fullscreenHeight = r3
            float r4 = r7._fullscreenWidth
            float r1 = r1 - r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r4
            r7._fullscreenX = r1
            float r2 = r2 - r3
            float r2 = r2 / r4
            r7._fullscreenY = r2
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r27.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r1 = r1.getViewport()
            com.badlogic.gdx.math.Rectangle r2 = new com.badlogic.gdx.math.Rectangle
            r2.<init>()
            r7._scissorBounds = r2
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r27.getStage()
            com.badlogic.gdx.graphics.Camera r18 = r2.getCamera()
            int r2 = r1.getScreenX()
            float r2 = (float) r2
            int r3 = r1.getScreenY()
            float r3 = (float) r3
            int r4 = r1.getScreenWidth()
            float r4 = (float) r4
            int r5 = r1.getScreenHeight()
            float r5 = (float) r5
            com.badlogic.gdx.math.Matrix4 r23 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r6 = new com.badlogic.gdx.math.Rectangle
            float r11 = r27.getX()
            float r15 = r27.getY()
            float r14 = r27.getWidth()
            float r12 = r27.getHeight()
            r6.<init>(r11, r15, r14, r12)
            com.badlogic.gdx.math.Rectangle r11 = r7._scissorBounds
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r24 = r6
            r25 = r11
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r18, r19, r20, r21, r22, r23, r24, r25)
            com.badlogic.gdx.math.Rectangle r2 = new com.badlogic.gdx.math.Rectangle
            r2.<init>()
            r7._fullscreenScissorBounds = r2
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r27.getStage()
            com.badlogic.gdx.graphics.Camera r18 = r2.getCamera()
            int r2 = r1.getScreenX()
            float r2 = (float) r2
            int r3 = r1.getScreenY()
            float r3 = (float) r3
            int r4 = r1.getScreenWidth()
            float r4 = (float) r4
            int r5 = r1.getScreenHeight()
            float r5 = (float) r5
            com.badlogic.gdx.math.Matrix4 r23 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r6 = new com.badlogic.gdx.math.Rectangle
            float r11 = r7._fullscreenX
            float r12 = r7._fullscreenY
            float r14 = r7._fullscreenWidth
            float r15 = r7._fullscreenHeight
            r6.<init>(r11, r12, r14, r15)
            com.badlogic.gdx.math.Rectangle r11 = r7._fullscreenScissorBounds
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r24 = r6
            r25 = r11
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r18, r19, r20, r21, r22, r23, r24, r25)
            float r2 = r27.getHeight()
            float r3 = r27.getHeight()
            float r2 = r2 * r3
            float r3 = r27.getWidth()
            float r2 = r2 / r3
            com.badlogic.gdx.math.Rectangle r3 = new com.badlogic.gdx.math.Rectangle
            r3.<init>()
            r7._ytShortsScissorBounds = r3
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r27.getStage()
            com.badlogic.gdx.graphics.Camera r18 = r3.getCamera()
            int r3 = r1.getScreenX()
            float r3 = (float) r3
            int r4 = r1.getScreenY()
            float r4 = (float) r4
            int r5 = r1.getScreenWidth()
            float r5 = (float) r5
            int r6 = r1.getScreenHeight()
            float r6 = (float) r6
            com.badlogic.gdx.math.Matrix4 r23 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r11 = new com.badlogic.gdx.math.Rectangle
            float r12 = r27.getX()
            float r14 = r27.getWidth()
            float r14 = r14 * r13
            float r12 = r12 + r14
            float r14 = r2 * r13
            float r12 = r12 - r14
            float r14 = r27.getY()
            float r15 = r27.getHeight()
            r11.<init>(r12, r14, r2, r15)
            com.badlogic.gdx.math.Rectangle r2 = r7._ytShortsScissorBounds
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r24 = r11
            r25 = r2
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r18, r19, r20, r21, r22, r23, r24, r25)
            float r2 = r7._fullscreenHeight
            float r3 = r27.getHeight()
            float r2 = r2 * r3
            float r3 = r27.getWidth()
            float r2 = r2 / r3
            com.badlogic.gdx.math.Rectangle r3 = new com.badlogic.gdx.math.Rectangle
            r3.<init>()
            r7._ytShortsFullscreenScissorBounds = r3
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r27.getStage()
            com.badlogic.gdx.graphics.Camera r18 = r3.getCamera()
            int r3 = r1.getScreenX()
            float r3 = (float) r3
            int r4 = r1.getScreenY()
            float r4 = (float) r4
            int r5 = r1.getScreenWidth()
            float r5 = (float) r5
            int r1 = r1.getScreenHeight()
            float r1 = (float) r1
            com.badlogic.gdx.math.Matrix4 r23 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            float r6 = r7._fullscreenX
            float r11 = r7._fullscreenWidth
            float r11 = r11 * r13
            float r6 = r6 + r11
            float r11 = r2 * r13
            float r6 = r6 - r11
            float r11 = r7._fullscreenY
            float r12 = r7._fullscreenHeight
            r0.<init>(r6, r11, r2, r12)
            com.badlogic.gdx.math.Rectangle r2 = r7._ytShortsFullscreenScissorBounds
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r1
            r24 = r0
            r25 = r2
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r18, r19, r20, r21, r22, r23, r24, r25)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule$1 r6 = new org.fortheloss.sticknodes.animationscreen.modules.CanvasModule$1
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r7._createToolsModuleRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            r1 = 1
            java.lang.Object r0 = r8.get(r0, r10, r1)
            r4 = r0
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r4
            java.lang.String r0 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedOutline
            java.lang.Object r0 = r8.get(r0, r9, r1)
            r5 = r0
            com.badlogic.gdx.graphics.g2d.BitmapFont r5 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r5
            r0 = r6
            r1 = r27
            r2 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r7._quickResizeTool = r6
            r7.addActor(r6)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r8 = new org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r7._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r7._framesModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r4 = r7._animateToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r5 = r7._movieclipToolsModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r6 = r7._createToolsModuleRef
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mQrtDocked = r8
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0 = r7._quickResizeTool
            r0.hide()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r7.mQrtDocked
            r0.hide()
            com.badlogic.gdx.graphics.Pixmap$Format r18 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888     // Catch: java.lang.IllegalStateException -> L3f2
            float r0 = r27.getWidth()     // Catch: java.lang.IllegalStateException -> L3f2
            float r0 = r0 * r13
            int r0 = (int) r0     // Catch: java.lang.IllegalStateException -> L3f2
            float r1 = r27.getHeight()     // Catch: java.lang.IllegalStateException -> L3f2
            float r1 = r1 * r13
            int r1 = (int) r1     // Catch: java.lang.IllegalStateException -> L3f2
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r19 = r0
            r20 = r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.IllegalStateException -> L3f2
            r7._tracingFrameBuffer = r0     // Catch: java.lang.IllegalStateException -> L3f2
            goto L414
        L3f2:
            com.badlogic.gdx.graphics.Pixmap$Format r18 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA4444
            float r0 = r27.getWidth()
            float r0 = r0 * r13
            int r0 = (int) r0
            float r1 = r27.getHeight()
            float r1 = r1 * r13
            int r1 = (int) r1
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r19 = r0
            r20 = r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r18, r19, r20, r21, r22, r23, r24)
            r7._tracingFrameBuffer = r0
        L414:
            com.badlogic.gdx.graphics.Pixmap$Format r18 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA4444     // Catch: java.lang.IllegalStateException -> L437
            float r0 = r27.getWidth()     // Catch: java.lang.IllegalStateException -> L437
            float r0 = r0 * r13
            int r0 = (int) r0     // Catch: java.lang.IllegalStateException -> L437
            float r1 = r27.getHeight()     // Catch: java.lang.IllegalStateException -> L437
            float r1 = r1 * r13
            int r1 = (int) r1     // Catch: java.lang.IllegalStateException -> L437
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r19 = r0
            r20 = r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.IllegalStateException -> L437
            r7._previousOnionSkinFrameBuffer = r0     // Catch: java.lang.IllegalStateException -> L437
            goto L459
        L437:
            com.badlogic.gdx.graphics.Pixmap$Format r18 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
            float r0 = r27.getWidth()
            float r0 = r0 * r13
            int r0 = (int) r0
            float r1 = r27.getHeight()
            float r1 = r1 * r13
            int r1 = (int) r1
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r19 = r0
            r20 = r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r18, r19, r20, r21, r22, r23, r24)
            r7._previousOnionSkinFrameBuffer = r0
        L459:
            com.badlogic.gdx.graphics.Pixmap$Format r18 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA4444     // Catch: java.lang.IllegalStateException -> L47c
            float r0 = r27.getWidth()     // Catch: java.lang.IllegalStateException -> L47c
            float r0 = r0 * r13
            int r0 = (int) r0     // Catch: java.lang.IllegalStateException -> L47c
            float r1 = r27.getHeight()     // Catch: java.lang.IllegalStateException -> L47c
            float r1 = r1 * r13
            int r1 = (int) r1     // Catch: java.lang.IllegalStateException -> L47c
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r19 = r0
            r20 = r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.IllegalStateException -> L47c
            r7._nextOnionSkinFrameBuffer = r0     // Catch: java.lang.IllegalStateException -> L47c
            goto L49e
        L47c:
            com.badlogic.gdx.graphics.Pixmap$Format r18 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
            float r0 = r27.getWidth()
            float r0 = r0 * r13
            int r0 = (int) r0
            float r1 = r27.getHeight()
            float r1 = r1 * r13
            int r1 = (int) r1
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r19 = r0
            r20 = r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r18, r19, r20, r21, r22, r23, r24)
            r7._nextOnionSkinFrameBuffer = r0
        L49e:
            com.badlogic.gdx.graphics.OrthographicCamera r0 = new com.badlogic.gdx.graphics.OrthographicCamera
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r7._nextOnionSkinFrameBuffer
            int r1 = r1.getWidth()
            float r1 = (float) r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r7._nextOnionSkinFrameBuffer
            int r2 = r2.getHeight()
            float r2 = (float) r2
            r0.<init>(r1, r2)
            r7._onionSkinCamera = r0
            com.badlogic.gdx.math.Vector3 r0 = r0.position
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r7._nextOnionSkinFrameBuffer
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r1 = r1 * r13
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r7._nextOnionSkinFrameBuffer
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r13
            r3 = 0
            r0.set(r1, r2, r3)
            com.badlogic.gdx.graphics.OrthographicCamera r0 = r7._onionSkinCamera
            r0.update()
            com.badlogic.gdx.scenes.scene2d.Actor r0 = new com.badlogic.gdx.scenes.scene2d.Actor
            r0.<init>()
            r7.mCanvasTouchArea = r0
            float r1 = r27.getX()
            float r1 = -r1
            float r2 = r27.getY()
            float r2 = -r2
            r0.setPosition(r1, r2)
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r7.mCanvasTouchArea
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r27.getStage()
            float r1 = r1.getWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r27.getStage()
            float r2 = r2.getHeight()
            r0.setSize(r1, r2)
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r7.mCanvasTouchArea
            r1 = 0
            r7.addActorAt(r1, r0)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule$2 r0 = new org.fortheloss.sticknodes.animationscreen.modules.CanvasModule$2
            r0.<init>(r7)
            r7._clickListener = r0
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r0.setTapCountInterval(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r7.mCanvasTouchArea
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r7._clickListener
            r0.addListener(r1)
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r0 != r1) goto L526
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule$3 r0 = new org.fortheloss.sticknodes.animationscreen.modules.CanvasModule$3
            r0.<init>(r7)
            r7.addListener(r0)
            goto L54e
        L526:
            com.badlogic.gdx.input.GestureDetector r0 = new com.badlogic.gdx.input.GestureDetector
            r2 = 0
            r3 = 1053609165(0x3ecccccd, float:0.4)
            r4 = 1066192077(0x3f8ccccd, float:1.1)
            r5 = 1041865114(0x3e19999a, float:0.15)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule$4 r6 = new org.fortheloss.sticknodes.animationscreen.modules.CanvasModule$4
            r6.<init>(r7)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r7._gestureDetector = r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            r0.setTapSquareSize(r2)
            com.badlogic.gdx.InputMultiplexer r0 = org.fortheloss.sticknodes.App.inputMultiplexer
            com.badlogic.gdx.input.GestureDetector r1 = r7._gestureDetector
            r2 = 0
            r0.addProcessor(r2, r1)
        L54e:
            return
    }

    public void invertFigureColor(boolean r3, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L1d
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L1d:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L37
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L37:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
        L4c:
            r4.setInvertedColor(r3)
            r2.setNeedsToBeDrawn()
            return
    }

    public boolean isTracing() {
            r1 = this;
            boolean r0 = r1._isTracingBG
            return r0
    }

    public boolean isTracingFrame() {
            r1 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r1._frameDataToTraceRef
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isWaitingForUserToChooseFigure() {
            r1 = this;
            boolean r0 = r1._isWaitingForUserToChooseFigure
            return r0
    }

    public void joinFigureTo(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r9, org.fortheloss.sticknodes.stickfigure.StickNode r10) {
            r8 = this;
            float r2 = r9.getX()
            float r3 = r9.getY()
            byte r0 = r9.isLockedToCamera()
            java.lang.String r1 = "cantJoinTitleFix"
            if (r0 == 0) goto L20
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r8._animationScreenRef
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r0 = "cantJoinInfo2Fix"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r9.showErrorDialog(r10, r0)
            return
        L20:
            boolean r0 = r9.joinTo(r10)
            if (r0 == 0) goto L61
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FigureJoinAction> r1 = org.fortheloss.sticknodes.data.useractions.FigureJoinAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            r7 = r0
            org.fortheloss.sticknodes.data.useractions.FigureJoinAction r7 = (org.fortheloss.sticknodes.data.useractions.FigureJoinAction) r7
            float r4 = r9.getX()
            float r5 = r9.getY()
            r0 = r7
            r1 = r9
            r6 = r10
            r0.initialize(r1, r2, r3, r4, r5, r6)
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionDataRef
            r0.addUserAction(r7)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r8._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            r0.onFigureJoined(r9, r10)
            boolean r10 = r9 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r10 == 0) goto L57
            r10 = r9
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r10
            r8.maybeUpdateJoinChain(r10)
        L57:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r8._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.INode r9 = r9.getMainNode()
            r10.setSessionSelectionToNode(r9)
            goto L70
        L61:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r8._animationScreenRef
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r0 = "cantJoinInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r9.showErrorDialog(r10, r0)
        L70:
            return
    }

    public void lockFigure(boolean r4, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5) {
            r3 = this;
            boolean r0 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 != 0) goto L54
            if (r5 != 0) goto L7
            return
        L7:
            boolean r0 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L21
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            r2 = r5
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            r1.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r1)
            goto L3a
        L21:
            boolean r1 = r5 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r1 == 0) goto L3a
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            r2 = r5
            org.fortheloss.sticknodes.movieclip.MCReference r2 = (org.fortheloss.sticknodes.movieclip.MCReference) r2
            r1.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r1)
        L3a:
            r5.setLocked(r4)
            if (r4 == 0) goto L50
            if (r0 == 0) goto L49
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r5
            r4.setSessionSelectionToStickfigure(r5)
            goto L50
        L49:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r5 = (org.fortheloss.sticknodes.movieclip.MCReference) r5
            r4.setSessionSelectionToMC(r5)
        L50:
            r3.setNeedsToBeDrawn()
            return
        L54:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Sprites cannot be locked like this."
            r4.<init>(r5)
            throw r4
    }

    public void lockNode(org.fortheloss.sticknodes.stickfigure.StickNode r4, boolean r5) {
            r3 = this;
            if (r4 == 0) goto L35
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L35
        L9:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r4.getStickfigure()
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            r2 = 0
            r1.initialize(r0, r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r1)
            if (r5 == 0) goto L26
            r0.unlockStickNode()
            goto L2d
        L26:
            int r4 = r4.getDrawOrderIndex()
            r0.lockStickNode(r4)
        L2d:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r4 = r3._quickResizeTool
            r4.updateNodeProperties()
            r3.setNeedsToBeDrawn()
        L35:
            return
    }

    public void maybeUpdateJoinChain(org.fortheloss.sticknodes.stickfigure.Stickfigure r7) {
            r6 = this;
            boolean r0 = r7.hasJoinAnchorNode()
            if (r0 == 0) goto L6e
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.add(r7)
        L11:
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L68
            java.lang.Object r7 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r7
            r7.validateDirtyNodes()
            java.util.ArrayList r1 = r7.getJoinAnchorNodes()
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L2a:
            if (r1 < 0) goto L11
            java.util.ArrayList r2 = r7.getJoinAnchorNodes()
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            java.util.ArrayList r3 = r2.getJoinedFigures()
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L40:
            if (r3 < 0) goto L65
            java.util.ArrayList r4 = r2.getJoinedFigures()
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            org.fortheloss.sticknodes.stickfigure.INode r5 = r4.getMainNode()
            r5.flagPositionAsDirty()
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r5 == 0) goto L62
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r4
            boolean r5 = r4.hasJoinAnchorNode()
            if (r5 == 0) goto L62
            r0.add(r4)
        L62:
            int r3 = r3 + (-1)
            goto L40
        L65:
            int r1 = r1 + (-1)
            goto L2a
        L68:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
        L6e:
            return
    }

    public void maybeUpdateJoinChains() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._figuresRef
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L30
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r2._figuresRef
            java.lang.Object r1 = r1.get(r0)
            boolean r1 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 == 0) goto L2d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r2._figuresRef
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            boolean r1 = r1.isJoined()
            if (r1 != 0) goto L2d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r2._figuresRef
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r2.maybeUpdateJoinChain(r1)
        L2d:
            int r0 = r0 + (-1)
            goto L8
        L30:
            return
    }

    public void moveFigure(int r5, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6) {
            r4 = this;
            if (r6 == 0) goto L64
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r4._figuresRef
            int r0 = r0.size()
            r1 = 1
            if (r0 > r1) goto Lc
            goto L64
        Lc:
            r0 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r4._figuresRef
            int r2 = r2.size()
            int r2 = r2 - r1
        L14:
            if (r2 < 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r4._figuresRef
            java.lang.Object r3 = r3.get(r2)
            if (r6 != r3) goto L20
            r0 = r2
            goto L23
        L20:
            int r2 = r2 + (-1)
            goto L14
        L23:
            if (r0 != 0) goto L28
            r2 = -1
            if (r5 == r2) goto L33
        L28:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r4._figuresRef
            int r2 = r2.size()
            int r2 = r2 - r1
            if (r0 != r2) goto L34
            if (r5 != r1) goto L34
        L33:
            return
        L34:
            if (r5 >= 0) goto L39
            int r5 = r0 + (-1)
            goto L3b
        L39:
            int r5 = r0 + 1
        L3b:
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r4._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            r1.swapFigures(r0, r5)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r4._framesModuleRef
            r1.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FigureOrderChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.FigureOrderChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.FigureOrderChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FigureOrderChangeAction) r1
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r4._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r2 = r2.getCurrentFrame()
            r1.initialize(r2, r0, r5, r6)
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            r5.addUserAction(r1)
        L64:
            return
    }

    public void onFilterShowingStateChanged() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.FilterBundle r0 = r5._filterBundle
            r1 = 1
            if (r0 == 0) goto L33
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            int r2 = r2.getFilterShowingState()
            r3 = 0
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            r0.setEnabled(r2)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r0 = r5._filterBundle
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            int r2 = r2.getFilterShowingState()
            r4 = 2
            if (r2 != r4) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = 0
        L22:
            r0.setBlurEnabled(r2)
            org.fortheloss.sticknodes.animationscreen.FilterBundle r0 = r5._filterBundle
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            int r2 = r2.getFilterShowingState()
            if (r2 != r4) goto L30
            r3 = 1
        L30:
            r0.setGlowEnabled(r3)
        L33:
            r5._tracingFBODirty = r1
            r5._previousOnionSkinDirty = r1
            r5._nextOnionSkinDirty = r1
            r5.setNeedsToBeDrawn()
            return
    }

    public void onFiltersQualityChanged() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FilterBundle r0 = r2._filterBundle
            if (r0 == 0) goto Ld
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            int r1 = r1.getFiltersQuality()
            r0.setUVQuality(r1)
        Ld:
            r0 = 1
            r2._tracingFBODirty = r0
            r2._previousOnionSkinDirty = r0
            r2._nextOnionSkinDirty = r0
            r2.setNeedsToBeDrawn()
            return
    }

    public void onPlayFullscreenChange() {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            boolean r0 = r0.getIsPlayFullscreen()
            r1 = 3
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L25
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            int r0 = r0.getMode()
            if (r0 != r1) goto L42
            com.badlogic.gdx.math.Vector2 r0 = r4._zoomPosition
            float r1 = r4._fullscreenWidth
            float r1 = r1 * r2
            float r3 = r4._fullscreenHeight
            float r3 = r3 * r2
            r0.set(r1, r3)
            r0 = 0
            r4.setFilterBundleToDefault(r0)
            goto L42
        L25:
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            int r0 = r0.getMode()
            if (r0 != r1) goto L3e
            com.badlogic.gdx.math.Vector2 r0 = r4._zoomPosition
            float r1 = r4.getWidth()
            float r1 = r1 * r2
            float r3 = r4.getHeight()
            float r3 = r3 * r2
            r0.set(r1, r3)
        L3e:
            r0 = 1
            r4.setFilterBundleToDefault(r0)
        L42:
            return
    }

    public void onSessionModeChange() {
            r8 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionDataRef
            int r0 = r0.getMode()
            org.fortheloss.sticknodes.data.SessionData r1 = r8._sessionDataRef
            int r1 = r1.getScreen()
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r2 = r8._arrowsWindow
            r2.update()
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r2 = r8._quickMenuTable
            if (r2 == 0) goto L18
            r2.update()
        L18:
            org.fortheloss.sticknodes.data.SessionData r2 = r8._sessionDataRef
            short r2 = r2.getIsShowingQuickResizeTool()
            r3 = 2
            if (r2 != r3) goto L35
            if (r0 != r3) goto L35
            if (r1 != 0) goto L35
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r8._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getFrameCamera()
            r8.showQuickResizeTool(r1)
            goto L39
        L35:
            r1 = 0
            r8.showQuickResizeTool(r1)
        L39:
            r1 = 3
            r2 = 1
            r3 = 0
            if (r0 != r1) goto La9
            r4 = 10
            r8._zoomNotch = r4
            r8.calculateZoomFromZoomNotch()
            org.fortheloss.sticknodes.data.SessionData r4 = r8._sessionDataRef
            boolean r4 = r4.getIsPlayFullscreen()
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L61
            com.badlogic.gdx.math.Vector2 r4 = r8._zoomPosition
            float r6 = r8.getWidth()
            float r6 = r6 * r5
            float r7 = r8.getHeight()
            float r7 = r7 * r5
            r4.set(r6, r7)
            goto L71
        L61:
            com.badlogic.gdx.math.Vector2 r4 = r8._zoomPosition
            float r6 = r8._fullscreenWidth
            float r6 = r6 * r5
            float r7 = r8._fullscreenHeight
            float r7 = r7 * r5
            r4.set(r6, r7)
            r8.setFilterBundleToDefault(r3)
        L71:
            org.fortheloss.sticknodes.data.SessionData r4 = r8._sessionDataRef
            int r4 = r4.getScreen()
            if (r4 != 0) goto L81
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r4 = r8._animateToolsModuleRef
            float r5 = r8._zoom
            r4.updateZoomDisplay(r5)
            goto L88
        L81:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r4 = r8._movieclipToolsModuleRef
            float r5 = r8._zoom
            r4.updateZoomDisplay(r5)
        L88:
            org.fortheloss.sticknodes.animationscreen.Magnifier r4 = r8._magnifier
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r4.getStage()
            if (r4 == 0) goto L95
            r8._showMagnifierWhenEnterNormalMode = r2
            r8.hideMagnifier()
        L95:
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r4 = r8._arrowsWindow
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r4.getStage()
            if (r4 == 0) goto La2
            r8._showArrowsWhenEnterNormalMode = r2
            r8.hideArrows()
        La2:
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r4 = r8._quickMenuTable
            if (r4 == 0) goto La9
            r8.hideQuickMenu(r3)
        La9:
            if (r0 != r1) goto Lb1
            org.fortheloss.sticknodes.animationscreen.Magnifier r1 = r8._magnifier
            r1.setEnabled(r3)
            goto Lb6
        Lb1:
            org.fortheloss.sticknodes.animationscreen.Magnifier r1 = r8._magnifier
            r1.setEnabled(r2)
        Lb6:
            if (r0 != 0) goto Ld5
            boolean r0 = r8._showMagnifierWhenEnterNormalMode
            if (r0 == 0) goto Lc1
            r8._showMagnifierWhenEnterNormalMode = r3
            r8.showMagnifier()
        Lc1:
            boolean r0 = r8._showArrowsWhenEnterNormalMode
            if (r0 == 0) goto Lca
            r8._showArrowsWhenEnterNormalMode = r3
            r8.showArrows()
        Lca:
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionDataRef
            boolean r0 = r0.getQuickMenuIsEnabled()
            if (r0 == 0) goto Ld5
            r8.showQuickMenu()
        Ld5:
            return
    }

    public void onSessionScreenChange() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r0 = r5._quickMenuTable
            if (r0 == 0) goto L7
            r0.update()
        L7:
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0 = r5._arrowsWindow
            r0.update()
            r0 = 0
            r5.showQuickResizeTool(r0)
            r5.rememberZoom()
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            int r1 = r1.getScreen()
            r5._currentScreenForZoomData = r1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            int r1 = r1.getScreen()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L51
            r5.resetZoom(r3)
            float r1 = r5._zoomGoal
            r5._zoom = r1
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r4 = r5._animateToolsModuleRef
            r4.updateZoomDisplay(r1)
            r1 = 10
            r5._rememberedZoomNotchMovieclipScreen = r1
            float r1 = r5.getWidth()
            r4 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r4
            r5._rememberedZoomPositionXMovieclipScreen = r1
            float r1 = r5.getHeight()
            float r1 = r1 * r4
            r5._rememberedZoomPositionYMovieclipScreen = r1
            boolean r1 = r5._showArrowsWhenEnterAnimationScreen
            if (r1 == 0) goto L8b
            r5._showArrowsWhenEnterAnimationScreen = r2
            r5.showArrows()
            goto L8b
        L51:
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 != r3) goto L76
            r5.resetZoom()
            float r1 = r5._zoomGoal
            r5._zoom = r1
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r5._createToolsModuleRef
            r4.updateZoomDisplay(r1)
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r1 = r5._arrowsWindow
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            if (r1 == 0) goto L72
            r5._showArrowsWhenEnterAnimationScreen = r3
            r5.hideArrows()
        L72:
            r5.showQuickResizeTool(r0)
            goto L8b
        L76:
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            int r1 = r1.getScreen()
            r4 = 2
            if (r1 != r4) goto L8b
            r5.resetZoom(r3)
            float r1 = r5._zoomGoal
            r5._zoom = r1
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r4 = r5._movieclipToolsModuleRef
            r4.updateZoomDisplay(r1)
        L8b:
            r5._tracingFBODirty = r3
            r5._previousOnionSkinDirty = r3
            r5._nextOnionSkinDirty = r3
            org.fortheloss.sticknodes.animationscreen.Magnifier r1 = r5._magnifier
            r1.reset()
            r5._isTracingBG = r2
            r5._stickfigureToTraceRef = r0
            r5._frameDataToTraceRef = r0
            return
    }

    public void onSessionSelectionChange() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r0 = r5._quickMenuTable
            if (r0 == 0) goto L7
            r0.update()
        L7:
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0 = r5._arrowsWindow
            r0.update()
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            short r0 = r0.getIsShowingQuickResizeTool()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L22
            com.badlogic.gdx.Input r3 = com.badlogic.gdx.Gdx.input
            boolean r3 = r3.isTouched()
            if (r3 == 0) goto L22
            r5.showQuickResizeTool(r1)
            goto L8b
        L22:
            if (r0 != r2) goto L2d
            boolean r3 = r5._isTouchDownOnSameNode
            if (r3 != 0) goto L2d
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r3 = r5._quickResizeTool
            r3.setTemporaryToggleOn(r2)
        L2d:
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r2.getCurrentlySelectedStickfigure()
            if (r2 == 0) goto L3f
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            r5.showQuickResizeTool(r0)
            goto L8b
        L3f:
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r2 = r2.getCurrentlySelectedMC()
            if (r2 == 0) goto L51
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            r5.showQuickResizeTool(r0)
            goto L8b
        L51:
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r2.getCurrentlySelectedSprite()
            if (r2 == 0) goto L63
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            r5.showQuickResizeTool(r0)
            goto L8b
        L63:
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r2 = r2.getCurrentlySelectedTextfieldBox()
            if (r2 == 0) goto L75
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            r5.showQuickResizeTool(r0)
            goto L8b
        L75:
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            int r2 = r2.getMode()
            org.fortheloss.sticknodes.data.SessionData r3 = r5._sessionDataRef
            int r3 = r3.getScreen()
            r4 = 2
            if (r0 != r4) goto L88
            if (r2 != r4) goto L88
            if (r3 == 0) goto L8b
        L88:
            r5.showQuickResizeTool(r1)
        L8b:
            return
    }

    public void onShowZoomButtons() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r1.mQrtDocked
            r0.updateMagnifierPadding()
            return
    }

    public void onZoomButtonClick(int r2) {
            r1 = this;
            int r0 = r1._zoomNotch
            int r0 = r0 + r2
            r1._zoomNotch = r0
            r1.calculateZoomFromZoomNotch()
            org.fortheloss.sticknodes.data.SessionData r2 = r1._sessionDataRef
            int r2 = r2.getScreen()
            if (r2 != 0) goto L18
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2 = r1._animateToolsModuleRef
            float r0 = r1._zoom
            r2.updateZoomDisplay(r0)
            goto L30
        L18:
            org.fortheloss.sticknodes.data.SessionData r2 = r1._sessionDataRef
            int r2 = r2.getScreen()
            r0 = 1
            if (r2 != r0) goto L29
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModuleRef
            float r0 = r1._zoom
            r2.updateZoomDisplay(r0)
            goto L30
        L29:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2 = r1._movieclipToolsModuleRef
            float r0 = r1._zoom
            r2.updateZoomDisplay(r0)
        L30:
            com.badlogic.gdx.math.Vector2 r2 = r1._zoomPosition
            float r0 = r2.x
            float r2 = r2.y
            r1.setZoomPosition(r0, r2)
            r1.setNeedsToBeDrawn()
            return
    }

    public void pasteCameraWobbleProperties(org.fortheloss.sticknodes.animationscreen.FrameCamera r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = r0.getCopiedFrameCameraProperties()
            if (r4 == 0) goto L25
            if (r0 != 0) goto Lb
            goto L25
        Lb:
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r1
            r1.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r1)
            r4.setWobbleProperties(r0)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r4 = r3._animateToolsModuleRef
            r4.setNeedsToBeDrawn()
        L25:
            return
    }

    public void pasteFigureFilters(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.FigureFilterProperties r0 = r0.getCopiedFigureFilterProperties()
            if (r0 != 0) goto Lc
            return
        Lc:
            boolean r1 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 == 0) goto L26
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            r2 = r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            r1.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r1)
            goto L55
        L26:
            boolean r1 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r1 == 0) goto L40
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            r2 = r4
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = (org.fortheloss.sticknodes.sprite.SpriteRef) r2
            r1.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r1)
            goto L55
        L40:
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            r2 = r4
            org.fortheloss.sticknodes.movieclip.MCReference r2 = (org.fortheloss.sticknodes.movieclip.MCReference) r2
            r1.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r1)
        L55:
            r4.setFilters(r0)
            r3.setNeedsToBeDrawn()
            return
    }

    public boolean pasteSegment(org.fortheloss.sticknodes.stickfigure.StickNode r14, org.fortheloss.sticknodes.stickfigure.StickNode r15, boolean r16, java.util.ArrayList<java.lang.Integer> r17, org.fortheloss.sticknodes.stickfigure.StickNode r18) {
            r13 = this;
            r0 = r13
            r4 = r14
            r7 = r15
            r8 = r17
            r9 = 1
            if (r7 == 0) goto L190
            if (r4 != 0) goto Lc
            goto L190
        Lc:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r15.getStickfigure()
            int r1 = r1.getNodeCount(r9)
            int r2 = r14.getDescendantCount()
            int r1 = r1 + r2
            int r1 = r1 + r9
            r2 = 400(0x190, float:5.6E-43)
            r10 = 0
            if (r1 > r2) goto L15b
            r1 = 0
            if (r16 == 0) goto L3c
            float r2 = r14.getAngle()
            float r3 = r15.getAngle()
            float r2 = r2 - r3
        L2b:
            r3 = 1135869952(0x43b40000, float:360.0)
            int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r5 >= 0) goto L33
            float r2 = r2 + r3
            goto L2b
        L33:
            r1 = r2
        L34:
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 < 0) goto L3a
            float r1 = r1 - r3
            goto L34
        L3a:
            r11 = r1
            goto L3d
        L3c:
            r11 = 0
        L3d:
            boolean r1 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r1 == 0) goto L55
            org.fortheloss.sticknodes.stickfigure.ConnectorDynamic r12 = new org.fortheloss.sticknodes.stickfigure.ConnectorDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r15.getStickfigure()
            r5 = 1
            r6 = 1
            r1 = r12
            r3 = r15
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r18
            r12.changeEndNode(r1)
            goto L63
        L55:
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r12 = new org.fortheloss.sticknodes.stickfigure.StickNodeDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r15.getStickfigure()
            r5 = 1
            r6 = 1
            r1 = r12
            r3 = r15
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6)
        L63:
            if (r16 == 0) goto L68
            r12.setLocalAngle(r11)
        L68:
            r12.flagPositionAsDirty()
            java.util.ArrayList r1 = org.fortheloss.sticknodes.stickfigure.StickNode.orderNodesByRelativeDrawOrder(r12)
            r15.addChildNode(r12, r10)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r12.getStickfigure()
            int r3 = r1.size()
            r5 = r7
            r4 = 0
        L7c:
            if (r4 >= r3) goto L8b
            java.lang.Object r6 = r1.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            r2.addNodeToDrawOrderAfter(r6, r5)
            int r4 = r4 + 1
            r5 = r6
            goto L7c
        L8b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Stack r2 = new java.util.Stack
            r2.<init>()
            r2.add(r12)
        L98:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto Lbe
            java.lang.Object r3 = r2.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r1.add(r3)
            java.util.ArrayList r3 = r3.getChildrenNodes()
            int r4 = r3.size()
            r5 = 0
        Lb0:
            if (r5 >= r4) goto L98
            java.lang.Object r6 = r3.get(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            r2.add(r6)
            int r5 = r5 + 1
            goto Lb0
        Lbe:
            if (r8 == 0) goto Lfb
            int r2 = r17.size()
        Lc4:
            if (r10 >= r2) goto Lfb
            java.lang.Object r3 = r8.get(r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = r10 + 1
            java.lang.Object r4 = r8.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = -1
            if (r4 != r5) goto Le9
            java.lang.Object r3 = r1.get(r3)
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            r3.changeEndNode(r15)
            goto Lf8
        Le9:
            java.lang.Object r3 = r1.get(r3)
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            java.lang.Object r4 = r1.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r3.changeEndNode(r4)
        Lf8:
            int r10 = r10 + 2
            goto Lc4
        Lfb:
            int r2 = r1.size()
            int r2 = r2 - r9
        L100:
            if (r2 < 0) goto L128
            java.lang.Object r3 = r1.get(r2)
            boolean r3 = r3 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r3 == 0) goto L125
            java.lang.Object r3 = r1.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r3.getStickfigure()
            if (r3 == 0) goto L125
            java.lang.Object r3 = r1.get(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r3.getEndNode()
            if (r4 != 0) goto L125
            r3.delete(r9)
        L125:
            int r2 = r2 + (-1)
            goto L100
        L128:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r12.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getMainNode()
            r1.flagPositionAsDirty()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r12.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getMainNode()
            r1.validatePosition()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r0._createToolsModuleRef
            r1.updateRelativeAngleLocks()
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeAddAction> r2 = org.fortheloss.sticknodes.data.useractions.StickNodeAddAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.StickNodeAddAction r1 = (org.fortheloss.sticknodes.data.useractions.StickNodeAddAction) r1
            r1.initialize(r12)
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionDataRef
            r2.addUserAction(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            r1.setSessionSelectionToNode(r12)
            return r9
        L15b:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            java.lang.String r3 = "nodeLimitWarningTitle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r15.getStickfigure()
            int r6 = r6.getNodeCount(r9)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r10] = r6
            int r4 = r14.getDescendantCount()
            int r4 = r4 + r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r9] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 2
            r5[r4] = r2
            java.lang.String r2 = "nodeLimitWarningInfo2"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2, r5)
            r1.showErrorDialog(r3, r2)
            return r10
        L190:
            return r9
    }

    public boolean pasteSegment(org.fortheloss.sticknodes.stickfigure.StickNode r17, org.fortheloss.sticknodes.stickfigure.StickNode r18, boolean r19, java.util.ArrayList<java.lang.Integer> r20, org.fortheloss.sticknodes.stickfigure.StickNode r21, java.util.ArrayList<java.lang.Integer> r22, java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> r23) {
            r16 = this;
            r0 = r16
            r4 = r17
            r7 = r18
            r8 = r20
            r9 = r22
            r10 = r23
            r11 = 0
            if (r7 == 0) goto L216
            if (r4 != 0) goto L13
            goto L216
        L13:
            int r1 = r22.size()
            r2 = 0
        L18:
            int r3 = r23.size()
            if (r2 >= r3) goto L2c
            java.lang.Object r3 = r10.get(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L18
        L2c:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r18.getStickfigure()
            r12 = 1
            int r2 = r2.getNodeCount(r12)
            int r3 = r17.getDescendantCount()
            int r2 = r2 + r3
            int r2 = r2 + r1
            int r2 = r2 + r12
            r3 = 400(0x190, float:5.6E-43)
            if (r2 > r3) goto L1e1
            r1 = 0
            if (r19 == 0) goto L5d
            float r2 = r17.getAngle()
            float r3 = r18.getAngle()
            float r2 = r2 - r3
        L4c:
            r3 = 1135869952(0x43b40000, float:360.0)
            int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r5 >= 0) goto L54
            float r2 = r2 + r3
            goto L4c
        L54:
            r1 = r2
        L55:
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 < 0) goto L5b
            float r1 = r1 - r3
            goto L55
        L5b:
            r13 = r1
            goto L5e
        L5d:
            r13 = 0
        L5e:
            boolean r1 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r1 == 0) goto L78
            org.fortheloss.sticknodes.stickfigure.ConnectorDynamic r14 = new org.fortheloss.sticknodes.stickfigure.ConnectorDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r18.getStickfigure()
            r5 = 1
            r6 = 1
            r1 = r14
            r3 = r18
            r4 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r21
            r14.changeEndNode(r1)
            goto L88
        L78:
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r14 = new org.fortheloss.sticknodes.stickfigure.StickNodeDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r18.getStickfigure()
            r5 = 1
            r6 = 1
            r1 = r14
            r3 = r18
            r4 = r17
            r1.<init>(r2, r3, r4, r5, r6)
        L88:
            if (r19 == 0) goto L8d
            r14.setLocalAngle(r13)
        L8d:
            r14.flagPositionAsDirty()
            java.util.ArrayList r1 = org.fortheloss.sticknodes.stickfigure.StickNode.orderNodesByRelativeDrawOrder(r14)
            r7.addChildNode(r14, r11)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r14.getStickfigure()
            int r3 = r1.size()
            r5 = r7
            r4 = 0
        La1:
            if (r4 >= r3) goto Lb0
            java.lang.Object r6 = r1.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            r2.addNodeToDrawOrderAfter(r6, r5)
            int r4 = r4 + 1
            r5 = r6
            goto La1
        Lb0:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Stack r2 = new java.util.Stack
            r2.<init>()
            r2.add(r14)
        Lbd:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto Le3
            java.lang.Object r3 = r2.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r1.add(r3)
            java.util.ArrayList r3 = r3.getChildrenNodes()
            int r4 = r3.size()
            r5 = 0
        Ld5:
            if (r5 >= r4) goto Lbd
            java.lang.Object r6 = r3.get(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            r2.add(r6)
            int r5 = r5 + 1
            goto Ld5
        Le3:
            int r2 = r22.size()
            r3 = 0
        Le8:
            if (r3 >= r2) goto L123
            java.lang.Object r4 = r9.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r4 = r1.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            java.lang.Object r5 = r10.get(r3)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.convertToPolyAnchor()
            int r6 = r5.size()
            r13 = 0
        L108:
            if (r13 >= r6) goto L120
            java.lang.Object r15 = r5.get(r13)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            java.lang.Object r15 = r1.get(r15)
            org.fortheloss.sticknodes.stickfigure.StickNode r15 = (org.fortheloss.sticknodes.stickfigure.StickNode) r15
            r4.addPolynodeChild(r15)
            int r13 = r13 + 1
            goto L108
        L120:
            int r3 = r3 + 1
            goto Le8
        L123:
            if (r8 == 0) goto L160
            int r2 = r20.size()
        L129:
            if (r11 >= r2) goto L160
            java.lang.Object r3 = r8.get(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = r11 + 1
            java.lang.Object r4 = r8.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = -1
            if (r4 != r5) goto L14e
            java.lang.Object r3 = r1.get(r3)
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            r3.changeEndNode(r7)
            goto L15d
        L14e:
            java.lang.Object r3 = r1.get(r3)
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            java.lang.Object r4 = r1.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r3.changeEndNode(r4)
        L15d:
            int r11 = r11 + 2
            goto L129
        L160:
            int r2 = r1.size()
            int r2 = r2 - r12
        L165:
            if (r2 < 0) goto L18d
            java.lang.Object r3 = r1.get(r2)
            boolean r3 = r3 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r3 == 0) goto L18a
            java.lang.Object r3 = r1.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r3.getStickfigure()
            if (r3 == 0) goto L18a
            java.lang.Object r3 = r1.get(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r3.getEndNode()
            if (r4 != 0) goto L18a
            r3.delete(r12)
        L18a:
            int r2 = r2 + (-1)
            goto L165
        L18d:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r14.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getMainNode()
            r2.flagPositionAsDirty()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r14.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getMainNode()
            r2.validatePosition()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r0._createToolsModuleRef
            r2.updateRelativeAngleLocks()
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeAddAction> r3 = org.fortheloss.sticknodes.data.useractions.StickNodeAddAction.class
            java.lang.Object r2 = r2.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.StickNodeAddAction r2 = (org.fortheloss.sticknodes.data.useractions.StickNodeAddAction) r2
            r2.initialize(r14)
            org.fortheloss.sticknodes.data.SessionData r3 = r0._sessionDataRef
            r3.addUserAction(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r3 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            java.lang.Object r2 = r2.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r2 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r2
            org.fortheloss.sticknodes.data.SessionData r3 = r0._sessionDataRef
            r3.addUserAction(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r0._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillRecreationAction> r3 = org.fortheloss.sticknodes.data.useractions.PolyfillRecreationAction.class
            java.lang.Object r2 = r2.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.PolyfillRecreationAction r2 = (org.fortheloss.sticknodes.data.useractions.PolyfillRecreationAction) r2
            r2.initialize(r1, r9, r10)
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            r1.addUserAction(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            r1.setSessionSelectionToNode(r14)
            return r12
        L1e1:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            java.lang.String r5 = "nodeLimitWarningTitle"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = r18.getStickfigure()
            int r7 = r7.getNodeCount(r12)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r11] = r7
            int r4 = r17.getDescendantCount()
            int r4 = r4 + r1
            int r4 = r4 + r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r6[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r3 = 2
            r6[r3] = r1
            java.lang.String r1 = "nodeLimitWarningInfo2"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r6)
            r2.showErrorDialog(r5, r1)
        L216:
            return r11
    }

    public void pasteStickfigurePropertiesBundle(org.fortheloss.sticknodes.stickfigure.Stickfigure r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r0 = r0.getCopiedStickfigurePropertiesBundle()
            if (r4 == 0) goto L1a
            if (r0 != 0) goto Lb
            goto L1a
        Lb:
            org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.PasteStickfigurePropertiesBundleDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r3._animationScreenRef
            r1.<init>(r2, r3)
            r1.initialize(r0, r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            r4.addDialogToStage(r1)
        L1a:
            return
    }

    public void pasteTextfieldText(org.fortheloss.sticknodes.TextfieldBox r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.utils.Clipboard r0 = r0.getClipboard()
            java.lang.String r0 = r0.getContents()
            if (r0 == 0) goto L19
            int r1 = r0.length()
            if (r1 > 0) goto L16
            goto L19
        L16:
            r2.setTextfieldText(r0, r3)
        L19:
            return
    }

    public void persistFigure(boolean r3, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L1d
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L1d:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L37
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L37:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
        L4c:
            r4.setPersist(r3)
            return
    }

    public void promptUserToChooseStickfigure(org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.promptUserToChooseStickfigure(r1, r2, r3, r4, r5)
            return
    }

    public void promptUserToChooseStickfigure(org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter r10, java.lang.String r11, java.lang.String r12, boolean r13, com.badlogic.gdx.scenes.scene2d.Actor[] r14) {
            r9 = this;
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            r9._isWaitingForUserToChooseFigure = r2
            r9._isWaitingForUserToChooseFigureAllowMCs = r13
            if (r12 != 0) goto Lf
            java.lang.String r12 = ""
        Lf:
            r6 = r12
            r12 = 2
            if (r2 == 0) goto L63
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r13 = r9._animationScreenRef
            r13.setSessionMode(r0)
            r9.hideQuickMenu(r0)
            r9.enableQuickResizeTool(r0)
            org.fortheloss.sticknodes.data.SessionData r13 = r9._sessionDataRef
            int r13 = r13.getScreen()
            if (r13 != 0) goto L30
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3 = r9._animateToolsModuleRef
            r4 = 1
            r5 = r11
            r7 = r10
            r8 = r14
            r3.userChoosingFigure(r4, r5, r6, r7, r8)
            goto L4b
        L30:
            org.fortheloss.sticknodes.data.SessionData r13 = r9._sessionDataRef
            int r13 = r13.getScreen()
            if (r13 != r12) goto L3e
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r12 = r9._movieclipToolsModuleRef
            r12.userChoosingFigure(r1, r11, r6, r10)
            goto L4b
        L3e:
            org.fortheloss.sticknodes.data.SessionData r12 = r9._sessionDataRef
            int r12 = r12.getScreen()
            if (r12 != r1) goto L4b
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r12 = r9._createToolsModuleRef
            r12.userChoosingFigure(r1, r11, r6, r10)
        L4b:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r10 = r9._framesModuleRef
            r10.disableAll(r1, r1)
            org.fortheloss.sticknodes.animationscreen.Magnifier r10 = r9._magnifier
            r10.setEnabled(r0)
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r10 = r9._arrowsWindow
            r10.setEnabled(r0)
            r9.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r10 = r9._framesModuleRef
            r10.setNeedsToBeDrawn()
            goto Lb2
        L63:
            org.fortheloss.sticknodes.data.SessionData r10 = r9._sessionDataRef
            boolean r10 = r10.getQuickMenuIsEnabled()
            if (r10 == 0) goto L6e
            r9.showQuickMenu()
        L6e:
            r9.enableQuickResizeTool(r1)
            org.fortheloss.sticknodes.data.SessionData r10 = r9._sessionDataRef
            int r10 = r10.getScreen()
            r11 = 0
            if (r10 != 0) goto L80
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r10 = r9._animateToolsModuleRef
            r10.userChoosingFigure(r0, r11, r11, r11)
            goto L9b
        L80:
            org.fortheloss.sticknodes.data.SessionData r10 = r9._sessionDataRef
            int r10 = r10.getScreen()
            if (r10 != r12) goto L8e
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r10 = r9._movieclipToolsModuleRef
            r10.userChoosingFigure(r0, r11, r11, r11)
            goto L9b
        L8e:
            org.fortheloss.sticknodes.data.SessionData r10 = r9._sessionDataRef
            int r10 = r10.getScreen()
            if (r10 != r1) goto L9b
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r10 = r9._createToolsModuleRef
            r10.userChoosingFigure(r0, r11, r11, r11)
        L9b:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r10 = r9._framesModuleRef
            r10.disableAll(r0, r1)
            org.fortheloss.sticknodes.animationscreen.Magnifier r10 = r9._magnifier
            r10.setEnabled(r1)
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r10 = r9._arrowsWindow
            r10.setEnabled(r1)
            r9.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r10 = r9._framesModuleRef
            r10.setNeedsToBeDrawn()
        Lb2:
            return
    }

    public void pushBranchBack(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            if (r4 == 0) goto L41
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L41
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction) r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4.getStickfigure()
            r0.initialize(r1, r3)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4.getStickfigure()
            r1.pushBranchBack(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 400(0x190, float:5.6E-43)
            r1.<init>(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            r4.getAllNodeDrawOrderIndices(r1)
            java.util.ArrayList r4 = r0.getDrawOrdersBeforeList()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L41
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            r4.addUserAction(r0)
            r3.setNeedsToBeDrawn()
        L41:
            return
    }

    public void pushBranchForward(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            if (r4 == 0) goto L44
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L44
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction) r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4.getStickfigure()
            r0.initialize(r1, r3)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4.getStickfigure()
            r1.pushBranchForward(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 400(0x190, float:5.6E-43)
            r1.<init>(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            r4.getAllNodeDrawOrderIndices(r1)
            java.util.ArrayList r4 = r0.getDrawOrdersBeforeList()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L41
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            r4.addUserAction(r0)
            r3.setNeedsToBeDrawn()
        L41:
            r3.setNeedsToBeDrawn()
        L44:
            return
    }

    public void pushSegmentBack(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            if (r4 == 0) goto L30
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L30
        L9:
            int r0 = r4.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4.getStickfigure()
            boolean r1 = r1.pushSegmentBack(r4)
            if (r1 == 0) goto L30
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction) r1
            int r2 = r4.getDrawOrderIndex()
            r1.initialize(r4, r0, r2)
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            r4.addUserAction(r1)
        L30:
            return
    }

    public void pushSegmentForward(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            if (r4 == 0) goto L30
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L30
        L9:
            int r0 = r4.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4.getStickfigure()
            boolean r1 = r1.pushSegmentForward(r4)
            if (r1 == 0) goto L30
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction) r1
            int r2 = r4.getDrawOrderIndex()
            r1.initialize(r4, r0, r2)
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            r4.addUserAction(r1)
        L30:
            return
    }

    public void readSessionSaveData(org.fortheloss.sticknodes.data.SessionSaveData r3) {
            r2 = this;
            if (r3 == 0) goto L35
            int r0 = r3.version
            r1 = 251(0xfb, float:3.52E-43)
            if (r0 < r1) goto L35
            float r0 = r3.guidelineX
            r2._guidelineX = r0
            float r0 = r3.guidelineY
            r2._guidelineY = r0
            boolean r0 = r3.projectIsFullyOpened
            if (r0 == 0) goto L35
            float r0 = r3.zoom
            r2._zoom = r0
            r2._zoomGoal = r0
            r2.calculateNearestNotchFrom(r0)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animateToolsModuleRef
            float r1 = r2._zoomGoal
            r0.updateZoomDisplay(r1)
            float r0 = r3.zoomPositionX
            float r1 = r3.zoomPositionY
            r2.setZoomPosition(r0, r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r3 = r3.uvQuality
            r0.setFiltersQuality(r3)
            r2.onFiltersQualityChanged()
        L35:
            return
    }

    public void rememberZoom() {
            r2 = this;
            int r0 = r2._currentScreenForZoomData
            if (r0 != 0) goto L13
            int r0 = r2._zoomNotch
            r2._rememberedZoomNotchAnimationScreen = r0
            com.badlogic.gdx.math.Vector2 r0 = r2._zoomPosition
            float r1 = r0.x
            r2._rememberedZoomPositionXAnimationScreen = r1
            float r0 = r0.y
            r2._rememberedZoomPositionYAnimationScreen = r0
            goto L24
        L13:
            r1 = 2
            if (r0 != r1) goto L24
            int r0 = r2._zoomNotch
            r2._rememberedZoomNotchMovieclipScreen = r0
            com.badlogic.gdx.math.Vector2 r0 = r2._zoomPosition
            float r1 = r0.x
            r2._rememberedZoomPositionXMovieclipScreen = r1
            float r0 = r0.y
            r2._rememberedZoomPositionYMovieclipScreen = r0
        L24:
            return
    }

    public void renderMagnifierView(com.badlogic.gdx.graphics.g2d.Batch r27, com.badlogic.gdx.graphics.glutils.FrameBuffer r28, com.badlogic.gdx.utils.viewport.Viewport r29, float r30, float r31, float r32) {
            r26 = this;
            r0 = r26
            r14 = r27
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            r28.bind()
            com.badlogic.gdx.math.Matrix4 r1 = r0._rememberedMatrix
            com.badlogic.gdx.math.Matrix4 r2 = r27.getTransformMatrix()
            r1.set(r2)
            r15 = 0
            r1 = r29
            r1.apply(r15)
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r0._shapeRendererRef
            com.badlogic.gdx.graphics.Camera r1 = r29.getCamera()
            com.badlogic.gdx.math.Matrix4 r1 = r1.combined
            r2.setProjectionMatrix(r1)
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r1 = r1.getProjectionMatrix()
            r14.setProjectionMatrix(r1)
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r1 = r1.getTransformMatrix()
            r14.setTransformMatrix(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            int r1 = r1.getScreen()
            r13 = 1
            if (r1 != 0) goto L4d
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            com.badlogic.gdx.graphics.Color r1 = r1.getBackgroundColor()
        L4b:
            r8 = r1
            goto L63
        L4d:
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 != r13) goto L5c
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r0._createToolsModuleRef
            com.badlogic.gdx.graphics.Color r1 = r1.getBackgroundColor()
            goto L4b
        L5c:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1 = r0._movieclipToolsModuleRef
            com.badlogic.gdx.graphics.Color r1 = r1.getBackgroundColor()
            goto L4b
        L63:
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            float r2 = r8.r
            float r3 = r8.g
            float r4 = r8.b
            r12 = 1065353216(0x3f800000, float:1.0)
            r1.glClearColor(r2, r3, r4, r12)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r2 = 16384(0x4000, float:2.2959E-41)
            r1.glClear(r2)
            int r1 = r28.getWidth()
            float r1 = (float) r1
            r11 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r11
            float r16 = r1 - r30
            int r1 = r28.getHeight()
            float r1 = (float) r1
            float r1 = r1 * r11
            float r17 = r1 - r31
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r2 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r1.begin(r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 != 0) goto Lfe
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            boolean r2 = r1.isUsingGradient()
            if (r2 == 0) goto Lfe
            com.badlogic.gdx.graphics.Color r10 = r1.getGradientColor()
            boolean r2 = r1.isExpandedGradient()
            if (r2 == 0) goto Lb5
            float r2 = r0._viewableCanvasWidth
            goto Lb9
        Lb5:
            float r2 = r26.getWidth()
        Lb9:
            boolean r1 = r1.isExpandedGradient()
            if (r1 == 0) goto Lc2
            float r1 = r0._viewableCanvasHeight
            goto Lc6
        Lc2:
            float r1 = r26.getHeight()
        Lc6:
            int r3 = r28.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r11
            float r4 = r30 * r32
            float r3 = r3 - r4
            float r4 = r26.getWidth()
            float r4 = r2 - r4
            float r4 = r4 * r32
            float r4 = r4 * r11
            float r3 = r3 - r4
            int r4 = r28.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r11
            float r5 = r31 * r32
            float r4 = r4 - r5
            float r5 = r26.getHeight()
            float r5 = r1 - r5
            float r5 = r5 * r32
            float r5 = r5 * r11
            float r4 = r4 - r5
            org.fortheloss.sticknodes.SNShapeRenderer r5 = r0._shapeRendererRef
            float r6 = r2 * r32
            float r1 = r1 * r32
            r2 = r5
            r5 = r6
            r6 = r1
            r7 = r8
            r9 = r10
            r2.rect(r3, r4, r5, r6, r7, r8, r9, r10)
        Lfe:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r0._figuresRef
            if (r1 != 0) goto L104
            r10 = 0
            goto L109
        L104:
            int r1 = r1.size()
            r10 = r1
        L109:
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = r1.getCurrentlySelectedStickfigure()
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r8 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r7 = r1.getCurrentlySelectedMC()
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r18 = r1.getCurrentlySelectedSprite()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r19 = r1.getNodeDrawTools()
            if (r10 <= 0) goto L2bf
            r1 = 0
        L12a:
            if (r1 >= r10) goto L13a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r0._figuresRef
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.validateDirtyNodes()
            int r1 = r1 + 1
            goto L12a
        L13a:
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 == r13) goto L14e
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            boolean r1 = r1.getIsShowingOutline()
            if (r1 == 0) goto L14b
            goto L14e
        L14b:
            r20 = 0
            goto L150
        L14e:
            r20 = 1
        L150:
            int r1 = r28.getWidth()
            float r1 = (float) r1
            float r1 = r1 * r11
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_CENTER_X = r1
            int r1 = r28.getHeight()
            float r1 = (float) r1
            float r1 = r1 * r11
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_CENTER_Y = r1
            int r1 = r28.getWidth()
            float r1 = (float) r1
            r2 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 * r2
            int r3 = r28.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r2
            float r1 = r1 * r3
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_DISTANCE_SQUARED = r1
            r11 = 0
        L177:
            if (r11 >= r10) goto L1ba
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r0._figuresRef
            java.lang.Object r1 = r1.get(r11)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r0._shapeRendererRef
            r4 = 0
            r21 = 0
            r22 = 1
            r3 = r27
            r5 = r16
            r6 = r17
            r15 = r7
            r7 = r30
            r28 = r8
            r8 = r31
            r23 = r9
            r9 = r32
            r24 = r10
            r10 = r20
            r25 = r11
            r11 = r28
            r12 = r21
            r21 = r15
            r15 = 1
            r13 = r22
            r1.drawLimbs(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            int r11 = r25 + 1
            r8 = r28
            r7 = r21
            r9 = r23
            r10 = r24
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 1
            r15 = 0
            goto L177
        L1ba:
            r21 = r7
            r28 = r8
            r23 = r9
            r24 = r10
            r15 = 1
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            r1.end()
            org.fortheloss.sticknodes.animationscreen.Magnifier r1 = r0._magnifier
            boolean r1 = r1.getIsShowingNodes()
            if (r1 == 0) goto L1e3
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 != r15) goto L1e1
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            boolean r1 = r1.getIsOnlyDrawingMainNodes()
            if (r1 == 0) goto L1e1
            goto L1e3
        L1e1:
            r13 = 1
            goto L1e4
        L1e3:
            r13 = 0
        L1e4:
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            int r1 = r1.getMode()
            if (r1 != 0) goto L2bf
            if (r13 == 0) goto L2bf
            r27.begin()
            r1 = 1065353216(0x3f800000, float:1.0)
            r14.setColor(r1, r1, r1, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 != r15) goto L210
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            boolean r1 = r1.getIsShowingCreationStaticNodes()
            if (r1 == 0) goto L210
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r0._createToolsModuleRef
            boolean r1 = r1.userIsTestingSmartStretch()
            if (r1 != 0) goto L210
            r12 = 1
            goto L211
        L210:
            r12 = 0
        L211:
            r13 = r24
            r11 = 0
        L214:
            if (r11 >= r13) goto L251
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r0._figuresRef
            java.lang.Object r1 = r1.get(r11)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            r10 = r23
            r9 = r21
            if (r1 == r10) goto L22a
            if (r1 != r9) goto L227
            goto L22a
        L227:
            r20 = 0
            goto L22c
        L22a:
            r20 = 1
        L22c:
            r21 = 0
            r2 = r19
            r3 = r16
            r4 = r17
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r12
            r22 = r9
            r9 = r20
            r20 = r10
            r10 = r28
            r23 = r11
            r11 = r21
            r1.drawNodes(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            int r11 = r23 + 1
            r23 = r20
            r21 = r22
            goto L214
        L251:
            r22 = r21
            r20 = r23
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            boolean r1 = r1.getIsShowingNeighborNodes()
            if (r1 == 0) goto L2bc
            r11 = r28
            if (r11 == 0) goto L2bc
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            boolean r10 = r1.getNeighborNodesAffectedByJoins()
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            boolean r13 = r1.getIsOnlyDrawingMainNodes()
            if (r20 == 0) goto L288
            boolean r1 = r11 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r1 == 0) goto L288
            r9 = r11
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = (org.fortheloss.sticknodes.stickfigure.StickNode) r9
            r1 = r20
            r2 = r19
            r3 = r16
            r4 = r17
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r12
            r1.highlightChildrenAndParentNodes(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L288:
            if (r18 == 0) goto L2a1
            boolean r1 = r11 instanceof org.fortheloss.sticknodes.sprite.SpriteNode
            if (r1 == 0) goto L2a1
            r1 = r18
            r2 = r19
            r3 = r16
            r4 = r17
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r13
            r1.highlightNodes(r2, r3, r4, r5, r6, r7, r8)
            goto L2bc
        L2a1:
            if (r22 == 0) goto L2bc
            boolean r1 = r11 instanceof org.fortheloss.sticknodes.movieclip.MCNode
            if (r1 == 0) goto L2bc
            r8 = r11
            org.fortheloss.sticknodes.movieclip.MCNode r8 = (org.fortheloss.sticknodes.movieclip.MCNode) r8
            r1 = r22
            r2 = r19
            r3 = r16
            r4 = r17
            r5 = r30
            r6 = r31
            r7 = r32
            r9 = r13
            r1.highlightNodes(r2, r3, r4, r5, r6, r7, r8, r9)
        L2bc:
            r27.end()
        L2bf:
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            boolean r1 = r1.isDrawing()
            if (r1 == 0) goto L2cc
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            r1.end()
        L2cc:
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r26.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r1 = r1.getViewport()
            r2 = 0
            r1.apply(r2)
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r26.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r2 = r2.getViewport()
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r0._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r1 = r1.getProjectionMatrix()
            r14.setProjectionMatrix(r1)
            com.badlogic.gdx.math.Matrix4 r1 = r0._rememberedMatrix
            r14.setTransformMatrix(r1)
            return
    }

    public void resetSegmentLength(org.fortheloss.sticknodes.stickfigure.StickNode r2, boolean r3) {
            r1 = this;
            if (r2 == 0) goto L2f
            boolean r3 = r2.isMainNode()
            if (r3 == 0) goto L9
            goto L2f
        L9:
            org.fortheloss.sticknodes.data.SessionData r3 = r1._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r0 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r3 = r3.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r3 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r3
            r3.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            r0.addUserAction(r3)
            r2.resetLength()
            r1.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r2 = r1._sessionDataRef
            int r2 = r2.getScreen()
            r3 = 1
            if (r2 == r3) goto L2f
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r1._framesModuleRef
            r2.setNeedsToBeDrawn()
        L2f:
            return
    }

    public void resetSegmentThickness(org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r2 = this;
            if (r3 == 0) goto L2f
            boolean r0 = r3.isMainNode()
            if (r0 == 0) goto L9
            goto L2f
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r3.resetThickness()
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r0 = 1
            if (r3 == r0) goto L2f
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L2f:
            return
    }

    public void resetZoom() {
            r1 = this;
            r0 = 0
            r1.resetZoom(r0)
            return
    }

    public void resetZoom(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L1e
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            int r4 = r4.getScreen()
            if (r4 != 0) goto L14
            int r4 = r3._rememberedZoomNotchAnimationScreen
            float r0 = r3._rememberedZoomPositionXAnimationScreen
            float r1 = r3._rememberedZoomPositionYAnimationScreen
            r3.resetZoomNotch(r4, r0, r1)
            goto L31
        L14:
            int r4 = r3._rememberedZoomNotchMovieclipScreen
            float r0 = r3._rememberedZoomPositionXMovieclipScreen
            float r1 = r3._rememberedZoomPositionYMovieclipScreen
            r3.resetZoomNotch(r4, r0, r1)
            goto L31
        L1e:
            r4 = 10
            float r0 = r3.getWidth()
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            float r2 = r3.getHeight()
            float r2 = r2 * r1
            r3.resetZoomNotch(r4, r0, r2)
        L31:
            return
    }

    public void resetZoomNotch(int r1, float r2, float r3) {
            r0 = this;
            r0._zoomNotch = r1
            r0.calculateZoomFromZoomNotch()
            com.badlogic.gdx.math.Vector2 r1 = r0._zoomPosition
            r1.set(r2, r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            int r1 = r1.getScreen()
            r2 = 1
            if (r1 != 0) goto L1b
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1 = r0._animateToolsModuleRef
            float r3 = r0._zoom
            r1.updateZoomDisplay(r3)
            goto L32
        L1b:
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 != r2) goto L2b
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r0._createToolsModuleRef
            float r3 = r0._zoom
            r1.updateZoomDisplay(r3)
            goto L32
        L2b:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1 = r0._movieclipToolsModuleRef
            float r3 = r0._zoom
            r1.updateZoomDisplay(r3)
        L32:
            r0._tracingFBODirty = r2
            r0._previousOnionSkinDirty = r2
            r0._nextOnionSkinDirty = r2
            r0.setNeedsToBeDrawn()
            return
    }

    public void resetZoomValue(float r1, float r2, float r3, boolean r4) {
            r0 = this;
            r0._zoomGoal = r1
            com.badlogic.gdx.math.Vector2 r1 = r0._zoomPosition
            r1.set(r2, r3)
            if (r4 != 0) goto Ld
            float r1 = r0._zoomGoal
            r0._zoom = r1
        Ld:
            float r1 = r0._zoomGoal
            r0.calculateNearestNotchFrom(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            int r1 = r1.getScreen()
            r2 = 1
            if (r1 != 0) goto L23
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1 = r0._animateToolsModuleRef
            float r3 = r0._zoom
            r1.updateZoomDisplay(r3)
            goto L3a
        L23:
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 != r2) goto L33
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r0._createToolsModuleRef
            float r3 = r0._zoom
            r1.updateZoomDisplay(r3)
            goto L3a
        L33:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1 = r0._movieclipToolsModuleRef
            float r3 = r0._zoom
            r1.updateZoomDisplay(r3)
        L3a:
            r0._tracingFBODirty = r2
            r0._previousOnionSkinDirty = r2
            r0._nextOnionSkinDirty = r2
            r0.setNeedsToBeDrawn()
            return
    }

    public void reverseSegmentGradient(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L38
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L38
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setReverseGradient(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r0 = 1
            if (r3 == r0) goto L38
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            r3.onStickNodeColorModified(r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L38:
            return
    }

    public void rotateCameraTo(float r5, org.fortheloss.sticknodes.animationscreen.FrameCamera r6, float r7, boolean r8) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            if (r8 == 0) goto L36
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 2
            if (r1 == 0) goto L22
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction
            if (r3 == 0) goto L22
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L22
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getFrameCamera()
            if (r1 != r6) goto L22
            r0 = 0
        L22:
            if (r0 == 0) goto L36
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r0
            r0.initialize(r6, r7, r2)
            org.fortheloss.sticknodes.data.SessionData r7 = r4._sessionDataRef
            r7.addUserAction(r0)
        L36:
            r6.setCameraRotation(r5)
            r4.setNeedsToBeDrawn()
            if (r8 == 0) goto L43
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
        L43:
            return
    }

    public void rotateMCTo(float r4, org.fortheloss.sticknodes.movieclip.MCReference r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            byte r0 = r5.isLockedToCamera()
            r1 = 2
            if (r0 != r1) goto Lb
            return
        Lb:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            if (r1 == 0) goto L21
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCSetRotationAction
            if (r2 == 0) goto L21
            org.fortheloss.sticknodes.data.useractions.MCSetRotationAction r1 = (org.fortheloss.sticknodes.data.useractions.MCSetRotationAction) r1
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCRef()
            if (r1 != r5) goto L21
            r0 = 0
        L21:
            if (r0 == 0) goto L35
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCSetRotationAction> r1 = org.fortheloss.sticknodes.data.useractions.MCSetRotationAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCSetRotationAction r0 = (org.fortheloss.sticknodes.data.useractions.MCSetRotationAction) r0
            r0.initialize(r5)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            r1.addUserAction(r0)
        L35:
            r5.setFigureRotation(r4)
            r3.setNeedsToBeDrawn()
            return
    }

    public void rotateSegmentTo(float r5, org.fortheloss.sticknodes.stickfigure.StickNode r6, float r7, boolean r8) {
            r4 = this;
            if (r6 == 0) goto L65
            boolean r0 = r6.isMainNode()
            if (r0 == 0) goto L9
            goto L65
        L9:
            r0 = 1
            if (r8 == 0) goto L49
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 3
            if (r1 == 0) goto L29
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction
            if (r3 == 0) goto L29
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L29
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getStickNode()
            if (r1 != r6) goto L29
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            if (r1 == 0) goto L49
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r3 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r1
            r3 = -887581057(0xffffffffcb18967f, float:-9999999.0)
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 <= 0) goto L41
            r1.initialize(r6, r7, r2)
            goto L44
        L41:
            r1.initialize(r6, r2)
        L44:
            org.fortheloss.sticknodes.data.SessionData r7 = r4._sessionDataRef
            r7.addUserAction(r1)
        L49:
            r6.setAngle(r5)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r6.getStickfigure()
            r4.maybeUpdateJoinChain(r5)
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            int r5 = r5.getScreen()
            if (r5 == r0) goto L65
            if (r8 == 0) goto L65
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
        L65:
            return
    }

    public void rotateSpriteTo(float r5, org.fortheloss.sticknodes.sprite.SpriteRef r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            byte r0 = r6.isLockedToCamera()
            r1 = 2
            if (r0 != r1) goto Lb
            return
        Lb:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            r3 = 13
            if (r2 == 0) goto L27
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r3) goto L27
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r6) goto L27
            r0 = 0
        L27:
            if (r0 == 0) goto L3b
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r0.initialize(r6, r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L3b:
            r6.setFigureRotation(r5)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
            r4.setNeedsToBeDrawn()
            return
    }

    public void rotateStickfigureTo(float r5, org.fortheloss.sticknodes.stickfigure.Stickfigure r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            byte r0 = r6.isLockedToCamera()
            r1 = 2
            if (r0 != r1) goto Lb
            return
        Lb:
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureRotateAction
            r2 = 1
            if (r1 == 0) goto L20
            org.fortheloss.sticknodes.data.useractions.StickfigureRotateAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureRotateAction) r0
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r0.getFigure()
            if (r0 != r6) goto L20
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            if (r0 == 0) goto L35
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureRotateAction> r3 = org.fortheloss.sticknodes.data.useractions.StickfigureRotateAction.class
            java.lang.Object r1 = r1.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.StickfigureRotateAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureRotateAction) r1
            r1.initialize(r6)
            org.fortheloss.sticknodes.data.SessionData r3 = r4._sessionDataRef
            r3.addUserAction(r1)
        L35:
            r6.setFigureRotation(r5)
            r4.maybeUpdateJoinChain(r6)
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            int r5 = r5.getScreen()
            if (r5 == r2) goto L4d
            if (r0 == 0) goto L4d
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
        L4d:
            return
    }

    public void rotateTextfieldTo(float r5, org.fortheloss.sticknodes.TextfieldBox r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            boolean r0 = r6.isLockedToCamera()
            if (r0 == 0) goto La
            return
        La:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 3
            if (r1 == 0) goto L27
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction
            if (r3 == 0) goto L27
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L27
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getTextfieldBox()
            if (r1 != r6) goto L27
            r0 = 0
        L27:
            if (r0 == 0) goto L3b
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L3b:
            r6.setFigureRotation(r5)
            r4.setNeedsToBeDrawn()
            return
    }

    public void scaleFigureTo(float r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7, float r8, boolean r9) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            byte r0 = r7.isLockedToCamera()
            r1 = 2
            if (r0 != r1) goto Lb
            return
        Lb:
            r0 = 1
            if (r9 == 0) goto L91
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            r4 = -943501440(0xffffffffc7c34f80, float:-99999.0)
            if (r2 == 0) goto L55
            if (r1 == 0) goto L31
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r2 == 0) goto L31
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r0) goto L31
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L31
            goto L32
        L31:
            r3 = 1
        L32:
            if (r3 == 0) goto L91
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L49
            r2 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            r1.initialize(r2, r8, r0)
            goto L4f
        L49:
            r8 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r8
            r1.initialize(r8, r0)
        L4f:
            org.fortheloss.sticknodes.data.SessionData r8 = r5._sessionDataRef
            r8.addUserAction(r1)
            goto L91
        L55:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r2 == 0) goto L91
            if (r1 == 0) goto L6e
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r2 == 0) goto L6e
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r0) goto L6e
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L6e
            goto L6f
        L6e:
            r3 = 1
        L6f:
            if (r3 == 0) goto L91
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L86
            r2 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r2 = (org.fortheloss.sticknodes.movieclip.MCReference) r2
            r1.initialize(r2, r8, r0)
            goto L8c
        L86:
            r8 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r8 = (org.fortheloss.sticknodes.movieclip.MCReference) r8
            r1.initialize(r8, r0)
        L8c:
            org.fortheloss.sticknodes.data.SessionData r8 = r5._sessionDataRef
            r8.addUserAction(r1)
        L91:
            r7.setScale(r6)
            boolean r6 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r6 == 0) goto L9d
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r7
            r5.maybeUpdateJoinChain(r7)
        L9d:
            r5.setNeedsToBeDrawn()
            if (r9 == 0) goto Laf
            org.fortheloss.sticknodes.data.SessionData r6 = r5._sessionDataRef
            int r6 = r6.getScreen()
            if (r6 == r0) goto Laf
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r5._framesModuleRef
            r6.setNeedsToBeDrawn()
        Laf:
            return
    }

    public void scaleSegmentTo(float r4, org.fortheloss.sticknodes.stickfigure.StickNode r5) {
            r3 = this;
            if (r5 == 0) goto L4e
            boolean r0 = r5.isMainNode()
            if (r0 == 0) goto L9
            goto L4e
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            r1 = 1
            if (r0 == 0) goto L26
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction
            if (r2 == 0) goto L26
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            int r2 = r0.getLastChangedProperty()
            if (r2 != r1) goto L26
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getStickNode()
            if (r0 != r5) goto L26
            r0 = 0
            goto L27
        L26:
            r0 = 1
        L27:
            if (r0 == 0) goto L3b
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r5, r1)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r0)
        L3b:
            r5.setScale(r4)
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            int r4 = r4.getScreen()
            if (r4 == r1) goto L4e
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModuleRef
            r4.setNeedsToBeDrawn()
        L4e:
            return
    }

    public void selectFigure(int r4, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5) {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._figuresRef
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 0
            if (r5 == 0) goto L38
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._figuresRef
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L14:
            if (r1 < 0) goto L22
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r3._figuresRef
            java.lang.Object r2 = r2.get(r1)
            if (r5 != r2) goto L1f
            goto L23
        L1f:
            int r1 = r1 + (-1)
            goto L14
        L22:
            r1 = 0
        L23:
            int r1 = r1 + r4
            if (r1 >= 0) goto L2d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r3._figuresRef
            int r4 = r4.size()
            goto L40
        L2d:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r3._figuresRef
            int r4 = r4.size()
            if (r1 < r4) goto L36
            goto L42
        L36:
            r0 = r1
            goto L42
        L38:
            if (r4 >= 0) goto L42
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r3._figuresRef
            int r4 = r4.size()
        L40:
            int r0 = r4 + (-1)
        L42:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r3._figuresRef
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r5 == 0) goto L56
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r4
            r5.setSessionSelectionToStickfigure(r4)
            goto L69
        L56:
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r5 == 0) goto L62
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r3._animationScreenRef
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = (org.fortheloss.sticknodes.sprite.SpriteRef) r4
            r5.setSessionSelectionToSprite(r4)
            goto L69
        L62:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r3._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r4 = (org.fortheloss.sticknodes.movieclip.MCReference) r4
            r5.setSessionSelectionToMC(r4)
        L69:
            return
    }

    public void selectFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._figuresRef
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L3d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r2._figuresRef
            java.lang.Object r1 = r1.get(r0)
            if (r1 != r3) goto L3a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r2._figuresRef
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            boolean r0 = r3 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L26
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r3
            r0.setSessionSelectionToStickfigure(r3)
            goto L3d
        L26:
            boolean r0 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L32
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = (org.fortheloss.sticknodes.sprite.SpriteRef) r3
            r0.setSessionSelectionToSprite(r3)
            goto L3d
        L32:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r3 = (org.fortheloss.sticknodes.movieclip.MCReference) r3
            r0.setSessionSelectionToMC(r3)
            goto L3d
        L3a:
            int r0 = r0 + (-1)
            goto L8
        L3d:
            return
    }

    public void selectFigure(org.fortheloss.sticknodes.stickfigure.INode r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r0 == 0) goto Lc
            r0 = r4
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            goto L1f
        Lc:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.movieclip.MCNode
            if (r0 == 0) goto L18
            r0 = r4
            org.fortheloss.sticknodes.movieclip.MCNode r0 = (org.fortheloss.sticknodes.movieclip.MCNode) r0
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getMCReference()
            goto L1f
        L18:
            r0 = r4
            org.fortheloss.sticknodes.sprite.SpriteNode r0 = (org.fortheloss.sticknodes.sprite.SpriteNode) r0
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getSpriteReference()
        L1f:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._figuresRef
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L27:
            if (r1 < 0) goto L3a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r3._figuresRef
            java.lang.Object r2 = r2.get(r1)
            if (r2 != r0) goto L37
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r0.setSessionSelectionToNode(r4)
            goto L3a
        L37:
            int r1 = r1 + (-1)
            goto L27
        L3a:
            return
    }

    public void selectLastFigure() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._figuresRef
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return
        L9:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._figuresRef
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 == 0) goto L23
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r1.setSessionSelectionToStickfigure(r0)
            goto L36
        L23:
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r1 == 0) goto L2f
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            r1.setSessionSelectionToSprite(r0)
            goto L36
        L2f:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = (org.fortheloss.sticknodes.movieclip.MCReference) r0
            r1.setSessionSelectionToMC(r0)
        L36:
            r2.setNeedsToBeDrawn()
            return
    }

    public void selectLastTextfield() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r2._textfieldBoxesRef
            if (r0 == 0) goto L21
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            goto L21
        Lb:
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r2._textfieldBoxesRef
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.TextfieldBox r0 = (org.fortheloss.sticknodes.TextfieldBox) r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.setSessionSelectionToTextFieldBox(r0)
            r2.setNeedsToBeDrawn()
        L21:
            return
    }

    public void sendBranchToBack(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            if (r4 == 0) goto L44
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L44
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction) r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4.getStickfigure()
            r0.initialize(r1, r3)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4.getStickfigure()
            r1.sendBranchToBack(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 400(0x190, float:5.6E-43)
            r1.<init>(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            r4.getAllNodeDrawOrderIndices(r1)
            java.util.ArrayList r4 = r0.getDrawOrdersBeforeList()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L41
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            r4.addUserAction(r0)
            r3.setNeedsToBeDrawn()
        L41:
            r3.setNeedsToBeDrawn()
        L44:
            return
    }

    public void sendBranchToFront(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            if (r4 == 0) goto L44
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L44
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction) r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4.getStickfigure()
            r0.initialize(r1, r3)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4.getStickfigure()
            r1.sendBranchToFront(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 400(0x190, float:5.6E-43)
            r1.<init>(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            r4.getAllNodeDrawOrderIndices(r1)
            java.util.ArrayList r4 = r0.getDrawOrdersBeforeList()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L41
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            r4.addUserAction(r0)
            r3.setNeedsToBeDrawn()
        L41:
            r3.setNeedsToBeDrawn()
        L44:
            return
    }

    public void sendSegmentToBack(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            if (r4 == 0) goto L30
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L30
        L9:
            int r0 = r4.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4.getStickfigure()
            boolean r1 = r1.sendSegmentToBack(r4)
            if (r1 == 0) goto L30
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction) r1
            int r2 = r4.getDrawOrderIndex()
            r1.initialize(r4, r0, r2)
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            r4.addUserAction(r1)
        L30:
            return
    }

    public void sendSegmentToFront(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            if (r4 == 0) goto L30
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L30
        L9:
            int r0 = r4.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4.getStickfigure()
            boolean r1 = r1.sendSegmentToFront(r4)
            if (r1 == 0) goto L30
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction) r1
            int r2 = r4.getDrawOrderIndex()
            r1.initialize(r4, r0, r2)
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            r4.addUserAction(r1)
        L30:
            return
    }

    public void setCameraWidescreen(org.fortheloss.sticknodes.animationscreen.FrameCamera r3, boolean r4) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r0
            r0.initialize(r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r3.setIsWidescreen(r4)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setCameraWobbleRotation(org.fortheloss.sticknodes.animationscreen.FrameCamera r3, boolean r4) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r0
            r0.initialize(r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r3.setWobbleRotation(r4)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setCameraWobbleRotationIntensity(org.fortheloss.sticknodes.animationscreen.FrameCamera r5, float r6) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 5
            if (r1 == 0) goto L20
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction
            if (r3 == 0) goto L20
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L20
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getFrameCamera()
            if (r1 != r5) goto L20
            r0 = 0
        L20:
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r0
            r0.initialize(r5, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L34:
            r5.setWobbleRotationIntensity(r6)
            r4.setNeedsToBeDrawn()
            return
    }

    public void setCameraWobbleScale(org.fortheloss.sticknodes.animationscreen.FrameCamera r3, boolean r4) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r0
            r0.initialize(r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r3.setWobbleScale(r4)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setCameraWobbleSpeed(org.fortheloss.sticknodes.animationscreen.FrameCamera r5, float r6) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 3
            if (r1 == 0) goto L20
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction
            if (r3 == 0) goto L20
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L20
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getFrameCamera()
            if (r1 != r5) goto L20
            r0 = 0
        L20:
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r0
            r0.initialize(r5, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L34:
            r5.setWobbleSpeed(r6)
            r4.setNeedsToBeDrawn()
            return
    }

    public void setCameraWobbleXY(org.fortheloss.sticknodes.animationscreen.FrameCamera r3, boolean r4) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r0
            r0.initialize(r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r3.setWobbleXY(r4)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setCameraWobbleXYIntensity(org.fortheloss.sticknodes.animationscreen.FrameCamera r5, int r6) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 4
            if (r1 == 0) goto L20
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction
            if (r3 == 0) goto L20
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L20
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getFrameCamera()
            if (r1 != r5) goto L20
            r0 = 0
        L20:
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r0
            r0.initialize(r5, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L34:
            r5.setWobbleXYIntensity(r6)
            r4.setNeedsToBeDrawn()
            return
    }

    public void setCircleIsHollow(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L38
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L38
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setCircleIsHollow(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r0 = 1
            if (r3 == r0) goto L38
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            r3.onStickNodeColorModified(r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L38:
            return
    }

    public void setCircleOutlineColor(com.badlogic.gdx.graphics.Color r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L38
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L38
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setCircleOutlineColor(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r0 = 1
            if (r3 == r0) goto L38
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            r3.onStickNodeColorModified(r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L38:
            return
    }

    public void setConnectorNodeMethod(int r3, org.fortheloss.sticknodes.stickfigure.Connector r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            int r0 = r4.getNodeMethod()
            if (r0 != r3) goto La
            return
        La:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setNodeMethod(r3)
            r2.setNeedsToBeDrawn()
            return
    }

    public void setConnectorNodePercent(float r5, org.fortheloss.sticknodes.stickfigure.Connector r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            float r0 = r6.getNodePercent()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto Lc
            return
        Lc:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction
            r3 = 2
            if (r2 == 0) goto L27
            org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r3) goto L27
            org.fortheloss.sticknodes.stickfigure.Connector r1 = r1.getConnector()
            if (r1 != r6) goto L27
            r0 = 0
        L27:
            if (r0 == 0) goto L3b
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction) r0
            r0.initialize(r6, r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L3b:
            r6.setNodePercent(r5)
            r4.setNeedsToBeDrawn()
            return
    }

    public void setConnectorNodeReversed(boolean r3, org.fortheloss.sticknodes.stickfigure.Connector r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setNodeReversed(r3)
            r2.setNeedsToBeDrawn()
            return
    }

    public void setConnectorNodeValue(float r4, org.fortheloss.sticknodes.stickfigure.Connector r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            float r0 = r5.getNodeValue()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lc
            return
        Lc:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction
            r2 = 1
            if (r1 == 0) goto L27
            org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction) r0
            int r1 = r0.getLastChangedProperty()
            if (r1 != r2) goto L27
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r0.getConnector()
            if (r0 != r5) goto L27
            r0 = 0
            goto L28
        L27:
            r0 = 1
        L28:
            if (r0 == 0) goto L3c
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction) r0
            r0.initialize(r5, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            r1.addUserAction(r0)
        L3c:
            r5.setNodeValue(r4)
            r3.setNeedsToBeDrawn()
            return
    }

    public void setDrawNodesOnTracedFbo(boolean r2) {
            r1 = this;
            boolean r0 = r1._drawNodesOnTracedFbo
            if (r0 == r2) goto L7
            r1.flagTracingFBODirty()
        L7:
            r1._drawNodesOnTracedFbo = r2
            return
    }

    public void setFigureBlurTo(float r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            r4 = 3
            if (r2 == 0) goto L3d
            if (r1 == 0) goto L25
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r2 == 0) goto L25
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L25
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L25
            r0 = 0
        L25:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9a
        L3d:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L6e
            if (r1 == 0) goto L56
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r2 == 0) goto L56
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L56
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L56
            r0 = 0
        L56:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9a
        L6e:
            if (r1 == 0) goto L83
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r2 == 0) goto L83
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L83
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L83
            r0 = 0
        L83:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L9a:
            r7.setBlur(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigureDropShadowAlphaTo(float r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            r4 = 9
            if (r2 == 0) goto L3e
            if (r1 == 0) goto L26
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r2 == 0) goto L26
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L26
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L26
            r0 = 0
        L26:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9d
        L3e:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L6f
            if (r1 == 0) goto L57
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r2 == 0) goto L57
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L57
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L57
            r0 = 0
        L57:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9d
        L6f:
            r2 = 11
            if (r1 == 0) goto L86
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r4 == 0) goto L86
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r4 = r1.getLastChangedProperty()
            if (r4 != r2) goto L86
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L86
            r0 = 0
        L86:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L9d:
            r7.setDsAlpha(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigureDropShadowAngleTo(int r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            r4 = 11
            if (r2 == 0) goto L3e
            if (r1 == 0) goto L26
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r2 == 0) goto L26
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L26
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L26
            r0 = 0
        L26:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9d
        L3e:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L6f
            if (r1 == 0) goto L57
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r2 == 0) goto L57
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L57
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L57
            r0 = 0
        L57:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9d
        L6f:
            r2 = 13
            if (r1 == 0) goto L86
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r4 == 0) goto L86
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r4 = r1.getLastChangedProperty()
            if (r4 != r2) goto L86
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L86
            r0 = 0
        L86:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L9d:
            r7.setDsAngle(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigureDropShadowBlurTo(float r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            r4 = 12
            if (r2 == 0) goto L3e
            if (r1 == 0) goto L26
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r2 == 0) goto L26
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L26
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L26
            r0 = 0
        L26:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9d
        L3e:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L6f
            if (r1 == 0) goto L57
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r2 == 0) goto L57
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L57
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L57
            r0 = 0
        L57:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9d
        L6f:
            r2 = 14
            if (r1 == 0) goto L86
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r4 == 0) goto L86
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r4 = r1.getLastChangedProperty()
            if (r4 != r2) goto L86
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L86
            r0 = 0
        L86:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L9d:
            r7.setDsBlur(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigureDropShadowColor(com.badlogic.gdx.graphics.Color r3, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L1d
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L1d:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L37
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L37:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
        L4c:
            r4.setDsColor(r3)
            r2.setNeedsToBeDrawn()
            return
    }

    public void setFigureDropShadowDistanceTo(int r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            r4 = 10
            if (r2 == 0) goto L3e
            if (r1 == 0) goto L26
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r2 == 0) goto L26
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L26
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L26
            r0 = 0
        L26:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9d
        L3e:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L6f
            if (r1 == 0) goto L57
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r2 == 0) goto L57
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L57
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L57
            r0 = 0
        L57:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9d
        L6f:
            r2 = 12
            if (r1 == 0) goto L86
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r4 == 0) goto L86
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r4 = r1.getLastChangedProperty()
            if (r4 != r2) goto L86
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L86
            r0 = 0
        L86:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L9d:
            r7.setDsDistance(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigureGlowColor(com.badlogic.gdx.graphics.Color r3, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r2 = this;
            if (r4 == 0) goto L54
            if (r3 != 0) goto L5
            goto L54
        L5:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L1f
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4e
        L1f:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L39
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4e
        L39:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
        L4e:
            r4.setGlowColor(r3)
            r2.setNeedsToBeDrawn()
        L54:
            return
    }

    public void setFigureGlowIntensityTo(float r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            r4 = 7
            if (r2 == 0) goto L3d
            if (r1 == 0) goto L25
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r2 == 0) goto L25
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L25
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L25
            r0 = 0
        L25:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9a
        L3d:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L6e
            if (r1 == 0) goto L56
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r2 == 0) goto L56
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L56
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L56
            r0 = 0
        L56:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9a
        L6e:
            if (r1 == 0) goto L83
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r2 == 0) goto L83
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L83
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L83
            r0 = 0
        L83:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L9a:
            r7.setGlowIntensity(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigureGlowTo(float r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            r4 = 6
            if (r2 == 0) goto L3d
            if (r1 == 0) goto L25
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r2 == 0) goto L25
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L25
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L25
            r0 = 0
        L25:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9a
        L3d:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L6e
            if (r1 == 0) goto L56
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r2 == 0) goto L56
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L56
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L56
            r0 = 0
        L56:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9a
        L6e:
            if (r1 == 0) goto L83
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r2 == 0) goto L83
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L83
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L83
            r0 = 0
        L83:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L9a:
            r7.setGlow(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigureHueShiftTo(float r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            r4 = 8
            if (r2 == 0) goto L3e
            if (r1 == 0) goto L26
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r2 == 0) goto L26
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L26
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L26
            r0 = 0
        L26:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9d
        L3e:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L6f
            if (r1 == 0) goto L57
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r2 == 0) goto L57
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L57
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L57
            r0 = 0
        L57:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9d
        L6f:
            r2 = 10
            if (r1 == 0) goto L86
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r4 == 0) goto L86
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r4 = r1.getLastChangedProperty()
            if (r4 != r2) goto L86
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L86
            r0 = 0
        L86:
            if (r0 == 0) goto L9d
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L9d:
            r7.setHueShift(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigureMotionBlurAngle(int r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            if (r2 == 0) goto L3e
            r2 = 13
            if (r1 == 0) goto L26
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r4 == 0) goto L26
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r4 = r1.getLastChangedProperty()
            if (r4 != r2) goto L26
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L26
            r0 = 0
        L26:
            if (r0 == 0) goto L9f
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9f
        L3e:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L71
            r2 = 18
            if (r1 == 0) goto L59
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r4 == 0) goto L59
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r4 = r1.getLastChangedProperty()
            if (r4 != r2) goto L59
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L59
            r0 = 0
        L59:
            if (r0 == 0) goto L9f
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9f
        L71:
            r2 = 15
            if (r1 == 0) goto L88
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r4 == 0) goto L88
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r4 = r1.getLastChangedProperty()
            if (r4 != r2) goto L88
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L88
            r0 = 0
        L88:
            if (r0 == 0) goto L9f
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L9f:
            r7.setMotionBlurAngle(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigureMotionBlurEnabled(boolean r3, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L1d
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L1d:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L37
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L37:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
        L4c:
            r4.setMotionBlur(r3)
            r2.setNeedsToBeDrawn()
            return
    }

    public void setFigureMotionBlurIsOmniDirectional(boolean r3, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L1d
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L1d:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L37
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L37:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
        L4c:
            r4.setMotionBlurIsOneDirection(r3)
            r2.setNeedsToBeDrawn()
            return
    }

    public void setFigureOutlineAlphaTo(float r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            if (r2 == 0) goto L3c
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            r4 = 15
            if (r2 == 0) goto L24
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L24
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L24
            r0 = 0
        L24:
            if (r0 == 0) goto L99
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L99
        L3c:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L6d
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            r4 = 20
            if (r2 == 0) goto L55
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L55
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L55
            r0 = 0
        L55:
            if (r0 == 0) goto L99
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L99
        L6d:
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            r4 = 17
            if (r2 == 0) goto L82
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L82
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L82
            r0 = 0
        L82:
            if (r0 == 0) goto L99
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L99:
            r7.setOutlineAlpha(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigureOutlineColor(com.badlogic.gdx.graphics.Color r3, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r2 = this;
            if (r4 == 0) goto L54
            if (r3 != 0) goto L5
            goto L54
        L5:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L1f
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4e
        L1f:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L39
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4e
        L39:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
        L4e:
            r4.setOutlineColor(r3)
            r2.setNeedsToBeDrawn()
        L54:
            return
    }

    public void setFigureOutlineThicknessTo(float r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            if (r2 == 0) goto L3c
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            r4 = 16
            if (r2 == 0) goto L24
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L24
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L24
            r0 = 0
        L24:
            if (r0 == 0) goto L99
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L99
        L3c:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L6d
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            r4 = 21
            if (r2 == 0) goto L55
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L55
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L55
            r0 = 0
        L55:
            if (r0 == 0) goto L99
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L99
        L6d:
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            r4 = 18
            if (r2 == 0) goto L82
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L82
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L82
            r0 = 0
        L82:
            if (r0 == 0) goto L99
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L99:
            r7.setOutlineThickness(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigurePixelationTo(int r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            if (r2 == 0) goto L3e
            r2 = 14
            if (r1 == 0) goto L26
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r4 == 0) goto L26
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r4 = r1.getLastChangedProperty()
            if (r4 != r2) goto L26
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L26
            r0 = 0
        L26:
            if (r0 == 0) goto L9f
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9f
        L3e:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L71
            r2 = 19
            if (r1 == 0) goto L59
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r4 == 0) goto L59
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r4 = r1.getLastChangedProperty()
            if (r4 != r2) goto L59
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L59
            r0 = 0
        L59:
            if (r0 == 0) goto L9f
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9f
        L71:
            r2 = 16
            if (r1 == 0) goto L88
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r4 == 0) goto L88
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r4 = r1.getLastChangedProperty()
            if (r4 != r2) goto L88
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L88
            r0 = 0
        L88:
            if (r0 == 0) goto L9f
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L9f:
            r7.setPixelation(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigureSaturationTo(float r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            r4 = 4
            if (r2 == 0) goto L3d
            if (r1 == 0) goto L25
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r2 == 0) goto L25
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L25
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L25
            r0 = 0
        L25:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9a
        L3d:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L6e
            if (r1 == 0) goto L56
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r2 == 0) goto L56
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L56
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L56
            r0 = 0
        L56:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9a
        L6e:
            if (r1 == 0) goto L83
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r2 == 0) goto L83
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L83
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L83
            r0 = 0
        L83:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L9a:
            r7.setSaturation(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigureTintAmountTo(float r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            r4 = 5
            if (r2 == 0) goto L3d
            if (r1 == 0) goto L25
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r2 == 0) goto L25
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L25
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L25
            r0 = 0
        L25:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9a
        L3d:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L6e
            if (r1 == 0) goto L56
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r2 == 0) goto L56
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L56
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L56
            r0 = 0
        L56:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9a
        L6e:
            if (r1 == 0) goto L83
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r2 == 0) goto L83
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L83
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L83
            r0 = 0
        L83:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L9a:
            r7.setTintAmount(r6)
            r5.setNeedsToBeDrawn()
            return
    }

    public void setFigureTintColor(com.badlogic.gdx.graphics.Color r3, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r2 = this;
            if (r4 == 0) goto L54
            if (r3 != 0) goto L5
            goto L54
        L5:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L1f
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4e
        L1f:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L39
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4e
        L39:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
        L4e:
            r4.setTintColor(r3)
            r2.setNeedsToBeDrawn()
        L54:
            return
    }

    public void setFigureTransparencyTo(float r6, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            r4 = 2
            if (r2 == 0) goto L3d
            if (r1 == 0) goto L25
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction
            if (r2 == 0) goto L25
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L25
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r7) goto L25
            r0 = 0
        L25:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9a
        L3d:
            boolean r2 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L6e
            if (r1 == 0) goto L56
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r2 == 0) goto L56
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L56
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r7) goto L56
            r0 = 0
        L56:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
            goto L9a
        L6e:
            if (r1 == 0) goto L83
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r2 == 0) goto L83
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r4) goto L83
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r7) goto L83
            r0 = 0
        L83:
            if (r0 == 0) goto L9a
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r7
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1, r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L9a:
            r7.setTransparency(r6)
            r5.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r5._framesModuleRef
            r6.setNeedsToBeDrawn()
            return
    }

    public void setFigureTweenMode(byte r3, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L1d
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L1d:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r0 == 0) goto L37
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L37:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
        L4c:
            r4.setTweenMode(r3)
            return
    }

    public void setFigureUseJoinParentFilters(boolean r3, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L1d
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L1d:
            boolean r0 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r0 == 0) goto L37
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            goto L4c
        L37:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r1 = r4
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
        L4c:
            r4.setUseJoinParentFilters(r3)
            r2.setNeedsToBeDrawn()
            return
    }

    public void setFigureVisibleInOnionSkin(boolean r4, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            boolean r0 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L1d
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r1
            r2 = r5
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            r1.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r1)
            goto L50
        L1d:
            boolean r1 = r5 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r1 == 0) goto L37
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            r2 = r5
            org.fortheloss.sticknodes.movieclip.MCReference r2 = (org.fortheloss.sticknodes.movieclip.MCReference) r2
            r1.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r1)
            goto L50
        L37:
            boolean r1 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r1 == 0) goto L50
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            r2 = r5
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = (org.fortheloss.sticknodes.sprite.SpriteRef) r2
            r1.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r1)
        L50:
            r5.setVisibleInOnionSkin(r4)
            if (r4 == 0) goto L76
            if (r0 == 0) goto L5f
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r5
            r4.setSessionSelectionToStickfigure(r5)
            goto L76
        L5f:
            boolean r4 = r5 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r4 == 0) goto L6b
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r5 = (org.fortheloss.sticknodes.movieclip.MCReference) r5
            r4.setSessionSelectionToMC(r5)
            goto L76
        L6b:
            boolean r4 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r4 == 0) goto L76
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = (org.fortheloss.sticknodes.sprite.SpriteRef) r5
            r4.setSessionSelectionToSprite(r5)
        L76:
            r3.setNeedsToBeDrawn()
            return
    }

    public void setFigures(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r0 = r0.getCurrentlySelected()
            r1 = 1
            if (r0 == r1) goto L12
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r0 = r0.getCurrentlySelected()
            r1 = 5
            if (r0 != r1) goto L17
        L12:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.setSessionSelectionToNothing()
        L17:
            r2._figuresRef = r3
            return
    }

    public void setGradientMode(short r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L2f
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L2f
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setGradientMode(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r4 = 1
            if (r3 == r4) goto L2f
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L2f:
            return
    }

    public void setLimbType(int r5, org.fortheloss.sticknodes.stickfigure.StickNode r6) {
            r4 = this;
            if (r6 == 0) goto L59
            int r0 = r6.getLimbType()
            if (r0 != r5) goto L9
            goto L59
        L9:
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r6)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = r6.getLimbType()
            r2 = 1
            if (r1 != 0) goto L29
            r1 = 1
            goto L2a
        L29:
            r1 = 0
        L2a:
            int r3 = r6.getLimbType()
            if (r3 == r2) goto L36
            int r3 = r6.getLimbType()
            if (r3 != 0) goto L3b
        L36:
            int r0 = r6.getThickness()
            float r0 = (float) r0
        L3b:
            r6.setLimbType(r5)
            r3 = 6
            if (r5 != r3) goto L4e
            r5 = 1073741824(0x40000000, float:2.0)
            r6.setTrapezoidThickness1(r0, r5)
            if (r1 == 0) goto L4e
            r6.setTrapezoidIsRounded1(r2)
            r6.setTrapezoidIsRounded2(r2)
        L4e:
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            int r5 = r5.getScreen()
            if (r5 != r2) goto L59
            r6.polynodeOnSegmentTypeChange()
        L59:
            return
    }

    public void setMCCurrentFrameIndex(int r5, org.fortheloss.sticknodes.movieclip.MCReference r6) {
            r4 = this;
            if (r6 == 0) goto L46
            int r0 = r6.getPlaymode()
            if (r0 == 0) goto L9
            goto L46
        L9:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 8
            if (r1 == 0) goto L27
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r3 == 0) goto L27
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L27
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r6) goto L27
            r0 = 0
        L27:
            if (r0 == 0) goto L3b
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L3b:
            r6.setCurrentFrameIndex(r5)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
            r4.setNeedsToBeDrawn()
        L46:
            return
    }

    public void setMCPlayDuringDelay(boolean r4, org.fortheloss.sticknodes.movieclip.MCReference r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            boolean r0 = r5.getPlayDuringDelay()
            r5.setPlayDuringDelay(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferencePlayDuringDelayChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.MCReferencePlayDuringDelayChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.MCReferencePlayDuringDelayChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferencePlayDuringDelayChangeAction) r1
            r1.initialize(r5, r0, r4)
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            r4.addUserAction(r1)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModuleRef
            r4.setNeedsToBeDrawn()
            r3.setNeedsToBeDrawn()
            r3.flagOnionSkinDirty()
            return
    }

    public void setMCPlaymode(int r4, org.fortheloss.sticknodes.movieclip.MCReference r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            int r0 = r5.getPlaymode()
            r5.setPlaymode(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferencePlaymodeChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.MCReferencePlaymodeChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.MCReferencePlaymodeChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferencePlaymodeChangeAction) r1
            r1.initialize(r5, r0, r4)
            org.fortheloss.sticknodes.data.SessionData r4 = r3._sessionDataRef
            r4.addUserAction(r1)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModuleRef
            r4.setNeedsToBeDrawn()
            r3.setNeedsToBeDrawn()
            r3.flagOnionSkinDirty()
            return
    }

    public void setMCStartFrameIndex(int r4, org.fortheloss.sticknodes.movieclip.MCReference r5) {
            r3 = this;
            if (r5 == 0) goto L41
            int r0 = r5.getPlaymode()
            if (r0 != 0) goto L9
            goto L41
        L9:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            if (r1 == 0) goto L1f
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceStartFrameChangeAction
            if (r2 == 0) goto L1f
            org.fortheloss.sticknodes.data.useractions.MCReferenceStartFrameChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceStartFrameChangeAction) r1
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r5) goto L1f
            r0 = 0
        L1f:
            if (r0 == 0) goto L33
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceStartFrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceStartFrameChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceStartFrameChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceStartFrameChangeAction) r0
            r0.initialize(r5)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            r1.addUserAction(r0)
        L33:
            r5.setStartFrameIndex(r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModuleRef
            r4.setNeedsToBeDrawn()
            r3.setNeedsToBeDrawn()
            r3.flagOnionSkinDirty()
        L41:
            return
    }

    public void setMCVolumeScale(float r5, org.fortheloss.sticknodes.movieclip.MCReference r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 9
            if (r1 == 0) goto L21
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction
            if (r3 == 0) goto L21
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L21
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getMCReference()
            if (r1 != r6) goto L21
            r0 = 0
        L21:
            if (r0 == 0) goto L35
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L35:
            r6.setVolumeScale(r5)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
            r4.setNeedsToBeDrawn()
            return
    }

    public void setMagnifiedNodeSelected(boolean r1) {
            r0 = this;
            r0._magnifiedNodeSelected = r1
            return
    }

    public void setPlayingFrameCamera(org.fortheloss.sticknodes.animationscreen.FrameCamera r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            if (r3 == 0) goto L8
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r2._playingFrameCamera
            r1 = 0
            r0.copyFrom(r3, r1)
        L8:
            if (r4 == 0) goto Lf
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r2._playingFrameCamera
            r3.temporarilyReferenceLockedBundles(r4)
        Lf:
            return
    }

    public void setPolyfillColor(com.badlogic.gdx.graphics.Color r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L34
            if (r3 != 0) goto L5
            goto L34
        L5:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setPolyfillColor(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r0 = 1
            if (r3 == r0) goto L34
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            r3.onStickNodeColorModified(r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L34:
            return
    }

    public void setPushJoinedFigures(boolean r3, org.fortheloss.sticknodes.stickfigure.Stickfigure r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setPushJoinedFigures(r3)
            return
    }

    public void setReferences(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1, org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2, org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4) {
            r0 = this;
            r0._animateToolsModuleRef = r1
            r0._createToolsModuleRef = r2
            r0._movieclipToolsModuleRef = r3
            r0._framesModuleRef = r4
            return
    }

    public void setSegmentColor(com.badlogic.gdx.graphics.Color r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L38
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L38
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setColor(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r0 = 1
            if (r3 == r0) goto L38
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            r3.onStickNodeColorModified(r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L38:
            return
    }

    public void setSegmentDoNotApplySmartStretch(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L1e
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L1e
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setDoNotApplySmartStretch(r3)
        L1e:
            return
    }

    public void setSegmentDragLockAngle(float r5, org.fortheloss.sticknodes.stickfigure.StickNode r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction
            r3 = 10
            if (r2 == 0) goto L1f
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r3) goto L1f
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getStickNode()
            if (r1 != r6) goto L1f
            r0 = 0
        L1f:
            if (r0 == 0) goto L33
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r6, r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L33:
            r6.setDragLockAngle(r5)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r5 = r4._quickResizeTool
            r5.updateNodeProperties()
            r4.setNeedsToBeDrawn()
            return
    }

    public void setSegmentGradient(com.badlogic.gdx.graphics.Color r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L38
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L38
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setGradientColor(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r0 = 1
            if (r3 == r0) goto L38
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            r3.onStickNodeColorModified(r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L38:
            return
    }

    public void setSegmentIsAngleLocked(int r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L32
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L32
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r0 = 0
            if (r3 != 0) goto L22
            r4.setIsAngleLocked(r0)
            goto L2f
        L22:
            r1 = 1
            r4.setIsAngleLocked(r1)
            if (r3 != r1) goto L2c
            r4.setAngleLockIsMainNode(r1)
            goto L2f
        L2c:
            r4.setAngleLockIsMainNode(r0)
        L2f:
            r2.setNeedsToBeDrawn()
        L32:
            return
    }

    public void setSegmentIsDragLocked(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setIsDragLocked(r3)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r3 = r2._quickResizeTool
            r3.updateNodeProperties()
            r2.setNeedsToBeDrawn()
            return
    }

    public void setSegmentIsFloaty(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L21
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L21
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setFloaty(r3)
            r2.setNeedsToBeDrawn()
        L21:
            return
    }

    public void setSegmentIsSmartStretch(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L1e
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L1e
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setSmartStretch(r3)
        L1e:
            return
    }

    public void setSegmentIsStretchy(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L26
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L26
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setStretchy(r3)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r3 = r2._quickResizeTool
            r3.updateNodeProperties()
            r2.setNeedsToBeDrawn()
        L26:
            return
    }

    public void setSegmentLength(float r5, org.fortheloss.sticknodes.stickfigure.StickNode r6) {
            r4 = this;
            if (r6 == 0) goto L4f
            boolean r0 = r6.isMainNode()
            if (r0 == 0) goto L9
            goto L4f
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            r1 = 6
            r2 = 1
            if (r0 == 0) goto L27
            boolean r3 = r0 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction
            if (r3 == 0) goto L27
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            int r3 = r0.getLastChangedProperty()
            if (r3 != r1) goto L27
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getStickNode()
            if (r0 != r6) goto L27
            r0 = 0
            goto L28
        L27:
            r0 = 1
        L28:
            if (r0 == 0) goto L3c
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r3 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r6, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L3c:
            r6.setLength(r5)
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            int r5 = r5.getScreen()
            if (r5 == r2) goto L4f
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
        L4f:
            return
    }

    public void setSegmentRelativeAngleLockMultiplier(byte r5, org.fortheloss.sticknodes.stickfigure.StickNode r6) {
            r4 = this;
            if (r6 == 0) goto L3f
            boolean r0 = r6.isMainNode()
            if (r0 == 0) goto L9
            goto L3f
        L9:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction
            r3 = 11
            if (r2 == 0) goto L25
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r3) goto L25
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getStickNode()
            if (r1 != r6) goto L25
            r0 = 0
        L25:
            if (r0 == 0) goto L39
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r6, r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L39:
            r6.setSegmentRelativeAngleLockMultiplier(r5)
            r4.setNeedsToBeDrawn()
        L3f:
            return
    }

    public void setSegmentSmartStretchMultiplier(float r5, org.fortheloss.sticknodes.stickfigure.StickNode r6) {
            r4 = this;
            if (r6 == 0) goto L3c
            boolean r0 = r6.isMainNode()
            if (r0 == 0) goto L9
            goto L3c
        L9:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction
            r3 = 9
            if (r2 == 0) goto L25
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r1
            int r2 = r1.getLastChangedProperty()
            if (r2 != r3) goto L25
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getStickNode()
            if (r1 != r6) goto L25
            r0 = 0
        L25:
            if (r0 == 0) goto L39
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r6, r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L39:
            r6.setSmartStretchMultiplier(r5)
        L3c:
            return
    }

    public void setSegmentSmartStretchResetImpulse(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L1e
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L1e
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setSmartStretchResetImpulse(r3)
        L1e:
            return
    }

    public void setSegmentThickness(int r5, org.fortheloss.sticknodes.stickfigure.StickNode r6) {
            r4 = this;
            if (r6 == 0) goto L4f
            boolean r0 = r6.isMainNode()
            if (r0 == 0) goto L9
            goto L4f
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L27
            boolean r3 = r0 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction
            if (r3 == 0) goto L27
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            int r3 = r0.getLastChangedProperty()
            if (r3 != r1) goto L27
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getStickNode()
            if (r0 != r6) goto L27
            r0 = 0
            goto L28
        L27:
            r0 = 1
        L28:
            if (r0 == 0) goto L3c
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r3 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r6, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L3c:
            r6.setThickness(r5)
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            int r5 = r5.getScreen()
            if (r5 == r2) goto L4f
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
        L4f:
            return
    }

    public void setShapeIsFlippedTriangle(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L2d
            boolean r0 = r4.isMainNode()
            if (r0 != 0) goto L2d
            short r0 = r4.getRightTriangleDirection()
            if (r0 != 0) goto Lf
            goto L2d
        Lf:
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            if (r3 == 0) goto L28
            r3 = -1
            goto L29
        L28:
            r3 = 1
        L29:
            short r3 = (short) r3
            r4.setRightTriangleDirection(r3)
        L2d:
            return
    }

    public void setShapeIsHalfArc(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L21
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L21
        L9:
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setHalfArc(r3)
        L21:
            return
    }

    public void setShapeIsRightTriangle(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L22
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L22
        L9:
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            short r3 = (short) r3
            r4.setRightTriangleDirection(r3)
        L22:
            return
    }

    public void setShapeIsUpsideDownTriangle(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L21
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L21
        L9:
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setTriangleUpsideDown(r3)
        L21:
            return
    }

    public void setShapeNumPolygonVertices(short r5, org.fortheloss.sticknodes.stickfigure.StickNode r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 5
            if (r1 == 0) goto L20
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction
            if (r3 == 0) goto L20
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L20
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getStickNode()
            if (r1 != r6) goto L20
            r0 = 0
        L20:
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L34:
            r4.setNeedsToBeDrawn()
            r6.setNumPolygonVertices(r5)
            return
    }

    public void setShapeSegmentCirculization(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setSegmentCurveCirculization(r3)
            return
    }

    public void setShapeSegmentCurve(int r5, org.fortheloss.sticknodes.stickfigure.StickNode r6, int r7, boolean r8) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            if (r8 == 0) goto L41
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 7
            if (r1 == 0) goto L23
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction
            if (r3 == 0) goto L23
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L23
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getStickNode()
            if (r1 != r6) goto L23
            r1 = 0
            goto L24
        L23:
            r1 = 1
        L24:
            if (r1 == 0) goto L41
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r3 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r1
            r3 = -9999999(0xffffffffff676981, float:-3.0759947E38)
            if (r7 <= r3) goto L39
            r1.initialize(r6, r7, r2)
            goto L3c
        L39:
            r1.initialize(r6, r2)
        L3c:
            org.fortheloss.sticknodes.data.SessionData r7 = r4._sessionDataRef
            r7.addUserAction(r1)
        L41:
            r4.setNeedsToBeDrawn()
            r6.setSegmentCurve(r5)
            if (r8 == 0) goto L56
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            int r5 = r5.getScreen()
            if (r5 == r0) goto L56
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
        L56:
            return
    }

    public void setShapeSegmentCurvePolyfillPrecision(short r4, org.fortheloss.sticknodes.stickfigure.StickNode r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction
            if (r1 == 0) goto L32
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r0.getStickNode()
            r2 = 13
            if (r1 != r5) goto L20
            int r0 = r0.getLastChangedProperty()
            if (r0 == r2) goto L32
        L20:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r5, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            r1.addUserAction(r0)
        L32:
            r5.setSegmentCurvePolyfillPrecision(r4)
            return
    }

    public void setShapeTrapezoidIsRounded1(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L21
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L21
        L9:
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setTrapezoidIsRounded1(r3)
        L21:
            return
    }

    public void setShapeTrapezoidIsRounded2(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L21
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L21
        L9:
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setTrapezoidIsRounded2(r3)
        L21:
            return
    }

    public void setShapeTrapezoidRatio(float r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L21
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L21
        L9:
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setTrapezoidRatio(r3)
        L21:
            return
    }

    public void setShapeTrapezoidThickness(float r6, float r7, org.fortheloss.sticknodes.stickfigure.StickNode r8) {
            r5 = this;
            if (r8 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction
            r2 = 14
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L26
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            int r1 = r0.getLastChangedProperty()
            if (r1 != r2) goto L26
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getStickNode()
            if (r0 != r8) goto L26
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            r0.removeLatestUserAction()
            r0 = 0
            goto L27
        L26:
            r0 = 1
        L27:
            if (r0 == 0) goto L3b
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r8, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            r1.addUserAction(r0)
        L3b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.setTrapezoidThickness1(r6, r0, r4)
            r8.setTrapezoidThickness2(r7, r0, r4)
            r5.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r6 = r5._sessionDataRef
            int r6 = r6.getScreen()
            if (r6 == r3) goto L53
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r5._framesModuleRef
            r6.setNeedsToBeDrawn()
        L53:
            return
    }

    public void setShapeTrapezoidThickness1(float r5, org.fortheloss.sticknodes.stickfigure.StickNode r6, float r7) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction
            r2 = 4
            r3 = 1
            if (r1 == 0) goto L1f
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            int r1 = r0.getLastChangedProperty()
            if (r1 != r2) goto L1f
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getStickNode()
            if (r0 != r6) goto L1f
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L34:
            r6.setTrapezoidThickness1(r5, r7)
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            int r5 = r5.getScreen()
            if (r5 == r3) goto L47
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
        L47:
            return
    }

    public void setShapeTrapezoidThickness2(float r5, org.fortheloss.sticknodes.stickfigure.StickNode r6, float r7) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction
            r2 = 8
            r3 = 1
            if (r1 == 0) goto L20
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            int r1 = r0.getLastChangedProperty()
            if (r1 != r2) goto L20
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getStickNode()
            if (r0 != r6) goto L20
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            if (r0 == 0) goto L35
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L35:
            r6.setTrapezoidThickness2(r5, r7)
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            int r5 = r5.getScreen()
            if (r5 == r3) goto L48
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
        L48:
            return
    }

    public void setSpriteGroupStateIndex(int r5, org.fortheloss.sticknodes.sprite.SpriteGroupRef r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 14
            if (r1 == 0) goto L21
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r3 == 0) goto L21
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L21
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r6) goto L21
            r0 = 0
        L21:
            if (r0 == 0) goto L35
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L35:
            r6.setStateIndex(r5)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
            r4.setNeedsToBeDrawn()
            return
    }

    public void setSpriteOriginX(float r5, org.fortheloss.sticknodes.sprite.SpriteRef r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 15
            if (r1 == 0) goto L21
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r3 == 0) goto L21
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L21
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r6) goto L21
            r0 = 0
        L21:
            if (r0 == 0) goto L35
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L35:
            r6.setNormalizedOriginX(r5)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
            r4.setNeedsToBeDrawn()
            return
    }

    public void setSpriteOriginY(float r5, org.fortheloss.sticknodes.sprite.SpriteRef r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 16
            if (r1 == 0) goto L21
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r3 == 0) goto L21
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L21
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r6) goto L21
            r0 = 0
        L21:
            if (r0 == 0) goto L35
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L35:
            r6.setNormalizedOriginY(r5)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
            r4.setNeedsToBeDrawn()
            return
    }

    public void setSpriteScaleLinked(boolean r3, org.fortheloss.sticknodes.sprite.SpriteRef r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setScaleLinked(r3)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r3 = r2._quickResizeTool
            r3.updateSpriteProperties()
            r2.setNeedsToBeDrawn()
            return
    }

    public void setSpriteScaleMode(boolean r3, org.fortheloss.sticknodes.sprite.SpriteRef r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setDragType(r3)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r3 = r2._quickResizeTool
            r3.updateSpriteProperties()
            r2.setNeedsToBeDrawn()
            return
    }

    public void setSpriteScaleX(float r4, org.fortheloss.sticknodes.sprite.SpriteRef r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            byte r0 = r5.isLockedToCamera()
            r1 = 2
            if (r0 != r1) goto Lb
            return
        Lb:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            r1 = 1
            if (r0 == 0) goto L28
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r2 == 0) goto L28
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            int r2 = r0.getLastChangedProperty()
            if (r2 != r1) goto L28
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getSpriteRef()
            if (r0 != r5) goto L28
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            if (r0 == 0) goto L3d
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r0.initialize(r5, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            r1.addUserAction(r0)
        L3d:
            r5.setScaleX(r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModuleRef
            r4.setNeedsToBeDrawn()
            r3.setNeedsToBeDrawn()
            return
    }

    public void setSpriteScaleY(float r5, org.fortheloss.sticknodes.sprite.SpriteRef r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            byte r0 = r6.isLockedToCamera()
            r1 = 2
            if (r0 != r1) goto Lb
            return
        Lb:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 17
            if (r1 == 0) goto L29
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.SpriteChangeAction
            if (r3 == 0) goto L29
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L29
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r1.getSpriteRef()
            if (r1 != r6) goto L29
            r0 = 0
        L29:
            if (r0 == 0) goto L3d
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L3d:
            r6.setScaleY(r5)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
            r4.setNeedsToBeDrawn()
            return
    }

    public void setStaticSegment(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L26
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L26
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setStatic(r3)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r3 = r2._quickResizeTool
            r3.updateNodeProperties()
            r2.setNeedsToBeDrawn()
        L26:
            return
    }

    public void setStickfigureColor(com.badlogic.gdx.graphics.Color r3, org.fortheloss.sticknodes.stickfigure.Stickfigure r4) {
            r2 = this;
            if (r4 == 0) goto L2b
            if (r3 != 0) goto L5
            goto L2b
        L5:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setColor(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r4 = 1
            if (r3 == r4) goto L2b
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L2b:
            return
    }

    public void setStickfigureDoesSetJoinsState(boolean r3, org.fortheloss.sticknodes.stickfigure.Stickfigure r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setStateOfJoins(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setStickfigureScaleJoinedStickfigures(boolean r3, org.fortheloss.sticknodes.stickfigure.Stickfigure r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setScaleJoinedStickfigures(r3)
            return
    }

    public void setStickfigureStateIndexOfJoins(int r4, org.fortheloss.sticknodes.stickfigure.Stickfigure r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.StickfigureJoinsStateChangeAction
            if (r2 == 0) goto L17
            org.fortheloss.sticknodes.data.useractions.StickfigureJoinsStateChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureJoinsStateChangeAction) r1
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            if (r1 != r5) goto L17
            r0 = 0
        L17:
            if (r0 == 0) goto L2b
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureJoinsStateChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureJoinsStateChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureJoinsStateChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureJoinsStateChangeAction) r0
            r0.initialize(r5)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            r1.addUserAction(r0)
        L2b:
            r5.setStateIndexOfJoins(r4)
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModuleRef
            r4.setNeedsToBeDrawn()
            return
    }

    public void setTextfieldAlign(int r3, org.fortheloss.sticknodes.TextfieldBox r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setAlignment(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setTextfieldBoxes(java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r2) {
            r1 = this;
            r0 = 0
            r1.setTextfieldBoxes(r2, r0)
            return
    }

    public void setTextfieldBoxes(java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r3, boolean r4) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r0 = r0.getCurrentlySelected()
            r1 = 2
            if (r0 != r1) goto Le
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.setSessionSelectionToNothing()
        Le:
            r2._textfieldBoxesRef = r3
            r2._drawTweenedTextfieldBoxes = r4
            return
    }

    public void setTextfieldColor(com.badlogic.gdx.graphics.Color r3, org.fortheloss.sticknodes.TextfieldBox r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setColor(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setTextfieldDrawAboveWidescreenBars(boolean r3, org.fortheloss.sticknodes.TextfieldBox r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setDrawAboveWidescreenBars(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setTextfieldFont(int r3, org.fortheloss.sticknodes.TextfieldBox r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r0 = 0
            r4.setFontID(r3, r0)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setTextfieldHasShadow(boolean r3, org.fortheloss.sticknodes.TextfieldBox r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setHasShadow(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setTextfieldLocked(boolean r3, org.fortheloss.sticknodes.TextfieldBox r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setLocked(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setTextfieldScale(float r5, org.fortheloss.sticknodes.TextfieldBox r6, float r7, boolean r8) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            boolean r0 = r6.isLockedToCamera()
            if (r0 == 0) goto La
            return
        La:
            if (r8 == 0) goto L48
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 2
            if (r1 == 0) goto L29
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction
            if (r3 == 0) goto L29
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L29
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getTextfieldBox()
            if (r1 != r6) goto L29
            r0 = 0
        L29:
            if (r0 == 0) goto L48
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r0
            r1 = -943501440(0xffffffffc7c34f80, float:-99999.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L40
            r0.initialize(r6, r7, r2)
            goto L43
        L40:
            r0.initialize(r6, r2)
        L43:
            org.fortheloss.sticknodes.data.SessionData r7 = r4._sessionDataRef
            r7.addUserAction(r0)
        L48:
            r6.setScale(r5)
            r4.setNeedsToBeDrawn()
            if (r8 == 0) goto L55
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
        L55:
            return
    }

    public void setTextfieldShadowColor(com.badlogic.gdx.graphics.Color r3, org.fortheloss.sticknodes.TextfieldBox r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setShadowColor(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setTextfieldText(java.lang.String r5, org.fortheloss.sticknodes.TextfieldBox r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = r0.peekAtUndo()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1f
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r0
            int r1 = r0.getLastChangedProperty()
            if (r1 != r3) goto L1f
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getTextfieldBox()
            if (r0 != r6) goto L1f
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r0
            r0.initialize(r6, r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L34:
            r6.setText(r5)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r5 = r5.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r5 = (org.fortheloss.sticknodes.data.FrameData) r5
            org.fortheloss.sticknodes.animationscreen.FrameCamera r5 = r5.getFrameCamera()
            r5.updateLocked(r2, r3)
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
            return
    }

    public void setTextfieldTransparencyTo(float r5, org.fortheloss.sticknodes.TextfieldBox r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 4
            if (r1 == 0) goto L20
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction
            if (r3 == 0) goto L20
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L20
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getTextfieldBox()
            if (r1 != r6) goto L20
            r0 = 0
        L20:
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction) r0
            r0.initialize(r6, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
        L34:
            r6.setAlpha(r5)
            r4.setNeedsToBeDrawn()
            return
    }

    public void setTracingFrameData(org.fortheloss.sticknodes.data.FrameData r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            if (r3 == 0) goto Lc
            r2.setTracingStickfigure(r1)
            r2._isTracingBG = r0
            r2._frameDataToTraceRef = r3
            goto L11
        Lc:
            r3 = 0
            r2._isTracingBG = r3
            r2._frameDataToTraceRef = r1
        L11:
            r2._tracingFBODirty = r0
            r2.setNeedsToBeDrawn()
            return
    }

    public void setTracingStickfigure(org.fortheloss.sticknodes.stickfigure.Stickfigure r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            if (r3 == 0) goto Lc
            r2.setTracingFrameData(r1)
            r2._isTracingBG = r0
            r2._stickfigureToTraceRef = r3
            goto L11
        Lc:
            r3 = 0
            r2._isTracingBG = r3
            r2._stickfigureToTraceRef = r1
        L11:
            r2._tracingFBODirty = r0
            r2.setNeedsToBeDrawn()
            return
    }

    public void showArrows() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r0 = r2._arrowsWindow
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto L11
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
            org.fortheloss.sticknodes.animationscreen.ArrowsWindow r1 = r2._arrowsWindow
            r0.addActor(r1)
        L11:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            r1 = 1
            r0.setArrowsVisible(r1)
            return
    }

    public void showMagnifier() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.Magnifier r0 = r2._magnifier
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto L11
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
            org.fortheloss.sticknodes.animationscreen.Magnifier r1 = r2._magnifier
            r0.addActor(r1)
        L11:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            r1 = 1
            r0.setMagnifierVisible(r1)
            return
    }

    public void showQuickMenu() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r0 = r3._quickMenuTable
            if (r0 == 0) goto L14
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto L2f
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r0 = r3._quickMenuTable
            r1 = 1
            r0.setVisible(r1)
            r3.setNeedsToBeDrawn()
            goto L2f
        L14:
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r0 = new org.fortheloss.sticknodes.animationscreen.QuickMenuTable
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r3._createToolsModuleRef
            r0.<init>(r1, r3, r2)
            r3._quickMenuTable = r0
            r1 = 0
            float r2 = r3.getHeight()
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.animationscreen.QuickMenuTable r0 = r3._quickMenuTable
            r3.addActor(r0)
            r3.setNeedsToBeDrawn()
        L2f:
            return
    }

    public void showQuickResizeTool(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            r1.showQuickResizeTool(r2, r0)
            return
    }

    public void showQuickResizeTool(java.lang.Object r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto Lc
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r4 = r2._quickResizeTool
            r4.hide()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r4 = r2.mQrtDocked
            r4.hide()
        Lc:
            org.fortheloss.sticknodes.data.SessionData r4 = r2._sessionDataRef
            short r4 = r4.getIsShowingQuickResizeTool()
            r0 = 1
            if (r4 != r0) goto L72
            if (r3 != 0) goto L1d
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r3 = r2._quickResizeTool
            r3.hide()
            return
        L1d:
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.TextfieldBox
            if (r4 == 0) goto L30
            r4 = r3
            org.fortheloss.sticknodes.TextfieldBox r4 = (org.fortheloss.sticknodes.TextfieldBox) r4
            boolean r4 = r4.isLockedToCamera()
            if (r4 == 0) goto L30
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r3 = r2._quickResizeTool
            r3.hide()
            return
        L30:
            r2.repositionQuickResizeTools()
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r4 == 0) goto L49
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r4 = r2._quickResizeTool
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3.getStickfigure()
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            int r1 = r1.getScreen()
            r4.show(r0, r1, r3)
            goto L7a
        L49:
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.stickfigure.INode
            r0 = 0
            if (r4 == 0) goto L60
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r4 = r2._quickResizeTool
            org.fortheloss.sticknodes.stickfigure.INode r3 = (org.fortheloss.sticknodes.stickfigure.INode) r3
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = r3.getDrawableFigure()
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            int r1 = r1.getScreen()
            r4.show(r3, r1, r0)
            goto L7a
        L60:
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.animationscreen.IStageObject
            if (r4 == 0) goto L7a
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool r4 = r2._quickResizeTool
            org.fortheloss.sticknodes.animationscreen.IStageObject r3 = (org.fortheloss.sticknodes.animationscreen.IStageObject) r3
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            int r1 = r1.getScreen()
            r4.show(r3, r1, r0)
            goto L7a
        L72:
            r0 = 2
            if (r4 != r0) goto L7a
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r4 = r2.mQrtDocked
            r4.setSelection(r3)
        L7a:
            return
    }

    public void splitSegment(org.fortheloss.sticknodes.stickfigure.StickNode r41, int r42) {
            r40 = this;
            r0 = r40
            r7 = r41
            r8 = r42
            if (r7 == 0) goto L3d1
            boolean r1 = r41.isMainNode()
            if (r1 == 0) goto L10
            goto L3d1
        L10:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r41.getStickfigure()
            r9 = 1
            int r1 = r1.getNodeCount(r9)
            int r1 = r1 + r8
            r10 = 400(0x190, float:5.6E-43)
            r2 = 2
            r11 = 0
            if (r1 <= r10) goto L48
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            java.lang.String r3 = "nodeLimitWarningTitle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r41.getStickfigure()
            int r4 = r4.getNodeCount(r9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r11] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2[r9] = r4
            java.lang.String r4 = "nodeLimitWarningInfo1"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r4, r2)
            r1.showErrorDialog(r3, r2)
            return
        L48:
            org.fortheloss.sticknodes.stickfigure.StickNode r12 = r41.getParentNode()
            float r13 = r41.getGlobalX()
            float r14 = r41.getGlobalY()
            float r15 = r41.getAngle()
            float r1 = r41.getLength()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r41.getStickfigure()
            float r3 = r3.getScale()
            boolean r4 = r41.isUsingSegmentScale()
            if (r4 == 0) goto L6f
            float r4 = r41.getScale()
            goto L71
        L6f:
            r4 = 1065353216(0x3f800000, float:1.0)
        L71:
            float r16 = r3 * r4
            int r3 = r41.getLimbType()
            r6 = 6
            if (r3 == 0) goto L89
            int r3 = r41.getLimbType()
            if (r3 == r9) goto L89
            int r3 = r41.getLimbType()
            if (r3 != r6) goto L87
            goto L89
        L87:
            r3 = 0
            goto L94
        L89:
            int r3 = r41.getSegmentCurve()
            int r3 = java.lang.Math.abs(r3)
            if (r3 <= 0) goto L87
            r3 = 1
        L94:
            org.fortheloss.sticknodes.data.SessionData r4 = r0._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeSplitAction> r5 = org.fortheloss.sticknodes.data.useractions.StickNodeSplitAction.class
            java.lang.Object r4 = r4.getUserAction(r5)
            r5 = r4
            org.fortheloss.sticknodes.data.useractions.StickNodeSplitAction r5 = (org.fortheloss.sticknodes.data.useractions.StickNodeSplitAction) r5
            r5.initialize(r7)
            org.fortheloss.sticknodes.data.SessionData r4 = r0._sessionDataRef
            r4.addUserAction(r5)
            float r17 = r41.getTrapezoidThickness1()
            float r4 = r41.getTrapezoidThickness2()
            int r10 = r8 + 1
            if (r8 != r9) goto Lc8
            boolean r18 = r41.isHalfArc()
            if (r18 != 0) goto Lc8
            int r6 = r41.getLimbType()
            if (r6 == r2) goto Lc6
            int r6 = r41.getLimbType()
            r11 = 5
            if (r6 != r11) goto Lc8
        Lc6:
            r11 = 1
            goto Lc9
        Lc8:
            r11 = 0
        Lc9:
            if (r11 == 0) goto Ld4
            int r6 = r41.getLimbType()
            if (r6 != r2) goto Ld4
            r19 = 1
            goto Ld6
        Ld4:
            r19 = 0
        Ld6:
            r2 = 0
            if (r3 == 0) goto L2a7
            int r1 = r8 * 2
            int r1 = r1 + r9
            com.badlogic.gdx.utils.FloatArray r11 = r7.getPointsForSplittingCurve(r1)
            com.badlogic.gdx.math.Vector2 r3 = new com.badlogic.gdx.math.Vector2
            r3.<init>()
            com.badlogic.gdx.math.Vector2 r1 = new com.badlogic.gdx.math.Vector2
            r1.<init>()
            int r6 = r11.size
            r19 = r2
            r21 = r19
            r23 = r12
            r24 = r17
            r2 = 0
            r22 = 0
        Lf7:
            if (r2 >= r6) goto L29f
            int r9 = r2 + 2
            r27 = r6
            r25 = 1
            if (r9 != r6) goto L104
            r26 = 1
            goto L106
        L104:
            r26 = 0
        L106:
            int r6 = r22 + 1
            r22 = r4
            float r4 = r11.get(r2)
            r28 = r5
            int r5 = r2 + 1
            float r5 = r11.get(r5)
            r3.set(r4, r5)
            if (r26 == 0) goto L11f
            r1.set(r13, r14)
            goto L12c
        L11f:
            float r4 = r11.get(r9)
            int r5 = r2 + 3
            float r5 = r11.get(r5)
            r1.set(r4, r5)
        L12c:
            float r4 = r1.x
            float r5 = r23.getGlobalX()
            float r4 = r4 - r5
            float r5 = r1.y
            float r9 = r23.getGlobalY()
            float r5 = r5 - r9
            float r9 = r4 * r4
            float r29 = r5 * r5
            float r9 = r9 + r29
            r29 = r1
            r30 = r2
            double r1 = (double) r9
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 / r2
            float r9 = r1 / r16
            double r1 = (double) r5
            double r4 = (double) r4
            double r1 = java.lang.Math.atan2(r1, r4)
            float r1 = (float) r1
            r2 = 1113927392(0x42652ee0, float:57.295776)
            float r1 = r1 * r2
            float r4 = r23.getAngle()
            float r5 = r1 - r4
            float r4 = r23.getGlobalX()
            float r2 = r3.x
            float r4 = r4 - r2
            float r2 = r23.getGlobalY()
            r32 = r5
            float r5 = r3.y
            float r2 = r2 - r5
            r5 = r3
            double r2 = (double) r2
            r33 = r5
            double r4 = (double) r4
            double r2 = java.lang.Math.atan2(r2, r4)
            float r2 = (float) r2
            r3 = 1113927392(0x42652ee0, float:57.295776)
            float r2 = r2 * r3
            float r2 = r2 - r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r9
            r3 = 1016003125(0x3c8efa35, float:0.017453292)
            float r2 = r2 * r3
            double r2 = (double) r2
            double r2 = java.lang.Math.tan(r2)
            float r2 = (float) r2
            float r1 = r1 * r2
            int r5 = (int) r1
            if (r26 == 0) goto L1aa
            r0 = r6
            r1 = r7
            r20 = r12
            r36 = r22
            r18 = r27
            r12 = 6
            r22 = r13
            r13 = r28
            r28 = r11
            r11 = r32
            r32 = r14
            r14 = r5
            goto L1d4
        L1aa:
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r31 = new org.fortheloss.sticknodes.stickfigure.StickNodeDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r41.getStickfigure()
            r34 = 0
            r35 = 1
            r1 = r31
            r3 = r23
            r36 = r22
            r4 = r41
            r22 = r13
            r13 = r28
            r28 = r11
            r11 = r32
            r32 = r14
            r14 = r5
            r5 = r34
            r0 = r6
            r20 = r12
            r18 = r27
            r12 = 6
            r6 = r35
            r1.<init>(r2, r3, r4, r5, r6)
        L1d4:
            if (r21 != 0) goto L1d8
            r2 = r1
            goto L1da
        L1d8:
            r2 = r21
        L1da:
            r1.setLength(r9)
            r1.setLocalAngle(r11)
            r1.setSegmentCurve(r14)
            r3 = 0
            if (r26 != 0) goto L1ec
            r1.setIsDragLocked(r3)
            r1.setIsAngleLocked(r3)
        L1ec:
            int r4 = r1.getLimbType()
            if (r4 != r12) goto L216
            r4 = r24
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.setTrapezoidThickness1(r4, r9, r3)
            if (r30 <= 0) goto L1ff
            r3 = 1
            r1.setTrapezoidIsRounded1(r3)
        L1ff:
            r14 = r36
            float r4 = r14 - r17
            float r3 = (float) r0
            float r5 = (float) r10
            float r3 = r3 / r5
            float r4 = r4 * r3
            float r4 = r17 + r4
            int r3 = java.lang.Math.round(r4)
            float r3 = (float) r3
            r4 = 0
            r1.setTrapezoidThickness2(r3, r9, r4)
            r24 = r3
            goto L21c
        L216:
            r4 = r24
            r14 = r36
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
        L21c:
            if (r26 == 0) goto L270
            r3 = r23
            r7.changeParentNode(r3)
            r2.validatePosition()
            boolean r3 = r41.getIsAngleLocked()
            if (r3 == 0) goto L24a
            boolean r3 = r41.getAngleLockIsMainNode()
            if (r3 == 0) goto L238
            r3 = 1
            r2.setIsAngleLocked(r3)
            r3 = 0
            goto L247
        L238:
            r3 = 1
            r2.setIsAngleLocked(r3)
            r3 = 0
            r2.setAngleLockIsMainNode(r3)
            byte r4 = r41.getSegmentRelativeAngleLockMultiplier()
            r2.setSegmentRelativeAngleLockMultiplier(r4)
        L247:
            r7.setIsAngleLocked(r3)
        L24a:
            float r3 = r1.getAngle()
            float r3 = r3 - r15
            java.util.ArrayList r4 = r41.getChildrenNodes()
            int r4 = r4.size()
            r5 = 1
            int r4 = r4 - r5
        L259:
            if (r4 < 0) goto L27d
            java.util.ArrayList r5 = r41.getChildrenNodes()
            java.lang.Object r5 = r5.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            float r6 = r5.getLocalAngle()
            float r6 = r6 - r3
            r5.setLocalAngle(r6)
            int r4 = r4 + (-1)
            goto L259
        L270:
            r3 = r23
            r4 = 0
            r3.addChildNode(r1, r4)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r1.getStickfigure()
            r3.addNodeToDrawOrderBefore(r1, r7)
        L27d:
            if (r30 != 0) goto L281
            r19 = r1
        L281:
            int r3 = r30 + 4
            r9 = 1
            r23 = r1
            r21 = r2
            r2 = r3
            r5 = r13
            r4 = r14
            r6 = r18
            r12 = r20
            r13 = r22
            r11 = r28
            r1 = r29
            r14 = r32
            r3 = r33
            r22 = r0
            r0 = r40
            goto Lf7
        L29f:
            r13 = r5
            r20 = r12
            r1 = r19
            r0 = 1
            goto L3a9
        L2a7:
            r14 = r4
            r13 = r5
            r20 = r12
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12 = 6
            float r0 = (float) r10
            float r10 = r1 / r0
            r15 = r2
            r16 = r15
            r4 = r17
            r5 = r20
            r1 = 0
            r6 = 0
        L2ba:
            r3 = 0
            if (r6 >= r8) goto L356
            r18 = 1
            int r2 = r1 + 1
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r1 = new org.fortheloss.sticknodes.stickfigure.StickNodeDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r18 = r41.getStickfigure()
            r21 = 0
            r22 = 1
            r23 = r1
            r37 = r2
            r2 = r18
            r9 = 0
            r3 = r5
            r38 = r4
            r4 = r41
            r39 = r5
            r5 = r21
            r18 = r6
            r6 = r22
            r1.<init>(r2, r3, r4, r5, r6)
            if (r15 != 0) goto L2e5
            r15 = r1
        L2e5:
            r1.setLength(r10)
            r1.setLocalAngle(r9)
            r2 = 0
            r1.setIsDragLocked(r2)
            r1.setIsAngleLocked(r2)
            int r3 = r1.getLimbType()
            if (r3 != r12) goto L31b
            r3 = r38
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.setTrapezoidThickness1(r3, r4, r2)
            if (r18 <= 0) goto L305
            r2 = 1
            r1.setTrapezoidIsRounded1(r2)
        L305:
            float r4 = r14 - r17
            r2 = r37
            float r3 = (float) r2
            float r3 = r3 / r0
            float r4 = r4 * r3
            float r4 = r17 + r4
            int r3 = java.lang.Math.round(r4)
            float r4 = (float) r3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            r1.setTrapezoidThickness2(r4, r3, r5)
            goto L321
        L31b:
            r2 = r37
            r3 = r38
            r5 = 0
            r4 = r3
        L321:
            if (r11 == 0) goto L32f
            if (r19 == 0) goto L328
            r1.setThickness(r5)
        L328:
            r3 = 1
            r1.setHalfArc(r3)
            r1.setTriangleUpsideDown(r3)
        L32f:
            if (r18 != 0) goto L339
            float r3 = r41.getLocalAngle()
            r1.setLocalAngle(r3)
            goto L33c
        L339:
            r1.setLocalAngle(r9)
        L33c:
            r3 = r39
            r5 = 0
            r3.addChildNode(r1, r5)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r1.getStickfigure()
            r3.addNodeToDrawOrderBefore(r1, r7)
            if (r18 != 0) goto L34d
            r16 = r1
        L34d:
            int r6 = r18 + 1
            r5 = r1
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r2
            r2 = r5
            goto L2ba
        L356:
            r3 = r4
            r5 = 0
            r9 = 0
            int r0 = r41.getLimbType()
            if (r0 != r12) goto L367
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.setTrapezoidThickness1(r3, r0, r5)
            r7.setTrapezoidThickness2(r14, r0, r5)
        L367:
            if (r11 == 0) goto L375
            if (r19 == 0) goto L36e
            r7.setThickness(r5)
        L36e:
            r0 = 1
            r7.setHalfArc(r0)
            r7.setTriangleUpsideDown(r5)
        L375:
            r7.setLength(r10)
            r7.setLocalAngle(r9)
            r7.changeParentNode(r2)
            r15.validatePosition()
            boolean r0 = r41.getIsAngleLocked()
            if (r0 == 0) goto L3a6
            boolean r0 = r41.getAngleLockIsMainNode()
            if (r0 == 0) goto L393
            r0 = 1
            r15.setIsAngleLocked(r0)
            r1 = 0
            goto L3a2
        L393:
            r0 = 1
            r15.setIsAngleLocked(r0)
            r1 = 0
            r15.setAngleLockIsMainNode(r1)
            byte r2 = r41.getSegmentRelativeAngleLockMultiplier()
            r15.setSegmentRelativeAngleLockMultiplier(r2)
        L3a2:
            r7.setIsAngleLocked(r1)
            goto L3a7
        L3a6:
            r0 = 1
        L3a7:
            r1 = r16
        L3a9:
            r13.setNewBranch(r1)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r41.getStickfigure()
            int r0 = r2.getNodeCount(r0)
            int r0 = r0 + r8
            r2 = 400(0x190, float:5.6E-43)
            if (r0 > r2) goto L3c2
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r41.getStickfigure()
            r2 = r20
            r0.checkIfPolyfillAffectedBySplit(r7, r2, r1)
        L3c2:
            r0 = r40
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            r1.setSessionSelectionToNode(r7)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r0._createToolsModuleRef
            r1.updateNodeCount()
            r40.setNeedsToBeDrawn()
        L3d1:
            return
    }

    public void toggleSpriteLockState(org.fortheloss.sticknodes.sprite.SpriteRef r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r0.initialize(r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r3.toggleLockState()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            r2.setNeedsToBeDrawn()
            return
    }

    public void toggleSpriteSmartStretchState(org.fortheloss.sticknodes.sprite.SpriteRef r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r0
            r0.initialize(r3)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r3.toggleSmartStretchState()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            r2.setNeedsToBeDrawn()
            return
    }

    public void tweenStickfigureColors(boolean r3, org.fortheloss.sticknodes.stickfigure.Stickfigure r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setTweenColors(r3)
            return
    }

    public void unjoinFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6, boolean r7) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r6.getJoinedToNode()
            boolean r1 = r6 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r1 == 0) goto L33
            r2 = r6
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = (org.fortheloss.sticknodes.sprite.SpriteRef) r2
            int r3 = r2.getSmartStretchState()
            if (r3 == 0) goto L33
            org.fortheloss.sticknodes.data.SessionData r3 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r4 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            java.lang.Object r3 = r3.getUserAction(r4)
            org.fortheloss.sticknodes.data.useractions.SpriteChangeAction r3 = (org.fortheloss.sticknodes.data.useractions.SpriteChangeAction) r3
            r3.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            r2.addUserAction(r3)
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r3 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            java.lang.Object r3 = r2.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.UserAction r3 = (org.fortheloss.sticknodes.data.useractions.UserAction) r3
            r2.addUserAction(r3)
        L33:
            r6.unjoin()
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FigureUnjoinAction> r3 = org.fortheloss.sticknodes.data.useractions.FigureUnjoinAction.class
            java.lang.Object r2 = r2.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.FigureUnjoinAction r2 = (org.fortheloss.sticknodes.data.useractions.FigureUnjoinAction) r2
            r2.initialize(r6, r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            r0.addUserAction(r2)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r5._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            r0.onFigureUnjoined(r6)
            if (r7 == 0) goto L74
            boolean r7 = r6 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r7 == 0) goto L5f
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r5._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r6
            r7.setSessionSelectionToStickfigure(r6)
            goto L74
        L5f:
            boolean r7 = r6 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r7 == 0) goto L6b
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r5._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r6 = (org.fortheloss.sticknodes.movieclip.MCReference) r6
            r7.setSessionSelectionToMC(r6)
            goto L74
        L6b:
            if (r1 == 0) goto L74
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r5._animationScreenRef
            org.fortheloss.sticknodes.sprite.SpriteRef r6 = (org.fortheloss.sticknodes.sprite.SpriteRef) r6
            r7.setSessionSelectionToSprite(r6)
        L74:
            r5.setNeedsToBeDrawn()
            return
    }

    public void updateBackgroundImage(com.badlogic.gdx.graphics.Texture r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto Le
            r4._isUsingCreationOrMovieclipBackgroundImage = r0
            r5 = 0
            r4._backgroundImageRef = r5
            r5 = 0
            r4._backgroundImageWidth = r5
            r4._backgroundImageHeight = r5
            goto L4c
        Le:
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 != 0) goto L19
            r4._isUsingCreationOrMovieclipBackgroundImage = r0
            goto L1c
        L19:
            r0 = 1
            r4._isUsingCreationOrMovieclipBackgroundImage = r0
        L1c:
            r4._backgroundImageRef = r5
            com.badlogic.gdx.utils.Scaling r0 = com.badlogic.gdx.utils.Scaling.fit
            int r5 = r5.getWidth()
            float r5 = (float) r5
            com.badlogic.gdx.graphics.Texture r1 = r4._backgroundImageRef
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r2 = r4.getWidth()
            float r3 = r4.getHeight()
            com.badlogic.gdx.math.Vector2 r5 = r0.apply(r5, r1, r2, r3)
            float r0 = r5.x
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r0 = (float) r0
            r4._backgroundImageWidth = r0
            float r5 = r5.y
            double r0 = (double) r5
            double r0 = java.lang.Math.ceil(r0)
            float r5 = (float) r0
            r4._backgroundImageHeight = r5
        L4c:
            r4.setNeedsToBeDrawn()
            return
    }

    public void updateWatermark() {
            r5 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r5._watermarkText
            org.fortheloss.sticknodes.data.ProjectData r1 = r5._projectDataRef
            java.lang.String r1 = r1.watermarkText
            r0.setText(r1)
            org.fortheloss.sticknodes.TextfieldBox r0 = r5._watermarkText
            org.fortheloss.sticknodes.data.ProjectData r1 = r5._projectDataRef
            com.badlogic.gdx.graphics.Color r1 = r1.watermarkColor
            r0.setColor(r1)
            org.fortheloss.sticknodes.TextfieldBox r0 = r5._watermarkText
            float r1 = r0.getWidth()
            float r1 = -r1
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1107296256(0x42000000, float:32.0)
            float r2 = r2 * r3
            float r1 = r1 - r2
            org.fortheloss.sticknodes.TextfieldBox r2 = r5._watermarkText
            float r2 = r2.getHeight()
            float r2 = -r2
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1098907648(0x41800000, float:16.0)
            float r3 = r3 * r4
            float r2 = r2 - r3
            r0.setPosition(r1, r2)
            r5.setNeedsToBeDrawn()
            return
    }

    public void useCircleOutline(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L38
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L38
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setUseCircleOutline(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r0 = 1
            if (r3 == r0) goto L38
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            r3.onStickNodeColorModified(r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L38:
            return
    }

    public void usePolyfillColor(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.setUsePolyfillColor(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r0 = 1
            if (r3 == r0) goto L32
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            r3.onStickNodeColorModified(r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L32:
            return
    }

    public void useSegmentColor(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L38
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L38
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.useSegmentColor(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r0 = 1
            if (r3 == r0) goto L38
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            r3.onStickNodeColorModified(r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L38:
            return
    }

    public void useSegmentGradient(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L38
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L38
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.useGradient(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r0 = 1
            if (r3 == r0) goto L38
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            r3.onStickNodeColorModified(r4)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L38:
            return
    }

    public void useSegmentScale(boolean r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            if (r4 == 0) goto L2f
            boolean r0 = r4.isMainNode()
            if (r0 == 0) goto L9
            goto L2f
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction r0 = (org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction) r0
            r0.initialize(r4)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            r4.useSegmentScale(r3)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getScreen()
            r4 = 1
            if (r3 == r4) goto L2f
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
        L2f:
            return
    }

    public void userArrowMove(float r9, float r10) {
            r8 = this;
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction> r0 = org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction.class
            org.fortheloss.sticknodes.data.SessionData r1 = r8._sessionDataRef
            int r1 = r1.getMode()
            r2 = 3
            if (r1 != r2) goto Lc
            return
        Lc:
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r2 * r3
            float r9 = r9 * r4
            float r2 = r2 * r3
            float r10 = r10 * r2
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L6b
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r8._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getFrameCamera()
            if (r1 == 0) goto L210
            boolean r2 = r1.isAutoCamera()
            if (r2 != 0) goto L210
            org.fortheloss.sticknodes.data.SessionData r2 = r8._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = r2.peekAtUndo()
            if (r2 == 0) goto L46
            boolean r5 = r2 instanceof org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction
            if (r5 == 0) goto L46
            org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction r2 = (org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction) r2
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r2.getCamera()
            if (r2 != r1) goto L46
            r4 = 0
        L46:
            if (r4 == 0) goto L58
            org.fortheloss.sticknodes.data.SessionData r2 = r8._sessionDataRef
            java.lang.Object r0 = r2.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction r0 = (org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction) r0
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r2 = r8._sessionDataRef
            r2.addUserAction(r0)
        L58:
            r1.incrementOffset(r9, r10)
            r8.boundFrameCamera(r1, r3)
            r8.maybeUpdateJoinChains()
            r8.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r9 = r8._framesModuleRef
            r9.setNeedsToBeDrawn()
            goto L210
        L6b:
            if (r1 != r4) goto L134
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r8._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            java.util.ArrayList r2 = r1.getDrawableFigures()
            boolean r5 = r1 instanceof org.fortheloss.sticknodes.data.FrameData
            r6 = 0
            if (r5 == 0) goto L83
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            java.util.ArrayList r1 = r1.getTextfieldBoxes()
            goto L84
        L83:
            r1 = r6
        L84:
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L92
            if (r1 == 0) goto L210
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L210
        L92:
            org.fortheloss.sticknodes.data.SessionData r5 = r8._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r5 = r5.peekAtUndo()
            boolean r7 = r5 instanceof org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction
            if (r7 == 0) goto La6
            r6 = r5
            org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction r6 = (org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction) r6
            java.util.ArrayList r5 = r6.getPannedFigures()
            if (r5 != r2) goto La6
            goto La7
        La6:
            r3 = 1
        La7:
            if (r3 == 0) goto Lba
            org.fortheloss.sticknodes.data.SessionData r3 = r8._sessionDataRef
            java.lang.Object r0 = r3.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction r0 = (org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction) r0
            r0.initialize(r2, r1)
            org.fortheloss.sticknodes.data.SessionData r3 = r8._sessionDataRef
            r3.addUserAction(r0)
            goto Lbd
        Lba:
            r6.panningNeedsAfterProperties()
        Lbd:
            int r0 = r2.size()
            int r0 = r0 - r4
        Lc2:
            if (r0 < 0) goto Lfe
            java.lang.Object r3 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            boolean r5 = r3.isLocked()
            if (r5 != 0) goto Lfb
            boolean r5 = r3.isJoined()
            if (r5 != 0) goto Lfb
            byte r5 = r3.isLockedToCamera()
            if (r5 == 0) goto Ldd
            goto Lfb
        Ldd:
            boolean r5 = r3 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r5 == 0) goto Le7
            r6 = r3
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r6
            r6.unlockStickNode()
        Le7:
            float r6 = r3.getX()
            float r6 = r6 + r9
            float r7 = r3.getY()
            float r7 = r7 + r10
            r3.setPosition(r6, r7)
            if (r5 == 0) goto Lfb
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r3
            r8.maybeUpdateJoinChain(r3)
        Lfb:
            int r0 = r0 + (-1)
            goto Lc2
        Lfe:
            if (r1 == 0) goto L12a
            int r0 = r1.size()
            int r0 = r0 - r4
        L105:
            if (r0 < 0) goto L12a
            java.lang.Object r2 = r1.get(r0)
            org.fortheloss.sticknodes.TextfieldBox r2 = (org.fortheloss.sticknodes.TextfieldBox) r2
            boolean r3 = r2.isLocked()
            if (r3 != 0) goto L127
            boolean r3 = r2.isLockedToCamera()
            if (r3 == 0) goto L11a
            goto L127
        L11a:
            float r3 = r2.getX()
            float r3 = r3 + r9
            float r4 = r2.getY()
            float r4 = r4 + r10
            r2.setPosition(r3, r4)
        L127:
            int r0 = r0 + (-1)
            goto L105
        L12a:
            r8.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r9 = r8._framesModuleRef
            r9.setNeedsToBeDrawn()
            goto L210
        L134:
            if (r1 != 0) goto L210
            org.fortheloss.sticknodes.data.SessionData r1 = r8._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            org.fortheloss.sticknodes.data.SessionData r2 = r8._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r2.getCurrentlySelectedSprite()
            org.fortheloss.sticknodes.data.SessionData r5 = r8._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r5 = r5.getCurrentlySelectedMC()
            org.fortheloss.sticknodes.data.SessionData r6 = r8._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r6 = r6.getCurrentlySelectedTextfieldBox()
            if (r1 != 0) goto L151
            r1 = r2
        L151:
            if (r1 != 0) goto L154
            goto L155
        L154:
            r5 = r1
        L155:
            if (r5 == 0) goto L1c5
        L157:
            if (r5 == 0) goto L168
            boolean r1 = r5.isJoined()
            if (r1 == 0) goto L168
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r5.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r1.getStickfigure()
            goto L157
        L168:
            if (r5 == 0) goto L210
            boolean r1 = r5.isLocked()
            if (r1 != 0) goto L210
            byte r1 = r5.isLockedToCamera()
            if (r1 != 0) goto L210
            org.fortheloss.sticknodes.data.SessionData r1 = r8._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            if (r1 == 0) goto L18b
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction
            if (r2 == 0) goto L18b
            org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction r1 = (org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction) r1
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r1.getFigure()
            if (r1 != r5) goto L18b
            goto L18c
        L18b:
            r3 = 1
        L18c:
            if (r3 == 0) goto L19e
            org.fortheloss.sticknodes.data.SessionData r1 = r8._sessionDataRef
            java.lang.Object r0 = r1.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction r0 = (org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction) r0
            r0.initialize(r5)
            org.fortheloss.sticknodes.data.SessionData r1 = r8._sessionDataRef
            r1.addUserAction(r0)
        L19e:
            boolean r0 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L1a8
            r1 = r5
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r1.unlockStickNode()
        L1a8:
            float r1 = r5.getX()
            float r1 = r1 + r9
            float r9 = r5.getY()
            float r9 = r9 + r10
            r5.setPosition(r1, r9)
            if (r0 == 0) goto L1bc
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r5
            r8.maybeUpdateJoinChain(r5)
        L1bc:
            r8.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r9 = r8._framesModuleRef
            r9.setNeedsToBeDrawn()
            goto L210
        L1c5:
            if (r6 == 0) goto L210
            boolean r1 = r6.isLocked()
            if (r1 != 0) goto L210
            boolean r1 = r6.isLockedToCamera()
            if (r1 != 0) goto L210
            org.fortheloss.sticknodes.data.SessionData r1 = r8._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            if (r1 == 0) goto L1e8
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction
            if (r2 == 0) goto L1e8
            org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction r1 = (org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction) r1
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getTextfield()
            if (r1 != r6) goto L1e8
            goto L1e9
        L1e8:
            r3 = 1
        L1e9:
            if (r3 == 0) goto L1fb
            org.fortheloss.sticknodes.data.SessionData r1 = r8._sessionDataRef
            java.lang.Object r0 = r1.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction r0 = (org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction) r0
            r0.initialize(r6)
            org.fortheloss.sticknodes.data.SessionData r1 = r8._sessionDataRef
            r1.addUserAction(r0)
        L1fb:
            float r0 = r6.getX()
            float r0 = r0 + r9
            float r9 = r6.getY()
            float r9 = r9 + r10
            r6.setPosition(r0, r9)
            r8.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r9 = r8._framesModuleRef
            r9.setNeedsToBeDrawn()
        L210:
            return
    }

    public void writeSessionData(java.io.OutputStream r3) throws java.io.IOException {
            r2 = this;
            float r0 = r2._guidelineX
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2._guidelineY
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2._zoom
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.math.Vector2 r0 = r2._zoomPosition
            float r0 = r0.x
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.math.Vector2 r0 = r2._zoomPosition
            float r0 = r0.y
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r0 = r0.getFiltersQuality()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            return
    }

    public void zoomCameraTo(float r9, org.fortheloss.sticknodes.animationscreen.FrameCamera r10, float r11, float r12, float r13, boolean r14) {
            r8 = this;
            if (r10 != 0) goto L3
            return
        L3:
            r0 = 0
            if (r14 == 0) goto L3c
            org.fortheloss.sticknodes.data.SessionData r1 = r8._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            r2 = 1
            if (r1 == 0) goto L22
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction
            if (r3 == 0) goto L22
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r1
            int r3 = r1.getLastChangedProperty()
            if (r3 != r2) goto L22
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getFrameCamera()
            if (r1 != r10) goto L22
            r2 = 0
        L22:
            if (r2 == 0) goto L3c
            org.fortheloss.sticknodes.data.SessionData r1 = r8._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction> r2 = org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction r1 = (org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction) r1
            r7 = 1
            r2 = r1
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.initialize(r3, r4, r5, r6, r7)
            org.fortheloss.sticknodes.data.SessionData r11 = r8._sessionDataRef
            r11.addUserAction(r1)
        L3c:
            float r11 = r10.getCameraScale()
            r10.setCameraScale(r9)
            float r9 = r8.getWidth()
            float r9 = r9 * r11
            float r12 = r8.getWidth()
            float r13 = r10.getCameraScale()
            float r12 = r12 * r13
            float r9 = r9 - r12
            float r12 = r8.getHeight()
            float r12 = r12 * r11
            float r11 = r8.getHeight()
            float r13 = r10.getCameraScale()
            float r11 = r11 * r13
            float r12 = r12 - r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r11
            float r12 = r12 * r11
            r10.incrementOffset(r9, r12)
            r8.boundFrameCamera(r10, r0)
            r8.setNeedsToBeDrawn()
            if (r14 == 0) goto L7b
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r9 = r8._framesModuleRef
            r9.setNeedsToBeDrawn()
        L7b:
            return
    }
}
