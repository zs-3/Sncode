package org.fortheloss.sticknodes.data;

/* loaded from: classes2.dex */
public class SessionData implements com.badlogic.gdx.utils.Disposable {
    private static org.fortheloss.sticknodes.data.FigureFilterProperties copied_figure_filter_properties;
    private static org.fortheloss.sticknodes.animationscreen.FrameCamera copied_frame_camera;
    private static org.fortheloss.sticknodes.data.useractions.FrameCameraProperties copied_frame_camera_properties;
    private static org.fortheloss.sticknodes.TextfieldBox copied_textfield_box;
    private boolean _alwaysShowCurrentFigureNodes;
    private boolean _androidKeepAppAlive;
    private java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> _animateRedos;
    private java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> _animateUndos;
    private boolean _axisLockingEnabled;
    private boolean _blockUserActions;
    private org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] _copiedCameraLockBundles;
    private com.badlogic.gdx.graphics.Color _copiedColor;
    private java.util.ArrayList<java.lang.Integer> _copiedConnectorPairIndices;
    private org.fortheloss.sticknodes.data.FigureFilterProperties _copiedFigureFilterProperties;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _copiedFrameCamera;
    private org.fortheloss.sticknodes.data.useractions.FrameCameraProperties _copiedFrameCameraProperties;
    private org.fortheloss.sticknodes.data.IFrameData[] _copiedFrameDatas;
    private int _copiedFrameFramesContainerUID;
    private org.fortheloss.sticknodes.movieclip.MCReference _copiedMovieclip;
    private int _copiedMovieclipIndexInFrame;
    private int _copiedSoundID;
    private float _copiedSoundPan;
    private float _copiedSoundPitch;
    private float _copiedSoundVolume;
    private org.fortheloss.sticknodes.sprite.SpriteRef _copiedSprite;
    private int _copiedSpriteIndexInFrame;
    private org.fortheloss.sticknodes.stickfigure.StickNode _copiedStickNode;
    private java.util.ArrayList<java.lang.Integer> _copiedStickNodePolynodeAnchorIndices;
    private java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> _copiedStickNodePolynodeChildrenIndices;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> _copiedStickfigureAndJoins;
    private java.util.ArrayList<com.badlogic.gdx.math.Vector2> _copiedStickfigureAndJoinsData;
    private java.util.ArrayList<java.lang.Integer> _copiedStickfigureAndJoinsLayerOrder;
    private int _copiedStickfigureFramesContainerUID;
    private int _copiedStickfigureIndexInFrame;
    private org.fortheloss.sticknodes.data.StickfigurePropertiesBundle _copiedStickfigurePropertiesBundle;
    private org.fortheloss.sticknodes.TextfieldBox _copiedTextfieldBox;
    private java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> _createRedos;
    private java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> _createUndos;
    private int _currentlySelected;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _currentlySelectedFrameCamera;
    private org.fortheloss.sticknodes.data.IFrameData _currentlySelectedFrameDataRef;
    private org.fortheloss.sticknodes.movieclip.MCReference _currentlySelectedMCRef;
    private org.fortheloss.sticknodes.stickfigure.INode _currentlySelectedNodeRef;
    private org.fortheloss.sticknodes.sprite.SpriteRef _currentlySelectedSpriteRef;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _currentlySelectedStickfigureRef;
    private org.fortheloss.sticknodes.TextfieldBox _currentlySelectedTextfieldBoxRef;
    private boolean _doubleTapForMovieclipsEnabled;
    private boolean _doubleTapForNoneSelectionEnabled;
    private boolean _drawOnionSkinWhenMovingStage;
    private boolean _drawOnlyMainNodes;
    private boolean _drawOnlyMainNodesTemp;
    private int _figureIdBehindCopiedMovieclip;
    private int _figureIdBehindCopiedSprite;
    private int _figureIdBehindCopiedStickfigure;
    private int _figureIdFrontOfCopiedMovieclip;
    private int _figureIdFrontOfCopiedSprite;
    private int _figureIdFrontOfCopiedStickfigure;
    private int _filterShowingState;
    private int _filtersQuality;
    private boolean _idPopupEnabled;
    private boolean _isArrowsVisible;
    private boolean _isMagnifierVisible;
    private boolean _isNormalOnionSkin;
    private boolean _isPlayFullscreen;
    private long _lastSaveMillis;
    private boolean _leftHandMode;
    private org.fortheloss.sticknodes.data.SessionMemoryData _memoryData;
    private int _mode;
    private boolean _neighborNodesAffectedByJoins;
    private boolean _nerdModeEnabled;
    private short _nodeHighlightMode;
    private int _noticeCountMcEditing;
    private int _numCopiedFrames;
    private int _numNextOnionSkinFrames;
    private int _numPrevOnionSkinFrames;
    private int _openGLLineWidth;
    private boolean _pasteWillTryToPreserveLayeringIndex;
    private boolean _preserveSelectionWhenChangingFrames;
    private boolean _quickMenuEnabled;
    private boolean _renderEveryThirdThumbnail;
    private boolean _renderFiltersWhenDragging;
    private boolean _riggerModeEnabled;
    private int _screen;
    private float _sensitivityAxisLocking;
    private float _sensitivityNodeSelection;
    private boolean _showCreationDrawOrder;
    private boolean _showCreationStaticNodes;
    private boolean _showFigureIDs;
    private boolean _showGuides;
    private boolean _showNeighborNodes;
    private boolean _showNeighborNodesCreative;
    private boolean _showOutline;
    private boolean _showOutlineCreative;
    private byte _showQuickResizeTool;
    private boolean _showStageBox;
    private boolean _showZoomButtons;
    private boolean _stickNodeCullingEnabled;
    private int _undoRedoMode;
    private boolean _unlimitedNodesEnabled;
    private org.fortheloss.sticknodes.data.useractions.UserActionPools _userActionPools;
    private int mPlaybackEndFrame;
    private int mPlaybackStartFrame;
    private int mTempPlaybackEndFrame;
    private int mTempPlaybackStartFrame;

    public SessionData(org.fortheloss.sticknodes.animationscreen.AnimationScreen r4, org.fortheloss.sticknodes.animationscreen.FontLoader r5) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3._copiedStickfigureFramesContainerUID = r0
            r3._copiedStickfigureIndexInFrame = r0
            r3._figureIdFrontOfCopiedStickfigure = r0
            r3._figureIdBehindCopiedStickfigure = r0
            r3._copiedMovieclipIndexInFrame = r0
            r3._figureIdFrontOfCopiedMovieclip = r0
            r3._figureIdBehindCopiedMovieclip = r0
            r3._copiedSpriteIndexInFrame = r0
            r3._figureIdFrontOfCopiedSprite = r0
            r3._figureIdBehindCopiedSprite = r0
            r3._copiedSoundID = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3._copiedSoundVolume = r1
            r3._copiedSoundPan = r1
            r3._copiedSoundPitch = r1
            r1 = 0
            r3._numCopiedFrames = r1
            r3._copiedFrameFramesContainerUID = r0
            r3._undoRedoMode = r1
            r0 = 1
            r3._numPrevOnionSkinFrames = r0
            r3._numNextOnionSkinFrames = r0
            r3._isNormalOnionSkin = r0
            r3._drawOnlyMainNodes = r1
            r3._drawOnlyMainNodesTemp = r1
            r3._alwaysShowCurrentFigureNodes = r0
            r3._showCreationStaticNodes = r0
            r3._showCreationDrawOrder = r1
            r3._showFigureIDs = r1
            r3._showOutline = r1
            r3._showOutlineCreative = r0
            r3._showNeighborNodes = r0
            r3._showNeighborNodesCreative = r0
            r3._showQuickResizeTool = r1
            r3._showZoomButtons = r1
            r3._showGuides = r1
            r3._isMagnifierVisible = r1
            r3._isArrowsVisible = r1
            r3._isPlayFullscreen = r1
            r3._pasteWillTryToPreserveLayeringIndex = r1
            r3._preserveSelectionWhenChangingFrames = r1
            r3._nodeHighlightMode = r1
            r3._screen = r1
            r3._mode = r1
            r3._currentlySelected = r1
            r3._unlimitedNodesEnabled = r1
            r3._axisLockingEnabled = r1
            r3._quickMenuEnabled = r0
            r3._idPopupEnabled = r0
            r3._leftHandMode = r1
            r3._doubleTapForMovieclipsEnabled = r1
            r3._doubleTapForNoneSelectionEnabled = r1
            r3._nerdModeEnabled = r1
            r3._riggerModeEnabled = r1
            r3._androidKeepAppAlive = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r3._sensitivityNodeSelection = r2
            r3._sensitivityAxisLocking = r2
            r3._openGLLineWidth = r0
            r3._stickNodeCullingEnabled = r1
            r3._drawOnionSkinWhenMovingStage = r1
            r3._renderFiltersWhenDragging = r0
            r3._renderEveryThirdThumbnail = r0
            r2 = 2
            r3._filterShowingState = r2
            r3._showStageBox = r0
            r3._neighborNodesAffectedByJoins = r0
            r3._filtersQuality = r2
            r3.mPlaybackStartFrame = r1
            r3.mPlaybackEndFrame = r1
            r3.mTempPlaybackStartFrame = r1
            r3.mTempPlaybackEndFrame = r1
            r3._blockUserActions = r1
            r3._noticeCountMcEditing = r1
            r0 = 0
            r3._lastSaveMillis = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3._animateUndos = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3._animateRedos = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3._createUndos = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3._createRedos = r0
            org.fortheloss.sticknodes.data.useractions.UserActionPools r0 = new org.fortheloss.sticknodes.data.useractions.UserActionPools
            r1 = 25
            r0.<init>(r4, r1)
            r3._userActionPools = r0
            r4 = 26
            org.fortheloss.sticknodes.data.IFrameData[] r4 = new org.fortheloss.sticknodes.data.IFrameData[r4]
            r3._copiedFrameDatas = r4
            org.fortheloss.sticknodes.TextfieldBox r4 = org.fortheloss.sticknodes.data.SessionData.copied_textfield_box
            if (r4 == 0) goto Le1
            int r4 = r4.getFontID()
            r5.loadFont(r4)
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties r4 = new org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties
            org.fortheloss.sticknodes.TextfieldBox r0 = org.fortheloss.sticknodes.data.SessionData.copied_textfield_box
            r4.<init>(r0)
            org.fortheloss.sticknodes.TextfieldBox r0 = new org.fortheloss.sticknodes.TextfieldBox
            r0.<init>(r5)
            r0.setProperties(r4)
            r3.setCopiedTextfield(r0)
        Le1:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r4 = org.fortheloss.sticknodes.data.SessionData.copied_frame_camera
            if (r4 == 0) goto Le8
            r3.setCopiedFrameCamera(r4)
        Le8:
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r4 = org.fortheloss.sticknodes.data.SessionData.copied_frame_camera_properties
            if (r4 == 0) goto Lef
            r3.setCopiedFrameCameraProperties(r4)
        Lef:
            org.fortheloss.sticknodes.data.FigureFilterProperties r4 = org.fortheloss.sticknodes.data.SessionData.copied_figure_filter_properties
            if (r4 == 0) goto Lf6
            r3.setCopiedFigureFilterProperties(r4)
        Lf6:
            return
    }

    private int getFigureIndexInFrame(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4, java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r5) {
            r3 = this;
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1c
            java.lang.Object r1 = r5.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r1 = r1.getID()
            int r2 = r4.getID()
            if (r1 != r2) goto L19
            return r0
        L19:
            int r0 = r0 + (-1)
            goto L6
        L1c:
            r4 = -1
            return r4
    }

    private void updateCrashPastActionKeys() {
            r11 = this;
            int r0 = r11._undoRedoMode
            if (r0 != 0) goto Lb
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r11._animateUndos
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r11._animateRedos
            java.lang.String r2 = "[ANIMATING] Undos:"
            goto L11
        Lb:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r11._createUndos
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r11._createRedos
            java.lang.String r2 = "[CREATING] Undos:"
        L11:
            int r3 = r0.size()
            int r4 = r1.size()
            int r5 = r3 + (-10)
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            int r7 = r4 + (-10)
            int r6 = java.lang.Math.max(r6, r7)
            java.lang.String r7 = ","
            java.lang.String r8 = ""
            r9 = r8
        L2b:
            if (r5 >= r3) goto L5d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r9)
            java.lang.String r2 = r10.toString()
            java.lang.Object r9 = r0.get(r5)
            org.fortheloss.sticknodes.data.useractions.UserAction r9 = (org.fortheloss.sticknodes.data.useractions.UserAction) r9
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getSimpleName()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r9)
            java.lang.String r2 = r10.toString()
            int r5 = r5 + 1
            r9 = r7
            goto L2b
        L5d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " | Redos:"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r4 = r4 + (-1)
        L70:
            if (r4 < r6) goto La2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = r2.toString()
            java.lang.Object r2 = r1.get(r4)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            int r4 = r4 + (-1)
            r8 = r7
            goto L70
        La2:
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            java.lang.String r2 = "most_recent_user_actions"
            r1.setCrashlyticsKeyString(r2, r0)
            return
    }

    public void addUserAction(org.fortheloss.sticknodes.data.useractions.UserAction r4) {
            r3 = this;
            boolean r0 = r3._blockUserActions
            if (r0 == 0) goto L8
            r4.dispose()
            return
        L8:
            int r0 = r3._undoRedoMode
            r1 = 25
            r2 = 0
            if (r0 != 0) goto L7b
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r3._animateUndos
            r0.add(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._animateUndos
            int r4 = r4.size()
            if (r4 <= r1) goto L53
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._animateUndos
            r3.updateCrashRepooledActionKey(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._animateUndos
            java.lang.Object r4 = r4.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r4 = (org.fortheloss.sticknodes.data.useractions.UserAction) r4
            org.fortheloss.sticknodes.data.useractions.UserActionPools r0 = r3._userActionPools
            r0.repool(r4)
        L2e:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._animateUndos
            java.lang.Object r4 = r4.get(r2)
            boolean r4 = r4 instanceof org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction
            if (r4 == 0) goto L53
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._animateUndos
            java.lang.Object r4 = r4.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r4 = (org.fortheloss.sticknodes.data.useractions.UserAction) r4
            org.fortheloss.sticknodes.data.useractions.UserActionPools r0 = r3._userActionPools
            r0.repool(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._animateUndos
            java.lang.Object r4 = r4.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r4 = (org.fortheloss.sticknodes.data.useractions.UserAction) r4
            org.fortheloss.sticknodes.data.useractions.UserActionPools r0 = r3._userActionPools
            r0.repool(r4)
            goto L2e
        L53:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._animateRedos
            int r4 = r4.size()
            if (r4 <= 0) goto Le6
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._animateRedos
            int r4 = r4.size()
            int r4 = r4 + (-1)
        L63:
            if (r4 < 0) goto L75
            org.fortheloss.sticknodes.data.useractions.UserActionPools r0 = r3._userActionPools
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r3._animateRedos
            java.lang.Object r1 = r1.get(r4)
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = (org.fortheloss.sticknodes.data.useractions.UserAction) r1
            r0.repool(r1)
            int r4 = r4 + (-1)
            goto L63
        L75:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._animateRedos
            r4.clear()
            goto Le6
        L7b:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r3._createUndos
            r0.add(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._createUndos
            int r4 = r4.size()
            if (r4 <= r1) goto Lbf
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._createUndos
            r3.updateCrashRepooledActionKey(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._createUndos
            java.lang.Object r4 = r4.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r4 = (org.fortheloss.sticknodes.data.useractions.UserAction) r4
            org.fortheloss.sticknodes.data.useractions.UserActionPools r0 = r3._userActionPools
            r0.repool(r4)
        L9a:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._createUndos
            java.lang.Object r4 = r4.get(r2)
            boolean r4 = r4 instanceof org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction
            if (r4 == 0) goto Lbf
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._createUndos
            java.lang.Object r4 = r4.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r4 = (org.fortheloss.sticknodes.data.useractions.UserAction) r4
            org.fortheloss.sticknodes.data.useractions.UserActionPools r0 = r3._userActionPools
            r0.repool(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._createUndos
            java.lang.Object r4 = r4.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r4 = (org.fortheloss.sticknodes.data.useractions.UserAction) r4
            org.fortheloss.sticknodes.data.useractions.UserActionPools r0 = r3._userActionPools
            r0.repool(r4)
            goto L9a
        Lbf:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._createRedos
            int r4 = r4.size()
            if (r4 <= 0) goto Le6
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._createRedos
            int r4 = r4.size()
            int r4 = r4 + (-1)
        Lcf:
            if (r4 < 0) goto Le1
            org.fortheloss.sticknodes.data.useractions.UserActionPools r0 = r3._userActionPools
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r3._createRedos
            java.lang.Object r1 = r1.get(r4)
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = (org.fortheloss.sticknodes.data.useractions.UserAction) r1
            r0.repool(r1)
            int r4 = r4 + (-1)
            goto Lcf
        Le1:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r4 = r3._createRedos
            r4.clear()
        Le6:
            r3.updateCrashPastActionKeys()
            return
    }

    public void blockUserActions(boolean r1) {
            r0 = this;
            r0._blockUserActions = r1
            return
    }

    public void clearAnimateUndoRedo() {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r3._animateUndos
            int r0 = r0.size()
            if (r0 <= 0) goto L27
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r3._animateUndos
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L10:
            if (r0 < 0) goto L22
            org.fortheloss.sticknodes.data.useractions.UserActionPools r1 = r3._userActionPools
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r2 = r3._animateUndos
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            r1.repool(r2)
            int r0 = r0 + (-1)
            goto L10
        L22:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r3._animateUndos
            r0.clear()
        L27:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r3._animateRedos
            int r0 = r0.size()
            if (r0 <= 0) goto L4e
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r3._animateRedos
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L37:
            if (r0 < 0) goto L49
            org.fortheloss.sticknodes.data.useractions.UserActionPools r1 = r3._userActionPools
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r2 = r3._animateRedos
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            r1.repool(r2)
            int r0 = r0 + (-1)
            goto L37
        L49:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r3._animateRedos
            r0.clear()
        L4e:
            return
    }

    public void clearCopiedFigures() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._copiedStickfigureAndJoins
            if (r0 == 0) goto L19
        L4:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._copiedStickfigureAndJoins
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L19
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._copiedStickfigureAndJoins
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            r0.dispose()
            goto L4
        L19:
            r0 = 0
            r2._copiedStickfigureAndJoins = r0
            r2._copiedStickfigureAndJoinsData = r0
            r2._copiedStickfigureAndJoinsLayerOrder = r0
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r2._copiedMovieclip
            if (r1 == 0) goto L27
            r1.dispose()
        L27:
            r2._copiedMovieclip = r0
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r2._copiedSprite
            if (r1 == 0) goto L30
            r1.dispose()
        L30:
            r2._copiedSprite = r0
            org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r1 = r2._copiedStickfigurePropertiesBundle
            if (r1 == 0) goto L39
            r1.dispose()
        L39:
            r2._copiedStickfigurePropertiesBundle = r0
            return
    }

    public void clearCopiedFrames() {
            r0 = this;
            r0.disposeCopiedFrames()
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            r4._copiedColor = r0
            r4._memoryData = r0
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r4._copiedMovieclip
            if (r1 == 0) goto Le
            r1.dispose()
            r4._copiedMovieclip = r0
        Le:
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r4._copiedSprite
            if (r1 == 0) goto L17
            r1.dispose()
            r4._copiedSprite = r0
        L17:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r4._copiedStickfigureAndJoins
            if (r1 == 0) goto L38
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L21:
            if (r1 < 0) goto L31
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r4._copiedStickfigureAndJoins
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L21
        L31:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r4._copiedStickfigureAndJoins
            r1.clear()
            r4._copiedStickfigureAndJoins = r0
        L38:
            r4._copiedStickfigureAndJoinsData = r0
            r4._copiedStickfigureAndJoinsLayerOrder = r0
            r4._copiedConnectorPairIndices = r0
            r4._copiedStickNodePolynodeAnchorIndices = r0
            r4._copiedStickNodePolynodeChildrenIndices = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r4._copiedStickNode
            if (r1 == 0) goto L4b
            r1.dispose()
            r4._copiedStickNode = r0
        L4b:
            org.fortheloss.sticknodes.data.IFrameData[] r1 = r4._copiedFrameDatas
            if (r1 == 0) goto L64
            int r1 = r1.length
            int r1 = r1 + (-1)
        L52:
            if (r1 < 0) goto L62
            org.fortheloss.sticknodes.data.IFrameData[] r2 = r4._copiedFrameDatas
            r3 = r2[r1]
            if (r3 == 0) goto L5f
            r2 = r2[r1]
            r2.dispose()
        L5f:
            int r1 = r1 + (-1)
            goto L52
        L62:
            r4._copiedFrameDatas = r0
        L64:
            org.fortheloss.sticknodes.TextfieldBox r1 = r4._copiedTextfieldBox
            if (r1 == 0) goto L6d
            r1.dispose()
            r4._copiedTextfieldBox = r0
        L6d:
            r4._copiedFrameCamera = r0
            org.fortheloss.sticknodes.data.FigureFilterProperties r1 = r4._copiedFigureFilterProperties
            if (r1 == 0) goto L78
            r1.dispose()
            r4._copiedFigureFilterProperties = r0
        L78:
            org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r1 = r4._copiedStickfigurePropertiesBundle
            if (r1 == 0) goto L81
            r1.dispose()
            r4._copiedStickfigurePropertiesBundle = r0
        L81:
            r4._copiedFrameCameraProperties = r0
            r4._copiedCameraLockBundles = r0
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r4._animateUndos
            if (r1 == 0) goto La1
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L8f:
            if (r1 < 0) goto L9f
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r2 = r4._animateUndos
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L8f
        L9f:
            r4._animateUndos = r0
        La1:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r4._animateRedos
            if (r1 == 0) goto Lbd
            int r1 = r1.size()
            int r1 = r1 + (-1)
        Lab:
            if (r1 < 0) goto Lbb
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r2 = r4._animateRedos
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto Lab
        Lbb:
            r4._animateRedos = r0
        Lbd:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r4._createUndos
            if (r1 == 0) goto Ld9
            int r1 = r1.size()
            int r1 = r1 + (-1)
        Lc7:
            if (r1 < 0) goto Ld7
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r2 = r4._createUndos
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto Lc7
        Ld7:
            r4._createUndos = r0
        Ld9:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r4._createRedos
            if (r1 == 0) goto Lf5
            int r1 = r1.size()
            int r1 = r1 + (-1)
        Le3:
            if (r1 < 0) goto Lf3
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r2 = r4._createRedos
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto Le3
        Lf3:
            r4._createRedos = r0
        Lf5:
            org.fortheloss.sticknodes.data.useractions.UserActionPools r1 = r4._userActionPools
            if (r1 == 0) goto Lfe
            r1.dispose()
            r4._userActionPools = r0
        Lfe:
            r4._currentlySelectedStickfigureRef = r0
            r4._currentlySelectedNodeRef = r0
            r4._currentlySelectedMCRef = r0
            r4._currentlySelectedSpriteRef = r0
            r4._currentlySelectedTextfieldBoxRef = r0
            r4._currentlySelectedFrameCamera = r0
            r4._currentlySelectedFrameDataRef = r0
            return
    }

    public void disposeCopiedFrames() {
            r2 = this;
            org.fortheloss.sticknodes.data.IFrameData[] r0 = r2._copiedFrameDatas
            int r0 = r0.length
            int r0 = r0 + (-1)
        L5:
            if (r0 < 0) goto L13
            org.fortheloss.sticknodes.data.IFrameData[] r1 = r2._copiedFrameDatas
            r1 = r1[r0]
            if (r1 == 0) goto L10
            r1.dispose()
        L10:
            int r0 = r0 + (-1)
            goto L5
        L13:
            r0 = 0
            r2._numCopiedFrames = r0
            r0 = -1
            r2._copiedFrameFramesContainerUID = r0
            return
    }

    public boolean getAlwaysShowCurrentFigureNodes() {
            r2 = this;
            boolean r0 = r2._alwaysShowCurrentFigureNodes
            r1 = 1
            if (r0 == 0) goto La
            int r0 = r2._screen
            if (r0 == r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public boolean getAndroidKeepAppAlive() {
            r1 = this;
            boolean r0 = r1._androidKeepAppAlive
            return r0
    }

    public boolean getAxisLockingIsEnabled() {
            r1 = this;
            boolean r0 = r1._axisLockingEnabled
            return r0
    }

    public float getAxisLockingSensitivity() {
            r1 = this;
            float r0 = r1._sensitivityAxisLocking
            return r0
    }

    public java.util.ArrayList<java.lang.Integer> getCopiedConnectorPairIndices() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1._copiedConnectorPairIndices
            return r0
    }

    public org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] getCopiedFigureCameraLockBundles() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r0 = r1._copiedCameraLockBundles
            return r0
    }

    public org.fortheloss.sticknodes.data.FigureFilterProperties getCopiedFigureFilterProperties() {
            r1 = this;
            org.fortheloss.sticknodes.data.FigureFilterProperties r0 = r1._copiedFigureFilterProperties
            return r0
    }

    public org.fortheloss.sticknodes.animationscreen.FrameCamera getCopiedFrameCamera() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r1._copiedFrameCamera
            return r0
    }

    public org.fortheloss.sticknodes.data.useractions.FrameCameraProperties getCopiedFrameCameraProperties() {
            r1 = this;
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = r1._copiedFrameCameraProperties
            return r0
    }

    public int getCopiedFrameFramesContainerUID() {
            r1 = this;
            int r0 = r1._copiedFrameFramesContainerUID
            return r0
    }

    public org.fortheloss.sticknodes.data.IFrameData[] getCopiedFrames() {
            r1 = this;
            org.fortheloss.sticknodes.data.IFrameData[] r0 = r1._copiedFrameDatas
            return r0
    }

    public org.fortheloss.sticknodes.movieclip.MCReference getCopiedMovieclip() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._copiedMovieclip
            return r0
    }

    public int getCopiedMovieclipFigureIdBehind() {
            r1 = this;
            int r0 = r1._figureIdBehindCopiedMovieclip
            return r0
    }

    public int getCopiedMovieclipFigureIdFront() {
            r1 = this;
            int r0 = r1._figureIdFrontOfCopiedMovieclip
            return r0
    }

    public int getCopiedMovieclipIndexInFrame() {
            r1 = this;
            int r0 = r1._copiedMovieclipIndexInFrame
            return r0
    }

    public int getCopiedSoundID() {
            r1 = this;
            int r0 = r1._copiedSoundID
            return r0
    }

    public float getCopiedSoundPan() {
            r1 = this;
            float r0 = r1._copiedSoundPan
            return r0
    }

    public float getCopiedSoundPitch() {
            r1 = this;
            float r0 = r1._copiedSoundPitch
            return r0
    }

    public float getCopiedSoundVolume() {
            r1 = this;
            float r0 = r1._copiedSoundVolume
            return r0
    }

    public org.fortheloss.sticknodes.sprite.SpriteRef getCopiedSprite() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r1._copiedSprite
            return r0
    }

    public int getCopiedSpriteFigureIdBehind() {
            r1 = this;
            int r0 = r1._figureIdBehindCopiedSprite
            return r0
    }

    public int getCopiedSpriteFigureIdFront() {
            r1 = this;
            int r0 = r1._figureIdFrontOfCopiedSprite
            return r0
    }

    public int getCopiedSpriteIndexInFrame() {
            r1 = this;
            int r0 = r1._copiedSpriteIndexInFrame
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode getCopiedStickNode() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._copiedStickNode
            return r0
    }

    public java.util.ArrayList<java.lang.Integer> getCopiedStickNodePolynodeAnchorIndices() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1._copiedStickNodePolynodeAnchorIndices
            return r0
    }

    public java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> getCopiedStickNodePolynodeChildrenIndices() {
            r1 = this;
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> r0 = r1._copiedStickNodePolynodeChildrenIndices
            return r0
    }

    public int getCopiedStickfigureFigureIdBehind() {
            r1 = this;
            int r0 = r1._figureIdBehindCopiedStickfigure
            return r0
    }

    public int getCopiedStickfigureFigureIdFront() {
            r1 = this;
            int r0 = r1._figureIdFrontOfCopiedStickfigure
            return r0
    }

    public int getCopiedStickfigureFramesContainerUID() {
            r1 = this;
            int r0 = r1._copiedStickfigureFramesContainerUID
            return r0
    }

    public int getCopiedStickfigureIndexInFrame() {
            r1 = this;
            int r0 = r1._copiedStickfigureIndexInFrame
            return r0
    }

    public java.util.ArrayList<com.badlogic.gdx.math.Vector2> getCopiedStickfigureJoinData() {
            r1 = this;
            java.util.ArrayList<com.badlogic.gdx.math.Vector2> r0 = r1._copiedStickfigureAndJoinsData
            return r0
    }

    public java.util.ArrayList<java.lang.Integer> getCopiedStickfigureLayerOrder() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1._copiedStickfigureAndJoinsLayerOrder
            return r0
    }

    public org.fortheloss.sticknodes.data.StickfigurePropertiesBundle getCopiedStickfigurePropertiesBundle() {
            r1 = this;
            org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r0 = r1._copiedStickfigurePropertiesBundle
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> getCopiedStickfigureWithJoins() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._copiedStickfigureAndJoins
            return r0
    }

    public org.fortheloss.sticknodes.TextfieldBox getCopiedTextfield() {
            r1 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._copiedTextfieldBox
            return r0
    }

    public int getCurrentlySelected() {
            r1 = this;
            int r0 = r1._currentlySelected
            return r0
    }

    public org.fortheloss.sticknodes.animationscreen.FrameCamera getCurrentlySelectedFrameCamera() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r1._currentlySelectedFrameCamera
            return r0
    }

    public org.fortheloss.sticknodes.data.IFrameData getCurrentlySelectedFrameData() {
            r1 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r1._currentlySelectedFrameDataRef
            return r0
    }

    public org.fortheloss.sticknodes.movieclip.MCReference getCurrentlySelectedMC() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._currentlySelectedMCRef
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.INode getCurrentlySelectedNode() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.INode r0 = r1._currentlySelectedNodeRef
            return r0
    }

    public org.fortheloss.sticknodes.sprite.SpriteRef getCurrentlySelectedSprite() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r1._currentlySelectedSpriteRef
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.Stickfigure getCurrentlySelectedStickfigure() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1._currentlySelectedStickfigureRef
            return r0
    }

    public org.fortheloss.sticknodes.TextfieldBox getCurrentlySelectedTextfieldBox() {
            r1 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._currentlySelectedTextfieldBoxRef
            return r0
    }

    public boolean getDoubleTapForMovieclipsEnabled() {
            r1 = this;
            boolean r0 = r1._doubleTapForMovieclipsEnabled
            return r0
    }

    public boolean getDoubleTapForNoneSelectionEnabled() {
            r1 = this;
            boolean r0 = r1._doubleTapForNoneSelectionEnabled
            return r0
    }

    public boolean getDrawOnionSkinWhenMovingStage() {
            r1 = this;
            boolean r0 = r1._drawOnionSkinWhenMovingStage
            return r0
    }

    public int getFilterShowingState() {
            r1 = this;
            int r0 = r1._filterShowingState
            return r0
    }

    public int getFiltersQuality() {
            r1 = this;
            int r0 = r1._filtersQuality
            return r0
    }

    public boolean getIsArrowsVisible() {
            r1 = this;
            boolean r0 = r1._isArrowsVisible
            return r0
    }

    public boolean getIsLeftHandMode() {
            r1 = this;
            boolean r0 = r1._leftHandMode
            return r0
    }

    public boolean getIsMagnifierVisible() {
            r1 = this;
            boolean r0 = r1._isMagnifierVisible
            return r0
    }

    public boolean getIsNormalOnionSkin() {
            r1 = this;
            boolean r0 = r1._isNormalOnionSkin
            return r0
    }

    public boolean getIsOnlyDrawingMainNodes() {
            r1 = this;
            boolean r0 = r1._drawOnlyMainNodes
            if (r0 != 0) goto Lb
            boolean r0 = r1._drawOnlyMainNodesTemp
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    public boolean getIsPlayFullscreen() {
            r1 = this;
            boolean r0 = r1._isPlayFullscreen
            return r0
    }

    public boolean getIsShowingCreationDrawOrder() {
            r1 = this;
            boolean r0 = r1._showCreationDrawOrder
            return r0
    }

    public boolean getIsShowingCreationStaticNodes() {
            r1 = this;
            boolean r0 = r1._showCreationStaticNodes
            return r0
    }

    public boolean getIsShowingFigureIDs() {
            r1 = this;
            boolean r0 = r1._showFigureIDs
            return r0
    }

    public boolean getIsShowingGuides() {
            r1 = this;
            boolean r0 = r1._showGuides
            return r0
    }

    public boolean getIsShowingIdPopup() {
            r1 = this;
            boolean r0 = r1._idPopupEnabled
            return r0
    }

    public boolean getIsShowingNeighborNodes() {
            r2 = this;
            int r0 = r2._screen
            r1 = 1
            if (r0 != r1) goto L8
            boolean r0 = r2._showNeighborNodesCreative
            return r0
        L8:
            boolean r0 = r2._showNeighborNodes
            return r0
    }

    public boolean getIsShowingNeighborNodesCreative() {
            r1 = this;
            boolean r0 = r1._showNeighborNodesCreative
            return r0
    }

    public boolean getIsShowingOutline() {
            r2 = this;
            int r0 = r2._screen
            r1 = 1
            if (r0 != r1) goto L8
            boolean r0 = r2._showOutlineCreative
            return r0
        L8:
            boolean r0 = r2._showOutline
            return r0
    }

    public boolean getIsShowingOutlineCreative() {
            r1 = this;
            boolean r0 = r1._showOutlineCreative
            return r0
    }

    public short getIsShowingQuickResizeTool() {
            r1 = this;
            byte r0 = r1._showQuickResizeTool
            short r0 = (short) r0
            return r0
    }

    public boolean getIsShowingStageBox() {
            r1 = this;
            boolean r0 = r1._showStageBox
            return r0
    }

    public boolean getIsShowingZoomButtons() {
            r1 = this;
            boolean r0 = r1._showZoomButtons
            return r0
    }

    public long getLastSaveMillis() {
            r2 = this;
            long r0 = r2._lastSaveMillis
            return r0
    }

    public org.fortheloss.sticknodes.data.SessionMemoryData getMemoryData() {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionMemoryData r0 = r1._memoryData
            return r0
    }

    public int getMode() {
            r1 = this;
            int r0 = r1._mode
            return r0
    }

    public boolean getNeighborNodesAffectedByJoins() {
            r1 = this;
            boolean r0 = r1._neighborNodesAffectedByJoins
            return r0
    }

    public boolean getNerdModeEnabled() {
            r1 = this;
            boolean r0 = r1._nerdModeEnabled
            return r0
    }

    public short getNodeHighlightMode() {
            r1 = this;
            short r0 = r1._nodeHighlightMode
            return r0
    }

    public float getNodeSelectionSensitivity() {
            r1 = this;
            float r0 = r1._sensitivityNodeSelection
            return r0
    }

    public int getNoticeCountMcEditing() {
            r1 = this;
            int r0 = r1._noticeCountMcEditing
            return r0
    }

    public int getNumCopiedFrames() {
            r1 = this;
            int r0 = r1._numCopiedFrames
            return r0
    }

    public int getNumNextOnionSkinFrames() {
            r1 = this;
            int r0 = r1._numNextOnionSkinFrames
            return r0
    }

    public int getNumPrevOnionSkinFrames() {
            r1 = this;
            int r0 = r1._numPrevOnionSkinFrames
            return r0
    }

    public int getOpenGLLineWidth() {
            r1 = this;
            int r0 = r1._openGLLineWidth
            return r0
    }

    public boolean getPasteWillTryToPreserveLayeringIndex() {
            r1 = this;
            boolean r0 = r1._pasteWillTryToPreserveLayeringIndex
            return r0
    }

    public int getPlaybackEndFrame() {
            r1 = this;
            int r0 = r1._screen
            if (r0 != 0) goto L7
            int r0 = r1.mPlaybackEndFrame
            goto L9
        L7:
            int r0 = r1.mTempPlaybackEndFrame
        L9:
            return r0
    }

    public int getPlaybackStartFrame() {
            r1 = this;
            int r0 = r1._screen
            if (r0 != 0) goto L7
            int r0 = r1.mPlaybackStartFrame
            goto L9
        L7:
            int r0 = r1.mTempPlaybackStartFrame
        L9:
            return r0
    }

    public boolean getPreserveSelectionWhenChangingFrames() {
            r1 = this;
            boolean r0 = r1._preserveSelectionWhenChangingFrames
            return r0
    }

    public boolean getQuickMenuIsEnabled() {
            r1 = this;
            boolean r0 = r1._quickMenuEnabled
            return r0
    }

    public boolean getRenderEveryThirdThumbnail() {
            r1 = this;
            boolean r0 = r1._renderEveryThirdThumbnail
            return r0
    }

    public boolean getRenderFiltersWhenDragging() {
            r1 = this;
            boolean r0 = r1._renderFiltersWhenDragging
            return r0
    }

    public boolean getRiggerModeEnabled() {
            r1 = this;
            boolean r0 = r1._riggerModeEnabled
            return r0
    }

    public int getScreen() {
            r1 = this;
            int r0 = r1._screen
            return r0
    }

    public boolean getStickNodeCullingEnabled() {
            r1 = this;
            boolean r0 = r1._stickNodeCullingEnabled
            return r0
    }

    public boolean getUnlimitedNodesIsEnabled() {
            r1 = this;
            boolean r0 = r1._unlimitedNodesEnabled
            return r0
    }

    public <T> T getUserAction(java.lang.Class<T> r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.useractions.UserActionPools r0 = r1._userActionPools
            com.badlogic.gdx.utils.Pool r2 = r0.getPool(r2)
            java.lang.Object r2 = r2.obtain()
            return r2
    }

    public void incrementNoticeCountMcEditing() {
            r1 = this;
            int r0 = r1._noticeCountMcEditing
            int r0 = r0 + 1
            r1._noticeCountMcEditing = r0
            return
    }

    public boolean isBlockingUserActions() {
            r1 = this;
            boolean r0 = r1._blockUserActions
            return r0
    }

    public org.fortheloss.sticknodes.data.useractions.UserAction peekAtUndo() {
            r2 = this;
            int r0 = r2._undoRedoMode
            r1 = 0
            if (r0 != 0) goto L1d
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r2._animateUndos
            int r0 = r0.size()
            if (r0 > 0) goto Le
            return r1
        Le:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r2._animateUndos
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = (org.fortheloss.sticknodes.data.useractions.UserAction) r0
            return r0
        L1d:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r2._createUndos
            int r0 = r0.size()
            if (r0 > 0) goto L26
            return r1
        L26:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r2._createUndos
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = (org.fortheloss.sticknodes.data.useractions.UserAction) r0
            return r0
    }

    public void redo() {
            r7 = this;
            int r0 = r7._undoRedoMode
            if (r0 != 0) goto L9
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r7._animateUndos
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r7._animateRedos
            goto Ld
        L9:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r7._createUndos
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r7._createRedos
        Ld:
            int r2 = r1.size()
            if (r2 > 0) goto L14
            return
        L14:
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r1.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Redoing a UserAction of type "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.println(r4)
            r2.redo()
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r4 = "Redone.\n"
            r3.println(r4)
            r0.add(r2)
        L4b:
            int r2 = r1.size()
            if (r2 <= 0) goto Lb0
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r1.get(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            boolean r2 = r2 instanceof org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction
            if (r2 != 0) goto L62
            goto Lb0
        L62:
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = "    (A DoubleUndoRedoAction was encountered...)"
            r2.println(r3)
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r1.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            r0.add(r2)
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r1.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "    Redoing a UserAction of type "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.println(r4)
            r2.redo()
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r4 = "    Redone.\n"
            r3.println(r4)
            r0.add(r2)
            goto L4b
        Lb0:
            int r1 = r0.size()
            r2 = 25
            if (r1 <= r2) goto Le2
            org.fortheloss.sticknodes.data.useractions.UserActionPools r1 = r7._userActionPools
            r2 = 0
            java.lang.Object r3 = r0.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r3 = (org.fortheloss.sticknodes.data.useractions.UserAction) r3
            r1.repool(r3)
            java.lang.Object r1 = r0.get(r2)
            boolean r1 = r1 instanceof org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction
            if (r1 == 0) goto Le2
            org.fortheloss.sticknodes.data.useractions.UserActionPools r1 = r7._userActionPools
            java.lang.Object r3 = r0.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r3 = (org.fortheloss.sticknodes.data.useractions.UserAction) r3
            r1.repool(r3)
            org.fortheloss.sticknodes.data.useractions.UserActionPools r1 = r7._userActionPools
            java.lang.Object r0 = r0.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = (org.fortheloss.sticknodes.data.useractions.UserAction) r0
            r1.repool(r0)
        Le2:
            r7.updateCrashPastActionKeys()
            return
    }

    public org.fortheloss.sticknodes.data.useractions.UserAction removeLatestUserAction() {
            r2 = this;
            int r0 = r2._undoRedoMode
            r1 = 0
            if (r0 != 0) goto L1d
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r2._animateUndos
            int r0 = r0.size()
            if (r0 > 0) goto Le
            return r1
        Le:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r2._animateUndos
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.remove(r1)
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = (org.fortheloss.sticknodes.data.useractions.UserAction) r0
            return r0
        L1d:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r2._createUndos
            int r0 = r0.size()
            if (r0 > 0) goto L26
            return r1
        L26:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r2._createUndos
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.remove(r1)
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = (org.fortheloss.sticknodes.data.useractions.UserAction) r0
            return r0
    }

    public void setAlwaysShowCurrentFigureNodes(boolean r1) {
            r0 = this;
            r0._alwaysShowCurrentFigureNodes = r1
            return
    }

    public void setAndroidKeepAppAlive(boolean r1) {
            r0 = this;
            r0._androidKeepAppAlive = r1
            return
    }

    public void setArrowsVisible(boolean r1) {
            r0 = this;
            r0._isArrowsVisible = r1
            return
    }

    public void setAxisLockingEnabled(boolean r1) {
            r0 = this;
            r0._axisLockingEnabled = r1
            return
    }

    public void setAxisLockingSensitivity(float r3) {
            r2 = this;
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._sensitivityAxisLocking = r0
            goto L15
        La:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L13
            r2._sensitivityAxisLocking = r0
            goto L15
        L13:
            r2._sensitivityAxisLocking = r3
        L15:
            return
    }

    public void setCopiedColorPickerData(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            com.badlogic.gdx.graphics.Color r0 = r2._copiedColor
            if (r0 != 0) goto Lb
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r2._copiedColor = r0
        Lb:
            com.badlogic.gdx.graphics.Color r0 = r2._copiedColor
            r0.set(r3)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor7
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.framework.ColorPicker.recentColor6
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor6
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.framework.ColorPicker.recentColor5
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor5
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.framework.ColorPicker.recentColor4
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor4
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.framework.ColorPicker.recentColor3
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor3
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.framework.ColorPicker.recentColor2
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor2
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.framework.ColorPicker.recentColor1
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.framework.ColorPicker.recentColor1
            r0.set(r3)
            return
    }

    public void setCopiedFigureCameraLockBundles(org.fortheloss.sticknodes.animationscreen.FrameCamera r5) {
            r4 = this;
            java.util.ArrayList r5 = r5.getLockedStickfigureBundles()
            int r0 = r5.size()
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r1 = new org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[r0]
            r4._copiedCameraLockBundles = r1
            r1 = 0
        Ld:
            if (r1 >= r0) goto L21
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r2 = new org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle
            java.lang.Object r3 = r5.get(r1)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r3 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r3
            r2.<init>(r3)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r3 = r4._copiedCameraLockBundles
            r3[r1] = r2
            int r1 = r1 + 1
            goto Ld
        L21:
            return
    }

    public void setCopiedFigureFilterProperties(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.FigureFilterProperties r0 = r1._copiedFigureFilterProperties
            if (r0 != 0) goto Lc
            org.fortheloss.sticknodes.data.FigureFilterProperties r0 = new org.fortheloss.sticknodes.data.FigureFilterProperties
            r0.<init>(r2)
            r1._copiedFigureFilterProperties = r0
            goto Lf
        Lc:
            r0.getProperties(r2)
        Lf:
            org.fortheloss.sticknodes.data.FigureFilterProperties r2 = org.fortheloss.sticknodes.data.SessionData.copied_figure_filter_properties
            if (r2 != 0) goto L1d
            org.fortheloss.sticknodes.data.FigureFilterProperties r2 = new org.fortheloss.sticknodes.data.FigureFilterProperties
            org.fortheloss.sticknodes.data.FigureFilterProperties r0 = r1._copiedFigureFilterProperties
            r2.<init>(r0)
            org.fortheloss.sticknodes.data.SessionData.copied_figure_filter_properties = r2
            goto L22
        L1d:
            org.fortheloss.sticknodes.data.FigureFilterProperties r0 = r1._copiedFigureFilterProperties
            r2.cloneFrom(r0)
        L22:
            return
    }

    public void setCopiedFigureFilterProperties(org.fortheloss.sticknodes.data.FigureFilterProperties r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.FigureFilterProperties r0 = r1._copiedFigureFilterProperties
            if (r0 != 0) goto Lc
            org.fortheloss.sticknodes.data.FigureFilterProperties r0 = new org.fortheloss.sticknodes.data.FigureFilterProperties
            r0.<init>(r2)
            r1._copiedFigureFilterProperties = r0
            goto Lf
        Lc:
            r0.cloneFrom(r2)
        Lf:
            org.fortheloss.sticknodes.data.FigureFilterProperties r2 = org.fortheloss.sticknodes.data.SessionData.copied_figure_filter_properties
            if (r2 != 0) goto L1d
            org.fortheloss.sticknodes.data.FigureFilterProperties r2 = new org.fortheloss.sticknodes.data.FigureFilterProperties
            org.fortheloss.sticknodes.data.FigureFilterProperties r0 = r1._copiedFigureFilterProperties
            r2.<init>(r0)
            org.fortheloss.sticknodes.data.SessionData.copied_figure_filter_properties = r2
            goto L22
        L1d:
            org.fortheloss.sticknodes.data.FigureFilterProperties r0 = r1._copiedFigureFilterProperties
            r2.cloneFrom(r0)
        L22:
            return
    }

    public void setCopiedFrame(org.fortheloss.sticknodes.data.IFrameData r5, int r6) {
            r4 = this;
            r4.disposeCopiedFrames()
            boolean r0 = r5 instanceof org.fortheloss.sticknodes.data.FrameData
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            org.fortheloss.sticknodes.data.IFrameData[] r0 = r4._copiedFrameDatas
            org.fortheloss.sticknodes.data.FrameData r3 = new org.fortheloss.sticknodes.data.FrameData
            org.fortheloss.sticknodes.data.FrameData r5 = (org.fortheloss.sticknodes.data.FrameData) r5
            r3.<init>(r5, r2)
            r0[r1] = r3
            goto L20
        L15:
            org.fortheloss.sticknodes.data.IFrameData[] r0 = r4._copiedFrameDatas
            org.fortheloss.sticknodes.data.MCFrameData r3 = new org.fortheloss.sticknodes.data.MCFrameData
            org.fortheloss.sticknodes.data.MCFrameData r5 = (org.fortheloss.sticknodes.data.MCFrameData) r5
            r3.<init>(r5, r2)
            r0[r1] = r3
        L20:
            r4._numCopiedFrames = r2
            r4._copiedFrameFramesContainerUID = r6
            return
    }

    public void setCopiedFrameCamera(org.fortheloss.sticknodes.animationscreen.FrameCamera r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r3._copiedFrameCamera
            if (r0 == 0) goto L7
            r0.dispose()
        L7:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = new org.fortheloss.sticknodes.animationscreen.FrameCamera
            r1 = 0
            r2 = 0
            r0.<init>(r4, r1, r2)
            r3._copiedFrameCamera = r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r4 = org.fortheloss.sticknodes.data.SessionData.copied_frame_camera
            if (r4 == 0) goto L17
            r4.dispose()
        L17:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r4 = new org.fortheloss.sticknodes.animationscreen.FrameCamera
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r3._copiedFrameCamera
            r4.<init>(r0, r1, r2)
            org.fortheloss.sticknodes.data.SessionData.copied_frame_camera = r4
            return
    }

    public void setCopiedFrameCameraProperties(org.fortheloss.sticknodes.animationscreen.FrameCamera r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = r1._copiedFrameCameraProperties
            if (r0 != 0) goto Lc
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = new org.fortheloss.sticknodes.data.useractions.FrameCameraProperties
            r0.<init>(r2)
            r1._copiedFrameCameraProperties = r0
            goto Lf
        Lc:
            r0.getProperties(r2)
        Lf:
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r2 = org.fortheloss.sticknodes.data.SessionData.copied_frame_camera_properties
            if (r2 != 0) goto L1d
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r2 = new org.fortheloss.sticknodes.data.useractions.FrameCameraProperties
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = r1._copiedFrameCameraProperties
            r2.<init>(r0)
            org.fortheloss.sticknodes.data.SessionData.copied_frame_camera_properties = r2
            goto L22
        L1d:
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = r1._copiedFrameCameraProperties
            r2.cloneFrom(r0)
        L22:
            return
    }

    public void setCopiedFrameCameraProperties(org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = r1._copiedFrameCameraProperties
            if (r0 != 0) goto Lc
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = new org.fortheloss.sticknodes.data.useractions.FrameCameraProperties
            r0.<init>(r2)
            r1._copiedFrameCameraProperties = r0
            goto Lf
        Lc:
            r0.cloneFrom(r2)
        Lf:
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r2 = org.fortheloss.sticknodes.data.SessionData.copied_frame_camera_properties
            if (r2 != 0) goto L1d
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r2 = new org.fortheloss.sticknodes.data.useractions.FrameCameraProperties
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = r1._copiedFrameCameraProperties
            r2.<init>(r0)
            org.fortheloss.sticknodes.data.SessionData.copied_frame_camera_properties = r2
            goto L22
        L1d:
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = r1._copiedFrameCameraProperties
            r2.cloneFrom(r0)
        L22:
            return
    }

    public void setCopiedFrameSoundData(org.fortheloss.sticknodes.data.IFrameData r2) {
            r1 = this;
            if (r2 != 0) goto Le
            r2 = -1
            r1._copiedSoundID = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1._copiedSoundVolume = r2
            r1._copiedSoundPan = r2
            r1._copiedSoundPitch = r2
            goto L26
        Le:
            int r0 = r2.getSoundToPlayLibraryID()
            r1._copiedSoundID = r0
            float r0 = r2.getSoundVolume()
            r1._copiedSoundVolume = r0
            float r0 = r2.getSoundPan()
            r1._copiedSoundPan = r0
            float r2 = r2.getSoundPitch()
            r1._copiedSoundPitch = r2
        L26:
            return
    }

    public void setCopiedFrames(java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r8, int r9, int r10, int r11) {
            r7 = this;
            r7.disposeCopiedFrames()
            java.lang.Object r0 = r8.get(r9)
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1f
            org.fortheloss.sticknodes.data.IFrameData[] r3 = r7._copiedFrameDatas
            org.fortheloss.sticknodes.data.FrameData r4 = new org.fortheloss.sticknodes.data.FrameData
            int r5 = r9 + 1
            java.lang.Object r9 = r8.get(r9)
            org.fortheloss.sticknodes.data.FrameData r9 = (org.fortheloss.sticknodes.data.FrameData) r9
            r4.<init>(r9, r1)
            r3[r2] = r4
            goto L30
        L1f:
            org.fortheloss.sticknodes.data.IFrameData[] r3 = r7._copiedFrameDatas
            org.fortheloss.sticknodes.data.MCFrameData r4 = new org.fortheloss.sticknodes.data.MCFrameData
            int r5 = r9 + 1
            java.lang.Object r9 = r8.get(r9)
            org.fortheloss.sticknodes.data.MCFrameData r9 = (org.fortheloss.sticknodes.data.MCFrameData) r9
            r4.<init>(r9, r1)
            r3[r2] = r4
        L30:
            r7._numCopiedFrames = r1
            r9 = 1
        L33:
            if (r10 <= 0) goto L6f
            int r2 = r8.size()
            if (r5 < r2) goto L3c
            goto L6f
        L3c:
            if (r0 == 0) goto L52
            org.fortheloss.sticknodes.data.IFrameData[] r2 = r7._copiedFrameDatas
            int r3 = r9 + 1
            org.fortheloss.sticknodes.data.FrameData r4 = new org.fortheloss.sticknodes.data.FrameData
            int r6 = r5 + 1
            java.lang.Object r5 = r8.get(r5)
            org.fortheloss.sticknodes.data.FrameData r5 = (org.fortheloss.sticknodes.data.FrameData) r5
            r4.<init>(r5, r1)
            r2[r9] = r4
            goto L65
        L52:
            org.fortheloss.sticknodes.data.IFrameData[] r2 = r7._copiedFrameDatas
            int r3 = r9 + 1
            org.fortheloss.sticknodes.data.MCFrameData r4 = new org.fortheloss.sticknodes.data.MCFrameData
            int r6 = r5 + 1
            java.lang.Object r5 = r8.get(r5)
            org.fortheloss.sticknodes.data.MCFrameData r5 = (org.fortheloss.sticknodes.data.MCFrameData) r5
            r4.<init>(r5, r1)
            r2[r9] = r4
        L65:
            r9 = r3
            r5 = r6
            int r2 = r7._numCopiedFrames
            int r2 = r2 + r1
            r7._numCopiedFrames = r2
            int r10 = r10 + (-1)
            goto L33
        L6f:
            r7._copiedFrameFramesContainerUID = r11
            return
    }

    public void setCopiedMovieclip(org.fortheloss.sticknodes.movieclip.MCReference r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2._copiedMovieclip
            if (r0 == 0) goto L7
            r0.dispose()
        L7:
            java.util.ArrayList r4 = r4.getDrawableFigures()
            int r0 = r2.getFigureIndexInFrame(r3, r4)
            r2._copiedMovieclipIndexInFrame = r0
            r1 = -1
            r2._figureIdFrontOfCopiedMovieclip = r1
            r2._figureIdBehindCopiedMovieclip = r1
            int r1 = r4.size()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L2e
            int r0 = r2._copiedMovieclipIndexInFrame
            int r0 = r0 + 1
            java.lang.Object r0 = r4.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            int r0 = r0.getID()
            r2._figureIdFrontOfCopiedMovieclip = r0
        L2e:
            int r0 = r2._copiedMovieclipIndexInFrame
            if (r0 <= 0) goto L40
            int r0 = r0 + (-1)
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r4 = r4.getID()
            r2._figureIdBehindCopiedMovieclip = r4
        L40:
            org.fortheloss.sticknodes.movieclip.MCReference r4 = new org.fortheloss.sticknodes.movieclip.MCReference
            r0 = 0
            r4.<init>(r3, r0)
            r2._copiedMovieclip = r4
            return
    }

    public void setCopiedSprite(org.fortheloss.sticknodes.sprite.SpriteRef r3, org.fortheloss.sticknodes.data.IFrameData r4) {
            r2 = this;
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r2._copiedSprite
            if (r0 == 0) goto L7
            r0.dispose()
        L7:
            java.util.ArrayList r4 = r4.getDrawableFigures()
            int r0 = r2.getFigureIndexInFrame(r3, r4)
            r2._copiedSpriteIndexInFrame = r0
            r1 = -1
            r2._figureIdFrontOfCopiedSprite = r1
            r2._figureIdBehindCopiedSprite = r1
            int r1 = r4.size()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L2e
            int r0 = r2._copiedSpriteIndexInFrame
            int r0 = r0 + 1
            java.lang.Object r0 = r4.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            int r0 = r0.getID()
            r2._figureIdFrontOfCopiedSprite = r0
        L2e:
            int r0 = r2._copiedSpriteIndexInFrame
            if (r0 <= 0) goto L40
            int r0 = r0 + (-1)
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r4 = r4.getID()
            r2._figureIdBehindCopiedSprite = r4
        L40:
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r4 == 0) goto L4e
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r4 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r3 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r3
            r4.<init>(r3)
            r2._copiedSprite = r4
            goto L55
        L4e:
            org.fortheloss.sticknodes.sprite.SpriteRef r4 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r4.<init>(r3)
            r2._copiedSprite = r4
        L55:
            return
    }

    public void setCopiedStickNode(org.fortheloss.sticknodes.stickfigure.StickNode r13, boolean r14) {
            r12 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r12._copiedStickNode
            if (r0 == 0) goto L7
            r0.dispose()
        L7:
            r7 = 0
            r12._copiedStickNodePolynodeAnchorIndices = r7
            r12._copiedStickNodePolynodeChildrenIndices = r7
            r12._copiedConnectorPairIndices = r7
            boolean r0 = r13 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r0 == 0) goto L20
            org.fortheloss.sticknodes.stickfigure.ConnectorDynamic r8 = new org.fortheloss.sticknodes.stickfigure.ConnectorDynamic
            r1 = 0
            r2 = 0
            r5 = 1
            r0 = r8
            r3 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r12._copiedStickNode = r8
            goto L2d
        L20:
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r8 = new org.fortheloss.sticknodes.stickfigure.StickNodeDynamic
            r1 = 0
            r2 = 0
            r5 = 1
            r0 = r8
            r3 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r12._copiedStickNode = r8
        L2d:
            if (r14 != 0) goto L30
            return
        L30:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12._copiedStickNodePolynodeAnchorIndices = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12._copiedStickNodePolynodeChildrenIndices = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12._copiedConnectorPairIndices = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Stack r1 = new java.util.Stack
            r1.<init>()
            r1.add(r13)
        L52:
            boolean r2 = r1.isEmpty()
            r3 = 0
            if (r2 != 0) goto L78
            java.lang.Object r2 = r1.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r0.add(r2)
            java.util.ArrayList r2 = r2.getChildrenNodes()
            int r4 = r2.size()
        L6a:
            if (r3 >= r4) goto L52
            java.lang.Object r5 = r2.get(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            r1.add(r5)
            int r3 = r3 + 1
            goto L6a
        L78:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r13.getParentNode()
            int r2 = r0.size()
            int r2 = r2 + (-1)
        L82:
            if (r2 < 0) goto Lce
            java.lang.Object r4 = r0.get(r2)
            boolean r4 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r4 == 0) goto Lcb
            java.lang.Object r4 = r0.get(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r4 = (org.fortheloss.sticknodes.stickfigure.Connector) r4
            if (r4 != r13) goto L95
            goto Lcb
        L95:
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r4.getEndNode()
            int r5 = r0.indexOf(r5)
            if (r5 < 0) goto Lb2
            java.util.ArrayList<java.lang.Integer> r4 = r12._copiedConnectorPairIndices
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r4.add(r8)
            java.util.ArrayList<java.lang.Integer> r4 = r12._copiedConnectorPairIndices
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
            goto Lcb
        Lb2:
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r4.getEndNode()
            if (r4 != r1) goto Lcb
            java.util.ArrayList<java.lang.Integer> r4 = r12._copiedConnectorPairIndices
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4.add(r5)
            java.util.ArrayList<java.lang.Integer> r4 = r12._copiedConnectorPairIndices
            r5 = -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
        Lcb:
            int r2 = r2 + (-1)
            goto L82
        Lce:
            java.util.ArrayList<java.lang.Integer> r1 = r12._copiedConnectorPairIndices
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Ld8
            r12._copiedConnectorPairIndices = r7
        Ld8:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.size()
            int r2 = r2 + (-1)
        Le3:
            if (r2 < 0) goto Lfd
            java.lang.Object r4 = r0.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            boolean r4 = r4.isPolyfillAnchor()
            if (r4 == 0) goto Lfa
            java.lang.Object r4 = r0.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r1.add(r4)
        Lfa:
            int r2 = r2 + (-1)
            goto Le3
        Lfd:
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L103:
            if (r2 < 0) goto L173
            java.lang.Object r4 = r1.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            java.util.ArrayList r5 = r4.getPolynodeChildren()
            int r6 = r5.size()
            r8 = 0
        L114:
            if (r8 >= r6) goto L126
            java.lang.Object r9 = r5.get(r8)
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = (org.fortheloss.sticknodes.stickfigure.StickNode) r9
            boolean r9 = r0.contains(r9)
            if (r9 != 0) goto L123
            goto L170
        L123:
            int r8 = r8 + 1
            goto L114
        L126:
            int r8 = r0.size()
            int r8 = r8 + (-1)
        L12c:
            if (r8 < 0) goto L141
            java.lang.Object r9 = r0.get(r8)
            if (r9 != r4) goto L13e
            java.util.ArrayList<java.lang.Integer> r4 = r12._copiedStickNodePolynodeAnchorIndices
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.add(r8)
            goto L141
        L13e:
            int r8 = r8 + (-1)
            goto L12c
        L141:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> r8 = r12._copiedStickNodePolynodeChildrenIndices
            r8.add(r4)
            r8 = 0
        L14c:
            if (r8 >= r6) goto L170
            java.lang.Object r9 = r5.get(r8)
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = (org.fortheloss.sticknodes.stickfigure.StickNode) r9
            int r10 = r0.size()
            int r10 = r10 + (-1)
        L15a:
            if (r10 < 0) goto L16d
            java.lang.Object r11 = r0.get(r10)
            if (r11 != r9) goto L16a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r4.add(r9)
            goto L16d
        L16a:
            int r10 = r10 + (-1)
            goto L15a
        L16d:
            int r8 = r8 + 1
            goto L14c
        L170:
            int r2 = r2 + (-1)
            goto L103
        L173:
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> r0 = r12._copiedStickNodePolynodeChildrenIndices
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L183
            java.util.ArrayList<java.lang.Integer> r0 = r12._copiedStickNodePolynodeAnchorIndices
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L187
        L183:
            r12._copiedStickNodePolynodeAnchorIndices = r7
            r12._copiedStickNodePolynodeChildrenIndices = r7
        L187:
            return
    }

    public void setCopiedStickfigure(org.fortheloss.sticknodes.stickfigure.Stickfigure r17, boolean r18, org.fortheloss.sticknodes.data.IFrameData r19, int r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r0._copiedStickfigureAndJoins
            if (r2 != 0) goto L1d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0._copiedStickfigureAndJoins = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0._copiedStickfigureAndJoinsData = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0._copiedStickfigureAndJoinsLayerOrder = r2
        L1d:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r0._copiedStickfigureAndJoins
            int r2 = r2.size()
            r3 = 0
            if (r2 <= 0) goto L32
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r0._copiedStickfigureAndJoins
            java.lang.Object r2 = r2.remove(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.dispose()
            goto L1d
        L32:
            java.util.ArrayList<com.badlogic.gdx.math.Vector2> r2 = r0._copiedStickfigureAndJoinsData
            r2.clear()
            java.util.ArrayList<java.lang.Integer> r2 = r0._copiedStickfigureAndJoinsLayerOrder
            r2.clear()
            r2 = r20
            r0._copiedStickfigureFramesContainerUID = r2
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r0._copiedStickfigureAndJoins
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r4.<init>(r1, r3)
            r2.add(r4)
            java.util.ArrayList<com.badlogic.gdx.math.Vector2> r2 = r0._copiedStickfigureAndJoinsData
            r4 = 0
            r2.add(r4)
            java.util.ArrayList r2 = r19.getDrawableFigures()
            r5 = -1
            if (r18 == 0) goto L1bf
            boolean r6 = r17.hasJoinAnchorNode()
            if (r6 != 0) goto L5f
            goto L1bf
        L5f:
            java.util.Stack r6 = new java.util.Stack
            r6.<init>()
            r6.add(r1)
        L67:
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L13e
            java.lang.Object r1 = r6.pop()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            boolean r7 = r1.hasJoinAnchorNode()
            if (r7 != 0) goto L7a
            goto L67
        L7a:
            int r7 = r1.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._copiedStickfigureAndJoins
            int r8 = r8.size()
            int r8 = r8 + (-1)
        L86:
            if (r8 < 0) goto L9a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r9 = r0._copiedStickfigureAndJoins
            java.lang.Object r9 = r9.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r9 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r9
            int r9 = r9.getID()
            if (r9 != r7) goto L97
            goto L9b
        L97:
            int r8 = r8 + (-1)
            goto L86
        L9a:
            r8 = 0
        L9b:
            java.util.ArrayList r1 = r1.getJoinAnchorNodes()
            int r7 = r1.size()
            int r7 = r7 + (-1)
        La5:
            if (r7 < 0) goto L67
            java.lang.Object r9 = r1.get(r7)
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = (org.fortheloss.sticknodes.stickfigure.StickNode) r9
            java.util.ArrayList r10 = r9.getJoinedFigures()
            int r9 = r9.getDrawOrderIndex()
            int r11 = r10.size()
            int r11 = r11 + (-1)
        Lbb:
            if (r11 < 0) goto L139
            java.lang.Object r12 = r10.get(r11)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r12 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r12
            boolean r13 = r12 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r13 == 0) goto Le0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r13 = r0._copiedStickfigureAndJoins
            org.fortheloss.sticknodes.movieclip.MCReference r14 = new org.fortheloss.sticknodes.movieclip.MCReference
            org.fortheloss.sticknodes.movieclip.MCReference r12 = (org.fortheloss.sticknodes.movieclip.MCReference) r12
            r14.<init>(r12, r4)
            r13.add(r14)
            java.util.ArrayList<com.badlogic.gdx.math.Vector2> r12 = r0._copiedStickfigureAndJoinsData
            com.badlogic.gdx.math.Vector2 r13 = new com.badlogic.gdx.math.Vector2
            float r14 = (float) r8
            float r15 = (float) r9
            r13.<init>(r14, r15)
            r12.add(r13)
            goto L135
        Le0:
            boolean r13 = r12 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r13 == 0) goto Lfd
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r13 = r0._copiedStickfigureAndJoins
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r14 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r12 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r12
            r14.<init>(r12)
            r13.add(r14)
            java.util.ArrayList<com.badlogic.gdx.math.Vector2> r12 = r0._copiedStickfigureAndJoinsData
            com.badlogic.gdx.math.Vector2 r13 = new com.badlogic.gdx.math.Vector2
            float r14 = (float) r8
            float r15 = (float) r9
            r13.<init>(r14, r15)
            r12.add(r13)
            goto L135
        Lfd:
            boolean r13 = r12 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r13 == 0) goto L11a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r13 = r0._copiedStickfigureAndJoins
            org.fortheloss.sticknodes.sprite.SpriteRef r14 = new org.fortheloss.sticknodes.sprite.SpriteRef
            org.fortheloss.sticknodes.sprite.SpriteRef r12 = (org.fortheloss.sticknodes.sprite.SpriteRef) r12
            r14.<init>(r12)
            r13.add(r14)
            java.util.ArrayList<com.badlogic.gdx.math.Vector2> r12 = r0._copiedStickfigureAndJoinsData
            com.badlogic.gdx.math.Vector2 r13 = new com.badlogic.gdx.math.Vector2
            float r14 = (float) r8
            float r15 = (float) r9
            r13.<init>(r14, r15)
            r12.add(r13)
            goto L135
        L11a:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r12 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r12
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r13 = r0._copiedStickfigureAndJoins
            org.fortheloss.sticknodes.stickfigure.Stickfigure r14 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r14.<init>(r12, r3)
            r13.add(r14)
            java.util.ArrayList<com.badlogic.gdx.math.Vector2> r13 = r0._copiedStickfigureAndJoinsData
            com.badlogic.gdx.math.Vector2 r14 = new com.badlogic.gdx.math.Vector2
            float r15 = (float) r8
            float r4 = (float) r9
            r14.<init>(r15, r4)
            r13.add(r14)
            r6.add(r12)
        L135:
            int r11 = r11 + (-1)
            r4 = 0
            goto Lbb
        L139:
            int r7 = r7 + (-1)
            r4 = 0
            goto La5
        L13e:
            int r1 = r2.size()
            r4 = 0
        L143:
            if (r4 >= r1) goto L176
            java.lang.Object r6 = r2.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r6
            int r6 = r6.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r0._copiedStickfigureAndJoins
            int r7 = r7.size()
            int r7 = r7 + (-1)
        L157:
            if (r7 < 0) goto L173
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._copiedStickfigureAndJoins
            java.lang.Object r8 = r8.get(r7)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            int r8 = r8.getID()
            if (r6 != r8) goto L170
            java.util.ArrayList<java.lang.Integer> r8 = r0._copiedStickfigureAndJoinsLayerOrder
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r8.add(r9)
        L170:
            int r7 = r7 + (-1)
            goto L157
        L173:
            int r4 = r4 + 1
            goto L143
        L176:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r0._copiedStickfigureAndJoins
            java.util.ArrayList<java.lang.Integer> r4 = r0._copiedStickfigureAndJoinsLayerOrder
            java.lang.Object r3 = r4.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r1 = r1.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r1 = r0.getFigureIndexInFrame(r1, r2)
            r0._copiedStickfigureIndexInFrame = r1
            r0._figureIdFrontOfCopiedStickfigure = r5
            r0._figureIdBehindCopiedStickfigure = r5
            int r3 = r2.size()
            int r3 = r3 + (-1)
            if (r1 >= r3) goto L1ac
            int r1 = r0._copiedStickfigureIndexInFrame
            int r1 = r1 + 1
            java.lang.Object r1 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r1 = r1.getID()
            r0._figureIdFrontOfCopiedStickfigure = r1
        L1ac:
            int r1 = r0._copiedStickfigureIndexInFrame
            if (r1 <= 0) goto L1be
            int r1 = r1 + (-1)
            java.lang.Object r1 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r1 = r1.getID()
            r0._figureIdBehindCopiedStickfigure = r1
        L1be:
            return
        L1bf:
            java.util.ArrayList<java.lang.Integer> r4 = r0._copiedStickfigureAndJoinsLayerOrder
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.add(r3)
            int r1 = r0.getFigureIndexInFrame(r1, r2)
            r0._copiedStickfigureIndexInFrame = r1
            r0._figureIdFrontOfCopiedStickfigure = r5
            r0._figureIdBehindCopiedStickfigure = r5
            int r3 = r2.size()
            int r3 = r3 + (-1)
            if (r1 >= r3) goto L1ea
            int r1 = r0._copiedStickfigureIndexInFrame
            int r1 = r1 + 1
            java.lang.Object r1 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r1 = r1.getID()
            r0._figureIdFrontOfCopiedStickfigure = r1
        L1ea:
            int r1 = r0._copiedStickfigureIndexInFrame
            if (r1 <= 0) goto L1fc
            int r1 = r1 + (-1)
            java.lang.Object r1 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r1 = r1.getID()
            r0._figureIdBehindCopiedStickfigure = r1
        L1fc:
            return
    }

    public void setCopiedStickfigurePropertiesBundle(org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r0 = r1._copiedStickfigurePropertiesBundle
            if (r0 == 0) goto L7
            r0.dispose()
        L7:
            r1._copiedStickfigurePropertiesBundle = r2
            return
    }

    public void setCopiedTextfield(org.fortheloss.sticknodes.TextfieldBox r2) {
            r1 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._copiedTextfieldBox
            if (r0 == 0) goto L7
            r0.dispose()
        L7:
            org.fortheloss.sticknodes.TextfieldBox r0 = new org.fortheloss.sticknodes.TextfieldBox
            r0.<init>(r2)
            r1._copiedTextfieldBox = r0
            org.fortheloss.sticknodes.TextfieldBox r2 = org.fortheloss.sticknodes.data.SessionData.copied_textfield_box
            if (r2 == 0) goto L15
            r2.dispose()
        L15:
            org.fortheloss.sticknodes.TextfieldBox r2 = new org.fortheloss.sticknodes.TextfieldBox
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._copiedTextfieldBox
            r2.<init>(r0)
            org.fortheloss.sticknodes.data.SessionData.copied_textfield_box = r2
            return
    }

    public void setCurrentlySelectedToFrameCamera(org.fortheloss.sticknodes.animationscreen.FrameCamera r1) {
            r0 = this;
            r0._currentlySelectedFrameCamera = r1
            r1 = 3
            r0._currentlySelected = r1
            r1 = 0
            r0._currentlySelectedStickfigureRef = r1
            r0._currentlySelectedNodeRef = r1
            r0._currentlySelectedTextfieldBoxRef = r1
            r0._currentlySelectedFrameDataRef = r1
            r0._currentlySelectedMCRef = r1
            r0._currentlySelectedSpriteRef = r1
            return
    }

    public void setCurrentlySelectedToFrameData(org.fortheloss.sticknodes.data.IFrameData r1) {
            r0 = this;
            r0._currentlySelectedFrameDataRef = r1
            r1 = 4
            r0._currentlySelected = r1
            r1 = 0
            r0._currentlySelectedStickfigureRef = r1
            r0._currentlySelectedNodeRef = r1
            r0._currentlySelectedTextfieldBoxRef = r1
            r0._currentlySelectedFrameCamera = r1
            r0._currentlySelectedMCRef = r1
            r0._currentlySelectedSpriteRef = r1
            return
    }

    public void setCurrentlySelectedToMC(org.fortheloss.sticknodes.movieclip.MCReference r1) {
            r0 = this;
            r0._currentlySelectedMCRef = r1
            org.fortheloss.sticknodes.movieclip.MCNode r1 = r1.getMainNode()
            r0._currentlySelectedNodeRef = r1
            r1 = 5
            r0._currentlySelected = r1
            r1 = 0
            r0._currentlySelectedTextfieldBoxRef = r1
            r0._currentlySelectedStickfigureRef = r1
            r0._currentlySelectedFrameCamera = r1
            r0._currentlySelectedFrameDataRef = r1
            r0._currentlySelectedSpriteRef = r1
            return
    }

    public void setCurrentlySelectedToMCNode(org.fortheloss.sticknodes.movieclip.MCNode r2) {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2.getMCReference()
            r1._currentlySelectedMCRef = r0
            r1._currentlySelectedNodeRef = r2
            r2 = 5
            r1._currentlySelected = r2
            r2 = 0
            r1._currentlySelectedTextfieldBoxRef = r2
            r1._currentlySelectedStickfigureRef = r2
            r1._currentlySelectedFrameCamera = r2
            r1._currentlySelectedFrameDataRef = r2
            r1._currentlySelectedSpriteRef = r2
            return
    }

    public void setCurrentlySelectedToNothing() {
            r1 = this;
            r0 = 0
            r1._currentlySelected = r0
            r0 = 0
            r1._currentlySelectedStickfigureRef = r0
            r1._currentlySelectedNodeRef = r0
            r1._currentlySelectedTextfieldBoxRef = r0
            r1._currentlySelectedFrameCamera = r0
            r1._currentlySelectedFrameDataRef = r0
            r1._currentlySelectedMCRef = r0
            r1._currentlySelectedSpriteRef = r0
            return
    }

    public void setCurrentlySelectedToSprite(org.fortheloss.sticknodes.sprite.SpriteRef r1) {
            r0 = this;
            r0._currentlySelectedSpriteRef = r1
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getMainNode()
            r0._currentlySelectedNodeRef = r1
            r1 = 6
            r0._currentlySelected = r1
            r1 = 0
            r0._currentlySelectedTextfieldBoxRef = r1
            r0._currentlySelectedStickfigureRef = r1
            r0._currentlySelectedFrameCamera = r1
            r0._currentlySelectedFrameDataRef = r1
            r0._currentlySelectedMCRef = r1
            return
    }

    public void setCurrentlySelectedToSpriteNode(org.fortheloss.sticknodes.sprite.SpriteNode r2) {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r2.getSpriteReference()
            r1._currentlySelectedSpriteRef = r0
            r1._currentlySelectedNodeRef = r2
            r2 = 6
            r1._currentlySelected = r2
            r2 = 0
            r1._currentlySelectedTextfieldBoxRef = r2
            r1._currentlySelectedStickfigureRef = r2
            r1._currentlySelectedFrameCamera = r2
            r1._currentlySelectedFrameDataRef = r2
            r1._currentlySelectedMCRef = r2
            return
    }

    public void setCurrentlySelectedToStickNode(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2.getStickfigure()
            r1._currentlySelectedStickfigureRef = r0
            r1._currentlySelectedNodeRef = r2
            r2 = 1
            r1._currentlySelected = r2
            r2 = 0
            r1._currentlySelectedTextfieldBoxRef = r2
            r1._currentlySelectedFrameCamera = r2
            r1._currentlySelectedFrameDataRef = r2
            r1._currentlySelectedMCRef = r2
            r1._currentlySelectedSpriteRef = r2
            return
    }

    public void setCurrentlySelectedToStickfigure(org.fortheloss.sticknodes.stickfigure.Stickfigure r1) {
            r0 = this;
            r0._currentlySelectedStickfigureRef = r1
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getMainNode()
            r0._currentlySelectedNodeRef = r1
            r1 = 1
            r0._currentlySelected = r1
            r1 = 0
            r0._currentlySelectedTextfieldBoxRef = r1
            r0._currentlySelectedFrameCamera = r1
            r0._currentlySelectedFrameDataRef = r1
            r0._currentlySelectedMCRef = r1
            r0._currentlySelectedSpriteRef = r1
            return
    }

    public void setCurrentlySelectedToTextFieldBox(org.fortheloss.sticknodes.TextfieldBox r1) {
            r0 = this;
            r0._currentlySelectedTextfieldBoxRef = r1
            r1 = 2
            r0._currentlySelected = r1
            r1 = 0
            r0._currentlySelectedStickfigureRef = r1
            r0._currentlySelectedNodeRef = r1
            r0._currentlySelectedFrameCamera = r1
            r0._currentlySelectedFrameDataRef = r1
            r0._currentlySelectedMCRef = r1
            r0._currentlySelectedSpriteRef = r1
            return
    }

    public void setDoubleTapForMovieclipsEnabled(boolean r1) {
            r0 = this;
            r0._doubleTapForMovieclipsEnabled = r1
            return
    }

    public void setDoubleTapForNoneSelectionEnabled(boolean r1) {
            r0 = this;
            r0._doubleTapForNoneSelectionEnabled = r1
            return
    }

    public void setDrawOnionSkinWhenMovingStage(boolean r1) {
            r0 = this;
            r0._drawOnionSkinWhenMovingStage = r1
            return
    }

    public void setDrawOnlyMainNodes(boolean r1) {
            r0 = this;
            r0._drawOnlyMainNodes = r1
            return
    }

    public void setDrawOnlyMainNodesTemp(boolean r1) {
            r0 = this;
            r0._drawOnlyMainNodesTemp = r1
            return
    }

    public void setFilterShowingState(int r1) {
            r0 = this;
            r0._filterShowingState = r1
            return
    }

    public void setFiltersQuality(int r1) {
            r0 = this;
            r0._filtersQuality = r1
            return
    }

    public void setLastSaveMillis(long r1) {
            r0 = this;
            r0._lastSaveMillis = r1
            return
    }

    public void setLeftHandMode(boolean r1) {
            r0 = this;
            r0._leftHandMode = r1
            return
    }

    public void setMagnifierVisible(boolean r1) {
            r0 = this;
            r0._isMagnifierVisible = r1
            return
    }

    public void setMode(int r1) {
            r0 = this;
            r0._mode = r1
            r0.setCurrentlySelectedToNothing()
            return
    }

    public void setNeighborNodesAffectedByJoins(boolean r1) {
            r0 = this;
            r0._neighborNodesAffectedByJoins = r1
            return
    }

    public void setNerdModeEnabled(boolean r1) {
            r0 = this;
            r0._nerdModeEnabled = r1
            return
    }

    public void setNodeHighlightMode(short r1) {
            r0 = this;
            r0._nodeHighlightMode = r1
            return
    }

    public void setNodeSelectionSensitivity(float r3) {
            r2 = this;
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._sensitivityNodeSelection = r0
            goto L15
        La:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L13
            r2._sensitivityNodeSelection = r0
            goto L15
        L13:
            r2._sensitivityNodeSelection = r3
        L15:
            return
    }

    public void setNumNextOnionSkinFrames(int r2) {
            r1 = this;
            r0 = 3
            if (r2 >= 0) goto L5
            r2 = 0
            goto L8
        L5:
            if (r2 <= r0) goto L8
            r2 = 3
        L8:
            r1._numNextOnionSkinFrames = r2
            return
    }

    public void setNumPrevOnionSkinFrames(int r2) {
            r1 = this;
            r0 = 3
            if (r2 >= 0) goto L5
            r2 = 0
            goto L8
        L5:
            if (r2 <= r0) goto L8
            r2 = 3
        L8:
            r1._numPrevOnionSkinFrames = r2
            return
    }

    public void setOnionSkin(boolean r1) {
            r0 = this;
            r0._isNormalOnionSkin = r1
            return
    }

    public void setOpenGLLineWidth(int r3) {
            r2 = this;
            r0 = 5
            r1 = 1
            if (r3 >= r1) goto L6
            r3 = 1
            goto L9
        L6:
            if (r3 <= r0) goto L9
            r3 = 5
        L9:
            r2._openGLLineWidth = r3
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            float r3 = (float) r3
            r0.glLineWidth(r3)
            return
    }

    public void setPasteWillTryToPreserveLayeringIndex(boolean r1) {
            r0 = this;
            r0._pasteWillTryToPreserveLayeringIndex = r1
            return
    }

    public void setPlayFullscreen(boolean r1) {
            r0 = this;
            r0._isPlayFullscreen = r1
            return
    }

    public void setPlaybackEndFrame(int r2) {
            r1 = this;
            int r0 = r1._screen
            if (r0 != 0) goto L7
            r1.mPlaybackEndFrame = r2
            goto L9
        L7:
            r1.mTempPlaybackEndFrame = r2
        L9:
            return
    }

    public void setPlaybackStartFrame(int r2) {
            r1 = this;
            int r0 = r1._screen
            if (r0 != 0) goto L7
            r1.mPlaybackStartFrame = r2
            goto L9
        L7:
            r1.mTempPlaybackStartFrame = r2
        L9:
            return
    }

    public void setPreserveSelectionWhenChangingFrames(boolean r1) {
            r0 = this;
            r0._preserveSelectionWhenChangingFrames = r1
            return
    }

    public void setQuickMenuEnabled(boolean r1) {
            r0 = this;
            r0._quickMenuEnabled = r1
            return
    }

    public void setRenderEveryThirdThumbnail(boolean r1) {
            r0 = this;
            r0._renderEveryThirdThumbnail = r1
            return
    }

    public void setRenderFiltersWhenDragging(boolean r1) {
            r0 = this;
            r0._renderFiltersWhenDragging = r1
            return
    }

    public void setRiggerModeEnabled(boolean r1) {
            r0 = this;
            r0._riggerModeEnabled = r1
            return
    }

    public void setScreen(int r2) {
            r1 = this;
            r1._screen = r2
            r0 = 2
            if (r2 != r0) goto La
            r2 = 0
            r1.mTempPlaybackStartFrame = r2
            r1.mTempPlaybackEndFrame = r2
        La:
            r1.setCurrentlySelectedToNothing()
            return
    }

    public void setShowCreationDrawOrder(boolean r1) {
            r0 = this;
            r0._showCreationDrawOrder = r1
            return
    }

    public void setShowCreationStaticNodes(boolean r1) {
            r0 = this;
            r0._showCreationStaticNodes = r1
            return
    }

    public void setShowFigureIDs(boolean r1) {
            r0 = this;
            r0._showFigureIDs = r1
            return
    }

    public void setShowGuides(boolean r1) {
            r0 = this;
            r0._showGuides = r1
            return
    }

    public void setShowIdPopup(boolean r1) {
            r0 = this;
            r0._idPopupEnabled = r1
            return
    }

    public void setShowNeighborNodes(boolean r1) {
            r0 = this;
            r0._showNeighborNodes = r1
            return
    }

    public void setShowNeighborNodesCreative(boolean r1) {
            r0 = this;
            r0._showNeighborNodesCreative = r1
            return
    }

    public void setShowOutline(boolean r1) {
            r0 = this;
            r0._showOutline = r1
            return
    }

    public void setShowOutlineCreative(boolean r1) {
            r0 = this;
            r0._showOutlineCreative = r1
            return
    }

    public void setShowQuickResizeTool(byte r1) {
            r0 = this;
            r0._showQuickResizeTool = r1
            return
    }

    public void setShowStageBox(boolean r1) {
            r0 = this;
            r0._showStageBox = r1
            return
    }

    public void setShowZoomButtons(boolean r1) {
            r0 = this;
            r0._showZoomButtons = r1
            return
    }

    public void setStickNodeCullingEnabled(boolean r1) {
            r0 = this;
            r0._stickNodeCullingEnabled = r1
            return
    }

    public void setUndoRedoMode(int r3) {
            r2 = this;
            r2._undoRedoMode = r3
            if (r3 != 0) goto L42
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r3 = r2._createUndos
            int r3 = r3.size()
            int r3 = r3 + (-1)
        Lc:
            if (r3 < 0) goto L1e
            org.fortheloss.sticknodes.data.useractions.UserActionPools r0 = r2._userActionPools
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r2._createUndos
            java.lang.Object r1 = r1.get(r3)
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = (org.fortheloss.sticknodes.data.useractions.UserAction) r1
            r0.repool(r1)
            int r3 = r3 + (-1)
            goto Lc
        L1e:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r3 = r2._createUndos
            r3.clear()
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r3 = r2._createRedos
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L2b:
            if (r3 < 0) goto L3d
            org.fortheloss.sticknodes.data.useractions.UserActionPools r0 = r2._userActionPools
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r2._createRedos
            java.lang.Object r1 = r1.get(r3)
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = (org.fortheloss.sticknodes.data.useractions.UserAction) r1
            r0.repool(r1)
            int r3 = r3 + (-1)
            goto L2b
        L3d:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r3 = r2._createRedos
            r3.clear()
        L42:
            r2.updateCrashPastActionKeys()
            return
    }

    public void setUnlimitedNodesEnabled(boolean r1) {
            r0 = this;
            r0._unlimitedNodesEnabled = r1
            return
    }

    public void undo() {
            r1 = this;
            r0 = 1
            r1.undo(r0)
            return
    }

    public void undo(boolean r8) {
            r7 = this;
            int r0 = r7._undoRedoMode
            if (r0 != 0) goto L9
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r7._animateUndos
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r7._animateRedos
            goto Ld
        L9:
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r0 = r7._createUndos
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r1 = r7._createRedos
        Ld:
            int r2 = r0.size()
            if (r2 > 0) goto L14
            return
        L14:
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r0.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Undoing a UserAction of type "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.println(r4)
            r2.undo()
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r4 = "Undone.\n"
            r3.println(r4)
            if (r8 == 0) goto L4e
            r1.add(r2)
            goto L53
        L4e:
            org.fortheloss.sticknodes.data.useractions.UserActionPools r3 = r7._userActionPools
            r3.repool(r2)
        L53:
            int r2 = r0.size()
            if (r2 <= 0) goto Lc8
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            boolean r2 = r2 instanceof org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction
            if (r2 != 0) goto L6a
            goto Lc8
        L6a:
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = "    (A DoubleUndoRedoAction was encountered...)"
            r2.println(r3)
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r0.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            if (r8 == 0) goto L83
            r1.add(r2)
            goto L88
        L83:
            org.fortheloss.sticknodes.data.useractions.UserActionPools r3 = r7._userActionPools
            r3.repool(r2)
        L88:
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r0.remove(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "    Undoing a UserAction of type "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.println(r4)
            r2.undo()
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r4 = "    Undone.\n"
            r3.println(r4)
            if (r8 == 0) goto Lc2
            r1.add(r2)
            goto L53
        Lc2:
            org.fortheloss.sticknodes.data.useractions.UserActionPools r3 = r7._userActionPools
            r3.repool(r2)
            goto L53
        Lc8:
            int r8 = r1.size()
            r0 = 25
            if (r8 <= r0) goto Lfa
            org.fortheloss.sticknodes.data.useractions.UserActionPools r8 = r7._userActionPools
            r0 = 0
            java.lang.Object r2 = r1.remove(r0)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            r8.repool(r2)
            java.lang.Object r8 = r1.get(r0)
            boolean r8 = r8 instanceof org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction
            if (r8 == 0) goto Lfa
            org.fortheloss.sticknodes.data.useractions.UserActionPools r8 = r7._userActionPools
            java.lang.Object r2 = r1.remove(r0)
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = (org.fortheloss.sticknodes.data.useractions.UserAction) r2
            r8.repool(r2)
            org.fortheloss.sticknodes.data.useractions.UserActionPools r8 = r7._userActionPools
            java.lang.Object r0 = r1.remove(r0)
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = (org.fortheloss.sticknodes.data.useractions.UserAction) r0
            r8.repool(r0)
        Lfa:
            r7.updateCrashPastActionKeys()
            return
    }

    public void updateCrashRepooledActionKey(java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.UserAction> r6) {
            r5 = this;
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = (org.fortheloss.sticknodes.data.useractions.UserAction) r0
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1 = 1
            r2 = 1
        L11:
            int r3 = r6.size()
            if (r2 >= r3) goto L45
            java.lang.Object r3 = r6.get(r2)
            boolean r3 = r3 instanceof org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction
            if (r3 == 0) goto L45
            int r2 = r2 + 1
            java.lang.Object r3 = r6.get(r2)
            org.fortheloss.sticknodes.data.useractions.UserAction r3 = (org.fortheloss.sticknodes.data.useractions.UserAction) r3
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = ", (DoubleAction), "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            int r2 = r2 + r1
            goto L11
        L45:
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "most_recent_user_action_repooled"
            r6.setCrashlyticsKeyString(r1, r0)
            return
    }

    public void updateMemoryData(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2, boolean r3) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionMemoryData r0 = r1._memoryData
            if (r0 != 0) goto Lb
            org.fortheloss.sticknodes.data.SessionMemoryData r0 = new org.fortheloss.sticknodes.data.SessionMemoryData
            r0.<init>()
            r1._memoryData = r0
        Lb:
            org.fortheloss.sticknodes.data.SessionMemoryData r0 = r1._memoryData
            r0.update(r2, r3)
            return
    }
}
